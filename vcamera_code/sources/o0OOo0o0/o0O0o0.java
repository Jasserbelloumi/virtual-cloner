package o0OOo0o0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0oO.o0O00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0002R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo0OOo0o0/o0O0o0;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "element", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Ljava/lang/Object;)V", "o00oOo0O", "()Ljava/lang/Object;", o00oOOoO.f12961o00oOo00, "o00oOo00", "", "[Ljava/lang/Object;", "elements", "", "I", TtmlNode.TAG_HEAD, "tail", "", "o00oOooO", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0O0o0<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Object[] f14569o00oOOo0 = new Object[16];

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f14570o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f14571o00oOo00;

    public final void o00oOOo0(@NotNull T t) {
        Object[] objArr = this.f14569o00oOOo0;
        int i = this.f14571o00oOo00;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f14571o00oOo00 = length;
        if (length == this.f14570o00oOOoO) {
            o00oOo00();
        }
    }

    public final void o00oOOoO() {
        this.f14570o00oOOoO = 0;
        this.f14571o00oOo00 = 0;
        this.f14569o00oOOo0 = new Object[this.f14569o00oOOo0.length];
    }

    public final void o00oOo00() {
        Object[] objArr = this.f14569o00oOOo0;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        o0O00000.o0O0o0o(objArr, objArr2, 0, this.f14570o00oOOoO, 0, 10, null);
        Object[] objArr3 = this.f14569o00oOOo0;
        int length2 = objArr3.length;
        int i = this.f14570o00oOOoO;
        o0O00000.o0O0o0o(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f14569o00oOOo0 = objArr2;
        this.f14570o00oOOoO = 0;
        this.f14571o00oOo00 = length;
    }

    @Nullable
    public final T o00oOo0O() {
        int i = this.f14570o00oOOoO;
        if (i == this.f14571o00oOo00) {
            return null;
        }
        Object[] objArr = this.f14569o00oOOo0;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f14570o00oOOoO = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }

    public final boolean o00oOooO() {
        return this.f14570o00oOOoO == this.f14571o00oOo00;
    }
}
