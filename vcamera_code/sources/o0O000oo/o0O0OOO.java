package o0O000oo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public final class o0O0OOO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10599o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10600o00oOo00 = 1000;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10601o00oOo0O = 1002;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f10602o00oOo0o = 1003;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f10603o00oOoO = 1006;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f10604o00oOoO0 = 1004;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f10605o00oOoOO = 1007;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f10606o00oOoOo = 1008;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f10607o00oOoo0 = 1009;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10608o00oOooO = 1001;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f10609o00oOooo = 1010;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f10610o00oo = 1021;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f10611o00oo0 = 1012;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f10612o00oo00O = 1011;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f10613o00oo0O = 1015;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f10614o00oo0O0 = 1014;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f10615o00oo0OO = 1013;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f10616o00oo0Oo = 1016;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f10617o00oo0o = 1018;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f10618o00oo0o0 = 1017;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f10619o00oo0oO = 1019;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f10620o00ooO00 = 1000;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f10621o0O0o = 1020;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final PointerIcon f10622o00oOOo0;

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static PointerIcon o00oOOo0(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @o00oOooO.o0O0O0Oo
        public static PointerIcon o00oOOoO(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @o00oOooO.o0O0O0Oo
        public static PointerIcon o00oOo00(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public o0O0OOO(PointerIcon pointerIcon) {
        this.f10622o00oOOo0 = pointerIcon;
    }

    @o00oOooO.oo0oO0
    public static o0O0OOO o00oOOo0(@o00oOooO.oo0oO0 Bitmap bitmap, float f, float f2) {
        return new o0O0OOO(o00oOOo0.o00oOOo0(bitmap, f, f2));
    }

    @o00oOooO.oo0oO0
    public static o0O0OOO o00oOo00(@o00oOooO.oo0oO0 Context context, int i) {
        return new o0O0OOO(o00oOOo0.o00oOOoO(context, i));
    }

    @o00oOooO.oo0oO0
    public static o0O0OOO o00oOooO(@o00oOooO.oo0oO0 Resources resources, int i) {
        return new o0O0OOO(o00oOOo0.o00oOo00(resources, i));
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public Object o00oOOoO() {
        return this.f10622o00oOOo0;
    }
}
