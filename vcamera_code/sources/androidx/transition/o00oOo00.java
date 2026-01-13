package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O00oO0;
import o0O0Oo0o.o0O0O0Oo;
import o0O0Oo0o.o0oO0O0o;
/* loaded from: classes.dex */
public class o00oOo00 extends o0O0000O {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f4976o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int[] f4977o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f4978o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f4965o00oo0o0 = "android:changeBounds:bounds";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f4964o00oo0o = "android:changeBounds:clip";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f4966o00oo0oO = "android:changeBounds:parent";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f4975o0O0o = "android:changeBounds:windowX";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f4963o00oo = "android:changeBounds:windowY";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String[] f4969o00ooO00 = {f4965o00oo0o0, f4964o00oo0o, f4966o00oo0oO, f4975o0O0o, f4963o00oo};

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final Property<Drawable, PointF> f4968o00ooO0 = new o00oOOoO(PointF.class, "boundsOrigin");

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final Property<o0O0o, PointF> f4970o00ooO0O = new C0057o00oOo00(PointF.class, "topLeft");

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final Property<o0O0o, PointF> f4971o00ooO0o = new o00oOo0O(PointF.class, "bottomRight");

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final Property<View, PointF> f4967o00ooO = new o00oOoO(PointF.class, "bottomRight");

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final Property<View, PointF> f4973o00ooOO0 = new o00oo00O(PointF.class, "topLeft");

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final Property<View, PointF> f4972o00ooOO = new o00oo0(PointF.class, "position");

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static o0O0Oo0o.o0O000o0 f4974o00ooOOo = new o0O0Oo0o.o0O000o0();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f4979o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f4980o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f4981o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ float f4983o00oOooO;

        public o00oOOo0(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f4979o00oOOo0 = viewGroup;
            this.f4980o00oOOoO = bitmapDrawable;
            this.f4981o00oOo00 = view;
            this.f4983o00oOooO = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0O0O0Oo.o00oOOoO(this.f4979o00oOOo0).remove(this.f4980o00oOOoO);
            o0O0O0Oo.o00oOoO(this.f4981o00oOo00, this.f4983o00oOooO);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends Property<Drawable, PointF> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Rect f4984o00oOOo0;

        public o00oOOoO(Class cls, String str) {
            super(cls, str);
            this.f4984o00oOOo0 = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4984o00oOOo0);
            Rect rect = this.f4984o00oOOo0;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4984o00oOOo0);
            this.f4984o00oOOo0.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4984o00oOOo0);
        }
    }

    /* renamed from: androidx.transition.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0057o00oOo00 extends Property<o0O0o, PointF> {
        public C0057o00oOo00(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(o0O0o o0o0o) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(o0O0o o0o0o, PointF pointF) {
            o0o0o.o00oOo00(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends Property<o0O0o, PointF> {
        public o00oOo0O(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(o0O0o o0o0o) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(o0O0o o0o0o, PointF pointF) {
            o0o0o.o00oOOo0(pointF);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends Property<View, PointF> {
        public o00oOoO(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(View view, PointF pointF) {
            o0O0O0Oo.o00oOoO0(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends Property<View, PointF> {
        public o00oo0(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            o0O0O0Oo.o00oOoO0(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends Property<View, PointF> {
        public o00oo00O(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: o00oOOo0 */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: o00oOOoO */
        public void set(View view, PointF pointF) {
            o0O0O0Oo.o00oOoO0(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O extends o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4985o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f4986o00oOOoO;

        public o00oo0O(ViewGroup viewGroup) {
            this.f4986o00oOOoO = viewGroup;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionCancel(@oo0oO0 o0O0000O o0o0000o) {
            o0O00oO0.o00oOooO(this.f4986o00oOOoO, false);
            this.f4985o00oOOo0 = true;
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
            if (!this.f4985o00oOOo0) {
                o0O00oO0.o00oOooO(this.f4986o00oOOoO, false);
            }
            o0o0000o.removeListener(this);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionPause(@oo0oO0 o0O0000O o0o0000o) {
            o0O00oO0.o00oOooO(this.f4986o00oOOoO, false);
        }

        @Override // androidx.transition.o0O000O, androidx.transition.o0O0000O.o00oo0OO
        public void onTransitionResume(@oo0oO0 o0O0000O o0o0000o) {
            o0O00oO0.o00oOooO(this.f4986o00oOOoO, true);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f4988o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f4989o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ Rect f4990o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ int f4991o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ int f4992o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final /* synthetic */ int f4994o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f4995o00oOooO;

        public o00oo0O0(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4989o00oOOoO = view;
            this.f4990o00oOo00 = rect;
            this.f4995o00oOooO = i;
            this.f4991o00oOo0O = i2;
            this.f4992o00oOo0o = i3;
            this.f4994o00oOoO0 = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4988o00oOOo0 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4988o00oOOo0) {
                return;
            }
            o0O0o00O.o0O(this.f4989o00oOOoO, this.f4990o00oOo00);
            o0O0O0Oo.o00oOoO0(this.f4989o00oOOoO, this.f4995o00oOooO, this.f4991o00oOo0O, this.f4992o00oOo0o, this.f4994o00oOoO0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO extends AnimatorListenerAdapter {
        private o0O0o mViewBounds;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0o f4996o00oOOo0;

        public o00oo0OO(o0O0o o0o0o) {
            this.f4996o00oOOo0 = o0o0o;
            this.mViewBounds = o0o0o;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f4998o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f4999o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f5000o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public View f5001o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f5002o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f5003o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f5004o00oOooO;

        public o0O0o(View view) {
            this.f5001o00oOo0O = view;
        }

        public void o00oOOo0(PointF pointF) {
            this.f5000o00oOo00 = Math.round(pointF.x);
            this.f5004o00oOooO = Math.round(pointF.y);
            int i = this.f5003o00oOoO0 + 1;
            this.f5003o00oOoO0 = i;
            if (this.f5002o00oOo0o == i) {
                o00oOOoO();
            }
        }

        public final void o00oOOoO() {
            o0O0O0Oo.o00oOoO0(this.f5001o00oOo0O, this.f4998o00oOOo0, this.f4999o00oOOoO, this.f5000o00oOo00, this.f5004o00oOooO);
            this.f5002o00oOo0o = 0;
            this.f5003o00oOoO0 = 0;
        }

        public void o00oOo00(PointF pointF) {
            this.f4998o00oOOo0 = Math.round(pointF.x);
            this.f4999o00oOOoO = Math.round(pointF.y);
            int i = this.f5002o00oOo0o + 1;
            this.f5002o00oOo0o = i;
            if (i == this.f5003o00oOoO0) {
                o00oOOoO();
            }
        }
    }

    public o00oOo00() {
        this.f4977o00oo0O0 = new int[2];
        this.f4976o00oo0O = false;
        this.f4978o00oo0Oo = false;
    }

    @SuppressLint({"RestrictedApi"})
    public o00oOo00(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4977o00oo0O0 = new int[2];
        this.f4976o00oo0O = false;
        this.f4978o00oo0Oo = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O00000.f5123o00oOooO);
        boolean o00oOo0O2 = o0O0o00.o00oOo0O(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        o00oOooO(o00oOo0O2);
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0O0Oo0o.o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o);
    }

    public final void captureValues(o0O0Oo0o.o0OoO00O o0ooo00o) {
        View view = o0ooo00o.f11945o00oOOoO;
        if (!o0O0o00O.o0O0Oooo(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        o0ooo00o.f11944o00oOOo0.put(f4965o00oo0o0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        o0ooo00o.f11944o00oOOo0.put(f4966o00oo0oO, o0ooo00o.f11945o00oOOoO.getParent());
        if (this.f4978o00oo0Oo) {
            o0ooo00o.f11945o00oOOoO.getLocationInWindow(this.f4977o00oo0O0);
            o0ooo00o.f11944o00oOOo0.put(f4975o0O0o, Integer.valueOf(this.f4977o00oo0O0[0]));
            o0ooo00o.f11944o00oOOo0.put(f4963o00oo, Integer.valueOf(this.f4977o00oo0O0[1]));
        }
        if (this.f4976o00oo0O) {
            o0ooo00o.f11944o00oOOo0.put(f4964o00oo0o, o0O0o00O.o00oo0O.o00oOOo0(view));
        }
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o, @o0OO00OO o0O0Oo0o.o0OoO00O o0ooo00o2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator o00oOo002;
        Path path;
        Property<View, PointF> property;
        if (o0ooo00o == null || o0ooo00o2 == null) {
            return null;
        }
        Map<String, Object> map = o0ooo00o.f11944o00oOOo0;
        Map<String, Object> map2 = o0ooo00o2.f11944o00oOOo0;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f4966o00oo0oO);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f4966o00oo0oO);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = o0ooo00o2.f11945o00oOOoO;
        if (!o00oOo00(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) o0ooo00o.f11944o00oOOo0.get(f4975o0O0o)).intValue();
            int intValue2 = ((Integer) o0ooo00o.f11944o00oOOo0.get(f4963o00oo)).intValue();
            int intValue3 = ((Integer) o0ooo00o2.f11944o00oOOo0.get(f4975o0O0o)).intValue();
            int intValue4 = ((Integer) o0ooo00o2.f11944o00oOOo0.get(f4963o00oo)).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f4977o00oo0O0);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float o00oOo003 = o0O0O0Oo.o00oOo00(view2);
            o0O0O0Oo.o00oOoO(view2, 0.0f);
            new o0oO0O0o(viewGroup).add(bitmapDrawable);
            o0O0Oo0o.o0O000O pathMotion = getPathMotion();
            int[] iArr = this.f4977o00oo0O0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(f4968o00ooO0, (TypeConverter) null, pathMotion.getPath(intValue - i3, intValue2 - i4, intValue3 - i3, intValue4 - i4)));
            ofPropertyValuesHolder.addListener(new o00oOOo0(viewGroup, bitmapDrawable, view2, o00oOo003));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) o0ooo00o.f11944o00oOOo0.get(f4965o00oo0o0);
        Rect rect3 = (Rect) o0ooo00o2.f11944o00oOOo0.get(f4965o00oo0o0);
        int i5 = rect2.left;
        int i6 = rect3.left;
        int i7 = rect2.top;
        int i8 = rect3.top;
        int i9 = rect2.right;
        int i10 = rect3.right;
        int i11 = rect2.bottom;
        int i12 = rect3.bottom;
        int i13 = i9 - i5;
        int i14 = i11 - i7;
        int i15 = i10 - i6;
        int i16 = i12 - i8;
        Rect rect4 = (Rect) o0ooo00o.f11944o00oOOo0.get(f4964o00oo0o);
        Rect rect5 = (Rect) o0ooo00o2.f11944o00oOOo0.get(f4964o00oo0o);
        if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
            i = 0;
        } else {
            i = (i5 == i6 && i7 == i8) ? 0 : 1;
            if (i9 != i10 || i11 != i12) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        if (i > 0) {
            if (this.f4976o00oo0O) {
                view = view2;
                o0O0O0Oo.o00oOoO0(view, i5, i7, Math.max(i13, i15) + i5, Math.max(i14, i16) + i7);
                ObjectAnimator ofObject = (i5 == i6 && i7 == i8) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) f4972o00ooOO, (TypeConverter) null, getPathMotion().getPath(i5, i7, i6, i8));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i13, i14);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i15, i16) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    o0O0o00O.o0O(view, rect);
                    o0O0Oo0o.o0O000o0 o0o000o0 = f4974o00ooOOo;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(view, "clipBounds", o0o000o0, objArr);
                    ofObject2.addListener(new o00oo0O0(view, rect5, i6, i8, i10, i12));
                    objectAnimator = ofObject2;
                }
                o00oOo002 = o0O000o0.o00oOo00(ofObject, objectAnimator);
            } else {
                view = view2;
                o0O0O0Oo.o00oOoO0(view, i5, i7, i9, i11);
                if (i == 2) {
                    if (i13 == i15 && i14 == i16) {
                        path = getPathMotion().getPath(i5, i7, i6, i8);
                        property = f4972o00ooOO;
                    } else {
                        o0O0o o0o0o = new o0O0o(view);
                        ObjectAnimator ofObject3 = ObjectAnimator.ofObject(o0o0o, (Property<o0O0o, V>) f4970o00ooO0O, (TypeConverter) null, getPathMotion().getPath(i5, i7, i6, i8));
                        ObjectAnimator ofObject4 = ObjectAnimator.ofObject(o0o0o, (Property<o0O0o, V>) f4971o00ooO0o, (TypeConverter) null, getPathMotion().getPath(i9, i11, i10, i12));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofObject3, ofObject4);
                        animatorSet.addListener(new o00oo0OO(o0o0o));
                        o00oOo002 = animatorSet;
                    }
                } else if (i5 == i6 && i7 == i8) {
                    path = getPathMotion().getPath(i9, i11, i10, i12);
                    property = f4967o00ooO;
                } else {
                    path = getPathMotion().getPath(i5, i7, i6, i8);
                    property = f4973o00ooOO0;
                }
                o00oOo002 = ObjectAnimator.ofObject(view, (Property<View, V>) property, (TypeConverter) null, path);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                o0O00oO0.o00oOooO(viewGroup4, true);
                addListener(new o00oo0O(viewGroup4));
            }
            return o00oOo002;
        }
        return null;
    }

    @Override // androidx.transition.o0O0000O
    @oo0oO0
    public String[] getTransitionProperties() {
        return f4969o00ooO00;
    }

    public boolean o00oOOoO() {
        return this.f4976o00oo0O;
    }

    public final boolean o00oOo00(View view, View view2) {
        if (this.f4978o00oo0Oo) {
            o0O0Oo0o.o0OoO00O matchedTransitionValues = getMatchedTransitionValues(view, true);
            if (matchedTransitionValues == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == matchedTransitionValues.f11945o00oOOoO) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void o00oOooO(boolean z) {
        this.f4976o00oo0O = z;
    }
}
