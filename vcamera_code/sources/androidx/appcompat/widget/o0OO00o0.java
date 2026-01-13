package androidx.appcompat.widget;
/* loaded from: classes.dex */
public class o0OO00o0 {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f1275o00oOoOO = Integer.MIN_VALUE;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f1276o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f1277o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1278o00oOo00 = Integer.MIN_VALUE;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1283o00oOooO = Integer.MIN_VALUE;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1279o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f1280o00oOo0o = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f1282o00oOoO0 = false;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f1281o00oOoO = false;

    public int o00oOOo0() {
        return this.f1282o00oOoO0 ? this.f1276o00oOOo0 : this.f1277o00oOOoO;
    }

    public int o00oOOoO() {
        return this.f1276o00oOOo0;
    }

    public int o00oOo00() {
        return this.f1277o00oOOoO;
    }

    public void o00oOo0O(int i, int i2) {
        this.f1281o00oOoO = false;
        if (i != Integer.MIN_VALUE) {
            this.f1279o00oOo0O = i;
            this.f1276o00oOOo0 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1280o00oOo0o = i2;
            this.f1277o00oOOoO = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOo0o(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1282o00oOoO0
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1282o00oOoO0 = r2
            boolean r0 = r1.f1281o00oOoO
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1283o00oOooO
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1279o00oOo0O
        L16:
            r1.f1276o00oOOo0 = r2
            int r2 = r1.f1278o00oOo00
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1278o00oOo00
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1279o00oOo0O
        L24:
            r1.f1276o00oOOo0 = r2
            int r2 = r1.f1283o00oOooO
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1279o00oOo0O
            r1.f1276o00oOOo0 = r2
        L2f:
            int r2 = r1.f1280o00oOo0o
        L31:
            r1.f1277o00oOOoO = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0OO00o0.o00oOo0o(boolean):void");
    }

    public void o00oOoO0(int i, int i2) {
        this.f1278o00oOo00 = i;
        this.f1283o00oOooO = i2;
        this.f1281o00oOoO = true;
        if (this.f1282o00oOoO0) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1276o00oOOo0 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1277o00oOOoO = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1276o00oOOo0 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1277o00oOOoO = i2;
        }
    }

    public int o00oOooO() {
        return this.f1282o00oOoO0 ? this.f1277o00oOOoO : this.f1276o00oOOo0;
    }
}
