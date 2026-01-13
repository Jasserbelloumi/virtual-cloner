package o0O000oo;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0O000oo.o0OoOoOo;
import o0OOOO.o00oOOo0;
import o0OOOoO0.oO0OoOO0;
import o0OOOoO0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0087\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0086\b\u001a(\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\bø\u0001\u0000\u001a\"\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a)\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0086\bø\u0001\u0000\u001a<\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u00102\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\"*\u00105\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00107\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "view", "Lo0OO0o/oO0Ooooo;", "action", "o00oOo0O", "o00oOooO", "Lo0O000oo/o0O0OOO0;", "o00oOo0o", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "", TtmlNode.START, "top", TtmlNode.END, "bottom", "o00ooOOo", TtmlNode.LEFT, TtmlNode.RIGHT, "o00ooOO0", "size", "o00ooO0", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "o00oo0o", "o00oo0oO", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "o00oOoO0", "Landroid/view/ViewGroup$LayoutParams;", "Lo0OO0o/o0O000Oo;", "block", "o00ooO0o", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "o00ooO", "(Landroid/view/View;Lo0OOOO/o00oo;)V", "", "value", "o00oo0o0", "(Landroid/view/View;)Z", "o00ooO0O", "(Landroid/view/View;Z)V", "isVisible", "o00oo0Oo", "o00ooO00", "isInvisible", "o00oo0O", "o00oo", "isGone", "o00oo00O", "(Landroid/view/View;)I", "marginLeft", "o00oo0O0", "marginTop", "o00oo0", "marginRight", "o00oOoo0", "marginBottom", "o00oo0OO", "marginStart", "o00oOooo", "marginEnd", "Lo0OOOoO0/oO000;", "Landroid/view/ViewParent;", "o00oOoOo", "(Landroid/view/View;)Lo0OOOoO0/oO000;", "ancestors", "o00oOoOO", "allViews", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OOooO0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo0OOOoO0/oO000O0O;", "Landroid/view/View;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, 416}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0O0o implements o0OOOO.o0O00000<o0OOOoO0.oO000O0O<? super View>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ View $this_allViews;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(View view, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_allViews = view;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$this_allViews, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOOoO0.oO000O0O<? super View> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOOoO0.oO000O0O oo000o0o;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                oo000o0o = (o0OOOoO0.oO000O0O) this.L$0;
                View view = this.$this_allViews;
                this.L$0 = oo000o0o;
                this.label = 1;
                if (oo000o0o.o00oOOoO(view, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                if (i == 2) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    return o0OO0o.oO0Ooooo.f13240o00oOOo0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo000o0o = (o0OOOoO0.oO000O0O) this.L$0;
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                o0OOOoO0.oO000<View> o00oOo0o2 = o0OO0.o00oOo0o((ViewGroup) view2);
                this.L$0 = null;
                this.label = 2;
                if (oo000o0o.o00oOo0O(o00oOo0o2, this) == o00oooo02) {
                    return o00oooo02;
                }
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class o00oOOoO extends o0OOOOO0.o0oO0O0o implements o0OOOO.o00oo<ViewParent, ViewParent> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // o0OOOO.o00oo
        public final ViewParent invoke(@NotNull ViewParent viewParent) {
            o0OOOOO0.o0ooO.o00oo0O0(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"o0O000oo/o0OOooO0$o00oOo00", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<View, o0OO0o.oO0Ooooo> f10798o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f10799o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(View view, o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
            this.f10799o00oo0O0 = view;
            this.f10798o00oo0O = o00ooVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            this.f10799o00oo0O0.removeOnAttachStateChangeListener(this);
            this.f10798o00oo0O.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"o0O000oo/o0OOooO0$o00oOo0O", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo0O implements View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<View, o0OO0o.oO0Ooooo> f10800o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f10801o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(View view, o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
            this.f10801o00oo0O0 = view;
            this.f10800o00oo0O = o00ooVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            this.f10801o00oo0O0.removeOnAttachStateChangeListener(this);
            this.f10800o00oo0O.invoke(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"o0O000oo/o0OOooO0$o00oo00O", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lo0OO0o/oO0Ooooo;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOoO implements View.OnLayoutChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo f10802o00oo0O0;

        public o00oOoO(o0OOOO.o00oo o00ooVar) {
            this.f10802o00oo0O0 = o00ooVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f10802o00oo0O0.invoke(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f10803o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<View, o0OO0o.oO0Ooooo> f10804o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0(o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar, View view) {
            this.f10804o00oo0O0 = o00ooVar;
            this.f10803o00oo0O = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10804o00oo0O0.invoke(this.f10803o00oo0O);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"o0O000oo/o0OOooO0$o00oo00O", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lo0OO0o/oO0Ooooo;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo00O implements View.OnLayoutChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<View, o0OO0o.oO0Ooooo> f10805o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oo00O(o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
            this.f10805o00oo0O0 = o00ooVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o0OOOOO0.o0ooO.o00oo0O0(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f10805o00oo0O0.invoke(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo0OO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<o0OO0o.oO0Ooooo> f10806o00oo0O0;

        public o00oo0OO(o0OOOO.o00oOOo0<o0OO0o.oO0Ooooo> o00oooo02) {
            this.f10806o00oo0O0 = o00oooo02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10806o00oo0O0.invoke();
        }
    }

    public static final void o00oOOoO(@NotNull View view, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        if (o0O0o00O.o0O0OOoo(view)) {
            o00ooVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new o00oOo00(view, o00ooVar));
        }
    }

    public static final void o00oOo00(@NotNull View view, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        if (o0O0o00O.o0O0OOoo(view)) {
            view.addOnAttachStateChangeListener(new o00oOo0O(view, o00ooVar));
        } else {
            o00ooVar.invoke(view);
        }
    }

    public static final void o00oOo0O(@NotNull View view, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        view.addOnLayoutChangeListener(new o00oo00O(o00ooVar));
    }

    @NotNull
    public static final o0O0OOO0 o00oOo0o(@NotNull View view, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        o0O0OOO0 o00oOOo02 = o0O0OOO0.o00oOOo0(view, new o00oo0(o00ooVar, view));
        o0OOOOO0.o0ooO.o00oo0OO(o00oOOo02, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return o00oOOo02;
    }

    public static /* synthetic */ Bitmap o00oOoO(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return o00oOoO0(view, config);
    }

    @NotNull
    public static final Bitmap o00oOoO0(@NotNull View view, @NotNull Bitmap.Config config) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(config, "config");
        if (o0O0o00O.o0O0Oooo(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            o0OOOOO0.o0ooO.o00oo0OO(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    @NotNull
    public static final o0OOOoO0.oO000<View> o00oOoOO(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return oO0o0o.o00oOOoO(new o00oOOo0(view, null));
    }

    @NotNull
    public static final o0OOOoO0.oO000<ViewParent> o00oOoOo(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return oO0OoOO0.o00oOooo(view.getParent(), o00oOOoO.INSTANCE);
    }

    public static final int o00oOoo0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final void o00oOooO(@NotNull View view, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        if (!o0O0o00O.o0O0Oooo(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new o00oOoO(o00ooVar));
        } else {
            o00ooVar.invoke(view);
        }
    }

    public static final int o00oOooo(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return o0OoOoOo.o00oOOo0.o00oOOoO((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final void o00oo(@NotNull View view, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final int o00oo0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o00oo00O(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final boolean o00oo0O(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final int o00oo0O0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int o00oo0OO(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return o0OoOoOo.o00oOOo0.o00oOo00((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final boolean o00oo0Oo(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return view.getVisibility() == 4;
    }

    @NotNull
    public static final Runnable o00oo0o(@NotNull View view, long j, @NotNull o0OOOO.o00oOOo0<o0OO0o.oO0Ooooo> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "action");
        o00oo0OO o00oo0oo = new o00oo0OO(o00oooo02);
        view.postDelayed(o00oo0oo, j);
        return o00oo0oo;
    }

    public static final boolean o00oo0o0(@NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        return view.getVisibility() == 0;
    }

    @o00oOooO.o0OOooO0(16)
    @NotNull
    public static final Runnable o00oo0oO(@NotNull View view, long j, @NotNull final o0OOOO.o00oOOo0<o0OO0o.oO0Ooooo> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "action");
        Runnable runnable = new Runnable() { // from class: o0O000oo.o0OO0O0
            @Override // java.lang.Runnable
            public final void run() {
                o0OOooO0.o0O0o(o00oOOo0.this);
            }
        };
        o0O000oo.o00oOo0O.o00oOOo0(view, runnable, j);
        return runnable;
    }

    @o0OOOO0o.o00oo0OO(name = "updateLayoutParamsTyped")
    public static final <T extends ViewGroup.LayoutParams> void o00ooO(View view, o0OOOO.o00oo<? super T, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o0OOOOO0.o0ooO.o00oooOo();
        o00ooVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void o00ooO0(@NotNull View view, @o00oOooO.o0OO0 int i) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final void o00ooO00(@NotNull View view, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void o00ooO0O(@NotNull View view, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void o00ooO0o(@NotNull View view, @NotNull o0OOOO.o00oo<? super ViewGroup.LayoutParams, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        o00ooVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void o00ooOO(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static final void o00ooOO0(@NotNull View view, @o00oOooO.o0OO0 int i, @o00oOooO.o0OO0 int i2, @o00oOooO.o0OO0 int i3, @o00oOooO.o0OO0 int i4) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @o00oOooO.o0OOooO0(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void o00ooOOo(@NotNull View view, @o00oOooO.o0OO0 int i, @o00oOooO.o0OO0 int i2, @o00oOooO.o0OO0 int i3, @o00oOooO.o0OO0 int i4) {
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void o00ooOo0(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        o0OOOOO0.o0ooO.o00oo0O0(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final void o0O0o(o0OOOO.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "$action");
        o00oooo02.invoke();
    }
}
