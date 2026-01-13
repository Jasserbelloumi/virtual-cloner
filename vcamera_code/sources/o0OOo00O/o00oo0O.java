package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import o0OOO0.o00oOo0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lo0OOo00O/o0OoOoO;", "deferreds", "", o0OO000o.o00oOOoO.f12961o00oOo00, "([Lo0OOo00O/o0OoOoO;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "o00oOOo0", "(Ljava/util/Collection;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo00O/ooOOOOoo;", "jobs", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "([Lo0OOo00O/ooOOOOoo;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOo00", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o00oo0O {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo0O {
        public int I$0;
        public int I$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o00oo0O.o00oOooO(null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o00oOo0O {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o00oo0O.o00oOo00(null, this);
        }
    }

    @Nullable
    public static final <T> Object o00oOOo0(@NotNull Collection<? extends o0OoOoO<? extends T>> collection, @NotNull o0OO.o00oOo0O<? super List<? extends T>> o00ooo0o2) {
        if (collection.isEmpty()) {
            return o0OO0oO.o0ooO.INSTANCE;
        }
        Object[] array = collection.toArray(new o0OoOoO[0]);
        if (array != null) {
            return new o00oo0O0((o0OoOoO[]) array).o00oOOoO(o00ooo0o2);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Nullable
    public static final <T> Object o00oOOoO(@NotNull o0OoOoO<? extends T>[] o0oooooArr, @NotNull o0OO.o00oOo0O<? super List<? extends T>> o00ooo0o2) {
        return o0oooooArr.length == 0 ? o0OO0oO.o0ooO.INSTANCE : new o00oo0O0(o0oooooArr).o00oOOoO(o00ooo0o2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOo00(@org.jetbrains.annotations.NotNull java.util.Collection<? extends o0OOo00O.ooOOOOoo> r4, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r5) {
        /*
            boolean r0 = r5 instanceof o0OOo00O.o00oo0O.o00oOOoO
            if (r0 == 0) goto L13
            r0 = r5
            o0OOo00O.o00oo0O$o00oOOoO r0 = (o0OOo00O.o00oo0O.o00oOOoO) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo00O.o00oo0O$o00oOOoO r0 = new o0OOo00O.o00oo0O$o00oOOoO
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            o0OO0o.oo0ooO.o00oo0(r5)
            goto L3a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o0OO0o.oo0ooO.o00oo0(r5)
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            o0OOo00O.ooOOOOoo r5 = (o0OOo00O.ooOOOOoo) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.o0oO0Ooo(r0)
            if (r5 != r1) goto L3a
            return r1
        L51:
            o0OO0o.oO0Ooooo r4 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o00oo0O.o00oOo00(java.util.Collection, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:19:0x0054). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOooO(@org.jetbrains.annotations.NotNull o0OOo00O.ooOOOOoo[] r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
        /*
            boolean r0 = r7 instanceof o0OOo00O.o00oo0O.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r7
            o0OOo00O.o00oo0O$o00oOOo0 r0 = (o0OOo00O.o00oo0O.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo00O.o00oo0O$o00oOOo0 r0 = new o0OOo00O.o00oo0O$o00oOOo0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$0
            o0OOo00O.ooOOOOoo[] r4 = (o0OOo00O.ooOOOOoo[]) r4
            o0OO0o.oo0ooO.o00oo0(r7)
            r7 = r4
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            o0OO0o.oo0ooO.o00oo0(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L41:
            if (r2 >= r6) goto L56
            r4 = r7[r2]
            r0.L$0 = r7
            r0.I$0 = r2
            r0.I$1 = r6
            r0.label = r3
            java.lang.Object r4 = r4.o0oO0Ooo(r0)
            if (r4 != r1) goto L54
            return r1
        L54:
            int r2 = r2 + r3
            goto L41
        L56:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o00oo0O.o00oOooO(o0OOo00O.ooOOOOoo[], o0OO.o00oOo0O):java.lang.Object");
    }
}
