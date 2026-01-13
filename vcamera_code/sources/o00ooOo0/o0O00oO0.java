package o00ooOo0;

import androidx.collection.o00ooO0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO000OOo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o0O00oO0<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO000OOo.o00oOOo0<ArrayList<T>> f8964o00oOOo0 = new oO000OOo.o00oOOoO(10);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00ooO0<T, ArrayList<T>> f8965o00oOOoO = new o00ooO0<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final ArrayList<T> f8966o00oOo00 = new ArrayList<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final HashSet<T> f8967o00oOooO = new HashSet<>();

    public void o00oOOo0(@oo0oO0 T t, @oo0oO0 T t2) {
        if (!this.f8965o00oOOoO.containsKey(t) || !this.f8965o00oOOoO.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f8965o00oOOoO.get(t);
        if (arrayList == null) {
            arrayList = o00oOo0o();
            this.f8965o00oOOoO.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void o00oOOoO(@oo0oO0 T t) {
        if (this.f8965o00oOOoO.containsKey(t)) {
            return;
        }
        this.f8965o00oOOoO.put(t, null);
    }

    public void o00oOo00() {
        int size = this.f8965o00oOOoO.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> o00oo02 = this.f8965o00oOOoO.o00oo0(i);
            if (o00oo02 != null) {
                o00oOoo0(o00oo02);
            }
        }
        this.f8965o00oOOoO.clear();
    }

    public final void o00oOo0O(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f8965o00oOOoO.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                o00oOo0O(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @oo0oO0
    public final ArrayList<T> o00oOo0o() {
        ArrayList<T> acquire = this.f8964o00oOOo0.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    @o0OO00OO
    public List<T> o00oOoO(@oo0oO0 T t) {
        int size = this.f8965o00oOOoO.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> o00oo02 = this.f8965o00oOOoO.o00oo0(i);
            if (o00oo02 != null && o00oo02.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f8965o00oOOoO.o00oOoOo(i));
            }
        }
        return arrayList;
    }

    @o0OO00OO
    public List o00oOoO0(@oo0oO0 T t) {
        return this.f8965o00oOOoO.get(t);
    }

    @oo0oO0
    public ArrayList<T> o00oOoOO() {
        this.f8966o00oOo00.clear();
        this.f8967o00oOooO.clear();
        int size = this.f8965o00oOOoO.size();
        for (int i = 0; i < size; i++) {
            o00oOo0O(this.f8965o00oOOoO.o00oOoOo(i), this.f8966o00oOo00, this.f8967o00oOooO);
        }
        return this.f8966o00oOo00;
    }

    public boolean o00oOoOo(@oo0oO0 T t) {
        int size = this.f8965o00oOOoO.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> o00oo02 = this.f8965o00oOOoO.o00oo0(i);
            if (o00oo02 != null && o00oo02.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void o00oOoo0(@oo0oO0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f8964o00oOOo0.o00oOOo0(arrayList);
    }

    public boolean o00oOooO(@oo0oO0 T t) {
        return this.f8965o00oOOoO.containsKey(t);
    }

    public int o00oOooo() {
        return this.f8965o00oOOoO.size();
    }
}
