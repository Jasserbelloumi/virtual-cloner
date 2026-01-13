package o0O0Ooo0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0OO extends o0O00OOO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12164o00oOo00 = o0O00000.o00oOo0o("DelegatingWkrFctry");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<o0O00OOO> f12165o00oOOoO = new CopyOnWriteArrayList();

    @Override // o0O0Ooo0.o0O00OOO
    @o0OO00OO
    public final ListenableWorker o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 WorkerParameters workerParameters) {
        for (o0O00OOO o0o00ooo : this.f12165o00oOOoO) {
            try {
                ListenableWorker o00oOOo02 = o0o00ooo.o00oOOo0(context, str, workerParameters);
                if (o00oOOo02 != null) {
                    return o00oOOo02;
                }
            } catch (Throwable th) {
                o0O00000.o00oOo00().o00oOOoO(f12164o00oOo00, String.format("Unable to instantiate a ListenableWorker (%s)", str), th);
                throw th;
            }
        }
        return null;
    }

    @oo0oO0
    @o0o0000
    public List<o0O00OOO> o00oOo0O() {
        return this.f12165o00oOOoO;
    }

    public final void o00oOooO(@oo0oO0 o0O00OOO o0o00ooo) {
        this.f12165o00oOOoO.add(o0o00ooo);
    }
}
