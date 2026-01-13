package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@oo0oO0 Context context) {
        this(context, null);
    }

    public PreferenceCategory(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet, o0O0o00.o00oOOo0(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    public PreferenceCategory(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean o00oooo0() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        super.o0O000o0(o0o000oo);
        o0o000oo.itemView.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public boolean o0O0o0() {
        return !super.o00oooo0();
    }

    public PreferenceCategory(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
