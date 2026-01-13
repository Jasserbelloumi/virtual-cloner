package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public final class ServiceSpecificExtraArgs {

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface CastExtraArgs {
        @oo0oO0
        @KeepForSdk
        public static final String LISTENER = "listener";
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface GamesExtraArgs {
        @oo0oO0
        @KeepForSdk
        public static final String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
        @oo0oO0
        @KeepForSdk
        public static final String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
        @oo0oO0
        @KeepForSdk
        public static final String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
        @oo0oO0
        @KeepForSdk
        public static final String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface PlusExtraArgs {
        @oo0oO0
        @KeepForSdk
        public static final String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
    }
}
