package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f3488o00oOOo0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f3489o00oOOoO;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f3490o00oOo00;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f3491o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements AudioAttributesImpl.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f3492o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f3493o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f3494o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f3495o00oOooO;

        public o00oOOo0() {
            this.f3492o00oOOo0 = 0;
            this.f3493o00oOOoO = 0;
            this.f3494o00oOo00 = 0;
            this.f3495o00oOooO = -1;
        }

        public o00oOOo0(AudioAttributesCompat audioAttributesCompat) {
            this.f3492o00oOOo0 = 0;
            this.f3493o00oOOoO = 0;
            this.f3494o00oOo00 = 0;
            this.f3495o00oOooO = -1;
            this.f3492o00oOOo0 = audioAttributesCompat.o00oOOoO();
            this.f3493o00oOOoO = audioAttributesCompat.o00oOo00();
            this.f3494o00oOo00 = audioAttributesCompat.getFlags();
            this.f3495o00oOooO = audioAttributesCompat.o00oOOo0();
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3493o00oOOoO, this.f3494o00oOo00, this.f3492o00oOOo0, this.f3495o00oOooO);
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOo0O */
        public o00oOOo0 setFlags(int i) {
            this.f3494o00oOo00 = (i & 1023) | this.f3494o00oOo00;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final o00oOOo0 o00oOo0o(int i) {
            int i2 = 1;
            switch (i) {
                case 0:
                case 10:
                    this.f3493o00oOOoO = i2;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 9:
                    this.f3493o00oOOoO = 4;
                    break;
                case 3:
                    i2 = 2;
                    this.f3493o00oOOoO = i2;
                    break;
                case 6:
                    this.f3493o00oOOoO = 1;
                    this.f3494o00oOo00 |= 4;
                    break;
                case 7:
                    this.f3494o00oOo00 = 1 | this.f3494o00oOo00;
                    this.f3493o00oOOoO = 4;
                    break;
            }
            this.f3492o00oOOo0 = AudioAttributesImplBase.o00oOo0o(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOoO */
        public o00oOOo0 o00oOOo0(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 16:
                    i = 12;
                    break;
                default:
                    i = 0;
                    break;
            }
            this.f3492o00oOOo0 = i;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOoO0 */
        public o00oOOo0 o00oOOoO(int i) {
            if (i != 10) {
                this.f3495o00oOooO = i;
                return o00oOo0o(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        @Override // androidx.media.AudioAttributesImpl.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOooO */
        public o00oOOo0 o00oOo00(int i) {
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
                i = 0;
            }
            this.f3493o00oOOoO = i;
            return this;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public AudioAttributesImplBase() {
        this.f3488o00oOOo0 = 0;
        this.f3489o00oOOoO = 0;
        this.f3490o00oOo00 = 0;
        this.f3491o00oOooO = -1;
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3489o00oOOoO = i;
        this.f3490o00oOo00 = i2;
        this.f3488o00oOOo0 = i3;
        this.f3491o00oOooO = i4;
    }

    public static int o00oOo0o(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f3489o00oOOoO == audioAttributesImplBase.o00oOo00() && this.f3490o00oOo00 == audioAttributesImplBase.getFlags() && this.f3488o00oOOo0 == audioAttributesImplBase.o00oOOoO() && this.f3491o00oOooO == audioAttributesImplBase.f3491o00oOooO;
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    @o0OO00OO
    public Object getAudioAttributes() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i = this.f3490o00oOo00;
        int o00oOo0O2 = o00oOo0O();
        if (o00oOo0O2 == 6) {
            i |= 4;
        } else if (o00oOo0O2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3489o00oOOoO), Integer.valueOf(this.f3490o00oOo00), Integer.valueOf(this.f3488o00oOOo0), Integer.valueOf(this.f3491o00oOooO)});
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOOo0() {
        return this.f3491o00oOooO;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOOoO() {
        return this.f3488o00oOOo0;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOo00() {
        return this.f3489o00oOOoO;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOo0O() {
        int i = this.f3491o00oOooO;
        return i != -1 ? i : AudioAttributesCompat.o00oOoO0(false, this.f3490o00oOo00, this.f3488o00oOOo0);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int o00oOooO() {
        return AudioAttributesCompat.o00oOoO0(true, this.f3490o00oOo00, this.f3488o00oOOo0);
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3491o00oOooO != -1) {
            sb.append(" stream=");
            sb.append(this.f3491o00oOooO);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.o00oOoOO(this.f3488o00oOOo0));
        sb.append(" content=");
        sb.append(this.f3489o00oOOoO);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3490o00oOo00).toUpperCase());
        return sb.toString();
    }
}
