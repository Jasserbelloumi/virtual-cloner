package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.util.Util;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class TrackSelectorResult {
    @o0OO00OO
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final Tracks tracks;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, @o0OO00OO Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, @o0OO00OO Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, Tracks.EMPTY, obj);
    }

    public boolean isEquivalent(@o0OO00OO TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i = 0; i < this.selections.length; i++) {
            if (!isEquivalent(trackSelectorResult, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEquivalent(@o0OO00OO TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i], trackSelectorResult.rendererConfigurations[i]) && Util.areEqual(this.selections[i], trackSelectorResult.selections[i]);
    }

    public boolean isRendererEnabled(int i) {
        return this.rendererConfigurations[i] != null;
    }
}
