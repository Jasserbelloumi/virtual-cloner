package org.osmdroid.util;
/* loaded from: classes3.dex */
public class SpeechBalloonHelper {
    public static final int CORNER_BOTTOM = 8;
    public static final int CORNER_INSIDE = -1;
    public static final int CORNER_LEFT = 1;
    public static final int CORNER_NONE = 0;
    public static final int CORNER_RIGHT = 2;
    public static final int CORNER_TOP = 4;
    private PointL mPoint;
    private RectL mRect;
    private final PointL mTrianglePoint = new PointL();

    private int checkIntersection(PointL pointL) {
        long j = this.mPoint.y;
        long j2 = this.mRect.top;
        if (j > j2 || !checkIntersectionY(j2, pointL)) {
            long j3 = this.mPoint.y;
            long j4 = this.mRect.bottom;
            if (j3 < j4 || !checkIntersectionY(j4, pointL)) {
                long j5 = this.mPoint.x;
                long j6 = this.mRect.left;
                if (j5 > j6 || !checkIntersectionX(j6, pointL)) {
                    long j7 = this.mPoint.x;
                    long j8 = this.mRect.right;
                    if (j7 < j8 || !checkIntersectionX(j8, pointL)) {
                        throw new IllegalArgumentException();
                    }
                    return 2;
                }
                return 1;
            }
            return 8;
        }
        return 4;
    }

    private boolean checkIntersectionX(long j, PointL pointL) {
        PointL pointL2 = this.mPoint;
        PointL pointL3 = this.mTrianglePoint;
        double d = j;
        RectL rectL = this.mRect;
        return SegmentIntersection.intersection(pointL2.x, pointL2.y, pointL3.x, pointL3.y, d, rectL.top, d, rectL.bottom, pointL);
    }

    private boolean checkIntersectionY(long j, PointL pointL) {
        PointL pointL2 = this.mPoint;
        PointL pointL3 = this.mTrianglePoint;
        RectL rectL = this.mRect;
        double d = j;
        return SegmentIntersection.intersection(pointL2.x, pointL2.y, pointL3.x, pointL3.y, rectL.left, d, rectL.right, d, pointL);
    }

    private void computeCirclePoint(PointL pointL, double d, double d2, boolean z) {
        MyMath.computeCirclePoint(this.mRect.centerX(), this.mRect.centerY(), d, ((z ? 1 : -1) * 1.5707963267948966d) + d2, pointL);
    }

    public int compute(RectL rectL, PointL pointL, double d, PointL pointL2, PointL pointL3) {
        this.mRect = rectL;
        this.mPoint = pointL;
        if (rectL.contains(pointL.x, pointL.y)) {
            return -1;
        }
        long centerX = this.mRect.centerX();
        long centerY = this.mRect.centerY();
        PointL pointL4 = this.mPoint;
        double computeAngle = MyMath.computeAngle(centerX, centerY, pointL4.x, pointL4.y);
        computeCirclePoint(this.mTrianglePoint, d, computeAngle, false);
        int checkIntersection = checkIntersection(pointL2);
        computeCirclePoint(this.mTrianglePoint, d, computeAngle, true);
        int checkIntersection2 = checkIntersection(pointL3);
        if (checkIntersection == checkIntersection2) {
            return 0;
        }
        return checkIntersection2 | checkIntersection;
    }
}
