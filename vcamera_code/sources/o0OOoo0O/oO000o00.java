package o0OOoo0O;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO000o00 extends o0OOO0OO {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Surface f15229o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f15230o00oOoO0;

    public oO000o00(o0OOO0O o0ooo0o, SurfaceTexture surfaceTexture) {
        super(o0ooo0o);
        o00oOOoO(surfaceTexture);
    }

    public oO000o00(o0OOO0O o0ooo0o, Surface surface, boolean z) {
        super(o0ooo0o);
        o00oOOoO(surface);
        this.f15229o00oOo0o = surface;
        this.f15230o00oOoO0 = z;
    }

    @Override // o0OOoo0O.o0OOO0OO
    public void o00oOoO0() {
        o00oOoO();
        Surface surface = this.f15229o00oOo0o;
        if (surface != null) {
            if (this.f15230o00oOoO0) {
                surface.release();
            }
            this.f15229o00oOo0o = null;
        }
    }

    public void o00oOooo(o0OOO0O o0ooo0o) {
        Surface surface = this.f15229o00oOo0o;
        if (surface == null) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{43, -36, -37, SignedBytes.MAX_POWER_OF_TWO, -65, Ascii.CR, oo0OOoo.f13516o00oOoO, -46, 44, -34, -33, Ascii.FF, -93, 5, 44, -100, 49, -42, -53, SignedBytes.MAX_POWER_OF_TWO, -96, 7, 59, -46, Ascii.SYN, -58, -35, 6, -89, Ascii.VT, 44, -90, 32, -53, -37, Ascii.NAK, -76, Ascii.CR}, new byte[]{69, -77, -81, 96, -58, 104, 73, -14}));
        }
        this.f15088o00oOOo0 = o0ooo0o;
        o00oOOoO(surface);
    }
}
