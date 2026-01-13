package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static final class Api18 {
        private Api18() {
        }

        @o0O0O0Oo
        public static boolean isDeniedByServerException(@o0OO00OO Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @o0O0O0Oo
        public static boolean isNotProvisionedException(@o0OO00OO Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static final class Api21 {
        private Api21() {
        }

        @o0O0O0Oo
        public static boolean isMediaDrmStateException(@o0OO00OO Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @o0O0O0Oo
        public static int mediaDrmStateExceptionToErrorCode(Throwable th) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static final class Api23 {
        private Api23() {
        }

        @o0O0O0Oo
        public static boolean isMediaDrmResetException(@o0OO00OO Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static int getErrorCodeForMediaDrmException(Exception exc, int i) {
        int i2 = Util.SDK_INT;
        if (i2 < 21 || !Api21.isMediaDrmStateException(exc)) {
            if (i2 < 23 || !Api23.isMediaDrmResetException(exc)) {
                if (i2 < 18 || !Api18.isNotProvisionedException(exc)) {
                    if (i2 < 18 || !Api18.isDeniedByServerException(exc)) {
                        if (exc instanceof UnsupportedDrmException) {
                            return PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
                        }
                        if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
                        }
                        if (exc instanceof KeysExpiredException) {
                            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
                        }
                        if (i == 1) {
                            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                        }
                        if (i == 2) {
                            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
                        }
                        if (i == 3) {
                            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                        }
                        throw new IllegalArgumentException();
                    }
                    return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
                }
                return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
            }
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        return Api21.mediaDrmStateExceptionToErrorCode(exc);
    }
}
