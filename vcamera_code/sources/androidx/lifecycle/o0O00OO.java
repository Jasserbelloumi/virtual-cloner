package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0o0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0O00OO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O00OO f3336o00oOOo0 = new o0O00OO();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final AtomicBoolean f3337o00oOOoO = new AtomicBoolean(false);

    @o0o0000
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O00000 {
        @Override // androidx.lifecycle.o0O00000, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOooO(activity);
        }
    }

    @o0OOOO0o.o00ooO0
    public static final void o00oOOo0(@NotNull Context context) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        if (f3337o00oOOoO.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        o0OOOOO0.o0ooO.o00oo0(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new o00oOOo0());
    }
}
