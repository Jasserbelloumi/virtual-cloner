package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class o00oOOoO implements Executor {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final /* synthetic */ Handler f2651o00oo0O0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2651o00oo0O0.post(runnable);
    }
}
