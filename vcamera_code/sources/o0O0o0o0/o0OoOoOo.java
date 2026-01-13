package o0O0o0o0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0OoO00O;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0OoOoOo implements o0O0Ooo0.o0O000o0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12609o00oOo00 = o0O0Ooo0.o0O00000.o00oOo0o("WorkProgressUpdater");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final WorkDatabase f12610o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oO00O0oO f12611o00oOOoO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ androidx.work.o00oOOoO f12612o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ UUID f12613o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0O0o0o.o00ooO f12614o00oo0Oo;

        public o00oOOo0(UUID uuid, androidx.work.o00oOOoO o00ooooo2, o0O0o0o.o00ooO o00ooo) {
            this.f12613o00oo0O0 = uuid;
            this.f12612o00oo0O = o00ooooo2;
            this.f12614o00oo0Oo = o00ooo;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OoO00O o00oOoOO2;
            String uuid = this.f12613o00oo0O0.toString();
            o0O0Ooo0.o0O00000 o00oOo002 = o0O0Ooo0.o0O00000.o00oOo00();
            String str = o0OoOoOo.f12609o00oOo00;
            o00oOo002.o00oOOo0(str, String.format("Updating progress for %s (%s)", this.f12613o00oo0O0, this.f12612o00oo0O), new Throwable[0]);
            o0OoOoOo.this.f12610o00oOOo0.o00oOo00();
            try {
                o00oOoOO2 = o0OoOoOo.this.f12610o00oOOo0.o00ooo0O().o00oOoOO(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (o00oOoOO2 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (o00oOoOO2.f12463o00oOOoO == o0OoO00O.o00oOOo0.RUNNING) {
                o0OoOoOo.this.f12610o00oOOo0.o00ooo0().o00oOOoO(new o0O0o0Oo.o0O000o0(uuid, this.f12612o00oo0O));
            } else {
                o0O0Ooo0.o0O00000.o00oOo00().o00oOoO(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f12614o00oo0Oo.o00oo0O0(null);
            o0OoOoOo.this.f12610o00oOOo0.o00ooO0o();
        }
    }

    public o0OoOoOo(@oo0oO0 WorkDatabase workDatabase, @oo0oO0 oO00O0oO oo00o0oo) {
        this.f12610o00oOOo0 = workDatabase;
        this.f12611o00oOOoO = oo00o0oo;
    }

    @Override // o0O0Ooo0.o0O000o0
    @oo0oO0
    public ListenableFuture<Void> o00oOOo0(@oo0oO0 Context context, @oo0oO0 UUID uuid, @oo0oO0 androidx.work.o00oOOoO o00ooooo2) {
        o0O0o0o.o00ooO o00oo0oO2 = o0O0o0o.o00ooO.o00oo0oO();
        this.f12611o00oOOoO.o00oOOoO(new o00oOOo0(uuid, o00ooooo2, o00oo0oO2));
        return o00oo0oO2;
    }
}
