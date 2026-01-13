package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0oo0000 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f1516o00oOoO = "TooltipPopup";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f1517o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final View f1518o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final TextView f1519o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Rect f1520o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final int[] f1521o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final int[] f1522o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final WindowManager.LayoutParams f1523o00oOooO;

    public o0oo0000(@o00oOooO.oo0oO0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1523o00oOooO = layoutParams;
        this.f1520o00oOo0O = new Rect();
        this.f1521o00oOo0o = new int[2];
        this.f1522o00oOoO0 = new int[2];
        this.f1517o00oOOo0 = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1518o00oOOoO = inflate;
        this.f1519o00oOo00 = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public static View o00oOOoO(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void o00oOOo0(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1517o00oOOo0.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1517o00oOOo0.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1517o00oOOo0.getResources().getDimensionPixelOffset(z ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View o00oOOoO2 = o00oOOoO(view);
        if (o00oOOoO2 == null) {
            return;
        }
        o00oOOoO2.getWindowVisibleDisplayFrame(this.f1520o00oOo0O);
        Rect rect = this.f1520o00oOo0O;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1517o00oOOo0.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1520o00oOo0O.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        o00oOOoO2.getLocationOnScreen(this.f1522o00oOoO0);
        view.getLocationOnScreen(this.f1521o00oOo0o);
        int[] iArr = this.f1521o00oOo0o;
        int i4 = iArr[0];
        int[] iArr2 = this.f1522o00oOoO0;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (o00oOOoO2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1518o00oOOoO.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1518o00oOOoO.getMeasuredHeight();
        int i6 = this.f1521o00oOo0o[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i8 <= this.f1520o00oOo0O.height() : i7 < 0) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i8;
        }
    }

    public void o00oOo00() {
        if (o00oOooO()) {
            ((WindowManager) this.f1517o00oOOo0.getSystemService("window")).removeView(this.f1518o00oOOoO);
        }
    }

    public void o00oOo0O(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (o00oOooO()) {
            o00oOo00();
        }
        this.f1519o00oOo00.setText(charSequence);
        o00oOOo0(view, i, i2, z, this.f1523o00oOooO);
        ((WindowManager) this.f1517o00oOOo0.getSystemService("window")).addView(this.f1518o00oOOoO, this.f1523o00oOooO);
    }

    public boolean o00oOooO() {
        return this.f1518o00oOOoO.getParent() != null;
    }
}
