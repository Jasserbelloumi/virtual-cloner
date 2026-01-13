package o0O00OOO;

import android.util.FloatProperty;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public abstract class o00oOo0O<T> {
    public final String mPropertyName;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOo0O<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ FloatProperty f10970o00oOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(String str, FloatProperty floatProperty) {
            super(str);
            this.f10970o00oOOo0 = floatProperty;
        }

        @Override // o0O00OOO.o00oOo0O
        public float getValue(T t) {
            return ((Float) this.f10970o00oOOo0.get(t)).floatValue();
        }

        @Override // o0O00OOO.o00oOo0O
        public void setValue(T t, float f) {
            this.f10970o00oOOo0.setValue(t, f);
        }
    }

    public o00oOo0O(String str) {
        this.mPropertyName = str;
    }

    @o0OOooO0(24)
    public static <T> o00oOo0O<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new o00oOOo0(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
