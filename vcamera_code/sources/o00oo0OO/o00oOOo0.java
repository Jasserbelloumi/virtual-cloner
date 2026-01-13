package o00oo0OO;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOo000;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o0ooOoOO.oO000OOo;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7454o00oOo0O = "AsyncLayoutInflater";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public LayoutInflater f7455o00oOOo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Handler.Callback f7458o00oOooO = new C0110o00oOOo0();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Handler f7456o00oOOoO = new Handler(this.f7458o00oOooO);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOo0O f7457o00oOo00 = o00oOo0O.o00oOOoO();

    /* renamed from: o00oo0OO.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0110o00oOOo0 implements Handler.Callback {
        public C0110o00oOOo0() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            o00oOo00 o00ooo002 = (o00oOo00) message.obj;
            if (o00ooo002.f7465o00oOooO == null) {
                o00ooo002.f7465o00oOooO = o00oOOo0.this.f7455o00oOOo0.inflate(o00ooo002.f7463o00oOo00, o00ooo002.f7462o00oOOoO, false);
            }
            o00ooo002.f7464o00oOo0O.o00oOOo0(o00ooo002.f7465o00oOooO, o00ooo002.f7463o00oOo00, o00ooo002.f7462o00oOOoO);
            o00oOOo0.this.f7457o00oOo00.o00oOooO(o00ooo002);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends LayoutInflater {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final String[] f7460o00oOOo0 = {"android.widget.", "android.webkit.", "android.app."};

        public o00oOOoO(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new o00oOOoO(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : f7460o00oOOo0) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oOOo0 f7461o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ViewGroup f7462o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f7463o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o00oOoO f7464o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public View f7465o00oOooO;
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends Thread {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final o00oOo0O f7466o00oo0Oo;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public ArrayBlockingQueue<o00oOo00> f7468o00oo0O0 = new ArrayBlockingQueue<>(10);

        /* renamed from: o00oo0O  reason: collision with root package name */
        public oO000OOo.o00oOo00<o00oOo00> f7467o00oo0O = new oO000OOo.o00oOo00<>(10);

        static {
            o00oOo0O o00ooo0o2 = new o00oOo0O();
            f7466o00oo0Oo = o00ooo0o2;
            o00ooo0o2.start();
        }

        public static o00oOo0O o00oOOoO() {
            return f7466o00oo0Oo;
        }

        public void o00oOOo0(o00oOo00 o00ooo002) {
            try {
                this.f7468o00oo0O0.put(o00ooo002);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public o00oOo00 o00oOo00() {
            o00oOo00 acquire = this.f7467o00oo0O.acquire();
            return acquire == null ? new o00oOo00() : acquire;
        }

        public void o00oOo0O() {
            try {
                o00oOo00 take = this.f7468o00oo0O0.take();
                try {
                    take.f7465o00oOooO = take.f7461o00oOOo0.f7455o00oOOo0.inflate(take.f7463o00oOo00, take.f7462o00oOOoO, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.f7461o00oOOo0.f7456o00oOOoO, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        public void o00oOooO(o00oOo00 o00ooo002) {
            o00ooo002.f7464o00oOo0O = null;
            o00ooo002.f7461o00oOOo0 = null;
            o00ooo002.f7462o00oOOoO = null;
            o00ooo002.f7463o00oOo00 = 0;
            o00ooo002.f7465o00oOooO = null;
            this.f7467o00oo0O.o00oOOo0(o00ooo002);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                o00oOo0O();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        void o00oOOo0(@oo0oO0 View view, @oooOO0 int i, @o0OO00OO ViewGroup viewGroup);
    }

    public o00oOOo0(@oo0oO0 Context context) {
        this.f7455o00oOOo0 = new o00oOOoO(context);
    }

    @o0OOo000
    public void o00oOOo0(@oooOO0 int i, @o0OO00OO ViewGroup viewGroup, @oo0oO0 o00oOoO o00oooo2) {
        if (o00oooo2 == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        o00oOo00 o00oOo002 = this.f7457o00oOo00.o00oOo00();
        o00oOo002.f7461o00oOOo0 = this;
        o00oOo002.f7463o00oOo00 = i;
        o00oOo002.f7462o00oOOoO = viewGroup;
        o00oOo002.f7464o00oOo0O = o00oooo2;
        this.f7457o00oOo00.o00oOOo0(o00oOo002);
    }
}
