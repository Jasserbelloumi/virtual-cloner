package org.osmdroid.tileprovider.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.support.v4.media.o00oOo0O;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes3.dex */
public class StorageUtils {
    public static final String EXTERNAL_SD_CARD = "externalSdCard";
    public static final String SD_CARD = "sdCard";
    private static final String TAG = "StorageUtils";

    /* loaded from: classes3.dex */
    public static class StorageInfo {
        public String displayName;
        public final int display_number;
        public long freeSpace;
        public final boolean internal;
        public final String path;
        public boolean readonly;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StorageInfo(java.lang.String r3, boolean r4, boolean r5, int r6) {
            /*
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.freeSpace = r0
                r2.path = r3
                r2.internal = r4
                r2.display_number = r6
                android.os.StatFs r0 = new android.os.StatFs
                r0.<init>(r3)
                long r0 = r0.getAvailableBytes()
                r2.freeSpace = r0
                r0 = 1
                if (r5 != 0) goto L27
                java.io.File r1 = new java.io.File
                r1.<init>(r3)
                boolean r3 = org.osmdroid.tileprovider.util.StorageUtils.isWritable(r1)
                r3 = r3 ^ r0
                r2.readonly = r3
            L27:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r4 == 0) goto L34
                java.lang.String r4 = "Internal SD card"
            L30:
                r3.append(r4)
                goto L42
            L34:
                if (r6 <= r0) goto L3f
                java.lang.String r4 = "SD card "
                r3.append(r4)
                r3.append(r6)
                goto L42
            L3f:
                java.lang.String r4 = "SD card"
                goto L30
            L42:
                if (r5 == 0) goto L49
                java.lang.String r4 = " (Read only)"
                r3.append(r4)
            L49:
                java.lang.String r3 = r3.toString()
                r2.displayName = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.StorageUtils.StorageInfo.<init>(java.lang.String, boolean, boolean, int):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StorageInfo storageInfo = (StorageInfo) obj;
            if (this.internal == storageInfo.internal && this.readonly == storageInfo.readonly && this.display_number == storageInfo.display_number && this.freeSpace == storageInfo.freeSpace) {
                String str = this.path;
                if (str == null ? storageInfo.path == null : str.equals(storageInfo.path)) {
                    String str2 = this.displayName;
                    String str3 = storageInfo.displayName;
                    return str2 != null ? str2.equals(str3) : str3 == null;
                }
                return false;
            }
            return false;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public int hashCode() {
            String str = this.path;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.freeSpace;
            int i = ((((((((hashCode * 31) + (this.internal ? 1 : 0)) * 31) + (this.readonly ? 1 : 0)) * 31) + this.display_number) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str2 = this.displayName;
            return i + (str2 != null ? str2.hashCode() : 0);
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }
    }

    public static Map<String, File> getAllStorageLocations() {
        HashMap hashMap = new HashMap(10);
        hashMap.putAll(tryToGetMountedStoragesFromFilesystem());
        if (!hashMap.containsValue(Environment.getExternalStorageDirectory())) {
            hashMap.put(SD_CARD, Environment.getExternalStorageDirectory());
        }
        for (File file : tryToGetStorageFromSystemEnv()) {
            if (file.exists() && !hashMap.containsValue(file)) {
                hashMap.put(SD_CARD, file);
            }
        }
        return hashMap;
    }

    private static Set<File> getAllWritableStorageLocations() {
        HashSet hashSet = new HashSet();
        for (File file : tryToGetStorageFromSystemEnv()) {
            if (isWritable(file)) {
                hashSet.add(file);
            }
        }
        if (Environment.getExternalStorageDirectory() != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (isWritable(externalStorageDirectory)) {
                hashSet.add(externalStorageDirectory);
            }
        }
        for (File file2 : tryToGetMountedStoragesFromFilesystem().values()) {
            if (isWritable(file2)) {
                hashSet.add(file2);
            }
        }
        return hashSet;
    }

    public static StorageInfo getBestWritableStorage() {
        return getBestWritableStorage(null);
    }

    public static StorageInfo getBestWritableStorage(Context context) {
        List<StorageInfo> storageList = getStorageList(context);
        StorageInfo storageInfo = null;
        for (int i = 0; i < storageList.size(); i++) {
            StorageInfo storageInfo2 = storageList.get(i);
            if (!storageInfo2.readonly && isWritable(new File(storageInfo2.path)) && (storageInfo == null || storageInfo.freeSpace < storageInfo2.freeSpace)) {
                storageInfo = storageInfo2;
            }
        }
        return storageInfo;
    }

    private static StorageInfo getPrimarySharedStorage() {
        boolean z;
        String str = "";
        try {
            if (Environment.getExternalStorageDirectory() != null) {
                str = Environment.getExternalStorageDirectory().getPath();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean z2 = true;
        boolean z3 = false;
        try {
            z = !Environment.isExternalStorageRemovable();
        } catch (Throwable th2) {
            th2.printStackTrace();
            z = false;
        }
        try {
            z3 = isPrimarySharedStorageAvailable();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            z2 = Environment.getExternalStorageState().equals("mounted_ro");
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (z3) {
            return new StorageInfo(str, z, z2, -1);
        }
        return null;
    }

    @Deprecated
    public static String getSdCardPath() {
        return Environment.getExternalStorageDirectory().getPath() + "/";
    }

    @Deprecated
    public static File getStorage() {
        return getStorage(null);
    }

    @Deprecated
    public static File getStorage(Context context) {
        StorageInfo bestWritableStorage = getBestWritableStorage(context);
        if (bestWritableStorage != null) {
            return new File(bestWritableStorage.path);
        }
        return null;
    }

    public static List<StorageInfo> getStorageList() {
        return getStorageList(null);
    }

    public static List<StorageInfo> getStorageList(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return context != null ? getStorageListApi19(context) : getStorageListPreApi19();
        }
        List<StorageInfo> storageListPreApi19 = getStorageListPreApi19();
        if (context != null) {
            List<StorageInfo> storageListApi19 = getStorageListApi19(context);
            storageListApi19.removeAll(storageListPreApi19);
            storageListPreApi19.addAll(storageListApi19);
        }
        return storageListPreApi19;
    }

    @SuppressLint({"NewApi"})
    private static List<StorageInfo> getStorageListApi19(Context context) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StorageInfo(context.getFilesDir().getAbsolutePath(), true, false, -1));
        ArrayList arrayList2 = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StorageInfo(((File) it.next()).getAbsolutePath(), false, false, -1));
        }
        return arrayList;
    }

    private static List<StorageInfo> getStorageListPreApi19() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        StorageInfo primarySharedStorage = getPrimarySharedStorage();
        if (primarySharedStorage != null) {
            arrayList.add(primarySharedStorage);
        }
        arrayList.addAll(tryToFindOtherVoIdManagedStorages(primarySharedStorage != null ? primarySharedStorage.path : ""));
        for (File file : getAllWritableStorageLocations()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StorageInfo) it.next()).path.equals(file.getAbsolutePath())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                arrayList.add(new StorageInfo(file.getAbsolutePath(), false, false, -1));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static boolean isAvailable() {
        return isPrimarySharedStorageAvailable();
    }

    private static boolean isPrimarySharedStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    @Deprecated
    public static boolean isWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean isWritable(File file) {
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write("hi".getBytes());
            fileOutputStream.close();
            file2.delete();
            file.getAbsolutePath();
            return true;
        } catch (Throwable unused) {
            file.getAbsolutePath();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
        r1.close();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
        if (r1 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<org.osmdroid.tileprovider.util.StorageUtils.StorageInfo> tryToFindOtherVoIdManagedStorages(java.lang.String r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            r2.<init>()     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            java.lang.String r5 = "/proc/mounts"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lce java.io.IOException -> Ld0 java.io.FileNotFoundException -> Lda
            r1 = 1
        L18:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r4 == 0) goto Lc1
            java.lang.String r5 = "vfat"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r5 != 0) goto L2e
            java.lang.String r5 = "/mnt"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r5 == 0) goto L18
        L2e:
            java.util.StringTokenizer r5 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r6 = " "
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r5.nextToken()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r6 = r5.nextToken()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            boolean r7 = r2.contains(r6)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 == 0) goto L43
            goto L18
        L43:
            r5.nextToken()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r5 = r5.nextToken()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r7 = ","
            java.lang.String[] r5 = r5.split(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r7 = "ro"
            boolean r5 = r5.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            boolean r7 = r6.equals(r9)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 == 0) goto L64
            r2.add(r9)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            goto L18
        L64:
            java.lang.String r7 = "/dev/block/vold"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 == 0) goto L18
            java.lang.String r7 = "/mnt/secure"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 != 0) goto L18
            java.lang.String r7 = "/mnt/asec"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 != 0) goto L18
            java.lang.String r7 = "/mnt/obb"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 != 0) goto L18
            java.lang.String r7 = "/dev/mapper"
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r7 != 0) goto L18
            java.lang.String r7 = "tmpfs"
            boolean r4 = r4.contains(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r4 != 0) goto L18
            r2.add(r6)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r7.<init>()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r7.append(r6)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r8 = java.io.File.separator     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r7.append(r8)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            if (r4 == 0) goto L18
            org.osmdroid.tileprovider.util.StorageUtils$StorageInfo r4 = new org.osmdroid.tileprovider.util.StorageUtils$StorageInfo     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r7 = 0
            int r8 = r1 + 1
            r4.<init>(r6, r7, r5, r1)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r0.add(r4)     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc8 java.io.FileNotFoundException -> Lcb
            r1 = r8
            goto L18
        Lc1:
            r3.close()     // Catch: java.io.IOException -> Le1
            goto Le1
        Lc5:
            r9 = move-exception
            r1 = r3
            goto Le2
        Lc8:
            r9 = move-exception
            r1 = r3
            goto Ld1
        Lcb:
            r9 = move-exception
            r1 = r3
            goto Ldb
        Lce:
            r9 = move-exception
            goto Le2
        Ld0:
            r9 = move-exception
        Ld1:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto Le1
        Ld6:
            r1.close()     // Catch: java.io.IOException -> Le1
            goto Le1
        Lda:
            r9 = move-exception
        Ldb:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto Le1
            goto Ld6
        Le1:
            return r0
        Le2:
            if (r1 == 0) goto Le7
            r1.close()     // Catch: java.io.IOException -> Le7
        Le7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.StorageUtils.tryToFindOtherVoIdManagedStorages(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r10 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r7 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r7 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
        r7.close();
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0181: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:90:0x0181 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, java.io.File> tryToGetMountedStoragesFromFilesystem() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.StorageUtils.tryToGetMountedStoragesFromFilesystem():java.util.Map");
    }

    private static Set<File> tryToGetStorageFromSystemEnv() {
        HashSet hashSet = new HashSet();
        String str = System.getenv("EXTERNAL_STORAGE");
        if (str != null) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str);
            o00oOOo02.append(File.separator);
            hashSet.add(new File(o00oOOo02.toString()));
        }
        String str2 = System.getenv("SECONDARY_STORAGE");
        if (str2 != null) {
            for (String str3 : str2.split(File.pathSeparator)) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0(str3);
                o00oOOo03.append(File.separator);
                hashSet.add(new File(o00oOOo03.toString()));
            }
        }
        return hashSet;
    }
}
