package o0OO0o0O;

import java.util.Iterator;
import kotlin.Metadata;
import o0OO0oO.o0O0o0;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.oo0OOoo;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo0OO0o0O/o00oo00O;", "", "", "position", "", "positionOffset", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "selectedPosition", "nextPosition", "o00oOo00", "(IIF)V", "o00oOooO", "(I)V", "o00oOOo0", "I", "lastLeftPosition", "lastRightPosition", "()I", "pageCount", "<init>", "()V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public abstract class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f13299o00oOOo0 = -1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f13300o00oOOoO = -1;

    public abstract int o00oOOo0();

    public final void o00oOOoO(int i, float f) {
        float f2 = i + f;
        float o00oOOo02 = o00oOOo0() - 1;
        if (f2 == o00oOOo02) {
            f2 = o00oOOo02 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > o00oOOo02 || i2 == -1) {
            return;
        }
        o00oOo00(i2, i3, f2 % 1);
        int i4 = this.f13299o00oOOo0;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator<Integer> it = oo0OOoo.o0OO00o(i4, i2).iterator();
                while (it.hasNext()) {
                    o00oOooO(((o0O0o0) it).nextInt());
                }
            }
            int i5 = this.f13300o00oOOoO;
            if (i3 < i5) {
                o00oOooO(i5);
                Iterator<Integer> it2 = new o0O0O0Oo(i3 + 1, this.f13300o00oOOoO).iterator();
                while (it2.hasNext()) {
                    o00oOooO(((o0O0o0) it2).nextInt());
                }
            }
        }
        this.f13299o00oOOo0 = i2;
        this.f13300o00oOOoO = i3;
    }

    public abstract void o00oOo00(int i, int i2, float f);

    public abstract void o00oOooO(int i);
}
