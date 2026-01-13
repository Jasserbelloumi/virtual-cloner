package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o0O0o;
import androidx.appcompat.widget.o0OOO0;
import o00oOooO.o0OO0oO;
import o0O000oo.o0O0o00O;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o0O0o.o00oOOo0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f548o00ooOo = "ListMenuItemView";

    /* renamed from: o00oo  reason: collision with root package name */
    public ImageView f549o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ImageView f550o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo0OO f551o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public RadioButton f552o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public CheckBox f553o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public TextView f554o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public TextView f555o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f556o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Drawable f557o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public LinearLayout f558o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f559o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Context f560o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f561o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public Drawable f562o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public LayoutInflater f563o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f564o00ooOo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public ImageView f565o0O0o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.f557o00ooO0 = o00ooOo2.o00oOoO(R.styleable.MenuView_android_itemBackground);
        this.f559o00ooO0O = o00ooOo2.o00oo0oO(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f556o00ooO = o00ooOo2.o00oOOo0(R.styleable.MenuView_preserveIconSpacing, false);
        this.f560o00ooO0o = context;
        this.f562o00ooOO0 = o00ooOo2.o00oOoO(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f561o00ooOO = obtainStyledAttributes.hasValue(0);
        o00ooOo2.o00ooOoo();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f563o00ooOOo == null) {
            this.f563o00ooOOo = LayoutInflater.from(getContext());
        }
        return this.f563o00ooOOo;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f565o0O0o;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f549o00oo;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f549o00oo.getLayoutParams();
        rect.top = this.f549o00oo.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public o00oo0OO getItemData() {
        return this.f551o00oo0O0;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void initialize(o00oo0OO o00oo0oo, int i) {
        this.f551o00oo0O0 = o00oo0oo;
        setVisibility(o00oo0oo.isVisible() ? 0 : 8);
        setTitle(o00oo0oo.o00oOooo(this));
        setCheckable(o00oo0oo.isCheckable());
        setShortcut(o00oo0oo.o00ooOO(), o00oo0oo.o00oOoOo());
        setIcon(o00oo0oo.getIcon());
        setEnabled(o00oo0oo.isEnabled());
        setSubMenuArrowVisible(o00oo0oo.hasSubMenu());
        setContentDescription(o00oo0oo.f703o00ooOO0);
    }

    public final void o00oOOo0(View view) {
        o00oOOoO(view, -1);
    }

    public final void o00oOOoO(View view, int i) {
        LinearLayout linearLayout = this.f558o00ooO00;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final void o00oOo00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f553o00oo0o = checkBox;
        o00oOOo0(checkBox);
    }

    public final void o00oOo0O() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f552o00oo0Oo = radioButton;
        o00oOOo0(radioButton);
    }

    public final void o00oOooO() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f550o00oo0O = imageView;
        o00oOOoO(imageView, 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        o0O0o00O.o0O0ooo0(this, this.f557o00ooO0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f554o00oo0o0 = textView;
        int i = this.f559o00ooO0O;
        if (i != -1) {
            textView.setTextAppearance(this.f560o00ooO0o, i);
        }
        this.f555o00oo0oO = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f565o0O0o = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f562o00ooOO0);
        }
        this.f549o00oo = (ImageView) findViewById(R.id.group_divider);
        this.f558o00ooO00 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f550o00oo0O != null && this.f556o00ooO) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f550o00oo0O.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f552o00oo0Oo == null && this.f553o00oo0o == null) {
            return;
        }
        if (this.f551o00oo0O0.o00oo0O0()) {
            if (this.f552o00oo0Oo == null) {
                o00oOo0O();
            }
            compoundButton = this.f552o00oo0Oo;
            view = this.f553o00oo0o;
        } else {
            if (this.f553o00oo0o == null) {
                o00oOo00();
            }
            compoundButton = this.f553o00oo0o;
            view = this.f552o00oo0Oo;
        }
        if (z) {
            compoundButton.setChecked(this.f551o00oo0O0.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f553o00oo0o;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f552o00oo0Oo;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f551o00oo0O0.o00oo0O0()) {
            if (this.f552o00oo0Oo == null) {
                o00oOo0O();
            }
            compoundButton = this.f552o00oo0Oo;
        } else {
            if (this.f553o00oo0o == null) {
                o00oOo00();
            }
            compoundButton = this.f553o00oo0o;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f564o00ooOo0 = z;
        this.f556o00ooO = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f549o00oo;
        if (imageView != null) {
            imageView.setVisibility((this.f561o00ooOO || !z) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setIcon(Drawable drawable) {
        boolean z = this.f551o00oo0O0.o00ooOO0() || this.f564o00ooOo0;
        if (z || this.f556o00ooO) {
            ImageView imageView = this.f550o00oo0O;
            if (imageView == null && drawable == null && !this.f556o00ooO) {
                return;
            }
            if (imageView == null) {
                o00oOooO();
            }
            if (drawable == null && !this.f556o00ooO) {
                this.f550o00oo0O.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f550o00oo0O;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f550o00oo0O.getVisibility() != 0) {
                this.f550o00oo0O.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setShortcut(boolean z, char c) {
        int i = (z && this.f551o00oo0O0.o00ooOO()) ? 0 : 8;
        if (i == 0) {
            this.f555o00oo0oO.setText(this.f551o00oo0O0.o00oOoo0());
        }
        if (this.f555o00oo0oO.getVisibility() != i) {
            this.f555o00oo0oO.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f554o00oo0o0.setText(charSequence);
            if (this.f554o00oo0o0.getVisibility() == 0) {
                return;
            }
            textView = this.f554o00oo0o0;
            i = 0;
        } else {
            i = 8;
            if (this.f554o00oo0o0.getVisibility() == 8) {
                return;
            }
            textView = this.f554o00oo0o0;
        }
        textView.setVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.o0O0o.o00oOOo0
    public boolean showsIcon() {
        return this.f564o00ooOo0;
    }
}
