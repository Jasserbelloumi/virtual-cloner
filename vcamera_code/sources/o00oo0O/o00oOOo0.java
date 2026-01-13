package o00oo0O;

import android.os.Bundle;
import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {
    @o0O00O
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Integer f7276o00oOOo0;
    @o0O00O
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Integer f7277o00oOOoO;
    @o0O00O
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Integer f7278o00oOo00;
    @o0O00O
    @o0OO00OO

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Integer f7279o00oOooO;

    /* renamed from: o00oo0O.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105o00oOOo0 {
        @o0O00O
        @o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Integer f7280o00oOOo0;
        @o0O00O
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Integer f7281o00oOOoO;
        @o0O00O
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Integer f7282o00oOo00;
        @o0O00O
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Integer f7283o00oOooO;

        @oo0oO0
        public o00oOOo0 o00oOOo0() {
            return new o00oOOo0(this.f7280o00oOOo0, this.f7281o00oOOoO, this.f7282o00oOo00, this.f7283o00oOooO);
        }

        @oo0oO0
        public C0105o00oOOo0 o00oOOoO(@o0O00O int i) {
            this.f7282o00oOo00 = Integer.valueOf(i | (-16777216));
            return this;
        }

        @oo0oO0
        public C0105o00oOOo0 o00oOo00(@o0O00O int i) {
            this.f7283o00oOooO = Integer.valueOf(i);
            return this;
        }

        @oo0oO0
        public C0105o00oOOo0 o00oOo0O(@o0O00O int i) {
            this.f7280o00oOOo0 = Integer.valueOf(i | (-16777216));
            return this;
        }

        @oo0oO0
        public C0105o00oOOo0 o00oOooO(@o0O00O int i) {
            this.f7281o00oOOoO = Integer.valueOf(i);
            return this;
        }
    }

    public o00oOOo0(@o0O00O @o0OO00OO Integer num, @o0O00O @o0OO00OO Integer num2, @o0O00O @o0OO00OO Integer num3, @o0O00O @o0OO00OO Integer num4) {
        this.f7276o00oOOo0 = num;
        this.f7277o00oOOoO = num2;
        this.f7278o00oOo00 = num3;
        this.f7279o00oOooO = num4;
    }

    @oo0oO0
    public static o00oOOo0 o00oOOo0(@o0OO00OO Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new o00oOOo0((Integer) bundle.get(o00oOo0O.f7322o00oOoo0), (Integer) bundle.get(o00oOo0O.f7333o00oo0o0), (Integer) bundle.get(o00oOo0O.f7350o00ooo0o), (Integer) bundle.get(o00oOo0O.f7351o00oooO));
    }

    @oo0oO0
    public Bundle o00oOOoO() {
        Bundle bundle = new Bundle();
        Integer num = this.f7276o00oOOo0;
        if (num != null) {
            bundle.putInt(o00oOo0O.f7322o00oOoo0, num.intValue());
        }
        Integer num2 = this.f7277o00oOOoO;
        if (num2 != null) {
            bundle.putInt(o00oOo0O.f7333o00oo0o0, num2.intValue());
        }
        Integer num3 = this.f7278o00oOo00;
        if (num3 != null) {
            bundle.putInt(o00oOo0O.f7350o00ooo0o, num3.intValue());
        }
        Integer num4 = this.f7279o00oOooO;
        if (num4 != null) {
            bundle.putInt(o00oOo0O.f7351o00oooO, num4.intValue());
        }
        return bundle;
    }

    @oo0oO0
    public o00oOOo0 o00oOo00(@oo0oO0 o00oOOo0 o00oooo02) {
        Integer num = this.f7276o00oOOo0;
        if (num == null) {
            num = o00oooo02.f7276o00oOOo0;
        }
        Integer num2 = this.f7277o00oOOoO;
        if (num2 == null) {
            num2 = o00oooo02.f7277o00oOOoO;
        }
        Integer num3 = this.f7278o00oOo00;
        if (num3 == null) {
            num3 = o00oooo02.f7278o00oOo00;
        }
        Integer num4 = this.f7279o00oOooO;
        if (num4 == null) {
            num4 = o00oooo02.f7279o00oOooO;
        }
        return new o00oOOo0(num, num2, num3, num4);
    }
}
