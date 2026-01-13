package o0OO0oO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O00O extends o0O00O0o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements Iterable<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<Iterator<T>> f13350o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o00oOOo0<? extends Iterator<? extends T>> o00oooo02) {
            this.f13350o00oo0O0 = o00oooo02;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.f13350o00oo0O0.invoke();
        }
    }

    @o0OO0o.o0O
    public static final <T> int o0O000(@NotNull Iterable<? extends T> iterable, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> Iterable<T> o0O0000o(o0OOOO.o00oOOo0<? extends Iterator<? extends T>> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "iterator");
        return new o00oOOo0(o00oooo02);
    }

    @o0OO0o.o0O
    @Nullable
    public static final <T> Integer o0O000O(@NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    public static final <T, R> o0OO0o.o0O0o00<List<T>, List<R>> o0O000Oo(@NotNull Iterable<? extends o0OO0o.o0O0o00<? extends T, ? extends R>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        int o0O0002 = o0O000(iterable, 10);
        ArrayList arrayList = new ArrayList(o0O0002);
        ArrayList arrayList2 = new ArrayList(o0O0002);
        for (o0OO0o.o0O0o00<? extends T, ? extends R> o0o0o00 : iterable) {
            arrayList.add(o0o0o00.getFirst());
            arrayList2.add(o0o0o00.getSecond());
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final <T> List<T> o0OoOoOo(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            o0O00o00.o0O00OOO(arrayList, iterable2);
        }
        return arrayList;
    }
}
