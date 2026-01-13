package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.o00oOOo0;
import androidx.transition.o0O0000O;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O0Oo0o.o0O00oO0;
import o0O0Oo0o.o0O0O0Oo;
/* loaded from: classes.dex */
public abstract class o0O00O0o extends o0O0000O {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f5184o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f5185o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f5186o00oOo00;

        public o00oOOo0(ViewGroup viewGroup, View view, View view2) {
            this.f5184o00oOOo0 = viewGroup;
            this.f5185o00oOOoO = view;
            this.f5186o00oOo00 = view2;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            this.f5186o00oOo00.setTag(R.id.save_overlay_view, null);
            o0O00oO0.o00oOOoO(this.f5184o00oOOo0).remove(this.f5185o00oOOoO);
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
            o0O00oO0.o00oOOoO(this.f5184o00oOOo0).remove(this.f5185o00oOOoO);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
            if (this.f5185o00oOOoO.getParent() == null) {
                o0O00oO0.o00oOOoO(this.f5184o00oOOo0).add(this.f5185o00oOOoO);
            } else {
                o0O00O0o.this.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends AnimatorListenerAdapter implements o0O0000O.o00oo0OO, o00oOOo0.InterfaceC0056o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final View f5188o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f5189o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ViewGroup f5190o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f5191o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f5192o00oOo0o = false;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f5193o00oOooO;

        public o00oOOoO(View view, int i, boolean z) {
            this.f5188o00oOOo0 = view;
            this.f5189o00oOOoO = i;
            this.f5190o00oOo00 = (ViewGroup) view.getParent();
            this.f5193o00oOooO = z;
            o00oOOoO(true);
        }

        public final void o00oOOo0() {
            if (!this.f5192o00oOo0o) {
                o0O0O0Oo.o00oOoOO(this.f5188o00oOOo0, this.f5189o00oOOoO);
                ViewGroup viewGroup = this.f5190o00oOo00;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            o00oOOoO(false);
        }

        public final void o00oOOoO(boolean z) {
            ViewGroup viewGroup;
            if (!this.f5193o00oOooO || this.f5191o00oOo0O == z || (viewGroup = this.f5190o00oOo00) == null) {
                return;
            }
            this.f5191o00oOo0O = z;
            o0O00oO0.o00oOooO(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5192o00oOo0o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o00oOOo0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.o00oOOo0.InterfaceC0056o00oOOo0
        public void onAnimationPause(Animator animator) {
            if (this.f5192o00oOo0o) {
                return;
            }
            o0O0O0Oo.o00oOoOO(this.f5188o00oOOo0, this.f5189o00oOOoO);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.o00oOOo0.InterfaceC0056o00oOOo0
        public void onAnimationResume(Animator animator) {
            if (this.f5192o00oOo0o) {
                return;
            }
            o0O0O0Oo.o00oOoOO(this.f5188o00oOOo0, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o) {
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            o00oOOo0();
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
            o00oOOoO(false);
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
            o00oOOoO(true);
        }

        @Override // androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f5194o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f5195o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f5196o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public ViewGroup f5197o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public ViewGroup f5198o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f5199o00oOooO;
    }

    public o0O00O0o() {
        this.mMode = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public o0O00O0o(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5116o00oOo0O);
        int o00oOoo02 = o0O0o00.o00oOoo0(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (o00oOoo02 != 0) {
            setMode(o00oOoo02);
        }
    }

    private void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        o0ooo00o.f11944o00oOOo0.put(PROPNAME_VISIBILITY, Integer.valueOf(o0ooo00o.f11945o00oOOoO.getVisibility()));
        o0ooo00o.f11944o00oOOo0.put(PROPNAME_PARENT, o0ooo00o.f11945o00oOOoO.getParent());
        int[] iArr = new int[2];
        o0ooo00o.f11945o00oOOoO.getLocationOnScreen(iArr);
        o0ooo00o.f11944o00oOOo0.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.f5197o00oOo0O == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r0.f5196o00oOo00 == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.o0O00O0o.o00oOo0O getVisibilityChangeInfo(o0O0Oo0o.o0OoO00O r8, o0O0Oo0o.o0OoO00O r9) {
        /*
            r7 = this;
            androidx.transition.o0O00O0o$o00oOo0O r0 = new androidx.transition.o0O00O0o$o00oOo0O
            r0.<init>()
            r1 = 0
            r0.f5194o00oOOo0 = r1
            r0.f5195o00oOOoO = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11944o00oOOo0
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11944o00oOOo0
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f5196o00oOo00 = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11944o00oOOo0
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f5197o00oOo0O = r6
            goto L37
        L33:
            r0.f5196o00oOo00 = r4
            r0.f5197o00oOo0O = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f11944o00oOOo0
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f11944o00oOOo0
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f5199o00oOooO = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f11944o00oOOo0
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f5198o00oOo0o = r2
            goto L5e
        L5a:
            r0.f5199o00oOooO = r4
            r0.f5198o00oOo0o = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f5196o00oOo00
            int r9 = r0.f5199o00oOooO
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f5197o00oOo0O
            android.view.ViewGroup r4 = r0.f5198o00oOo0o
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f5198o00oOo0o
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f5197o00oOo0O
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f5199o00oOooO
            if (r8 != 0) goto L8d
        L88:
            r0.f5195o00oOOoO = r2
        L8a:
            r0.f5194o00oOOo0 = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f5196o00oOo00
            if (r8 != 0) goto L96
        L93:
            r0.f5195o00oOOoO = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0O00O0o.getVisibilityChangeInfo(o0O0Oo0o.o0OoO00O, o0O0Oo0o.o0OoO00O):androidx.transition.o0O00O0o$o00oOo0O");
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        o00oOo0O visibilityChangeInfo = getVisibilityChangeInfo(o0ooo00o, o0ooo00o2);
        if (visibilityChangeInfo.f5194o00oOOo0) {
            if (visibilityChangeInfo.f5197o00oOo0O == null && visibilityChangeInfo.f5198o00oOo0o == null) {
                return null;
            }
            return visibilityChangeInfo.f5195o00oOOoO ? onAppear(viewGroup, o0ooo00o, visibilityChangeInfo.f5196o00oOo00, o0ooo00o2, visibilityChangeInfo.f5199o00oOooO) : onDisappear(viewGroup, o0ooo00o, visibilityChangeInfo.f5196o00oOo00, o0ooo00o2, visibilityChangeInfo.f5199o00oOooO);
        }
        return null;
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.o0O0000O
    public boolean isTransitionRequired(@o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        if (o0ooo00o == null && o0ooo00o2 == null) {
            return false;
        }
        if (o0ooo00o == null || o0ooo00o2 == null || o0ooo00o2.f11944o00oOOo0.containsKey(PROPNAME_VISIBILITY) == o0ooo00o.f11944o00oOOo0.containsKey(PROPNAME_VISIBILITY)) {
            o00oOo0O visibilityChangeInfo = getVisibilityChangeInfo(o0ooo00o, o0ooo00o2);
            if (visibilityChangeInfo.f5194o00oOOo0) {
                return visibilityChangeInfo.f5196o00oOo00 == 0 || visibilityChangeInfo.f5199o00oOooO == 0;
            }
            return false;
        }
        return false;
    }

    public boolean isVisible(o0O0Oo0o.o0OoO00O o0ooo00o) {
        if (o0ooo00o == null) {
            return false;
        }
        return ((Integer) o0ooo00o.f11944o00oOOo0.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) o0ooo00o.f11944o00oOOo0.get(PROPNAME_PARENT)) != null;
    }

    @o0OO00OO
    public Animator onAppear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        return null;
    }

    @o0OO00OO
    public Animator onAppear(ViewGroup viewGroup, o0O0Oo0o.o0OoO00O o0ooo00o, int i, o0O0Oo0o.o0OoO00O o0ooo00o2, int i2) {
        if ((this.mMode & 1) != 1 || o0ooo00o2 == null) {
            return null;
        }
        if (o0ooo00o == null) {
            View view = (View) o0ooo00o2.f11945o00oOOoO.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f5194o00oOOo0) {
                return null;
            }
        }
        return onAppear(viewGroup, o0ooo00o2.f11945o00oOOoO, o0ooo00o, o0ooo00o2);
    }

    @o0OO00OO
    public Animator onDisappear(ViewGroup viewGroup, View view, o0O0Oo0o.o0OoO00O o0ooo00o, o0O0Oo0o.o0OoO00O o0ooo00o2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.mCanRemoveViews != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r18, o0O0Oo0o.o0OoO00O r19, int r20, o0O0Oo0o.o0OoO00O r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0O00O0o.onDisappear(android.view.ViewGroup, o0O0Oo0o.o0OoO00O, int, o0O0Oo0o.o0OoO00O, int):android.animation.Animator");
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }
}
