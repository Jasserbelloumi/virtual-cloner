package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.photoStartPosition = j;
        this.photoSize = j2;
        this.photoPresentationTimestampUs = j3;
        this.videoStartPosition = j4;
        this.videoSize = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize;
    }

    public int hashCode() {
        int hashCode = Longs.hashCode(this.photoSize);
        int hashCode2 = Longs.hashCode(this.photoPresentationTimestampUs);
        int hashCode3 = Longs.hashCode(this.videoStartPosition);
        return Longs.hashCode(this.videoSize) + ((hashCode3 + ((hashCode2 + ((hashCode + ((Longs.hashCode(this.photoStartPosition) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Motion photo metadata: photoStartPosition=");
        o00oOOo02.append(this.photoStartPosition);
        o00oOOo02.append(", photoSize=");
        o00oOOo02.append(this.photoSize);
        o00oOOo02.append(", photoPresentationTimestampUs=");
        o00oOOo02.append(this.photoPresentationTimestampUs);
        o00oOOo02.append(", videoStartPosition=");
        o00oOOo02.append(this.videoStartPosition);
        o00oOOo02.append(", videoSize=");
        o00oOOo02.append(this.videoSize);
        return o00oOOo02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }
}
