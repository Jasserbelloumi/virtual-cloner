package androidx.work;

import android.content.Context;
import androidx.work.o00oOOo0;
import java.util.Collections;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O00000;
import o0O0Ooo0.o0O00O0o;
import o0OooO0.o0O0OOO0;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements o0O0OOO0<o0O00O0o> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5547o00oOOo0 = o0O00000.o00oOo0o("WrkMgrInitializer");

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    public List<Class<? extends o0O0OOO0<?>>> dependencies() {
        return Collections.emptyList();
    }

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    /* renamed from: o00oOOoO */
    public o0O00O0o o00oOOo0(@oo0oO0 Context context) {
        o0O00000.o00oOo00().o00oOOo0(f5547o00oOOo0, "Initializing WorkManager with default configuration.", new Throwable[0]);
        o0O00O0.o00ooO0o(context, new o00oOOo0(new o00oOOo0.o00oOOoO()));
        return o0O00O0.o00ooOoO(context);
    }
}
