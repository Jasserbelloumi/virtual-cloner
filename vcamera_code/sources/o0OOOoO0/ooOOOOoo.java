package o0OOOoO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o0OO0o.o0O0o00;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oo0ooO;
import o0OO0oO.o0O00o00;
import o0OO0oO.o0O0OOO;
import o0OO0oO.o0O0o000;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.o0OO0oO;
import o0OO0oO.o0OOO0;
import o0OO0oO.o0oO0Ooo;
import o0OO0oo0.o00ooO0;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OO0O0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0oO0O0o;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oOo000Oo;
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
@o0OOO00({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3094:1\n179#1,2:3095\n316#1,7:3097\n1306#1,3:3105\n739#1,4:3108\n704#1,4:3112\n722#1,4:3116\n775#1,4:3120\n999#1,3:3124\n1002#1,3:3134\n1019#1,3:3137\n1022#1,3:3147\n1306#1,3:3164\n1295#1,2:3167\n1#2:3104\n361#3,7:3127\n361#3,7:3140\n361#3,7:3150\n361#3,7:3157\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3095,2\n99#1:3097,7\n458#1:3105,3\n658#1:3108,4\n674#1:3112,4\n689#1:3116,4\n760#1:3120,4\n970#1:3124,3\n970#1:3134,3\n985#1:3137,3\n985#1:3147,3\n1088#1:3164,3\n1126#1:3167,2\n970#1:3127,7\n985#1:3140,7\n1001#1:3150,7\n1021#1:3157,7\n*E\n"})
/* loaded from: classes3.dex */
public class ooOOOOoo extends oO000OOo {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f13843o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13844o00oOOoO;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<T, Boolean> {
            public final /* synthetic */ Collection<T> $other;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(Collection<? extends T> collection) {
                super(1);
                this.$other = collection;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o0OOOO.o00oo
            @NotNull
            public final Boolean invoke(T t) {
                return Boolean.valueOf(this.$other.contains(t));
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((o00oOOo0) obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o0(Iterable<? extends T> iterable, oO000<? extends T> oo000) {
            this.f13843o00oOOo0 = iterable;
            this.f13844o00oOOoO = oo000;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            Collection o0O00OoO2 = o0O00o00.o0O00OoO(this.f13843o00oOOo0);
            return (o0O00OoO2.isEmpty() ? this.f13844o00oOOoO : ooOOOOoo.o0O00o0o(this.f13844o00oOOoO, new o00oOOo0(o0O00OoO2))).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2903#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements Iterable<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ oO000 f13845o00oo0O0;

        public o00oOOo0(oO000 oo000) {
            this.f13845o00oo0O0 = oo000;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.f13845o00oo0O0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> extends o0O0OO implements o0OOOO.o00oo<T, T> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOo00<T> extends o0O0OO implements o0OOOO.o00oo<Integer, T> {
        public final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(int i) {
            super(1);
            this.$index = i;
        }

        public final T invoke(int i) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Sequence doesn't contain element at index ");
            o00oOOo02.append(this.$index);
            o00oOOo02.append('.');
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> extends o0O0OO implements o0OOOO.o00oo<o0O0o000<? extends T>, Boolean> {
        public final /* synthetic */ o0OOOO.o0O00000<Integer, T, Boolean> $predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(o0OOOO.o0O00000<? super Integer, ? super T, Boolean> o0o00000) {
            super(1);
            this.$predicate = o0o00000;
        }

        @NotNull
        public final Boolean invoke(@NotNull o0O0o000<? extends T> o0o0o000) {
            o0ooO.o00oo0O0(o0o0o000, "it");
            return this.$predicate.invoke(Integer.valueOf(o0o0o000.f13361o00oOOo0), o0o0o000.f13362o00oOOoO);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((o0O0o000) ((o0O0o000) obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOoO<T> extends o0O0OO implements o0OOOO.o00oo<o0O0o000<? extends T>, T> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((o0O0o000) ((o0O0o000) obj));
        }

        public final T invoke(@NotNull o0O0o000<? extends T> o0o0o000) {
            o0ooO.o00oo0O0(o0o0o000, "it");
            return o0o0o000.f13362o00oOOoO;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @o0OOO00({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3094:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo<K, T> implements o0O0OOO<T, K> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13846o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13847o00oOOoO;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13846o00oOOo0 = oo000;
            this.f13847o00oOOoO = o00ooVar;
        }

        @Override // o0OO0oO.o0O0OOO
        public K o00oOOo0(T t) {
            return this.f13847o00oOOoO.invoke(t);
        }

        @Override // o0OO0oO.o0O0OOO
        @NotNull
        public Iterator<T> o00oOOoO() {
            return this.f13846o00oOOo0.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oo0<T> extends o0O0OO implements o0OOOO.o00oo<T, Boolean> {
        public static final o00oo0 INSTANCE = new o00oo0();

        public o00oo0() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@Nullable T t) {
            return Boolean.valueOf(t == null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((o00oo0<T>) obj);
        }
    }

    @o0OOO00({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3094:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0O0OO implements o0OOOO.o00oo<Object, Boolean> {
        public static final o00oo00O INSTANCE = new o00oo00O();

        public o00oo00O() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@Nullable Object obj) {
            o0ooO.o00oooOo();
            return Boolean.valueOf(obj instanceof Object);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oo0O<R> extends o0oO0O0o implements o0OOOO.o00oo<Iterable<? extends R>, Iterator<? extends R>> {
        public static final o00oo0O INSTANCE = new o00oo0O();

        public o00oo0O() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Iterable) ((Iterable) obj));
        }

        @NotNull
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> iterable) {
            o0ooO.o00oo0O0(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oo0O0<R> extends o0oO0O0o implements o0OOOO.o00oo<oO000<? extends R>, Iterator<? extends R>> {
        public static final o00oo0O0 INSTANCE = new o00oo0O0();

        public o00oo0O0() {
            super(1, oO000.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((oO000) ((oO000) obj));
        }

        @NotNull
        public final Iterator<R> invoke(@NotNull oO000<? extends R> oo000) {
            o0ooO.o00oo0O0(oo000, "p0");
            return (Iterator<? extends R>) oo000.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oo0OO<R> extends o0oO0O0o implements o0OOOO.o00oo<Iterable<? extends R>, Iterator<? extends R>> {
        public static final o00oo0OO INSTANCE = new o00oo0OO();

        public o00oo0OO() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Iterable) ((Iterable) obj));
        }

        @NotNull
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> iterable) {
            o0ooO.o00oo0O0(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00ooO<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13848o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ T[] f13849o00oOOoO;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<T, Boolean> {
            public final /* synthetic */ T[] $elements;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(T[] tArr) {
                super(1);
                this.$elements = tArr;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o0OOOO.o00oo
            @NotNull
            public final Boolean invoke(T t) {
                return Boolean.valueOf(o0OO0oO.o0O000O.o(this.$elements, t));
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((o00oOOo0) obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00ooO(oO000<? extends T> oo000, T[] tArr) {
            this.f13848o00oOOo0 = oo000;
            this.f13849o00oOOoO = tArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return ooOOOOoo.o0O00o0o(this.f13848o00oOOo0, new o00oOOo0(this.f13849o00oOOoO)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00ooO0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13850o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ T f13851o00oOOoO;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<T, Boolean> {
            public final /* synthetic */ T $element;
            public final /* synthetic */ o0OO0O0.o00oOOo0 $removed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(o0OO0O0.o00oOOo0 o00oooo02, T t) {
                super(1);
                this.$removed = o00oooo02;
                this.$element = t;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o0OOOO.o00oo
            @NotNull
            public final Boolean invoke(T t) {
                boolean z = true;
                if (!this.$removed.element && o0ooO.o00oOoO0(t, this.$element)) {
                    this.$removed.element = true;
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((o00oOOo0) obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00ooO0(oO000<? extends T> oo000, T t) {
            this.f13850o00oOOo0 = oo000;
            this.f13851o00oOOoO = t;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return ooOOOOoo.o0oO0Ooo(this.f13850o00oOOo0, new o00oOOo0(new o0OO0O0.o00oOOo0(), this.f13851o00oOOoO)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2377, 2381}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o0O00<S> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super S>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O0000O<Integer, S, T, S> $operation;
        public final /* synthetic */ oO000<T> $this_runningReduceIndexed;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O00(oO000<? extends T> oo000, o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o, o0OO.o00oOo0O<? super o0O00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_runningReduceIndexed = oo000;
            this.$operation = o0o0000o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O00 o0o00 = new o0O00(this.$this_runningReduceIndexed, this.$operation, o00ooo0o2);
            o0o00.L$0 = obj;
            return o0o00;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super S> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o0O00) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.I$0
                java.lang.Object r3 = r10.L$2
                java.lang.Object r4 = r10.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.L$0
                o0OOOoO0.oO000O0O r5 = (o0OOOoO0.oO000O0O) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                r11 = r10
                r9 = r3
                r3 = r1
                r1 = r9
                goto L5e
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r4 = r10.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.L$0
                o0OOOoO0.oO000O0O r5 = (o0OOOoO0.oO000O0O) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                goto L5d
            L36:
                o0OO0o.oo0ooO.o00oo0(r11)
                java.lang.Object r11 = r10.L$0
                r5 = r11
                o0OOOoO0.oO000O0O r5 = (o0OOOoO0.oO000O0O) r5
                o0OOOoO0.oO000<T> r11 = r10.$this_runningReduceIndexed
                java.util.Iterator r4 = r11.iterator()
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L8e
                java.lang.Object r1 = r4.next()
                r10.L$0 = r5
                r10.L$1 = r4
                r10.L$2 = r1
                r10.label = r3
                java.lang.Object r11 = r5.o00oOOoO(r1, r10)
                if (r11 != r0) goto L5d
                return r0
            L5d:
                r11 = r10
            L5e:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L8e
                o0OOOO.o0O0000O<java.lang.Integer, S, T, S> r6 = r11.$operation
                int r7 = r3 + 1
                if (r3 >= 0) goto L6d
                o0OO0oO.o0O00O0o.o0O0000O()
            L6d:
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r3)
                java.lang.Object r3 = r4.next()
                java.lang.Object r3 = r6.invoke(r8, r1, r3)
                r11.L$0 = r5
                r11.L$1 = r4
                r11.L$2 = r3
                r11.I$0 = r7
                r11.label = r2
                java.lang.Object r1 = r5.o00oOOoO(r3, r11)
                if (r1 != r0) goto L8b
                return r0
            L8b:
                r1 = r3
                r3 = r7
                goto L5e
            L8e:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoO0.ooOOOOoo.o0O00.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O000<T> extends o0O0OO implements o0OOOO.o0O00000<Integer, T, T> {
        public final /* synthetic */ o0OOOO.o0O00000<Integer, T, o0OO0o.oO0Ooooo> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O000(o0OOOO.o0O00000<? super Integer, ? super T, o0OO0o.oO0Ooooo> o0o00000) {
            super(2);
            this.$action = o0o00000;
        }

        public final T invoke(int i, T t) {
            this.$action.invoke(Integer.valueOf(i), t);
            return t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return invoke(num.intValue(), (int) obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O00000<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13852o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13853o00oOOoO;

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oo<T, Boolean> {
            public final /* synthetic */ List<T> $other;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(List<? extends T> list) {
                super(1);
                this.$other = list;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o0OOOO.o00oo
            @NotNull
            public final Boolean invoke(T t) {
                return Boolean.valueOf(this.$other.contains(t));
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((o00oOOo0) obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o0O00000(oO000<? extends T> oo000, oO000<? extends T> oo0002) {
            this.f13852o00oOOo0 = oo000;
            this.f13853o00oOOoO = oo0002;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            List o0OOo0O02 = ooOOOOoo.o0OOo0O0(this.f13852o00oOOo0);
            return (o0OOo0O02.isEmpty() ? this.f13853o00oOOoO : ooOOOOoo.o0O00o0o(this.f13853o00oOOoO, new o00oOOo0(o0OOo0O02))).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O0000O<T> extends o0O0OO implements o0OOOO.o00oo<T, T> {
        public final /* synthetic */ o0OOOO.o00oo<T, o0OO0o.oO0Ooooo> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O0000O(o0OOOO.o00oo<? super T, o0OO0o.oO0Ooooo> o00ooVar) {
            super(1);
            this.$action = o00ooVar;
        }

        @Override // o0OOOO.o00oo
        public final T invoke(T t) {
            this.$action.invoke(t);
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O000O<T> extends o0O0OO implements o0OOOO.o00oo<T, T> {
        public final /* synthetic */ oO000<T> $this_requireNoNulls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O000O(oO000<? extends T> oo000) {
            super(1);
            this.$this_requireNoNulls = oo000;
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final T invoke(@Nullable T t) {
            if (t != null) {
                return t;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("null element found in ");
            o00oOOo02.append(this.$this_requireNoNulls);
            o00oOOo02.append('.');
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2318, 2323}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$0", "L$1", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o0O000Oo<R> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super R>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ R $initial;
        public final /* synthetic */ o0OOOO.o0O0000O<Integer, R, T, R> $operation;
        public final /* synthetic */ oO000<T> $this_runningFoldIndexed;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O000Oo(R r, oO000<? extends T> oo000, o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o, o0OO.o00oOo0O<? super o0O000Oo> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$initial = r;
            this.$this_runningFoldIndexed = oo000;
            this.$operation = o0o0000o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O000Oo o0o000oo = new o0O000Oo(this.$initial, this.$this_runningFoldIndexed, this.$operation, o00ooo0o2);
            o0o000oo.L$0 = obj;
            return o0o000oo;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super R> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o0O000Oo) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                int r1 = r10.I$0
                java.lang.Object r3 = r10.L$2
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r10.L$1
                java.lang.Object r5 = r10.L$0
                o0OOOoO0.oO000O0O r5 = (o0OOOoO0.oO000O0O) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                r11 = r1
                r1 = r4
                goto L4f
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                java.lang.Object r1 = r10.L$0
                o0OOOoO0.oO000O0O r1 = (o0OOOoO0.oO000O0O) r1
                o0OO0o.oo0ooO.o00oo0(r11)
                goto L43
            L2e:
                o0OO0o.oo0ooO.o00oo0(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                o0OOOoO0.oO000O0O r1 = (o0OOOoO0.oO000O0O) r1
                R r11 = r10.$initial
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r1.o00oOOoO(r11, r10)
                if (r11 != r0) goto L43
                return r0
            L43:
                r11 = 0
                R r3 = r10.$initial
                o0OOOoO0.oO000<T> r4 = r10.$this_runningFoldIndexed
                java.util.Iterator r4 = r4.iterator()
                r5 = r1
                r1 = r3
                r3 = r4
            L4f:
                r4 = r10
            L50:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L80
                java.lang.Object r6 = r3.next()
                o0OOOO.o0O0000O<java.lang.Integer, R, T, R> r7 = r4.$operation
                int r8 = r11 + 1
                if (r11 >= 0) goto L63
                o0OO0oO.o0O00O0o.o0O0000O()
            L63:
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r11)
                java.lang.Object r11 = r7.invoke(r9, r1, r6)
                r4.L$0 = r5
                r4.L$1 = r11
                r4.L$2 = r3
                r4.I$0 = r8
                r4.label = r2
                java.lang.Object r1 = r5.o00oOOoO(r11, r4)
                if (r1 != r0) goto L7d
                return r0
            L7d:
                r1 = r11
                r11 = r8
                goto L50
            L80:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoO0.ooOOOOoo.o0O000Oo.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2348, 2351}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0O000o0<S> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super S>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<S, T, S> $operation;
        public final /* synthetic */ oO000<T> $this_runningReduce;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O000o0(oO000<? extends T> oo000, o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000, o0OO.o00oOo0O<? super o0O000o0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_runningReduce = oo000;
            this.$operation = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O000o0 o0o000o0 = new o0O000o0(this.$this_runningReduce, this.$operation, o00ooo0o2);
            o0o000o0.L$0 = obj;
            return o0o000o0;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super S> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o0O000o0) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oO000O0O oo000o0o;
            Object next;
            Iterator it;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                oo000o0o = (oO000O0O) this.L$0;
                Iterator it2 = this.$this_runningReduce.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.L$0 = oo000o0o;
                    this.L$1 = it2;
                    this.L$2 = next;
                    this.label = 1;
                    if (oo000o0o.o00oOOoO(next, this) == o00oooo02) {
                        return o00oooo02;
                    }
                    it = it2;
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                next = this.L$2;
                it = (Iterator) this.L$1;
                oo000o0o = (oO000O0O) this.L$0;
                oo0ooO.o00oo0(obj);
            }
            while (it.hasNext()) {
                next = this.$operation.invoke(next, it.next());
                this.L$0 = oo000o0o;
                this.L$1 = it;
                this.L$2 = next;
                this.label = 2;
                if (oo000o0o.o00oOOoO(next, this) == o00oooo02) {
                    return o00oooo02;
                }
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O00O<T> extends o0O0OO implements o0OOOO.o0O00000<T, T, o0O0o00<? extends T, ? extends T>> {
        public static final o0O00O INSTANCE = new o0O00O();

        static {
        }

        public o0O00O() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(obj, obj2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final o0O0o00<T, T> invoke(T t, T t2) {
            return new o0O0o00<>(t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0O00O0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13854o00oOOo0;

        /* JADX WARN: Multi-variable type inference failed */
        public o0O00O0(oO000<? extends T> oo000) {
            this.f13854o00oOOo0 = oo000;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            List o0OooOo2 = ooOOOOoo.o0OooOo(this.f13854o00oOOo0);
            o0oO0Ooo.o0OoO00O(o0OooOo2);
            return o0OooOo2.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* loaded from: classes3.dex */
    public static final class o0O00O0o<R, T> extends o0O0OO implements o0OOOO.o0O00000<T, R, o0O0o00<? extends T, ? extends R>> {
        public static final o0O00O0o INSTANCE = new o0O00O0o();

        static {
        }

        public o0O00O0o() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((o0O00O0o<R, T>) obj, obj2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final o0O0o00<T, R> invoke(T t, R r) {
            return new o0O0o00<>(t, r);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2855}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0O00OO<R> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super R>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ oO000<T> $this_zipWithNext;
        public final /* synthetic */ o0OOOO.o0O00000<T, T, R> $transform;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O00OO(oO000<? extends T> oo000, o0OOOO.o0O00000<? super T, ? super T, ? extends R> o0o00000, o0OO.o00oOo0O<? super o0O00OO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_zipWithNext = oo000;
            this.$transform = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O00OO o0o00oo = new o0O00OO(this.$this_zipWithNext, this.$transform, o00ooo0o2);
            o0o00oo.L$0 = obj;
            return o0o00oo;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super R> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o0O00OO) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oO000O0O oo000o0o;
            Object next;
            Iterator it;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                oO000O0O oo000o0o2 = (oO000O0O) this.L$0;
                Iterator it2 = this.$this_zipWithNext.iterator();
                if (!it2.hasNext()) {
                    return o0OO0o.oO0Ooooo.f13240o00oOOo0;
                }
                oo000o0o = oo000o0o2;
                next = it2.next();
                it = it2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Object obj2 = this.L$2;
                it = (Iterator) this.L$1;
                oo000o0o = (oO000O0O) this.L$0;
                oo0ooO.o00oo0(obj);
                next = obj2;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                R invoke = this.$transform.invoke(next, next2);
                this.L$0 = oo000o0o;
                this.L$1 = it;
                this.L$2 = next2;
                this.label = 1;
                if (oo000o0o.o00oOOoO(invoke, this) == o00oooo02) {
                    return o00oooo02;
                }
                next = next2;
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes3.dex */
    public /* synthetic */ class o0O0o<R> extends o0oO0O0o implements o0OOOO.o00oo<oO000<? extends R>, Iterator<? extends R>> {
        public static final o0O0o INSTANCE = new o0O0o();

        static {
        }

        public o0O0o() {
            super(1, oO000.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((oO000) ((oO000) obj));
        }

        @NotNull
        public final Iterator<R> invoke(@NotNull oO000<? extends R> oo000) {
            o0ooO.o00oo0O0(oo000, "p0");
            return (Iterator<? extends R>) oo000.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0OoO00O<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000<T> f13855o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f13856o00oOOoO;

        /* JADX WARN: Multi-variable type inference failed */
        public o0OoO00O(oO000<? extends T> oo000, Comparator<? super T> comparator) {
            this.f13855o00oOOo0 = oo000;
            this.f13856o00oOOoO = comparator;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            List o0OooOo2 = ooOOOOoo.o0OooOo(this.f13855o00oOOo0);
            o0oO0Ooo.o0O00OO(o0OooOo2, this.f13856o00oOOoO);
            return o0OooOo2.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @o0OOO0.o00oo00O(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2290, 2294}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0OoOoOo<R> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super R>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ R $initial;
        public final /* synthetic */ o0OOOO.o0O00000<R, T, R> $operation;
        public final /* synthetic */ oO000<T> $this_runningFold;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOoOo(R r, oO000<? extends T> oo000, o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000, o0OO.o00oOo0O<? super o0OoOoOo> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$initial = r;
            this.$this_runningFold = oo000;
            this.$operation = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0OoOoOo o0oooooo = new o0OoOoOo(this.$initial, this.$this_runningFold, this.$operation, o00ooo0o2);
            o0oooooo.L$0 = obj;
            return o0oooooo;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super R> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o0OoOoOo) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.L$1
                java.lang.Object r4 = r7.L$0
                o0OOOoO0.oO000O0O r4 = (o0OOOoO0.oO000O0O) r4
                o0OO0o.oo0ooO.o00oo0(r8)
                r8 = r3
                goto L4a
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.L$0
                o0OOOoO0.oO000O0O r1 = (o0OOOoO0.oO000O0O) r1
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L40
            L2b:
                o0OO0o.oo0ooO.o00oo0(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                o0OOOoO0.oO000O0O r1 = (o0OOOoO0.oO000O0O) r1
                R r8 = r7.$initial
                r7.L$0 = r1
                r7.label = r3
                java.lang.Object r8 = r1.o00oOOoO(r8, r7)
                if (r8 != r0) goto L40
                return r0
            L40:
                R r8 = r7.$initial
                o0OOOoO0.oO000<T> r3 = r7.$this_runningFold
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4a:
                r3 = r7
            L4b:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6a
                java.lang.Object r5 = r1.next()
                o0OOOO.o0O00000<R, T, R> r6 = r3.$operation
                java.lang.Object r8 = r6.invoke(r8, r5)
                r3.L$0 = r4
                r3.L$1 = r8
                r3.L$2 = r1
                r3.label = r2
                java.lang.Object r5 = r4.o00oOOoO(r8, r3)
                if (r5 != r0) goto L4b
                return r0
            L6a:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoO0.ooOOOOoo.o0OoOoOo.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ooOOOOoo() {
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M o0(@NotNull oO000<? extends T> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke((T) it.next());
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    public static final <T> boolean o00ooo0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            if (!o00ooVar.invoke((Object) o00oOOo02.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean o00ooo0O(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return oo000.iterator().hasNext();
    }

    public static final <T> boolean o00ooo0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            if (o00ooVar.invoke((Object) o00oOOo02.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T> Iterable<T> o00oooO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return new o00oOOo0(oo000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    public static final <T> oO000<T> o00oooOO(oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return oo000;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> o00oooOo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke((T) it.next());
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> o00oooo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(o00ooVar.invoke(obj), o00ooVar2.invoke(obj));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> o00oooo0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(o00ooVar.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M o00ooooO(@NotNull oO000<? extends T> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m.put(o00ooVar.invoke(obj), obj);
        }
        return m;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M o00ooooo(@NotNull oO000<? extends T> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m.put(o00ooVar.invoke(obj), o00ooVar2.invoke(obj));
        }
        return m;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> double o0O(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
            while (o00oOOo02.hasNext()) {
                doubleValue = Math.min(doubleValue, o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> int o0O00(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        int i = 0;
        while (o00oOOo02.hasNext()) {
            if (o00ooVar.invoke((Object) o00oOOo02.next()).booleanValue() && (i = i + 1) < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfDouble")
    public static final double o0O000(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double d2 : oo000) {
            d += d2.doubleValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> o0O00000(@NotNull oO000<? extends K> oo000, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            linkedHashMap.put(obj, o00ooVar.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0O0000O(@NotNull oO000<? extends K> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        Iterator<? extends K> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            m.put(obj, o00ooVar.invoke(obj));
        }
        return m;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfByte")
    public static final double o0O0000o(@NotNull oO000<Byte> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Byte b : oo000) {
            d += b.byteValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfFloat")
    public static final double o0O000O(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Float f : oo000) {
            d += f.floatValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfLong")
    public static final double o0O000Oo(@NotNull oO000<Long> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Long l : oo000) {
            d += l.longValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T, R> oO000<R> o0O000o(@NotNull oO000<? extends T> oo000, int i, @NotNull o0OOOO.o00oo<? super List<? extends T>, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return o0OOo0o0(oo000, i, i, true, o00ooVar);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> oO000<List<T>> o0O000o0(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OOo0Oo(oo000, i, i, true);
    }

    public static final <T> int o0O000oo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        return i;
    }

    @NotNull
    public static final <T> oO000<T> o0O00O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        return new ooo0Oo0(oo000, o00ooVar);
    }

    @NotNull
    public static final <T> oO000<T> o0O00O0(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OoO00O(oo000, o00oOOoO.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> oO000<T> o0O00O0o(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "<this>");
        if (i >= 0) {
            return i == 0 ? oo000 : oo000 instanceof o0oo0000 ? ((o0oo0000) oo000).o00oOOo0(i) : new oO0Oo(oo000, i);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    public static final <T> T o0O00OO(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return (T) o0O00OOO(oo000, i, new o00oOo00(i));
    }

    public static final <T> T o0O00OOO(@NotNull oO000<? extends T> oo000, int i, @NotNull o0OOOO.o00oo<? super Integer, ? extends T> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        if (i >= 0) {
            int i2 = 0;
            for (T t : oo000) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
        }
        return o00ooVar.invoke(Integer.valueOf(i));
    }

    @Nullable
    public static final <T> T o0O00Oo(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "<this>");
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : oo000) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    @NotNull
    public static final <T> oO000<T> o0O00OoO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, Boolean> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "predicate");
        return new oO0O0OoO(new oO00000(new oO0000Oo(oo000), true, new o00oOo0O(o0o00000)), o00oOoO.INSTANCE);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C o0O00Ooo(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, Boolean> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o0o00000, "predicate");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            if (o0o00000.invoke(Integer.valueOf(i), obj).booleanValue()) {
                c.add(obj);
            }
            i = i2;
        }
        return c;
    }

    @NotNull
    public static final <T> oO000<T> o0O00o(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        oO000<T> o0O00o0o2 = o0O00o0o(oo000, o00oo0.INSTANCE);
        o0ooO.o00oo0(o0O00o0o2, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return o0O00o0o2;
    }

    public static final <R> oO000<R> o0O00o00(oO000<?> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oooOo();
        oO000<R> o0oO0Ooo2 = o0oO0Ooo(oo000, o00oo00O.INSTANCE);
        o0ooO.o00oo0(o0oO0Ooo2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return o0oO0Ooo2;
    }

    public static final <R, C extends Collection<? super R>> C o0O00o0O(oO000<?> oo000, C c) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (Object obj : oo000) {
            o0ooO.o00oooOo();
            if (obj instanceof Object) {
                c.add(obj);
            }
        }
        return c;
    }

    @NotNull
    public static final <T> oO000<T> o0O00o0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        return new oO00000(oo000, false, o00ooVar);
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C o0O00oO0(@NotNull oO000<? extends T> oo000, @NotNull C c) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (T t : oo000) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C o0O0O0O(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!o00ooVar.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    @o0OOO0OO.o00oo00O
    public static final <T> T o0O0O0Oo(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        T t = null;
        while (o00oOOo02.hasNext()) {
            ?? r1 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r1).booleanValue()) {
                t = r1;
            }
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T o0O0O0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r0).booleanValue()) {
                return r0;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T o0O0O0o0(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final <T, R> R o0O0O0oO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        R r;
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "transform");
        while (true) {
            if (!o00oOOo02.hasNext()) {
                r = null;
                break;
            }
            r = o00ooVar.invoke((Object) o00oOOo02.next());
            if (r != null) {
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final <T, R> R o0O0O0oo(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "transform");
        while (o00oOOo02.hasNext()) {
            R invoke = o00ooVar.invoke((Object) o00oOOo02.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO00o0(version = "1.4")
    public static final <T, R> oO000<R> o0O0OO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends Iterable<? extends R>> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return oO0OoOO0.o00oOoO(oo000, o0o00000, o00oo0O.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T o0O0OO0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r0).booleanValue()) {
                return r0;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> oO000<R> o0O0OO0O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends oO000<? extends R>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return new oO00000o(oo000, o00ooVar, o00oo0O0.INSTANCE);
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedSequence")
    @o0OO00o0(version = "1.4")
    public static final <T, R> oO000<R> o0O0OOO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends oO000<? extends R>> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return oO0OoOO0.o00oOoO(oo000, o0o00000, o0O0o.INSTANCE);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C o0O0OOO0(oO000<? extends T> oo000, C c, o0OOOO.o0O00000<? super Integer, ? super T, ? extends Iterable<? extends R>> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o0o00000, "transform");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedSequenceTo")
    @o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C o0O0OOOo(oO000<? extends T> oo000, C c, o0OOOO.o0O00000<? super Integer, ? super T, ? extends oO000<? extends R>> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o0o00000, "transform");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            o0O00o00.o0O00Oo(c, o0o00000.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIterable")
    @o0OO00o0(version = "1.4")
    public static final <T, R> oO000<R> o0O0OOo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends Iterable<? extends R>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return new oO00000o(oo000, o00ooVar, o00oo0OO.INSTANCE);
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIterableTo")
    @o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C o0O0OOoO(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends Iterable<? extends R>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke((T) it.next()));
        }
        return c;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C o0O0OOoo(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends oO000<? extends R>> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o0O00o00.o0O00Oo(c, o00ooVar.invoke((T) it.next()));
        }
        return c;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> o0O0Oo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = o00ooVar.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    public static final <T, R> R o0O0Oo0(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            r = o0o0000o.invoke(Integer.valueOf(i), r, obj);
            i = i2;
        }
        return r;
    }

    public static final <T> void o0O0Oo0O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, o0OO0o.oO0Ooooo> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "action");
        while (o00oOOo02.hasNext()) {
            o00ooVar.invoke((Object) o00oOOo02.next());
        }
    }

    public static final <T> void o0O0Oo0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, o0OO0o.oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "action");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            o0o00000.invoke(Integer.valueOf(i), obj);
            i = i2;
        }
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K> o0O0OOO<T, K> o0O0OoO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        return new o00oo(oo000, o00ooVar);
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M o0O0OoO0(@NotNull oO000<? extends T> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = o00ooVar.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj2).add(obj);
        }
        return m;
    }

    public static final <T> int o0O0OoOo(@NotNull oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        int i = 0;
        for (T t2 : oo000) {
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            if (o0ooO.o00oOoO0(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int o0O0Ooo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        int i = -1;
        int i2 = 0;
        while (o00oOOo02.hasNext()) {
            Object obj = (Object) o00oOOo02.next();
            if (i2 < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            if (o00ooVar.invoke(obj).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    public static final <T> int o0O0Ooo0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        int i = 0;
        while (o00oOOo02.hasNext()) {
            Object obj = (Object) o00oOOo02.next();
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            if (o00ooVar.invoke(obj).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NotNull
    public static final <T, A extends Appendable> A o0O0OooO(@NotNull oO000<? extends T> oo000, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super T, ? extends CharSequence> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(a, "buffer");
        o0ooO.o00oo0O0(charSequence, "separator");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        o0ooO.o00oo0O0(charSequence3, "postfix");
        o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : oo000) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            oOo000Oo.o00oOOoO(a, t, o00ooVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> o0O0Oooo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = o00ooVar.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj2).add(o00ooVar2.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T o0O0o0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        T t = null;
        boolean z = false;
        while (o00oOOo02.hasNext()) {
            ?? r2 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r2).booleanValue()) {
                z = true;
                t = r2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @NotNull
    public static final <T> String o0O0o00(@NotNull oO000<? extends T> oo000, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super T, ? extends CharSequence> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(charSequence, "separator");
        o0ooO.o00oo0O0(charSequence2, "prefix");
        o0ooO.o00oo0O0(charSequence3, "postfix");
        o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) o0O0OooO(oo000, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String o0O0o00O(oO000 oo000, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return o0O0o00(oo000, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static final <T> T o0O0o00o(@NotNull oO000<? extends T> oo000) {
        T next;
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T> int o0O0o0O(@NotNull oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        int i = -1;
        int i2 = 0;
        for (T t2 : oo000) {
            if (i2 < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            if (o0ooO.o00oOoO0(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @Nullable
    public static final <T> T o0O0o0OO(@NotNull oO000<? extends T> oo000) {
        T next;
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    @Nullable
    public static final <T> T o0O0o0Oo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        T t = null;
        while (o00oOOo02.hasNext()) {
            ?? r1 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r1).booleanValue()) {
                t = r1;
            }
        }
        return t;
    }

    @NotNull
    public static final <T, R> oO000<R> o0O0o0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return new oO000o00(oo000, o0o00000);
    }

    @NotNull
    public static final <T, R> oO000<R> o0O0o0o0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return new oO0O0OoO(oo000, o00ooVar);
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C o0O0o0oO(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o0o00000, "transform");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            R invoke = o0o00000.invoke(Integer.valueOf(i), obj);
            if (invoke != null) {
                c.add(invoke);
            }
            i = i2;
        }
        return c;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C o0O0o0oo(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o0o00000, "transform");
        Iterator<? extends T> it = oo000.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O0000O();
            }
            c.add(o0o00000.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> double o0O0oO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
            while (o00oOOo02.hasNext()) {
                doubleValue = Math.max(doubleValue, o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C o0O0oO0(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            c.add(o00ooVar.invoke((T) it.next()));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T o0O0oO0O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        T t;
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(r0);
                T t2 = r0;
                do {
                    ?? r2 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(r2);
                    t = t2;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        t = r2;
                    }
                    t2 = t;
                } while (o00oOOo02.hasNext());
                return t;
            }
            return r0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO00o0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T o0O0oO0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        T t;
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(r0);
                T t2 = r0;
                do {
                    ?? r2 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(r2);
                    t = t2;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        t = r2;
                    }
                    t2 = t;
                } while (o00oOOo02.hasNext());
                return t;
            }
            return r0;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R o0O0oOO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            R invoke = o00ooVar.invoke((Object) o00oOOo02.next());
            while (o00oOOo02.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) o00oOOo02.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> float o0O0oOO0(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) o00oOOo02.next()).floatValue();
            while (o00oOOo02.hasNext()) {
                floatValue = Math.max(floatValue, o00ooVar.invoke((Object) o00oOOo02.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> Double o0O0oOOO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
            while (o00oOOo02.hasNext()) {
                doubleValue = Math.max(doubleValue, o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R> R o0O0oOo(oO000<? extends T> oo000, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((T) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> Float o0O0oOo0(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) o00oOOo02.next()).floatValue();
            while (o00oOOo02.hasNext()) {
                floatValue = Math.max(floatValue, o00ooVar.invoke((Object) o00oOOo02.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T o0O0oOoO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Double o0O0oOoo(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Double> it = oo000.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO00o0(version = "1.7")
    public static final double o0O0oo(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Double> it = oo000.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Float o0O0oo0(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Float> it = oo000.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R o0O0oo00(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            R invoke = o00ooVar.invoke((Object) o00oOOo02.next());
            while (o00oOOo02.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) o00oOOo02.next());
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        return null;
    }

    @NotNull
    public static final <T, R> oO000<R> o0O0oo0O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return o0O00o(new oO0O0OoO(oo000, o00ooVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @o0OOO0OO.o00oo00O
    public static final <T> T o0O0oo0o(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r0).booleanValue()) {
                return r0;
            }
        }
        return null;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO00o0(version = "1.7")
    public static final float o0O0ooO0(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Float> it = oo000.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO00o0(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O0ooOO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO00o0(version = "1.7")
    public static final <T> T o0O0ooo(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T o0O0ooo0(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T o0O0oooO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        T t;
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(r0);
                T t2 = r0;
                do {
                    ?? r2 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(r2);
                    t = t2;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        t = r2;
                    }
                    t2 = t;
                } while (o00oOOo02.hasNext());
                return t;
            }
            return r0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO00o0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T o0O0oooo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        T t;
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            ?? r0 = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(r0);
                T t2 = r0;
                do {
                    ?? r2 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(r2);
                    t = t2;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        t = r2;
                    }
                    t2 = t;
                } while (o00oOOo02.hasNext());
                return t;
            }
            return r0;
        }
        throw new NoSuchElementException();
    }

    @o0OOO0OO.o00oo00O
    public static final <T> oO000<T> o0OO(oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OO0oo0(oo000, t);
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO00o0(version = "1.7")
    public static final double o0OO0(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Double> it = oo000.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> float o0OO000(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) o00oOOo02.next()).floatValue();
            while (o00oOOo02.hasNext()) {
                floatValue = Math.min(floatValue, o00ooVar.invoke((Object) o00oOOo02.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R o0OO000o(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            R invoke = o00ooVar.invoke((Object) o00oOOo02.next());
            while (o00oOOo02.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) o00oOOo02.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> Float o0OO00OO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            float floatValue = o00ooVar.invoke((Object) o00oOOo02.next()).floatValue();
            while (o00oOOo02.hasNext()) {
                floatValue = Math.min(floatValue, o00ooVar.invoke((Object) o00oOOo02.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R> R o0OO00Oo(oO000<? extends T> oo000, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((T) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        return null;
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Float o0OO00o(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Float> it = oo000.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T o0OO00o0(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R> R o0OO00oo(oO000<? extends T> oo000, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((T) it.next());
                if (comparator.compare(obj, invoke) > 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO00o0(version = "1.7")
    public static final float o0OO0O0(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Float> it = oo000.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO00o0(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0OO0O0O(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T o0OO0OoO(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    @NotNull
    public static final <T> oO000<T> o0OO0Ooo(@NotNull oO000<? extends T> oo000, @NotNull Iterable<? extends T> iterable) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(iterable, "elements");
        return new o0(iterable, oo000);
    }

    public static final <T> boolean o0OO0o(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return !oo000.iterator().hasNext();
    }

    @NotNull
    public static final <T> oO000<T> o0OO0o0(@NotNull oO000<? extends T> oo000, @NotNull oO000<? extends T> oo0002) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(oo0002, "elements");
        return new o0O00000(oo0002, oo000);
    }

    @NotNull
    public static final <T> oO000<T> o0OO0o00(@NotNull oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return new o00ooO0(oo000, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> oO000<T> o0OO0o0O(@NotNull oO000<? extends T> oo000, @NotNull T[] tArr) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(tArr, "elements");
        return tArr.length == 0 ? oo000 : new o00ooO(oo000, tArr);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> oO000<T> o0OO0o0o(oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OO0o00(oo000, t);
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T> oO000<T> o0OO0oO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, o0OO0o.oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        return o0O0o0o0(oo000, new o0O0000O(o00ooVar));
    }

    public static final <T> boolean o0OO0oO0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        while (o00oOOo02.hasNext()) {
            if (o00ooVar.invoke((Object) o00oOOo02.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T> oO000<T> o0OO0oOO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, o0OO0o.oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "action");
        return o0O0o0o(oo000, new o0O000(o0o00000));
    }

    @NotNull
    public static final <T> oO000<T> o0OO0oOo(@NotNull oO000<? extends T> oo000, @NotNull Iterable<? extends T> iterable) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(iterable, "elements");
        return oO0OoOO0.o00oOoOO(oO0OoOO0.o00oo0O(oo000, o0O0oo0o.o0O0oOO0(iterable)));
    }

    @NotNull
    public static final <T> oO000<T> o0OO0oo0(@NotNull oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return oO0OoOO0.o00oOoOO(oO0OoOO0.o00oo0O(oo000, oO0OoOO0.o00oo0O(t)));
    }

    @NotNull
    public static final <T> oO000<T> o0OO0ooO(@NotNull oO000<? extends T> oo000, @NotNull oO000<? extends T> oo0002) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(oo0002, "elements");
        return oO0OoOO0.o00oOoOO(oO0OoOO0.o00oo0O(oo000, oo0002));
    }

    @NotNull
    public static final <T> oO000<T> o0OO0ooo(@NotNull oO000<? extends T> oo000, @NotNull T[] tArr) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(tArr, "elements");
        return o0OO0oOo(oo000, o0OO0oO.o0O00000.o00oo0o(tArr));
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S o0OOO0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i = 1;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (i < 0) {
                    o0OO0oO.o0O00O0o.o0O0000O();
                }
                next = o0o0000o.invoke(Integer.valueOf(i), next, (T) it.next());
                i = i2;
            }
            return (S) next;
        }
        return null;
    }

    public static final <S, T extends S> S o0OOO00(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = o0o00000.invoke(next, (T) it.next());
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final <S, T extends S> S o0OOO00o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i = 1;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (i < 0) {
                    o0OO0oO.o0O00O0o.o0O0000O();
                }
                next = o0o0000o.invoke(Integer.valueOf(i), next, (T) it.next());
                i = i2;
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    @NotNull
    public static final <T> oO000<T> o0OOO0O(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0O0o0o0(oo000, new o0O000O(oo000));
    }

    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S o0OOO0O0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = o0o00000.invoke(next, (T) it.next());
            }
            return (S) next;
        }
        return null;
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> oO000<R> o0OOO0OO(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        return oO0o0o.o00oOOoO(new o0OoOoOo(r, oo000, o0o00000, null));
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> oO000<R> o0OOO0Oo(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        return oO0o0o.o00oOOoO(new o0O000Oo(r, oo000, o0o0000o, null));
    }

    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <S, T extends S> oO000<S> o0OOO0o0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        return oO0o0o.o00oOOoO(new o0O000o0(oo000, o0o00000, null));
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <S, T extends S> oO000<S> o0OOO0oO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        return oO0o0o.o00oOOoO(new o0O00(oo000, o0o0000o, null));
    }

    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> oO000<R> o0OOO0oo(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        return o0OOO0OO(oo000, r, o0o00000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    @Nullable
    public static final <T> T o0OOOO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        boolean z = false;
        T t = null;
        while (o00oOOo02.hasNext()) {
            ?? r3 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r3).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = r3;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T o0OOOO0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "predicate");
        T t = null;
        boolean z = false;
        while (o00oOOo02.hasNext()) {
            ?? r2 = (Object) o00oOOo02.next();
            if (o00ooVar.invoke(r2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                t = r2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T o0OOOO00(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Sequence has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @Nullable
    public static final <T> T o0OOOO0o(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> oO000<T> o0OOOOO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return o0OOOOo(oo000, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> oO000<T> o0OOOOO0(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return new o0O00O0(oo000);
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> oO000<T> o0OOOOOO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return o0OOOOo(oo000, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> oO000<T> o0OOOOOo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OOOOo(oo000, o0OO0oo0.o00ooO0.o00ooO00());
    }

    @NotNull
    public static final <T> oO000<T> o0OOOOo(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return new o0OoO00O(oo000, comparator);
    }

    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> oO000<R> o0OOOOoO(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "operation");
        return o0OOO0Oo(oo000, r, o0o0000o);
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int o0OOOOoo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Integer> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        int i = 0;
        while (o00oOOo02.hasNext()) {
            i += o00ooVar.invoke((Object) o00oOOo02.next()).intValue();
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfFloat")
    public static final float o0OOOo(@NotNull oO000<Float> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        float f = 0.0f;
        for (Float f2 : oo000) {
            f += f2.floatValue();
        }
        return f;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfByte")
    public static final int o0OOOo0(@NotNull oO000<Byte> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        int i = 0;
        for (Byte b : oo000) {
            i += b.byteValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double o0OOOo00(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        double d = 0.0d;
        while (o00oOOo02.hasNext()) {
            d += o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    public static final double o0OOOo0O(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        for (Double d2 : oo000) {
            d += d2.doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO00o0(version = "1.4")
    public static final <T> double o0OOOo0o(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        double d = 0.0d;
        while (o00oOOo02.hasNext()) {
            d += o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO00o0(version = "1.4")
    public static final <T> int o0OOOoO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Integer> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        int i = 0;
        while (o00oOOo02.hasNext()) {
            i += o00ooVar.invoke((Object) o00oOOo02.next()).intValue();
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    public static final int o0OOOoO0(@NotNull oO000<Integer> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        int i = 0;
        for (Integer num : oo000) {
            i += num.intValue();
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    public static final long o0OOOoOo(@NotNull oO000<Long> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        long j = 0;
        for (Long l : oo000) {
            j += l.longValue();
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfShort")
    public static final int o0OOOoo(@NotNull oO000<Short> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        int i = 0;
        for (Short sh : oo000) {
            i += sh.shortValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO00o0(version = "1.4")
    public static final <T> long o0OOOoo0(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Long> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        long j = 0;
        while (o00oOOo02.hasNext()) {
            j += o00ooVar.invoke((Object) o00oOOo02.next()).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO00o0(version = "1.5")
    public static final <T> int o0OOOooO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, o0OO0o.o0OOOO> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o00oOooo2 += o00ooVar.invoke((T) it.next()).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OO0o.oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO00o0(version = "1.5")
    public static final <T> long o0OOOooo(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, o0OO0o.o0oo0000> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0OO0o.o0oo0000.o00oOooo(0L);
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            o00oOooo2 += o00ooVar.invoke((T) it.next()).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @NotNull
    public static final <T> oO000<T> o0OOo00(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        return new oO000Oo(oo000, o00ooVar);
    }

    @NotNull
    public static final <T> oO000<T> o0OOo000(@NotNull oO000<? extends T> oo000, int i) {
        o0ooO.o00oo0O0(oo000, "<this>");
        if (i >= 0) {
            return i == 0 ? o.f13767o00oOOo0 : oo000 instanceof o0oo0000 ? ((o0oo0000) oo000).o00oOOoO(i) : new oO000Oo0(oo000, i);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C o0OOo00O(@NotNull oO000<? extends T> oo000, @NotNull C c) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (T t : oo000) {
            c.add(t);
        }
        return c;
    }

    @NotNull
    public static final <T> HashSet<T> o0OOo00o(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return (HashSet) o0OOo00O(oo000, new HashSet());
    }

    @NotNull
    public static final <T> Set<T> o0OOo0O(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : oo000) {
            linkedHashSet.add(t);
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> List<T> o0OOo0O0(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OO0oO.o0O00O0o.o00oooo0(o0OooOo(oo000));
    }

    @NotNull
    public static final <T> Set<T> o0OOo0OO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OO0oO.o00oo0Oo((Set) o0OOo00O(oo000, new LinkedHashSet()));
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> oO000<List<T>> o0OOo0Oo(@NotNull oO000<? extends T> oo000, int i, int i2, boolean z) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OOO0.o00oOo00(oo000, i, i2, z, false);
    }

    public static /* synthetic */ oO000 o0OOo0o(oO000 oo000, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return o0OOo0Oo(oo000, i, i2, z);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T, R> oO000<R> o0OOo0o0(@NotNull oO000<? extends T> oo000, int i, int i2, boolean z, @NotNull o0OOOO.o00oo<? super List<? extends T>, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "transform");
        return o0O0o0o0(o0OOO0.o00oOo00(oo000, i, i2, z, true), o00ooVar);
    }

    public static /* synthetic */ oO000 o0OOo0oO(oO000 oo000, int i, int i2, boolean z, o0OOOO.o00oo o00ooVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return o0OOo0o0(oo000, i, i2, z, o00ooVar);
    }

    @NotNull
    public static final <T> oO000<o0O0o000<T>> o0OOo0oo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return new oO0000Oo(oo000);
    }

    @NotNull
    public static final <T, R, V> oO000<V> o0OOoO0(@NotNull oO000<? extends T> oo000, @NotNull oO000<? extends R> oo0002, @NotNull o0OOOO.o0O00000<? super T, ? super R, ? extends V> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(oo0002, "other");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return new oO0000o0(oo000, oo0002, o0o00000);
    }

    @NotNull
    public static final <T, R> oO000<o0O0o00<T, R>> o0OOoO00(@NotNull oO000<? extends T> oo000, @NotNull oO000<? extends R> oo0002) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(oo0002, "other");
        return new oO0000o0(oo000, oo0002, o0O00O0o.INSTANCE);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> oO000<o0O0o00<T, T>> o0OOoO0O(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0OOoO0o(oo000, o0O00O.INSTANCE);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T, R> oO000<R> o0OOoO0o(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super T, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return oO0o0o.o00oOOoO(new o0O00OO(oo000, o0o00000, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO00o0(version = "1.7")
    public static final <T> T o0OOooO0(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T> o0O0o00<List<T>, List<T>> o0OOoooO(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (o00ooVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final <T, K> oO000<T> o0OoO00O(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o0o0000(oo000, o00ooVar);
    }

    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Double o0OoOoO(@NotNull oO000<Double> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<Double> it = oo000.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfShort")
    public static final double o0OoOoOO(@NotNull oO000<Short> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Short sh : oo000) {
            d += sh.shortValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfInt")
    public static final double o0OoOoOo(@NotNull oO000<Integer> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer num : oo000) {
            d += num.intValue();
            i++;
            if (i < 0) {
                o0OO0oO.o0O00O0o.o0O00000();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final <T, R> R o0OooO0(@NotNull oO000<? extends T> oo000, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "operation");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            r = o0o00000.invoke(r, (T) it.next());
        }
        return r;
    }

    @NotNull
    public static final <T> List<T> o0OooOo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return (List) o0OOo00O(oo000, new ArrayList());
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C o0oO0O0o(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (o00ooVar.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    @NotNull
    public static final <T> oO000<T> o0oO0Ooo(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "predicate");
        return new oO00000(oo000, true, o00ooVar);
    }

    @NotNull
    public static final <T, R> oO000<R> o0oOo0O0(@NotNull oO000<? extends T> oo000, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o0o00000, "transform");
        return o0O00o(new oO000o00(oo000, o0o00000));
    }

    @Nullable
    public static final <T> T o0ooO(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> boolean o0ooOoOO(@NotNull oO000<? extends T> oo000, T t) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return o0O0OoOo(oo000, t) >= 0;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M oo0OOoo(@NotNull oO000<? extends T> oo000, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K invoke = o00ooVar.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj2).add(o00ooVar2.invoke(obj));
        }
        return m;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R oo0oO0(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            R invoke = o00ooVar.invoke((Object) o00oOOo02.next());
            while (o00oOOo02.hasNext()) {
                R invoke2 = o00ooVar.invoke((Object) o00oOOo02.next());
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T, R> R oo0oOOo(oO000<? extends T> oo000, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator<? extends T> it = oo000.iterator();
        if (it.hasNext()) {
            Object obj = (R) o00ooVar.invoke((T) it.next());
            while (it.hasNext()) {
                R invoke = o00ooVar.invoke((T) it.next());
                if (comparator.compare(obj, invoke) < 0) {
                    obj = invoke;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final <T> Double oo0ooO(oO000<? extends T> oo000, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            double doubleValue = o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue();
            while (o00oOOo02.hasNext()) {
                doubleValue = Math.min(doubleValue, o00ooVar.invoke((Object) o00oOOo02.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oooOO0(@NotNull oO000<? extends T> oo000, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(o00ooVar, "transform");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke((T) it.next());
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }
}
