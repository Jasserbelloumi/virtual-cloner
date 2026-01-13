package o0O0oOo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import kotlin.Metadata;
import o00oOooO.o0O000Oo;
import o00oOooO.o0OoO00O;
import o0O0oo0O.o0OO00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\n"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "res", "attr", "Landroid/graphics/Typeface;", "o00oOOo0", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/Typeface;", "Landroid/content/Context;", "context", "o00oOo00", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0OOO {
    @o0OoO00O
    @Nullable
    public static final Typeface o00oOOo0(@NotNull o0OO00OO o0oo00oo, @o00oOooO.o0O0OO @Nullable Integer num, @o0O000Oo @Nullable Integer num2) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$font");
        o0OooO0.f12732o00oOOo0.o00oOOoO("font", num2, num);
        if (num != null) {
            return o00oOo00(o0oo00oo.f12800o00ooOo, num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = o0oo00oo.f12800o00ooOo.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    return null;
                }
                return o00oOo00(o0oo00oo.f12800o00ooOo, resourceId);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ Typeface o00oOOoO(o0OO00OO o0oo00oo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return o00oOOo0(o0oo00oo, num, num2);
    }

    public static final Typeface o00oOo00(Context context, @o00oOooO.o0O0OO int i) {
        try {
            return o00ooo0o.o0O0OO.o00oOoOo(context, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
