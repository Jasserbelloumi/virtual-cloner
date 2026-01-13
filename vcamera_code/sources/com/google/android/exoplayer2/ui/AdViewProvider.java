package com.google.android.exoplayer2.ui;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public interface AdViewProvider {
    default List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.of();
    }

    @o0OO00OO
    ViewGroup getAdViewGroup();
}
