package o0O0OoOo;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001e"}, d2 = {"Lo0O0OoOo/oo0OOoo;", "Lo0O0OoOo/o0O0o000;", "Lo0O0OoOo/o0O00;", "filter", "o00oOoO", "(Lo0O0OoOo/o0O00;)Lo0O0OoOo/oo0OOoo;", "", "other", "", "equals", "", "hashCode", "Landroid/content/Intent;", "o00oOo0O", "Landroid/content/Intent;", "o00oOoO0", "()Landroid/content/Intent;", "placeholderIntent", "", "o00oOo0o", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class oo0OOoo extends o0O0o000 {
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Intent f12050o00oOo0O;
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Set<o0O00> f12051o00oOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(@NotNull Set<o0O00> set, @NotNull Intent intent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        o0OOOOO0.o0ooO.o00oo0O0(set, "filters");
        o0OOOOO0.o0ooO.o00oo0O0(intent, "placeholderIntent");
        this.f12050o00oOo0O = intent;
        this.f12051o00oOo0o = o0OO0oO.o0O0oo0o.o0o00oo0(set);
    }

    public /* synthetic */ oo0OOoo(Set set, Intent intent, int i, int i2, float f, int i3, int i4, o0OOOOO0.o0O00 o0o00) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    @Override // o0O0OoOo.o0O0o000
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oo0OOoo) && super.equals(obj) && super.equals(obj)) {
            oo0OOoo oo0oooo = (oo0OOoo) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f12051o00oOo0o, oo0oooo.f12051o00oOo0o) && o0OOOOO0.o0ooO.o00oOoO0(this.f12050o00oOo0O, oo0oooo.f12050o00oOo0O);
        }
        return false;
    }

    @Override // o0O0OoOo.o0O0o000
    public int hashCode() {
        int hashCode = this.f12051o00oOo0o.hashCode();
        return this.f12050o00oOo0O.hashCode() + ((hashCode + (super.hashCode() * 31)) * 31);
    }

    @NotNull
    public final Set<o0O00> o00oOo0o() {
        return this.f12051o00oOo0o;
    }

    @NotNull
    public final oo0OOoo o00oOoO(@NotNull o0O00 o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f12051o00oOo0o);
        linkedHashSet.add(o0o00);
        return new oo0OOoo(o0OO0oO.o0O0oo0o.o0o00oo0(linkedHashSet), this.f12050o00oOo0O, this.f12023o00oOOo0, this.f12024o00oOOoO, this.f12025o00oOo00, this.f12026o00oOooO);
    }

    @NotNull
    public final Intent o00oOoO0() {
        return this.f12050o00oOo0O;
    }
}
