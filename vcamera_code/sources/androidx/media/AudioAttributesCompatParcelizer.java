package androidx.media;

import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(o0O0oo00 o0o0oo00) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3479o00oOOo0 = (AudioAttributesImpl) o0o0oo00.o0O00(audioAttributesCompat.f3479o00oOOo0, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(false, false);
        o0o0oo00.o0oOo0O0(audioAttributesCompat.f3479o00oOOo0, 1);
    }
}
