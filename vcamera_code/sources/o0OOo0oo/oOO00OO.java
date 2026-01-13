package o0OOo0oo;

import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OOO0.o00oOo0O;
import o0OOO0.o00oo00O;
import o0OOO0.o00oo0OO;
import o0OOOO.o00oo;
import o0OOo00O.oO0000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lo0OOo0oo/oO0oO000;", "", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "builder", "o00oOOo0", "(Lo0OOOO/o00oo;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oOO00OO {

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
    @o00oo00O(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo0O {
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
            return oOO00OO.o00oOOo0(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0052 -> B:25:0x0055). Please submit an issue!!! */
    @o0OOo00O.oO0000Oo
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOOO.o00oo<? super o0OOo0oo.oO0oO000<? super java.lang.Boolean>, o0OO0o.oO0Ooooo> r4, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r5) {
        /*
            boolean r0 = r5 instanceof o0OOo0oo.oOO00OO.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r5
            o0OOo0oo.oOO00OO$o00oOOo0 r0 = (o0OOo0oo.oOO00OO.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0oo.oOO00OO$o00oOOo0 r0 = new o0OOo0oo.oOO00OO$o00oOOo0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            o0OOOO.o00oo r4 = (o0OOOO.o00oo) r4
            o0OO0o.oo0ooO.o00oo0(r5)
            goto L55
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o0OO0o.oo0ooO.o00oo0(r5)
        L36:
            r0.L$0 = r4
            r0.label = r3
            o0OOo0oo.oOooo r5 = new o0OOo0oo.oOooo
            r5.<init>(r0)
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r2 = move-exception
            r5.o0O00OoO(r2)
        L47:
            java.lang.Object r5 = r5.o0oO0Ooo()
            o0OOO00o.o00oOOo0 r2 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            if (r5 != r2) goto L52
            o0OOO0.o00oo0OO.o00oOo00(r0)
        L52:
            if (r5 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L36
            o0OO0o.oO0Ooooo r4 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0oo.oOO00OO.o00oOOo0(o0OOOO.o00oo, o0OO.o00oOo0O):java.lang.Object");
    }

    @oO0000Oo
    public static final Object o00oOOoO(o00oo<? super oO0oO000<? super Boolean>, oO0Ooooo> o00ooVar, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o0oO0Ooo2;
        do {
            oOooo ooooo = new oOooo(o00ooo0o2);
            try {
                o00ooVar.invoke(ooooo);
            } catch (Throwable th) {
                ooooo.o0O00OoO(th);
            }
            o0oO0Ooo2 = ooooo.o0oO0Ooo();
            if (o0oO0Ooo2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
                o00oo0OO.o00oOo00(o00ooo0o2);
            }
        } while (((Boolean) o0oO0Ooo2).booleanValue());
        return oO0Ooooo.f13240o00oOOo0;
    }
}
