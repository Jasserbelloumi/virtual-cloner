package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
/* loaded from: classes.dex */
public abstract class Rating implements Bundleable {
    public static final Bundleable.Creator<Rating> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.oO0000O
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            Rating fromBundle;
            fromBundle = Rating.fromBundle(bundle);
            return fromBundle;
        }
    };
    public static final int FIELD_RATING_TYPE = 0;
    public static final int RATING_TYPE_HEART = 0;
    public static final int RATING_TYPE_PERCENTAGE = 1;
    public static final int RATING_TYPE_STAR = 2;
    public static final int RATING_TYPE_THUMB = 3;
    public static final int RATING_TYPE_UNSET = -1;
    public static final float RATING_UNSET = -1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static Rating fromBundle(Bundle bundle) {
        Bundleable.Creator creator;
        int i = bundle.getInt(keyForField(0), -1);
        if (i == 0) {
            creator = HeartRating.CREATOR;
        } else if (i == 1) {
            creator = PercentageRating.CREATOR;
        } else if (i == 2) {
            creator = StarRating.CREATOR;
        } else if (i != 3) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown RatingType: ", i));
        } else {
            creator = ThumbRating.CREATOR;
        }
        return (Rating) creator.fromBundle(bundle);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public abstract boolean isRated();
}
