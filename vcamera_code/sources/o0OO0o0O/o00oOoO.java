package o0OO0o0O;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o0O.o00oOOoO;
import o0OOOO0o.o00oo0O0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R*\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00063"}, d2 = {"Lo0OO0o0O/o00oOoO;", "Lo0OO0o0O/o00oOOoO;", "", FirebaseAnalytics.Param.INDEX, "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "o00oo", "Lo0OO0o0O/o00oo00O;", "o00oOoO", "o00oo0O", TtmlNode.ATTR_TTS_COLOR, "setSelectedPointColor", "Landroid/util/AttributeSet;", "attrs", "o00ooOOo", "Landroid/widget/LinearLayout;", "o00ooO0O", "Landroid/widget/LinearLayout;", "linearLayout", "", "o00ooO0o", "F", "dotsWidthFactor", "", "o00ooO", "Z", "progressMode", "o00ooOO0", "dotsElevation", "value", "o00ooOO", "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "(I)V", "selectedDotColor", "Landroid/animation/ArgbEvaluator;", "Landroid/animation/ArgbEvaluator;", "argbEvaluator", "Lo0OO0o0O/o00oOOoO$o00oOo00;", "getType", "()Lo0OO0o0O/o00oOOoO$o00oOo00;", "type", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o00ooOoO", "o00oOOo0", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class o00oOoO extends o0OO0o0O.o00oOOoO {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final float f13271o00ooOo = 2.5f;
    @NotNull

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final o00oOOo0 f13272o00ooOoO = new o00oOOo0(null);

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f13273o00ooO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public LinearLayout f13274o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f13275o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f13276o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public float f13277o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final ArgbEvaluator f13278o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public HashMap f13279o00ooOo0;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo0OO0o0O/o00oOoO$o00oOOo0;", "", "", "DEFAULT_WIDTH_FACTOR", "F", "<init>", "()V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
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
        public final /* synthetic */ int f13280o00oo0O;

        public o00oOOoO(int i) {
            this.f13280o00oo0O = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (o00oOoO.this.getDotsClickable()) {
                int i = this.f13280o00oo0O;
                o00oOOoO.InterfaceC0164o00oOOoO pager = o00oOoO.this.getPager();
                if (i < (pager != null ? pager.getCount() : 0)) {
                    o00oOOoO.InterfaceC0164o00oOOoO pager2 = o00oOoO.this.getPager();
                    o0ooO.o00oo00O(pager2);
                    pager2.o00oOOo0(this.f13280o00oo0O, true);
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"o0OO0o0O/o00oOoO$o00oOo00", "Lo0OO0o0O/o00oo00O;", "", "selectedPosition", "nextPosition", "", "positionOffset", "Lo0OO0o/oO0Ooooo;", "o00oOo00", "(IIF)V", "position", "o00oOooO", "(I)V", "o00oOOo0", "()I", "pageCount", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOo00 extends o00oo00O {
        public o00oOo00() {
        }

        @Override // o0OO0o0O.o00oo00O
        public int o00oOOo0() {
            return o00oOoO.this.f13250o00oo0O0.size();
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOo00(int i, int i2, float f) {
            ImageView imageView = o00oOoO.this.f13250o00oo0O0.get(i);
            o0ooO.o00oo0OO(imageView, "dots[selectedPosition]");
            ImageView imageView2 = imageView;
            float f2 = 1;
            o00oOoO.this.o00ooO0(imageView2, (int) o00oOoO0.o00oOoO.o00oOOo0(f2, f, (o00oOoO.this.f13275o00ooO0o - f2) * o00oOoO.this.getDotsSize(), o00oOoO.this.getDotsSize()));
            o00oOoO o00oooo2 = o00oOoO.this;
            if (o00oooo2.o00oo0(o00oooo2.f13250o00oo0O0, i2)) {
                ImageView imageView3 = o00oOoO.this.f13250o00oo0O0.get(i2);
                o0ooO.o00oo0OO(imageView3, "dots[nextPosition]");
                ImageView imageView4 = imageView3;
                float dotsSize = o00oOoO.this.getDotsSize();
                float dotsSize2 = o00oOoO.this.getDotsSize();
                o00oOoO o00oooo3 = o00oOoO.this;
                o00oooo3.o00ooO0(imageView4, (int) (((o00oooo3.f13275o00ooO0o - f2) * dotsSize2 * f) + dotsSize));
                Drawable background = imageView2.getBackground();
                if (background == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                }
                o00oOo0O o00ooo0o2 = (o00oOo0O) background;
                Drawable background2 = imageView4.getBackground();
                if (background2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                }
                o00oOo0O o00ooo0o3 = (o00oOo0O) background2;
                if (o00oOoO.this.getSelectedDotColor() != o00oOoO.this.getDotsColor()) {
                    o00oOoO o00oooo4 = o00oOoO.this;
                    Object evaluate = o00oooo4.f13278o00ooOOo.evaluate(f, Integer.valueOf(o00oooo4.getSelectedDotColor()), Integer.valueOf(o00oOoO.this.getDotsColor()));
                    if (evaluate == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    int intValue = ((Integer) evaluate).intValue();
                    o00oOoO o00oooo5 = o00oOoO.this;
                    Object evaluate2 = o00oooo5.f13278o00ooOOo.evaluate(f, Integer.valueOf(o00oooo5.getDotsColor()), Integer.valueOf(o00oOoO.this.getSelectedDotColor()));
                    if (evaluate2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    o00ooo0o3.setColor(((Integer) evaluate2).intValue());
                    o00oOoO o00oooo6 = o00oOoO.this;
                    if (o00oooo6.f13273o00ooO) {
                        o00oOOoO.InterfaceC0164o00oOOoO pager = o00oooo6.getPager();
                        o0ooO.o00oo00O(pager);
                        if (i <= pager.o00oOOoO()) {
                            o00ooo0o2.setColor(o00oOoO.this.getSelectedDotColor());
                        }
                    }
                    o00ooo0o2.setColor(intValue);
                }
            }
            o00oOoO.this.invalidate();
        }

        @Override // o0OO0o0O.o00oo00O
        public void o00oOooO(int i) {
            o00oOoO o00oooo2 = o00oOoO.this;
            ImageView imageView = o00oooo2.f13250o00oo0O0.get(i);
            o0ooO.o00oo0OO(imageView, "dots[position]");
            o00oooo2.o00ooO0(imageView, (int) o00oOoO.this.getDotsSize());
            o00oOoO.this.o00oo0O(i);
        }
    }

    @o00oo0O0
    public o00oOoO(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @o00oo0O0
    public o00oOoO(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public o00oOoO(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        this.f13278o00ooOOo = new ArgbEvaluator();
        o00ooOOo(attributeSet);
    }

    public /* synthetic */ o00oOoO(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final int getSelectedDotColor() {
        return this.f13276o00ooOO;
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oOOoO.o00oOo00 getType() {
        return o00oOOoO.o00oOo00.DEFAULT;
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oOOo0() {
        HashMap hashMap = this.f13279o00ooOo0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // o0OO0o0O.o00oOOoO
    public View o00oOOoO(int i) {
        if (this.f13279o00ooOo0 == null) {
            this.f13279o00ooOo0 = new HashMap();
        }
        View view = (View) this.f13279o00ooOo0.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f13279o00ooOo0.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
        r3 = r7.f13276o00ooOO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        r3 = getDotsColor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
        if (r8 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r3.o00oOOoO() == r8) goto L13;
     */
    @Override // o0OO0o0O.o00oOOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOo0o(int r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = com.tbuonomo.viewpagerdotsindicator.R.layout.dot_layout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r7, r2)
            int r1 = com.tbuonomo.viewpagerdotsindicator.R.id.dot
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r3 = "imageView"
            o0OOOOO0.o0ooO.o00oo0OO(r1, r3)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto La6
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            java.lang.String r4 = "dot"
            o0OOOOO0.o0ooO.o00oo0OO(r0, r4)
            r0.setLayoutDirection(r2)
            float r5 = r7.getDotsSize()
            int r5 = (int) r5
            r3.height = r5
            r3.width = r5
            float r5 = r7.getDotsSpacing()
            int r5 = (int) r5
            float r6 = r7.getDotsSpacing()
            int r6 = (int) r6
            r3.setMargins(r5, r2, r6, r2)
            o0OO0o0O.o00oOo0O r2 = new o0OO0o0O.o00oOo0O
            r2.<init>()
            float r3 = r7.getDotsCornerRadius()
            r2.setCornerRadius(r3)
            boolean r3 = r7.isInEditMode()
            if (r3 == 0) goto L57
            if (r8 != 0) goto L67
            goto L64
        L57:
            o0OO0o0O.o00oOOoO$o00oOOoO r3 = r7.getPager()
            o0OOOOO0.o0ooO.o00oo00O(r3)
            int r3 = r3.o00oOOoO()
            if (r3 != r8) goto L67
        L64:
            int r3 = r7.f13276o00ooOO
            goto L6b
        L67:
            int r3 = r7.getDotsColor()
        L6b:
            r2.setColor(r3)
            r1.setBackgroundDrawable(r2)
            o0OO0o0O.o00oOoO$o00oOOoO r2 = new o0OO0o0O.o00oOoO$o00oOOoO
            r2.<init>(r8)
            r0.setOnClickListener(r2)
            o0OOOOO0.o0ooO.o00oo0OO(r0, r4)
            float r8 = r7.f13277o00ooOO0
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r8 = r8 * r2
            int r8 = (int) r8
            o0OO0o0O.o00oo0OO.o00oOOo0(r0, r8)
            float r8 = r7.f13277o00ooOO0
            r2 = 2
            float r2 = (float) r2
            float r8 = r8 * r2
            int r8 = (int) r8
            o0OO0o0O.o00oo0OO.o00oOOoO(r0, r8)
            float r8 = r7.f13277o00ooOO0
            r1.setElevation(r8)
            java.util.ArrayList<android.widget.ImageView> r8 = r7.f13250o00oo0O0
            r8.add(r1)
            android.widget.LinearLayout r8 = r7.f13274o00ooO0O
            if (r8 != 0) goto La2
            java.lang.String r1 = "linearLayout"
            o0OOOOO0.o0ooO.o00ooooO(r1)
        La2:
            r8.addView(r0)
            return
        La6:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO0o0O.o00oOoO.o00oOo0o(int):void");
    }

    @Override // o0OO0o0O.o00oOOoO
    @NotNull
    public o00oo00O o00oOoO() {
        return new o00oOo00();
    }

    @Override // o0OO0o0O.o00oOOoO
    public void o00oo(int i) {
        LinearLayout linearLayout = this.f13274o00ooO0O;
        if (linearLayout == null) {
            o0ooO.o00ooooO("linearLayout");
        }
        LinearLayout linearLayout2 = this.f13274o00ooO0O;
        if (linearLayout2 == null) {
            o0ooO.o00ooooO("linearLayout");
        }
        linearLayout.removeViewAt(linearLayout2.getChildCount() - 1);
        ArrayList<ImageView> arrayList = this.f13250o00oo0O0;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r4 < r2.o00oOOoO()) goto L14;
     */
    @Override // o0OO0o0O.o00oOOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0O(int r4) {
        /*
            r3 = this;
            java.util.ArrayList<android.widget.ImageView> r0 = r3.f13250o00oo0O0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r1 = "dots[index]"
            o0OOOOO0.o0ooO.o00oo0OO(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof o0OO0o0O.o00oOo0O
            if (r2 != 0) goto L16
            r1 = 0
        L16:
            o0OO0o0O.o00oOo0O r1 = (o0OO0o0O.o00oOo0O) r1
            if (r1 == 0) goto L43
            o0OO0o0O.o00oOOoO$o00oOOoO r2 = r3.getPager()
            o0OOOOO0.o0ooO.o00oo00O(r2)
            int r2 = r2.o00oOOoO()
            if (r4 == r2) goto L3e
            boolean r2 = r3.f13273o00ooO
            if (r2 == 0) goto L39
            o0OO0o0O.o00oOOoO$o00oOOoO r2 = r3.getPager()
            o0OOOOO0.o0ooO.o00oo00O(r2)
            int r2 = r2.o00oOOoO()
            if (r4 >= r2) goto L39
            goto L3e
        L39:
            int r4 = r3.getDotsColor()
            goto L40
        L3e:
            int r4 = r3.f13276o00ooOO
        L40:
            r1.setColor(r4)
        L43:
            r0.setBackgroundDrawable(r1)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO0o0O.o00oOoO.o00oo0O(int):void");
    }

    public final void o00ooOOo(AttributeSet attributeSet) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13274o00ooO0O = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f13274o00ooO0O;
        if (linearLayout2 == null) {
            o0ooO.o00ooooO("linearLayout");
        }
        addView(linearLayout2, -2, -2);
        this.f13275o00ooO0o = 2.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DotsIndicator);
            o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr….styleable.DotsIndicator)");
            setSelectedDotColor(obtainStyledAttributes.getColor(R.styleable.DotsIndicator_selectedDotColor, o0OO0o0O.o00oOOoO.f13247o00ooO00));
            float f = obtainStyledAttributes.getFloat(R.styleable.DotsIndicator_dotsWidthFactor, 2.5f);
            this.f13275o00ooO0o = f;
            if (f < 1) {
                this.f13275o00ooO0o = 2.5f;
            }
            this.f13273o00ooO = obtainStyledAttributes.getBoolean(R.styleable.DotsIndicator_progressMode, false);
            this.f13277o00ooOO0 = obtainStyledAttributes.getDimension(R.styleable.DotsIndicator_dotsElevation, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            o00oOoO0(5);
            o00oo0Oo();
        }
    }

    public final void setSelectedDotColor(int i) {
        this.f13276o00ooOO = i;
        o00oo0o0();
    }

    @o0O0o(message = "Use setSelectedDotColor() instead", replaceWith = @o0OO000(expression = "setSelectedDotColor()", imports = {}))
    public final void setSelectedPointColor(int i) {
        setSelectedDotColor(i);
    }
}
