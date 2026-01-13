package o00ooO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o00ooO0.o00oo0O;
import o00ooOO0.o0O00O0;
import o00ooOO0.o0oO0Ooo;
/* loaded from: classes.dex */
public class o00oOo0O {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final boolean f7628o00oOoOo = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f7629o00oOoo0 = -1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f7631o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f7632o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oOOoO f7633o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o00oOo0O f7634o00oOo0o;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o00ooO0.o00oo0O f7637o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oOoO f7638o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashSet<o00oOo0O> f7630o00oOOo0 = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f7636o00oOoO0 = 0;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f7635o00oOoO = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f7639o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f7639o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7639o00oOOo0[o00oOOoO.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public o00oOo0O(o00oOoO o00oooo2, o00oOOoO o00ooooo2) {
        this.f7638o00oOooO = o00oooo2;
        this.f7633o00oOo0O = o00ooooo2;
    }

    public boolean o00oOOo0(o00oOo0O o00ooo0o2, int i) {
        return o00oOOoO(o00ooo0o2, i, -1, false);
    }

    public boolean o00oOOoO(o00oOo0O o00ooo0o2, int i, int i2, boolean z) {
        if (o00ooo0o2 == null) {
            o00ooO00();
            return true;
        } else if (z || o0O0o(o00ooo0o2)) {
            this.f7634o00oOo0o = o00ooo0o2;
            if (o00ooo0o2.f7630o00oOOo0 == null) {
                o00ooo0o2.f7630o00oOOo0 = new HashSet<>();
            }
            HashSet<o00oOo0O> hashSet = this.f7634o00oOo0o.f7630o00oOOo0;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f7636o00oOoO0 = i;
            } else {
                this.f7636o00oOoO0 = 0;
            }
            this.f7635o00oOoO = i2;
            return true;
        } else {
            return false;
        }
    }

    public void o00oOo00(o00oOo0O o00ooo0o2, HashMap<o00oOoO, o00oOoO> hashMap) {
        HashSet<o00oOo0O> hashSet;
        o00oOo0O o00ooo0o3 = this.f7634o00oOo0o;
        if (o00ooo0o3 != null && (hashSet = o00ooo0o3.f7630o00oOOo0) != null) {
            hashSet.remove(this);
        }
        o00oOo0O o00ooo0o4 = o00ooo0o2.f7634o00oOo0o;
        this.f7634o00oOo0o = o00ooo0o4 != null ? hashMap.get(o00ooo0o2.f7634o00oOo0o.f7638o00oOooO).o00oo0Oo(o00ooo0o4.o00oOooo()) : null;
        o00oOo0O o00ooo0o5 = this.f7634o00oOo0o;
        if (o00ooo0o5 != null) {
            if (o00ooo0o5.f7630o00oOOo0 == null) {
                o00ooo0o5.f7630o00oOOo0 = new HashSet<>();
            }
            this.f7634o00oOo0o.f7630o00oOOo0.add(this);
        }
        this.f7636o00oOoO0 = o00ooo0o2.f7636o00oOoO0;
        this.f7635o00oOoO = o00ooo0o2.f7635o00oOoO;
    }

    public HashSet<o00oOo0O> o00oOo0O() {
        return this.f7630o00oOOo0;
    }

    public int o00oOo0o() {
        if (this.f7632o00oOo00) {
            return this.f7631o00oOOoO;
        }
        return 0;
    }

    public final o00oOo0O o00oOoO() {
        switch (o00oOOo0.f7639o00oOOo0[this.f7633o00oOo0O.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f7638o00oOooO.f7705o00ooo0O;
            case 3:
                return this.f7638o00oOooO.f7704o00ooo00;
            case 4:
                return this.f7638o00oOooO.f7706o00ooo0o;
            case 5:
                return this.f7638o00oOooO.f7703o00ooo0;
            default:
                throw new AssertionError(this.f7633o00oOo0O.name());
        }
    }

    public int o00oOoO0() {
        o00oOo0O o00ooo0o2;
        if (this.f7638o00oOooO.o0O00O0() == 8) {
            return 0;
        }
        return (this.f7635o00oOoO <= -1 || (o00ooo0o2 = this.f7634o00oOo0o) == null || o00ooo0o2.f7638o00oOooO.o0O00O0() != 8) ? this.f7636o00oOoO0 : this.f7635o00oOoO;
    }

    public o00oOoO o00oOoOO() {
        return this.f7638o00oOooO;
    }

    public o00ooO0.o00oo0O o00oOoOo() {
        return this.f7637o00oOoOO;
    }

    public o00oOo0O o00oOoo0() {
        return this.f7634o00oOo0o;
    }

    public void o00oOooO(int i, ArrayList<o0oO0Ooo> arrayList, o0oO0Ooo o0oo0ooo) {
        HashSet<o00oOo0O> hashSet = this.f7630o00oOOo0;
        if (hashSet != null) {
            Iterator<o00oOo0O> it = hashSet.iterator();
            while (it.hasNext()) {
                o0O00O0.o00oOOo0(it.next().f7638o00oOooO, i, arrayList, o0oo0ooo);
            }
        }
    }

    public o00oOOoO o00oOooo() {
        return this.f7633o00oOo0O;
    }

    public boolean o00oo() {
        switch (o00oOOo0.f7639o00oOOo0[this.f7633o00oOo0O.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f7633o00oOo0O.name());
        }
    }

    public boolean o00oo0() {
        HashSet<o00oOo0O> hashSet = this.f7630o00oOOo0;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o00oo00O() {
        HashSet<o00oOo0O> hashSet = this.f7630o00oOOo0;
        if (hashSet == null) {
            return false;
        }
        Iterator<o00oOo0O> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().o00oOoO().o00oo0O0()) {
                return true;
            }
        }
        return false;
    }

    public boolean o00oo0O(o00oOoO o00oooo2) {
        if (o00oo0o0(o00oooo2, new HashSet<>())) {
            return false;
        }
        o00oOoO o02 = o00oOoOO().o0();
        return o02 == o00oooo2 || o00oooo2.o0() == o02;
    }

    public boolean o00oo0O0() {
        return this.f7634o00oOo0o != null;
    }

    public boolean o00oo0OO() {
        return this.f7632o00oOo00;
    }

    public boolean o00oo0Oo(o00oOoO o00oooo2, o00oOo0O o00ooo0o2) {
        return o00oo0O(o00oooo2);
    }

    public boolean o00oo0o() {
        switch (o00oOOo0.f7639o00oOOo0[this.f7633o00oOo0O.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f7633o00oOo0O.name());
        }
    }

    public final boolean o00oo0o0(o00oOoO o00oooo2, HashSet<o00oOoO> hashSet) {
        if (hashSet.contains(o00oooo2)) {
            return false;
        }
        hashSet.add(o00oooo2);
        if (o00oooo2 == o00oOoOO()) {
            return true;
        }
        ArrayList<o00oOo0O> o00oo0o02 = o00oooo2.o00oo0o0();
        int size = o00oo0o02.size();
        for (int i = 0; i < size; i++) {
            o00oOo0O o00ooo0o2 = o00oo0o02.get(i);
            if (o00ooo0o2.o00oo0oO(this) && o00ooo0o2.o00oo0O0() && o00oo0o0(o00ooo0o2.o00oOoo0().o00oOoOO(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean o00oo0oO(o00oOo0O o00ooo0o2) {
        o00oOOoO o00oOooo2 = o00ooo0o2.o00oOooo();
        o00oOOoO o00ooooo2 = this.f7633o00oOo0O;
        if (o00oOooo2 == o00ooooo2) {
            return true;
        }
        switch (o00oOOo0.f7639o00oOOo0[o00ooooo2.ordinal()]) {
            case 1:
                return o00oOooo2 != o00oOOoO.BASELINE;
            case 2:
            case 3:
            case 7:
                return o00oOooo2 == o00oOOoO.LEFT || o00oOooo2 == o00oOOoO.RIGHT || o00oOooo2 == o00oOOoO.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return o00oOooo2 == o00oOOoO.TOP || o00oOooo2 == o00oOOoO.BOTTOM || o00oOooo2 == o00oOOoO.CENTER_Y || o00oOooo2 == o00oOOoO.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f7633o00oOo0O.name());
        }
    }

    public void o00ooO(int i) {
        if (o00oo0O0()) {
            this.f7635o00oOoO = i;
        }
    }

    public void o00ooO0() {
        this.f7632o00oOo00 = false;
        this.f7631o00oOOoO = 0;
    }

    public void o00ooO00() {
        HashSet<o00oOo0O> hashSet;
        o00oOo0O o00ooo0o2 = this.f7634o00oOo0o;
        if (o00ooo0o2 != null && (hashSet = o00ooo0o2.f7630o00oOOo0) != null) {
            hashSet.remove(this);
            if (this.f7634o00oOo0o.f7630o00oOOo0.size() == 0) {
                this.f7634o00oOo0o.f7630o00oOOo0 = null;
            }
        }
        this.f7630o00oOOo0 = null;
        this.f7634o00oOo0o = null;
        this.f7636o00oOoO0 = 0;
        this.f7635o00oOoO = -1;
        this.f7632o00oOo00 = false;
        this.f7631o00oOOoO = 0;
    }

    public void o00ooO0O(o00ooO0.o00oOo00 o00ooo002) {
        o00ooO0.o00oo0O o00oo0o2 = this.f7637o00oOoOO;
        if (o00oo0o2 == null) {
            this.f7637o00oOoOO = new o00ooO0.o00oo0O(o00oo0O.o00oOOoO.UNRESTRICTED, (String) null);
        } else {
            o00oo0o2.o00oOoO0();
        }
    }

    public void o00ooO0o(int i) {
        this.f7631o00oOOoO = i;
        this.f7632o00oOo00 = true;
    }

    public void o00ooOO0(int i) {
        if (o00oo0O0()) {
            this.f7636o00oOoO0 = i;
        }
    }

    public boolean o0O0o(o00oOo0O o00ooo0o2) {
        boolean z = false;
        if (o00ooo0o2 == null) {
            return false;
        }
        o00oOOoO o00oOooo2 = o00ooo0o2.o00oOooo();
        o00oOOoO o00ooooo2 = this.f7633o00oOo0O;
        if (o00oOooo2 == o00ooooo2) {
            return o00ooooo2 != o00oOOoO.BASELINE || (o00ooo0o2.o00oOoOO().o0O00OO() && o00oOoOO().o0O00OO());
        }
        switch (o00oOOo0.f7639o00oOOo0[o00ooooo2.ordinal()]) {
            case 1:
                return (o00oOooo2 == o00oOOoO.BASELINE || o00oOooo2 == o00oOOoO.CENTER_X || o00oOooo2 == o00oOOoO.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = o00oOooo2 == o00oOOoO.LEFT || o00oOooo2 == o00oOOoO.RIGHT;
                if (o00ooo0o2.o00oOoOO() instanceof o00oo0OO) {
                    if (z2 || o00oOooo2 == o00oOOoO.CENTER_X) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = o00oOooo2 == o00oOOoO.TOP || o00oOooo2 == o00oOOoO.BOTTOM;
                if (o00ooo0o2.o00oOoOO() instanceof o00oo0OO) {
                    if (z3 || o00oOooo2 == o00oOOoO.CENTER_Y) {
                        z = true;
                    }
                    return z;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f7633o00oOo0O.name());
        }
    }

    public String toString() {
        return this.f7638o00oOooO.o00ooO0() + ":" + this.f7633o00oOo0O.toString();
    }
}
