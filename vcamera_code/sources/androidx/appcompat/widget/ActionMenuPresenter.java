package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.view.menu.o0O0o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.o0OOOO;
import java.util.ArrayList;
import o00oooo0.o0O0O0Oo;
import o0O000oo.o00oOo00;
/* loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.o00oOOo0 implements o00oOo00.o00oOOo0 {

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f779o00ooooo = "ActionMenuPresenter";

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f780o00ooO;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o00oOo0O f781o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Drawable f782o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f783o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f784o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int f785o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public int f786o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f787o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f788o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f789o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public boolean f790o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f791o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f792o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public final SparseBooleanArray f793o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public o00oOoO f794o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public o00oOOo0 f795o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public o00oOo00 f796o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public final o00oo00O f797o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public o00oOOoO f798o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public int f799o00ooooO;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f800o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f800o00oo0O0 = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f800o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends androidx.appcompat.view.menu.o00oo0O0 {
        public o00oOOo0(Context context, androidx.appcompat.view.menu.o00ooO0 o00ooo02, View view) {
            super(context, o00ooo02, view, false, R.attr.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.o00oo0OO) o00ooo02.getItem()).o00oo0OO()) {
                View view2 = ActionMenuPresenter.this.f781o00ooO0O;
                o00oOoO(view2 == null ? (View) ActionMenuPresenter.this.f574o00ooO00 : view2);
            }
            o00oOOo0(ActionMenuPresenter.this.f797o00oooo);
        }

        @Override // androidx.appcompat.view.menu.o00oo0O0
        public void o00oOoO0() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f795o00oooOO = null;
            actionMenuPresenter.f799o00ooooO = 0;
            super.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends ActionMenuItemView.o00oOOoO {
        public o00oOOoO() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.o00oOOoO
        public o00oOoo0.o00ooO0 o00oOOo0() {
            o00oOOo0 o00oooo02 = ActionMenuPresenter.this.f795o00oooOO;
            if (o00oooo02 != null) {
                return o00oooo02.o00oOo0O();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public o00oOoO f804o00oo0O0;

        public o00oOo00(o00oOoO o00oooo2) {
            this.f804o00oo0O0 = o00oooo2;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = ActionMenuPresenter.this.f569o00oo0Oo;
            if (o00oooo2 != null) {
                o00oooo2.changeMenuMode();
            }
            View view = (View) ActionMenuPresenter.this.f574o00ooO00;
            if (view != null && view.getWindowToken() != null && this.f804o00oo0O0.o00oo0OO()) {
                ActionMenuPresenter.this.f794o00oooO = this.f804o00oo0O0;
            }
            ActionMenuPresenter.this.f796o00oooOo = null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends AppCompatImageView implements ActionMenuView.o00oOOo0 {

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o0O0o00O {

            /* renamed from: o00ooO0  reason: collision with root package name */
            public final /* synthetic */ ActionMenuPresenter f806o00ooO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f806o00ooO0 = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.o0O0o00O
            public o00oOoo0.o00ooO0 o00oOOoO() {
                o00oOoO o00oooo2 = ActionMenuPresenter.this.f794o00oooO;
                if (o00oooo2 == null) {
                    return null;
                }
                return o00oooo2.o00oOo0O();
            }

            @Override // androidx.appcompat.widget.o0O0o00O
            public boolean o00oOo00() {
                ActionMenuPresenter.this.o00ooOo0();
                return true;
            }

            @Override // androidx.appcompat.widget.o0O0o00O
            public boolean o00oOooO() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f796o00oooOo != null) {
                    return false;
                }
                actionMenuPresenter.o00oo0o();
                return true;
            }
        }

        public o00oOo0O(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o0OOOO.o00oOOo0.o00oOOo0(this, getContentDescription());
            setOnTouchListener(new o00oOOo0(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.o00oOOo0
        public boolean o00oOo00() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.o00oOOo0
        public boolean o00oOooO() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.o00ooOo0();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                o0O0O0Oo.o00oOOoO.o00oOo0o(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO extends androidx.appcompat.view.menu.o00oo0O0 {
        public o00oOoO(Context context, androidx.appcompat.view.menu.o00oOoO o00oooo2, View view, boolean z) {
            super(context, o00oooo2, view, z, R.attr.actionOverflowMenuStyle);
            o00oOoOo(8388613);
            o00oOOo0(ActionMenuPresenter.this.f797o00oooo);
        }

        @Override // androidx.appcompat.view.menu.o00oo0O0
        public void o00oOoO0() {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = ActionMenuPresenter.this.f569o00oo0Oo;
            if (o00oooo2 != null) {
                o00oooo2.close();
            }
            ActionMenuPresenter.this.f794o00oooO = null;
            super.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements o00oo0O.o00oOOo0 {
        public o00oo00O() {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public boolean o00oOOo0(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (o00oooo2 == actionMenuPresenter.f569o00oo0Oo) {
                return false;
            }
            actionMenuPresenter.f799o00ooooO = ((androidx.appcompat.view.menu.o00ooO0) o00oooo2).getItem().getItemId();
            o00oo0O.o00oOOo0 o00oOo0o2 = ActionMenuPresenter.this.o00oOo0o();
            if (o00oOo0o2 != null) {
                return o00oOo0o2.o00oOOo0(o00oooo2);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public void onCloseMenu(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
            if (o00oooo2 instanceof androidx.appcompat.view.menu.o00ooO0) {
                o00oooo2.getRootMenu().close(false);
            }
            o00oo0O.o00oOOo0 o00oOo0o2 = ActionMenuPresenter.this.o00oOo0o();
            if (o00oOo0o2 != null) {
                o00oOo0o2.onCloseMenu(o00oooo2, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f793o00ooo0o = new SparseBooleanArray();
        this.f797o00oooo = new o00oo00O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.o00oo0OO> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = actionMenuPresenter.f569o00oo0Oo;
        View view = null;
        ?? r3 = 0;
        if (o00oooo2 != null) {
            arrayList = o00oooo2.getVisibleItems();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f786o00ooOo;
        int i6 = actionMenuPresenter.f787o00ooOo0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f574o00ooO00;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            androidx.appcompat.view.menu.o00oo0OO o00oo0oo = arrayList.get(i9);
            if (o00oo0oo.o00oOo00()) {
                i7++;
            } else if (o00oo0oo.o00oo0O()) {
                i8++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f790o00ooo0 && o00oo0oo.f714o00oooOO) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f784o00ooOO0 && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f793o00ooo0o;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f789o00ooOoo) {
            int i11 = actionMenuPresenter.f792o00ooo0O;
            i2 = i6 / i11;
            i3 = ((i6 % i11) / i2) + i11;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            androidx.appcompat.view.menu.o00oo0OO o00oo0oo2 = arrayList.get(i12);
            if (o00oo0oo2.o00oOo00()) {
                View o00oOoO02 = actionMenuPresenter.o00oOoO0(o00oo0oo2, view, viewGroup);
                if (actionMenuPresenter.f789o00ooOoo) {
                    i2 -= ActionMenuView.o00oOooo(o00oOoO02, i3, i2, makeMeasureSpec, r3);
                } else {
                    o00oOoO02.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = o00oOoO02.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int i14 = o00oo0oo2.f689o00oo00O;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                }
                o00oo0oo2.o00ooO00(true);
                z = r3;
                i4 = i;
            } else if (o00oo0oo2.o00oo0O()) {
                int i15 = o00oo0oo2.f689o00oo00O;
                boolean z3 = sparseBooleanArray.get(i15);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!actionMenuPresenter.f789o00ooOoo || i2 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View o00oOoO03 = actionMenuPresenter.o00oOoO0(o00oo0oo2, null, viewGroup);
                    if (actionMenuPresenter.f789o00ooOoo) {
                        int o00oOooo2 = ActionMenuView.o00oOooo(o00oOoO03, i3, i2, makeMeasureSpec, 0);
                        i2 -= o00oOooo2;
                        if (o00oOooo2 == 0) {
                            z5 = false;
                        }
                    } else {
                        o00oOoO03.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = o00oOoO03.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!actionMenuPresenter.f789o00ooOoo ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z3) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        androidx.appcompat.view.menu.o00oo0OO o00oo0oo3 = arrayList.get(i16);
                        if (o00oo0oo3.f689o00oo00O == i15) {
                            if (o00oo0oo3.o00oo0OO()) {
                                i10++;
                            }
                            o00oo0oo3.o00ooO00(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                o00oo0oo2.o00ooO00(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                o00oo0oo2.o00ooO00(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public androidx.appcompat.view.menu.o0O0o getMenuView(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o0O0o o0o0o = this.f574o00ooO00;
        androidx.appcompat.view.menu.o0O0o menuView = super.getMenuView(viewGroup);
        if (o0o0o != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public void initForMenu(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        super.initForMenu(context, o00oooo2);
        Resources resources = context.getResources();
        o00oOoOo.o00oo00O o00oo00o = new o00oOoOo.o00oo00O(context);
        if (!this.f783o00ooOO) {
            this.f784o00ooOO0 = true;
        }
        if (!this.f791o00ooo00) {
            this.f785o00ooOOo = o00oo00o.o00oOo00();
        }
        if (!this.f788o00ooOoO) {
            this.f786o00ooOo = o00oo00o.o00oOooO();
        }
        int i = this.f785o00ooOOo;
        if (this.f784o00ooOO0) {
            if (this.f781o00ooO0O == null) {
                o00oOo0O o00ooo0o2 = new o00oOo0O(this.f568o00oo0O0);
                this.f781o00ooO0O = o00ooo0o2;
                if (this.f780o00ooO) {
                    o00ooo0o2.setImageDrawable(this.f782o00ooO0o);
                    this.f782o00ooO0o = null;
                    this.f780o00ooO = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f781o00ooO0O.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f781o00ooO0O.getMeasuredWidth();
        } else {
            this.f781o00ooO0O = null;
        }
        this.f787o00ooOo0 = i;
        this.f792o00ooo0O = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // o0O000oo.o00oOo00.o00oOOo0
    public void o00oOOo0(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f569o00oo0Oo;
        if (o00oooo2 != null) {
            o00oooo2.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0
    public void o00oOo00(androidx.appcompat.view.menu.o00oo0OO o00oo0oo, o0O0o.o00oOOo0 o00oooo02) {
        o00oooo02.initialize(o00oo0oo, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) o00oooo02;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f574o00ooO00);
        if (this.f798o00oooo0 == null) {
            this.f798o00oooo0 = new o00oOOoO();
        }
        actionMenuItemView.setPopupCallback(this.f798o00oooo0);
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0
    public boolean o00oOo0O(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f781o00ooO0O) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0
    public View o00oOoO0(androidx.appcompat.view.menu.o00oo0OO o00oo0oo, View view, ViewGroup viewGroup) {
        View actionView = o00oo0oo.getActionView();
        if (actionView == null || o00oo0oo.o00oo00O()) {
            actionView = super.o00oOoO0(o00oo0oo, view, viewGroup);
        }
        actionView.setVisibility(o00oo0oo.f714o00oooOO ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0
    public boolean o00oOoOO(int i, androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
        return o00oo0oo.o00oo0OO();
    }

    public boolean o00oo() {
        o00oOoO o00oooo2 = this.f794o00oooO;
        return o00oooo2 != null && o00oooo2.o00oOo0o();
    }

    public boolean o00oo0O() {
        return o00oo0o() | o00oo0oO();
    }

    public final View o00oo0Oo(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f574o00ooO00;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof o0O0o.o00oOOo0) && ((o0O0o.o00oOOo0) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean o00oo0o() {
        androidx.appcompat.view.menu.o0O0o o0o0o;
        o00oOo00 o00ooo002 = this.f796o00oooOo;
        if (o00ooo002 != null && (o0o0o = this.f574o00ooO00) != null) {
            ((View) o0o0o).removeCallbacks(o00ooo002);
            this.f796o00oooOo = null;
            return true;
        }
        o00oOoO o00oooo2 = this.f794o00oooO;
        if (o00oooo2 != null) {
            o00oooo2.dismiss();
            return true;
        }
        return false;
    }

    public Drawable o00oo0o0() {
        o00oOo0O o00ooo0o2 = this.f781o00ooO0O;
        if (o00ooo0o2 != null) {
            return o00ooo0o2.getDrawable();
        }
        if (this.f780o00ooO) {
            return this.f782o00ooO0o;
        }
        return null;
    }

    public boolean o00oo0oO() {
        o00oOOo0 o00oooo02 = this.f795o00oooOO;
        if (o00oooo02 != null) {
            o00oooo02.dismiss();
            return true;
        }
        return false;
    }

    public void o00ooO(ActionMenuView actionMenuView) {
        this.f574o00ooO00 = actionMenuView;
        actionMenuView.initialize(this.f569o00oo0Oo);
    }

    public void o00ooO0(Configuration configuration) {
        if (!this.f788o00ooOoO) {
            this.f786o00ooOo = new o00oOoOo.o00oo00O(this.f567o00oo0O).o00oOooO();
        }
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f569o00oo0Oo;
        if (o00oooo2 != null) {
            o00oooo2.onItemsChanged(true);
        }
    }

    public boolean o00ooO00() {
        return this.f784o00ooOO0;
    }

    public void o00ooO0O(boolean z) {
        this.f790o00ooo0 = z;
    }

    public void o00ooO0o(int i) {
        this.f786o00ooOo = i;
        this.f788o00ooOoO = true;
    }

    public void o00ooOO(boolean z) {
        this.f784o00ooOO0 = z;
        this.f783o00ooOO = true;
    }

    public void o00ooOO0(Drawable drawable) {
        o00oOo0O o00ooo0o2 = this.f781o00ooO0O;
        if (o00ooo0o2 != null) {
            o00ooo0o2.setImageDrawable(drawable);
            return;
        }
        this.f780o00ooO = true;
        this.f782o00ooO0o = drawable;
    }

    public void o00ooOOo(int i, boolean z) {
        this.f785o00ooOOo = i;
        this.f789o00ooOoo = z;
        this.f791o00ooo00 = true;
    }

    public boolean o00ooOo0() {
        androidx.appcompat.view.menu.o00oOoO o00oooo2;
        if (!this.f784o00ooOO0 || o00oo() || (o00oooo2 = this.f569o00oo0Oo) == null || this.f574o00ooO00 == null || this.f796o00oooOo != null || o00oooo2.getNonActionItems().isEmpty()) {
            return false;
        }
        o00oOo00 o00ooo002 = new o00oOo00(new o00oOoO(this.f567o00oo0O, this.f569o00oo0Oo, this.f781o00ooO0O, true));
        this.f796o00oooOo = o00ooo002;
        ((View) this.f574o00ooO00).post(o00ooo002);
        return true;
    }

    public boolean o0O0o() {
        return this.f796o00oooOo != null || o00oo();
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
        o00oo0O();
        super.onCloseMenu(o00oooo2, z);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f800o00oo0O0) > 0 && (findItem = this.f569o00oo0Oo.findItem(i)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.o00ooO0) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f800o00oo0O0 = this.f799o00ooooO;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.o00ooO0 o00ooo02) {
        boolean z = false;
        if (o00ooo02.hasVisibleItems()) {
            androidx.appcompat.view.menu.o00ooO0 o00ooo03 = o00ooo02;
            while (o00ooo03.getParentMenu() != this.f569o00oo0Oo) {
                o00ooo03 = (androidx.appcompat.view.menu.o00ooO0) o00ooo03.getParentMenu();
            }
            View o00oo0Oo2 = o00oo0Oo(o00ooo03.getItem());
            if (o00oo0Oo2 == null) {
                return false;
            }
            this.f799o00ooooO = o00ooo02.getItem().getItemId();
            int size = o00ooo02.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = o00ooo02.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            o00oOOo0 o00oooo02 = new o00oOOo0(this.f567o00oo0O, o00ooo02, o00oo0Oo2);
            this.f795o00oooOO = o00oooo02;
            o00oooo02.o00oOoOO(z);
            this.f795o00oooOO.o00oOooo();
            super.onSubMenuSelected(o00ooo02);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oOOo0, androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f574o00ooO00).requestLayout();
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f569o00oo0Oo;
        boolean z2 = false;
        if (o00oooo2 != null) {
            ArrayList<androidx.appcompat.view.menu.o00oo0OO> actionItems = o00oooo2.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                o0O000oo.o00oOo00 o00ooo002 = actionItems.get(i).f712o00ooo0o;
                if (o00ooo002 != null) {
                    o00ooo002.o00oOoo0(this);
                }
            }
        }
        androidx.appcompat.view.menu.o00oOoO o00oooo3 = this.f569o00oo0Oo;
        ArrayList<androidx.appcompat.view.menu.o00oo0OO> nonActionItems = o00oooo3 != null ? o00oooo3.getNonActionItems() : null;
        if (this.f784o00ooOO0 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !nonActionItems.get(0).f714o00oooOO;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        o00oOo0O o00ooo0o2 = this.f781o00ooO0O;
        if (z2) {
            if (o00ooo0o2 == null) {
                this.f781o00ooO0O = new o00oOo0O(this.f568o00oo0O0);
            }
            ViewGroup viewGroup = (ViewGroup) this.f781o00ooO0O.getParent();
            if (viewGroup != this.f574o00ooO00) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f781o00ooO0O);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f574o00ooO00;
                actionMenuView.addView(this.f781o00ooO0O, actionMenuView.o00oOo0o());
            }
        } else if (o00ooo0o2 != null) {
            ViewParent parent = o00ooo0o2.getParent();
            androidx.appcompat.view.menu.o0O0o o0o0o = this.f574o00ooO00;
            if (parent == o0o0o) {
                ((ViewGroup) o0o0o).removeView(this.f781o00ooO0O);
            }
        }
        ((ActionMenuView) this.f574o00ooO00).setOverflowReserved(this.f784o00ooOO0);
    }
}
