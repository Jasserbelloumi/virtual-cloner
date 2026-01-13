package androidx.fragment.app;

import androidx.lifecycle.o0OO0;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O00O extends o0OO0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f3051o00oOoO = "FragmentManager";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o0OO0o00.o00oOOoO f3052o00oOoOO = new o00oOOo0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final HashMap<String, Fragment> f3053o00oOOo0 = new HashMap<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final HashMap<String, o0O00O> f3054o00oOOoO = new HashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final HashMap<String, o0OO0oO0> f3055o00oOo00 = new HashMap<>();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f3056o00oOo0O = false;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f3057o00oOo0o = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f3058o00oOoO0 = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final boolean f3059o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0OO0o00.o00oOOoO {
        @Override // androidx.lifecycle.o0OO0o00.o00oOOoO
        @oo0oO0
        public <T extends o0OO0> T o00oOo00(@oo0oO0 Class<T> cls) {
            return new o0O00O(true);
        }
    }

    public o0O00O(boolean z) {
        this.f3059o00oOooO = z;
    }

    @oo0oO0
    public static o0O00O o00oOoO0(o0OO0oO0 o0oo0oo0) {
        return (o0O00O) new o0OO0o00(o0oo0oo0, f3052o00oOoOO).o00oOOo0(o0O00O.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O00O.class != obj.getClass()) {
            return false;
        }
        o0O00O o0o00o = (o0O00O) obj;
        return this.f3053o00oOOo0.equals(o0o00o.f3053o00oOOo0) && this.f3054o00oOOoO.equals(o0o00o.f3054o00oOOoO) && this.f3055o00oOo00.equals(o0o00o.f3055o00oOo00);
    }

    public int hashCode() {
        int hashCode = this.f3054o00oOOoO.hashCode();
        return this.f3055o00oOo00.hashCode() + ((hashCode + (this.f3053o00oOOo0.hashCode() * 31)) * 31);
    }

    public void o00oOOo0(@oo0oO0 Fragment fragment) {
        if (this.f3058o00oOoO0) {
            FragmentManager.oo0OOoo(2);
        } else if (this.f3053o00oOOo0.containsKey(fragment.mWho)) {
        } else {
            this.f3053o00oOOo0.put(fragment.mWho, fragment);
            if (FragmentManager.oo0OOoo(2)) {
                fragment.toString();
            }
        }
    }

    public void o00oOOoO(@oo0oO0 Fragment fragment) {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(fragment);
        }
        o00oOooO(fragment.mWho);
    }

    public void o00oOo00(@oo0oO0 String str) {
        FragmentManager.oo0OOoo(3);
        o00oOooO(str);
    }

    @o0OO00OO
    public Fragment o00oOo0O(String str) {
        return this.f3053o00oOOo0.get(str);
    }

    @oo0oO0
    public o0O00O o00oOo0o(@oo0oO0 Fragment fragment) {
        o0O00O o0o00o = this.f3054o00oOOoO.get(fragment.mWho);
        if (o0o00o == null) {
            o0O00O o0o00o2 = new o0O00O(this.f3059o00oOooO);
            this.f3054o00oOOoO.put(fragment.mWho, o0o00o2);
            return o0o00o2;
        }
        return o0o00o;
    }

    @oo0oO0
    public Collection<Fragment> o00oOoO() {
        return new ArrayList(this.f3053o00oOOo0.values());
    }

    @o0OO00OO
    @Deprecated
    public o0O00O0o o00oOoOO() {
        if (this.f3053o00oOOo0.isEmpty() && this.f3054o00oOOoO.isEmpty() && this.f3055o00oOo00.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, o0O00O> entry : this.f3054o00oOOoO.entrySet()) {
            o0O00O0o o00oOoOO2 = entry.getValue().o00oOoOO();
            if (o00oOoOO2 != null) {
                hashMap.put(entry.getKey(), o00oOoOO2);
            }
        }
        this.f3057o00oOo0o = true;
        if (this.f3053o00oOOo0.isEmpty() && hashMap.isEmpty() && this.f3055o00oOo00.isEmpty()) {
            return null;
        }
        return new o0O00O0o(new ArrayList(this.f3053o00oOOo0.values()), hashMap, new HashMap(this.f3055o00oOo00));
    }

    @oo0oO0
    public o0OO0oO0 o00oOoOo(@oo0oO0 Fragment fragment) {
        o0OO0oO0 o0oo0oo0 = this.f3055o00oOo00.get(fragment.mWho);
        if (o0oo0oo0 == null) {
            o0OO0oO0 o0oo0oo02 = new o0OO0oO0();
            this.f3055o00oOo00.put(fragment.mWho, o0oo0oo02);
            return o0oo0oo02;
        }
        return o0oo0oo0;
    }

    public boolean o00oOoo0() {
        return this.f3056o00oOo0O;
    }

    public final void o00oOooO(@oo0oO0 String str) {
        o0O00O o0o00o = this.f3054o00oOOoO.get(str);
        if (o0o00o != null) {
            o0o00o.onCleared();
            this.f3054o00oOOoO.remove(str);
        }
        o0OO0oO0 o0oo0oo0 = this.f3055o00oOo00.get(str);
        if (o0oo0oo0 != null) {
            o0oo0oo0.o00oOOo0();
            this.f3055o00oOo00.remove(str);
        }
    }

    public void o00oOooo(@oo0oO0 Fragment fragment) {
        if (this.f3058o00oOoO0) {
            FragmentManager.oo0OOoo(2);
            return;
        }
        if ((this.f3053o00oOOo0.remove(fragment.mWho) != null) && FragmentManager.oo0OOoo(2)) {
            fragment.toString();
        }
    }

    public void o00oo0(boolean z) {
        this.f3058o00oOoO0 = z;
    }

    @Deprecated
    public void o00oo00O(@o0OO00OO o0O00O0o o0o00o0o) {
        this.f3053o00oOOo0.clear();
        this.f3054o00oOOoO.clear();
        this.f3055o00oOo00.clear();
        if (o0o00o0o != null) {
            Collection<Fragment> o00oOOoO2 = o0o00o0o.o00oOOoO();
            if (o00oOOoO2 != null) {
                for (Fragment fragment : o00oOOoO2) {
                    if (fragment != null) {
                        this.f3053o00oOOo0.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, o0O00O0o> o00oOOo02 = o0o00o0o.o00oOOo0();
            if (o00oOOo02 != null) {
                for (Map.Entry<String, o0O00O0o> entry : o00oOOo02.entrySet()) {
                    o0O00O o0o00o = new o0O00O(this.f3059o00oOooO);
                    o0o00o.o00oo00O(entry.getValue());
                    this.f3054o00oOOoO.put(entry.getKey(), o0o00o);
                }
            }
            Map<String, o0OO0oO0> o00oOo002 = o0o00o0o.o00oOo00();
            if (o00oOo002 != null) {
                this.f3055o00oOo00.putAll(o00oOo002);
            }
        }
        this.f3057o00oOo0o = false;
    }

    public boolean o00oo0OO(@oo0oO0 Fragment fragment) {
        if (this.f3053o00oOOo0.containsKey(fragment.mWho)) {
            return this.f3059o00oOooO ? this.f3056o00oOo0O : !this.f3057o00oOo0o;
        }
        return true;
    }

    @Override // androidx.lifecycle.o0OO0
    public void onCleared() {
        if (FragmentManager.oo0OOoo(3)) {
            toString();
        }
        this.f3056o00oOo0O = true;
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3053o00oOOo0.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3054o00oOOoO.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3055o00oOo00.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
