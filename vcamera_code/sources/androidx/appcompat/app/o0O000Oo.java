package androidx.appcompat.app;
/* loaded from: classes.dex */
public class o0O000Oo {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f493o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f494o00oOo0o = 1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final float f495o00oOoO = 9.0E-4f;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final float f496o00oOoO0 = 0.017453292f;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final float f497o00oOoOO = -0.10471976f;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final float f498o00oOoOo = 0.0334196f;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final float f499o00oOoo0 = 3.49066E-4f;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static o0O000Oo f500o00oOooO = null;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final float f501o00oOooo = 5.236E-6f;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final long f502o00oo0 = 946728000000L;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final float f503o00oo00O = 0.4092797f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public long f504o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public long f505o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f506o00oOo00;

    public static o0O000Oo o00oOOoO() {
        if (f500o00oOooO == null) {
            f500o00oOooO = new o0O000Oo();
        }
        return f500o00oOooO;
    }

    public void o00oOOo0(long j, double d, double d2) {
        float f;
        float f2;
        double d3;
        double d4 = (0.01720197f * (((float) (j - f502o00oo0)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + ((float) Math.round((f - 9.0E-4f) - d3)) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d5 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin3 >= 1.0d) {
            this.f506o00oOo00 = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f504o00oOOo0 = Math.round((sin2 + acos) * 8.64E7d) + f502o00oo0;
            long round = Math.round((sin2 - acos) * 8.64E7d) + f502o00oo0;
            this.f505o00oOOoO = round;
            if (round >= j || this.f504o00oOOo0 <= j) {
                this.f506o00oOo00 = 1;
                return;
            } else {
                this.f506o00oOo00 = 0;
                return;
            }
        } else {
            this.f506o00oOo00 = 0;
        }
        this.f504o00oOOo0 = -1L;
        this.f505o00oOOoO = -1L;
    }
}
