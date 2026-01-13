package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements o0O00OOO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OoOoOo[] f3219o00oo0O0;

    public CompositeGeneratedAdaptersObserver(@NotNull o0OoOoOo[] o0ooooooArr) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooooooArr, "generatedAdapters");
        this.f3219o00oo0O0 = o0ooooooArr;
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        o0O0OOO o0o0ooo = new o0O0OOO();
        for (o0OoOoOo o0oooooo : this.f3219o00oo0O0) {
            o0oooooo.o00oOOo0(o0o0o0o, o00oooo02, false, o0o0ooo);
        }
        for (o0OoOoOo o0oooooo2 : this.f3219o00oo0O0) {
            o0oooooo2.o00oOOo0(o0o0o0o, o00oooo02, true, o0o0ooo);
        }
    }
}
