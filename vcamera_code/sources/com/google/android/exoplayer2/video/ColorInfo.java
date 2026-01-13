package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class ColorInfo implements Bundleable {
    public static final Bundleable.Creator<ColorInfo> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.video.o00oOOo0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            ColorInfo lambda$static$0;
            lambda$static$0 = ColorInfo.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };
    private static final int FIELD_COLOR_RANGE = 1;
    private static final int FIELD_COLOR_SPACE = 0;
    private static final int FIELD_COLOR_TRANSFER = 2;
    private static final int FIELD_HDR_STATIC_INFO = 3;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    @o0OO00OO
    public final byte[] hdrStaticInfo;

    public ColorInfo(int i, int i2, int i3, @o0OO00OO byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
        return new ColorInfo(bundle.getInt(keyForField(0), -1), bundle.getInt(keyForField(1), -1), bundle.getInt(keyForField(2), -1), bundle.getByteArray(keyForField(3)));
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.hdrStaticInfo) + ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), this.colorSpace);
        bundle.putInt(keyForField(1), this.colorRange);
        bundle.putInt(keyForField(2), this.colorTransfer);
        bundle.putByteArray(keyForField(3), this.hdrStaticInfo);
        return bundle;
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ColorInfo(");
        o00oOOo02.append(this.colorSpace);
        o00oOOo02.append(", ");
        o00oOOo02.append(this.colorRange);
        o00oOOo02.append(", ");
        o00oOOo02.append(this.colorTransfer);
        o00oOOo02.append(", ");
        o00oOOo02.append(this.hdrStaticInfo != null);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }
}
