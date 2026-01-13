package o0O0O0O;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.o00ooO;
import androidx.lifecycle.o0O0O0O;
import androidx.lifecycle.o0O0OOOo;
import androidx.lifecycle.o0OO0;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO0;
import androidx.lifecycle.o0OooO0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import o00oOoOo.o00oo;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0O0O.o00oOOo0;
import o0oO0O0o.o0O0O0Oo;
import o0ooOoOO.oO0000Oo;
/* loaded from: classes.dex */
public class o00oOOoO extends o0O0O0O.o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f11167o00oOo00 = "LoaderManager";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static boolean f11168o00oOooO;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0O0O f11169o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOo00 f11170o00oOOoO;

    /* loaded from: classes.dex */
    public static class o00oOOo0<D> extends o0O0OOOo<D> implements o0O0O0Oo.o00oOo00<D> {
        @o0OO00OO

        /* renamed from: o00oo0  reason: collision with root package name */
        public final Bundle f11171o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public final int f11172o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public C0145o00oOOoO<D> f11173o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o0O0O0O f11174o00oo0O0;
        @oo0oO0

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public final o0O0O0Oo<D> f11175o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public o0O0O0Oo<D> f11176o00oo0Oo;

        public o00oOOo0(int i, @o0OO00OO Bundle bundle, @oo0oO0 o0O0O0Oo<D> o0o0o0oo, @o0OO00OO o0O0O0Oo<D> o0o0o0oo2) {
            this.f11172o00oo00O = i;
            this.f11171o00oo0 = bundle;
            this.f11175o00oo0OO = o0o0o0oo;
            this.f11176o00oo0Oo = o0o0o0oo2;
            o0o0o0oo.o00oo0oO(i, this);
        }

        @Override // o0oO0O0o.o0O0O0Oo.o00oOo00
        public void o00oOOo0(@oo0oO0 o0O0O0Oo<D> o0o0o0oo, @o0OO00OO D d) {
            if (o00oOOoO.f11168o00oOooO) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o00oo0Oo(d);
                return;
            }
            boolean z = o00oOOoO.f11168o00oOooO;
            o00oo0OO(d);
        }

        public void o00oo() {
            o0O0O0O o0o0o0o = this.f11174o00oo0O0;
            C0145o00oOOoO<D> c0145o00oOOoO = this.f11173o00oo0O;
            if (o0o0o0o == null || c0145o00oOOoO == null) {
                return;
            }
            super.o00oo0O0(c0145o00oOOoO);
            o00oOoo0(o0o0o0o, c0145o00oOOoO);
        }

        @Override // androidx.lifecycle.LiveData
        public void o00oo0() {
            if (o00oOOoO.f11168o00oOooO) {
                toString();
            }
            this.f11175o00oo0OO.o00ooO0O();
        }

        @Override // androidx.lifecycle.LiveData
        public void o00oo00O() {
            if (o00oOOoO.f11168o00oOooO) {
                toString();
            }
            this.f11175o00oo0OO.o00ooO0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void o00oo0O0(@oo0oO0 o0OooO0<? super D> o0oooo0) {
            super.o00oo0O0(o0oooo0);
            this.f11174o00oo0O0 = null;
            this.f11173o00oo0O = null;
        }

        @Override // androidx.lifecycle.o0O0OOOo, androidx.lifecycle.LiveData
        public void o00oo0Oo(D d) {
            super.o00oo0Oo(d);
            o0O0O0Oo<D> o0o0o0oo = this.f11176o00oo0Oo;
            if (o0o0o0oo != null) {
                o0o0o0oo.o00oo();
                this.f11176o00oo0Oo = null;
            }
        }

        public void o00oo0o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f11172o00oo00O);
            printWriter.print(" mArgs=");
            printWriter.println(this.f11171o00oo0);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f11175o00oo0OO);
            this.f11175o00oo0OO.o00oOoO0(o00oo.o00oOOo0(str, "  "), fileDescriptor, printWriter, strArr);
            if (this.f11173o00oo0O != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f11173o00oo0O);
                C0145o00oOOoO<D> c0145o00oOOoO = this.f11173o00oo0O;
                c0145o00oOOoO.o00oOOo0(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(o00oo0oO().o00oOooO(o00oOo0o()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(o00oOoO());
        }

        @o0O
        public o0O0O0Oo<D> o00oo0o0(boolean z) {
            if (o00oOOoO.f11168o00oOooO) {
                toString();
            }
            this.f11175o00oo0OO.o00oOOoO();
            this.f11175o00oo0OO.o00oOOo0();
            C0145o00oOOoO<D> c0145o00oOOoO = this.f11173o00oo0O;
            if (c0145o00oOOoO != null) {
                o00oo0O0(c0145o00oOOoO);
                if (z) {
                    c0145o00oOOoO.o00oOo00();
                }
            }
            this.f11175o00oo0OO.o00ooO(this);
            if ((c0145o00oOOoO == null || c0145o00oOOoO.o00oOOoO()) && !z) {
                return this.f11175o00oo0OO;
            }
            this.f11175o00oo0OO.o00oo();
            return this.f11176o00oo0Oo;
        }

        @oo0oO0
        public o0O0O0Oo<D> o00oo0oO() {
            return this.f11175o00oo0OO;
        }

        @o0O
        @oo0oO0
        public o0O0O0Oo<D> o00ooO00(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o00oOOo0.InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0) {
            C0145o00oOOoO<D> c0145o00oOOoO = new C0145o00oOOoO<>(this.f11175o00oo0OO, interfaceC0144o00oOOo0);
            o00oOoo0(o0o0o0o, c0145o00oOOoO);
            C0145o00oOOoO<D> c0145o00oOOoO2 = this.f11173o00oo0O;
            if (c0145o00oOOoO2 != null) {
                o00oo0O0(c0145o00oOOoO2);
            }
            this.f11174o00oo0O0 = o0o0o0o;
            this.f11173o00oo0O = c0145o00oOOoO;
            return this.f11175o00oo0OO;
        }

        public boolean o0O0o() {
            C0145o00oOOoO<D> c0145o00oOOoO;
            return (!o00oOoO() || (c0145o00oOOoO = this.f11173o00oo0O) == null || c0145o00oOOoO.o00oOOoO()) ? false : true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f11172o00oo00O);
            sb.append(" : ");
            oO0000Oo.o00oOOo0(this.f11175o00oo0OO, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: o0O0O0O.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0145o00oOOoO<D> implements o0OooO0<D> {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0O0Oo<D> f11177o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOo0.InterfaceC0144o00oOOo0<D> f11178o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f11179o00oOo00 = false;

        public C0145o00oOOoO(@oo0oO0 o0O0O0Oo<D> o0o0o0oo, @oo0oO0 o00oOOo0.InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0) {
            this.f11177o00oOOo0 = o0o0o0oo;
            this.f11178o00oOOoO = interfaceC0144o00oOOo0;
        }

        public void o00oOOo0(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f11179o00oOo00);
        }

        public boolean o00oOOoO() {
            return this.f11179o00oOo00;
        }

        @o0O
        public void o00oOo00() {
            if (this.f11179o00oOo00) {
                if (o00oOOoO.f11168o00oOooO) {
                    Objects.toString(this.f11177o00oOOo0);
                }
                this.f11178o00oOOoO.o00oOOoO(this.f11177o00oOOo0);
            }
        }

        @Override // androidx.lifecycle.o0OooO0
        public void onChanged(@o0OO00OO D d) {
            if (o00oOOoO.f11168o00oOooO) {
                Objects.toString(this.f11177o00oOOo0);
                this.f11177o00oOOo0.o00oOooO(d);
            }
            this.f11178o00oOOoO.o00oOo00(this.f11177o00oOOo0, d);
            this.f11179o00oOo00 = true;
        }

        public String toString() {
            return this.f11178o00oOOoO.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o0OO0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o0OO0o00.o00oOOoO f11180o00oOo00 = new o00oOOo0();

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00ooO<o00oOOo0> f11181o00oOOo0 = new o00ooO<>();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f11182o00oOOoO = false;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0OO0o00.o00oOOoO {
            @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
            @oo0oO0
            public <T extends o0OO0> T o00oOo00(@oo0oO0 Class<T> cls) {
                return new o00oOo00();
            }
        }

        @oo0oO0
        public static o00oOo00 o00oOo00(o0OO0oO0 o0oo0oo0) {
            return (o00oOo00) new o0OO0o00(o0oo0oo0, f11180o00oOo00).o00oOOo0(o00oOo00.class);
        }

        public void o00oOOo0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f11181o00oOOo0.o00ooO() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f11181o00oOOo0.o00ooO(); i++) {
                    o00oOOo0 o00ooOO02 = this.f11181o00oOOo0.o00ooOO0(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f11181o00oOOo0.o00oo0O(i));
                    printWriter.print(": ");
                    printWriter.println(o00ooOO02.toString());
                    o00ooOO02.o00oo0o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void o00oOOoO() {
            this.f11182o00oOOoO = false;
        }

        public boolean o00oOo0O() {
            int o00ooO2 = this.f11181o00oOOo0.o00ooO();
            for (int i = 0; i < o00ooO2; i++) {
                if (this.f11181o00oOOo0.o00ooOO0(i).o0O0o()) {
                    return true;
                }
            }
            return false;
        }

        public boolean o00oOo0o() {
            return this.f11182o00oOOoO;
        }

        public void o00oOoO(int i, @oo0oO0 o00oOOo0 o00oooo02) {
            this.f11181o00oOOo0.o00oo0Oo(i, o00oooo02);
        }

        public void o00oOoO0() {
            int o00ooO2 = this.f11181o00oOOo0.o00ooO();
            for (int i = 0; i < o00ooO2; i++) {
                this.f11181o00oOOo0.o00ooOO0(i).o00oo();
            }
        }

        public void o00oOoOO(int i) {
            this.f11181o00oOOo0.o00oo0oO(i);
        }

        public void o00oOoOo() {
            this.f11182o00oOOoO = true;
        }

        public <D> o00oOOo0<D> o00oOooO(int i) {
            return this.f11181o00oOOo0.o00oOooo(i);
        }

        @Override // androidx.lifecycle.o0OO0
        public void onCleared() {
            super.onCleared();
            int o00ooO2 = this.f11181o00oOOo0.o00ooO();
            for (int i = 0; i < o00ooO2; i++) {
                this.f11181o00oOOo0.o00ooOO0(i).o00oo0o0(true);
            }
            this.f11181o00oOOo0.o00oOo00();
        }
    }

    public o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0OO0oO0 o0oo0oo0) {
        this.f11169o00oOOo0 = o0o0o0o;
        this.f11170o00oOOoO = o00oOo00.o00oOo00(o0oo0oo0);
    }

    @Override // o0O0O0O.o00oOOo0
    @o0O
    public void o00oOOo0(int i) {
        if (this.f11170o00oOOoO.o00oOo0o()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f11168o00oOooO) {
            toString();
        }
        o00oOOo0 o00oOooO2 = this.f11170o00oOOoO.o00oOooO(i);
        if (o00oOooO2 != null) {
            o00oOooO2.o00oo0o0(true);
            this.f11170o00oOOoO.o00oOoOO(i);
        }
    }

    @Override // o0O0O0O.o00oOOo0
    @Deprecated
    public void o00oOOoO(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f11170o00oOOoO.o00oOOo0(str, fileDescriptor, printWriter, strArr);
    }

    @Override // o0O0O0O.o00oOOo0
    @o0OO00OO
    public <D> o0O0O0Oo<D> o00oOo0O(int i) {
        if (this.f11170o00oOOoO.o00oOo0o()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        o00oOOo0<D> o00oOooO2 = this.f11170o00oOOoO.o00oOooO(i);
        if (o00oOooO2 != null) {
            return o00oOooO2.o00oo0oO();
        }
        return null;
    }

    @Override // o0O0O0O.o00oOOo0
    public boolean o00oOo0o() {
        return this.f11170o00oOOoO.o00oOo0O();
    }

    @Override // o0O0O0O.o00oOOo0
    public void o00oOoO() {
        this.f11170o00oOOoO.o00oOoO0();
    }

    @Override // o0O0O0O.o00oOOo0
    @o0O
    @oo0oO0
    public <D> o0O0O0Oo<D> o00oOoO0(int i, @o0OO00OO Bundle bundle, @oo0oO0 o00oOOo0.InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0) {
        if (this.f11170o00oOOoO.o00oOo0o()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            o00oOOo0<D> o00oOooO2 = this.f11170o00oOOoO.o00oOooO(i);
            if (f11168o00oOooO) {
                toString();
                Objects.toString(bundle);
            }
            if (o00oOooO2 == null) {
                return o00oOoOo(i, bundle, interfaceC0144o00oOOo0, null);
            }
            if (f11168o00oOooO) {
                o00oOooO2.toString();
            }
            return o00oOooO2.o00ooO00(this.f11169o00oOOo0, interfaceC0144o00oOOo0);
        }
        throw new IllegalStateException("initLoader must be called on the main thread");
    }

    @Override // o0O0O0O.o00oOOo0
    @o0O
    @oo0oO0
    public <D> o0O0O0Oo<D> o00oOoOO(int i, @o0OO00OO Bundle bundle, @oo0oO0 o00oOOo0.InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0) {
        if (this.f11170o00oOOoO.o00oOo0o()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f11168o00oOooO) {
                toString();
                Objects.toString(bundle);
            }
            o00oOOo0<D> o00oOooO2 = this.f11170o00oOOoO.o00oOooO(i);
            return o00oOoOo(i, bundle, interfaceC0144o00oOOo0, o00oOooO2 != null ? o00oOooO2.o00oo0o0(false) : null);
        }
        throw new IllegalStateException("restartLoader must be called on the main thread");
    }

    @o0O
    @oo0oO0
    public final <D> o0O0O0Oo<D> o00oOoOo(int i, @o0OO00OO Bundle bundle, @oo0oO0 o00oOOo0.InterfaceC0144o00oOOo0<D> interfaceC0144o00oOOo0, @o0OO00OO o0O0O0Oo<D> o0o0o0oo) {
        try {
            this.f11170o00oOOoO.o00oOoOo();
            o0O0O0Oo<D> o00oOOo02 = interfaceC0144o00oOOo0.o00oOOo0(i, bundle);
            if (o00oOOo02 != null) {
                if (o00oOOo02.getClass().isMemberClass() && !Modifier.isStatic(o00oOOo02.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + o00oOOo02);
                }
                o00oOOo0 o00oooo02 = new o00oOOo0(i, bundle, o00oOOo02, o0o0o0oo);
                if (f11168o00oOooO) {
                    o00oooo02.toString();
                }
                this.f11170o00oOOoO.o00oOoO(i, o00oooo02);
                this.f11170o00oOOoO.o00oOOoO();
                return o00oooo02.o00ooO00(this.f11169o00oOOo0, interfaceC0144o00oOOo0);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f11170o00oOOoO.o00oOOoO();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        oO0000Oo.o00oOOo0(this.f11169o00oOOo0, sb);
        sb.append("}}");
        return sb.toString();
    }
}
