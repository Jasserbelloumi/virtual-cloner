package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.o0O00;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o00oOooO.o0o0000;
import o00oOooo.oO00000;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
/* loaded from: classes.dex */
public class o0O0oo0o extends o0O00 {
    @NotNull

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final o00oOOo0 f3355o00oOoOo = new o00oOOo0(null);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f3356o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo00O.o00oOOo0<o0O00oO0, o00oOOoO> f3357o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final WeakReference<o0O0O0O> f3358o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f3359o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f3360o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f3361o00oOoO0;
    @NotNull

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public ArrayList<o0O00.o00oOOoO> f3362o00oOoOO;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O00.o00oOOoO f3363o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @o0OOOO0o.o00ooO0
        @o0o0000
        @NotNull
        public final o0O0oo0o o00oOOo0(@NotNull o0O0O0O o0o0o0o) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, "owner");
            return new o0O0oo0o(o0o0o0o, false);
        }

        @o0OOOO0o.o00ooO0
        @NotNull
        public final o0O00.o00oOOoO o00oOOoO(@NotNull o0O00.o00oOOoO o00ooooo2, @Nullable o0O00.o00oOOoO o00ooooo3) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state1");
            return (o00ooooo3 == null || o00ooooo3.compareTo(o00ooooo2) >= 0) ? o00ooooo2 : o00ooooo3;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O00.o00oOOoO f3364o00oOOo0;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0O00OOO f3365o00oOOoO;

        public o00oOOoO(@Nullable o0O00oO0 o0o00oo0, @NotNull o0O00.o00oOOoO o00ooooo2) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "initialState");
            o0OOOOO0.o0ooO.o00oo00O(o0o00oo0);
            this.f3365o00oOOoO = o0O0O0o0.o00oOo0o(o0o00oo0);
            this.f3364o00oOOo0 = o00ooooo2;
        }

        public final void o00oOOo0(@Nullable o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
            o0O00.o00oOOoO targetState = o00oooo02.getTargetState();
            this.f3364o00oOOo0 = o0O0oo0o.f3355o00oOoOo.o00oOOoO(this.f3364o00oOOo0, targetState);
            o0O00OOO o0o00ooo = this.f3365o00oOOoO;
            o0OOOOO0.o0ooO.o00oo00O(o0o0o0o);
            o0o00ooo.o00oOOoO(o0o0o0o, o00oooo02);
            this.f3364o00oOOo0 = targetState;
        }

        @NotNull
        public final o0O00OOO o00oOOoO() {
            return this.f3365o00oOOoO;
        }

        @NotNull
        public final o0O00.o00oOOoO o00oOo00() {
            return this.f3364o00oOOo0;
        }

        public final void o00oOo0O(@NotNull o0O00.o00oOOoO o00ooooo2) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "<set-?>");
            this.f3364o00oOOo0 = o00ooooo2;
        }

        public final void o00oOooO(@NotNull o0O00OOO o0o00ooo) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o00ooo, "<set-?>");
            this.f3365o00oOOoO = o0o00ooo;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(@NotNull o0O0O0O o0o0o0o) {
        this(o0o0o0o, true);
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, DatabaseFileArchive.COLUMN_PROVIDER);
    }

    public o0O0oo0o(o0O0O0O o0o0o0o, boolean z) {
        this.f3356o00oOOoO = z;
        this.f3357o00oOo00 = new o00oo00O.o00oOOo0<>();
        this.f3363o00oOooO = o0O00.o00oOOoO.INITIALIZED;
        this.f3362o00oOoOO = new ArrayList<>();
        this.f3358o00oOo0O = new WeakReference<>(o0o0o0o);
    }

    public /* synthetic */ o0O0oo0o(o0O0O0O o0o0o0o, boolean z, o0OOOOO0.o0O00 o0o00) {
        this(o0o0o0o, z);
    }

    @o0OOOO0o.o00ooO0
    @o0o0000
    @NotNull
    public static final o0O0oo0o o00oOoO(@NotNull o0O0O0O o0o0o0o) {
        return f3355o00oOoOo.o00oOOo0(o0o0o0o);
    }

    @o0OOOO0o.o00ooO0
    @NotNull
    public static final o0O00.o00oOOoO o00oo0OO(@NotNull o0O00.o00oOOoO o00ooooo2, @Nullable o0O00.o00oOOoO o00ooooo3) {
        return f3355o00oOoOo.o00oOOoO(o00ooooo2, o00ooooo3);
    }

    @Override // androidx.lifecycle.o0O00
    public void o00oOOo0(@NotNull o0O00oO0 o0o00oo0) {
        o0O0O0O o0o0o0o;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo0, "observer");
        o00oOoOO("addObserver");
        o0O00.o00oOOoO o00ooooo2 = this.f3363o00oOooO;
        o0O00.o00oOOoO o00ooooo3 = o0O00.o00oOOoO.DESTROYED;
        if (o00ooooo2 != o00ooooo3) {
            o00ooooo3 = o0O00.o00oOOoO.INITIALIZED;
        }
        o00oOOoO o00ooooo4 = new o00oOOoO(o0o00oo0, o00ooooo3);
        if (this.f3357o00oOo00.o00oOo0o(o0o00oo0, o00ooooo4) == null && (o0o0o0o = this.f3358o00oOo0O.get()) != null) {
            boolean z = this.f3359o00oOo0o != 0 || this.f3361o00oOoO0;
            o0O00.o00oOOoO o00oOoO02 = o00oOoO0(o0o00oo0);
            this.f3359o00oOo0o++;
            while (o00ooooo4.f3364o00oOOo0.compareTo(o00oOoO02) < 0 && this.f3357o00oOo00.contains(o0o00oo0)) {
                o00oo0Oo(o00ooooo4.f3364o00oOOo0);
                o0O00.o00oOOo0 o00oOo002 = o0O00.o00oOOo0.Companion.o00oOo00(o00ooooo4.f3364o00oOOo0);
                if (o00oOo002 == null) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("no event up from ");
                    o00oOOo02.append(o00ooooo4.f3364o00oOOo0);
                    throw new IllegalStateException(o00oOOo02.toString());
                }
                o00ooooo4.o00oOOo0(o0o0o0o, o00oOo002);
                o00oo0O();
                o00oOoO02 = o00oOoO0(o0o00oo0);
            }
            if (!z) {
                o00oo0o();
            }
            this.f3359o00oOo0o--;
        }
    }

    @Override // androidx.lifecycle.o0O00
    @NotNull
    public o0O00.o00oOOoO o00oOOoO() {
        return this.f3363o00oOooO;
    }

    public final void o00oOo0o(o0O0O0O o0o0o0o) {
        Iterator<Map.Entry<o0O00oO0, o00oOOoO>> descendingIterator = this.f3357o00oOo00.descendingIterator();
        o0OOOOO0.o0ooO.o00oo0OO(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3360o00oOoO) {
            Map.Entry<o0O00oO0, o00oOOoO> next = descendingIterator.next();
            o0OOOOO0.o0ooO.o00oo0OO(next, "next()");
            o0O00oO0 key = next.getKey();
            o00oOOoO value = next.getValue();
            while (value.f3364o00oOOo0.compareTo(this.f3363o00oOooO) > 0 && !this.f3360o00oOoO && this.f3357o00oOo00.contains(key)) {
                o0O00.o00oOOo0 o00oOOo02 = o0O00.o00oOOo0.Companion.o00oOOo0(value.f3364o00oOOo0);
                if (o00oOOo02 == null) {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("no event down from ");
                    o00oOOo03.append(value.f3364o00oOOo0);
                    throw new IllegalStateException(o00oOOo03.toString());
                }
                o00oo0Oo(o00oOOo02.getTargetState());
                value.o00oOOo0(o0o0o0o, o00oOOo02);
                o00oo0O();
            }
        }
    }

    public final o0O00.o00oOOoO o00oOoO0(o0O00oO0 o0o00oo0) {
        o00oOOoO value;
        Map.Entry<o0O00oO0, o00oOOoO> o00oOoO2 = this.f3357o00oOo00.o00oOoO(o0o00oo0);
        o0O00.o00oOOoO o00ooooo2 = null;
        o0O00.o00oOOoO o00ooooo3 = (o00oOoO2 == null || (value = o00oOoO2.getValue()) == null) ? null : value.f3364o00oOOo0;
        if (!this.f3362o00oOoOO.isEmpty()) {
            ArrayList<o0O00.o00oOOoO> arrayList = this.f3362o00oOoOO;
            o00ooooo2 = arrayList.get(arrayList.size() - 1);
        }
        o00oOOo0 o00oooo02 = f3355o00oOoOo;
        return o00oooo02.o00oOOoO(o00oooo02.o00oOOoO(this.f3363o00oOooO, o00ooooo3), o00ooooo2);
    }

    @SuppressLint({"RestrictedApi"})
    public final void o00oOoOO(String str) {
        if (this.f3356o00oOOoO && !oO00000.o00oOoO().o00oOo00()) {
            throw new IllegalStateException(android.support.v4.media.o00oOoO.o00oOOo0("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void o00oOoOo(o0O0O0O o0o0o0o) {
        o00oo00O.o00oOOoO<o0O00oO0, o00oOOoO>.o00oOo0O o00oOo002 = this.f3357o00oOo00.o00oOo00();
        o0OOOOO0.o0ooO.o00oo0OO(o00oOo002, "observerMap.iteratorWithAdditions()");
        while (o00oOo002.hasNext() && !this.f3360o00oOoO) {
            Map.Entry next = o00oOo002.next();
            o0O00oO0 o0o00oo0 = (o0O00oO0) next.getKey();
            o00oOOoO o00ooooo2 = (o00oOOoO) next.getValue();
            while (o00ooooo2.f3364o00oOOo0.compareTo(this.f3363o00oOooO) < 0 && !this.f3360o00oOoO && this.f3357o00oOo00.contains(o0o00oo0)) {
                o00oo0Oo(o00ooooo2.f3364o00oOOo0);
                o0O00.o00oOOo0 o00oOo003 = o0O00.o00oOOo0.Companion.o00oOo00(o00ooooo2.f3364o00oOOo0);
                if (o00oOo003 == null) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("no event up from ");
                    o00oOOo02.append(o00ooooo2.f3364o00oOOo0);
                    throw new IllegalStateException(o00oOOo02.toString());
                }
                o00ooooo2.o00oOOo0(o0o0o0o, o00oOo003);
                o00oo0O();
            }
        }
    }

    public int o00oOoo0() {
        o00oOoOO("getObserverCount");
        return this.f3357o00oOo00.size();
    }

    @Override // androidx.lifecycle.o0O00
    public void o00oOooO(@NotNull o0O00oO0 o0o00oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00oo0, "observer");
        o00oOoOO("removeObserver");
        this.f3357o00oOo00.o00oOoO0(o0o00oo0);
    }

    public void o00oOooo(@NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        o00oOoOO("handleLifecycleEvent");
        o00oo0O0(o00oooo02.getTargetState());
    }

    @o00oOooO.o0O
    @o0OO0o.o0O0o(message = "Override [currentState].")
    public void o00oo0(@NotNull o0O00.o00oOOoO o00ooooo2) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
        o00oOoOO("markState");
        o00oo0o0(o00ooooo2);
    }

    public final boolean o00oo00O() {
        if (this.f3357o00oOo00.size() == 0) {
            return true;
        }
        Map.Entry<o0O00oO0, o00oOOoO> o00oOOo02 = this.f3357o00oOo00.o00oOOo0();
        o0OOOOO0.o0ooO.o00oo00O(o00oOOo02);
        o0O00.o00oOOoO o00ooooo2 = o00oOOo02.getValue().f3364o00oOOo0;
        Map.Entry<o0O00oO0, o00oOOoO> o00oOooO2 = this.f3357o00oOo00.o00oOooO();
        o0OOOOO0.o0ooO.o00oo00O(o00oOooO2);
        o0O00.o00oOOoO o00ooooo3 = o00oOooO2.getValue().f3364o00oOOo0;
        return o00ooooo2 == o00ooooo3 && this.f3363o00oOooO == o00ooooo3;
    }

    public final void o00oo0O() {
        ArrayList<o0O00.o00oOOoO> arrayList = this.f3362o00oOoOO;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void o00oo0O0(o0O00.o00oOOoO o00ooooo2) {
        o0O00.o00oOOoO o00ooooo3 = this.f3363o00oOooO;
        if (o00ooooo3 == o00ooooo2) {
            return;
        }
        if (!((o00ooooo3 == o0O00.o00oOOoO.INITIALIZED && o00ooooo2 == o0O00.o00oOOoO.DESTROYED) ? false : true)) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("no event down from ");
            o00oOOo02.append(this.f3363o00oOooO);
            o00oOOo02.append(" in component ");
            o00oOOo02.append(this.f3358o00oOo0O.get());
            throw new IllegalStateException(o00oOOo02.toString().toString());
        }
        this.f3363o00oOooO = o00ooooo2;
        if (this.f3361o00oOoO0 || this.f3359o00oOo0o != 0) {
            this.f3360o00oOoO = true;
            return;
        }
        this.f3361o00oOoO0 = true;
        o00oo0o();
        this.f3361o00oOoO0 = false;
        if (this.f3363o00oOooO == o0O00.o00oOOoO.DESTROYED) {
            this.f3357o00oOo00 = new o00oo00O.o00oOOo0<>();
        }
    }

    public final void o00oo0Oo(o0O00.o00oOOoO o00ooooo2) {
        this.f3362o00oOoOO.add(o00ooooo2);
    }

    public final void o00oo0o() {
        o0O0O0O o0o0o0o = this.f3358o00oOo0O.get();
        if (o0o0o0o == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean o00oo00O2 = o00oo00O();
            this.f3360o00oOoO = false;
            if (o00oo00O2) {
                return;
            }
            o0O00.o00oOOoO o00ooooo2 = this.f3363o00oOooO;
            Map.Entry<o0O00oO0, o00oOOoO> o00oOOo02 = this.f3357o00oOo00.o00oOOo0();
            o0OOOOO0.o0ooO.o00oo00O(o00oOOo02);
            if (o00ooooo2.compareTo(o00oOOo02.getValue().f3364o00oOOo0) < 0) {
                o00oOo0o(o0o0o0o);
            }
            Map.Entry<o0O00oO0, o00oOOoO> o00oOooO2 = this.f3357o00oOo00.o00oOooO();
            if (!this.f3360o00oOoO && o00oOooO2 != null && this.f3363o00oOooO.compareTo(o00oOooO2.getValue().f3364o00oOOo0) > 0) {
                o00oOoOo(o0o0o0o);
            }
        }
    }

    public void o00oo0o0(@NotNull o0O00.o00oOOoO o00ooooo2) {
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "state");
        o00oOoOO("setCurrentState");
        o00oo0O0(o00ooooo2);
    }
}
