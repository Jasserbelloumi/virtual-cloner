package org.osmdroid.views.overlay.milestones;

import java.util.ArrayList;
import java.util.List;
import org.osmdroid.util.PointAccepter;
import org.osmdroid.util.PointL;
/* loaded from: classes3.dex */
public abstract class MilestoneLister implements PointAccepter {
    private double[] mDistances;
    private boolean mFirst;
    private final List<MilestoneStep> mMilestones = new ArrayList();
    private final PointL mLatestPoint = new PointL();

    public static double getOrientation(long j, long j2, long j3, long j4) {
        if (j != j3) {
            return (Math.atan((j4 - j2) / (j3 - j)) * 57.29577951308232d) + ((j3 > j ? 1 : (j3 == j ? 0 : -1)) < 0 ? 180 : 0);
        }
        int i = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
        if (i == 0) {
            return 0.0d;
        }
        return i > 0 ? -90.0d : 90.0d;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j, long j2) {
        if (this.mFirst) {
            this.mFirst = false;
        } else {
            PointL pointL = this.mLatestPoint;
            add(pointL.x, pointL.y, j, j2);
        }
        this.mLatestPoint.set(j, j2);
    }

    public abstract void add(long j, long j2, long j3, long j4);

    public void add(MilestoneStep milestoneStep) {
        this.mMilestones.add(milestoneStep);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    public double getDistance(int i) {
        return this.mDistances[i];
    }

    public List<MilestoneStep> getMilestones() {
        return this.mMilestones;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mMilestones.clear();
        this.mFirst = true;
    }

    public void setDistances(double[] dArr) {
        this.mDistances = dArr;
    }
}
