package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class CueGroup implements Bundleable {
    private static final int FIELD_CUES = 0;
    public final ImmutableList<Cue> cues;
    public static final CueGroup EMPTY = new CueGroup(ImmutableList.of());
    public static final Bundleable.Creator<CueGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.o00oOOoO
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            CueGroup fromBundle;
            fromBundle = CueGroup.fromBundle(bundle);
            return fromBundle;
        }
    };

    public CueGroup(List<Cue> list) {
        this.cues = ImmutableList.copyOf((Collection) list);
    }

    private static ImmutableList<Cue> filterOutBitmapCues(List<Cue> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                builder.add((ImmutableList.Builder) list.get(i));
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new CueGroup(parcelableArrayList == null ? ImmutableList.of() : BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList));
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        return bundle;
    }
}
