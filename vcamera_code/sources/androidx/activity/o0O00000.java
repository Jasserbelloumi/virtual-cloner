package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.o0O00000;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOOOO0.o0O0OO;
import o0OOo00O.oO0000Oo;
import o0OOo0O0.o0O0O0Oo;
import o0OOo0O0.o0ooO;
import o0OOo0OO.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroid/app/Activity;Landroid/view/View;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O00000 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Rect;", "hint", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Landroid/graphics/Rect;Lo0OO/o00oOo0O;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> implements o0OO0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f66o00oo0O0;

        public o00oOOo0(Activity activity) {
            this.f66o00oo0O0 = activity;
        }

        @Override // o0OOo0OO.o0OO0
        @Nullable
        /* renamed from: o00oOOo0 */
        public final Object emit(@NotNull Rect rect, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            o00oOo00.f53o00oOOo0.o00oOOo0(this.f66o00oo0O0, rect);
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo0OOo0O0/o0ooO;", "Landroid/graphics/Rect;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0ooO<? super Rect>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ View $view;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
            public final /* synthetic */ View$OnAttachStateChangeListenerC0002o00oOOoO $attachStateChangeListener;
            public final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
            public final /* synthetic */ View $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, View$OnAttachStateChangeListenerC0002o00oOOoO view$OnAttachStateChangeListenerC0002o00oOOoO) {
                super(0);
                this.$view = view;
                this.$scrollChangeListener = onScrollChangedListener;
                this.$layoutChangeListener = onLayoutChangeListener;
                this.$attachStateChangeListener = view$OnAttachStateChangeListenerC0002o00oOOoO;
            }

            @Override // o0OOOO.o00oOOo0
            public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
                invoke2();
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
                this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
                this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/activity/o0O00000$o00oOOoO$o00oOOoO", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lo0OO0o/oO0Ooooo;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "activity-ktx_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: androidx.activity.o0O00000$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC0002o00oOOoO implements View.OnAttachStateChangeListener {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ View f67o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0ooO<Rect> f68o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f69o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ View.OnLayoutChangeListener f70o00oo0o0;

            /* JADX WARN: Multi-variable type inference failed */
            public View$OnAttachStateChangeListenerC0002o00oOOoO(o0ooO<? super Rect> o0ooo, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f68o00oo0O0 = o0ooo;
                this.f67o00oo0O = view;
                this.f69o00oo0Oo = onScrollChangedListener;
                this.f70o00oo0o0 = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                o0OOOOO0.o0ooO.o00oo0O0(view, "v");
                this.f68o00oo0O0.o00oo0o0(o0O00000.o00oOo00(this.f67o00oo0O));
                this.f67o00oo0O.getViewTreeObserver().addOnScrollChangedListener(this.f69o00oo0Oo);
                this.f67o00oo0O.addOnLayoutChangeListener(this.f70o00oo0o0);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
                o0OOOOO0.o0ooO.o00oo0O0(view, "v");
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f69o00oo0Oo);
                view.removeOnLayoutChangeListener(this.f70o00oo0o0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(View view, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$view = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
        public static final void m1invokeSuspend$lambda0(o0ooO o0ooo, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            o0OOOOO0.o0ooO.o00oo0OO(view, "v");
            o0ooo.o00oo0o0(o0O00000.o00oOo00(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1  reason: not valid java name */
        public static final void m2invokeSuspend$lambda1(o0ooO o0ooo, View view) {
            o0ooo.o00oo0o0(o0O00000.o00oOo00(view));
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$view, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0ooO<? super Rect> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                final o0ooO o0ooo = (o0ooO) this.L$0;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.o0O0000O
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        o0O00000.o00oOOoO.m1invokeSuspend$lambda0(o0ooO.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
                    }
                };
                final View view = this.$view;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.o0O000
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        o0O00000.o00oOOoO.m2invokeSuspend$lambda1(o0ooO.this, view);
                    }
                };
                View$OnAttachStateChangeListenerC0002o00oOOoO view$OnAttachStateChangeListenerC0002o00oOOoO = new View$OnAttachStateChangeListenerC0002o00oOOoO(o0ooo, this.$view, onScrollChangedListener, onLayoutChangeListener);
                if (androidx.activity.o00oOOoO.f52o00oOOo0.o00oOOo0(this.$view)) {
                    o0ooo.o00oo0o0(o0O00000.o00oOo00(this.$view));
                    this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.$view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC0002o00oOOoO);
                o00oOOo0 o00oooo03 = new o00oOOo0(this.$view, onScrollChangedListener, onLayoutChangeListener, view$OnAttachStateChangeListenerC0002o00oOOoO);
                this.label = 1;
                if (o0O0O0Oo.o00oOOo0(o0ooo, o00oooo03, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OOooO0(26)
    @oO0000Oo
    @Nullable
    public static final Object o00oOOoO(@NotNull Activity activity, @NotNull View view, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOOo02 = o0OOo0OO.o0OOooO0.o00oOoo0(new o00oOOoO(view, null)).o00oOOo0(new o00oOOo0(activity), o00ooo0o2);
        return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : oO0Ooooo.f13240o00oOOo0;
    }

    public static final Rect o00oOo00(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
