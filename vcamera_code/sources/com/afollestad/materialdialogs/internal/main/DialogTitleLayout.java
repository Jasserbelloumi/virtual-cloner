package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0O0oo00.o00oOOo0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J0\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lo0O0oo00/o00oOOo0;", "Lo0OO0o/oO0Ooooo;", "onFinishInflate", "", o00oOOoO.f12961o00oOo00, "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "o00oo0o", "I", "frameMarginVertical", "o00oo0oO", "titleMarginBottom", "o0O0o", "frameMarginHorizontal", "o00oo", "iconMargin", "o00ooO00", "iconSize", "Landroid/widget/ImageView;", "o00ooO0", "Landroid/widget/ImageView;", "getIconView$core", "()Landroid/widget/ImageView;", "setIconView$core", "(Landroid/widget/ImageView;)V", "iconView", "Landroid/widget/TextView;", "o00ooO0O", "Landroid/widget/TextView;", "getTitleView$core", "()Landroid/widget/TextView;", "setTitleView$core", "(Landroid/widget/TextView;)V", "titleView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class DialogTitleLayout extends o00oOOo0 {

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f5805o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f5806o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f5807o00oo0oO;
    @NotNull

    /* renamed from: o00ooO0  reason: collision with root package name */
    public ImageView f5808o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int f5809o00ooO00;
    @NotNull

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public TextView f5810o00ooO0O;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f5811o0O0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        this.f5806o00oo0o = o0oooo0.o00oOo0O(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f5807o00oo0oO = o0oooo0.o00oOo0O(this, R.dimen.md_dialog_title_layout_margin_bottom);
        this.f5811o0O0o = o0oooo0.o00oOo0O(this, R.dimen.md_dialog_frame_margin_horizontal);
        this.f5805o00oo = o0oooo0.o00oOo0O(this, R.dimen.md_icon_margin);
        this.f5809o00ooO00 = o0oooo0.o00oOo0O(this, R.dimen.md_icon_size);
    }

    public /* synthetic */ DialogTitleLayout(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public final ImageView getIconView$core() {
        ImageView imageView = this.f5808o00ooO0;
        if (imageView == null) {
            o0ooO.o00ooooO("iconView");
        }
        return imageView;
    }

    @NotNull
    public final TextView getTitleView$core() {
        TextView textView = this.f5810o00ooO0O;
        if (textView == null) {
            o0ooO.o00ooooO("titleView");
        }
        return textView;
    }

    public final boolean o00oOOoO() {
        ImageView imageView = this.f5808o00ooO0;
        if (imageView == null) {
            o0ooO.o00ooooO("iconView");
        }
        if (oo0OOoo.o00oOo0O(imageView)) {
            TextView textView = this.f5810o00ooO0O;
            if (textView == null) {
                o0ooO.o00ooooO("titleView");
            }
            if (oo0OOoo.o00oOo0O(textView)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        o0ooO.o00oo0O(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, getMeasuredHeight() - getDividerHeight(), getMeasuredWidth(), getMeasuredHeight(), o00oOOo0());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_icon_title);
        o0ooO.o00oOoO(findViewById, "findViewById(R.id.md_icon_title)");
        this.f5808o00ooO0 = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.md_text_title);
        o0ooO.o00oOoO(findViewById2, "findViewById(R.id.md_text_title)");
        this.f5810o00ooO0O = (TextView) findViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int i6;
        int i7;
        if (o00oOOoO()) {
            return;
        }
        int i8 = this.f5806o00oo0o;
        int measuredHeight = getMeasuredHeight() - this.f5807o00oo0oO;
        int i9 = measuredHeight - ((measuredHeight - i8) / 2);
        TextView textView = this.f5810o00ooO0O;
        if (textView == null) {
            o0ooO.o00ooooO("titleView");
        }
        int measuredHeight2 = textView.getMeasuredHeight() / 2;
        int i10 = i9 - measuredHeight2;
        int i11 = measuredHeight2 + i9;
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        TextView textView2 = this.f5810o00ooO0O;
        if (textView2 == null) {
            o0ooO.o00ooooO("titleView");
        }
        int o00oOOo02 = o0oooo0.o00oOOo0(textView2) + i11;
        if (oo0OOoo.o00oOo0o(this)) {
            measuredWidth = getMeasuredWidth() - this.f5811o0O0o;
            TextView textView3 = this.f5810o00ooO0O;
            if (textView3 == null) {
                o0ooO.o00ooooO("titleView");
            }
            i5 = measuredWidth - textView3.getMeasuredWidth();
        } else {
            i5 = this.f5811o0O0o;
            TextView textView4 = this.f5810o00ooO0O;
            if (textView4 == null) {
                o0ooO.o00ooooO("titleView");
            }
            measuredWidth = textView4.getMeasuredWidth() + i5;
        }
        ImageView imageView = this.f5808o00ooO0;
        if (imageView == null) {
            o0ooO.o00ooooO("iconView");
        }
        if (oo0OOoo.o00oOoO0(imageView)) {
            ImageView imageView2 = this.f5808o00ooO0;
            if (imageView2 == null) {
                o0ooO.o00ooooO("iconView");
            }
            int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
            int i12 = i9 - measuredHeight3;
            int i13 = i9 + measuredHeight3;
            if (oo0OOoo.o00oOo0o(this)) {
                ImageView imageView3 = this.f5808o00ooO0;
                if (imageView3 == null) {
                    o0ooO.o00ooooO("iconView");
                }
                i5 = measuredWidth - imageView3.getMeasuredWidth();
                i7 = i5 - this.f5805o00oo;
                TextView textView5 = this.f5810o00ooO0O;
                if (textView5 == null) {
                    o0ooO.o00ooooO("titleView");
                }
                i6 = i7 - textView5.getMeasuredWidth();
            } else {
                ImageView imageView4 = this.f5808o00ooO0;
                if (imageView4 == null) {
                    o0ooO.o00ooooO("iconView");
                }
                measuredWidth = imageView4.getMeasuredWidth() + i5;
                int i14 = this.f5805o00oo + measuredWidth;
                TextView textView6 = this.f5810o00ooO0O;
                if (textView6 == null) {
                    o0ooO.o00ooooO("titleView");
                }
                int measuredWidth2 = textView6.getMeasuredWidth() + i14;
                i6 = i14;
                i7 = measuredWidth2;
            }
            ImageView imageView5 = this.f5808o00ooO0;
            if (imageView5 == null) {
                o0ooO.o00ooooO("iconView");
            }
            imageView5.layout(i5, i12, measuredWidth, i13);
            measuredWidth = i7;
            i5 = i6;
        }
        TextView textView7 = this.f5810o00ooO0O;
        if (textView7 == null) {
            o0ooO.o00ooooO("titleView");
        }
        textView7.layout(i5, i10, measuredWidth, o00oOOo02);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (o00oOOoO()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.f5811o0O0o * 2);
        ImageView imageView = this.f5808o00ooO0;
        if (imageView == null) {
            o0ooO.o00ooooO("iconView");
        }
        if (oo0OOoo.o00oOoO0(imageView)) {
            ImageView imageView2 = this.f5808o00ooO0;
            if (imageView2 == null) {
                o0ooO.o00ooooO("iconView");
            }
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.f5809o00ooO00, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5809o00ooO00, 1073741824));
            ImageView imageView3 = this.f5808o00ooO0;
            if (imageView3 == null) {
                o0ooO.o00ooooO("iconView");
            }
            i4 -= imageView3.getMeasuredWidth() + this.f5805o00oo;
        }
        TextView textView = this.f5810o00ooO0O;
        if (textView == null) {
            o0ooO.o00ooooO("titleView");
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.f5808o00ooO0;
        if (imageView4 == null) {
            o0ooO.o00ooooO("iconView");
        }
        if (oo0OOoo.o00oOoO0(imageView4)) {
            ImageView imageView5 = this.f5808o00ooO0;
            if (imageView5 == null) {
                o0ooO.o00ooooO("iconView");
            }
            i3 = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.f5810o00ooO0O;
        if (textView2 == null) {
            o0ooO.o00ooooO("titleView");
        }
        int measuredHeight = textView2.getMeasuredHeight();
        if (i3 < measuredHeight) {
            i3 = measuredHeight;
        }
        setMeasuredDimension(size, i3 + this.f5806o00oo0o + this.f5807o00oo0oO);
    }

    public final void setIconView$core(@NotNull ImageView imageView) {
        o0ooO.o00oo0O(imageView, "<set-?>");
        this.f5808o00ooO0 = imageView;
    }

    public final void setTitleView$core(@NotNull TextView textView) {
        o0ooO.o00oo0O(textView, "<set-?>");
        this.f5810o00ooO0O = textView;
    }
}
