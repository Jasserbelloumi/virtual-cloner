package oooOO0;

import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import o0O0oOo.oo0OOoo;
import o0O0oo0O.o0OO00OO;
import o0O0oo0O.o0OO0O0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "o00oOo00", "Lo0O0oo0O/o0OO0O0;", "which", o00oOOoO.f12961o00oOo00, "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "o00oOOo0", "enabled", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o00oOOo0 {
    @NotNull
    public static final DialogActionButton o00oOOo0(@NotNull o0OO00OO o0oo00oo, @NotNull o0OO0O0 o0oo0o0) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        o0ooO.o00oo0O(o0oo00oo, "$this$getActionButton");
        o0ooO.o00oo0O(o0oo0o0, "which");
        DialogActionButtonLayout buttonsLayout = o0oo00oo.f12793o00ooO0.getButtonsLayout();
        if (buttonsLayout == null || (actionButtons = buttonsLayout.getActionButtons()) == null || (dialogActionButton = actionButtons[o0oo0o0.getIndex()]) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return dialogActionButton;
    }

    public static final boolean o00oOOoO(@NotNull o0OO00OO o0oo00oo, @NotNull o0OO0O0 o0oo0o0) {
        o0ooO.o00oo0O(o0oo00oo, "$this$hasActionButton");
        o0ooO.o00oo0O(o0oo0o0, "which");
        return oo0OOoo.o00oOoO0(o00oOOo0(o0oo00oo, o0oo0o0));
    }

    public static final boolean o00oOo00(@NotNull o0OO00OO o0oo00oo) {
        DialogActionButton[] visibleButtons;
        o0ooO.o00oo0O(o0oo00oo, "$this$hasActionButtons");
        DialogActionButtonLayout buttonsLayout = o0oo00oo.f12793o00ooO0.getButtonsLayout();
        if (buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null) {
            return false;
        }
        return !(visibleButtons.length == 0);
    }

    public static final void o00oOooO(@NotNull o0OO00OO o0oo00oo, @NotNull o0OO0O0 o0oo0o0, boolean z) {
        o0ooO.o00oo0O(o0oo00oo, "$this$setActionButtonEnabled");
        o0ooO.o00oo0O(o0oo0o0, "which");
        o00oOOo0(o0oo00oo, o0oo0o0).setEnabled(z);
    }
}
