package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.Image;
import android.media.MediaPlayer;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.github.crow_misia.libyuv.AbgrBuffer;
import io.github.crow_misia.libyuv.I420Buffer;
import io.github.crow_misia.libyuv.I422Buffer;
import io.github.crow_misia.libyuv.I444Buffer;
import io.github.crow_misia.libyuv.Nv12Buffer;
import io.github.crow_misia.libyuv.Nv21Buffer;
import io.github.crow_misia.libyuv.Rgb565Buffer;
import io.github.crow_misia.libyuv.RgbaBuffer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import multispace.multiapp.clone.type.SettingItem;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OO0;
import o0OOoOo0.ooOOO0Oo;
import o0OOoo0O.o0OO0oO0;
import o0OOoo0O.oO000OOo;
import o0OOoo0O.ooOOOOoo;
import o0Oo0.o00oOoO;
import o0Oo00oo.o0O000o0;
import o0ooO0O0.oO0OO0O;
import org.videolan.libvlc.MediaDiscoverer;
/* loaded from: classes3.dex */
public class oO000Oo0 {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f15189o00oo0O0 = 100;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OOO0O f15191o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOo00 f15190o00oOOo0 = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15192o00oOo00 = 17;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0OO f15200o00oOooO = null;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public SettingItem f15193o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public SettingItem f15194o00oOo0o = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public SettingItem f15196o00oOoO0 = null;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public SettingItem f15195o00oOoO = null;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0OO0o00 f15197o00oOoOO = null;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o0OO0o f15198o00oOoOo = new o0OO0o();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public o0OO0oO0 f15199o00oOoo0 = null;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f15201o00oOooo = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public boolean f15203o00oo00O = false;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f15202o00oo0 = 0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f15204o00oo0OO = 0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f15205o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Surface f15206o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f15207o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ boolean f15209o00oo0o0;

        public o00oOOo0(Surface surface, int i, int i2, boolean z) {
            this.f15206o00oo0O0 = surface;
            this.f15205o00oo0O = i;
            this.f15207o00oo0Oo = i2;
            this.f15209o00oo0o0 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                oO000Oo0.this.f15190o00oOOo0.o00oOooo(this.f15206o00oo0O0, this.f15205o00oo0O, this.f15207o00oo0Oo, this.f15209o00oo0o0);
                oO000Oo0.this.f15190o00oOOo0.o00oOoo0(this.f15205o00oo0O, this.f15207o00oo0Oo, true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oO000Oo0.this.f15190o00oOOo0.o00oo00O();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends Thread {

        /* renamed from: o00oo  reason: collision with root package name */
        public o0OOO0OO f15211o00oo;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f15212o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Object f15213o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o0OOOO f15214o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public Handler f15215o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f15216o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public SurfaceTexture f15217o00oo0oO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public o0OO0O0.o00oOOo0 f15218o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public oO0OOo0o f15219o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public o0OOO0OO f15220o00ooO0O;

        /* renamed from: o0O0o  reason: collision with root package name */
        public ExoPlayer f15222o0O0o;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends Handler {
            public o00oOOo0(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    try {
                        o00oOo00.this.o00oOoO0();
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO implements SurfaceTexture.OnFrameAvailableListener {
            public o00oOOoO() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                surfaceTexture.updateTexImage();
                Handler handler = o00oOo00.this.f15215o00oo0o;
                handler.sendMessage(Message.obtain(handler, 1));
            }
        }

        /* renamed from: o0OOoo0O.oO000Oo0$o00oOo00$o00oOo00  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0217o00oOo00 implements Runnable {
            public RunnableC0217o00oOo00() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o0OO0.f14869o00oOOoO.finish();
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOo0O implements MediaPlayer.OnPreparedListener {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ MediaPlayer f15227o00oo0O0;

            public o00oOo0O(MediaPlayer mediaPlayer) {
                this.f15227o00oo0O0 = mediaPlayer;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                this.f15227o00oo0O0.start();
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOoO implements AnalyticsListener {
            public o00oOoO() {
            }

            @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
            public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
                int i = videoSize.width;
                int i2 = videoSize.height;
                o0O000o0.o00oOo00().o00oOoOO(o00oo.o00oOOo0(new byte[]{111, Ascii.ESC, -50, -52, -84, 101, 50, 122, 109, Ascii.SUB, -11, -57, -90, 78, 53, 116, 107, Ascii.EM, -11, -34, -86, 94, 54, 115}, new byte[]{Ascii.EM, 114, -86, -87, -61, 58, 66, Ascii.ESC}), i);
                o0O000o0.o00oOo00().o00oOoOO(o00oo.o00oOOo0(new byte[]{-18, -4, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -6, 124, 45, 63, -3, -20, -3, Ascii.SUB, -15, 118, 6, 56, -13, -22, -2, Ascii.SUB, -9, 118, Ascii.ESC, 40, -12, -20}, new byte[]{-104, -107, 69, -97, 19, 114, 79, -100}), i2);
            }
        }

        public o00oOo00(oO0OOo0o oo0ooo0o) {
            this.f15213o00oo0O0 = new Object();
            this.f15212o00oo0O = false;
            this.f15214o00oo0Oo = null;
            this.f15215o00oo0o = null;
            this.f15217o00oo0oO = null;
            this.f15222o0O0o = null;
            this.f15218o00ooO0 = null;
            this.f15219o00ooO00 = oo0ooo0o;
        }

        public /* synthetic */ o00oOo00(oO000Oo0 oo000oo0, oO0OOo0o oo0ooo0o, o00oOOo0 o00oooo02) {
            this(oo0ooo0o);
        }

        public final Bitmap o00oOo0O(Bitmap bitmap, SettingItem settingItem, int i, int i2) {
            int i3;
            int i4;
            Bitmap bitmap2 = null;
            try {
                if (settingItem.f6717o0O0o) {
                    i4 = i;
                    i3 = i2;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                try {
                    SettingItem o00oo0o02 = oO000Oo0.this.o00oo0o0(o00oo.o00oOOo0(new byte[]{-30, -44, 78, -65, -52, Ascii.US, -51}, new byte[]{-110, -67, 45, -53, -71, 109, -88, -32}));
                    Bitmap o00oOo0O2 = o0OO0O0.o00oOo0O(bitmap, i3, i4);
                    Bitmap o00oOo002 = o0OO0O0.o00oOo00(o00oOo0O2, o00oo0o02.f6714o00ooO00);
                    bitmap2 = o0OO0O0.o00oOOoO(o00oOo002, o00oo0o02.f6712o00oo0oO);
                    if (!o00oOo002.equals(o00oOo0O2)) {
                        o00oOo0O2.recycle();
                    }
                    if (!bitmap2.equals(o00oOo002)) {
                        o00oOo002.recycle();
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            return bitmap2;
        }

        public final ExoPlayer o00oOo0o(Surface surface) {
            Size o00oOoOo2;
            ExoPlayer build = new ExoPlayer.Builder(o0OO0oO.o00oOOoO()).build();
            try {
                build.setVideoSurface(surface);
                if (oO000Oo0.this.f15200o00oOooO.f14934o00oOooO) {
                    build.setVolume(1.0f);
                } else {
                    build.setVolume(0.0f);
                }
                build.setRepeatMode(1);
                if (o0O000o0.o00oOo00().o00oOooO(o00oOoO.o00ooO.f15565o00oOOo0, -1) == 3) {
                    o00oOoOo2 = new Size(o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{-46, -84, -103, -93, -126, 120, 42, -71, -48, -83, -94, -88, -120, 83, 45, -73, -42, -82, -94, -79, -124, 67, 46, -80}, new byte[]{-92, -59, -3, -58, -19, 39, 90, -40}), 720), o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{90, 69, -27, Ascii.CR, -63, -40, 75, -91, 88, 68, -34, 6, -53, -13, 76, -85, 94, 71, -34, 0, -53, -18, 92, -84, 88}, new byte[]{44, 44, -127, 104, -82, -121, 59, -60}), MediaDiscoverer.Event.Started));
                    build.addAnalyticsListener(new o00oOoO());
                } else {
                    o00oOoOo2 = o00oOoOo();
                }
                build.setMediaSource(oO0000Oo.o00oOOoO(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0, o0OOO00.o00oOOo0()));
                build.prepare();
                build.play();
                oO000Oo0.this.o00oo0o().f6707o00oo0O = o00oOoOo2.getWidth();
                oO000Oo0.this.o00oo0o().f6709o00oo0Oo = o00oOoOo2.getHeight();
            } catch (Throwable unused) {
            }
            return build;
        }

        public final byte[] o00oOoO(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable unused) {
                byteArrayOutputStream = null;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                return byteArray;
            } catch (Throwable unused3) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                return null;
            }
        }

        public void o00oOoO0() {
            Size size;
            int height;
            this.f15220o00ooO0O.o00oOo0O();
            o00oo0o(oO000Oo0.this.o00oo0o());
            int i = 16384;
            GLES20.glClear(16384);
            this.f15214o00oo0Oo.o00oOo00(this.f15216o00oo0o0);
            int o00oo0Oo2 = oO000Oo0.this.o00oo0Oo();
            if (o00oo0Oo2 == 1) {
                oO000Oo0 oo000oo0 = oO000Oo0.this;
                if (oo000oo0.f15197o00oOoOO.f14942o00oOOo0) {
                    SettingItem o00oo0o02 = oo000oo0.o00oo0o0(o00oo.o00oOOo0(new byte[]{-18, -84, 51, 42, 97, Ascii.GS, 90}, new byte[]{-98, -59, 80, 94, Ascii.DC4, 111, 63, 91}));
                    Camera.Size size2 = oO000Oo0.this.f15197o00oOoOO.f14943o00oOOoO;
                    byte[] o00oo0OO2 = o00oo0OO(o00oo0o02, size2.width, size2.height);
                    if (o00oo0OO2 != null) {
                        this.f15219o00ooO00.o00oOo00(o00oo0OO2);
                    }
                    oO000Oo0.this.f15197o00oOoOO.f14942o00oOOo0 = false;
                }
                o00oo0oO();
            }
            if (o00oo0Oo2 == 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(oO000Oo0.this.f15199o00oOoo0.f14953o00oOoO0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o0OO0oO0.o0O0o00O o0o0o00o = (o0OO0oO0.o0O0o00O) it.next();
                    if (o0o0o00o.f15036o00oOo0o) {
                        oO000Oo0 oo000oo02 = oO000Oo0.this;
                        size = new Size(oo000oo02.f15202o00oo0, oo000oo02.f15204o00oo0OO);
                    } else if (!o0o0o00o.f15035o00oOo0O) {
                        o0OO0o o0oo0o = oO000Oo0.this.f15198o00oOoOo;
                        if (o0oo0o.f14939o00oOOoO || o0oo0o.f14940o00oOo00) {
                            o0oo0o.f14940o00oOo00 = false;
                            try {
                                size = oO0OoOO0.o00oOOoO(o0o0o00o.f15032o00oOOo0);
                                oO000Oo0.this.f15201o00oOooo = 0;
                            } catch (Throwable unused) {
                                oO000Oo0.o00oOo0o(oO000Oo0.this);
                                oO000Oo0 oo000oo03 = oO000Oo0.this;
                                if (oo000oo03.f15201o00oOooo >= 100) {
                                    oo000oo03.f15201o00oOooo = 0;
                                    this.f15219o00ooO00.o00oOOo0(oo000oo03.f15198o00oOoOo.f14941o00oOooO);
                                }
                            }
                        }
                    }
                    oO000o00 oo000o00 = o0o0o00o.f15038o00oOooO;
                    if (oo000o00 != null) {
                        oo000o00.o00oOo0O();
                        SettingItem o00oo0o03 = oO000Oo0.this.o00oo0o0(o00oo.o00oOOo0(new byte[]{62, -127, -92, 124, 72, 2}, new byte[]{81, -11, -52, Ascii.EM, 58, 113, -10, -112}));
                        if (o00oo0o03.f6717o0O0o) {
                            o00oo0o03.f6711o00oo0o0 = size.getHeight();
                            height = size.getWidth();
                        } else {
                            o00oo0o03.f6711o00oo0o0 = size.getWidth();
                            height = size.getHeight();
                        }
                        o00oo0o03.f6710o00oo0o = height;
                        o00oo0o(o00oo0o03);
                        GLES20.glClear(i);
                        this.f15214o00oo0Oo.o00oOo00(this.f15216o00oo0o0);
                        o0o0o00o.f15038o00oOooO.o00oOoo0();
                        this.f15220o00ooO0O.o00oOo0O();
                        o00oo0o(oO000Oo0.this.o00oo0o());
                        GLES20.glClear(i);
                        this.f15214o00oo0Oo.o00oOo00(this.f15216o00oo0o0);
                    } else if (o0o0o00o.f15033o00oOOoO.f15128o00oOOoO.getFormat() == 256) {
                        try {
                            Bitmap o00oo02 = o00oo0();
                            Bitmap o00oOo0O2 = o00oOo0O(o00oo02, oO000Oo0.this.o00oo0o0(o00oo.o00oOOo0(new byte[]{-121, 44, 96, -58, -31, 19, -1}, new byte[]{-9, 69, 3, -78, -108, 97, -102, Ascii.DC4})), size.getWidth(), size.getHeight());
                            byte[] o00oOoO2 = o00oOoO(o00oOo0O2);
                            Image dequeueInputImage = o0o0o00o.f15033o00oOOoO.f15128o00oOOoO.dequeueInputImage();
                            Image.Plane plane = dequeueInputImage.getPlanes()[0];
                            plane.getBuffer().clear();
                            plane.getBuffer().put(o00oOoO2, 0, o00oOoO2.length);
                            plane.getBuffer().rewind();
                            o0o0o00o.f15033o00oOOoO.f15128o00oOOoO.queueInputImage(dequeueInputImage);
                            o00oOo0O2.recycle();
                            o00oo02.recycle();
                        } catch (Throwable unused2) {
                        }
                    } else {
                        Image dequeueInputImage2 = o0o0o00o.f15033o00oOOoO.f15128o00oOOoO.dequeueInputImage();
                        Bitmap o00oo03 = o00oo0();
                        oO000Oo0 oo000oo04 = oO000Oo0.this;
                        Bitmap o00oOo0O3 = o00oOo0O(o00oo03, oo000oo04.o00oo0o0(oo000oo04.f15198o00oOoOo.f14939o00oOOoO ? o00oo.o00oOOo0(new byte[]{124, 36, -125, 0, -32, -87, -34, -103, 102}, new byte[]{10, 77, -25, 101, -113, -54, -65, -11}) : o00oo.o00oOOo0(new byte[]{89, -13, 98, 108, 114, Ascii.RS, -37}, new byte[]{41, -102, 1, Ascii.CAN, 7, 108, -66, -1})), size.getWidth(), size.getHeight());
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(o00oOo0O3.getByteCount());
                        o00oOo0O3.copyPixelsToBuffer(allocateDirect);
                        byte[] array = allocateDirect.array();
                        allocateDirect.clear();
                        o00oo03.recycle();
                        o00oOo0O3.recycle();
                        oO000.o00oOOo0(array, dequeueInputImage2);
                        o0o0o00o.f15033o00oOOoO.f15128o00oOOoO.queueInputImage(dequeueInputImage2);
                    }
                    i = 16384;
                }
            }
            this.f15211o00oo.o00oOo0O();
            o00oo0o(oO000Oo0.this.o00oo0o());
            GLES20.glClear(16384);
            this.f15214o00oo0Oo.o00oOo00(this.f15216o00oo0o0);
            this.f15211o00oo.o00oOoo0();
        }

        public Handler o00oOoOO() {
            return this.f15215o00oo0o;
        }

        public final Size o00oOoOo() {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setSurface(null);
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setLooping(true);
            mediaPlayer.setOnPreparedListener(new o00oOo0O(mediaPlayer));
            try {
                mediaPlayer.setDataSource(new File(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0).getAbsolutePath());
                mediaPlayer.prepare();
                int videoWidth = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                mediaPlayer.stop();
                mediaPlayer.release();
                return new Size(videoWidth, videoHeight);
            } catch (Throwable th) {
                th.printStackTrace();
                return new Size(1, 1);
            }
        }

        public final void o00oOoo0(int i, int i2, boolean z) {
            SettingItem o00oo0o2 = oO000Oo0.this.o00oo0o();
            if (o00oo0o2.f6717o0O0o) {
                i2 = i;
                i = i2;
            }
            o00oo0o2.f6711o00oo0o0 = i;
            o00oo0o2.f6710o00oo0o = i2;
            this.f15217o00oo0oO.setDefaultBufferSize(i, i2);
            GLES20.glViewport(o00oo0o2.f6713o00ooO0, o00oo0o2.f6715o00ooO0O, o00oo0o2.f6711o00oo0o0, o00oo0o2.f6710o00oo0o);
            if (!ooOOO0Oo.o00oOOoO(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0)) {
                if (this.f15222o0O0o == null || z) {
                    o00oo0o0();
                    this.f15222o0O0o = o00oOo0o(new Surface(this.f15217o00oo0oO));
                }
            } else if (this.f15218o00ooO0 == null || z) {
                o00oo0o0();
                this.f15218o00ooO0 = oO000Oo0.this.o00oo0O(new Surface(this.f15217o00oo0oO));
            }
        }

        public final void o00oOooo(Surface surface, int i, int i2, boolean z) {
            try {
                oO000Oo0 oo000oo0 = oO000Oo0.this;
                oo000oo0.f15203o00oo00O = z;
                oo000oo0.f15202o00oo0 = i;
                oo000oo0.f15204o00oo0OO = i2;
                if (z) {
                    this.f15211o00oo = new oO000O0(oO000Oo0.this.f15191o00oOOoO, i, i2);
                } else {
                    this.f15211o00oo = new oO000o00(oO000Oo0.this.f15191o00oOOoO, surface, false);
                }
                this.f15211o00oo.o00oOo0O();
                o0OOOO o0oooo = new o0OOOO(new oO000OOo(oO000OOo.o00oOOoO.TEXTURE_EXT));
                this.f15214o00oo0Oo = o0oooo;
                int o00oOOoO2 = o0oooo.o00oOOoO();
                this.f15216o00oo0o0 = o00oOOoO2;
                if (o00oOOoO2 <= 0) {
                    this.f15216o00oo0o0 = (int) ((Math.random() * 100.0d) + 100.0d);
                }
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15216o00oo0o0);
                this.f15217o00oo0oO = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new o00oOOoO());
                GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
                oO000O0 oo000o0 = new oO000O0(oO000Oo0.this.f15191o00oOOoO, i, i2);
                this.f15220o00ooO0O = oo000o0;
                oo000o0.o00oOo0O();
            } catch (Throwable unused) {
                oO0OO0O.o00oOo0o(new RunnableC0217o00oOo00(), 1000L);
            }
        }

        public void o00oo() {
            synchronized (this.f15213o00oo0O0) {
                while (!this.f15212o00oo0O) {
                    try {
                        this.f15213o00oo0O0.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        public final Bitmap o00oo0() {
            int i = oO000Oo0.this.o00oo0o().f6711o00oo0o0;
            int i2 = oO000Oo0.this.o00oo0o().f6710o00oo0o;
            int i3 = i * i2;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            GLES20.glReadPixels(0, 0, i, i2, o0OOo000.f15118o00oo0OO, 5121, allocateDirect);
            allocateDirect.rewind();
            int[] iArr = new int[i3];
            allocateDirect.asIntBuffer().get(iArr);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr[i4];
                iArr[i4] = ((i5 & 255) << 16) | ((-16711936) & i5) | ((16711680 & i5) >> 16);
            }
            allocateDirect.clear();
            try {
                return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
            } catch (Throwable unused) {
                return null;
            }
        }

        public final void o00oo00O() {
            Looper.myLooper().quit();
        }

        public void o00oo0O() {
            try {
                if (oO000Oo0.this.f15200o00oOooO.f14934o00oOooO) {
                    this.f15218o00ooO0.setVolume(1.0f);
                } else {
                    this.f15218o00ooO0.setVolume(0.0f);
                }
                oO000Oo0 oo000oo0 = oO000Oo0.this;
                Size size = new Size(oo000oo0.f15202o00oo0, oo000oo0.f15204o00oo0OO);
                o0OO00o.o00oOOo0 o00oooo02 = new o0OO00o.o00oOOo0(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0);
                this.f15218o00ooO0.stop();
                this.f15218o00ooO0.o00oOo00(o00oooo02);
                this.f15218o00ooO0.start();
                oO000Oo0.this.o00oo0o().f6707o00oo0O = size.getWidth();
                oO000Oo0.this.o00oo0o().f6709o00oo0Oo = size.getHeight();
            } catch (Throwable unused) {
            }
        }

        public void o00oo0O0() {
            try {
                if (ooOOO0Oo.o00oOOoO(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0)) {
                    o00oo0O();
                    return;
                }
                if (oO000Oo0.this.f15200o00oOooO.f14934o00oOooO) {
                    this.f15222o0O0o.setVolume(1.0f);
                } else {
                    this.f15222o0O0o.setVolume(0.0f);
                }
                Size size = o0O000o0.o00oOo00().o00oOooO(o00oOoO.o00ooO.f15565o00oOOo0, -1) == 3 ? new Size(o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{121, -68, -20, Ascii.CAN, Ascii.SUB, -39, -70, -45, 123, -67, -41, 19, Ascii.DLE, -14, -67, -35, 125, -66, -41, 10, Ascii.FS, -30, -66, -38}, new byte[]{Ascii.SI, -43, -120, 125, 117, -122, -54, -78}), 720), o0O000o0.o00oOo00().o00oOooO(o00oo.o00oOOo0(new byte[]{-50, -92, Ascii.RS, -117, -84, -76, 56, -104, -52, -91, 37, Byte.MIN_VALUE, -90, -97, 63, -106, -54, -90, 37, -122, -90, -126, 47, -111, -52}, new byte[]{-72, -51, 122, -18, -61, -21, 72, -7}), MediaDiscoverer.Event.Started)) : o00oOoOo();
                MediaSource o00oOOoO2 = oO0000Oo.o00oOOoO(oO000Oo0.this.f15200o00oOooO.f14931o00oOOo0, o0OO0oO.o00oOOoO());
                this.f15222o0O0o.stop();
                this.f15222o0O0o.setRepeatMode(1);
                this.f15222o0O0o.setMediaSource(o00oOOoO2);
                this.f15222o0O0o.prepare();
                this.f15222o0O0o.play();
                oO000Oo0.this.o00oo0o().f6707o00oo0O = size.getWidth();
                oO000Oo0.this.o00oo0o().f6709o00oo0Oo = size.getHeight();
            } catch (Throwable unused) {
            }
        }

        public final byte[] o00oo0OO(SettingItem settingItem, int i, int i2) {
            ByteArrayOutputStream byteArrayOutputStream;
            Bitmap o00oOo0O2;
            try {
                Bitmap o00oo02 = o00oo0();
                o00oOo0O2 = o00oOo0O(o00oo02, settingItem, i, i2);
                if (!o00oOo0O2.equals(o00oo02)) {
                    o00oo02.recycle();
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable unused) {
                byteArrayOutputStream = null;
            }
            try {
                o00oOo0O2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                o00oOo0O2.recycle();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                return byteArray;
            } catch (Throwable unused3) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                return null;
            }
        }

        public final void o00oo0Oo() {
            try {
                o0o0000.o00oOOo0(o00oo.o00oOOo0(new byte[]{75, 9, -33, 44, Ascii.GS, -63, 126, -46, 85, 76, -64, oo0OOoo.f13516o00oOoO, Ascii.GS, -64, 111}, new byte[]{57, 108, -77, 73, 124, -78, Ascii.ESC, -107}));
                o0OOO0OO o0ooo0oo = this.f15211o00oo;
                if (o0ooo0oo != null) {
                    o0ooo0oo.o00oOoO0();
                    this.f15211o00oo = null;
                }
                o0OOO0OO o0ooo0oo2 = this.f15220o00ooO0O;
                if (o0ooo0oo2 != null) {
                    o0ooo0oo2.o00oOoO0();
                    this.f15220o00ooO0O = null;
                }
                o0OOOO o0oooo = this.f15214o00oo0Oo;
                if (o0oooo != null) {
                    o0oooo.o00oOoO0(false);
                    this.f15214o00oo0Oo = null;
                }
                o00oo.o00oOOo0(new byte[]{-26, 109, -86, Ascii.RS, 1, 126, 116, -110, -8, 40, -94, Ascii.DC4, Ascii.SO, 104}, new byte[]{-108, 8, -58, 123, 96, Ascii.CR, 17, -43});
                oO000Oo0.this.f15191o00oOOoO.o00oOoOo();
            } catch (Throwable unused) {
            }
        }

        public final void o00oo0o(SettingItem settingItem) {
            ooOOOOoo oooooooo = new ooOOOOoo();
            GLES20.glViewport(settingItem.f6713o00ooO0, settingItem.f6715o00ooO0O, settingItem.f6711o00oo0o0, settingItem.f6710o00oo0o);
            oO000Oo0.this.f15190o00oOOo0.f15214o00oo0Oo.o00oOoOo(settingItem.f6716o00ooO0o);
            oooooooo.o00oOooO(new ooOOOOoo.o00oOOoO(settingItem.f6707o00oo0O, settingItem.f6709o00oo0Oo), new ooOOOOoo.o00oOOoO(settingItem.f6711o00oo0o0, settingItem.f6710o00oo0o), 1002);
            oooooooo.f15329o00oOo00 = settingItem.f6714o00ooO00;
            oooooooo.f15328o00oOOoO = settingItem.f6712o00oo0oO;
            this.f15214o00oo0Oo.o00oOoO(1.0f - (settingItem.f6706o00oo / 100.0f));
            this.f15214o00oo0Oo.o00oOoOO(oooooooo);
        }

        public final void o00oo0o0() {
            ExoPlayer exoPlayer = this.f15222o0O0o;
            if (exoPlayer != null) {
                exoPlayer.stop();
                this.f15222o0O0o.release();
                this.f15222o0O0o = null;
            }
            o0OO0O0.o00oOOo0 o00oooo02 = this.f15218o00ooO0;
            if (o00oooo02 != null) {
                o00oooo02.stop();
                this.f15218o00ooO0.release();
                this.f15218o00ooO0 = null;
            }
        }

        public final void o00oo0oO() {
            try {
                int i = oO000Oo0.this.o00oo0o().f6711o00oo0o0;
                int i2 = oO000Oo0.this.o00oo0o().f6710o00oo0o;
                ByteBuffer o00oOo0O2 = oO000.o00oOo0O(0, 0, i, i2);
                byte[] bArr = null;
                int i3 = oO000Oo0.this.f15197o00oOoOO.f14944o00oOo00;
                if (i3 == 842094169) {
                    bArr = oO00000o.o00oOoo0(o00oOo0O2.array(), i, i2);
                } else if (i3 == 17) {
                    bArr = oO00000o.o00oOoOo(o00oOo0O2.array(), i, i2);
                }
                o00oOo0O2.clear();
                if (bArr != null) {
                    this.f15219o00ooO00.o00oOOoO(bArr);
                }
            } catch (Throwable unused) {
            }
        }

        public final byte[] o0O0o(int i) {
            int i2 = oO000Oo0.this.o00oo0o().f6711o00oo0o0;
            int i3 = oO000Oo0.this.o00oo0o().f6710o00oo0o;
            ByteBuffer order = ByteBuffer.allocateDirect(i2 * i3 * 4).order(ByteOrder.nativeOrder());
            GLES20.glReadPixels(0, 0, i2, i3, o0OOo000.f15118o00oo0OO, 5121, order);
            I420Buffer allocate = I420Buffer.Factory.allocate(i2, i3);
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                RgbaBuffer wrap = RgbaBuffer.Factory.wrap(order, i2, i3);
                wrap.convertTo(allocate);
                wrap.close();
            } else {
                AbgrBuffer wrap2 = AbgrBuffer.Factory.wrap(order, i2, i3);
                wrap2.convertTo(allocate);
                wrap2.close();
            }
            byte[] bArr = null;
            if (i == 4) {
                Rgb565Buffer allocate2 = Rgb565Buffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate2);
                bArr = allocate2.asByteArray();
                allocate2.close();
            } else if (i == 17) {
                Nv21Buffer allocate3 = Nv21Buffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate3);
                bArr = allocate3.asByteArray();
                allocate3.close();
            } else if (i == 35) {
                I420Buffer allocate4 = I420Buffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate4);
                bArr = allocate4.asByteArray();
                allocate4.close();
            } else if (i == 256) {
                RgbaBuffer allocate5 = RgbaBuffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate5);
                bArr = allocate5.asByteArray();
                allocate5.close();
            } else if (i == 842094169) {
                Nv12Buffer allocate6 = Nv12Buffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate6);
                bArr = allocate6.asByteArray();
                allocate6.close();
            } else if (i == 39) {
                I422Buffer allocate7 = I422Buffer.Factory.allocate(i2, i3);
                allocate.convertTo(allocate7);
                bArr = allocate7.asByteArray();
                allocate7.close();
            } else if (i == 40) {
                I444Buffer allocate8 = I444Buffer.FactoryFactory.allocate(i2, i3);
                allocate.convertTo(allocate8);
                bArr = allocate8.asByteArray();
                allocate8.close();
            }
            if (allocate != null) {
                allocate.close();
            }
            if (order != null) {
                order.clear();
            }
            if (i != 256) {
                this.f15219o00ooO00.o00oOOoO(bArr);
            }
            return bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                this.f15215o00oo0o = new o00oOOo0(Looper.myLooper());
                synchronized (this.f15213o00oo0O0) {
                    this.f15212o00oo0O = true;
                    this.f15213o00oo0O0.notifyAll();
                }
                Looper.loop();
                o00oo0o0();
                o00oo0Oo();
                oO000Oo0.this.f15191o00oOOoO.o00oo00O();
                this.f15217o00oo0oO.release();
                this.f15217o00oo0oO = null;
                synchronized (this.f15213o00oo0O0) {
                    this.f15212o00oo0O = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int o00oOo0o(oO000Oo0 oo000oo0) {
        int i = oo000oo0.f15201o00oOooo;
        oo000oo0.f15201o00oOooo = i + 1;
        return i;
    }

    public void o00oo(o0OO0oO0 o0oo0oo0, o0OO o0oo, oO0OOo0o oo0ooo0o) {
        this.f15200o00oOooO = o0oo;
        this.f15199o00oOoo0 = o0oo0oo0;
        o00oOo00 o00ooo002 = new o00oOo00(oo0ooo0o);
        this.f15190o00oOOo0 = o00ooo002;
        o00ooo002.start();
        this.f15190o00oOOo0.o00oo();
        this.f15191o00oOOoO = new o0OOO0O(null, 0);
    }

    public void o00oo0(String str) {
        SettingItem o00oo0o02 = o00oo0o0(str);
        o00oo0o02.f6714o00ooO00 = ((o00oo0o02.f6714o00ooO00 - 90) + 360) % 360;
        o00oo0o02.o00oOooO();
    }

    public final o0OO0O0.o00oOOo0 o00oo0O(Surface surface) {
        o0OO0O0.o00oOOo0 o00oooo02 = new o0OO0O0.o00oOOo0(o0OO0oO.o00oOOoO());
        try {
            o00oooo02.o00oOo00(new o0OO00o.o00oOOo0(this.f15200o00oOooO.f14931o00oOOo0));
            if (this.f15200o00oOooO.f14934o00oOooO) {
                o00oooo02.setVolume(1.0f);
            } else {
                o00oooo02.setVolume(0.0f);
            }
            Size size = new Size(this.f15202o00oo0, this.f15204o00oo0OO);
            o00oooo02.o00oOOoO(surface);
            o00oooo02.o00oo00O(this.f15202o00oo0, this.f15204o00oo0OO);
            o00oo0o().f6707o00oo0O = size.getWidth();
            o00oo0o().f6709o00oo0Oo = size.getHeight();
            o00oooo02.start();
        } catch (Throwable unused) {
        }
        return o00oooo02;
    }

    public void o00oo0O0(String str) {
        SettingItem o00oo0o02 = o00oo0o0(str);
        if (str.equals(o00oo.o00oOOo0(new byte[]{42, 37, 9, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -122, -103, -90}, new byte[]{90, 87, 108, 87, -17, -4, -47, -99}))) {
            int i = o00oo0o02.f6711o00oo0o0;
            o00oo0o02.f6711o00oo0o0 = o00oo0o02.f6710o00oo0o;
            o00oo0o02.f6710o00oo0o = i;
        }
        o00oo0o02.f6717o0O0o = !o00oo0o02.f6717o0O0o;
        o00oo0o02.o00oOooO();
    }

    public void o00oo0OO(float f, String str) {
        SettingItem o00oo0o02 = o00oo0o0(str);
        o00oo0o02.o00oOOo0(f);
        o00oo0o02.o00oOooO();
    }

    public final int o00oo0Oo() {
        return this.f15197o00oOoOO != null ? 1 : 2;
    }

    public final SettingItem o00oo0o() {
        return o00oo0o0(o00oo.o00oOOo0(new byte[]{-52, 59, 104, -7, 53, 2, -33}, new byte[]{-68, 73, Ascii.CR, -113, 92, 103, -88, -89}));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public SettingItem o00oo0o0(String str) {
        boolean z;
        switch (str.hashCode()) {
            case -1006804125:
                if (str.equals(o00oo.o00oOOo0(new byte[]{-109, 111, -88, 126, 79, Ascii.DLE}, new byte[]{-4, Ascii.ESC, -64, Ascii.ESC, oo0OOoo.f13516o00oOoO, 99, 78, -125}))) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -577741570:
                if (str.equals(o00oo.o00oOOo0(new byte[]{-85, -120, -16, SignedBytes.MAX_POWER_OF_TWO, 105, -86, -104}, new byte[]{-37, -31, -109, 52, Ascii.FS, -40, -3, -30}))) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -318184504:
                if (str.equals(o00oo.o00oOOo0(new byte[]{-69, -83, -119, 88, 104, -99, Ascii.VT}, new byte[]{-53, -33, -20, 46, 1, -8, 124, 17}))) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 1333385561:
                if (str.equals(o00oo.o00oOOo0(new byte[]{-24, -13, -107, -115, 107, 87, -92, 114, -14}, new byte[]{-98, -102, -15, -24, 4, 52, -59, Ascii.RS}))) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (!z) {
            if (this.f15193o00oOo0O == null) {
                synchronized (oO000Oo0.class) {
                    if (this.f15193o00oOo0O == null) {
                        this.f15193o00oOo0O = SettingItem.o00oOo00(o00oo.o00oOOo0(new byte[]{-4, 40, -20, -61, -50, 120, -12}, new byte[]{-116, 90, -119, -75, -89, Ascii.GS, -125, -49}));
                    }
                }
            }
            return this.f15193o00oOo0O;
        } else if (z) {
            if (this.f15194o00oOo0o == null) {
                synchronized (oO000Oo0.class) {
                    if (this.f15194o00oOo0o == null) {
                        this.f15194o00oOo0o = SettingItem.o00oOo00(o00oo.o00oOOo0(new byte[]{-14, 67, -127, 125, 94, 46, -58}, new byte[]{-126, 42, -30, 9, 43, 92, -93, -76}));
                    }
                }
            }
            return this.f15194o00oOo0o;
        } else if (z) {
            if (this.f15196o00oOoO0 == null) {
                synchronized (oO000Oo0.class) {
                    if (this.f15196o00oOoO0 == null) {
                        this.f15196o00oOoO0 = SettingItem.o00oOo00(o00oo.o00oOOo0(new byte[]{47, 37, 67, 44, -112, 117, 86, 42, 53}, new byte[]{89, 76, 39, 73, -1, Ascii.SYN, 55, 70}));
                    }
                }
            }
            return this.f15196o00oOoO0;
        } else if (!z) {
            return null;
        } else {
            if (this.f15195o00oOoO == null) {
                synchronized (oO000Oo0.class) {
                    if (this.f15195o00oOoO == null) {
                        this.f15195o00oOoO = SettingItem.o00oOo00(o00oo.o00oOOo0(new byte[]{115, -81, 67, -80, 115, 43}, new byte[]{Ascii.FS, -37, 43, -43, 1, 88, 3, o0Oo0oo0.o0OO0o00.f16655o00oOoOO}));
                    }
                }
            }
            return this.f15195o00oOoO;
        }
    }

    public float o00oo0oO(String str) {
        if (this.f15190o00oOOo0.f15214o00oo0Oo == null) {
            this.f15190o00oOOo0.o00oo();
            if (this.f15190o00oOOo0.f15214o00oo0Oo == null) {
                return 1.0f;
            }
        }
        return o00oo0o0(str).o00oOOoO();
    }

    public void o00ooO(int i, String str) {
        SettingItem o00oo0o02 = o00oo0o0(str);
        o00oo0o02.f6706o00oo = i;
        o00oo0o02.o00oOooO();
    }

    public void o00ooO0(int i) {
        this.f15192o00oOo00 = i;
    }

    public void o00ooO00() {
        this.f15190o00oOOo0.o00oOoOO().post(new o00oOOoO());
    }

    public void o00ooO0O(Surface surface, int i, int i2, boolean z) {
        this.f15190o00oOOo0.o00oOoOO().post(new o00oOOo0(surface, i, i2, z));
    }

    public void o00ooO0o(int i, int i2, String str) {
        SettingItem o00oo0o02 = o00oo0o0(str);
        o00oo0o02.f6713o00ooO0 = i;
        o00oo0o02.f6715o00ooO0O = i2;
        o00oo0o02.o00oOooO();
    }

    public int o0O0o(String str) {
        return o00oo0o0(str).f6706o00oo;
    }
}
