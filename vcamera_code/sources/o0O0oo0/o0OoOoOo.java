package o0O0oo0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ferfalk.simplesearchview.R;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lo0O0oo0/o0OoOoOo;", "", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "o00oOooO", "", o00oOOoO.f12961o00oOo00, "o00oOOo0", "Landroid/view/View;", "view", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "o00oOo00", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0OoOoOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OoOoOo f12771o00oOOo0 = new o0OoOoOo();

    @o0O00O
    @o00ooO0
    public static final int o00oOOo0(@NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    @o0O00O
    @o00ooO0
    public static final int o00oOOoO(@NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    @o00ooO0
    public static final void o00oOo00(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @o00ooO0
    public static final void o00oOo0O(@NotNull View view) {
        o0ooO.o00oo0O0(view, "view");
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    @o00ooO0
    @Nullable
    public static final Activity o00oOooO(@NotNull Context context) {
        o0ooO.o00oo0O0(context, "context");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            o0ooO.o00oo0OO(baseContext, "context.baseContext");
            return o00oOooO(baseContext);
        }
        return null;
    }
}
