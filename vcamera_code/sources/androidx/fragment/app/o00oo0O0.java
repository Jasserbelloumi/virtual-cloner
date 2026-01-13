package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.R;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Animation f3025o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Animator f3026o00oOOoO;

        public o00oOOo0(Animator animator) {
            this.f3025o00oOOo0 = null;
            this.f3026o00oOOoO = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public o00oOOo0(Animation animation) {
            this.f3025o00oOOo0 = animation;
            this.f3026o00oOOoO = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends AnimationSet implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final View f3027o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final ViewGroup f3028o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f3029o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f3030o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f3031o00oo0o0;

        public o00oOOoO(@oo0oO0 Animation animation, @oo0oO0 ViewGroup viewGroup, @oo0oO0 View view) {
            super(false);
            this.f3030o00oo0o = true;
            this.f3028o00oo0O0 = viewGroup;
            this.f3027o00oo0O = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, @oo0oO0 Transformation transformation) {
            this.f3030o00oo0o = true;
            if (this.f3029o00oo0Oo) {
                return !this.f3031o00oo0o0;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3029o00oo0Oo = true;
                o0O000oo.o0O0OOO0.o00oOOo0(this.f3028o00oo0O0, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, @oo0oO0 Transformation transformation, float f) {
            this.f3030o00oo0o = true;
            if (this.f3029o00oo0Oo) {
                return !this.f3031o00oo0o0;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3029o00oo0Oo = true;
                o0O000oo.o0O0OOO0.o00oOOo0(this.f3028o00oo0O0, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3029o00oo0Oo || !this.f3030o00oo0o) {
                this.f3028o00oo0O0.endViewTransition(this.f3027o00oo0O);
                this.f3031o00oo0o0 = true;
                return;
            }
            this.f3030o00oo0o = false;
            this.f3028o00oo0O0.post(this);
        }
    }

    @o00oOooO.o0O00000
    public static int o00oOOo0(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    public static o00oOOo0 o00oOOoO(@oo0oO0 Context context, @oo0oO0 Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int o00oOOo02 = o00oOOo0(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, o00oOOo02);
            if (onCreateAnimation != null) {
                return new o00oOOo0(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, o00oOOo02);
            if (onCreateAnimator != null) {
                return new o00oOOo0(onCreateAnimator);
            }
            if (o00oOOo02 == 0 && nextTransition != 0) {
                o00oOOo02 = o00oOooO(context, nextTransition, z);
            }
            if (o00oOOo02 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(o00oOOo02));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, o00oOOo02);
                        if (loadAnimation != null) {
                            return new o00oOOo0(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, o00oOOo02);
                        if (loadAnimator != null) {
                            return new o00oOOo0(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, o00oOOo02);
                        if (loadAnimation2 != null) {
                            return new o00oOOo0(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    @o00oOooO.o0O00000
    public static int o00oOo00(@oo0oO0 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @o00oOooO.o0O00000
    public static int o00oOooO(@oo0oO0 Context context, int i, boolean z) {
        int i2;
        if (i == 4097) {
            return z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        } else if (i == 8194) {
            return z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
        } else {
            if (i == 8197) {
                i2 = z ? 16842938 : 16842939;
            } else if (i == 4099) {
                return z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
            } else if (i != 4100) {
                return -1;
            } else {
                i2 = z ? 16842936 : 16842937;
            }
            return o00oOo00(context, i2);
        }
    }
}
