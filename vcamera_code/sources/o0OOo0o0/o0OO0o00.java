package o0OOo0o0;

import java.util.ArrayList;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo00O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo00O
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lo0OOo0o0/o0OO0o00;", "E", "", "element", "o00oOoO", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lo0OO0o/oO0Ooooo;", "action", "o00oOo0o", "(Ljava/lang/Object;Lo0OOOO/o00oo;)V", "", "o00oOoOO", "(Ljava/lang/Object;)Ljava/lang/String;", "", "o00oOoO0", "(Ljava/lang/Object;)I", "other", "", "o00oOooO", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "o00oOOo0", "Ljava/lang/Object;", "holder", o00oOOoO.f12961o00oOo00, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO0o00<E> {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f14583o00oOOo0;

    public /* synthetic */ o0OO0o00(Object obj) {
        this.f14583o00oOOo0 = obj;
    }

    public static final /* synthetic */ o0OO0o00 o00oOOo0(Object obj) {
        return new o0OO0o00(obj);
    }

    @NotNull
    public static <E> Object o00oOOoO(@Nullable Object obj) {
        return obj;
    }

    public static Object o00oOo00(Object obj, int i, o0O00 o0o00) {
        if ((i & 1) != 0) {
            return null;
        }
        return obj;
    }

    public static final boolean o00oOo0O(Object obj, Object obj2) {
        return o0ooO.o00oOoO0(obj, obj2);
    }

    public static final void o00oOo0o(Object obj, @NotNull o00oo<? super E, o0OO0o.oO0Ooooo> o00ooVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            o00ooVar.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            o00ooVar.invoke((Object) arrayList.get(size));
        }
    }

    @NotNull
    public static final Object o00oOoO(Object obj, E e) {
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }

    public static int o00oOoO0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String o00oOoOO(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public static boolean o00oOooO(Object obj, Object obj2) {
        return (obj2 instanceof o0OO0o00) && o0ooO.o00oOoO0(obj, ((o0OO0o00) obj2).f14583o00oOOo0);
    }

    public boolean equals(Object obj) {
        return o00oOooO(this.f14583o00oOOo0, obj);
    }

    public int hashCode() {
        return o00oOoO0(this.f14583o00oOOo0);
    }

    public final /* synthetic */ Object o00oOoOo() {
        return this.f14583o00oOOo0;
    }

    public String toString() {
        return o00oOoOO(this.f14583o00oOOo0);
    }
}
