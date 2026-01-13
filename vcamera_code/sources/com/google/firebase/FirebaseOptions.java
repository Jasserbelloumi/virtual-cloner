package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public Builder(@oo0oO0 FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }

        @oo0oO0
        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        @oo0oO0
        public Builder setApiKey(@oo0oO0 String str) {
            this.apiKey = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @oo0oO0
        public Builder setApplicationId(@oo0oO0 String str) {
            this.applicationId = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @oo0oO0
        public Builder setDatabaseUrl(@o0OO00OO String str) {
            this.databaseUrl = str;
            return this;
        }

        @oo0oO0
        @KeepForSdk
        public Builder setGaTrackingId(@o0OO00OO String str) {
            this.gaTrackingId = str;
            return this;
        }

        @oo0oO0
        public Builder setGcmSenderId(@o0OO00OO String str) {
            this.gcmSenderId = str;
            return this;
        }

        @oo0oO0
        public Builder setProjectId(@o0OO00OO String str) {
            this.projectId = str;
            return this;
        }

        @oo0oO0
        public Builder setStorageBucket(@o0OO00OO String str) {
            this.storageBucket = str;
            return this;
        }
    }

    private FirebaseOptions(@oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO String str3, @o0OO00OO String str4, @o0OO00OO String str5, @o0OO00OO String str6, @o0OO00OO String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }

    @o0OO00OO
    public static FirebaseOptions fromResource(@oo0oO0 Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString(API_KEY_RESOURCE_NAME), stringResourceValueReader.getString(DATABASE_URL_RESOURCE_NAME), stringResourceValueReader.getString(GA_TRACKING_ID_RESOURCE_NAME), stringResourceValueReader.getString(GCM_SENDER_ID_RESOURCE_NAME), stringResourceValueReader.getString(STORAGE_BUCKET_RESOURCE_NAME), stringResourceValueReader.getString(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseOptions) {
            FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
            return Objects.equal(this.applicationId, firebaseOptions.applicationId) && Objects.equal(this.apiKey, firebaseOptions.apiKey) && Objects.equal(this.databaseUrl, firebaseOptions.databaseUrl) && Objects.equal(this.gaTrackingId, firebaseOptions.gaTrackingId) && Objects.equal(this.gcmSenderId, firebaseOptions.gcmSenderId) && Objects.equal(this.storageBucket, firebaseOptions.storageBucket) && Objects.equal(this.projectId, firebaseOptions.projectId);
        }
        return false;
    }

    @oo0oO0
    public String getApiKey() {
        return this.apiKey;
    }

    @oo0oO0
    public String getApplicationId() {
        return this.applicationId;
    }

    @o0OO00OO
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    @o0OO00OO
    @KeepForSdk
    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    @o0OO00OO
    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    @o0OO00OO
    public String getProjectId() {
        return this.projectId;
    }

    @o0OO00OO
    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Objects.hashCode(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.applicationId).add("apiKey", this.apiKey).add("databaseUrl", this.databaseUrl).add("gcmSenderId", this.gcmSenderId).add("storageBucket", this.storageBucket).add("projectId", this.projectId).toString();
    }
}
