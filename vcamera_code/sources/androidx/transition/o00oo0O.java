package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0O0OO0;
import androidx.transition.o0O0000O;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000.o00oOoO;
@SuppressLint({"RestrictedApi"})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo0O extends o0O0OO0 {

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0000O.o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Rect f5062o00oOOo0;

        public o00oOOo0(Rect rect) {
            this.f5062o00oOOo0 = rect;
        }

        @Override // androidx.transition.o0O0000O.o00oo00O
        public Rect o00oOOo0(@oo0oO0 o0O0000O o0o0000o) {
            return this.f5062o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o0O0000O.o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f5064o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5065o00oOOoO;

        public o00oOOoO(View view, ArrayList arrayList) {
            this.f5064o00oOOo0 = view;
            this.f5065o00oOOoO = arrayList;
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o0o0000o.removeListener(this);
            this.f5064o00oOOo0.setVisibility(8);
            int size = this.f5065o00oOOoO.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5065o00oOOoO.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
            o0o0000o.removeListener(this);
            o0o0000o.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Object f5067o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5068o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ Object f5069o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ Object f5070o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5071o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5073o00oOooO;

        public o00oOo00(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5067o00oOOo0 = obj;
            this.f5068o00oOOoO = arrayList;
            this.f5069o00oOo00 = obj2;
            this.f5073o00oOooO = arrayList2;
            this.f5070o00oOo0O = obj3;
            this.f5071o00oOo0o = arrayList3;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
            Object obj = this.f5067o00oOOo0;
            if (obj != null) {
                o00oo0O.this.o00oo0(obj, this.f5068o00oOOoO, null);
            }
            Object obj2 = this.f5069o00oOo00;
            if (obj2 != null) {
                o00oo0O.this.o00oo0(obj2, this.f5073o00oOooO, null);
            }
            Object obj3 = this.f5070o00oOo0O;
            if (obj3 != null) {
                o00oo0O.this.o00oo0(obj3, this.f5071o00oOo0o, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o00oOoO.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f5074o00oOOo0;

        public o00oOo0O(o0O0000O o0o0000o) {
            this.f5074o00oOOo0 = o0o0000o;
        }

        @Override // o0O000.o00oOoO.o00oOOoO
        public void onCancel() {
            this.f5074o00oOOo0.cancel();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements o0O0000O.o00oo0OO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Runnable f5076o00oOOo0;

        public o00oOoO(Runnable runnable) {
            this.f5076o00oOOo0 = runnable;
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            this.f5076o00oOOo0.run();
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends o0O0000O.o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Rect f5078o00oOOo0;

        public o00oo00O(Rect rect) {
            this.f5078o00oOOo0 = rect;
        }

        @Override // androidx.transition.o0O0000O.o00oo00O
        public Rect o00oOOo0(@oo0oO0 o0O0000O o0o0000o) {
            Rect rect = this.f5078o00oOOo0;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5078o00oOOo0;
        }
    }

    public static boolean o00ooO00(o0O0000O o0o0000o) {
        return (o0O0OO0.o00oOoOO(o0o0000o.getTargetIds()) && o0O0OO0.o00oOoOO(o0o0000o.getTargetNames()) && o0O0OO0.o00oOoOO(o0o0000o.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOOo0(Object obj, View view) {
        if (obj != null) {
            ((o0O0000O) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOOoO(Object obj, ArrayList<View> arrayList) {
        o0O0000O o0o0000o = (o0O0000O) obj;
        if (o0o0000o == null) {
            return;
        }
        int i = 0;
        if (o0o0000o instanceof o0O000Oo) {
            o0O000Oo o0o000oo = (o0O000Oo) o0o0000o;
            int o00oo02 = o0o000oo.o00oo0();
            while (i < o00oo02) {
                o00oOOoO(o0o000oo.o00oo00O(i), arrayList);
                i++;
            }
        } else if (o00ooO00(o0o0000o) || !o0O0OO0.o00oOoOO(o0o0000o.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                o0o0000o.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOo00(ViewGroup viewGroup, Object obj) {
        o0OoOoOo.o00oOOoO(viewGroup, (o0O0000O) obj);
    }

    @Override // androidx.fragment.app.o0O0OO0
    public boolean o00oOo0O(Object obj) {
        return obj instanceof o0O0000O;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOo0o(Object obj) {
        if (obj != null) {
            return ((o0O0000O) obj).mo3clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOoOo(Object obj, Object obj2, Object obj3) {
        o0O0000O o0o0000o = (o0O0000O) obj;
        o0O0000O o0o0000o2 = (o0O0000O) obj2;
        o0O0000O o0o0000o3 = (o0O0000O) obj3;
        if (o0o0000o != null && o0o0000o2 != null) {
            o0o0000o = new o0O000Oo().o00oOoOo(o0o0000o).o00oOoOo(o0o0000o2).o00oo(1);
        } else if (o0o0000o == null) {
            o0o0000o = o0o0000o2 != null ? o0o0000o2 : null;
        }
        if (o0o0000o3 != null) {
            o0O000Oo o0o000oo = new o0O000Oo();
            if (o0o0000o != null) {
                o0o000oo.o00oOoOo(o0o0000o);
            }
            o0o000oo.o00oOoOo(o0o0000o3);
            return o0o000oo;
        }
        return o0o0000o;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOoo0(Object obj, Object obj2, Object obj3) {
        o0O000Oo o0o000oo = new o0O000Oo();
        if (obj != null) {
            o0o000oo.o00oOoOo((o0O0000O) obj);
        }
        if (obj2 != null) {
            o0o000oo.o00oOoOo((o0O0000O) obj2);
        }
        if (obj3 != null) {
            o0o000oo.o00oOoOo((o0O0000O) obj3);
        }
        return o0o000oo;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oo(Object obj) {
        if (obj == null) {
            return null;
        }
        o0O000Oo o0o000oo = new o0O000Oo();
        o0o000oo.o00oOoOo((o0O0000O) obj);
        return o0o000oo;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o0O0000O o0o0000o = (o0O0000O) obj;
        int i = 0;
        if (o0o0000o instanceof o0O000Oo) {
            o0O000Oo o0o000oo = (o0O000Oo) o0o0000o;
            int o00oo02 = o0o000oo.o00oo0();
            while (i < o00oo02) {
                o00oo0(o0o000oo.o00oo00O(i), arrayList, arrayList2);
                i++;
            }
        } else if (!o00ooO00(o0o0000o)) {
            List<View> targets = o0o0000o.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    o0o0000o.addTarget(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    o0o0000o.removeTarget(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo00O(Object obj, View view) {
        if (obj != null) {
            ((o0O0000O) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0O(Object obj, Rect rect) {
        if (obj != null) {
            ((o0O0000O) obj).setEpicenterCallback(new o00oo00O(rect));
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0O0(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((o0O0000O) obj).addListener(new o00oOo00(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0OO(Object obj, View view, ArrayList<View> arrayList) {
        ((o0O0000O) obj).addListener(new o00oOOoO(view, arrayList));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0Oo(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            o00oOoO(view, rect);
            ((o0O0000O) obj).setEpicenterCallback(new o00oOOo0(rect));
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0o0(@oo0oO0 Fragment fragment, @oo0oO0 Object obj, @oo0oO0 o0O000.o00oOoO o00oooo2, @oo0oO0 Runnable runnable) {
        o0O0000O o0o0000o = (o0O0000O) obj;
        o00oooo2.o00oOooO(new o00oOo0O(o0o0000o));
        o0o0000o.addListener(new o00oOoO(runnable));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0oO(Object obj, View view, ArrayList<View> arrayList) {
        o0O000Oo o0o000oo = (o0O000Oo) obj;
        List<View> targets = o0o000oo.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0O0OO0.o00oOooO(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        o00oOOoO(o0o000oo, arrayList);
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o0O0o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o0O000Oo o0o000oo = (o0O000Oo) obj;
        if (o0o000oo != null) {
            o0o000oo.getTargets().clear();
            o0o000oo.getTargets().addAll(arrayList2);
            o00oo0(o0o000oo, arrayList, arrayList2);
        }
    }
}
