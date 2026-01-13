package org.osmdroid.views.overlay.simplefastpoint;

import java.util.Iterator;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay;
/* loaded from: classes3.dex */
public final class SimplePointTheme implements SimpleFastPointOverlay.PointAdapter {
    private boolean mLabelled;
    private final List<IGeoPoint> mPoints;
    private boolean mStyled;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimplePointTheme(java.util.List<org.osmdroid.api.IGeoPoint> r5) {
        /*
            r4 = this;
            int r0 = r5.size()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            java.lang.Object r0 = r5.get(r2)
            boolean r0 = r0 instanceof org.osmdroid.views.overlay.simplefastpoint.LabelledGeoPoint
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            int r3 = r5.size()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r5.get(r2)
            boolean r3 = r3 instanceof org.osmdroid.views.overlay.simplefastpoint.StyledLabelledGeoPoint
            if (r3 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.simplefastpoint.SimplePointTheme.<init>(java.util.List):void");
    }

    public SimplePointTheme(List<IGeoPoint> list, boolean z) {
        this(list, z, false);
    }

    public SimplePointTheme(List<IGeoPoint> list, boolean z, boolean z2) {
        this.mPoints = list;
        this.mLabelled = z;
        this.mStyled = z2;
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.PointAdapter
    public IGeoPoint get(int i) {
        return this.mPoints.get(i);
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.PointAdapter
    public boolean isLabelled() {
        return this.mLabelled;
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.PointAdapter
    public boolean isStyled() {
        return this.mStyled;
    }

    @Override // java.lang.Iterable
    public Iterator<IGeoPoint> iterator() {
        return this.mPoints.iterator();
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.SimpleFastPointOverlay.PointAdapter
    public int size() {
        return this.mPoints.size();
    }
}
