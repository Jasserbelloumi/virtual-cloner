package o00oOoOo;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f7000o00oOOo0;

    public o00oo00O(Context context) {
        this.f7000o00oOOo0 = context;
    }

    public static o00oo00O o00oOOoO(Context context) {
        return new o00oo00O(context);
    }

    public boolean o00oOOo0() {
        return this.f7000o00oOOo0.getApplicationInfo().targetSdkVersion < 14;
    }

    public int o00oOo00() {
        return this.f7000o00oOOo0.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int o00oOo0O() {
        return this.f7000o00oOOo0.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int o00oOo0o() {
        TypedArray obtainStyledAttributes = this.f7000o00oOOo0.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
        Resources resources = this.f7000o00oOOo0.getResources();
        if (!o00oOoO0()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean o00oOoO() {
        return true;
    }

    public boolean o00oOoO0() {
        return this.f7000o00oOOo0.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public int o00oOooO() {
        Configuration configuration = this.f7000o00oOOo0.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }
}
