package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements o0O00OOO {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO000o f3259o00oo0O0;

    public SavedStateHandleAttacher(@NotNull o0OO000o o0oo000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo000o, DatabaseFileArchive.COLUMN_PROVIDER);
        this.f3259o00oo0O0 = o0oo000o;
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        if (o00oooo02 == o0O00.o00oOOo0.ON_CREATE) {
            o0o0o0o.getLifecycle().o00oOooO(this);
            this.f3259o00oo0O0.o00oOooO();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + o00oooo02).toString());
    }
}
