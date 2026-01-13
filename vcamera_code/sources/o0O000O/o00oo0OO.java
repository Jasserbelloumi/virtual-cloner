package o0O000O;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0OO;
import o00oooOo.oOOO000;
import o00oooOo.oOOO0O0;
import o0O000O.o00oo0O0;
/* loaded from: classes.dex */
public class o00oo0OO {
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10344o00oOOo0 = "font_results";
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10345o00oOOoO = -1;
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10346o00oOo00 = -2;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements BaseColumns {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final String f10347o00oOOo0 = "file_id";

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f10348o00oOOoO = "font_ttc_index";

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f10349o00oOo00 = "font_variation_settings";

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f10350o00oOo0O = "font_italic";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f10351o00oOo0o = "result_code";

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f10352o00oOoO = 1;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f10353o00oOoO0 = 0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f10354o00oOoOO = 2;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f10355o00oOoOo = 3;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f10356o00oOooO = "font_weight";
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10357o00oOo00 = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f10358o00oOo0O = 2;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10359o00oOooO = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f10360o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOo00[] f10361o00oOOoO;

        @Deprecated
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOOoO(int i, @o0OO00OO o00oOo00[] o00ooo00Arr) {
            this.f10360o00oOOo0 = i;
            this.f10361o00oOOoO = o00ooo00Arr;
        }

        public static o00oOOoO o00oOOo0(int i, @o0OO00OO o00oOo00[] o00ooo00Arr) {
            return new o00oOOoO(i, o00ooo00Arr);
        }

        public o00oOo00[] o00oOOoO() {
            return this.f10361o00oOOoO;
        }

        public int o00oOo00() {
            return this.f10360o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Uri f10362o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f10363o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f10364o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f10365o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f10366o00oOooO;

        @Deprecated
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOo00(@oo0oO0 Uri uri, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 1, to = 1000) int i2, boolean z, int i3) {
            uri.getClass();
            this.f10362o00oOOo0 = uri;
            this.f10363o00oOOoO = i;
            this.f10364o00oOo00 = i2;
            this.f10366o00oOooO = z;
            this.f10365o00oOo0O = i3;
        }

        public static o00oOo00 o00oOOo0(@oo0oO0 Uri uri, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new o00oOo00(uri, i, i2, z, i3);
        }

        public int o00oOOoO() {
            return this.f10365o00oOo0O;
        }

        @o0O0o00O(from = 0)
        public int o00oOo00() {
            return this.f10363o00oOOoO;
        }

        @o0O0o00O(from = 1, to = 1000)
        public int o00oOo0O() {
            return this.f10364o00oOo00;
        }

        public boolean o00oOo0o() {
            return this.f10366o00oOooO;
        }

        @oo0oO0
        public Uri o00oOooO() {
            return this.f10362o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @Deprecated
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f10367o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f10368o00oOOoO = 0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10369o00oOo00 = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f10370o00oOo0O = -3;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f10371o00oOo0o = -4;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f10372o00oOoO = 2;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f10373o00oOoO0 = 1;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f10374o00oOoOO = 3;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10375o00oOooO = -2;

        @Retention(RetentionPolicy.SOURCE)
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        /* loaded from: classes.dex */
        public @interface o00oOOo0 {
        }

        public void o00oOOo0(int i) {
        }

        public void o00oOOoO(Typeface typeface) {
        }
    }

    @o0OO00OO
    public static Typeface o00oOOo0(@oo0oO0 Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oOo00[] o00ooo00Arr) {
        return oOOO000.o00oOooO(context, cancellationSignal, o00ooo00Arr, 0);
    }

    @oo0oO0
    public static o00oOOoO o00oOOoO(@oo0oO0 Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo00O o00oo00o) throws PackageManager.NameNotFoundException {
        return o00oOoO.o00oOo0O(context, o00oo00o, cancellationSignal);
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOo00(Context context, o00oo00O o00oo00o, @o0OO00OO o0O0OO.o00oo0 o00oo0Var, @o0OO00OO Handler handler, boolean z, int i, int i2) {
        return o00oOo0o(context, o00oo00o, i2, z, i, o0O0OO.o00oo0.getHandler(handler), new oOOO000.o00oOOo0(o00oo0Var));
    }

    @o0OOooO0(19)
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Map<Uri, ByteBuffer> o00oOo0O(Context context, o00oOo00[] o00ooo00Arr, CancellationSignal cancellationSignal) {
        return oOOO0O0.o00oOoO(context, o00ooo00Arr, cancellationSignal);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static Typeface o00oOo0o(@oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, int i, boolean z, @o0O0o00O(from = 0) int i2, @oo0oO0 Handler handler, @oo0oO0 o00oOo0O o00ooo0o2) {
        o0O000O.o00oOOo0 o00oooo02 = new o0O000O.o00oOOo0(o00ooo0o2, handler);
        return z ? o00oo0.o00oOo0O(context, o00oo00o, o00oooo02, i, i2) : o00oo0.o00oOooO(context, o00oo00o, i, null, o00oooo02);
    }

    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOoO() {
        o00oo0.o00oOo0o();
    }

    public static void o00oOoO0(@oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, @oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 Handler handler) {
        o0O000O.o00oOOo0 o00oooo02 = new o0O000O.o00oOOo0(o00ooo0o2);
        o00oo0.o00oOooO(context.getApplicationContext(), o00oo00o, 0, new o00oo0O0.o00oOOoO(handler), o00oooo02);
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static void o00oOoOO() {
        o00oo0.o00oOo0o();
    }

    @o0OO00OO
    @o0o0000
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo o00oOooO(@oo0oO0 PackageManager packageManager, @oo0oO0 o00oo00O o00oo00o, @o0OO00OO Resources resources) throws PackageManager.NameNotFoundException {
        return o00oOoO.o00oOo0o(packageManager, o00oo00o, resources);
    }
}
