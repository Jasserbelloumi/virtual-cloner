package org.osmdroid.util;

import android.graphics.Path;
/* loaded from: classes3.dex */
public class PathBuilder implements PointAccepter {
    private boolean mFirst;
    private final PointL mLatestPoint = new PointL();
    private final Path mPath;

    public PathBuilder(Path path) {
        this.mPath = path;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j, long j2) {
        if (this.mFirst) {
            this.mFirst = false;
            this.mPath.moveTo((float) j, (float) j2);
        } else {
            PointL pointL = this.mLatestPoint;
            if (pointL.x == j && pointL.y == j2) {
                return;
            }
            this.mPath.lineTo((float) j, (float) j2);
        }
        this.mLatestPoint.set(j, j2);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirst = true;
    }
}
