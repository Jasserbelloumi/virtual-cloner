package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;
/* loaded from: classes3.dex */
public class MilestoneMeterDistanceSliceLister extends MilestoneLister {
    private double mDistance;
    private int mIndex;
    private double mNbMetersEnd;
    private double mNbMetersStart;
    private Step mStep;

    /* loaded from: classes3.dex */
    public enum Step {
        STEP_INIT,
        STEP_STARTED,
        STEP_ENDED
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister
    public void add(long j, long j2, long j3, long j4) {
        Step step;
        double d;
        double d2;
        Step step2 = this.mStep;
        Step step3 = Step.STEP_ENDED;
        if (step2 == step3) {
            return;
        }
        int i = this.mIndex + 1;
        this.mIndex = i;
        double distance = getDistance(i);
        if (distance == 0.0d) {
            return;
        }
        double d3 = j;
        double d4 = j2;
        double d5 = distance;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d3, d4, j3, j4)) / d5;
        double orientation = MilestoneLister.getOrientation(j, j2, j3, j4);
        if (this.mStep == Step.STEP_INIT) {
            double d6 = this.mNbMetersStart;
            double d7 = this.mDistance;
            double d8 = d6 - d7;
            if (d8 > d5) {
                this.mDistance = d7 + d5;
                return;
            }
            this.mStep = Step.STEP_STARTED;
            this.mDistance = d7 + d8;
            d5 -= d8;
            double d9 = orientation * 0.017453292519943295d;
            double cos = d3 + (Math.cos(d9) * d8 * sqrt);
            double sin = (Math.sin(d9) * d8 * sqrt) + d4;
            add(new MilestoneStep((long) cos, (long) sin, orientation, null));
            if (this.mNbMetersStart == this.mNbMetersEnd) {
                this.mStep = step3;
                return;
            }
            step = step3;
            d = cos;
            d2 = sin;
        } else {
            step = step3;
            d = d3;
            d2 = d4;
        }
        if (this.mStep == Step.STEP_STARTED) {
            double d10 = this.mNbMetersEnd;
            double d11 = this.mDistance;
            double d12 = d10 - d11;
            if (d12 > d5) {
                this.mDistance = d11 + d5;
                add(new MilestoneStep(j3, j4, orientation, null));
                return;
            }
            this.mStep = step;
            double d13 = 0.017453292519943295d * orientation;
            add(new MilestoneStep((long) ((Math.cos(d13) * d12 * sqrt) + d), (long) ((Math.sin(d13) * d12 * sqrt) + d2), orientation, null));
        }
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.mDistance = 0.0d;
        this.mIndex = 0;
        this.mStep = Step.STEP_INIT;
    }

    public void setMeterDistanceSlice(double d, double d2) {
        this.mNbMetersStart = d;
        this.mNbMetersEnd = d2;
    }
}
