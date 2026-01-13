package o0ooOoOO;

import android.util.SparseArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0oO.o0O0o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\bø\u0001\u0000\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/util/SparseArray;", "", "key", "", "o00oOOo0", "value", "Lo0OO0o/oO0Ooooo;", "o00oo0", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "o00oOoo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "o00oOo0O", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "o00oOo0o", "(Landroid/util/SparseArray;ILo0OOOO/o00oOOo0;)Ljava/lang/Object;", "o00oOoO", "o00oOoOO", "o00oo00O", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "o00oOooo", "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", "action", "o00oOooO", "Lo0OO0oO/o0O0o0;", "o00oOoOo", "", "o00oo0OO", "o00oOoO0", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oO00OO0O {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"o0ooOoOO/oO00OO0O$o00oOOo0", "Lo0OO0oO/o0O0o0;", "", "hasNext", "", "nextInt", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0o0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f17178o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f17179o00oo0O0;

        public o00oOOo0(SparseArray<T> sparseArray) {
            this.f17178o00oo0O = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17179o00oo0O0 < this.f17178o00oo0O.size();
        }

        @Override // o0OO0oO.o0O0o0
        public int nextInt() {
            SparseArray<T> sparseArray = this.f17178o00oo0O;
            int i = this.f17179o00oo0O0;
            this.f17179o00oo0O0 = i + 1;
            return sparseArray.keyAt(i);
        }

        public final int o00oOOo0() {
            return this.f17179o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f17179o00oo0O0 = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"o0ooOoOO/oO00OO0O$o00oOOoO", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO<T> implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f17180o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f17181o00oo0O0;

        public o00oOOoO(SparseArray<T> sparseArray) {
            this.f17180o00oo0O = sparseArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17181o00oo0O0 < this.f17180o00oo0O.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f17180o00oo0O;
            int i = this.f17181o00oo0O0;
            this.f17181o00oo0O0 = i + 1;
            return sparseArray.valueAt(i);
        }

        public final int o00oOOo0() {
            return this.f17181o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f17181o00oo0O0 = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean o00oOOo0(@NotNull SparseArray<T> sparseArray, int i) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean o00oOOoO(@NotNull SparseArray<T> sparseArray, int i) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean o00oOo00(@NotNull SparseArray<T> sparseArray, T t) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> T o00oOo0O(@NotNull SparseArray<T> sparseArray, int i, T t) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T o00oOo0o(@NotNull SparseArray<T> sparseArray, int i, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? o00oooo02.invoke() : t;
    }

    public static final <T> boolean o00oOoO(@NotNull SparseArray<T> sparseArray) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> int o00oOoO0(@NotNull SparseArray<T> sparseArray) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean o00oOoOO(@NotNull SparseArray<T> sparseArray) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    @NotNull
    public static final <T> o0O0o0 o00oOoOo(@NotNull SparseArray<T> sparseArray) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return new o00oOOo0(sparseArray);
    }

    @NotNull
    public static final <T> SparseArray<T> o00oOoo0(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        o0ooO.o00oo0O0(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray2.size() + sparseArray.size());
        o00oOooo(sparseArray3, sparseArray);
        o00oOooo(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void o00oOooO(@NotNull SparseArray<T> sparseArray, @NotNull o0O00000<? super Integer, ? super T, o0OO0o.oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        o0ooO.o00oo0O0(o0o00000, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            o0o00000.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> void o00oOooo(@NotNull SparseArray<T> sparseArray, @NotNull SparseArray<T> sparseArray2) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        o0ooO.o00oo0O0(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> void o00oo0(@NotNull SparseArray<T> sparseArray, int i, T t) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    public static final <T> boolean o00oo00O(@NotNull SparseArray<T> sparseArray, int i, T t) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !o0ooO.o00oOoO0(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    @NotNull
    public static final <T> Iterator<T> o00oo0OO(@NotNull SparseArray<T> sparseArray) {
        o0ooO.o00oo0O0(sparseArray, "<this>");
        return new o00oOOoO(sparseArray);
    }
}
