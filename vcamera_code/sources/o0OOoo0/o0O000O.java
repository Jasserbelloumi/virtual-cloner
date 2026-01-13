package o0OOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
import o0O0OoO0.o00oOo0O;
import o0OOoO0.o00oo;
import org.osmdroid.views.MapView;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public final class o0O000O implements o00oOo00 {
    @oo0oO0
    public final MapView map;
    @oo0oO0
    private final ConstraintLayout rootView;

    private o0O000O(@oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 MapView mapView) {
        this.rootView = constraintLayout;
        this.map = mapView;
    }

    @oo0oO0
    public static o0O000O bind(@oo0oO0 View view) {
        MapView mapView = (MapView) o00oOo0O.o00oOOo0(view, R.id.map);
        if (mapView != null) {
            return new o0O000O((ConstraintLayout) view, mapView);
        }
        throw new NullPointerException(o00oo.o00oOOo0(new byte[]{Ascii.GS, -79, 37, -41, 53, 32, 80, -15, 34, -67, 39, -47, 53, 60, 82, -75, 112, -82, 63, -63, 43, 110, SignedBytes.MAX_POWER_OF_TWO, -72, 36, -80, 118, -19, Ascii.CAN, 116, Ascii.ETB}, new byte[]{80, -40, 86, -92, 92, 78, 55, -47}).concat(view.getResources().getResourceName(R.id.map)));
    }

    @oo0oO0
    public static o0O000O inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0O000O inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_osmdroid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
