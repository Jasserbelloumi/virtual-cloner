package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {
    @oo0oO0
    private final Status status;

    /* loaded from: classes2.dex */
    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@oo0oO0 Status status) {
        this.status = status;
    }

    public FirebaseInstallationsException(@oo0oO0 String str, @oo0oO0 Status status) {
        super(str);
        this.status = status;
    }

    public FirebaseInstallationsException(@oo0oO0 String str, @oo0oO0 Status status, @oo0oO0 Throwable th) {
        super(str, th);
        this.status = status;
    }

    @oo0oO0
    public Status getStatus() {
        return this.status;
    }
}
