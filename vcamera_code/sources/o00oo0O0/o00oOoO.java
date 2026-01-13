package o00oo0O0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
@Deprecated
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f7421o00oOOoO = "BrowserActions";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f7422o00oOo00 = "https://www.example.com";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7423o00oOo0O = "androidx.browser.browseractions.browser_action_open";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7424o00oOo0o = "androidx.browser.browseractions.ICON_ID";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f7425o00oOoO = "androidx.browser.browseractions.TITLE";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f7426o00oOoO0 = "androidx.browser.browseractions.ICON_URI";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f7427o00oOoOO = "androidx.browser.browseractions.ACTION";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f7428o00oOoOo = "androidx.browser.browseractions.extra.TYPE";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f7429o00oOoo0 = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7430o00oOooO = "androidx.browser.browseractions.APP_ID";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f7431o00oOooo = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f7432o00oo = 2;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f7433o00oo0 = 0;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f7434o00oo00O = 5;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f7435o00oo0O = 3;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f7436o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f7437o00oo0OO = 1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f7438o00oo0Oo = 4;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f7439o00oo0o = -1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f7440o00oo0o0 = 5;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f7441o00oo0oO = 0;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f7442o00ooO0 = 4;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f7443o00ooO00 = 3;
    @o0OO00OO

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static o00oOOo0 f7444o00ooO0O = null;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f7445o0O0o = 1;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Intent f7446o00oOOo0;

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0();
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOOoO {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Context f7448o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Uri f7449o00oOo00;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Intent f7447o00oOOo0 = new Intent(o00oOoO.f7423o00oOo0O);

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f7453o00oOooO = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ArrayList<Bundle> f7450o00oOo0O = new ArrayList<>();
        @o0OO00OO

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public PendingIntent f7451o00oOo0o = null;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public List<Uri> f7452o00oOoO0 = new ArrayList();

        public o00oOo0O(@oo0oO0 Context context, @oo0oO0 Uri uri) {
            this.f7448o00oOOoO = context;
            this.f7449o00oOo00 = uri;
        }

        @oo0oO0
        public o00oOoO o00oOOo0() {
            this.f7447o00oOOo0.setData(this.f7449o00oOo00);
            this.f7447o00oOOo0.putExtra(o00oOoO.f7428o00oOoOo, this.f7453o00oOooO);
            this.f7447o00oOOo0.putParcelableArrayListExtra(o00oOoO.f7429o00oOoo0, this.f7450o00oOo0O);
            this.f7447o00oOOo0.putExtra(o00oOoO.f7430o00oOooO, PendingIntent.getActivity(this.f7448o00oOOoO, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f7451o00oOo0o;
            if (pendingIntent != null) {
                this.f7447o00oOOo0.putExtra(o00oOoO.f7431o00oOooo, pendingIntent);
            }
            BrowserServiceFileProvider.o00oOoo0(this.f7447o00oOOo0, this.f7452o00oOoO0, this.f7448o00oOOoO);
            return new o00oOoO(this.f7447o00oOOo0);
        }

        @oo0oO0
        public final Bundle o00oOOoO(@oo0oO0 o00oo0O0.o00oOOo0 o00oooo02) {
            Bundle bundle = new Bundle();
            bundle.putString(o00oOoO.f7425o00oOoO, o00oooo02.o00oOo0O());
            bundle.putParcelable(o00oOoO.f7427o00oOoOO, o00oooo02.o00oOOo0());
            if (o00oooo02.o00oOOoO() != 0) {
                bundle.putInt(o00oOoO.f7424o00oOo0o, o00oooo02.o00oOOoO());
            }
            if (o00oooo02.o00oOo00() != null) {
                bundle.putParcelable(o00oOoO.f7426o00oOoO0, o00oooo02.o00oOo00());
            }
            return bundle;
        }

        @oo0oO0
        public o00oOo0O o00oOo00(@oo0oO0 ArrayList<o00oo0O0.o00oOOo0> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (TextUtils.isEmpty(arrayList.get(i).o00oOo0O()) || arrayList.get(i).o00oOOo0() == null) {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                    this.f7450o00oOo0O.add(o00oOOoO(arrayList.get(i)));
                    if (arrayList.get(i).o00oOo00() != null) {
                        this.f7452o00oOoO0.add(arrayList.get(i).o00oOo00());
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @oo0oO0
        public o00oOo0O o00oOo0O(@oo0oO0 PendingIntent pendingIntent) {
            this.f7451o00oOo0o = pendingIntent;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOo0o(int i) {
            this.f7453o00oOooO = i;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOooO(@oo0oO0 o00oo0O0.o00oOOo0... o00oooo0Arr) {
            return o00oOo00(new ArrayList<>(Arrays.asList(o00oooo0Arr)));
        }
    }

    public o00oOoO(@oo0oO0 Intent intent) {
        this.f7446o00oOOo0 = intent;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static List<ResolveInfo> o00oOOo0(@oo0oO0 Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f7423o00oOo0O, Uri.parse(f7422o00oOo00)), 131072);
    }

    @o0OO00OO
    @Deprecated
    public static String o00oOOoO(@oo0oO0 Intent intent) {
        return o00oOooO(intent);
    }

    public static void o00oOo0O(@oo0oO0 Context context, @oo0oO0 Intent intent) {
        o00oOo0o(context, intent, o00oOOo0(context));
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOo0o(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            o00oOoOO(context, intent);
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f7422o00oOo00)), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (str.equals(list.get(i).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        o0.startActivity(context, intent, null);
    }

    public static void o00oOoO(@oo0oO0 Context context, @oo0oO0 Uri uri, int i, @oo0oO0 ArrayList<o00oo0O0.o00oOOo0> arrayList, @oo0oO0 PendingIntent pendingIntent) {
        o00oOo0O o00ooo0o2 = new o00oOo0O(context, uri);
        o00ooo0o2.f7453o00oOooO = i;
        o00oOo0O o00oOo002 = o00ooo0o2.o00oOo00(arrayList);
        o00oOo002.f7451o00oOo0o = pendingIntent;
        o00oOo0O(context, o00oOo002.o00oOOo0().o00oOo00());
    }

    public static void o00oOoO0(@oo0oO0 Context context, @oo0oO0 Uri uri) {
        o00oOo0O(context, new o00oOo0O(context, uri).o00oOOo0().o00oOo00());
    }

    public static void o00oOoOO(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f7429o00oOoo0);
        o00oOoOo(context, data, parcelableArrayListExtra != null ? o00oOoo0(parcelableArrayListExtra) : null);
    }

    public static void o00oOoOo(Context context, Uri uri, List<o00oo0O0.o00oOOo0> list) {
        new o00oo0O0.o00oOo0O(context, uri, list).o00oOo0O();
        o00oOOo0 o00oooo02 = f7444o00ooO0O;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0();
        }
    }

    @oo0oO0
    public static List<o00oo0O0.o00oOOo0> o00oOoo0(@oo0oO0 ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = arrayList.get(i);
            String string = bundle.getString(f7425o00oOoO);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f7427o00oOoOO);
            int i2 = bundle.getInt(f7424o00oOo0o);
            Uri uri = (Uri) bundle.getParcelable(f7426o00oOoO0);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(i2 != 0 ? new o00oo0O0.o00oOOo0(string, pendingIntent, i2) : new o00oo0O0.o00oOOo0(string, pendingIntent, uri));
        }
        return arrayList2;
    }

    @o0OO00OO
    public static String o00oOooO(@oo0oO0 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f7430o00oOooO);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOooo(o00oOOo0 o00oooo02) {
        f7444o00ooO0O = o00oooo02;
    }

    @oo0oO0
    public Intent o00oOo00() {
        return this.f7446o00oOOo0;
    }
}
