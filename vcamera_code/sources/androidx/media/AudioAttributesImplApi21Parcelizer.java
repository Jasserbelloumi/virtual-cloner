package androidx.media;

import android.media.AudioAttributes;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(o0O0oo00 o0o0oo00) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3485o00oOOo0 = (AudioAttributes) o0o0oo00.o0O0000O(audioAttributesImplApi21.f3485o00oOOo0, 1);
        audioAttributesImplApi21.f3486o00oOOoO = o0o0oo00.o00ooo0o(audioAttributesImplApi21.f3486o00oOOoO, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(false, false);
        o0o0oo00.o0O0OoO(audioAttributesImplApi21.f3485o00oOOo0, 1);
        o0o0oo00.o0O0OOo(audioAttributesImplApi21.f3486o00oOOoO, 2);
    }
}
