package o0O0oOO0;

import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOo.oo0OOoo;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0007¨\u0006\u0003"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "", "o00oOOo0", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O00o00 {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static final boolean o00oOOo0(@Nullable DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || oo0OOoo.o00oOoO0(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
