package org.osmdroid.util;

import android.graphics.Point;
import android.graphics.Rect;
/* loaded from: classes3.dex */
public class GeometryMath {
    @Deprecated
    public static final double DEG2RAD = 0.017453292519943295d;
    @Deprecated
    public static final double RAD2DEG = 57.29577951308232d;

    private static double Max4(double d, double d2, double d3, double d4) {
        return Math.ceil(Math.max(Math.max(d, d2), Math.max(d3, d4)));
    }

    private static double Min4(double d, double d2, double d3, double d4) {
        return Math.floor(Math.min(Math.min(d, d2), Math.min(d3, d4)));
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, float f, Rect rect2) {
        return getBoundingBoxForRotatatedRectangle(rect, rect.centerX(), rect.centerY(), f, rect2);
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, int i, int i2, float f, Rect rect2) {
        float f2;
        Rect rect3;
        if (rect2 == null) {
            rect3 = new Rect();
            f2 = f;
        } else {
            f2 = f;
            rect3 = rect2;
        }
        double d = f2 * 0.017453292519943295d;
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        int i3 = rect.left;
        double d2 = i3 - i;
        int i4 = rect.top;
        double d3 = i4 - i2;
        double d4 = i;
        double d5 = (d3 * sin) + (d4 - (d2 * cos));
        double d6 = i2;
        double d7 = (d6 - (d2 * sin)) - (d3 * cos);
        int i5 = rect.right;
        double d8 = i5 - i;
        double d9 = i4 - i2;
        double d10 = (d9 * sin) + (d4 - (d8 * cos));
        double d11 = (d6 - (d8 * sin)) - (d9 * cos);
        double d12 = i3 - i;
        int i6 = rect.bottom;
        double d13 = i6 - i2;
        double d14 = (d13 * sin) + (d4 - (d12 * cos));
        double d15 = (d6 - (d12 * sin)) - (d13 * cos);
        double d16 = i5 - i;
        double d17 = i6 - i2;
        double d18 = (d17 * sin) + (d4 - (d16 * cos));
        double d19 = (d6 - (d16 * sin)) - (d17 * cos);
        rect3.left = MyMath.floorToInt(Min4(d5, d10, d14, d18));
        rect3.top = MyMath.floorToInt(Min4(d7, d11, d15, d19));
        rect3.right = MyMath.floorToInt(Max4(d5, d10, d14, d18));
        rect3.bottom = MyMath.floorToInt(Max4(d7, d11, d15, d19));
        return rect3;
    }

    public static final Rect getBoundingBoxForRotatatedRectangle(Rect rect, Point point, float f, Rect rect2) {
        return getBoundingBoxForRotatatedRectangle(rect, point.x, point.y, f, rect2);
    }
}
