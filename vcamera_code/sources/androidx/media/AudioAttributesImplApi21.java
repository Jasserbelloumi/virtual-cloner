package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public AudioAttributes f3485o00oOOo0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f3486o00oOOoO;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 implements AudioAttributesImpl.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AudioAttributes.Builder f3487o00oOOo0;

        public o00oOOo0() {
            this.f3487o00oOOo0 = new AudioAttributes.Builder();
        }

        public o00oOOo0(Object obj) {
            this.f3487o00oOOo0 = new AudioAttributes.Builder((AudioAttributes) obj);
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3487o00oOOo0.build(), -1);
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOo0O */
        public o00oOOo0 setFlags(int i) {
            this.f3487o00oOOo0.setFlags(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOo0o */
        public o00oOOo0 o00oOOoO(int i) {
            this.f3487o00oOOo0.setLegacyStreamType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOoO0 */
        public o00oOOo0 o00oOOo0(int i) {
            if (i == 16) {
                i = 12;
            }
            this.f3487o00oOOo0.setUsage(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOooO */
        public o00oOOo0 o00oOo00(int i) {
            this.f3487o00oOOo0.setContentType(i);
            return this;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f3486o00oOOoO = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3485o00oOOo0 = audioAttributes;
        this.f3486o00oOOoO = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3485o00oOOo0.equals(((AudioAttributesImplApi21) obj).f3485o00oOOo0);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    @o0OO00OO
    public Object getAudioAttributes() {
        return this.f3485o00oOOo0;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f3485o00oOOo0.getFlags();
    }

    public int hashCode() {
        return this.f3485o00oOOo0.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOOo0() {
        return this.f3486o00oOOoO;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOOoO() {
        return this.f3485o00oOOo0.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOo00() {
        return this.f3485o00oOOo0.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOo0O() {
        int i = this.f3486o00oOOoO;
        return i != -1 ? i : AudioAttributesCompat.o00oOoO0(false, getFlags(), o00oOOoO());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOooO() {
        return AudioAttributesCompat.o00oOoO0(true, getFlags(), o00oOOoO());
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("AudioAttributesCompat: audioattributes=");
        o00oOOo02.append(this.f3485o00oOOo0);
        return o00oOOo02.toString();
    }
}
