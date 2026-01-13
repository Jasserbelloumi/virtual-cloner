package o0O0O0O;

import android.os.Bundle;
import androidx.lifecycle.o0O0O0O;
import androidx.lifecycle.o0OO0oO;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0oO0O0o.o0O0O0Oo;
/* loaded from: classes.dex */
public abstract class o00oOOo0 {

    /* renamed from: o0O0O0O.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0144o00oOOo0<D> {
        @o0O
        @oo0oO0
        o0O0O0Oo<D> o00oOOo0(int i, @o0OO00OO Bundle bundle);

        @o0O
        void o00oOOoO(@oo0oO0 o0O0O0Oo<D> o0o0o0oo);

        @o0O
        void o00oOo00(@oo0oO0 o0O0O0Oo<D> o0o0o0oo, D d);
    }

    public static void o00oOo00(boolean z) {
        o00oOOoO.f11168o00oOooO = z;
    }

    @oo0oO0
    public static <T extends o0O0O0O & o0OO0oO> o00oOOo0 o00oOooO(@oo0oO0 T t) {
        return new o00oOOoO(t, t.getViewModelStore());
    }

    @o0O
    public abstract void o00oOOo0(int i);

    @Deprecated
    public abstract void o00oOOoO(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @o0OO00OO
    public abstract <D> o0O0O0Oo<D> o00oOo0O(int i);

    public boolean o00oOo0o() {
        return false;
    }

    public abstract void o00oOoO();

    @o0O
    @oo0oO0
    public abstract <D> o0O0O0Oo<D> o00oOoO0(int i, @o0OO00OO Bundle bundle, @oo0oO0 InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0);

    @o0O
    @oo0oO0
    public abstract <D> o0O0O0Oo<D> o00oOoOO(int i, @o0OO00OO Bundle bundle, @oo0oO0 InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0);
}
