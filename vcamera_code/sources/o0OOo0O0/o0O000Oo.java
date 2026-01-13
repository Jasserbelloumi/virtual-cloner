package o0OOo0O0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOO0.o00oOo0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lo0OOo0O0/o0O000Oo;", "E", "", "", "o00oOOo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", o00oOOoO.f12961o00oOo00, "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0O000Oo<E> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        /* renamed from: o0OOo0O0.o0O000Oo$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0179o00oOOo0<E> extends o00oOo0O {
            public Object L$0;
            public int label;
            public /* synthetic */ Object result;

            public C0179o00oOOo0(o0OO.o00oOo0O<? super C0179o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOOo0.o00oOOo0(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        @o0OOOO0o.o00oo0OO(name = "next")
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object o00oOOo0(o0OOo0O0.o0O000Oo r4, o0OO.o00oOo0O r5) {
            /*
                boolean r0 = r5 instanceof o0OOo0O0.o0O000Oo.o00oOOo0.C0179o00oOOo0
                if (r0 == 0) goto L13
                r0 = r5
                o0OOo0O0.o0O000Oo$o00oOOo0$o00oOOo0 r0 = (o0OOo0O0.o0O000Oo.o00oOOo0.C0179o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0O0.o0O000Oo$o00oOOo0$o00oOOo0 r0 = new o0OOo0O0.o0O000Oo$o00oOOo0$o00oOOo0
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r4 = r0.L$0
                o0OOo0O0.o0O000Oo r4 = (o0OOo0O0.o0O000Oo) r4
                o0OO0o.oo0ooO.o00oo0(r5)
                goto L41
            L2b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L33:
                o0OO0o.oo0ooO.o00oo0(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.o00oOOo0(r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L4e
                java.lang.Object r4 = r4.next()
                return r4
            L4e:
                o0OOo0O0.o0O00OOO r4 = new o0OOo0O0.o0O00OOO
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O000Oo.o00oOOo0.o00oOOo0(o0OOo0O0.o0O000Oo, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    E next();

    @Nullable
    Object o00oOOo0(@NotNull o0OO.o00oOo0O<? super Boolean> o00ooo0o2);

    @o0OOOO0o.o00oo0OO(name = "next")
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object o00oOOoO(o0OO.o00oOo0O o00ooo0o2);
}
