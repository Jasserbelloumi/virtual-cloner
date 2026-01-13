package multispace.multiapp.clone.view.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.o0oO0O0o;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o0O00000;
import o0OOo00O.o0O0oo00;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lmultispace/multiapp/clone/view/main/ShortcutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lo0OO0o/oO0Ooooo;", "onCreate", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ShortcutActivity extends AppCompatActivity {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o00oo00O(c = "multispace.multiapp.clone.view.main.ShortcutActivity$onCreate$1", f = "ShortcutActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOo0(o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                ShortcutActivity.this.finish();
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException(o00oo.o00oOOo0(new byte[]{3, 79, 43, 117, -106, 1, -51, -8, 71, 92, 34, 106, -61, Ascii.CAN, -57, -1, SignedBytes.MAX_POWER_OF_TWO, 76, 34, Byte.MAX_VALUE, -39, 7, -57, -8, 71, 71, 41, 111, -39, Ascii.RS, -57, -1, SignedBytes.MAX_POWER_OF_TWO, 89, 46, 109, -34, 85, -63, -73, Ascii.DC2, 65, 50, 109, -33, Ascii.ESC, -57}, new byte[]{96, 46, 71, Ascii.EM, -74, 117, -94, -40}));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getStringExtra(o00oo.o00oOOo0(new byte[]{-23, -68, -51}, new byte[]{-103, -41, -86, -3, -121, -1, 0, 40}));
        getIntent().getIntExtra(o00oo.o00oOOo0(new byte[]{-97, 3, 37, -42, 38, 1}, new byte[]{-22, 112, SignedBytes.MAX_POWER_OF_TWO, -92, 111, 101, -120, 50}), 0);
        o0OOo00O.o0O00000.o00oOo0o(o0oO0O0o.o00oOOo0(this), null, null, new o00oOOo0(null), 3, null);
    }
}
