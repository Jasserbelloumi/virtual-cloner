package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.o00oOo0O;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import o00oOoOo.o00oo0O0;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O0O0O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OoOoOo;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes2.dex */
public class MaterialAlertDialogBuilder extends o00oOo0O.o00oOOo0 {
    @o0O000Oo
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    @o0OOO0OO
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    @o0O000Oo
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    @o0OO00OO
    private Drawable background;
    @oo0oO0
    @o0O0O0O
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(@oo0oO0 Context context) {
        this(context, 0);
    }

    public MaterialAlertDialogBuilder(@oo0oO0 Context context, int i) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = DEF_STYLE_ATTR;
        int i3 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i2, i3);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i2, i3);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(16844145, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            materialShapeDrawable.setCornerSize(dimension);
        }
        this.background = materialShapeDrawable;
    }

    private static Context createMaterialAlertDialogThemedContext(@oo0oO0 Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context wrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? wrap : new o00oo0O0(wrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@oo0oO0 Context context) {
        TypedValue resolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private static int getOverridingThemeResId(@oo0oO0 Context context, int i) {
        return i == 0 ? getMaterialAlertDialogThemeOverlay(context) : i;
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public o00oOo0O create() {
        o00oOo0O create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(o0O0o00O.o00oooo(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.backgroundInsets));
        return create;
    }

    @o0OO00OO
    public Drawable getBackground() {
        return this.background;
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setAdapter(@o0OO00OO ListAdapter listAdapter, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @oo0oO0
    public MaterialAlertDialogBuilder setBackground(@o0OO00OO Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @oo0oO0
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@o0OO0 int i) {
        this.backgroundInsets.bottom = i;
        return this;
    }

    @oo0oO0
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@o0OO0 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i;
        } else {
            this.backgroundInsets.right = i;
        }
        return this;
    }

    @oo0oO0
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@o0OO0 int i) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i;
        } else {
            this.backgroundInsets.left = i;
        }
        return this;
    }

    @oo0oO0
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@o0OO0 int i) {
        this.backgroundInsets.top = i;
        return this;
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setCursor(@o0OO00OO Cursor cursor, @o0OO00OO DialogInterface.OnClickListener onClickListener, @oo0oO0 String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setCustomTitle(@o0OO00OO View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setIcon(@o0O0O0o0 int i) {
        return (MaterialAlertDialogBuilder) super.setIcon(i);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setIcon(@o0OO00OO Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setIconAttribute(@o0O000Oo int i) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setItems(@o0OoOoOo int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setItems(@o0OO00OO CharSequence[] charSequenceArr, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setMessage(@o0OOO0O int i) {
        return (MaterialAlertDialogBuilder) super.setMessage(i);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setMessage(@o0OO00OO CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@o0OoOoOo int i, @o0OO00OO boolean[] zArr, @o0OO00OO DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@o0OO00OO Cursor cursor, @oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@o0OO00OO CharSequence[] charSequenceArr, @o0OO00OO boolean[] zArr, @o0OO00OO DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNegativeButton(@o0OOO0O int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNegativeButton(@o0OO00OO CharSequence charSequence, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@o0OO00OO Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNeutralButton(@o0OOO0O int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNeutralButton(@o0OO00OO CharSequence charSequence, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@o0OO00OO Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setOnCancelListener(@o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setOnDismissListener(@o0OO00OO DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@o0OO00OO AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setOnKeyListener(@o0OO00OO DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setPositiveButton(@o0OOO0O int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setPositiveButton(@o0OO00OO CharSequence charSequence, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@o0OO00OO Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@o0OoOoOo int i, int i2, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@o0OO00OO Cursor cursor, int i, @oo0oO0 String str, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@o0OO00OO ListAdapter listAdapter, int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@o0OO00OO CharSequence[] charSequenceArr, int i, @o0OO00OO DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setTitle(@o0OOO0O int i) {
        return (MaterialAlertDialogBuilder) super.setTitle(i);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setTitle(@o0OO00OO CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setView(int i) {
        return (MaterialAlertDialogBuilder) super.setView(i);
    }

    @Override // androidx.appcompat.app.o00oOo0O.o00oOOo0
    @oo0oO0
    public MaterialAlertDialogBuilder setView(@o0OO00OO View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }
}
