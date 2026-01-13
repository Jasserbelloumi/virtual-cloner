package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final AudioAttributesCompat f3628o00oOoO0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f3629o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f3630o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Handler f3631o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final boolean f3632o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Object f3633o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final AudioAttributesCompat f3634o00oOooO;

    @o0OOooO0(26)
    /* renamed from: androidx.media.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0033o00oOOo0 {
        @o0O0O0Oo
        public static AudioFocusRequest o00oOOo0(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f3635o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f3636o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Handler f3637o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f3638o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public AudioAttributesCompat f3639o00oOooO;

        public o00oOOoO(int i) {
            this.f3639o00oOooO = o00oOOo0.f3628o00oOoO0;
            o00oOooO(i);
        }

        public o00oOOoO(@oo0oO0 o00oOOo0 o00oooo02) {
            this.f3639o00oOooO = o00oOOo0.f3628o00oOoO0;
            if (o00oooo02 == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.f3635o00oOOo0 = o00oooo02.o00oOo0O();
            this.f3636o00oOOoO = o00oooo02.o00oOo0o();
            this.f3637o00oOo00 = o00oooo02.o00oOooO();
            this.f3639o00oOooO = o00oooo02.o00oOOoO();
            this.f3638o00oOo0O = o00oooo02.o00oOoO0();
        }

        public static boolean o00oOOoO(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public o00oOOo0 o00oOOo0() {
            if (this.f3636o00oOOoO != null) {
                return new o00oOOo0(this.f3635o00oOOo0, this.f3636o00oOOoO, this.f3637o00oOo00, this.f3639o00oOooO, this.f3638o00oOo0O);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @oo0oO0
        public o00oOOoO o00oOo00(@oo0oO0 AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat != null) {
                this.f3639o00oOooO = audioAttributesCompat;
                return this;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }

        @oo0oO0
        public o00oOOoO o00oOo0O(@oo0oO0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return o00oOo0o(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @oo0oO0
        public o00oOOoO o00oOo0o(@oo0oO0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @oo0oO0 Handler handler) {
            if (onAudioFocusChangeListener != null) {
                if (handler != null) {
                    this.f3636o00oOOoO = onAudioFocusChangeListener;
                    this.f3637o00oOo00 = handler;
                    return this;
                }
                throw new IllegalArgumentException("Handler must not be null");
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }

        @oo0oO0
        public o00oOOoO o00oOoO0(boolean z) {
            this.f3638o00oOo0O = z;
            return this;
        }

        @oo0oO0
        public o00oOOoO o00oOooO(int i) {
            if (o00oOOoO(i)) {
                this.f3635o00oOOo0 = i;
                return this;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Illegal audio focus gain type ", i));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f3640o00oo0Oo = 2782386;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f3641o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Handler f3642o00oo0O0;

        public o00oOo00(@oo0oO0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @oo0oO0 Handler handler) {
            this.f3641o00oo0O = onAudioFocusChangeListener;
            this.f3642o00oo0O0 = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 2782386) {
                this.f3641o00oo0O.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Handler handler = this.f3642o00oo0O0;
            handler.sendMessage(Message.obtain(handler, f3640o00oo0Oo, i, 0));
        }
    }

    static {
        AudioAttributesCompat.o00oOo0O o00ooo0o2 = new AudioAttributesCompat.o00oOo0O();
        o00ooo0o2.f3484o00oOOo0.o00oOOo0(1);
        f3628o00oOoO0 = o00ooo0o2.o00oOOo0();
    }

    public o00oOOo0(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.f3629o00oOOo0 = i;
        this.f3631o00oOo00 = handler;
        this.f3634o00oOooO = audioAttributesCompat;
        this.f3632o00oOo0O = z;
        this.f3630o00oOOoO = onAudioFocusChangeListener;
        this.f3633o00oOo0o = C0033o00oOOo0.o00oOOo0(i, o00oOOo0(), z, onAudioFocusChangeListener, handler);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oOOo0) {
            o00oOOo0 o00oooo02 = (o00oOOo0) obj;
            return this.f3629o00oOOo0 == o00oooo02.f3629o00oOOo0 && this.f3632o00oOo0O == o00oooo02.f3632o00oOo0O && oO0Ooooo.o00oOOo0.o00oOOo0(this.f3630o00oOOoO, o00oooo02.f3630o00oOOoO) && oO0Ooooo.o00oOOo0.o00oOOo0(this.f3631o00oOo00, o00oooo02.f3631o00oOo00) && oO0Ooooo.o00oOOo0.o00oOOo0(this.f3634o00oOooO, o00oooo02.f3634o00oOooO);
        }
        return false;
    }

    public int hashCode() {
        return oO0Ooooo.o00oOOo0.o00oOOoO(Integer.valueOf(this.f3629o00oOOo0), this.f3630o00oOOoO, this.f3631o00oOo00, this.f3634o00oOooO, Boolean.valueOf(this.f3632o00oOo0O));
    }

    @o0OOooO0(21)
    public AudioAttributes o00oOOo0() {
        AudioAttributesCompat audioAttributesCompat = this.f3634o00oOooO;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.o00oOoO();
        }
        return null;
    }

    @oo0oO0
    public AudioAttributesCompat o00oOOoO() {
        return this.f3634o00oOooO;
    }

    @o0OOooO0(26)
    public AudioFocusRequest o00oOo00() {
        return (AudioFocusRequest) this.f3633o00oOo0o;
    }

    public int o00oOo0O() {
        return this.f3629o00oOOo0;
    }

    @oo0oO0
    public AudioManager.OnAudioFocusChangeListener o00oOo0o() {
        return this.f3630o00oOOoO;
    }

    public boolean o00oOoO0() {
        return this.f3632o00oOo0O;
    }

    @oo0oO0
    public Handler o00oOooO() {
        return this.f3631o00oOo00;
    }
}
