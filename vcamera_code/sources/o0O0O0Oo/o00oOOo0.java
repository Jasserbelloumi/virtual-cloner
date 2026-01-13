package o0O0O0Oo;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11183o00oOOo0 = "AudioManCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f11184o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f11185o00oOo00 = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f11186o00oOo0O = 4;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11187o00oOooO = 3;

    @o0OOooO0(26)
    /* renamed from: o0O0O0Oo.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0146o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        @o0O0O0Oo
        public static int o00oOOoO(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static int o00oOOo0(AudioManager audioManager, int i) {
            return audioManager.getStreamMinVolume(i);
        }
    }

    public static int o00oOOo0(@oo0oO0 AudioManager audioManager, @oo0oO0 androidx.media.o00oOOo0 o00oooo02) {
        if (audioManager != null) {
            if (o00oooo02 != null) {
                return C0146o00oOOo0.o00oOOo0(audioManager, o00oooo02.o00oOo00());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    @o0O0o00O(from = 0)
    public static int o00oOOoO(@oo0oO0 AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    @o0O0o00O(from = 0)
    public static int o00oOo00(@oo0oO0 AudioManager audioManager, int i) {
        return o00oOOoO.o00oOOo0(audioManager, i);
    }

    public static int o00oOooO(@oo0oO0 AudioManager audioManager, @oo0oO0 androidx.media.o00oOOo0 o00oooo02) {
        if (audioManager != null) {
            if (o00oooo02 != null) {
                return C0146o00oOOo0.o00oOOoO(audioManager, o00oooo02.o00oOo00());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }
}
