package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import java.util.Iterator;
import java.util.Map;
import o00oOooo.oO00000;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f3230o00oOoo0 = -1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Object f3231o00oOooo = new Object();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f3232o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oo00O.o00oOOoO<o0OooO0<? super T>, LiveData<T>.o00oOo00> f3233o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f3234o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public volatile Object f3235o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public volatile Object f3236o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f3237o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f3238o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f3239o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final Runnable f3240o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f3241o00oOooO;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.o00oOo00 implements o0O00OOO {
        @o00oOooO.oo0oO0

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final o0O0O0O f3242o00oo0o;

        public LifecycleBoundObserver(@o00oOooO.oo0oO0 o0O0O0O o0o0o0o, o0OooO0<? super T> o0oooo0) {
            super(o0oooo0);
            this.f3242o00oo0o = o0o0o0o;
        }

        @Override // androidx.lifecycle.o0O00OOO
        public void o00oOOoO(@o00oOooO.oo0oO0 o0O0O0O o0o0o0o, @o00oOooO.oo0oO0 o0O00.o00oOOo0 o00oooo02) {
            o0O00.o00oOOoO o00oOOoO2 = this.f3242o00oo0o.getLifecycle().o00oOOoO();
            if (o00oOOoO2 == o0O00.o00oOOoO.DESTROYED) {
                LiveData.this.o00oo0O0(this.f3247o00oo0O0);
                return;
            }
            o0O00.o00oOOoO o00ooooo2 = null;
            while (o00ooooo2 != o00oOOoO2) {
                o00oOo00(o00oOoo0());
                o00ooooo2 = o00oOOoO2;
                o00oOOoO2 = this.f3242o00oo0o.getLifecycle().o00oOOoO();
            }
        }

        @Override // androidx.lifecycle.LiveData.o00oOo00
        public boolean o00oOo0O(o0O0O0O o0o0o0o) {
            return this.f3242o00oo0o == o0o0o0o;
        }

        @Override // androidx.lifecycle.LiveData.o00oOo00
        public boolean o00oOoo0() {
            return this.f3242o00oo0o.getLifecycle().o00oOOoO().isAtLeast(o0O00.o00oOOoO.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.o00oOo00
        public void o00oOooO() {
            this.f3242o00oo0o.getLifecycle().o00oOooO(this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3232o00oOOo0) {
                obj = LiveData.this.f3236o00oOo0o;
                LiveData.this.f3236o00oOo0o = LiveData.f3231o00oOooo;
            }
            LiveData.this.o00oo0Oo(obj);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends LiveData<T>.o00oOo00 {
        public o00oOOoO(o0OooO0<? super T> o0oooo0) {
            super(o0oooo0);
        }

        @Override // androidx.lifecycle.LiveData.o00oOo00
        public boolean o00oOoo0() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class o00oOo00 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f3246o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0OooO0<? super T> f3247o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f3248o00oo0Oo = -1;

        public o00oOo00(o0OooO0<? super T> o0oooo0) {
            this.f3247o00oo0O0 = o0oooo0;
        }

        public void o00oOo00(boolean z) {
            if (z == this.f3246o00oo0O) {
                return;
            }
            this.f3246o00oo0O = z;
            LiveData.this.o00oOo00(z ? 1 : -1);
            if (this.f3246o00oo0O) {
                LiveData.this.o00oOo0O(this);
            }
        }

        public boolean o00oOo0O(o0O0O0O o0o0o0o) {
            return false;
        }

        public abstract boolean o00oOoo0();

        public void o00oOooO() {
        }
    }

    public LiveData() {
        this.f3232o00oOOo0 = new Object();
        this.f3233o00oOOoO = new o00oo00O.o00oOOoO<>();
        this.f3234o00oOo00 = 0;
        Object obj = f3231o00oOooo;
        this.f3236o00oOo0o = obj;
        this.f3240o00oOoOo = new o00oOOo0();
        this.f3235o00oOo0O = obj;
        this.f3238o00oOoO0 = -1;
    }

    public LiveData(T t) {
        this.f3232o00oOOo0 = new Object();
        this.f3233o00oOOoO = new o00oo00O.o00oOOoO<>();
        this.f3234o00oOo00 = 0;
        this.f3236o00oOo0o = f3231o00oOooo;
        this.f3240o00oOoOo = new o00oOOo0();
        this.f3235o00oOo0O = t;
        this.f3238o00oOoO0 = 0;
    }

    public static void o00oOOoO(String str) {
        if (!oO00000.o00oOoO().o00oOo00()) {
            throw new IllegalStateException(android.support.v4.media.o00oOoO.o00oOOo0("Cannot invoke ", str, " on a background thread"));
        }
    }

    @o00oOooO.o0O
    public void o00oOo00(int i) {
        int i2 = this.f3234o00oOo00;
        this.f3234o00oOo00 = i + i2;
        if (this.f3241o00oOooO) {
            return;
        }
        this.f3241o00oOooO = true;
        while (true) {
            try {
                int i3 = this.f3234o00oOo00;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    o00oo00O();
                } else if (z2) {
                    o00oo0();
                }
                i2 = i3;
            } finally {
                this.f3241o00oOooO = false;
            }
        }
    }

    public void o00oOo0O(@o00oOooO.o0OO00OO LiveData<T>.o00oOo00 o00ooo002) {
        if (this.f3237o00oOoO) {
            this.f3239o00oOoOO = true;
            return;
        }
        this.f3237o00oOoO = true;
        do {
            this.f3239o00oOoOO = false;
            if (o00ooo002 == null) {
                o00oo00O.o00oOOoO<o0OooO0<? super T>, LiveData<T>.o00oOo00>.o00oOo0O o00oOo002 = this.f3233o00oOOoO.o00oOo00();
                while (o00oOo002.hasNext()) {
                    o00oOooO((o00oOo00) o00oOo002.next().getValue());
                    if (this.f3239o00oOoOO) {
                        break;
                    }
                }
            } else {
                o00oOooO(o00ooo002);
                o00ooo002 = null;
            }
        } while (this.f3239o00oOoOO);
        this.f3237o00oOoO = false;
    }

    @o00oOooO.o0OO00OO
    public T o00oOo0o() {
        T t = (T) this.f3235o00oOo0O;
        if (t != f3231o00oOooo) {
            return t;
        }
        return null;
    }

    public boolean o00oOoO() {
        return this.f3234o00oOo00 > 0;
    }

    public int o00oOoO0() {
        return this.f3238o00oOoO0;
    }

    public boolean o00oOoOO() {
        return this.f3233o00oOOoO.size() > 0;
    }

    public boolean o00oOoOo() {
        return this.f3235o00oOo0O != f3231o00oOooo;
    }

    @o00oOooO.o0O
    public void o00oOoo0(@o00oOooO.oo0oO0 o0O0O0O o0o0o0o, @o00oOooO.oo0oO0 o0OooO0<? super T> o0oooo0) {
        o00oOOoO("observe");
        if (o0o0o0o.getLifecycle().o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(o0o0o0o, o0oooo0);
        LiveData<T>.o00oOo00 o00oOo0o2 = this.f3233o00oOOoO.o00oOo0o(o0oooo0, lifecycleBoundObserver);
        if (o00oOo0o2 != null && !o00oOo0o2.o00oOo0O(o0o0o0o)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (o00oOo0o2 != null) {
            return;
        }
        o0o0o0o.getLifecycle().o00oOOo0(lifecycleBoundObserver);
    }

    public final void o00oOooO(LiveData<T>.o00oOo00 o00ooo002) {
        if (o00ooo002.f3246o00oo0O) {
            if (!o00ooo002.o00oOoo0()) {
                o00ooo002.o00oOo00(false);
                return;
            }
            int i = o00ooo002.f3248o00oo0Oo;
            int i2 = this.f3238o00oOoO0;
            if (i >= i2) {
                return;
            }
            o00ooo002.f3248o00oo0Oo = i2;
            o00ooo002.f3247o00oo0O0.onChanged((Object) this.f3235o00oOo0O);
        }
    }

    @o00oOooO.o0O
    public void o00oOooo(@o00oOooO.oo0oO0 o0OooO0<? super T> o0oooo0) {
        o00oOOoO("observeForever");
        o00oOOoO o00ooooo2 = new o00oOOoO(o0oooo0);
        LiveData<T>.o00oOo00 o00oOo0o2 = this.f3233o00oOOoO.o00oOo0o(o0oooo0, o00ooooo2);
        if (o00oOo0o2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (o00oOo0o2 != null) {
            return;
        }
        o00ooooo2.o00oOo00(true);
    }

    public void o00oo0() {
    }

    public void o00oo00O() {
    }

    @o00oOooO.o0O
    public void o00oo0O(@o00oOooO.oo0oO0 o0O0O0O o0o0o0o) {
        o00oOOoO("removeObservers");
        Iterator<Map.Entry<o0OooO0<? super T>, LiveData<T>.o00oOo00>> it = this.f3233o00oOOoO.iterator();
        while (it.hasNext()) {
            Map.Entry<o0OooO0<? super T>, LiveData<T>.o00oOo00> next = it.next();
            if (next.getValue().o00oOo0O(o0o0o0o)) {
                o00oo0O0(next.getKey());
            }
        }
    }

    @o00oOooO.o0O
    public void o00oo0O0(@o00oOooO.oo0oO0 o0OooO0<? super T> o0oooo0) {
        o00oOOoO("removeObserver");
        LiveData<T>.o00oOo00 o00oOoO02 = this.f3233o00oOOoO.o00oOoO0(o0oooo0);
        if (o00oOoO02 == null) {
            return;
        }
        o00oOoO02.o00oOooO();
        o00oOoO02.o00oOo00(false);
    }

    public void o00oo0OO(T t) {
        boolean z;
        synchronized (this.f3232o00oOOo0) {
            z = this.f3236o00oOo0o == f3231o00oOooo;
            this.f3236o00oOo0o = t;
        }
        if (z) {
            oO00000.o00oOoO().o00oOooO(this.f3240o00oOoOo);
        }
    }

    @o00oOooO.o0O
    public void o00oo0Oo(T t) {
        o00oOOoO("setValue");
        this.f3238o00oOoO0++;
        this.f3235o00oOo0O = t;
        o00oOo0O(null);
    }
}
