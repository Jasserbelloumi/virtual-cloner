package o0ooO0O0;

import android.content.Context;
import android.widget.Toast;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import multispace.multiapp.clone.app.App;
import o00oOooO.o0OOO0O;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006\"$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "", o00ooOoo.oOo000Oo.f9215o0O00o00, "Lo0OO0o/oO0Ooooo;", "o00oOooO", "o00oOo0O", "", "msgID", "o00oOo00", "Landroid/widget/Toast;", "o00oOOo0", "Landroid/widget/Toast;", "()Landroid/widget/Toast;", o00oOOoO.f12961o00oOo00, "(Landroid/widget/Toast;)V", "toastImpl", "app_vcamRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class oO0OOO0 {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Toast f17128o00oOOo0;

    @Nullable
    public static final Toast o00oOOo0() {
        return f17128o00oOOo0;
    }

    public static final void o00oOOoO(@Nullable Toast toast) {
        f17128o00oOOo0 = toast;
    }

    public static final void o00oOo00(@o0OOO0O int i) {
        o00oOo0O(ooo0o.o00oOOo0(i, new String[0]));
    }

    public static final void o00oOo0O(@NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{53, -58, Byte.MAX_VALUE}, new byte[]{88, -75, Ascii.CAN, -84, 112, -107, 45, 82}));
        o00oOooO(App.f6679o00oo0Oo.o00oOOo0(), str);
    }

    public static final void o00oOooO(@NotNull Context context, @NotNull String str) {
        o0ooO.o00oo0O0(context, o00oo.o00oOOo0(new byte[]{-59, -24, 32, 67, -25, -89}, new byte[]{-7, -100, 72, 42, -108, -103, -23, 17}));
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{97, Ascii.DC2, -56}, new byte[]{Ascii.FF, 97, -81, 63, -59, -81, 114, -103}));
        Toast toast = f17128o00oOOo0;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 0);
        f17128o00oOOo0 = makeText;
        if (makeText != null) {
            makeText.show();
        }
    }
}
