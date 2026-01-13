package o00oooOo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.collection.o00oo0OO;
import java.lang.reflect.Field;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class oOOO0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9845o00oOOo0 = "WeightTypeface";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9846o00oOOoO = "native_instance";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Field f9847o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Object f9848o00oOo0O;
    @o0O0OOOo("sWeightCacheLock")

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o00oo0OO<SparseArray<Typeface>> f9849o00oOooO;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        f9847o00oOo00 = field;
        f9849o00oOooO = new o00oo0OO<>(3);
        f9848o00oOo0O = new Object();
    }

    @o0OO00OO
    public static Typeface o00oOOo0(@oo0oO0 oOOO00o0 oooo00o0, @oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        if (o00oOooO()) {
            int i2 = (i << 1) | (z ? 1 : 0);
            synchronized (f9848o00oOo0O) {
                long o00oOo002 = o00oOo00(typeface);
                o00oo0OO<SparseArray<Typeface>> o00oo0oo = f9849o00oOooO;
                SparseArray<Typeface> o00oOooo2 = o00oo0oo.o00oOooo(o00oOo002);
                if (o00oOooo2 == null) {
                    o00oOooo2 = new SparseArray<>(4);
                    o00oo0oo.o00oo0Oo(o00oOo002, o00oOooo2);
                } else {
                    Typeface typeface2 = o00oOooo2.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface o00oOOoO2 = o00oOOoO(oooo00o0, context, typeface, i, z);
                if (o00oOOoO2 == null) {
                    o00oOOoO2 = o00oOo0O(typeface, i, z);
                }
                o00oOooo2.put(i2, o00oOOoO2);
                return o00oOOoO2;
            }
        }
        return null;
    }

    @o0OO00OO
    public static Typeface o00oOOoO(@oo0oO0 oOOO00o0 oooo00o0, @oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        o0O0O0o0.o00oOo0O o00oo00O2 = oooo00o0.o00oo00O(typeface);
        if (o00oo00O2 == null) {
            return null;
        }
        return oooo00o0.o00oOo00(context, o00oo00O2, context.getResources(), i, z);
    }

    public static long o00oOo00(@oo0oO0 Typeface typeface) {
        try {
            return ((Number) f9847o00oOo00.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Typeface o00oOo0O(Typeface typeface, int i, boolean z) {
        int i2 = 1;
        boolean z2 = i >= 600;
        if (!z2 && !z) {
            i2 = 0;
        } else if (!z2) {
            i2 = 2;
        } else if (z) {
            i2 = 3;
        }
        return Typeface.create(typeface, i2);
    }

    public static boolean o00oOooO() {
        return f9847o00oOo00 != null;
    }
}
