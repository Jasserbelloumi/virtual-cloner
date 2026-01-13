package o00oo0o0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0 {
    @SuppressLint({"IntentName"})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7533o00oOo0O = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7534o00oOo0o = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f7535o00oOoO = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f7536o00oOoO0 = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f7537o00oOoOO = "GET";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f7538o00oOoOo = "POST";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f7539o00oOoo0 = "application/x-www-form-urlencoded";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f7540o00oOooo = "multipart/form-data";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f7541o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f7542o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f7543o00oOo00;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oOo00 f7544o00oOooO;

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f7545o00oOo00 = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f7546o00oOooO = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f7547o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final List<String> f7548o00oOOoO;

        public o00oOOoO(@oo0oO0 String str, @oo0oO0 List<String> list) {
            this.f7547o00oOOo0 = str;
            this.f7548o00oOOoO = Collections.unmodifiableList(list);
        }

        @o0OO00OO
        public static o00oOOoO o00oOOo0(@o0OO00OO Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f7545o00oOo00);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f7546o00oOooO);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new o00oOOoO(string, stringArrayList);
        }

        @oo0oO0
        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putString(f7545o00oOo00, this.f7547o00oOOo0);
            bundle.putStringArrayList(f7546o00oOooO, new ArrayList<>(this.f7548o00oOOoO));
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f7549o00oOo0O = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f7550o00oOo0o = "androidx.browser.trusted.sharing.KEY_FILES";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f7551o00oOooO = "androidx.browser.trusted.sharing.KEY_TITLE";
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f7552o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f7553o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final List<o00oOOoO> f7554o00oOo00;

        public o00oOo00(@o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO List<o00oOOoO> list) {
            this.f7552o00oOOo0 = str;
            this.f7553o00oOOoO = str2;
            this.f7554o00oOo00 = list;
        }

        @o0OO00OO
        public static o00oOo00 o00oOOo0(@o0OO00OO Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f7550o00oOo0o);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle bundle2 : parcelableArrayList) {
                    arrayList.add(o00oOOoO.o00oOOo0(bundle2));
                }
            }
            return new o00oOo00(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @oo0oO0
        public Bundle o00oOOoO() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f7552o00oOOo0);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f7553o00oOOoO);
            if (this.f7554o00oOo00 != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (o00oOOoO o00ooooo2 : this.f7554o00oOo00) {
                    arrayList.add(o00ooooo2.o00oOOoO());
                }
                bundle.putParcelableArrayList(f7550o00oOo0o, arrayList);
            }
            return bundle;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOo0O {
    }

    public o00oo0(@oo0oO0 String str, @o0OO00OO String str2, @o0OO00OO String str3, @oo0oO0 o00oOo00 o00ooo002) {
        this.f7541o00oOOo0 = str;
        this.f7542o00oOOoO = str2;
        this.f7543o00oOo00 = str3;
        this.f7544o00oOooO = o00ooo002;
    }

    @o0OO00OO
    public static o00oo0 o00oOOo0(@oo0oO0 Bundle bundle) {
        String string = bundle.getString(f7533o00oOo0O);
        String string2 = bundle.getString(f7534o00oOo0o);
        String string3 = bundle.getString(f7536o00oOoO0);
        o00oOo00 o00oOOo02 = o00oOo00.o00oOOo0(bundle.getBundle(f7535o00oOoO));
        if (string == null || o00oOOo02 == null) {
            return null;
        }
        return new o00oo0(string, string2, string3, o00oOOo02);
    }

    @oo0oO0
    public Bundle o00oOOoO() {
        Bundle bundle = new Bundle();
        bundle.putString(f7533o00oOo0O, this.f7541o00oOOo0);
        bundle.putString(f7534o00oOo0o, this.f7542o00oOOoO);
        bundle.putString(f7536o00oOoO0, this.f7543o00oOo00);
        bundle.putBundle(f7535o00oOoO, this.f7544o00oOooO.o00oOOoO());
        return bundle;
    }
}
