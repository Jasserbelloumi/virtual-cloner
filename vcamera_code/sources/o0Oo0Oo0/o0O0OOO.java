package o0Oo0Oo0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0OO000;
/* loaded from: classes3.dex */
public final class o0O0OOO {
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Runnable f15866o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public ExecutorService f15870o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f15864o00oOOo0 = 64;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f15865o00oOOoO = 5;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Deque<o0OO000.o00oOOo0> f15867o00oOo0O = new ArrayDeque();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Deque<o0OO000.o00oOOo0> f15868o00oOo0o = new ArrayDeque();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Deque<o0OO000> f15869o00oOoO0 = new ArrayDeque();

    public o0O0OOO() {
    }

    public o0O0OOO(ExecutorService executorService) {
        this.f15870o00oOooO = executorService;
    }

    public synchronized void o00oOOo0() {
        for (o0OO000.o00oOOo0 o00oooo02 : this.f15867o00oOo0O) {
            o0OO000.this.cancel();
        }
        for (o0OO000.o00oOOo0 o00oooo03 : this.f15868o00oOo0o) {
            o0OO000.this.cancel();
        }
        for (o0OO000 o0oo000 : this.f15869o00oOoO0) {
            o0oo000.cancel();
        }
    }

    public synchronized void o00oOOoO(o0OO000.o00oOOo0 o00oooo02) {
        if (this.f15868o00oOo0o.size() >= this.f15864o00oOOo0 || o00oo0OO(o00oooo02) >= this.f15865o00oOOoO) {
            this.f15867o00oOo0O.add(o00oooo02);
        } else {
            this.f15868o00oOo0o.add(o00oooo02);
            o00oOooO().execute(o00oooo02);
        }
    }

    public synchronized void o00oOo00(o0OO000 o0oo000) {
        this.f15869o00oOoO0.add(o0oo000);
    }

    public final <T> void o00oOo0O(Deque<T> deque, T t, boolean z) {
        int o00oo02;
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                o00oOoOo();
            }
            o00oo02 = o00oo0();
            runnable = this.f15866o00oOo00;
        }
        if (o00oo02 != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void o00oOo0o(o0OO000.o00oOOo0 o00oooo02) {
        o00oOo0O(this.f15868o00oOo0o, o00oooo02, true);
    }

    public synchronized int o00oOoO() {
        return this.f15864o00oOOo0;
    }

    public void o00oOoO0(o0OO000 o0oo000) {
        o00oOo0O(this.f15869o00oOoO0, o0oo000, false);
    }

    public synchronized int o00oOoOO() {
        return this.f15865o00oOOoO;
    }

    public final void o00oOoOo() {
        if (this.f15868o00oOo0o.size() < this.f15864o00oOOo0 && !this.f15867o00oOo0O.isEmpty()) {
            Iterator<o0OO000.o00oOOo0> it = this.f15867o00oOo0O.iterator();
            while (it.hasNext()) {
                o0OO000.o00oOOo0 next = it.next();
                if (o00oo0OO(next) < this.f15865o00oOOoO) {
                    it.remove();
                    this.f15868o00oOo0o.add(next);
                    o00oOooO().execute(next);
                }
                if (this.f15868o00oOo0o.size() >= this.f15864o00oOOo0) {
                    return;
                }
            }
        }
    }

    public synchronized List<o0O00o00> o00oOoo0() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (o0OO000.o00oOOo0 o00oooo02 : this.f15867o00oOo0O) {
            arrayList.add(o0OO000.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized ExecutorService o00oOooO() {
        if (this.f15870o00oOooO == null) {
            this.f15870o00oOooO = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), oO0000O.o00ooO0("OkHttp Dispatcher", false));
        }
        return this.f15870o00oOooO;
    }

    public synchronized int o00oOooo() {
        return this.f15867o00oOo0O.size();
    }

    public synchronized int o00oo0() {
        return this.f15868o00oOo0o.size() + this.f15869o00oOoO0.size();
    }

    public synchronized List<o0O00o00> o00oo00O() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f15869o00oOoO0);
        for (o0OO000.o00oOOo0 o00oooo02 : this.f15868o00oOo0o) {
            arrayList.add(o0OO000.this);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized void o00oo0O(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        this.f15864o00oOOo0 = i;
        o00oOoOo();
    }

    public synchronized void o00oo0O0(@Nullable Runnable runnable) {
        this.f15866o00oOo00 = runnable;
    }

    public final int o00oo0OO(o0OO000.o00oOOo0 o00oooo02) {
        int i = 0;
        for (o0OO000.o00oOOo0 o00oooo03 : this.f15868o00oOo0o) {
            if (o00oooo03.o00oo0().equals(o00oooo02.o00oo0())) {
                i++;
            }
        }
        return i;
    }

    public synchronized void o00oo0Oo(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("max < 1: " + i);
        }
        this.f15865o00oOOoO = i;
        o00oOoOo();
    }
}
