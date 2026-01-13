package o0OOo0oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0o.o0O;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: P
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@o0O
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001J5\u0010\r\u001a\u00020\u0005*\u00020\t2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R3\u0010)\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$0#j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$`%8\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lo0OOo0oo/oOO00O0;", "R", "Lo0OOo0oo/oO0oO000;", "", "e", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "", "o00oOo0O", "Lo0OOo0oo/oOo00o00;", "Lkotlin/Function1;", "Lo0OO/o00oOo0O;", "block", "o00oOooo", "(Lo0OOo0oo/oOo00o00;Lo0OOOO/o00oo;)V", "Q", "Lo0OOo0oo/oO;", "Lkotlin/Function2;", "o00oo0O", "(Lo0OOo0oo/oO;Lo0OOOO/o0O00000;)V", "P", "Lo0OOo0oo/oOO00000;", "param", "o00oo0Oo", "(Lo0OOo0oo/oOO00000;Ljava/lang/Object;Lo0OOOO/o0O00000;)V", "", "timeMillis", "o00oOooO", "(JLo0OOOO/o00oo;)V", "Lo0OOo0oo/oOooo;", "o00oo0O0", "Lo0OOo0oo/oOooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "()Lo0OOo0oo/oOooo;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "o00oOOo0", "()Ljava/util/ArrayList;", "clauses", "uCont", "<init>", "(Lo0OO/o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOO00O0<R> implements oO0oO000<R> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final ArrayList<o0OOOO.o00oOOo0<oO0Ooooo>> f14765o00oo0O = new ArrayList<>();
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final oOooo<R> f14766o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ o00oo<o0OO.o00oOo0O<? super R>, Object> $block;
        public final /* synthetic */ oOo00o00 $this_invoke;
        public final /* synthetic */ oOO00O0<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(oOo00o00 ooo00o00, oOO00O0<? super R> ooo00o0, o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
            super(0);
            this.$this_invoke = ooo00o00;
            this.this$0 = ooo00o0;
            this.$block = o00ooVar;
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_invoke.o0O0o(this.this$0.f14766o00oo0O0, this.$block);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Q", "R", "Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ o0O00000<Q, o0OO.o00oOo0O<? super R>, Object> $block;
        public final /* synthetic */ oO<Q> $this_invoke;
        public final /* synthetic */ oOO00O0<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(oO<? extends Q> oOVar, oOO00O0<? super R> ooo00o0, o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            super(0);
            this.$this_invoke = oOVar;
            this.this$0 = ooo00o0;
            this.$block = o0o00000;
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_invoke.o00oo0o(this.this$0.f14766o00oo0O0, this.$block);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"P", "Q", "R", "Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ o0O00000<Q, o0OO.o00oOo0O<? super R>, Object> $block;
        public final /* synthetic */ P $param;
        public final /* synthetic */ oOO00000<P, Q> $this_invoke;
        public final /* synthetic */ oOO00O0<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(oOO00000<? super P, ? extends Q> ooo00000, oOO00O0<? super R> ooo00o0, P p, o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
            super(0);
            this.$this_invoke = ooo00000;
            this.this$0 = ooo00o0;
            this.$param = p;
            this.$block = o0o00000;
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_invoke.o00ooOOo(this.this$0.f14766o00oo0O0, this.$param, this.$block);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ o00oo<o0OO.o00oOo0O<? super R>, Object> $block;
        public final /* synthetic */ long $timeMillis;
        public final /* synthetic */ oOO00O0<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(oOO00O0<? super R> ooo00o0, long j, o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
            super(0);
            this.this$0 = ooo00o0;
            this.$timeMillis = j;
            this.$block = o00ooVar;
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.f14766o00oo0O0.o00oOooO(this.$timeMillis, this.$block);
        }
    }

    public oOO00O0(@NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        this.f14766o00oo0O0 = new oOooo<>(o00ooo0o2);
    }

    @NotNull
    public final ArrayList<o0OOOO.o00oOOo0<oO0Ooooo>> o00oOOo0() {
        return this.f14765o00oo0O;
    }

    @NotNull
    public final oOooo<R> o00oOOoO() {
        return this.f14766o00oo0O0;
    }

    @o0O
    public final void o00oOo00(@NotNull Throwable th) {
        this.f14766o00oo0O0.o0O00OoO(th);
    }

    @o0O
    @Nullable
    public final Object o00oOo0O() {
        if (!this.f14766o00oo0O0.o00oo00O()) {
            try {
                Collections.shuffle(this.f14765o00oo0O);
                Iterator<T> it = this.f14765o00oo0O.iterator();
                while (it.hasNext()) {
                    ((o0OOOO.o00oOOo0) it.next()).invoke();
                }
            } catch (Throwable th) {
                this.f14766o00oo0O0.o0O00OoO(th);
            }
        }
        return this.f14766o00oo0O0.o0oO0Ooo();
    }

    @Override // o0OOo0oo.oO0oO000
    public void o00oOooO(long j, @NotNull o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
        this.f14765o00oo0O.add(new o00oOo0O(this, j, o00ooVar));
    }

    @Override // o0OOo0oo.oO0oO000
    public void o00oOooo(@NotNull oOo00o00 ooo00o00, @NotNull o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
        this.f14765o00oo0O.add(new o00oOOo0(ooo00o00, this, o00ooVar));
    }

    @Override // o0OOo0oo.oO0oO000
    public <Q> void o00oo0O(@NotNull oO<? extends Q> oOVar, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        this.f14765o00oo0O.add(new o00oOOoO(oOVar, this, o0o00000));
    }

    @Override // o0OOo0oo.oO0oO000
    public <P, Q> void o00oo0Oo(@NotNull oOO00000<? super P, ? extends Q> ooo00000, P p, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        this.f14765o00oo0O.add(new o00oOo00(ooo00000, this, p, o0o00000));
    }

    @Override // o0OOo0oo.oO0oO000
    public <P, Q> void o00oo0o0(@NotNull oOO00000<? super P, ? extends Q> ooo00000, @NotNull o0O00000<? super Q, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        o00oo0Oo(ooo00000, null, o0o00000);
    }
}
