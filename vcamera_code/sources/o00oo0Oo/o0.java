package o00oo0Oo;

import android.os.Bundle;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f7469o00oOOo0 = "androidx.browser.trusted.displaymode.KEY_ID";

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f7470o00oOOoO = 0;

        @Override // o00oo0Oo.o0
        @oo0oO0
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(o0.f7469o00oOOo0, 0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o0 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f7471o00oOo0O = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final String f7472o00oOo0o = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f7473o00oOooO = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final boolean f7474o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f7475o00oOo00;

        public o00oOOoO(boolean z, int i) {
            this.f7474o00oOOoO = z;
            this.f7475o00oOo00 = i;
        }

        @oo0oO0
        public static o0 fromBundle(@oo0oO0 Bundle bundle) {
            return new o00oOOoO(bundle.getBoolean(f7471o00oOo0O), bundle.getInt(f7472o00oOo0o));
        }

        public boolean o00oOOo0() {
            return this.f7474o00oOOoO;
        }

        public int o00oOOoO() {
            return this.f7475o00oOo00;
        }

        @Override // o00oo0Oo.o0
        @oo0oO0
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(o0.f7469o00oOOo0, 1);
            bundle.putBoolean(f7471o00oOo0O, this.f7474o00oOOoO);
            bundle.putInt(f7472o00oOo0o, this.f7475o00oOo00);
            return bundle;
        }
    }

    @oo0oO0
    static o0 fromBundle(@oo0oO0 Bundle bundle) {
        return bundle.getInt(f7469o00oOOo0) != 1 ? new o00oOOo0() : o00oOOoO.fromBundle(bundle);
    }

    @oo0oO0
    Bundle toBundle();
}
