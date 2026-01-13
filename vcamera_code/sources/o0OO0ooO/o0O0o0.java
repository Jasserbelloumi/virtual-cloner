package o0OO0ooO;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import o0OO0o.o0O;
import o0OO0o.oO0Ooooo;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "TimersKt")
/* loaded from: classes3.dex */
public final class o0O0o0 {

    @o0OOO00({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends TimerTask {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo<TimerTask, oO0Ooooo> f13431o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
            this.f13431o00oo0O0 = o00ooVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f13431o00oo0O0.invoke(this);
        }
    }

    @o00oo00O
    public static final Timer o00oOOo0(String str, boolean z, long j, long j2, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.scheduleAtFixedRate(new o00oOOo0(o00ooVar), j, j2);
        return o00oOoo02;
    }

    @o00oo00O
    public static final Timer o00oOOoO(String str, boolean z, Date date, long j, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(date, "startAt");
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.scheduleAtFixedRate(new o00oOOo0(o00ooVar), date, j);
        return o00oOoo02;
    }

    public static /* synthetic */ Timer o00oOo00(String str, boolean z, long j, long j2, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.scheduleAtFixedRate(new o00oOOo0(o00ooVar), j, j2);
        return o00oOoo02;
    }

    @o00oo00O
    public static final TimerTask o00oOo0O(Timer timer, long j, long j2, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.schedule(o00oooo02, j, j2);
        return o00oooo02;
    }

    @o00oo00O
    public static final TimerTask o00oOo0o(Timer timer, long j, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.schedule(o00oooo02, j);
        return o00oooo02;
    }

    @o00oo00O
    public static final TimerTask o00oOoO(Timer timer, Date date, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(date, "time");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.schedule(o00oooo02, date);
        return o00oooo02;
    }

    @o00oo00O
    public static final TimerTask o00oOoO0(Timer timer, Date date, long j, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(date, "time");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.schedule(o00oooo02, date, j);
        return o00oooo02;
    }

    @o00oo00O
    public static final TimerTask o00oOoOO(Timer timer, long j, long j2, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.scheduleAtFixedRate(o00oooo02, j, j2);
        return o00oooo02;
    }

    @o00oo00O
    public static final TimerTask o00oOoOo(Timer timer, Date date, long j, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(timer, "<this>");
        o0ooO.o00oo0O0(date, "time");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOOo0 o00oooo02 = new o00oOOo0(o00ooVar);
        timer.scheduleAtFixedRate(o00oooo02, date, j);
        return o00oooo02;
    }

    @o0O
    @NotNull
    public static final Timer o00oOoo0(@Nullable String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    public static /* synthetic */ Timer o00oOooO(String str, boolean z, Date date, long j, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        o0ooO.o00oo0O0(date, "startAt");
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.scheduleAtFixedRate(new o00oOOo0(o00ooVar), date, j);
        return o00oOoo02;
    }

    @o00oo00O
    public static final Timer o00oOooo(String str, boolean z, long j, long j2, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.schedule(new o00oOOo0(o00ooVar), j, j2);
        return o00oOoo02;
    }

    public static /* synthetic */ Timer o00oo0(String str, boolean z, long j, long j2, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.schedule(new o00oOOo0(o00ooVar), j, j2);
        return o00oOoo02;
    }

    @o00oo00O
    public static final Timer o00oo00O(String str, boolean z, Date date, long j, o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(date, "startAt");
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.schedule(new o00oOOo0(o00ooVar), date, j);
        return o00oOoo02;
    }

    @o00oo00O
    public static final TimerTask o00oo0O0(o00oo<? super TimerTask, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "action");
        return new o00oOOo0(o00ooVar);
    }

    public static /* synthetic */ Timer o00oo0OO(String str, boolean z, Date date, long j, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        o0ooO.o00oo0O0(date, "startAt");
        o0ooO.o00oo0O0(o00ooVar, "action");
        Timer o00oOoo02 = o00oOoo0(str, z);
        o00oOoo02.schedule(new o00oOOo0(o00ooVar), date, j);
        return o00oOoo02;
    }
}
