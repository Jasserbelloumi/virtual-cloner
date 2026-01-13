package o0ooO0O0;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import multispace.multiapp.clone.app.App;
/* loaded from: classes3.dex */
public class oO0Oo0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Toast f17129o00oOOo0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ String f17130o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Context f17131o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f17132o00oo0Oo;

        public o00oOOo0(Context context, String str, int i) {
            this.f17131o00oo0O0 = context;
            this.f17130o00oo0O = str;
            this.f17132o00oo0Oo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0Oo0o0.o00oOoOo(this.f17131o00oo0O0, this.f17130o00oo0O, this.f17132o00oo0Oo);
        }
    }

    public static void o00oOOoO(int i) {
        o00oOooO(App.o00oOOoO(), i);
    }

    public static void o00oOo00(int i, int i2) {
        o00oOo0O(App.o00oOOoO(), i, i2);
    }

    public static void o00oOo0O(Context context, int i, int i2) {
        o00oOoO0(context, context.getString(i), i2);
    }

    public static void o00oOo0o(Context context, String str) {
        o00oOoO0(context, str, 1);
    }

    public static void o00oOoO(String str) {
        o00oOoO0(App.o00oOOoO(), str, 1);
    }

    public static void o00oOoO0(Context context, String str, int i) {
        if (context == null) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            oO0O00oO.o00oOOo0(new o00oOOo0(context, str, i));
        } else {
            o00oOoOo(context, str, i);
        }
    }

    public static void o00oOoOO(String str, int i) {
        o00oOoO0(App.o00oOOoO(), str, i);
    }

    public static void o00oOoOo(Context context, String str, int i) {
        try {
            if (f17129o00oOOo0 == null) {
                Toast toast = new Toast(context);
                f17129o00oOOo0 = toast;
                toast.setGravity(16, 0, 0);
                f17129o00oOOo0.setDuration(i);
            }
            f17129o00oOOo0.setText(str);
            f17129o00oOOo0.show();
        } catch (Throwable th) {
            Toast.makeText(context, str, i).show();
            th.printStackTrace();
        }
    }

    public static void o00oOooO(Context context, int i) {
        o00oOoO0(context, context.getString(i), 1);
    }
}
