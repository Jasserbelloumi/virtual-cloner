package o0OOOoO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OO0o.o0O0o00;
import o0OO0o.o0OO00o0;
import o0OO0o.oo0ooO;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O00O0o;
import o0OO0oO.o0O00o00;
import o0OOO0.o0O0o;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes3.dex */
public class oO0OoOO0 extends oO000O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<Iterator<T>> f13834o00oOOo0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o00oOOo0<? extends Iterator<? extends T>> o00oooo02) {
            this.f13834o00oOOo0 = o00oooo02;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return this.f13834o00oOOo0.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Iterator f13835o00oOOo0;

        public o00oOOoO(Iterator it) {
            this.f13835o00oOOo0 = it;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return this.f13835o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<R> extends o0O0o implements o0O00000<oO000O0O<? super R>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o00oo<C, Iterator<R>> $iterator;
        public final /* synthetic */ oO000<T> $source;
        public final /* synthetic */ o0O00000<Integer, T, C> $transform;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(oO000<? extends T> oo000, o0O00000<? super Integer, ? super T, ? extends C> o0o00000, o00oo<? super C, ? extends Iterator<? extends R>> o00ooVar, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$source = oo000;
            this.$transform = o0o00000;
            this.$iterator = o00ooVar;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOo00 o00ooo002 = new o00oOo00(this.$source, this.$transform, this.$iterator, o00ooo0o2);
            o00ooo002.L$0 = obj;
            return o00ooo002;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super R> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Iterator it;
            oO000O0O oo000o0o;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                oo0ooO.o00oo0(obj);
                i = 0;
                it = this.$source.iterator();
                oo000o0o = (oO000O0O) this.L$0;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.I$0;
                it = (Iterator) this.L$1;
                oo000o0o = (oO000O0O) this.L$0;
                oo0ooO.o00oo0(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                o0O00000<Integer, T, C> o0o00000 = this.$transform;
                int i3 = i + 1;
                if (i < 0) {
                    o0O00O0o.o0O0000O();
                }
                Object invoke = o0o00000.invoke(new Integer(i), next);
                this.L$0 = oo000o0o;
                this.L$1 = it;
                this.I$0 = i3;
                this.label = 1;
                if (oo000o0o.o00oOooO(this.$iterator.invoke(invoke), this) == o00oooo02) {
                    return o00oooo02;
                }
                i = i3;
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> extends o0O0OO implements o00oo<oO000<? extends T>, Iterator<? extends T>> {
        public static final o00oOo0O INSTANCE = new o00oOo0O();

        public o00oOo0O() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((oO000) ((oO000) obj));
        }

        @NotNull
        public final Iterator<T> invoke(@NotNull oO000<? extends T> oo000) {
            o0ooO.o00oo0O0(oo000, "it");
            return (Iterator<? extends T>) oo000.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOoO<T> extends o0O0OO implements o00oo<Iterable<? extends T>, Iterator<? extends T>> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Iterable) ((Iterable) obj));
        }

        @NotNull
        public final Iterator<T> invoke(@NotNull Iterable<? extends T> iterable) {
            o0ooO.o00oo0O0(iterable, "it");
            return (Iterator<? extends T>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oo0<T> extends o0O0OO implements o00oo<T, T> {
        public final /* synthetic */ o0OOOO.o00oOOo0<T> $nextFunction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0(o0OOOO.o00oOOo0<? extends T> o00oooo02) {
            super(1);
            this.$nextFunction = o00oooo02;
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final T invoke(@NotNull T t) {
            o0ooO.o00oo0O0(t, "it");
            return this.$nextFunction.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oo00O<T> extends o0O0OO implements o00oo<T, T> {
        public static final o00oo00O INSTANCE = new o00oo00O();

        public o00oo00O() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O<T> extends o0O0o implements o0O00000<oO000O0O<? super T>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOo0.o00oo0 $random;
        public final /* synthetic */ oO000<T> $this_shuffled;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0O(oO000<? extends T> oo000, o0OOOo0.o00oo0 o00oo0Var, o0OO.o00oOo0O<? super o00oo0O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_shuffled = oo000;
            this.$random = o00oo0Var;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo0O o00oo0o2 = new o00oo0O(this.$this_shuffled, this.$random, o00ooo0o2);
            o00oo0o2.L$0 = obj;
            return o00oo0o2;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super T> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oo0O) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List o0OooOo2;
            oO000O0O oo000o0o;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                o0OooOo2 = ooOOOOoo.o0OooOo(this.$this_shuffled);
                oo000o0o = (oO000O0O) this.L$0;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OooOo2 = (List) this.L$1;
                oo000o0o = (oO000O0O) this.L$0;
                oo0ooO.o00oo0(obj);
            }
            while (!o0OooOo2.isEmpty()) {
                int nextInt = this.$random.nextInt(o0OooOo2.size());
                Object o0O0OOOo2 = o0O00o00.o0O0OOOo(o0OooOo2);
                if (nextInt < o0OooOo2.size()) {
                    o0O0OOOo2 = o0OooOo2.set(nextInt, o0O0OOOo2);
                }
                this.L$0 = oo000o0o;
                this.L$1 = o0OooOo2;
                this.label = 1;
                if (oo000o0o.o00oOOoO(o0O0OOOo2, this) == o00oooo02) {
                    return o00oooo02;
                }
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0<T> extends o0O0o implements o0O00000<oO000O0O<? super T>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o00oOOo0<oO000<T>> $defaultValue;
        public final /* synthetic */ oO000<T> $this_ifEmpty;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0O0(oO000<? extends T> oo000, o0OOOO.o00oOOo0<? extends oO000<? extends T>> o00oooo02, o0OO.o00oOo0O<? super o00oo0O0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_ifEmpty = oo000;
            this.$defaultValue = o00oooo02;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo0O0 o00oo0o02 = new o00oo0O0(this.$this_ifEmpty, this.$defaultValue, o00ooo0o2);
            o00oo0o02.L$0 = obj;
            return o00oo0o02;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super T> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oo0O0) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                oO000O0O oo000o0o = (oO000O0O) this.L$0;
                Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                if (it.hasNext()) {
                    this.label = 1;
                    if (oo000o0o.o00oOooO(it, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else {
                    this.label = 2;
                    if (oo000o0o.o00oOo0O(this.$defaultValue.invoke(), this) == o00oooo02) {
                        return o00oooo02;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oo0OO<T> extends o0O0OO implements o0OOOO.o00oOOo0<T> {
        public final /* synthetic */ T $seed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0OO(T t) {
            super(0);
            this.$seed = t;
        }

        @Override // o0OOOO.o00oOOo0
        @Nullable
        public final T invoke() {
            return this.$seed;
        }
    }

    public oO0OoOO0() {
    }

    @NotNull
    public static final <T> oO000<T> o00oOo0O(@NotNull Iterator<? extends T> it) {
        o0ooO.o00oo0O0(it, "<this>");
        return o00oOo0o(new o00oOOoO(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> oO000<T> o00oOo0o(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return oo000 instanceof o0OOOO ? oo000 : new o0OOOO(oo000);
    }

    @NotNull
    public static final <T, C, R> oO000<R> o00oOoO(@NotNull oO000<? extends T> oo000, @NotNull o0O00000<? super Integer, ? super T, ? extends C> o0o00000, @NotNull o00oo<? super C, ? extends Iterator<? extends R>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(o0o00000, "transform");
        o0ooO.o00oo0O0(o00ooVar, "iterator");
        return oO0o0o.o00oOOoO(new o00oOo00(oo000, o0o00000, o00ooVar, null));
    }

    @NotNull
    public static final <T> oO000<T> o00oOoO0() {
        return o.f13767o00oOOo0;
    }

    @NotNull
    public static final <T> oO000<T> o00oOoOO(@NotNull oO000<? extends oO000<? extends T>> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o00oOoOo(oo000, o00oOo0O.INSTANCE);
    }

    public static final <T, R> oO000<R> o00oOoOo(oO000<? extends T> oo000, o00oo<? super T, ? extends Iterator<? extends R>> o00ooVar) {
        return oo000 instanceof oO0O0OoO ? ((oO0O0OoO) oo000).o00oOo0O(o00ooVar) : new oO00000o(oo000, o00oo00O.INSTANCE, o00ooVar);
    }

    @o0OOOO0o.o00oo0OO(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> oO000<T> o00oOoo0(@NotNull oO000<? extends Iterable<? extends T>> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o00oOoOo(oo000, o00oOoO.INSTANCE);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> oO000<T> o00oOooO(o0OOOO.o00oOOo0<? extends Iterator<? extends T>> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "iterator");
        return new o00oOOo0(o00oooo02);
    }

    @o0OOO0OO.o00oo0OO
    @NotNull
    public static final <T> oO000<T> o00oOooo(@Nullable T t, @NotNull o00oo<? super T, ? extends T> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "nextFunction");
        return t == null ? o.f13767o00oOOo0 : new oO0000O(new o00oo0OO(t), o00ooVar);
    }

    @NotNull
    public static final <T> oO000<T> o00oo0(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02, @NotNull o00oo<? super T, ? extends T> o00ooVar) {
        o0ooO.o00oo0O0(o00oooo02, "seedFunction");
        o0ooO.o00oo0O0(o00ooVar, "nextFunction");
        return new oO0000O(o00oooo02, o00ooVar);
    }

    @NotNull
    public static final <T> oO000<T> o00oo00O(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "nextFunction");
        return o00oOo0o(new oO0000O(o00oooo02, new o00oo0(o00oooo02)));
    }

    @NotNull
    public static final <T> oO000<T> o00oo0O(@NotNull T... tArr) {
        o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length == 0 ? o.f13767o00oOOo0 : o0O000O.o0o0O0oo(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> oO000<T> o00oo0O0(oO000<? extends T> oo000) {
        return oo000 == 0 ? o.f13767o00oOOo0 : oo000;
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> oO000<T> o00oo0OO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oOOo0<? extends oO000<? extends T>> o00oooo02) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        return oO0o0o.o00oOOoO(new o00oo0O0(oo000, o00oooo02, null));
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T> oO000<T> o00oo0Oo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o00oo0o0(oo000, o0OOOo0.o00oo0.Default);
    }

    @NotNull
    public static final <T, R> o0O0o00<List<T>, List<R>> o00oo0o(@NotNull oO000<? extends o0O0o00<? extends T, ? extends R>> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (o0O0o00<? extends T, ? extends R> o0o0o00 : oo000) {
            arrayList.add(o0o0o00.getFirst());
            arrayList2.add(o0o0o00.getSecond());
        }
        return new o0O0o00<>(arrayList, arrayList2);
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T> oO000<T> o00oo0o0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00oo0Var, "random");
        return oO0o0o.o00oOOoO(new o00oo0O(oo000, o00oo0Var, null));
    }
}
