package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.o00oo00O;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f4027o00oOOo0 = "/data/misc/profiles/ref/";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f4028o00oOOoO = "/data/misc/profiles/cur/0/";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f4029o00oOo00 = "primary.prof";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o00oo00O<o00oOo00> f4030o00oOo0O = o00oo00O.o00oOOoO();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Object f4031o00oOo0o = new Object();
    @o0OO00OO

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static o00oOo00 f4032o00oOoO = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f4033o00oOoO0 = "ProfileVerifier";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f4034o00oOooO = "profileInstalled";

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static PackageInfo o00oOOo0(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f4035o00oOo0O = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f4036o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f4037o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final long f4038o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final long f4039o00oOooO;

        public o00oOOoO(int i, int i2, long j, long j2) {
            this.f4036o00oOOo0 = i;
            this.f4037o00oOOoO = i2;
            this.f4038o00oOo00 = j;
            this.f4039o00oOooO = j2;
        }

        public static o00oOOoO o00oOOo0(@oo0oO0 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                o00oOOoO o00ooooo2 = new o00oOOoO(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return o00ooooo2;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof o00oOOoO)) {
                return false;
            }
            o00oOOoO o00ooooo2 = (o00oOOoO) obj;
            return this.f4037o00oOOoO == o00ooooo2.f4037o00oOOoO && this.f4038o00oOo00 == o00ooooo2.f4038o00oOo00 && this.f4036o00oOOo0 == o00ooooo2.f4036o00oOOo0 && this.f4039o00oOooO == o00ooooo2.f4039o00oOooO;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4037o00oOOoO), Long.valueOf(this.f4038o00oOo00), Integer.valueOf(this.f4036o00oOOo0), Long.valueOf(this.f4039o00oOooO));
        }

        public void o00oOOoO(@oo0oO0 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4036o00oOOo0);
                dataOutputStream.writeInt(this.f4037o00oOOoO);
                dataOutputStream.writeLong(this.f4038o00oOo00);
                dataOutputStream.writeLong(this.f4039o00oOooO);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f4040o00oOo0O = 0;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f4041o00oOo0o = 1;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4042o00oOoO = 3;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4043o00oOoO0 = 2;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4044o00oOoOO = 65536;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4045o00oOoOo = 131072;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f4046o00oOoo0 = 196608;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f4047o00oOooO = 16;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f4048o00oOooo = 262144;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f4049o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f4050o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final boolean f4051o00oOo00;

        @Retention(RetentionPolicy.SOURCE)
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        public o00oOo00(int i, boolean z, boolean z2) {
            this.f4049o00oOOo0 = i;
            this.f4051o00oOo00 = z2;
            this.f4050o00oOOoO = z;
        }

        public int o00oOOo0() {
            return this.f4049o00oOOo0;
        }

        public boolean o00oOOoO() {
            return this.f4051o00oOo00;
        }

        public boolean o00oOo00() {
            return this.f4050o00oOOoO;
        }
    }

    @oo0oO0
    public static ListenableFuture<o00oOo00> o00oOOo0() {
        return f4030o00oOo0O;
    }

    public static long o00oOOoO(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? o00oOOo0.o00oOOo0(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    public static o00oOo00 o00oOo00(int i, boolean z, boolean z2) {
        o00oOo00 o00ooo002 = new o00oOo00(i, z, z2);
        f4032o00oOoO = o00ooo002;
        f4030o00oOo0O.set(o00ooo002);
        return f4032o00oOoO;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:77)(1:18)|19|(1:76)(1:23)|24|25|26|(2:62|63)|28|(8:35|(1:39)|(1:46)|47|(2:54|55)|51|52|53)|(1:61)|(1:39)|(3:41|44|46)|47|(1:49)|54|55|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
        r3 = androidx.profileinstaller.o00oOo0O.o00oOo00.f4046o00oOoo0;
     */
    @o00oOooO.oo0oO0
    @o00oOooO.o0OO0oO({o00oOooO.o0OO0oO.o00oOOo0.LIBRARY})
    @o00oOooO.oO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.o00oOo0O.o00oOo00 o00oOo0O(@o00oOooO.oo0oO0 android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.o00oOo0O.o00oOo0O(android.content.Context, boolean):androidx.profileinstaller.o00oOo0O$o00oOo00");
    }

    @oo0oO0
    @oO0Oo
    public static o00oOo00 o00oOooO(@oo0oO0 Context context) {
        return o00oOo0O(context, false);
    }
}
