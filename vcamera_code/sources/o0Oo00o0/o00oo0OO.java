package o0Oo00o0;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import o00oOooO.oo0oO0;
import o0Oo0oo0.o0OO0o00;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o00oo0OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public FirebaseRemoteConfig f15637o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f15634o00oOo00 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-60, Ascii.VT, 86}, new byte[]{-105, 91, Ascii.NAK, -17, 87, Byte.MAX_VALUE, 6, -63});

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f15636o00oOooO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-98, Ascii.DLE, -119, -38, 53, 35, -12, 54, -124, Ascii.VT, -114, -14, Ascii.VT, o0OO0o00.f16655o00oOoOO, -62, 45, -125, 17, -110}, new byte[]{-19, 120, -26, -83, 106, 69, -99, 88});

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f15635o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-5, 39, 120, -56, -52, -54, -100, -18, -6, 46, 69, -59, -62, -41, -117, -13}, new byte[]{-108, 73, Ascii.SUB, -89, -83, -72, -8, -121});

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oo0OO f15633o00oOOoO = new o00oo0OO();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements OnFailureListener {
        public o00oOOo0() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@oo0oO0 Exception exc) {
            exc.printStackTrace();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements OnCompleteListener<Void> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ FirebaseRemoteConfig f15639o00oOOo0;

        public o00oOOoO(FirebaseRemoteConfig firebaseRemoteConfig) {
            this.f15639o00oOOo0 = firebaseRemoteConfig;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@oo0oO0 Task<Void> task) {
            this.f15639o00oOOo0.fetchAndActivate();
        }
    }

    public final void o00oOOo0() {
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        this.f15637o00oOOo0 = firebaseRemoteConfig;
        firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
        firebaseRemoteConfig.fetch().addOnCompleteListener(new o00oOOoO(firebaseRemoteConfig)).addOnFailureListener(new o00oOOo0());
    }

    public final void o00oOOoO(Exception exc) {
    }

    public boolean o00oOo00(String str) {
        return this.f15637o00oOOo0.getBoolean(str);
    }

    public String o00oOooO(String str) {
        return this.f15637o00oOOo0.getString(str);
    }
}
