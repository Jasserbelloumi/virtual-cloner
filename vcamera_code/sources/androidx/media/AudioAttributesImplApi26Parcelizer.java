package androidx.media;

import android.media.AudioAttributes;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(o0O0oo00 o0o0oo00) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3485o00oOOo0 = (AudioAttributes) o0o0oo00.o0O0000O(audioAttributesImplApi26.f3485o00oOOo0, 1);
        audioAttributesImplApi26.f3486o00oOOoO = o0o0oo00.o00ooo0o(audioAttributesImplApi26.f3486o00oOOoO, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(false, false);
        o0o0oo00.o0O0OoO(audioAttributesImplApi26.f3485o00oOOo0, 1);
        o0o0oo00.o0O0OOo(audioAttributesImplApi26.f3486o00oOOoO, 2);
    }
}
