package o0O0Ooo0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12196o00oOOo0 = o0O00000.o00oOo0o("WorkerFactory");

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O00OOO {
        @Override // o0O0Ooo0.o0O00OOO
        @o0OO00OO
        public ListenableWorker o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 WorkerParameters workerParameters) {
            return null;
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static o0O00OOO o00oOo00() {
        return new o00oOOo0();
    }

    @o0OO00OO
    public abstract ListenableWorker o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 WorkerParameters workerParameters);

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final ListenableWorker o00oOOoO(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 WorkerParameters workerParameters) {
        ListenableWorker o00oOOo02 = o00oOOo0(context, str, workerParameters);
        if (o00oOOo02 == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                o0O00000.o00oOo00().o00oOOoO(f12196o00oOOo0, o00oOoOo.o00oo.o00oOOo0("Invalid class: ", str), th);
            }
            if (cls != null) {
                try {
                    o00oOOo02 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    o0O00000.o00oOo00().o00oOOoO(f12196o00oOOo0, o00oOoOo.o00oo.o00oOOo0("Could not instantiate ", str), th2);
                }
            }
        }
        if (o00oOOo02 == null || !o00oOOo02.isUsed()) {
            return o00oOOo02;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
