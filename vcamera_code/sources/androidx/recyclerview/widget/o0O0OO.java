package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO000OOo;
/* loaded from: classes.dex */
public class o0O0OO {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f4648o00oOo00 = false;
    @o0o0000

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final androidx.collection.o00ooO0<RecyclerView.o0O00oO0, o00oOOo0> f4649o00oOOo0 = new androidx.collection.o00ooO0<>();
    @o0o0000

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final androidx.collection.o00oo0OO<RecyclerView.o0O00oO0> f4650o00oOOoO = new androidx.collection.o00oo0OO<>();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f4651o00oOo0O = 2;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f4652o00oOo0o = 4;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f4653o00oOoO = 3;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f4654o00oOoO0 = 8;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f4655o00oOoOO = 12;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f4656o00oOoOo = 14;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static oO000OOo.o00oOOo0<o00oOOo0> f4657o00oOoo0 = new oO000OOo.o00oOOoO(20);

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f4658o00oOooO = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4659o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public RecyclerView.o00ooO0.o00oOo0O f4660o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public RecyclerView.o00ooO0.o00oOo0O f4661o00oOo00;

        public static void o00oOOo0() {
            do {
            } while (f4657o00oOoo0.acquire() != null);
        }

        public static o00oOOo0 o00oOOoO() {
            o00oOOo0 acquire = f4657o00oOoo0.acquire();
            return acquire == null ? new o00oOOo0() : acquire;
        }

        public static void o00oOo00(o00oOOo0 o00oooo02) {
            o00oooo02.f4659o00oOOo0 = 0;
            o00oooo02.f4660o00oOOoO = null;
            o00oooo02.f4661o00oOo00 = null;
            f4657o00oOoo0.o00oOOo0(o00oooo02);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(RecyclerView.o0O00oO0 o0o00oo0, @o0OO00OO RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, RecyclerView.o00ooO0.o00oOo0O o00ooo0o3);

        void o00oOOoO(RecyclerView.o0O00oO0 o0o00oo0);

        void o00oOo00(RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @o0OO00OO RecyclerView.o00ooO0.o00oOo0O o00ooo0o3);

        void o00oOooO(RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o2, @oo0oO0 RecyclerView.o00ooO0.o00oOo0O o00ooo0o3);
    }

    public void o00oOOo0(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o00ooO0.o00oOo0O o00ooo0o2) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        if (o00oooo02 == null) {
            o00oooo02 = o00oOOo0.o00oOOoO();
            this.f4649o00oOOo0.put(o0o00oo0, o00oooo02);
        }
        o00oooo02.f4659o00oOOo0 |= 2;
        o00oooo02.f4660o00oOOoO = o00ooo0o2;
    }

    public void o00oOOoO(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        if (o00oooo02 == null) {
            o00oooo02 = o00oOOo0.o00oOOoO();
            this.f4649o00oOOo0.put(o0o00oo0, o00oooo02);
        }
        o00oooo02.f4659o00oOOo0 |= 1;
    }

    public void o00oOo00(long j, RecyclerView.o0O00oO0 o0o00oo0) {
        this.f4650o00oOOoO.o00oo0Oo(j, o0o00oo0);
    }

    public void o00oOo0O(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o00ooO0.o00oOo0O o00ooo0o2) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        if (o00oooo02 == null) {
            o00oooo02 = o00oOOo0.o00oOOoO();
            this.f4649o00oOOo0.put(o0o00oo0, o00oooo02);
        }
        o00oooo02.f4660o00oOOoO = o00ooo0o2;
        o00oooo02.f4659o00oOOo0 |= 4;
    }

    public void o00oOo0o() {
        this.f4649o00oOOo0.clear();
        this.f4650o00oOOoO.o00oOo00();
    }

    public boolean o00oOoO(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        return (o00oooo02 == null || (o00oooo02.f4659o00oOOo0 & 1) == 0) ? false : true;
    }

    public RecyclerView.o0O00oO0 o00oOoO0(long j) {
        return this.f4650o00oOOoO.o00oOooo(j);
    }

    public boolean o00oOoOO(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        return (o00oooo02 == null || (o00oooo02.f4659o00oOOo0 & 4) == 0) ? false : true;
    }

    public void o00oOoOo() {
        o00oOOo0.o00oOOo0();
    }

    public void o00oOoo0(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oo0O0(o0o00oo0);
    }

    public void o00oOooO(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o00ooO0.o00oOo0O o00ooo0o2) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        if (o00oooo02 == null) {
            o00oooo02 = o00oOOo0.o00oOOoO();
            this.f4649o00oOOo0.put(o0o00oo0, o00oooo02);
        }
        o00oooo02.f4661o00oOo00 = o00ooo0o2;
        o00oooo02.f4659o00oOOo0 |= 8;
    }

    public final RecyclerView.o00ooO0.o00oOo0O o00oOooo(RecyclerView.o0O00oO0 o0o00oo0, int i) {
        o00oOOo0 o00oo02;
        RecyclerView.o00ooO0.o00oOo0O o00ooo0o2;
        int o00oOoO02 = this.f4649o00oOOo0.o00oOoO0(o0o00oo0);
        if (o00oOoO02 >= 0 && (o00oo02 = this.f4649o00oOOo0.o00oo0(o00oOoO02)) != null) {
            int i2 = o00oo02.f4659o00oOOo0;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                o00oo02.f4659o00oOOo0 = i3;
                if (i == 4) {
                    o00ooo0o2 = o00oo02.f4660o00oOOoO;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    o00ooo0o2 = o00oo02.f4661o00oOo00;
                }
                if ((i3 & 12) == 0) {
                    this.f4649o00oOOo0.o00oOooo(o00oOoO02);
                    o00oOOo0.o00oOo00(o00oo02);
                }
                return o00ooo0o2;
            }
        }
        return null;
    }

    @o0OO00OO
    public RecyclerView.o00ooO0.o00oOo0O o00oo0(RecyclerView.o0O00oO0 o0o00oo0) {
        return o00oOooo(o0o00oo0, 4);
    }

    @o0OO00OO
    public RecyclerView.o00ooO0.o00oOo0O o00oo00O(RecyclerView.o0O00oO0 o0o00oo0) {
        return o00oOooo(o0o00oo0, 8);
    }

    public void o00oo0O(RecyclerView.o0O00oO0 o0o00oo0) {
        int o00ooO0o2 = this.f4650o00oOOoO.o00ooO0o() - 1;
        while (true) {
            if (o00ooO0o2 < 0) {
                break;
            } else if (o0o00oo0 == this.f4650o00oOOoO.o00ooO(o00ooO0o2)) {
                this.f4650o00oOOoO.o00oo(o00ooO0o2);
                break;
            } else {
                o00ooO0o2--;
            }
        }
        o00oOOo0 remove = this.f4649o00oOOo0.remove(o0o00oo0);
        if (remove != null) {
            o00oOOo0.o00oOo00(remove);
        }
    }

    public void o00oo0O0(RecyclerView.o0O00oO0 o0o00oo0) {
        o00oOOo0 o00oooo02 = this.f4649o00oOOo0.get(o0o00oo0);
        if (o00oooo02 == null) {
            return;
        }
        o00oooo02.f4659o00oOOo0 &= -2;
    }

    public void o00oo0OO(o00oOOoO o00ooooo2) {
        RecyclerView.o00ooO0.o00oOo0O o00ooo0o2;
        RecyclerView.o00ooO0.o00oOo0O o00ooo0o3;
        for (int size = this.f4649o00oOOo0.size() - 1; size >= 0; size--) {
            RecyclerView.o0O00oO0 o00oOoOo2 = this.f4649o00oOOo0.o00oOoOo(size);
            o00oOOo0 o00oOooo2 = this.f4649o00oOOo0.o00oOooo(size);
            int i = o00oOooo2.f4659o00oOOo0;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    o00ooo0o2 = o00oOooo2.f4660o00oOOoO;
                    o00ooo0o3 = o00ooo0o2 != null ? o00oOooo2.f4661o00oOo00 : null;
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            o00ooooo2.o00oOooO(o00oOoOo2, o00oOooo2.f4660o00oOOoO, o00oOooo2.f4661o00oOo00);
                        } else if ((i & 4) != 0) {
                            o00ooo0o2 = o00oOooo2.f4660o00oOOoO;
                        } else if ((i & 8) == 0) {
                        }
                        o00oOOo0.o00oOo00(o00oOooo2);
                    }
                    o00ooooo2.o00oOOo0(o00oOoOo2, o00oOooo2.f4660o00oOOoO, o00oOooo2.f4661o00oOo00);
                    o00oOOo0.o00oOo00(o00oOooo2);
                }
                o00ooooo2.o00oOo00(o00oOoOo2, o00ooo0o2, o00ooo0o3);
                o00oOOo0.o00oOo00(o00oOooo2);
            }
            o00ooooo2.o00oOOoO(o00oOoOo2);
            o00oOOo0.o00oOo00(o00oOooo2);
        }
    }
}
