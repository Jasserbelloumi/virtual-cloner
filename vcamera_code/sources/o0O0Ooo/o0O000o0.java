package o0O0Ooo;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o00oo0O;
import o0O0Ooo0.o0O000;
import o0O0Ooo0.o0O00OO;
import o0O0o0o0.o00oOo00;
import o0O0o0o0.o00ooO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O000o0 extends o0O0Ooo0.o0O00O0 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f12076o00oOoOo = o0O0Ooo0.o0O00000.o00oOo0o("WorkContinuationImpl");

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00O0 f12077o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f12078o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo0O f12079o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final List<String> f12080o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final List<String> f12081o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f12082o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final List<o0O000o0> f12083o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O0Ooo0.o0O000O f12084o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<? extends o0O00OO> f12085o00oOooO;

    public o0O000o0(@oo0oO0 o0O00O0 o0o00o0, @o0OO00OO String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<? extends o0O00OO> list) {
        this(o0o00o0, str, o00oo0o2, list, null);
    }

    public o0O000o0(@oo0oO0 o0O00O0 o0o00o0, @o0OO00OO String str, @oo0oO0 o00oo0O o00oo0o2, @oo0oO0 List<? extends o0O00OO> list, @o0OO00OO List<o0O000o0> list2) {
        this.f12077o00oOOo0 = o0o00o0;
        this.f12078o00oOOoO = str;
        this.f12079o00oOo00 = o00oo0o2;
        this.f12085o00oOooO = list;
        this.f12083o00oOoO0 = list2;
        this.f12080o00oOo0O = new ArrayList(list.size());
        this.f12081o00oOo0o = new ArrayList();
        if (list2 != null) {
            for (o0O000o0 o0o000o0 : list2) {
                this.f12081o00oOo0o.addAll(o0o000o0.f12081o00oOo0o);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String o00oOOoO2 = list.get(i).o00oOOoO();
            this.f12080o00oOo0O.add(o00oOOoO2);
            this.f12081o00oOo0o.add(o00oOOoO2);
        }
    }

    public o0O000o0(@oo0oO0 o0O00O0 o0o00o0, @oo0oO0 List<? extends o0O00OO> list) {
        this(o0o00o0, null, o00oo0O.KEEP, list, null);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static boolean o00oo0O0(@oo0oO0 o0O000o0 o0o000o0, @oo0oO0 Set<String> set) {
        set.addAll(o0o000o0.o00oOoOo());
        Set<String> o00oo0o02 = o00oo0o0(o0o000o0);
        for (String str : set) {
            if (o00oo0o02.contains(str)) {
                return true;
            }
        }
        List<o0O000o0> o00oOooo2 = o0o000o0.o00oOooo();
        if (o00oOooo2 != null && !o00oOooo2.isEmpty()) {
            for (o0O000o0 o0o000o02 : o00oOooo2) {
                if (o00oo0O0(o0o000o02, set)) {
                    return true;
                }
            }
        }
        set.removeAll(o0o000o0.o00oOoOo());
        return false;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static Set<String> o00oo0o0(o0O000o0 o0o000o0) {
        HashSet hashSet = new HashSet();
        List<o0O000o0> o00oOooo2 = o0o000o0.o00oOooo();
        if (o00oOooo2 != null && !o00oOooo2.isEmpty()) {
            for (o0O000o0 o0o000o02 : o00oOooo2) {
                hashSet.addAll(o0o000o02.o00oOoOo());
            }
        }
        return hashSet;
    }

    @Override // o0O0Ooo0.o0O00O0
    @oo0oO0
    public o0O0Ooo0.o0O00O0 o00oOOoO(@oo0oO0 List<o0O0Ooo0.o0O00O0> list) {
        o0O0Ooo0.o0O000 o00oOOoO2 = new o0O000.o00oOOo0(CombineContinuationsWorker.class).o00oo0o(ArrayCreatingInputMerger.class).o00oOOoO();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<o0O0Ooo0.o0O00O0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((o0O000o0) it.next());
        }
        return new o0O000o0(this.f12077o00oOOo0, null, o00oo0O.KEEP, Collections.singletonList(o00oOOoO2), arrayList);
    }

    @Override // o0O0Ooo0.o0O00O0
    @oo0oO0
    public o0O0Ooo0.o0O000O o00oOo00() {
        if (this.f12082o00oOoO) {
            o0O0Ooo0.o0O00000.o00oOo00().o00oOoO(f12076o00oOoOo, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f12080o00oOo0O)), new Throwable[0]);
        } else {
            o00oOo00 o00ooo002 = new o00oOo00(this);
            this.f12077o00oOOo0.o00oooOO().o00oOOoO(o00ooo002);
            this.f12084o00oOoOO = o00ooo002.f12533o00oo0O;
        }
        return this.f12084o00oOoOO;
    }

    @Override // o0O0Ooo0.o0O00O0
    @oo0oO0
    public LiveData<List<o0O0Ooo0.o0OoO00O>> o00oOo0O() {
        return this.f12077o00oOOo0.o00oooO(this.f12081o00oOo0o);
    }

    @Override // o0O0Ooo0.o0O00O0
    @oo0oO0
    public o0O0Ooo0.o0O00O0 o00oOo0o(@oo0oO0 List<o0O0Ooo0.o0O000> list) {
        return list.isEmpty() ? this : new o0O000o0(this.f12077o00oOOo0, this.f12078o00oOOoO, o00oo0O.KEEP, list, Collections.singletonList(this));
    }

    public List<String> o00oOoO() {
        return this.f12081o00oOo0o;
    }

    public o00oo0O o00oOoOO() {
        return this.f12079o00oOo00;
    }

    @oo0oO0
    public List<String> o00oOoOo() {
        return this.f12080o00oOo0O;
    }

    @o0OO00OO
    public String o00oOoo0() {
        return this.f12078o00oOOoO;
    }

    @Override // o0O0Ooo0.o0O00O0
    @oo0oO0
    public ListenableFuture<List<o0O0Ooo0.o0OoO00O>> o00oOooO() {
        o00ooO.o00oOOo0 o00oooo02 = new o00ooO.o00oOOo0(this.f12077o00oOOo0, this.f12081o00oOo0o);
        this.f12077o00oOOo0.o00oooOO().o00oOOoO(o00oooo02);
        return o00oooo02.f12562o00oo0O0;
    }

    public List<o0O000o0> o00oOooo() {
        return this.f12083o00oOoO0;
    }

    @oo0oO0
    public o0O00O0 o00oo0() {
        return this.f12077o00oOOo0;
    }

    @oo0oO0
    public List<? extends o0O00OO> o00oo00O() {
        return this.f12085o00oOooO;
    }

    public boolean o00oo0O() {
        return this.f12082o00oOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean o00oo0OO() {
        return o00oo0O0(this, new HashSet());
    }

    public void o00oo0Oo() {
        this.f12082o00oOoO = true;
    }
}
