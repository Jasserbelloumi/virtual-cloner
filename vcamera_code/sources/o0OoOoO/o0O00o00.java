package o0OoOoO;

import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class o0O00o00 implements o0oO0Ooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public WeakReference<View> f16800o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f16801o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f16802o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f16803o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f16804o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f16805o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f16806o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f16807o00oOoOO = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f16808o00oOooO;

    public o0O00o00(View view) {
        this.f16800o00oOOo0 = new WeakReference<>(view);
    }

    @Override // o0OoOoO.o0oO0Ooo
    public int getMeasuredHeight() {
        return this.f16805o00oOoO;
    }

    @Override // o0OoOoO.o0oO0Ooo
    public int getMeasuredWidth() {
        return this.f16806o00oOoO0;
    }

    @Override // o0OoOoO.o0oO0Ooo
    public void o00oOOo0(int i) {
        this.f16807o00oOoOO = i;
    }

    @Override // o0OoOoO.o0oO0Ooo
    public void o00oOOoO() {
        o00oOoO0().requestLayout();
    }

    @Override // o0OoOoO.o0oO0Ooo
    public void o00oOo00(int i, int i2) {
        this.f16808o00oOooO = i;
        this.f16803o00oOo0O = i2;
    }

    @Override // o0OoOoO.o0oO0Ooo
    public void o00oOo0O(int i, int i2) {
        this.f16801o00oOOoO = i;
        this.f16802o00oOo00 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r2 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
        r13 = (int) (r0 / r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r12 = (int) (r3 * r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOo0o(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OoOoO.o0O00o00.o00oOo0o(int, int):void");
    }

    public View o00oOoO0() {
        WeakReference<View> weakReference = this.f16800o00oOOo0;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // o0OoOoO.o0oO0Ooo
    public void o00oOooO(int i) {
        this.f16804o00oOo0o = i;
    }
}
