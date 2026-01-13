package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.o00oo00O;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O0O0O;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O000.o0O00OOO;
import o0OooO0.o0O0OOO0;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements o0O0OOO0<Boolean> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f2630o00oOOo0 = 500;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f2631o00oOOoO = "EmojiCompatInitializer";

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oo00O.o00oOo0O {
        public o00oOOo0(Context context) {
            super(new o00oOOoO(context));
            o00oOo0o(1);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oo00O.o00oo0O0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f2634o00oOOo0;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o00oo00O.o00oo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ o00oo00O.o00oo0O f2635o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f2636o00oOOoO;

            public o00oOOo0(o00oo00O.o00oo0O o00oo0o2, ThreadPoolExecutor threadPoolExecutor) {
                this.f2635o00oOOo0 = o00oo0o2;
                this.f2636o00oOOoO = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.o00oo00O.o00oo0O
            public void o00oOOo0(@o0OO00OO Throwable th) {
                try {
                    this.f2635o00oOOo0.o00oOOo0(th);
                } finally {
                    this.f2636o00oOOoO.shutdown();
                }
            }

            @Override // androidx.emoji2.text.o00oo00O.o00oo0O
            public void o00oOOoO(@oo0oO0 o0O00000 o0o00000) {
                try {
                    this.f2635o00oOOo0.o00oOOoO(o0o00000);
                } finally {
                    this.f2636o00oOOoO.shutdown();
                }
            }
        }

        public o00oOOoO(Context context) {
            this.f2634o00oOOo0 = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oo0O0
        public void o00oOOo0(@oo0oO0 final o00oo00O.o00oo0O o00oo0o2) {
            final ThreadPoolExecutor o00oOo002 = androidx.emoji2.text.o00oOo00.o00oOo00(EmojiCompatInitializer.f2631o00oOOoO);
            o00oOo002.execute(new Runnable() { // from class: androidx.emoji2.text.o00oo0
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.o00oOOoO.this.o00oOooO(o00oo0o2, o00oOo002);
                }
            });
        }

        @oO0Oo
        /* renamed from: o00oOo00 */
        public void o00oOooO(@oo0oO0 o00oo00O.o00oo0O o00oo0o2, @oo0oO0 ThreadPoolExecutor threadPoolExecutor) {
            try {
                o00oo o00oOOo02 = o00oOo0O.o00oOOo0(this.f2634o00oOOo0);
                if (o00oOOo02 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                o00oOOo02.o00oOooo(threadPoolExecutor);
                o00oOOo02.o00oOOo0().o00oOOo0(new o00oOOo0(o00oo0o2, threadPoolExecutor));
            } catch (Throwable th) {
                o00oo0o2.o00oOOo0(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                o0O00OOO.o00oOOoO("EmojiCompat.EmojiCompatInitializer.run");
                if (o00oo00O.o00oo0()) {
                    o00oo00O.o00oOOoO().o00oo0O();
                }
                o0O00OOO.o00oOOo0.o00oOOoO();
            } catch (Throwable th) {
                o0O00OOO.o00oOooO();
                throw th;
            }
        }
    }

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    public List<Class<? extends o0O0OOO0<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o0OooO0.o0O0OOO0
    @oo0oO0
    /* renamed from: o00oOOoO */
    public Boolean o00oOOo0(@oo0oO0 Context context) {
        o00oo00O.o00oo00O(new o00oOOo0(context));
        o00oOo00(context);
        return Boolean.TRUE;
    }

    @o0OOooO0(19)
    public void o00oOo00(@oo0oO0 Context context) {
        final o0O00 lifecycle = ((o0O0O0O) androidx.startup.o00oOOo0.o00oOo0O(context).o00oOo00(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.o00oOOo0(new androidx.lifecycle.o00oo() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.o00oo
            public void o00oOo0o(@oo0oO0 o0O0O0O o0o0o0o) {
                EmojiCompatInitializer.this.o00oOooO();
                lifecycle.o00oOooO(this);
            }
        });
    }

    @o0OOooO0(19)
    public void o00oOooO() {
        androidx.emoji2.text.o00oOo00.o00oOo0O().postDelayed(new o00oOo00(), 500L);
    }
}
