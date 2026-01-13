package o0OOOoO0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import o0OO0o.o0O0o;
import o0OO0o.o0O0o000;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1415#2,14:173\n1821#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes3.dex */
public class oO000OOo extends oO0OoOO0 {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o00oo<Object, Boolean> {
        public final /* synthetic */ Class<R> $klass;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(Class<R> cls) {
            super(1);
            this.$klass = cls;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@Nullable Object obj) {
            return Boolean.valueOf(this.$klass.isInstance(obj));
        }
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o00oo(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0O0oOoO(oo000);
    }

    @NotNull
    public static final <R> oO000<R> o00oo0oO(@NotNull oO000<?> oo000, @NotNull Class<R> cls) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(cls, "klass");
        oO000<R> o0oO0Ooo2 = ooOOOOoo.o0oO0Ooo(oo000, new o00oOOo0(cls));
        o0ooO.o00oo0(o0oO0Ooo2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return o0oO0Ooo2;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o00ooO(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0OO00o0(oo000);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o00ooO0(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0O0oo0(oo000);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o00ooO00(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0O0oOoo(oo000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o00ooO0O(oO000<? extends T> oo000, o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            Object obj = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(obj3);
                    obj = obj2;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (o00oOOo02.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o00ooO0o(oO000 oo000, Comparator comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return ooOOOOoo.o0O0ooo0(oo000, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o00ooOO(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0OO00o(oo000);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o00ooOO0(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return ooOOOOoo.o0OoOoO(oo000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o00ooOOo(oO000<? extends T> oo000, o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = oO0Oo0oo.o00oOOo0(oo000, "<this>", o00ooVar, "selector");
        if (o00oOOo02.hasNext()) {
            Object obj = (Object) o00oOOo02.next();
            if (o00oOOo02.hasNext()) {
                R invoke = o00ooVar.invoke(obj);
                Object obj2 = obj;
                do {
                    Object obj3 = (Object) o00oOOo02.next();
                    R invoke2 = o00ooVar.invoke(obj3);
                    obj = obj2;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        obj = (Object) obj3;
                    }
                    obj2 = obj;
                } while (o00oOOo02.hasNext());
                return obj;
            }
            return obj;
        }
        return null;
    }

    @o00oo00O
    @o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final <T> BigDecimal o00ooOo(oO000<? extends T> oo000, o00oo<? super T, ? extends BigDecimal> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(o00ooVar.invoke((T) it.next()));
            o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o00ooOo0(oO000 oo000, Comparator comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return ooOOOOoo.o0OO0OoO(oo000, comparator);
    }

    @o00oo00O
    @o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final <T> BigInteger o00ooOoO(oO000<? extends T> oo000, o00oo<? super T, ? extends BigInteger> o00ooVar) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = oo000.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(o00ooVar.invoke((T) it.next()));
            o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> o00ooOoo(@NotNull oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        return (SortedSet) ooOOOOoo.o0OOo00O(oo000, new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> o00ooo00(@NotNull oO000<? extends T> oo000, @NotNull Comparator<? super T> comparator) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(comparator, "comparator");
        return (SortedSet) ooOOOOoo.o0OOo00O(oo000, new TreeSet(comparator));
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C o0O0o(@NotNull oO000<?> oo000, @NotNull C c, @NotNull Class<R> cls) {
        o0ooO.o00oo0O0(oo000, "<this>");
        o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0ooO.o00oo0O0(cls, "klass");
        for (Object obj : oo000) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }
}
