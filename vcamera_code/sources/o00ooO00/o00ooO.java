package o00ooO00;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class o00ooO extends o00oo0 {

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final float f8227o00ooO0O = 20.0f;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f8228o00ooO0 = o00oo0.f8111o00oOo0o;

    @Override // o00ooO00.o00oo0
    public void o00oOOoO(HashSet<String> hashSet) {
    }

    public abstract void o00oOoOo(int i, int i2, float f, float f2, float f3, float f4);

    public abstract float o00oOoo0();

    public abstract float o00oOooo();

    public abstract void o00oo0(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr);

    public abstract boolean o00oo00O(int i, int i2, RectF rectF, RectF rectF2, float f, float f2);
}
