package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o00oOoOo.o00oo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.o0oo0000;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f2359o00oo = "external-path";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f2361o00oo0o = "root-path";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f2362o00oo0o0 = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f2363o00oo0oO = "files-path";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f2364o00ooO = "path";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f2365o00ooO0 = "external-cache-path";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f2366o00ooO00 = "external-files-path";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f2367o00ooO0O = "external-media-path";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f2368o00ooO0o = "name";

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f2370o00ooOO0 = "displayName";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f2372o0O0o = "cache-path";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f2373o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOOoO f2374o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String[] f2360o00oo0Oo = {"_display_name", "_size"};

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final File f2369o00ooOO = new File("/");
    @o0O0OOOo("sCache")

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final HashMap<String, o00oOOoO> f2371o00ooOOo = new HashMap<>();

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static File[] o00oOOo0(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        Uri o00oOOo0(File file);

        File o00oOOoO(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2375o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final HashMap<String, File> f2376o00oOOoO = new HashMap<>();

        public o00oOo00(String str) {
            this.f2375o00oOOo0 = str;
        }

        @Override // androidx.core.content.FileProvider.o00oOOoO
        public Uri o00oOOo0(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2376o00oOOoO.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    boolean endsWith = path2.endsWith("/");
                    int length = path2.length();
                    if (!endsWith) {
                        length++;
                    }
                    String substring = canonicalPath.substring(length);
                    return new Uri.Builder().scheme("content").authority(this.f2375o00oOOo0).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(o00oo.o00oOOo0("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.o00oOOoO
        public File o00oOOoO(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2376o00oOOoO.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        public void o00oOo00(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f2376o00oOOoO.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    public FileProvider() {
        this.f2373o00oo0O = 0;
    }

    public FileProvider(@o0oo0000 int i) {
        this.f2373o00oo0O = i;
    }

    public static File o00oOOo0(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] o00oOOoO(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public static String[] o00oOo00(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static o00oOOoO o00oOo0O(Context context, String str, int i) {
        o00oOOoO o00ooooo2;
        HashMap<String, o00oOOoO> hashMap = f2371o00ooOOo;
        synchronized (hashMap) {
            o00ooooo2 = hashMap.get(str);
            if (o00ooooo2 == null) {
                try {
                    try {
                        o00ooooo2 = o00oOoOO(context, str, i);
                        hashMap.put(str, o00ooooo2);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return o00ooooo2;
    }

    public static Uri o00oOo0o(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 File file) {
        return o00oOo0O(context, str, 0).o00oOOo0(file);
    }

    public static int o00oOoO(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0("Invalid mode: ", str));
    }

    @oo0oO0
    @SuppressLint({"StreamFiles"})
    public static Uri o00oOoO0(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 File file, @oo0oO0 String str2) {
        return o00oOo0o(context, str, file).buildUpon().appendQueryParameter(f2370o00ooOO0, str2).build();
    }

    public static o00oOOoO o00oOoOO(Context context, String str, int i) throws IOException, XmlPullParserException {
        o00oOo00 o00ooo002 = new o00oOo00(str);
        XmlResourceParser o00oOooO2 = o00oOooO(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = o00oOooO2.next();
            if (next == 1) {
                return o00ooo002;
            }
            if (next == 2) {
                String name = o00oOooO2.getName();
                File file = null;
                String attributeValue = o00oOooO2.getAttributeValue(null, "name");
                String attributeValue2 = o00oOooO2.getAttributeValue(null, "path");
                if (f2361o00oo0o.equals(name)) {
                    file = f2369o00ooOO;
                } else if (f2363o00oo0oO.equals(name)) {
                    file = context.getFilesDir();
                } else if (f2372o0O0o.equals(name)) {
                    file = context.getCacheDir();
                } else if (f2359o00oo.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (f2366o00ooO00.equals(name)) {
                    File[] externalFilesDirs = o0.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if (f2365o00ooO0.equals(name)) {
                    File[] externalCacheDirs = o0.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if (f2367o00ooO0O.equals(name)) {
                    File[] o00oOOo02 = o00oOOo0.o00oOOo0(context);
                    if (o00oOOo02.length > 0) {
                        file = o00oOOo02[0];
                    }
                }
                if (file != null) {
                    o00ooo002.o00oOo00(attributeValue, o00oOOo0(file, attributeValue2));
                }
            }
        }
    }

    @o0o0000
    public static XmlResourceParser o00oOooO(Context context, String str, @o0OO00OO ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(f2362o00oo0o0, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f2362o00oo0o0);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0("Couldn't find meta-data for provider with authority ", str));
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@oo0oO0 Context context, @oo0oO0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, o00oOOoO> hashMap = f2371o00ooOOo;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f2374o00oo0O0 = o00oOo0O(context, str, this.f2373o00oo0O);
    }

    @Override // android.content.ContentProvider
    public int delete(@oo0oO0 Uri uri, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        return this.f2374o00oo0O0.o00oOOoO(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public String getType(@oo0oO0 Uri uri) {
        File o00oOOoO2 = this.f2374o00oo0O0.o00oOOoO(uri);
        int lastIndexOf = o00oOOoO2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(o00oOOoO2.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@oo0oO0 Uri uri, @oo0oO0 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@oo0oO0 Uri uri, @oo0oO0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f2374o00oo0O0.o00oOOoO(uri), o00oOoO(str));
    }

    @Override // android.content.ContentProvider
    @oo0oO0
    public Cursor query(@oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2) {
        int i;
        File o00oOOoO2 = this.f2374o00oo0O0.o00oOOoO(uri);
        String queryParameter = uri.getQueryParameter(f2370o00ooOO0);
        if (strArr == null) {
            strArr = f2360o00oo0Oo;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? o00oOOoO2.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(o00oOOoO2.length());
            }
            i2 = i;
        }
        String[] o00oOo002 = o00oOo00(strArr3, i2);
        Object[] o00oOOoO3 = o00oOOoO(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(o00oOo002, 1);
        matrixCursor.addRow(o00oOOoO3);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@oo0oO0 Uri uri, @oo0oO0 ContentValues contentValues, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
