package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import o0O00OOO.o00oOo0O;
import o0O00OOO.o00oo0;
import o0O00OOO.o00oo0OO;
import o0OO0o0O.o00oOOoO;
import o0OO0o0O.o00oo00O;
import o0OOOO0o.o00oo0O0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00066"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/WormDotsIndicator;", "Lo0OO0o0O/o00oOOoO;", "", FirebaseAnalytics.Param.INDEX, "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "o00oo0O", "o00oo", "Lo0OO0o0O/o00oo00O;", "o00oOoO", TtmlNode.ATTR_TTS_COLOR, "setDotIndicatorColor", "setStrokeDotsIndicatorColor", "o00ooOoO", "", "stroke", "Landroid/view/ViewGroup;", "o00ooOo0", "Landroid/view/View;", "dotImageView", "o00ooOo", "Landroid/widget/ImageView;", "o00ooO0O", "Landroid/widget/ImageView;", "dotIndicatorView", "o00ooO0o", "Landroid/view/View;", "dotIndicatorLayout", "o00ooO", "I", "dotsStrokeWidth", "o00ooOO0", "dotIndicatorColor", "o00ooOO", "dotsStrokeColor", "Lo0O00OOO/o00oo0;", "o00ooOOo", "Lo0O00OOO/o00oo0;", "dotIndicatorXSpring", "dotIndicatorWidthSpring", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "strokeDotsLinearLayout", "Lo0OO0o0O/o00oOOoO$o00oOo00;", "getType", "()Lo0OO0o0O/o00oOOoO$o00oOo00;", "type", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class WormDotsIndicator extends o0OO0o0O.o00oOOoO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f6614o00ooO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public ImageView f6615o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public View f6616o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f6617o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f6618o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public o00oo0 f6619o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final LinearLayout f6620o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public o00oo0 f6621o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public HashMap f6622o00ooOoO;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f6623o00oo0O;

        public o00oOOo0(int i) {
            this.f6623o00oo0O = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WormDotsIndicator.this.getDotsClickable()) {
                int i = this.f6623o00oo0O;
                o00oOOoO.InterfaceC0164o00oOOoO pager = WormDotsIndicator.this.getPager();
                if (i < (pager != null ? pager.getCount() : 0)) {
                    o00oOOoO.InterfaceC0164o00oOOoO pager2 = WormDotsIndicator.this.getPager();
                    o0ooO.o00oo00O(pager2);
                    pager2.o00oOOo0(this.f6623o00oo0O, true);
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"com/tbuonomo/viewpagerdotsindicator/WormDotsIndicator$o00oOOoO", "Lo0OO0o0O/o00oo00O;", "", "selectedPosition", "nextPosition", "", "positionOffset", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "(IIF)V", "position", "o00oOooO", "(I)V", "o00oOOo0", "()I", "pageCount", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOOoO extends o00oo00O {
        public o00oOOoO() {
        }

        @Override // o0OO0o0O.o00oo00O
        public int o00oOOo0() {
            return WormDotsIndicator.this.f13250o00oo0O0.size();
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOo00(int i, int i2, float f) {
            float dotsSize;
            ImageView imageView = WormDotsIndicator.this.f13250o00oo0O0.get(i);
            o0ooO.o00oo0OO(imageView, "dots[selectedPosition]");
            ViewParent parent = imageView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            float left = ((ViewGroup) parent).getLeft();
            ArrayList<ImageView> arrayList = WormDotsIndicator.this.f13250o00oo0O0;
            if (i2 != -1) {
                i = i2;
            }
            ImageView imageView2 = arrayList.get(i);
            o0ooO.o00oo0OO(imageView2, "dots[if (nextPosition ==…sition else nextPosition]");
            ViewParent parent2 = imageView2.getParent();
            if (parent2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            float left2 = ((ViewGroup) parent2).getLeft();
            if (f >= 0.0f && f <= 0.1f) {
                dotsSize = WormDotsIndicator.this.getDotsSize();
            } else if (f < 0.1f || f > 0.9f) {
                left = left2;
                dotsSize = WormDotsIndicator.this.getDotsSize();
            } else {
                dotsSize = (left2 - left) + WormDotsIndicator.this.getDotsSize();
            }
            o00oo0 o00oo0Var = WormDotsIndicator.this.f6619o00ooOOo;
            if (o00oo0Var != null) {
                o00oo0Var.o00ooO0O(left);
            }
            o00oo0 o00oo0Var2 = WormDotsIndicator.this.f6621o00ooOo0;
            if (o00oo0Var2 != null) {
                o00oo0Var2.o00ooO0O(dotsSize);
            }
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOooO(int i) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/tbuonomo/viewpagerdotsindicator/WormDotsIndicator$o00oOo00", "Lo0O00OOO/o00oOo0O;", "Landroid/view/View;", "object", "", "o00oOOo0", "value", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOo00 extends o00oOo0O<View> {
        public o00oOo00(String str) {
            super(str);
        }

        @Override // o0O00OOO.o00oOo0O
        /* renamed from: o00oOOo0 */
        public float getValue(@NotNull View view) {
            o0ooO.o00oo0O0(view, "object");
            ImageView imageView = WormDotsIndicator.this.f6615o00ooO0O;
            o0ooO.o00oo00O(imageView);
            return imageView.getLayoutParams().width;
        }

        @Override // o0O00OOO.o00oOo0O
        /* renamed from: o00oOOoO */
        public void setValue(@NotNull View view, float f) {
            o0ooO.o00oo0O0(view, "object");
            ImageView imageView = WormDotsIndicator.this.f6615o00ooO0O;
            o0ooO.o00oo00O(imageView);
            imageView.getLayoutParams().width = (int) f;
            ImageView imageView2 = WormDotsIndicator.this.f6615o00ooO0O;
            o0ooO.o00oo00O(imageView2);
            imageView2.requestLayout();
        }
    }

    @o00oo0O0
    public WormDotsIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @o00oo0O0
    public WormDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public WormDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.f6620o00ooOo = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int o00oOoOO2 = o00oOoOO(24);
        setPadding(o00oOoOO2, 0, o00oOoOO2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        this.f6614o00ooO = o00oOoOO(2);
        int o00oOoo02 = o00oOoo0(context);
        this.f6618o00ooOO0 = o00oOoo02;
        this.f6617o00ooOO = o00oOoo02;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.WormDotsIndicator);
            o0ooO.o00oo0OO(obtainStyledAttributes, "getContext().obtainStyle…leable.WormDotsIndicator)");
            int color = obtainStyledAttributes.getColor(R.styleable.WormDotsIndicator_dotsColor, this.f6618o00ooOO0);
            this.f6618o00ooOO0 = color;
            this.f6617o00ooOO = obtainStyledAttributes.getColor(R.styleable.WormDotsIndicator_dotsStrokeColor, color);
            this.f6614o00ooO = (int) obtainStyledAttributes.getDimension(R.styleable.WormDotsIndicator_dotsStrokeWidth, this.f6614o00ooO);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            o00oOoO0(5);
            addView(o00ooOo0(false));
        }
        o00ooOoO();
    }

    public /* synthetic */ WormDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oOOoO.o00oOo00 getType() {
        return o00oOOoO.o00oOo00.WORM;
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oOOo0() {
        HashMap hashMap = this.f6622o00ooOoO;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // o0OO0o0O.o00oOOoO
    public View o00oOOoO(int i) {
        if (this.f6622o00ooOoO == null) {
            this.f6622o00ooOoO = new HashMap();
        }
        View view = (View) this.f6622o00ooOoO.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f6622o00ooOoO.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oOo0o(int i) {
        ViewGroup o00ooOo02 = o00ooOo0(true);
        o00ooOo02.setOnClickListener(new o00oOOo0(i));
        ArrayList<ImageView> arrayList = this.f13250o00oo0O0;
        View findViewById = o00ooOo02.findViewById(R.id.worm_dot);
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        arrayList.add((ImageView) findViewById);
        this.f6620o00ooOo.addView(o00ooOo02);
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oo00O o00oOoO() {
        return new o00oOOoO();
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oo(int i) {
        LinearLayout linearLayout = this.f6620o00ooOo;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        ArrayList<ImageView> arrayList = this.f13250o00oo0O0;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oo0O(int i) {
        ImageView imageView = this.f13250o00oo0O0.get(i);
        o0ooO.o00oo0OO(imageView, "dots[index]");
        o00ooOo(true, imageView);
    }

    public final void o00ooOo(boolean z, View view) {
        Drawable background = view.getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke(this.f6614o00ooO, this.f6617o00ooOO);
        } else {
            gradientDrawable.setColor(this.f6618o00ooOO0);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    public final ViewGroup o00ooOo0(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.worm_dot_layout, (ViewGroup) this, false);
        if (inflate != null) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            viewGroup.setLayoutDirection(0);
            View findViewById = viewGroup.findViewById(R.id.worm_dot);
            findViewById.setBackgroundResource(z ? R.drawable.worm_dot_stroke_background : R.drawable.worm_dot_background);
            o0ooO.o00oo0OO(findViewById, "dotImageView");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int dotsSize = (int) getDotsSize();
                layoutParams2.height = dotsSize;
                layoutParams2.width = dotsSize;
                layoutParams2.addRule(15, -1);
                layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
                o00ooOo(z, findViewById);
                return viewGroup;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void o00ooOoO() {
        o00oOOoO.InterfaceC0164o00oOOoO pager = getPager();
        if (pager == null || !pager.isEmpty()) {
            ImageView imageView = this.f6615o00ooO0O;
            if (imageView != null && indexOfChild(imageView) != -1) {
                removeView(this.f6615o00ooO0O);
            }
            ViewGroup o00ooOo02 = o00ooOo0(false);
            this.f6616o00ooO0o = o00ooOo02;
            o0ooO.o00oo00O(o00ooOo02);
            this.f6615o00ooO0O = (ImageView) o00ooOo02.findViewById(R.id.worm_dot);
            addView(this.f6616o00ooO0o);
            this.f6619o00ooOOo = new o00oo0(this.f6616o00ooO0o, o0O00OOO.o00oOOoO.f10930o00oo00O);
            o00oo0OO o00oo0oo = new o00oo0OO(0.0f);
            o00oo0oo.o00oOoO0(1.0f);
            o00oo0oo.o00oOoOO(300.0f);
            o00oo0 o00oo0Var = this.f6619o00ooOOo;
            o0ooO.o00oo00O(o00oo0Var);
            o00oo0Var.f10973o00ooOo = o00oo0oo;
            this.f6621o00ooOo0 = new o00oo0(this.f6616o00ooO0o, new o00oOo00("DotsWidth"));
            o00oo0OO o00oo0oo2 = new o00oo0OO(0.0f);
            o00oo0oo2.o00oOoO0(1.0f);
            o00oo0oo2.o00oOoOO(300.0f);
            o00oo0 o00oo0Var2 = this.f6621o00ooOo0;
            o0ooO.o00oo00O(o00oo0Var2);
            o00oo0Var2.f10973o00ooOo = o00oo0oo2;
        }
    }

    public final void setDotIndicatorColor(int i) {
        ImageView imageView = this.f6615o00ooO0O;
        if (imageView != null) {
            this.f6618o00ooOO0 = i;
            o0ooO.o00oo00O(imageView);
            o00ooOo(false, imageView);
        }
    }

    public final void setStrokeDotsIndicatorColor(int i) {
        this.f6617o00ooOO = i;
        Iterator<ImageView> it = this.f13250o00oo0O0.iterator();
        while (it.hasNext()) {
            ImageView next = it.next();
            o0ooO.o00oo0OO(next, "v");
            o00ooOo(true, next);
        }
    }
}
