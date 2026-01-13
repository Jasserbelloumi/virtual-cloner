package o00oooOo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.appcompat.widget.o00oOo00;
import androidx.collection.o00oo0O;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o00ooo0o.o0O0OO;
import o0O000O.o00oo0OO;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class oOOO000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oOOO00o0 f9822o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00oo0O<String, Typeface> f9823o00oOOoO;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oo0OO.o00oOo0O {
        @o0OO00OO

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public o0O0OO.o00oo0 f9824o00oOoOo;

        public o00oOOo0(@o0OO00OO o0O0OO.o00oo0 o00oo0Var) {
            this.f9824o00oOoOo = o00oo0Var;
        }

        @Override // o0O000O.o00oo0OO.o00oOo0O
        public void o00oOOo0(int i) {
            o0O0OO.o00oo0 o00oo0Var = this.f9824o00oOoOo;
            if (o00oo0Var != null) {
                o00oo0Var.lambda$callbackFailAsync$1(i);
            }
        }

        @Override // o0O000O.o00oo0OO.o00oOo0O
        public void o00oOOoO(@oo0oO0 Typeface typeface) {
            o0O0OO.o00oo0 o00oo0Var = this.f9824o00oOoOo;
            if (o00oo0Var != null) {
                o00oo0Var.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    static {
        f9822o00oOOo0 = Build.VERSION.SDK_INT >= 29 ? new oOOO00Oo() : new oOOO00O();
        f9823o00oOOoO = new o00oo0O<>(16);
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static void o00oOOo0() {
        f9823o00oOOoO.evictAll();
    }

    @oo0oO0
    public static Typeface o00oOOoO(@oo0oO0 Context context, @o0OO00OO Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @oo0oO0
    public static Typeface o00oOo00(@oo0oO0 Context context, @o0OO00OO Typeface typeface, @o0O0o00O(from = 1, to = 1000) int i, boolean z) {
        if (context != null) {
            ooOOOOoo.o00oOoO0(i, 1, 1000, o00oOo00.f1045o00oo0o);
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f9822o00oOOo0.o00oOoO0(context, typeface, i, z);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @o0OO00OO
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOo0O(@oo0oO0 Context context, @oo0oO0 o0O0O0o0.o00oOOoO o00ooooo2, @oo0oO0 Resources resources, int i, int i2, @o0OO00OO o0O0OO.o00oo0 o00oo0Var, @o0OO00OO Handler handler, boolean z) {
        return o00oOo0o(context, o00ooooo2, resources, i, null, 0, i2, o00oo0Var, handler, z);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static Typeface o00oOo0o(@oo0oO0 Context context, @oo0oO0 o0O0O0o0.o00oOOoO o00ooooo2, @oo0oO0 Resources resources, int i, @o0OO00OO String str, int i2, int i3, @o0OO00OO o0O0OO.o00oo0 o00oo0Var, @o0OO00OO Handler handler, boolean z) {
        Typeface o00oOOoO2;
        if (o00ooooo2 instanceof o0O0O0o0.o00oo00O) {
            o0O0O0o0.o00oo00O o00oo00o = (o0O0O0o0.o00oo00O) o00ooooo2;
            Typeface o00oo00O2 = o00oo00O(o00oo00o.f9740o00oOooO);
            if (o00oo00O2 != null) {
                if (o00oo0Var != null) {
                    o00oo0Var.callbackSuccessAsync(o00oo00O2, handler);
                }
                return o00oo00O2;
            }
            boolean z2 = !z ? o00oo0Var != null : o00oo00o.f9739o00oOo00 != 0;
            int i4 = z ? o00oo00o.f9738o00oOOoO : -1;
            o00oOOoO2 = o00oo0OO.o00oOo0o(context, o00oo00o.f9737o00oOOo0, i3, z2, i4, o0O0OO.o00oo0.getHandler(handler), new o00oOOo0(o00oo0Var));
        } else {
            o00oOOoO2 = f9822o00oOOo0.o00oOOoO(context, (o0O0O0o0.o00oOo0O) o00ooooo2, resources, i3);
            if (o00oo0Var != null) {
                if (o00oOOoO2 != null) {
                    o00oo0Var.callbackSuccessAsync(o00oOOoO2, handler);
                } else {
                    o00oo0Var.callbackFailAsync(-3, handler);
                }
            }
        }
        if (o00oOOoO2 != null) {
            f9823o00oOOoO.put(o00oOoOO(resources, i, str, i2, i3), o00oOOoO2);
        }
        return o00oOOoO2;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static Typeface o00oOoO(@oo0oO0 Context context, @oo0oO0 Resources resources, int i, String str, int i2, int i3) {
        Typeface o00oOo0o2 = f9822o00oOOo0.o00oOo0o(context, resources, i, str, i3);
        if (o00oOo0o2 != null) {
            f9823o00oOOoO.put(o00oOoOO(resources, i, str, i2, i3), o00oOo0o2);
        }
        return o00oOo0o2;
    }

    @o0OO00OO
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Resources resources, int i, String str, int i2) {
        return o00oOoO(context, resources, i, str, 0, i2);
    }

    public static String o00oOoOO(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @o0OO00OO
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOoOo(@oo0oO0 Resources resources, int i, int i2) {
        return o00oOoo0(resources, i, null, 0, i2);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static Typeface o00oOoo0(@oo0oO0 Resources resources, int i, @o0OO00OO String str, int i2, int i3) {
        return f9823o00oOOoO.get(o00oOoOO(resources, i, str, i2, i3));
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static Typeface o00oOooO(@oo0oO0 Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        return f9822o00oOOo0.o00oOooO(context, cancellationSignal, o00ooo00Arr, i);
    }

    @o0OO00OO
    public static Typeface o00oOooo(Context context, Typeface typeface, int i) {
        oOOO00o0 oooo00o0 = f9822o00oOOo0;
        o0O0O0o0.o00oOo0O o00oo00O2 = oooo00o0.o00oo00O(typeface);
        if (o00oo00O2 == null) {
            return null;
        }
        return oooo00o0.o00oOOoO(context, o00oo00O2, context.getResources(), i);
    }

    public static Typeface o00oo00O(@o0OO00OO String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
