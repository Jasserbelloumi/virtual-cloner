package o0O0OoOo;

import android.app.Activity;
import android.support.v4.media.o00oOo0O;
import java.util.List;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo0O0OoOo/o0OoO00O;", "", "Landroid/app/Activity;", "activity", "", "o00oOOo0", "o00oOo00", "other", "equals", "", "hashCode", "", "toString", "", "Ljava/util/List;", o00oOOoO.f12961o00oOo00, "()Ljava/util/List;", "activities", "Z", "isEmpty", "<init>", "(Ljava/util/List;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0OoO00O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<Activity> f12028o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f12029o00oOOoO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoO00O(@NotNull List<? extends Activity> list, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "activities");
        this.f12028o00oOOo0 = list;
        this.f12029o00oOOoO = z;
    }

    public /* synthetic */ o0OoO00O(List list, boolean z, int i, o0OOOOO0.o0O00 o0o00) {
        this(list, (i & 2) != 0 ? false : z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OoO00O) {
            o0OoO00O o0ooo00o = (o0OoO00O) obj;
            return (o0OOOOO0.o0ooO.o00oOoO0(this.f12028o00oOOo0, o0ooo00o.f12028o00oOOo0) || this.f12029o00oOOoO == o0ooo00o.f12029o00oOOoO) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        return this.f12028o00oOOo0.hashCode() + ((this.f12029o00oOOoO ? 1 : 0) * 31);
    }

    public final boolean o00oOOo0(@NotNull Activity activity) {
        o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        return this.f12028o00oOOo0.contains(activity);
    }

    @NotNull
    public final List<Activity> o00oOOoO() {
        return this.f12028o00oOOo0;
    }

    public final boolean o00oOo00() {
        return this.f12029o00oOOoO;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ActivityStack{");
        o00oOOo02.append(o0OOOOO0.o0ooO.o00ooOO0("activities=", this.f12028o00oOOo0));
        o00oOOo02.append("isEmpty=" + this.f12029o00oOOoO + '}');
        String sb = o00oOOo02.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
