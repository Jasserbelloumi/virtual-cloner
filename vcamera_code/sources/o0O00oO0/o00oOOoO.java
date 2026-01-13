package o0O00oO0;

import androidx.lifecycle.o0OO0;
import androidx.lifecycle.o0OO0o00;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* loaded from: classes.dex */
public final class o00oOOoO implements o0OO0o00.o00oOOoO {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo0<?>[] f11163o00oOOoO;

    public o00oOOoO(@NotNull o00oo0<?>... o00oo0VarArr) {
        o0ooO.o00oo0O0(o00oo0VarArr, "initializers");
        this.f11163o00oOOoO = o00oo0VarArr;
    }

    @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
    @NotNull
    public <T extends o0OO0> T o00oOOoO(@NotNull Class<T> cls, @NotNull o00oOOo0 o00oooo02) {
        o00oo0<?>[] o00oo0VarArr;
        o0ooO.o00oo0O0(cls, "modelClass");
        o0ooO.o00oo0O0(o00oooo02, "extras");
        T t = null;
        for (o00oo0<?> o00oo0Var : this.f11163o00oOOoO) {
            if (o0ooO.o00oOoO0(o00oo0Var.f11165o00oOOo0, cls)) {
                Object invoke = o00oo0Var.f11166o00oOOoO.invoke(o00oooo02);
                t = invoke instanceof o0OO0 ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("No initializer set for given class ");
        o00oOOo02.append(cls.getName());
        throw new IllegalArgumentException(o00oOOo02.toString());
    }
}
