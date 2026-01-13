package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0oO0O0o {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f3198o00oOo0O = "FragmentManager";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ArrayList<Fragment> f3199o00oOOo0 = new ArrayList<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final HashMap<String, o0O00oO0> f3200o00oOOoO = new HashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final HashMap<String, FragmentState> f3201o00oOo00 = new HashMap<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O00O f3202o00oOooO;

    public void o00oOOo0(@oo0oO0 Fragment fragment) {
        if (this.f3199o00oOOo0.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3199o00oOOo0) {
            this.f3199o00oOOo0.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void o00oOOoO() {
        this.f3200o00oOOoO.values().removeAll(Collections.singleton(null));
    }

    public boolean o00oOo00(@oo0oO0 String str) {
        return this.f3200o00oOOoO.get(str) != null;
    }

    public void o00oOo0O(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
        String o00oOOo02 = o00oOoOo.o00oo.o00oOOo0(str, "    ");
        if (!this.f3200o00oOOoO.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
                printWriter.print(str);
                if (o0o00oo0 != null) {
                    Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                    printWriter.println(o00oOoo02);
                    o00oOoo02.dump(o00oOOo02, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3199o00oOOo0.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3199o00oOOo0.get(i).toString());
            }
        }
    }

    @o0OO00OO
    public Fragment o00oOo0o(@oo0oO0 String str) {
        o0O00oO0 o0o00oo0 = this.f3200o00oOOoO.get(str);
        if (o0o00oo0 != null) {
            return o0o00oo0.o00oOoo0();
        }
        return null;
    }

    @o0OO00OO
    public Fragment o00oOoO(@o0OO00OO String str) {
        if (str != null) {
            for (int size = this.f3199o00oOOo0.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3199o00oOOo0.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
                if (o0o00oo0 != null) {
                    Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                    if (str.equals(o00oOoo02.mTag)) {
                        return o00oOoo02;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @o0OO00OO
    public Fragment o00oOoO0(@o00oOooO.oo0OOoo int i) {
        for (int size = this.f3199o00oOOo0.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3199o00oOOo0.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
            if (o0o00oo0 != null) {
                Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                if (o00oOoo02.mFragmentId == i) {
                    return o00oOoo02;
                }
            }
        }
        return null;
    }

    @o0OO00OO
    public Fragment o00oOoOO(@oo0oO0 String str) {
        Fragment findFragmentByWho;
        for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
            if (o0o00oo0 != null && (findFragmentByWho = o0o00oo0.o00oOoo0().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int o00oOoOo(@oo0oO0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3199o00oOOo0.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f3199o00oOOo0.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3199o00oOOo0.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3199o00oOOo0.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int o00oOoo0() {
        return this.f3200o00oOOoO.size();
    }

    public void o00oOooO(int i) {
        for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
            if (o0o00oo0 != null) {
                o0o00oo0.o00oo0oO(i);
            }
        }
    }

    @oo0oO0
    public List<o0O00oO0> o00oOooo() {
        ArrayList arrayList = new ArrayList();
        for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
            if (o0o00oo0 != null) {
                arrayList.add(o0o00oo0);
            }
        }
        return arrayList;
    }

    public void o00oo() {
        this.f3200o00oOOoO.clear();
    }

    @oo0oO0
    public ArrayList<FragmentState> o00oo0() {
        return new ArrayList<>(this.f3201o00oOo00.values());
    }

    @oo0oO0
    public List<Fragment> o00oo00O() {
        ArrayList arrayList = new ArrayList();
        Iterator<o0O00oO0> it = this.f3200o00oOOoO.values().iterator();
        while (it.hasNext()) {
            o0O00oO0 next = it.next();
            arrayList.add(next != null ? next.o00oOoo0() : null);
        }
        return arrayList;
    }

    public o0O00O o00oo0O() {
        return this.f3202o00oOooO;
    }

    @oo0oO0
    public List<Fragment> o00oo0O0() {
        ArrayList arrayList;
        if (this.f3199o00oOOo0.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3199o00oOOo0) {
            arrayList = new ArrayList(this.f3199o00oOOo0);
        }
        return arrayList;
    }

    @o0OO00OO
    public o0O00oO0 o00oo0OO(@oo0oO0 String str) {
        return this.f3200o00oOOoO.get(str);
    }

    @o0OO00OO
    public FragmentState o00oo0Oo(@oo0oO0 String str) {
        return this.f3201o00oOo00.get(str);
    }

    public void o00oo0o(@oo0oO0 o0O00oO0 o0o00oo0) {
        Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
        if (o00oOoo02.mRetainInstance) {
            this.f3202o00oOooO.o00oOooo(o00oOoo02);
        }
        if (this.f3200o00oOOoO.put(o00oOoo02.mWho, null) != null && FragmentManager.oo0OOoo(2)) {
            o00oOoo02.toString();
        }
    }

    public void o00oo0o0(@oo0oO0 o0O00oO0 o0o00oo0) {
        Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
        if (o00oOo00(o00oOoo02.mWho)) {
            return;
        }
        this.f3200o00oOOoO.put(o00oOoo02.mWho, o0o00oo0);
        if (o00oOoo02.mRetainInstanceChangedWhileDetached) {
            if (o00oOoo02.mRetainInstance) {
                this.f3202o00oOooO.o00oOOo0(o00oOoo02);
            } else {
                this.f3202o00oOooO.o00oOooo(o00oOoo02);
            }
            o00oOoo02.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.oo0OOoo(2)) {
            o00oOoo02.toString();
        }
    }

    public void o00oo0oO() {
        Iterator<Fragment> it = this.f3199o00oOOo0.iterator();
        while (it.hasNext()) {
            o0O00oO0 o0o00oo0 = this.f3200o00oOOoO.get(it.next().mWho);
            if (o0o00oo0 != null) {
                o0o00oo0.o00oo00O();
            }
        }
        for (o0O00oO0 o0o00oo02 : this.f3200o00oOOoO.values()) {
            if (o0o00oo02 != null) {
                o0o00oo02.o00oo00O();
                Fragment o00oOoo02 = o0o00oo02.o00oOoo0();
                if (o00oOoo02.mRemoving && !o00oOoo02.isInBackStack()) {
                    if (o00oOoo02.mBeingSaved && !this.f3201o00oOo00.containsKey(o00oOoo02.mWho)) {
                        o0o00oo02.o00oo0o0();
                    }
                    o00oo0o(o0o00oo02);
                }
            }
        }
    }

    public void o00ooO(@oo0oO0 o0O00O o0o00o) {
        this.f3202o00oOooO = o0o00o;
    }

    public void o00ooO0(@oo0oO0 ArrayList<FragmentState> arrayList) {
        this.f3201o00oOo00.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f3201o00oOo00.put(next.f2938o00oo0O, next);
        }
    }

    public void o00ooO00(@o0OO00OO List<String> list) {
        this.f3199o00oOOo0.clear();
        if (list != null) {
            for (String str : list) {
                Fragment o00oOo0o2 = o00oOo0o(str);
                if (o00oOo0o2 == null) {
                    throw new IllegalStateException(android.support.v4.media.o00oOoO.o00oOOo0("No instantiated fragment for (", str, ")"));
                }
                if (FragmentManager.oo0OOoo(2)) {
                    o00oOo0o2.toString();
                }
                o00oOOo0(o00oOo0o2);
            }
        }
    }

    @oo0oO0
    public ArrayList<String> o00ooO0O() {
        ArrayList<String> arrayList = new ArrayList<>(this.f3200o00oOOoO.size());
        for (o0O00oO0 o0o00oo0 : this.f3200o00oOOoO.values()) {
            if (o0o00oo0 != null) {
                Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                o0o00oo0.o00oo0o0();
                arrayList.add(o00oOoo02.mWho);
                if (FragmentManager.oo0OOoo(2)) {
                    o00oOoo02.toString();
                    Objects.toString(o00oOoo02.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    @o0OO00OO
    public ArrayList<String> o00ooO0o() {
        synchronized (this.f3199o00oOOo0) {
            if (this.f3199o00oOOo0.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3199o00oOOo0.size());
            Iterator<Fragment> it = this.f3199o00oOOo0.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.oo0OOoo(2)) {
                    next.toString();
                }
            }
            return arrayList;
        }
    }

    @o0OO00OO
    public FragmentState o00ooOO0(@oo0oO0 String str, @o0OO00OO FragmentState fragmentState) {
        return fragmentState != null ? this.f3201o00oOo00.put(str, fragmentState) : this.f3201o00oOo00.remove(str);
    }

    public void o0O0o(@oo0oO0 Fragment fragment) {
        synchronized (this.f3199o00oOOo0) {
            this.f3199o00oOOo0.remove(fragment);
        }
        fragment.mAdded = false;
    }
}
