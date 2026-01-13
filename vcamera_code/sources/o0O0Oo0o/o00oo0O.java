package o0O0Oo0o;

import android.graphics.Rect;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class o00oo0O extends o0O0o0 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f11897o00oOooO = 3.0f;

    public static float o00oOoO(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    @Override // o0O0Oo0o.o0O00O0
    public long o00oOo00(ViewGroup viewGroup, androidx.transition.o0O0000O o0o0000o, o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        int i;
        int round;
        int i2;
        if (o0ooo00o == null && o0ooo00o2 == null) {
            return 0L;
        }
        if (o0ooo00o2 == null || o00oOo0O(o0ooo00o) == 0) {
            i = -1;
        } else {
            o0ooo00o = o0ooo00o2;
            i = 1;
        }
        int o00oOo0o2 = o00oOo0o(o0ooo00o);
        int o00oOoO02 = o00oOoO0(o0ooo00o);
        Rect epicenter = o0o0000o.getEpicenter();
        if (epicenter != null) {
            i2 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            int i3 = iArr[1];
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + i3);
            i2 = round2;
        }
        float o00oOoO2 = o00oOoO(o00oOo0o2, o00oOoO02, i2, round) / o00oOoO(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = o0o0000o.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i)) / this.f11897o00oOooO) * o00oOoO2);
    }

    public void o00oOoOO(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f11897o00oOooO = f;
    }
}
