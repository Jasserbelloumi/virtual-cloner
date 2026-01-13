package o0ooOoOO;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO0oO.o0O0o0;
import o0OO0oO.o0oOo0O0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0087\b\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aH\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0087\bø\u0001\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "o00oOOo0", "", "value", "Lo0OO0o/oO0Ooooo;", "o00oo0", "other", "o00oOoo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "defaultValue", "o00oOo0O", "Lkotlin/Function0;", "o00oOo0o", "o00oOoO", "o00oOoOO", "o00oo00O", "o00oOooo", "Lkotlin/Function2;", "Lo0OO0o/o0O0o00O;", "name", "action", "o00oOooO", "Lo0OO0oO/o0O0o0;", "o00oOoOo", "Lo0OO0oO/o0oOo0O0;", "o00oo0OO", "o00oOoO0", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oO00OOOo {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"o0ooOoOO/oO00OOOo$o00oOOo0", "Lo0OO0oO/o0O0o0;", "", "hasNext", "", "nextInt", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0o0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f17186o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f17187o00oo0O0;

        public o00oOOo0(SparseLongArray sparseLongArray) {
            this.f17186o00oo0O = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17187o00oo0O0 < this.f17186o00oo0O.size();
        }

        @Override // o0OO0oO.o0O0o0
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f17186o00oo0O;
            int i = this.f17187o00oo0O0;
            this.f17187o00oo0O0 = i + 1;
            return sparseLongArray.keyAt(i);
        }

        public final int o00oOOo0() {
            return this.f17187o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f17187o00oo0O0 = i;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"o0ooOoOO/oO00OOOo$o00oOOoO", "Lo0OO0oO/o0oOo0O0;", "", "hasNext", "", "nextLong", "", "o00oo0O0", "I", "o00oOOo0", "()I", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)V", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0oOo0O0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f17188o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f17189o00oo0O0;

        public o00oOOoO(SparseLongArray sparseLongArray) {
            this.f17188o00oo0O = sparseLongArray;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17189o00oo0O0 < this.f17188o00oo0O.size();
        }

        @Override // o0OO0oO.o0oOo0O0
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f17188o00oo0O;
            int i = this.f17189o00oo0O0;
            this.f17189o00oo0O0 = i + 1;
            return sparseLongArray.valueAt(i);
        }

        public final int o00oOOo0() {
            return this.f17189o00oo0O0;
        }

        public final void o00oOOoO(int i) {
            this.f17189o00oo0O0 = i;
        }
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oOOo0(@NotNull SparseLongArray sparseLongArray, int i) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oOOoO(@NotNull SparseLongArray sparseLongArray, int i) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oOo00(@NotNull SparseLongArray sparseLongArray, long j) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oOo0O(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oOo0o(@NotNull SparseLongArray sparseLongArray, int i, @NotNull o0OOOO.o00oOOo0<Long> o00oooo02) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        o0ooO.o00oo0O0(o00oooo02, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : o00oooo02.invoke().longValue();
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oOoO(@NotNull SparseLongArray sparseLongArray) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int o00oOoO0(@NotNull SparseLongArray sparseLongArray) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oOoOO(@NotNull SparseLongArray sparseLongArray) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final o0O0o0 o00oOoOo(@NotNull SparseLongArray sparseLongArray) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return new o00oOOo0(sparseLongArray);
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final SparseLongArray o00oOoo0(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        o0ooO.o00oo0O0(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        o00oOooo(sparseLongArray3, sparseLongArray);
        o00oOooo(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void o00oOooO(@NotNull SparseLongArray sparseLongArray, @NotNull o0O00000<? super Integer, ? super Long, o0OO0o.oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        o0ooO.o00oo0O0(o0o00000, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            o0o00000.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void o00oOooo(@NotNull SparseLongArray sparseLongArray, @NotNull SparseLongArray sparseLongArray2) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        o0ooO.o00oo0O0(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void o00oo0(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00oo00O(@NotNull SparseLongArray sparseLongArray, int i, long j) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @o0OOooO0(18)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final o0oOo0O0 o00oo0OO(@NotNull SparseLongArray sparseLongArray) {
        o0ooO.o00oo0O0(sparseLongArray, "<this>");
        return new o00oOOoO(sparseLongArray);
    }
}
