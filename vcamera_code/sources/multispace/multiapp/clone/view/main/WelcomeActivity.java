package multispace.multiapp.clone.view.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.appcompat.app.AppCompatActivity;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import multispace.multiapp.clone.view.main.WelcomeActivity;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OoOoO;
import o0OOoOo0.ooOOO0Oo;
import o0OOooO.o0O00O0o;
import o0OOooOO.o0O0oo00;
import o0Oo00oo.o0O000o0;
import o0Oo0OO.o;
import o0ooO0O0.oO0O0O0;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0OO0O;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"Lmultispace/multiapp/clone/view/main/WelcomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Intent;", "intent", "Lo0OO0o/oO0Ooooo;", "onNewIntent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "o0O0oo0o", "o0O0O0o0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class WelcomeActivity extends AppCompatActivity {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"multispace/multiapp/clone/view/main/WelcomeActivity$o00oOOo0", "Lo0OOooO/o0O00O0o$o0O00000;", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "o00oOOo0", o00oOOoO.f12961o00oOo00, "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0O00O0o.o0O00000 {
        public o00oOOo0() {
        }

        public static final void o00oOo0O(WelcomeActivity welcomeActivity) {
            o0ooO.o00oo0O0(welcomeActivity, o00oo.o00oOOo0(new byte[]{100, 53, -30, -125, Byte.MIN_VALUE, 51}, new byte[]{Ascii.DLE, 93, -117, -16, -92, 3, -127, 53}));
            welcomeActivity.o0O0oo0o();
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOOo0() {
            System.exit(0);
            Process.killProcess(Process.myPid());
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOOoO() {
        }

        @Override // o0OOooO.o0O00O0o.o0O00000
        public void o00oOo00() {
            final WelcomeActivity welcomeActivity = WelcomeActivity.this;
            oO0OO0O.o00oOo0o(new Runnable() { // from class: o0oOooO0.oO
                @Override // java.lang.Runnable
                public final void run() {
                    WelcomeActivity.o00oOOo0.o00oOo0O(WelcomeActivity.this);
                }
            }, 100L);
        }
    }

    public static final void o0O0O0Oo(WelcomeActivity welcomeActivity) {
        o0ooO.o00oo0O0(welcomeActivity, o00oo.o00oOOo0(new byte[]{36, -82, -59, -64, 125, 87}, new byte[]{80, -58, -84, -77, 89, 103, -99, -64}));
        welcomeActivity.o0O0oo0o();
    }

    public final void o0O0O0o0() {
        if (o0O000o0.o00oOo00().o00oOOoO(o00oo.o00oOOo0(new byte[]{2, -48, -31, -104, Ascii.ESC, -64, -20, 80, Ascii.CAN, -18, -2, -82, Ascii.CR, -38}, new byte[]{106, -79, -110, -57, 126, -82, -104, 53}), false)) {
            oO0O0O0.f17114o00oOOo0.getClass();
            new o(oO0O0O0.f17115o00oOOoO).previewInstalledList();
        }
    }

    public final void o0O0oo0o() {
        MainActivity.f6730o0O000O.o00oOOo0(this);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o0OoOoO.o00oOOo0();
        o0O0O0o0();
        o0O0oo00.o00oOOo0().o00oOoO0();
        oO0O0O0o.o00oOOo0(o00oo.o00oOOo0(new byte[]{65, -51, 70, 56, 91, 117, -86, 107, 68, -3, 113, 60, 76, 115, -66, 48}, new byte[]{40, -66, Ascii.DLE, 81, 41, 1, -33, 10}) + ooOOO0Oo.o00oOo00());
        if (ooOOO0Oo.o00oOo00() && o0O00O0o.o00oOOo0(this, new o00oOOo0())) {
            return;
        }
        oO0OO0O.o00oOo0o(new Runnable() { // from class: o0oOooO0.oOo00o00
            @Override // java.lang.Runnable
            public final void run() {
                WelcomeActivity.o0O0O0Oo(WelcomeActivity.this);
            }
        }, 1500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        o0O0oo0o();
    }
}
