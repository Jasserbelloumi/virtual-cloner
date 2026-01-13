package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooO.o00oOoO;
import o00ooOO0.o0O00000;
import o00ooOOo.oO0000Oo;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.o00oOOoO> mConstraintHelpers;
    public androidx.constraintlayout.widget.o00oOo00 mConstraintLayoutSpec;
    private o00oOoO mConstraintSet;
    private int mConstraintSetId;
    private oO0000Oo mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public o00ooO.o00oo00O mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    public o00oOo00 mMeasurer;
    private o00ooO0.o00oo0 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<o00ooO.o00oOoO> mTempMapIdToWidget;

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f1774o00oOOo0;

        static {
            int[] iArr = new int[o00oOoO.o00oOOoO.values().length];
            f1774o00oOOo0 = iArr;
            try {
                iArr[o00oOoO.o00oOOoO.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1774o00oOOo0[o00oOoO.o00oOOoO.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1774o00oOOo0[o00oOoO.o00oOOoO.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1774o00oOOo0[o00oOoO.o00oOOoO.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends ViewGroup.MarginLayoutParams {

        /* renamed from: o0O00OoO  reason: collision with root package name */
        public static final int f1775o0O00OoO = 0;

        /* renamed from: o0O00Ooo  reason: collision with root package name */
        public static final int f1776o0O00Ooo = -1;

        /* renamed from: o0O00o  reason: collision with root package name */
        public static final int f1777o0O00o = 2;

        /* renamed from: o0O00o00  reason: collision with root package name */
        public static final int f1778o0O00o00 = 0;

        /* renamed from: o0O00o0O  reason: collision with root package name */
        public static final int f1779o0O00o0O = 1;

        /* renamed from: o0O00o0o  reason: collision with root package name */
        public static final int f1780o0O00o0o = 1;

        /* renamed from: o0O00oO0  reason: collision with root package name */
        public static final int f1781o0O00oO0 = 3;

        /* renamed from: o0O0O0O  reason: collision with root package name */
        public static final int f1782o0O0O0O = 4;

        /* renamed from: o0O0O0Oo  reason: collision with root package name */
        public static final int f1783o0O0O0Oo = 7;

        /* renamed from: o0O0O0o  reason: collision with root package name */
        public static final int f1784o0O0O0o = 0;

        /* renamed from: o0O0O0o0  reason: collision with root package name */
        public static final int f1785o0O0O0o0 = 1;

        /* renamed from: o0O0O0oO  reason: collision with root package name */
        public static final int f1786o0O0O0oO = 2;

        /* renamed from: o0O0O0oo  reason: collision with root package name */
        public static final int f1787o0O0O0oo = 0;

        /* renamed from: o0O0OO0  reason: collision with root package name */
        public static final int f1788o0O0OO0 = 2;

        /* renamed from: o0O0oo0o  reason: collision with root package name */
        public static final int f1789o0O0oo0o = 6;

        /* renamed from: o0oO0O0o  reason: collision with root package name */
        public static final int f1790o0oO0O0o = 5;

        /* renamed from: o0oO0Ooo  reason: collision with root package name */
        public static final int f1791o0oO0Ooo = 0;

        /* renamed from: o0ooO  reason: collision with root package name */
        public static final int f1792o0ooO = 1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1793o0;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f1794o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f1795o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f1796o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f1797o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f1798o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f1799o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f1800o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f1801o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f1802o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f1803o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f1804o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int f1805o00oOooo;

        /* renamed from: o00oo  reason: collision with root package name */
        public int f1806o00oo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public int f1807o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f1808o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f1809o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f1810o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public float f1811o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f1812o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f1813o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f1814o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public int f1815o00oo0oO;

        /* renamed from: o00ooO  reason: collision with root package name */
        public String f1816o00ooO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public int f1817o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public int f1818o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public float f1819o00ooO0O;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public float f1820o00ooO0o;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public int f1821o00ooOO;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public float f1822o00ooOO0;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public float f1823o00ooOOo;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public int f1824o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public float f1825o00ooOo0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public int f1826o00ooOoO;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public int f1827o00ooOoo;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public int f1828o00ooo0;

        /* renamed from: o00ooo00  reason: collision with root package name */
        public int f1829o00ooo00;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public int f1830o00ooo0O;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public int f1831o00ooo0o;

        /* renamed from: o00oooO  reason: collision with root package name */
        public int f1832o00oooO;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public float f1833o00oooOO;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public float f1834o00oooOo;

        /* renamed from: o00oooo  reason: collision with root package name */
        public int f1835o00oooo;

        /* renamed from: o00oooo0  reason: collision with root package name */
        public int f1836o00oooo0;

        /* renamed from: o00ooooO  reason: collision with root package name */
        public int f1837o00ooooO;

        /* renamed from: o00ooooo  reason: collision with root package name */
        public boolean f1838o00ooooo;

        /* renamed from: o0O00  reason: collision with root package name */
        public int f1839o0O00;

        /* renamed from: o0O000  reason: collision with root package name */
        public boolean f1840o0O000;

        /* renamed from: o0O00000  reason: collision with root package name */
        public String f1841o0O00000;

        /* renamed from: o0O0000O  reason: collision with root package name */
        public boolean f1842o0O0000O;

        /* renamed from: o0O0000o  reason: collision with root package name */
        public boolean f1843o0O0000o;

        /* renamed from: o0O000O  reason: collision with root package name */
        public boolean f1844o0O000O;

        /* renamed from: o0O000Oo  reason: collision with root package name */
        public boolean f1845o0O000Oo;

        /* renamed from: o0O000o  reason: collision with root package name */
        public int f1846o0O000o;

        /* renamed from: o0O000o0  reason: collision with root package name */
        public int f1847o0O000o0;

        /* renamed from: o0O000oo  reason: collision with root package name */
        public int f1848o0O000oo;

        /* renamed from: o0O00O  reason: collision with root package name */
        public int f1849o0O00O;

        /* renamed from: o0O00O0  reason: collision with root package name */
        public int f1850o0O00O0;

        /* renamed from: o0O00O0o  reason: collision with root package name */
        public int f1851o0O00O0o;

        /* renamed from: o0O00OO  reason: collision with root package name */
        public float f1852o0O00OO;

        /* renamed from: o0O00OOO  reason: collision with root package name */
        public o00ooO.o00oOoO f1853o0O00OOO;

        /* renamed from: o0O00Oo  reason: collision with root package name */
        public boolean f1854o0O00Oo;

        /* renamed from: o0O0o  reason: collision with root package name */
        public int f1855o0O0o;

        /* renamed from: o0OoO00O  reason: collision with root package name */
        public float f1856o0OoO00O;

        /* renamed from: o0OoOoOO  reason: collision with root package name */
        public boolean f1857o0OoOoOO;

        /* renamed from: o0OoOoOo  reason: collision with root package name */
        public boolean f1858o0OoOoOo;

        /* renamed from: o0ooOoOO  reason: collision with root package name */
        public int f1859o0ooOoOO;

        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o0  reason: collision with root package name */
            public static final int f1860o0 = 46;

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final int f1861o00oOOo0 = 0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public static final int f1862o00oOOoO = 1;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public static final int f1863o00oOo00 = 2;

            /* renamed from: o00oOo0O  reason: collision with root package name */
            public static final int f1864o00oOo0O = 4;

            /* renamed from: o00oOo0o  reason: collision with root package name */
            public static final int f1865o00oOo0o = 5;

            /* renamed from: o00oOoO  reason: collision with root package name */
            public static final int f1866o00oOoO = 7;

            /* renamed from: o00oOoO0  reason: collision with root package name */
            public static final int f1867o00oOoO0 = 6;

            /* renamed from: o00oOoOO  reason: collision with root package name */
            public static final int f1868o00oOoOO = 8;

            /* renamed from: o00oOoOo  reason: collision with root package name */
            public static final int f1869o00oOoOo = 9;

            /* renamed from: o00oOoo0  reason: collision with root package name */
            public static final int f1870o00oOoo0 = 10;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public static final int f1871o00oOooO = 3;

            /* renamed from: o00oOooo  reason: collision with root package name */
            public static final int f1872o00oOooo = 11;

            /* renamed from: o00oo  reason: collision with root package name */
            public static final int f1873o00oo = 22;

            /* renamed from: o00oo0  reason: collision with root package name */
            public static final int f1874o00oo0 = 13;

            /* renamed from: o00oo00O  reason: collision with root package name */
            public static final int f1875o00oo00O = 12;

            /* renamed from: o00oo0O  reason: collision with root package name */
            public static final int f1876o00oo0O = 16;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public static final int f1877o00oo0O0 = 15;

            /* renamed from: o00oo0OO  reason: collision with root package name */
            public static final int f1878o00oo0OO = 14;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public static final int f1879o00oo0Oo = 17;

            /* renamed from: o00oo0o  reason: collision with root package name */
            public static final int f1880o00oo0o = 19;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public static final int f1881o00oo0o0 = 18;

            /* renamed from: o00oo0oO  reason: collision with root package name */
            public static final int f1882o00oo0oO = 20;

            /* renamed from: o00ooO  reason: collision with root package name */
            public static final int f1883o00ooO = 27;

            /* renamed from: o00ooO0  reason: collision with root package name */
            public static final int f1884o00ooO0 = 24;

            /* renamed from: o00ooO00  reason: collision with root package name */
            public static final int f1885o00ooO00 = 23;

            /* renamed from: o00ooO0O  reason: collision with root package name */
            public static final int f1886o00ooO0O = 25;

            /* renamed from: o00ooO0o  reason: collision with root package name */
            public static final int f1887o00ooO0o = 26;

            /* renamed from: o00ooOO  reason: collision with root package name */
            public static final int f1888o00ooOO = 29;

            /* renamed from: o00ooOO0  reason: collision with root package name */
            public static final int f1889o00ooOO0 = 28;

            /* renamed from: o00ooOOo  reason: collision with root package name */
            public static final int f1890o00ooOOo = 30;

            /* renamed from: o00ooOo  reason: collision with root package name */
            public static final int f1891o00ooOo = 32;

            /* renamed from: o00ooOo0  reason: collision with root package name */
            public static final int f1892o00ooOo0 = 31;

            /* renamed from: o00ooOoO  reason: collision with root package name */
            public static final int f1893o00ooOoO = 33;

            /* renamed from: o00ooOoo  reason: collision with root package name */
            public static final int f1894o00ooOoo = 34;

            /* renamed from: o00ooo0  reason: collision with root package name */
            public static final int f1895o00ooo0 = 36;

            /* renamed from: o00ooo00  reason: collision with root package name */
            public static final int f1896o00ooo00 = 35;

            /* renamed from: o00ooo0O  reason: collision with root package name */
            public static final int f1897o00ooo0O = 37;

            /* renamed from: o00ooo0o  reason: collision with root package name */
            public static final int f1898o00ooo0o = 38;

            /* renamed from: o00oooO  reason: collision with root package name */
            public static final int f1899o00oooO = 39;

            /* renamed from: o00oooOO  reason: collision with root package name */
            public static final int f1900o00oooOO = 40;

            /* renamed from: o00oooOo  reason: collision with root package name */
            public static final int f1901o00oooOo = 41;

            /* renamed from: o00oooo  reason: collision with root package name */
            public static final int f1902o00oooo = 43;

            /* renamed from: o00oooo0  reason: collision with root package name */
            public static final int f1903o00oooo0 = 42;

            /* renamed from: o00ooooO  reason: collision with root package name */
            public static final int f1904o00ooooO = 44;

            /* renamed from: o00ooooo  reason: collision with root package name */
            public static final int f1905o00ooooo = 45;

            /* renamed from: o0O000  reason: collision with root package name */
            public static final int f1906o0O000 = 50;

            /* renamed from: o0O00000  reason: collision with root package name */
            public static final int f1907o0O00000 = 47;

            /* renamed from: o0O0000O  reason: collision with root package name */
            public static final int f1908o0O0000O = 48;

            /* renamed from: o0O0000o  reason: collision with root package name */
            public static final int f1909o0O0000o = 49;

            /* renamed from: o0O000O  reason: collision with root package name */
            public static final int f1910o0O000O = 51;

            /* renamed from: o0O0o  reason: collision with root package name */
            public static final int f1911o0O0o = 21;

            /* renamed from: o0OoOoOo  reason: collision with root package name */
            public static final SparseIntArray f1912o0OoOoOo;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1912o0OoOoOo = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public o00oOOoO(int i, int i2) {
            super(i, i2);
            this.f1794o00oOOo0 = -1;
            this.f1795o00oOOoO = -1;
            this.f1796o00oOo00 = -1.0f;
            this.f1804o00oOooO = -1;
            this.f1797o00oOo0O = -1;
            this.f1798o00oOo0o = -1;
            this.f1800o00oOoO0 = -1;
            this.f1799o00oOoO = -1;
            this.f1801o00oOoOO = -1;
            this.f1802o00oOoOo = -1;
            this.f1803o00oOoo0 = -1;
            this.f1805o00oOooo = -1;
            this.f1808o00oo00O = -1;
            this.f1807o00oo0 = 0;
            this.f1811o00oo0OO = 0.0f;
            this.f1810o00oo0O0 = -1;
            this.f1809o00oo0O = -1;
            this.f1812o00oo0Oo = -1;
            this.f1814o00oo0o0 = -1;
            this.f1813o00oo0o = -1;
            this.f1815o00oo0oO = -1;
            this.f1855o0O0o = -1;
            this.f1806o00oo = -1;
            this.f1818o00ooO00 = -1;
            this.f1817o00ooO0 = -1;
            this.f1819o00ooO0O = 0.5f;
            this.f1820o00ooO0o = 0.5f;
            this.f1816o00ooO = null;
            this.f1822o00ooOO0 = 0.0f;
            this.f1821o00ooOO = 1;
            this.f1823o00ooOOo = -1.0f;
            this.f1825o00ooOo0 = -1.0f;
            this.f1824o00ooOo = 0;
            this.f1826o00ooOoO = 0;
            this.f1827o00ooOoo = 0;
            this.f1829o00ooo00 = 0;
            this.f1828o00ooo0 = 0;
            this.f1830o00ooo0O = 0;
            this.f1831o00ooo0o = 0;
            this.f1832o00oooO = 0;
            this.f1833o00oooOO = 1.0f;
            this.f1834o00oooOo = 1.0f;
            this.f1836o00oooo0 = -1;
            this.f1835o00oooo = -1;
            this.f1837o00ooooO = -1;
            this.f1838o00ooooo = false;
            this.f1793o0 = false;
            this.f1841o0O00000 = null;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            this.f1840o0O000 = false;
            this.f1844o0O000O = false;
            this.f1858o0OoOoOo = false;
            this.f1845o0O000Oo = false;
            this.f1857o0OoOoOO = false;
            this.f1847o0O000o0 = -1;
            this.f1846o0O000o = -1;
            this.f1859o0ooOoOO = -1;
            this.f1848o0O000oo = -1;
            this.f1839o0O00 = -1;
            this.f1850o0O00O0 = -1;
            this.f1856o0OoO00O = 0.5f;
            this.f1853o0O00OOO = new o00ooO.o00oOoO();
            this.f1854o0O00Oo = false;
        }

        public o00oOOoO(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            float parseFloat;
            this.f1794o00oOOo0 = -1;
            this.f1795o00oOOoO = -1;
            this.f1796o00oOo00 = -1.0f;
            this.f1804o00oOooO = -1;
            this.f1797o00oOo0O = -1;
            this.f1798o00oOo0o = -1;
            this.f1800o00oOoO0 = -1;
            this.f1799o00oOoO = -1;
            this.f1801o00oOoOO = -1;
            this.f1802o00oOoOo = -1;
            this.f1803o00oOoo0 = -1;
            this.f1805o00oOooo = -1;
            this.f1808o00oo00O = -1;
            this.f1807o00oo0 = 0;
            this.f1811o00oo0OO = 0.0f;
            this.f1810o00oo0O0 = -1;
            this.f1809o00oo0O = -1;
            this.f1812o00oo0Oo = -1;
            this.f1814o00oo0o0 = -1;
            this.f1813o00oo0o = -1;
            this.f1815o00oo0oO = -1;
            this.f1855o0O0o = -1;
            this.f1806o00oo = -1;
            this.f1818o00ooO00 = -1;
            this.f1817o00ooO0 = -1;
            this.f1819o00ooO0O = 0.5f;
            this.f1820o00ooO0o = 0.5f;
            this.f1816o00ooO = null;
            this.f1822o00ooOO0 = 0.0f;
            this.f1821o00ooOO = 1;
            this.f1823o00ooOOo = -1.0f;
            this.f1825o00ooOo0 = -1.0f;
            this.f1824o00ooOo = 0;
            this.f1826o00ooOoO = 0;
            this.f1827o00ooOoo = 0;
            this.f1829o00ooo00 = 0;
            this.f1828o00ooo0 = 0;
            this.f1830o00ooo0O = 0;
            this.f1831o00ooo0o = 0;
            this.f1832o00oooO = 0;
            this.f1833o00oooOO = 1.0f;
            this.f1834o00oooOo = 1.0f;
            this.f1836o00oooo0 = -1;
            this.f1835o00oooo = -1;
            this.f1837o00ooooO = -1;
            this.f1838o00ooooo = false;
            this.f1793o0 = false;
            this.f1841o0O00000 = null;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            this.f1840o0O000 = false;
            this.f1844o0O000O = false;
            this.f1858o0OoOoOo = false;
            this.f1845o0O000Oo = false;
            this.f1857o0OoOoOO = false;
            this.f1847o0O000o0 = -1;
            this.f1846o0O000o = -1;
            this.f1859o0ooOoOO = -1;
            this.f1848o0O000oo = -1;
            this.f1839o0O00 = -1;
            this.f1850o0O00O0 = -1;
            this.f1856o0OoO00O = 0.5f;
            this.f1853o0O00OOO = new o00ooO.o00oOoO();
            this.f1854o0O00Oo = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = o00oOOo0.f1912o0OoOoOo.get(index);
                switch (i3) {
                    case 1:
                        this.f1837o00ooooO = obtainStyledAttributes.getInt(index, this.f1837o00ooooO);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1808o00oo00O);
                        this.f1808o00oo00O = resourceId;
                        if (resourceId == -1) {
                            this.f1808o00oo00O = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1807o00oo0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1807o00oo0);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1811o00oo0OO) % 360.0f;
                        this.f1811o00oo0OO = f;
                        if (f < 0.0f) {
                            this.f1811o00oo0OO = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1794o00oOOo0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1794o00oOOo0);
                        break;
                    case 6:
                        this.f1795o00oOOoO = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1795o00oOOoO);
                        break;
                    case 7:
                        this.f1796o00oOo00 = obtainStyledAttributes.getFloat(index, this.f1796o00oOo00);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1804o00oOooO);
                        this.f1804o00oOooO = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1804o00oOooO = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1797o00oOo0O);
                        this.f1797o00oOo0O = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1797o00oOo0O = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1798o00oOo0o);
                        this.f1798o00oOo0o = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1798o00oOo0o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1800o00oOoO0);
                        this.f1800o00oOoO0 = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1800o00oOoO0 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1799o00oOoO);
                        this.f1799o00oOoO = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1799o00oOoO = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1801o00oOoOO);
                        this.f1801o00oOoOO = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1801o00oOoOO = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1802o00oOoOo);
                        this.f1802o00oOoOo = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1802o00oOoOo = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1803o00oOoo0);
                        this.f1803o00oOoo0 = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1803o00oOoo0 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1805o00oOooo);
                        this.f1805o00oOooo = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1805o00oOooo = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1810o00oo0O0);
                        this.f1810o00oo0O0 = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1810o00oo0O0 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1809o00oo0O);
                        this.f1809o00oo0O = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1809o00oo0O = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1812o00oo0Oo);
                        this.f1812o00oo0Oo = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1812o00oo0Oo = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1814o00oo0o0);
                        this.f1814o00oo0o0 = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1814o00oo0o0 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1813o00oo0o = obtainStyledAttributes.getDimensionPixelSize(index, this.f1813o00oo0o);
                        break;
                    case 22:
                        this.f1815o00oo0oO = obtainStyledAttributes.getDimensionPixelSize(index, this.f1815o00oo0oO);
                        break;
                    case 23:
                        this.f1855o0O0o = obtainStyledAttributes.getDimensionPixelSize(index, this.f1855o0O0o);
                        break;
                    case 24:
                        this.f1806o00oo = obtainStyledAttributes.getDimensionPixelSize(index, this.f1806o00oo);
                        break;
                    case 25:
                        this.f1818o00ooO00 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1818o00ooO00);
                        break;
                    case 26:
                        this.f1817o00ooO0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1817o00ooO0);
                        break;
                    case 27:
                        this.f1838o00ooooo = obtainStyledAttributes.getBoolean(index, this.f1838o00ooooo);
                        break;
                    case 28:
                        this.f1793o0 = obtainStyledAttributes.getBoolean(index, this.f1793o0);
                        break;
                    case 29:
                        this.f1819o00ooO0O = obtainStyledAttributes.getFloat(index, this.f1819o00ooO0O);
                        break;
                    case 30:
                        this.f1820o00ooO0o = obtainStyledAttributes.getFloat(index, this.f1820o00ooO0o);
                        break;
                    case 31:
                        this.f1827o00ooOoo = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f1829o00ooo00 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f1828o00ooo0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1828o00ooo0);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1828o00ooo0) == -2) {
                                this.f1828o00ooo0 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1831o00ooo0o = obtainStyledAttributes.getDimensionPixelSize(index, this.f1831o00ooo0o);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1831o00ooo0o) == -2) {
                                this.f1831o00ooo0o = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f1833o00oooOO = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1833o00oooOO));
                        this.f1827o00ooOoo = 2;
                        break;
                    case 36:
                        try {
                            this.f1830o00ooo0O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1830o00ooo0O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1830o00ooo0O) == -2) {
                                this.f1830o00ooo0O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1832o00oooO = obtainStyledAttributes.getDimensionPixelSize(index, this.f1832o00oooO);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1832o00oooO) == -2) {
                                this.f1832o00oooO = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f1834o00oooOo = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1834o00oooOo));
                        this.f1829o00ooo00 = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1816o00ooO = string;
                                this.f1822o00ooOO0 = Float.NaN;
                                this.f1821o00ooOO = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f1816o00ooO.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f1816o00ooO.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1821o00ooOO = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1821o00ooOO = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1816o00ooO.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f1816o00ooO.substring(i, indexOf2);
                                        String substring3 = this.f1816o00ooO.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f1821o00ooOO == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f1816o00ooO.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.f1822o00ooOO0 = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f1823o00ooOOo = obtainStyledAttributes.getFloat(index, this.f1823o00ooOOo);
                                continue;
                            case 46:
                                this.f1825o00ooOo0 = obtainStyledAttributes.getFloat(index, this.f1825o00ooOo0);
                                continue;
                            case 47:
                                this.f1824o00ooOo = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f1826o00ooOoO = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f1836o00oooo0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1836o00oooo0);
                                continue;
                            case 50:
                                this.f1835o00oooo = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1835o00oooo);
                                continue;
                            case 51:
                                this.f1841o0O00000 = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            o00oOo0O();
        }

        public o00oOOoO(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1794o00oOOo0 = -1;
            this.f1795o00oOOoO = -1;
            this.f1796o00oOo00 = -1.0f;
            this.f1804o00oOooO = -1;
            this.f1797o00oOo0O = -1;
            this.f1798o00oOo0o = -1;
            this.f1800o00oOoO0 = -1;
            this.f1799o00oOoO = -1;
            this.f1801o00oOoOO = -1;
            this.f1802o00oOoOo = -1;
            this.f1803o00oOoo0 = -1;
            this.f1805o00oOooo = -1;
            this.f1808o00oo00O = -1;
            this.f1807o00oo0 = 0;
            this.f1811o00oo0OO = 0.0f;
            this.f1810o00oo0O0 = -1;
            this.f1809o00oo0O = -1;
            this.f1812o00oo0Oo = -1;
            this.f1814o00oo0o0 = -1;
            this.f1813o00oo0o = -1;
            this.f1815o00oo0oO = -1;
            this.f1855o0O0o = -1;
            this.f1806o00oo = -1;
            this.f1818o00ooO00 = -1;
            this.f1817o00ooO0 = -1;
            this.f1819o00ooO0O = 0.5f;
            this.f1820o00ooO0o = 0.5f;
            this.f1816o00ooO = null;
            this.f1822o00ooOO0 = 0.0f;
            this.f1821o00ooOO = 1;
            this.f1823o00ooOOo = -1.0f;
            this.f1825o00ooOo0 = -1.0f;
            this.f1824o00ooOo = 0;
            this.f1826o00ooOoO = 0;
            this.f1827o00ooOoo = 0;
            this.f1829o00ooo00 = 0;
            this.f1828o00ooo0 = 0;
            this.f1830o00ooo0O = 0;
            this.f1831o00ooo0o = 0;
            this.f1832o00oooO = 0;
            this.f1833o00oooOO = 1.0f;
            this.f1834o00oooOo = 1.0f;
            this.f1836o00oooo0 = -1;
            this.f1835o00oooo = -1;
            this.f1837o00ooooO = -1;
            this.f1838o00ooooo = false;
            this.f1793o0 = false;
            this.f1841o0O00000 = null;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            this.f1840o0O000 = false;
            this.f1844o0O000O = false;
            this.f1858o0OoOoOo = false;
            this.f1845o0O000Oo = false;
            this.f1857o0OoOoOO = false;
            this.f1847o0O000o0 = -1;
            this.f1846o0O000o = -1;
            this.f1859o0ooOoOO = -1;
            this.f1848o0O000oo = -1;
            this.f1839o0O00 = -1;
            this.f1850o0O00O0 = -1;
            this.f1856o0OoO00O = 0.5f;
            this.f1853o0O00OOO = new o00ooO.o00oOoO();
            this.f1854o0O00Oo = false;
        }

        public o00oOOoO(o00oOOoO o00ooooo2) {
            super((ViewGroup.MarginLayoutParams) o00ooooo2);
            this.f1794o00oOOo0 = -1;
            this.f1795o00oOOoO = -1;
            this.f1796o00oOo00 = -1.0f;
            this.f1804o00oOooO = -1;
            this.f1797o00oOo0O = -1;
            this.f1798o00oOo0o = -1;
            this.f1800o00oOoO0 = -1;
            this.f1799o00oOoO = -1;
            this.f1801o00oOoOO = -1;
            this.f1802o00oOoOo = -1;
            this.f1803o00oOoo0 = -1;
            this.f1805o00oOooo = -1;
            this.f1808o00oo00O = -1;
            this.f1807o00oo0 = 0;
            this.f1811o00oo0OO = 0.0f;
            this.f1810o00oo0O0 = -1;
            this.f1809o00oo0O = -1;
            this.f1812o00oo0Oo = -1;
            this.f1814o00oo0o0 = -1;
            this.f1813o00oo0o = -1;
            this.f1815o00oo0oO = -1;
            this.f1855o0O0o = -1;
            this.f1806o00oo = -1;
            this.f1818o00ooO00 = -1;
            this.f1817o00ooO0 = -1;
            this.f1819o00ooO0O = 0.5f;
            this.f1820o00ooO0o = 0.5f;
            this.f1816o00ooO = null;
            this.f1822o00ooOO0 = 0.0f;
            this.f1821o00ooOO = 1;
            this.f1823o00ooOOo = -1.0f;
            this.f1825o00ooOo0 = -1.0f;
            this.f1824o00ooOo = 0;
            this.f1826o00ooOoO = 0;
            this.f1827o00ooOoo = 0;
            this.f1829o00ooo00 = 0;
            this.f1828o00ooo0 = 0;
            this.f1830o00ooo0O = 0;
            this.f1831o00ooo0o = 0;
            this.f1832o00oooO = 0;
            this.f1833o00oooOO = 1.0f;
            this.f1834o00oooOo = 1.0f;
            this.f1836o00oooo0 = -1;
            this.f1835o00oooo = -1;
            this.f1837o00ooooO = -1;
            this.f1838o00ooooo = false;
            this.f1793o0 = false;
            this.f1841o0O00000 = null;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            this.f1840o0O000 = false;
            this.f1844o0O000O = false;
            this.f1858o0OoOoOo = false;
            this.f1845o0O000Oo = false;
            this.f1857o0OoOoOO = false;
            this.f1847o0O000o0 = -1;
            this.f1846o0O000o = -1;
            this.f1859o0ooOoOO = -1;
            this.f1848o0O000oo = -1;
            this.f1839o0O00 = -1;
            this.f1850o0O00O0 = -1;
            this.f1856o0OoO00O = 0.5f;
            this.f1853o0O00OOO = new o00ooO.o00oOoO();
            this.f1854o0O00Oo = false;
            this.f1794o00oOOo0 = o00ooooo2.f1794o00oOOo0;
            this.f1795o00oOOoO = o00ooooo2.f1795o00oOOoO;
            this.f1796o00oOo00 = o00ooooo2.f1796o00oOo00;
            this.f1804o00oOooO = o00ooooo2.f1804o00oOooO;
            this.f1797o00oOo0O = o00ooooo2.f1797o00oOo0O;
            this.f1798o00oOo0o = o00ooooo2.f1798o00oOo0o;
            this.f1800o00oOoO0 = o00ooooo2.f1800o00oOoO0;
            this.f1799o00oOoO = o00ooooo2.f1799o00oOoO;
            this.f1801o00oOoOO = o00ooooo2.f1801o00oOoOO;
            this.f1802o00oOoOo = o00ooooo2.f1802o00oOoOo;
            this.f1803o00oOoo0 = o00ooooo2.f1803o00oOoo0;
            this.f1805o00oOooo = o00ooooo2.f1805o00oOooo;
            this.f1808o00oo00O = o00ooooo2.f1808o00oo00O;
            this.f1807o00oo0 = o00ooooo2.f1807o00oo0;
            this.f1811o00oo0OO = o00ooooo2.f1811o00oo0OO;
            this.f1810o00oo0O0 = o00ooooo2.f1810o00oo0O0;
            this.f1809o00oo0O = o00ooooo2.f1809o00oo0O;
            this.f1812o00oo0Oo = o00ooooo2.f1812o00oo0Oo;
            this.f1814o00oo0o0 = o00ooooo2.f1814o00oo0o0;
            this.f1813o00oo0o = o00ooooo2.f1813o00oo0o;
            this.f1815o00oo0oO = o00ooooo2.f1815o00oo0oO;
            this.f1855o0O0o = o00ooooo2.f1855o0O0o;
            this.f1806o00oo = o00ooooo2.f1806o00oo;
            this.f1818o00ooO00 = o00ooooo2.f1818o00ooO00;
            this.f1817o00ooO0 = o00ooooo2.f1817o00ooO0;
            this.f1819o00ooO0O = o00ooooo2.f1819o00ooO0O;
            this.f1820o00ooO0o = o00ooooo2.f1820o00ooO0o;
            this.f1816o00ooO = o00ooooo2.f1816o00ooO;
            this.f1822o00ooOO0 = o00ooooo2.f1822o00ooOO0;
            this.f1821o00ooOO = o00ooooo2.f1821o00ooOO;
            this.f1823o00ooOOo = o00ooooo2.f1823o00ooOOo;
            this.f1825o00ooOo0 = o00ooooo2.f1825o00ooOo0;
            this.f1824o00ooOo = o00ooooo2.f1824o00ooOo;
            this.f1826o00ooOoO = o00ooooo2.f1826o00ooOoO;
            this.f1838o00ooooo = o00ooooo2.f1838o00ooooo;
            this.f1793o0 = o00ooooo2.f1793o0;
            this.f1827o00ooOoo = o00ooooo2.f1827o00ooOoo;
            this.f1829o00ooo00 = o00ooooo2.f1829o00ooo00;
            this.f1828o00ooo0 = o00ooooo2.f1828o00ooo0;
            this.f1831o00ooo0o = o00ooooo2.f1831o00ooo0o;
            this.f1830o00ooo0O = o00ooooo2.f1830o00ooo0O;
            this.f1832o00oooO = o00ooooo2.f1832o00oooO;
            this.f1833o00oooOO = o00ooooo2.f1833o00oooOO;
            this.f1834o00oooOo = o00ooooo2.f1834o00oooOo;
            this.f1836o00oooo0 = o00ooooo2.f1836o00oooo0;
            this.f1835o00oooo = o00ooooo2.f1835o00oooo;
            this.f1837o00ooooO = o00ooooo2.f1837o00ooooO;
            this.f1842o0O0000O = o00ooooo2.f1842o0O0000O;
            this.f1843o0O0000o = o00ooooo2.f1843o0O0000o;
            this.f1840o0O000 = o00ooooo2.f1840o0O000;
            this.f1844o0O000O = o00ooooo2.f1844o0O000O;
            this.f1847o0O000o0 = o00ooooo2.f1847o0O000o0;
            this.f1846o0O000o = o00ooooo2.f1846o0O000o;
            this.f1859o0ooOoOO = o00ooooo2.f1859o0ooOoOO;
            this.f1848o0O000oo = o00ooooo2.f1848o0O000oo;
            this.f1839o0O00 = o00ooooo2.f1839o0O00;
            this.f1850o0O00O0 = o00ooooo2.f1850o0O00O0;
            this.f1856o0OoO00O = o00ooooo2.f1856o0OoO00O;
            this.f1841o0O00000 = o00ooooo2.f1841o0O00000;
            this.f1853o0O00OOO = o00ooooo2.f1853o0O00OOO;
        }

        public String o00oOOo0() {
            return this.f1841o0O00000;
        }

        public o00ooO.o00oOoO o00oOOoO() {
            return this.f1853o0O00OOO;
        }

        public void o00oOo00() {
            o00ooO.o00oOoO o00oooo2 = this.f1853o0O00OOO;
            if (o00oooo2 != null) {
                o00oooo2.o0ooO();
            }
        }

        public void o00oOo0O() {
            this.f1844o0O000O = false;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f1838o00ooooo) {
                this.f1842o0O0000O = false;
                if (this.f1827o00ooOoo == 0) {
                    this.f1827o00ooOoo = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f1793o0) {
                this.f1843o0O0000o = false;
                if (this.f1829o00ooo00 == 0) {
                    this.f1829o00ooo00 = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1842o0O0000O = false;
                if (i == 0 && this.f1827o00ooOoo == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1838o00ooooo = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1843o0O0000o = false;
                if (i2 == 0 && this.f1829o00ooo00 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1793o0 = true;
                }
            }
            if (this.f1796o00oOo00 == -1.0f && this.f1794o00oOOo0 == -1 && this.f1795o00oOOoO == -1) {
                return;
            }
            this.f1844o0O000O = true;
            this.f1842o0O0000O = true;
            this.f1843o0O0000o = true;
            if (!(this.f1853o0O00OOO instanceof o00ooO.o00oo0OO)) {
                this.f1853o0O00OOO = new o00ooO.o00oo0OO();
            }
            ((o00ooO.o00oo0OO) this.f1853o0O00OOO).o0OO0o0O(this.f1837o00ooooO);
        }

        public void o00oOooO(String str) {
            this.f1853o0O00OOO.o0O0OOoo(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.o00oOOoO.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o0O00000.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ConstraintLayout f1913o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f1914o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f1915o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f1916o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f1917o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f1919o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f1920o00oOooO;

        public o00oOo00(ConstraintLayout constraintLayout) {
            this.f1913o00oOOo0 = constraintLayout;
        }

        @Override // o00ooOO0.o0O00000.o00oOOoO
        public final void o00oOOo0() {
            int childCount = this.f1913o00oOOo0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1913o00oOOo0.getChildAt(i);
                if (childAt instanceof o00oo0OO) {
                    ((o00oo0OO) childAt).o00oOOoO(this.f1913o00oOOo0);
                }
            }
            int size = this.f1913o00oOOo0.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.o00oOOoO) this.f1913o00oOOo0.mConstraintHelpers.get(i2)).o00oo0oO(this.f1913o00oOOo0);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
        @Override // o00ooOO0.o0O00000.o00oOOoO
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o00oOOoO(o00ooO.o00oOoO r18, o00ooOO0.o0O00000.o00oOOo0 r19) {
            /*
                Method dump skipped, instructions count: 722
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.o00oOo00.o00oOOoO(o00ooO.o00oOoO, o00ooOO0.o0O00000$o00oOOo0):void");
        }

        public void o00oOo00(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1914o00oOOoO = i3;
            this.f1915o00oOo00 = i4;
            this.f1920o00oOooO = i5;
            this.f1916o00oOo0O = i6;
            this.f1917o00oOo0o = i;
            this.f1919o00oOoO0 = i2;
        }

        public final boolean o00oOooO(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@oo0oO0 Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o00ooO.o00oo00O();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new o00oOo00(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o00ooO.o00oo00O();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new o00oOo00(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o00ooO.o00oo00O();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new o00oOo00(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o00ooO.o00oo00O();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new o00oOo00(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    private final o00ooO.o00oOoO getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((o00oOOoO) view.getLayoutParams()).f1853o0O00OOO;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.o0O0OOo(this);
        this.mLayoutWidget.o0OOO0o0(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o00oOoO o00oooo2 = new o00oOoO();
                        this.mConstraintSet = o00oooo2;
                        o00oooo2.o0O00OOO(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.o0OOO0oO(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            o00ooO.o00oOoO viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.o0ooO();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).o0O0OOoo(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof o00oo00O)) {
                    this.mConstraintSet = ((o00oo00O) childAt2).getConstraintSet();
                }
            }
        }
        o00oOoO o00oooo2 = this.mConstraintSet;
        if (o00oooo2 != null) {
            o00oooo2.o00oo0(this, true);
        }
        this.mLayoutWidget.o0OO00Oo();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).o00oo(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof o00oo0OO) {
                ((o00oo0OO) childAt3).o00oOo00(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            o00ooO.o00oOoO viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                o00oOOoO o00ooooo2 = (o00oOOoO) childAt5.getLayoutParams();
                this.mLayoutWidget.o00oOOo0(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, o00ooooo2, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r19, android.view.View r20, o00ooO.o00oOoO r21, androidx.constraintlayout.widget.ConstraintLayout.o00oOOoO r22, android.util.SparseArray<o00ooO.o00oOoO> r23) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, o00ooO.o00oOoO, androidx.constraintlayout.widget.ConstraintLayout$o00oOOoO, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oOOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.o00oOOoO> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).o0O0o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(o0.o00oOOo0.f6865o00oOo00);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(o00ooO0.o00oo0 o00oo0Var) {
        this.mMetrics = o00oo0Var;
        this.mLayoutWidget.o0OO0oO0(o00oo0Var);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public o00oOOoO generateDefaultLayoutParams() {
        return new o00oOOoO(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new o00oOOoO(layoutParams);
    }

    @Override // android.view.ViewGroup
    public o00oOOoO generateLayoutParams(AttributeSet attributeSet) {
        return new o00oOOoO(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.mDesignIds.get(str);
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.o0OOoooO();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final o00ooO.o00oOoO getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((o00oOOoO) view.getLayoutParams()).f1853o0O00OOO;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.o00oOo00(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            o00oOOoO o00ooooo2 = (o00oOOoO) childAt.getLayoutParams();
            o00ooO.o00oOoO o00oooo2 = o00ooooo2.f1853o0O00OOO;
            if ((childAt.getVisibility() != 8 || o00ooooo2.f1844o0O000O || o00ooooo2.f1858o0OoOoOo || o00ooooo2.f1857o0OoOoOO || isInEditMode) && !o00ooooo2.f1845o0O000Oo) {
                int o0O00O0o2 = o00oooo2.o0O00O0o();
                int o0O00O2 = o00oooo2.o0O00O();
                int o0OoO00O2 = o00oooo2.o0OoO00O() + o0O00O0o2;
                int o00ooOO2 = o00oooo2.o00ooOO() + o0O00O2;
                childAt.layout(o0O00O0o2, o0O00O2, o0OoO00O2, o00ooOO2);
                if ((childAt instanceof o00oo0OO) && (content = ((o00oo0OO) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o0O00O0o2, o0O00O2, o0OoO00O2, o00ooOO2);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).o00oo0o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 != i || this.mOnMeasureHeightMeasureSpec != i2) {
                if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.o00ooOO()) {
                    this.mOnMeasureWidthMeasureSpec = i;
                    this.mOnMeasureHeightMeasureSpec = i2;
                }
            }
            resolveMeasuredDimension(i, i2, this.mLayoutWidget.o0OoO00O(), this.mLayoutWidget.o00ooOO(), this.mLayoutWidget.o0OOO0(), this.mLayoutWidget.o0OOO00());
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.o0OOOOoO(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.o0OOOO0();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.o0OoO00O(), this.mLayoutWidget.o00ooOO(), this.mLayoutWidget.o0OOO0(), this.mLayoutWidget.o0OOO00());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o00ooO.o00oOoO viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof o00ooO.o00oo0OO)) {
            o00oOOoO o00ooooo2 = (o00oOOoO) view.getLayoutParams();
            o00ooO.o00oo0OO o00oo0oo = new o00ooO.o00oo0OO();
            o00ooooo2.f1853o0O00OOO = o00oo0oo;
            o00ooooo2.f1844o0O000O = true;
            o00oo0oo.o0OO0o0O(o00ooooo2.f1837o00ooooO);
        }
        if (view instanceof androidx.constraintlayout.widget.o00oOOoO) {
            androidx.constraintlayout.widget.o00oOOoO o00ooooo3 = (androidx.constraintlayout.widget.o00oOOoO) view;
            o00ooooo3.o00ooO0();
            ((o00oOOoO) view.getLayoutParams()).f1858o0OoOoOo = true;
            if (!this.mConstraintHelpers.contains(o00ooooo3)) {
                this.mConstraintHelpers.add(o00ooooo3);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.o0OO00oo(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.o00oOo00(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        o00oOo00 o00ooo002 = this.mMeasurer;
        int i5 = o00ooo002.f1916o00oOo0O;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + o00ooo002.f1920o00oOooO, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(o00ooO.o00oo00O o00oo00o, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.o00oOo00(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? isRtl() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(o00oo00o, mode, i5, mode2, i6);
        o00oo00o.o0OOO0O0(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, max5, max);
    }

    public void setConstraintSet(o00oOoO o00oooo2) {
        this.mConstraintSet = o00oooo2;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(oO0000Oo oo0000oo) {
        this.mConstraintsChangedListener = oo0000oo;
        androidx.constraintlayout.widget.o00oOo00 o00ooo002 = this.mConstraintLayoutSpec;
        if (o00ooo002 != null) {
            o00ooo002.o00oOooO(oo0000oo);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.o0OOO0oO(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r10 = java.lang.Math.max(0, r7.mMinWidth);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        r12 = java.lang.Math.max(0, r7.mMinHeight);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(o00ooO.o00oo00O r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$o00oOo00 r0 = r7.mMeasurer
            int r1 = r0.f1916o00oOo0O
            int r0 = r0.f1920o00oOooO
            o00ooO.o00oOoO$o00oOOoO r2 = o00ooO.o00oOoO.o00oOOoO.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            o00ooO.o00oOoO$o00oOOoO r9 = o00ooO.o00oOoO.o00oOOoO.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            o00ooO.o00oOoO$o00oOOoO r9 = o00ooO.o00oOoO.o00oOOoO.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            o00ooO.o00oOoO$o00oOOoO r2 = o00ooO.o00oOoO.o00oOOoO.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            o00ooO.o00oOoO$o00oOOoO r2 = o00ooO.o00oOoO.o00oOOoO.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.o0OoO00O()
            if (r10 != r11) goto L5d
            int r11 = r8.o00ooOO()
            if (r12 == r11) goto L60
        L5d:
            r8.o0OO()
        L60:
            r8.o0O0ooo(r6)
            r8.o0O0oooO(r6)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.o0O0oO0(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.oooOO0(r11)
            r8.o0O0oO(r6)
            r8.o0O0oO0o(r6)
            r8.o0O0o0OO(r9)
            r8.o0O0ooOO(r10)
            r8.o0O0oOoo(r2)
            r8.o0O0o00(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.o0O0oO(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.o0O0oO0o(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(o00ooO.o00oo00O, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.o00oOo00 o00ooo002 = this.mConstraintLayoutSpec;
        if (o00ooo002 != null) {
            o00ooo002.o00oOo0O(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
