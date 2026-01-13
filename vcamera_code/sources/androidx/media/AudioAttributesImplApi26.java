package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(26)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends AudioAttributesImplApi21.o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(Object obj) {
            super(obj);
        }

        @Override // androidx.media.AudioAttributesImplApi21.o00oOOo0, androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f3487o00oOOo0.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOoO */
        public o00oOOo0 o00oOoO0(int i) {
            this.f3487o00oOOo0.setUsage(i);
            return this;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int o00oOooO() {
        return this.f3485o00oOOo0.getVolumeControlStream();
    }
}
