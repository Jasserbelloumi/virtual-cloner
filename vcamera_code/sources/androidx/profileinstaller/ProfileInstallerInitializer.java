package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0OooO0.o0O0OOO0;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements o0O0OOO0<o00oOo00> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f3985o00oOOo0 = 5000;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOo00(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o0O0OO0.o00oo
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Handler o00oOOo0(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {
    }

    public static void o00oOoo0(@oo0oO0 final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: o0O0OO0.o0O0o
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.o00oOo00.o00oOooo(context);
            }
        });
    }

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    public List<Class<? extends o0O0OOO0<?>>> dependencies() {
        return Collections.emptyList();
    }

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    /* renamed from: o00oOo0O */
    public o00oOo00 o00oOOo0(@oo0oO0 Context context) {
        o00oOo0o(context.getApplicationContext());
        return new o00oOo00();
    }

    @o0OOooO0(16)
    public void o00oOo0o(@oo0oO0 final Context context) {
        o00oOOo0.o00oOo00(new Runnable() { // from class: o0O0OO0.o00oo0O
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.o00oOoO(context);
            }
        });
    }

    /* renamed from: o00oOoO0 */
    public void o00oOoO(@oo0oO0 final Context context) {
        o00oOOoO.o00oOOo0(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o0O0OO0.o00oo0O0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.o00oOoo0(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
