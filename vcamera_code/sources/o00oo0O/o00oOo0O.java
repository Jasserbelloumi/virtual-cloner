package o00oo0O;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import o00oOooO.o0O00000;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oo0O.o00oOOo0;
import o00oo0O.o00oo0;
import o00ooOoo.oO000OOo;
import o00ooOoo.oO00O0o0;
import o00ooo0.o0;
/* loaded from: classes.dex */
public final class o00oOo0O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f7315o00oOo00 = "android.support.customtabs.extra.user_opt_out";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7316o00oOo0O = "android.support.customtabs.extra.SESSION_ID";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f7317o00oOo0o = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f7318o00oOoO = 2;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f7319o00oOoO0 = 1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f7320o00oOoOO = 2;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f7321o00oOoOo = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f7322o00oOoo0 = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7323o00oOooO = "android.support.customtabs.extra.SESSION";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f7324o00oOooo = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f7325o00oo = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f7326o00oo0 = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f7327o00oo00O = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f7328o00oo0O = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f7329o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f7330o00oo0OO = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f7331o00oo0Oo = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f7332o00oo0o = "android.support.customtabs.customaction.ICON";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f7333o00oo0o0 = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f7334o00oo0oO = "android.support.customtabs.customaction.DESCRIPTION";

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f7335o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f7336o00ooO0 = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f7337o00ooO00 = "android.support.customtabs.extra.MENU_ITEMS";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f7338o00ooO0O = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f7339o00ooO0o = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f7340o00ooOO = 2;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f7341o00ooOO0 = 2;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f7342o00ooOOo = "androidx.browser.customtabs.extra.SHARE_STATE";

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f7343o00ooOo = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    @Deprecated

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f7344o00ooOo0 = "android.support.customtabs.extra.SHARE_MENU_ITEM";

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f7345o00ooOoO = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f7346o00ooOoo = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f7347o00ooo0 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f7348o00ooo00 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f7349o00ooo0O = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final String f7350o00ooo0o = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f7351o00oooO = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final String f7352o00oooOO = "android.support.customtabs.customaction.ID";

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f7353o00oooOo = 0;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f7354o00oooo0 = 5;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f7355o0O0o = "android.support.customtabs.customaction.PENDING_INTENT";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Intent f7356o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Bundle f7357o00oOOoO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public ArrayList<Bundle> f7360o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ArrayList<Bundle> f7361o00oOo0O;
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public SparseArray<Bundle> f7362o00oOo0o;
        @o0OO00OO

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public Bundle f7364o00oOoO0;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Bundle f7366o00oOooO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Intent f7358o00oOOo0 = new Intent("android.intent.action.VIEW");

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOo0.C0105o00oOOo0 f7359o00oOOoO = new o00oOOo0.C0105o00oOOo0();

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f7363o00oOoO = 0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f7365o00oOoOO = true;

        public o00oOOo0() {
        }

        public o00oOOo0(@o0OO00OO o00oo0 o00oo0Var) {
            if (o00oo0Var != null) {
                o00oo0o(o00oo0Var);
            }
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oOOo0() {
            o0O0o(1);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOOoO(@oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent) {
            if (this.f7360o00oOo00 == null) {
                this.f7360o00oOo00 = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(o00oOo0O.f7336o00ooO0, str);
            bundle.putParcelable(o00oOo0O.f7355o0O0o, pendingIntent);
            this.f7360o00oOo00.add(bundle);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oOo00(int i, @oo0oO0 Bitmap bitmap, @oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f7361o00oOo0O == null) {
                this.f7361o00oOo0O = new ArrayList<>();
            }
            if (this.f7361o00oOo0O.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(o00oOo0O.f7352o00oooOO, i);
                bundle.putParcelable(o00oOo0O.f7332o00oo0o, bitmap);
                bundle.putString(o00oOo0O.f7334o00oo0oO, str);
                bundle.putParcelable(o00oOo0O.f7355o0O0o, pendingIntent);
                this.f7361o00oOo0O.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oOo0O() {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7324o00oOooo, true);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo0o(@oo0oO0 Bitmap bitmap, @oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent) {
            return o00oOoO0(bitmap, str, pendingIntent, false);
        }

        @oo0oO0
        public o00oOOo0 o00oOoO(@oo0oO0 Bitmap bitmap) {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7327o00oo00O, bitmap);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoO0(@oo0oO0 Bitmap bitmap, @oo0oO0 String str, @oo0oO0 PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(o00oOo0O.f7352o00oooOO, 0);
            bundle.putParcelable(o00oOo0O.f7332o00oo0o, bitmap);
            bundle.putString(o00oOo0O.f7334o00oo0oO, str);
            bundle.putParcelable(o00oOo0O.f7355o0O0o, pendingIntent);
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7328o00oo0O, bundle);
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7325o00oo, z);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOO(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7321o00oOoOo, i);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoOo(int i, @oo0oO0 o00oo0O.o00oOOo0 o00oooo02) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Invalid colorScheme: ", i));
            }
            if (this.f7362o00oOo0o == null) {
                this.f7362o00oOo0o = new SparseArray<>();
            }
            this.f7362o00oOo0o.put(i, o00oooo02.o00oOOoO());
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOoo0(@oo0oO0 o00oo0O.o00oOOo0 o00oooo02) {
            this.f7364o00oOoO0 = o00oooo02.o00oOOoO();
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOooO() {
            if (!this.f7358o00oOOo0.hasExtra(o00oOo0O.f7323o00oOooO)) {
                o00oo0oO(null, null);
            }
            ArrayList<Bundle> arrayList = this.f7360o00oOo00;
            if (arrayList != null) {
                this.f7358o00oOOo0.putParcelableArrayListExtra(o00oOo0O.f7337o00ooO00, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f7361o00oOo0O;
            if (arrayList2 != null) {
                this.f7358o00oOOo0.putParcelableArrayListExtra(o00oOo0O.f7331o00oo0Oo, arrayList2);
            }
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7347o00ooo0, this.f7365o00oOoOO);
            this.f7358o00oOOo0.putExtras(this.f7359o00oOOoO.o00oOOo0().o00oOOoO());
            Bundle bundle = this.f7364o00oOoO0;
            if (bundle != null) {
                this.f7358o00oOOo0.putExtras(bundle);
            }
            if (this.f7362o00oOo0o != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(o00oOo0O.f7349o00ooo0O, this.f7362o00oOo0o);
                this.f7358o00oOOo0.putExtras(bundle2);
            }
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7342o00ooOOo, this.f7363o00oOoO);
            return new o00oOo0O(this.f7358o00oOOo0, this.f7366o00oOooO);
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oOooo(boolean z) {
            o0O0o(z ? 1 : 2);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo(boolean z) {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7326o00oo0, z ? 1 : 0);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0(boolean z) {
            this.f7365o00oOoOO = z;
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo00O(@oo0oO0 Context context, @o0O00000 int i, @o0O00000 int i2) {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7338o00ooO0O, oO000OOo.o00oOooO(context, i, i2).o00oOooo());
            return this;
        }

        @oo0oO0
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o00oOOo0 o00oo0O(@oo0oO0 o00oo0.o00oOOoO o00ooooo2) {
            o00oo0oO(null, o00ooooo2.o00oOOoO());
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oo0O0(@o0O00O int i) {
            this.f7359o00oOOoO.o00oOo00(i);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oo0OO(@o0O00O int i) {
            this.f7359o00oOOoO.o00oOOoO(i);
            return this;
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00oo0Oo(@o0O00O int i) {
            this.f7359o00oOOoO.o00oOooO(i);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0o(@oo0oO0 o00oo0 o00oo0Var) {
            this.f7358o00oOOo0.setPackage(o00oo0Var.f7374o00oOooO.getPackageName());
            o00oo0oO(o00oo0Var.o00oOooO(), o00oo0Var.f7373o00oOo0O);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oo0o0(@oo0oO0 RemoteViews remoteViews, @o0OO00OO int[] iArr, @o0OO00OO PendingIntent pendingIntent) {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7343o00ooOo, remoteViews);
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7345o00ooOoO, iArr);
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7346o00ooOoo, pendingIntent);
            return this;
        }

        public final void o00oo0oO(@o0OO00OO IBinder iBinder, @o0OO00OO PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            oO00O0o0.o00oOOo0.o00oOOoO(bundle, o00oOo0O.f7323o00oOooO, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(o00oOo0O.f7316o00oOo0O, pendingIntent);
            }
            this.f7358o00oOOo0.putExtras(bundle);
        }

        @oo0oO0
        @Deprecated
        public o00oOOo0 o00ooO0(@o0O00O int i) {
            this.f7359o00oOOoO.o00oOo0O(i);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00ooO00(@oo0oO0 Context context, @o0O00000 int i, @o0O00000 int i2) {
            this.f7366o00oOooO = oO000OOo.o00oOooO(context, i, i2).o00oOooo();
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00ooO0O(boolean z) {
            this.f7358o00oOOo0.putExtra(o00oOo0O.f7324o00oOooo, z);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o0O0o(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f7363o00oOoO = i;
            if (i == 1) {
                this.f7358o00oOOo0.putExtra(o00oOo0O.f7344o00ooOo0, true);
            } else if (i == 2) {
                this.f7358o00oOOo0.putExtra(o00oOo0O.f7344o00ooOo0, false);
            } else {
                this.f7358o00oOOo0.removeExtra(o00oOo0O.f7344o00ooOo0);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    public o00oOo0O(@oo0oO0 Intent intent, @o0OO00OO Bundle bundle) {
        this.f7356o00oOOo0 = intent;
        this.f7357o00oOOoO = bundle;
    }

    @oo0oO0
    public static o00oo0O.o00oOOo0 o00oOOo0(@oo0oO0 Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Invalid colorScheme: ", i));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return o00oo0O.o00oOOo0.o00oOOo0(null);
        }
        o00oo0O.o00oOOo0 o00oOOo02 = o00oo0O.o00oOOo0.o00oOOo0(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(f7349o00ooo0O);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) ? o00oOOo02 : o00oo0O.o00oOOo0.o00oOOo0(bundle).o00oOo00(o00oOOo02);
    }

    public static int o00oOOoO() {
        return 5;
    }

    public static boolean o00oOo0O(@oo0oO0 Intent intent) {
        return intent.getBooleanExtra(f7315o00oOo00, false) && (intent.getFlags() & 268435456) != 0;
    }

    @oo0oO0
    public static Intent o00oOooO(@o0OO00OO Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f7315o00oOo00, true);
        return intent;
    }

    public void o00oOo00(@oo0oO0 Context context, @oo0oO0 Uri uri) {
        this.f7356o00oOOo0.setData(uri);
        o0.startActivity(context, this.f7356o00oOOo0, this.f7357o00oOOoO);
    }
}
