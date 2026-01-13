package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O00000 extends RecyclerView.o0 implements RecyclerView.o0O000 {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f4483o0 = 255;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f4484o00ooOOo = 1;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f4485o00ooOo = 4;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f4486o00ooOo0 = 2;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f4487o00ooOoO = 8;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f4488o00ooOoo = 16;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f4489o00ooo0 = 0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f4490o00ooo00 = 32;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f4491o00ooo0O = 1;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f4492o00ooo0o = 2;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f4493o00oooO = 2;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f4494o00oooOO = 4;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f4495o00oooOo = 8;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final boolean f4496o00oooo = false;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f4497o00oooo0 = "ItemTouchHelper";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int f4498o00ooooO = -1;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f4499o00ooooo = 8;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f4500o0O00000 = 65280;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f4501o0O0000O = 16711680;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final int f4502o0O0000o = 1000;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f4506o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f4507o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f4508o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f4509o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float f4510o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f4511o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public float f4512o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f4513o00oOooO;
    @oo0oO0

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oo00O f4517o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f4518o00oo0O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public int f4520o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public RecyclerView f4521o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public VelocityTracker f4522o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public List<RecyclerView.o0O00oO0> f4524o00oo0oO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o0O000oo.o00ooO f4528o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oo0 f4529o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public long f4530o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public Rect f4531o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public List<Integer> f4532o0O0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<View> f4503o00oOOo0 = new ArrayList();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float[] f4504o00oOOoO = new float[2];

    /* renamed from: o00oOo00  reason: collision with root package name */
    public RecyclerView.o0O00oO0 f4505o00oOo00 = null;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f4514o00oOooo = -1;

    /* renamed from: o00oo0  reason: collision with root package name */
    public int f4516o00oo0 = 0;
    @o0o0000

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public List<o00oo0OO> f4519o00oo0O0 = new ArrayList();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Runnable f4523o00oo0o0 = new o00oOOo0();

    /* renamed from: o00oo  reason: collision with root package name */
    public RecyclerView.o0O0o f4515o00oo = null;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public View f4527o00ooO00 = null;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f4526o00ooO0 = -1;

    /* renamed from: o00ooO  reason: collision with root package name */
    public final RecyclerView.o0OoOoOo f4525o00ooO = new o00oOOoO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O00000 o0o00000 = o0O00000.this;
            if (o0o00000.f4505o00oOo00 == null || !o0o00000.o00ooO0()) {
                return;
            }
            o0O00000 o0o000002 = o0O00000.this;
            RecyclerView.o0O00oO0 o0o00oo0 = o0o000002.f4505o00oOo00;
            if (o0o00oo0 != null) {
                o0o000002.o00oo0o(o0o00oo0);
            }
            o0O00000 o0o000003 = o0O00000.this;
            o0o000003.f4521o00oo0Oo.removeCallbacks(o0o000003.f4523o00oo0o0);
            o0O0o00O.o0O0oo0O(o0O00000.this.f4521o00oo0Oo, this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements RecyclerView.o0OoOoOo {
        public o00oOOoO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public void o00oOOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
            o0O00000.this.f4528o00ooO0O.o00oOOoO(motionEvent);
            VelocityTracker velocityTracker = o0O00000.this.f4522o00oo0o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o0O00000.this.f4514o00oOooo == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(o0O00000.this.f4514o00oOooo);
            if (findPointerIndex >= 0) {
                o0O00000.this.o00oOoOO(actionMasked, motionEvent, findPointerIndex);
            }
            o0O00000 o0o00000 = o0O00000.this;
            RecyclerView.o0O00oO0 o0o00oo0 = o0o00000.f4505o00oOo00;
            if (o0o00oo0 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        o0o00000.o00ooOo(motionEvent, o0o00000.f4520o00oo0OO, findPointerIndex);
                        o0O00000.this.o00oo0o(o0o00oo0);
                        o0O00000 o0o000002 = o0O00000.this;
                        o0o000002.f4521o00oo0Oo.removeCallbacks(o0o000002.f4523o00oo0o0);
                        o0O00000.this.f4523o00oo0o0.run();
                        o0O00000.this.f4521o00oo0Oo.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    o0O00000 o0o000003 = o0O00000.this;
                    if (pointerId == o0o000003.f4514o00oOooo) {
                        o0o000003.f4514o00oOooo = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        o0O00000 o0o000004 = o0O00000.this;
                        o0o000004.o00ooOo(motionEvent, o0o000004.f4520o00oo0OO, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = o0o00000.f4522o00oo0o;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            o0O00000.this.o00ooO0O(null, 0);
            o0O00000.this.f4514o00oOooo = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public boolean o00oOo00(@oo0oO0 RecyclerView recyclerView, @oo0oO0 MotionEvent motionEvent) {
            int findPointerIndex;
            o00oo0OO o00oo00O2;
            o0O00000.this.f4528o00ooO0O.o00oOOoO(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                o0O00000.this.f4514o00oOooo = motionEvent.getPointerId(0);
                o0O00000.this.f4513o00oOooO = motionEvent.getX();
                o0O00000.this.f4506o00oOo0O = motionEvent.getY();
                o0O00000.this.o00oo0oO();
                o0O00000 o0o00000 = o0O00000.this;
                if (o0o00000.f4505o00oOo00 == null && (o00oo00O2 = o0o00000.o00oo00O(motionEvent)) != null) {
                    o0O00000 o0o000002 = o0O00000.this;
                    o0o000002.f4513o00oOooO -= o00oo00O2.f4562o00oOoOo;
                    o0o000002.f4506o00oOo0O -= o00oo00O2.f4563o00oOoo0;
                    o0o000002.o00oOooo(o00oo00O2.f4557o00oOo0O, true);
                    if (o0O00000.this.f4503o00oOOo0.remove(o00oo00O2.f4557o00oOo0O.itemView)) {
                        o0O00000 o0o000003 = o0O00000.this;
                        o0o000003.f4517o00oo00O.o00oOo00(o0o000003.f4521o00oo0Oo, o00oo00O2.f4557o00oOo0O);
                    }
                    o0O00000.this.o00ooO0O(o00oo00O2.f4557o00oOo0O, o00oo00O2.f4558o00oOo0o);
                    o0O00000 o0o000004 = o0O00000.this;
                    o0o000004.o00ooOo(motionEvent, o0o000004.f4520o00oo0OO, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o0O00000 o0o000005 = o0O00000.this;
                o0o000005.f4514o00oOooo = -1;
                o0o000005.o00ooO0O(null, 0);
            } else {
                int i = o0O00000.this.f4514o00oOooo;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    o0O00000.this.o00oOoOO(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = o0O00000.this.f4522o00oo0o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return o0O00000.this.f4505o00oOo00 != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0OoOoOo
        public void o00oOo0O(boolean z) {
            if (z) {
                o0O00000.this.o00ooO0O(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oo0OO {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.o0O00oO0 f4536o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public final /* synthetic */ int f4537o00oo0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.o0O00oO0 o0o00oo02) {
            super(o0o00oo0, i, i2, f, f2, f3, f4);
            this.f4537o00oo0OO = i3;
            this.f4536o00oo0O0 = o0o00oo02;
        }

        @Override // androidx.recyclerview.widget.o0O00000.o00oo0OO, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f4565o00oOooo) {
                return;
            }
            if (this.f4537o00oo0OO <= 0) {
                o0O00000 o0o00000 = o0O00000.this;
                o0o00000.f4517o00oo00O.o00oOo00(o0o00000.f4521o00oo0Oo, this.f4536o00oo0O0);
            } else {
                o0O00000.this.f4503o00oOOo0.add(this.f4536o00oo0O0.itemView);
                this.f4561o00oOoOO = true;
                int i = this.f4537o00oo0OO;
                if (i > 0) {
                    o0O00000.this.o0O0o(this, i);
                }
            }
            o0O00000 o0o000002 = o0O00000.this;
            View view = o0o000002.f4527o00ooO00;
            View view2 = this.f4536o00oo0O0.itemView;
            if (view == view2) {
                o0o000002.o00ooO00(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f4538o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO f4539o00oo0O0;

        public o00oOo0O(o00oo0OO o00oo0oo, int i) {
            this.f4539o00oo0O0 = o00oo0oo;
            this.f4538o00oo0O = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o0O00000.this.f4521o00oo0Oo;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            o00oo0OO o00oo0oo = this.f4539o00oo0O0;
            if (o00oo0oo.f4565o00oOooo || o00oo0oo.f4557o00oOo0O.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.o00ooO0 itemAnimator = o0O00000.this.f4521o00oo0Oo.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.o00oo0Oo(null)) && !o0O00000.this.o00oo0Oo()) {
                o0O00000.this.f4517o00oo00O.o00ooOO(this.f4539o00oo0O0.f4557o00oOo0O, this.f4538o00oo0O);
            } else {
                o0O00000.this.f4521o00oo0Oo.post(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements RecyclerView.o0O0o {
        public o00oOoO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o0O0o
        public int o00oOOo0(int i, int i2) {
            o0O00000 o0o00000 = o0O00000.this;
            View view = o0o00000.f4527o00ooO00;
            if (view == null) {
                return i2;
            }
            int i3 = o0o00000.f4526o00ooO0;
            if (i3 == -1) {
                i3 = o0o00000.f4521o00oo0Oo.indexOfChild(view);
                o0O00000.this.f4526o00ooO0 = i3;
            }
            return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f4543o00oo0O0 = true;

        public o00oo0() {
        }

        public void o00oOOo0() {
            this.f4543o00oo0O0 = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View o00oo02;
            RecyclerView.o0O00oO0 childViewHolder;
            if (!this.f4543o00oo0O0 || (o00oo02 = o0O00000.this.o00oo0(motionEvent)) == null || (childViewHolder = o0O00000.this.f4521o00oo0Oo.getChildViewHolder(o00oo02)) == null) {
                return;
            }
            o0O00000 o0o00000 = o0O00000.this;
            if (o0o00000.f4517o00oo00O.o00oo0O0(o0o00000.f4521o00oo0Oo, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = o0O00000.this.f4514o00oOooo;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    o0O00000 o0o000002 = o0O00000.this;
                    o0o000002.f4513o00oOooO = x;
                    o0o000002.f4506o00oOo0O = y;
                    o0o000002.f4510o00oOoOO = 0.0f;
                    o0o000002.f4508o00oOoO = 0.0f;
                    if (o0o000002.f4517o00oo00O.o00oo0o()) {
                        o0O00000.this.o00ooO0O(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f4544o00oOOoO = 200;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f4545o00oOo00 = 250;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f4546o00oOo0O = 789516;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final long f4548o00oOoO = 2000;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f4550o00oOooO = 3158064;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4551o00oOOo0 = -1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final Interpolator f4547o00oOo0o = new o00oOOo0();

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final Interpolator f4549o00oOoO0 = new o00oOOoO();

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int o00oOo0O(int i, int i2) {
            int i3;
            int i4 = i & f4546o00oOo0O;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & f4546o00oOo0O) << 2;
            }
            return i5 | i3;
        }

        @oo0oO0
        public static o0O0000O o00oOoOO() {
            return o0O000.f4482o00oOOo0;
        }

        public static int o00oo0oO(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int o0O0o(int i, int i2) {
            return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
        }

        public boolean o00oOOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo02) {
            return true;
        }

        public RecyclerView.o0O00oO0 o00oOOoO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 List<RecyclerView.o0O00oO0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = o0o00oo0.itemView.getWidth() + i;
            int height = o0o00oo0.itemView.getHeight() + i2;
            int left2 = i - o0o00oo0.itemView.getLeft();
            int top2 = i2 - o0o00oo0.itemView.getTop();
            int size = list.size();
            RecyclerView.o0O00oO0 o0o00oo02 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.o0O00oO0 o0o00oo03 = list.get(i4);
                if (left2 > 0 && (right = o0o00oo03.itemView.getRight() - width) < 0 && o0o00oo03.itemView.getRight() > o0o00oo0.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    o0o00oo02 = o0o00oo03;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = o0o00oo03.itemView.getLeft() - i) > 0 && o0o00oo03.itemView.getLeft() < o0o00oo0.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    o0o00oo02 = o0o00oo03;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = o0o00oo03.itemView.getTop() - i2) > 0 && o0o00oo03.itemView.getTop() < o0o00oo0.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    o0o00oo02 = o0o00oo03;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = o0o00oo03.itemView.getBottom() - height) < 0 && o0o00oo03.itemView.getBottom() > o0o00oo0.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    o0o00oo02 = o0o00oo03;
                    i3 = abs;
                }
            }
            return o0o00oo02;
        }

        public void o00oOo00(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            o0O000.f4482o00oOOo0.o00oOOo0(o0o00oo0.itemView);
        }

        public final int o00oOo0o(RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0) {
            return o00oOooO(o00oOooo(recyclerView, o0o00oo0), o0O0o00O.o0O000O(recyclerView));
        }

        public int o00oOoO() {
            return 0;
        }

        public long o00oOoO0(@oo0oO0 RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.o00ooO0 itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.o00oo0OO() : itemAnimator.o00oo0O0();
        }

        public final int o00oOoOo(RecyclerView recyclerView) {
            if (this.f4551o00oOOo0 == -1) {
                this.f4551o00oOOo0 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f4551o00oOOo0;
        }

        public float o00oOoo0(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            return 0.5f;
        }

        public int o00oOooO(int i, int i2) {
            int i3;
            int i4 = i & f4550o00oOooO;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & f4550o00oOooO) >> 2;
            }
            return i5 | i3;
        }

        public abstract int o00oOooo(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0);

        public void o00oo(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, float f, float f2, int i, boolean z) {
            o0O000.f4482o00oOOo0.o00oOo00(canvas, recyclerView, o0o00oo0.itemView, f, f2, i, z);
        }

        public float o00oo0(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            return 0.5f;
        }

        public float o00oo00O(float f) {
            return f;
        }

        public boolean o00oo0O(RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0) {
            return (o00oOo0o(recyclerView, o0o00oo0) & 65280) != 0;
        }

        public boolean o00oo0O0(RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0) {
            return (o00oOo0o(recyclerView, o0o00oo0) & 16711680) != 0;
        }

        public float o00oo0OO(float f) {
            return f;
        }

        public int o00oo0Oo(@oo0oO0 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int interpolation = (int) (f4547o00oOo0o.getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f) * ((int) (f4549o00oOoO0.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * o00oOoOo(recyclerView))));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean o00oo0o() {
            return true;
        }

        public boolean o00oo0o0() {
            return true;
        }

        public void o00ooO(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, int i, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo02, int i2, int i3, int i4) {
            RecyclerView.o0O00000 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof o00oo0O) {
                ((o00oo0O) layoutManager).prepareForDrop(o0o00oo0.itemView, o0o00oo02.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(o0o00oo02.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(o0o00oo02.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(o0o00oo02.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(o0o00oo02.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void o00ooO0(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0, List<o00oo0OO> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00oo0OO o00oo0oo = list.get(i2);
                o00oo0oo.o00oOo0O();
                int save = canvas.save();
                o00oo(canvas, recyclerView, o00oo0oo.f4557o00oOo0O, o00oo0oo.f4562o00oOoOo, o00oo0oo.f4563o00oOoo0, o00oo0oo.f4558o00oOo0o, false);
                canvas.restoreToCount(save);
            }
            if (o0o00oo0 != null) {
                int save2 = canvas.save();
                o00oo(canvas, recyclerView, o0o00oo0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void o00ooO00(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0, float f, float f2, int i, boolean z) {
            o0O000.f4482o00oOOo0.o00oOooO(canvas, recyclerView, o0o00oo0.itemView, f, f2, i, z);
        }

        public void o00ooO0O(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00oO0 o0o00oo0, List<o00oo0OO> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                o00oo0OO o00oo0oo = list.get(i2);
                int save = canvas.save();
                o00ooO00(canvas, recyclerView, o00oo0oo.f4557o00oOo0O, o00oo0oo.f4562o00oOoOo, o00oo0oo.f4563o00oOoo0, o00oo0oo.f4558o00oOo0o, false);
                canvas.restoreToCount(save);
            }
            if (o0o00oo0 != null) {
                int save2 = canvas.save();
                o00ooO00(canvas, recyclerView, o0o00oo0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                o00oo0OO o00oo0oo2 = list.get(i3);
                boolean z2 = o00oo0oo2.f4567o00oo00O;
                if (z2 && !o00oo0oo2.f4561o00oOoOO) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean o00ooO0o(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo02);

        public abstract void o00ooOO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0, int i);

        public void o00ooOO0(@o0OO00OO RecyclerView.o0O00oO0 o0o00oo0, int i) {
            if (o0o00oo0 != null) {
                o0O000.f4482o00oOOo0.o00oOOoO(o0o00oo0.itemView);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        void prepareForDrop(@oo0oO0 View view, @oo0oO0 View view2, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0O0 extends o00oo00O {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f4552o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f4553o00oOoOo;

        public o00oo0O0(int i, int i2) {
            this.f4552o00oOoOO = i2;
            this.f4553o00oOoOo = i;
        }

        @Override // androidx.recyclerview.widget.o0O00000.o00oo00O
        public int o00oOooo(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            return o00oo00O.o0O0o(o00ooOOo(recyclerView, o0o00oo0), o00ooOo0(recyclerView, o0o00oo0));
        }

        public int o00ooOOo(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            return this.f4553o00oOoOo;
        }

        public void o00ooOo(int i) {
            this.f4553o00oOoOo = i;
        }

        public int o00ooOo0(@oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
            return this.f4552o00oOoOO;
        }

        public void o00ooOoO(int i) {
            this.f4552o00oOoOO = i;
        }
    }

    @o0o0000
    /* loaded from: classes.dex */
    public static class o00oo0OO implements Animator.AnimatorListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final float f4554o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final float f4555o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final float f4556o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final RecyclerView.o0O00oO0 f4557o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final int f4558o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final int f4559o00oOoO;
        @o0o0000

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final ValueAnimator f4560o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f4561o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float f4562o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public float f4563o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final float f4564o00oOooO;

        /* renamed from: o00oo0  reason: collision with root package name */
        public float f4566o00oo0;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f4565o00oOooo = false;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public boolean f4567o00oo00O = false;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements ValueAnimator.AnimatorUpdateListener {
            public o00oOOo0() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                o00oo0OO.this.o00oOo00(valueAnimator.getAnimatedFraction());
            }
        }

        public o00oo0OO(RecyclerView.o0O00oO0 o0o00oo0, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4558o00oOo0o = i2;
            this.f4559o00oOoO = i;
            this.f4557o00oOo0O = o0o00oo0;
            this.f4554o00oOOo0 = f;
            this.f4555o00oOOoO = f2;
            this.f4556o00oOo00 = f3;
            this.f4564o00oOooO = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4560o00oOoO0 = ofFloat;
            ofFloat.addUpdateListener(new o00oOOo0());
            ofFloat.setTarget(o0o00oo0.itemView);
            ofFloat.addListener(this);
            o00oOo00(0.0f);
        }

        public void o00oOOo0() {
            this.f4560o00oOoO0.cancel();
        }

        public void o00oOOoO(long j) {
            this.f4560o00oOoO0.setDuration(j);
        }

        public void o00oOo00(float f) {
            this.f4566o00oo0 = f;
        }

        public void o00oOo0O() {
            float f = this.f4554o00oOOo0;
            float f2 = this.f4556o00oOo00;
            this.f4562o00oOoOo = f == f2 ? this.f4557o00oOo0O.itemView.getTranslationX() : o00oOoO0.o00oOoO.o00oOOo0(f2, f, this.f4566o00oo0, f);
            float f3 = this.f4555o00oOOoO;
            float f4 = this.f4564o00oOooO;
            this.f4563o00oOoo0 = f3 == f4 ? this.f4557o00oOo0O.itemView.getTranslationY() : o00oOoO0.o00oOoO.o00oOOo0(f4, f3, this.f4566o00oo0, f3);
        }

        public void o00oOooO() {
            this.f4557o00oOo0O.setIsRecyclable(false);
            this.f4560o00oOoO0.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            o00oOo00(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4567o00oo00O) {
                this.f4557o00oOo0O.setIsRecyclable(true);
            }
            this.f4567o00oo00O = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public o0O00000(@oo0oO0 o00oo00O o00oo00o) {
        this.f4517o00oo00O = o00oo00o;
    }

    public static boolean o00oo0o0(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O000
    public void o00oOOoO(@oo0oO0 View view) {
        o00ooO00(view);
        RecyclerView.o0O00oO0 childViewHolder = this.f4521o00oo0Oo.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.o0O00oO0 o0o00oo0 = this.f4505o00oOo00;
        if (o0o00oo0 != null && childViewHolder == o0o00oo0) {
            o00ooO0O(null, 0);
            return;
        }
        o00oOooo(childViewHolder, false);
        if (this.f4503o00oOOo0.remove(childViewHolder.itemView)) {
            this.f4517o00oo00O.o00oOo00(this.f4521o00oo0Oo, childViewHolder);
        }
    }

    public final void o00oOo0o() {
    }

    public final int o00oOoO(RecyclerView.o0O00oO0 o0o00oo0, int i) {
        if ((i & 12) != 0) {
            int i2 = this.f4508o00oOoO > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f4522o00oo0o;
            if (velocityTracker != null && this.f4514o00oOooo > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f4517o00oo00O.o00oo0OO(this.f4509o00oOoO0));
                float xVelocity = this.f4522o00oo0o.getXVelocity(this.f4514o00oOooo);
                float yVelocity = this.f4522o00oo0o.getYVelocity(this.f4514o00oOooo);
                int i3 = xVelocity <= 0.0f ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4517o00oo00O.o00oo00O(this.f4507o00oOo0o) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float o00oo02 = this.f4517o00oo00O.o00oo0(o0o00oo0) * this.f4521o00oo0Oo.getWidth();
            if ((i & i2) == 0 || Math.abs(this.f4508o00oOoO) <= o00oo02) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    public void o00oOoO0(@o0OO00OO RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4521o00oo0Oo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            o00oOoo0();
        }
        this.f4521o00oo0Oo = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f4507o00oOo0o = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f4509o00oOoO0 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            o00ooO0o();
        }
    }

    public void o00oOoOO(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.o0O00oO0 o00oo0O02;
        int o00oOo0o2;
        if (this.f4505o00oOo00 != null || i != 2 || this.f4516o00oo0 == 2 || !this.f4517o00oo00O.o00oo0o0() || this.f4521o00oo0Oo.getScrollState() == 1 || (o00oo0O02 = o00oo0O0(motionEvent)) == null || (o00oOo0o2 = (this.f4517o00oo00O.o00oOo0o(this.f4521o00oo0Oo, o00oo0O02) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4513o00oOooO;
        float f2 = y - this.f4506o00oOo0O;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int i3 = this.f4518o00oo0O;
        if (abs >= i3 || abs2 >= i3) {
            if (abs > abs2) {
                if (f < 0.0f && (o00oOo0o2 & 4) == 0) {
                    return;
                }
                if (f > 0.0f && (o00oOo0o2 & 8) == 0) {
                    return;
                }
            } else if (f2 < 0.0f && (o00oOo0o2 & 1) == 0) {
                return;
            } else {
                if (f2 > 0.0f && (o00oOo0o2 & 2) == 0) {
                    return;
                }
            }
            this.f4510o00oOoOO = 0.0f;
            this.f4508o00oOoO = 0.0f;
            this.f4514o00oOooo = motionEvent.getPointerId(0);
            o00ooO0O(o00oo0O02, 1);
        }
    }

    public final int o00oOoOo(RecyclerView.o0O00oO0 o0o00oo0, int i) {
        if ((i & 3) != 0) {
            int i2 = this.f4510o00oOoOO > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f4522o00oo0o;
            if (velocityTracker != null && this.f4514o00oOooo > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f4517o00oo00O.o00oo0OO(this.f4509o00oOoO0));
                float xVelocity = this.f4522o00oo0o.getXVelocity(this.f4514o00oOooo);
                float yVelocity = this.f4522o00oo0o.getYVelocity(this.f4514o00oOooo);
                int i3 = yVelocity <= 0.0f ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4517o00oo00O.o00oo00O(this.f4507o00oOo0o) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float o00oo02 = this.f4517o00oo00O.o00oo0(o0o00oo0) * this.f4521o00oo0Oo.getHeight();
            if ((i & i2) == 0 || Math.abs(this.f4510o00oOoOO) <= o00oo02) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    public final void o00oOoo0() {
        this.f4521o00oo0Oo.removeItemDecoration(this);
        this.f4521o00oo0Oo.removeOnItemTouchListener(this.f4525o00ooO);
        this.f4521o00oo0Oo.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f4519o00oo0O0.size() - 1; size >= 0; size--) {
            o00oo0OO o00oo0oo = this.f4519o00oo0O0.get(0);
            o00oo0oo.o00oOOo0();
            this.f4517o00oo00O.o00oOo00(this.f4521o00oo0Oo, o00oo0oo.f4557o00oOo0O);
        }
        this.f4519o00oo0O0.clear();
        this.f4527o00ooO00 = null;
        this.f4526o00ooO0 = -1;
        o00oo();
        o00ooOOo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0O000
    public void o00oOooO(@oo0oO0 View view) {
    }

    public void o00oOooo(RecyclerView.o0O00oO0 o0o00oo0, boolean z) {
        for (int size = this.f4519o00oo0O0.size() - 1; size >= 0; size--) {
            o00oo0OO o00oo0oo = this.f4519o00oo0O0.get(size);
            if (o00oo0oo.f4557o00oOo0O == o0o00oo0) {
                o00oo0oo.f4565o00oOooo |= z;
                if (!o00oo0oo.f4567o00oo00O) {
                    o00oo0oo.o00oOOo0();
                }
                this.f4519o00oo0O0.remove(size);
                return;
            }
        }
    }

    public final void o00oo() {
        VelocityTracker velocityTracker = this.f4522o00oo0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4522o00oo0o = null;
        }
    }

    public View o00oo0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.o0O00oO0 o0o00oo0 = this.f4505o00oOo00;
        if (o0o00oo0 != null) {
            View view = o0o00oo0.itemView;
            if (o00oo0o0(view, x, y, this.f4511o00oOoOo + this.f4508o00oOoO, this.f4512o00oOoo0 + this.f4510o00oOoOO)) {
                return view;
            }
        }
        for (int size = this.f4519o00oo0O0.size() - 1; size >= 0; size--) {
            o00oo0OO o00oo0oo = this.f4519o00oo0O0.get(size);
            View view2 = o00oo0oo.f4557o00oOo0O.itemView;
            if (o00oo0o0(view2, x, y, o00oo0oo.f4562o00oOoOo, o00oo0oo.f4563o00oOoo0)) {
                return view2;
            }
        }
        return this.f4521o00oo0Oo.findChildViewUnder(x, y);
    }

    public o00oo0OO o00oo00O(MotionEvent motionEvent) {
        if (this.f4519o00oo0O0.isEmpty()) {
            return null;
        }
        View o00oo02 = o00oo0(motionEvent);
        for (int size = this.f4519o00oo0O0.size() - 1; size >= 0; size--) {
            o00oo0OO o00oo0oo = this.f4519o00oo0O0.get(size);
            if (o00oo0oo.f4557o00oOo0O.itemView == o00oo02) {
                return o00oo0oo;
            }
        }
        return null;
    }

    public final void o00oo0O(float[] fArr) {
        if ((this.f4520o00oo0OO & 12) != 0) {
            fArr[0] = (this.f4511o00oOoOo + this.f4508o00oOoO) - this.f4505o00oOo00.itemView.getLeft();
        } else {
            fArr[0] = this.f4505o00oOo00.itemView.getTranslationX();
        }
        if ((this.f4520o00oo0OO & 3) != 0) {
            fArr[1] = (this.f4512o00oOoo0 + this.f4510o00oOoOO) - this.f4505o00oOo00.itemView.getTop();
        } else {
            fArr[1] = this.f4505o00oOo00.itemView.getTranslationY();
        }
    }

    public final RecyclerView.o0O00oO0 o00oo0O0(MotionEvent motionEvent) {
        View o00oo02;
        RecyclerView.o0O00000 layoutManager = this.f4521o00oo0Oo.getLayoutManager();
        int i = this.f4514o00oOooo;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f4513o00oOooO);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f4506o00oOo0O);
        int i2 = this.f4518o00oo0O;
        if (abs >= i2 || abs2 >= i2) {
            if (abs <= abs2 || !layoutManager.canScrollHorizontally()) {
                if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (o00oo02 = o00oo0(motionEvent)) != null) {
                    return this.f4521o00oo0Oo.getChildViewHolder(o00oo02);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final List<RecyclerView.o0O00oO0> o00oo0OO(RecyclerView.o0O00oO0 o0o00oo0) {
        RecyclerView.o0O00oO0 o0o00oo02 = o0o00oo0;
        List<RecyclerView.o0O00oO0> list = this.f4524o00oo0oO;
        if (list == null) {
            this.f4524o00oo0oO = new ArrayList();
            this.f4532o0O0o = new ArrayList();
        } else {
            list.clear();
            this.f4532o0O0o.clear();
        }
        int o00oOoO2 = this.f4517o00oo00O.o00oOoO();
        int round = Math.round(this.f4511o00oOoOo + this.f4508o00oOoO) - o00oOoO2;
        int round2 = Math.round(this.f4512o00oOoo0 + this.f4510o00oOoOO) - o00oOoO2;
        int i = o00oOoO2 * 2;
        int width = o0o00oo02.itemView.getWidth() + round + i;
        int height = o0o00oo02.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.o0O00000 layoutManager = this.f4521o00oo0Oo.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != o0o00oo02.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.o0O00oO0 childViewHolder = this.f4521o00oo0Oo.getChildViewHolder(childAt);
                if (this.f4517o00oo00O.o00oOOo0(this.f4521o00oo0Oo, this.f4505o00oOo00, childViewHolder)) {
                    int abs = Math.abs(i2 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int abs2 = Math.abs(i3 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i5 = (abs2 * abs2) + (abs * abs);
                    int size = this.f4524o00oo0oO.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f4532o0O0o.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f4524o00oo0oO.add(i6, childViewHolder);
                    this.f4532o0O0o.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            o0o00oo02 = o0o00oo0;
        }
        return this.f4524o00oo0oO;
    }

    public boolean o00oo0Oo() {
        int size = this.f4519o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            if (!this.f4519o00oo0O0.get(i).f4567o00oo00O) {
                return true;
            }
        }
        return false;
    }

    public void o00oo0o(RecyclerView.o0O00oO0 o0o00oo0) {
        if (!this.f4521o00oo0Oo.isLayoutRequested() && this.f4516o00oo0 == 2) {
            float o00oOoo02 = this.f4517o00oo00O.o00oOoo0(o0o00oo0);
            int i = (int) (this.f4511o00oOoOo + this.f4508o00oOoO);
            int i2 = (int) (this.f4512o00oOoo0 + this.f4510o00oOoOO);
            if (Math.abs(i2 - o0o00oo0.itemView.getTop()) >= o0o00oo0.itemView.getHeight() * o00oOoo02 || Math.abs(i - o0o00oo0.itemView.getLeft()) >= o0o00oo0.itemView.getWidth() * o00oOoo02) {
                List<RecyclerView.o0O00oO0> o00oo0OO2 = o00oo0OO(o0o00oo0);
                if (o00oo0OO2.size() == 0) {
                    return;
                }
                RecyclerView.o0O00oO0 o00oOOoO2 = this.f4517o00oo00O.o00oOOoO(o0o00oo0, o00oo0OO2, i, i2);
                if (o00oOOoO2 == null) {
                    this.f4524o00oo0oO.clear();
                    this.f4532o0O0o.clear();
                    return;
                }
                int absoluteAdapterPosition = o00oOOoO2.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = o0o00oo0.getAbsoluteAdapterPosition();
                if (this.f4517o00oo00O.o00ooO0o(this.f4521o00oo0Oo, o0o00oo0, o00oOOoO2)) {
                    this.f4517o00oo00O.o00ooO(this.f4521o00oo0Oo, o0o00oo0, absoluteAdapterPosition2, o00oOOoO2, absoluteAdapterPosition, i, i2);
                }
            }
        }
    }

    public void o00oo0oO() {
        VelocityTracker velocityTracker = this.f4522o00oo0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4522o00oo0o = VelocityTracker.obtain();
    }

    public void o00ooO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        if (this.f4517o00oo00O.o00oo0O0(this.f4521o00oo0Oo, o0o00oo0) && o0o00oo0.itemView.getParent() == this.f4521o00oo0Oo) {
            o00oo0oO();
            this.f4510o00oOoOO = 0.0f;
            this.f4508o00oOoO = 0.0f;
            o00ooO0O(o0o00oo0, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00ooO0() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o0O00000.o00ooO0():boolean");
    }

    public void o00ooO00(View view) {
        if (view == this.f4527o00ooO00) {
            this.f4527o00ooO00 = null;
            if (this.f4515o00oo != null) {
                this.f4521o00oo0Oo.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00ooO0O(@o00oOooO.o0OO00OO androidx.recyclerview.widget.RecyclerView.o0O00oO0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o0O00000.o00ooO0O(androidx.recyclerview.widget.RecyclerView$o0O00oO0, int):void");
    }

    public final void o00ooO0o() {
        this.f4518o00oo0O = ViewConfiguration.get(this.f4521o00oo0Oo.getContext()).getScaledTouchSlop();
        this.f4521o00oo0Oo.addItemDecoration(this);
        this.f4521o00oo0Oo.addOnItemTouchListener(this.f4525o00ooO);
        this.f4521o00oo0Oo.addOnChildAttachStateChangeListener(this);
        o00ooOO0();
    }

    public void o00ooOO(@oo0oO0 RecyclerView.o0O00oO0 o0o00oo0) {
        if (this.f4517o00oo00O.o00oo0O(this.f4521o00oo0Oo, o0o00oo0) && o0o00oo0.itemView.getParent() == this.f4521o00oo0Oo) {
            o00oo0oO();
            this.f4510o00oOoOO = 0.0f;
            this.f4508o00oOoO = 0.0f;
            o00ooO0O(o0o00oo0, 1);
        }
    }

    public final void o00ooOO0() {
        this.f4529o00ooO0o = new o00oo0();
        this.f4528o00ooO0O = new o0O000oo.o00ooO(this.f4521o00oo0Oo.getContext(), this.f4529o00ooO0o, null);
    }

    public final void o00ooOOo() {
        o00oo0 o00oo0Var = this.f4529o00ooO0o;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOo0();
            this.f4529o00ooO0o = null;
        }
        if (this.f4528o00ooO0O != null) {
            this.f4528o00ooO0O = null;
        }
    }

    public void o00ooOo(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4513o00oOooO;
        this.f4508o00oOoO = f;
        this.f4510o00oOoOO = y - this.f4506o00oOo0O;
        if ((i & 4) == 0) {
            this.f4508o00oOoO = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f4508o00oOoO = Math.min(0.0f, this.f4508o00oOoO);
        }
        if ((i & 1) == 0) {
            this.f4510o00oOoOO = Math.max(0.0f, this.f4510o00oOoOO);
        }
        if ((i & 2) == 0) {
            this.f4510o00oOoOO = Math.min(0.0f, this.f4510o00oOoOO);
        }
    }

    public final int o00ooOo0(RecyclerView.o0O00oO0 o0o00oo0) {
        if (this.f4516o00oo0 == 2) {
            return 0;
        }
        int o00oOooo2 = this.f4517o00oo00O.o00oOooo(this.f4521o00oo0Oo, o0o00oo0);
        int o00oOooO2 = (this.f4517o00oo00O.o00oOooO(o00oOooo2, o0O0o00O.o0O000O(this.f4521o00oo0Oo)) & 65280) >> 8;
        if (o00oOooO2 == 0) {
            return 0;
        }
        int i = (o00oOooo2 & 65280) >> 8;
        if (Math.abs(this.f4508o00oOoO) > Math.abs(this.f4510o00oOoOO)) {
            int o00oOoO2 = o00oOoO(o0o00oo0, o00oOooO2);
            if (o00oOoO2 > 0) {
                return (i & o00oOoO2) == 0 ? o00oo00O.o00oOo0O(o00oOoO2, o0O0o00O.o00oo0O0.o00oOooO(this.f4521o00oo0Oo)) : o00oOoO2;
            }
            int o00oOoOo2 = o00oOoOo(o0o00oo0, o00oOooO2);
            if (o00oOoOo2 > 0) {
                return o00oOoOo2;
            }
        } else {
            int o00oOoOo3 = o00oOoOo(o0o00oo0, o00oOooO2);
            if (o00oOoOo3 > 0) {
                return o00oOoOo3;
            }
            int o00oOoO3 = o00oOoO(o0o00oo0, o00oOooO2);
            if (o00oOoO3 > 0) {
                return (i & o00oOoO3) == 0 ? o00oo00O.o00oOo0O(o00oOoO3, o0O0o00O.o00oo0O0.o00oOooO(this.f4521o00oo0Oo)) : o00oOoO3;
            }
        }
        return 0;
    }

    public void o0O0o(o00oo0OO o00oo0oo, int i) {
        this.f4521o00oo0Oo.post(new o00oOo0O(o00oo0oo, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        float f;
        float f2;
        this.f4526o00ooO0 = -1;
        if (this.f4505o00oOo00 != null) {
            o00oo0O(this.f4504o00oOOoO);
            float[] fArr = this.f4504o00oOOoO;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4517o00oo00O.o00ooO0(canvas, recyclerView, this.f4505o00oOo00, this.f4519o00oo0O0, this.f4516o00oo0, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0O00OOO o0o00ooo) {
        float f;
        float f2;
        if (this.f4505o00oOo00 != null) {
            o00oo0O(this.f4504o00oOOoO);
            float[] fArr = this.f4504o00oOOoO;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4517o00oo00O.o00ooO0O(canvas, recyclerView, this.f4505o00oOo00, this.f4519o00oo0O0, this.f4516o00oo0, f, f2);
    }
}
