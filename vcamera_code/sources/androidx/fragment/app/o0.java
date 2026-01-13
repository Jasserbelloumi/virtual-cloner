package androidx.fragment.app;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aJ\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\b\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "o00oOOo0", "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", "bundle", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o00oOooO", o0OO000o.o00oOOoO.f12961o00oOo00, "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class o0 {
    public static final void o00oOOo0(@NotNull Fragment fragment, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$clearFragmentResult");
        o0OOOOO0.o0ooO.o00oo0O0(str, "requestKey");
        fragment.getParentFragmentManager().o00oOooO(str);
    }

    public static final void o00oOOoO(@NotNull Fragment fragment, @NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$clearFragmentResultListener");
        o0OOOOO0.o0ooO.o00oo0O0(str, "requestKey");
        fragment.getParentFragmentManager().o00oOo00(str);
    }

    public static final void o00oOo00(@NotNull Fragment fragment, @NotNull String str, @NotNull Bundle bundle) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$setFragmentResult");
        o0OOOOO0.o0ooO.o00oo0O0(str, "requestKey");
        o0OOOOO0.o0ooO.o00oo0O0(bundle, "result");
        fragment.getParentFragmentManager().o00oOOo0(str, bundle);
    }

    public static final void o00oOooO(@NotNull Fragment fragment, @NotNull String str, @NotNull o0OOOO.o0O00000<? super String, ? super Bundle, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fragment, "$this$setFragmentResultListener");
        o0OOOOO0.o0ooO.o00oo0O0(str, "requestKey");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        fragment.getParentFragmentManager().o00oOOoO(str, fragment, new o00ooO(o0o00000));
    }
}
