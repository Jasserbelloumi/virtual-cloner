package o00oooOo;

import android.graphics.Path;
import android.support.v4.media.o00oOoO;
import java.util.ArrayList;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public class oOO0O0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9802o00oOOo0 = "PathParser";

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f9803o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f9804o00oOOoO;
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public char f9805o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float[] f9806o00oOOoO;

        public o00oOOoO(char c, float[] fArr) {
            this.f9805o00oOOo0 = c;
            this.f9806o00oOOoO = fArr;
        }

        public o00oOOoO(o00oOOoO o00ooooo2) {
            this.f9805o00oOOo0 = o00ooooo2.f9805o00oOOo0;
            float[] fArr = o00ooooo2.f9806o00oOOoO;
            this.f9806o00oOOoO = oOO0O0O0.o00oOo00(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void o00oOOo0(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            char c4 = 0;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c5 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f15 = fArr2[i7];
                        float f19 = fArr2[i8];
                        float f20 = fArr2[i5];
                        float f21 = fArr2[i6];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i3 = i4;
                        int i9 = i3 + 0;
                        path.lineTo(fArr2[i9], f16);
                        f15 = fArr2[i9];
                    } else if (c3 == 'Q') {
                        i3 = i4;
                        int i10 = i3 + 0;
                        int i11 = i3 + 1;
                        int i12 = i3 + 2;
                        int i13 = i3 + 3;
                        path.quadTo(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        float f22 = fArr2[i10];
                        float f23 = fArr2[i11];
                        f15 = fArr2[i12];
                        f16 = fArr2[i13];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i3 = i4;
                        int i14 = i3 + 0;
                        path.lineTo(f15, fArr2[i14]);
                        f16 = fArr2[i14];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                int i15 = i4 + 0;
                                path.rLineTo(fArr2[i15], 0.0f);
                                f15 += fArr2[i15];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i16 = i4 + 0;
                                    path.rLineTo(0.0f, fArr2[i16]);
                                    f4 = fArr2[i16];
                                } else if (c3 == 'L') {
                                    int i17 = i4 + 0;
                                    int i18 = i4 + 1;
                                    path.lineTo(fArr2[i17], fArr2[i18]);
                                    f15 = fArr2[i17];
                                    f16 = fArr2[i18];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i4 + 0];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    int i19 = i4 + 0;
                                    int i20 = i4 + 1;
                                    int i21 = i4 + 2;
                                    int i22 = i4 + 3;
                                    path.cubicTo(f15, f24, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f = fArr2[i19];
                                    f2 = fArr2[i20];
                                    f15 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i23 = i4 + 0;
                                    int i24 = i4 + 1;
                                    path.quadTo(f15, f16, fArr2[i23], fArr2[i24]);
                                    float f25 = fArr2[i23];
                                    float f26 = fArr2[i24];
                                    i3 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = f25;
                                    f16 = f26;
                                } else if (c3 == 'l') {
                                    int i25 = i4 + 0;
                                    int i26 = i4 + 1;
                                    path.rLineTo(fArr2[i25], fArr2[i26]);
                                    f15 += fArr2[i25];
                                    f4 = fArr2[i26];
                                } else if (c3 == 'm') {
                                    float f27 = fArr2[i4 + 0];
                                    f15 += f27;
                                    float f28 = fArr2[i4 + 1];
                                    f16 += f28;
                                    if (i4 > 0) {
                                        path.rLineTo(f27, f28);
                                    } else {
                                        path.rMoveTo(f27, f28);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f29 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f29;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i27 = i4 + 0;
                                    int i28 = i4 + 1;
                                    int i29 = i4 + 2;
                                    int i30 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f = fArr2[i27] + f15;
                                    f2 = fArr2[i28] + f16;
                                    f15 += fArr2[i29];
                                    f3 = fArr2[i30];
                                } else if (c3 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i31 = i4 + 0;
                                    int i32 = i4 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i31], fArr2[i32]);
                                    float f30 = f7 + f15;
                                    float f31 = f8 + f16;
                                    f15 += fArr2[i31];
                                    f16 += fArr2[i32];
                                    f12 = f31;
                                    f11 = f30;
                                }
                                f16 += f4;
                            } else {
                                int i33 = i4 + 0;
                                int i34 = i4 + 1;
                                int i35 = i4 + 2;
                                int i36 = i4 + 3;
                                path.rQuadTo(fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                f = fArr2[i33] + f15;
                                f2 = fArr2[i34] + f16;
                                f15 += fArr2[i35];
                                f3 = fArr2[i36];
                            }
                            i3 = i4;
                        } else {
                            int i37 = i4 + 2;
                            int i38 = i4 + 3;
                            int i39 = i4 + 4;
                            int i40 = i4 + 5;
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                            f = fArr2[i37] + f15;
                            f2 = fArr2[i38] + f16;
                            f15 += fArr2[i39];
                            f3 = fArr2[i40];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i3 = i4;
                    } else {
                        int i41 = i4 + 5;
                        int i42 = i4 + 6;
                        i3 = i4;
                        o00oOo00(path, f15, f16, fArr2[i41] + f15, fArr2[i42] + f16, fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f15 += fArr2[i41];
                        f16 += fArr2[i42];
                    }
                    i4 = i3 + i2;
                    c5 = c2;
                    c3 = c5;
                    c4 = 0;
                } else {
                    i3 = i4;
                    int i43 = i3 + 5;
                    int i44 = i3 + 6;
                    o00oOo00(path, f15, f16, fArr2[i43], fArr2[i44], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f15 = fArr2[i43];
                    f16 = fArr2[i44];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c5 = c2;
                c3 = c5;
                c4 = 0;
            }
            fArr[c4] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        public static void o00oOOoO(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (cos2 * d16) + (sin2 * d15);
            double d18 = d9 / ceil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (((d10 * cos) * cos3) + d) - (d13 * sin3);
                double d26 = (d16 * sin3) + (d10 * sin * cos3) + d2;
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (cos3 * d16) + (sin3 * d15);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d29)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d20 * sqrt) + d21), (float) ((d19 * sqrt) + d22), (float) (d25 - (sqrt * d27)), (float) (d26 - (sqrt * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                sin = sin;
                d21 = d25;
                d15 = d15;
                cos = cos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                ceil = ceil;
                d22 = d26;
                d10 = d3;
            }
        }

        public static void o00oOo00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f5;
            double d7 = ((d5 * sin) + d4) / d6;
            double d8 = f6;
            double d9 = ((d5 * cos) + ((-f) * sin)) / d8;
            double d10 = f4;
            double d11 = ((d10 * sin) + (f3 * cos)) / d6;
            double d12 = ((d10 * cos) + ((-f3) * sin)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d14 * d14) + (d13 * d13);
            if (d17 == 0.0d) {
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                o00oOo00(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d = d15 - d20;
                d2 = d16 + d19;
            } else {
                d = d15 + d20;
                d2 = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d2, d7 - d);
            double atan22 = Math.atan2(d12 - d2, d11 - d) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d21 = d * d6;
            double d22 = d2 * d8;
            o00oOOoO(path, (d21 * cos) - (d22 * sin), (d22 * cos) + (d21 * sin), d6, d8, d3, d5, radians, atan2, atan22);
        }

        public static void o00oOo0O(o00oOOoO[] o00oooooArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < o00oooooArr.length; i++) {
                o00oOOoO o00ooooo2 = o00oooooArr[i];
                o00oOOo0(path, fArr, c, o00ooooo2.f9805o00oOOo0, o00ooooo2.f9806o00oOOoO);
                c = o00oooooArr[i].f9805o00oOOo0;
            }
        }

        public void o00oOooO(o00oOOoO o00ooooo2, o00oOOoO o00ooooo3, float f) {
            this.f9805o00oOOo0 = o00ooooo2.f9805o00oOOo0;
            int i = 0;
            while (true) {
                float[] fArr = o00ooooo2.f9806o00oOOoO;
                if (i >= fArr.length) {
                    return;
                }
                this.f9806o00oOOoO[i] = (o00ooooo3.f9806o00oOOoO[i] * f) + ((1.0f - f) * fArr[i]);
                i++;
            }
        }
    }

    public static void o00oOOo0(ArrayList<o00oOOoO> arrayList, char c, float[] fArr) {
        arrayList.add(new o00oOOoO(c, fArr));
    }

    public static boolean o00oOOoO(@o0OO00OO o00oOOoO[] o00oooooArr, @o0OO00OO o00oOOoO[] o00oooooArr2) {
        if (o00oooooArr == null || o00oooooArr2 == null || o00oooooArr.length != o00oooooArr2.length) {
            return false;
        }
        for (int i = 0; i < o00oooooArr.length; i++) {
            o00oOOoO o00ooooo2 = o00oooooArr[i];
            char c = o00ooooo2.f9805o00oOOo0;
            o00oOOoO o00ooooo3 = o00oooooArr2[i];
            if (c != o00ooooo3.f9805o00oOOo0 || o00ooooo2.f9806o00oOOoO.length != o00ooooo3.f9806o00oOOoO.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] o00oOo00(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static Path o00oOo0O(String str) {
        Path path = new Path();
        o00oOOoO[] o00oOooO2 = o00oOooO(str);
        if (o00oOooO2 != null) {
            try {
                o00oOOoO.o00oOo0O(o00oOooO2, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException(o00oo.o00oOOo0("Error in parsing ", str), e);
            }
        }
        return null;
    }

    public static o00oOOoO[] o00oOo0o(o00oOOoO[] o00oooooArr) {
        if (o00oooooArr == null) {
            return null;
        }
        o00oOOoO[] o00oooooArr2 = new o00oOOoO[o00oooooArr.length];
        for (int i = 0; i < o00oooooArr.length; i++) {
            o00oooooArr2[i] = new o00oOOoO(o00oooooArr[i]);
        }
        return o00oooooArr2;
    }

    public static float[] o00oOoO(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            o00oOOo0 o00oooo02 = new o00oOOo0();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                o00oOoO0(str, i, o00oooo02);
                int i3 = o00oooo02.f9803o00oOOo0;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = o00oooo02.f9804o00oOOoO ? i3 : i3 + 1;
            }
            return o00oOo00(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException(o00oOoO.o00oOOo0("error in parsing \"", str, "\""), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r2 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o00oOoO0(java.lang.String r8, int r9, o00oooOo.oOO0O0O0.o00oOOo0 r10) {
        /*
            r0 = 0
            r10.f9804o00oOOoO = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L35
        L27:
            r10.f9804o00oOOoO = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = r0
            goto L35
        L31:
            r2 = r7
            goto L35
        L33:
            r2 = r0
            r4 = r7
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f9803o00oOOo0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oooOo.oOO0O0O0.o00oOoO0(java.lang.String, int, o00oooOo.oOO0O0O0$o00oOOo0):void");
    }

    public static boolean o00oOoOO(o00oOOoO[] o00oooooArr, o00oOOoO[] o00oooooArr2, o00oOOoO[] o00oooooArr3, float f) {
        if (o00oooooArr == null || o00oooooArr2 == null || o00oooooArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (o00oooooArr.length == o00oooooArr2.length && o00oooooArr2.length == o00oooooArr3.length) {
            if (o00oOOoO(o00oooooArr2, o00oooooArr3)) {
                for (int i = 0; i < o00oooooArr.length; i++) {
                    o00oooooArr[i].o00oOooO(o00oooooArr2[i], o00oooooArr3[i], f);
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }

    public static int o00oOoOo(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if ((charAt - 'Z') * (charAt - 'A') > 0) {
                if ((charAt - 'z') * (charAt - 'a') > 0) {
                    continue;
                    i++;
                }
            }
            if (charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void o00oOoo0(o00oOOoO[] o00oooooArr, o00oOOoO[] o00oooooArr2) {
        for (int i = 0; i < o00oooooArr2.length; i++) {
            o00oooooArr[i].f9805o00oOOo0 = o00oooooArr2[i].f9805o00oOOo0;
            int i2 = 0;
            while (true) {
                float[] fArr = o00oooooArr2[i].f9806o00oOOoO;
                if (i2 < fArr.length) {
                    o00oooooArr[i].f9806o00oOOoO[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public static o00oOOoO[] o00oOooO(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int o00oOoOo2 = o00oOoOo(str, i);
            String trim = str.substring(i2, o00oOoOo2).trim();
            if (trim.length() > 0) {
                o00oOOo0(arrayList, trim.charAt(0), o00oOoO(trim));
            }
            i2 = o00oOoOo2;
            i = o00oOoOo2 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            o00oOOo0(arrayList, str.charAt(i2), new float[0]);
        }
        return (o00oOOoO[]) arrayList.toArray(new o00oOOoO[arrayList.size()]);
    }
}
