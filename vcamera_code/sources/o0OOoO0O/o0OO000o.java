package o0OOoO0O;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
/* loaded from: classes3.dex */
public class o0OO000o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o0OO000o f14825o00oOOo0 = new o0OO000o();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements OnInitializationCompleteListener {
        public o00oOOo0() {
        }

        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
        public void onInitializationComplete(InitializationStatus initializationStatus) {
            if (!TextUtils.isEmpty(o0OO000.o00oOOo0())) {
                oo0oO0.o00oOo0o().o00oOoOo();
            }
            if (!TextUtils.isEmpty(o0OO000.o00oOOoO())) {
                oo0ooO.o00oOo0o().o00oOoOo();
            }
            if (TextUtils.isEmpty(o0OO000.o00oOo00())) {
                return;
            }
            o0OO00OO.o00oOo0o().o00oOoo0();
        }
    }

    public void o00oOOo0(Context context) {
        MobileAds.initialize(context, new o00oOOo0());
    }
}
