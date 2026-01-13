package androidx.fragment.app;

import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a=\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/o0O0oo0o;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "body", "o00oOOo0", "o00oOo00", "now", "o00oOo0O", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class o0OoO00O {
    public static final void o00oOOo0(@NotNull FragmentManager fragmentManager, boolean z, @NotNull o0OOOO.o00oo<? super o0O0oo0o, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$commit");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            o00oo0oO2.o00oo0();
        } else {
            o00oo0oO2.o00oo00O();
        }
    }

    public static /* synthetic */ void o00oOOoO(FragmentManager fragmentManager, boolean z, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$commit");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            o00oo0oO2.o00oo0();
        } else {
            o00oo0oO2.o00oo00O();
        }
    }

    public static final void o00oOo00(@NotNull FragmentManager fragmentManager, boolean z, @NotNull o0OOOO.o00oo<? super o0O0oo0o, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$commitNow");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            o00oo0oO2.o00oo0O0();
        } else {
            o00oo0oO2.o00oo0OO();
        }
    }

    @o0OO0o.o0O0o(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void o00oOo0O(@NotNull FragmentManager fragmentManager, boolean z, boolean z2, @NotNull o0OOOO.o00oo<? super o0O0oo0o, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$transaction");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            if (z2) {
                o00oo0oO2.o00oo0O0();
            } else {
                o00oo0oO2.o00oo0OO();
            }
        } else if (z2) {
            o00oo0oO2.o00oo0();
        } else {
            o00oo0oO2.o00oo00O();
        }
    }

    public static /* synthetic */ void o00oOo0o(FragmentManager fragmentManager, boolean z, boolean z2, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$transaction");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            if (z2) {
                o00oo0oO2.o00oo0O0();
            } else {
                o00oo0oO2.o00oo0OO();
            }
        } else if (z2) {
            o00oo0oO2.o00oo0();
        } else {
            o00oo0oO2.o00oo00O();
        }
    }

    public static /* synthetic */ void o00oOooO(FragmentManager fragmentManager, boolean z, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0OOOOO0.o0ooO.o00oo0O0(fragmentManager, "$this$commitNow");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "body");
        o0O0oo0o o00oo0oO2 = fragmentManager.o00oo0oO();
        o0OOOOO0.o0ooO.o00oo0OO(o00oo0oO2, "beginTransaction()");
        o00ooVar.invoke(o00oo0oO2);
        if (z) {
            o00oo0oO2.o00oo0O0();
        } else {
            o00oo0oO2.o00oo0OO();
        }
    }
}
