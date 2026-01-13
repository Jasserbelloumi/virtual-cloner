package o0OO0oO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
@o0OOOOO0.o0OOO00({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes3.dex */
public class o0oO0O0o extends o0O00oO0 {
    @NotNull
    public static final <R> List<R> o0O0Ooo(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cls, "klass");
        return (List) o0O0OooO(iterable, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C o0O0OooO(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o0O0o0(Iterable iterable, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0oo0o.o0ooOOOO(iterable, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o0O0o00(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0O0O(iterable);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o0O0o000(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0O0(iterable);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o0O0o00O(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0O(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o0O0o00o(Iterable<? extends T> iterable, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = o0O0O0O.o00oOOo0(iterable, "<this>", o00ooVar, "selector");
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
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable o0O0o0O(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0o0O(iterable);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Double o0O0o0OO(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0o0o(iterable);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO0o.o0OO00o0(version = "1.1")
    public static final /* synthetic */ Float o0O0o0Oo(Iterable iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return o0O0oo0o.o0Oo0oO0(iterable);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object o0O0o0o(Iterable iterable, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0oo0o.o0Oo0ooo(iterable, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o0O0o0o0(Iterable<? extends T> iterable, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        Iterator o00oOOo02 = o0O0O0O.o00oOOo0(iterable, "<this>", o00ooVar, "selector");
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

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigDecimal")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> BigDecimal o0O0o0oO(Iterable<? extends T> iterable, o0OOOO.o00oo<? super T, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(o00ooVar.invoke((T) it.next()));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfBigInteger")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> BigInteger o0O0o0oo(Iterable<? extends T> iterable, o0OOOO.o00oo<? super T, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(o00ooVar.invoke((T) it.next()));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> o0O0oo0O(@NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return (SortedSet) o0O0oo0o.o0o00OoO(iterable, new TreeSet());
    }

    public static final <T> void o0oOo0O0(@NotNull List<T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "<this>");
        Collections.reverse(list);
    }

    @NotNull
    public static final <T> SortedSet<T> oooOO0(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (SortedSet) o0O0oo0o.o0o00OoO(iterable, new TreeSet(comparator));
    }
}
