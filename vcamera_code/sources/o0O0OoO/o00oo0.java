package o0O0OoO;

import android.graphics.Rect;
import android.support.v4.media.o00oOo00;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\""}, d2 = {"Lo0O0OoO/o00oo0;", "", "Landroid/graphics/Rect;", "o00oOoOO", "", "toString", "other", "", "equals", "", "hashCode", "o00oOOo0", "I", "o00oOo00", "()I", TtmlNode.LEFT, o00oOOoO.f12961o00oOo00, "o00oOo0O", "top", "o00oOooO", TtmlNode.RIGHT, "bottom", "o00oOo0o", "width", "height", "o00oOoO0", "()Z", "isEmpty", "o00oOoO", "isZero", "<init>", "(IIII)V", "rect", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f11958o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f11959o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f11960o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f11961o00oOooO;

    public o00oo0(int i, int i2, int i3, int i4) {
        this.f11958o00oOOo0 = i;
        this.f11959o00oOOoO = i2;
        this.f11960o00oOo00 = i3;
        this.f11961o00oOooO = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00oo0(@NotNull Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        o0ooO.o00oo0O0(rect, "rect");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (o0ooO.o00oOoO0(o00oo0.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                o00oo0 o00oo0Var = (o00oo0) obj;
                return this.f11958o00oOOo0 == o00oo0Var.f11958o00oOOo0 && this.f11959o00oOOoO == o00oo0Var.f11959o00oOOoO && this.f11960o00oOo00 == o00oo0Var.f11960o00oOo00 && this.f11961o00oOooO == o00oo0Var.f11961o00oOooO;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f11958o00oOOo0 * 31) + this.f11959o00oOOoO) * 31) + this.f11960o00oOo00) * 31) + this.f11961o00oOooO;
    }

    public final int o00oOOo0() {
        return this.f11961o00oOooO;
    }

    public final int o00oOOoO() {
        return this.f11961o00oOooO - this.f11959o00oOOoO;
    }

    public final int o00oOo00() {
        return this.f11958o00oOOo0;
    }

    public final int o00oOo0O() {
        return this.f11959o00oOOoO;
    }

    public final int o00oOo0o() {
        return this.f11960o00oOo00 - this.f11958o00oOOo0;
    }

    public final boolean o00oOoO() {
        return this.f11961o00oOooO - this.f11959o00oOOoO == 0 && this.f11960o00oOo00 - this.f11958o00oOOo0 == 0;
    }

    public final boolean o00oOoO0() {
        return this.f11961o00oOooO - this.f11959o00oOOoO == 0 || this.f11960o00oOo00 - this.f11958o00oOOo0 == 0;
    }

    @NotNull
    public final Rect o00oOoOO() {
        return new Rect(this.f11958o00oOOo0, this.f11959o00oOOoO, this.f11960o00oOo00, this.f11961o00oOooO);
    }

    public final int o00oOooO() {
        return this.f11960o00oOo00;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) o00oo0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f11958o00oOOo0);
        sb.append(',');
        sb.append(this.f11959o00oOOoO);
        sb.append(',');
        sb.append(this.f11960o00oOo00);
        sb.append(',');
        return o00oOo00.o00oOOo0(sb, this.f11961o00oOooO, "] }");
    }
}
