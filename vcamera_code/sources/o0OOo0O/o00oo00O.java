package o0OOo0O;

import androidx.lifecycle.o0O;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0OoO00O;
import o0OO0o.oO0Ooooo;
import o0OOOOO.o00oo0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOo0o0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003#\u001f\u001bB\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001b\u0010\u0014\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006("}, d2 = {"Lo0OOo0O/o00oo00O;", "", "K", "V", "Lo0OO0oO/o00oo0;", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "Lo0OO0o/oO0Ooooo;", "clear", "()V", "o00oOoo0", "o00oOoOO", "o00oOoOo", "Lo0OOo0O/o0;", "w", "o00oOoO", "(Lo0OOo0O/o0;)V", "Ljava/lang/ref/ReferenceQueue;", "o00oo0O0", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "o00oOo00", "()I", "size", "", o0OO000o.o00oOOoO.f12961o00oOo00, "()Ljava/util/Set;", o0O.f3318o00oOoO, "", "o00oOOo0", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00oo00O<K, V> extends o0OO0oO.o00oo0<K, V> {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14168o00oo0O = AtomicIntegerFieldUpdater.newUpdater(o00oo00O.class, "_size");
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    public volatile /* synthetic */ Object core;
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ReferenceQueue<K> f14169o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\u0004\b\u0002\u0010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006%"}, d2 = {"Lo0OOo0O/o00oo00O$o00oOOo0;", "", "key", "o00oOo00", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lo0OOo0O/o0;", "weakKey0", "o00oOo0o", "(Ljava/lang/Object;Ljava/lang/Object;Lo0OOo0O/o0;)Ljava/lang/Object;", "Lo0OOo0O/o00oo00O;", "o00oOoO", "()Lo0OOo0O/o00oo00O$o00oOOo0;", "weakRef", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0O/o0;)V", "E", "Lkotlin/Function2;", "factory", "", "o00oOo0O", "(Lo0OOOO/o0O00000;)Ljava/util/Iterator;", "", "hash", "o00oOooO", "(I)I", FirebaseAnalytics.Param.INDEX, "o00oOoOO", "(I)V", "o00oOOo0", "I", "allocated", "shift", "threshold", "<init>", "(Lo0OOo0O/o00oo00O;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class o00oOOo0 {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f14170o00oOoO0 = AtomicIntegerFieldUpdater.newUpdater(o00oOOo0.class, "load");
        @NotNull
        private volatile /* synthetic */ int load = 0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f14171o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f14172o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f14173o00oOo00;
        @NotNull

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f14174o00oOo0O;
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f14176o00oOooO;

        @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lo0OOo0O/o00oo00O$o00oOOo0$o00oOOo0;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lkotlin/Function2;", "o00oo0O0", "Lo0OOOO/o0O00000;", "factory", "", "o00oo0O", "I", FirebaseAnalytics.Param.INDEX, "o00oo0Oo", "Ljava/lang/Object;", "key", "o00oo0o0", "value", "<init>", "(Lo0OOo0O/o00oo00O$o00oOOo0;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: o0OOo0O.o00oo00O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0177o00oOOo0<E> implements Iterator<E>, o0OOOOO.o00oOo0O {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public int f14177o00oo0O = -1;
            @NotNull

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final o0OOOO.o0O00000<K, V, E> f14178o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public K f14179o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public V f14181o00oo0o0;

            /* JADX WARN: Multi-variable type inference failed */
            public C0177o00oOOo0(@NotNull o0OOOO.o0O00000<? super K, ? super V, ? extends E> o0o00000) {
                this.f14178o00oo0O0 = o0o00000;
                o00oOOo0();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f14177o00oo0O < o00oOOo0.this.f14171o00oOOo0;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f14177o00oo0O < o00oOOo0.this.f14171o00oOOo0) {
                    o0OOOO.o0O00000<K, V, E> o0o00000 = this.f14178o00oo0O0;
                    K k = this.f14179o00oo0Oo;
                    if (k == null) {
                        o0ooO.o00ooooO("key");
                        k = (K) oO0Ooooo.f13240o00oOOo0;
                    }
                    V v = this.f14181o00oo0o0;
                    if (v == null) {
                        o0ooO.o00ooooO("value");
                        v = (V) oO0Ooooo.f13240o00oOOo0;
                    }
                    E invoke = o0o00000.invoke(k, v);
                    o00oOOo0();
                    return invoke;
                }
                throw new NoSuchElementException();
            }

            public final void o00oOOo0() {
                K k;
                while (true) {
                    int i = this.f14177o00oo0O + 1;
                    this.f14177o00oo0O = i;
                    if (i >= o00oOOo0.this.f14171o00oOOo0) {
                        return;
                    }
                    o0 o0Var = (o0) o00oOOo0.this.f14176o00oOooO.get(this.f14177o00oo0O);
                    if (o0Var != null && (k = (K) o0Var.get()) != null) {
                        this.f14179o00oo0Oo = k;
                        V v = (V) o00oOOo0.this.f14174o00oOo0O.get(this.f14177o00oo0O);
                        if (v instanceof o0O00000) {
                            v = (V) ((o0O00000) v).f14203o00oOOo0;
                        }
                        if (v != null) {
                            this.f14181o00oo0o0 = v;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* renamed from: o00oOOoO */
            public Void remove() {
                o00oo0.o00oOo0O();
                throw new o0OoO00O();
            }
        }

        public o00oOOo0(int i) {
            this.f14171o00oOOo0 = i;
            this.f14172o00oOOoO = Integer.numberOfLeadingZeros(i) + 1;
            this.f14173o00oOo00 = (i * 2) / 3;
            this.f14176o00oOooO = new AtomicReferenceArray(i);
            this.f14174o00oOo0O = new AtomicReferenceArray(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object o00oOoO0(o00oOOo0 o00oooo02, Object obj, Object obj2, o0 o0Var, int i, Object obj3) {
            if ((i & 4) != 0) {
                o0Var = null;
            }
            return o00oooo02.o00oOo0o(obj, obj2, o0Var);
        }

        public final void o00oOOoO(@NotNull o0<?> o0Var) {
            int o00oOooO2 = o00oOooO(o0Var.f14160o00oOOo0);
            while (true) {
                o0<?> o0Var2 = (o0) this.f14176o00oOooO.get(o00oOooO2);
                if (o0Var2 == null) {
                    return;
                }
                if (o0Var2 == o0Var) {
                    o00oOoOO(o00oOooO2);
                    return;
                }
                if (o00oOooO2 == 0) {
                    o00oOooO2 = this.f14171o00oOOo0;
                }
                o00oOooO2--;
            }
        }

        @Nullable
        public final V o00oOo00(@NotNull K k) {
            int o00oOooO2 = o00oOooO(k.hashCode());
            while (true) {
                o0 o0Var = (o0) this.f14176o00oOooO.get(o00oOooO2);
                if (o0Var == null) {
                    return null;
                }
                T t = o0Var.get();
                if (o0ooO.o00oOoO0(k, t)) {
                    V v = (V) this.f14174o00oOo0O.get(o00oOooO2);
                    return v instanceof o0O00000 ? (V) ((o0O00000) v).f14203o00oOOo0 : v;
                }
                if (t == 0) {
                    o00oOoOO(o00oOooO2);
                }
                if (o00oOooO2 == 0) {
                    o00oOooO2 = this.f14171o00oOOo0;
                }
                o00oOooO2--;
            }
        }

        @NotNull
        public final <E> Iterator<E> o00oOo0O(@NotNull o0OOOO.o0O00000<? super K, ? super V, ? extends E> o0o00000) {
            return new C0177o00oOOo0(o0o00000);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
            r6 = r5.f14174o00oOo0O.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
            if ((r6 instanceof o0OOo0O.o0O00000) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
            r6 = o0OOo0O.o00oo0.f14165o00oOo00;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
            if (com.google.common.util.concurrent.o00oOOo0.o00oOOo0(r5.f14174o00oOo0O, r0, r6, r7) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
            return r6;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object o00oOo0o(@org.jetbrains.annotations.NotNull K r6, @org.jetbrains.annotations.Nullable V r7, @org.jetbrains.annotations.Nullable o0OOo0O.o0<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.o00oOooO(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f14176o00oOooO
                java.lang.Object r2 = r2.get(r0)
                o0OOo0O.o0 r2 = (o0OOo0O.o0) r2
                if (r2 != 0) goto L46
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L30
            L19:
                int r1 = r5.load
                int r3 = r5.f14173o00oOo00
                if (r1 < r3) goto L24
                o0OOo0o0.oO0o0o r6 = o0OOo0O.o00oo0.o00oOOo0()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = o0OOo0O.o00oo00O.o00oOOo0.f14170o00oOoO0
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 != 0) goto L2f
                goto L19
            L2f:
                r1 = 1
            L30:
                if (r8 != 0) goto L3d
                o0OOo0O.o0 r8 = new o0OOo0O.o0
                o0OOo0O.o00oo00O<K, V> r3 = o0OOo0O.o00oo00O.this
                java.lang.ref.ReferenceQueue r3 = o0OOo0O.o00oo00O.o00oOoO0(r3)
                r8.<init>(r6, r3)
            L3d:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f14176o00oOooO
                boolean r2 = com.google.common.util.concurrent.o00oOOo0.o00oOOo0(r3, r0, r2, r8)
                if (r2 != 0) goto L57
                goto L9
            L46:
                java.lang.Object r2 = r2.get()
                boolean r3 = o0OOOOO0.o0ooO.o00oOoO0(r6, r2)
                if (r3 == 0) goto L6f
                if (r1 == 0) goto L57
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = o0OOo0O.o00oo00O.o00oOOo0.f14170o00oOoO0
                r6.decrementAndGet(r5)
            L57:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f14174o00oOo0O
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof o0OOo0O.o0O00000
                if (r8 == 0) goto L66
                o0OOo0o0.oO0o0o r6 = o0OOo0O.o00oo0.o00oOOo0()
                return r6
            L66:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f14174o00oOo0O
                boolean r8 = com.google.common.util.concurrent.o00oOOo0.o00oOOo0(r8, r0, r6, r7)
                if (r8 == 0) goto L57
                return r6
            L6f:
                if (r2 != 0) goto L74
                r5.o00oOoOO(r0)
            L74:
                if (r0 != 0) goto L78
                int r0 = r5.f14171o00oOOo0
            L78:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O.o00oo00O.o00oOOo0.o00oOo0o(java.lang.Object, java.lang.Object, o0OOo0O.o0):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final o00oo00O<K, V>.o00oOOo0 o00oOoO() {
            Object obj;
            oO0o0o oo0o0o;
            o0O00000 o00oOooO2;
            while (true) {
                int o00oOo002 = o00oo00O.this.o00oOo00();
                if (o00oOo002 < 4) {
                    o00oOo002 = 4;
                }
                o00oo00O<K, V>.o00oOOo0 o00oooo02 = (o00oo00O<K, V>.o00oOOo0) new o00oOOo0(Integer.highestOneBit(o00oOo002) * 4);
                int i = this.f14171o00oOOo0;
                for (int i2 = 0; i2 < i; i2++) {
                    o0 o0Var = (o0) this.f14176o00oOooO.get(i2);
                    Object obj2 = o0Var != null ? o0Var.get() : null;
                    if (o0Var != null && obj2 == null) {
                        o00oOoOO(i2);
                    }
                    while (true) {
                        obj = this.f14174o00oOo0O.get(i2);
                        if (obj instanceof o0O00000) {
                            obj = ((o0O00000) obj).f14203o00oOOo0;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f14174o00oOo0O;
                        o00oOooO2 = o00oo0.o00oOooO(obj);
                        if (com.google.common.util.concurrent.o00oOOo0.o00oOOo0(atomicReferenceArray, i2, obj, o00oOooO2)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object o00oOo0o2 = o00oooo02.o00oOo0o(obj2, obj, o0Var);
                        oo0o0o = o00oo0.f14165o00oOo00;
                        if (o00oOo0o2 != oo0o0o) {
                        }
                    }
                }
                return o00oooo02;
            }
        }

        public final void o00oOoOO(int i) {
            Object obj;
            do {
                obj = this.f14174o00oOo0O.get(i);
                if (obj == null || (obj instanceof o0O00000)) {
                    return;
                }
            } while (!com.google.common.util.concurrent.o00oOOo0.o00oOOo0(this.f14174o00oOo0O, i, obj, null));
            o00oo00O.this.o00oOoOO();
        }

        public final int o00oOooO(int i) {
            return (i * o00oo0.f14163o00oOOo0) >>> this.f14172o00oOOoO;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lo0OOo0O/o00oo00O$o00oOOoO;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "o00oo0O0", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "o00oo0O", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<K, V> implements Map.Entry<K, V>, o00oo0.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final V f14182o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final K f14183o00oo0O0;

        public o00oOOoO(K k, V v) {
            this.f14183o00oo0O0 = k;
            this.f14182o00oo0O = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f14183o00oo0O0;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f14182o00oo0O;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            o00oo0.o00oOo0O();
            throw new o0OoO00O();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lo0OOo0O/o00oo00O$o00oOo00;", "E", "Lo0OO0oO/o00oo0OO;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", "o00oo0O0", "Lo0OOOO/o0O00000;", "factory", "", "getSize", "()I", "size", "<init>", "(Lo0OOo0O/o00oo00O;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class o00oOo00<E> extends o0OO0oO.o00oo0OO<E> {
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0OOOO.o0O00000<K, V, E> f14185o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(@NotNull o0OOOO.o0O00000<? super K, ? super V, ? extends E> o0o00000) {
            this.f14185o00oo0O0 = o0o00000;
        }

        @Override // o0OO0oO.o00oo0OO, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e) {
            o00oo0.o00oOo0O();
            throw new o0OoO00O();
        }

        @Override // o0OO0oO.o00oo0OO
        public int getSize() {
            return o00oo00O.this.o00oOo00();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            o00oOOo0 o00oooo02 = (o00oOOo0) o00oo00O.this.core;
            o0OOOO.o0O00000<K, V, E> o0o00000 = this.f14185o00oo0O0;
            o00oooo02.getClass();
            return new o00oOOo0.C0177o00oOOo0(o0o00000);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "V", "", "k", "v", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o0O00000<K, V, Map.Entry<K, V>> {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((o00oOo0O) obj, obj2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final Map.Entry<K, V> invoke(@NotNull K k, @NotNull V v) {
            return new o00oOOoO(k, v);
        }
    }

    @o0O0oo0o(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o0O00000<K, V, K> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final K invoke(@NotNull K k, @NotNull V v) {
            return k;
        }
    }

    public o00oo00O() {
        this(false, 1, null);
    }

    public o00oo00O(boolean z) {
        this._size = 0;
        this.core = new o00oOOo0(16);
        this.f14169o00oo0O0 = z ? new ReferenceQueue<>() : null;
    }

    public /* synthetic */ o00oo00O(boolean z, int i, o0O00 o0o00) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (K k : o00oOOoO()) {
            remove(k);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((o00oOOo0) this.core).o00oOo00(obj);
    }

    @Override // o0OO0oO.o00oo0
    @NotNull
    public Set<Map.Entry<K, V>> o00oOOo0() {
        return new o00oOo00(o00oOo0O.INSTANCE);
    }

    @Override // o0OO0oO.o00oo0
    @NotNull
    public Set<K> o00oOOoO() {
        return new o00oOo00(o00oOoO.INSTANCE);
    }

    @Override // o0OO0oO.o00oo0
    public int o00oOo00() {
        return this._size;
    }

    public final void o00oOoO(o0<?> o0Var) {
        ((o00oOOo0) this.core).o00oOOoO(o0Var);
    }

    public final void o00oOoOO() {
        f14168o00oo0O.decrementAndGet(this);
    }

    public final synchronized V o00oOoOo(K k, V v) {
        V v2;
        oO0o0o oo0o0o;
        o00oOOo0 o00oooo02 = (o00oOOo0) this.core;
        while (true) {
            v2 = (V) o00oOOo0.o00oOoO0(o00oooo02, k, v, null, 4, null);
            oo0o0o = o00oo0.f14165o00oOo00;
            if (v2 == oo0o0o) {
                o00oooo02 = o00oooo02.o00oOoO();
                this.core = o00oooo02;
            }
        }
        return v2;
    }

    public final void o00oOoo0() {
        if (!(this.f14169o00oo0O0 != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f14169o00oo0O0.remove();
                if (remove == null) {
                    break;
                }
                o00oOoO((o0) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
    }

    @Override // o0OO0oO.o00oo0, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k, @NotNull V v) {
        oO0o0o oo0o0o;
        V v2 = (V) o00oOOo0.o00oOoO0((o00oOOo0) this.core, k, v, null, 4, null);
        oo0o0o = o00oo0.f14165o00oOo00;
        if (v2 == oo0o0o) {
            v2 = o00oOoOo(k, v);
        }
        if (v2 == null) {
            f14168o00oo0O.incrementAndGet(this);
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        oO0o0o oo0o0o;
        if (obj == 0) {
            return null;
        }
        V v = (V) o00oOOo0.o00oOoO0((o00oOOo0) this.core, obj, null, null, 4, null);
        oo0o0o = o00oo0.f14165o00oOo00;
        if (v == oo0o0o) {
            v = o00oOoOo(obj, null);
        }
        if (v != null) {
            f14168o00oo0O.decrementAndGet(this);
        }
        return v;
    }
}
