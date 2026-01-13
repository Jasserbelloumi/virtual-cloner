package o0O0Oo0o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
public class o0OoOoOo<T> extends Property<T, Float> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Property<T, PointF> f11947o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final PathMeasure f11948o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final float f11949o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final PointF f11950o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f11951o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final float[] f11952o00oOooO;

    public o0OoOoOo(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f11952o00oOooO = new float[2];
        this.f11950o00oOo0O = new PointF();
        this.f11947o00oOOo0 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f11948o00oOOoO = pathMeasure;
        this.f11949o00oOo00 = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: o00oOOo0 */
    public Float get(T t) {
        return Float.valueOf(this.f11951o00oOo0o);
    }

    @Override // android.util.Property
    /* renamed from: o00oOOoO */
    public void set(T t, Float f) {
        this.f11951o00oOo0o = f.floatValue();
        this.f11948o00oOOoO.getPosTan(f.floatValue() * this.f11949o00oOo00, this.f11952o00oOooO, null);
        PointF pointF = this.f11950o00oOo0O;
        float[] fArr = this.f11952o00oOooO;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f11947o00oOOo0.set(t, pointF);
    }
}
