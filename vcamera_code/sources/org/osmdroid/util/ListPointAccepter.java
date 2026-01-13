package org.osmdroid.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ListPointAccepter implements PointAccepter {
    private boolean mFirst;
    private final boolean mRemoveConsecutiveDuplicates;
    private final List<Long> mList = new ArrayList();
    private final PointL mLatestPoint = new PointL();

    public ListPointAccepter(boolean z) {
        this.mRemoveConsecutiveDuplicates = z;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j, long j2) {
        if (!this.mRemoveConsecutiveDuplicates) {
            this.mList.add(Long.valueOf(j));
            this.mList.add(Long.valueOf(j2));
            return;
        }
        if (this.mFirst) {
            this.mFirst = false;
        } else {
            PointL pointL = this.mLatestPoint;
            if (pointL.x == j && pointL.y == j2) {
                return;
            }
        }
        this.mList.add(Long.valueOf(j));
        this.mList.add(Long.valueOf(j2));
        this.mLatestPoint.set(j, j2);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    public List<Long> getList() {
        return this.mList;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mList.clear();
        this.mFirst = true;
    }
}
