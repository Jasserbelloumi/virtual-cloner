package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0.o00oOOo0;
import o00oOooO.o0O00O;
import o00ooO00.o00oo0;
import o0O000oo.o0O00000;
import o0O0oOO0.o0O00o00;
import o0O0oOo.o0O0OOO0;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0O0oo0O.o0OO00OO;
import o0O0oo0O.oo0ooO;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OOO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0014\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010z\u001a\u00020y\u0012\b\u0010|\u001a\u0004\u0018\u00010{¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J@\u0010\u000e\u001a\u00020\r*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J>\u0010\u000f\u001a\u00020\r*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\r*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002J*\u0010\u0014\u001a\u00020\r*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0014J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\rH\u0014J\u0018\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0014J0\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0010\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\bH\u0014J\u0010\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\bH\u0014R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00107\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010?\u001a\u0002082\u0006\u00100\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bD\u0010,R\u001a\u0010H\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010,R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u00102R\u0016\u0010p\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010*R\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006\u007f"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "Landroid/widget/FrameLayout;", "", TtmlNode.ATTR_TTS_COLOR, "", o00oo0.f8113o00oOoO0, "Landroid/graphics/Paint;", "o00oOoOo", "Landroid/graphics/Canvas;", TtmlNode.LEFT, TtmlNode.RIGHT, "top", "bottom", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "o00oOoO", TtmlNode.START, "width", "o00oOooo", "height", "o00oOo0O", "onFinishInflate", "Lo0O0oo0O/o0OO00OO;", "dialog", o00oOOoO.f12961o00oOo00, "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "buttonsLayout", "o00oOOo0", "", "showTop", "showBottom", "o00oOoO0", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "onLayout", "canvas", "onDraw", "dispatchDraw", "o00oo0O0", "I", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxHeight", "value", "o00oo0O", "Z", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "", "o00oo0Oo", "[F", "getCornerRadii", "()[F", "setCornerRadii", "([F)V", "cornerRadii", "o00oo0o0", "Landroid/graphics/Paint;", "debugPaint", "o00oo0o", "getFrameMarginVertical$core", "frameMarginVertical", "o00oo0oO", "getFrameMarginVerticalLess$core", "frameMarginVerticalLess", "o0O0o", "Lo0O0oo0O/o0OO00OO;", "getDialog", "()Lo0O0oo0O/o0OO00OO;", "setDialog", "(Lo0O0oo0O/o0OO00OO;)V", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "o00oo", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "getTitleLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "setTitleLayout", "(Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;)V", "titleLayout", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "o00ooO00", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "getContentLayout", "()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "setContentLayout", "(Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;)V", "contentLayout", "o00ooO0", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "getButtonsLayout", "()Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "setButtonsLayout", "(Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;)V", "Lo0O0oo0O/oo0ooO;", "o00ooO0O", "Lo0O0oo0O/oo0ooO;", "getLayoutMode", "()Lo0O0oo0O/oo0ooO;", "setLayoutMode", "(Lo0O0oo0O/oo0ooO;)V", "layoutMode", "o00ooO0o", "isButtonsLayoutAChild", "o00ooO", "windowHeight", "Landroid/graphics/Path;", "o00ooOO0", "Landroid/graphics/Path;", "cornerRadiusPath", "Landroid/graphics/RectF;", "o00ooOO", "Landroid/graphics/RectF;", "cornerRadiusRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogLayout extends FrameLayout {
    @NotNull

    /* renamed from: o00oo  reason: collision with root package name */
    public DialogTitleLayout f5789o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f5790o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f5791o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float[] f5792o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f5793o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Paint f5794o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f5795o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f5796o00ooO;
    @Nullable

    /* renamed from: o00ooO0  reason: collision with root package name */
    public DialogActionButtonLayout f5797o00ooO0;
    @NotNull

    /* renamed from: o00ooO00  reason: collision with root package name */
    public DialogContentLayout f5798o00ooO00;
    @NotNull

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public oo0ooO f5799o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f5800o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final RectF f5801o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final Path f5802o00ooOO0;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public o0OO00OO f5803o0O0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        this.f5792o00oo0Oo = new float[0];
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        this.f5793o00oo0o = o0oooo0.o00oOo0O(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f5795o00oo0oO = o0oooo0.o00oOo0O(this, R.dimen.md_dialog_frame_margin_vertical_less);
        this.f5799o00ooO0O = oo0ooO.WRAP_CONTENT;
        this.f5800o00ooO0o = true;
        this.f5796o00ooO = -1;
        this.f5802o00ooOO0 = new Path();
        this.f5801o00ooOO = new RectF();
    }

    public static /* synthetic */ void o00oOo0o(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = dialogLayout.getMeasuredHeight();
        }
        if ((i2 & 4) != 0) {
            f2 = f;
        }
        dialogLayout.o00oOo0O(canvas, i, f, f2);
    }

    public static /* synthetic */ void o00oOoOO(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
        float f5 = (i2 & 2) != 0 ? 0.0f : f;
        float f6 = (i2 & 4) != 0 ? f5 : f2;
        float f7 = (i2 & 8) != 0 ? 0.0f : f3;
        dialogLayout.o00oOoO(canvas, i, f5, f6, f7, (i2 & 16) != 0 ? f7 : f4);
    }

    public static /* synthetic */ Paint o00oOoo0(DialogLayout dialogLayout, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        return dialogLayout.o00oOoOo(i, f);
    }

    public static /* synthetic */ void o00oo00O(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = f;
        }
        dialogLayout.o00oOooo(canvas, i, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        o0ooO.o00oo0O(canvas, "canvas");
        if (!(this.f5792o00oo0Oo.length == 0)) {
            canvas.clipPath(this.f5802o00ooOO0);
        }
        super.dispatchDraw(canvas);
    }

    @Nullable
    public final DialogActionButtonLayout getButtonsLayout() {
        return this.f5797o00ooO0;
    }

    @NotNull
    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.f5798o00ooO00;
        if (dialogContentLayout == null) {
            o0ooO.o00ooooO("contentLayout");
        }
        return dialogContentLayout;
    }

    @NotNull
    public final float[] getCornerRadii() {
        return this.f5792o00oo0Oo;
    }

    public final boolean getDebugMode() {
        return this.f5790o00oo0O;
    }

    @NotNull
    public final o0OO00OO getDialog() {
        o0OO00OO o0oo00oo = this.f5803o0O0o;
        if (o0oo00oo == null) {
            o0ooO.o00ooooO("dialog");
        }
        return o0oo00oo;
    }

    public final int getFrameMarginVertical$core() {
        return this.f5793o00oo0o;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.f5795o00oo0oO;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final oo0ooO getLayoutMode() {
        return this.f5799o00ooO0O;
    }

    public final int getMaxHeight() {
        return this.f5791o00oo0O0;
    }

    @NotNull
    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.f5789o00oo;
        if (dialogTitleLayout == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        return dialogTitleLayout;
    }

    public final void o00oOOo0(@NotNull DialogActionButtonLayout dialogActionButtonLayout) {
        o0ooO.o00oo0O(dialogActionButtonLayout, "buttonsLayout");
        this.f5797o00ooO0 = dialogActionButtonLayout;
        this.f5800o00ooO0o = false;
    }

    public final void o00oOOoO(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        DialogTitleLayout dialogTitleLayout = this.f5789o00oo;
        if (dialogTitleLayout == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        dialogTitleLayout.setDialog(o0oo00oo);
        DialogActionButtonLayout dialogActionButtonLayout = this.f5797o00ooO0;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDialog(o0oo00oo);
        }
    }

    public final void o00oOo00(@NotNull Canvas canvas, @o0O00O int i, float f, float f2, float f3, float f4, float f5) {
        canvas.drawRect(f2, f4, f3, f5, o00oOoOo(i, f));
    }

    public final void o00oOo0O(@NotNull Canvas canvas, @o0O00O int i, float f, float f2) {
        o00oOoO(canvas, i, 0.0f, getMeasuredWidth(), f, f2);
    }

    public final void o00oOoO(@NotNull Canvas canvas, @o0O00O int i, float f, float f2, float f3, float f4) {
        canvas.drawLine(f, f3, f2, f4, o00oOoo0(this, i, 0.0f, 2, null));
    }

    public final void o00oOoO0(boolean z, boolean z2) {
        DialogTitleLayout dialogTitleLayout = this.f5789o00oo;
        if (dialogTitleLayout == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        dialogTitleLayout.setDrawDivider(z);
        DialogActionButtonLayout dialogActionButtonLayout = this.f5797o00ooO0;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDrawDivider(z2);
        }
    }

    public final Paint o00oOoOo(int i, float f) {
        if (this.f5794o00oo0o0 == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(o0O0OOO0.o00oOo00(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f5794o00oo0o0 = paint;
        }
        Paint paint2 = this.f5794o00oo0o0;
        if (paint2 == null) {
            o0ooO.o00ooo0O();
        }
        paint2.setColor(i);
        setAlpha(f);
        return paint2;
    }

    public final void o00oOooo(@NotNull Canvas canvas, @o0O00O int i, float f, float f2) {
        o00oOoO(canvas, i, f, f2, 0.0f, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new o0OOO0("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.f5796o00ooO = o0OooO0.f12732o00oOOo0.o00oOoO0((WindowManager) systemService).component2().intValue();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        DialogActionButton[] visibleButtons;
        DialogActionButtonLayout dialogActionButtonLayout;
        float f;
        int i;
        Object obj;
        Canvas canvas2;
        int i2;
        float o00oOo002;
        DialogLayout dialogLayout;
        DialogActionButtonLayout dialogActionButtonLayout2;
        DialogActionButtonLayout dialogActionButtonLayout3;
        DialogActionButtonLayout dialogActionButtonLayout4;
        DialogActionButton[] visibleButtons2;
        DialogActionButtonLayout dialogActionButtonLayout5;
        DialogActionButtonLayout dialogActionButtonLayout6;
        DialogContentLayout dialogContentLayout;
        DialogTitleLayout dialogTitleLayout;
        o0ooO.o00oo0O(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f5790o00oo0O) {
            o00oo00O(this, canvas, -16776961, o0O0OOO0.o00oOo00(this, 24), 0.0f, 4, null);
            o00oOo0o(this, canvas, -16776961, o0O0OOO0.o00oOo00(this, 24), 0.0f, 4, null);
            o00oo00O(this, canvas, -16776961, getMeasuredWidth() - o0O0OOO0.o00oOo00(this, 24), 0.0f, 4, null);
            DialogTitleLayout dialogTitleLayout2 = this.f5789o00oo;
            if (dialogTitleLayout2 == null) {
                o0ooO.o00ooooO("titleLayout");
            }
            if (oo0OOoo.o00oOoO0(dialogTitleLayout2)) {
                if (this.f5789o00oo == null) {
                    o0ooO.o00ooooO("titleLayout");
                }
                o00oOo0o(this, canvas, o00oOOo0.f6865o00oOo00, dialogTitleLayout.getBottom(), 0.0f, 4, null);
            }
            DialogContentLayout dialogContentLayout2 = this.f5798o00ooO00;
            if (dialogContentLayout2 == null) {
                o0ooO.o00ooooO("contentLayout");
            }
            if (oo0OOoo.o00oOoO0(dialogContentLayout2)) {
                if (this.f5798o00ooO00 == null) {
                    o0ooO.o00ooooO("contentLayout");
                }
                o00oOo0o(this, canvas, o0O00000.f10519o00oo0oO, dialogContentLayout.getTop(), 0.0f, 4, null);
            }
            if (o0O00o00.o00oOOo0(this.f5797o00ooO0)) {
                o00oo00O(this, canvas, o0OO0o0O.o00oOOoO.f13247o00ooO00, oo0OOoo.o00oOo0o(this) ? o0O0OOO0.o00oOo00(this, 8) : getMeasuredWidth() - o0O0OOO0.o00oOo00(this, 8), 0.0f, 4, null);
                DialogActionButtonLayout dialogActionButtonLayout7 = this.f5797o00ooO0;
                if (dialogActionButtonLayout7 == null || !dialogActionButtonLayout7.getStackButtons$core()) {
                    DialogActionButtonLayout dialogActionButtonLayout8 = this.f5797o00ooO0;
                    if (dialogActionButtonLayout8 == null) {
                        return;
                    }
                    if (dialogActionButtonLayout8 == null) {
                        o0ooO.o00ooo0O();
                    }
                    for (DialogActionButton dialogActionButton : dialogActionButtonLayout8.getVisibleButtons()) {
                        if (this.f5797o00ooO0 == null) {
                            o0ooO.o00ooo0O();
                        }
                        float o00oOo003 = o0O0OOO0.o00oOo00(this, 8) + dialogActionButtonLayout2.getTop() + dialogActionButton.getTop();
                        if (this.f5797o00ooO0 == null) {
                            o0ooO.o00ooo0O();
                        }
                        o00oOo00(canvas, o0OO0o0O.o00oOOoO.f13247o00ooO00, 0.4f, o0O0OOO0.o00oOo00(this, 4) + dialogActionButton.getLeft(), dialogActionButton.getRight() - o0O0OOO0.o00oOo00(this, 4), o00oOo003, dialogActionButtonLayout3.getBottom() - o0O0OOO0.o00oOo00(this, 8));
                    }
                    if (this.f5797o00ooO0 == null) {
                        o0ooO.o00ooo0O();
                    }
                    f = 0.0f;
                    i = 4;
                    obj = null;
                    o00oOo0o(this, canvas, -65281, dialogActionButtonLayout.getTop(), 0.0f, 4, null);
                    float measuredHeight = getMeasuredHeight() - (o0O0OOO0.o00oOo00(this, 52) - o0O0OOO0.o00oOo00(this, 8));
                    float measuredHeight2 = getMeasuredHeight() - o0O0OOO0.o00oOo00(this, 8);
                    canvas2 = canvas;
                    o00oOo0o(this, canvas2, o00oOOo0.f6865o00oOo00, measuredHeight, 0.0f, 4, null);
                    o00oOo0o(this, canvas2, o00oOOo0.f6865o00oOo00, measuredHeight2, 0.0f, 4, null);
                    i2 = -16776961;
                    o00oOo002 = measuredHeight - o0O0OOO0.o00oOo00(this, 8);
                    dialogLayout = this;
                } else {
                    if (this.f5797o00ooO0 == null) {
                        o0ooO.o00ooo0O();
                    }
                    float o00oOo004 = o0O0OOO0.o00oOo00(this, 8) + dialogActionButtonLayout4.getTop();
                    DialogActionButtonLayout dialogActionButtonLayout9 = this.f5797o00ooO0;
                    if (dialogActionButtonLayout9 == null) {
                        o0ooO.o00ooo0O();
                    }
                    float f2 = o00oOo004;
                    for (DialogActionButton dialogActionButton2 : dialogActionButtonLayout9.getVisibleButtons()) {
                        float o00oOo005 = o0O0OOO0.o00oOo00(this, 36) + f2;
                        o00oOo00(canvas, o0OO0o0O.o00oOOoO.f13247o00ooO00, 0.4f, dialogActionButton2.getLeft(), getMeasuredWidth() - o0O0OOO0.o00oOo00(this, 8), f2, o00oOo005);
                        f2 = o0O0OOO0.o00oOo00(this, 16) + o00oOo005;
                    }
                    if (this.f5797o00ooO0 == null) {
                        o0ooO.o00ooo0O();
                    }
                    o00oOo0o(this, canvas, -16776961, dialogActionButtonLayout5.getTop(), 0.0f, 4, null);
                    if (this.f5797o00ooO0 == null) {
                        o0ooO.o00ooo0O();
                    }
                    float o00oOo006 = o0O0OOO0.o00oOo00(this, 8) + dialogActionButtonLayout6.getTop();
                    float measuredHeight3 = getMeasuredHeight() - o0O0OOO0.o00oOo00(this, 8);
                    i2 = o00oOOo0.f6865o00oOo00;
                    f = 0.0f;
                    i = 4;
                    obj = null;
                    dialogLayout = this;
                    canvas2 = canvas;
                    o00oOo0o(dialogLayout, canvas2, o00oOOo0.f6865o00oOo00, o00oOo006, 0.0f, 4, null);
                    o00oOo002 = measuredHeight3;
                }
                o00oOo0o(dialogLayout, canvas2, i2, o00oOo002, f, i, obj);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_title_layout);
        o0ooO.o00oOoO(findViewById, "findViewById(R.id.md_title_layout)");
        this.f5789o00oo = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(R.id.md_content_layout);
        o0ooO.o00oOoO(findViewById2, "findViewById(R.id.md_content_layout)");
        this.f5798o00ooO00 = (DialogContentLayout) findViewById2;
        this.f5797o00ooO0 = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.f5789o00oo;
        if (dialogTitleLayout == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        int measuredHeight2 = dialogTitleLayout.getMeasuredHeight();
        DialogTitleLayout dialogTitleLayout2 = this.f5789o00oo;
        if (dialogTitleLayout2 == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight2);
        if (this.f5800o00ooO0o) {
            int measuredHeight3 = getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout = this.f5797o00ooO0;
            measuredHeight = measuredHeight3 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
            if (o0O00o00.o00oOOo0(this.f5797o00ooO0)) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f5797o00ooO0;
                if (dialogActionButtonLayout2 == null) {
                    o0ooO.o00ooo0O();
                }
                dialogActionButtonLayout2.layout(0, measuredHeight, measuredWidth2, measuredHeight4);
            }
        } else {
            measuredHeight = getMeasuredHeight();
        }
        int measuredWidth3 = getMeasuredWidth();
        DialogContentLayout dialogContentLayout = this.f5798o00ooO00;
        if (dialogContentLayout == null) {
            o0ooO.o00ooooO("contentLayout");
        }
        dialogContentLayout.layout(0, measuredHeight2, measuredWidth3, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f5791o00oo0O0;
        if (1 <= i3 && size2 > i3) {
            size2 = i3;
        }
        DialogTitleLayout dialogTitleLayout = this.f5789o00oo;
        if (dialogTitleLayout == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (o0O00o00.o00oOOo0(this.f5797o00ooO0)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.f5797o00ooO0;
            if (dialogActionButtonLayout == null) {
                o0ooO.o00ooo0O();
            }
            dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        DialogTitleLayout dialogTitleLayout2 = this.f5789o00oo;
        if (dialogTitleLayout2 == null) {
            o0ooO.o00ooooO("titleLayout");
        }
        int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
        DialogActionButtonLayout dialogActionButtonLayout2 = this.f5797o00ooO0;
        int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
        DialogContentLayout dialogContentLayout = this.f5798o00ooO00;
        if (dialogContentLayout == null) {
            o0ooO.o00ooooO("contentLayout");
        }
        dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
        if (this.f5799o00ooO0O == oo0ooO.WRAP_CONTENT) {
            DialogTitleLayout dialogTitleLayout3 = this.f5789o00oo;
            if (dialogTitleLayout3 == null) {
                o0ooO.o00ooooO("titleLayout");
            }
            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
            DialogContentLayout dialogContentLayout2 = this.f5798o00ooO00;
            if (dialogContentLayout2 == null) {
                o0ooO.o00ooooO("contentLayout");
            }
            int measuredHeight4 = dialogContentLayout2.getMeasuredHeight() + measuredHeight3;
            DialogActionButtonLayout dialogActionButtonLayout3 = this.f5797o00ooO0;
            setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
        } else {
            setMeasuredDimension(size, this.f5796o00ooO);
        }
        if (!(this.f5792o00oo0Oo.length == 0)) {
            RectF rectF = this.f5801o00ooOO;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = getMeasuredWidth();
            rectF.bottom = getMeasuredHeight();
            this.f5802o00ooOO0.addRoundRect(this.f5801o00ooOO, this.f5792o00oo0Oo, Path.Direction.CW);
        }
    }

    public final void setButtonsLayout(@Nullable DialogActionButtonLayout dialogActionButtonLayout) {
        this.f5797o00ooO0 = dialogActionButtonLayout;
    }

    public final void setContentLayout(@NotNull DialogContentLayout dialogContentLayout) {
        o0ooO.o00oo0O(dialogContentLayout, "<set-?>");
        this.f5798o00ooO00 = dialogContentLayout;
    }

    public final void setCornerRadii(@NotNull float[] fArr) {
        o0ooO.o00oo0O(fArr, "value");
        this.f5792o00oo0Oo = fArr;
        if (!this.f5802o00ooOO0.isEmpty()) {
            this.f5802o00ooOO0.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z) {
        this.f5790o00oo0O = z;
        setWillNotDraw(!z);
    }

    public final void setDialog(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "<set-?>");
        this.f5803o0O0o = o0oo00oo;
    }

    public final void setLayoutMode(@NotNull oo0ooO oo0ooo) {
        o0ooO.o00oo0O(oo0ooo, "<set-?>");
        this.f5799o00ooO0O = oo0ooo;
    }

    public final void setMaxHeight(int i) {
        this.f5791o00oo0O0 = i;
    }

    public final void setTitleLayout(@NotNull DialogTitleLayout dialogTitleLayout) {
        o0ooO.o00oo0O(dialogTitleLayout, "<set-?>");
        this.f5789o00oo = dialogTitleLayout;
    }
}
