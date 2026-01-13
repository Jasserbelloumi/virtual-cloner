package androidx.media;

import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(o0O0oo00 o0o0oo00) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3488o00oOOo0 = o0o0oo00.o00ooo0o(audioAttributesImplBase.f3488o00oOOo0, 1);
        audioAttributesImplBase.f3489o00oOOoO = o0o0oo00.o00ooo0o(audioAttributesImplBase.f3489o00oOOoO, 2);
        audioAttributesImplBase.f3490o00oOo00 = o0o0oo00.o00ooo0o(audioAttributesImplBase.f3490o00oOo00, 3);
        audioAttributesImplBase.f3491o00oOooO = o0o0oo00.o00ooo0o(audioAttributesImplBase.f3491o00oOooO, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, o0O0oo00 o0o0oo00) {
        o0o0oo00.o0OoO00O(false, false);
        o0o0oo00.o0O0OOo(audioAttributesImplBase.f3488o00oOOo0, 1);
        o0o0oo00.o0O0OOo(audioAttributesImplBase.f3489o00oOOoO, 2);
        o0o0oo00.o0O0OOo(audioAttributesImplBase.f3490o00oOo00, 3);
        o0o0oo00.o0O0OOo(audioAttributesImplBase.f3491o00oOooO, 4);
    }
}
