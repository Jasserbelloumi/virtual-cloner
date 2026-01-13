package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.o00oOo0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f3643o00oOOoO = "MediaSessionManager";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static volatile o00oOOoO f3645o00oOo0O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOOo0 f3647o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f3644o00oOo00 = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Object f3646o00oOooO = new Object();

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        Context getContext();

        boolean o00oOOo0(o00oOo00 o00ooo002);
    }

    /* renamed from: androidx.media.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0034o00oOOoO {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f3648o00oOOoO = "android.media.session.MediaController";
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f3649o00oOo00 = -1;
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f3650o00oOooO = -1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOo00 f3651o00oOOo0;

        @o0OOooO0(28)
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public C0034o00oOOoO(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName = remoteUserInfo.getPackageName();
            if (packageName == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(packageName)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.f3651o00oOOo0 = new o00oOo0O.o00oOOo0(remoteUserInfo);
        }

        public C0034o00oOOoO(@oo0oO0 String str, int i, int i2) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.f3651o00oOOo0 = new o00oOo0O.o00oOOo0(str, i, i2);
        }

        public boolean equals(@o0OO00OO Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0034o00oOOoO) {
                return this.f3651o00oOOo0.equals(((C0034o00oOOoO) obj).f3651o00oOOo0);
            }
            return false;
        }

        public int hashCode() {
            return this.f3651o00oOOo0.hashCode();
        }

        @oo0oO0
        public String o00oOOo0() {
            return this.f3651o00oOOo0.getPackageName();
        }

        public int o00oOOoO() {
            return this.f3651o00oOOo0.o00oOOo0();
        }

        public int o00oOo00() {
            return this.f3651o00oOOo0.getUid();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        String getPackageName();

        int getUid();

        int o00oOOo0();
    }

    public o00oOOoO(Context context) {
        this.f3647o00oOOo0 = new o00oOo0O(context);
    }

    @oo0oO0
    public static o00oOOoO o00oOOoO(@oo0oO0 Context context) {
        o00oOOoO o00ooooo2;
        if (context != null) {
            synchronized (f3646o00oOooO) {
                if (f3645o00oOo0O == null) {
                    f3645o00oOo0O = new o00oOOoO(context.getApplicationContext());
                }
                o00ooooo2 = f3645o00oOo0O;
            }
            return o00ooooo2;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public Context o00oOOo0() {
        return this.f3647o00oOOo0.getContext();
    }

    public boolean o00oOo00(@oo0oO0 C0034o00oOOoO c0034o00oOOoO) {
        if (c0034o00oOOoO != null) {
            return this.f3647o00oOOo0.o00oOOo0(c0034o00oOOoO.f3651o00oOOo0);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
