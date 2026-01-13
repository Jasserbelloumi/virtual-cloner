package o0OOoO00;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OOo0oo.oOO00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\n\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lo0OOoO00/o00oo0O;", "", "owner", "", "o00oOOo0", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOo00", o00oOOoO.f12961o00oOo00, "isLocked", "()Z", "Lo0OOo0oo/oOO00000;", "o00oOooO", "()Lo0OOo0oo/oOO00000;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o00oo0O {

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void o00oOOo0() {
        }

        public static /* synthetic */ Object o00oOOoO(o00oo0O o00oo0o2, Object obj, o00oOo0O o00ooo0o2, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return o00oo0o2.o00oOo0O(obj, o00ooo0o2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean o00oOo00(o00oo0O o00oo0o2, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return o00oo0o2.o00oOOo0(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void o00oOooO(o00oo0O o00oo0o2, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            o00oo0o2.o00oOOoO(obj);
        }
    }

    boolean isLocked();

    boolean o00oOOo0(@Nullable Object obj);

    void o00oOOoO(@Nullable Object obj);

    boolean o00oOo00(@NotNull Object obj);

    @Nullable
    Object o00oOo0O(@Nullable Object obj, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2);

    @NotNull
    oOO00000<Object, o00oo0O> o00oOooO();
}
