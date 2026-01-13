package o0O0Oo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooo0.o0O0O0Oo;
import o0O0Oo.o0O0OOO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O0OOO extends o0O0o00 implements o0O0OOO0 {

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f11639o00ooO0 = "animated-vector";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final String f11640o00ooO00 = "AnimatedVDCompat";

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f11641o00ooO0O = "target";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final boolean f11642o00ooO0o = false;

    /* renamed from: o00oo  reason: collision with root package name */
    public final Drawable.Callback f11643o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oOo00 f11644o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Context f11645o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oOo0O f11646o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ArgbEvaluator f11647o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Animator.AnimatorListener f11648o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public ArrayList<o0O0OOO0.o00oOOo0> f11649o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Drawable.Callback {
        public o00oOOo0() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            o0O0OOO.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            o0O0OOO.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            o0O0OOO.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends AnimatorListenerAdapter {
        public o00oOOoO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(o0O0OOO.this.f11649o0O0o);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o0O0OOO0.o00oOOo0) arrayList.get(i)).onAnimationEnd(o0O0OOO.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(o0O0OOO.this.f11649o0O0o);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o0O0OOO0.o00oOOo0) arrayList.get(i)).onAnimationStart(o0O0OOO.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends Drawable.ConstantState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f11652o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0O0o00O f11653o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public AnimatorSet f11654o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public androidx.collection.o00oOOo0<Animator, String> f11655o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ArrayList<Animator> f11656o00oOooO;

        public o00oOo00(Context context, o00oOo00 o00ooo002, Drawable.Callback callback, Resources resources) {
            if (o00ooo002 != null) {
                this.f11652o00oOOo0 = o00ooo002.f11652o00oOOo0;
                o0O0o00O o0o0o00o = o00ooo002.f11653o00oOOoO;
                if (o0o0o00o != null) {
                    Drawable.ConstantState constantState = o0o0o00o.getConstantState();
                    this.f11653o00oOOoO = (o0O0o00O) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    o0O0o00O o0o0o00o2 = (o0O0o00O) this.f11653o00oOOoO.mutate();
                    this.f11653o00oOOoO = o0o0o00o2;
                    o0o0o00o2.setCallback(callback);
                    this.f11653o00oOOoO.setBounds(o00ooo002.f11653o00oOOoO.getBounds());
                    this.f11653o00oOOoO.o00oOoOo(false);
                }
                ArrayList<Animator> arrayList = o00ooo002.f11656o00oOooO;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11656o00oOooO = new ArrayList<>(size);
                    this.f11655o00oOo0O = new androidx.collection.o00oOOo0<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = o00ooo002.f11656o00oOooO.get(i);
                        Animator clone = animator.clone();
                        String str = o00ooo002.f11655o00oOo0O.get(animator);
                        clone.setTarget(this.f11653o00oOOoO.o00oOo0O(str));
                        this.f11656o00oOooO.add(clone);
                        this.f11655o00oOo0O.put(clone, str);
                    }
                    o00oOOo0();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11652o00oOOo0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public void o00oOOo0() {
            if (this.f11654o00oOo00 == null) {
                this.f11654o00oOo00 = new AnimatorSet();
            }
            this.f11654o00oOo00.playTogether(this.f11656o00oOooO);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo0O extends Drawable.ConstantState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Drawable.ConstantState f11657o00oOOo0;

        public o00oOo0O(Drawable.ConstantState constantState) {
            this.f11657o00oOOo0 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11657o00oOOo0.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11657o00oOOo0.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            o0O0OOO o0o0ooo = new o0O0OOO();
            Drawable newDrawable = this.f11657o00oOOo0.newDrawable();
            o0o0ooo.f11659o00oo0O0 = newDrawable;
            newDrawable.setCallback(o0o0ooo.f11643o00oo);
            return o0o0ooo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            o0O0OOO o0o0ooo = new o0O0OOO();
            Drawable newDrawable = this.f11657o00oOOo0.newDrawable(resources);
            o0o0ooo.f11659o00oo0O0 = newDrawable;
            newDrawable.setCallback(o0o0ooo.f11643o00oo);
            return o0o0ooo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            o0O0OOO o0o0ooo = new o0O0OOO();
            Drawable newDrawable = this.f11657o00oOOo0.newDrawable(resources, theme);
            o0o0ooo.f11659o00oo0O0 = newDrawable;
            newDrawable.setCallback(o0o0ooo.f11643o00oo);
            return o0o0ooo;
        }
    }

    public o0O0OOO() {
        this(null, null, null);
    }

    public o0O0OOO(@o0OO00OO Context context) {
        this(context, null, null);
    }

    public o0O0OOO(@o0OO00OO Context context, @o0OO00OO o00oOo00 o00ooo002, @o0OO00OO Resources resources) {
        this.f11647o00oo0o0 = null;
        this.f11648o00oo0oO = null;
        this.f11649o0O0o = null;
        o00oOOo0 o00oooo02 = new o00oOOo0();
        this.f11643o00oo = o00oooo02;
        this.f11645o00oo0Oo = context;
        if (o00ooo002 != null) {
            this.f11644o00oo0O = o00ooo002;
        } else {
            this.f11644o00oo0O = new o00oOo00(context, o00ooo002, o00oooo02, resources);
        }
    }

    public static void o00oOOo0(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @o0OO00OO
    public static o0O0OOO o00oOOoO(@oo0oO0 Context context, @o0O0O0o0 int i) {
        o0O0OOO o0o0ooo = new o0O0OOO(context, null, null);
        Drawable o00oOoO02 = o00ooo0o.o0O0OO.o00oOoO0(context.getResources(), i, context.getTheme());
        o0o0ooo.f11659o00oo0O0 = o00oOoO02;
        o00oOoO02.setCallback(o0o0ooo.f11643o00oo);
        o0o0ooo.f11646o00oo0o = new o00oOo0O(o0o0ooo.f11659o00oo0O0.getConstantState());
        return o0o0ooo;
    }

    public static o0O0OOO o00oOo00(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        o0O0OOO o0o0ooo = new o0O0OOO(context, null, null);
        o0o0ooo.inflate(resources, xmlPullParser, attributeSet, theme);
        return o0o0ooo;
    }

    @o0OOooO0(23)
    public static void o00oOo0O(@oo0oO0 AnimatedVectorDrawable animatedVectorDrawable, @oo0oO0 o0O0OOO0.o00oOOo0 o00oooo02) {
        animatedVectorDrawable.registerAnimationCallback(o00oooo02.getPlatformCallback());
    }

    public static boolean o00oOoOO(Drawable drawable, o0O0OOO0.o00oOOo0 o00oooo02) {
        if (drawable == null || o00oooo02 == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return o00oOoOo((AnimatedVectorDrawable) drawable, o00oooo02);
    }

    @o0OOooO0(23)
    public static boolean o00oOoOo(AnimatedVectorDrawable animatedVectorDrawable, o0O0OOO0.o00oOOo0 o00oooo02) {
        return animatedVectorDrawable.unregisterAnimationCallback(o00oooo02.getPlatformCallback());
    }

    public static void o00oOooO(Drawable drawable, o0O0OOO0.o00oOOo0 o00oooo02) {
        if (drawable == null || o00oooo02 == null || !(drawable instanceof Animatable)) {
            return;
        }
        o00oOo0O((AnimatedVectorDrawable) drawable, o00oooo02);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOOo0(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            return o0O0O0Oo.o00oOOoO.o00oOOoO(drawable);
        }
        return false;
    }

    @Override // o0O0Oo.o0O0OOO0
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        o00oOo0o();
        ArrayList<o0O0OOO0.o00oOOo0> arrayList = this.f11649o0O0o;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11644o00oo0O.f11653o00oOOoO.draw(canvas);
        if (this.f11644o00oo0O.f11654o00oOo00.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOo0.o00oOOo0(drawable) : this.f11644o00oo0O.f11653o00oOOoO.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11644o00oo0O.f11652o00oOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOoO.o00oOo00(drawable) : this.f11644o00oo0O.f11653o00oOOoO.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11659o00oo0O0 != null) {
            return new o00oOo0O(this.f11659o00oo0O0.getConstantState());
        }
        return null;
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11644o00oo0O.f11653o00oOOoO.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11644o00oo0O.f11653o00oOOoO.getIntrinsicWidth();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.getOpacity() : this.f11644o00oo0O.f11653o00oOOoO.getOpacity();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes;
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOooO(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f11639o00ooO0.equals(name)) {
                    obtainAttributes = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11599o00ooo0o);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o0O0o00O o00oOOoO2 = o0O0o00O.o00oOOoO(resources, resourceId, theme);
                        o00oOOoO2.o00oOoOo(false);
                        o00oOOoO2.setCallback(this.f11643o00oo);
                        o0O0o00O o0o0o00o = this.f11644o00oo0O.f11653o00oOOoO;
                        if (o0o0o00o != null) {
                            o0o0o00o.setCallback(null);
                        }
                        this.f11644o00oo0O.f11653o00oOOoO = o00oOOoO2;
                    }
                } else if (f11641o00ooO0O.equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, o0O0OO.f11601o00oooOO);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11645o00oo0Oo;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        o00oOoO0(string, AnimatorInflater.loadAnimator(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f11644o00oo0O.o00oOOo0();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? o0O0O0Oo.o00oOOo0.o00oOooO(drawable) : this.f11644o00oo0O.f11653o00oOOoO.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11644o00oo0O.f11654o00oOo00.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.isStateful() : this.f11644o00oo0O.f11653o00oOOoO.isStateful();
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void o00oOo0o() {
        Animator.AnimatorListener animatorListener = this.f11648o00oo0oO;
        if (animatorListener != null) {
            this.f11644o00oo0O.f11654o00oOo00.removeListener(animatorListener);
            this.f11648o00oo0oO = null;
        }
    }

    public final void o00oOoO(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                o00oOoO(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f11647o00oo0o0 == null) {
                    this.f11647o00oo0o0 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f11647o00oo0o0);
            }
        }
    }

    public final void o00oOoO0(String str, Animator animator) {
        animator.setTarget(this.f11644o00oo0O.f11653o00oOOoO.o00oOo0O(str));
        o00oOo00 o00ooo002 = this.f11644o00oo0O;
        if (o00ooo002.f11656o00oOooO == null) {
            o00ooo002.f11656o00oOooO = new ArrayList<>();
            this.f11644o00oo0O.f11655o00oOo0O = new androidx.collection.o00oOOo0<>();
        }
        this.f11644o00oo0O.f11656o00oOooO.add(animator);
        this.f11644o00oo0O.f11655o00oOo0O.put(animator, str);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setBounds(rect);
        }
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.setLevel(i) : this.f11644o00oo0O.f11653o00oOOoO.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11659o00oo0O0;
        return drawable != null ? drawable.setState(iArr) : this.f11644o00oo0O.f11653o00oOOoO.setState(iArr);
    }

    @Override // o0O0Oo.o0O0OOO0
    public void registerAnimationCallback(@oo0oO0 o0O0OOO0.o00oOOo0 o00oooo02) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o00oOo0O((AnimatedVectorDrawable) drawable, o00oooo02);
        } else if (o00oooo02 == null) {
        } else {
            if (this.f11649o0O0o == null) {
                this.f11649o0O0o = new ArrayList<>();
            }
            if (this.f11649o0O0o.contains(o00oooo02)) {
                return;
            }
            this.f11649o0O0o.add(o00oooo02);
            if (this.f11648o00oo0oO == null) {
                this.f11648o00oo0oO = new o00oOOoO();
            }
            this.f11644o00oo0O.f11654o00oOo00.addListener(this.f11648o00oo0oO);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOo0.o00oOo0O(drawable, z);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setAutoMirrored(z);
        }
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setColorFilter(colorFilter);
        }
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o0O0Oo.o0O0o00, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTint(int i) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoO0(drawable, i);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoO(drawable, colorStateList);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, o00oooo0.o0O0OOOo
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o0O0O0Oo.o00oOOoO.o00oOoOO(drawable, mode);
        } else {
            this.f11644o00oo0O.f11653o00oOOoO.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f11644o00oo0O.f11653o00oOOoO.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f11644o00oo0O.f11654o00oOo00.isStarted()) {
        } else {
            this.f11644o00oo0O.f11654o00oOo00.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11644o00oo0O.f11654o00oOo00.end();
        }
    }

    @Override // o0O0Oo.o0O0OOO0
    public boolean unregisterAnimationCallback(@oo0oO0 o0O0OOO0.o00oOOo0 o00oooo02) {
        Drawable drawable = this.f11659o00oo0O0;
        if (drawable != null) {
            o00oOoOo((AnimatedVectorDrawable) drawable, o00oooo02);
        }
        ArrayList<o0O0OOO0.o00oOOo0> arrayList = this.f11649o0O0o;
        if (arrayList == null || o00oooo02 == null) {
            return false;
        }
        boolean remove = arrayList.remove(o00oooo02);
        if (this.f11649o0O0o.size() == 0) {
            o00oOo0o();
        }
        return remove;
    }
}
