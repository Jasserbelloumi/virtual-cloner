package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.o00oo00O;
import androidx.appcompat.widget.o0oOo0O0;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends o00oo00O {
    private static final int MAX_ITEMS_MEASURED = 15;
    @o0OO00OO
    private final AccessibilityManager accessibilityManager;
    @oo0oO0
    private final o0oOo0O0 modalListPopup;
    @oo0oO0
    private final Rect tempRect;

    public MaterialAutoCompleteTextView(@oo0oO0 Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialAutoCompleteTextView, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (obtainStyledAttributes.hasValue(i2) && obtainStyledAttributes.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        o0oOo0O0 o0ooo0o0 = new o0oOo0O0(context2);
        this.modalListPopup = o0ooo0o0;
        o0ooo0o0.o0O000Oo(true);
        o0ooo0o0.o00oooo0(this);
        o0ooo0o0.o0O000(2);
        o0ooo0o0.o00oo00O(getAdapter());
        o0ooo0o0.o0O000o0(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                MaterialAutoCompleteTextView.this.updateText(i3 < 0 ? materialAutoCompleteTextView.modalListPopup.o00ooO0o() : materialAutoCompleteTextView.getAdapter().getItem(i3));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i3 < 0) {
                        view = MaterialAutoCompleteTextView.this.modalListPopup.o00ooOO();
                        i3 = MaterialAutoCompleteTextView.this.modalListPopup.o00ooOO0();
                        j = MaterialAutoCompleteTextView.this.modalListPopup.o00ooO();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.o00oo0OO(), view, i3, j);
                }
                MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
            }
        });
        obtainStyledAttributes.recycle();
    }

    @o0OO00OO
    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.modalListPopup.o00ooOO0()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable o00oOo0o2 = this.modalListPopup.o00oOo0o();
        if (o00oOo0o2 != null) {
            o00oOo0o2.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            i2 += rect.left + rect.right;
        }
        return findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth() + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    @o0OO00OO
    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (findTextInputLayoutAncestor == null || !findTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : findTextInputLayoutAncestor.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@o0OO00OO T t) {
        super.setAdapter(t);
        this.modalListPopup.o00oo00O(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.modalListPopup.show();
        }
    }
}
