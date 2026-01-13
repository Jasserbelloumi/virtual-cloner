package androidx.lifecycle;

import android.app.Application;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public class o00oOOoO extends o0OO0 {
    @NotNull
    private final Application application;

    public o00oOOoO(@NotNull Application application) {
        o0OOOOO0.o0ooO.o00oo0O0(application, "application");
        this.application = application;
    }

    @NotNull
    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        o0OOOOO0.o0ooO.o00oo0(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
