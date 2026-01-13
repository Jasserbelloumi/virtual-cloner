package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.o00oOo00;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements o00oOo00.o00oOOo0 {

    /* renamed from: o00oo  reason: collision with root package name */
    public final ImageView f832o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0 f833o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo00O f834o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final View f835o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final FrameLayout f836o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Drawable f837o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final ImageView f838o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public o0oOo0O0 f839o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o0O000oo.o00oOo00 f840o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int f841o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final DataSetObserver f842o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f843o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f844o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f845o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f846o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public int f847o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f848o00ooOo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final FrameLayout f849o0O0o;

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int[] f850o00oo0O0 = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(context, attributeSet, f850o00oo0O0);
            setBackgroundDrawable(o00ooOo02.o00oOoO(0));
            o00ooOo02.o00ooOoo();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends DataSetObserver {
        public o00oOOo0() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f834o00oo0O0.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f834o00oo0O0.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements ViewTreeObserver.OnGlobalLayoutListener {
        public o00oOOoO() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.o00oOOoO()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                o0O000oo.o00oOo00 o00ooo002 = ActivityChooserView.this.f840o00ooO0;
                if (o00ooo002 != null) {
                    o00ooo002.o00oo00O(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends View.AccessibilityDelegate {
        public o00oOo00() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            o0O00.o00oo0O.o0OO0Ooo(accessibilityNodeInfo).oo0OOoo(true);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o0O0o00O {
        public o00oOo0O(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public o00oOoo0.o00ooO0 o00oOOoO() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public boolean o00oOo00() {
            ActivityChooserView.this.o00oOo00();
            return true;
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public boolean o00oOooO() {
            ActivityChooserView.this.o00oOOo0();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends DataSetObserver {
        public o00oOoO() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.o00oOo0O();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public o00oo0() {
        }

        public final void o00oOOo0() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f845o00ooOO0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f849o0O0o) {
                if (view != activityChooserView.f836o00oo0o) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f844o00ooOO = false;
                activityChooserView.o00oOooO(activityChooserView.f846o00ooOOo);
                return;
            }
            activityChooserView.o00oOOo0();
            Intent o00oOOoO2 = ActivityChooserView.this.f834o00oo0O0.o00oOOoO().o00oOOoO(ActivityChooserView.this.f834o00oo0O0.o00oOOoO().o00oOoO0(ActivityChooserView.this.f834o00oo0O0.o00oOo00()));
            if (o00oOOoO2 != null) {
                o00oOOoO2.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(o00oOOoO2);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            o00oOOo0();
            o0O000oo.o00oOo00 o00ooo002 = ActivityChooserView.this.f840o00ooO0;
            if (o00ooo002 != null) {
                o00ooo002.o00oo00O(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((o00oo00O) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.o00oOooO(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.o00oOOo0();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f844o00ooOO) {
                if (i > 0) {
                    activityChooserView.f834o00oo0O0.o00oOOoO().o00oo0Oo(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.f834o00oo0O0.o00oOo0O()) {
                i++;
            }
            Intent o00oOOoO2 = ActivityChooserView.this.f834o00oo0O0.o00oOOoO().o00oOOoO(i);
            if (o00oOOoO2 != null) {
                o00oOOoO2.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(o00oOOoO2);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f849o0O0o) {
                if (activityChooserView.f834o00oo0O0.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f844o00ooOO = true;
                    activityChooserView2.o00oOooO(activityChooserView2.f846o00ooOOo);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends BaseAdapter {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f857o00oo = 4;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final int f858o00ooO0 = 1;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f859o00ooO00 = 0;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public static final int f860o00ooO0O = 3;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f861o0O0o = Integer.MAX_VALUE;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f862o00oo0O = 4;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public androidx.appcompat.widget.o00oOo00 f863o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f864o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f865o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f866o00oo0o0;

        public o00oo00O() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int o00oOo0o2 = this.f863o00oo0O0.o00oOo0o();
            if (!this.f864o00oo0Oo && this.f863o00oo0O0.o00oOoO() != null) {
                o00oOo0o2--;
            }
            int min = Math.min(o00oOo0o2, this.f862o00oo0O);
            return this.f865o00oo0o ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f864o00oo0Oo && this.f863o00oo0O0.o00oOoO() != null) {
                i++;
            }
            return this.f863o00oo0O0.o00oOo0O(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f865o00oo0o && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f864o00oo0Oo && i == 0 && this.f866o00oo0o0) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public int o00oOOo0() {
            return this.f863o00oo0O0.o00oOo0o();
        }

        public androidx.appcompat.widget.o00oOo00 o00oOOoO() {
            return this.f863o00oo0O0;
        }

        public ResolveInfo o00oOo00() {
            return this.f863o00oo0O0.o00oOoO();
        }

        public boolean o00oOo0O() {
            return this.f864o00oo0Oo;
        }

        public int o00oOo0o() {
            int i = this.f862o00oo0O;
            this.f862o00oo0O = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f862o00oo0O = i;
            return i2;
        }

        public void o00oOoO(int i) {
            if (this.f862o00oo0O != i) {
                this.f862o00oo0O = i;
                notifyDataSetChanged();
            }
        }

        public void o00oOoO0(androidx.appcompat.widget.o00oOo00 o00ooo002) {
            androidx.appcompat.widget.o00oOo00 o00oOOoO2 = ActivityChooserView.this.f834o00oo0O0.o00oOOoO();
            if (o00oOOoO2 != null && ActivityChooserView.this.isShown()) {
                o00oOOoO2.unregisterObserver(ActivityChooserView.this.f842o00ooO0O);
            }
            this.f863o00oo0O0 = o00ooo002;
            if (o00ooo002 != null && ActivityChooserView.this.isShown()) {
                o00ooo002.registerObserver(ActivityChooserView.this.f842o00ooO0O);
            }
            notifyDataSetChanged();
        }

        public void o00oOoOO(boolean z, boolean z2) {
            if (this.f864o00oo0Oo == z && this.f866o00oo0o0 == z2) {
                return;
            }
            this.f864o00oo0Oo = z;
            this.f866o00oo0o0 = z2;
            notifyDataSetChanged();
        }

        public void o00oOoOo(boolean z) {
            if (this.f865o00oo0o != z) {
                this.f865o00oo0o = z;
                notifyDataSetChanged();
            }
        }

        public int o00oOooO() {
            return this.f863o00oo0O0.o00oOoOo();
        }
    }

    public ActivityChooserView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public ActivityChooserView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f842o00ooO0O = new o00oOOo0();
        this.f843o00ooO0o = new o00oOOoO();
        this.f846o00ooOOo = 4;
        int[] iArr = R.styleable.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0O000oo.o0O0o00O.o0O0oOo0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f846o00ooOOo = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        o00oo0 o00oo0Var = new o00oo0();
        this.f833o00oo0O = o00oo0Var;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.f835o00oo0Oo = findViewById;
        this.f837o00oo0o0 = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f849o0O0o = frameLayout;
        frameLayout.setOnClickListener(o00oo0Var);
        frameLayout.setOnLongClickListener(o00oo0Var);
        int i2 = R.id.image;
        this.f832o00oo = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(o00oo0Var);
        frameLayout2.setAccessibilityDelegate(new o00oOo00());
        frameLayout2.setOnTouchListener(new o00oOo0O(frameLayout2));
        this.f836o00oo0o = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f838o00oo0oO = imageView;
        imageView.setImageDrawable(drawable);
        o00oo00O o00oo00o = new o00oo00O();
        this.f834o00oo0O0 = o00oo00o;
        o00oo00o.registerDataSetObserver(new o00oOoO());
        Resources resources = context.getResources();
        this.f841o00ooO00 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public androidx.appcompat.widget.o00oOo00 getDataModel() {
        return this.f834o00oo0O0.o00oOOoO();
    }

    public o0oOo0O0 getListPopupWindow() {
        if (this.f839o00ooO == null) {
            o0oOo0O0 o0ooo0o0 = new o0oOo0O0(getContext());
            this.f839o00ooO = o0ooo0o0;
            o0ooo0o0.o00oo00O(this.f834o00oo0O0);
            this.f839o00ooO.o00oooo0(this);
            this.f839o00ooO.o0O000Oo(true);
            this.f839o00ooO.o0O000o0(this.f833o00oo0O);
            this.f839o00ooO.o0OoOoOO(this.f833o00oo0O);
        }
        return this.f839o00ooO;
    }

    public boolean o00oOOo0() {
        if (o00oOOoO()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f843o00ooO0o);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean o00oOOoO() {
        return getListPopupWindow().o00oOOo0();
    }

    public boolean o00oOo00() {
        if (o00oOOoO() || !this.f848o00ooOo0) {
            return false;
        }
        this.f844o00ooOO = false;
        o00oOooO(this.f846o00ooOOo);
        return true;
    }

    public void o00oOo0O() {
        View view;
        Drawable drawable;
        if (this.f834o00oo0O0.getCount() > 0) {
            this.f836o00oo0o.setEnabled(true);
        } else {
            this.f836o00oo0o.setEnabled(false);
        }
        int o00oOOo02 = this.f834o00oo0O0.o00oOOo0();
        int o00oOooO2 = this.f834o00oo0O0.o00oOooO();
        if (o00oOOo02 == 1 || (o00oOOo02 > 1 && o00oOooO2 > 0)) {
            this.f849o0O0o.setVisibility(0);
            ResolveInfo o00oOo002 = this.f834o00oo0O0.o00oOo00();
            PackageManager packageManager = getContext().getPackageManager();
            this.f832o00oo.setImageDrawable(o00oOo002.loadIcon(packageManager));
            if (this.f847o00ooOo != 0) {
                this.f849o0O0o.setContentDescription(getContext().getString(this.f847o00ooOo, o00oOo002.loadLabel(packageManager)));
            }
        } else {
            this.f849o0O0o.setVisibility(8);
        }
        if (this.f849o0O0o.getVisibility() == 0) {
            view = this.f835o00oo0Oo;
            drawable = this.f837o00oo0o0;
        } else {
            view = this.f835o00oo0Oo;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public void o00oOooO(int i) {
        o00oo00O o00oo00o;
        if (this.f834o00oo0O0.o00oOOoO() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f843o00ooO0o);
        ?? r0 = this.f849o0O0o.getVisibility() == 0 ? 1 : 0;
        int o00oOOo02 = this.f834o00oo0O0.o00oOOo0();
        if (i == Integer.MAX_VALUE || o00oOOo02 <= i + r0) {
            this.f834o00oo0O0.o00oOoOo(false);
            o00oo00o = this.f834o00oo0O0;
        } else {
            this.f834o00oo0O0.o00oOoOo(true);
            o00oo00o = this.f834o00oo0O0;
            i--;
        }
        o00oo00o.o00oOoO(i);
        o0oOo0O0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.o00oOOo0()) {
            return;
        }
        if (this.f844o00ooOO || r0 == 0) {
            this.f834o00oo0O0.o00oOoOO(true, r0);
        } else {
            this.f834o00oo0O0.o00oOoOO(false, false);
        }
        listPopupWindow.o00ooooO(Math.min(this.f834o00oo0O0.o00oOo0o(), this.f841o00ooO00));
        listPopupWindow.show();
        o0O000oo.o00oOo00 o00ooo002 = this.f840o00ooO0;
        if (o00ooo002 != null) {
            o00ooo002.o00oo00O(true);
        }
        listPopupWindow.o00oo0OO().setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
        listPopupWindow.o00oo0OO().setSelector(new ColorDrawable(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.o00oOo00 o00oOOoO2 = this.f834o00oo0O0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.registerObserver(this.f842o00ooO0O);
        }
        this.f848o00ooOo0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.o00oOo00 o00oOOoO2 = this.f834o00oo0O0.o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOOoO2.unregisterObserver(this.f842o00ooO0O);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f843o00ooO0o);
        }
        if (o00oOOoO()) {
            o00oOOo0();
        }
        this.f848o00ooOo0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f835o00oo0Oo.layout(0, 0, i3 - i, i4 - i2);
        if (o00oOOoO()) {
            return;
        }
        o00oOOo0();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f835o00oo0Oo;
        if (this.f849o0O0o.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.o00oOo00.o00oOOo0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.o00oOo00 o00ooo002) {
        this.f834o00oo0O0.o00oOoO0(o00ooo002);
        if (o00oOOoO()) {
            o00oOOo0();
            o00oOo00();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f847o00ooOo = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f838o00oo0oO.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f838o00oo0oO.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f846o00ooOOo = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f845o00ooOO0 = onDismissListener;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setProvider(o0O000oo.o00oOo00 o00ooo002) {
        this.f840o00ooO0 = o00ooo002;
    }
}
