package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes2.dex */
public abstract class PersistedInstallationEntry {
    @oo0oO0
    public static PersistedInstallationEntry INSTANCE = builder().build();

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        @oo0oO0
        public abstract PersistedInstallationEntry build();

        @oo0oO0
        public abstract Builder setAuthToken(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setExpiresInSecs(long j);

        @oo0oO0
        public abstract Builder setFirebaseInstallationId(@oo0oO0 String str);

        @oo0oO0
        public abstract Builder setFisError(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setRefreshToken(@o0OO00OO String str);

        @oo0oO0
        public abstract Builder setRegistrationStatus(@oo0oO0 PersistedInstallation.RegistrationStatus registrationStatus);

        @oo0oO0
        public abstract Builder setTokenCreationEpochInSecs(long j);
    }

    @oo0oO0
    public static Builder builder() {
        return new AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0L).setRegistrationStatus(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
    }

    @o0OO00OO
    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    @o0OO00OO
    public abstract String getFirebaseInstallationId();

    @o0OO00OO
    public abstract String getFisError();

    @o0OO00OO
    public abstract String getRefreshToken();

    @oo0oO0
    public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean isRegistered() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    @oo0oO0
    public abstract Builder toBuilder();

    @oo0oO0
    public PersistedInstallationEntry withAuthToken(@oo0oO0 String str, long j, long j2) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j).setTokenCreationEpochInSecs(j2).build();
    }

    @oo0oO0
    public PersistedInstallationEntry withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    @oo0oO0
    public PersistedInstallationEntry withFisError(@oo0oO0 String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
    }

    @oo0oO0
    public PersistedInstallationEntry withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
    }

    @oo0oO0
    public PersistedInstallationEntry withRegisteredFid(@oo0oO0 String str, @oo0oO0 String str2, long j, @o0OO00OO String str3, long j2) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j2).setTokenCreationEpochInSecs(j).build();
    }

    @oo0oO0
    public PersistedInstallationEntry withUnregisteredFid(@oo0oO0 String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
    }
}
