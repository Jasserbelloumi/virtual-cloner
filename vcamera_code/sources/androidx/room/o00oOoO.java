package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.o00oOo00;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0O;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o00oOooo.oO00000;
import o0O0OO.o0O000;
import o0O0OO.o0O00O0o;
/* loaded from: classes.dex */
public class o00oOoO<T> extends LiveData<T> {

    /* renamed from: o00oo0  reason: collision with root package name */
    public final boolean f4854o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final o0O00O0o f4855o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOo00.AbstractC0046o00oOo00 f4856o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O000 f4857o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final Callable<T> f4858o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final AtomicBoolean f4859o00oo0Oo = new AtomicBoolean(true);

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final AtomicBoolean f4861o00oo0o0 = new AtomicBoolean(false);

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final AtomicBoolean f4860o00oo0o = new AtomicBoolean(false);

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Runnable f4862o00oo0oO = new o00oOOo0();

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Runnable f4863o0O0o = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        @oO0Oo
        public void run() {
            boolean z;
            if (o00oOoO.this.f4860o00oo0o.compareAndSet(false, true)) {
                o00oOoO.this.f4855o00oo00O.o00oOooo().o00oOOoO(o00oOoO.this.f4856o00oo0O);
            }
            do {
                if (o00oOoO.this.f4861o00oo0o0.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (o00oOoO.this.f4859o00oo0Oo.compareAndSet(true, false)) {
                        try {
                            try {
                                t = o00oOoO.this.f4858o00oo0OO.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            o00oOoO.this.f4861o00oo0o0.set(false);
                        }
                    }
                    if (z) {
                        o00oOoO.this.o00oo0OO(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (o00oOoO.this.f4859o00oo0Oo.get());
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        @o0O
        public void run() {
            boolean o00oOoO2 = o00oOoO.this.o00oOoO();
            if (o00oOoO.this.f4859o00oo0Oo.compareAndSet(false, true) && o00oOoO2) {
                o00oOoO.this.o00oo0o().execute(o00oOoO.this.f4862o00oo0oO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oOo00.AbstractC0046o00oOo00 {
        public o00oOo00(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.o00oOo00.AbstractC0046o00oOo00
        public void o00oOOoO(@oo0oO0 Set<String> set) {
            oO00000.o00oOoO().o00oOOoO(o00oOoO.this.f4863o0O0o);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public o00oOoO(o0O00O0o o0o00o0o, o0O000 o0o000, boolean z, Callable<T> callable, String[] strArr) {
        this.f4855o00oo00O = o0o00o0o;
        this.f4854o00oo0 = z;
        this.f4858o00oo0OO = callable;
        this.f4857o00oo0O0 = o0o000;
        this.f4856o00oo0O = new o00oOo00(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public void o00oo0() {
        this.f4857o00oo0O0.o00oOo00(this);
    }

    @Override // androidx.lifecycle.LiveData
    public void o00oo00O() {
        this.f4857o00oo0O0.o00oOOoO(this);
        o00oo0o().execute(this.f4862o00oo0oO);
    }

    public Executor o00oo0o() {
        return this.f4854o00oo0 ? this.f4855o00oo00O.o00oo0O0() : this.f4855o00oo00O.o00oo0();
    }
}
