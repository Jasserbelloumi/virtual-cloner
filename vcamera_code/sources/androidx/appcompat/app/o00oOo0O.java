package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOo0O extends o0O0o implements DialogInterface {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f395o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f396o00oo0Oo = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final AlertController f397o00oo0O0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        private final AlertController.o00oo00O P;
        private final int mTheme;

        public o00oOOo0(@oo0oO0 Context context) {
            this(context, o00oOo0O.o00oOooO(context, 0));
        }

        public o00oOOo0(@oo0oO0 Context context, @o0OOO0OO int i) {
            this.P = new AlertController.o00oo00O(new ContextThemeWrapper(context, o00oOo0O.o00oOooO(context, i)));
            this.mTheme = i;
        }

        @oo0oO0
        public o00oOo0O create() {
            o00oOo0O o00ooo0o2 = new o00oOo0O(this.P.f183o00oOOo0, this.mTheme);
            this.P.o00oOOo0(o00ooo0o2.f397o00oo0O0);
            o00ooo0o2.setCancelable(this.P.f201o00oo0Oo);
            if (this.P.f201o00oo0Oo) {
                o00ooo0o2.setCanceledOnTouchOutside(true);
            }
            o00ooo0o2.setOnCancelListener(this.P.f203o00oo0o0);
            o00ooo0o2.setOnDismissListener(this.P.f202o00oo0o);
            DialogInterface.OnKeyListener onKeyListener = this.P.f204o00oo0oO;
            if (onKeyListener != null) {
                o00ooo0o2.setOnKeyListener(onKeyListener);
            }
            return o00ooo0o2;
        }

        @oo0oO0
        public Context getContext() {
            return this.P.f183o00oOOo0;
        }

        public o00oOOo0 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f195o00oo = listAdapter;
            o00oo00o.f207o00ooO00 = onClickListener;
            return this;
        }

        public o00oOOo0 setCancelable(boolean z) {
            this.P.f201o00oo0Oo = z;
            return this;
        }

        public o00oOOo0 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f217o00ooo0 = cursor;
            o00oo00o.f219o00ooo0O = str;
            o00oo00o.f207o00ooO00 = onClickListener;
            return this;
        }

        public o00oOOo0 setCustomTitle(@o0OO00OO View view) {
            this.P.f189o00oOoO0 = view;
            return this;
        }

        public o00oOOo0 setIcon(@o0O0O0o0 int i) {
            this.P.f185o00oOo00 = i;
            return this;
        }

        public o00oOOo0 setIcon(@o0OO00OO Drawable drawable) {
            this.P.f193o00oOooO = drawable;
            return this;
        }

        public o00oOOo0 setIconAttribute(@o00oOooO.o0O000Oo int i) {
            TypedValue typedValue = new TypedValue();
            this.P.f183o00oOOo0.getTheme().resolveAttribute(i, typedValue, true);
            this.P.f185o00oOo00 = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public o00oOOo0 setInverseBackgroundForced(boolean z) {
            this.P.f221o00oooO = z;
            return this;
        }

        public o00oOOo0 setItems(@o00oOooO.o0OoOoOo int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = o00oo00o.f183o00oOOo0.getResources().getTextArray(i);
            this.P.f207o00ooO00 = onClickListener;
            return this;
        }

        public o00oOOo0 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = charSequenceArr;
            o00oo00o.f207o00ooO00 = onClickListener;
            return this;
        }

        public o00oOOo0 setMessage(@o0OOO0O int i) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f188o00oOoO = o00oo00o.f183o00oOOo0.getText(i);
            return this;
        }

        public o00oOOo0 setMessage(@o0OO00OO CharSequence charSequence) {
            this.P.f188o00oOoO = charSequence;
            return this;
        }

        public o00oOOo0 setMultiChoiceItems(@o00oOooO.o0OoOoOo int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = o00oo00o.f183o00oOOo0.getResources().getTextArray(i);
            AlertController.o00oo00O o00oo00o2 = this.P;
            o00oo00o2.f218o00ooo00 = onMultiChoiceClickListener;
            o00oo00o2.f214o00ooOo0 = zArr;
            o00oo00o2.f213o00ooOo = true;
            return this;
        }

        public o00oOOo0 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f217o00ooo0 = cursor;
            o00oo00o.f218o00ooo00 = onMultiChoiceClickListener;
            o00oo00o.f220o00ooo0o = str;
            o00oo00o.f219o00ooo0O = str2;
            o00oo00o.f213o00ooOo = true;
            return this;
        }

        public o00oOOo0 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = charSequenceArr;
            o00oo00o.f218o00ooo00 = onMultiChoiceClickListener;
            o00oo00o.f214o00ooOo0 = zArr;
            o00oo00o.f213o00ooOo = true;
            return this;
        }

        public o00oOOo0 setNegativeButton(@o0OOO0O int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f194o00oOooo = o00oo00o.f183o00oOOo0.getText(i);
            this.P.f196o00oo0 = onClickListener;
            return this;
        }

        public o00oOOo0 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f194o00oOooo = charSequence;
            o00oo00o.f196o00oo0 = onClickListener;
            return this;
        }

        public o00oOOo0 setNegativeButtonIcon(Drawable drawable) {
            this.P.f197o00oo00O = drawable;
            return this;
        }

        public o00oOOo0 setNeutralButton(@o0OOO0O int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f200o00oo0OO = o00oo00o.f183o00oOOo0.getText(i);
            this.P.f198o00oo0O = onClickListener;
            return this;
        }

        public o00oOOo0 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f200o00oo0OO = charSequence;
            o00oo00o.f198o00oo0O = onClickListener;
            return this;
        }

        public o00oOOo0 setNeutralButtonIcon(Drawable drawable) {
            this.P.f199o00oo0O0 = drawable;
            return this;
        }

        public o00oOOo0 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f203o00oo0o0 = onCancelListener;
            return this;
        }

        public o00oOOo0 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f202o00oo0o = onDismissListener;
            return this;
        }

        public o00oOOo0 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.f222o00oooOO = onItemSelectedListener;
            return this;
        }

        public o00oOOo0 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f204o00oo0oO = onKeyListener;
            return this;
        }

        public o00oOOo0 setPositiveButton(@o0OOO0O int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f190o00oOoOO = o00oo00o.f183o00oOOo0.getText(i);
            this.P.f192o00oOoo0 = onClickListener;
            return this;
        }

        public o00oOOo0 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f190o00oOoOO = charSequence;
            o00oo00o.f192o00oOoo0 = onClickListener;
            return this;
        }

        public o00oOOo0 setPositiveButtonIcon(Drawable drawable) {
            this.P.f191o00oOoOo = drawable;
            return this;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOOo0 setRecycleOnMeasureEnabled(boolean z) {
            this.P.f224o00oooo0 = z;
            return this;
        }

        public o00oOOo0 setSingleChoiceItems(@o00oOooO.o0OoOoOo int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = o00oo00o.f183o00oOOo0.getResources().getTextArray(i);
            AlertController.o00oo00O o00oo00o2 = this.P;
            o00oo00o2.f207o00ooO00 = onClickListener;
            o00oo00o2.f216o00ooOoo = i2;
            o00oo00o2.f215o00ooOoO = true;
            return this;
        }

        public o00oOOo0 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f217o00ooo0 = cursor;
            o00oo00o.f207o00ooO00 = onClickListener;
            o00oo00o.f216o00ooOoo = i;
            o00oo00o.f219o00ooo0O = str;
            o00oo00o.f215o00ooOoO = true;
            return this;
        }

        public o00oOOo0 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f195o00oo = listAdapter;
            o00oo00o.f207o00ooO00 = onClickListener;
            o00oo00o.f216o00ooOoo = i;
            o00oo00o.f215o00ooOoO = true;
            return this;
        }

        public o00oOOo0 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f225o0O0o = charSequenceArr;
            o00oo00o.f207o00ooO00 = onClickListener;
            o00oo00o.f216o00ooOoo = i;
            o00oo00o.f215o00ooOoO = true;
            return this;
        }

        public o00oOOo0 setTitle(@o0OOO0O int i) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f187o00oOo0o = o00oo00o.f183o00oOOo0.getText(i);
            return this;
        }

        public o00oOOo0 setTitle(@o0OO00OO CharSequence charSequence) {
            this.P.f187o00oOo0o = charSequence;
            return this;
        }

        public o00oOOo0 setView(int i) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f208o00ooO0O = null;
            o00oo00o.f206o00ooO0 = i;
            o00oo00o.f212o00ooOOo = false;
            return this;
        }

        public o00oOOo0 setView(View view) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f208o00ooO0O = view;
            o00oo00o.f206o00ooO0 = 0;
            o00oo00o.f212o00ooOOo = false;
            return this;
        }

        @Deprecated
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOOo0 setView(View view, int i, int i2, int i3, int i4) {
            AlertController.o00oo00O o00oo00o = this.P;
            o00oo00o.f208o00ooO0O = view;
            o00oo00o.f206o00ooO0 = 0;
            o00oo00o.f212o00ooOOo = true;
            o00oo00o.f209o00ooO0o = i;
            o00oo00o.f205o00ooO = i2;
            o00oo00o.f211o00ooOO0 = i3;
            o00oo00o.f210o00ooOO = i4;
            return this;
        }

        public o00oOo0O show() {
            o00oOo0O create = create();
            create.show();
            return create;
        }
    }

    public o00oOo0O(@oo0oO0 Context context) {
        this(context, 0);
    }

    public o00oOo0O(@oo0oO0 Context context, @o0OOO0OO int i) {
        super(context, o00oOooO(context, i));
        this.f397o00oo0O0 = new AlertController(getContext(), this, getWindow());
    }

    public o00oOo0O(@oo0oO0 Context context, boolean z, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public static int o00oOooO(@oo0oO0 Context context, @o0OOO0OO int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button o00oOOoO(int i) {
        return this.f397o00oo0O0.o00oOo00(i);
    }

    public ListView o00oOo00() {
        return this.f397o00oo0O0.o00oOo0O();
    }

    public void o00oOo0O(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f397o00oo0O0.o00oOooo(i, charSequence, onClickListener, null, null);
    }

    public void o00oOo0o(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f397o00oo0O0.o00oOooo(i, charSequence, onClickListener, null, drawable);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoO(int i) {
        this.f397o00oo0O0.o00oo00O(i);
    }

    public void o00oOoO0(int i, CharSequence charSequence, Message message) {
        this.f397o00oo0O0.o00oOooo(i, charSequence, null, message, null);
    }

    public void o00oOoOO(View view) {
        this.f397o00oo0O0.o00oo0(view);
    }

    public void o00oOoOo(int i) {
        this.f397o00oo0O0.o00oo0OO(i);
    }

    public void o00oOoo0(Drawable drawable) {
        this.f397o00oo0O0.o00oo0O0(drawable);
    }

    public void o00oOooo(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.f397o00oo0O0.o00oo0OO(typedValue.resourceId);
    }

    public void o00oo0(View view) {
        this.f397o00oo0O0.o00oo0oO(view);
    }

    public void o00oo00O(CharSequence charSequence) {
        this.f397o00oo0O0.o00oo0O(charSequence);
    }

    public void o00oo0OO(View view, int i, int i2, int i3, int i4) {
        this.f397o00oo0O0.o0O0o(view, i, i2, i3, i4);
    }

    @Override // androidx.appcompat.app.o0O0o, androidx.activity.o00oo0O0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f397o00oo0O0.o00oOo0o();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f397o00oo0O0.o00oOoO(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f397o00oo0O0.o00oOoOO(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.o0O0o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f397o00oo0O0.o00oo0o0(charSequence);
    }
}
