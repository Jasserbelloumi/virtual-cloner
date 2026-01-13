package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media.o00oOOoO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public class o00oOoO implements o00oOOoO.o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f3654o00oOo00 = "MediaSessionManager";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f3655o00oOo0O = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f3656o00oOo0o = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f3657o00oOoO0 = "enabled_notification_listeners";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final boolean f3658o00oOooO = o00oOOoO.f3644o00oOo00;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f3659o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ContentResolver f3660o00oOOoO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOOoO.o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public String f3661o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f3662o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f3663o00oOo00;

        public o00oOOo0(String str, int i, int i2) {
            this.f3661o00oOOo0 = str;
            this.f3662o00oOOoO = i;
            this.f3663o00oOo00 = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oOOo0) {
                o00oOOo0 o00oooo02 = (o00oOOo0) obj;
                return (this.f3662o00oOOoO < 0 || o00oooo02.f3662o00oOOoO < 0) ? TextUtils.equals(this.f3661o00oOOo0, o00oooo02.f3661o00oOOo0) && this.f3663o00oOo00 == o00oooo02.f3663o00oOo00 : TextUtils.equals(this.f3661o00oOOo0, o00oooo02.f3661o00oOOo0) && this.f3662o00oOOoO == o00oooo02.f3662o00oOOoO && this.f3663o00oOo00 == o00oooo02.f3663o00oOo00;
            }
            return false;
        }

        @Override // androidx.media.o00oOOoO.o00oOo00
        public String getPackageName() {
            return this.f3661o00oOOo0;
        }

        @Override // androidx.media.o00oOOoO.o00oOo00
        public int getUid() {
            return this.f3663o00oOo00;
        }

        public int hashCode() {
            return oO0Ooooo.o00oOOo0.o00oOOoO(this.f3661o00oOOo0, Integer.valueOf(this.f3663o00oOo00));
        }

        @Override // androidx.media.o00oOOoO.o00oOo00
        public int o00oOOo0() {
            return this.f3662o00oOOoO;
        }
    }

    public o00oOoO(Context context) {
        this.f3659o00oOOo0 = context;
        this.f3660o00oOOoO = context.getContentResolver();
    }

    @Override // androidx.media.o00oOOoO.o00oOOo0
    public Context getContext() {
        return this.f3659o00oOOo0;
    }

    @Override // androidx.media.o00oOOoO.o00oOOo0
    public boolean o00oOOo0(@oo0oO0 o00oOOoO.o00oOo00 o00ooo002) {
        try {
            if (this.f3659o00oOOo0.getPackageManager().getApplicationInfo(o00ooo002.getPackageName(), 0) == null) {
                return false;
            }
            return o00oOo00(o00ooo002, f3655o00oOo0O) || o00oOo00(o00ooo002, f3656o00oOo0o) || o00ooo002.getUid() == 1000 || o00oOOoO(o00ooo002);
        } catch (PackageManager.NameNotFoundException unused) {
            if (f3658o00oOooO) {
                o00ooo002.getPackageName();
            }
            return false;
        }
    }

    public boolean o00oOOoO(@oo0oO0 o00oOOoO.o00oOo00 o00ooo002) {
        String string = Settings.Secure.getString(this.f3660o00oOOoO, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(o00ooo002.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o00oOo00(o00oOOoO.o00oOo00 o00ooo002, String str) {
        return o00ooo002.o00oOOo0() < 0 ? this.f3659o00oOOo0.getPackageManager().checkPermission(str, o00ooo002.getPackageName()) == 0 : this.f3659o00oOOo0.checkPermission(str, o00ooo002.o00oOOo0(), o00ooo002.getUid()) == 0;
    }
}
