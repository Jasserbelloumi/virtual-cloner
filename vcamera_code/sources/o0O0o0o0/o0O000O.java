package o0O0o0o0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0O00O0o;
import o0O0o0o.o00oo;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000O implements o0O0Ooo0.o00oo {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12589o00oOooO = o0O0Ooo0.o0O00000.o00oOo0o("WMFgUpdater");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO00O0oO f12590o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0o0OO.o00oo0 f12591o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O00O0o f12592o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ UUID f12593o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0o0o.o00ooO f12594o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0O0Ooo0.o0O0o f12595o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ Context f12597o00oo0o0;

        public o00oOOo0(o0O0o0o.o00ooO o00ooo, UUID uuid, o0O0Ooo0.o0O0o o0o0o, Context context) {
            this.f12594o00oo0O0 = o00ooo;
            this.f12593o00oo0O = uuid;
            this.f12595o00oo0Oo = o0o0o;
            this.f12597o00oo0o0 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!(this.f12594o00oo0O0.f12497o00oo0O0 instanceof o00oo.o00oOo00)) {
                    String uuid = this.f12593o00oo0O.toString();
                    o0OoO00O.o00oOOo0 o00oOoO2 = o0O000O.this.f12592o00oOo00.o00oOoO(uuid);
                    if (o00oOoO2 == null || o00oOoO2.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    o0O000O.this.f12591o00oOOoO.o00oOOoO(uuid, this.f12595o00oo0Oo);
                    this.f12597o00oo0o0.startService(androidx.work.impl.foreground.o00oOOo0.o00oOo00(this.f12597o00oo0o0, uuid, this.f12595o00oo0Oo));
                }
                this.f12594o00oo0O0.o00oo0O0(null);
            } catch (Throwable th) {
                this.f12594o00oo0O0.o00oo0O(th);
            }
        }
    }

    public o0O000O(@oo0oO0 WorkDatabase workDatabase, @oo0oO0 o0O0o0OO.o00oo0 o00oo0Var, @oo0oO0 oO00O0oO oo00o0oo) {
        this.f12591o00oOOoO = o00oo0Var;
        this.f12590o00oOOo0 = oo00o0oo;
        this.f12592o00oOo00 = workDatabase.o00ooo0O();
    }

    @Override // o0O0Ooo0.o00oo
    @oo0oO0
    public ListenableFuture<Void> o00oOOo0(@oo0oO0 Context context, @oo0oO0 UUID uuid, @oo0oO0 o0O0Ooo0.o0O0o o0o0o) {
        o0O0o0o.o00ooO o00oo0oO2 = o0O0o0o.o00ooO.o00oo0oO();
        this.f12590o00oOOo0.o00oOOoO(new o00oOOo0(o00oo0oO2, uuid, o0o0o, context));
        return o00oo0oO2;
    }
}
