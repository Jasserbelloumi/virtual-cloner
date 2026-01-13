package multispace.multiapp.clone.view.pay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.common.base.Ascii;
import java.util.Iterator;
import java.util.List;
import o0O0oo0o.o0OOooO0;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOoOo0.ooOOO0Oo;
import o0Oo00o0.o0;
import o0Oo00o0.o00ooO;
import o0Oo00o0.o00ooO0;
import o0ooO0O0.oO0O000;
import o0ooO0O0.oO0OO0O;
import o0ooO0O0.oO0Oo0o0;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class PayActivity extends AppCompatActivity {

    /* renamed from: o00ooooO  reason: collision with root package name */
    public BroadcastReceiver f6740o00ooooO = new o00oOOoO();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayActivity.this.finish();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends BroadcastReceiver {
        public o00oOOoO() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PayActivity.this.finish();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements o00ooO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00ooO0 f6743o00oOOo0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOo00.this.o00oOo0O();
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ List f6747o00oo0O0;

            public o00oOOoO(List list) {
                this.f6747o00oo0O0 = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOo00.this.o00oOo0o(this.f6747o00oo0O0);
            }
        }

        /* renamed from: multispace.multiapp.clone.view.pay.PayActivity$o00oOo00$o00oOo00  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class View$OnClickListenerC0094o00oOo00 implements View.OnClickListener {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ View f6748o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00ooO0 f6749o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ View f6750o00oo0Oo;

            /* renamed from: o00oo0o  reason: collision with root package name */
            public final /* synthetic */ View f6751o00oo0o;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ View f6752o00oo0o0;

            public View$OnClickListenerC0094o00oOo00(o00ooO0 o00ooo02, View view, View view2, View view3, View view4) {
                this.f6749o00oo0O0 = o00ooo02;
                this.f6748o00oo0O = view;
                this.f6750o00oo0Oo = view2;
                this.f6752o00oo0o0 = view3;
                this.f6751o00oo0o = view4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o00oOo00 o00ooo002 = o00oOo00.this;
                o00ooO0 o00ooo02 = this.f6749o00oo0O0;
                o00ooo002.f6743o00oOOo0 = o00ooo02;
                String o00oOooO2 = o00ooo02.o00oOooO();
                char c = 65535;
                switch (o00oOooO2.hashCode()) {
                    case -1619983885:
                        if (o00oOooO2.equals(o00oo.o00oOOo0(new byte[]{10, 66, 72, oo0OOoo.f13516o00oOoO, -13, Ascii.DC2, 73, 104, Ascii.ETB, 67, 66}, new byte[]{121, 55, 42, 98, -62, 77, 36, 7}))) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1477432776:
                        if (o00oOooO2.equals(o00oo.o00oOOo0(new byte[]{-5, -4, -44, -11, Ascii.RS, -64, -99, -68, -26, -3, -34}, new byte[]{-120, -119, -74, -86, 40, -97, -16, -45}))) {
                            c = 2;
                            break;
                        }
                        break;
                    case 155023477:
                        if (o00oOooO2.equals(o00oo.o00oOOo0(new byte[]{-50, 111, -65, -78, -107, 50, Ascii.EM, -69, -45, 110, -75}, new byte[]{-67, Ascii.SUB, -35, -19, -90, 109, 116, -44}))) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1056468586:
                        if (o00oOooO2.equals(o00oo.o00oOOo0(new byte[]{-68, -70, 54, 86, 82, -43, -101, -68, -82, -67}, new byte[]{-49, -49, 84, 9, 99, -118, -30, -39}))) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    o00oOo00.this.o00oOoO0(this.f6748o00oo0O);
                    o00oOo00.this.o00oOoO(this.f6750o00oo0Oo);
                } else if (c != 1) {
                    if (c == 2) {
                        o00oOo00.this.o00oOoO(this.f6748o00oo0O);
                        o00oOo00.this.o00oOoO(this.f6750o00oo0Oo);
                        o00oOo00.this.o00oOoO0(this.f6752o00oo0o0);
                        o00oOo00.this.o00oOoO(this.f6751o00oo0o);
                    } else if (c != 3) {
                        return;
                    } else {
                        o00oOo00.this.o00oOoO(this.f6748o00oo0O);
                        o00oOo00.this.o00oOoO(this.f6750o00oo0Oo);
                        o00oOo00.this.o00oOoO(this.f6752o00oo0o0);
                        o00oOo00.this.o00oOoO0(this.f6751o00oo0o);
                        return;
                    }
                } else {
                    o00oOo00.this.o00oOoO(this.f6748o00oo0O);
                    o00oOo00.this.o00oOoO0(this.f6750o00oo0Oo);
                }
                o00oOo00.this.o00oOoO(this.f6752o00oo0o0);
                o00oOo00.this.o00oOoO(this.f6751o00oo0o);
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOo0O implements View.OnClickListener {
            public o00oOo0O() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o00oOo00.this.o00oOooO();
            }
        }

        public o00oOo00() {
        }

        @Override // o0Oo00o0.o00ooO
        public void o00oOOo0(List<? extends o00ooO0> list) {
            if (list != null && list.size() > 0) {
                oO0OO0O.o00oOo0O(new o00oOOoO(list));
                return;
            }
            o00oo.o00oOOo0(new byte[]{71, -69, -61, 70, 118}, new byte[]{118, -118, -14, 119, 71, -37, 36, -67});
            o00oo.o00oOOo0(new byte[]{60, 7, -122, -108, 78, -120, -42, -91, 41, Ascii.ETB, -112, -124, 6, -124, -63, -91, 63, Ascii.SI, -126, -125, 95}, new byte[]{90, 98, -14, -9, 38, -19, -78, -123});
            o00oOOoO();
        }

        @Override // o0Oo00o0.o00ooO
        public void o00oOOoO() {
            oO0OO0O.o00oOo0O(new o00oOOo0());
        }

        public final void o00oOo0O() {
            ((ProgressBar) PayActivity.this.findViewById(R.id.progressBar)).setVisibility(8);
            oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{Ascii.DC4, 7, -39, 58, 60, 55, -85, 10, 44, Ascii.SO, -33, 48, 111, 43, -28, Ascii.FS, 54, 75, -14, 62, 59, 37, -28, Ascii.ESC, 47, 75, -45, 41, 111, 2, -22, Ascii.DLE, 41, Ascii.SO, -46, 47, 111, 59, -27, 73, 3, 4, -45, 60, 35, 55, -91, 71, 106}, new byte[]{68, 107, -68, 91, 79, 82, -117, 105}));
            PayActivity.this.finish();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void o00oOo0o(List<? extends o00ooO0> list) {
            int i;
            o00ooO0 o00ooo02;
            int i2;
            boolean z;
            char c;
            View view;
            int i3 = 8;
            ((ProgressBar) PayActivity.this.findViewById(R.id.progressBar)).setVisibility(8);
            boolean z2 = false;
            ((FrameLayout) PayActivity.this.findViewById(R.id.month1)).setVisibility(0);
            ((FrameLayout) PayActivity.this.findViewById(R.id.year1)).setVisibility(0);
            View findViewById = PayActivity.this.findViewById(R.id.month1);
            View findViewById2 = PayActivity.this.findViewById(R.id.month3);
            View findViewById3 = PayActivity.this.findViewById(R.id.month6);
            View findViewById4 = PayActivity.this.findViewById(R.id.year1);
            Iterator<? extends o00ooO0> it = list.iterator();
            while (true) {
                i = 11;
                if (!it.hasNext()) {
                    o00ooo02 = null;
                    break;
                }
                o00ooO0 next = it.next();
                if (next.o00oOooO().equals(o00oo.o00oOOo0(new byte[]{121, 5, 105, 97, 5, -65, -53, 81, 100, 4, 99}, new byte[]{10, 112, Ascii.VT, 62, 52, -32, -90, 62}))) {
                    o00ooo02 = next;
                    break;
                }
            }
            for (o00ooO0 o00ooo03 : list) {
                byte[] bArr = new byte[i3];
                // fill-array-data instruction
                bArr[0] = 28;
                bArr[1] = -118;
                bArr[2] = 68;
                bArr[3] = -109;
                bArr[4] = 44;
                bArr[5] = -15;
                bArr[6] = -15;
                bArr[7] = 119;
                o00oo.o00oOOo0(new byte[]{45, -69, 117, -94, Ascii.GS}, bArr);
                o00ooo03.toString();
                String str = o00ooo03.o00oOOoO() + " " + o00ooo03.o00oOOo0();
                if (o00ooo03 instanceof o00ooO0.o00oOOoO) {
                    String o00oOooO2 = o00ooo03.o00oOooO();
                    switch (o00oOooO2.hashCode()) {
                        case -1619983885:
                            byte[] bArr2 = new byte[i];
                            // fill-array-data instruction
                            bArr2[0] = -126;
                            bArr2[1] = 125;
                            bArr2[2] = -120;
                            bArr2[3] = -113;
                            bArr2[4] = -84;
                            bArr2[5] = 108;
                            bArr2[6] = 95;
                            bArr2[7] = -61;
                            bArr2[8] = -97;
                            bArr2[9] = 124;
                            bArr2[10] = -126;
                            byte[] bArr3 = new byte[i3];
                            // fill-array-data instruction
                            bArr3[0] = -15;
                            bArr3[1] = 8;
                            bArr3[2] = -22;
                            bArr3[3] = -48;
                            bArr3[4] = -99;
                            bArr3[5] = 51;
                            bArr3[6] = 50;
                            bArr3[7] = -84;
                            if (o00oOooO2.equals(o00oo.o00oOOo0(bArr2, bArr3))) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1477432776:
                            byte[] bArr4 = new byte[i];
                            // fill-array-data instruction
                            bArr4[0] = -51;
                            bArr4[1] = 100;
                            bArr4[2] = -31;
                            bArr4[3] = 57;
                            bArr4[4] = -30;
                            bArr4[5] = 61;
                            bArr4[6] = -124;
                            bArr4[7] = 119;
                            bArr4[8] = -48;
                            bArr4[9] = 101;
                            bArr4[10] = -21;
                            byte[] bArr5 = new byte[i3];
                            // fill-array-data instruction
                            bArr5[0] = -66;
                            bArr5[1] = 17;
                            bArr5[2] = -125;
                            bArr5[3] = 102;
                            bArr5[4] = -44;
                            bArr5[5] = 98;
                            bArr5[6] = -23;
                            bArr5[7] = 24;
                            if (o00oOooO2.equals(o00oo.o00oOOo0(bArr4, bArr5))) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 155023477:
                            byte[] bArr6 = new byte[i];
                            // fill-array-data instruction
                            bArr6[0] = -120;
                            bArr6[1] = 29;
                            bArr6[2] = 66;
                            bArr6[3] = -96;
                            bArr6[4] = -111;
                            bArr6[5] = -58;
                            bArr6[6] = 11;
                            bArr6[7] = 80;
                            bArr6[8] = -107;
                            bArr6[9] = 28;
                            bArr6[10] = 72;
                            byte[] bArr7 = new byte[i3];
                            // fill-array-data instruction
                            bArr7[0] = -5;
                            bArr7[1] = 104;
                            bArr7[2] = 32;
                            bArr7[3] = -1;
                            bArr7[4] = -94;
                            bArr7[5] = -103;
                            bArr7[6] = 102;
                            bArr7[7] = 63;
                            if (o00oOooO2.equals(o00oo.o00oOOo0(bArr6, bArr7))) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1056468586:
                            byte[] bArr8 = new byte[i3];
                            // fill-array-data instruction
                            bArr8[0] = -88;
                            bArr8[1] = 110;
                            bArr8[2] = -46;
                            bArr8[3] = -8;
                            bArr8[4] = -84;
                            bArr8[5] = 30;
                            bArr8[6] = -3;
                            bArr8[7] = 121;
                            if (o00oOooO2.equals(o00oo.o00oOOo0(new byte[]{-37, Ascii.ESC, -80, -89, -99, 65, -124, Ascii.FS, -55, Ascii.FS}, bArr8))) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            ((AppCompatTextView) findViewById2.findViewById(R.id.perTV)).setText(R.string.month3);
                            ((TextView) findViewById2.findViewById(R.id.price)).setText(str);
                            ((TextView) findViewById2.findViewById(R.id.perInfoTV)).setText(PayActivity.this.getString(R.string.premium_month_text_saved, oO0O000.o00oo00O(o00ooo03.o00oOOoO() / 3.0d).o00oOoO(1) + " " + o00ooo03.o00oOOo0(), oO0O000.o00oo00O((o00ooo02.o00oOOoO() * 3.0d) - o00ooo03.o00oOOoO()).o00oOoO(1) + " " + o00ooo03.o00oOOo0()));
                            view = findViewById2;
                        } else if (c == 2) {
                            ((AppCompatTextView) findViewById3.findViewById(R.id.perTV)).setText(R.string.month6);
                            ((TextView) findViewById3.findViewById(R.id.price)).setText(str);
                            ((TextView) findViewById3.findViewById(R.id.perInfoTV)).setText(PayActivity.this.getString(R.string.premium_month_text_saved, oO0O000.o00oo00O(o00ooo03.o00oOOoO() / 6.0d).o00oOoO(1) + " " + o00ooo03.o00oOOo0(), oO0O000.o00oo00O((o00ooo02.o00oOOoO() * 6.0d) - o00ooo03.o00oOOoO()).o00oOoO(1) + " " + o00ooo03.o00oOOo0()));
                            view = findViewById3;
                        } else if (c != 3) {
                            z = false;
                            view = null;
                        } else {
                            ((AppCompatTextView) findViewById4.findViewById(R.id.perTV)).setText(R.string.year1);
                            ((TextView) findViewById4.findViewById(R.id.price)).setText(str);
                            ((TextView) findViewById4.findViewById(R.id.perInfoTV)).setText(PayActivity.this.getString(R.string.premium_month_text_saved, oO0O000.o00oo00O(o00ooo03.o00oOOoO() / 12.0d).o00oOoO(1) + " " + o00ooo03.o00oOOo0(), oO0O000.o00oo00O((o00ooo02.o00oOOoO() * 12.0d) - o00ooo03.o00oOOoO()).o00oOoO(1) + " " + o00ooo03.o00oOOo0()));
                            view = findViewById4;
                        }
                        z = false;
                    } else {
                        ((AppCompatTextView) findViewById.findViewById(R.id.perTV)).setText(R.string.month1);
                        ((TextView) findViewById.findViewById(R.id.price)).setText(str);
                        z = false;
                        ((TextView) findViewById.findViewById(R.id.perInfoTV)).setText(PayActivity.this.getString(R.string.premium_month_text, String.valueOf(o00ooo03.o00oOOoO()) + " " + o00ooo03.o00oOOo0()));
                        view = findViewById;
                    }
                    i2 = 11;
                    view.setOnClickListener(new View$OnClickListenerC0094o00oOo00(o00ooo03, findViewById, findViewById2, findViewById3, findViewById4));
                    findViewById4.performClick();
                } else {
                    i2 = i;
                    z = z2;
                }
                z2 = z;
                i = i2;
                i3 = 8;
            }
            PayActivity.this.findViewById(R.id.continueBtn).setAlpha(1.0f);
            PayActivity.this.findViewById(R.id.continueBtn).setOnClickListener(new o00oOo0O());
        }

        public void o00oOoO(View view) {
            view.setBackgroundResource(R.drawable.bg_period_pw);
            ((AppCompatImageView) view.findViewById(R.id.check)).setImageResource(R.drawable.ic_uncheck_pw);
        }

        public void o00oOoO0(View view) {
            view.setBackgroundResource(R.drawable.bg_period_selected_pw_2);
            ((AppCompatImageView) view.findViewById(R.id.check)).setImageResource(R.drawable.ic_checked_pw_2);
        }

        public final void o00oOooO() {
            if (this.f6743o00oOOo0 == null) {
                oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{-112, -26, 110, -23, -51, -23, -57, -87, -123, -26, 110, -21, -54, -84, -120, -76, -123, -86, 98, -4, -37, -31}, new byte[]{-32, -118, Ascii.VT, -120, -66, -116, -25, -38}));
            } else {
                o0.o00oOoO().o00oo0o0(PayActivity.this, this.f6743o00oOOo0.o00oOo00());
            }
        }
    }

    public static void o0oO0O0o(Context context) {
        context.startActivity(new Intent(context, PayActivity.class));
    }

    public final void o0O0O0O() {
        o0.o00oOoO().o00oOoOO(new o00oOo00());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pay);
        findViewById(R.id.close).setOnClickListener(new o00oOOo0());
        o0O0O0O();
        o0OOooO0.o00oOOoO(this).o00oOo00(this.f6740o00ooooO, new IntentFilter(o00oo.o00oOOo0(new byte[]{-52, -39, -60, Byte.MAX_VALUE, 1, -55, Ascii.GS, -28, -33, -43, -17, 96, 7, -41}, new byte[]{-83, -70, -80, Ascii.SYN, 110, -89, 66, -108})));
        if (ooOOO0Oo.o00oOo00()) {
            ((AppCompatTextView) findViewById(R.id.autoClean)).setText(R.string.pro_features);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        o0OOooO0.o00oOOoO(this).o00oOo0o(this.f6740o00ooooO);
        super.onDestroy();
    }
}
