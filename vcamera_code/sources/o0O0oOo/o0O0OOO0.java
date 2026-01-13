package o0O0oOo;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00oO0;
import o0O0oo0O.o0OO00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000¨\u0006\u000b"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "res", "attr", "", "fallback", "o00oOOo0", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/lang/Integer;F)F", "Landroid/view/View;", "value", "o00oOo00", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0OOO0 {
    public static final float o00oOOo0(@NotNull o0OO00OO o0oo00oo, @o0O00oO0 @Nullable Integer num, @o0O000Oo @Nullable Integer num2, float f) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$dimen");
        o0OooO0.f12732o00oOOo0.o00oOOoO("dimen", num2, num);
        if (num != null) {
            return o0oo00oo.f12800o00ooOo.getResources().getDimension(num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = o0oo00oo.f12800o00ooOo.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                return obtainStyledAttributes.getDimension(0, f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ float o00oOOoO(o0OO00OO o0oo00oo, Integer num, Integer num2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        return o00oOOo0(o0oo00oo, num, num2, f);
    }

    public static final float o00oOo00(@NotNull View view, int i) {
        o0OOOOO0.o0ooO.o00oo0O(view, "$this$dp");
        Resources resources = view.getResources();
        o0OOOOO0.o0ooO.o00oOoO(resources, "resources");
        return TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }
}
