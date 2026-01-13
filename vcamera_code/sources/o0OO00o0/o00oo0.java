package o0OO00o0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o00oOooO.oo0oO0;
import o0OO00o0.o00oo00O;
/* loaded from: classes2.dex */
public class o00oo0 extends o0OO00o0.o00oo00O<MediaPlayer> {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Context f13021o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public MediaPlayer f13022o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o0OO00o.o00oOOo0 f13023o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Bundle f13024o0O0o;

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements MediaPlayer.OnVideoSizeChangedListener {
        public o00oOOo0() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            o00oo0.this.o0O0o(i, i2);
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOOoO implements MediaPlayer.OnPreparedListener {
        public o00oOOoO() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            o0OO0.o00oOOoO.o00oOOo0("onPrepared");
            o00oo0 o00oo0Var = o00oo0.this;
            o00oo0Var.f13031o00oOoOO = 2;
            o00oo0Var.o00oo0o(o00oo00O.o00oOOoO.f13060o0O00O);
            o00oo0 o00oo0Var2 = o00oo0.this;
            int i = o00oo0Var2.f13032o00oOoOo;
            if (i == 3) {
                o00oo0Var2.start();
            } else if (i == 4) {
                o00oo0Var2.pause();
            } else if (i == 5 || i == 0) {
                o00oo0Var2.reset();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOo00 implements MediaPlayer.OnBufferingUpdateListener {
        public o00oOo00() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            o00oo0.this.o00oo0O(i);
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOo0O implements MediaPlayer.OnCompletionListener {
        public o00oOo0O() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            o00oo0 o00oo0Var = o00oo0.this;
            o00oo0Var.f13031o00oOoOO = 6;
            o00oo0Var.f13032o00oOoOo = 6;
            o00oo0Var.o00oo0o(o00oo00O.o00oOOoO.f13077o0OoO00O);
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOoO implements MediaPlayer.OnErrorListener {
        public o00oOoO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            o0OO0.o00oOOoO.o00ooO0O("onError: " + i + ", extra:" + i2);
            int i3 = i != -1010 ? i != -1007 ? i != -1004 ? i != -110 ? i != 1 ? i != 100 ? i != 200 ? o00oo00O.o00oOOo0.f13042o00ooo0o : o00oo00O.o00oOOo0.f13045o00oooOo : o00oo00O.o00oOOo0.f13044o00oooOO : o00oo00O.o00oOOo0.f13043o00oooO : o00oo00O.o00oOOo0.f13049o00ooooo : o00oo00O.o00oOOo0.f13047o00oooo0 : o00oo00O.o00oOOo0.f13046o00oooo : o00oo00O.o00oOOo0.f13048o00ooooO;
            o00oo0.this.f13024o0O0o.putInt(o00oo00O.o00oOo00.f13086o00oOo0O, i);
            o00oo0.this.f13024o0O0o.putInt(o00oo00O.o00oOo00.f13087o00oOo0o, i2);
            o00oo0 o00oo0Var = o00oo0.this;
            o00oo0Var.o00oo0o0(i3, o00oo0Var.f13024o0O0o);
            o00oo0.this.o00ooOo();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class o00oo00O implements MediaPlayer.OnInfoListener {
        public o00oo00O() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            int i3;
            String str;
            if (i != 1) {
                if (i == 2) {
                    str = "MEDIA_INFO_STARTED_AS_NEXT";
                } else if (i == 3) {
                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_VIDEO_RENDERING_START");
                    i3 = o00oo00O.o00oOOoO.f13061o0O00O0;
                } else if (i == 804) {
                    str = "MEDIA_INFO_AUDIO_NOT_PLAYING";
                } else if (i == 805) {
                    str = "MEDIA_INFO_VIDEO_NOT_PLAYING";
                } else if (i == 901) {
                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_UNSUPPORTED_SUBTITLE");
                    i3 = o00oo00O.o00oOOoO.f13072o0O00oO0;
                } else if (i != 902) {
                    switch (i) {
                        case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING /* 700 */:
                            str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                            break;
                        case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_BUFFERING_START");
                            i3 = o00oo00O.o00oOOoO.f13057o0O000o;
                            break;
                        case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_BUFFERING_END");
                            i3 = o00oo00O.o00oOOoO.f13082o0ooOoOO;
                            break;
                        default:
                            switch (i) {
                                case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING /* 800 */:
                                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_BAD_INTERLEAVING");
                                    i3 = o00oo00O.o00oOOoO.f13069o0O00o00;
                                    break;
                                case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_NOT_SEEKABLE");
                                    i3 = o00oo00O.o00oOOoO.f13070o0O00o0O;
                                    break;
                                case org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_METADATA_UPDATE");
                                    i3 = o00oo00O.o00oOOoO.f13071o0O00o0o;
                                    break;
                                default:
                                    str = "onInfo:" + i;
                                    break;
                            }
                    }
                } else {
                    o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_SUBTITLE_TIMED_OUT");
                    i3 = o00oo00O.o00oOOoO.f13073o0O0O0O;
                }
                o0OO0.o00oOOoO.o00oOOo0(str);
                i3 = 4096;
            } else {
                o0OO0.o00oOOoO.o00oOOo0("MEDIA_INFO_UNKNOWN");
                i3 = o00oo00O.o00oOOoO.f13076o0O0oo0o;
            }
            o00oo0.this.f13024o0O0o.putInt(o00oo00O.o00oOo00.f13086o00oOo0O, i);
            o00oo0.this.f13024o0O0o.putInt(o00oo00O.o00oOo00.f13087o00oOo0o, i2);
            o00oo0 o00oo0Var = o00oo0.this;
            o00oo0Var.o00oo0oO(i3, o00oo0Var.f13024o0O0o);
            o00oo0.this.o00ooOo();
            return true;
        }
    }

    public o00oo0(@oo0oO0 Context context) {
        this(context, null);
    }

    public o00oo0(@oo0oO0 Context context, MediaPlayer mediaPlayer) {
        this.f13024o0O0o = new Bundle();
        this.f13021o00oo0o = context.getApplicationContext();
        this.f13022o00oo0o0 = mediaPlayer == null ? new MediaPlayer() : mediaPlayer;
    }

    @Override // o0OO00o0.o00oOo00
    public int getCurrentPosition() {
        if (o00ooOO()) {
            return this.f13022o00oo0o0.getCurrentPosition();
        }
        return -1;
    }

    @Override // o0OO00o0.o00oOo00
    public int getDuration() {
        if (o00ooOO()) {
            return this.f13022o00oo0o0.getDuration();
        }
        return -1;
    }

    @Override // o0OO00o0.o00oOo00
    public boolean isPlaying() {
        try {
            if (o00ooOO()) {
                return this.f13022o00oo0o0.isPlaying();
            }
        } catch (Exception e) {
            o00oo0OO(e, false);
        }
        return false;
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOOoO(@oo0oO0 Surface surface) {
        this.f13022o00oo0o0.setSurface(surface);
        o00oo0o(4099);
    }

    @Override // o0OO00o0.o00oOo00
    public void o00oOo00(@oo0oO0 o0OO00o.o00oOOo0 o00oooo02) {
        try {
            if (this.f13023o00oo0oO != null) {
                this.f13022o00oo0o0.stop();
                this.f13022o00oo0o0.reset();
                o00ooOoO();
            }
            this.f13023o00oo0oO = o00oooo02;
            o00ooOO0();
            if (!TextUtils.isEmpty(this.f13023o00oo0oO.o00oOoO())) {
                this.f13022o00oo0o0.setDataSource(this.f13023o00oo0oO.o00oOoO());
            } else if (this.f13023o00oo0oO.o00oOoOO() != null) {
                this.f13022o00oo0o0.setDataSource(this.f13021o00oo0o, this.f13023o00oo0oO.o00oOoOO(), this.f13023o00oo0oO.o00oOoO0());
            } else if (this.f13023o00oo0oO.o00oOooO(this.f13021o00oo0o) != null) {
                this.f13022o00oo0o0.setDataSource(this.f13023o00oo0oO.o00oOooO(this.f13021o00oo0o));
            } else {
                o0OO0.o00oOOoO.o00oOOo0(this.f13023o00oo0oO.toString());
            }
            this.f13022o00oo0o0.setAudioStreamType(3);
            this.f13022o00oo0o0.setLooping(o00oOo0o());
            this.f13022o00oo0o0.prepareAsync();
            this.f13031o00oOoOO = 1;
            this.f13032o00oOoOo = 1;
            o00oo0o(4097);
        } catch (Exception e) {
            o00oo0OO(e, false);
            this.f13031o00oOoOO = -1;
        }
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOo0O(@oo0oO0 SurfaceHolder surfaceHolder) {
        this.f13022o00oo0o0.setDisplay(surfaceHolder);
        this.f13022o00oo0o0.setScreenOnWhilePlaying(true);
        o00oo0o(4098);
    }

    @Override // o0OO00o0.o00oo00O, o0OO00o0.o00oOo00
    public void o00oOoO(boolean z) {
        o00oOoO(z);
        if (o00ooOO()) {
            this.f13022o00oo0o0.setLooping(z);
        }
    }

    @Override // o0OO00o0.o00oo00O, o0OO00o0.o00oOoO
    public int o00oOoO0() {
        return this.f13022o00oo0o0.getVideoHeight();
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOoOo(@oo0oO0 SurfaceTexture surfaceTexture) {
        o00oOOoO(new Surface(surfaceTexture));
    }

    @Override // o0OO00o0.o00oOo00
    public float o00oOoo0() {
        try {
            if (o00ooOO()) {
                return this.f13022o00oo0o0.getPlaybackParams().getSpeed();
            }
            return 1.0f;
        } catch (Exception e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void o00oOooO(float f) {
        try {
            if (o00ooOO()) {
                this.f13022o00oo0o0.getPlaybackParams().setSpeed(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o0OO00o0.o00oo00O, o0OO00o0.o00oOoO
    public int o00oOooo() {
        return this.f13022o00oo0o0.getVideoWidth();
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oo0() {
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oo00O(int i, int i2) {
    }

    public final boolean o00ooOO() {
        return this.f13022o00oo0o0 != null;
    }

    public final void o00ooOO0() {
        this.f13022o00oo0o0.setOnVideoSizeChangedListener(new o00oOOo0());
        this.f13022o00oo0o0.setOnPreparedListener(new o00oOOoO());
        this.f13022o00oo0o0.setOnBufferingUpdateListener(new o00oOo00());
        this.f13022o00oo0o0.setOnCompletionListener(new o00oOo0O());
        this.f13022o00oo0o0.setOnErrorListener(new o00oOoO());
        this.f13022o00oo0o0.setOnInfoListener(new o00oo00O());
    }

    @Override // o0OO00o0.o00oOo00
    /* renamed from: o00ooOOo */
    public MediaPlayer o00oOoOO() {
        return this.f13022o00oo0o0;
    }

    public final void o00ooOo() {
        Bundle bundle = this.f13024o0O0o;
        if (bundle != null) {
            bundle.clear();
        }
    }

    public final boolean o00ooOo0() {
        return o00ooOO() && this.f13023o00oo0oO != null;
    }

    public final void o00ooOoO() {
        if (o00ooOO()) {
            this.f13022o00oo0o0.setOnVideoSizeChangedListener(null);
            this.f13022o00oo0o0.setOnPreparedListener(null);
            this.f13022o00oo0o0.setOnBufferingUpdateListener(null);
            this.f13022o00oo0o0.setOnCompletionListener(null);
            this.f13022o00oo0o0.setOnErrorListener(null);
            this.f13022o00oo0o0.setOnInfoListener(null);
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void pause() {
        String str;
        int i;
        try {
            if (o00ooOo0() && ((i = this.f13031o00oOoOO) == 2 || i == 3 || i == 6)) {
                this.f13022o00oo0o0.pause();
                this.f13031o00oOoOO = 4;
                o00oo0o(o00oo00O.o00oOOoO.f13079o0OoOoOo);
                str = "pause";
            } else {
                str = "currentState = " + this.f13031o00oOoOO;
            }
            o0OO0.o00oOOoO.o00oOOo0(str);
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
        this.f13032o00oOoOo = 4;
    }

    @Override // o0OO00o0.o00oOo00
    public void release() {
        if (o00ooOO()) {
            this.f13022o00oo0o0.release();
            this.f13031o00oOoOO = 0;
            o00oo0o(o00oo00O.o00oOOoO.f13078o0OoOoOO);
            o0OO0.o00oOOoO.o00oOOo0("release");
        }
        o00ooOoO();
        this.f13032o00oOoOo = 0;
    }

    @Override // o0OO00o0.o00oOo00
    public void reset() {
        if (o00ooOO()) {
            this.f13022o00oo0o0.reset();
            this.f13031o00oOoOO = 0;
            o00oo0o(o00oo00O.o00oOOoO.f13058o0O000o0);
            o0OO0.o00oOOoO.o00oOOo0("reset");
        }
        this.f13032o00oOoOo = 0;
    }

    @Override // o0OO00o0.o00oOo00
    public void seekTo(int i) {
        try {
            if (o00ooOO()) {
                int i2 = this.f13031o00oOoOO;
                if (i2 == 2 || i2 == 4 || i2 == 6) {
                    this.f13022o00oo0o0.seekTo(i);
                    Bundle bundle = new Bundle();
                    bundle.putInt(o00oo00O.o00oOo00.f13083o00oOOo0, i);
                    o00oo0oO(o00oo00O.o00oOOoO.f13059o0O000oo, bundle);
                }
            }
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void setVolume(float f) {
        if (o00ooOO()) {
            this.f13022o00oo0o0.setVolume(f, f);
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void start() {
        int i;
        try {
            if (o00ooOo0() && ((i = this.f13031o00oOoOO) == 2 || i == 4 || i == 5 || i == 6)) {
                this.f13022o00oo0o0.start();
                this.f13031o00oOoOO = 3;
                o0OO0.o00oOOoO.o00oOOo0(TtmlNode.START);
                o00oo0o(4100);
            } else {
                o0OO0.o00oOOoO.o00oOOo0("currentState = " + this.f13031o00oOoOO);
            }
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
        this.f13032o00oOoOo = 3;
    }

    @Override // o0OO00o0.o00oOo00
    public void stop() {
        String str;
        int i;
        try {
            if (o00ooOo0() && ((i = this.f13031o00oOoOO) == 2 || i == 3 || i == 4 || i == 6)) {
                this.f13022o00oo0o0.stop();
                this.f13031o00oOoOO = 5;
                o00oo0o(o00oo00O.o00oOOoO.f13056o0O000Oo);
                str = "stop";
            } else {
                str = "currentState = " + this.f13031o00oOoOO;
            }
            o0OO0.o00oOOoO.o00oOOo0(str);
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
        this.f13032o00oOoOo = 5;
    }
}
