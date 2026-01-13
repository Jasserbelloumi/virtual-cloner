package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o0OoOoOO.o0OO000o;
/* loaded from: classes.dex */
public class o0O0OO0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f4662o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f4663o00oOo0O = 4;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f4664o00oOo0o = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f4665o00oOoO = 2;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f4666o00oOoO0 = 1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f4667o00oOoOO = 4;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f4668o00oOoOo = 4;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f4669o00oOoo0 = 16;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f4670o00oOooO = 2;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f4671o00oOooo = 32;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f4672o00oo0 = 8;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f4673o00oo00O = 64;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f4674o00oo0O = 1024;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f4675o00oo0O0 = 512;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f4676o00oo0OO = 256;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f4677o00oo0Oo = 12;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f4678o00oo0o = 8192;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f4679o00oo0o0 = 4096;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f4680o00oo0oO = 16384;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f4681o0O0o = 7;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f4682o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOo0 f4683o00oOOoO = new o00oOOo0();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4684o00oOOo0 = 0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4685o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4686o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4687o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4688o00oOooO;

        public void o00oOOo0(int i) {
            this.f4684o00oOOo0 = i | this.f4684o00oOOo0;
        }

        public boolean o00oOOoO() {
            int i = this.f4684o00oOOo0;
            if ((i & 7) == 0 || (i & (o00oOo00(this.f4688o00oOooO, this.f4685o00oOOoO) << 0)) != 0) {
                int i2 = this.f4684o00oOOo0;
                if ((i2 & 112) == 0 || (i2 & (o00oOo00(this.f4688o00oOooO, this.f4686o00oOo00) << 4)) != 0) {
                    int i3 = this.f4684o00oOOo0;
                    if ((i3 & o0OO000o.o00oOOoO.f16831o00oOo0o) == 0 || (i3 & (o00oOo00(this.f4687o00oOo0O, this.f4685o00oOOoO) << 8)) != 0) {
                        int i4 = this.f4684o00oOOo0;
                        return (i4 & 28672) == 0 || (i4 & (o00oOo00(this.f4687o00oOo0O, this.f4686o00oOo00) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int o00oOo00(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void o00oOo0O(int i, int i2, int i3, int i4) {
            this.f4685o00oOOoO = i;
            this.f4686o00oOo00 = i2;
            this.f4688o00oOooO = i3;
            this.f4687o00oOo0O = i4;
        }

        public void o00oOooO() {
            this.f4684o00oOOo0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        View o00oOOo0(int i);

        int o00oOOoO(View view);

        int o00oOo00();

        int o00oOo0O(View view);

        int o00oOooO();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    public o0O0OO0(o00oOOoO o00ooooo2) {
        this.f4682o00oOOo0 = o00ooooo2;
    }

    public View o00oOOo0(int i, int i2, int i3, int i4) {
        int o00oOo002 = this.f4682o00oOOo0.o00oOo00();
        int o00oOooO2 = this.f4682o00oOOo0.o00oOooO();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View o00oOOo02 = this.f4682o00oOOo0.o00oOOo0(i);
            this.f4683o00oOOoO.o00oOo0O(o00oOo002, o00oOooO2, this.f4682o00oOOo0.o00oOOoO(o00oOOo02), this.f4682o00oOOo0.o00oOo0O(o00oOOo02));
            if (i3 != 0) {
                this.f4683o00oOOoO.o00oOooO();
                this.f4683o00oOOoO.o00oOOo0(i3);
                if (this.f4683o00oOOoO.o00oOOoO()) {
                    return o00oOOo02;
                }
            }
            if (i4 != 0) {
                this.f4683o00oOOoO.o00oOooO();
                this.f4683o00oOOoO.o00oOOo0(i4);
                if (this.f4683o00oOOoO.o00oOOoO()) {
                    view = o00oOOo02;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean o00oOOoO(View view, int i) {
        this.f4683o00oOOoO.o00oOo0O(this.f4682o00oOOo0.o00oOo00(), this.f4682o00oOOo0.o00oOooO(), this.f4682o00oOOo0.o00oOOoO(view), this.f4682o00oOOo0.o00oOo0O(view));
        if (i != 0) {
            this.f4683o00oOOoO.o00oOooO();
            this.f4683o00oOOoO.o00oOOo0(i);
            return this.f4683o00oOOoO.o00oOOoO();
        }
        return false;
    }
}
