package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.o00oo0O0;
import androidx.fragment.app.o0OooO0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO0OOO0;
import o0O000.o00oOoO;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OO00o;
/* loaded from: classes.dex */
public class o00oOOoO extends o0OooO0 {

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f2969o00oOOo0;

        static {
            int[] iArr = new int[o0OooO0.o00oOoO.o00oOo00.values().length];
            f2969o00oOOo0 = iArr;
            try {
                iArr[o0OooO0.o00oOoO.o00oOo00.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2969o00oOOo0[o0OooO0.o00oOoO.o00oOo00.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2969o00oOOo0[o0OooO0.o00oOoO.o00oOo00.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2969o00oOOo0[o0OooO0.o00oOoO.o00oOo00.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0019o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2970o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ List f2971o00oo0O0;

        public RunnableC0019o00oOOoO(List list, o0OooO0.o00oOoO o00oooo2) {
            this.f2971o00oo0O0 = list;
            this.f2970o00oo0O = o00oooo2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2971o00oo0O0.contains(this.f2970o00oo0O)) {
                this.f2971o00oo0O0.remove(this.f2970o00oo0O);
                o00oOOoO.this.o00oo0o0(this.f2970o00oo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2973o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f2974o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ boolean f2975o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0o f2976o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2978o00oOooO;

        public o00oOo00(ViewGroup viewGroup, View view, boolean z, o0OooO0.o00oOoO o00oooo2, o0O0o o0o0o) {
            this.f2973o00oOOo0 = viewGroup;
            this.f2974o00oOOoO = view;
            this.f2975o00oOo00 = z;
            this.f2978o00oOooO = o00oooo2;
            this.f2976o00oOo0O = o0o0o;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2973o00oOOo0.endViewTransition(this.f2974o00oOOoO);
            if (this.f2975o00oOo00) {
                this.f2978o00oOooO.o00oOo0O().applyState(this.f2974o00oOOoO);
            }
            this.f2976o00oOo0O.o00oOOo0();
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f2978o00oOooO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o00oOoO.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Animator f2979o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2980o00oOOoO;

        public o00oOo0O(Animator animator, o0OooO0.o00oOoO o00oooo2) {
            this.f2979o00oOOo0 = animator;
            this.f2980o00oOOoO = o00oooo2;
        }

        @Override // o0O000.o00oOoO.o00oOOoO
        public void onCancel() {
            this.f2979o00oOOo0.end();
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f2980o00oOOoO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Animation.AnimationListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2982o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2983o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f2984o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0O0o f2986o00oOooO;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOoO o00oooo2 = o00oOoO.this;
                o00oooo2.f2983o00oOOoO.endViewTransition(o00oooo2.f2984o00oOo00);
                o00oOoO.this.f2986o00oOooO.o00oOOo0();
            }
        }

        public o00oOoO(o0OooO0.o00oOoO o00oooo2, ViewGroup viewGroup, View view, o0O0o o0o0o) {
            this.f2982o00oOOo0 = o00oooo2;
            this.f2983o00oOOoO = viewGroup;
            this.f2984o00oOo00 = view;
            this.f2986o00oOooO = o0o0o;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2983o00oOOoO.post(new o00oOOo0());
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f2982o00oOOo0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f2982o00oOOo0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OooO0.o00oOoO f2988o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O000.o00oOoO f2989o00oOOoO;

        public o00oo(@oo0oO0 o0OooO0.o00oOoO o00oooo2, @oo0oO0 o0O000.o00oOoO o00oooo3) {
            this.f2988o00oOOo0 = o00oooo2;
            this.f2989o00oOOoO = o00oooo3;
        }

        public void o00oOOo0() {
            this.f2988o00oOOo0.o00oOooO(this.f2989o00oOOoO);
        }

        @oo0oO0
        public o0OooO0.o00oOoO o00oOOoO() {
            return this.f2988o00oOOo0;
        }

        @oo0oO0
        public o0O000.o00oOoO o00oOo00() {
            return this.f2989o00oOOoO;
        }

        public boolean o00oOooO() {
            o0OooO0.o00oOoO.o00oOo00 o00ooo002;
            o0OooO0.o00oOoO.o00oOo00 from = o0OooO0.o00oOoO.o00oOo00.from(this.f2988o00oOOo0.o00oOo0o().mView);
            o0OooO0.o00oOoO.o00oOo00 o00oOo0O2 = this.f2988o00oOOo0.o00oOo0O();
            return from == o00oOo0O2 || !(from == (o00ooo002 = o0OooO0.o00oOoO.o00oOo00.VISIBLE) || o00oOo0O2 == o00ooo002);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2990o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2991o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ boolean f2992o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ androidx.collection.o00oOOo0 f2994o00oo0o0;

        public o00oo0(o0OooO0.o00oOoO o00oooo2, o0OooO0.o00oOoO o00oooo3, boolean z, androidx.collection.o00oOOo0 o00oooo02) {
            this.f2991o00oo0O0 = o00oooo2;
            this.f2990o00oo0O = o00oooo3;
            this.f2992o00oo0Oo = z;
            this.f2994o00oo0o0 = o00oooo02;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O0O0o0.o00oOOo0(this.f2991o00oo0O0.o00oOo0o(), this.f2990o00oo0O.o00oOo0o(), this.f2992o00oo0Oo, this.f2994o00oo0o0, false);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements o00oOoO.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f2995o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2996o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o0O0o f2997o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f2999o00oOooO;

        public o00oo00O(View view, ViewGroup viewGroup, o0O0o o0o0o, o0OooO0.o00oOoO o00oooo2) {
            this.f2995o00oOOo0 = view;
            this.f2996o00oOOoO = viewGroup;
            this.f2997o00oOo00 = o0o0o;
            this.f2999o00oOooO = o00oooo2;
        }

        @Override // o0O000.o00oOoO.o00oOOoO
        public void onCancel() {
            this.f2995o00oOOo0.clearAnimation();
            this.f2996o00oOOoO.endViewTransition(this.f2995o00oOOo0);
            this.f2997o00oOo00.o00oOOo0();
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f2999o00oOooO);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OooO0.o00oOoO f3000o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00ooO0 f3001o00oo0O0;

        public o00oo0O(o00ooO0 o00ooo02, o0OooO0.o00oOoO o00oooo2) {
            this.f3001o00oo0O0 = o00ooo02;
            this.f3000o00oo0O = o00oooo2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3001o00oo0O0.o00oOOo0();
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(this.f3000o00oo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3004o00oo0O0;

        public o00oo0O0(ArrayList arrayList) {
            this.f3004o00oo0O0 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O0O0o0.o00oOo0O(this.f3004o00oo0O0, 4);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f3005o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO0 f3006o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ Rect f3007o00oo0Oo;

        public o00oo0OO(o0O0OO0 o0o0oo0, View view, Rect rect) {
            this.f3006o00oo0O0 = o0o0oo0;
            this.f3005o00oo0O = view;
            this.f3007o00oo0Oo = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3006o00oo0O0.o00oOoO(this.f3005o00oo0O, this.f3007o00oo0Oo);
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 extends o00oo {
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Object f3009o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final Object f3010o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f3011o00oOooO;

        public o00ooO0(@oo0oO0 o0OooO0.o00oOoO o00oooo2, @oo0oO0 o0O000.o00oOoO o00oooo3, boolean z, boolean z2) {
            super(o00oooo2, o00oooo3);
            boolean z3;
            Object obj;
            if (o00oooo2.o00oOo0O() == o0OooO0.o00oOoO.o00oOo00.VISIBLE) {
                Fragment o00oOo0o2 = o00oooo2.o00oOo0o();
                this.f3009o00oOo00 = z ? o00oOo0o2.getReenterTransition() : o00oOo0o2.getEnterTransition();
                Fragment o00oOo0o3 = o00oooo2.o00oOo0o();
                z3 = z ? o00oOo0o3.getAllowReturnTransitionOverlap() : o00oOo0o3.getAllowEnterTransitionOverlap();
            } else {
                Fragment o00oOo0o4 = o00oooo2.o00oOo0o();
                this.f3009o00oOo00 = z ? o00oOo0o4.getReturnTransition() : o00oOo0o4.getExitTransition();
                z3 = true;
            }
            this.f3011o00oOooO = z3;
            if (z2) {
                Fragment o00oOo0o5 = o00oooo2.o00oOo0o();
                obj = z ? o00oOo0o5.getSharedElementReturnTransition() : o00oOo0o5.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f3010o00oOo0O = obj;
        }

        @o0OO00OO
        public o0O0OO0 o00oOo0O() {
            o0O0OO0 o00oOo0o2 = o00oOo0o(this.f3009o00oOo00);
            o0O0OO0 o00oOo0o3 = o00oOo0o(this.f3010o00oOo0O);
            if (o00oOo0o2 == null || o00oOo0o3 == null || o00oOo0o2 == o00oOo0o3) {
                return o00oOo0o2 != null ? o00oOo0o2 : o00oOo0o3;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            o00oOOo02.append(o00oOOoO().o00oOo0o());
            o00oOOo02.append(" returned Transition ");
            o00oOOo02.append(this.f3009o00oOo00);
            o00oOOo02.append(" which uses a different Transition  type than its shared element transition ");
            o00oOOo02.append(this.f3010o00oOo0O);
            throw new IllegalArgumentException(o00oOOo02.toString());
        }

        @o0OO00OO
        public final o0O0OO0 o00oOo0o(Object obj) {
            if (obj == null) {
                return null;
            }
            o0O0OO0 o0o0oo0 = o0O0O0o0.f3097o00oOOo0;
            if (o0o0oo0 == null || !o0o0oo0.o00oOo0O(obj)) {
                o0O0OO0 o0o0oo02 = o0O0O0o0.f3098o00oOOoO;
                if (o0o0oo02 == null || !o0o0oo02.o00oOo0O(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + o00oOOoO().o00oOo0o() + " is not a valid framework Transition or AndroidX Transition");
                }
                return o0o0oo02;
            }
            return o0o0oo0;
        }

        @o0OO00OO
        public Object o00oOoO() {
            return this.f3009o00oOo00;
        }

        @o0OO00OO
        public Object o00oOoO0() {
            return this.f3010o00oOo0O;
        }

        public boolean o00oOoOO() {
            return this.f3010o00oOo0O != null;
        }

        public boolean o00oOoOo() {
            return this.f3011o00oOooO;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o extends o00oo {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f3012o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public o00oo0O0.o00oOOo0 f3013o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f3014o00oOooO;

        public o0O0o(@oo0oO0 o0OooO0.o00oOoO o00oooo2, @oo0oO0 o0O000.o00oOoO o00oooo3, boolean z) {
            super(o00oooo2, o00oooo3);
            this.f3014o00oOooO = false;
            this.f3012o00oOo00 = z;
        }

        @o0OO00OO
        public o00oo0O0.o00oOOo0 o00oOo0O(@oo0oO0 Context context) {
            if (this.f3014o00oOooO) {
                return this.f3013o00oOo0O;
            }
            o00oo0O0.o00oOOo0 o00oOOoO2 = androidx.fragment.app.o00oo0O0.o00oOOoO(context, o00oOOoO().o00oOo0o(), o00oOOoO().o00oOo0O() == o0OooO0.o00oOoO.o00oOo00.VISIBLE, this.f3012o00oOo00);
            this.f3013o00oOo0O = o00oOOoO2;
            this.f3014o00oOooO = true;
            return o00oOOoO2;
        }
    }

    public o00oOOoO(@oo0oO0 ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.o0OooO0
    public void o00oOo0o(@oo0oO0 List<o0OooO0.o00oOoO> list, boolean z) {
        o0OooO0.o00oOoO o00oooo2 = null;
        o0OooO0.o00oOoO o00oooo3 = null;
        for (o0OooO0.o00oOoO o00oooo4 : list) {
            o0OooO0.o00oOoO.o00oOo00 from = o0OooO0.o00oOoO.o00oOo00.from(o00oooo4.o00oOo0o().mView);
            int i = o00oOOo0.f2969o00oOOo0[o00oooo4.o00oOo0O().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (from == o0OooO0.o00oOoO.o00oOo00.VISIBLE && o00oooo2 == null) {
                    o00oooo2 = o00oooo4;
                }
            } else if (i == 4 && from != o0OooO0.o00oOoO.o00oOo00.VISIBLE) {
                o00oooo3 = o00oooo4;
            }
        }
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o00oooo2);
            Objects.toString(o00oooo3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        o00ooO0(list);
        for (o0OooO0.o00oOoO o00oooo5 : list) {
            o0O000.o00oOoO o00oooo6 = new o0O000.o00oOoO();
            o00oooo5.o00oOoOo(o00oooo6);
            arrayList.add(new o0O0o(o00oooo5, o00oooo6, z));
            o0O000.o00oOoO o00oooo7 = new o0O000.o00oOoO();
            o00oooo5.o00oOoOo(o00oooo7);
            boolean z2 = false;
            if (z) {
                if (o00oooo5 != o00oooo2) {
                    arrayList2.add(new o00ooO0(o00oooo5, o00oooo7, z, z2));
                    o00oooo5.o00oOOo0(new RunnableC0019o00oOOoO(arrayList3, o00oooo5));
                }
                z2 = true;
                arrayList2.add(new o00ooO0(o00oooo5, o00oooo7, z, z2));
                o00oooo5.o00oOOo0(new RunnableC0019o00oOOoO(arrayList3, o00oooo5));
            } else {
                if (o00oooo5 != o00oooo3) {
                    arrayList2.add(new o00ooO0(o00oooo5, o00oooo7, z, z2));
                    o00oooo5.o00oOOo0(new RunnableC0019o00oOOoO(arrayList3, o00oooo5));
                }
                z2 = true;
                arrayList2.add(new o00ooO0(o00oooo5, o00oooo7, z, z2));
                o00oooo5.o00oOOo0(new RunnableC0019o00oOOoO(arrayList3, o00oooo5));
            }
        }
        Map<o0OooO0.o00oOoO, Boolean> o00ooO002 = o00ooO00(arrayList2, arrayList3, z, o00oooo2, o00oooo3);
        o00oo(arrayList, arrayList3, o00ooO002.containsValue(Boolean.TRUE), o00ooO002);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            o00oo0o0((o0OooO0.o00oOoO) it.next());
        }
        arrayList3.clear();
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o00oooo2);
            Objects.toString(o00oooo3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (androidx.fragment.app.FragmentManager.oo0OOoo(r13) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        java.util.Objects.toString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
        r10.o00oOOo0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
        if (androidx.fragment.app.FragmentManager.oo0OOoo(r13) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oo(@o00oOooO.oo0oO0 java.util.List<androidx.fragment.app.o00oOOoO.o0O0o> r19, @o00oOooO.oo0oO0 java.util.List<androidx.fragment.app.o0OooO0.o00oOoO> r20, boolean r21, @o00oOooO.oo0oO0 java.util.Map<androidx.fragment.app.o0OooO0.o00oOoO, java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o00oOOoO.o00oo(java.util.List, java.util.List, boolean, java.util.Map):void");
    }

    public void o00oo0o(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (o0OO00o.o00oOOoO.o00oOOoO(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                o00oo0o(arrayList, childAt);
            }
        }
    }

    public void o00oo0o0(@oo0oO0 o0OooO0.o00oOoO o00oooo2) {
        o00oooo2.o00oOo0O().applyState(o00oooo2.o00oOo0o().mView);
    }

    public void o00oo0oO(Map<String, View> map, @oo0oO0 View view) {
        String o0O0O0O2 = o0O0o00O.o0O0O0O(view);
        if (o0O0O0O2 != null) {
            map.put(o0O0O0O2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    o00oo0oO(map, childAt);
                }
            }
        }
    }

    public final void o00ooO0(@oo0oO0 List<o0OooO0.o00oOoO> list) {
        Fragment o00oOo0o2 = list.get(list.size() - 1).o00oOo0o();
        for (o0OooO0.o00oOoO o00oooo2 : list) {
            o00oooo2.o00oOo0o().mAnimationInfo.f2808o00oOo00 = o00oOo0o2.mAnimationInfo.f2808o00oOo00;
            o00oooo2.o00oOo0o().mAnimationInfo.f2816o00oOooO = o00oOo0o2.mAnimationInfo.f2816o00oOooO;
            o00oooo2.o00oOo0o().mAnimationInfo.f2809o00oOo0O = o00oOo0o2.mAnimationInfo.f2809o00oOo0O;
            o00oooo2.o00oOo0o().mAnimationInfo.f2810o00oOo0o = o00oOo0o2.mAnimationInfo.f2810o00oOo0o;
        }
    }

    @oo0oO0
    public final Map<o0OooO0.o00oOoO, Boolean> o00ooO00(@oo0oO0 List<o00ooO0> list, @oo0oO0 List<o0OooO0.o00oOoO> list2, boolean z, @o0OO00OO o0OooO0.o00oOoO o00oooo2, @o0OO00OO o0OooO0.o00oOoO o00oooo3) {
        View view;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList<View> arrayList2;
        Rect rect;
        View view2;
        androidx.collection.o00oOOo0 o00oooo02;
        ArrayList<View> arrayList3;
        HashMap hashMap;
        o0OooO0.o00oOoO o00oooo4;
        Object obj3;
        View view3;
        ArrayList arrayList4;
        Rect rect2;
        Object obj4;
        View view4;
        androidx.collection.o00oOOo0 o00oooo03;
        View view5;
        o0O0OO0 o0o0oo0;
        HashMap hashMap2;
        ArrayList<View> arrayList5;
        Rect rect3;
        ArrayList<View> arrayList6;
        oO0OOO0 enterTransitionCallback;
        oO0OOO0 exitTransitionCallback;
        ArrayList<String> arrayList7;
        View view6;
        View orDefault;
        String o00oOOoO2;
        ArrayList<String> arrayList8;
        boolean z2 = z;
        HashMap hashMap3 = new HashMap();
        o0O0OO0 o0o0oo02 = null;
        for (o00ooO0 o00ooo02 : list) {
            if (!o00ooo02.o00oOooO()) {
                o0O0OO0 o00oOo0O2 = o00ooo02.o00oOo0O();
                if (o0o0oo02 == null) {
                    o0o0oo02 = o00oOo0O2;
                } else if (o00oOo0O2 != null && o0o0oo02 != o00oOo0O2) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    o00oOOo02.append(o00ooo02.o00oOOoO().o00oOo0o());
                    o00oOOo02.append(" returned Transition ");
                    o00oOOo02.append(o00ooo02.o00oOoO());
                    o00oOOo02.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(o00oOOo02.toString());
                }
            }
        }
        if (o0o0oo02 == null) {
            for (o00ooO0 o00ooo03 : list) {
                hashMap3.put(o00ooo03.o00oOOoO(), Boolean.FALSE);
                o00ooo03.o00oOOo0();
            }
            return hashMap3;
        }
        View view7 = new View(o00oo00O().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList9 = new ArrayList<>();
        ArrayList<View> arrayList10 = new ArrayList<>();
        androidx.collection.o00oOOo0 o00oooo04 = new androidx.collection.o00oOOo0();
        Object obj5 = null;
        o0OooO0.o00oOoO o00oooo5 = o00oooo3;
        View view8 = null;
        boolean z3 = false;
        o00oOOoO o00ooooo2 = this;
        o0OooO0.o00oOoO o00oooo6 = o00oooo2;
        for (o00ooO0 o00ooo04 : list) {
            if (!o00ooo04.o00oOoOO() || o00oooo6 == null || o00oooo5 == null) {
                view4 = view8;
                o00oooo03 = o00oooo04;
                view5 = view7;
                o0o0oo0 = o0o0oo02;
                hashMap2 = hashMap3;
                arrayList5 = arrayList10;
            } else {
                Object o00oo2 = o0o0oo02.o00oo(o0o0oo02.o00oOo0o(o00ooo04.o00oOoO0()));
                ArrayList<String> sharedElementSourceNames = o00oooo3.o00oOo0o().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = o00oooo2.o00oOo0o().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = o00oooo2.o00oOo0o().getSharedElementTargetNames();
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList11 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList11;
                }
                ArrayList<String> sharedElementTargetNames2 = o00oooo3.o00oOo0o().getSharedElementTargetNames();
                Fragment o00oOo0o2 = o00oooo2.o00oOo0o();
                if (z2) {
                    enterTransitionCallback = o00oOo0o2.getEnterTransitionCallback();
                    exitTransitionCallback = o00oooo3.o00oOo0o().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = o00oOo0o2.getExitTransitionCallback();
                    exitTransitionCallback = o00oooo3.o00oOo0o().getEnterTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                view4 = view8;
                int i2 = 0;
                while (i2 < size) {
                    o00oooo04.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                    size = size;
                    hashMap3 = hashMap3;
                }
                HashMap hashMap4 = hashMap3;
                if (FragmentManager.oo0OOoo(2)) {
                    Iterator<String> it = sharedElementTargetNames2.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    Iterator<String> it2 = sharedElementSourceNames.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                androidx.collection.o00oOOo0<String, View> o00oooo05 = new androidx.collection.o00oOOo0<>();
                o00ooooo2.o00oo0oO(o00oooo05, o00oooo2.o00oOo0o().mView);
                androidx.collection.o00oo.o00oo0O0(o00oooo05, sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.oo0OOoo(2)) {
                        o00oooo2.toString();
                    }
                    enterTransitionCallback.o00oOooO(sharedElementSourceNames, o00oooo05);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View orDefault2 = o00oooo05.getOrDefault(str, null);
                        if (orDefault2 == null) {
                            o00oooo04.remove(str);
                            arrayList8 = sharedElementSourceNames;
                        } else {
                            arrayList8 = sharedElementSourceNames;
                            if (!str.equals(o0O0o00O.o0O0O0O(orDefault2))) {
                                o00oooo04.put(o0O0o00O.o00ooO0.o00oOoo0(orDefault2), (String) o00oooo04.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList8;
                    }
                    arrayList7 = sharedElementSourceNames;
                } else {
                    arrayList7 = sharedElementSourceNames;
                    androidx.collection.o00oo.o00oo0O0(o00oooo04, o00oooo05.keySet());
                }
                androidx.collection.o00oOOo0<String, View> o00oooo06 = new androidx.collection.o00oOOo0<>();
                o00ooooo2.o00oo0oO(o00oooo06, o00oooo3.o00oOo0o().mView);
                androidx.collection.o00oo.o00oo0O0(o00oooo06, sharedElementTargetNames2);
                androidx.collection.o00oo.o00oo0O0(o00oooo06, o00oooo04.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.oo0OOoo(2)) {
                        o00oooo3.toString();
                    }
                    exitTransitionCallback.o00oOooO(sharedElementTargetNames2, o00oooo06);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View orDefault3 = o00oooo06.getOrDefault(str2, null);
                        if (orDefault3 == null) {
                            String o00oOOoO3 = o0O0O0o0.o00oOOoO(o00oooo04, str2);
                            if (o00oOOoO3 != null) {
                                o00oooo04.remove(o00oOOoO3);
                            }
                        } else if (!str2.equals(o0O0o00O.o0O0O0O(orDefault3)) && (o00oOOoO2 = o0O0O0o0.o00oOOoO(o00oooo04, str2)) != null) {
                            o00oooo04.put(o00oOOoO2, o0O0o00O.o00ooO0.o00oOoo0(orDefault3));
                        }
                    }
                } else {
                    o0O0O0o0.o00oOooO(o00oooo04, o00oooo06);
                }
                o00ooooo2.o0O0o(o00oooo05, o00oooo04.keySet());
                o00ooooo2.o0O0o(o00oooo06, o00oooo04.values());
                if (o00oooo04.isEmpty()) {
                    arrayList9.clear();
                    arrayList10.clear();
                    obj5 = null;
                    o00oooo6 = o00oooo2;
                    o00oooo5 = o00oooo3;
                    o00oooo03 = o00oooo04;
                    arrayList5 = arrayList10;
                    view5 = view7;
                    o0o0oo0 = o0o0oo02;
                    hashMap2 = hashMap4;
                } else {
                    o0O0O0o0.o00oOOo0(o00oooo3.o00oOo0o(), o00oooo2.o00oOo0o(), z2, o00oooo05, true);
                    androidx.collection.o00oOOo0 o00oooo07 = o00oooo04;
                    ArrayList<String> arrayList12 = arrayList7;
                    o0O000oo.o0O0OOO0.o00oOOo0(o00oo00O(), new o00oo0(o00oooo3, o00oooo2, z, o00oooo06));
                    arrayList9.addAll(o00oooo05.values());
                    if (arrayList12.isEmpty()) {
                        view6 = view4;
                    } else {
                        view6 = o00oooo05.getOrDefault(arrayList12.get(0), null);
                        o0o0oo02.o00oo0Oo(o00oo2, view6);
                    }
                    arrayList10.addAll(o00oooo06.values());
                    if (!sharedElementTargetNames2.isEmpty() && (orDefault = o00oooo06.getOrDefault(sharedElementTargetNames2.get(0), null)) != null) {
                        o0O000oo.o0O0OOO0.o00oOOo0(o00oo00O(), new o00oo0OO(o0o0oo02, orDefault, rect4));
                        z3 = true;
                    }
                    o0o0oo02.o00oo0oO(o00oo2, view7, arrayList9);
                    o00oooo03 = o00oooo07;
                    arrayList5 = arrayList10;
                    Rect rect5 = rect4;
                    View view9 = view7;
                    o0o0oo0 = o0o0oo02;
                    o0o0oo02.o00oo0O0(o00oo2, null, null, null, null, o00oo2, arrayList5);
                    Boolean bool = Boolean.TRUE;
                    hashMap2 = hashMap4;
                    hashMap2.put(o00oooo2, bool);
                    hashMap2.put(o00oooo3, bool);
                    view4 = view6;
                    arrayList6 = arrayList9;
                    rect3 = rect5;
                    obj5 = o00oo2;
                    o00oooo6 = o00oooo2;
                    o00ooooo2 = this;
                    view5 = view9;
                    o00oooo5 = o00oooo3;
                    o00oooo04 = o00oooo03;
                    arrayList10 = arrayList5;
                    arrayList9 = arrayList6;
                    rect4 = rect3;
                    hashMap3 = hashMap2;
                    view8 = view4;
                    z2 = z;
                    o0o0oo02 = o0o0oo0;
                    view7 = view5;
                    o00ooooo2 = o00ooooo2;
                }
            }
            rect3 = rect4;
            arrayList6 = arrayList9;
            o00oooo04 = o00oooo03;
            arrayList10 = arrayList5;
            arrayList9 = arrayList6;
            rect4 = rect3;
            hashMap3 = hashMap2;
            view8 = view4;
            z2 = z;
            o0o0oo02 = o0o0oo0;
            view7 = view5;
            o00ooooo2 = o00ooooo2;
        }
        View view10 = view8;
        androidx.collection.o00oOOo0 o00oooo08 = o00oooo04;
        View view11 = view7;
        o0O0OO0 o0o0oo03 = o0o0oo02;
        HashMap hashMap5 = hashMap3;
        ArrayList<View> arrayList13 = arrayList10;
        Rect rect6 = rect4;
        Collection<?> collection = arrayList9;
        ArrayList arrayList14 = new ArrayList();
        Object obj6 = null;
        Object obj7 = null;
        for (o00ooO0 o00ooo05 : list) {
            if (o00ooo05.o00oOooO()) {
                hashMap5.put(o00ooo05.o00oOOoO(), Boolean.FALSE);
                o00ooo05.o00oOOo0();
            } else {
                Object o00oOo0o3 = o0o0oo03.o00oOo0o(o00ooo05.o00oOoO());
                o0OooO0.o00oOoO o00oOOoO4 = o00ooo05.o00oOOoO();
                boolean z4 = obj5 != null && (o00oOOoO4 == o00oooo6 || o00oOOoO4 == o00oooo5);
                if (o00oOo0o3 == null) {
                    if (!z4) {
                        hashMap5.put(o00oOOoO4, Boolean.FALSE);
                        o00ooo05.o00oOOo0();
                    }
                    o00oooo02 = o00oooo08;
                    obj2 = obj6;
                    arrayList2 = collection;
                    rect2 = rect6;
                    obj4 = obj7;
                    arrayList4 = arrayList14;
                    view3 = view10;
                    view2 = view11;
                    hashMap = hashMap5;
                } else {
                    HashMap hashMap6 = hashMap5;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj8 = obj7;
                    o00ooooo2.o00oo0o(arrayList15, o00oOOoO4.o00oOo0o().mView);
                    if (z4) {
                        if (o00oOOoO4 == o00oooo6) {
                            arrayList15.removeAll(collection);
                        } else {
                            arrayList15.removeAll(arrayList13);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        o0o0oo03.o00oOOo0(o00oOo0o3, view11);
                        obj = obj8;
                        o00oooo02 = o00oooo08;
                        obj2 = obj6;
                        arrayList = arrayList14;
                        arrayList2 = collection;
                        rect = rect6;
                        arrayList3 = arrayList15;
                        view = view10;
                        view2 = view11;
                        obj3 = o00oOo0o3;
                        hashMap = hashMap6;
                        o00oooo4 = o00oOOoO4;
                    } else {
                        o0o0oo03.o00oOOoO(o00oOo0o3, arrayList15);
                        view = view10;
                        obj = obj8;
                        obj2 = obj6;
                        arrayList = arrayList14;
                        arrayList2 = collection;
                        rect = rect6;
                        view2 = view11;
                        o00oooo02 = o00oooo08;
                        arrayList3 = arrayList15;
                        hashMap = hashMap6;
                        o0o0oo03.o00oo0O0(o00oOo0o3, o00oOo0o3, arrayList15, null, null, null, null);
                        if (o00oOOoO4.o00oOo0O() == o0OooO0.o00oOoO.o00oOo00.GONE) {
                            o00oooo4 = o00oOOoO4;
                            list2.remove(o00oooo4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList3);
                            arrayList16.remove(o00oooo4.o00oOo0o().mView);
                            obj3 = o00oOo0o3;
                            o0o0oo03.o00oo0OO(obj3, o00oooo4.o00oOo0o().mView, arrayList16);
                            o0O000oo.o0O0OOO0.o00oOOo0(o00oo00O(), new o00oo0O0(arrayList3));
                        } else {
                            o00oooo4 = o00oOOoO4;
                            obj3 = o00oOo0o3;
                        }
                    }
                    if (o00oooo4.o00oOo0O() == o0OooO0.o00oOoO.o00oOo00.VISIBLE) {
                        arrayList4 = arrayList;
                        arrayList4.addAll(arrayList3);
                        rect2 = rect;
                        if (z3) {
                            o0o0oo03.o00oo0O(obj3, rect2);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        arrayList4 = arrayList;
                        rect2 = rect;
                        o0o0oo03.o00oo0Oo(obj3, view3);
                    }
                    hashMap.put(o00oooo4, Boolean.TRUE);
                    if (o00ooo05.o00oOoOo()) {
                        obj4 = o0o0oo03.o00oOoo0(obj, obj3, null);
                    } else {
                        obj4 = obj;
                        obj2 = o0o0oo03.o00oOoo0(obj2, obj3, null);
                    }
                }
                collection = arrayList2;
                hashMap5 = hashMap;
                arrayList14 = arrayList4;
                view11 = view2;
                rect6 = rect2;
                view10 = view3;
                obj7 = obj4;
                o00oooo08 = o00oooo02;
                obj6 = obj2;
            }
        }
        androidx.collection.o00oOOo0 o00oooo09 = o00oooo08;
        ArrayList arrayList17 = arrayList14;
        ArrayList<View> arrayList18 = collection;
        HashMap hashMap7 = hashMap5;
        Object o00oOoOo2 = o0o0oo03.o00oOoOo(obj7, obj6, obj5);
        if (o00oOoOo2 == null) {
            return hashMap7;
        }
        for (o00ooO0 o00ooo06 : list) {
            if (!o00ooo06.o00oOooO()) {
                Object o00oOoO2 = o00ooo06.o00oOoO();
                o0OooO0.o00oOoO o00oOOoO5 = o00ooo06.o00oOOoO();
                boolean z5 = obj5 != null && (o00oOOoO5 == o00oooo6 || o00oOOoO5 == o00oooo5);
                if (o00oOoO2 != null || z5) {
                    if (o0O0o00O.o0O0Oooo(o00oo00O())) {
                        o0o0oo03.o00oo0o0(o00ooo06.o00oOOoO().o00oOo0o(), o00oOoOo2, o00ooo06.o00oOo00(), new o00oo0O(o00ooo06, o00oOOoO5));
                    } else {
                        if (FragmentManager.oo0OOoo(2)) {
                            Objects.toString(o00oo00O());
                            Objects.toString(o00oOOoO5);
                        }
                        o00ooo06.o00oOOo0();
                    }
                }
            }
        }
        if (o0O0o00O.o0O0Oooo(o00oo00O())) {
            o0O0O0o0.o00oOo0O(arrayList17, 4);
            ArrayList<String> o00oOooo2 = o0o0oo03.o00oOooo(arrayList13);
            if (FragmentManager.oo0OOoo(2)) {
                Iterator<View> it3 = arrayList18.iterator();
                while (it3.hasNext()) {
                    View next = it3.next();
                    Objects.toString(next);
                    o0O0o00O.o00ooO0.o00oOoo0(next);
                }
                Iterator<View> it4 = arrayList13.iterator();
                while (it4.hasNext()) {
                    View next2 = it4.next();
                    Objects.toString(next2);
                    o0O0o00O.o00ooO0.o00oOoo0(next2);
                }
            }
            o0o0oo03.o00oOo00(o00oo00O(), o00oOoOo2);
            o0o0oo03.o00oo0o(o00oo00O(), arrayList18, arrayList13, o00oOooo2, o00oooo09);
            o0O0O0o0.o00oOo0O(arrayList17, 0);
            o0o0oo03.o0O0o(obj5, arrayList18, arrayList13);
            return hashMap7;
        }
        return hashMap7;
    }

    public void o0O0o(@oo0oO0 androidx.collection.o00oOOo0<String, View> o00oooo02, @oo0oO0 Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = o00oooo02.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(o0O0o00O.o0O0O0O(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
