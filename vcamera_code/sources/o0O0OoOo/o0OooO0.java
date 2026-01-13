package o0O0OoOo;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006!"}, d2 = {"Lo0O0OoOo/o0OooO0;", "Lo0O0OoOo/o0O0o000;", "Lo0O0OoOo/o0O0OOOo;", "filter", "o00oOoOo", "(Lo0O0OoOo/o0O0OOOo;)Lo0O0OoOo/o0OooO0;", "", "other", "", "equals", "", "hashCode", "o00oOo0O", "Z", "o00oOoO", "()Z", "finishPrimaryWithSecondary", "o00oOo0o", "o00oOoOO", "finishSecondaryWithPrimary", "o00oOoO0", "clearTop", "", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", "<init>", "(Ljava/util/Set;ZZZIIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0OooO0 extends o0O0o000 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final boolean f12030o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f12031o00oOo0o;
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Set<o0O0OOOo> f12032o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final boolean f12033o00oOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OooO0(@NotNull Set<o0O0OOOo> set, boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        o0OOOOO0.o0ooO.o00oo0O0(set, "filters");
        this.f12030o00oOo0O = z;
        this.f12031o00oOo0o = z2;
        this.f12033o00oOoO0 = z3;
        this.f12032o00oOoO = o0OO0oO.o0O0oo0o.o0o00oo0(set);
    }

    public /* synthetic */ o0OooO0(Set set, boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3, int i4, o0OOOOO0.o0O00 o0o00) {
        this(set, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? false : z3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) == 0 ? i2 : 0, (i4 & 64) != 0 ? 0.5f : f, (i4 & 128) != 0 ? 3 : i3);
    }

    @Override // o0O0OoOo.o0O0o000
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o0OooO0) && super.equals(obj)) {
            o0OooO0 o0oooo0 = (o0OooO0) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f12032o00oOoO, o0oooo0.f12032o00oOoO) && this.f12030o00oOo0O == o0oooo0.f12030o00oOo0O && this.f12031o00oOo0o == o0oooo0.f12031o00oOo0o && this.f12033o00oOoO0 == o0oooo0.f12033o00oOoO0;
        }
        return false;
    }

    @Override // o0O0OoOo.o0O0o000
    public int hashCode() {
        int hashCode = this.f12032o00oOoO.hashCode();
        int hashCode2 = Boolean.hashCode(this.f12030o00oOo0O);
        int hashCode3 = Boolean.hashCode(this.f12031o00oOo0o);
        return Boolean.hashCode(this.f12033o00oOoO0) + ((hashCode3 + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean o00oOo0o() {
        return this.f12033o00oOoO0;
    }

    public final boolean o00oOoO() {
        return this.f12030o00oOo0O;
    }

    @NotNull
    public final Set<o0O0OOOo> o00oOoO0() {
        return this.f12032o00oOoO;
    }

    public final boolean o00oOoOO() {
        return this.f12031o00oOo0o;
    }

    @NotNull
    public final o0OooO0 o00oOoOo(@NotNull o0O0OOOo o0o0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oooo, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f12032o00oOoO);
        linkedHashSet.add(o0o0oooo);
        return new o0OooO0(o0OO0oO.o0O0oo0o.o0o00oo0(linkedHashSet), this.f12030o00oOo0O, this.f12031o00oOo0o, this.f12033o00oOoO0, this.f12023o00oOOo0, this.f12024o00oOOoO, this.f12025o00oOo00, this.f12026o00oOooO);
    }
}
