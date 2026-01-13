package o0OO0o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo00O
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public final class oo0oO0<T> implements Serializable {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    @Nullable
    private final Object value;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @o0OOOO0o.o00oo0OO(name = "failure")
        @o0OOO0OO.o00oo00O
        public final <T> Object o00oOOo0(Throwable th) {
            o0OOOOO0.o0ooO.o00oo0O0(th, "exception");
            return oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
        }

        @o0OOOO0o.o00oo0OO(name = FirebaseAnalytics.Param.SUCCESS)
        @o0OOO0OO.o00oo00O
        public final <T> Object o00oOOoO(T t) {
            return oo0oO0.m7constructorimpl(t);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Serializable {
        @o0OOOO0o.o00oOoO
        @NotNull
        public final Throwable exception;

        public o00oOOoO(@NotNull Throwable th) {
            o0OOOOO0.o0ooO.o00oo0O0(th, "exception");
            this.exception = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof o00oOOoO) && o0OOOOO0.o0ooO.o00oOoO0(this.exception, ((o00oOOoO) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Failure(");
            o00oOOo02.append(this.exception);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    @o0O
    private /* synthetic */ oo0oO0(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ oo0oO0 m6boximpl(Object obj) {
        return new oo0oO0(obj);
    }

    @o0O
    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m7constructorimpl(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m8equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof oo0oO0) && o0OOOOO0.o0ooO.o00oOoO0(obj, ((oo0oO0) obj2).m16unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m9equalsimpl0(Object obj, Object obj2) {
        return o0OOOOO0.o0ooO.o00oOoO0(obj, obj2);
    }

    @Nullable
    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m10exceptionOrNullimpl(Object obj) {
        if (obj instanceof o00oOOoO) {
            return ((o00oOOoO) obj).exception;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOO0OO.o00oo00O
    /* renamed from: getOrNull-impl  reason: not valid java name */
    private static final T m11getOrNullimpl(Object obj) {
        if (m13isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @o0O
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m12hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m13isFailureimpl(Object obj) {
        return obj instanceof o00oOOoO;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m14isSuccessimpl(Object obj) {
        return !(obj instanceof o00oOOoO);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m15toStringimpl(Object obj) {
        if (obj instanceof o00oOOoO) {
            return ((o00oOOoO) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m8equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m12hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m15toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m16unboximpl() {
        return this.value;
    }
}
