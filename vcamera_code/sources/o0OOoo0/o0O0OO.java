package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0OO implements o00oOo00 {
    @oo0oO0
    private final MaterialToolbar rootView;
    @oo0oO0
    public final MaterialToolbar toolbar;

    private o0O0OO(@oo0oO0 MaterialToolbar materialToolbar, @oo0oO0 MaterialToolbar materialToolbar2) {
        this.rootView = materialToolbar;
        this.toolbar = materialToolbar2;
    }

    @oo0oO0
    public static o0O0OO bind(@oo0oO0 View view) {
        if (view != null) {
            MaterialToolbar materialToolbar = (MaterialToolbar) view;
            return new o0O0OO(materialToolbar, materialToolbar);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{75, 80, 47, -25, -93, -93, 115, 58}, new byte[]{57, 63, SignedBytes.MAX_POWER_OF_TWO, -109, -11, -54, Ascii.SYN, 77}));
    }

    @oo0oO0
    public static o0O0OO inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0OO inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public MaterialToolbar getRoot() {
        return this.rootView;
    }
}
