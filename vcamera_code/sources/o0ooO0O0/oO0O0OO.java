package o0ooO0O0;

import android.graphics.Point;
import android.graphics.PointF;
/* loaded from: classes3.dex */
public class oO0O0OO {
    public static double o00oOOo0(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    public static int o00oOOoO(float f, float f2, float f3, float f4) {
        return (int) Math.sqrt(Math.pow(f2 - f4, 2.0d) + Math.pow(f - f3, 2.0d));
    }

    public static int o00oOo00(PointF pointF, PointF pointF2) {
        return (int) Math.sqrt(Math.pow(pointF.y - pointF2.y, 2.0d) + Math.pow(pointF.x - pointF2.x, 2.0d));
    }

    public static float o00oOo0O(Point point, Point point2) {
        float f = point2.x - point.x;
        float f2 = point2.y - point.y;
        return ((float) Math.acos(f / ((float) Math.sqrt((f2 * f2) + (f * f))))) * (point2.y < point.y ? -1 : 1);
    }

    public static double o00oOo0o(double d) {
        return (d / 3.141592653589793d) * 180.0d;
    }

    public static Point o00oOooO(Point point, Point point2, int i) {
        double d = i;
        double o00oOo0O2 = o00oOo0O(point, point2);
        return new Point(point.x + ((int) (Math.cos(o00oOo0O2) * d)), point.y + ((int) (Math.sin(o00oOo0O2) * d)));
    }
}
