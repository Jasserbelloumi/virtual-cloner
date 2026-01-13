package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.browser.R;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@Deprecated
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f1589o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f1590o00oo0O0;

    public BrowserActionsFallbackMenuView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1590o00oo0O0 = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f1589o00oo0O = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1590o00oo0O0 * 2), this.f1589o00oo0O), 1073741824), i2);
    }
}
