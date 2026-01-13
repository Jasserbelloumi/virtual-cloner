package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00O0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0ooOoOO.oO000OOo;
/* loaded from: classes.dex */
public final class o00oOOo0 implements o0O00O0o.o00oOOo0 {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f4277o00oOoOO = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f4278o00oOoOo = 1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final boolean f4279o00oOoo0 = false;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f4280o00oOooo = "AHT";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public oO000OOo.o00oOOo0<o00oOOoO> f4281o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f4282o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f4283o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Runnable f4284o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f4285o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f4286o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final o0O00O0o f4287o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final InterfaceC0037o00oOOo0 f4288o00oOooO;

    /* renamed from: androidx.recyclerview.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037o00oOOo0 {
        void o00oOOo0(int i, int i2);

        void o00oOOoO(o00oOOoO o00ooooo2);

        void o00oOo00(o00oOOoO o00ooooo2);

        void o00oOo0O(int i, int i2, Object obj);

        RecyclerView.o0O00oO0 o00oOo0o(int i);

        void o00oOoO(int i, int i2);

        void o00oOoO0(int i, int i2);

        void o00oOooO(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f4289o00oOo0O = 1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f4290o00oOo0o = 2;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4291o00oOoO = 8;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4292o00oOoO0 = 4;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4293o00oOoOO = 30;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4294o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4295o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Object f4296o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4297o00oOooO;

        public o00oOOoO(int i, int i2, int i3, Object obj) {
            this.f4294o00oOOo0 = i;
            this.f4295o00oOOoO = i2;
            this.f4297o00oOooO = i3;
            this.f4296o00oOo00 = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oOOoO) {
                o00oOOoO o00ooooo2 = (o00oOOoO) obj;
                int i = this.f4294o00oOOo0;
                if (i != o00ooooo2.f4294o00oOOo0) {
                    return false;
                }
                if (i == 8 && Math.abs(this.f4297o00oOooO - this.f4295o00oOOoO) == 1 && this.f4297o00oOooO == o00ooooo2.f4295o00oOOoO && this.f4295o00oOOoO == o00ooooo2.f4297o00oOooO) {
                    return true;
                }
                if (this.f4297o00oOooO == o00ooooo2.f4297o00oOooO && this.f4295o00oOOoO == o00ooooo2.f4295o00oOOoO) {
                    Object obj2 = this.f4296o00oOo00;
                    Object obj3 = o00ooooo2.f4296o00oOo00;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f4294o00oOOo0 * 31) + this.f4295o00oOOoO) * 31) + this.f4297o00oOooO;
        }

        public String o00oOOo0() {
            int i = this.f4294o00oOOo0;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + o00oOOo0() + ",s:" + this.f4295o00oOOoO + "c:" + this.f4297o00oOooO + ",p:" + this.f4296o00oOo00 + "]";
        }
    }

    public o00oOOo0(InterfaceC0037o00oOOo0 interfaceC0037o00oOOo0) {
        this(interfaceC0037o00oOOo0, false);
    }

    public o00oOOo0(InterfaceC0037o00oOOo0 interfaceC0037o00oOOo0, boolean z) {
        this.f4281o00oOOo0 = new oO000OOo.o00oOOoO(30);
        this.f4282o00oOOoO = new ArrayList<>();
        this.f4283o00oOo00 = new ArrayList<>();
        this.f4286o00oOoO = 0;
        this.f4288o00oOooO = interfaceC0037o00oOOo0;
        this.f4285o00oOo0o = z;
        this.f4287o00oOoO0 = new o0O00O0o(this);
    }

    @Override // androidx.recyclerview.widget.o0O00O0o.o00oOOo0
    public o00oOOoO o00oOOo0(int i, int i2, int i3, Object obj) {
        o00oOOoO acquire = this.f4281o00oOOo0.acquire();
        if (acquire == null) {
            return new o00oOOoO(i, i2, i3, obj);
        }
        acquire.f4294o00oOOo0 = i;
        acquire.f4295o00oOOoO = i2;
        acquire.f4297o00oOooO = i3;
        acquire.f4296o00oOo00 = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.o0O00O0o.o00oOOo0
    public void o00oOOoO(o00oOOoO o00ooooo2) {
        if (this.f4285o00oOo0o) {
            return;
        }
        o00ooooo2.f4296o00oOo00 = null;
        this.f4281o00oOOo0.o00oOOo0(o00ooooo2);
    }

    public o00oOOo0 o00oOo00(o00oOOoO... o00oooooArr) {
        Collections.addAll(this.f4282o00oOOoO, o00oooooArr);
        return this;
    }

    public final void o00oOo0O(o00oOOoO o00ooooo2) {
        o00oo(o00ooooo2);
    }

    public int o00oOo0o(int i) {
        int size = this.f4282o00oOOoO.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00oOOoO o00ooooo2 = this.f4282o00oOOoO.get(i2);
            int i3 = o00ooooo2.f4294o00oOOo0;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = o00ooooo2.f4295o00oOOoO;
                    if (i4 <= i) {
                        int i5 = o00ooooo2.f4297o00oOooO;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = o00ooooo2.f4295o00oOOoO;
                    if (i6 == i) {
                        i = o00ooooo2.f4297o00oOooO;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (o00ooooo2.f4297o00oOooO <= i) {
                            i++;
                        }
                    }
                }
            } else if (o00ooooo2.f4295o00oOOoO <= i) {
                i += o00ooooo2.f4297o00oOooO;
            }
        }
        return i;
    }

    public final void o00oOoO(o00oOOoO o00ooooo2) {
        int i = o00ooooo2.f4295o00oOOoO;
        int i2 = o00ooooo2.f4297o00oOooO + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f4288o00oOooO.o00oOo0o(i) != null || o00oOoOO(i)) {
                if (!z) {
                    o00oOooo(o00oOOo0(4, i4, i3, o00ooooo2.f4296o00oOo00));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            } else {
                if (z) {
                    o00oo(o00oOOo0(4, i4, i3, o00ooooo2.f4296o00oOo00));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            }
            i3++;
            i++;
        }
        if (i3 != o00ooooo2.f4297o00oOooO) {
            Object obj = o00ooooo2.f4296o00oOo00;
            o00oOOoO(o00ooooo2);
            o00ooooo2 = o00oOOo0(4, i4, i3, obj);
        }
        if (z) {
            o00oo(o00ooooo2);
        } else {
            o00oOooo(o00ooooo2);
        }
    }

    public final void o00oOoO0(o00oOOoO o00ooooo2) {
        boolean z;
        char c;
        int i = o00ooooo2.f4295o00oOOoO;
        int i2 = o00ooooo2.f4297o00oOooO + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4288o00oOooO.o00oOo0o(i3) != null || o00oOoOO(i3)) {
                if (c2 == 0) {
                    o00oOooo(o00oOOo0(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    o00oo(o00oOOo0(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != o00ooooo2.f4297o00oOooO) {
            o00oOOoO(o00ooooo2);
            o00ooooo2 = o00oOOo0(2, i, i4, null);
        }
        if (c2 == 0) {
            o00oOooo(o00ooooo2);
        } else {
            o00oo(o00ooooo2);
        }
    }

    public final boolean o00oOoOO(int i) {
        int size = this.f4283o00oOo00.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00oOOoO o00ooooo2 = this.f4283o00oOo00.get(i2);
            int i3 = o00ooooo2.f4294o00oOOo0;
            if (i3 == 8) {
                if (o00oo0OO(o00ooooo2.f4297o00oOooO, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = o00ooooo2.f4295o00oOOoO;
                int i5 = o00ooooo2.f4297o00oOooO + i4;
                while (i4 < i5) {
                    if (o00oo0OO(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void o00oOoOo() {
        int size = this.f4283o00oOo00.size();
        for (int i = 0; i < size; i++) {
            this.f4288o00oOooO.o00oOo00(this.f4283o00oOo00.get(i));
        }
        o00ooO0(this.f4283o00oOo00);
        this.f4286o00oOoO = 0;
    }

    public void o00oOoo0() {
        o00oOoOo();
        int size = this.f4282o00oOOoO.size();
        for (int i = 0; i < size; i++) {
            o00oOOoO o00ooooo2 = this.f4282o00oOOoO.get(i);
            int i2 = o00ooooo2.f4294o00oOOo0;
            if (i2 == 1) {
                this.f4288o00oOooO.o00oOo00(o00ooooo2);
                this.f4288o00oOooO.o00oOoO0(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
            } else if (i2 == 2) {
                this.f4288o00oOooO.o00oOo00(o00ooooo2);
                this.f4288o00oOooO.o00oOoO(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
            } else if (i2 == 4) {
                this.f4288o00oOooO.o00oOo00(o00ooooo2);
                this.f4288o00oOooO.o00oOo0O(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO, o00ooooo2.f4296o00oOo00);
            } else if (i2 == 8) {
                this.f4288o00oOooO.o00oOo00(o00ooooo2);
                this.f4288o00oOooO.o00oOOo0(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
            }
            Runnable runnable = this.f4284o00oOo0O;
            if (runnable != null) {
                runnable.run();
            }
        }
        o00ooO0(this.f4282o00oOOoO);
        this.f4286o00oOoO = 0;
    }

    public final void o00oOooO(o00oOOoO o00ooooo2) {
        o00oo(o00ooooo2);
    }

    public final void o00oOooo(o00oOOoO o00ooooo2) {
        int i;
        int i2 = o00ooooo2.f4294o00oOOo0;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o00ooO0o2 = o00ooO0o(o00ooooo2.f4295o00oOOoO, i2);
        int i3 = o00ooooo2.f4295o00oOOoO;
        int i4 = o00ooooo2.f4294o00oOOo0;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + o00ooooo2);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < o00ooooo2.f4297o00oOooO; i6++) {
            int o00ooO0o3 = o00ooO0o((i * i6) + o00ooooo2.f4295o00oOOoO, o00ooooo2.f4294o00oOOo0);
            int i7 = o00ooooo2.f4294o00oOOo0;
            if (i7 == 2 ? o00ooO0o3 == o00ooO0o2 : i7 == 4 && o00ooO0o3 == o00ooO0o2 + 1) {
                i5++;
            } else {
                o00oOOoO o00oOOo02 = o00oOOo0(i7, o00ooO0o2, i5, o00ooooo2.f4296o00oOo00);
                o00oo00O(o00oOOo02, i3);
                o00oOOoO(o00oOOo02);
                if (o00ooooo2.f4294o00oOOo0 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                o00ooO0o2 = o00ooO0o3;
            }
        }
        Object obj = o00ooooo2.f4296o00oOo00;
        o00oOOoO(o00ooooo2);
        if (i5 > 0) {
            o00oOOoO o00oOOo03 = o00oOOo0(o00ooooo2.f4294o00oOOo0, o00ooO0o2, i5, obj);
            o00oo00O(o00oOOo03, i3);
            o00oOOoO(o00oOOo03);
        }
    }

    public final void o00oo(o00oOOoO o00ooooo2) {
        this.f4283o00oOo00.add(o00ooooo2);
        int i = o00ooooo2.f4294o00oOOo0;
        if (i == 1) {
            this.f4288o00oOooO.o00oOoO0(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
        } else if (i == 2) {
            this.f4288o00oOooO.o00oOooO(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
        } else if (i == 4) {
            this.f4288o00oOooO.o00oOo0O(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO, o00ooooo2.f4296o00oOo00);
        } else if (i == 8) {
            this.f4288o00oOooO.o00oOOo0(o00ooooo2.f4295o00oOOoO, o00ooooo2.f4297o00oOooO);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + o00ooooo2);
        }
    }

    public int o00oo0(int i) {
        return o00oo0OO(i, 0);
    }

    public void o00oo00O(o00oOOoO o00ooooo2, int i) {
        this.f4288o00oOooO.o00oOOoO(o00ooooo2);
        int i2 = o00ooooo2.f4294o00oOOo0;
        if (i2 == 2) {
            this.f4288o00oOooO.o00oOoO(i, o00ooooo2.f4297o00oOooO);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f4288o00oOooO.o00oOo0O(i, o00ooooo2.f4297o00oOooO, o00ooooo2.f4296o00oOo00);
        }
    }

    public boolean o00oo0O() {
        return this.f4282o00oOOoO.size() > 0;
    }

    public boolean o00oo0O0(int i) {
        return (i & this.f4286o00oOoO) != 0;
    }

    public int o00oo0OO(int i, int i2) {
        int size = this.f4283o00oOo00.size();
        while (i2 < size) {
            o00oOOoO o00ooooo2 = this.f4283o00oOo00.get(i2);
            int i3 = o00ooooo2.f4294o00oOOo0;
            if (i3 == 8) {
                int i4 = o00ooooo2.f4295o00oOOoO;
                if (i4 == i) {
                    i = o00ooooo2.f4297o00oOooO;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (o00ooooo2.f4297o00oOooO <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = o00ooooo2.f4295o00oOOoO;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = o00ooooo2.f4297o00oOooO;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += o00ooooo2.f4297o00oOooO;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean o00oo0Oo() {
        return (this.f4283o00oOo00.isEmpty() || this.f4282o00oOOoO.isEmpty()) ? false : true;
    }

    public boolean o00oo0o(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4282o00oOOoO.add(o00oOOo0(1, i, i2, null));
        this.f4286o00oOoO |= 1;
        return this.f4282o00oOOoO.size() == 1;
    }

    public boolean o00oo0o0(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4282o00oOOoO.add(o00oOOo0(4, i, i2, obj));
        this.f4286o00oOoO |= 4;
        return this.f4282o00oOOoO.size() == 1;
    }

    public boolean o00oo0oO(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4282o00oOOoO.add(o00oOOo0(8, i, i2, null));
            this.f4286o00oOoO |= 8;
            return this.f4282o00oOOoO.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public void o00ooO0(List<o00oOOoO> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o00oOOoO(list.get(i));
        }
        list.clear();
    }

    public void o00ooO00() {
        this.f4287o00oOoO0.o00oOOoO(this.f4282o00oOOoO);
        int size = this.f4282o00oOOoO.size();
        for (int i = 0; i < size; i++) {
            o00oOOoO o00ooooo2 = this.f4282o00oOOoO.get(i);
            int i2 = o00ooooo2.f4294o00oOOo0;
            if (i2 == 1) {
                o00oo(o00ooooo2);
            } else if (i2 == 2) {
                o00oOoO0(o00ooooo2);
            } else if (i2 == 4) {
                o00oOoO(o00ooooo2);
            } else if (i2 == 8) {
                o00oo(o00ooooo2);
            }
            Runnable runnable = this.f4284o00oOo0O;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4282o00oOOoO.clear();
    }

    public void o00ooO0O() {
        o00ooO0(this.f4282o00oOOoO);
        o00ooO0(this.f4283o00oOo00);
        this.f4286o00oOoO = 0;
    }

    public final int o00ooO0o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f4283o00oOo00.size() - 1; size >= 0; size--) {
            o00oOOoO o00ooooo2 = this.f4283o00oOo00.get(size);
            int i9 = o00ooooo2.f4294o00oOOo0;
            if (i9 == 8) {
                int i10 = o00ooooo2.f4295o00oOOoO;
                int i11 = o00ooooo2.f4297o00oOooO;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            o00ooooo2.f4295o00oOOoO = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            o00ooooo2.f4295o00oOOoO = i10 - 1;
                            i6 = i11 - 1;
                        }
                        o00ooooo2.f4297o00oOooO = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    o00ooooo2.f4297o00oOooO = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    o00ooooo2.f4295o00oOOoO = i7;
                    i--;
                }
            } else {
                int i12 = o00ooooo2.f4295o00oOOoO;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    o00ooooo2.f4295o00oOOoO = i3;
                } else if (i9 == 1) {
                    i -= o00ooooo2.f4297o00oOooO;
                } else if (i9 == 2) {
                    i += o00ooooo2.f4297o00oOooO;
                }
            }
        }
        for (int size2 = this.f4283o00oOo00.size() - 1; size2 >= 0; size2--) {
            o00oOOoO o00ooooo3 = this.f4283o00oOo00.get(size2);
            if (o00ooooo3.f4294o00oOOo0 == 8) {
                int i13 = o00ooooo3.f4297o00oOooO;
                if (i13 != o00ooooo3.f4295o00oOOoO && i13 >= 0) {
                }
                this.f4283o00oOo00.remove(size2);
                o00oOOoO(o00ooooo3);
            } else {
                if (o00ooooo3.f4297o00oOooO > 0) {
                }
                this.f4283o00oOo00.remove(size2);
                o00oOOoO(o00ooooo3);
            }
        }
        return i;
    }

    public boolean o0O0o(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4282o00oOOoO.add(o00oOOo0(2, i, i2, null));
        this.f4286o00oOoO |= 2;
        return this.f4282o00oOOoO.size() == 1;
    }
}
