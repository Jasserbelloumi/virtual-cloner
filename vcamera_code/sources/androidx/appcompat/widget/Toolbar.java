package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOOo0;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.o0OOOO;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.o0O00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o00oOooO.o0OO0oO;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OoOoOo;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements o0O000oo.o0O000o0 {
    private static final String TAG = "Toolbar";
    private o00oo0O.o00oOOo0 mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private o0OO00o0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    public View mExpandedActionView;
    private o00oo00O mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    public o00oOoO.o00oOOo0 mMenuBuilderCallback;
    public final o0O000oo.o0OoO00O mMenuHostHelper;
    public ActionMenuView mMenuView;
    private final ActionMenuView.o00oOoO mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    public o00oo0OO mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private o0OOOO0o mWrapper;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f999o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f1000o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: o00oOOoO */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOo00 */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1000o00oo0O0 = parcel.readInt();
            this.f999o00oo0O = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1000o00oo0O0);
            parcel.writeInt(this.f999o00oo0O ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ActionMenuView.o00oOoO {
        public o00oOOo0() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.o00oOoO
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.o00oOoOo(menuItem)) {
                return true;
            }
            o00oo0OO o00oo0oo = Toolbar.this.mOnMenuItemClickListener;
            if (o00oo0oo != null) {
                return o00oo0oo.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o00oOoO.o00oOOo0 {
        public o00oOo00() {
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public boolean onMenuItemSelected(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @o00oOooO.oo0oO0 MenuItem menuItem) {
            o00oOoO.o00oOOo0 o00oooo02 = Toolbar.this.mMenuBuilderCallback;
            return o00oooo02 != null && o00oooo02.onMenuItemSelected(o00oooo2, menuItem);
        }

        @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
        public void onMenuModeChange(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            if (!Toolbar.this.mMenuView.o00oOoOo()) {
                Toolbar.this.mMenuHostHelper.o00oOoo0(o00oooo2);
            }
            o00oOoO.o00oOOo0 o00oooo02 = Toolbar.this.mMenuBuilderCallback;
            if (o00oooo02 != null) {
                o00oooo02.onMenuModeChange(o00oooo2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements View.OnClickListener {
        public o00oOo0O() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    @o00oOooO.o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o00oOooO.o0O0O0Oo
        @o00oOooO.o0OO00OO
        public static OnBackInvokedDispatcher o00oOOo0(@o00oOooO.oo0oO0 View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @o00oOooO.o0O0O0Oo
        @o00oOooO.oo0oO0
        public static OnBackInvokedCallback o00oOOoO(@o00oOooO.oo0oO0 Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.o00ooO0(runnable);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 Object obj, @o00oOooO.oo0oO0 Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(@o00oOooO.oo0oO0 Object obj, @o00oOooO.oo0oO0 Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends o00oOOo0.o00oOOoO {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f1005o00oOo00 = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f1006o00oOo0O = 2;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f1007o00oOooO = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f1008o00oOOoO;

        public o00oo0(int i) {
            this(-2, -1, i);
        }

        public o00oo0(int i, int i2) {
            super(i, i2);
            this.f1008o00oOOoO = 0;
            this.f371o00oOOo0 = 8388627;
        }

        public o00oo0(int i, int i2, int i3) {
            super(i, i2);
            this.f1008o00oOOoO = 0;
            this.f371o00oOOo0 = i3;
        }

        public o00oo0(@o00oOooO.oo0oO0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1008o00oOOoO = 0;
        }

        public o00oo0(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1008o00oOOoO = 0;
        }

        public o00oo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1008o00oOOoO = 0;
            o00oOOo0(marginLayoutParams);
        }

        public o00oo0(o00oOOo0.o00oOOoO o00ooooo2) {
            super(o00ooooo2);
            this.f1008o00oOOoO = 0;
        }

        public o00oo0(o00oo0 o00oo0Var) {
            super((o00oOOo0.o00oOOoO) o00oo0Var);
            this.f1008o00oOOoO = 0;
            this.f1008o00oOOoO = o00oo0Var.f1008o00oOOoO;
        }

        public void o00oOOo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements androidx.appcompat.view.menu.o00oo0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public androidx.appcompat.view.menu.o00oo0OO f1009o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public androidx.appcompat.view.menu.o00oOoO f1010o00oo0O0;

        public o00oo00O() {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public boolean collapseItemActionView(androidx.appcompat.view.menu.o00oOoO o00oooo2, androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof o00oOoOo.o00oo0OO) {
                ((o00oOoOo.o00oo0OO) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f1009o00oo0O = null;
            Toolbar.this.requestLayout();
            o00oo0oo.o00oo0o(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public boolean expandItemActionView(androidx.appcompat.view.menu.o00oOoO o00oooo2, androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = o00oo0oo.getActionView();
            this.f1009o00oo0O = o00oo0oo;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                o00oo0 generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f371o00oOOo0 = 8388611 | (toolbar4.mButtonGravity & 112);
                generateDefaultLayoutParams.f1008o00oOOoO = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            o00oo0oo.o00oo0o(true);
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof o00oOoOo.o00oo0OO) {
                ((o00oOoOo.o00oo0OO) view).onActionViewExpanded();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public androidx.appcompat.view.menu.o0O0o getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public void initForMenu(Context context, androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            androidx.appcompat.view.menu.o00oo0OO o00oo0oo;
            androidx.appcompat.view.menu.o00oOoO o00oooo3 = this.f1010o00oo0O0;
            if (o00oooo3 != null && (o00oo0oo = this.f1009o00oo0O) != null) {
                o00oooo3.collapseItemActionView(o00oo0oo);
            }
            this.f1010o00oo0O0 = o00oooo2;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public void onCloseMenu(androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O
        public void updateMenuView(boolean z) {
            if (this.f1009o00oo0O != null) {
                androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f1010o00oo0O0;
                boolean z2 = false;
                if (o00oooo2 != null) {
                    int size = o00oooo2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1010o00oo0O0.getItem(i) == this.f1009o00oo0O) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                collapseItemActionView(this.f1010o00oo0O0, this.f1009o00oo0O);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0OO {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public Toolbar(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new o0O000oo.o0OoO00O(new Runnable() { // from class: androidx.appcompat.widget.o0OOO0O
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new o00oOOo0();
        this.mShowOverflowMenuRunnable = new o00oOOoO();
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context2, attributeSet, iArr, i, 0);
        o0O000oo.o0O0o00O.o0O0oOo0(this, context, iArr, attributeSet, o00ooOo2.o00ooO(), i, 0);
        this.mTitleTextAppearance = o00ooOo2.o00oo0oO(R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = o00ooOo2.o00oo0oO(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = o00ooOo2.o00oo0O0(R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = o00ooOo2.o00oo0O0(R.styleable.Toolbar_buttonGravity, 48);
        int o00oOo0o2 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_titleMargin, 0);
        int i2 = R.styleable.Toolbar_titleMargins;
        o00oOo0o2 = o00ooOo2.o00ooOO0(i2) ? o00ooOo2.o00oOo0o(i2, o00oOo0o2) : o00oOo0o2;
        this.mTitleMarginBottom = o00oOo0o2;
        this.mTitleMarginTop = o00oOo0o2;
        this.mTitleMarginEnd = o00oOo0o2;
        this.mTitleMarginStart = o00oOo0o2;
        int o00oOo0o3 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_titleMarginStart, -1);
        if (o00oOo0o3 >= 0) {
            this.mTitleMarginStart = o00oOo0o3;
        }
        int o00oOo0o4 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_titleMarginEnd, -1);
        if (o00oOo0o4 >= 0) {
            this.mTitleMarginEnd = o00oOo0o4;
        }
        int o00oOo0o5 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_titleMarginTop, -1);
        if (o00oOo0o5 >= 0) {
            this.mTitleMarginTop = o00oOo0o5;
        }
        int o00oOo0o6 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_titleMarginBottom, -1);
        if (o00oOo0o6 >= 0) {
            this.mTitleMarginBottom = o00oOo0o6;
        }
        this.mMaxButtonHeight = o00ooOo2.o00oOoO0(R.styleable.Toolbar_maxButtonHeight, -1);
        int o00oOo0o7 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int o00oOo0o8 = o00ooOo2.o00oOo0o(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int o00oOoO02 = o00ooOo2.o00oOoO0(R.styleable.Toolbar_contentInsetLeft, 0);
        int o00oOoO03 = o00ooOo2.o00oOoO0(R.styleable.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.o00oOo0O(o00oOoO02, o00oOoO03);
        if (o00oOo0o7 != Integer.MIN_VALUE || o00oOo0o8 != Integer.MIN_VALUE) {
            this.mContentInsets.o00oOoO0(o00oOo0o7, o00oOo0o8);
        }
        this.mContentInsetStartWithNavigation = o00ooOo2.o00oOo0o(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = o00ooOo2.o00oOo0o(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = o00ooOo2.o00oOoO(R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = o00ooOo2.o00ooO00(R.styleable.Toolbar_collapseContentDescription);
        CharSequence o00ooO002 = o00ooOo2.o00ooO00(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(o00ooO002)) {
            setTitle(o00ooO002);
        }
        CharSequence o00ooO003 = o00ooOo2.o00ooO00(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(o00ooO003)) {
            setSubtitle(o00ooO003);
        }
        this.mPopupContext = getContext();
        setPopupTheme(o00ooOo2.o00oo0oO(R.styleable.Toolbar_popupTheme, 0));
        Drawable o00oOoO2 = o00ooOo2.o00oOoO(R.styleable.Toolbar_navigationIcon);
        if (o00oOoO2 != null) {
            setNavigationIcon(o00oOoO2);
        }
        CharSequence o00ooO004 = o00ooOo2.o00ooO00(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(o00ooO004)) {
            setNavigationContentDescription(o00ooO004);
        }
        Drawable o00oOoO3 = o00ooOo2.o00oOoO(R.styleable.Toolbar_logo);
        if (o00oOoO3 != null) {
            setLogo(o00oOoO3);
        }
        CharSequence o00ooO005 = o00ooOo2.o00ooO00(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(o00ooO005)) {
            setLogoDescription(o00ooO005);
        }
        int i3 = R.styleable.Toolbar_titleTextColor;
        if (o00ooOo2.o00ooOO0(i3)) {
            setTitleTextColor(o00ooOo2.o00oOooO(i3));
        }
        int i4 = R.styleable.Toolbar_subtitleTextColor;
        if (o00ooOo2.o00ooOO0(i4)) {
            setSubtitleTextColor(o00ooOo2.o00oOooO(i4));
        }
        int i5 = R.styleable.Toolbar_menu;
        if (o00ooOo2.o00ooOO0(i5)) {
            inflateMenu(o00ooOo2.o00oo0oO(i5, 0));
        }
        o00ooOo2.o00ooOoo();
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = o0O000oo.o0O0o00O.o0O000O(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, o0O0o00O.o00oo0O0.o00oOooO(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                o00oo0 o00oo0Var = (o00oo0) childAt.getLayoutParams();
                if (o00oo0Var.f1008o00oOOoO == 0 && shouldLayout(childAt) && getChildHorizontalGravity(o00oo0Var.f371o00oOOo0) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            o00oo0 o00oo0Var2 = (o00oo0) childAt2.getLayoutParams();
            if (o00oo0Var2.f1008o00oOOoO == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(o00oo0Var2.f371o00oOOo0) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o00oo0 generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (o00oo0) layoutParams;
        generateDefaultLayoutParams.f1008o00oOOoO = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.mHiddenViews.add(view);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new o0OO00o0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.o00oo0() == null) {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = (androidx.appcompat.view.menu.o00oOoO) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new o00oo00O();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            o00oooo2.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.o00oo0OO(this.mActionMenuPresenterCallback, new o00oOo00());
            o00oo0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f371o00oOOo0 = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new o0OoOoOo(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            o00oo0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f371o00oOOo0 = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int o0O000O2 = o0O000oo.o0O0o00O.o0O000O(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, o0O000O2) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : o0O000O2 == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(o00oo0Var.f371o00oOOo0);
        if (childVerticalGravity != 48) {
            if (childVerticalGravity != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) o00oo0Var).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o00oo0Var).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o0OoOoOo.o00oOOo0.o00oOOoO(marginLayoutParams) + o0OoOoOo.o00oOOo0.o00oOo00(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new o00oOoOo.o00ooO0(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += view.getMeasuredWidth() + max + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin + max;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        o00oo0 o00oo0Var = (o00oo0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o00oo0Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) o00oo0Var).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.o00oOoO(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (this.mCollapsible) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // o0O000oo.o0O000o0
    @o00oOooO.o0O
    public void addMenuProvider(@o00oOooO.oo0oO0 o0O000oo.o0O00OO o0o00oo) {
        this.mMenuHostHelper.o00oOo00(o0o00oo);
    }

    @Override // o0O000oo.o0O000o0
    @o00oOooO.o0O
    public void addMenuProvider(@o00oOooO.oo0oO0 o0O000oo.o0O00OO o0o00oo, @o00oOooO.oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o) {
        this.mMenuHostHelper.o00oOooO(o0o00oo, o0o0o0o);
    }

    @Override // o0O000oo.o0O000o0
    @o00oOooO.o0O
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@o00oOooO.oo0oO0 o0O000oo.o0O00OO o0o00oo, @o00oOooO.oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o, @o00oOooO.oo0oO0 o0O00.o00oOOoO o00ooooo2) {
        this.mMenuHostHelper.o00oOo0O(o0o00oo, o0o0o0o, o00ooooo2);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.o00oOoo0();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o00oo0);
    }

    public void collapseActionView() {
        o00oo00O o00oo00o = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.o00oo0OO o00oo0oo = o00oo00o == null ? null : o00oo00o.f1009o00oo0O;
        if (o00oo0oo != null) {
            o00oo0oo.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.o00oOOoO();
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            o0OoOoOo o0oooooo = new o0OoOoOo(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = o0oooooo;
            o0oooooo.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            o00oo0 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f371o00oOOo0 = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.f1008o00oOOoO = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new o00oOo0O());
        }
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateDefaultLayoutParams() {
        return new o00oo0(-2, -2);
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateLayoutParams(AttributeSet attributeSet) {
        return new o00oo0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public o00oo0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oo0 ? new o00oo0((o00oo0) layoutParams) : layoutParams instanceof o00oOOo0.o00oOOoO ? new o00oo0((o00oOOo0.o00oOOoO) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oo0((ViewGroup.MarginLayoutParams) layoutParams) : new o00oo0(layoutParams);
    }

    @o00oOooO.o0OO00OO
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @o00oOooO.o0OO00OO
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0OO00o0 o0oo00o0 = this.mContentInsets;
        if (o0oo00o0 != null) {
            return o0oo00o0.o00oOOo0();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0OO00o0 o0oo00o0 = this.mContentInsets;
        if (o0oo00o0 != null) {
            return o0oo00o0.o00oOOoO();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0OO00o0 o0oo00o0 = this.mContentInsets;
        if (o0oo00o0 != null) {
            return o0oo00o0.o00oOo00();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0OO00o0 o0oo00o0 = this.mContentInsets;
        if (o0oo00o0 != null) {
            return o0oo00o0.o00oOooO();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.o00oOoO o00oo02;
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && (o00oo02 = actionMenuView.o00oo0()) != null && o00oo02.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return o0O000oo.o0O0o00O.o0O000O(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return o0O000oo.o0O0o00O.o0O000O(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    @o00oOooO.o0OO00OO
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @o00oOooO.o0OO00OO
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @o00oOooO.o0OO00OO
    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    @o00oOooO.o0OOO0OO
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o0O0OOO getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new o0OOOO0o(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        o00oo00O o00oo00o = this.mExpandedMenuPresenter;
        return (o00oo00o == null || o00oo00o.f1009o00oo0O == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o00oOoO();
    }

    public void inflateMenu(@o00oOooO.o0OO000 int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @Override // o0O000oo.o0O000o0
    @o00oOooO.o0O
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o00oOoOO();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o00oOoOo();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        boolean o00oOOoO2 = o.o00oOOoO(this);
        int i10 = !o00oOOoO2 ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i5 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i5 = View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3) + 0;
        iArr[o00oOOoO2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i5 = View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i5 = View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i5 = View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((o00oo0) childAt.getLayoutParams()).f1008o00oOOoO == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i13 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i7 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i8 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i9 = Math.max(i9, measureChildCollapseMargins(this.mSubtitleTextView, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i8 = View.combineMeasuredStates(i8, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max2 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(i4, i7), getSuggestedMinimumHeight()), i2, i8 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.o00oOoO o00oo02 = actionMenuView != null ? actionMenuView.o00oo0() : null;
        int i = savedState.f1000o00oo0O0;
        if (i != 0 && this.mExpandedMenuPresenter != null && o00oo02 != null && (findItem = o00oo02.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f999o00oo0O) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        this.mContentInsets.o00oOo0o(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.o00oo0OO o00oo0oo;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        o00oo00O o00oo00o = this.mExpandedMenuPresenter;
        if (o00oo00o != null && (o00oo0oo = o00oo00o.f1009o00oo0O) != null) {
            savedState.f1000o00oo0O0 = o00oo0oo.f686o00oOooo;
        }
        savedState.f999o00oo0O = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((o00oo0) childAt.getLayoutParams()).f1008o00oOOoO != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // o0O000oo.o0O000o0
    @o00oOooO.o0O
    public void removeMenuProvider(@o00oOooO.oo0oO0 o0O000oo.o0O00OO o0o00oo) {
        this.mMenuHostHelper.o00oOooo(o0o00oo);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@o00oOooO.o0OOO0O int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(@o00oOooO.o0OO00OO CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@o00oOooO.o0O0O0o0 int i) {
        setCollapseIcon(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    public void setCollapseIcon(@o00oOooO.o0OO00OO Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.mCollapseIcon);
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.o00oOo0O(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.o00oOoO0(i, i2);
    }

    public void setLogo(@o00oOooO.o0O0O0o0 int i) {
        setLogo(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@o00oOooO.o0OOO0O int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void setMenu(androidx.appcompat.view.menu.o00oOoO o00oooo2, ActionMenuPresenter actionMenuPresenter) {
        if (o00oooo2 == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.o00oOoO o00oo02 = this.mMenuView.o00oo0();
        if (o00oo02 == o00oooo2) {
            return;
        }
        if (o00oo02 != null) {
            o00oo02.removeMenuPresenter(this.mOuterActionMenuPresenter);
            o00oo02.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new o00oo00O();
        }
        actionMenuPresenter.o00ooO0O(true);
        if (o00oooo2 != null) {
            o00oooo2.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            o00oooo2.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(o00oo0O.o00oOOo0 o00oooo02, o00oOoO.o00oOOo0 o00oooo03) {
        this.mActionMenuPresenterCallback = o00oooo02;
        this.mMenuBuilderCallback = o00oooo03;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.o00oo0OO(o00oooo02, o00oooo03);
        }
    }

    public void setNavigationContentDescription(@o00oOooO.o0OOO0O int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(@o00oOooO.o0OO00OO CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            o0OOOO.o00oOOo0.o00oOOo0(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@o00oOooO.o0O0O0o0 int i) {
        setNavigationIcon(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
    }

    public void setNavigationIcon(@o00oOooO.o0OO00OO Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(o00oo0OO o00oo0oo) {
        this.mOnMenuItemClickListener = o00oo0oo;
    }

    public void setOverflowIcon(@o00oOooO.o0OO00OO Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@o00oOooO.o0OOO0OO int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@o00oOooO.o0OOO0O int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, @o00oOooO.o0OOO0OO int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(@o00oOooO.o0O00O int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(@o00oOooO.oo0oO0 ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(@o00oOooO.o0OOO0O int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @o00oOooO.o0OOO0OO int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(@o00oOooO.o0O00O int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(@o00oOooO.oo0oO0 ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o00oo0O0();
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher o00oOOo02 = o00oOoO.o00oOOo0(this);
            boolean z = hasExpandedActionView() && o00oOOo02 != null && o0O000oo.o0O0o00O.o0O0OOoo(this) && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = o00oOoO.o00oOOoO(new Runnable() { // from class: androidx.appcompat.widget.o0OOO0OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.collapseActionView();
                        }
                    });
                }
                o00oOoO.o00oOo00(o00oOOo02, this.mBackInvokedCallback);
            } else if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            } else {
                o00oOoO.o00oOooO(onBackInvokedDispatcher, this.mBackInvokedCallback);
                o00oOOo02 = null;
            }
            this.mBackInvokedDispatcher = o00oOOo02;
        }
    }
}
