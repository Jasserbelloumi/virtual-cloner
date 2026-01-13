package o0OOo00O;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo0OOo00O/oO00OOO;", "Lo0OOo0o0/o0OOO0;", "Lo0OOo00O/oO000O0O;", "", "state", "o0O00O", "toString", "", "isActive", "()Z", "o00oOoo0", "()Lo0OOo00O/oO00OOO;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00OOO extends o0OOo0o0.o0OOO0 implements oO000O0O {
    @Override // o0OOo00O.oO000O0O
    public boolean isActive() {
        return true;
    }

    @Override // o0OOo00O.oO000O0O
    @NotNull
    public oO00OOO o00oOoo0() {
        return this;
    }

    @NotNull
    public final String o0O00O(@NotNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (o0OOo0o0.o0OOO0OO o0ooo0oo = (o0OOo0o0.o0OOO0OO) o00ooooO(); !o0OOOOO0.o0ooO.o00oOoO0(o0ooo0oo, this); o0ooo0oo = o0ooo0oo.o00ooooo()) {
            if (o0ooo0oo instanceof oO00O0o) {
                oO00O0o oo00o0o = (oO00O0o) o0ooo0oo;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(oo00o0o);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // o0OOo0o0.o0OOO0OO
    @NotNull
    public String toString() {
        return super.toString();
    }
}
