package o00ooOO0;

import android.support.v4.media.o00oOo00;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOoOo.o00oo;
import o00ooO.o00oOOoO;
import o00ooO.o00oOo0O;
import o00ooO.o00oOoO;
import o00ooO0.o00oo00O;
/* loaded from: classes.dex */
public class o0oO0Ooo {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static int f8937o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final boolean f8938o00oOoO0 = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8940o00oOOoO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8944o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ArrayList<o00oOoO> f8939o00oOOo0 = new ArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f8941o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<o00oOOo0> f8942o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8943o00oOo0o = -1;

    /* loaded from: classes.dex */
    public class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public WeakReference<o00oOoO> f8945o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f8946o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f8947o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f8948o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f8949o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f8951o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f8952o00oOooO;

        public o00oOOo0(o00oOoO o00oooo2, o00oo00O o00oo00o, int i) {
            this.f8945o00oOOo0 = new WeakReference<>(o00oooo2);
            this.f8946o00oOOoO = o00oo00o.o00oooOO(o00oooo2.f7704o00ooo00);
            this.f8947o00oOo00 = o00oo00o.o00oooOO(o00oooo2.f7703o00ooo0);
            this.f8952o00oOooO = o00oo00o.o00oooOO(o00oooo2.f7705o00ooo0O);
            this.f8948o00oOo0O = o00oo00o.o00oooOO(o00oooo2.f7706o00ooo0o);
            this.f8949o00oOo0o = o00oo00o.o00oooOO(o00oooo2.f7707o00oooO);
            this.f8951o00oOoO0 = i;
        }

        public void o00oOOo0() {
            o00oOoO o00oooo2 = this.f8945o00oOOo0.get();
            if (o00oooo2 != null) {
                o00oooo2.o0O0Oooo(this.f8946o00oOOoO, this.f8947o00oOo00, this.f8952o00oOooO, this.f8948o00oOo0O, this.f8949o00oOo0o, this.f8951o00oOoO0);
            }
        }
    }

    public o0oO0Ooo(int i) {
        int i2 = f8937o00oOoO;
        f8937o00oOoO = i2 + 1;
        this.f8940o00oOOoO = i2;
        this.f8944o00oOooO = i;
    }

    public boolean o00oOOo0(o00oOoO o00oooo2) {
        if (this.f8939o00oOOo0.contains(o00oooo2)) {
            return false;
        }
        this.f8939o00oOOo0.add(o00oooo2);
        return true;
    }

    public void o00oOOoO() {
        if (this.f8942o00oOo0O != null && this.f8941o00oOo00) {
            for (int i = 0; i < this.f8942o00oOo0O.size(); i++) {
                this.f8942o00oOo0O.get(i).o00oOOo0();
            }
        }
    }

    public void o00oOo00(ArrayList<o0oO0Ooo> arrayList) {
        int size = this.f8939o00oOOo0.size();
        if (this.f8943o00oOo0o != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o0oO0Ooo o0oo0ooo = arrayList.get(i);
                if (this.f8943o00oOo0o == o0oo0ooo.f8940o00oOOoO) {
                    o00oo00O(this.f8944o00oOooO, o0oo0ooo);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final boolean o00oOo0O(o00oOoO o00oooo2) {
        return this.f8939o00oOOo0.contains(o00oooo2);
    }

    public int o00oOo0o() {
        return this.f8940o00oOOoO;
    }

    public final String o00oOoO() {
        int i = this.f8944o00oOooO;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    public int o00oOoO0() {
        return this.f8944o00oOooO;
    }

    public boolean o00oOoOO(o0oO0Ooo o0oo0ooo) {
        for (int i = 0; i < this.f8939o00oOOo0.size(); i++) {
            if (o0oo0ooo.o00oOo0O(this.f8939o00oOOo0.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean o00oOoOo() {
        return this.f8941o00oOo00;
    }

    public final int o00oOoo0(int i, o00oOoO o00oooo2) {
        o00oOoO.o00oOOoO o00ooO0O2 = o00oooo2.o00ooO0O(i);
        if (o00ooO0O2 == o00oOoO.o00oOOoO.WRAP_CONTENT || o00ooO0O2 == o00oOoO.o00oOOoO.MATCH_PARENT || o00ooO0O2 == o00oOoO.o00oOOoO.FIXED) {
            return i == 0 ? o00oooo2.o0OoO00O() : o00oooo2.o00ooOO();
        }
        return -1;
    }

    public void o00oOooO() {
        this.f8939o00oOOo0.clear();
    }

    public int o00oOooo(o00oo00O o00oo00o, int i) {
        if (this.f8939o00oOOo0.size() == 0) {
            return 0;
        }
        return o00oo0O(o00oo00o, this.f8939o00oOOo0, i);
    }

    public void o00oo0(boolean z) {
        this.f8941o00oOo00 = z;
    }

    public void o00oo00O(int i, o0oO0Ooo o0oo0ooo) {
        Iterator<o00oOoO> it = this.f8939o00oOOo0.iterator();
        while (it.hasNext()) {
            o00oOoO next = it.next();
            o0oo0ooo.o00oOOo0(next);
            int o00oOo0o2 = o0oo0ooo.o00oOo0o();
            if (i == 0) {
                next.f7746o0O0OOO = o00oOo0o2;
            } else {
                next.f7748o0O0OOOo = o00oOo0o2;
            }
        }
        this.f8943o00oOo0o = o0oo0ooo.f8940o00oOOoO;
    }

    public final int o00oo0O(o00oo00O o00oo00o, ArrayList<o00oOoO> arrayList, int i) {
        int o00oooOO2;
        o00oOo0O o00ooo0o2;
        o00ooO.o00oo00O o00oo00o2 = (o00ooO.o00oo00O) arrayList.get(0).o0();
        o00oo00o.o0O000();
        o00oo00o2.o00oOoO0(o00oo00o, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).o00oOoO0(o00oo00o, false);
        }
        if (i == 0 && o00oo00o2.f7831o0O0oOo0 > 0) {
            o00oOOoO.o00oOOoO(o00oo00o2, o00oo00o, arrayList, 0);
        }
        if (i == 1 && o00oo00o2.f7848oo0oOOo > 0) {
            o00oOOoO.o00oOOoO(o00oo00o2, o00oo00o, arrayList, 1);
        }
        try {
            o00oo00o.o00ooooo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f8942o00oOo0O = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f8942o00oOo0O.add(new o00oOOo0(arrayList.get(i3), o00oo00o, i));
        }
        if (i == 0) {
            o00oooOO2 = o00oo00o.o00oooOO(o00oo00o2.f7704o00ooo00);
            o00ooo0o2 = o00oo00o2.f7705o00ooo0O;
        } else {
            o00oooOO2 = o00oo00o.o00oooOO(o00oo00o2.f7703o00ooo0);
            o00ooo0o2 = o00oo00o2.f7706o00ooo0o;
        }
        int o00oooOO3 = o00oo00o.o00oooOO(o00ooo0o2);
        o00oo00o.o0O000();
        return o00oooOO3 - o00oooOO2;
    }

    public int o00oo0O0() {
        return this.f8939o00oOOo0.size();
    }

    public void o00oo0OO(int i) {
        this.f8944o00oOooO = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o00oOoO());
        sb.append(" [");
        String o00oOOo02 = o00oOo00.o00oOOo0(sb, this.f8940o00oOOoO, "] <");
        Iterator<o00oOoO> it = this.f8939o00oOOo0.iterator();
        while (it.hasNext()) {
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo02, " ");
            o00oOOo03.append(it.next().o00ooO0());
            o00oOOo02 = o00oOOo03.toString();
        }
        return o00oo.o00oOOo0(o00oOOo02, " >");
    }
}
