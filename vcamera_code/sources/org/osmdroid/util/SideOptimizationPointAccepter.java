package org.osmdroid.util;
/* loaded from: classes3.dex */
public class SideOptimizationPointAccepter implements PointAccepter {
    private static final int STATUS_DIFFERENT = 0;
    private static final int STATUS_SAME_X = 1;
    private static final int STATUS_SAME_Y = 2;
    private boolean mFirst;
    private long mMax;
    private long mMin;
    private final PointAccepter mPointAccepter;
    private int mStatus;
    private final PointL mLatestPoint = new PointL();
    private final PointL mStartPoint = new PointL();

    public SideOptimizationPointAccepter(PointAccepter pointAccepter) {
        this.mPointAccepter = pointAccepter;
    }

    private void addToAccepter(long j, long j2) {
        this.mPointAccepter.add(j, j2);
    }

    private void flushSides() {
        int i = this.mStatus;
        if (i == 1) {
            PointL pointL = this.mStartPoint;
            long j = pointL.x;
            long j2 = pointL.y;
            long j3 = this.mLatestPoint.y;
            if (j2 > j3) {
                j2 = j3;
                j3 = j2;
            }
            long j4 = this.mMin;
            if (j4 < j2) {
                addToAccepter(j, j4);
            }
            long j5 = this.mMax;
            if (j5 > j3) {
                addToAccepter(j, j5);
            }
            addToAccepter(j, this.mLatestPoint.y);
        } else if (i == 2) {
            PointL pointL2 = this.mStartPoint;
            long j6 = pointL2.y;
            long j7 = pointL2.x;
            long j8 = this.mLatestPoint.x;
            if (j7 > j8) {
                j7 = j8;
                j8 = j7;
            }
            long j9 = this.mMin;
            if (j9 < j7) {
                addToAccepter(j9, j6);
            }
            long j10 = this.mMax;
            if (j10 > j8) {
                addToAccepter(j10, j6);
            }
            addToAccepter(this.mLatestPoint.x, j6);
        }
        this.mStatus = 0;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j, long j2) {
        long max;
        if (!this.mFirst) {
            PointL pointL = this.mLatestPoint;
            long j3 = pointL.x;
            if (j3 == j && pointL.y == j2) {
                return;
            }
            if (j3 == j) {
                if (this.mStatus == 1) {
                    if (this.mMin > j2) {
                        this.mMin = j2;
                    }
                    if (this.mMax < j2) {
                        this.mMax = j2;
                    }
                } else {
                    flushSides();
                    this.mStatus = 1;
                    this.mStartPoint.set(this.mLatestPoint);
                    this.mMin = Math.min(j2, this.mLatestPoint.y);
                    max = Math.max(j2, this.mLatestPoint.y);
                    this.mMax = max;
                }
            } else if (pointL.y != j2) {
                flushSides();
            } else if (this.mStatus == 2) {
                if (this.mMin > j) {
                    this.mMin = j;
                }
                if (this.mMax < j) {
                    this.mMax = j;
                }
            } else {
                flushSides();
                this.mStatus = 2;
                this.mStartPoint.set(this.mLatestPoint);
                this.mMin = Math.min(j, this.mLatestPoint.x);
                max = Math.max(j, this.mLatestPoint.x);
                this.mMax = max;
            }
            this.mLatestPoint.set(j, j2);
        }
        this.mFirst = false;
        addToAccepter(j, j2);
        this.mLatestPoint.set(j, j2);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        flushSides();
        this.mPointAccepter.end();
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirst = true;
        this.mStatus = 0;
        this.mPointAccepter.init();
    }
}
