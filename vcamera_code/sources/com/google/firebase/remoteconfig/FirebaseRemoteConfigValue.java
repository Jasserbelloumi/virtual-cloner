package com.google.firebase.remoteconfig;

import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface FirebaseRemoteConfigValue {
    boolean asBoolean() throws IllegalArgumentException;

    @oo0oO0
    byte[] asByteArray();

    double asDouble() throws IllegalArgumentException;

    long asLong() throws IllegalArgumentException;

    @oo0oO0
    String asString();

    int getSource();
}
