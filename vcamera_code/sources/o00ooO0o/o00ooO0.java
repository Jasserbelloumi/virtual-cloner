package o00ooO0o;

import o00ooO.o00oOoO;
import o00ooO0O.o00oo0;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o00ooO0 implements o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0OO f8795o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8796o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00ooO.o00oo0OO f8797o00oOo00;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Object f8800o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8801o00oOooO = -1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8798o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f8799o00oOo0o = 0.0f;

    public o00ooO0(o00oo0OO o00oo0oo) {
        this.f8795o00oOOo0 = o00oo0oo;
    }

    @Override // o00ooO0O.o00oo0
    public void apply() {
        this.f8797o00oOo00.o0OO0o0O(this.f8796o00oOOoO);
        int i = this.f8801o00oOooO;
        if (i != -1) {
            this.f8797o00oOo00.o0OO0OoO(i);
            return;
        }
        int i2 = this.f8798o00oOo0O;
        if (i2 != -1) {
            this.f8797o00oOo00.o0OOooO0(i2);
        } else {
            this.f8797o00oOo00.o0OO0Ooo(this.f8799o00oOo0o);
        }
    }

    @Override // o00ooO0O.o00oo0
    public Object getKey() {
        return this.f8800o00oOoO0;
    }

    @Override // o00ooO0O.o00oo0
    public o00oOoO o00oOOo0() {
        if (this.f8797o00oOo00 == null) {
            this.f8797o00oOo00 = new o00ooO.o00oo0OO();
        }
        return this.f8797o00oOo00;
    }

    @Override // o00ooO0O.o00oo0
    public void o00oOOoO(o00oOoO o00oooo2) {
        this.f8797o00oOo00 = o00oooo2 instanceof o00ooO.o00oo0OO ? (o00ooO.o00oo0OO) o00oooo2 : null;
    }

    @Override // o00ooO0O.o00oo0
    public void o00oOo00(Object obj) {
        this.f8800o00oOoO0 = obj;
    }

    public int o00oOo0O() {
        return this.f8796o00oOOoO;
    }

    public void o00oOo0o(float f) {
        this.f8801o00oOooO = -1;
        this.f8798o00oOo0O = -1;
        this.f8799o00oOo0o = f;
    }

    public void o00oOoO(Object obj) {
        this.f8801o00oOooO = this.f8795o00oOOo0.o00oOo0o(obj);
        this.f8798o00oOo0O = -1;
        this.f8799o00oOo0o = 0.0f;
    }

    public void o00oOoO0(int i) {
        this.f8796o00oOOoO = i;
    }

    public void o00oOooO(Object obj) {
        this.f8801o00oOooO = -1;
        this.f8798o00oOo0O = this.f8795o00oOOo0.o00oOo0o(obj);
        this.f8799o00oOo0o = 0.0f;
    }
}
