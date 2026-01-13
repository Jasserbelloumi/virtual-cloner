package o0OOo0o0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00oo00O;
import o0OOOOO0.o0ooO;
import o0OOo0o0.oO000O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo00O
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0010\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lo0OOo0o0/oO000O0O;", "Lo0OOo0o0/oO000O0;", "S", "", "", "o00oOoOO", "(Ljava/lang/Object;)Ljava/lang/String;", "", "o00oOoO0", "(Ljava/lang/Object;)I", "other", "", "o00oOo00", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "o00oOOo0", "Ljava/lang/Object;", "value", "o00oOoO", "(Ljava/lang/Object;)Z", "isClosed", "o00oOo0o", "(Ljava/lang/Object;)Lo0OOo0o0/oO000O0;", "getSegment$annotations", "()V", "segment", o00oOOoO.f12961o00oOo00, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO000O0O<S extends oO000O0<S>> {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f14648o00oOOo0;

    public /* synthetic */ oO000O0O(Object obj) {
        this.f14648o00oOOo0 = obj;
    }

    public static final /* synthetic */ oO000O0O o00oOOo0(Object obj) {
        return new oO000O0O(obj);
    }

    @NotNull
    public static <S extends oO000O0<S>> Object o00oOOoO(@Nullable Object obj) {
        return obj;
    }

    public static boolean o00oOo00(Object obj, Object obj2) {
        return (obj2 instanceof oO000O0O) && o0ooO.o00oOoO0(obj, ((oO000O0O) obj2).f14648o00oOOo0);
    }

    public static /* synthetic */ void o00oOo0O() {
    }

    @NotNull
    public static final S o00oOo0o(Object obj) {
        oO0o0o oo0o0o;
        oo0o0o = o0OO000o.f14577o00oOOoO;
        if (obj != oo0o0o) {
            if (obj != null) {
                return (S) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean o00oOoO(Object obj) {
        oO0o0o oo0o0o;
        oo0o0o = o0OO000o.f14577o00oOOoO;
        return obj == oo0o0o;
    }

    public static int o00oOoO0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String o00oOoOO(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public static final boolean o00oOooO(Object obj, Object obj2) {
        return o0ooO.o00oOoO0(obj, obj2);
    }

    public boolean equals(Object obj) {
        return o00oOo00(this.f14648o00oOOo0, obj);
    }

    public int hashCode() {
        return o00oOoO0(this.f14648o00oOOo0);
    }

    public final /* synthetic */ Object o00oOoOo() {
        return this.f14648o00oOOo0;
    }

    public String toString() {
        return o00oOoOO(this.f14648o00oOOo0);
    }
}
