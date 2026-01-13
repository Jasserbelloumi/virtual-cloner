package multispace.multiapp.clone.view.base;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import multispace.multiapp.clone.view.base.BaseActivity;
import o00ooOoo.oO0O0O0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oOOo0;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0004J\b\u0010\f\u001a\u00020\u0004H\u0004¨\u0006\u000f"}, d2 = {"Lmultispace/multiapp/clone/view/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "", oO0O0O0.f9045o00oOo0O, "", "showBack", "Lkotlin/Function0;", "Lo0OO0o/oO0Ooooo;", "onBack", "o0O0oo0o", "o0oO0O0o", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class BaseActivity extends AppCompatActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o0O0O0Oo(BaseActivity baseActivity, Toolbar toolbar, int i, boolean z, o00oOOo0 o00oooo02, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(o00oo.o00oOOo0(new byte[]{122, -103, -29, -89, -30, 98, 75, 83, 69, Byte.MIN_VALUE, -32, -30, -25, 43, 92, 90, 9, -120, -10, -92, -15, 55, 68, 70, 9, -115, -31, -91, -27, 47, 77, 92, 93, -97, -77, -84, -1, 54, 8, 65, 92, -100, -29, -83, -30, 54, 77, 86, 9, -123, -3, -30, -28, 42, 65, 65, 9, -104, -14, -80, -9, 39, 92, Ascii.RS, 9, -118, -26, -84, -13, 54, 65, 93, 71, -42, -77, -85, -2, 43, 92, 102, 70, -125, -1, -96, -15, 48}, new byte[]{41, -20, -109, -62, -112, 66, 40, 50}));
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            o00oooo02 = null;
        }
        baseActivity.o0O0oo0o(toolbar, i, z, o00oooo02);
    }

    public static final void o0O0O0o0(o00oOOo0 o00oooo02, BaseActivity baseActivity, View view) {
        o0ooO.o00oo0O0(baseActivity, o00oo.o00oOOo0(new byte[]{-32, 83, 2, -27, -83, -10}, new byte[]{-108, 59, 107, -106, -119, -58, -60, -95}));
        if (o00oooo02 != null) {
            o00oooo02.invoke();
        }
        baseActivity.finish();
    }

    public final void o0O0oo0o(@NotNull Toolbar toolbar, int i, boolean z, @Nullable final o00oOOo0<oO0Ooooo> o00oooo02) {
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2;
        o0ooO.o00oo0O0(toolbar, o00oo.o00oOOo0(new byte[]{121, -68, -17, -117, 56, -23, 98}, new byte[]{Ascii.CR, -45, Byte.MIN_VALUE, -25, 90, -120, Ascii.DLE, 81}));
        o0O00Oo(toolbar);
        toolbar.setTitle(i);
        if (!z || (o0ooOoOO2 = o0ooOoOO()) == null) {
            return;
        }
        o0ooOoOO2.o0O0000o(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o0Oo0O0O.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseActivity.o0O0O0o0(o00oOOo0.this, this, view);
            }
        });
    }

    public final int o0oO0O0o() {
        return getIntent().getIntExtra(o00oo.o00oOOo0(new byte[]{-9, -68, -62, Ascii.SUB, -97, 111}, new byte[]{-126, -49, -89, 104, -42, 43, -113, 125}), 0);
    }
}
