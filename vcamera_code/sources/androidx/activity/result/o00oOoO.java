package androidx.activity.result;

import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"I", "O", "Landroidx/activity/result/o00oOOoO;", "Lo00oOo00/o00oOOo0;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lo0OO0o/oO0Ooooo;", "callback", "Landroidx/activity/result/o00oo0OO;", "o00oOo00", "(Landroidx/activity/result/o00oOOoO;Lo00oOo00/o00oOOo0;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lo0OOOO/o00oo;)Landroidx/activity/result/o00oo0OO;", "o00oOooO", "(Landroidx/activity/result/o00oOOoO;Lo00oOo00/o00oOOo0;Ljava/lang/Object;Lo0OOOO/o00oo;)Landroidx/activity/result/o00oo0OO;", "activity-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oOoO {
    @NotNull
    public static final <I, O> o00oo0OO<oO0Ooooo> o00oOo00(@NotNull o00oOOoO o00ooooo2, @NotNull o00oOo00.o00oOOo0<I, O> o00oooo02, I i, @NotNull ActivityResultRegistry activityResultRegistry, @NotNull final o0OOOO.o00oo<? super O, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooooo2, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "contract");
        o0ooO.o00oo0O0(activityResultRegistry, "registry");
        o0ooO.o00oo0O0(o00ooVar, "callback");
        o00oo0OO<I> registerForActivityResult = o00ooooo2.registerForActivityResult(o00oooo02, activityResultRegistry, new o00oOOo0() { // from class: androidx.activity.result.o00oOo0O
            @Override // androidx.activity.result.o00oOOo0
            public final void o00oOOo0(Object obj) {
                o00oOoO.o00oOo0O(o0OOOO.o00oo.this, obj);
            }
        });
        o0ooO.o00oo0OO(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new o00oo00O(registerForActivityResult, o00oooo02, i);
    }

    public static final void o00oOo0O(o0OOOO.o00oo o00ooVar, Object obj) {
        o0ooO.o00oo0O0(o00ooVar, "$callback");
        o00ooVar.invoke(obj);
    }

    public static final void o00oOo0o(o0OOOO.o00oo o00ooVar, Object obj) {
        o0ooO.o00oo0O0(o00ooVar, "$callback");
        o00ooVar.invoke(obj);
    }

    @NotNull
    public static final <I, O> o00oo0OO<oO0Ooooo> o00oOooO(@NotNull o00oOOoO o00ooooo2, @NotNull o00oOo00.o00oOOo0<I, O> o00oooo02, I i, @NotNull final o0OOOO.o00oo<? super O, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooooo2, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "contract");
        o0ooO.o00oo0O0(o00ooVar, "callback");
        o00oo0OO<I> registerForActivityResult = o00ooooo2.registerForActivityResult(o00oooo02, new o00oOOo0() { // from class: androidx.activity.result.o00oOo00
            @Override // androidx.activity.result.o00oOOo0
            public final void o00oOOo0(Object obj) {
                o00oOoO.o00oOo0o(o0OOOO.o00oo.this, obj);
            }
        });
        o0ooO.o00oo0OO(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new o00oo00O(registerForActivityResult, o00oooo02, i);
    }
}
