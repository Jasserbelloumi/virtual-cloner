package o0O0o0oo;

import android.support.v4.media.o00oOo0O;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lo0O0o0oo/o0O0OO0;", "", "Ljava/lang/Class;", "o00oOOo0", o00oOOoO.f12961o00oOo00, "clazz", IconCompat.f2396o00ooO0o, "o00oOo00", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Class;", "o00oOo0O", "()Ljava/lang/Class;", "Ljava/lang/Object;", "o00oOo0o", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;)V", "adapter_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class o0O0OO0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Class<?> f12640o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object f12641o00oOOoO;

    public o0O0OO0(@NotNull Class<?> cls, @NotNull Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "clazz");
        o0OOOOO0.o0ooO.o00oo0O0(obj, IconCompat.f2396o00ooO0o);
        this.f12640o00oOOo0 = cls;
        this.f12641o00oOOoO = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0O0OO0 o00oOooO(o0O0OO0 o0o0oo0, Class cls, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            cls = o0o0oo0.f12640o00oOOo0;
        }
        if ((i & 2) != 0) {
            obj = o0o0oo0.f12641o00oOOoO;
        }
        return o0o0oo0.o00oOo00(cls, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0OO0) {
            o0O0OO0 o0o0oo0 = (o0O0OO0) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f12640o00oOOo0, o0o0oo0.f12640o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f12641o00oOOoO, o0o0oo0.f12641o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        return this.f12641o00oOOoO.hashCode() + (this.f12640o00oOOo0.hashCode() * 31);
    }

    @NotNull
    public final Class<?> o00oOOo0() {
        return this.f12640o00oOOo0;
    }

    @NotNull
    public final Object o00oOOoO() {
        return this.f12641o00oOOoO;
    }

    @NotNull
    public final o0O0OO0 o00oOo00(@NotNull Class<?> cls, @NotNull Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "clazz");
        o0OOOOO0.o0ooO.o00oo0O0(obj, IconCompat.f2396o00ooO0o);
        return new o0O0OO0(cls, obj);
    }

    @NotNull
    public final Class<?> o00oOo0O() {
        return this.f12640o00oOOo0;
    }

    @NotNull
    public final Object o00oOo0o() {
        return this.f12641o00oOOoO;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ItemEvent(clazz=");
        o00oOOo02.append(this.f12640o00oOOo0);
        o00oOOo02.append(", obj=");
        o00oOOo02.append(this.f12641o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
