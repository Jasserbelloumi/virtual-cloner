package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.o0oOo0O0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o0OooO0.o0O0OOO0<o0O0O0O> {
    @Override // o0OooO0.o0O0OOO0
    @NotNull
    public List<Class<? extends o0OooO0.o0O0OOO0<?>>> dependencies() {
        return o0OO0oO.o0ooO.INSTANCE;
    }

    @Override // o0OooO0.o0O0OOO0
    @NotNull
    /* renamed from: o00oOOoO */
    public o0O0O0O o00oOOo0(@NotNull Context context) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        androidx.startup.o00oOOo0 o00oOo0O2 = androidx.startup.o00oOOo0.o00oOo0O(context);
        o0OOOOO0.o0ooO.o00oo0OO(o00oOo0O2, "getInstance(context)");
        if (o00oOo0O2.o00oOoO0(ProcessLifecycleInitializer.class)) {
            o0O00OO.o00oOOo0(context);
            o0oOo0O0.o00oOOoO o00ooooo2 = o0oOo0O0.f3417o00ooO00;
            o00ooooo2.o00oOo00(context);
            o00ooooo2.getClass();
            return o0oOo0O0.f3418o00ooO0O;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
