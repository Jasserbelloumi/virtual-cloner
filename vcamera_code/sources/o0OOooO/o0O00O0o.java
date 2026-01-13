package o0OOooO;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.o00oOo0O;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import multispace.multiapp.clone.R;
import o0OOO0oo.oo0OOoo;
import o0OOoOo0.ooOOO0Oo;
import o0OOoo0O.oO0Ooooo;
import o0Oo00oo.o0O000o0;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O00o0;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0Oo0o0;
import o0ooO0O0.oOo00ooO;
/* loaded from: classes3.dex */
public class o0O00O0o {

    /* loaded from: classes3.dex */
    public class o0 implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f15351o00oo0O0;

        public o00oOOo0(o0O00000 o0o00000) {
            this.f15351o00oo0O0 = o0o00000;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            oO0O00o0.o00oOOoO(0);
            this.f15351o00oo0O0.o00oOo00();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f15352o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f15353o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements DialogInterface.OnClickListener {
            public o00oOOo0() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    dialogInterface.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                oO0O00o0.o00oOo00(0);
                o00oOo00.this.f15352o00oo0O.o00oOOoO();
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO implements DialogInterface.OnClickListener {
            public o00oOOoO() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    dialogInterface.dismiss();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public o00oOo00(Activity activity, o0O00000 o0o00000) {
            this.f15353o00oo0O0 = activity;
            this.f15352o00oo0O = o0o00000;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(this.f15353o00oo0O0).setCancelable(false);
            cancelable.setTitle(o0OOoO0.o00oo.o00oOOo0(new byte[]{-76, Ascii.US, 40, -73}, new byte[]{-32, 118, 88, -60, 41, -75, -73, -89})).setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{-113, Byte.MIN_VALUE, -118, -6, -98, -99, Ascii.VT, 38, -77, -116, -123, -27, -122, -123, 71, Ascii.US, -3, -94, -124, -7, -107, -120, 78, 83, -101, -105, -118, -5, -105, -109, 68, 1, -74, -38}, new byte[]{-35, -27, -21, -106, -14, -28, 43, 115}));
            cancelable.setPositiveButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{93, 57, -51}, new byte[]{4, 92, -66, 119, 36, -83, 5, 103}), new o00oOOo0());
            cancelable.setNegativeButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{117, -58, Ascii.CAN, Ascii.FS, -125, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{54, -89, 118, Byte.MAX_VALUE, -17, 37, 117, -22}), new o00oOOoO());
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            show.show();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f15356o00oo0O0;

        public o00oOo0O(o0O00000 o0o00000) {
            this.f15356o00oo0O0 = o0o00000;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f15356o00oo0O0.o00oOo00();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f15357o00oo0O0;

        public o00oOoO(o0O00000 o0o00000) {
            this.f15357o00oo0O0 = o0o00000;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f15357o00oo0O0.o00oOOo0();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f15358o00oo0O0;

        public o00oo0(AppCompatActivity appCompatActivity) {
            this.f15358o00oo0O0 = appCompatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -3) {
                o0O000o0.o00oOo00().o00oOoo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{37, -109, -104, SignedBytes.MAX_POWER_OF_TWO, 48, 10, 72, -13, 37, -92, -109, 94, Ascii.SO, Ascii.DC2, 78, -28}, new byte[]{86, -5, -9, 55, 111, 126, o0OO0o00.f16655o00oOoOO, -125}), Boolean.FALSE);
            } else if (i != -1) {
            } else {
                try {
                    try {
                        String o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{62, -32, 4, 106, -2, 81, 121, 110, 54, -32, Ascii.DC4, 125, -1, 76, 51, o0OO0o00.f16655o00oOoOO, 60, -6, 9, 119, -1, Ascii.SYN, 75, 9, Ascii.SUB, -39}, new byte[]{95, -114, 96, Ascii.CAN, -111, 56, Ascii.GS, SignedBytes.MAX_POWER_OF_TWO});
                        Intent intent = new Intent(o00oOOo02, Uri.parse(o0OOoO0.o00oo.o00oOOo0(new byte[]{-11, 54, -112, -82, -117, 69, -111, 42, -73, 51, -121, -79, -113, 88, -57, 118, -89, 62, -122, -8}, new byte[]{-104, 87, -30, -59, -18, 49, -85, 5}) + this.f15358o00oo0O0.getPackageName()));
                        intent.setPackage(o0OOoO0.o00oo.o00oOOo0(new byte[]{82, -118, -78, 121, Ascii.ESC, -19, -66, 98, 94, -116, -69, 121, Ascii.FF, -26, -76, 116, 88, -117, -72}, new byte[]{49, -27, -33, 87, 122, -125, -38, Ascii.DLE}));
                        this.f15358o00oo0O0.startActivity(intent);
                    } catch (Throwable unused) {
                        oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-65, -64, 101, -3, 67, 105, -5, -108, -73, -36, 101, -77, 19, 98, -11, -126, -16, -42, 97, -6, Ascii.SI, 107, -16}, new byte[]{-48, -80, 0, -109, 99, Ascii.SO, -108, -5}));
                    }
                } catch (Throwable unused2) {
                    AppCompatActivity appCompatActivity = this.f15358o00oo0O0;
                    String o00oOOo03 = o0OOoO0.o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -58, 34, -91, -83, -61, 55, -109, 72, -58, 50, -78, -84, -34, 125, -36, 66, -36, 47, -72, -84, -124, 5, -12, 100, -1}, new byte[]{o0OO0o00.f16655o00oOoOO, -88, 70, -41, -62, -86, 83, -67});
                    appCompatActivity.startActivity(new Intent(o00oOOo03, Uri.parse(o0OOoO0.o00oo.o00oOOo0(new byte[]{115, 89, 103, 51, -86, 78, -58, 107, 107, 65, 114, 58, -9, 19, -122, 43, 124, 65, 118, 109, -70, Ascii.ESC, -124, 107, 104, 89, 124, 49, -68, 91, -120, 52, 107, 94, 60, 39, -68, 0, -120, 45, 119, 94, 44, 42, -67, 73}, new byte[]{Ascii.ESC, 45, 19, 67, -39, 116, -23, 68}) + this.f15358o00oo0O0.getPackageName())));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f15359o00oo0O0;

        public o00oo00O(o0O00000 o0o00000) {
            this.f15359o00oo0O0 = o0o00000;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                this.f15359o00oo0O0.o00oOOo0();
            } else if (i != -1) {
            } else {
                o0O000o0.o00oOo00().o00oOoo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-88, -65, 4, 34, 120, 42, -84, 44, -91, -127, Ascii.DC4, Ascii.DC2, 116, oo0OOoo.f13516o00oOoO, -78, 32, -95, -80, Ascii.DC4, Ascii.CAN}, new byte[]{-64, -34, 119, 125, Ascii.EM, 77, -34, 73}), Boolean.TRUE);
                this.f15359o00oo0O0.o00oOo00();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            o0O000o0.o00oOo00().o00oOoo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{98, -77, -69, 110, SignedBytes.MAX_POWER_OF_TWO, 50, 109, 122, 99, -81, -117, 125, 118, 32, 117, 116, 118}, new byte[]{17, -37, -44, Ascii.EM, Ascii.US, 65, Ascii.EM, Ascii.ESC}), Boolean.FALSE);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f15360o00oo0O0;

        public o00oo0OO(Activity activity) {
            this.f15360o00oo0O0 = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
                try {
                    this.f15360o00oo0O0.startActivity(new Intent(o0OOoO0.o00oo.o00oOOo0(new byte[]{-28, -44, 4, 4, -25, -65, -78, Ascii.FS, -20, -44, Ascii.DC4, 19, -26, -94, -8, 83, -26, -50, 9, Ascii.EM, -26, -8, Byte.MIN_VALUE, 123, -64, -19}, new byte[]{-123, -70, 96, 118, -120, -42, -42, 50}), Uri.parse(o0OOoO0.o00oo.o00oOOo0(new byte[]{-46, 84, Ascii.SI, Ascii.US, Ascii.EM, -111, -40, -72, -35, 73, Ascii.SI, 7, Ascii.US, -55, -39, -12, -43, 77, 84, Ascii.SO, 4, -49, -127, -2, -54, 71, 9, 0, Ascii.US, -37, -40, -63, -7, 65, Ascii.SYN, 10, Ascii.CAN, -54}, new byte[]{-70, 32, 123, 111, 106, -85, -9, -105}))));
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                    oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{118, -81, -59, -15, -70, Ascii.EM, 83, -83, 117, -70, -60, -79}, new byte[]{Ascii.EM, -33, -96, -97, -102, Byte.MAX_VALUE, 50, -60}));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ boolean f15361o00oo0O0;

        public o00ooO(boolean z) {
            this.f15361o00oo0O0 = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            oO0Ooooo.o00oOOoO(!this.f15361o00oo0O0);
            oOo00ooO.o00oOo0O();
            oO0Oo0o0.o00oOoO(this.f15361o00oo0O0 ? o0OOoO0.o00oo.o00oOOo0(new byte[]{124, -5, 113, Byte.MAX_VALUE, 109, -8, 123, 123, SignedBytes.MAX_POWER_OF_TWO, -84, 86, 100, 124, -3, 58, 99, Ascii.SI, -1, 109, 104, 109, -11, 40, 124, 1}, new byte[]{47, -116, Ascii.CAN, Ascii.VT, Ascii.SO, -112, 91, Ascii.SI}) : o0OOoO0.o00oo.o00oOOo0(new byte[]{56, -32, 87, -58, -4, -55, -109, -123, 4, -73, 110, -64, -16, -127, -64, -124, 8, -12, 91, -63, -20, -113}, new byte[]{107, -105, 62, -78, -97, -95, -77, -15}));
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f15362o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f15363o00oo0O0;

        public o00ooO0(Activity activity, String str) {
            this.f15363o00oo0O0 = activity;
            this.f15362o00oo0O = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ((ClipboardManager) this.f15363o00oo0O0.getSystemService(o0OOoO0.o00oo.o00oOOo0(new byte[]{37, -2, -53, 71, -15, -5, -120, -104, 34}, new byte[]{70, -110, -94, 55, -109, -108, -23, -22}))).setPrimaryClip(ClipData.newPlainText(o0OOoO0.o00oo.o00oOOo0(new byte[]{88, 37, 1, -97, -115}, new byte[]{Ascii.US, 72, 96, -10, -31, -80, 51, 52}), this.f15362o00oo0O));
            oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{48, -79, Ascii.SUB, SignedBytes.MAX_POWER_OF_TWO, o0OO0o00.f16655o00oOoOO}, new byte[]{83, -34, 106, 57, Ascii.ESC, 2, -20, 59}) + this.f15362o00oo0O);
        }
    }

    /* loaded from: classes3.dex */
    public interface o0O00000 {
        void o00oOOo0();

        void o00oOOoO();

        void o00oOo00();
    }

    /* loaded from: classes3.dex */
    public class o0O0o implements DialogInterface.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Activity f15364o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ String f15365o00oo0O0;

        public o0O0o(String str, Activity activity) {
            this.f15365o00oo0O0 = str;
            this.f15364o00oo0O = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                dialogInterface.dismiss();
                try {
                    Uri parse = Uri.parse(o0OOoO0.o00oo.o00oOOo0(new byte[]{-38, -88, 38, -117, 47, 99, 80}, new byte[]{-73, -55, 79, -25, 91, Ascii.FF, 106, 2}) + this.f15365o00oo0O0);
                    String[] strArr = {this.f15365o00oo0O0};
                    Intent intent = new Intent(o0OOoO0.o00oo.o00oOOo0(new byte[]{-26, 60, 59, 94, 0, -93, 126, -1, -18, 60, 43, 73, 1, -66, 52, -80, -28, 38, 54, 67, 1, -28, 73, -108, -55, Ascii.SYN, Ascii.VT, 99}, new byte[]{-121, 82, 95, 44, 111, -54, Ascii.SUB, -47}), parse);
                    intent.putExtra(o0OOoO0.o00oo.o00oOOo0(new byte[]{121, -97, -116, 53, -31, -33, -16, -57, 113, -97, -100, 34, -32, -62, -70, -116, 96, -123, -102, 38, -96, -11, -41}, new byte[]{Ascii.CAN, -15, -24, 71, -114, -74, -108, -23}), strArr);
                    intent.putExtra(o0OOoO0.o00oo.o00oOOo0(new byte[]{-24, 114, Ascii.EM, o0OO0o00.f16655o00oOoOO, 78, -4, -26, -122, -32, 114, 9, 54, 79, -31, -84, -51, -15, 104, Ascii.SI, 50, Ascii.SI, -58, -41, -22, -61, 89, 62, 7}, new byte[]{-119, Ascii.FS, 125, 83, o0OO0o00.f16655o00oOoOO, -107, -126, -88}), "");
                    intent.putExtra(o0OOoO0.o00oo.o00oOOo0(new byte[]{34, 0, -117, -96, 34, -64, -83, -2, 42, 0, -101, -73, 35, -35, -25, -75, 59, Ascii.SUB, -99, -77, 99, -3, -116, -120, Ascii.ETB}, new byte[]{67, 110, -17, -46, 77, -87, -55, -48}), "");
                    this.f15364o00oo0O.startActivity(Intent.createChooser(intent, o0OOoO0.o00oo.o00oOOo0(new byte[]{93, -79, -107, -46, 40, 101, -45, -54, 98}, new byte[]{Ascii.SO, -44, -5, -74, 111, 8, -78, -93})));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-12, 77, -89, 113, 80, 4, 7, -116, -9, 88, -90, 49}, new byte[]{-101, oo0OOoo.f13516o00oOoO, -62, Ascii.US, 112, 98, 102, -27}));
            }
        }
    }

    public static boolean o00oOOo0(Activity activity, o0O00000 o0o00000) {
        try {
            if (o0O000o0.o00oOo00().o00oOOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-92, 109, Ascii.DLE, -52, 86, -60, -56, -40, -87, 83, 0, -4, 90, -45, -42, -44, -83, 98, 0, -10}, new byte[]{-52, Ascii.FF, 99, -109, 55, -93, -70, -67}), false)) {
                return false;
            }
            o00oo00O o00oo00o = new o00oo00O(o0o00000);
            String o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SO, -55, Ascii.VT, 89, 88, Byte.MAX_VALUE, 80, 10, 50, -49, 88, Ascii.FF, 74, 106, 0, 82, 122, -33, 68, 89, Ascii.VT, 119, 5, Ascii.CR, 46, -122, 88, 88, 89, 115, 19, 10, 54, -33, Ascii.VT, 79, 68, 119, 0, Ascii.DC2, 35, -122, 92, 69, 95, 114, 80, Ascii.DC2, 59, -47, 88, Ascii.FF, 74, 116, Ascii.DC4, 94, 40, -61, 76, 89, 71, 123, 4, Ascii.ETB, 53, -56, 88, 2, Ascii.VT, 83, 4, 94, 51, -43, Ascii.VT, 95, 95, 104, Ascii.EM, Ascii.GS, 46, -54, 82, Ascii.FF, 91, 104, Ascii.US, Ascii.SYN, 51, -60, 66, 88, 78, 126, 80, 10, 53, -122, 94, 95, 78, 58, 4, Ascii.SYN, 51, -43, Ascii.VT, 77, 91, 106, 80, Ascii.CAN, 53, -44, Ascii.VT, 77, 69, 99, 80, Ascii.ETB, 54, -54, 78, 75, 74, 118, 80, Ascii.US, 57, -46, 66, 90, 66, 110, Ascii.EM, Ascii.ESC, 41, -118, Ascii.VT, 67, 95, 114, Ascii.NAK, Ascii.FF, 45, -49, 88, 73, Ascii.VT, 110, Ascii.CAN, Ascii.ESC, 122, -59, 68, 66, 88, Byte.MAX_VALUE, 1, Ascii.VT, 63, -56, 72, 73, 88, 58, 7, Ascii.ETB, 54, -54, Ascii.VT, 78, 78, 58, Ascii.DC2, 17, 40, -56, 78, Ascii.FF, 73, 99, 80, 17, 52, -61, 88, 73, 71, 124, 94, 94, Ascii.RS, -55, Ascii.VT, 85, 68, 111, 80, Ascii.US, oo0OOoo.f13516o00oOoO, -44, 78, 73, Ascii.DC4}, new byte[]{90, -90, 43, 44, 43, Ascii.SUB, 112, 126});
            String o00oOOo03 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-45, 47, -18, -116, 115, 83, -22, -96, -13, 108, -1, -118, 123, 82, -93, -114, -48, Ascii.FS, -85, -127, 115, 79, -93, -70, -13, 41, -79}, new byte[]{Byte.MIN_VALUE, 76, -117, -30, Ascii.DC2, o0OO0o00.f16655o00oOoOO, -125, -49});
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(o00oOOo03);
            stringBuffer.append("\n");
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{37, o0OO0o00.f16655o00oOoOO, 50, 40, 112, -76, Ascii.CR, -87, 96, 47, Ascii.SYN, 50, 122, -32, Ascii.CAN, -72, 125, 121, 3, 57, 102, -32, 7, -84, 52, 123, 10, 63, 63, -93, 9, -89, 113, 125, 3, 122, 126, -82, Ascii.FF, -22, 100, 125, 7, 44, 122, -82, Ascii.FS, -22, 103, 96, Ascii.SI, 63, 63, -95, Ascii.CAN, -70, 103, 47, 4, 40, 112, -83, 72, -89, 117, 99, Ascii.VT, 57, 118, -81, Ascii.GS, -71, 120, 118, 66, 46, 126, -85, 1, -92, 115, 47, Ascii.DC2, 51, 124, -76, Ascii.GS, -72, 113, 124, 76, 80, Ascii.NAK}, new byte[]{Ascii.DC4, Ascii.SI, 98, 90, Ascii.US, -64, 104, -54}));
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, 122, -100, 113, Ascii.CR, 41, -122, 113, -3, 39, -71, 107, Ascii.SI, 45, -56, 68, -96, 116, -125, 113, Ascii.SYN, 37, -54, 81, -4, 116, -92, 119, 91, 3, -28, 99, -94, 116, -78, 109, Ascii.SI, 108, -53, 81, -9, 116, -78, 125, 91, 46, -61, 68, -6, 49, -94, 56, Ascii.SI, 36, -57, 94, -82, Ascii.ESC, -110, 75, 87, 108, -59, 81, -32, 116, -78, 125, 91, 57, -43, 85, -22, 116, -74, 119, 9, 108, -14, 71, -25, 32, -77, 112, 87, 108, -1, 95, -5, 32, -91, 122, Ascii.RS, 96, -122, 118, -17, 55, -75, 122, Ascii.DC4, 35, -51, Ascii.FS, -82, 49, -92, 123, 85, 70, -84}, new byte[]{-114, 84, -48, Ascii.CAN, 123, 76, -90, 48}));
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{50, 104, -65, -24, 73, -36, -76, -27, 96, 47, -108, -21, 88, -41, -78, -79, 96, 43, -107, -24, 90, -103, -96, -29, 104, 35, -108, -30, 78, -105, -26, -39, 110, 49, -38, -32, 72, -41, -26, -8, 117, 102, -115, -23, 72, -43, -94, -79, 99, 35, -38, -14, 82, -103, -76, -12, 98, 41, -120, -30, Ascii.GS, -40, -26, -7, 104, 42, -101, -12, 84, -42, -77, -30, o0OO0o00.f16655o00oOoOO, 48, -109, -30, 88, -42, -26, -27, 110, 102, -118, -12, 92, -41, -83, -79, 120, 41, -113, -12, Ascii.GS, -33, -76, -8, 100, 40, -98, -11, 19, -77, -52}, new byte[]{1, 70, -6, -122, oo0OOoo.f13516o00oOoO, -71, -58, -111}));
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{97, 42, Ascii.FF, -90, 17, 125, -3, 3, 117, 101, 41, -95, 94, 62, -20, Ascii.US, 48, 114, 32, -68, 69, 62, -5, 4, 39, 104, 35, -96, 88, 123, -14, 9, 117, 114, 44, -74, 84, 113, -68, Ascii.SO, 52, 104, 41, -14, 82, 118, -7, Ascii.SO, 62, 119, 107, -14, 101, 118, -11, 3, 62, 36, 36, -80, 94, 107, -24, 77, 60, 112, 105, -14, 72, 113, -23, 77, 52, 106, o0OO0o00.f16655o00oOoOO, -14, 72, 113, -23, Ascii.US, 117, 98, 55, -69, 84, 112, -8, Ascii.RS, 117, 101, 55, -73, 17, 122, -18, 4, 59, 111, 44, -68, 86, 62, -3, 3, 49, 36, 54, -69, 95, 121, -11, 3, 50, 36, 42, -89, 69, 109, -11, 9, 48, 40, 101, -77, 95, 122, -68, Ascii.EM, oo0OOoo.f13516o00oOoO, 97, 43, -14, 72, 113, -23, Ascii.US, 117, 99, 44, -96, 93, 120, -18, 4, 48, 106, o0OO0o00.f16655o00oOoOO, -11, 66, 62, -22, 4, 49, 97, 42, -14, 82, Byte.MAX_VALUE, -16, 1, 117, 103, 42, -65, 84, 109, -80, 77, Ascii.FF, 107, 48, -14, 82, Byte.MAX_VALUE, -14, 77, 48, 101, 54, -69, 93, 103, -68, Ascii.ESC, 60, 96, 32, -67, 17, 105, -11, Ascii.EM, oo0OOoo.f13516o00oOoO, 36, 45, -73, 67, 62, -24, 2, 117, 101, 51, -67, 88, 122, -68, Ascii.FF, 117, 102, 44, -75, 17, 105, -3, Ascii.US, 123, 42, 107, -40}, new byte[]{85, 4, 69, -46, 49, Ascii.RS, -100, 109}));
            stringBuffer.append("\n");
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{-8, 78, 55, -55, -15, -99, -107, 112, -91}, new byte[]{-81, 47, 69, -89, -104, -13, -14, 74}));
            stringBuffer.append(o00oOOo02);
            stringBuffer.append("\n");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(stringBuffer.toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan((int) o0.o00oOOo0.f6865o00oOo00), stringBuffer.toString().indexOf(o00oOOo02), stringBuffer.toString().length(), 34);
            spannableStringBuilder.setSpan(new ForegroundColorSpan((int) o0.o00oOOo0.f6865o00oOo00), stringBuffer.toString().indexOf(o00oOOo03), o00oOOo03.length(), 34);
            return o00oOo00(activity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-56, Byte.MIN_VALUE, -111, 97, 6, 52}, new byte[]{-122, -17, -27, 8, 101, 81, -59, -92}), spannableStringBuilder, o0OOoO0.o00oo.o00oOOo0(new byte[]{48, Ascii.ESC, -36, 65, -1}, new byte[]{113, 124, -82, 36, -102, 67, 119, 79}), o0OOoO0.o00oo.o00oOOo0(new byte[]{-22, 124, 118, 123, -102, -44, -111, 116, -63}, new byte[]{-92, 19, 2, 91, -37, -77, -29, 17}), "", o00oo00o);
        } catch (Throwable th) {
            th.printStackTrace();
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SO, Ascii.CR, -86}, new byte[]{107, 117, -112, 82, -2, 40, -125, 55}) + th);
            return false;
        }
    }

    public static void o00oOOoO(Activity activity) {
        try {
            String str = "";
            if (ooOOO0Oo.o00oOOo0()) {
                str = o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, -103, 9, 55, Ascii.CR, -10, 74, 101, -81, -119, Ascii.NAK, 49, Ascii.VT, -13, 83, 116, -116, -117, 8, 34, Ascii.CR, -23, Ascii.DC4, 103, -93, -127}, new byte[]{-52, -20, 101, 67, 100, -123, 58, 4});
            } else if (ooOOO0Oo.o00oOo00()) {
                str = o0OOoO0.o00oo.o00oOOo0(new byte[]{-88, -24, -16, -125, -99, Ascii.ESC, 59, 110, -90, -13, -28, -75, -109, 6, oo0OOoo.f13516o00oOoO, 117, -91, -88, -9, -102, -103}, new byte[]{-55, -122, -108, -11, -12, 107, 92, Ascii.FS});
            }
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
            o00oOo0O.o00oOOo0 title = cancelable.setTitle(o0OOoO0.o00oo.o00oOOo0(new byte[]{-121, 38, Ascii.NAK, 125, -53, Ascii.EM, 57, -10, -111, Ascii.SUB}, new byte[]{-60, 73, 123, 9, -86, 122, 77, -42}));
            title.setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{-30, Ascii.CR, -10, -12, -43, 121, 53, 119, -59, 8, -71, -8, -44, 120, 112, 96, -117, 10, -10, -17, -49, 107, 57, 50, -46, 4, -93, -83, -39, 109, 123, 50, -56, 4, -72, -7, -37, 111, 97, 50, -34, Ascii.CAN, -10, -7, -43, 44, 102, 125, -57, Ascii.GS, -77, -83, -45, 120, 59, Ascii.CAN, -5, 7, -77, -20, -55, 105, 53, 97, -50, 5, -78, -83, -55, 111, 103, 119, -50, 5, -91, -27, -43, 120, 102, 50, -60, Ascii.EM, -10, -5, -45, 104, 112, 125, -40, 75, -94, -30, -102, 97, 108, 50, -52, 6, -73, -28, -42, 54}, new byte[]{-85, 107, -42, -115, -70, Ascii.FF, Ascii.NAK, Ascii.DC2}) + str);
            cancelable.setPositiveButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{71, -102, -123, 87, -27, -22, 54, -100, 120}, new byte[]{Ascii.DC4, -1, -21, 51, -94, -121, 87, -11}), new o0O0o(str, activity));
            cancelable.setNegativeButton(virtual.camera.app.R.string.vc_cancle, new o00oo());
            cancelable.setNeutralButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{119, 53, Ascii.SI, Ascii.GS, 101, -10, -75, -30, 88}, new byte[]{52, 90, Byte.MAX_VALUE, 100, 34, -101, -44, -117}), new o00ooO0(activity, str));
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            show.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean o00oOo00(Activity activity, String str, SpannableStringBuilder spannableStringBuilder, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        try {
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
            cancelable.setTitle(str).setMessage(spannableStringBuilder);
            if (!TextUtils.isEmpty(str2)) {
                cancelable.setPositiveButton(str2, onClickListener);
            }
            if (!TextUtils.isEmpty(str3)) {
                cancelable.setNegativeButton(str3, onClickListener);
            }
            if (!TextUtils.isEmpty(str4)) {
                cancelable.setNeutralButton(str4, onClickListener);
            }
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            if (!TextUtils.isEmpty(str2)) {
                show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            }
            if (!TextUtils.isEmpty(str3)) {
                show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            }
            if (!TextUtils.isEmpty(str4)) {
                show.o00oOOoO(-3).setTextAppearance(R.style.Theme_Main);
            }
            show.show();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-119, -105, 46, 56, 100, -43, -11, -114, -107, -104, 123}, new byte[]{-6, -1, 65, 79, 32, -68, -108, -30}) + th);
            return false;
        }
    }

    public static void o00oOo0O(Activity activity, boolean z) {
        try {
            if (o0O000o0.o00oOo00().o00oOOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-2, -58, -100, -41, Ascii.SO, 54, -92, -36, -1, -38, -84, -60, 56, 36, -68, -46, -22}, new byte[]{-115, -82, -13, -96, 81, 69, -48, -67}), true) || !z) {
                o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
                cancelable.setTitle(virtual.camera.app.R.string.vc_tips).setMessage(virtual.camera.app.R.string.vc_dialog_github_start);
                cancelable.setPositiveButton(virtual.camera.app.R.string.vc_goto_str, new o00oo0OO(activity));
                cancelable.setNegativeButton(virtual.camera.app.R.string.vc_cancle, new o00oo0O0());
                if (z) {
                    cancelable.setNeutralButton(virtual.camera.app.R.string.vc_never_show, new o00oo0O());
                }
                androidx.appcompat.app.o00oOo0O show = cancelable.show();
                show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
                show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
                show.show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o00oOo0o(Activity activity, o0O00000 o0o00000) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            String o00oOOo02 = oO0O00o0.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-97, 0, 102, -124, 96, Ascii.CR, 60, -107, -109, 6, 111, -124, 119, 6, 54, -125, -107, 1, 108}, new byte[]{-4, 111, Ascii.VT, -86, 1, 99, 88, -25}), o0OOoO0.o00oo.o00oOOo0(new byte[]{-27, 10, -111, Ascii.VT, 116, -55, 99, -41, -50, 4, -121, 76, 75, -40, 44, -11, -57}, new byte[]{-94, 101, -2, 108, Ascii.CAN, -84, 67, -121}));
            String o00oOOo03 = oO0O00o0.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, -44, 116, 105, -101, -64, Ascii.EM, 109, -59, -34, 55, 38, -110, -53, 4, 101, -64, -33, 55, 32, -111, -36}, new byte[]{-87, -69, Ascii.EM, 71, -4, -81, 118, 10}), o0OOoO0.o00oo.o00oOOo0(new byte[]{121, -79, 65, 59, SignedBytes.MAX_POWER_OF_TWO, 0, -101, 122, 82, -103, 50, 94, 104, Ascii.CR, -99, 113, 91, -36, 65, 118, 117, Ascii.EM, -99, 126, 91, -113, 59}, new byte[]{62, -4, Ascii.DC2, 19, 7, 111, -12, Ascii.GS}));
            String o00oOOo04 = oO0O00o0.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, -73, -51, -108, 55, -55, -15, 84, -82, -67, -114, -37, 62, -62, -20, 92, -85, -68, -114, -35, 35, -64}, new byte[]{-62, -40, -96, -70, 80, -90, -98, 51}), o0OOoO0.o00oo.o00oOOo0(new byte[]{-28, -113, Ascii.SUB, -86, -91, o0OO0o00.f16655o00oOoOO, 84, o0OO0o00.f16655o00oOoOO, -49, -71, 124, -47, -121, 60, 77, 47, -64, -71, 47, -94, -92, 60, 90, 43, -58, -85, 51, -16, -119, 103}, new byte[]{-93, -36, 92, -126, -30, 78, 59, 70}));
            stringBuffer.append(o00oOOo02 + "\n\n");
            stringBuffer.append(o00oOOo03 + "\n\n");
            stringBuffer.append(o00oOOo04 + "\n\n");
            stringBuffer.append(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.CAN, -102, -59, 113, 35, 5, 78, 110, 118, -122, -34, 121, 124, 47, 102, 120, 38, -122, -111, 119, 120, 97, 105, 103, 34, -43, -45, 113, 57, 96, 119, 109, 56, -112, -43, 52, 120, 105, 115, 109, 36, -43, -40, 121, 105, 96, 117, 124, 63, -101, -42, 52, 94, 96, 104, 111, 58, -112, -111, 82, 107, 110, 106, 109, o0OO0o00.f16655o00oOoOO, -102, -61, Byte.MAX_VALUE, 53, 47, 126, 103, 35, -43, -46, 117, 119, 47, 114, 102, 63, -101, -62, 96, 120, 99, 107, 40, 17, -102, -34, 115, 117, 106, 39, 78, 36, -108, -36, 113, 118, 120, 117, 99, 120, -1, -8, 96, 57, 102, 116, 40, 56, -102, -59, 52, 107, 106, 100, 103, 59, -104, -44, 122, 125, 106, 99, 40, 34, -102, -111, 125, 116, Byte.MAX_VALUE, 104, 122, 34, -43, -10, 123, 118, 104, 107, 109, 118, -77, -61, 117, 116, 106, 112, 103, 36, -98, -111, 125, Byte.MAX_VALUE, 47, 110, 124, 118, -100, -62, 52, 119, 96, 115, 40, 56, -112, -46, 113, 106, 124, 102, 122, 47, -44, -69, Ascii.RS}, new byte[]{86, -11, -79, Ascii.DC4, Ascii.EM, Ascii.SI, 7, 8}));
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
            cancelable.setTitle(o0OOoO0.o00oo.o00oOOo0(new byte[]{-59, Ascii.ETB, 0, -1, -72, -53, Ascii.RS, -3, -16, Ascii.EM, 2, -3, -93, -63, 76, -48}, new byte[]{-126, 120, 111, -104, -44, -82, 62, -69})).setMessage(stringBuffer.toString());
            cancelable.setPositiveButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{67, -46, -104, 98, 101, -29}, new byte[]{10, -65, -24, Ascii.CR, Ascii.ETB, -105, -52, -95}), new o00oOOo0(o0o00000));
            cancelable.setNegativeButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{-32, -28, -46, -70, 80, 80}, new byte[]{-93, -123, -68, -39, 60, 53, -42, 86}), new o00oOOoO());
            cancelable.setNeutralButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{-87, Ascii.VT, -108, 109, 39, 68, 106, -76, -112}, new byte[]{-4, 101, -3, 3, 84, 48, Ascii.VT, -40}), new o00oOo00(activity, o0o00000));
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            show.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o00oOoO(AppCompatActivity appCompatActivity) {
        try {
            if ((Math.abs(System.currentTimeMillis() - o0O000o0.o00oOo00().o00oOo0O(o0OOoO0.o00oo.o00oOOo0(new byte[]{108, -8, 83, 90, 76, -15, 1, 121, 119, -58, 84, 71, 99, -15, 54, 114, 105, -8, 76, 65, 116}, new byte[]{0, -103, 32, 46, 19, -126, 105, Ascii.SYN}), -1L)) >= 86400000) && o0O000o0.o00oOo00().o00oOOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{5, 106, -13, Ascii.RS, -103, 87, 4, -1, 5, 93, -8, 0, -89, 79, 2, -24}, new byte[]{118, 2, -100, 105, -58, 35, 109, -113}), true)) {
                String o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-33, Ascii.SO, Ascii.DC4, -44, 119, 56, 82, -94, -115, 72, 46, -45, 126, 119, 65, -66, -50, 79, 38, -100, 100, 113, 84, -77, -101, 65, 44, -100, 113, 121, 75, -94, -100, 65, 96, -43, 97, 56, 80, -94, -100, 89, 96, -33, 125, 117, 86, -85, -117, 88, 110, -20, 119, 106, 78, -90, -98, 83, 96, -43, 102, 56, 79, -76, -50, 78, 47, -56, 50, 97, 67, -77, -50, 86, 37, -50, 107, 56, 86, -94, -100, 70, 37, -33, 102, 52, 6, -91, -101, 84, 96, -11, 50, 111, 79, -85, -126, 0, 35, -45, 124, 108, 79, -87, -101, 69, 96, -56, 125, 56, 79, -86, -98, 82, 47, -54, 119, 56, 79, -77, -50, 65, 46, -40, 50, 116, 67, -77, -50, 73, 52, -100, 117, 106, 73, -80, -50, 83, 52, -50, 125, 118, 65, -23, -28, 42, 114, -110, 91, 126, 6, -66, -127, 85, 96, -39, 124, 123, 73, -78, Byte.MIN_VALUE, 84, 37, -50, 50, 121, 72, -66, -50, 66, 53, -37, 97, 56, 66, -78, -100, 73, 46, -37, 50, 109, 85, -94, -62, 0, 48, -48, 119, 121, 85, -94, -50, 67, 47, -46, 102, 121, 69, -77, -50, 77, 37, -110, 91, 56, 81, -82, -126, 76, 96, -40, 125, 56, 75, -66, -50, 66, 37, -49, 102, 56, 82, -88, -50, 83, 47, -48, 100, 125, 6, -82, -102, Ascii.SO, 74, -74, o0OO0o00.f16655o00oOoOO, 54, 111, -95, -50, 89, 47, -55, 50, 116, 79, -84, -117, 0, 41, -56, 62, 56, 86, -85, -117, 65, 51, -39, 50, Byte.MAX_VALUE, 79, -79, -117, 0, 41, -56, 50, 126, 79, -79, -117, 0, 51, -56, 115, 106, 85, -25, -113, 78, 36, -100, 101, 125, 74, -92, -127, 77, 37, -100, 107, 119, 83, -25, -102, 79, 96, -49, 122, 121, 84, -94, -50, 73, 52, -100, 101, 113, 82, -81, -50, 77, 47, -50, 119, 56, 86, -94, -127, 80, 44, -39, 50, 108, 73, -25, -101, 83, 37, -110, Ascii.CAN, Ascii.DC2, Ascii.DC2, -23, -84, 89, 96, -40, 119, 126, 71, -78, -126, 84, 108, -100, 102, 112, 67, -25, -55, 112, 50, -45, 50, 110, 67, -75, -99, 73, 47, -46, 53, 56, 79, -76, -50, 85, 51, -39, 118, 54, 6, -114, -120, 0, 41, -56, 50, 124, 73, -94, -99, 78, 103, -56, 50, 111, 73, -75, -123, Ascii.FF, 96, -59, 125, 109, 6, -92, -113, 78, 96, -49, 101, 113, 82, -92, -122, 0, 52, -45, 50, 108, 78, -94, -50, 7, Ascii.SO, -45, 96, 117, 71, -85, -50, 86, 37, -50, 97, 113, 73, -87, -55, 0, o0OO0o00.f16655o00oOoOO, -46, 118, 56, 82, -75, -105, 0, 41, -56, 50, 119, 83, -77}, new byte[]{-18, 32, SignedBytes.MAX_POWER_OF_TWO, -68, Ascii.DC2, Ascii.CAN, 38, -57});
                String o00oOOo03 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-94, 115, -50, 57, 77, 46, -88, -60, -101, 110, -49}, new byte[]{-14, 1, -95, Ascii.EM, 59, 75, -38, -73});
                String o00oOOo04 = o0OOoO0.o00oo.o00oOOo0(new byte[]{96, 0, -59, Ascii.EM, 69, -94, -82, Ascii.DC2, 75, Ascii.GS, -60, Ascii.GS, 75, -96}, new byte[]{46, 111, -73, 116, 36, -50, -114, 100});
                int indexOf = o00oOOo02.indexOf(o00oOOo03);
                int indexOf2 = o00oOOo02.indexOf(o00oOOo04);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o00oOOo02);
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan((int) o0.o00oOOo0.f6865o00oOo00), indexOf, o00oOOo03.length() + indexOf, 34);
                }
                if (indexOf2 >= 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan((int) o0.o00oOOo0.f6865o00oOo00), indexOf2, o00oOOo04.length() + indexOf2, 34);
                }
                o00oOo00(appCompatActivity, o0OOoO0.o00oo.o00oOOo0(new byte[]{-102, 76, -98, -64, 34, -1, 98, -26, -82, 3, -70, -123, o0OO0o00.f16655o00oOoOO, -10, 101, -4, -23, 87, -100, -123, 37, -10, 114, -78}, new byte[]{-55, 35, -13, -91, 86, -105, Ascii.VT, -120}), spannableStringBuilder, o0OOoO0.o00oo.o00oOOo0(new byte[]{45, -30, -97, -87}, new byte[]{97, -117, -12, -52, 63, -51, -28, -47}), o0OOoO0.o00oo.o00oOOo0(new byte[]{-20, 110, 38, 76, o0OO0o00.f16655o00oOoOO, -115, Ascii.VT}, new byte[]{-88, 7, 85, 32, 72, -26, 110, SignedBytes.MAX_POWER_OF_TWO}), appCompatActivity.getString(virtual.camera.app.R.string.vc_never_show), new o00oo0(appCompatActivity));
                o0O000o0.o00oOo00().o00oOoOo(o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, 98, 63, 101, -98, -123, -113, -55, -70, 92, 56, 120, -79, -123, -72, -62, -92, 98, 32, 126, -90}, new byte[]{-51, 3, 76, 17, -63, -10, -25, -90}), System.currentTimeMillis());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-39, -34, -63, -20, 84, 43, 114, 46, -18, -33, -49, -9, 111, 37, 56}, new byte[]{-86, -74, -82, -101, 0, 66, 2, 93}) + th);
        }
    }

    public static void o00oOoO0(Activity activity) {
        try {
            boolean o00oOOo02 = oO0Ooooo.o00oOOo0();
            String o00oOOo03 = o00oOOo02 ? o0OOoO0.o00oo.o00oOOo0(new byte[]{52, 40, 58, -60, -69, 99, 96, 87, 8, Byte.MAX_VALUE, 0, -62, -86, 102, o0OO0o00.f16655o00oOoOO, 79, 71, 9, 43, -33, -85, 98, 47, 77, 88, 85, 68, -100, -10, 95, 40, 70, 71, 17, o0OO0o00.f16655o00oOoOO, -33, -75, 106, 44, 3, 17, 58, 60, -34, -79, 100, 46, 3, Ascii.DC2, 44, 43, -34, -8, Byte.MAX_VALUE, 40, 70, 71, 48, 34, -55, -8, Byte.MAX_VALUE, 37, SignedBytes.MAX_POWER_OF_TWO, Ascii.SI, 49, 39, -50, -71, 103, 96, 66, Ascii.NAK, 60, 38, -60, -84, 110, 35, 87, Ascii.DC2, 45, 43, -125}, new byte[]{103, 95, 78, -83, -40, Ascii.VT, SignedBytes.MAX_POWER_OF_TWO, 35}) : o0OOoO0.o00oo.o00oOOo0(new byte[]{-66, -82, -27, Ascii.ETB, -15, -25, 0, -60, -126, -7, -36, 17, -3, -81, 118, -43, -97, -86, -27, Ascii.FF, -4, -80, 42, -70, -36, -9, -84, 55, -6, -22, 0, -32, -97, -74, -84, Ascii.NAK, -9, -3, 83, -39, -126, -73, -84, Ascii.SYN, -31, -22, 83, -112, -116, -7, -30, 6, -27, -81, 84, -43, -114, -79, -30, 10, -15, -18, 76, -112, -116, -85, -17, Ascii.VT, -5, -5, 69, -45, -103, -84, -2, 6, -78, -5, 79, -112, -98, -74, -32, Ascii.NAK, -9, -81, 65, -112, -127, -72, -2, 4, -9, -81, 78, -59, Byte.MIN_VALUE, -69, -23, 17, -78, -32, 70, -112, -113, -84, -21, Ascii.DLE, -68, -123, Ascii.DC2, -98, -51, -115, -28, 6, -78, -33, 82, -33, -51, -81, -23, 17, -31, -26, 79, -34, -51, -86, -7, 19, -30, -32, 82, -60, -98, -7, -1, 6, -26, -5, 73, -34, -118, -7, -6, 10, -10, -22, 79, -112, -99, -85, -29, 19, -9, -3, 84, -39, -120, -86, -84, 7, -25, -3, 73, -34, -118, -7, -17, 2, -1, -22, 82, -47, -51, -87, -2, 6, -28, -26, 69, -57, -61, -45, -65, 77, -78, -37, 72, -43, -51, -119, -2, Ascii.FF, -78, -7, 69, -62, -98, -80, -29, Ascii.CR, -78, -4, 85, -64, -99, -74, -2, Ascii.ETB, -31, -81, 78, -43, -103, -82, -29, 17, -7, -81, 86, -39, -119, -68, -29, 67, -31, -5, 82, -43, -116, -76, -27, Ascii.CR, -11, -95, 42, -124, -61, -7, -40, Ascii.VT, -9, -81, 112, -62, -126, -7, -6, 6, -32, -4, 73, -33, -125, -7, -27, Ascii.DLE, -78, -4, 84, -39, -127, -75, -84, 10, -4, -81, 84, -40, -120, -7, -8, 6, -31, -5, 73, -34, -118, -7, -1, Ascii.ETB, -13, -24, 69, -112, -116, -73, -24, 67, -1, -18, 89, -112, -125, -74, -8, 67, -16, -22, 0, -58, -120, -85, -11, 67, -31, -5, 65, -46, -127, -68, -94, 105}, new byte[]{-19, -39, -116, 99, -110, -113, 32, -80});
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
            cancelable.setTitle(o0OOoO0.o00oo.o00oOOo0(new byte[]{19, -50, 39, -20, 82, 43, 89, -115, 37, -53, oo0OOoo.f13516o00oOoO, -15, 94, 45}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, -71, 78, -104, 49, 67, 121, -37})).setMessage(o00oOOo03);
            cancelable.setPositiveButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{-21, -34, -74, -47, -48, -122}, new byte[]{-104, -87, -33, -91, -77, -18, oo0OOoo.f13516o00oOoO, 98}), new o00ooO(o00oOOo02));
            cancelable.setNegativeButton(virtual.camera.app.R.string.vc_cancle, new o0());
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            show.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o00oOooO(Activity activity, o0O00000 o0o00000) {
        try {
            o00oOo0O.o00oOOo0 cancelable = new o00oOo0O.o00oOOo0(activity).setCancelable(false);
            cancelable.setTitle(o0OOoO0.o00oo.o00oOOo0(new byte[]{-76, 77, -44, Ascii.CR}, new byte[]{-32, 36, -92, 126, 72, 100, -33, -56})).setMessage(o0OOoO0.o00oo.o00oOOo0(new byte[]{-59, -77, -116, 71, 104, 72, -102, 50, -14, -67, -117, 82, 102, 73, -112, 124, -26, -22, -115, SignedBytes.MAX_POWER_OF_TWO, 37, 87, -112, 118, -28, -91, -62, 85, 106, 84, -117, 113, -28, -71, -54, 72, 106, 1, -105, 119, -28, -82, -62, 84, 96, 82, -115, 115, -13, -66, -62, 71, 117, 81, -48, 50, -13, -81, -109, 83, 108, 83, -100, 97, -95, -85, -62, 112, 76, 113, -41, 69, -18, -65, -114, 66, 37, 88, -106, 103, -95, -90, -117, 77, 96, 1, -115, 125, -95, -70, -105, 84, 102, 73, -104, 97, -28, -22, -117, 82, 58}, new byte[]{-127, -54, -30, 38, 5, o0OO0o00.f16655o00oOoOO, -7, Ascii.DC2}));
            cancelable.setPositiveButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{101, -81, -47}, new byte[]{60, -54, -94, -35, -108, Ascii.EM, 75, 7}), new o00oOo0O(o0o00000));
            cancelable.setNegativeButton(o0OOoO0.o00oo.o00oOOo0(new byte[]{-101, -2, -91, -68, -2, -126}, new byte[]{-40, -97, -53, -33, -110, -25, 86, -74}), new o00oOoO(o0o00000));
            androidx.appcompat.app.o00oOo0O show = cancelable.show();
            show.o00oOOoO(-2).setTextAppearance(R.style.Theme_Main);
            show.o00oOOoO(-1).setTextAppearance(R.style.Theme_Main);
            show.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
