package com.google.android.exoplayer2.upstream;

import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface Allocator {

    /* loaded from: classes.dex */
    public interface AllocationNode {
        Allocation getAllocation();

        @o0OO00OO
        AllocationNode next();
    }

    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(AllocationNode allocationNode);

    void trim();
}
