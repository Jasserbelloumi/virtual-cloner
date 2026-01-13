package o00ooO0;

import java.util.ArrayList;
import o00ooO0.o00oo00O;
import o00ooO0.o00oo0O;
/* loaded from: classes.dex */
public class o00oOOoO implements o00oo00O.o00oOOo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final boolean f7913o00oOoO = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final boolean f7914o00oOoO0 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o00oOOo0 f7918o00oOo0O;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo0O f7915o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f7916o00oOOoO = 0.0f;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f7917o00oOo00 = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public ArrayList<o00oo0O> f7920o00oOooO = new ArrayList<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f7919o00oOo0o = false;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void clear();

        void o00oOOo0(o00oo0O o00oo0o2, float f);

        o00oo0O o00oOOoO(int i);

        void o00oOo00();

        void o00oOo0O(o00oo0O o00oo0o2, float f, boolean z);

        int o00oOo0o();

        int o00oOoO();

        void o00oOoO0();

        float o00oOoOO(o00oOOoO o00ooooo2, boolean z);

        int o00oOoOo(o00oo0O o00oo0o2);

        float o00oOoo0(o00oo0O o00oo0o2, boolean z);

        float o00oOooO(o00oo0O o00oo0o2);

        float o00oOooo(int i);

        void o00oo0(float f);

        boolean o00oo00O(o00oo0O o00oo0o2);
    }

    public o00oOOoO() {
    }

    public o00oOOoO(o00oOo00 o00ooo002) {
        this.f7918o00oOo0O = new o00ooO0.o00oOOo0(this, o00ooo002);
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void clear() {
        this.f7918o00oOo0O.clear();
        this.f7915o00oOOo0 = null;
        this.f7916o00oOOoO = 0.0f;
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public o00oo0O getKey() {
        return this.f7915o00oOOo0;
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public boolean isEmpty() {
        return this.f7915o00oOOo0 == null && this.f7916o00oOOoO == 0.0f && this.f7918o00oOo0O.o00oOoO() == 0;
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void o00oOOo0(o00oo00O.o00oOOo0 o00oooo02) {
        if (o00oooo02 instanceof o00oOOoO) {
            o00oOOoO o00ooooo2 = (o00oOOoO) o00oooo02;
            this.f7915o00oOOo0 = null;
            this.f7918o00oOo0O.clear();
            for (int i = 0; i < o00ooooo2.f7918o00oOo0O.o00oOoO(); i++) {
                this.f7918o00oOo0O.o00oOo0O(o00ooooo2.f7918o00oOo0O.o00oOOoO(i), o00ooooo2.f7918o00oOo0O.o00oOooo(i), true);
            }
        }
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public o00oo0O o00oOOoO(o00oo00O o00oo00o, boolean[] zArr) {
        return o00ooO(zArr, null);
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void o00oOo00(o00oo00O o00oo00o, o00oOOoO o00ooooo2, boolean z) {
        float o00oOoOO2 = this.f7918o00oOo0O.o00oOoOO(o00ooooo2, z);
        this.f7916o00oOOoO = (o00ooooo2.f7916o00oOOoO * o00oOoOO2) + this.f7916o00oOOoO;
        if (z) {
            o00ooooo2.f7915o00oOOo0.o00oOo0o(this);
        }
        if (o00oo00O.f7975o00ooO00 && this.f7915o00oOOo0 != null && this.f7918o00oOo0O.o00oOoO() == 0) {
            this.f7919o00oOo0o = true;
            o00oo00o.f7982o00oOOo0 = true;
        }
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void o00oOo0O(o00oo00O o00oo00o) {
        if (o00oo00o.f7988o00oOoO0.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int o00oOoO2 = this.f7918o00oOo0O.o00oOoO();
            for (int i = 0; i < o00oOoO2; i++) {
                o00oo0O o00oOOoO2 = this.f7918o00oOo0O.o00oOOoO(i);
                if (o00oOOoO2.f8027o00oOooO != -1 || o00oOOoO2.f8023o00oOoO0 || o00oOOoO2.f8029o00oo0) {
                    this.f7920o00oOooO.add(o00oOOoO2);
                }
            }
            int size = this.f7920o00oOooO.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    o00oo0O o00oo0o2 = this.f7920o00oOooO.get(i2);
                    if (o00oo0o2.f8023o00oOoO0) {
                        o00oOo0o(o00oo00o, o00oo0o2, true);
                    } else if (o00oo0o2.f8029o00oo0) {
                        o00ooOo(o00oo00o, o00oo0o2, true);
                    } else {
                        o00oOo00(o00oo00o, o00oo00o.f7988o00oOoO0[o00oo0o2.f8027o00oOooO], true);
                    }
                }
                this.f7920o00oOooO.clear();
            } else {
                z = true;
            }
        }
        if (o00oo00O.f7975o00ooO00 && this.f7915o00oOOo0 != null && this.f7918o00oOo0O.o00oOoO() == 0) {
            this.f7919o00oOo0o = true;
            o00oo00o.f7982o00oOOo0 = true;
        }
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void o00oOo0o(o00oo00O o00oo00o, o00oo0O o00oo0o2, boolean z) {
        if (o00oo0o2.f8023o00oOoO0) {
            float o00oOooO2 = this.f7918o00oOo0O.o00oOooO(o00oo0o2);
            this.f7916o00oOOoO = (o00oo0o2.f8021o00oOo0o * o00oOooO2) + this.f7916o00oOOoO;
            this.f7918o00oOo0O.o00oOoo0(o00oo0o2, z);
            if (z) {
                o00oo0o2.o00oOo0o(this);
            }
            if (o00oo00O.f7975o00ooO00 && this.f7918o00oOo0O.o00oOoO() == 0) {
                this.f7919o00oOo0o = true;
                o00oo00o.f7982o00oOOo0 = true;
            }
        }
    }

    public o00oOOoO o00oOoO(o00oo0O o00oo0o2, int i) {
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, i);
        return this;
    }

    public o00oOOoO o00oOoO0(o00oo00O o00oo00o, int i) {
        this.f7918o00oOo0O.o00oOOo0(o00oo00o.o00oo0o0(i, "ep"), 1.0f);
        this.f7918o00oOo0O.o00oOOo0(o00oo00o.o00oo0o0(i, "em"), -1.0f);
        return this;
    }

    public boolean o00oOoOO(o00oo00O o00oo00o) {
        boolean z;
        o00oo0O o00oOoOo2 = o00oOoOo(o00oo00o);
        if (o00oOoOo2 == null) {
            z = true;
        } else {
            o00ooOO0(o00oOoOo2);
            z = false;
        }
        if (this.f7918o00oOo0O.o00oOoO() == 0) {
            this.f7919o00oOo0o = true;
        }
        return z;
    }

    public o00oo0O o00oOoOo(o00oo00O o00oo00o) {
        int o00oOoO2 = this.f7918o00oOo0O.o00oOoO();
        o00oo0O o00oo0o2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        o00oo0O o00oo0o3 = null;
        for (int i = 0; i < o00oOoO2; i++) {
            float o00oOooo2 = this.f7918o00oOo0O.o00oOooo(i);
            o00oo0O o00oOOoO2 = this.f7918o00oOo0O.o00oOOoO(i);
            if (o00oOOoO2.f8025o00oOoOo == o00oo0O.o00oOOoO.UNRESTRICTED) {
                if (o00oo0o2 == null || f > o00oOooo2) {
                    z = o00ooO0O(o00oOOoO2, o00oo00o);
                    f = o00oOooo2;
                    o00oo0o2 = o00oOOoO2;
                } else if (!z && o00ooO0O(o00oOOoO2, o00oo00o)) {
                    f = o00oOooo2;
                    o00oo0o2 = o00oOOoO2;
                    z = true;
                }
            } else if (o00oo0o2 == null && o00oOooo2 < 0.0f) {
                if (o00oo0o3 == null || f2 > o00oOooo2) {
                    z2 = o00ooO0O(o00oOOoO2, o00oo00o);
                    f2 = o00oOooo2;
                    o00oo0o3 = o00oOOoO2;
                } else if (!z2 && o00ooO0O(o00oOOoO2, o00oo00o)) {
                    f2 = o00oOooo2;
                    o00oo0o3 = o00oOOoO2;
                    z2 = true;
                }
            }
        }
        return o00oo0o2 != null ? o00oo0o2 : o00oo0o3;
    }

    public o00oOOoO o00oOoo0(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i, float f, o00oo0O o00oo0o4, o00oo0O o00oo0o5, int i2) {
        int i3;
        float f2;
        if (o00oo0o3 == o00oo0o4) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f2 = i3;
            }
            return this;
        } else if (f <= 0.0f) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, 1.0f);
            f2 = i;
        } else if (f < 1.0f) {
            float f3 = 1.0f - f;
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, f3 * 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, f3 * (-1.0f));
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, (-1.0f) * f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f7916o00oOOoO = (i2 * f) + ((-i) * f3);
            }
            return this;
        } else {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, 1.0f);
            i3 = -i2;
            f2 = i3;
        }
        this.f7916o00oOOoO = f2;
        return this;
    }

    @Override // o00ooO0.o00oo00O.o00oOOo0
    public void o00oOooO(o00oo0O o00oo0o2) {
        int i = o00oo0o2.f8020o00oOo0O;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, f);
    }

    public o00oOOoO o00oOooo(o00oo0O o00oo0o2, int i) {
        this.f7915o00oOOo0 = o00oo0o2;
        float f = i;
        o00oo0o2.f8021o00oOo0o = f;
        this.f7916o00oOOoO = f;
        this.f7919o00oOo0o = true;
        return this;
    }

    public void o00oo() {
        float f = this.f7916o00oOOoO;
        if (f < 0.0f) {
            this.f7916o00oOOoO = f * (-1.0f);
            this.f7918o00oOo0O.o00oOo00();
        }
    }

    public o00oOOoO o00oo0(o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, o00oo0O o00oo0o5, float f) {
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o3, 1.0f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o4, f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o5, -f);
        return this;
    }

    public o00oOOoO o00oo00O(o00oo0O o00oo0o2, o00oo0O o00oo0o3, float f) {
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o3, f);
        return this;
    }

    public o00oOOoO o00oo0O(o00oo0O o00oo0o2, int i) {
        o00oOOo0 o00oooo02;
        float f;
        if (i < 0) {
            this.f7916o00oOOoO = i * (-1);
            o00oooo02 = this.f7918o00oOo0O;
            f = 1.0f;
        } else {
            this.f7916o00oOOoO = i;
            o00oooo02 = this.f7918o00oOo0O;
            f = -1.0f;
        }
        o00oooo02.o00oOOo0(o00oo0o2, f);
        return this;
    }

    public o00oOOoO o00oo0O0(float f, float f2, float f3, o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, o00oo0O o00oo0o5) {
        this.f7916o00oOOoO = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -1.0f);
        } else if (f == 0.0f) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
        } else if (f3 == 0.0f) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, f4);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -f4);
        }
        return this;
    }

    public o00oOOoO o00oo0OO(float f, float f2, float f3, o00oo0O o00oo0o2, int i, o00oo0O o00oo0o3, int i2, o00oo0O o00oo0o4, int i3, o00oo0O o00oo0o5, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f7916o00oOOoO = ((-i) - i2) + i3 + i4;
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f7916o00oOOoO = (i4 * f4) + (i3 * f4) + ((-i) - i2);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o5, f4);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -f4);
        }
        return this;
    }

    public o00oOOoO o00oo0Oo(o00oo0O o00oo0o2, o00oo0O o00oo0o3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7916o00oOOoO = i;
        }
        if (z) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
        } else {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, 1.0f);
        }
        return this;
    }

    public o00oOOoO o00oo0o(o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7916o00oOOoO = i;
        }
        if (z) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -1.0f);
        } else {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, 1.0f);
        }
        return this;
    }

    public o00oOOoO o00oo0o0(o00oo0O o00oo0o2, int i, o00oo0O o00oo0o3) {
        this.f7916o00oOOoO = i;
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
        return this;
    }

    public o00oOOoO o00oo0oO(o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7916o00oOOoO = i;
        }
        if (z) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, 1.0f);
        } else {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, 1.0f);
            this.f7918o00oOo0O.o00oOOo0(o00oo0o4, -1.0f);
        }
        return this;
    }

    public final o00oo0O o00ooO(boolean[] zArr, o00oo0O o00oo0o2) {
        o00oo0O.o00oOOoO o00ooooo2;
        int o00oOoO2 = this.f7918o00oOo0O.o00oOoO();
        o00oo0O o00oo0o3 = null;
        float f = 0.0f;
        for (int i = 0; i < o00oOoO2; i++) {
            float o00oOooo2 = this.f7918o00oOo0O.o00oOooo(i);
            if (o00oOooo2 < 0.0f) {
                o00oo0O o00oOOoO2 = this.f7918o00oOo0O.o00oOOoO(i);
                if ((zArr == null || !zArr[o00oOOoO2.f8019o00oOo00]) && o00oOOoO2 != o00oo0o2 && (((o00ooooo2 = o00oOOoO2.f8025o00oOoOo) == o00oo0O.o00oOOoO.SLACK || o00ooooo2 == o00oo0O.o00oOOoO.ERROR) && o00oOooo2 < f)) {
                    f = o00oOooo2;
                    o00oo0o3 = o00oOOoO2;
                }
            }
        }
        return o00oo0o3;
    }

    public boolean o00ooO0(o00oo0O o00oo0o2) {
        return this.f7918o00oOo0O.o00oo00O(o00oo0o2);
    }

    public boolean o00ooO00() {
        o00oo0O o00oo0o2 = this.f7915o00oOOo0;
        return o00oo0o2 != null && (o00oo0o2.f8025o00oOoOo == o00oo0O.o00oOOoO.UNRESTRICTED || this.f7916o00oOOoO >= 0.0f);
    }

    public final boolean o00ooO0O(o00oo0O o00oo0o2, o00oo00O o00oo00o) {
        return o00oo0o2.f8030o00oo00O <= 1;
    }

    public o00oo0O o00ooO0o(o00oo0O o00oo0o2) {
        return o00ooO(null, o00oo0o2);
    }

    public void o00ooOO() {
        this.f7915o00oOOo0 = null;
        this.f7918o00oOo0O.clear();
        this.f7916o00oOOoO = 0.0f;
        this.f7919o00oOo0o = false;
    }

    public void o00ooOO0(o00oo0O o00oo0o2) {
        o00oo0O o00oo0o3 = this.f7915o00oOOo0;
        if (o00oo0o3 != null) {
            this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -1.0f);
            this.f7915o00oOOo0.f8027o00oOooO = -1;
            this.f7915o00oOOo0 = null;
        }
        float o00oOoo02 = this.f7918o00oOo0O.o00oOoo0(o00oo0o2, true) * (-1.0f);
        this.f7915o00oOOo0 = o00oo0o2;
        if (o00oOoo02 == 1.0f) {
            return;
        }
        this.f7916o00oOOoO /= o00oOoo02;
        this.f7918o00oOo0O.o00oo0(o00oOoo02);
    }

    public int o00ooOOo() {
        return this.f7918o00oOo0O.o00oOo0o() + (this.f7915o00oOOo0 != null ? 4 : 0) + 4 + 4;
    }

    public void o00ooOo(o00oo00O o00oo00o, o00oo0O o00oo0o2, boolean z) {
        if (o00oo0o2.f8029o00oo0) {
            float o00oOooO2 = this.f7918o00oOo0O.o00oOooO(o00oo0o2);
            this.f7916o00oOOoO = (o00oo0o2.f8032o00oo0O0 * o00oOooO2) + this.f7916o00oOOoO;
            this.f7918o00oOo0O.o00oOoo0(o00oo0o2, z);
            if (z) {
                o00oo0o2.o00oOo0o(this);
            }
            this.f7918o00oOo0O.o00oOo0O(o00oo00o.f7994o00oo0.f7924o00oOooO[o00oo0o2.f8033o00oo0OO], o00oOooO2, z);
            if (o00oo00O.f7975o00ooO00 && this.f7918o00oOo0O.o00oOoO() == 0) {
                this.f7919o00oOo0o = true;
                o00oo00o.f7982o00oOOo0 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String o00ooOo0() {
        /*
            r11 = this;
            o00ooO0.o00oo0O r0 = r11.f7915o00oOOo0
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
            o00ooO0.o00oo0O r1 = r11.f7915o00oOOo0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = o00oOoOo.o00oo.o00oOOo0(r0, r1)
            float r1 = r11.f7916o00oOOoO
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
            float r1 = r11.f7916o00oOOoO
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            o00ooO0.o00oOOoO$o00oOOo0 r5 = r11.f7918o00oOo0O
            int r5 = r5.o00oOoO()
        L3b:
            if (r3 >= r5) goto La3
            o00ooO0.o00oOOoO$o00oOOo0 r6 = r11.f7918o00oOo0O
            o00ooO0.o00oo0O r6 = r6.o00oOOoO(r3)
            if (r6 != 0) goto L46
            goto La0
        L46:
            o00ooO0.o00oOOoO$o00oOOo0 r7 = r11.f7918o00oOo0O
            float r7 = r7.o00oOooo(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto La0
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L82
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
            java.lang.String r1 = "- "
            goto L7a
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r8 <= 0) goto L72
            java.lang.String r8 = " + "
            java.lang.String r0 = android.support.v4.media.o00oOOoO.o00oOOo0(r1, r0, r8)
            goto L82
        L72:
            r1.append(r0)
            java.lang.String r0 = " - "
            r10 = r1
            r1 = r0
            r0 = r10
        L7a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L82:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L9b
        L8e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L9b:
            java.lang.String r0 = android.support.v4.media.o00oOOoO.o00oOOo0(r1, r0, r6)
            r1 = r4
        La0:
            int r3 = r3 + 1
            goto L3b
        La3:
            if (r1 != 0) goto Lab
            java.lang.String r1 = "0.0"
            java.lang.String r0 = o00oOoOo.o00oo.o00oOOo0(r0, r1)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO0.o00oOOoO.o00ooOo0():java.lang.String");
    }

    public o00oOOoO o0O0o(o00oo0O o00oo0o2, o00oo0O o00oo0o3, o00oo0O o00oo0o4, o00oo0O o00oo0o5, float f) {
        this.f7918o00oOo0O.o00oOOo0(o00oo0o4, 0.5f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o5, 0.5f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o2, -0.5f);
        this.f7918o00oOo0O.o00oOOo0(o00oo0o3, -0.5f);
        this.f7916o00oOOoO = -f;
        return this;
    }

    public String toString() {
        return o00ooOo0();
    }
}
