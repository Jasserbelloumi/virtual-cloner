package o0OOo0O0;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0OO000;
import o0OOo00O.oO0000Oo;
import o0OOo0o0.oO0Ooooo;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000eH'J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lo0OOo0O0/o0OooO0;", "E", "", "element", "Lo0OO0o/oO0Ooooo;", "o00ooOo", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0O00;", "o00oo0o0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "o00ooo0", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "handler", "o00oOooO", "offer", "(Ljava/lang/Object;)Z", "o00oooO", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lo0OOo0oo/oOO00000;", "o00oo0O", "()Lo0OOo0oo/oOO00000;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0OooO0<E> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static /* synthetic */ boolean o00oOOo0(o0OooO0 o0oooo0, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return o0oooo0.o00ooo0(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @oO0000Oo
        public static /* synthetic */ void o00oOOoO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean o00oOo00(@NotNull o0OooO0<? super E> o0oooo0, E e) {
            Object o00oo0o02 = o0oooo0.o00oo0o0(e);
            if (o0O00.o00oo00O(o00oo0o02)) {
                return true;
            }
            Throwable o00oOo0o2 = o0O00.o00oOo0o(o00oo0o02);
            if (o00oOo0o2 == null) {
                return false;
            }
            throw oO0Ooooo.o00oo0O0(o00oOo0o2);
        }
    }

    @oO0000Oo
    void o00oOooO(@NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar);

    @NotNull
    oOO00000<E, o0OooO0<E>> o00oo0O();

    @NotNull
    Object o00oo0o0(E e);

    @Nullable
    Object o00ooOo(E e, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2);

    boolean o00ooo0(@Nullable Throwable th);

    boolean o00oooO();

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e);
}
