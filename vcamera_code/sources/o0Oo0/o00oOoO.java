package o0Oo0;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.oo0oO0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import multispace.multiapp.clone.app.App;
import multispace.multiapp.clone.view.pay.PayActivity;
import o00oOo00.o00oOOoO;
import o00oOooO.o0OO00OO;
import o0OOO0oo.oo0OOoo;
import o0OOoOo0.ooOOO0Oo;
import o0OOoo.oo0ooO;
import o0OOoo0O.o0OO0oO;
import o0OOoo0O.o0OOO00;
import o0OOoo0O.o0oo0000;
import o0OOoo0O.oO0000Oo;
import o0OOoo0O.oO0O0OoO;
import o0OOoo0O.oO0Ooooo;
import o0Oo00o0.o0;
import o0Oo00oo.o0O000o0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O000o;
import o0ooO0O0.oO0O00oO;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0Oo0o0;
import o0ooO0O0.oOo00ooO;
import oo0oO0.o0O00OO;
import org.videolan.libvlc.MediaDiscoverer;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class o00oOoO extends oo0ooO {

    /* renamed from: o00oo  reason: collision with root package name */
    public AppCompatEditText f15516o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public PowerSpinnerView f15517o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public AppCompatButton f15518o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public AppCompatTextView f15519o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public AppCompatTextView f15520o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public AppCompatTextView f15521o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public AppCompatEditText f15523o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public AppCompatEditText f15524o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public SwitchCompat f15525o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public AppCompatButton f15526o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public ConstraintLayout f15527o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public ConstraintLayout f15529o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f15531o00ooOo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public AppCompatTextView f15534o0O0o;

    /* renamed from: o00ooO  reason: collision with root package name */
    public oo0oO0 f15522o00ooO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f15528o00ooOO0 = 0;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public androidx.activity.result.o00oo0OO<String> f15530o00ooOo = registerForActivityResult(new o00oOOoO.o00oOo0O(), new androidx.activity.result.o00oOOo0() { // from class: o0Oo0.o00oOo0O
        @Override // androidx.activity.result.o00oOOo0
        public final void o00oOOo0(Object obj) {
            o00oOoO.this.o00ooO0O((Uri) obj);
        }
    });

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f15532o00ooOoO = false;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f15533o00ooOoo = false;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOoO.this.f15516o00oo.setText("");
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements AnalyticsListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Surface f15536o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f15537o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15538o00oOo00;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    o00oOOoO.this.f15538o00oOo00.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public o00oOOoO(Surface surface, SurfaceTexture surfaceTexture, ProgressDialog progressDialog) {
            this.f15536o00oOOo0 = surface;
            this.f15537o00oOOoO = surfaceTexture;
            this.f15538o00oOo00 = progressDialog;
        }

        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
            o00oOoO.this.f15533o00ooOoo = true;
            int i = videoSize.width;
            int i2 = videoSize.height;
            o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, o00oOoO.this.f15528o00ooOO0);
            o0O000o0.o00oOo00().o00oOooo(o0OOoO0.o00oo.o00oOOo0(new byte[]{50, 36, 56, -97, 95, 79, -54, oo0OOoo.f13516o00oOoO, 48, 37, 3, -108, 85, 100, -51, 51, 54, 38}, new byte[]{68, 77, 92, -6, 48, Ascii.DLE, -70, 92}), o00oOoO.this.f15516o00oo.getText().toString());
            o0O000o0.o00oOo00().o00oOoo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{44, 62, 120, 106, Ascii.ESC, Ascii.SUB, -106, 122, 46, 63, 67, 97, 17, 49, -111, 116, 40, 60, 67, 110, 1, o0OO0o00.f16655o00oOoOO, -113, 116, 5, 50, 114, 110, Ascii.SYN, 41, -125}, new byte[]{90, 87, Ascii.FS, Ascii.SI, 116, 69, -26, Ascii.ESC}), Boolean.valueOf(o00oOoO.this.f15525o00ooO0O.isChecked()));
            o0O000o0.o00oOo00().o00oOoOO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-65, 122, -127, -49, -83, -60, -37, 51, -67, 123, -70, -60, -89, -17, -36, oo0OOoo.f13516o00oOoO, -69, 120, -70, -35, -85, -1, -33, 58}, new byte[]{-55, 19, -27, -86, -62, -101, -85, 82}), i);
            o0O000o0.o00oOo00().o00oOoOO(o0OOoO0.o00oo.o00oOOo0(new byte[]{42, -82, 75, -33, 117, -90, -41, -13, 40, -81, 112, -44, Byte.MAX_VALUE, -115, -48, -3, 46, -84, 112, -46, Byte.MAX_VALUE, -112, -64, -6, 40}, new byte[]{92, -57, 47, -70, Ascii.SUB, -7, -89, -110}), i2);
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{86, 119, -29, -31, Byte.MIN_VALUE, -76, 53, 36, 102, 115, -26, -9, -114, -55, 110}, new byte[]{5, Ascii.SYN, -107, -124, -96, -25, SignedBytes.MAX_POWER_OF_TWO, 71}));
            try {
                this.f15536o00oOOo0.release();
                this.f15537o00oOOoO.release();
            } catch (Throwable unused) {
            }
            oO0O00oO.o00oOOo0(new o00oOOo0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends Thread {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f15541o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Surface f15542o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15543o00oo0Oo;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    o00oOo00.this.f15543o00oo0Oo.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public o00oOo00(Surface surface, SurfaceTexture surfaceTexture, ProgressDialog progressDialog) {
            this.f15542o00oo0O0 = surface;
            this.f15541o00oo0O = surfaceTexture;
            this.f15543o00oo0Oo = progressDialog;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            for (int i = 0; i < 40 && !o00oOoO.this.f15533o00ooOoo; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (Throwable unused) {
                }
            }
            if (o00oOoO.this.f15533o00ooOoo) {
                return;
            }
            try {
                this.f15542o00oo0O0.release();
                this.f15541o00oo0O.release();
            } catch (Throwable unused2) {
            }
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{101, 43, -27, -65, 75, 78, 99, -85, 81, 47, -8, -20, 72, Ascii.SI, 124, -82, 80, 46, -71, -30, 0}, new byte[]{53, 74, -105, -52, 46, 110, Ascii.NAK, -62}));
            oO0O00oO.o00oOOo0(new o00oOOo0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f15546o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15547o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f15548o00oo0Oo;

        public o00oOo0O(ProgressDialog progressDialog, int i, int i2) {
            this.f15547o00oo0O0 = progressDialog;
            this.f15546o00oo0O = i;
            this.f15548o00oo0Oo = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressDialog progressDialog = this.f15547o00oo0O0;
            progressDialog.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{60, -108, -19, 39, 113, -107, Ascii.CR, -18, 4, -100, -32, 55, 109, -119, Ascii.SI, -32, 90, -37, -119, 19, 113, -104, Ascii.RS, -69, 6, -112, -93, 42, 107, -37, Ascii.RS, -95, Ascii.ESC, -43, -31, 42, Byte.MAX_VALUE, -41, 43, -69, 0, -102, -93, 32, 112, -102, 4, -87, 17, -43, -9, 44, 34}, new byte[]{116, -11, -125, 67, Ascii.CAN, -5, 106, -50}) + this.f15546o00oo0O + o0OOoO0.o00oo.o00oOOo0(new byte[]{86}, new byte[]{46, 68, 56, 35, -87, 72, -44, SignedBytes.MAX_POWER_OF_TWO}) + this.f15548o00oo0Oo);
        }
    }

    /* renamed from: o0Oo0.o00oOoO$o00oOoO  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0218o00oOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f15550o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15551o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f15552o00oo0Oo;

        public RunnableC0218o00oOoO(ProgressDialog progressDialog, int i, int i2) {
            this.f15551o00oo0O0 = progressDialog;
            this.f15550o00oo0O = i;
            this.f15552o00oo0Oo = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressDialog progressDialog = this.f15551o00oo0O0;
            progressDialog.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{58, 7, 69, Ascii.US, 50, 99, 58, 118, 2, Ascii.SI, 72, Ascii.SI, 46, Byte.MAX_VALUE, 56, 120, 92, 72, o0OO0o00.f16655o00oOoOO, 43, 50, 110, 41, 35, 0, 3, Ascii.VT, Ascii.DC2, 40, 45, 51, 57, 6, 70, 88, Ascii.SO, 43, 125, 50, 36, 6, 74, 106, Ascii.SO, 47, 98, 125, 53, Ascii.SUB, 7, 69, Ascii.FS, 62, 45, 41, 57, 72}, new byte[]{114, 102, 43, 123, 91, Ascii.CR, 93, 86}) + this.f15550o00oo0O + o0OOoO0.o00oo.o00oOOo0(new byte[]{56}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, -99, Ascii.SUB, Ascii.DC4, 107, 41, -38, 100}) + this.f15552o00oo0Oo);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo extends Thread {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f15554o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f15555o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15556o00oo0Oo;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    o00oo.this.f15556o00oo0Oo.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public o00oo(int i, int i2, ProgressDialog progressDialog) {
            this.f15555o00oo0O0 = i;
            this.f15554o00oo0O = i2;
            this.f15556o00oo0Oo = progressDialog;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o00oOoO o00oooo2 = o00oOoO.this;
            o00oooo2.o0O0o(o00oooo2.f15516o00oo.getText().toString(), this.f15555o00oo0O0, this.f15554o00oo0O, this.f15556o00oo0Oo);
            oO0O00oO.o00oOOo0(new o00oOOo0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 implements View.OnClickListener {
        public o00oo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o00oOoO.this.o00ooOO0();
            if (o00oOoO.this.f15531o00ooOo0) {
                return;
            }
            oOo00ooO.o00oOo0O();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O implements o0OO0Ooo.o00oo0OO<String> {
        public o00oo00O() {
        }

        @Override // o0OO0Ooo.o00oo0OO
        /* renamed from: o00oOOoO */
        public void o00oOOo0(int i, @o0OO00OO String str, int i2, String str2) {
            o00oOoO o00oooo2;
            int i3 = 1;
            if (i2 != 0) {
                int i4 = 2;
                if (i2 != 1) {
                    i3 = 3;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        o00oooo2 = o00oOoO.this;
                        i4 = 4;
                    }
                } else {
                    o00oooo2 = o00oOoO.this;
                }
                o00oooo2.o00ooO0(i4);
                return;
            }
            o00oOoO.this.o00ooO0(i3);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O implements oo0oO0.o00oOoO {
        public o00oo0O() {
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOo0(@o00oOooO.oo0oO0 List<String> list, boolean z) {
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-32, 82, -4, -43, -47, -46, -57, -15, -33, 89, -82, -36, -35, -49, -35, -3, -44, Ascii.EM, -96}, new byte[]{-80, 55, -114, -72, -72, -95, -76, -104}));
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOoO(@o00oOooO.oo0oO0 List<String> list, boolean z) {
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Throwable f15563o00oo0O0;

        public o00oo0O0(Throwable th) {
            this.f15563o00oo0O0 = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-92, 0, -16, -13, -16, -61, -88, -105, -110, Ascii.SO, -90, -16, -79, -4, -83, -106, -109, 91}, new byte[]{-9, 97, -122, -106, -48, -107, -63, -13}) + this.f15563o00oo0O0);
            o00oOoO.this.f15516o00oo.setText("");
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO implements Runnable {
        public o00oo0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-125, Ascii.DC4, -28, 34, -1, 101, Byte.MAX_VALUE, 48, -75, Ascii.SUB, -78, o0OO0o00.f16655o00oOoOO, -66, 90, 122, 49, -76, 84}, new byte[]{-48, 117, -110, 71, -33, 51, Ascii.SYN, 84}));
            o00oOoO.this.f15516o00oo.setText("");
        }
    }

    /* loaded from: classes3.dex */
    public static class o00ooO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static String f15565o00oOOo0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{32, 90, -19, -50, 83, -109, Ascii.SI, -114, 52, 79, -4}, new byte[]{77, 63, -103, -90, 60, -9, 80, -6});

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static String f15566o00oOOoO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, -39, 32, 107, -60, -68, -55, 6, -93, -40, Ascii.ESC, 98, -60, Byte.MIN_VALUE, -40, Ascii.VT}, new byte[]{-41, -80, 68, Ascii.SO, -85, -29, -71, 103});

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static String f15567o00oOo00 = o0OOoO0.o00oo.o00oOOo0(new byte[]{98, -14, 107, 7, -86, -46, 67, 94, 96, -13, 80, Ascii.SO, -86, -18, 82, 83, 75, -3, 102, Ascii.FF, -92, -31, 108, 80, 97, -17}, new byte[]{Ascii.DC4, -101, Ascii.SI, 98, -59, -115, 51, 63});

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static String f15575o00oOooO = o0OOoO0.o00oo.o00oOOo0(new byte[]{o0OO0o00.f16655o00oOoOO, 114, -15, -60, -71, 38, -21, Ascii.EM, 35, 115, -54, -51, -71, Ascii.SUB, -6, Ascii.DC4, 8, 122, -32, -59, -65, Ascii.SYN, -60, Ascii.GS, 57, 122, -9, -51, -77}, new byte[]{87, Ascii.ESC, -107, -95, -42, 121, -101, 120});

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static String f15568o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-126, Ascii.RS, -10, 74, 52, -54, -12, 124, -109, 19, -35, 82, 2, -59, -17, 106, Byte.MIN_VALUE, Ascii.SUB}, new byte[]{-14, Byte.MAX_VALUE, -126, 34, 107, -90, -101, Ascii.US});

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static String f15569o00oOo0o = o0OOoO0.o00oo.o00oOOo0(new byte[]{-24, 37, -18, -45, 113, 68, 32, 45, -20, 49, -24, -34, 113, SignedBytes.MAX_POWER_OF_TWO, 38, 17, -18, 45, -2, -34, 65}, new byte[]{-104, 68, -102, -69, 46, 52, 73, 78});

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static String f15571o00oOoO0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{83, -27, -36, -86, 121, -8, -118, 48, 80, -33, -43, -100, 109, -50, -102, 43, 103, -10, -52, -111, 107, -2}, new byte[]{56, Byte.MIN_VALUE, -91, -11, Ascii.SO, -111, -18, 68});

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static String f15570o00oOoO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-28, 123, -118, -105, 91, Ascii.ETB, -67, 73, -25, 106, -84, -72, 90, 17, -117, 90, -32, 65, -123, -95, 87, Ascii.ETB, -69}, new byte[]{-113, Ascii.RS, -13, -56, 51, 114, -44, 46});

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static String f15572o00oOoOO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-13, 93, Ascii.CR, -37, 36, 82, 117, -98, -13, 93, Ascii.ESC, -54, 62, Ascii.GS, 116, -79, -79}, new byte[]{-123, 52, Byte.MAX_VALUE, -81, 81, 51, Ascii.EM, -63});

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static String f15573o00oOoOo = o0OOoO0.o00oo.o00oOOo0(new byte[]{-42, -112, 78, 95, 114, -34, -52, Ascii.FS, -48, -112, 95, 95, 114, -51, -59, 109, -54, -119, 91}, new byte[]{-96, -7, 60, 43, 7, -65, -96, 67});

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static String f15574o00oOoo0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{9, -70, -57, 107, 66, -85, -80, -75, Ascii.SI, -70, -42, 107, 66, -72, -71, -75, Ascii.VT, -68, -22, 105, 94, -82, -71, -123, 81, -66, -59, 43}, new byte[]{Byte.MAX_VALUE, -45, -75, Ascii.US, 55, -54, -36, -22});
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 implements o0oo0000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Bitmap f15576o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ String f15577o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ String f15578o00oOo00;

        public o00ooO0(Bitmap bitmap, String str, String str2) {
            this.f15576o00oOOo0 = bitmap;
            this.f15577o00oOOoO = str;
            this.f15578o00oOo00 = str2;
        }

        @Override // o0OOoo0O.o0oo0000
        public Object next() {
            return Bitmap.createBitmap(this.f15576o00oOOo0);
        }

        @Override // o0OOoo0O.o0oo0000
        public void o00oOOo0(float f) {
            if (f >= 1.0f) {
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{44, -1, 123, -1, -127, 68, 81, -43, Ascii.VT, -21, Byte.MAX_VALUE, -1, -127, 71, 77, -43, Ascii.FS, -5, 126, -23, Byte.MIN_VALUE}, new byte[]{Byte.MAX_VALUE, -98, Ascii.CR, -102, -95, Ascii.DC4, 56, -74}));
                o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, o00oOoO.this.f15528o00ooOO0);
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15568o00oOo0O, this.f15577o00oOOoO);
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15569o00oOo0o, this.f15578o00oOo00);
                o00oOoO.this.f15532o00ooOoO = true;
            } else if (f < 0.0f) {
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15568o00oOo0O, "");
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15569o00oOo0o, "");
                o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15571o00oOoO0, 0);
                o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15570o00oOoO, 0);
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-42, 77, -31, -88, -16, -14, -71, -74, -15, 89, -27, -88, -16, -60, -79, -68, -23, 73, -13, -20}, new byte[]{-123, 44, -105, -51, -48, -94, -48, -43}));
                o00oOoO.this.f15532o00ooOoO = true;
            }
        }

        @Override // o0OOoo0O.o0oo0000
        public int size() {
            return 90;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o extends Thread {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ProgressDialog f15581o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    o0O0o.this.f15581o00oo0O0.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public o0O0o(ProgressDialog progressDialog) {
            this.f15581o00oo0O0 = progressDialog;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o00oOoO o00oooo2 = o00oOoO.this;
            o00oooo2.o00oo0o0(o00oooo2.f15516o00oo.getText().toString());
            oO0O00oO.o00oOOo0(new o00oOOo0());
        }
    }

    public o00oOoO(boolean z) {
        this.f15531o00ooOo0 = false;
        this.f15531o00ooOo0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00ooO00(View view) {
        androidx.activity.result.o00oo0OO<String> o00oo0oo;
        String o00oOOo02;
        if (this.f15527o00ooOO.getVisibility() == 0) {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{49, -27, -93, 84, 6, -6, 118}, new byte[]{71, -116, -57, 49, 105, -43, 92, -23}));
            o00oo0oo = this.f15530o00ooOo;
            o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{85, 110, -124, 101, 120, -107, -124}, new byte[]{35, 7, -32, 0, Ascii.ETB, -70, -82, -96});
        } else {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{80, -53, -22, 6, 56, -69, -25}, new byte[]{57, -90, -117, 97, 93, -108, -51, -126}));
            o00oo0oo = this.f15530o00ooOo;
            o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{125, 56, 125, 114, 122, 83, 118}, new byte[]{Ascii.DC4, 85, Ascii.FS, Ascii.NAK, Ascii.US, 124, 92, -24});
        }
        o00oo0oo.o00oOOoO(o00oOOo02);
    }

    public final void o00oo(View view) {
        this.f15517o00oo0O = (PowerSpinnerView) view.findViewById(R.id.protect_method_btn);
        this.f15518o00oo0Oo = (AppCompatButton) view.findViewById(R.id.protect_save);
        this.f15520o00oo0o0 = (AppCompatTextView) view.findViewById(R.id.protect_method_text);
        this.f15519o00oo0o = (AppCompatTextView) view.findViewById(R.id.protect_tip);
        this.f15516o00oo = (AppCompatEditText) view.findViewById(R.id.protect_path);
        this.f15534o0O0o = (AppCompatTextView) view.findViewById(R.id.video_size_note);
        this.f15527o00ooOO = (ConstraintLayout) view.findViewById(R.id.audio_container);
        this.f15521o00oo0oO = (AppCompatTextView) view.findViewById(R.id.protect_audio);
        this.f15525o00ooO0O = (SwitchCompat) view.findViewById(R.id.protect_audio_switch);
        this.f15529o00ooOOo = (ConstraintLayout) view.findViewById(R.id.size_container);
        this.f15524o00ooO00 = (AppCompatEditText) view.findViewById(R.id.protect_width_edit);
        this.f15523o00ooO0 = (AppCompatEditText) view.findViewById(R.id.protect_height_edit);
        AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(R.id.protect_video_select);
        this.f15526o00ooO0o = appCompatButton;
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0.o00oOo00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o00oOoO.this.o00ooO00(view2);
            }
        });
        this.f15517o00oo0O.setItems(Arrays.asList(getString(R.string.vc_protect_method_disable_camera), getString(R.string.vc_protect_method_local), getString(R.string.vc_protect_method_network), getString(R.string.vc_protect_method_local_picture)));
        this.f15517o00oo0O.setOnSpinnerItemSelectedListener(new o00oo00O());
        this.f15518o00oo0Oo.setOnClickListener(new o00oo0());
        int o00oOooO2 = o0O000o0.o00oOo00().o00oOooO(o00ooO.f15565o00oOOo0, 1);
        if (o00oOooO2 > 0) {
            this.f15517o00oo0O.o00ooOo(o00oOooO2 - 1);
            o00ooO0(o00oOooO2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap o00oo0o(android.graphics.Bitmap r14, android.app.ProgressDialog r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0.o00oOoO.o00oo0o(android.graphics.Bitmap, android.app.ProgressDialog):android.graphics.Bitmap");
    }

    public final boolean o00oo0o0(String str) {
        try {
            Uri parse = Uri.parse(str);
            String str2 = App.o00oOOoO().getFilesDir() + o0OOoO0.o00oo.o00oOOo0(new byte[]{-19}, new byte[]{-62, -79, -72, -116, -82, Ascii.CAN, 43, -90}) + o00ooO.f15572o00oOoOO;
            if (str.equals(o0O000o0.o00oOo00().o00oOo0o(o00ooO.f15566o00oOOoO)) && new File(str2).exists()) {
                o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, this.f15528o00ooOO0);
                o0O000o0.o00oOo00().o00oOoo0(o00ooO.f15575o00oOooO, Boolean.valueOf(this.f15525o00ooO0O.isChecked()));
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-62, Ascii.DLE, 55, -116, 68, 113, 87, 119, -12, Ascii.RS, 97, -70, 17, 68, 93, 118, -30, 2, 96}, new byte[]{-111, 113, 65, -23, 100, 39, 62, 19}));
                return true;
            }
            new File(str2).delete();
            boolean o00oOoO02 = oO0O000o.o00oOoO0(App.o00oOOoO().getContentResolver().openInputStream(parse), new File(str2));
            if (o00oOoO02) {
                o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, this.f15528o00ooOO0);
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15566o00oOOoO, str);
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15567o00oOo00, str2);
                o0O000o0.o00oOo00().o00oOoo0(o00ooO.f15575o00oOooO, Boolean.valueOf(this.f15525o00ooO0O.isChecked()));
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-84, -20, 69, 52, -3, -118, 87, 75, -102, -30, 19, 2, -88, -65, 93, 74, -116, -2, Ascii.DC2}, new byte[]{-1, -115, 51, 81, -35, -36, 62, 47}));
            } else {
                o0O000o0.o00oOo00().o00oOooo(o00ooO.f15566o00oOOoO, "");
                oO0O00oO.o00oOOo0(new o00oo0OO());
            }
            return o00oOoO02;
        } catch (Throwable th) {
            o0O000o0.o00oOo00().o00oOooo(o00ooO.f15566o00oOOoO, "");
            oO0O00oO.o00oOOo0(new o00oo0O0(th));
            th.printStackTrace();
            if (th instanceof FileNotFoundException) {
                o00ooO();
            }
            return false;
        }
    }

    public final int[] o00oo0oO(int i, int i2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[] iArr = new int[2];
        int widthAlignment = codecCapabilities.getVideoCapabilities().getWidthAlignment();
        int heightAlignment = codecCapabilities.getVideoCapabilities().getHeightAlignment();
        if (i % widthAlignment != 0) {
            for (int i3 = 0; i3 < 1000; i3++) {
                i--;
                if (i % widthAlignment == 0) {
                    break;
                }
            }
        }
        if (i2 % heightAlignment != 0) {
            for (int i4 = 0; i4 < 1000; i4++) {
                i2--;
                if (i2 % widthAlignment == 0) {
                    break;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final void o00ooO() {
        new o0O00OO(o00oOo0o()).o00oo0O(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.FF, -91, Ascii.ETB, Ascii.GS, 39, -1, -70, -14, Ascii.GS, -82, 1, 2, o0OO0o00.f16655o00oOoOO, -27, -83, -75, 2, -91, 93, oo0OOoo.f13516o00oOoO, Ascii.CR, -41, -102, -125, 40, -109, 39, 42, Ascii.SUB, -40, -97, -112, 50, -104, 39, 32, Ascii.SUB, -41, -103, -103}, new byte[]{109, -53, 115, 111, 72, -106, -34, -36})).o00oo0o0(new o00oo0O());
    }

    public final void o00ooO0(int i) {
        SwitchCompat switchCompat;
        boolean o00oOOoO2;
        this.f15528o00ooOO0 = i;
        if (i == 1) {
            this.f15520o00oo0o0.setText(R.string.vc_protect_method_disable_camera);
            this.f15519o00oo0o.setText(R.string.vc_protect_tip_disable);
            this.f15516o00oo.setVisibility(8);
            this.f15534o0O0o.setVisibility(8);
            this.f15526o00ooO0o.setVisibility(8);
            this.f15527o00ooOO.setVisibility(8);
            this.f15529o00ooOOo.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.f15520o00oo0o0.setText(R.string.vc_protect_method_local);
            this.f15519o00oo0o.setText(R.string.vc_protect_tip_local);
            this.f15516o00oo.setVisibility(0);
            this.f15534o0O0o.setVisibility(0);
            this.f15526o00ooO0o.setVisibility(0);
            this.f15526o00ooO0o.setEnabled(true);
            this.f15526o00ooO0o.setText(R.string.vc_choise_video);
            this.f15527o00ooOO.setVisibility(0);
            this.f15529o00ooOOo.setVisibility(8);
            this.f15516o00oo.setHint("");
            this.f15516o00oo.setEnabled(false);
            this.f15516o00oo.setText(o0O000o0.o00oOo00().o00oOo0o(o00ooO.f15566o00oOOoO));
            switchCompat = this.f15525o00ooO0O;
            o00oOOoO2 = o0O000o0.o00oOo00().o00oOOoO(o00ooO.f15575o00oOooO, true);
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            this.f15520o00oo0o0.setText(R.string.vc_protect_method_local_picture);
            this.f15519o00oo0o.setText(R.string.vc_protect_tip_local_picture);
            this.f15516o00oo.setVisibility(0);
            this.f15534o0O0o.setVisibility(0);
            this.f15526o00ooO0o.setVisibility(0);
            this.f15526o00ooO0o.setEnabled(true);
            this.f15526o00ooO0o.setText(R.string.vc_choise_picture);
            this.f15527o00ooOO.setVisibility(8);
            this.f15529o00ooOOo.setVisibility(0);
            this.f15516o00oo.setHint("");
            this.f15516o00oo.setEnabled(false);
            this.f15516o00oo.setText(o0O000o0.o00oOo00().o00oOo0o(o00ooO.f15568o00oOo0O));
            AppCompatEditText appCompatEditText = this.f15524o00ooO00;
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo02.append(o0O000o0.o00oOo00().o00oOooO(o00ooO.f15571o00oOoO0, 0));
            appCompatEditText.setText(o00oOOo02.toString());
            AppCompatEditText appCompatEditText2 = this.f15523o00ooO0;
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("");
            o00oOOo03.append(o0O000o0.o00oOo00().o00oOooO(o00ooO.f15570o00oOoO, 0));
            appCompatEditText2.setText(o00oOOo03.toString());
            return;
        } else {
            this.f15520o00oo0o0.setText(R.string.vc_protect_method_network);
            this.f15519o00oo0o.setText(R.string.vc_protect_tip_network);
            this.f15516o00oo.setVisibility(0);
            this.f15534o0O0o.setVisibility(0);
            this.f15526o00ooO0o.setVisibility(8);
            this.f15527o00ooOO.setVisibility(0);
            this.f15529o00ooOOo.setVisibility(8);
            this.f15516o00oo.setHint(R.string.vc_protect_path_hint);
            this.f15516o00oo.setEnabled(true);
            this.f15516o00oo.setText(o0O000o0.o00oOo00().o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-77, -124, -11, -34, Ascii.DC2, -25, 19, 84, -79, -123, -50, -43, Ascii.CAN, -52, Ascii.DC4, 90, -73, -122}, new byte[]{-59, -19, -111, -69, 125, -72, 99, 53})));
            switchCompat = this.f15525o00ooO0O;
            o00oOOoO2 = o0O000o0.o00oOo00().o00oOOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-92, -66, -118, 59, 10, -44, Ascii.ETB, 86, -90, -65, -79, 48, 0, -1, Ascii.DLE, 88, -96, -68, -79, 63, Ascii.DLE, -17, Ascii.SO, 88, -115, -78, Byte.MIN_VALUE, 63, 7, -25, 2}, new byte[]{-46, -41, -18, 94, 101, -117, 103, 55}), true);
        }
        switchCompat.setChecked(o00oOOoO2);
    }

    public void o00ooO0O(Uri uri) {
        if (uri != null) {
            this.f15516o00oo.setText(uri.toString());
            if (this.f15524o00ooO00.getVisibility() == 0) {
                try {
                    InputStream openInputStream = App.o00oOOoO().getContentResolver().openInputStream(uri);
                    File file = new File(o00oOo0o().getFilesDir() + o0OOoO0.o00oo.o00oOOo0(new byte[]{82, Ascii.DLE, -18, 62, 72, 107, 87, 43}, new byte[]{125, o0OO0o00.f16655o00oOoOO, -36, Ascii.CR, 102, 1, 39, 76}));
                    file.delete();
                    oO0O000o.o00oOoO0(openInputStream, file);
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    AppCompatEditText appCompatEditText = this.f15524o00ooO00;
                    appCompatEditText.setText("" + decodeFile.getWidth());
                    AppCompatEditText appCompatEditText2 = this.f15523o00ooO0;
                    appCompatEditText2.setText("" + decodeFile.getHeight());
                } catch (Throwable th) {
                    if (th instanceof FileNotFoundException) {
                        o00ooO();
                    }
                }
            }
        }
        oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.FS, -101, Ascii.ESC, 41, -18, Ascii.SI, -18, -49, Ascii.ESC, -102, 36, 51, -17, 46, -18, -30, Ascii.SYN, -49}, new byte[]{115, -11, 77, SignedBytes.MAX_POWER_OF_TWO, -118, 106, -127, -116}) + uri);
    }

    public final void o00ooO0o(String str) {
        if (ooOOO0Oo.o00oOOoO(str)) {
            o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, this.f15528o00ooOO0);
            o0O000o0.o00oOo00().o00oOooo(o0OOoO0.o00oo.o00oOOo0(new byte[]{-118, 110, 52, o0OO0o00.f16655o00oOoOO, 107, Byte.MIN_VALUE, 113, 48, -120, 111, Ascii.SI, 42, 97, -85, 118, 62, -114, 108}, new byte[]{-4, 7, 80, 68, 4, -33, 1, 81}), this.f15516o00oo.getText().toString());
            o0O000o0.o00oOo00().o00oOoo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{107, 68, -31, 105, -33, 84, -117, -64, 105, 69, -38, 98, -43, Byte.MAX_VALUE, -116, -50, 111, 70, -38, 109, -59, 111, -110, -50, 66, 72, -21, 109, -46, 103, -98}, new byte[]{Ascii.GS, 45, -123, Ascii.FF, -80, Ascii.VT, -5, -95}), Boolean.valueOf(this.f15525o00ooO0O.isChecked()));
            o0O000o0.o00oOo00().o00oOoOO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-35, 85, -120, -25, 75, 83, 87, -109, -33, 84, -77, -20, 65, 120, 80, -99, -39, 87, -77, -11, 77, 104, 83, -102}, new byte[]{-85, 60, -20, -126, 36, Ascii.FF, 39, -14}), 720);
            o0O000o0.o00oOo00().o00oOoOO(o0OOoO0.o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -85, -29, 53, 82, 45, -119, -5, 66, -86, -40, 62, 88, 6, -114, -11, 68, -87, -40, 56, 88, Ascii.ESC, -98, -14, 66}, new byte[]{54, -62, -121, 80, oo0OOoo.f13516o00oOoO, 114, -7, -102}), MediaDiscoverer.Event.Started);
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{120, -57, -23, Ascii.ESC, -17, 50, -102, -48, 72, -61, -20, Ascii.CR, -31, 79, -63}, new byte[]{43, -90, -97, 126, -49, 97, -17, -77}));
            return;
        }
        this.f15533o00ooOoo = false;
        ExoPlayer build = new ExoPlayer.Builder(o0OO0oO.o00oOOoO()).build();
        try {
            ProgressDialog progressDialog = new ProgressDialog(o00oOo0o(), 0);
            progressDialog.setCancelable(false);
            progressDialog.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{100, -77, 111, -61, -9, Ascii.DC4, -109, -100, 90, -69, 101, -62, -15, 84, -38, -110}, new byte[]{44, -46, 1, -89, -98, 122, -12, -68}));
            progressDialog.show();
            SurfaceTexture surfaceTexture = new SurfaceTexture(12);
            Surface surface = new Surface(surfaceTexture);
            build.setVideoSurface(surface);
            build.setVolume(0.0f);
            build.setRepeatMode(0);
            build.addAnalyticsListener(new o00oOOoO(surface, surfaceTexture, progressDialog));
            build.setMediaSource(oO0000Oo.o00oOOoO(str, o0OOO00.o00oOOo0()));
            build.prepare();
            build.play();
            new o00oOo00(surface, surfaceTexture, progressDialog).start();
        } catch (Throwable th) {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-23, -105, 108, 83, -5, -80, -121, Ascii.SYN, -23, -105, 108, 83, -11, -81, -117, Ascii.ESC, -14, -89, 119, 89, -14, -95, -117, 3, -63, Byte.MIN_VALUE, 118, 72, -22, -12}, new byte[]{-105, -23, Ascii.DC2, 45, -123, -50, -7, 104}) + th);
        }
    }

    public final void o00ooOO0() {
        Thread o0o0o;
        if (this.f15531o00ooOo0 && !o0.o00oOoO().o00oOoo0()) {
            PayActivity.o0oO0O0o(o00oOo0o());
            return;
        }
        int i = this.f15528o00ooOO0;
        if (i == 1) {
            o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, this.f15528o00ooOO0);
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-115, 77, -110, Ascii.DLE, -9, -111, 70, -75, -67, 73, -105, 6, -7, -20, Ascii.GS}, new byte[]{-34, 44, -28, 117, -41, -62, 51, -42}));
            return;
        }
        if (i != 2) {
            if (i == 3) {
                if (TextUtils.isEmpty(this.f15516o00oo.getText())) {
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-88, 118, 41, -60, -66, -42, Ascii.NAK, Ascii.ESC, -118, 63, 62, -60, -91, -40, 85, 90}, new byte[]{-2, Ascii.US, 77, -95, -47, -10, 123, 116}));
                    return;
                } else if (oO0Ooooo.o00oOOo0()) {
                    o00ooO0o(this.f15516o00oo.getText().toString());
                    return;
                } else {
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{125, -91, 77, -98, -55, 41, -61, -115, 86, -72, 76, -102, -57, 43, -61, -75, 92, -66, Ascii.US, Byte.MIN_VALUE, -35, 53, -109, -76, 65, -66, Ascii.RS}, new byte[]{51, -54, 63, -13, -88, 69, -29, -37}));
                    return;
                }
            } else if (i != 4) {
                return;
            } else {
                if (TextUtils.isEmpty(this.f15516o00oo.getText())) {
                    oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{121, -99, -127, -90, -46, 65, -121, -87, 71, -101, -106, -14, -44, 86, -106, -89, 7, -38}, new byte[]{41, -12, -30, -46, -89, 51, -30, -119}));
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-57, 57, Ascii.CR, 17, 52, 92, Ascii.NAK, 56, -7, 63, Ascii.SUB, 69, 50, 75, 4, 54, -71, 126}, new byte[]{-105, 80, 110, 101, 65, 46, 112, Ascii.CAN}));
                    return;
                }
                try {
                    int intValue = Integer.valueOf(this.f15524o00ooO00.getText().toString()).intValue();
                    int intValue2 = Integer.valueOf(this.f15523o00ooO0.getText().toString()).intValue();
                    ProgressDialog progressDialog = new ProgressDialog(o00oOo0o(), 0);
                    progressDialog.setCancelable(false);
                    progressDialog.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{100, 89, -79, -98, 17, -76, -44, -104, 92, 81, -68, -114, Ascii.CR, -88, -42, -106, 2, Ascii.SYN}, new byte[]{44, 56, -33, -6, 120, -38, -77, -72}));
                    progressDialog.show();
                    o0o0o = new o00oo(intValue, intValue2, progressDialog);
                } catch (Throwable unused) {
                    oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{41, -11, -3, 80, 67, -69, 89, -29, 55, -5, -15, 80, Ascii.VT, -15, 67, -12, 49, -18, -73}, new byte[]{94, -100, -103, 36, 43, -108, 49, -122}));
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-120, 124, Ascii.DC2, -71, 58, 119, -92, -108, -106, 114, Ascii.RS, -71, 114, oo0OOoo.f13516o00oOoO, -66, -125, -112, 103, 88}, new byte[]{-1, Ascii.NAK, 118, -51, 82, 88, -52, -15}));
                    return;
                }
            }
        } else if (TextUtils.isEmpty(this.f15516o00oo.getText())) {
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{87, -125, -45, -125, -93, -78, -55, 80, 117, -54, -60, -125, -72, -68, -119, 17}, new byte[]{1, -22, -73, -26, -52, -110, -89, 63}));
            return;
        } else {
            ProgressDialog progressDialog2 = new ProgressDialog(o00oOo0o(), 0);
            progressDialog2.setCancelable(false);
            progressDialog2.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{1, o0OO0o00.f16655o00oOoOO, -57, -52, Ascii.FF, -20, -117, -115, 63, 41, -51, -51, 10, -84, -62, -125}, new byte[]{73, SignedBytes.MAX_POWER_OF_TWO, -87, -88, 101, -126, -20, -83}));
            progressDialog2.show();
            o0o0o = new o0O0o(progressDialog2);
        }
        o0o0o.start();
    }

    public final boolean o0O0o(String str, int i, int i2, ProgressDialog progressDialog) {
        try {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-39, -97, 100, -111, -115, 121, -97, -124, -39, -106, 96, -103, -60, 90, -103, -74, -118}, new byte[]{-80, -14, 5, -10, -24, 45, -16, -46}) + i + o0OOoO0.o00oo.o00oOOo0(new byte[]{92, -112, 66, -98, -111}, new byte[]{112, -8, 39, -9, -85, -126, -33, 94}) + i2);
            Uri parse = Uri.parse(str);
            String str2 = App.o00oOOoO().getFilesDir() + o0OOoO0.o00oo.o00oOOo0(new byte[]{73}, new byte[]{102, 98, 101, -121, -48, -74, 79, Ascii.SI}) + o00ooO.f15573o00oOoOo;
            if (str.equals(o0O000o0.o00oOo00().o00oOo0o(o00ooO.f15568o00oOo0O)) && new File(str2).exists()) {
                int o00oOooO2 = o0O000o0.o00oOo00().o00oOooO(o00ooO.f15571o00oOoO0, 0);
                int o00oOooO3 = o0O000o0.o00oOo00().o00oOooO(o00ooO.f15570o00oOoO, 0);
                if (o00oOooO2 == i && o00oOooO3 == i2) {
                    oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{65, Ascii.DC2, Ascii.SI, 41, 119, -94, Ascii.EM, -77, 72, Ascii.CAN, 85, 39, 58}, new byte[]{47, 125, 123, 9, Ascii.DC4, -54, 120, -35}));
                    o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15565o00oOOo0, this.f15528o00ooOO0);
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{56, Ascii.SO, -103, 59, -118, -45, -100, -39, Ascii.SO, 0, -49, Ascii.CR, -33, -26, -106, -40, Ascii.CAN, Ascii.FS, -50}, new byte[]{107, 111, -17, 94, -86, -123, -11, -67}));
                    return true;
                }
            }
            o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15571o00oOoO0, i);
            o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15570o00oOoO, i2);
            new File(str2).delete();
            oO0O000o.o00oOoO0(App.o00oOOoO().getContentResolver().openInputStream(parse), new File(str2));
            String str3 = App.o00oOOoO().getFilesDir() + o0OOoO0.o00oo.o00oOOo0(new byte[]{-93}, new byte[]{-116, o0OO0o00.f16655o00oOoOO, 104, -38, -90, -95, 52, -112}) + o00ooO.f15574o00oOoo0;
            Bitmap o00oo0o2 = o00oo0o(BitmapFactory.decodeFile(str2), progressDialog);
            this.f15532o00ooOoO = false;
            new oO0O0OoO(new o00ooO0(o00oo0o2, str, str3), new File(str3), 30).o00oo00O();
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                if (!this.f15532o00ooOoO) {
                    try {
                        Thread.sleep(50L);
                    } catch (Exception unused) {
                    }
                    if (System.currentTimeMillis() - currentTimeMillis >= 40000) {
                        o0O000o0.o00oOo00().o00oOooo(o00ooO.f15568o00oOo0O, "");
                        o0O000o0.o00oOo00().o00oOooo(o00ooO.f15569o00oOo0o, "");
                        o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15571o00oOoO0, 0);
                        o0O000o0.o00oOo00().o00oOoOO(o00ooO.f15570o00oOoO, 0);
                        oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.NAK, -75, -17, -103, 54, -111, 43, -80, 50, -95, -21, -103, 54, -89, 35, -70, 42, -79, -3, -35}, new byte[]{70, -44, -103, -4, Ascii.SYN, -63, 66, -45}));
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f15532o00ooOoO = false;
            o00oo0o2.recycle();
            return true;
        } catch (Throwable th) {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{105, 50, 98}, new byte[]{Ascii.FF, 74, 88, Ascii.SUB, -27, -8, -75, -97}) + th);
            o0O000o0.o00oOo00().o00oOooo(o00ooO.f15568o00oOo0O, "");
            o0O000o0.o00oOo00().o00oOooo(o00ooO.f15569o00oOo0o, "");
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{36, 60, 47, 121, 104, 46, -63, -78, 3, 40, 43, 121, 104, Ascii.CAN, -55, -72, Ascii.ESC, 56, oo0OOoo.f13516o00oOoO, 38}, new byte[]{119, 93, 89, Ascii.FS, 72, 126, -88, -47}) + th);
            oO0O00oO.o00oOOo0(new o00oOOo0());
            th.printStackTrace();
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0OO00OO
    public View onCreateView(@o00oOooO.oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vc_activity_camera_settings, viewGroup, false);
        o00oo(inflate);
        return inflate;
    }
}
