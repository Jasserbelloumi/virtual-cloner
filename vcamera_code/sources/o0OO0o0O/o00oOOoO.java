package o0OO0o0O;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import o00oOooO.o0OOOO00;
import o0OO0o.o0O0o;
import o0OOOO0o.o00oo0O0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 !2\u00020\u0001:\u0003defB'\b\u0007\u0012\u0006\u0010^\u001a\u00020'\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_\u0012\b\b\u0002\u0010a\u001a\u00020\u0004¢\u0006\u0004\bb\u0010cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0004J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J\u0006\u0010\u0010\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u0012\u0010!\u001a\u00020\u0002*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J(\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\"*\u0012\u0012\u0004\u0012\u00028\u00000#j\b\u0012\u0004\u0012\u00028\u0000`$2\u0006\u0010\u0011\u001a\u00020\u0004J\n\u0010(\u001a\u00020\u0004*\u00020'J0\u0010.\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0014R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020/0#j\b\u0012\u0004\u0012\u00020/`$8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00108\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010?\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010K\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR$\u0010R\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0018\u0010Y\u001a\u00020%*\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010Y\u001a\u00020%*\u00020\u001c8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b0\u0010ZR\u001a\u0010\\\u001a\u00020%*\u0004\u0018\u00010\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b[\u0010XR\u001a\u0010\\\u001a\u00020%*\u0004\u0018\u00010\u001c8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b]\u0010Z¨\u0006g"}, d2 = {"Lo0OO0o0O/o00oOOoO;", "Landroid/widget/FrameLayout;", "Lo0OO0o/oO0Ooooo;", "o00oo0o", "", "count", "o00ooO00", "o0O0o", "o00oo0oO", "onAttachedToWindow", "o00oo0o0", "dp", "o00oOoOO", "", "o00oOoOo", "o00oOoO0", "o00oo0Oo", FirebaseAnalytics.Param.INDEX, "o00oo0O", "o00oOo0o", "o00oo", "Lo0OO0o0O/o00oo00O;", "o00oOoO", TtmlNode.ATTR_TTS_COLOR, "setPointsColor", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "setViewPager2", "Landroid/view/View;", "width", "o00ooO0", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "o00oo0", "Landroid/content/Context;", "o00oOoo0", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "Landroid/widget/ImageView;", "o00oo0O0", "Ljava/util/ArrayList;", "dots", "Z", "getDotsClickable", "()Z", "setDotsClickable", "(Z)V", "dotsClickable", "value", "I", "getDotsColor", "()I", "setDotsColor", "(I)V", "dotsColor", "F", "getDotsSize", "()F", "setDotsSize", "(F)V", "dotsSize", "getDotsCornerRadius", "setDotsCornerRadius", "dotsCornerRadius", "getDotsSpacing", "setDotsSpacing", "dotsSpacing", "Lo0OO0o0O/o00oOOoO$o00oOOoO;", "Lo0OO0o0O/o00oOOoO$o00oOOoO;", "getPager", "()Lo0OO0o0O/o00oOOoO$o00oOOoO;", "setPager", "(Lo0OO0o0O/o00oOOoO$o00oOOoO;)V", "pager", "Lo0OO0o0O/o00oOOoO$o00oOo00;", "getType", "()Lo0OO0o0O/o00oOOoO$o00oOo00;", "type", "o00oo0OO", "(Landroidx/viewpager/widget/ViewPager;)Z", "isNotEmpty", "(Landroidx/viewpager2/widget/ViewPager2;)Z", "o00oOooo", "isEmpty", "o00oo00O", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public abstract class o00oOOoO extends FrameLayout {
    @NotNull

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final o00oOOo0 f13246o00ooO0 = new o00oOOo0(null);

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f13247o00ooO00 = -16711681;

    /* renamed from: o00oo  reason: collision with root package name */
    public HashMap f13248o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f13249o00oo0O;
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ArrayList<ImageView> f13250o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f13251o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f13252o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f13253o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f13254o00oo0oO;
    @Nullable

    /* renamed from: o0O0o  reason: collision with root package name */
    public InterfaceC0164o00oOOoO f13255o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo0OO0o0O/o00oOOoO$o00oOOo0;", "", "", "DEFAULT_POINT_COLOR", "I", "<init>", "()V", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&R\u0014\u0010\u000e\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lo0OO0o0O/o00oOOoO$o00oOOoO;", "", "", "item", "", "smoothScroll", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "o00oOo0O", "Lo0OO0o0O/o00oo00O;", "onPageChangeListenerHelper", "o00oOooO", "o00oOo00", "()Z", "isNotEmpty", o0OO000o.o00oOOoO.f12961o00oOo00, "()I", "currentItem", "isEmpty", "getCount", "count", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o0OO0o0O.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0164o00oOOoO {
        int getCount();

        boolean isEmpty();

        void o00oOOo0(int i, boolean z);

        int o00oOOoO();

        boolean o00oOo00();

        void o00oOo0O();

        void o00oOooO(@NotNull o0OO0o0O.o00oo00O o00oo00o);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DEFAULT uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012j\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lo0OO0o0O/o00oOOoO$o00oOo00;", "", "", "defaultSize", "F", "getDefaultSize", "()F", "defaultSpacing", "getDefaultSpacing", "", "styleableId", "[I", "getStyleableId", "()[I", "", "dotsColorId", "I", "getDotsColorId", "()I", "dotsSizeId", "getDotsSizeId", "dotsSpacingId", "getDotsSpacingId", "dotsCornerRadiusId", "getDotsCornerRadiusId", "dotsClickableId", "getDotsClickableId", "<init>", "(Ljava/lang/String;IFF[IIIIII)V", "DEFAULT", "SPRING", "WORM", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOo00 {
        private static final /* synthetic */ o00oOo00[] $VALUES;
        public static final o00oOo00 DEFAULT;
        public static final o00oOo00 SPRING;
        public static final o00oOo00 WORM;
        private final float defaultSize;
        private final float defaultSpacing;
        private final int dotsClickableId;
        private final int dotsColorId;
        private final int dotsCornerRadiusId;
        private final int dotsSizeId;
        private final int dotsSpacingId;
        @NotNull
        private final int[] styleableId;

        static {
            int[] iArr = R.styleable.SpringDotsIndicator;
            o0ooO.o00oo0OO(iArr, "R.styleable.SpringDotsIndicator");
            int i = R.styleable.SpringDotsIndicator_dotsColor;
            int i2 = R.styleable.SpringDotsIndicator_dotsSize;
            int i3 = R.styleable.SpringDotsIndicator_dotsSpacing;
            int i4 = R.styleable.SpringDotsIndicator_dotsCornerRadius;
            int i5 = R.styleable.SpringDotsIndicator_dotsClickable;
            o00oOo00 o00ooo002 = new o00oOo00("DEFAULT", 0, 16.0f, 8.0f, iArr, i, i2, i3, i4, i5);
            DEFAULT = o00ooo002;
            int[] iArr2 = R.styleable.DotsIndicator;
            o0ooO.o00oo0OO(iArr2, "R.styleable.DotsIndicator");
            o00oOo00 o00ooo003 = new o00oOo00("SPRING", 1, 16.0f, 4.0f, iArr2, R.styleable.DotsIndicator_dotsColor, R.styleable.DotsIndicator_dotsSize, R.styleable.DotsIndicator_dotsSpacing, R.styleable.DotsIndicator_dotsCornerRadius, i5);
            SPRING = o00ooo003;
            int[] iArr3 = R.styleable.WormDotsIndicator;
            o0ooO.o00oo0OO(iArr3, "R.styleable.WormDotsIndicator");
            o00oOo00 o00ooo004 = new o00oOo00("WORM", 2, 16.0f, 4.0f, iArr3, R.styleable.WormDotsIndicator_dotsColor, R.styleable.WormDotsIndicator_dotsSize, R.styleable.WormDotsIndicator_dotsSpacing, R.styleable.WormDotsIndicator_dotsCornerRadius, i5);
            WORM = o00ooo004;
            $VALUES = new o00oOo00[]{o00ooo002, o00ooo003, o00ooo004};
        }

        private o00oOo00(String str, int i, @o0OOOO00 float f, @o0OOOO00 float f2, @o0OOOO00 int[] iArr, @o0OOOO00 int i2, @o0OOOO00 int i3, @o0OOOO00 int i4, int i5, int i6) {
            this.defaultSize = f;
            this.defaultSpacing = f2;
            this.styleableId = iArr;
            this.dotsColorId = i2;
            this.dotsSizeId = i3;
            this.dotsSpacingId = i4;
            this.dotsCornerRadiusId = i5;
            this.dotsClickableId = i6;
        }

        public static o00oOo00 valueOf(String str) {
            return (o00oOo00) Enum.valueOf(o00oOo00.class, str);
        }

        public static o00oOo00[] values() {
            return (o00oOo00[]) $VALUES.clone();
        }

        public final float getDefaultSize() {
            return this.defaultSize;
        }

        public final float getDefaultSpacing() {
            return this.defaultSpacing;
        }

        public final int getDotsClickableId() {
            return this.dotsClickableId;
        }

        public final int getDotsColorId() {
            return this.dotsColorId;
        }

        public final int getDotsCornerRadiusId() {
            return this.dotsCornerRadiusId;
        }

        public final int getDotsSizeId() {
            return this.dotsSizeId;
        }

        public final int getDotsSpacingId() {
            return this.dotsSpacingId;
        }

        @NotNull
        public final int[] getStyleableId() {
            return this.styleableId;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOo0O implements Runnable {
        public o00oOo0O() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00oOOoO.this.o00oo0o();
            o00oOOoO.this.o00oo0o0();
            o00oOOoO.this.o00oo0oO();
            o00oOOoO.this.o0O0o();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"o0OO0o0O/o00oOOoO$o00oOoO", "Landroid/database/DataSetObserver;", "Lo0OO0o/oO0Ooooo;", "onChanged", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oOoO extends DataSetObserver {
        public o00oOoO() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            o00oOOoO.this.o00oo0Oo();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"o0OO0o0O/o00oOOoO$o00oo0", "Landroidx/recyclerview/widget/RecyclerView$o00oo0O;", "Lo0OO0o/oO0Ooooo;", "onChanged", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oo0 extends RecyclerView.o00oo0O {
        public o00oo0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00oo0O
        public void onChanged() {
            super.onChanged();
            o00oOOoO.this.o00oo0Oo();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"o0OO0o0O/o00oOOoO$o00oo00O", "Lo0OO0o0O/o00oOOoO$o00oOOoO;", "", "item", "", "smoothScroll", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "o00oOo0O", "Lo0OO0o0O/o00oo00O;", "onPageChangeListenerHelper", "o00oOooO", "Landroidx/viewpager/widget/ViewPager$o00oo0O;", "Landroidx/viewpager/widget/ViewPager$o00oo0O;", "o00oOo0o", "()Landroidx/viewpager/widget/ViewPager$o00oo0O;", "o00oOoO0", "(Landroidx/viewpager/widget/ViewPager$o00oo0O;)V", "onPageChangeListener", "o00oOo00", "()Z", "isNotEmpty", o0OO000o.o00oOOoO.f12961o00oOo00, "()I", "currentItem", "isEmpty", "getCount", "count", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oo00O implements InterfaceC0164o00oOOoO {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ViewPager.o00oo0O f13259o00oOOo0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ ViewPager f13261o00oOo00;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"o0OO0o0O/o00oOOoO$o00oo00O$o00oOOo0", "Landroidx/viewpager/widget/ViewPager$o00oo0O;", "", "position", "", "positionOffset", "positionOffsetPixels", "Lo0OO0o/oO0Ooooo;", "onPageScrolled", "state", "onPageScrollStateChanged", "onPageSelected", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
        /* loaded from: classes2.dex */
        public static final class o00oOOo0 implements ViewPager.o00oo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ o0OO0o0O.o00oo00O f13262o00oOOo0;

            public o00oOOo0(o0OO0o0O.o00oo00O o00oo00o) {
                this.f13262o00oOOo0 = o00oo00o;
            }

            @Override // androidx.viewpager.widget.ViewPager.o00oo0O
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.o00oo0O
            public void onPageScrolled(int i, float f, int i2) {
                this.f13262o00oOOo0.o00oOOoO(i, f);
            }

            @Override // androidx.viewpager.widget.ViewPager.o00oo0O
            public void onPageSelected(int i) {
            }
        }

        public o00oo00O(ViewPager viewPager) {
            this.f13261o00oOo00 = viewPager;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public int getCount() {
            oo0OOoo.o00oOOo0 adapter = this.f13261o00oOo00.getAdapter();
            if (adapter != null) {
                return adapter.o00oOo0O();
            }
            return 0;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public boolean isEmpty() {
            return o00oOOoO.this.o00oOooo(this.f13261o00oOo00);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOOo0(int i, boolean z) {
            this.f13261o00oOo00.o00ooooO(i, z);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public int o00oOOoO() {
            return this.f13261o00oOo00.getCurrentItem();
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public boolean o00oOo00() {
            return o00oOOoO.this.o00oo0OO(this.f13261o00oOo00);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOo0O() {
            ViewPager.o00oo0O o00oo0o2 = this.f13259o00oOOo0;
            if (o00oo0o2 != null) {
                this.f13261o00oOo00.o00oooOO(o00oo0o2);
            }
        }

        @Nullable
        public final ViewPager.o00oo0O o00oOo0o() {
            return this.f13259o00oOOo0;
        }

        public final void o00oOoO0(@Nullable ViewPager.o00oo0O o00oo0o2) {
            this.f13259o00oOOo0 = o00oo0o2;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOooO(@NotNull o0OO0o0O.o00oo00O o00oo00o) {
            o0ooO.o00oo0O0(o00oo00o, "onPageChangeListenerHelper");
            o00oOOo0 o00oooo02 = new o00oOOo0(o00oo00o);
            this.f13259o00oOOo0 = o00oooo02;
            ViewPager viewPager = this.f13261o00oOo00;
            o0ooO.o00oo00O(o00oooo02);
            viewPager.o00oOo00(o00oooo02);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"o0OO0o0O/o00oOOoO$o00oo0OO", "Lo0OO0o0O/o00oOOoO$o00oOOoO;", "", "item", "", "smoothScroll", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "o00oOo0O", "Lo0OO0o0O/o00oo00O;", "onPageChangeListenerHelper", "o00oOooO", "Landroidx/viewpager2/widget/ViewPager2$o00oo0O;", "Landroidx/viewpager2/widget/ViewPager2$o00oo0O;", "o00oOo0o", "()Landroidx/viewpager2/widget/ViewPager2$o00oo0O;", "o00oOoO0", "(Landroidx/viewpager2/widget/ViewPager2$o00oo0O;)V", "onPageChangeCallback", "o00oOo00", "()Z", "isNotEmpty", o0OO000o.o00oOOoO.f12961o00oOo00, "()I", "currentItem", "isEmpty", "getCount", "count", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class o00oo0OO implements InterfaceC0164o00oOOoO {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ViewPager2.o00oo0O f13263o00oOOo0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f13265o00oOo00;

        @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"o0OO0o0O/o00oOOoO$o00oo0OO$o00oOOo0", "Landroidx/viewpager2/widget/ViewPager2$o00oo0O;", "", "position", "", "positionOffset", "positionOffsetPixels", "Lo0OO0o/oO0Ooooo;", "onPageScrolled", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
        /* loaded from: classes2.dex */
        public static final class o00oOOo0 extends ViewPager2.o00oo0O {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ o0OO0o0O.o00oo00O f13266o00oOOo0;

            public o00oOOo0(o0OO0o0O.o00oo00O o00oo00o) {
                this.f13266o00oOOo0 = o00oo00o;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.o00oo0O
            public void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
                this.f13266o00oOOo0.o00oOOoO(i, f);
            }
        }

        public o00oo0OO(ViewPager2 viewPager2) {
            this.f13265o00oOo00 = viewPager2;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public int getCount() {
            RecyclerView.o00oo0OO adapter = this.f13265o00oOo00.getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public boolean isEmpty() {
            return o00oOOoO.this.o00oo00O(this.f13265o00oOo00);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOOo0(int i, boolean z) {
            this.f13265o00oOo00.o00oo0o0(i, z);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public int o00oOOoO() {
            return this.f13265o00oOo00.getCurrentItem();
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public boolean o00oOo00() {
            return o00oOOoO.this.o00oo0O0(this.f13265o00oOo00);
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOo0O() {
            ViewPager2.o00oo0O o00oo0o2 = this.f13263o00oOOo0;
            if (o00oo0o2 != null) {
                this.f13265o00oOo00.o00ooO00(o00oo0o2);
            }
        }

        @Nullable
        public final ViewPager2.o00oo0O o00oOo0o() {
            return this.f13263o00oOOo0;
        }

        public final void o00oOoO0(@Nullable ViewPager2.o00oo0O o00oo0o2) {
            this.f13263o00oOOo0 = o00oo0o2;
        }

        @Override // o0OO0o0O.o00oOOoO.InterfaceC0164o00oOOoO
        public void o00oOooO(@NotNull o0OO0o0O.o00oo00O o00oo00o) {
            o0ooO.o00oo0O0(o00oo00o, "onPageChangeListenerHelper");
            o00oOOo0 o00oooo02 = new o00oOOo0(o00oo00o);
            this.f13263o00oOOo0 = o00oooo02;
            ViewPager2 viewPager2 = this.f13265o00oOo00;
            o0ooO.o00oo00O(o00oooo02);
            viewPager2.o00oo0(o00oooo02);
        }
    }

    @o00oo0O0
    public o00oOOoO(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @o00oo0O0
    public o00oOOoO(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o00oo0O0
    public o00oOOoO(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        this.f13250o00oo0O0 = new ArrayList<>();
        this.f13249o00oo0O = true;
        this.f13251o00oo0Oo = f13247o00ooO00;
        float o00oOoOo2 = o00oOoOo(getType().getDefaultSize());
        this.f13253o00oo0o0 = o00oOoOo2;
        this.f13252o00oo0o = o00oOoOo2 / 2.0f;
        this.f13254o00oo0oO = o00oOoOo(getType().getDefaultSpacing());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().getStyleableId());
            o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…(attrs, type.styleableId)");
            setDotsColor(obtainStyledAttributes.getColor(getType().getDotsColorId(), f13247o00ooO00));
            this.f13253o00oo0o0 = obtainStyledAttributes.getDimension(getType().getDotsSizeId(), this.f13253o00oo0o0);
            this.f13252o00oo0o = obtainStyledAttributes.getDimension(getType().getDotsCornerRadiusId(), this.f13252o00oo0o);
            this.f13254o00oo0oO = obtainStyledAttributes.getDimension(getType().getDotsSpacingId(), this.f13254o00oo0oO);
            this.f13249o00oo0O = obtainStyledAttributes.getBoolean(getType().getDotsClickableId(), true);
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ o00oOOoO(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final boolean getDotsClickable() {
        return this.f13249o00oo0O;
    }

    public final int getDotsColor() {
        return this.f13251o00oo0Oo;
    }

    public final float getDotsCornerRadius() {
        return this.f13252o00oo0o;
    }

    public final float getDotsSize() {
        return this.f13253o00oo0o0;
    }

    public final float getDotsSpacing() {
        return this.f13254o00oo0oO;
    }

    @Nullable
    public final InterfaceC0164o00oOOoO getPager() {
        return this.f13255o0O0o;
    }

    @NotNull
    public abstract o00oOo00 getType();

    public void o00oOOo0() {
        HashMap hashMap = this.f13248o00oo;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View o00oOOoO(int i) {
        if (this.f13248o00oo == null) {
            this.f13248o00oo = new HashMap();
        }
        View view = (View) this.f13248o00oo.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this.f13248o00oo.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public abstract void o00oOo0o(int i);

    @NotNull
    public abstract o0OO0o0O.o00oo00O o00oOoO();

    public final void o00oOoO0(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            o00oOo0o(i2);
        }
    }

    public final int o00oOoOO(int i) {
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        Resources resources = context.getResources();
        o0ooO.o00oo0OO(resources, "context.resources");
        return (int) (resources.getDisplayMetrics().density * i);
    }

    public final float o00oOoOo(float f) {
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        Resources resources = context.getResources();
        o0ooO.o00oo0OO(resources, "context.resources");
        return resources.getDisplayMetrics().density * f;
    }

    public final int o00oOoo0(@NotNull Context context) {
        o0ooO.o00oo0O0(context, "$this$getThemePrimaryColor");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    public final boolean o00oOooo(@Nullable ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            oo0OOoo.o00oOOo0 adapter = viewPager.getAdapter();
            o0ooO.o00oo00O(adapter);
            o0ooO.o00oo0OO(adapter, "adapter!!");
            if (adapter.o00oOo0O() == 0) {
                return true;
            }
        }
        return false;
    }

    public abstract void o00oo(int i);

    public final <T> boolean o00oo0(@NotNull ArrayList<T> arrayList, int i) {
        o0ooO.o00oo0O0(arrayList, "$this$isInBounds");
        return i >= 0 && arrayList.size() > i;
    }

    public final boolean o00oo00O(@Nullable ViewPager2 viewPager2) {
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            RecyclerView.o00oo0OO adapter = viewPager2.getAdapter();
            o0ooO.o00oo00O(adapter);
            o0ooO.o00oo0OO(adapter, "adapter!!");
            if (adapter.getItemCount() == 0) {
                return true;
            }
        }
        return false;
    }

    public abstract void o00oo0O(int i);

    public final boolean o00oo0O0(@NotNull ViewPager2 viewPager2) {
        o0ooO.o00oo0O0(viewPager2, "$this$isNotEmpty");
        RecyclerView.o00oo0OO adapter = viewPager2.getAdapter();
        o0ooO.o00oo00O(adapter);
        o0ooO.o00oo0OO(adapter, "adapter!!");
        return adapter.getItemCount() > 0;
    }

    public final boolean o00oo0OO(@NotNull ViewPager viewPager) {
        o0ooO.o00oo0O0(viewPager, "$this$isNotEmpty");
        oo0OOoo.o00oOOo0 adapter = viewPager.getAdapter();
        o0ooO.o00oo00O(adapter);
        o0ooO.o00oo0OO(adapter, "adapter!!");
        return adapter.o00oOo0O() > 0;
    }

    public final void o00oo0Oo() {
        if (this.f13255o0O0o == null) {
            return;
        }
        post(new o00oOo0O());
    }

    public final void o00oo0o() {
        int size = this.f13250o00oo0O0.size();
        InterfaceC0164o00oOOoO interfaceC0164o00oOOoO = this.f13255o0O0o;
        o0ooO.o00oo00O(interfaceC0164o00oOOoO);
        if (size < interfaceC0164o00oOOoO.getCount()) {
            InterfaceC0164o00oOOoO interfaceC0164o00oOOoO2 = this.f13255o0O0o;
            o0ooO.o00oo00O(interfaceC0164o00oOOoO2);
            o00oOoO0(interfaceC0164o00oOOoO2.getCount() - this.f13250o00oo0O0.size());
            return;
        }
        int size2 = this.f13250o00oo0O0.size();
        InterfaceC0164o00oOOoO interfaceC0164o00oOOoO3 = this.f13255o0O0o;
        o0ooO.o00oo00O(interfaceC0164o00oOOoO3);
        if (size2 > interfaceC0164o00oOOoO3.getCount()) {
            int size3 = this.f13250o00oo0O0.size();
            InterfaceC0164o00oOOoO interfaceC0164o00oOOoO4 = this.f13255o0O0o;
            o0ooO.o00oo00O(interfaceC0164o00oOOoO4);
            o00ooO00(size3 - interfaceC0164o00oOOoO4.getCount());
        }
    }

    public final void o00oo0o0() {
        int size = this.f13250o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            o00oo0O(i);
        }
    }

    public final void o00oo0oO() {
        InterfaceC0164o00oOOoO interfaceC0164o00oOOoO = this.f13255o0O0o;
        o0ooO.o00oo00O(interfaceC0164o00oOOoO);
        int o00oOOoO2 = interfaceC0164o00oOOoO.o00oOOoO();
        for (int i = 0; i < o00oOOoO2; i++) {
            ImageView imageView = this.f13250o00oo0O0.get(i);
            o0ooO.o00oo0OO(imageView, "dots[i]");
            o00ooO0(imageView, (int) this.f13253o00oo0o0);
        }
    }

    public final void o00ooO0(@NotNull View view, int i) {
        o0ooO.o00oo0O0(view, "$this$setWidth");
        view.getLayoutParams().width = i;
        view.requestLayout();
    }

    public final void o00ooO00(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            o00oo(i2);
        }
    }

    public final void o0O0o() {
        InterfaceC0164o00oOOoO interfaceC0164o00oOOoO = this.f13255o0O0o;
        o0ooO.o00oo00O(interfaceC0164o00oOOoO);
        if (interfaceC0164o00oOOoO.o00oOo00()) {
            InterfaceC0164o00oOOoO interfaceC0164o00oOOoO2 = this.f13255o0O0o;
            o0ooO.o00oo00O(interfaceC0164o00oOOoO2);
            interfaceC0164o00oOOoO2.o00oOo0O();
            o0OO0o0O.o00oo00O o00oOoO2 = o00oOoO();
            InterfaceC0164o00oOOoO interfaceC0164o00oOOoO3 = this.f13255o0O0o;
            o0ooO.o00oo00O(interfaceC0164o00oOOoO3);
            interfaceC0164o00oOOoO3.o00oOooO(o00oOoO2);
            InterfaceC0164o00oOOoO interfaceC0164o00oOOoO4 = this.f13255o0O0o;
            o0ooO.o00oo00O(interfaceC0164o00oOOoO4);
            o00oOoO2.o00oOOoO(interfaceC0164o00oOOoO4.o00oOOoO(), 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00oo0Oo();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    public final void setDotsClickable(boolean z) {
        this.f13249o00oo0O = z;
    }

    public final void setDotsColor(int i) {
        this.f13251o00oo0Oo = i;
        o00oo0o0();
    }

    public final void setDotsCornerRadius(float f) {
        this.f13252o00oo0o = f;
    }

    public final void setDotsSize(float f) {
        this.f13253o00oo0o0 = f;
    }

    public final void setDotsSpacing(float f) {
        this.f13254o00oo0oO = f;
    }

    public final void setPager(@Nullable InterfaceC0164o00oOOoO interfaceC0164o00oOOoO) {
        this.f13255o0O0o = interfaceC0164o00oOOoO;
    }

    @o0O0o(message = "Use setDotsColors() instead")
    public final void setPointsColor(int i) {
        setDotsColor(i);
        o00oo0o0();
    }

    public final void setViewPager(@NotNull ViewPager viewPager) {
        o0ooO.o00oo0O0(viewPager, "viewPager");
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
        }
        oo0OOoo.o00oOOo0 adapter = viewPager.getAdapter();
        o0ooO.o00oo00O(adapter);
        adapter.o00oo00O(new o00oOoO());
        this.f13255o0O0o = new o00oo00O(viewPager);
        o00oo0Oo();
    }

    public final void setViewPager2(@NotNull ViewPager2 viewPager2) {
        o0ooO.o00oo0O0(viewPager2, "viewPager2");
        if (viewPager2.getAdapter() == null) {
            throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
        }
        RecyclerView.o00oo0OO adapter = viewPager2.getAdapter();
        o0ooO.o00oo00O(adapter);
        adapter.registerAdapterDataObserver(new o00oo0());
        this.f13255o0O0o = new o00oo0OO(viewPager2);
        o00oo0Oo();
    }
}
