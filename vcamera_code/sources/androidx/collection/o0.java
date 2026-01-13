package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O0o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a/\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aQ\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0086\b\u001a\u0016\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010 \u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/o00ooO;", "", "key", "", "o00oOOo0", "value", "Lo0OO0o/oO0Ooooo;", "o00oOoOo", "(Landroidx/collection/o00ooO;ILjava/lang/Object;)V", "other", "o00oOoO", "defaultValue", "o00oOo00", "(Landroidx/collection/o00ooO;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "o00oOooO", "(Landroidx/collection/o00ooO;ILo0OOOO/o00oOOo0;)Ljava/lang/Object;", "o00oOo0o", "o00oOoOO", "(Landroidx/collection/o00ooO;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", "action", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OO0oO/o0O0o0;", "o00oOoO0", "", "o00oOoo0", "o00oOo0O", "(Landroidx/collection/o00ooO;)I", "size", "collection-ktx"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/collection/o0$o00oOOo0", "Lo0OO0oO/o0O0o0;", "", "hasNext", "", "nextInt", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "collection-ktx"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0o0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00ooO f1661o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f1662o00oo0O0;

        public o00oOOo0(o00ooO<T> o00ooo) {
            this.f1661o00oo0O = o00ooo;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1662o00oo0O0 < this.f1661o00oo0O.o00ooO();
        }

        @Override // o0OO0oO.o0O0o0
        public int nextInt() {
            o00ooO o00ooo = this.f1661o00oo0O;
            int i = this.f1662o00oo0O0;
            this.f1662o00oo0O0 = i + 1;
            return o00ooo.o00oo0O(i);
        }

        public final int o00oOOo0() {
            return this.f1662o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f1662o00oo0O0 = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/collection/o0$o00oOOoO", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "collection-ktx"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO<T> implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00ooO f1663o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f1664o00oo0O0;

        public o00oOOoO(o00ooO<T> o00ooo) {
            this.f1663o00oo0O = o00ooo;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1664o00oo0O0 < this.f1663o00oo0O.o00ooO();
        }

        @Override // java.util.Iterator
        public T next() {
            o00ooO o00ooo = this.f1663o00oo0O;
            int i = this.f1664o00oo0O0;
            this.f1664o00oo0O0 = i + 1;
            return (T) o00ooo.o00ooOO0(i);
        }

        public final int o00oOOo0() {
            return this.f1664o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f1664o00oo0O0 = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean o00oOOo0(@NotNull o00ooO<T> o00ooo, int i) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return o00ooo.o00oOo0o(i);
    }

    public static final <T> void o00oOOoO(@NotNull o00ooO<T> o00ooo, @NotNull o0O00000<? super Integer, ? super T, oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        o0ooO.o00oo0O(o0o00000, "action");
        int o00ooO2 = o00ooo.o00ooO();
        for (int i = 0; i < o00ooO2; i++) {
            o0o00000.invoke(Integer.valueOf(o00ooo.o00oo0O(i)), o00ooo.o00ooOO0(i));
        }
    }

    public static final <T> T o00oOo00(@NotNull o00ooO<T> o00ooo, int i, T t) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return o00ooo.o00oo00O(i, t);
    }

    public static final <T> int o00oOo0O(@NotNull o00ooO<T> o00ooo) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return o00ooo.o00ooO();
    }

    public static final <T> boolean o00oOo0o(@NotNull o00ooO<T> o00ooo) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return !o00ooo.o00oo0O0();
    }

    @NotNull
    public static final <T> o00ooO<T> o00oOoO(@NotNull o00ooO<T> o00ooo, @NotNull o00ooO<T> o00ooo2) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        o0ooO.o00oo0O(o00ooo2, "other");
        o00ooO<T> o00ooo3 = new o00ooO<>(o00ooo2.o00ooO() + o00ooo.o00ooO());
        o00ooo3.o00oo0o0(o00ooo);
        o00ooo3.o00oo0o0(o00ooo2);
        return o00ooo3;
    }

    @NotNull
    public static final <T> o0O0o0 o00oOoO0(@NotNull o00ooO<T> o00ooo) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return new o00oOOo0(o00ooo);
    }

    @o0OO0o.o0O0o(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean o00oOoOO(@NotNull o00ooO<T> o00ooo, int i, T t) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return o00ooo.o0O0o(i, t);
    }

    public static final <T> void o00oOoOo(@NotNull o00ooO<T> o00ooo, int i, T t) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        o00ooo.o00oo0Oo(i, t);
    }

    @NotNull
    public static final <T> Iterator<T> o00oOoo0(@NotNull o00ooO<T> o00ooo) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        return new o00oOOoO(o00ooo);
    }

    public static final <T> T o00oOooO(@NotNull o00ooO<T> o00ooo, int i, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O(o00ooo, "receiver$0");
        o0ooO.o00oo0O(o00oooo02, "defaultValue");
        T o00oOooo2 = o00ooo.o00oOooo(i);
        return o00oOooo2 != null ? o00oOooo2 : o00oooo02.invoke();
    }
}
