package o0Oo00o0;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f15626o00oOOo0 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-117, -18, Ascii.DC2, -10, Ascii.RS, 89}, new byte[]{-8, -101, 96, Byte.MIN_VALUE, 123, 32, -43, -4});

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements OnFailureListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ FirebaseRemoteConfig f15627o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f15628o00oOOoO;

        public o00oOOo0(FirebaseRemoteConfig firebaseRemoteConfig, o00oOo00 o00ooo002) {
            this.f15627o00oOOo0 = firebaseRemoteConfig;
            this.f15628o00oOOoO = o00ooo002;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@oo0oO0 Exception exc) {
            exc.printStackTrace();
            o00oo.o00oOo00(this.f15627o00oOOo0, this.f15628o00oOOoO);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements OnCompleteListener<Void> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ FirebaseRemoteConfig f15629o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f15630o00oOOoO;

        public o00oOOoO(FirebaseRemoteConfig firebaseRemoteConfig, o00oOo00 o00ooo002) {
            this.f15629o00oOOo0 = firebaseRemoteConfig;
            this.f15630o00oOOoO = o00ooo002;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@oo0oO0 Task<Void> task) {
            this.f15629o00oOOo0.fetchAndActivate();
            o00oo.o00oOo00(this.f15629o00oOOo0, this.f15630o00oOOoO);
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOo00 {
        void o00oOOo0(@o0OO00OO o0O00000 o0o00000);
    }

    public static void o00oOOoO(o00oOo00 o00ooo002) {
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
        firebaseRemoteConfig.fetch().addOnCompleteListener(new o00oOOoO(firebaseRemoteConfig, o00ooo002)).addOnFailureListener(new o00oOOo0(firebaseRemoteConfig, o00ooo002));
    }

    public static void o00oOo00(FirebaseRemoteConfig firebaseRemoteConfig, o00oOo00 o00ooo002) {
        String string = firebaseRemoteConfig.getString(f15626o00oOOo0);
        o0O00000 o0o00000 = new o0O00000();
        o0o00000.f15646o00oOOoO = string;
        o00ooo002.o00oOOo0(o0o00000);
    }
}
