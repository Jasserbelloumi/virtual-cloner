package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0O0oo0o;
import androidx.lifecycle.o0O00;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0Oo0OoO.o0OOO00;
/* loaded from: classes.dex */
public final class o00oOOo0 extends o0O0oo0o implements FragmentManager.o00oo0O, FragmentManager.o0O00000 {

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f2964o00oooo = "FragmentManager";

    /* renamed from: o00oooO  reason: collision with root package name */
    public final FragmentManager f2965o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public boolean f2966o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f2967o00oooOo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public boolean f2968o00oooo0;

    public o00oOOo0(@oo0oO0 FragmentManager fragmentManager) {
        super(fragmentManager.o0O0OO0(), fragmentManager.o0O0OOO0() != null ? fragmentManager.o0O0OOO0().o00oOoOo().getClassLoader() : null);
        this.f2967o00oooOo = -1;
        this.f2968o00oooo0 = false;
        this.f2965o00oooO = fragmentManager;
    }

    public o00oOOo0(@oo0oO0 o00oOOo0 o00oooo02) {
        super(o00oooo02.f2965o00oooO.o0O0OO0(), o00oooo02.f2965o00oooO.o0O0OOO0() != null ? o00oooo02.f2965o00oooO.o0O0OOO0().o00oOoOo().getClassLoader() : null, o00oooo02);
        this.f2967o00oooOo = -1;
        this.f2968o00oooo0 = false;
        this.f2965o00oooO = o00oooo02.f2965o00oooO;
        this.f2966o00oooOO = o00oooo02.f2966o00oooOO;
        this.f2967o00oooOo = o00oooo02.f2967o00oooOo;
        this.f2968o00oooo0 = o00oooo02.f2968o00oooo0;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    @o0OO00OO
    public CharSequence getBreadCrumbShortTitle() {
        return this.f3161o00oo0 != 0 ? this.f2965o00oooO.o0O0OOO0().o00oOoOo().getText(this.f3161o00oo0) : this.f3165o00oo0OO;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    public int getBreadCrumbShortTitleRes() {
        return this.f3161o00oo0;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    @o0OO00OO
    public CharSequence getBreadCrumbTitle() {
        return this.f3160o00oOooo != 0 ? this.f2965o00oooO.o0O0OOO0().o00oOoOo().getText(this.f3160o00oOooo) : this.f3162o00oo00O;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    public int getBreadCrumbTitleRes() {
        return this.f3160o00oOooo;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    public int getId() {
        return this.f2967o00oooOo;
    }

    @Override // androidx.fragment.app.FragmentManager.o00oo0O
    @o0OO00OO
    public String getName() {
        return this.f3158o00oOoo0;
    }

    public void o0(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3158o00oOoo0);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2967o00oooOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2966o00oooOO);
            if (this.f3154o00oOoO != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3154o00oOoO));
            }
            if (this.f3159o00oOooO != 0 || this.f3152o00oOo0O != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3159o00oOooO));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3152o00oOo0O));
            }
            if (this.f3153o00oOo0o != 0 || this.f3155o00oOoO0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3153o00oOo0o));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3155o00oOoO0));
            }
            if (this.f3160o00oOooo != 0 || this.f3162o00oo00O != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3160o00oOooo));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3162o00oo00O);
            }
            if (this.f3161o00oo0 != 0 || this.f3165o00oo0OO != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3161o00oo0));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3165o00oo0OO);
            }
        }
        if (this.f3151o00oOo00.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3151o00oOo00.size();
        for (int i = 0; i < size; i++) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(i);
            switch (o00oooo02.f3168o00oOOo0) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = o0OOO00.f16242o00ooooO;
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("cmd=");
                    o00oOOo02.append(o00oooo02.f3168o00oOOo0);
                    str2 = o00oOOo02.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o00oooo02.f3169o00oOOoO);
            if (z) {
                if (o00oooo02.f3176o00oOooO != 0 || o00oooo02.f3171o00oOo0O != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o00oooo02.f3176o00oOooO));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o00oooo02.f3171o00oOo0O));
                }
                if (o00oooo02.f3172o00oOo0o != 0 || o00oooo02.f3174o00oOoO0 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o00oooo02.f3172o00oOo0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o00oooo02.f3174o00oOoO0));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.o0O00000
    public boolean o00oOOo0(@oo0oO0 ArrayList<o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.oo0OOoo(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3156o00oOoOO) {
            this.f2965o00oooO.o00oo00O(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public boolean o00oo() {
        return this.f3151o00oOo00.isEmpty();
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public int o00oo0() {
        return o00ooooO(true);
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public int o00oo00O() {
        return o00ooooO(false);
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public void o00oo0O0() {
        o00oo0o0();
        this.f2965o00oooO.o0O00O0o(this, true);
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public void o00oo0OO() {
        o00oo0o0();
        this.f2965o00oooO.o0O00O0o(this, false);
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00oo0Oo(@oo0oO0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2965o00oooO) {
            return super.o00oo0Oo(fragment);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        o00oOOo02.append(fragment.toString());
        o00oOOo02.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // androidx.fragment.app.o0O0oo0o
    public void o00oo0o(int i, Fragment fragment, @o0OO00OO String str, int i2) {
        super.o00oo0o(i, fragment, str, i2);
        fragment.mFragmentManager = this.f2965o00oooO;
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00oo0oO(@oo0oO0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2965o00oooO) {
            return super.o00oo0oO(fragment);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        o00oOOo02.append(fragment.toString());
        o00oOOo02.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00ooO00(@oo0oO0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2965o00oooO) {
            return super.o00ooO00(fragment);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        o00oOOo02.append(fragment.toString());
        o00oOOo02.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00ooo0(@oo0oO0 Fragment fragment, @oo0oO0 o0O00.o00oOOoO o00ooooo2) {
        if (fragment.mFragmentManager != this.f2965o00oooO) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            o00oOOo02.append(this.f2965o00oooO);
            throw new IllegalArgumentException(o00oOOo02.toString());
        } else if (o00ooooo2 == o0O00.o00oOOoO.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + o00ooooo2 + " after the Fragment has been created");
        } else if (o00ooooo2 != o0O00.o00oOOoO.DESTROYED) {
            return super.o00ooo0(fragment, o00ooooo2);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + o00ooooo2 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00ooo0O(@o0OO00OO Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f2965o00oooO) {
            return super.o00ooo0O(fragment);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        o00oOOo02.append(fragment.toString());
        o00oOOo02.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    @Override // androidx.fragment.app.o0O0oo0o
    @oo0oO0
    public o0O0oo0o o00oooOo(@oo0oO0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f2965o00oooO) {
            return super.o00oooOo(fragment);
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        o00oOOo02.append(fragment.toString());
        o00oOOo02.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public void o00oooo() {
        int size = this.f3151o00oOo00.size() - 1;
        while (size >= 0) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(size);
            if (o00oooo02.f3170o00oOo00) {
                if (o00oooo02.f3168o00oOOo0 == 8) {
                    o00oooo02.f3170o00oOo00 = false;
                    this.f3151o00oOo00.remove(size - 1);
                    size--;
                } else {
                    int i = o00oooo02.f3169o00oOOoO.mContainerId;
                    o00oooo02.f3168o00oOOo0 = 2;
                    o00oooo02.f3170o00oOo00 = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        o0O0oo0o.o00oOOo0 o00oooo03 = this.f3151o00oOo00.get(i2);
                        if (o00oooo03.f3170o00oOo00 && o00oooo03.f3169o00oOOoO.mContainerId == i) {
                            this.f3151o00oOo00.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public void o00oooo0(int i) {
        if (this.f3156o00oOoOO) {
            if (FragmentManager.oo0OOoo(2)) {
                toString();
            }
            int size = this.f3151o00oOo00.size();
            for (int i2 = 0; i2 < size; i2++) {
                o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(i2);
                Fragment fragment = o00oooo02.f3169o00oOOoO;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.oo0OOoo(2)) {
                        Objects.toString(o00oooo02.f3169o00oOOoO);
                        int i3 = o00oooo02.f3169o00oOOoO.mBackStackNesting;
                    }
                }
            }
        }
    }

    public int o00ooooO(boolean z) {
        if (this.f2966o00oooOO) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.oo0OOoo(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new o0O0OOOo("FragmentManager"));
            o0("  ", printWriter, true);
            printWriter.close();
        }
        this.f2966o00oooOO = true;
        this.f2967o00oooOo = this.f3156o00oOoOO ? this.f2965o00oooO.o00oo0Oo() : -1;
        this.f2965o00oooO.o0O00(this, z);
        return this.f2967o00oooOo;
    }

    public void o00ooooo(String str, PrintWriter printWriter) {
        o0(str, printWriter, true);
    }

    public void o0O000() {
        if (this.f3167o00oo0o0 != null) {
            for (int i = 0; i < this.f3167o00oo0o0.size(); i++) {
                this.f3167o00oo0o0.get(i).run();
            }
            this.f3167o00oo0o0 = null;
        }
    }

    public void o0O00000() {
        FragmentManager fragmentManager;
        int size = this.f3151o00oOo00.size();
        for (int i = 0; i < size; i++) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(i);
            Fragment fragment = o00oooo02.f3169o00oOOoO;
            if (fragment != null) {
                fragment.mBeingSaved = this.f2968o00oooo0;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3154o00oOoO);
                fragment.setSharedElementNames(this.f3164o00oo0O0, this.f3163o00oo0O);
            }
            switch (o00oooo02.f3168o00oOOo0) {
                case 1:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, false);
                    this.f2965o00oooO.o00oo0(fragment);
                    continue;
                case 2:
                default:
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Unknown cmd: ");
                    o00oOOo02.append(o00oooo02.f3168o00oOOo0);
                    throw new IllegalArgumentException(o00oOOo02.toString());
                case 3:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0O0oOoO(fragment);
                    continue;
                case 4:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0O0Oo(fragment);
                    continue;
                case 5:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, false);
                    this.f2965o00oooO.o0OO0Ooo(fragment);
                    continue;
                case 6:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o00ooOOo(fragment);
                    continue;
                case 7:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, false);
                    this.f2965o00oooO.o00oo0o(fragment);
                    continue;
                case 8:
                    fragmentManager = this.f2965o00oooO;
                    break;
                case 9:
                    fragmentManager = this.f2965o00oooO;
                    fragment = null;
                    break;
                case 10:
                    this.f2965o00oooO.o0OO0(fragment, o00oooo02.f3175o00oOoOO);
                    continue;
            }
            fragmentManager.o0OO0O0(fragment);
        }
    }

    public void o0O0000O() {
        FragmentManager fragmentManager;
        for (int size = this.f3151o00oOo00.size() - 1; size >= 0; size--) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(size);
            Fragment fragment = o00oooo02.f3169o00oOOoO;
            if (fragment != null) {
                fragment.mBeingSaved = this.f2968o00oooo0;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.o0OO000o(this.f3154o00oOoO));
                fragment.setSharedElementNames(this.f3163o00oo0O, this.f3164o00oo0O0);
            }
            switch (o00oooo02.f3168o00oOOo0) {
                case 1:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, true);
                    this.f2965o00oooO.o0O0oOoO(fragment);
                    continue;
                case 2:
                default:
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Unknown cmd: ");
                    o00oOOo02.append(o00oooo02.f3168o00oOOo0);
                    throw new IllegalArgumentException(o00oOOo02.toString());
                case 3:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o00oo0(fragment);
                    continue;
                case 4:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OO0Ooo(fragment);
                    continue;
                case 5:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, true);
                    this.f2965o00oooO.o0O0Oo(fragment);
                    continue;
                case 6:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o00oo0o(fragment);
                    continue;
                case 7:
                    fragment.setAnimations(o00oooo02.f3176o00oOooO, o00oooo02.f3171o00oOo0O, o00oooo02.f3172o00oOo0o, o00oooo02.f3174o00oOoO0);
                    this.f2965o00oooO.o0OoOoO(fragment, true);
                    this.f2965o00oooO.o00ooOOo(fragment);
                    continue;
                case 8:
                    fragmentManager = this.f2965o00oooO;
                    fragment = null;
                    break;
                case 9:
                    fragmentManager = this.f2965o00oooO;
                    break;
                case 10:
                    this.f2965o00oooO.o0OO0(fragment, o00oooo02.f3173o00oOoO);
                    continue;
            }
            fragmentManager.o0OO0O0(fragment);
        }
    }

    public Fragment o0O0000o(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3151o00oOo00.size()) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(i);
            int i2 = o00oooo02.f3168o00oOOo0;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = o00oooo02.f3169o00oOOoO;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3151o00oOo00.add(i, new o0O0oo0o.o00oOOo0(9, fragment4, true));
                                    i++;
                                    fragment2 = null;
                                }
                                o0O0oo0o.o00oOOo0 o00oooo03 = new o0O0oo0o.o00oOOo0(3, fragment4, true);
                                o00oooo03.f3176o00oOooO = o00oooo02.f3176o00oOooO;
                                o00oooo03.f3172o00oOo0o = o00oooo02.f3172o00oOo0o;
                                o00oooo03.f3171o00oOo0O = o00oooo02.f3171o00oOo0O;
                                o00oooo03.f3174o00oOoO0 = o00oooo02.f3174o00oOoO0;
                                this.f3151o00oOo00.add(i, o00oooo03);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3151o00oOo00.remove(i);
                        i--;
                    } else {
                        o00oooo02.f3168o00oOOo0 = 1;
                        o00oooo02.f3170o00oOo00 = true;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(o00oooo02.f3169o00oOOoO);
                    Fragment fragment5 = o00oooo02.f3169o00oOOoO;
                    if (fragment5 == fragment2) {
                        this.f3151o00oOo00.add(i, new o0O0oo0o.o00oOOo0(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3151o00oOo00.add(i, new o0O0oo0o.o00oOOo0(9, fragment2, true));
                        o00oooo02.f3170o00oOo00 = true;
                        i++;
                        fragment2 = o00oooo02.f3169o00oOOoO;
                    }
                }
                i++;
            }
            arrayList.add(o00oooo02.f3169o00oOOoO);
            i++;
        }
        return fragment2;
    }

    public Fragment o0O000O(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3151o00oOo00.size() - 1; size >= 0; size--) {
            o0O0oo0o.o00oOOo0 o00oooo02 = this.f3151o00oOo00.get(size);
            int i = o00oooo02.f3168o00oOOo0;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = o00oooo02.f3169o00oOOoO;
                            break;
                        case 10:
                            o00oooo02.f3175o00oOoOO = o00oooo02.f3173o00oOoO;
                            break;
                    }
                }
                arrayList.add(o00oooo02.f3169o00oOOoO);
            }
            arrayList.remove(o00oooo02.f3169o00oOOoO);
        }
        return fragment;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2967o00oooOo >= 0) {
            sb.append(" #");
            sb.append(this.f2967o00oooOo);
        }
        if (this.f3158o00oOoo0 != null) {
            sb.append(" ");
            sb.append(this.f3158o00oOoo0);
        }
        sb.append("}");
        return sb.toString();
    }
}
