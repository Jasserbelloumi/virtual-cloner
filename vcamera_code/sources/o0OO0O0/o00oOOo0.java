package o0OO0O0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0OO00o0.o00oo00O;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
/* loaded from: classes2.dex */
public class o00oOOo0 extends o00oo00O<MediaPlayer> implements IVLCVout.OnNewVideoLayoutListener {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f13116o00ooO = 2;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f13117o00ooO0o = 1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f13118o00ooOO = 4;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f13119o00ooOO0 = 3;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f13120o00ooOOo = 5;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f13121o00ooOo0 = 6;

    /* renamed from: o00oo  reason: collision with root package name */
    public HandlerThread f13122o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Context f13123o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public MediaPlayer f13124o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o0OO00o.o00oOOo0 f13125o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Handler f13126o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Handler f13127o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public Bundle f13128o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Media f13129o0O0o;

    /* renamed from: o0OO0O0.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0163o00oOOo0 implements Handler.Callback {
        public C0163o00oOOo0() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@oo0oO0 Message message) {
            try {
                switch (message.what) {
                    case 1:
                        o00oOOo0.this.o0O00O0o();
                        break;
                    case 2:
                        o00oOOo0.this.o0O00();
                        break;
                    case 3:
                        o00oOOo0.this.o0O00O();
                        break;
                    case 4:
                        o00oOOo0.this.o0O00O0();
                        break;
                    case 5:
                        o00oOOo0.this.o0OoO00O();
                        break;
                    case 6:
                        o00oOOo0.this.o0O000oo();
                        break;
                }
                o00oOOo0.this.f13126o00ooO0.obtainMessage(message.what).sendToTarget();
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOOoO extends Handler {
        public o00oOOoO(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@oo0oO0 Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    o00oOOo0.this.o00oo0o(4100);
                    return;
                case 2:
                    o00oOOo0.this.o00oo0o(o00oo00O.o00oOOoO.f13079o0OoOoOo);
                    return;
                case 3:
                    o00oOOo0.this.o00oo0o(o00oo00O.o00oOOoO.f13056o0O000Oo);
                    return;
                case 4:
                    o00oOOo0.this.o00oo0o(o00oo00O.o00oOOoO.f13078o0OoOoOO);
                    return;
                case 5:
                    o00oOOo0.this.o00oo0o(o00oo00O.o00oOOoO.f13058o0O000o0);
                    return;
                case 6:
                    o00oOOo0 o00oooo02 = o00oOOo0.this;
                    o00oooo02.f13031o00oOoOO = 2;
                    int i = o00oooo02.f13032o00oOoOo;
                    if (i == 3) {
                        o00oooo02.start();
                    } else if (i == 4) {
                        o00oooo02.pause();
                    } else if (i == 5 || i == 0) {
                        o00oooo02.reset();
                    }
                    o00oOOo0.this.o00oo0o(4097);
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOo00 implements IMedia.EventListener {
        public o00oOo00() {
        }

        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
        /* renamed from: o00oOOo0 */
        public void onEvent(IMedia.Event event) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Media.onEvent: ");
            o00oOOo02.append(event.type);
            o0OO0.o00oOOoO.o00oOOo0(o00oOOo02.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOo0O implements MediaPlayer.EventListener {
        public o00oOo0O() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
        /* renamed from: o00oOOo0 */
        public void onEvent(MediaPlayer.Event event) {
            String format;
            Bundle bundle;
            int timeChanged;
            String str;
            int i = event.type;
            int i2 = o00oo00O.o00oOOoO.f13063o0O00OO;
            if (i != 256) {
                if (i == 286) {
                    format = String.format("Event.RecordChanged: 0x%s", Integer.toHexString(i));
                } else if (i == 273) {
                    format = String.format("Event.LengthChanged: 0x%s", Integer.toHexString(i));
                } else if (i == 274) {
                    format = String.format("Event.Vout: 0x%s", Integer.toHexString(i));
                } else if (i == 276) {
                    format = String.format("Event.ESAdded: 0x%s", Integer.toHexString(i));
                } else if (i != 277) {
                    switch (i) {
                        case MediaPlayer.Event.Opening /* 258 */:
                            format = String.format("Event.Opening: 0x%s", Integer.toHexString(i));
                            break;
                        case MediaPlayer.Event.Buffering /* 259 */:
                            o0OO0.o00oOOoO.o00oOOo0(String.format("Event.Buffering: 0x%s", Integer.toHexString(i)));
                            int buffering = (int) event.getBuffering();
                            i2 = buffering == 0 ? 4105 : 4096;
                            o00oOOo0.this.o00oo0O(buffering);
                            if (buffering == 100) {
                                i2 = o00oo00O.o00oOOoO.f13082o0ooOoOO;
                                break;
                            }
                            break;
                        case MediaPlayer.Event.Playing /* 260 */:
                            format = String.format("Event.Playing: 0x%s", Integer.toHexString(i));
                            break;
                        case MediaPlayer.Event.Paused /* 261 */:
                            format = String.format("Event.Paused: 0x%s", Integer.toHexString(i));
                            break;
                        case 262:
                            format = String.format("Event.Stopped: 0x%s", Integer.toHexString(i));
                            break;
                        default:
                            switch (i) {
                                case MediaPlayer.Event.EndReached /* 265 */:
                                    o0OO0.o00oOOoO.o00oOOo0(String.format("Event.EndReached: 0x%s", Integer.toHexString(i)));
                                    o00oOOo0.this.o0O000Oo();
                                    i2 = 4096;
                                    break;
                                case MediaPlayer.Event.EncounteredError /* 266 */:
                                    format = String.format("Event.EncounteredError: 0x%s", Integer.toHexString(i));
                                    break;
                                case MediaPlayer.Event.TimeChanged /* 267 */:
                                    o0OO0.o00oOOoO.o00oOOo0(String.format("Event.TimeChanged: 0x%s", Integer.toHexString(i)));
                                    bundle = o00oOOo0.this.f13128o00ooO0O;
                                    timeChanged = (int) event.getTimeChanged();
                                    str = o00oo00O.o00oOo00.f13083o00oOOo0;
                                    bundle.putInt(str, timeChanged);
                                    break;
                                case MediaPlayer.Event.PositionChanged /* 268 */:
                                    o0OO0.o00oOOoO.o00oOOo0(String.format("Event.PositionChanged: 0x%s", Integer.toHexString(i)));
                                    bundle = o00oOOo0.this.f13128o00ooO0O;
                                    timeChanged = (int) event.getPositionChanged();
                                    str = o00oo00O.o00oOo00.f13084o00oOOoO;
                                    bundle.putInt(str, timeChanged);
                                    break;
                                case MediaPlayer.Event.SeekableChanged /* 269 */:
                                    o0OO0.o00oOOoO.o00oOOo0(String.format("Event.SeekableChanged: 0x%s", Integer.toHexString(i)));
                                    i2 = o00oo00O.o00oOOoO.f13050o0O00;
                                    break;
                                case 270:
                                    format = String.format("Event.PausableChanged: 0x%s", Integer.toHexString(i));
                                    break;
                                default:
                                    i2 = 4096;
                                    break;
                            }
                    }
                } else {
                    format = String.format("Event.ESDeleted: 0x%s", Integer.toHexString(i));
                }
                o0OO0.o00oOOoO.o00oOOo0(format);
                i2 = 4096;
            } else {
                o0OO0.o00oOOoO.o00oOOo0(String.format("Event.MediaChanged: 0x%s", Integer.toHexString(i)));
                i2 = o00oo00O.o00oOOoO.f13071o0O00o0o;
            }
            o00oOOo0.this.f13128o00ooO0O.putInt(o00oo00O.o00oOo00.f13086o00oOo0O, event.type);
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.o00oo0oO(i2, o00oooo02.f13128o00ooO0O);
            o00oOOo0.this.o0O00OO();
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOoO implements IVLCVout.Callback {
        public o00oOoO() {
        }

        @Override // org.videolan.libvlc.interfaces.IVLCVout.Callback
        public void onSurfacesCreated(IVLCVout iVLCVout) {
            o0OO0.o00oOOoO.o00oOOo0("onSurfacesCreated");
        }

        @Override // org.videolan.libvlc.interfaces.IVLCVout.Callback
        public void onSurfacesDestroyed(IVLCVout iVLCVout) {
            o0OO0.o00oOOoO.o00oOOo0("onSurfacesDestroyed");
        }
    }

    public o00oOOo0(@oo0oO0 Context context) {
        this(context, o0O000O());
    }

    public o00oOOo0(@oo0oO0 Context context, @o0OO00OO ArrayList<String> arrayList) {
        this.f13128o00ooO0O = new Bundle();
        this.f13123o00oo0o = context.getApplicationContext();
        this.f13124o00oo0o0 = new MediaPlayer(new LibVLC(context, arrayList));
        o0O000o0();
    }

    public static ArrayList<String> o0O000O() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("--network-caching=200");
        return arrayList;
    }

    @Override // o0OO00o0.o00oOo00
    public int getCurrentPosition() {
        return (int) this.f13124o00oo0o0.getTime();
    }

    @Override // o0OO00o0.o00oOo00
    public int getDuration() {
        return (int) this.f13124o00oo0o0.getLength();
    }

    @Override // o0OO00o0.o00oOo00
    public boolean isPlaying() {
        if (o0O000()) {
            return this.f13124o00oo0o0.isPlaying();
        }
        return false;
    }

    @Override // o0OO00o0.o00oo00O, o0OO00o0.o00oOo00
    public int o00oOOo0() {
        return o0O000() ? this.f13124o00oo0o0.getPlayerState() : this.f13031o00oOoOO;
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOOoO(@oo0oO0 Surface surface) {
        this.f13124o00oo0o0.getVLCVout().setVideoSurface(surface, null);
        if (!this.f13124o00oo0o0.getVLCVout().areViewsAttached()) {
            this.f13124o00oo0o0.getVLCVout().attachViews(this);
        }
        o00oo0o(4099);
    }

    @Override // o0OO00o0.o00oOo00
    public void o00oOo00(@oo0oO0 o0OO00o.o00oOOo0 o00oooo02) {
        try {
            if (this.f13125o00oo0oO != null) {
                o0O00OOO();
            }
            this.f13125o00oo0oO = o00oooo02;
            o0O0000o();
            Media media = null;
            if (!TextUtils.isEmpty(this.f13125o00oo0oO.o00oOoO())) {
                media = this.f13125o00oo0oO.o00oOoO().contains("://") ? new Media(this.f13124o00oo0o0.getLibVLC(), Uri.parse(this.f13125o00oo0oO.o00oOoO())) : new Media(this.f13124o00oo0o0.getLibVLC(), this.f13125o00oo0oO.o00oOoO());
            } else if (this.f13125o00oo0oO.o00oOoOO() != null) {
                media = new Media(this.f13124o00oo0o0.getLibVLC(), this.f13125o00oo0oO.o00oOoOO());
            } else if (this.f13125o00oo0oO.o00oOooO(this.f13123o00oo0o) != null) {
                media = new Media(this.f13124o00oo0o0.getLibVLC(), this.f13125o00oo0oO.o00oOooO(this.f13123o00oo0o));
            } else {
                o0OO0.o00oOOoO.o00oOOo0(this.f13125o00oo0oO.toString());
            }
            if (media != null) {
                o0OO00o.o00oOOo0 o00oooo03 = this.f13125o00oo0oO;
                if (o00oooo03 instanceof o0OO0O0O.o00oOOo0) {
                    o0O000o(media, ((o0OO0O0O.o00oOOo0) o00oooo03).o00oOOo0());
                }
                media.setEventListener((IMedia.EventListener) new o00oOo00());
                this.f13129o0O0o = media;
                this.f13031o00oOoOO = 1;
                this.f13032o00oOoOo = 1;
                this.f13127o00ooO00.obtainMessage(6).sendToTarget();
            }
        } catch (Exception e) {
            o00oo0OO(e, false);
            this.f13031o00oOoOO = -1;
        }
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOo0O(@oo0oO0 SurfaceHolder surfaceHolder) {
        this.f13124o00oo0o0.getVLCVout().setVideoSurface(surfaceHolder.getSurface(), surfaceHolder);
        if (!this.f13124o00oo0o0.getVLCVout().areViewsAttached()) {
            this.f13124o00oo0o0.getVLCVout().attachViews(this);
        }
        o00oo0o(4098);
    }

    @Override // o0OO00o0.o00oo00O, o0OO00o0.o00oOo00
    public void o00oOoO(boolean z) {
        this.f13035o00oo0 = z;
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oOoOo(@oo0oO0 SurfaceTexture surfaceTexture) {
        this.f13124o00oo0o0.getVLCVout().setVideoSurface(surfaceTexture);
        if (!this.f13124o00oo0o0.getVLCVout().areViewsAttached()) {
            this.f13124o00oo0o0.getVLCVout().attachViews(this);
        }
        o00oo0o(4099);
    }

    @Override // o0OO00o0.o00oOo00
    public float o00oOoo0() {
        return this.f13124o00oo0o0.getRate();
    }

    @Override // o0OO00o0.o00oOo00
    public void o00oOooO(float f) {
        this.f13124o00oo0o0.setRate(f);
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oo0() {
        if (this.f13124o00oo0o0.getVLCVout().areViewsAttached()) {
            this.f13124o00oo0o0.getVLCVout().detachViews();
        }
    }

    @Override // o0OO00o0.o00oOoO
    public void o00oo00O(int i, int i2) {
        this.f13124o00oo0o0.getVLCVout().setWindowSize(i, i2);
        MediaPlayer mediaPlayer = this.f13124o00oo0o0;
        mediaPlayer.setAspectRatio(i + ":" + i2);
        this.f13124o00oo0o0.setScale(0.0f);
    }

    public final void o0O00() {
        this.f13124o00oo0o0.pause();
        this.f13031o00oOoOO = 4;
        o00oo0o(o00oo00O.o00oOOoO.f13079o0OoOoOo);
        o0OO0.o00oOOoO.o00oOOo0("pause");
    }

    public final boolean o0O000() {
        return this.f13124o00oo0o0 != null;
    }

    public final void o0O0000o() {
        this.f13124o00oo0o0.setEventListener((MediaPlayer.EventListener) new o00oOo0O());
        this.f13124o00oo0o0.setVideoTrackEnabled(true);
        this.f13124o00oo0o0.setAspectRatio(null);
        this.f13124o00oo0o0.setScale(0.0f);
        this.f13124o00oo0o0.getVLCVout().addCallback(new o00oOoO());
    }

    public final void o0O000Oo() {
        if (o00oOo0o()) {
            o00oOo00(this.f13125o00oo0oO);
            start();
        }
    }

    public void o0O000o(@oo0oO0 IMedia iMedia, @o0OO00OO Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                iMedia.addOption(str);
            }
        }
    }

    public final void o0O000o0() {
        HandlerThread handlerThread = new HandlerThread("VLC-Thread");
        this.f13122o00oo = handlerThread;
        handlerThread.start();
        this.f13127o00ooO00 = new Handler(this.f13122o00oo.getLooper(), new C0163o00oOOo0());
        this.f13126o00ooO0 = new o00oOOoO(Looper.getMainLooper());
    }

    public final void o0O000oo() {
        Media media = this.f13129o0O0o;
        if (media != null) {
            this.f13124o00oo0o0.setMedia(media);
            this.f13129o0O0o.release();
        }
    }

    public final void o0O00O() {
        IMedia media = this.f13124o00oo0o0.getMedia();
        if (media != null) {
            this.f13124o00oo0o0.stop();
            o0OO0.o00oOOoO.o00oOOo0("stop");
            this.f13124o00oo0o0.setMedia(null);
            if (!media.isReleased()) {
                media.release();
            }
        }
        this.f13031o00oOoOO = 5;
        o00oo0o(o00oo00O.o00oOOoO.f13056o0O000Oo);
    }

    public final void o0O00O0() {
        o0OO0.o00oOOoO.o00oOOo0("release");
        if (!this.f13124o00oo0o0.getLibVLC().isReleased()) {
            this.f13124o00oo0o0.getLibVLC().release();
        }
        if (!this.f13124o00oo0o0.isReleased()) {
            this.f13124o00oo0o0.release();
        }
        o0O00OOO();
        this.f13031o00oOoOO = 0;
        o00oo0o(o00oo00O.o00oOOoO.f13078o0OoOoOO);
        HandlerThread handlerThread = this.f13122o00oo;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public final void o0O00O0o() {
        this.f13124o00oo0o0.play();
        this.f13031o00oOoOO = 3;
        o00oo0o(4100);
        o0OO0.o00oOOoO.o00oOOo0(TtmlNode.START);
    }

    public final void o0O00OO() {
        Bundle bundle = this.f13128o00ooO0O;
        if (bundle != null) {
            bundle.clear();
        }
    }

    public final void o0O00OOO() {
        if (o0O000()) {
            this.f13124o00oo0o0.setEventListener((MediaPlayer.EventListener) null);
        }
    }

    public boolean o0O00Oo(String str) {
        return this.f13124o00oo0o0.record(str);
    }

    public final void o0OoO00O() {
        this.f13124o00oo0o0.setMedia(null);
        this.f13031o00oOoOO = 0;
        o00oo0o(o00oo00O.o00oOOoO.f13058o0O000o0);
    }

    public final boolean o0OoOoOO() {
        return o0O000() && this.f13124o00oo0o0.hasMedia();
    }

    @Override // o0OO00o0.o00oOo00
    /* renamed from: o0OoOoOo */
    public MediaPlayer o00oOoOO() {
        return this.f13124o00oo0o0;
    }

    public boolean o0oO0Ooo() {
        return this.f13124o00oo0o0.record(null);
    }

    public final boolean o0ooOoOO() {
        return this.f13124o00oo0o0.isReleased();
    }

    @Override // org.videolan.libvlc.interfaces.IVLCVout.OnNewVideoLayoutListener
    public void onNewVideoLayout(IVLCVout iVLCVout, int i, int i2, int i3, int i4, int i5, int i6) {
        o0OO0.o00oOOoO.o00oOOo0(String.format("onNewVideoLayout: %d * %d | visible: %d * %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        if (i * i2 != 0) {
            o0O0o(i, i2);
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void pause() {
        int i;
        try {
            if (o0OoOoOO() && ((i = this.f13031o00oOoOO) == 2 || i == 3 || i == 6)) {
                this.f13127o00ooO00.obtainMessage(2).sendToTarget();
            } else {
                o0OO0.o00oOOoO.o00oOOo0("currentState = " + this.f13031o00oOoOO);
            }
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
        this.f13032o00oOoOo = 4;
    }

    @Override // o0OO00o0.o00oOo00
    public void release() {
        if (o0O000()) {
            this.f13127o00ooO00.obtainMessage(4).sendToTarget();
        }
        this.f13032o00oOoOo = 0;
    }

    @Override // o0OO00o0.o00oOo00
    public void reset() {
        if (o0O000()) {
            this.f13127o00ooO00.obtainMessage(5).sendToTarget();
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void seekTo(int i) {
        if (!this.f13124o00oo0o0.hasMedia() || o0ooOoOO()) {
            return;
        }
        this.f13124o00oo0o0.setTime(i);
        Bundle bundle = new Bundle();
        bundle.putInt(o00oo00O.o00oOo00.f13083o00oOOo0, i);
        o00oo0oO(o00oo00O.o00oOOoO.f13059o0O000oo, bundle);
    }

    @Override // o0OO00o0.o00oOo00
    public void setVolume(float f) {
        if (o0O000()) {
            this.f13124o00oo0o0.setVolume((int) f);
        }
    }

    @Override // o0OO00o0.o00oOo00
    public void start() {
        int i;
        try {
            if (o0OoOoOO() && ((i = this.f13031o00oOoOO) == 2 || i == 4 || i == 6)) {
                this.f13127o00ooO00.obtainMessage(1).sendToTarget();
            }
        } catch (Exception e) {
            o00oo0OO(e, true);
        }
        this.f13032o00oOoOo = 3;
    }

    @Override // o0OO00o0.o00oOo00
    public void stop() {
        int i;
        if (o0OoOoOO() && ((i = this.f13031o00oOoOO) == 2 || i == 3 || i == 4 || i == 6)) {
            this.f13127o00ooO00.obtainMessage(3).sendToTarget();
        } else {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("currentState = ");
            o00oOOo02.append(this.f13031o00oOoOO);
            o0OO0.o00oOOoO.o00oOOo0(o00oOOo02.toString());
        }
        this.f13032o00oOoOo = 5;
    }

    public o00oOOo0(@oo0oO0 Context context, @oo0oO0 MediaPlayer mediaPlayer) {
        this.f13128o00ooO0O = new Bundle();
        this.f13123o00oo0o = context.getApplicationContext();
        this.f13124o00oo0o0 = mediaPlayer;
        o0O000o0();
    }
}
