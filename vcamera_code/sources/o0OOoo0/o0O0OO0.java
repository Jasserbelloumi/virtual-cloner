package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0OOoO0.o00oo;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O0OO0 implements o00oOo00 {
    @oo0oO0
    private final SwitchMaterial rootView;
    @oo0oO0
    public final SwitchMaterial switchView;

    private o0O0OO0(@oo0oO0 SwitchMaterial switchMaterial, @oo0oO0 SwitchMaterial switchMaterial2) {
        this.rootView = switchMaterial;
        this.switchView = switchMaterial2;
    }

    @oo0oO0
    public static o0O0OO0 bind(@oo0oO0 View view) {
        if (view != null) {
            SwitchMaterial switchMaterial = (SwitchMaterial) view;
            return new o0O0OO0(switchMaterial, switchMaterial);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{-84, -105, 123, 101, -104, -39, 81, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{-34, -8, Ascii.DC4, 17, -50, -80, 52, 55}));
    }

    @oo0oO0
    public static o0O0OO0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O0OO0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_switch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public SwitchMaterial getRoot() {
        return this.rootView;
    }
}
