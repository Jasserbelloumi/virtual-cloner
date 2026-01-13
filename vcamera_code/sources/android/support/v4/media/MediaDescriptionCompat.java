package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @o0O0O0Oo
        public static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        @o0O0O0Oo
        public static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static CharSequence getDescription(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Bundle getExtras(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Bitmap getIconBitmap(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Uri getIconUri(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static String getMediaId(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static CharSequence getSubtitle(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static CharSequence getTitle(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @o0O0O0Oo
        public static void setDescription(MediaDescription.Builder builder, @o0OO00OO CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @o0O0O0Oo
        public static void setExtras(MediaDescription.Builder builder, @o0OO00OO Bundle bundle) {
            builder.setExtras(bundle);
        }

        @o0O0O0Oo
        public static void setIconBitmap(MediaDescription.Builder builder, @o0OO00OO Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @o0O0O0Oo
        public static void setIconUri(MediaDescription.Builder builder, @o0OO00OO Uri uri) {
            builder.setIconUri(uri);
        }

        @o0O0O0Oo
        public static void setMediaId(MediaDescription.Builder builder, @o0OO00OO String str) {
            builder.setMediaId(str);
        }

        @o0O0O0Oo
        public static void setSubtitle(MediaDescription.Builder builder, @o0OO00OO CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @o0O0O0Oo
        public static void setTitle(MediaDescription.Builder builder, @o0OO00OO CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Uri getMediaUri(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @o0O0O0Oo
        public static void setMediaUri(MediaDescription.Builder builder, @o0OO00OO Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(@o0OO00OO CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public Builder setExtras(@o0OO00OO Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setIconBitmap(@o0OO00OO Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public Builder setIconUri(@o0OO00OO Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public Builder setMediaId(@o0OO00OO String str) {
            this.mMediaId = str;
            return this;
        }

        public Builder setMediaUri(@o0OO00OO Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public Builder setSubtitle(@o0OO00OO CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder setTitle(@o0OO00OO CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L79
            android.support.v4.media.MediaDescriptionCompat$Builder r1 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(r8)
            r1.setMediaId(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(r8)
            r1.setTitle(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(r8)
            r1.setSubtitle(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(r8)
            r1.setDescription(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(r8)
            r1.setIconBitmap(r2)
            android.net.Uri r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(r8)
            r1.setIconUri(r2)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(r8)
            if (r2 == 0) goto L3e
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r2)
        L3e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L49
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4a
        L49:
            r4 = r0
        L4a:
            if (r4 == 0) goto L62
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5c
            goto L63
        L5c:
            r2.remove(r3)
            r2.remove(r5)
        L62:
            r0 = r2
        L63:
            r1.setExtras(r0)
            if (r4 == 0) goto L6c
            r1.setMediaUri(r4)
            goto L73
        L6c:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(r8)
            r1.setMediaUri(r0)
        L73:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.build()
            r0.mDescriptionFwk = r8
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @o0OO00OO
    public CharSequence getDescription() {
        return this.mDescription;
    }

    @o0OO00OO
    public Bundle getExtras() {
        return this.mExtras;
    }

    @o0OO00OO
    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    @o0OO00OO
    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription == null) {
            MediaDescription.Builder createBuilder = Api21Impl.createBuilder();
            Api21Impl.setMediaId(createBuilder, this.mMediaId);
            Api21Impl.setTitle(createBuilder, this.mTitle);
            Api21Impl.setSubtitle(createBuilder, this.mSubtitle);
            Api21Impl.setDescription(createBuilder, this.mDescription);
            Api21Impl.setIconBitmap(createBuilder, this.mIcon);
            Api21Impl.setIconUri(createBuilder, this.mIconUri);
            Api21Impl.setExtras(createBuilder, this.mExtras);
            Api23Impl.setMediaUri(createBuilder, this.mMediaUri);
            MediaDescription build = Api21Impl.build(createBuilder);
            this.mDescriptionFwk = build;
            return build;
        }
        return mediaDescription;
    }

    @o0OO00OO
    public String getMediaId() {
        return this.mMediaId;
    }

    @o0OO00OO
    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    @o0OO00OO
    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    @o0OO00OO
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }
}
