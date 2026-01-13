package o00oo;

import java.util.Arrays;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f7191o00oOo00 = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7192o00oOo0O = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7193o00oOo0o = "cubic(1, 1, 0, 0)";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7199o00oOooO = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public String f7200o00oOOo0 = "identity";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static o00oOo00 f7190o00oOOoO = new o00oOo00();

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f7196o00oOoOO = "standard";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f7194o00oOoO = "accelerate";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f7195o00oOoO0 = "decelerate";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f7197o00oOoOo = "linear";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static String[] f7198o00oOoo0 = {f7196o00oOoOO, f7194o00oOoO, f7195o00oOoO0, f7197o00oOoOo};

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOo00 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static double f7201o00oo0O = 1.0E-4d;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static double f7202o00oo0O0 = 0.01d;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public double f7203o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public double f7204o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public double f7205o00oo00O;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public double f7206o00oo0OO;

        public o00oOOo0(double d, double d2, double d3, double d4) {
            o00oOoO(d, d2, d3, d4);
        }

        public o00oOOo0(String str) {
            this.f7200o00oOOo0 = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f7203o00oOooo = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f7205o00oo00O = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f7204o00oo0 = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f7206o00oo0OO = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // o00oo.o00oOo00
        public double o00oOOo0(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f7202o00oo0O0) {
                d2 *= 0.5d;
                d3 = o00oOo0o(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double o00oOo0o2 = o00oOo0o(d4);
            double d5 = d3 + d2;
            double o00oOo0o3 = o00oOo0o(d5);
            double o00oOoO02 = o00oOoO0(d4);
            return (((d - o00oOo0o2) * (o00oOoO0(d5) - o00oOoO02)) / (o00oOo0o3 - o00oOo0o2)) + o00oOoO02;
        }

        @Override // o00oo.o00oOo00
        public double o00oOOoO(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f7201o00oo0O) {
                d2 *= 0.5d;
                d3 = o00oOo0o(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (o00oOoO0(d5) - o00oOoO0(d4)) / (o00oOo0o(d5) - o00oOo0o(d4));
        }

        public final double o00oOo0O(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f7205o00oo00O;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.f7206o00oo0OO;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }

        public final double o00oOo0o(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f7204o00oo0 * d5) + (this.f7203o00oOooo * d4) + (d * d * d);
        }

        public void o00oOoO(double d, double d2, double d3, double d4) {
            this.f7203o00oOooo = d;
            this.f7205o00oo00O = d2;
            this.f7204o00oo0 = d3;
            this.f7206o00oo0OO = d4;
        }

        public final double o00oOoO0(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f7206o00oo0OO * d5) + (this.f7205o00oo00O * d4) + (d * d * d);
        }

        public final double o00oOooO(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f7203o00oOooo;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.f7204o00oo0;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }
    }

    public static o00oOo00 o00oOo00(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new o00oOOo0(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f7194o00oOoO)) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f7195o00oOoO0)) {
                    c = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f7197o00oOoOo)) {
                    c = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f7196o00oOoOO)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new o00oOOo0(f7199o00oOooO);
            case 1:
                return new o00oOOo0(f7192o00oOo0O);
            case 2:
                return new o00oOOo0(f7193o00oOo0o);
            case 3:
                return new o00oOOo0(f7191o00oOo00);
            default:
                Arrays.toString(f7198o00oOoo0);
                return f7190o00oOOoO;
        }
    }

    public double o00oOOo0(double d) {
        return d;
    }

    public double o00oOOoO(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f7200o00oOOo0;
    }
}
