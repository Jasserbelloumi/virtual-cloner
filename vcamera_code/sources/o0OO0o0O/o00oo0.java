package o0OO0o0O;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0o0O.o00oOOoO;
import o0OOOO0o.o00oo0O0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00069"}, d2 = {"Lo0OO0o0O/o00oo0;", "Lo0OO0o0O/o00oOOoO;", "", FirebaseAnalytics.Param.INDEX, "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "o00oo", "o00oo0O", "Lo0OO0o0O/o00oo00O;", "o00oOoO", TtmlNode.ATTR_TTS_COLOR, "setDotIndicatorColor", "setStrokeDotsIndicatorColor", "o00ooOO", "", "stroke", "Landroid/view/ViewGroup;", "o00ooO", "Landroid/view/View;", "dotView", "o00ooOO0", "o00ooO0O", "Landroid/view/View;", "dotIndicatorView", "", "o00ooO0o", "F", "dotsStrokeWidth", "I", "dotsStrokeColor", "dotIndicatorColor", "stiffness", "o00ooOOo", "dampingRatio", "o00ooOo0", "dotIndicatorSize", "Lo0O00OOO/o00oo0;", "o00ooOo", "Lo0O00OOO/o00oo0;", "dotIndicatorSpring", "Landroid/widget/LinearLayout;", "o00ooOoO", "Landroid/widget/LinearLayout;", "strokeDotsLinearLayout", "Lo0OO0o0O/o00oOOoO$o00oOo00;", "getType", "()Lo0OO0o0O/o00oOOoO$o00oOo00;", "type", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o00ooo0O", "o00oOOo0", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class o00oo0 extends o0OO0o0O.o00oOOoO {

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f13283o00ooo0 = 300;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final float f13284o00ooo00 = 0.5f;
    @NotNull

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final o00oOOo0 f13285o00ooo0O = new o00oOOo0(null);

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f13286o00ooO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public View f13287o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f13288o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f13289o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f13290o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f13291o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public o0O00OOO.o00oo0 f13292o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final float f13293o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final LinearLayout f13294o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public HashMap f13295o00ooOoo;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lo0OO0o0O/o00oo0$o00oOOo0;", "", "", "DEFAULT_DAMPING_RATIO", "F", "", "DEFAULT_STIFFNESS", "I", "<init>", "()V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOOoO implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ int f13296o00oo0O;

        public o00oOOoO(int i) {
            this.f13296o00oo0O = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (o00oo0.this.getDotsClickable()) {
                int i = this.f13296o00oo0O;
                o00oOOoO.InterfaceC0164o00oOOoO pager = o00oo0.this.getPager();
                if (i < (pager != null ? pager.getCount() : 0)) {
                    o00oOOoO.InterfaceC0164o00oOOoO pager2 = o00oo0.this.getPager();
                    o0ooO.o00oo00O(pager2);
                    pager2.o00oOOo0(this.f13296o00oo0O, true);
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"o0OO0o0O/o00oo0$o00oOo00", "Lo0OO0o0O/o00oo00O;", "", "selectedPosition", "nextPosition", "", "positionOffset", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "(IIF)V", "position", "o00oOooO", "(I)V", "o00oOOo0", "()I", "pageCount", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOo00 extends o00oo00O {
        public o00oOo00() {
        }

        @Override // o0OO0o0O.o00oo00O
        public int o00oOOo0() {
            return o00oo0.this.f13250o00oo0O0.size();
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOo00(int i, int i2, float f) {
            float dotsSpacing = (o00oo0.this.getDotsSpacing() * 2) + o00oo0.this.getDotsSize();
            ImageView imageView = o00oo0.this.f13250o00oo0O0.get(i);
            o0ooO.o00oo0OO(imageView, "dots[selectedPosition]");
            ViewParent parent = imageView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            float left = (dotsSpacing * f) + ((ViewGroup) parent).getLeft();
            o0O00OOO.o00oo0 o00oo0Var = o00oo0.this.f13292o00ooOo;
            if (o00oo0Var != null) {
                o00oo0Var.o00ooO0O(left);
            }
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOooO(int i) {
        }
    }

    @o00oo0O0
    public o00oo0(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @o00oo0O0
    public o00oo0(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public o00oo0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.f13294o00ooOoO = linearLayout;
        float o00oOoOo2 = o00oOoOo(24.0f);
        setClipToPadding(false);
        int i2 = (int) o00oOoOo2;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        this.f13288o00ooO0o = o00oOoOo(2.0f);
        int o00oOoo02 = o00oOoo0(context);
        this.f13290o00ooOO0 = o00oOoo02;
        this.f13286o00ooO = o00oOoo02;
        this.f13289o00ooOO = 300;
        this.f13291o00ooOOo = 0.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpringDotsIndicator);
            o0ooO.o00oo0OO(obtainStyledAttributes, "getContext().obtainStyle…able.SpringDotsIndicator)");
            int color = obtainStyledAttributes.getColor(R.styleable.SpringDotsIndicator_dotsColor, this.f13290o00ooOO0);
            this.f13290o00ooOO0 = color;
            this.f13286o00ooO = obtainStyledAttributes.getColor(R.styleable.SpringDotsIndicator_dotsStrokeColor, color);
            this.f13289o00ooOO = obtainStyledAttributes.getFloat(R.styleable.SpringDotsIndicator_stiffness, this.f13289o00ooOO);
            this.f13291o00ooOOo = obtainStyledAttributes.getFloat(R.styleable.SpringDotsIndicator_dampingRatio, this.f13291o00ooOOo);
            this.f13288o00ooO0o = obtainStyledAttributes.getDimension(R.styleable.SpringDotsIndicator_dotsStrokeWidth, this.f13288o00ooO0o);
            obtainStyledAttributes.recycle();
        }
        this.f13293o00ooOo0 = getDotsSize();
        if (isInEditMode()) {
            o00oOoO0(5);
            addView(o00ooO(false));
        }
        o00ooOO();
    }

    public /* synthetic */ o00oo0(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oOOoO.o00oOo00 getType() {
        return o00oOOoO.o00oOo00.SPRING;
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oOOo0() {
        HashMap hashMap = this.f13295o00ooOoo;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // o0OO0o0O.o00oOOoO
    public View o00oOOoO(int i) {
        if (this.f13295o00ooOoo == null) {
            this.f13295o00ooOoo = new HashMap();
        }
        View view = (View) this.f13295o00ooOoo.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f13295o00ooOoo.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oOo0o(int i) {
        ViewGroup o00ooO2 = o00ooO(true);
        o00ooO2.setOnClickListener(new o00oOOoO(i));
        ArrayList<ImageView> arrayList = this.f13250o00oo0O0;
        View findViewById = o00ooO2.findViewById(R.id.spring_dot);
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        arrayList.add((ImageView) findViewById);
        this.f13294o00ooOoO.addView(o00ooO2);
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oo00O o00oOoO() {
        return new o00oOo00();
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oo(int i) {
        LinearLayout linearLayout = this.f13294o00ooOoO;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        ArrayList<ImageView> arrayList = this.f13250o00oo0O0;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oo0O(int i) {
        ImageView imageView = this.f13250o00oo0O0.get(i);
        o0ooO.o00oo0OO(imageView, "dots[index]");
        o00ooOO0(true, imageView);
    }

    public final ViewGroup o00ooO(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.spring_dot_layout, (ViewGroup) this, false);
        if (inflate != null) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            viewGroup.setLayoutDirection(0);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.spring_dot);
            imageView.setBackgroundResource(z ? R.drawable.spring_dot_stroke_background : R.drawable.spring_dot_background);
            o0ooO.o00oo0OO(imageView, "dotView");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int dotsSize = (int) (z ? getDotsSize() : this.f13293o00ooOo0);
                layoutParams2.height = dotsSize;
                layoutParams2.width = dotsSize;
                layoutParams2.addRule(15, -1);
                layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
                o00ooOO0(z, imageView);
                return viewGroup;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void o00ooOO() {
        o00oOOoO.InterfaceC0164o00oOOoO pager = getPager();
        if (pager == null || !pager.isEmpty()) {
            View view = this.f13287o00ooO0O;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f13287o00ooO0O);
            }
            ViewGroup o00ooO2 = o00ooO(false);
            this.f13287o00ooO0O = o00ooO2;
            addView(o00ooO2);
            this.f13292o00ooOo = new o0O00OOO.o00oo0(this.f13287o00ooO0O, o0O00OOO.o00oOOoO.f10930o00oo00O);
            o0O00OOO.o00oo0OO o00oo0oo = new o0O00OOO.o00oo0OO(0.0f);
            o00oo0oo.o00oOoO0(this.f13291o00ooOOo);
            o00oo0oo.o00oOoOO(this.f13289o00ooOO);
            o0O00OOO.o00oo0 o00oo0Var = this.f13292o00ooOo;
            o0ooO.o00oo00O(o00oo0Var);
            o00oo0Var.f10973o00ooOo = o00oo0oo;
        }
    }

    public final void o00ooOO0(boolean z, View view) {
        View findViewById = view.findViewById(R.id.spring_dot);
        o0ooO.o00oo0OO(findViewById, "dotView.findViewById<View>(R.id.spring_dot)");
        Drawable background = findViewById.getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f13288o00ooO0o, this.f13286o00ooO);
        } else {
            gradientDrawable.setColor(this.f13290o00ooOO0);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    public final void setDotIndicatorColor(int i) {
        View view = this.f13287o00ooO0O;
        if (view != null) {
            this.f13290o00ooOO0 = i;
            o0ooO.o00oo00O(view);
            o00ooOO0(false, view);
        }
    }

    public final void setStrokeDotsIndicatorColor(int i) {
        this.f13286o00ooO = i;
        Iterator<ImageView> it = this.f13250o00oo0O0.iterator();
        while (it.hasNext()) {
            ImageView next = it.next();
            o0ooO.o00oo0OO(next, "v");
            o00ooOO0(true, next);
        }
    }
}
