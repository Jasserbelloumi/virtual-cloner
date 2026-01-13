package o0OO0oO;

import java.util.Iterator;
import java.util.List;
import o0OO0o.oO0Ooooo;
import o0OOOoO0.oO000;
import o0OOOoO0.oO000O0O;
import o0OOOoO0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0OOO0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0OOO0.o0O0o implements o0OOOO.o0O00000<oO000O0O<? super List<? extends T>>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ Iterator<T> $iterator;
        public final /* synthetic */ boolean $partialWindows;
        public final /* synthetic */ boolean $reuseBuffer;
        public final /* synthetic */ int $size;
        public final /* synthetic */ int $step;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$size = i;
            this.$step = i2;
            this.$iterator = it;
            this.$reuseBuffer = z;
            this.$partialWindows = z2;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((oO000O0O) ((oO000O0O) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull oO000O0O<? super List<? extends T>> oo000o0o, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(oo000o0o, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a2 -> B:16:0x0056). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x011c -> B:63:0x011f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x014a -> B:76:0x014d). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OO0oO.o0OOO0.o00oOOo0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements oO000<List<? extends T>> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ oO000 f13378o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f13379o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ int f13380o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ boolean f13381o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ boolean f13382o00oOooO;

        public o00oOOoO(oO000 oo000, int i, int i2, boolean z, boolean z2) {
            this.f13378o00oOOo0 = oo000;
            this.f13379o00oOOoO = i;
            this.f13380o00oOo00 = i2;
            this.f13382o00oOooO = z;
            this.f13381o00oOo0O = z2;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<List<? extends T>> iterator() {
            return o0OOO0.o00oOOoO(this.f13378o00oOOo0.iterator(), this.f13379o00oOOoO, this.f13380o00oOo00, this.f13382o00oOooO, this.f13381o00oOo0O);
        }
    }

    public static final void o00oOOo0(int i, int i2) {
        String o00oOOo02;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            o00oOOo02 = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            o00oOOo02 = o00ooO0.o00oOoO.o00oOOo0("size ", i, " must be greater than zero.");
        }
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @NotNull
    public static final <T> Iterator<List<T>> o00oOOoO(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        o0OOOOO0.o0ooO.o00oo0O0(it, "iterator");
        return !it.hasNext() ? o0O0O0o0.f13352o00oo0O0 : oO0o0o.o00oOOo0(new o00oOOo0(i, i2, it, z2, z, null));
    }

    @NotNull
    public static final <T> oO000<List<T>> o00oOo00(@NotNull oO000<? extends T> oo000, int i, int i2, boolean z, boolean z2) {
        o0OOOOO0.o0ooO.o00oo0O0(oo000, "<this>");
        o00oOOo0(i, i2);
        return new o00oOOoO(oo000, i, i2, z, z2);
    }
}
