package o0O0OoOo;

import android.app.Activity;
import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lo0O0OoOo/o0O0OOO;", "", "Landroid/app/Activity;", "activity", "", "o00oOOo0", "other", "equals", "", "hashCode", "", "toString", "Lo0O0OoOo/o0OoO00O;", "Lo0O0OoOo/o0OoO00O;", o00oOOoO.f12961o00oOo00, "()Lo0O0OoOo/o0OoO00O;", "primaryActivityStack", "o00oOo00", "secondaryActivityStack", "", "F", "o00oOooO", "()F", "splitRatio", "<init>", "(Lo0O0OoOo/o0OoO00O;Lo0O0OoOo/o0OoO00O;F)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O0OOO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OoO00O f12011o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OoO00O f12012o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final float f12013o00oOo00;

    public o0O0OOO(@NotNull o0OoO00O o0ooo00o, @NotNull o0OoO00O o0ooo00o2, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "primaryActivityStack");
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o2, "secondaryActivityStack");
        this.f12011o00oOOo0 = o0ooo00o;
        this.f12012o00oOOoO = o0ooo00o2;
        this.f12013o00oOo00 = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0OOO) {
            o0O0OOO o0o0ooo = (o0O0OOO) obj;
            if (o0OOOOO0.o0ooO.o00oOoO0(this.f12011o00oOOo0, o0o0ooo.f12011o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f12012o00oOOoO, o0o0ooo.f12012o00oOOoO)) {
                return (this.f12013o00oOo00 > o0o0ooo.f12013o00oOo00 ? 1 : (this.f12013o00oOo00 == o0o0ooo.f12013o00oOo00 ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f12012o00oOOoO.hashCode();
        return Float.hashCode(this.f12013o00oOo00) + ((hashCode + (this.f12011o00oOOo0.hashCode() * 31)) * 31);
    }

    public final boolean o00oOOo0(@NotNull Activity activity) {
        o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        return this.f12011o00oOOo0.o00oOOo0(activity) || this.f12012o00oOOoO.o00oOOo0(activity);
    }

    @NotNull
    public final o0OoO00O o00oOOoO() {
        return this.f12011o00oOOo0;
    }

    @NotNull
    public final o0OoO00O o00oOo00() {
        return this.f12012o00oOOoO;
    }

    public final float o00oOooO() {
        return this.f12013o00oOo00;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("SplitInfo:{");
        StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("primaryActivityStack=");
        o00oOOo03.append(this.f12011o00oOOo0);
        o00oOOo03.append(',');
        o00oOOo02.append(o00oOOo03.toString());
        o00oOOo02.append("secondaryActivityStack=" + this.f12012o00oOOoO + ',');
        o00oOOo02.append("splitRatio=" + this.f12013o00oOo00 + '}');
        String sb = o00oOOo02.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
