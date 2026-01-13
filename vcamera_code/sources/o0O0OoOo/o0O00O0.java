package o0O0OoOo;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0O0OoOo/o0O00O0;", "Lo0O0OoOo/o0O0oo0o;", "Lo0O0OoOo/o0O00;", "filter", "o00oOo00", "(Lo0O0OoOo/o0O00;)Lo0O0OoOo/o0O00O0;", "", "other", "", "equals", "", "hashCode", "o00oOOo0", "Z", "()Z", "alwaysExpand", "", o00oOOoO.f12961o00oOo00, "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "<init>", "(Ljava/util/Set;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O00O0 extends o0O0oo0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f11993o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Set<o0O00> f11994o00oOOoO;

    public o0O00O0(@NotNull Set<o0O00> set, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "filters");
        this.f11993o00oOOo0 = z;
        this.f11994o00oOOoO = o0OO0oO.o0O0oo0o.o0o00oo0(set);
    }

    public /* synthetic */ o0O00O0(Set set, boolean z, int i, o0OOOOO0.o0O00 o0o00) {
        this(set, (i & 2) != 0 ? false : z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00O0) {
            o0O00O0 o0o00o0 = (o0O00O0) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f11994o00oOOoO, o0o00o0.f11994o00oOOoO) && this.f11993o00oOOo0 == o0o00o0.f11993o00oOOo0;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f11993o00oOOo0) + (this.f11994o00oOOoO.hashCode() * 31);
    }

    public final boolean o00oOOo0() {
        return this.f11993o00oOOo0;
    }

    @NotNull
    public final Set<o0O00> o00oOOoO() {
        return this.f11994o00oOOoO;
    }

    @NotNull
    public final o0O00O0 o00oOo00(@NotNull o0O00 o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f11994o00oOOoO);
        linkedHashSet.add(o0o00);
        return new o0O00O0(o0OO0oO.o0O0oo0o.o0o00oo0(linkedHashSet), this.f11993o00oOOo0);
    }
}
