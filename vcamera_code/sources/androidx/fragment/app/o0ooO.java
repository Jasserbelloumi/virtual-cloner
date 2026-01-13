package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o0ooO extends o0O0OO0 {

    /* loaded from: classes.dex */
    public class o00oOOo0 extends Transition.EpicenterCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Rect f3203o00oOOo0;

        public o00oOOo0(Rect rect) {
            this.f3203o00oOOo0 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3203o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Transition.TransitionListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f3205o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3206o00oOOoO;

        public o00oOOoO(View view, ArrayList arrayList) {
            this.f3205o00oOOo0 = view;
            this.f3206o00oOOoO = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3205o00oOOo0.setVisibility(8);
            int size = this.f3206o00oOOoO.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3206o00oOOoO.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Transition.TransitionListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Object f3208o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3209o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ Object f3210o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ Object f3211o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3212o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3214o00oOooO;

        public o00oOo00(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3208o00oOOo0 = obj;
            this.f3209o00oOOoO = arrayList;
            this.f3210o00oOo00 = obj2;
            this.f3214o00oOooO = arrayList2;
            this.f3211o00oOo0O = obj3;
            this.f3212o00oOo0o = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3208o00oOOo0;
            if (obj != null) {
                o0ooO.this.o00oo0(obj, this.f3209o00oOOoO, null);
            }
            Object obj2 = this.f3210o00oOo00;
            if (obj2 != null) {
                o0ooO.this.o00oo0(obj2, this.f3214o00oOooO, null);
            }
            Object obj3 = this.f3211o00oOo0O;
            if (obj3 != null) {
                o0ooO.this.o00oo0(obj3, this.f3212o00oOo0o, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements Transition.TransitionListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Runnable f3215o00oOOo0;

        public o00oOo0O(Runnable runnable) {
            this.f3215o00oOOo0 = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3215o00oOOo0.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends Transition.EpicenterCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Rect f3217o00oOOo0;

        public o00oOoO(Rect rect) {
            this.f3217o00oOOo0 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3217o00oOOo0;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3217o00oOOo0;
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oo00O {
        public static void o00oOOo0(@oo0oO0 Transition transition, @oo0oO0 Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        public static void o00oOOoO(@oo0oO0 Transition transition, @oo0oO0 Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    public static boolean o00ooO00(Transition transition) {
        return (o0O0OO0.o00oOoOO(transition.getTargetIds()) && o0O0OO0.o00oOoOO(transition.getTargetNames()) && o0O0OO0.o00oOoOO(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOOo0(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOOoO(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                o00oOOoO(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (o00ooO00(transition) || !o0O0OO0.o00oOoOO(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oOo00(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o0O0OO0
    public boolean o00oOo0O(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOo0o(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOoOo(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oOoo0(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public Object o00oo(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                o00oo0(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!o00ooO00(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo00O(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0O(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new o00oOoO(rect));
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0O0(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new o00oOo00(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0OO(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new o00oOOoO(view, arrayList));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0Oo(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            o00oOoO(view, rect);
            ((Transition) obj).setEpicenterCallback(new o00oOOo0(rect));
        }
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0o0(@oo0oO0 Fragment fragment, @oo0oO0 Object obj, @oo0oO0 o0O000.o00oOoO o00oooo2, @oo0oO0 Runnable runnable) {
        ((Transition) obj).addListener(new o00oOo0O(runnable));
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o00oo0oO(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0O0OO0.o00oOooO(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        o00oOOoO(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o0O0OO0
    public void o0O0o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            o00oo0(transitionSet, arrayList, arrayList2);
        }
    }
}
