package o00ooO;
/* loaded from: classes.dex */
public class o00oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f7760o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f7761o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f7762o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f7763o00oOooO;

    public boolean o00oOOo0(int i, int i2) {
        int i3;
        int i4 = this.f7760o00oOOo0;
        return i >= i4 && i < i4 + this.f7762o00oOo00 && i2 >= (i3 = this.f7761o00oOOoO) && i2 < i3 + this.f7763o00oOooO;
    }

    public int o00oOOoO() {
        return (this.f7760o00oOOo0 + this.f7762o00oOo00) / 2;
    }

    public int o00oOo00() {
        return (this.f7761o00oOOoO + this.f7763o00oOooO) / 2;
    }

    public boolean o00oOo0O(o00oo o00ooVar) {
        int i;
        int i2;
        int i3 = this.f7760o00oOOo0;
        int i4 = o00ooVar.f7760o00oOOo0;
        return i3 >= i4 && i3 < i4 + o00ooVar.f7762o00oOo00 && (i = this.f7761o00oOOoO) >= (i2 = o00ooVar.f7761o00oOOoO) && i < i2 + o00ooVar.f7763o00oOooO;
    }

    public void o00oOo0o(int i, int i2, int i3, int i4) {
        this.f7760o00oOOo0 = i;
        this.f7761o00oOOoO = i2;
        this.f7762o00oOo00 = i3;
        this.f7763o00oOooO = i4;
    }

    public void o00oOooO(int i, int i2) {
        this.f7760o00oOOo0 -= i;
        this.f7761o00oOOoO -= i2;
        this.f7762o00oOo00 = (i * 2) + this.f7762o00oOo00;
        this.f7763o00oOooO = (i2 * 2) + this.f7763o00oOooO;
    }
}
