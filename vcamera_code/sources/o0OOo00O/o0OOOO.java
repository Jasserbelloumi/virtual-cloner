package o0OOo00O;

import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo0OOo00O/o0OOOO;", "Lo0OOo00O/oO000O0O;", "", "toString", "", "o00oo0O0", "Z", "isActive", "()Z", "Lo0OOo00O/oO00OOO;", "o00oOoo0", "()Lo0OOo00O/oO00OOO;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OOOO implements oO000O0O {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final boolean f14046o00oo0O0;

    public o0OOOO(boolean z) {
        this.f14046o00oo0O0 = z;
    }

    @Override // o0OOo00O.oO000O0O
    public boolean isActive() {
        return this.f14046o00oo0O0;
    }

    @Override // o0OOo00O.oO000O0O
    @Nullable
    public oO00OOO o00oOoo0() {
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Empty{");
        o00oOOo02.append(this.f14046o00oo0O0 ? "Active" : "New");
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
