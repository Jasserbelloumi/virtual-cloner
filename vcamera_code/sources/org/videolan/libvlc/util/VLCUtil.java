package org.videolan.libvlc.util;

import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o00oOooO.oo0oO0;
/* loaded from: classes3.dex */
public class VLCUtil {
    private static final String[] CPU_archs = {"*Pre-v4", "*v4", "*v4T", "v5T", "v5TE", "v5TEJ", "v6", "v6KZ", "v6T2", "v6K", "v7", "*v6-M", "*v6S-M", "*v7E-M", "*v8"};
    private static final int ELF_HEADER_SIZE = 52;
    private static final int EM_386 = 3;
    private static final int EM_AARCH64 = 183;
    private static final int EM_ARM = 40;
    private static final int EM_MIPS = 8;
    private static final int EM_X86_64 = 62;
    private static final int SECTION_HEADER_SIZE = 40;
    private static final int SHT_ARM_ATTRIBUTES = 1879048195;
    public static final String TAG = "VLC/LibVLC/Util";
    private static final String URI_AUTHORIZED_CHARS = "'()*";
    private static String errorMsg;
    private static boolean isCompatible;
    private static MachineSpecs machineSpecs;

    /* loaded from: classes3.dex */
    public static class ElfData {
        public String att_arch;
        public boolean att_fpu;
        public int e_machine;
        public int e_shnum;
        public int e_shoff;
        public boolean is64bits;
        public ByteOrder order;
        public int sh_offset;
        public int sh_size;

        private ElfData() {
        }
    }

    /* loaded from: classes3.dex */
    public static class MachineSpecs {
        public float bogoMIPS;
        public float frequency;
        public boolean hasArmV6;
        public boolean hasArmV7;
        public boolean hasFpu;
        public boolean hasMips;
        public boolean hasNeon;
        public boolean hasX86;
        public boolean is64bits;
        public int processors;
    }

    public static Uri UriFromMrl(String str) {
        int parseInt;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        int i = 0;
        while (i < charArray.length) {
            char c = charArray[i];
            if (c == '%' && charArray.length - i >= 3) {
                try {
                    parseInt = Integer.parseInt(new String(charArray, i + 1, 2), 16);
                } catch (NumberFormatException unused) {
                }
                if (URI_AUTHORIZED_CHARS.indexOf(parseInt) != -1) {
                    sb.append((char) parseInt);
                    i += 2;
                    i++;
                }
            }
            sb.append(c);
            i++;
        }
        return Uri.parse(sb.toString());
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String encodeVLCString(@oo0oO0 String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (char c : charArray) {
            if (URI_AUTHORIZED_CHARS.indexOf(c) != -1) {
                sb.append("%");
                sb.append(Integer.toHexString(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String encodeVLCUri(@oo0oO0 Uri uri) {
        return encodeVLCString(uri.toString());
    }

    public static String[] getABIList() {
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @TargetApi(21)
    public static String[] getABIList21() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return (strArr == null || strArr.length == 0) ? getABIList() : strArr;
    }

    public static String getErrorMsg() {
        return errorMsg;
    }

    public static MachineSpecs getMachineSpecs() {
        return machineSpecs;
    }

    private static String getString(ByteBuffer byteBuffer) {
        char c;
        StringBuilder sb = new StringBuilder(byteBuffer.limit());
        while (byteBuffer.remaining() > 0 && (c = (char) byteBuffer.get()) != 0) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static int getUleb128(ByteBuffer byteBuffer) {
        byte b;
        int i = 0;
        do {
            b = byteBuffer.get();
            i = (i << 7) | (b & Byte.MAX_VALUE);
        } while ((b & 128) > 0);
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:5|(4:8|(2:10|11)(2:13|(2:15|16)(2:17|(2:19|20)(2:21|(2:23|24)(2:25|(2:27|28)(1:29)))))|12|6)|30|31|(2:33|(26:35|(1:205)(1:39)|(1:204)(1:43)|44|(1:46)(1:203)|47|48|49|50|51|52|(3:53|54|(14:56|(11:92|(1:94)(3:95|(2:101|(1:103)(2:104|(2:109|(1:111))(1:108)))|97)|59|(1:88)|63|(1:87)|69|(1:71)|72|(5:76|77|78|79|80)|81)|58|59|(1:61)|88|63|(2:65|67)|87|69|(0)|72|(1:86)(6:74|76|77|78|79|80)|81)(1:112))|113|(1:115)(1:188)|116|(1:(9:153|(2:156|152)|(6:(1:150)|127|(1:132)|133|(3:135|(2:143|(1:146))(1:138)|139)(1:147)|(1:142))(1:125)|126|127|(2:129|132)|133|(0)(0)|(1:142))(1:(9:151|152|(0)|(2:150|126)|127|(0)|133|(0)(0)|(0))(8:122|(0)|(0)|127|(0)|133|(0)(0)|(0))))|157|158|159|160|162|163|(2:165|166)(1:172)|167|168|169))(1:207)|206|48|49|50|51|52|(4:53|54|(0)(0)|81)|113|(0)(0)|116|(0)|157|158|159|160|162|163|(0)(0)|167|168|169) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0165, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0166, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016b, code lost:
        r3 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0174, code lost:
        r3 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0176, code lost:
        r16 = false;
        r17 = false;
        r18 = 0;
        r19 = false;
        r20 = false;
        r21 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0232, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0233, code lost:
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0235, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0236, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0238, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0239, code lost:
        r3 = null;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x023b, code lost:
        close(r3);
        close(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0241, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0242, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0244, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0245, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0246, code lost:
        close(r10);
        close(r9);
        r0 = -1.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0221 A[Catch: all -> 0x0232, IOException | NumberFormatException -> 0x0246, TRY_LEAVE, TryCatch #9 {IOException | NumberFormatException -> 0x0246, all -> 0x0232, blocks: (B:163:0x021b, B:165:0x0221), top: B:198:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0182 A[EDGE_INSN: B:209:0x0182->B:116:0x0182 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9 A[Catch: all -> 0x0163, IOException -> 0x0182, TryCatch #14 {IOException -> 0x0182, all -> 0x0163, blocks: (B:53:0x00a3, B:55:0x00a9, B:81:0x0102, B:83:0x010a, B:86:0x0113, B:88:0x011b, B:90:0x0123, B:93:0x012d, B:95:0x0135, B:98:0x013c, B:100:0x014a, B:101:0x0150, B:58:0x00b4, B:61:0x00bd, B:64:0x00c7, B:67:0x00d1, B:70:0x00da, B:73:0x00e5, B:75:0x00ed, B:78:0x00f8), top: B:190:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135 A[Catch: all -> 0x0163, IOException -> 0x0182, TryCatch #14 {IOException -> 0x0182, all -> 0x0163, blocks: (B:53:0x00a3, B:55:0x00a9, B:81:0x0102, B:83:0x010a, B:86:0x0113, B:88:0x011b, B:90:0x0123, B:93:0x012d, B:95:0x0135, B:98:0x013c, B:100:0x014a, B:101:0x0150, B:58:0x00b4, B:61:0x00bd, B:64:0x00c7, B:67:0x00d1, B:70:0x00da, B:73:0x00e5, B:75:0x00ed, B:78:0x00f8), top: B:190:0x00a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean hasCompatibleCPU(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.hasCompatibleCPU(android.content.Context):boolean");
    }

    private static boolean readArmAttributes(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[elfData.sh_size];
        randomAccessFile.seek(elfData.sh_offset);
        randomAccessFile.readFully(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(elfData.order);
        if (wrap.get() != 65) {
            return false;
        }
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            int position = wrap.position();
            int i = wrap.getInt();
            if (getString(wrap).equals("aeabi")) {
                while (wrap.position() < position + i) {
                    int position2 = wrap.position();
                    byte b = wrap.get();
                    int i2 = wrap.getInt();
                    if (b != 1) {
                        wrap.position(position2 + i2);
                    } else {
                        while (wrap.position() < position2 + i2) {
                            int uleb128 = getUleb128(wrap);
                            if (uleb128 == 6) {
                                elfData.att_arch = CPU_archs[getUleb128(wrap)];
                            } else if (uleb128 == 27) {
                                getUleb128(wrap);
                                elfData.att_fpu = true;
                            } else {
                                int i3 = uleb128 % 128;
                                if (i3 == 4 || i3 == 5 || i3 == 32 || (i3 > 32 && (i3 & 1) != 0)) {
                                    getString(wrap);
                                } else {
                                    getUleb128(wrap);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean readHeader(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte b;
        byte[] bArr = new byte[52];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70 && ((b = bArr[4]) == 1 || b == 2)) {
            elfData.is64bits = b == 2;
            elfData.order = bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(elfData.order);
            elfData.e_machine = wrap.getShort(18);
            elfData.e_shoff = wrap.getInt(32);
            elfData.e_shnum = wrap.getShort(48);
            return true;
        }
        return false;
    }

    private static ElfData readLib(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                try {
                    ElfData elfData = new ElfData();
                    if (!readHeader(randomAccessFile, elfData)) {
                        close(randomAccessFile);
                        return null;
                    }
                    int i = elfData.e_machine;
                    if (i != 3 && i != 8) {
                        if (i == 40) {
                            randomAccessFile.close();
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "r");
                            try {
                                if (!readSection(randomAccessFile3, elfData)) {
                                    close(randomAccessFile3);
                                    return null;
                                }
                                randomAccessFile3.close();
                                randomAccessFile = new RandomAccessFile(file, "r");
                                boolean readArmAttributes = readArmAttributes(randomAccessFile, elfData);
                                close(randomAccessFile);
                                if (readArmAttributes) {
                                    return elfData;
                                }
                                return null;
                            } catch (IOException e) {
                                e = e;
                                randomAccessFile = randomAccessFile3;
                                e.printStackTrace();
                                close(randomAccessFile);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile2 = randomAccessFile3;
                                close(randomAccessFile2);
                                throw th;
                            }
                        } else if (i != 62 && i != EM_AARCH64) {
                            close(randomAccessFile);
                            return null;
                        }
                    }
                    close(randomAccessFile);
                    return elfData;
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static boolean readSection(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[40];
        randomAccessFile.seek(elfData.e_shoff);
        for (int i = 0; i < elfData.e_shnum; i++) {
            randomAccessFile.readFully(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(elfData.order);
            if (wrap.getInt(4) == SHT_ARM_ATTRIBUTES) {
                elfData.sh_offset = wrap.getInt(16);
                elfData.sh_size = wrap.getInt(20);
                return true;
            }
        }
        return false;
    }

    @TargetApi(9)
    private static File searchLibrary(ApplicationInfo applicationInfo) {
        String[] split = (applicationInfo.flags & 1) != 0 ? System.getProperty("java.library.path").split(":") : new String[]{applicationInfo.nativeLibraryDir};
        if (split[0] == null) {
            return null;
        }
        for (String str : split) {
            File file = new File(str, "libvlcjni.so");
            if (file.exists() && file.canRead()) {
                return file;
            }
        }
        return null;
    }
}
