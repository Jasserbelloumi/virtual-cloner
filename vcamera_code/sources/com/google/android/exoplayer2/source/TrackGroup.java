package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes.dex */
public final class TrackGroup implements Bundleable {
    public static final Bundleable.Creator<TrackGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.o0O00
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            TrackGroup lambda$static$0;
            lambda$static$0 = TrackGroup.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };
    private static final int FIELD_FORMATS = 0;
    private static final int FIELD_ID = 1;
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;
    public final int type;

    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrackGroup lambda$static$0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new TrackGroup(bundle.getString(keyForField(1), ""), (Format[]) (parcelableArrayList == null ? ImmutableList.of() : BundleableUtil.fromBundleList(Format.CREATOR, parcelableArrayList)).toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, @o0OO00OO String str2, @o0OO00OO String str3, int i) {
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o00oOOo02.append(str3);
        o00oOOo02.append("' (track ");
        o00oOOo02.append(i);
        o00oOOo02.append(")");
        Log.e(TAG, "", new IllegalStateException(o00oOOo02.toString()));
    }

    private static String normalizeLanguage(@o0OO00OO String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String normalizeLanguage = normalizeLanguage(this.formats[0].language);
        int normalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!normalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i].language, i);
                return;
            } else if (normalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
                return;
            } else {
                i++;
            }
        }
    }

    @o0OoO00O
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.id.equals(trackGroup.id) && Arrays.equals(this.formats, trackGroup.formats);
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = o0O0OOOo.o00oo0O0.o00oOOo0(this.id, 527, 31) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(Lists.newArrayList(this.formats)));
        bundle.putString(keyForField(1), this.id);
        return bundle;
    }
}
