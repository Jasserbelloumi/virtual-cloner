package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O0o extends o0O00oO0 {

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final boolean f4698o00ooO0O = false;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static TimeInterpolator f4699o00ooO0o;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4703o00oo0OO = new ArrayList<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4702o00oo0O0 = new ArrayList<>();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ArrayList<o00oo0O> f4701o00oo0O = new ArrayList<>();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public ArrayList<o00oo0O0> f4704o00oo0Oo = new ArrayList<>();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.o0O00oO0>> f4706o00oo0o0 = new ArrayList<>();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public ArrayList<ArrayList<o00oo0O>> f4705o00oo0o = new ArrayList<>();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public ArrayList<ArrayList<o00oo0O0>> f4707o00oo0oO = new ArrayList<>();

    /* renamed from: o0O0o  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4710o0O0o = new ArrayList<>();

    /* renamed from: o00oo  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4700o00oo = new ArrayList<>();

    /* renamed from: o00ooO00  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4709o00ooO00 = new ArrayList<>();

    /* renamed from: o00ooO0  reason: collision with root package name */
    public ArrayList<RecyclerView.o0O00oO0> f4708o00ooO0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4712o00oo0O0;

        public o00oOOo0(ArrayList arrayList) {
            this.f4712o00oo0O0 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4712o00oo0O0.iterator();
            while (it.hasNext()) {
                o00oo0O o00oo0o2 = (o00oo0O) it.next();
                o0O0o.this.o0O000Oo(o00oo0o2.f4735o00oOOo0, o00oo0o2.f4736o00oOOoO, o00oo0o2.f4737o00oOo00, o00oo0o2.f4739o00oOooO, o00oo0o2.f4738o00oOo0O);
            }
            this.f4712o00oo0O0.clear();
            o0O0o.this.f4705o00oo0o.remove(this.f4712o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4714o00oo0O0;

        public o00oOOoO(ArrayList arrayList) {
            this.f4714o00oo0O0 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4714o00oo0O0.iterator();
            while (it.hasNext()) {
                o0O0o.this.o0OoOoOo((o00oo0O0) it.next());
            }
            this.f4714o00oo0O0.clear();
            o0O0o.this.f4707o00oo0oO.remove(this.f4714o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4716o00oo0O0;

        public o00oOo00(ArrayList arrayList) {
            this.f4716o00oo0O0 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4716o00oo0O0.iterator();
            while (it.hasNext()) {
                o0O0o.this.o0O000O((RecyclerView.o0O00oO0) it.next());
            }
            this.f4716o00oo0O0.clear();
            o0O0o.this.f4706o00oo0o0.remove(this.f4716o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.o0O00oO0 f4717o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4718o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f4719o00oOo00;

        public o00oOo0O(RecyclerView.o0O00oO0 o0o00oo0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4717o00oOOo0 = o0o00oo0;
            this.f4718o00oOOoO = viewPropertyAnimator;
            this.f4719o00oOo00 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4718o00oOOoO.setListener(null);
            this.f4719o00oOo00.setAlpha(1.0f);
            o0O0o.this.o00oooO(this.f4717o00oOOo0);
            o0O0o.this.f4709o00ooO00.remove(this.f4717o00oOOo0);
            o0O0o.this.o0O000o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0o.this.o00oooOO(this.f4717o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.o0O00oO0 f4721o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f4722o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4723o00oOo00;

        public o00oOoO(RecyclerView.o0O00oO0 o0o00oo0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4721o00oOOo0 = o0o00oo0;
            this.f4722o00oOOoO = view;
            this.f4723o00oOo00 = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4722o00oOOoO.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4723o00oOo00.setListener(null);
            o0O0o.this.o00ooOoO(this.f4721o00oOOo0);
            o0O0o.this.f4710o0O0o.remove(this.f4721o00oOOo0);
            o0O0o.this.o0O000o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0o.this.o00ooOoo(this.f4721o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oo0O0 f4725o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4726o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f4727o00oOo00;

        public o00oo0(o00oo0O0 o00oo0o02, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4725o00oOOo0 = o00oo0o02;
            this.f4726o00oOOoO = viewPropertyAnimator;
            this.f4727o00oOo00 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4726o00oOOoO.setListener(null);
            this.f4727o00oOo00.setAlpha(1.0f);
            this.f4727o00oOo00.setTranslationX(0.0f);
            this.f4727o00oOo00.setTranslationY(0.0f);
            o0O0o.this.o00ooo00(this.f4725o00oOOo0.f4740o00oOOo0, true);
            o0O0o.this.f4708o00ooO0.remove(this.f4725o00oOOo0.f4740o00oOOo0);
            o0O0o.this.o0O000o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0o.this.o00ooo0(this.f4725o00oOOo0.f4740o00oOOo0, true);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.o0O00oO0 f4729o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f4730o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f4731o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4732o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f4734o00oOooO;

        public o00oo00O(RecyclerView.o0O00oO0 o0o00oo0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4729o00oOOo0 = o0o00oo0;
            this.f4730o00oOOoO = i;
            this.f4731o00oOo00 = view;
            this.f4734o00oOooO = i2;
            this.f4732o00oOo0O = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4730o00oOOoO != 0) {
                this.f4731o00oOo00.setTranslationX(0.0f);
            }
            if (this.f4734o00oOooO != 0) {
                this.f4731o00oOo00.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4732o00oOo0O.setListener(null);
            o0O0o.this.o00ooo0O(this.f4729o00oOOo0);
            o0O0o.this.f4700o00oo.remove(this.f4729o00oOOo0);
            o0O0o.this.o0O000o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0o.this.o00ooo0o(this.f4729o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public RecyclerView.o0O00oO0 f4735o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4736o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4737o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4738o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4739o00oOooO;

        public o00oo0O(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, int i3, int i4) {
            this.f4735o00oOOo0 = o0o00oo0;
            this.f4736o00oOOoO = i;
            this.f4737o00oOo00 = i2;
            this.f4739o00oOooO = i3;
            this.f4738o00oOo0O = i4;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public RecyclerView.o0O00oO0 f4740o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public RecyclerView.o0O00oO0 f4741o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f4742o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f4743o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f4744o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f4745o00oOooO;

        public o00oo0O0(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o0O00oO0 o0o00oo02) {
            this.f4740o00oOOo0 = o0o00oo0;
            this.f4741o00oOOoO = o0o00oo02;
        }

        public o00oo0O0(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o0O00oO0 o0o00oo02, int i, int i2, int i3, int i4) {
            this(o0o00oo0, o0o00oo02);
            this.f4742o00oOo00 = i;
            this.f4745o00oOooO = i2;
            this.f4743o00oOo0O = i3;
            this.f4744o00oOo0o = i4;
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ChangeInfo{oldHolder=");
            o00oOOo02.append(this.f4740o00oOOo0);
            o00oOOo02.append(", newHolder=");
            o00oOOo02.append(this.f4741o00oOOoO);
            o00oOOo02.append(", fromX=");
            o00oOOo02.append(this.f4742o00oOo00);
            o00oOOo02.append(", fromY=");
            o00oOOo02.append(this.f4745o00oOooO);
            o00oOOo02.append(", toX=");
            o00oOOo02.append(this.f4743o00oOo0O);
            o00oOOo02.append(", toY=");
            o00oOOo02.append(this.f4744o00oOo0o);
            o00oOOo02.append('}');
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oo0O0 f4746o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4747o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f4748o00oOo00;

        public o00oo0OO(o00oo0O0 o00oo0o02, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4746o00oOOo0 = o00oo0o02;
            this.f4747o00oOOoO = viewPropertyAnimator;
            this.f4748o00oOo00 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4747o00oOOoO.setListener(null);
            this.f4748o00oOo00.setAlpha(1.0f);
            this.f4748o00oOo00.setTranslationX(0.0f);
            this.f4748o00oOo00.setTranslationY(0.0f);
            o0O0o.this.o00ooo00(this.f4746o00oOOo0.f4741o00oOOoO, false);
            o0O0o.this.f4708o00ooO0.remove(this.f4746o00oOOo0.f4741o00oOOoO);
            o0O0o.this.o0O000o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            o0O0o.this.o00ooo0(this.f4746o00oOOo0.f4741o00oOOoO, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oOoO0(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 List<Object> list) {
        return !list.isEmpty() || o00oOo0o(o0o00oo0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public void o00oOoo0(RecyclerView.o0O00oO0 o0o00oo0) {
        View view = o0o00oo0.itemView;
        view.animate().cancel();
        int size = this.f4701o00oo0O.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4701o00oo0O.get(size).f4735o00oOOo0 == o0o00oo0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                o00ooo0O(o0o00oo0);
                this.f4701o00oo0O.remove(size);
            }
        }
        o0ooOoOO(this.f4704o00oo0Oo, o0o00oo0);
        if (this.f4703o00oo0OO.remove(o0o00oo0)) {
            view.setAlpha(1.0f);
            o00oooO(o0o00oo0);
        }
        if (this.f4702o00oo0O0.remove(o0o00oo0)) {
            view.setAlpha(1.0f);
            o00ooOoO(o0o00oo0);
        }
        for (int size2 = this.f4707o00oo0oO.size() - 1; size2 >= 0; size2--) {
            ArrayList<o00oo0O0> arrayList = this.f4707o00oo0oO.get(size2);
            o0ooOoOO(arrayList, o0o00oo0);
            if (arrayList.isEmpty()) {
                this.f4707o00oo0oO.remove(size2);
            }
        }
        for (int size3 = this.f4705o00oo0o.size() - 1; size3 >= 0; size3--) {
            ArrayList<o00oo0O> arrayList2 = this.f4705o00oo0o.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4735o00oOOo0 == o0o00oo0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    o00ooo0O(o0o00oo0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4705o00oo0o.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4706o00oo0o0.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.o0O00oO0> arrayList3 = this.f4706o00oo0o0.get(size5);
            if (arrayList3.remove(o0o00oo0)) {
                view.setAlpha(1.0f);
                o00ooOoO(o0o00oo0);
                if (arrayList3.isEmpty()) {
                    this.f4706o00oo0o0.remove(size5);
                }
            }
        }
        this.f4709o00ooO00.remove(o0o00oo0);
        this.f4710o0O0o.remove(o0o00oo0);
        this.f4708o00ooO0.remove(o0o00oo0);
        this.f4700o00oo.remove(o0o00oo0);
        o0O000o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public void o00oOooo() {
        int size = this.f4701o00oo0O.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            o00oo0O o00oo0o2 = this.f4701o00oo0O.get(size);
            View view = o00oo0o2.f4735o00oOOo0.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            o00ooo0O(o00oo0o2.f4735o00oOOo0);
            this.f4701o00oo0O.remove(size);
        }
        for (int size2 = this.f4703o00oo0OO.size() - 1; size2 >= 0; size2--) {
            o00oooO(this.f4703o00oo0OO.get(size2));
            this.f4703o00oo0OO.remove(size2);
        }
        int size3 = this.f4702o00oo0O0.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.o0O00oO0 o0o00oo0 = this.f4702o00oo0O0.get(size3);
            o0o00oo0.itemView.setAlpha(1.0f);
            o00ooOoO(o0o00oo0);
            this.f4702o00oo0O0.remove(size3);
        }
        for (int size4 = this.f4704o00oo0Oo.size() - 1; size4 >= 0; size4--) {
            o0O000oo(this.f4704o00oo0Oo.get(size4));
        }
        this.f4704o00oo0Oo.clear();
        if (o00oo0O()) {
            for (int size5 = this.f4705o00oo0o.size() - 1; size5 >= 0; size5--) {
                ArrayList<o00oo0O> arrayList = this.f4705o00oo0o.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    o00oo0O o00oo0o3 = arrayList.get(size6);
                    View view2 = o00oo0o3.f4735o00oOOo0.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    o00ooo0O(o00oo0o3.f4735o00oOOo0);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4705o00oo0o.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4706o00oo0o0.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.o0O00oO0> arrayList2 = this.f4706o00oo0o0.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.o0O00oO0 o0o00oo02 = arrayList2.get(size8);
                    o0o00oo02.itemView.setAlpha(1.0f);
                    o00ooOoO(o0o00oo02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4706o00oo0o0.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4707o00oo0oO.size() - 1; size9 >= 0; size9--) {
                ArrayList<o00oo0O0> arrayList3 = this.f4707o00oo0oO.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    o0O000oo(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4707o00oo0oO.remove(arrayList3);
                    }
                }
            }
            o0O000o0(this.f4709o00ooO00);
            o0O000o0(this.f4700o00oo);
            o0O000o0(this.f4710o0O0o);
            o0O000o0(this.f4708o00ooO0);
            o00oOoOo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public boolean o00oo0O() {
        return (this.f4702o00oo0O0.isEmpty() && this.f4704o00oo0Oo.isEmpty() && this.f4701o00oo0O.isEmpty() && this.f4703o00oo0OO.isEmpty() && this.f4700o00oo.isEmpty() && this.f4709o00ooO00.isEmpty() && this.f4710o0O0o.isEmpty() && this.f4708o00ooO0.isEmpty() && this.f4705o00oo0o.isEmpty() && this.f4706o00oo0o0.isEmpty() && this.f4707o00oo0oO.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00ooO0
    public void o00ooO00() {
        boolean z = !this.f4703o00oo0OO.isEmpty();
        boolean z2 = !this.f4701o00oo0O.isEmpty();
        boolean z3 = !this.f4704o00oo0Oo.isEmpty();
        boolean z4 = !this.f4702o00oo0O0.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.o0O00oO0> it = this.f4703o00oo0OO.iterator();
            while (it.hasNext()) {
                o0OoOoOO(it.next());
            }
            this.f4703o00oo0OO.clear();
            if (z2) {
                ArrayList<o00oo0O> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4701o00oo0O);
                this.f4705o00oo0o.add(arrayList);
                this.f4701o00oo0O.clear();
                o00oOOo0 o00oooo02 = new o00oOOo0(arrayList);
                if (z) {
                    o0O0o00O.oooOO0(arrayList.get(0).f4735o00oOOo0.itemView, o00oooo02, o00oo0O0());
                } else {
                    o00oooo02.run();
                }
            }
            if (z3) {
                ArrayList<o00oo0O0> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4704o00oo0Oo);
                this.f4707o00oo0oO.add(arrayList2);
                this.f4704o00oo0Oo.clear();
                o00oOOoO o00ooooo2 = new o00oOOoO(arrayList2);
                if (z) {
                    o0O0o00O.oooOO0(arrayList2.get(0).f4740o00oOOo0.itemView, o00ooooo2, o00oo0O0());
                } else {
                    o00ooooo2.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.o0O00oO0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4702o00oo0O0);
                this.f4706o00oo0o0.add(arrayList3);
                this.f4702o00oo0O0.clear();
                o00oOo00 o00ooo002 = new o00oOo00(arrayList3);
                if (!z && !z2 && !z3) {
                    o00ooo002.run();
                    return;
                }
                o0O0o00O.oooOO0(arrayList3.get(0).itemView, o00ooo002, Math.max(z2 ? o00oo0OO() : 0L, z3 ? o00oo0() : 0L) + (z ? o00oo0O0() : 0L));
            }
        }
    }

    @Override // androidx.recyclerview.widget.o0O00oO0
    public boolean o00ooOO(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O00O0(o0o00oo0);
        o0o00oo0.itemView.setAlpha(0.0f);
        this.f4702o00oo0O0.add(o0o00oo0);
        return true;
    }

    @Override // androidx.recyclerview.widget.o0O00oO0
    public boolean o00ooOOo(RecyclerView.o0O00oO0 o0o00oo0, RecyclerView.o0O00oO0 o0o00oo02, int i, int i2, int i3, int i4) {
        if (o0o00oo0 == o0o00oo02) {
            return o00ooOo0(o0o00oo0, i, i2, i3, i4);
        }
        float translationX = o0o00oo0.itemView.getTranslationX();
        float translationY = o0o00oo0.itemView.getTranslationY();
        float alpha = o0o00oo0.itemView.getAlpha();
        o0O00O0(o0o00oo0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        o0o00oo0.itemView.setTranslationX(translationX);
        o0o00oo0.itemView.setTranslationY(translationY);
        o0o00oo0.itemView.setAlpha(alpha);
        if (o0o00oo02 != null) {
            o0O00O0(o0o00oo02);
            o0o00oo02.itemView.setTranslationX(-i5);
            o0o00oo02.itemView.setTranslationY(-i6);
            o0o00oo02.itemView.setAlpha(0.0f);
        }
        this.f4704o00oo0Oo.add(new o00oo0O0(o0o00oo0, o0o00oo02, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.o0O00oO0
    public boolean o00ooOo(RecyclerView.o0O00oO0 o0o00oo0) {
        o0O00O0(o0o00oo0);
        this.f4703o00oo0OO.add(o0o00oo0);
        return true;
    }

    @Override // androidx.recyclerview.widget.o0O00oO0
    public boolean o00ooOo0(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, int i3, int i4) {
        View view = o0o00oo0.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) o0o00oo0.itemView.getTranslationY());
        o0O00O0(o0o00oo0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            o00ooo0O(o0o00oo0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f4701o00oo0O.add(new o00oo0O(o0o00oo0, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean o0O00(o00oo0O0 o00oo0o02, RecyclerView.o0O00oO0 o0o00oo0) {
        boolean z = false;
        if (o00oo0o02.f4741o00oOOoO == o0o00oo0) {
            o00oo0o02.f4741o00oOOoO = null;
        } else if (o00oo0o02.f4740o00oOOo0 != o0o00oo0) {
            return false;
        } else {
            o00oo0o02.f4740o00oOOo0 = null;
            z = true;
        }
        o0o00oo0.itemView.setAlpha(1.0f);
        o0o00oo0.itemView.setTranslationX(0.0f);
        o0o00oo0.itemView.setTranslationY(0.0f);
        o00ooo00(o0o00oo0, z);
        return true;
    }

    public void o0O000O(RecyclerView.o0O00oO0 o0o00oo0) {
        View view = o0o00oo0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4710o0O0o.add(o0o00oo0);
        animate.alpha(1.0f).setDuration(o00oo00O()).setListener(new o00oOoO(o0o00oo0, view, animate)).start();
    }

    public void o0O000Oo(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, int i3, int i4) {
        View view = o0o00oo0.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4700o00oo.add(o0o00oo0);
        animate.setDuration(o00oo0OO()).setListener(new o00oo00O(o0o00oo0, i5, view, i6, animate)).start();
    }

    public void o0O000o() {
        if (o00oo0O()) {
            return;
        }
        o00oOoOo();
    }

    public void o0O000o0(List<RecyclerView.o0O00oO0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final void o0O000oo(o00oo0O0 o00oo0o02) {
        RecyclerView.o0O00oO0 o0o00oo0 = o00oo0o02.f4740o00oOOo0;
        if (o0o00oo0 != null) {
            o0O00(o00oo0o02, o0o00oo0);
        }
        RecyclerView.o0O00oO0 o0o00oo02 = o00oo0o02.f4741o00oOOoO;
        if (o0o00oo02 != null) {
            o0O00(o00oo0o02, o0o00oo02);
        }
    }

    public final void o0O00O0(RecyclerView.o0O00oO0 o0o00oo0) {
        if (f4699o00ooO0o == null) {
            f4699o00ooO0o = new ValueAnimator().getInterpolator();
        }
        o0o00oo0.itemView.animate().setInterpolator(f4699o00ooO0o);
        o00oOoo0(o0o00oo0);
    }

    public final void o0OoOoOO(RecyclerView.o0O00oO0 o0o00oo0) {
        View view = o0o00oo0.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4709o00ooO00.add(o0o00oo0);
        animate.setDuration(o00oo0O0()).alpha(0.0f).setListener(new o00oOo0O(o0o00oo0, animate, view)).start();
    }

    public void o0OoOoOo(o00oo0O0 o00oo0o02) {
        RecyclerView.o0O00oO0 o0o00oo0 = o00oo0o02.f4740o00oOOo0;
        View view = o0o00oo0 == null ? null : o0o00oo0.itemView;
        RecyclerView.o0O00oO0 o0o00oo02 = o00oo0o02.f4741o00oOOoO;
        View view2 = o0o00oo02 != null ? o0o00oo02.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(o00oo0());
            this.f4708o00ooO0.add(o00oo0o02.f4740o00oOOo0);
            duration.translationX(o00oo0o02.f4743o00oOo0O - o00oo0o02.f4742o00oOo00);
            duration.translationY(o00oo0o02.f4744o00oOo0o - o00oo0o02.f4745o00oOooO);
            duration.alpha(0.0f).setListener(new o00oo0(o00oo0o02, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4708o00ooO0.add(o00oo0o02.f4741o00oOOoO);
            animate.translationX(0.0f).translationY(0.0f).setDuration(o00oo0()).alpha(1.0f).setListener(new o00oo0OO(o00oo0o02, animate, view2)).start();
        }
    }

    public final void o0ooOoOO(List<o00oo0O0> list, RecyclerView.o0O00oO0 o0o00oo0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            o00oo0O0 o00oo0o02 = list.get(size);
            if (o0O00(o00oo0o02, o0o00oo0) && o00oo0o02.f4740o00oOOo0 == null && o00oo0o02.f4741o00oOOoO == null) {
                list.remove(o00oo0o02);
            }
        }
    }
}
