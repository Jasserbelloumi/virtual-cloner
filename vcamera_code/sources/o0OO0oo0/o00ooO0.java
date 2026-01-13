package o0OO0oo0;

import java.util.Comparator;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o00ooO0 {

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements Comparator {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, Comparable<?>> f13409o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
            this.f13409o00oo0O0 = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            o0OOOO.o00oo<T, Comparable<?>> o00ooVar = this.f13409o00oo0O0;
            return o00ooO0.o00oOooo(o00ooVar.invoke(t), o00ooVar.invoke(t2));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13410o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f13411o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(Comparator<? super K> comparator, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13411o00oo0O0 = comparator;
            this.f13410o00oo0O = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f13411o00oo0O0;
            o0OOOO.o00oo<T, K> o00ooVar = this.f13410o00oo0O;
            return comparator.compare(o00ooVar.invoke(t), o00ooVar.invoke(t2));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<T> implements Comparator {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, Comparable<?>> f13412o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
            this.f13412o00oo0O0 = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            o0OOOO.o00oo<T, Comparable<?>> o00ooVar = this.f13412o00oo0O0;
            return o00ooO0.o00oOooo(o00ooVar.invoke(t2), o00ooVar.invoke(t));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13413o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f13414o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(Comparator<? super K> comparator, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13414o00oo0O0 = comparator;
            this.f13413o00oo0O = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f13414o00oo0O0;
            o0OOOO.o00oo<T, K> o00ooVar = this.f13413o00oo0O;
            return comparator.compare(o00ooVar.invoke(t2), o00ooVar.invoke(t));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, Comparable<?>> f13415o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f13416o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOoO(Comparator<T> comparator, o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
            this.f13416o00oo0O0 = comparator;
            this.f13415o00oo0O = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f13416o00oo0O0.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            o0OOOO.o00oo<T, Comparable<?>> o00ooVar = this.f13415o00oo0O;
            return o00ooO0.o00oOooo(o00ooVar.invoke(t), o00ooVar.invoke(t2));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, Comparable<?>> f13417o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f13418o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0(Comparator<T> comparator, o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
            this.f13418o00oo0O0 = comparator;
            this.f13417o00oo0O = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f13418o00oo0O0.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            o0OOOO.o00oo<T, Comparable<?>> o00ooVar = this.f13417o00oo0O;
            return o00ooO0.o00oOooo(o00ooVar.invoke(t2), o00ooVar.invoke(t));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f13419o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f13420o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13421o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo00O(Comparator<T> comparator, Comparator<? super K> comparator2, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13420o00oo0O0 = comparator;
            this.f13419o00oo0O = comparator2;
            this.f13421o00oo0Oo = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f13420o00oo0O0.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f13419o00oo0O;
            o0OOOO.o00oo<T, K> o00ooVar = this.f13421o00oo0Oo;
            return comparator.compare(o00ooVar.invoke(t), o00ooVar.invoke(t2));
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O00000<T, T, Integer> f13422o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f13423o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0O0(Comparator<T> comparator, o0OOOO.o0O00000<? super T, ? super T, Integer> o0o00000) {
            this.f13423o00oo0O0 = comparator;
            this.f13422o00oo0O = o0o00000;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f13423o00oo0O0.compare(t, t2);
            return compare != 0 ? compare : this.f13422o00oo0O.invoke(t, t2).intValue();
        }
    }

    @o0OOO00({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO<T> implements Comparator {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f13424o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f13425o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13426o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0OO(Comparator<T> comparator, Comparator<? super K> comparator2, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13425o00oo0O0 = comparator;
            this.f13424o00oo0O = comparator2;
            this.f13426o00oo0Oo = o00ooVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f13425o00oo0O0.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f13424o00oo0O;
            o0OOOO.o00oo<T, K> o00ooVar = this.f13426o00oo0Oo;
            return comparator.compare(o00ooVar.invoke(t2), o00ooVar.invoke(t));
        }
    }

    @o0OOO0OO.o00oo00O
    public static final <T, K> Comparator<T> o00oOo0o(Comparator<? super K> comparator, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oOOoO(comparator, o00ooVar);
    }

    @NotNull
    public static final <T> Comparator<T> o00oOoO(@NotNull final o0OOOO.o00oo<? super T, ? extends Comparable<?>>... o00ooVarArr) {
        o0ooO.o00oo0O0(o00ooVarArr, "selectors");
        if (o00ooVarArr.length > 0) {
            return new Comparator() { // from class: o0OO0oo0.o00oo0O0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return o00ooO0.o00oOoOO(o00ooVarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Comparator<T> o00oOoO0(o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oOOo0(o00ooVar);
    }

    public static final int o00oOoOO(o0OOOO.o00oo[] o00ooVarArr, Object obj, Object obj2) {
        o0ooO.o00oo0O0(o00ooVarArr, "$selectors");
        return o00oo0O0(obj, obj2, o00ooVarArr);
    }

    @o0OOO0OO.o00oo00O
    public static final <T, K> Comparator<T> o00oOoOo(Comparator<? super K> comparator, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oOo0O(comparator, o00ooVar);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Comparator<T> o00oOoo0(o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oOo00(o00ooVar);
    }

    public static final <T extends Comparable<?>> int o00oOooo(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final int o00oo(Comparator comparator, Object obj, Object obj2) {
        o0ooO.o00oo0O0(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> int o00oo0(T t, T t2, o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return o00oOooo(o00ooVar.invoke(t), o00ooVar.invoke(t2));
    }

    @o0OOO0OO.o00oo00O
    public static final <T, K> int o00oo00O(T t, T t2, Comparator<? super K> comparator, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return comparator.compare((K) o00ooVar.invoke(t), (K) o00ooVar.invoke(t2));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> o00oo0O() {
        o0O00000 o0o00000 = o0O00000.f13428o00oo0O0;
        o0ooO.o00oo0(o0o00000, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return o0o00000;
    }

    public static final <T> int o00oo0O0(T t, T t2, o0OOOO.o00oo<? super T, ? extends Comparable<?>>[] o00ooVarArr) {
        for (o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar : o00ooVarArr) {
            int o00oOooo2 = o00oOooo(o00ooVar.invoke(t), o00ooVar.invoke(t2));
            if (o00oOooo2 != 0) {
                return o00oOooo2;
            }
        }
        return 0;
    }

    public static final <T> int o00oo0OO(T t, T t2, @NotNull o0OOOO.o00oo<? super T, ? extends Comparable<?>>... o00ooVarArr) {
        o0ooO.o00oo0O0(o00ooVarArr, "selectors");
        if (o00ooVarArr.length > 0) {
            return o00oo0O0(t, t2, o00ooVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T extends Comparable<? super T>> Comparator<T> o00oo0Oo() {
        return o00oo0o0(o00oo0O());
    }

    public static final int o00oo0o(Comparator comparator, Object obj, Object obj2) {
        o0ooO.o00oo0O0(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @NotNull
    public static final <T> Comparator<T> o00oo0o0(@NotNull final Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return new Comparator() { // from class: o0OO0oo0.o0O0o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o00ooO0.o00oo0o(comparator, obj, obj2);
            }
        };
    }

    @o0OOO0OO.o00oo00O
    public static final <T extends Comparable<? super T>> Comparator<T> o00oo0oO() {
        return o0O0o(o00oo0O());
    }

    @o0OOO0OO.o00oo00O
    public static final <T, K> Comparator<T> o00ooO(Comparator<T> comparator, Comparator<? super K> comparator2, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(comparator2, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oo00O(comparator, comparator2, o00ooVar);
    }

    @NotNull
    public static final <T> Comparator<T> o00ooO0(@NotNull Comparator<T> comparator) {
        o0ooO.o00oo0O0(comparator, "<this>");
        if (comparator instanceof o0O000) {
            return ((o0O000) comparator).f13427o00oo0O0;
        }
        Comparator<T> comparator2 = o0O00000.f13428o00oo0O0;
        if (o0ooO.o00oOoO0(comparator, comparator2)) {
            o0O0000O o0o0000o = o0O0000O.f13429o00oo0O0;
            o0ooO.o00oo0(o0o0000o, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return o0o0000o;
        }
        if (o0ooO.o00oOoO0(comparator, o0O0000O.f13429o00oo0O0)) {
            o0ooO.o00oo0(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new o0O000<>(comparator);
        }
        return comparator2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> o00ooO00() {
        o0O0000O o0o0000o = o0O0000O.f13429o00oo0O0;
        o0ooO.o00oo0(o0o0000o, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return o0o0000o;
    }

    @NotNull
    public static final <T> Comparator<T> o00ooO0O(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(comparator2, "comparator");
        return new Comparator() { // from class: o0OO0oo0.o00oo0OO
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o00ooO0.o00ooO0o(comparator, comparator2, obj, obj2);
            }
        };
    }

    public static final int o00ooO0o(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        o0ooO.o00oo0O0(comparator, "$this_then");
        o0ooO.o00oo0O0(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @o0OOO0OO.o00oo00O
    public static final <T, K> Comparator<T> o00ooOO(Comparator<T> comparator, Comparator<? super K> comparator2, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(comparator2, "comparator");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oo0OO(comparator, comparator2, o00ooVar);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Comparator<T> o00ooOO0(Comparator<T> comparator, o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oOoO(comparator, o00ooVar);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Comparator<T> o00ooOOo(Comparator<T> comparator, o0OOOO.o00oo<? super T, ? extends Comparable<?>> o00ooVar) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        return new o00oo0(comparator, o00ooVar);
    }

    @NotNull
    public static final <T> Comparator<T> o00ooOo(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(comparator2, "comparator");
        return new Comparator() { // from class: o0OO0oo0.o00oo0O
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o00ooO0.o00ooOoO(comparator, comparator2, obj, obj2);
            }
        };
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Comparator<T> o00ooOo0(Comparator<T> comparator, o0OOOO.o0O00000<? super T, ? super T, Integer> o0o00000) {
        o0ooO.o00oo0O0(comparator, "<this>");
        o0ooO.o00oo0O0(o0o00000, "comparison");
        return new o00oo0O0(comparator, o0o00000);
    }

    public static final int o00ooOoO(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        o0ooO.o00oo0O0(comparator, "$this_thenDescending");
        o0ooO.o00oo0O0(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @NotNull
    public static final <T> Comparator<T> o0O0o(@NotNull final Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(comparator, "comparator");
        return new Comparator() { // from class: o0OO0oo0.o00oo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o00ooO0.o00oo(comparator, obj, obj2);
            }
        };
    }
}
