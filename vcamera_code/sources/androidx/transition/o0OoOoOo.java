package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0OoOoOo {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f5209o00oOo00 = "TransitionManager";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public androidx.collection.o00oOOo0<o00ooO, o0O0000O> f5213o00oOOo0 = new androidx.collection.o00oOOo0<>();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public androidx.collection.o00oOOo0<o00ooO, androidx.collection.o00oOOo0<o00ooO, o0O0000O>> f5214o00oOOoO = new androidx.collection.o00oOOo0<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static o0O0000O f5212o00oOooO = new o0O0Oo0o.o00oo00O();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static ThreadLocal<WeakReference<androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>>>> f5210o00oOo0O = new ThreadLocal<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static ArrayList<ViewGroup> f5211o00oOo0o = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public ViewGroup f5215o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o0O0000O f5216o00oo0O0;

        /* renamed from: androidx.transition.o0OoOoOo$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0058o00oOOo0 extends o0O000O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ androidx.collection.o00oOOo0 f5217o00oOOo0;

            public C0058o00oOOo0(androidx.collection.o00oOOo0 o00oooo02) {
                this.f5217o00oOOo0 = o00oooo02;
            }

            @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
            public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
                ((ArrayList) this.f5217o00oOOo0.get(o00oOOo0.this.f5215o00oo0O)).remove(o0o0000o);
                o0o0000o.removeListener(this);
            }
        }

        public o00oOOo0(o0O0000O o0o0000o, ViewGroup viewGroup) {
            this.f5216o00oo0O0 = o0o0000o;
            this.f5215o00oo0O = viewGroup;
        }

        public final void o00oOOo0() {
            this.f5215o00oo0O.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5215o00oo0O.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            o00oOOo0();
            if (o0OoOoOo.f5211o00oOo0o.remove(this.f5215o00oo0O)) {
                androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>> o00oOo0O2 = o0OoOoOo.o00oOo0O();
                ArrayList<o0O0000O> arrayList = o00oOo0O2.get(this.f5215o00oo0O);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    o00oOo0O2.put(this.f5215o00oo0O, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f5216o00oo0O0);
                this.f5216o00oo0O0.addListener(new C0058o00oOOo0(o00oOo0O2));
                this.f5216o00oo0O0.captureValues(this.f5215o00oo0O, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((o0O0000O) it.next()).resume(this.f5215o00oo0O);
                    }
                }
                this.f5216o00oo0O0.playTransition(this.f5215o00oo0O);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            o00oOOo0();
            o0OoOoOo.f5211o00oOo0o.remove(this.f5215o00oo0O);
            ArrayList<o0O0000O> arrayList = o0OoOoOo.o00oOo0O().get(this.f5215o00oo0O);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<o0O0000O> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f5215o00oo0O);
                }
            }
            this.f5216o00oo0O0.clearValues(true);
        }
    }

    public static void o00oOOo0(@oo0oO0 ViewGroup viewGroup) {
        o00oOOoO(viewGroup, null);
    }

    public static void o00oOOoO(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0000O o0o0000o) {
        if (f5211o00oOo0o.contains(viewGroup) || !o0O0o00O.o0O0Oooo(viewGroup)) {
            return;
        }
        f5211o00oOo0o.add(viewGroup);
        if (o0o0000o == null) {
            o0o0000o = f5212o00oOooO;
        }
        o0O0000O mo3clone = o0o0000o.mo3clone();
        o00oOoOo(viewGroup, mo3clone);
        o00ooO.o00oOoO0(viewGroup, null);
        o00oOoOO(viewGroup, mo3clone);
    }

    public static void o00oOo00(o00ooO o00ooo, o0O0000O o0o0000o) {
        ViewGroup o00oOo0O2 = o00ooo.o00oOo0O();
        if (f5211o00oOo0o.contains(o00oOo0O2)) {
            return;
        }
        o00ooO o00oOo002 = o00ooO.o00oOo00(o00oOo0O2);
        if (o0o0000o == null) {
            if (o00oOo002 != null) {
                o00oOo002.o00oOOoO();
            }
            o00ooo.o00oOOo0();
            return;
        }
        f5211o00oOo0o.add(o00oOo0O2);
        o0O0000O mo3clone = o0o0000o.mo3clone();
        if (o00oOo002 != null && o00oOo002.o00oOo0o()) {
            mo3clone.setCanRemoveViews(true);
        }
        o00oOoOo(o00oOo0O2, mo3clone);
        o00ooo.o00oOOo0();
        o00oOoOO(o00oOo0O2, mo3clone);
    }

    public static androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>> o00oOo0O() {
        androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>> o00oooo02;
        WeakReference<androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>>> weakReference = f5210o00oOo0O.get();
        if (weakReference == null || (o00oooo02 = weakReference.get()) == null) {
            androidx.collection.o00oOOo0<ViewGroup, ArrayList<o0O0000O>> o00oooo03 = new androidx.collection.o00oOOo0<>();
            f5210o00oOo0O.set(new WeakReference<>(o00oooo03));
            return o00oooo03;
        }
        return o00oooo02;
    }

    public static void o00oOoO(@oo0oO0 o00ooO o00ooo, @o0OO00OO o0O0000O o0o0000o) {
        o00oOo00(o00ooo, o0o0000o);
    }

    public static void o00oOoO0(@oo0oO0 o00ooO o00ooo) {
        o00oOo00(o00ooo, f5212o00oOooO);
    }

    public static void o00oOoOO(ViewGroup viewGroup, o0O0000O o0o0000o) {
        if (o0o0000o == null || viewGroup == null) {
            return;
        }
        o00oOOo0 o00oooo02 = new o00oOOo0(o0o0000o, viewGroup);
        viewGroup.addOnAttachStateChangeListener(o00oooo02);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(o00oooo02);
    }

    public static void o00oOoOo(ViewGroup viewGroup, o0O0000O o0o0000o) {
        ArrayList<o0O0000O> arrayList = o00oOo0O().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<o0O0000O> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (o0o0000o != null) {
            o0o0000o.captureValues(viewGroup, true);
        }
        o00ooO o00oOo002 = o00ooO.o00oOo00(viewGroup);
        if (o00oOo002 != null) {
            o00oOo002.o00oOOoO();
        }
    }

    public static void o00oOooO(ViewGroup viewGroup) {
        f5211o00oOo0o.remove(viewGroup);
        ArrayList<o0O0000O> arrayList = o00oOo0O().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((o0O0000O) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    public final o0O0000O o00oOo0o(o00ooO o00ooo) {
        o00ooO o00oOo002;
        androidx.collection.o00oOOo0<o00ooO, o0O0000O> o00oooo02;
        o0O0000O o0o0000o;
        ViewGroup o00oOo0O2 = o00ooo.o00oOo0O();
        if (o00oOo0O2 == null || (o00oOo002 = o00ooO.o00oOo00(o00oOo0O2)) == null || (o00oooo02 = this.f5214o00oOOoO.get(o00ooo)) == null || (o0o0000o = o00oooo02.get(o00oOo002)) == null) {
            o0O0000O o0o0000o2 = this.f5213o00oOOo0.get(o00ooo);
            return o0o0000o2 != null ? o0o0000o2 : f5212o00oOooO;
        }
        return o0o0000o;
    }

    public void o00oOoo0(@oo0oO0 o00ooO o00ooo, @oo0oO0 o00ooO o00ooo2, @o0OO00OO o0O0000O o0o0000o) {
        androidx.collection.o00oOOo0<o00ooO, o0O0000O> o00oooo02 = this.f5214o00oOOoO.get(o00ooo2);
        if (o00oooo02 == null) {
            o00oooo02 = new androidx.collection.o00oOOo0<>();
            this.f5214o00oOOoO.put(o00ooo2, o00oooo02);
        }
        o00oooo02.put(o00ooo, o0o0000o);
    }

    public void o00oOooo(@oo0oO0 o00ooO o00ooo, @o0OO00OO o0O0000O o0o0000o) {
        this.f5213o00oOOo0.put(o00ooo, o0o0000o);
    }

    public void o00oo00O(@oo0oO0 o00ooO o00ooo) {
        o00oOo00(o00ooo, o00oOo0o(o00ooo));
    }
}
