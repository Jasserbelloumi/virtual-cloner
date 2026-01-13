package org.osmdroid.util;

import android.support.v4.media.o00oOo0O;
import o00ooO0.o00oOoO;
/* loaded from: classes3.dex */
public class SegmentClipper implements PointAccepter {
    private int mCurrentSegmentIndex;
    private boolean mFirstPoint;
    private IntegerAccepter mIntegerAccepter;
    private boolean mPathMode;
    private PointAccepter mPointAccepter;
    private long mXMax;
    private long mXMin;
    private long mYMax;
    private long mYMin;
    private final PointL mOptimIntersection = new PointL();
    private final PointL mOptimIntersection1 = new PointL();
    private final PointL mOptimIntersection2 = new PointL();
    private final long[] cornerX = new long[4];
    private final long[] cornerY = new long[4];
    private final PointL mPoint0 = new PointL();
    private final PointL mPoint1 = new PointL();

    private static long clip(long j, long j2, long j3) {
        return j <= j2 ? j2 : j >= j3 ? j3 : j;
    }

    private long clipX(long j) {
        return clip(j, this.mXMin, this.mXMax);
    }

    private long clipY(long j) {
        return clip(j, this.mYMin, this.mYMax);
    }

    private int getClosestCorner(long j, long j2, long j3, long j4) {
        long[] jArr;
        SegmentClipper segmentClipper = this;
        int i = 0;
        double d = Double.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i >= segmentClipper.cornerX.length) {
                return i2;
            }
            int i3 = i;
            int i4 = i2;
            double d2 = d;
            double squaredDistanceToSegment = Distance.getSquaredDistanceToSegment(jArr[i], segmentClipper.cornerY[i], j, j2, j3, j4);
            if (d2 > squaredDistanceToSegment) {
                d = squaredDistanceToSegment;
                i2 = i3;
            } else {
                i2 = i4;
                d = d2;
            }
            segmentClipper = this;
            i = i3 + 1;
        }
    }

    private boolean intersection(long j, long j2, long j3, long j4) {
        long j5 = this.mXMin;
        if (!intersection(j, j2, j3, j4, j5, this.mYMin, j5, this.mYMax)) {
            long j6 = this.mXMax;
            if (!intersection(j, j2, j3, j4, j6, this.mYMin, j6, this.mYMax)) {
                long j7 = this.mXMin;
                long j8 = this.mYMin;
                if (!intersection(j, j2, j3, j4, j7, j8, this.mXMax, j8)) {
                    long j9 = this.mXMin;
                    long j10 = this.mYMax;
                    if (!intersection(j, j2, j3, j4, j9, j10, this.mXMax, j10)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean intersection(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return SegmentIntersection.intersection(j, j2, j3, j4, j5, j6, j7, j8, this.mOptimIntersection);
    }

    private boolean isOnTheSameSideOut(long j, long j2, long j3, long j4) {
        long j5 = this.mXMin;
        if (j >= j5 || j3 >= j5) {
            long j6 = this.mXMax;
            if (j <= j6 || j3 <= j6) {
                long j7 = this.mYMin;
                if (j2 >= j7 || j4 >= j7) {
                    long j8 = this.mYMax;
                    if (j2 <= j8 || j4 <= j8) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void nextVertex(long j, long j2) {
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.add(this.mCurrentSegmentIndex);
        }
        this.mPointAccepter.add(j, j2);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j, long j2) {
        int i;
        this.mPoint1.set(j, j2);
        if (this.mFirstPoint) {
            i = 0;
            this.mFirstPoint = false;
        } else {
            PointL pointL = this.mPoint0;
            long j3 = pointL.x;
            long j4 = pointL.y;
            PointL pointL2 = this.mPoint1;
            clip(j3, j4, pointL2.x, pointL2.y);
            i = this.mCurrentSegmentIndex + 1;
        }
        this.mCurrentSegmentIndex = i;
        this.mPoint0.set(this.mPoint1);
    }

    public void clip(long j, long j2, long j3, long j4) {
        SegmentClipper segmentClipper;
        SegmentClipper segmentClipper2;
        SegmentClipper segmentClipper3;
        int i;
        if (this.mPathMode || !isOnTheSameSideOut(j, j2, j3, j4)) {
            if (isInClipArea(j, j2)) {
                if (!isInClipArea(j3, j4)) {
                    if (!intersection(j, j2, j3, j4)) {
                        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Cannot find expected mOptimIntersection for ");
                        o00oOOo02.append(new RectL(j, j2, j3, j4));
                        throw new RuntimeException(o00oOOo02.toString());
                    }
                    nextVertex(j, j2);
                    PointL pointL = this.mOptimIntersection;
                    nextVertex(pointL.x, pointL.y);
                    if (this.mPathMode) {
                        nextVertex(clipX(j3), clipY(j4));
                        return;
                    }
                    return;
                }
                nextVertex(j, j2);
            } else if (!isInClipArea(j3, j4)) {
                int i2 = 0;
                long j5 = this.mXMin;
                if (intersection(j, j2, j3, j4, j5, this.mYMin, j5, this.mYMax)) {
                    this.mOptimIntersection1.set(this.mOptimIntersection);
                    i2 = 1;
                }
                long j6 = this.mXMax;
                if (intersection(j, j2, j3, j4, j6, this.mYMin, j6, this.mYMax)) {
                    int i3 = i2 + 1;
                    segmentClipper = this;
                    (i2 == 0 ? segmentClipper.mOptimIntersection1 : segmentClipper.mOptimIntersection2).set(segmentClipper.mOptimIntersection);
                    i2 = i3;
                } else {
                    segmentClipper = this;
                }
                long j7 = segmentClipper.mXMin;
                long j8 = segmentClipper.mYMin;
                if (intersection(j, j2, j3, j4, j7, j8, segmentClipper.mXMax, j8)) {
                    int i4 = i2 + 1;
                    segmentClipper2 = this;
                    (i2 == 0 ? segmentClipper2.mOptimIntersection1 : segmentClipper2.mOptimIntersection2).set(segmentClipper2.mOptimIntersection);
                    i2 = i4;
                } else {
                    segmentClipper2 = this;
                }
                long j9 = segmentClipper2.mXMin;
                long j10 = segmentClipper2.mYMax;
                if (intersection(j, j2, j3, j4, j9, j10, segmentClipper2.mXMax, j10)) {
                    i = i2 + 1;
                    segmentClipper3 = this;
                    (i2 == 0 ? segmentClipper3.mOptimIntersection1 : segmentClipper3.mOptimIntersection2).set(segmentClipper3.mOptimIntersection);
                } else {
                    segmentClipper3 = this;
                    i = i2;
                }
                if (i == 2) {
                    PointL pointL2 = segmentClipper3.mOptimIntersection1;
                    double d = j;
                    double d2 = j2;
                    double squaredDistanceToPoint = Distance.getSquaredDistanceToPoint(pointL2.x, pointL2.y, d, d2);
                    PointL pointL3 = segmentClipper3.mOptimIntersection2;
                    int i5 = (squaredDistanceToPoint > Distance.getSquaredDistanceToPoint(pointL3.x, pointL3.y, d, d2) ? 1 : (squaredDistanceToPoint == Distance.getSquaredDistanceToPoint(pointL3.x, pointL3.y, d, d2) ? 0 : -1));
                    PointL pointL4 = i5 < 0 ? segmentClipper3.mOptimIntersection1 : segmentClipper3.mOptimIntersection2;
                    PointL pointL5 = i5 < 0 ? segmentClipper3.mOptimIntersection2 : segmentClipper3.mOptimIntersection1;
                    if (segmentClipper3.mPathMode) {
                        segmentClipper3.nextVertex(clipX(j), segmentClipper3.clipY(j2));
                    }
                    segmentClipper3.nextVertex(pointL4.x, pointL4.y);
                    segmentClipper3.nextVertex(pointL5.x, pointL5.y);
                    if (segmentClipper3.mPathMode) {
                        segmentClipper3.nextVertex(segmentClipper3.clipX(j3), segmentClipper3.clipY(j4));
                        return;
                    }
                    return;
                } else if (i == 1) {
                    if (segmentClipper3.mPathMode) {
                        segmentClipper3.nextVertex(clipX(j), segmentClipper3.clipY(j2));
                        PointL pointL6 = segmentClipper3.mOptimIntersection1;
                        segmentClipper3.nextVertex(pointL6.x, pointL6.y);
                        segmentClipper3.nextVertex(segmentClipper3.clipX(j3), segmentClipper3.clipY(j4));
                        return;
                    }
                    return;
                } else if (i != 0) {
                    throw new RuntimeException(o00oOoO.o00oOOo0("Impossible mOptimIntersection count (", i, ")"));
                } else {
                    if (segmentClipper3.mPathMode) {
                        segmentClipper3.nextVertex(clipX(j), segmentClipper3.clipY(j2));
                        int closestCorner = getClosestCorner(j, j2, j3, j4);
                        segmentClipper3.nextVertex(segmentClipper3.cornerX[closestCorner], segmentClipper3.cornerY[closestCorner]);
                        segmentClipper3.nextVertex(segmentClipper3.clipX(j3), segmentClipper3.clipY(j4));
                        return;
                    }
                    return;
                }
            } else if (!intersection(j, j2, j3, j4)) {
                StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Cannot find expected mOptimIntersection for ");
                o00oOOo03.append(new RectL(j, j2, j3, j4));
                throw new RuntimeException(o00oOOo03.toString());
            } else {
                if (this.mPathMode) {
                    nextVertex(clipX(j), clipY(j2));
                }
                PointL pointL7 = this.mOptimIntersection;
                nextVertex(pointL7.x, pointL7.y);
            }
            nextVertex(j3, j4);
        }
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.end();
        }
        this.mPointAccepter.end();
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirstPoint = true;
        IntegerAccepter integerAccepter = this.mIntegerAccepter;
        if (integerAccepter != null) {
            integerAccepter.init();
        }
        this.mPointAccepter.init();
    }

    public boolean isInClipArea(long j, long j2) {
        return j > this.mXMin && j < this.mXMax && j2 > this.mYMin && j2 < this.mYMax;
    }

    public void set(long j, long j2, long j3, long j4, PointAccepter pointAccepter, IntegerAccepter integerAccepter, boolean z) {
        this.mXMin = j;
        this.mYMin = j2;
        this.mXMax = j3;
        this.mYMax = j4;
        long[] jArr = this.cornerX;
        jArr[1] = j;
        jArr[0] = j;
        jArr[3] = j3;
        jArr[2] = j3;
        long[] jArr2 = this.cornerY;
        jArr2[2] = j2;
        jArr2[0] = j2;
        jArr2[3] = j4;
        jArr2[1] = j4;
        this.mPointAccepter = pointAccepter;
        this.mIntegerAccepter = integerAccepter;
        this.mPathMode = z;
    }

    public void set(long j, long j2, long j3, long j4, PointAccepter pointAccepter, boolean z) {
        set(j, j2, j3, j4, pointAccepter, null, z);
    }
}
