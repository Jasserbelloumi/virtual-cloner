package o0OOooO;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.willy.ratingbar.BaseRatingBar;
import o00oOooO.o0OO00OO;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOoo.oo0oO0;
import o0ooO0O0.oO0Oo0o0;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class o0O00O extends oo0oO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements BaseRatingBar.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ MaterialButton f15346o00oOOo0;

        public o00oOOo0(MaterialButton materialButton) {
            this.f15346o00oOOo0 = materialButton;
        }

        @Override // com.willy.ratingbar.BaseRatingBar.o00oOOo0
        public final void o00oOOo0(BaseRatingBar baseRatingBar, float f, boolean z) {
            this.f15346o00oOOo0.setEnabled(((int) f) != 0);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements View.OnClickListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            o0O00O.this.dismissAllowingStateLoss();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements View.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ BaseRatingBar f15350o00oo0O0;

        public o00oOo00(BaseRatingBar baseRatingBar) {
            this.f15350o00oo0O0 = baseRatingBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            if (((int) this.f15350o00oo0O0.getRating()) >= 4) {
                try {
                    try {
                        Intent intent = new Intent(o00oo.o00oOOo0(new byte[]{93, -17, 55, -109, 84, 38, 87, -121, 85, -17, 39, -124, 85, 59, Ascii.GS, -56, 95, -11, 58, -114, 85, 97, 101, -32, 121, -42}, new byte[]{60, -127, 83, -31, 59, 79, 51, -87}), Uri.parse(o00oo.o00oOOo0(new byte[]{Byte.MAX_VALUE, 81, 74, 71, 57, 95, -11, 84, oo0OOoo.f13516o00oOoO, 84, 93, 88, oo0OOoo.f13516o00oOoO, 66, -93, 8, 45, 89, 92, 17}, new byte[]{Ascii.DC2, 48, 56, 44, 92, 43, -49, 123}) + o0O00O.this.o00oOoO0().getPackageName()));
                        intent.setPackage(o00oo.o00oOOo0(new byte[]{-12, -119, 66, 10, -80, 121, -57, 40, -8, -113, 75, 10, -89, 114, -51, 62, -2, -120, 72}, new byte[]{-105, -26, 47, 36, -47, Ascii.ETB, -93, 90}));
                        o0O00O.this.o00oOoO0().startActivity(intent);
                    } catch (Throwable unused) {
                        i = 23;
                        byte[] bArr = new byte[i];
                        // fill-array-data instruction
                        bArr[0] = 66;
                        bArr[1] = 58;
                        bArr[2] = 97;
                        bArr[3] = -120;
                        bArr[4] = 20;
                        bArr[5] = -112;
                        bArr[6] = -72;
                        bArr[7] = -59;
                        bArr[8] = 74;
                        bArr[9] = 38;
                        bArr[10] = 97;
                        bArr[11] = -58;
                        bArr[12] = 68;
                        bArr[13] = -101;
                        bArr[14] = -74;
                        bArr[15] = -45;
                        bArr[16] = 13;
                        bArr[17] = 44;
                        bArr[18] = 101;
                        bArr[19] = -113;
                        bArr[20] = 88;
                        bArr[21] = -110;
                        bArr[22] = -77;
                        oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(bArr, new byte[]{45, 74, 4, -26, 52, -9, -41, -86}));
                        o0O00O.this.dismissAllowingStateLoss();
                    }
                } catch (Throwable unused2) {
                    Activity o00oOoO02 = o0O00O.this.o00oOoO0();
                    byte[] bArr2 = new byte[26];
                    bArr2[0] = -12;
                    bArr2[1] = -11;
                    bArr2[2] = 42;
                    bArr2[3] = 68;
                    bArr2[4] = 56;
                    bArr2[5] = 5;
                    bArr2[6] = 40;
                    bArr2[7] = -46;
                    bArr2[8] = -4;
                    bArr2[9] = -11;
                    bArr2[10] = 58;
                    bArr2[11] = 83;
                    bArr2[12] = 57;
                    bArr2[13] = Ascii.CAN;
                    bArr2[14] = 98;
                    bArr2[15] = -99;
                    bArr2[16] = -10;
                    bArr2[17] = -17;
                    bArr2[18] = 39;
                    bArr2[19] = 89;
                    bArr2[20] = 57;
                    bArr2[21] = 66;
                    bArr2[22] = Ascii.SUB;
                    try {
                        bArr2[23] = -75;
                        bArr2[24] = -48;
                        bArr2[25] = -52;
                        String o00oOOo02 = o00oo.o00oOOo0(bArr2, new byte[]{-107, -101, 78, 54, 87, 108, 76, -4});
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr3 = new byte[46];
                        bArr3[0] = -18;
                        try {
                            bArr3[1] = Ascii.ETB;
                            bArr3[2] = 8;
                            bArr3[3] = -22;
                            bArr3[4] = 88;
                            bArr3[5] = -42;
                            bArr3[6] = 44;
                            bArr3[7] = 67;
                            bArr3[8] = -10;
                            bArr3[9] = Ascii.SI;
                            bArr3[10] = Ascii.GS;
                            bArr3[11] = -29;
                            bArr3[12] = 5;
                            bArr3[13] = -117;
                            bArr3[14] = 108;
                            bArr3[15] = 3;
                            bArr3[16] = -31;
                            bArr3[17] = Ascii.SI;
                            bArr3[18] = Ascii.EM;
                            bArr3[19] = -76;
                            bArr3[20] = 72;
                            bArr3[21] = -125;
                            bArr3[22] = 110;
                            try {
                                bArr3[23] = 67;
                                bArr3[24] = -11;
                                bArr3[25] = Ascii.ETB;
                                bArr3[26] = 19;
                                bArr3[27] = -24;
                                bArr3[28] = 78;
                                bArr3[29] = -61;
                                bArr3[30] = 98;
                                bArr3[31] = Ascii.FS;
                                bArr3[32] = -10;
                                bArr3[33] = Ascii.DLE;
                                bArr3[34] = 83;
                                bArr3[35] = -2;
                                bArr3[36] = 78;
                                bArr3[37] = -104;
                                bArr3[38] = 98;
                                bArr3[39] = 5;
                                bArr3[40] = -22;
                                bArr3[41] = Ascii.DLE;
                                bArr3[42] = 67;
                                bArr3[43] = -13;
                                bArr3[44] = 79;
                                bArr3[45] = -47;
                                sb.append(o00oo.o00oOOo0(bArr3, new byte[]{-122, 99, 124, -102, 43, -20, 3, 108}));
                                sb.append(o0O00O.this.o00oOoO0().getPackageName());
                                o00oOoO02.startActivity(new Intent(o00oOOo02, Uri.parse(sb.toString())));
                            } catch (Throwable unused3) {
                                i = 23;
                                byte[] bArr4 = new byte[i];
                                // fill-array-data instruction
                                bArr4[0] = 66;
                                bArr4[1] = 58;
                                bArr4[2] = 97;
                                bArr4[3] = -120;
                                bArr4[4] = 20;
                                bArr4[5] = -112;
                                bArr4[6] = -72;
                                bArr4[7] = -59;
                                bArr4[8] = 74;
                                bArr4[9] = 38;
                                bArr4[10] = 97;
                                bArr4[11] = -58;
                                bArr4[12] = 68;
                                bArr4[13] = -101;
                                bArr4[14] = -74;
                                bArr4[15] = -45;
                                bArr4[16] = 13;
                                bArr4[17] = 44;
                                bArr4[18] = 101;
                                bArr4[19] = -113;
                                bArr4[20] = 88;
                                bArr4[21] = -110;
                                bArr4[22] = -77;
                                oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(bArr4, new byte[]{45, 74, 4, -26, 52, -9, -41, -86}));
                                o0O00O.this.dismissAllowingStateLoss();
                            }
                        } catch (Throwable unused4) {
                            i = 23;
                        }
                    } catch (Throwable unused5) {
                        i = 23;
                    }
                }
            } else {
                oO0Oo0o0.o00oOOoO(R.string.thanks_feedback);
            }
            o0O00O.this.dismissAllowingStateLoss();
        }
    }

    public static void o00oOooo(AppCompatActivity appCompatActivity) {
        new o0O00O().show(appCompatActivity.o00ooo0(), o00oo.o00oOOo0(new byte[]{56, -61, -127, 37, -56, -25, 87, 67, 5, -59, -77, 50, -19, -23, 91, 74, 4, -42}, new byte[]{106, -94, -11, SignedBytes.MAX_POWER_OF_TWO, -116, -114, 54, 47}));
    }

    @Override // o0OOoo.oo0oO0
    public View o00oOo0o(LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.rate_layout, viewGroup, false);
        o00oOoo0(inflate);
        return inflate;
    }

    public final void o00oOoo0(View view) {
        BaseRatingBar baseRatingBar = (BaseRatingBar) view.findViewById(R.id.rating_bar);
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_rate);
        baseRatingBar.setOnRatingChangeListener(new o00oOOo0(materialButton));
        ((TextView) view.findViewById(R.id.btn_exit)).setOnClickListener(new o00oOOoO());
        materialButton.setOnClickListener(new o00oOo00(baseRatingBar));
    }

    @Override // androidx.fragment.app.o00oOo00, androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
    }
}
