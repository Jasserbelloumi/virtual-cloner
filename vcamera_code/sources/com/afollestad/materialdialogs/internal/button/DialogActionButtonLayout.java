package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOO0.o0O00o00;
import o0O0oOO0.o0oO0Ooo;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0O0oo0O.o0OO0O0;
import o0OO0o.o0OOO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001?B\u001b\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014J0\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0014J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0002R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\"\u0010$\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020&0%8F¢\u0006\u0006\u001a\u0004\b6\u0010*¨\u0006@"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lo0O0oo00/o00oOOo0;", "Lo0OO0o/oO0Ooooo;", "onFinishInflate", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oo0o", "I", "buttonFramePadding", "o00oo0oO", "buttonFramePaddingNeutral", "o0O0o", "buttonFrameSpecHeight", "o00oo", "checkBoxPromptMarginVertical", "o00ooO00", "checkBoxPromptMarginHorizontal", "o00ooO0", "Z", "getStackButtons$core", "()Z", "setStackButtons$core", "(Z)V", "stackButtons", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "o00ooO0O", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "actionButtons", "Landroidx/appcompat/widget/AppCompatCheckBox;", "o00ooO0o", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "checkBoxPrompt", "getVisibleButtons", "visibleButtons", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "o00ooOOo", "o00oOOo0", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DialogActionButtonLayout extends o0O0oo00.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f5772o00ooO = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f5773o00ooOO = 2;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f5774o00ooOO0 = 1;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final o00oOOo0 f5775o00ooOOo = new o00oOOo0(null);

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f5776o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f5777o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f5778o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f5779o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int f5780o00ooO00;
    @NotNull

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public DialogActionButton[] f5781o00ooO0O;
    @NotNull

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public AppCompatCheckBox f5782o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f5783o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout$o00oOOo0;", "", "", "INDEX_NEGATIVE", "I", "INDEX_NEUTRAL", "INDEX_POSITIVE", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f5784o00oo0O;

        public o00oOOoO(o0OO0O0 o0oo0o0) {
            this.f5784o00oo0O = o0oo0o0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogActionButtonLayout.this.getDialog().o00oooOO(this.f5784o00oo0O);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        this.f5777o00oo0o = o0oooo0.o00oOo0O(this, R.dimen.md_action_button_frame_padding) - o0oooo0.o00oOo0O(this, R.dimen.md_action_button_inset_horizontal);
        this.f5778o00oo0oO = o0oooo0.o00oOo0O(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f5783o0O0o = o0oooo0.o00oOo0O(this, R.dimen.md_action_button_frame_spec_height);
        this.f5776o00oo = o0oooo0.o00oOo0O(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f5780o00ooO00 = o0oooo0.o00oOo0O(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    public /* synthetic */ DialogActionButtonLayout(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f5781o00ooO0O;
        if (dialogActionButtonArr == null) {
            o0ooO.o00ooooO("actionButtons");
        }
        return dialogActionButtonArr;
    }

    @NotNull
    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.f5782o00ooO0o;
        if (appCompatCheckBox == null) {
            o0ooO.o00ooooO("checkBoxPrompt");
        }
        return appCompatCheckBox;
    }

    public final boolean getStackButtons$core() {
        return this.f5779o00ooO0;
    }

    @NotNull
    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f5781o00ooO0O;
        if (dialogActionButtonArr == null) {
            o0ooO.o00ooooO("actionButtons");
        }
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (oo0OOoo.o00oOoO0(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new o0OOO0("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final int o00oOOoO() {
        if (getVisibleButtons().length == 0) {
            return 0;
        }
        if (this.f5779o00ooO0) {
            return this.f5783o0O0o * getVisibleButtons().length;
        }
        return this.f5783o0O0o;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        o0ooO.o00oo0O(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), getDividerHeight(), o00oOOo0());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_button_positive);
        o0ooO.o00oOoO(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(R.id.md_button_negative);
        o0ooO.o00oOoO(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(R.id.md_button_neutral);
        o0ooO.o00oOoO(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.f5781o00ooO0O = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(R.id.md_checkbox_prompt);
        o0ooO.o00oOoO(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.f5782o00ooO0o = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.f5781o00ooO0O;
        if (dialogActionButtonArr == null) {
            o0ooO.o00ooooO("actionButtons");
        }
        int length = dialogActionButtonArr.length;
        for (int i = 0; i < length; i++) {
            dialogActionButtonArr[i].setOnClickListener(new o00oOOoO(o0OO0O0.Companion.o00oOOo0(i)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        o0OOOOO0.o0ooO.o00ooooO("checkBoxPrompt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r8 = r8.getMeasuredHeight() + r6;
        r0 = r3.f5782o00ooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        o0OOOOO0.o0ooO.o00ooooO("checkBoxPrompt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0.layout(r7, r6, r4, r8);
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        DialogActionButton[] visibleButtons;
        DialogActionButton[] visibleButtons2;
        if (!o0O00o00.o00oOOo0(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        AppCompatCheckBox appCompatCheckBox = this.f5782o00ooO0o;
        if (appCompatCheckBox == null) {
            o0ooO.o00ooooO("checkBoxPrompt");
        }
        if (oo0OOoo.o00oOoO0(appCompatCheckBox)) {
            int i3 = size - (this.f5780o00ooO00 * 2);
            AppCompatCheckBox appCompatCheckBox2 = this.f5782o00ooO0o;
            if (appCompatCheckBox2 == null) {
                o0ooO.o00ooooO("checkBoxPrompt");
            }
            appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        o0ooO.o00oOoO(context, "dialog.context");
        Context context2 = getDialog().f12800o00ooOo;
        for (DialogActionButton dialogActionButton : getVisibleButtons()) {
            dialogActionButton.o00oOOo0(context, context2, this.f5779o00ooO0);
            dialogActionButton.measure(this.f5779o00ooO0 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.f5783o0O0o, 1073741824));
        }
        if ((!(getVisibleButtons().length == 0)) && !this.f5779o00ooO0) {
            int i4 = 0;
            for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                i4 += dialogActionButton2.getMeasuredWidth();
            }
            if (i4 >= size && !this.f5779o00ooO0) {
                this.f5779o00ooO0 = true;
                for (DialogActionButton dialogActionButton3 : getVisibleButtons()) {
                    dialogActionButton3.o00oOOo0(context, context2, true);
                    dialogActionButton3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5783o0O0o, 1073741824));
                }
            }
        }
        int o00oOOoO2 = o00oOOoO();
        AppCompatCheckBox appCompatCheckBox3 = this.f5782o00ooO0o;
        if (appCompatCheckBox3 == null) {
            o0ooO.o00ooooO("checkBoxPrompt");
        }
        if (oo0OOoo.o00oOoO0(appCompatCheckBox3)) {
            AppCompatCheckBox appCompatCheckBox4 = this.f5782o00ooO0o;
            if (appCompatCheckBox4 == null) {
                o0ooO.o00ooooO("checkBoxPrompt");
            }
            o00oOOoO2 = o0oO0Ooo.o00oOOo0(this.f5776o00oo, 2, appCompatCheckBox4.getMeasuredHeight(), o00oOOoO2);
        }
        setMeasuredDimension(size, o00oOOoO2);
    }

    public final void setActionButtons(@NotNull DialogActionButton[] dialogActionButtonArr) {
        o0ooO.o00oo0O(dialogActionButtonArr, "<set-?>");
        this.f5781o00ooO0O = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(@NotNull AppCompatCheckBox appCompatCheckBox) {
        o0ooO.o00oo0O(appCompatCheckBox, "<set-?>");
        this.f5782o00ooO0o = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z) {
        this.f5779o00ooO0 = z;
    }
}
