package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.o00oOo00;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O0OO0.o00ooO;
import o0O0OO0.o00ooO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o00oOOoO {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AssetManager f3986o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Executor f3987o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOo00.o00oOo0O f3988o00oOo00;
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final File f3989o00oOo0O;
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final String f3990o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final String f3991o00oOoO;
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final String f3992o00oOoO0;
    @o0OO00OO

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o0O0OO0.o00oOOoO[] f3994o00oOoOo;
    @o0OO00OO

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public byte[] f3995o00oOoo0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f3993o00oOoOO = false;
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final byte[] f3996o00oOooO = o00oOooO();

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oOOoO(@oo0oO0 AssetManager assetManager, @oo0oO0 Executor executor, @oo0oO0 o00oOo00.o00oOo0O o00ooo0o2, @oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, @oo0oO0 File file) {
        this.f3986o00oOOo0 = assetManager;
        this.f3987o00oOOoO = executor;
        this.f3988o00oOo00 = o00ooo0o2;
        this.f3990o00oOo0o = str;
        this.f3992o00oOoO0 = str2;
        this.f3991o00oOoO = str3;
        this.f3989o00oOo0O = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoO0(int i, Object obj) {
        this.f3988o00oOo00.o00oOOo0(i, obj);
    }

    public static boolean o00oOoo0() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        switch (i) {
            case 31:
            case 32:
            case 33:
                return true;
            default:
                return false;
        }
    }

    @o0OO00OO
    public static byte[] o00oOooO() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
            case 28:
            case 29:
            case 30:
                return o00ooO.f11449o00oOOoO;
            case 31:
            case 32:
            case 33:
                return o00ooO.f11448o00oOOo0;
            default:
                return null;
        }
    }

    @o0OO00OO
    public final o00oOOoO o00oOOoO(o0O0OO0.o00oOOoO[] o00oooooArr, byte[] bArr) {
        o00oOo00.o00oOo0O o00ooo0o2;
        int i;
        InputStream o00oOoO2;
        try {
            o00oOoO2 = o00oOoO(this.f3986o00oOOo0, this.f3991o00oOoO);
        } catch (FileNotFoundException e) {
            e = e;
            o00ooo0o2 = this.f3988o00oOo00;
            i = 9;
            o00ooo0o2.o00oOOo0(i, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            o00ooo0o2 = this.f3988o00oOo00;
            i = 7;
            o00ooo0o2.o00oOOo0(i, e);
            return null;
        } catch (IllegalStateException e3) {
            e = e3;
            this.f3994o00oOoOo = null;
            o00ooo0o2 = this.f3988o00oOo00;
            i = 8;
            o00ooo0o2.o00oOOo0(i, e);
            return null;
        }
        if (o00oOoO2 != null) {
            this.f3994o00oOoOo = o00ooO0.o00oo0O(o00oOoO2, o00ooO0.o00oo0OO(o00oOoO2, o00ooO0.f11462o00oOoO0), bArr, o00oooooArr);
            o00oOoO2.close();
            return this;
        }
        if (o00oOoO2 != null) {
            o00oOoO2.close();
        }
        return null;
    }

    public final void o00oOo00() {
        if (!this.f3993o00oOoOO) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOo0O() {
        int i;
        Integer num;
        if (this.f3996o00oOooO == null) {
            i = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (this.f3989o00oOo0O.canWrite()) {
            this.f3993o00oOoOO = true;
            return true;
        } else {
            i = 4;
            num = null;
        }
        o00oOooo(i, num);
        return false;
    }

    @o0OO00OO
    public final InputStream o00oOo0o(AssetManager assetManager) {
        o00oOo00.o00oOo0O o00ooo0o2;
        int i;
        try {
            return o00oOoO(assetManager, this.f3992o00oOoO0);
        } catch (FileNotFoundException e) {
            e = e;
            o00ooo0o2 = this.f3988o00oOo00;
            i = 6;
            o00ooo0o2.o00oOOo0(i, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            o00ooo0o2 = this.f3988o00oOo00;
            i = 7;
            o00ooo0o2.o00oOOo0(i, e);
            return null;
        }
    }

    @o0OO00OO
    public final InputStream o00oOoO(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3988o00oOo00.o00oOOoO(5, null);
            return null;
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oOOoO o00oOoOO() {
        o00oOOoO o00oOOoO2;
        o00oOo00();
        if (this.f3996o00oOooO == null) {
            return this;
        }
        InputStream o00oOo0o2 = o00oOo0o(this.f3986o00oOOo0);
        if (o00oOo0o2 != null) {
            this.f3994o00oOoOo = o00oOoOo(o00oOo0o2);
        }
        o0O0OO0.o00oOOoO[] o00oooooArr = this.f3994o00oOoOo;
        return (o00oooooArr == null || !o00oOoo0() || (o00oOOoO2 = o00oOOoO(o00oooooArr, this.f3996o00oOooO)) == null) ? this : o00oOOoO2;
    }

    @o0OO00OO
    public final o0O0OO0.o00oOOoO[] o00oOoOo(InputStream inputStream) {
        try {
        } catch (IOException e) {
            this.f3988o00oOo00.o00oOOo0(7, e);
        }
        try {
            try {
                o0O0OO0.o00oOOoO[] o00oo2 = o00ooO0.o00oo(inputStream, o00ooO0.o00oo0OO(inputStream, o00ooO0.f11461o00oOo0o), this.f3990o00oOo0o);
                try {
                    inputStream.close();
                    return o00oo2;
                } catch (IOException e2) {
                    this.f3988o00oOo00.o00oOOo0(7, e2);
                    return o00oo2;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    this.f3988o00oOo00.o00oOOo0(7, e3);
                }
                throw th;
            }
        } catch (IOException e4) {
            this.f3988o00oOo00.o00oOOo0(7, e4);
            inputStream.close();
            return null;
        } catch (IllegalStateException e5) {
            this.f3988o00oOo00.o00oOOo0(8, e5);
            inputStream.close();
            return null;
        }
    }

    public final void o00oOooo(final int i, @o0OO00OO final Object obj) {
        this.f3987o00oOOoO.execute(new Runnable() { // from class: o0O0OO0.o00oOOo0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.o00oOOoO.this.o00oOoO0(i, obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], o0O0OO0.o00oOOoO[]] */
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oo0() {
        byte[] bArr = this.f3995o00oOoo0;
        if (bArr == null) {
            return false;
        }
        o00oOo00();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3989o00oOo0O);
                    o0O0OO0.o00oOo00.o00oOooo(byteArrayInputStream, fileOutputStream);
                    o00oOooo(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                o00oOooo(6, e);
                return false;
            } catch (IOException e2) {
                o00oOooo(7, e2);
                return false;
            }
        } finally {
            this.f3995o00oOoo0 = null;
            this.f3994o00oOoOo = null;
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oOOoO o00oo00O() {
        o00oOo00.o00oOo0O o00ooo0o2;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        o0O0OO0.o00oOOoO[] o00oooooArr = this.f3994o00oOoOo;
        byte[] bArr = this.f3996o00oOooO;
        if (o00oooooArr != null && bArr != null) {
            o00oOo00();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    o00ooO0.o00ooOOo(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                o00ooo0o2 = this.f3988o00oOo00;
                i = 7;
                o00ooo0o2.o00oOOo0(i, e);
                this.f3994o00oOoOo = null;
                return this;
            } catch (IllegalStateException e2) {
                e = e2;
                o00ooo0o2 = this.f3988o00oOo00;
                i = 8;
                o00ooo0o2.o00oOOo0(i, e);
                this.f3994o00oOoOo = null;
                return this;
            }
            if (!o00ooO0.o00ooO(byteArrayOutputStream, bArr, o00oooooArr)) {
                this.f3988o00oOo00.o00oOOo0(5, null);
                this.f3994o00oOoOo = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f3995o00oOoo0 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f3994o00oOoOo = null;
        }
        return this;
    }
}
