package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOo0O;
import o00oOooO.o0OO0oO;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements o0O000oo.oo0OOoo {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f869o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f870o00ooO0 = 15;
    @SuppressLint({"ResourceType"})
    @o00oOooO.o0OOOO00

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int[] f871o00ooO00 = {16843505};

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f872o00ooO0O = "AppCompatSpinner";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f873o00ooO0o = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f874o00ooOO0 = -1;

    /* renamed from: o00oo  reason: collision with root package name */
    public final Rect f875o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f876o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final androidx.appcompat.widget.o00oo0 f877o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0O0o00O f878o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final boolean f879o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public SpinnerAdapter f880o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oo0O0 f881o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f882o0O0o;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f883o00oo0O0;

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

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f883o00oo0O0 = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f883o00oo0O0 ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0o00O {

        /* renamed from: o00ooO0  reason: collision with root package name */
        public final /* synthetic */ o00oo0OO f884o00ooO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(View view, o00oo0OO o00oo0oo) {
            super(view);
            this.f884o00ooO0 = o00oo0oo;
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        public o00oOoo0.o00ooO0 o00oOOoO() {
            return this.f884o00ooO0;
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        @SuppressLint({"SyntheticAccessor"})
        public boolean o00oOo00() {
            if (AppCompatSpinner.this.getInternalPopup().o00oOOo0()) {
                return true;
            }
            AppCompatSpinner.this.o00oOOoO();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements ViewTreeObserver.OnGlobalLayoutListener {
        public o00oOOoO() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().o00oOOo0()) {
                AppCompatSpinner.this.o00oOOoO();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                o00oOo00.o00oOOo0(viewTreeObserver, this);
            }
        }
    }

    @o00oOooO.o0OOooO0(16)
    /* loaded from: classes.dex */
    public static final class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 ViewTreeObserver viewTreeObserver, @o00oOooO.o0OO00OO ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static final class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(@o00oOooO.oo0oO0 View view) {
            return view.getTextAlignment();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(@o00oOooO.oo0oO0 View view) {
            return view.getTextDirection();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 View view, int i) {
            view.setTextAlignment(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(@o00oOooO.oo0oO0 View view, int i) {
            view.setTextDirection(i);
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static final class o00oOoO {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 ThemedSpinnerAdapter themedSpinnerAdapter, @o00oOooO.o0OO00OO Resources.Theme theme) {
            if (oO0Ooooo.o00oOOo0.o00oOOo0(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 implements ListAdapter, SpinnerAdapter {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public ListAdapter f887o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public SpinnerAdapter f888o00oo0O0;

        public o00oo0(@o00oOooO.o0OO00OO SpinnerAdapter spinnerAdapter, @o00oOooO.o0OO00OO Resources.Theme theme) {
            this.f888o00oo0O0 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f887o00oo0O = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    o00oOoO.o00oOOo0((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof o0OO0oO0) {
                    o0OO0oO0 o0oo0oo0 = (o0OO0oO0) spinnerAdapter;
                    if (o0oo0oo0.getDropDownViewTheme() == null) {
                        o0oo0oo0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f887o00oo0O;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f887o00oo0O;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f888o00oo0O0;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @o00oOooO.o0o0000
    /* loaded from: classes.dex */
    public class o00oo00O implements o00oo0O0, DialogInterface.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public ListAdapter f889o00oo0O;
        @o00oOooO.o0o0000

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public androidx.appcompat.app.o00oOo0O f890o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public CharSequence f891o00oo0Oo;

        public o00oo00O() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void dismiss() {
            androidx.appcompat.app.o00oOo0O o00ooo0o2 = this.f890o00oo0O0;
            if (o00ooo0o2 != null) {
                o00ooo0o2.dismiss();
                this.f890o00oo0O0 = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public boolean o00oOOo0() {
            androidx.appcompat.app.o00oOo0O o00ooo0o2 = this.f890o00oo0O0;
            if (o00ooo0o2 != null) {
                return o00ooo0o2.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public int o00oOOoO() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public CharSequence o00oOo0O() {
            return this.f891o00oo0Oo;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public Drawable o00oOo0o() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoO(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoO0(CharSequence charSequence) {
            this.f891o00oo0Oo = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoOO(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoOo(int i, int i2) {
            if (this.f889o00oo0O == null) {
                return;
            }
            o00oOo0O.o00oOOo0 o00oooo02 = new o00oOo0O.o00oOOo0(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f891o00oo0Oo;
            if (charSequence != null) {
                o00oooo02.setTitle(charSequence);
            }
            androidx.appcompat.app.o00oOo0O create = o00oooo02.setSingleChoiceItems(this.f889o00oo0O, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f890o00oo0O0 = create;
            ListView o00oOo002 = create.o00oOo00();
            o00oOo0O.o00oOooO(o00oOo002, i);
            o00oOo0O.o00oOo00(o00oOo002, i2);
            this.f890o00oo0O0.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public int o00oOoo0() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOooO(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public int o00oOooo() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oo00O(ListAdapter listAdapter) {
            this.f889o00oo0O = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f889o00oo0O.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void setBackgroundDrawable(Drawable drawable) {
        }
    }

    @o00oOooO.o0o0000
    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        void dismiss();

        boolean o00oOOo0();

        int o00oOOoO();

        CharSequence o00oOo0O();

        Drawable o00oOo0o();

        void o00oOoO(int i);

        void o00oOoO0(CharSequence charSequence);

        void o00oOoOO(int i);

        void o00oOoOo(int i, int i2);

        int o00oOoo0();

        void o00oOooO(int i);

        int o00oOooo();

        void o00oo00O(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    @o00oOooO.o0o0000
    /* loaded from: classes.dex */
    public class o00oo0OO extends o0oOo0O0 implements o00oo0O0 {

        /* renamed from: o0O00O  reason: collision with root package name */
        public int f893o0O00O;

        /* renamed from: o0O00O0  reason: collision with root package name */
        public CharSequence f894o0O00O0;

        /* renamed from: o0O00O0o  reason: collision with root package name */
        public final Rect f895o0O00O0o;

        /* renamed from: o0OoO00O  reason: collision with root package name */
        public ListAdapter f897o0OoO00O;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements AdapterView.OnItemClickListener {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ AppCompatSpinner f899o00oo0O0;

            public o00oOOo0(AppCompatSpinner appCompatSpinner) {
                this.f899o00oo0O0 = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    o00oo0OO o00oo0oo = o00oo0OO.this;
                    AppCompatSpinner.this.performItemClick(view, i, o00oo0oo.f897o0OoO00O.getItemId(i));
                }
                o00oo0OO.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO implements ViewTreeObserver.OnGlobalLayoutListener {
            public o00oOOoO() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                o00oo0OO o00oo0oo = o00oo0OO.this;
                if (!o00oo0oo.o0oO0Ooo(AppCompatSpinner.this)) {
                    o00oo0OO.this.dismiss();
                    return;
                }
                o00oo0OO.this.o0O00Oo();
                o00oo0OO.super.show();
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 implements PopupWindow.OnDismissListener {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f902o00oo0O0;

            public o00oOo00(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f902o00oo0O0 = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f902o00oo0O0);
                }
            }
        }

        public o00oo0OO(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f895o0O00O0o = new Rect();
            o00oooo0(AppCompatSpinner.this);
            o0O000Oo(true);
            o0O00(0);
            o0O000o0(new o00oOOo0(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public CharSequence o00oOo0O() {
            return this.f894o0O00O0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoO0(CharSequence charSequence) {
            this.f894o0O00O0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoOO(int i) {
            this.f893o0O00O = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oOoOo(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean o00oOOo02 = o00oOOo0();
            o0O00Oo();
            o0O000(2);
            super.show();
            ListView o00oo0OO2 = o00oo0OO();
            o00oo0OO2.setChoiceMode(1);
            o00oOo0O.o00oOooO(o00oo0OO2, i);
            o00oOo0O.o00oOo00(o00oo0OO2, i2);
            o0OoO00O(AppCompatSpinner.this.getSelectedItemPosition());
            if (o00oOOo02 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            o00oOOoO o00ooooo2 = new o00oOOoO();
            viewTreeObserver.addOnGlobalLayoutListener(o00ooooo2);
            o0OoOoOO(new o00oOo00(o00ooooo2));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public int o00oOooo() {
            return this.f893o0O00O;
        }

        @Override // androidx.appcompat.widget.o0oOo0O0, androidx.appcompat.widget.AppCompatSpinner.o00oo0O0
        public void o00oo00O(ListAdapter listAdapter) {
            super.o00oo00O(listAdapter);
            this.f897o0OoO00O = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void o0O00Oo() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.o00oOo0o()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f875o00oo
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = androidx.appcompat.widget.o.o00oOOoO(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f875o00oo
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f875o00oo
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f875o00oo
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f882o0O0o
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f897o0OoO00O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.o00oOo0o()
                int r4 = r4.o00oOOo0(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f875o00oo
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.o00ooooO(r4)
                goto L85
            L82:
                r8.o00ooooO(r5)
            L85:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = androidx.appcompat.widget.o.o00oOOoO(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.o00ooOo0()
                int r3 = r3 - r0
                int r0 = r8.o00oOooo()
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto La1
            L9a:
                int r2 = r8.o00oOooo()
                int r2 = r2 + r0
                int r3 = r2 + r1
            La1:
                r8.o00oOooO(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.o00oo0OO.o0O00Oo():void");
        }

        public boolean o0oO0Ooo(View view) {
            return o0O000oo.o0O0o00O.o0O0OOoo(view) && view.getGlobalVisibleRect(this.f895o0O00O0o);
        }
    }

    public AppCompatSpinner(@o00oOooO.oo0oO0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(@o00oOooO.oo0oO0 Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r10 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(@o00oOooO.oo0oO0 android.content.Context r6, @o00oOooO.o0OO00OO android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f875o00oo = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.o0OO0o.o00oOOo0(r5, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.o0OOO0 r0 = androidx.appcompat.widget.o0OOO0.o00ooOo(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.o00oo0 r2 = new androidx.appcompat.widget.o00oo0
            r2.<init>(r5)
            r5.f877o00oo0O0 = r2
            if (r10 == 0) goto L29
            o00oOoOo.o00oo0O0 r2 = new o00oOoOo.o00oo0O0
            r2.<init>(r6, r10)
        L26:
            r5.f876o00oo0O = r2
            goto L39
        L29:
            int r10 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r10 = r0.o00oo0oO(r10, r1)
            if (r10 == 0) goto L37
            o00oOoOo.o00oo0O0 r2 = new o00oOoOo.o00oo0O0
            r2.<init>(r6, r10)
            goto L26
        L37:
            r5.f876o00oo0O = r6
        L39:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L5f
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.f871o00ooO00     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5b
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L5c
            if (r3 == 0) goto L4d
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L5c
        L4d:
            r10.recycle()
            goto L5f
        L51:
            r6 = move-exception
            r2 = r10
            goto L55
        L54:
            r6 = move-exception
        L55:
            if (r2 == 0) goto L5a
            r2.recycle()
        L5a:
            throw r6
        L5b:
            r10 = r2
        L5c:
            if (r10 == 0) goto L5f
            goto L4d
        L5f:
            r10 = 1
            if (r9 == 0) goto L9b
            if (r9 == r10) goto L65
            goto Lab
        L65:
            androidx.appcompat.widget.AppCompatSpinner$o00oo0OO r9 = new androidx.appcompat.widget.AppCompatSpinner$o00oo0OO
            android.content.Context r3 = r5.f876o00oo0O
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f876o00oo0O
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.o0OOO0 r1 = androidx.appcompat.widget.o0OOO0.o00ooOo(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.o00oo0O(r3, r4)
            r5.f882o0O0o = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.o00oOoO(r3)
            r9.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.o00oo(r3)
            r9.f894o0O00O0 = r3
            r1.o00ooOoo()
            r5.f881o00oo0oO = r9
            androidx.appcompat.widget.AppCompatSpinner$o00oOOo0 r1 = new androidx.appcompat.widget.AppCompatSpinner$o00oOOo0
            r1.<init>(r5, r9)
            r5.f878o00oo0Oo = r1
            goto Lab
        L9b:
            androidx.appcompat.widget.AppCompatSpinner$o00oo00O r9 = new androidx.appcompat.widget.AppCompatSpinner$o00oo00O
            r9.<init>()
            r5.f881o00oo0oO = r9
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.o00oo(r1)
            r9.o00oOoO0(r1)
        Lab:
            int r9 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.o00ooO0(r9)
            if (r9 == 0) goto Lc3
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lc3:
            r0.o00ooOoo()
            r5.f879o00oo0o = r10
            android.widget.SpinnerAdapter r6 = r5.f880o00oo0o0
            if (r6 == 0) goto Ld1
            r5.setAdapter(r6)
            r5.f880o00oo0o0 = r2
        Ld1:
            androidx.appcompat.widget.o00oo0 r6 = r5.f877o00oo0O0
            r6.o00oOo0O(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        return o00oo0o02 != null ? o00oo0o02.o00oOOoO() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        return o00oo0o02 != null ? o00oo0o02.o00oOoo0() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f881o00oo0oO != null ? this.f882o0O0o : super.getDropDownWidth();
    }

    @o00oOooO.o0o0000
    public final o00oo0O0 getInternalPopup() {
        return this.f881o00oo0oO;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        return o00oo0o02 != null ? o00oo0o02.o00oOo0o() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f876o00oo0O;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        return o00oo0o02 != null ? o00oo0o02.o00oOo0O() : super.getPrompt();
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    public int o00oOOo0(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f875o00oo);
            Rect rect = this.f875o00oo;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    public void o00oOOoO() {
        this.f881o00oo0oO.o00oOoOo(o00oOo0O.o00oOOoO(this), o00oOo0O.o00oOOo0(this));
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 == null || !o00oo0o02.o00oOOo0()) {
            return;
        }
        this.f881o00oo0oO.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f881o00oo0oO == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), o00oOOo0(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f883o00oo0O0 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o00oOOoO());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        savedState.f883o00oo0O0 = o00oo0o02 != null && o00oo0o02.o00oOOo0();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o0O0o00O o0o0o00o = this.f878o00oo0Oo;
        if (o0o0o00o == null || !o0o0o00o.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 != null) {
            if (o00oo0o02.o00oOOo0()) {
                return true;
            }
            o00oOOoO();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f879o00oo0o) {
            this.f880o00oo0o0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f881o00oo0oO != null) {
            Context context = this.f876o00oo0O;
            if (context == null) {
                context = getContext();
            }
            this.f881o00oo0oO.o00oo00O(new o00oo0(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        o00oo0o02.o00oOoOO(i);
        this.f881o00oo0oO.o00oOooO(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 != null) {
            o00oo0o02.o00oOoO(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f881o00oo0oO != null) {
            this.f882o0O0o = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 != null) {
            o00oo0o02.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        setPopupBackgroundDrawable(o00oOo0o.o00oOo00.o00oOOoO(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        o00oo0O0 o00oo0o02 = this.f881o00oo0oO;
        if (o00oo0o02 != null) {
            o00oo0o02.o00oOoO0(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        androidx.appcompat.widget.o00oo0 o00oo0Var = this.f877o00oo0O0;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }
}
