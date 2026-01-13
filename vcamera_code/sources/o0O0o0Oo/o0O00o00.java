package o0O0o0Oo;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import o00oOooO.oo0oO0;
import o0O0OO.o0O0O0o0;
import o0O0Ooo0.o00oo0;
import o0O0Ooo0.o0OoO00O;
/* loaded from: classes.dex */
public class o0O00o00 {

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f12436o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final /* synthetic */ int[] f12437o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final /* synthetic */ int[] f12438o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final /* synthetic */ int[] f12439o00oOooO;

        static {
            int[] iArr = new int[o0O0Ooo0.o0OoOoOo.values().length];
            f12439o00oOooO = iArr;
            try {
                iArr[o0O0Ooo0.o0OoOoOo.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12439o00oOooO[o0O0Ooo0.o0OoOoOo.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o0O0Ooo0.o0O0000O.values().length];
            f12438o00oOo00 = iArr2;
            try {
                iArr2[o0O0Ooo0.o0O0000O.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12438o00oOo00[o0O0Ooo0.o0O0000O.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12438o00oOo00[o0O0Ooo0.o0O0000O.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12438o00oOo00[o0O0Ooo0.o0O0000O.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12438o00oOo00[o0O0Ooo0.o0O0000O.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[o0O0Ooo0.o00oOoO.values().length];
            f12437o00oOOoO = iArr3;
            try {
                iArr3[o0O0Ooo0.o00oOoO.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12437o00oOOoO[o0O0Ooo0.o00oOoO.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[o0OoO00O.o00oOOo0.values().length];
            f12436o00oOOo0 = iArr4;
            try {
                iArr4[o0OoO00O.o00oOOo0.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12436o00oOOo0[o0OoO00O.o00oOOo0.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12436o00oOOo0[o0OoO00O.o00oOOo0.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12436o00oOOo0[o0OoO00O.o00oOOo0.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12436o00oOOo0[o0OoO00O.o00oOOo0.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12436o00oOOo0[o0OoO00O.o00oOOo0.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f12440o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f12441o00oOOoO = 1;
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f12442o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f12443o00oOOoO = 1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f12444o00oOo00 = 2;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f12445o00oOo0O = 4;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f12446o00oOo0o = 5;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f12447o00oOooO = 3;
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f12448o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f12449o00oOOoO = 1;
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f12450o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f12451o00oOOoO = 1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f12452o00oOo00 = 2;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f12453o00oOo0O = 4;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f12454o00oOo0o = 5;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final String f12455o00oOoO0 = "(2, 3, 5)";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f12456o00oOooO = 3;
    }

    @o0O0O0o0
    public static int o00oOOo0(o0O0Ooo0.o00oOoO o00oooo2) {
        int i = o00oOOo0.f12437o00oOOoO[o00oooo2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + o00oooo2 + " to int");
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0053 -> B:33:0x0056). Please submit an issue!!! */
    @o0O0OO.o0O0O0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o0O0Ooo0.o00oo0 o00oOOoO(byte[] r6) {
        /*
            o0O0Ooo0.o00oo0 r0 = new o0O0Ooo0.o00oo0
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.o00oOOo0(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0o0Oo.o0O00o00.o00oOOoO(byte[]):o0O0Ooo0.o00oo0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0061 -> B:35:0x0064). Please submit an issue!!! */
    @o0O0O0o0
    public static byte[] o00oOo00(o00oo0 o00oo0Var) {
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        if (o00oo0Var.o00oOo00() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                    objectOutputStream2 = objectOutputStream2;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(o00oo0Var.o00oOo00());
            Iterator<o00oo0.o00oOOo0> it = o00oo0Var.f12144o00oOOo0.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    o00oo0.o00oOOo0 next = it.next();
                    objectOutputStream.writeUTF(next.f12145o00oOOo0.toString());
                    objectOutputStream.writeBoolean(next.f12146o00oOOoO);
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream2;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @o0O0O0o0
    public static o0O0Ooo0.o0O0000O o00oOo0O(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT < 30 || i != 5) {
                                throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Could not convert ", i, " to NetworkType"));
                            }
                            return o0O0Ooo0.o0O0000O.TEMPORARILY_UNMETERED;
                        }
                        return o0O0Ooo0.o0O0000O.METERED;
                    }
                    return o0O0Ooo0.o0O0000O.NOT_ROAMING;
                }
                return o0O0Ooo0.o0O0000O.UNMETERED;
            }
            return o0O0Ooo0.o0O0000O.CONNECTED;
        }
        return o0O0Ooo0.o0O0000O.NOT_REQUIRED;
    }

    @o0O0O0o0
    @oo0oO0
    public static o0O0Ooo0.o0OoOoOo o00oOo0o(int i) {
        if (i != 0) {
            if (i == 1) {
                return o0O0Ooo0.o0OoOoOo.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Could not convert ", i, " to OutOfQuotaPolicy"));
        }
        return o0O0Ooo0.o0OoOoOo.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    @o0O0O0o0
    public static int o00oOoO(o0O0Ooo0.o0O0000O o0o0000o) {
        int i = o00oOOo0.f12438o00oOo00[o0o0000o.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (Build.VERSION.SDK_INT < 30 || o0o0000o != o0O0Ooo0.o0O0000O.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + o0o0000o + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @o0O0O0o0
    public static o0OoO00O.o00oOOo0 o00oOoO0(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return o0OoO00O.o00oOOo0.CANCELLED;
                            }
                            throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Could not convert ", i, " to State"));
                        }
                        return o0OoO00O.o00oOOo0.BLOCKED;
                    }
                    return o0OoO00O.o00oOOo0.FAILED;
                }
                return o0OoO00O.o00oOOo0.SUCCEEDED;
            }
            return o0OoO00O.o00oOOo0.RUNNING;
        }
        return o0OoO00O.o00oOOo0.ENQUEUED;
    }

    @o0O0O0o0
    public static int o00oOoOO(@oo0oO0 o0O0Ooo0.o0OoOoOo o0oooooo) {
        int i = o00oOOo0.f12439o00oOooO[o0oooooo.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + o0oooooo + " to int");
        }
        return 0;
    }

    @o0O0O0o0
    public static int o00oOoOo(o0OoO00O.o00oOOo0 o00oooo02) {
        switch (o00oOOo0.f12436o00oOOo0[o00oooo02.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + o00oooo02 + " to int");
        }
    }

    @o0O0O0o0
    public static o0O0Ooo0.o00oOoO o00oOooO(int i) {
        if (i != 0) {
            if (i == 1) {
                return o0O0Ooo0.o00oOoO.LINEAR;
            }
            throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Could not convert ", i, " to BackoffPolicy"));
        }
        return o0O0Ooo0.o00oOoO.EXPONENTIAL;
    }
}
