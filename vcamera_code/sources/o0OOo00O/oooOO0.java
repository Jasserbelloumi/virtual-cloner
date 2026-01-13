package o0OOo00O;

import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import o0OO.o00oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lo0OOo00O/oooOO0;", "Lo0OO/o00oOOo0;", "", "toString", "oo0oOOo", "name", "o0O0oOo", "", "hashCode", "", "other", "", "equals", "o00oo0O", "Ljava/lang/String;", "o0O0oOoo", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "o00oo0Oo", "o00oOOo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oooOO0 extends o0OO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o00oOOo0 f14146o00oo0Oo = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f14147o00oo0O;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo0OOo00O/oooOO0$o00oOOo0;", "Lo0OO/o00oo0$o00oOo00;", "Lo0OOo00O/oooOO0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o00oo0.o00oOo00<oooOO0> {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }
    }

    public oooOO0(@NotNull String str) {
        super(f14146o00oo0Oo);
        this.f14147o00oo0O = str;
    }

    public static oooOO0 o0O0oOoO(oooOO0 ooooo0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ooooo0.f14147o00oo0O;
        }
        ooooo0.getClass();
        return new oooOO0(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oooOO0) && o0OOOOO0.o0ooO.o00oOoO0(this.f14147o00oo0O, ((oooOO0) obj).f14147o00oo0O);
    }

    public int hashCode() {
        return this.f14147o00oo0O.hashCode();
    }

    @NotNull
    public final oooOO0 o0O0oOo(@NotNull String str) {
        return new oooOO0(str);
    }

    @NotNull
    public final String o0O0oOoo() {
        return this.f14147o00oo0O;
    }

    @NotNull
    public final String oo0oOOo() {
        return this.f14147o00oo0O;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CoroutineName(");
        o00oOOo02.append(this.f14147o00oo0O);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
