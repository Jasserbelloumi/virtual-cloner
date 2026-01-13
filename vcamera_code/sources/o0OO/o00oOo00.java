package o0OO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import o0OO.o00oo0;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OO0O0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public final class o00oOo00 implements o00oo0, Serializable {
    @NotNull
    private final o00oo0.o00oOOoO element;
    @NotNull
    private final o00oo0 left;

    @o0OOO00({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12990#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Serializable {
        @NotNull
        public static final C0158o00oOOo0 Companion = new C0158o00oOOo0(null);
        private static final long serialVersionUID = 0;
        @NotNull
        private final o00oo0[] elements;

        /* renamed from: o0OO.o00oOo00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0158o00oOOo0 {
            public C0158o00oOOo0() {
            }

            public C0158o00oOOo0(o0O00 o0o00) {
            }
        }

        public o00oOOo0(@NotNull o00oo0[] o00oo0VarArr) {
            o0ooO.o00oo0O0(o00oo0VarArr, "elements");
            this.elements = o00oo0VarArr;
        }

        private final Object readResolve() {
            o00oo0[] o00oo0VarArr = this.elements;
            o00oo0 o00oo0Var = o00oo0O0.INSTANCE;
            for (o00oo0 o00oo0Var2 : o00oo0VarArr) {
                o00oo0Var = o00oo0Var.plus(o00oo0Var2);
            }
            return o00oo0Var;
        }

        @NotNull
        public final o00oo0[] getElements() {
            return this.elements;
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0O00000<String, o00oo0.o00oOOoO, String> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final String invoke(@NotNull String str, @NotNull o00oo0.o00oOOoO o00ooooo2) {
            o0ooO.o00oo0O0(str, "acc");
            o0ooO.o00oo0O0(o00ooooo2, "element");
            if (str.length() == 0) {
                return o00ooooo2.toString();
            }
            return str + ", " + o00ooooo2;
        }
    }

    /* renamed from: o0OO.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0159o00oOo00 extends o0O0OO implements o0O00000<oO0Ooooo, o00oo0.o00oOOoO, oO0Ooooo> {
        public final /* synthetic */ o00oo0[] $elements;
        public final /* synthetic */ o0OO0O0.o00oo00O $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0159o00oOo00(o00oo0[] o00oo0VarArr, o0OO0O0.o00oo00O o00oo00o) {
            super(2);
            this.$elements = o00oo0VarArr;
            this.$index = o00oo00o;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(oO0Ooooo oo0ooooo, o00oo0.o00oOOoO o00ooooo2) {
            invoke2(oo0ooooo, o00ooooo2);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull oO0Ooooo oo0ooooo, @NotNull o00oo0.o00oOOoO o00ooooo2) {
            o0ooO.o00oo0O0(oo0ooooo, "<anonymous parameter 0>");
            o0ooO.o00oo0O0(o00ooooo2, "element");
            o00oo0[] o00oo0VarArr = this.$elements;
            o0OO0O0.o00oo00O o00oo00o = this.$index;
            int i = o00oo00o.element;
            o00oo00o.element = i + 1;
            o00oo0VarArr[i] = o00ooooo2;
        }
    }

    public o00oOo00(@NotNull o00oo0 o00oo0Var, @NotNull o00oo0.o00oOOoO o00ooooo2) {
        o0ooO.o00oo0O0(o00oo0Var, TtmlNode.LEFT);
        o0ooO.o00oo0O0(o00ooooo2, "element");
        this.left = o00oo0Var;
        this.element = o00ooooo2;
    }

    private final boolean contains(o00oo0.o00oOOoO o00ooooo2) {
        return o0ooO.o00oOoO0(get(o00ooooo2.getKey()), o00ooooo2);
    }

    private final boolean containsAll(o00oOo00 o00ooo002) {
        while (contains(o00ooo002.element)) {
            o00oo0 o00oo0Var = o00ooo002.left;
            if (!(o00oo0Var instanceof o00oOo00)) {
                o0ooO.o00oo0(o00oo0Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((o00oo0.o00oOOoO) o00oo0Var);
            }
            o00ooo002 = (o00oOo00) o00oo0Var;
        }
        return false;
    }

    private final int size() {
        int i = 2;
        o00oOo00 o00ooo002 = this;
        while (true) {
            o00oo0 o00oo0Var = o00ooo002.left;
            o00ooo002 = o00oo0Var instanceof o00oOo00 ? (o00oOo00) o00oo0Var : null;
            if (o00ooo002 == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int size = size();
        o00oo0[] o00oo0VarArr = new o00oo0[size];
        o0OO0O0.o00oo00O o00oo00o = new o0OO0O0.o00oo00O();
        fold(oO0Ooooo.f13240o00oOOo0, new C0159o00oOo00(o00oo0VarArr, o00oo00o));
        if (o00oo00o.element == size) {
            return new o00oOOo0(o00oo0VarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof o00oOo00) {
                o00oOo00 o00ooo002 = (o00oOo00) obj;
                if (o00ooo002.size() != size() || !o00ooo002.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "operation");
        return o0o00000.invoke((Object) this.left.fold(r, o0o00000), this.element);
    }

    @Override // o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        o00oOo00 o00ooo003 = this;
        while (true) {
            E e = (E) o00ooo003.element.get(o00ooo002);
            if (e != null) {
                return e;
            }
            o00oo0 o00oo0Var = o00ooo003.left;
            if (!(o00oo0Var instanceof o00oOo00)) {
                return (E) o00oo0Var.get(o00ooo002);
            }
            o00ooo003 = (o00oOo00) o00oo0Var;
        }
    }

    public int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "key");
        if (this.element.get(o00ooo002) != null) {
            return this.left;
        }
        o00oo0 minusKey = this.left.minusKey(o00ooo002);
        return minusKey == this.left ? this : minusKey == o00oo0O0.INSTANCE ? this.element : new o00oOo00(minusKey, this.element);
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o00oo0 plus(@NotNull o00oo0 o00oo0Var) {
        return o00oo0.o00oOOo0.o00oOOo0(this, o00oo0Var);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", o00oOOoO.INSTANCE)) + ']';
    }
}
