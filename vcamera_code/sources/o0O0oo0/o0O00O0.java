package o0O0oo0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OOOO0o.o00oo0O0;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002,>B\t\b\u0002¢\u0006\u0004\b=\u0010;J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J2\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J,\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\"\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J$\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J,\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0007J\u001a\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010/\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J&\u00100\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J,\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J4\u00104\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u00105R\u001a\u0010<\u001a\u0002078@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109¨\u0006?"}, d2 = {"Lo0O0oo0/o0O00O0;", "", "Landroid/view/View;", "view", "", "duration", "Lo0O0oo0/o0O00O0$o00oOOo0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/graphics/Point;", TtmlNode.CENTER, "Landroid/animation/Animator;", "o00ooooO", "o00oooo0", "o0", "o00ooooo", "o0O00000", "o00ooO", "o00ooO0O", "o00ooOO", "o00ooOO0", "o00ooOOo", "o00ooOoO", "o00ooOoo", "o00ooo00", "o00ooOo", "o00ooo0o", "o00ooo0O", "o00oooO", "o00ooo0", "o00oo0O", "o00oo0Oo", "o00oo0o0", "o00oo0O0", "o0O0o", "o00oo0oO", "o00oo", "o00oo0o", "o00oOooo", "(Landroid/view/View;)Landroid/graphics/Point;", "o00oo0OO", "(Landroid/graphics/Point;Landroid/view/View;)I", "first", "second", "", "o00oOOo0", "o00oOo0O", "o00oOooO", "o00oOoOo", "o00oOoOO", "fromHeight", "toHeight", "o0OoOoOo", "o0O000O", "I", "ANIMATION_DURATION_DEFAULT", "Landroid/view/animation/Interpolator;", "o00oo00O", "()Landroid/view/animation/Interpolator;", "getDefaultInterpolator$simplesearchview_release$annotations", "()V", "defaultInterpolator", "<init>", o0OO000o.o00oOOoO.f12961o00oOo00, "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O00O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f12758o00oOOo0 = 250;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0O00O0 f12759o00oOOoO = new o0O00O0();

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lo0O0oo0/o0O00O0$o00oOOo0;", "", "Landroid/view/View;", "view", "", "o00oOo00", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOOo0(@NotNull View view);

        boolean o00oOOoO(@NotNull View view);

        boolean o00oOo00(@NotNull View view);
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lo0O0oo0/o0O00O0$o00oOOoO;", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lo0OO0o/oO0Ooooo;", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "Landroid/view/View;", "view", "o00oOo00", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "Landroid/view/View;", "Lo0O0oo0/o0O00O0$o00oOOo0;", "Lo0O0oo0/o0O00O0$o00oOOo0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/view/View;Lo0O0oo0/o0O00O0$o00oOOo0;)V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static class o00oOOoO extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final View f12760o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOo0 f12761o00oOOoO;

        public o00oOOoO(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
            o0ooO.o00oo0O0(view, "view");
            this.f12760o00oOOo0 = view;
            this.f12761o00oOOoO = o00oooo02;
        }

        public final void o00oOOo0(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
        }

        public void o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
        }

        public void o00oOo00(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            o0ooO.o00oo0O0(animator, "animation");
            o00oOOo0 o00oooo02 = this.f12761o00oOOoO;
            if (o00oooo02 == null || !o00oooo02.o00oOOo0(this.f12760o00oOOo0)) {
                o00oOOo0(this.f12760o00oOOo0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            o0ooO.o00oo0O0(animator, "animation");
            o00oOOo0 o00oooo02 = this.f12761o00oOOoO;
            if (o00oooo02 == null || !o00oooo02.o00oOOoO(this.f12760o00oOOo0)) {
                o00oOOoO(this.f12760o00oOOo0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            o0ooO.o00oo0O0(animator, "animation");
            o00oOOo0 o00oooo02 = this.f12761o00oOOoO;
            if (o00oooo02 == null || !o00oooo02.o00oOo00(this.f12760o00oOOo0)) {
                o00oOo00(this.f12760o00oOOo0);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"o0O0oo0/o0O00O0$o00oOo00", "Lo0O0oo0/o0O00O0$o00oOOoO;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f12762o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oOOo0 f12763o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(View view, o00oOOo0 o00oooo02, View view2, o00oOOo0 o00oooo03) {
            super(view2, o00oooo03);
            this.f12762o00oOo00 = view;
            this.f12763o00oOooO = o00oooo02;
        }

        @Override // o0O0oo0.o0O00O0.o00oOOoO
        public void o00oOo00(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            view.setVisibility(0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"o0O0oo0/o0O00O0$o00oOo0O", "Lo0O0oo0/o0O00O0$o00oOOoO;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo0O extends o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f12764o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oOOo0 f12765o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(View view, o00oOOo0 o00oooo02, View view2, o00oOOo0 o00oooo03) {
            super(view2, o00oooo03);
            this.f12764o00oOo00 = view;
            this.f12765o00oOooO = o00oooo02;
        }

        @Override // o0O0oo0.o0O00O0.o00oOOoO
        public void o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            view.setVisibility(8);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"o0O0oo0/o0O00O0$o00oOoO", "Lo0O0oo0/o0O00O0$o00oOOoO;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOoO extends o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f12766o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oOOo0 f12767o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(View view, o00oOOo0 o00oooo02, View view2, o00oOOo0 o00oooo03) {
            super(view2, o00oooo03);
            this.f12766o00oOo00 = view;
            this.f12767o00oOooO = o00oooo02;
        }

        @Override // o0O0oo0.o0O00O0.o00oOOoO
        public void o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            view.setVisibility(8);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/ValueAnimator;", "animation", "Lo0OO0o/oO0Ooooo;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo0 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f12768o00oOOo0;

        public o00oo0(View view) {
            this.f12768o00oOOo0 = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            o0ooO.o00oo0O0(valueAnimator, "animation");
            ViewGroup.LayoutParams layoutParams = this.f12768o00oOOo0.getLayoutParams();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f12768o00oOOo0.requestLayout();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"o0O0oo0/o0O00O0$o00oo00O", "Lo0O0oo0/o0O00O0$o00oOOoO;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo00O extends o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ View f12769o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o00oOOo0 f12770o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(View view, o00oOOo0 o00oooo02, View view2, o00oOOo0 o00oooo03) {
            super(view2, o00oooo03);
            this.f12769o00oOo00 = view;
            this.f12770o00oOooO = o00oooo02;
        }

        @Override // o0O0oo0.o0O00O0.o00oOOoO
        public void o00oOo00(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            view.setVisibility(0);
        }
    }

    @o00ooO0
    @NotNull
    public static final Animator o0(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooooO(view, 250, o00oooo02, null);
    }

    @o00ooO0
    public static final float o00oOOo0(@NotNull Point point, @NotNull Point point2) {
        o0ooO.o00oo0O0(point, "first");
        o0ooO.o00oo0O0(point2, "second");
        return (float) Math.sqrt(Math.pow(point.y - point2.y, 2.0d) + Math.pow(point.x - point2.x, 2.0d));
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOOoO(@NotNull View view) {
        return o00oOo0o(view, 0, null, 6, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOo00(@NotNull View view, int i) {
        return o00oOo0o(view, i, null, 4, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00oOo0O(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00oOooO(view, 250, o00oooo02);
    }

    public static /* synthetic */ Animator o00oOo0o(View view, int i, o00oOOo0 o00oooo02, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 250;
        }
        if ((i2 & 4) != 0) {
            o00oooo02 = null;
        }
        return o00oOooO(view, i, o00oooo02);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOoO(@NotNull View view, int i) {
        return o00oOoo0(view, i, null, 4, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOoO0(@NotNull View view) {
        return o00oOoo0(view, 0, null, 6, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOoOO(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o00ooO00.o00oo0.f8113o00oOoO0, 0.0f);
        ofFloat.addListener(new o00oOo0O(view, o00oooo02, view, o00oooo02));
        o0ooO.o00oo0OO(ofFloat, "anim");
        ofFloat.setDuration(i);
        ofFloat.setInterpolator(new o0O00o00.o00oOOoO());
        return ofFloat;
    }

    @o00ooO0
    @NotNull
    public static final Animator o00oOoOo(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00oOoOO(view, 250, o00oooo02);
    }

    public static /* synthetic */ Animator o00oOoo0(View view, int i, o00oOOo0 o00oooo02, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 250;
        }
        if ((i2 & 4) != 0) {
            o00oooo02 = null;
        }
        return o00oOoOO(view, i, o00oooo02);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oOooO(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        if (view.getAlpha() == 1.0f) {
            view.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o00ooO00.o00oo0.f8113o00oOoO0, 1.0f);
        ofFloat.addListener(new o00oOo00(view, o00oooo02, view, o00oooo02));
        o0ooO.o00oo0OO(ofFloat, "anim");
        ofFloat.setDuration(i);
        ofFloat.setInterpolator(new o0O00o00.o00oOOoO());
        return ofFloat;
    }

    @o00ooO0
    @NotNull
    public static final Point o00oOooo(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        return new Point(view.getWidth() / 2, view.getHeight() / 2);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo(@NotNull View view, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, 250, o00oooo02, point);
    }

    @o00ooO0
    public static /* synthetic */ void o00oo0() {
    }

    @NotNull
    public static final Interpolator o00oo00O() {
        return new o0O00o00.o00oOOoO();
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0O(@NotNull View view, int i) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, i, null, null);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0O0(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0O(view, 250);
    }

    @o00ooO0
    public static final int o00oo0OO(@NotNull Point point, @NotNull View view) {
        o0ooO.o00oo0O0(point, TtmlNode.CENTER);
        o0ooO.o00oo0O0(view, "view");
        ArrayList<Point> arrayList = new ArrayList();
        arrayList.add(new Point(view.getLeft(), view.getTop()));
        arrayList.add(new Point(view.getRight(), view.getTop()));
        arrayList.add(new Point(view.getLeft(), view.getBottom()));
        arrayList.add(new Point(view.getRight(), view.getBottom()));
        float f = 0.0f;
        for (Point point2 : arrayList) {
            float o00oOOo02 = o00oOOo0(point, point2);
            if (o00oOOo02 > f) {
                f = o00oOOo02;
            }
        }
        return (int) Math.ceil(f);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0Oo(@NotNull View view, int i, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, i, null, point);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0o(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        if (point == null) {
            point = o00oOooo(view);
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, point.x, point.y, o00oo0OO(point, view), 0.0f);
        createCircularReveal.addListener(new o00oOoO(view, o00oooo02, view, o00oooo02));
        o0ooO.o00oo0OO(createCircularReveal, "anim");
        createCircularReveal.setDuration(i);
        createCircularReveal.setInterpolator(new o0O00o00.o00oOOoO());
        return createCircularReveal;
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0o0(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, i, o00oooo02, null);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oo0oO(@NotNull View view, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, 250, null, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00ooO(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, i, o00oooo02, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00ooO0(@NotNull View view, int i) {
        return o00ooOo0(view, i, null, null, 12, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00ooO00(@NotNull View view) {
        return o00ooOo0(view, 0, null, null, 14, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00ooO0O(@NotNull View view, int i, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooO(view, i, null, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00ooO0o(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        return o00ooOo0(view, i, o00oooo02, null, 8, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00ooOO(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooO(view, 250, o00oooo02, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00ooOO0(@NotNull View view, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooO(view, 250, null, point);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00ooOOo(@NotNull View view, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooO(view, 250, o00oooo02, point);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooOo(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooOoO(view, 250);
    }

    public static /* synthetic */ Animator o00ooOo0(View view, int i, o00oOOo0 o00oooo02, Point point, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 250;
        }
        if ((i2 & 4) != 0) {
            o00oooo02 = null;
        }
        if ((i2 & 8) != 0) {
            point = null;
        }
        return o00ooO(view, i, o00oooo02, point);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooOoO(@NotNull View view, int i) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, i, null, null);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooOoo(@NotNull View view, int i, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, i, null, point);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooo0(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        if (point == null) {
            point = o00oOooo(view);
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, point.x, point.y, 0.0f, o00oo0OO(point, view));
        createCircularReveal.addListener(new o00oo00O(view, o00oooo02, view, o00oooo02));
        o0ooO.o00oo0OO(createCircularReveal, "anim");
        createCircularReveal.setDuration(i);
        createCircularReveal.setInterpolator(new o0O00o00.o00oOOoO());
        return createCircularReveal;
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooo00(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, i, o00oooo02, null);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooo0O(@NotNull View view, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, 250, null, point);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00ooo0o(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, 250, o00oooo02, null);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o00oooO(@NotNull View view, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, 250, o00oooo02, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oooOO(@NotNull View view) {
        return o0O0000O(view, 0, null, null, 14, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oooOo(@NotNull View view, int i) {
        return o0O0000O(view, i, null, null, 12, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00oooo(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02) {
        return o0O0000O(view, i, o00oooo02, null, 8, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00oooo0(@NotNull View view, int i, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooooO(view, i, null, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o00ooooO(@NotNull View view, int i, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooo0(view, i, o00oooo02, point);
    }

    @o00ooO0
    @NotNull
    public static final Animator o00ooooo(@NotNull View view, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooooO(view, 250, null, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o0O000(@NotNull View view, int i, int i2, int i3) {
        return o0O000Oo(view, i, i2, i3, null, 16, null);
    }

    @o00ooO0
    @NotNull
    public static final Animator o0O00000(@NotNull View view, @Nullable o00oOOo0 o00oooo02, @Nullable Point point) {
        o0ooO.o00oo0O0(view, "view");
        return o00ooooO(view, 250, o00oooo02, point);
    }

    public static /* synthetic */ Animator o0O0000O(View view, int i, o00oOOo0 o00oooo02, Point point, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 250;
        }
        if ((i2 & 4) != 0) {
            o00oooo02 = null;
        }
        if ((i2 & 8) != 0) {
            point = null;
        }
        return o00ooooO(view, i, o00oooo02, point);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o0O0000o(@NotNull View view, int i, int i2) {
        return o0OoOoOO(view, i, i2, null, 8, null);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o0O000O(@NotNull View view, int i, int i2, int i3, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new o00oo0(view));
        ofInt.addListener(new o00oOOoO(view, o00oooo02));
        o0ooO.o00oo0OO(ofInt, "anim");
        ofInt.setDuration(i3);
        ofInt.setInterpolator(new o0O00o00.o00oOOoO());
        return ofInt;
    }

    public static /* synthetic */ Animator o0O000Oo(View view, int i, int i2, int i3, o00oOOo0 o00oooo02, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            o00oooo02 = null;
        }
        return o0O000O(view, i, i2, i3, o00oooo02);
    }

    @o0OOooO0(api = 21)
    @o00ooO0
    @NotNull
    public static final Animator o0O0o(@NotNull View view, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o00oo0o(view, 250, o00oooo02, null);
    }

    public static /* synthetic */ Animator o0OoOoOO(View view, int i, int i2, o00oOOo0 o00oooo02, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            o00oooo02 = null;
        }
        return o0OoOoOo(view, i, i2, o00oooo02);
    }

    @o00oo0O0
    @o00ooO0
    @NotNull
    public static final Animator o0OoOoOo(@NotNull View view, int i, int i2, @Nullable o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(view, "view");
        return o0O000O(view, i, i2, 250, o00oooo02);
    }
}
