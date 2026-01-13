package o00ooO;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class o00ooO extends o00oOoO {

    /* renamed from: o0O0o0oo  reason: collision with root package name */
    public ArrayList<o00oOoO> f7867o0O0o0oo;

    public o00ooO() {
        this.f7867o0O0o0oo = new ArrayList<>();
    }

    public o00ooO(int i, int i2) {
        super(0, 0, i, i2);
        this.f7867o0O0o0oo = new ArrayList<>();
    }

    public o00ooO(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f7867o0O0o0oo = new ArrayList<>();
    }

    public void o00oOOo0(o00oOoO o00oooo2) {
        this.f7867o0O0o0oo.add(o00oooo2);
        if (o00oooo2.o0() != null) {
            ((o00ooO) o00oooo2.o0()).o0OO00oo(o00oooo2);
        }
        o00oooo2.o0O0oo00(this);
    }

    @Override // o00ooO.o00oOoO
    public void o0O0OOO(o00ooO0.o00oOo00 o00ooo002) {
        super.o0O0OOO(o00ooo002);
        int size = this.f7867o0O0o0oo.size();
        for (int i = 0; i < size; i++) {
            this.f7867o0O0o0oo.get(i).o0O0OOO(o00ooo002);
        }
    }

    @Override // o00ooO.o00oOoO
    public void o0O0oOO0(int i, int i2) {
        this.f7721o0O000o = i;
        this.f7757o0ooOoOO = i2;
        int size = this.f7867o0O0o0oo.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f7867o0O0o0oo.get(i3).o0O0oOO0(o0O000(), o0O000O());
        }
    }

    public void o0OO000o(o00oOoO... o00ooooArr) {
        for (o00oOoO o00oooo2 : o00ooooArr) {
            o00oOOo0(o00oooo2);
        }
    }

    public void o0OO00OO() {
        ArrayList<o00oOoO> arrayList = this.f7867o0O0o0oo;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o00oOoO o00oooo2 = this.f7867o0O0o0oo.get(i);
            if (o00oooo2 instanceof o00ooO) {
                ((o00ooO) o00oooo2).o0OO00OO();
            }
        }
    }

    public void o0OO00Oo() {
        this.f7867o0O0o0oo.clear();
    }

    public void o0OO00oo(o00oOoO o00oooo2) {
        this.f7867o0O0o0oo.remove(o00oooo2);
        o00oooo2.o0ooO();
    }

    @Override // o00ooO.o00oOoO
    public void o0ooO() {
        this.f7867o0O0o0oo.clear();
        super.o0ooO();
    }

    public ArrayList<o00oOoO> oo0oO0() {
        return this.f7867o0O0o0oo;
    }

    public o00oo00O oo0ooO() {
        o00oOoO o02 = o0();
        o00oo00O o00oo00o = this instanceof o00oo00O ? (o00oo00O) this : null;
        while (o02 != null) {
            o00oOoO o03 = o02.o0();
            if (o02 instanceof o00oo00O) {
                o00oo00o = (o00oo00O) o02;
            }
            o02 = o03;
        }
        return o00oo00o;
    }
}
