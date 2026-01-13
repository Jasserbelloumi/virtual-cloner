package o0O0oo0O;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o00oOooO.o0OOO0OO;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000eH&J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH&J\b\u0010 \u001a\u00020\u0002H&¨\u0006!"}, d2 = {"Lo0O0oo0O/oo0oO0;", "", "", "isDark", "", o00oOOoO.f12961o00oOo00, "Landroid/content/Context;", "creatingContext", "Landroid/view/Window;", "dialogWindow", "Landroid/view/LayoutInflater;", "layoutInflater", "Lo0O0oo0O/o0OO00OO;", "dialog", "Landroid/view/ViewGroup;", "o00oOOo0", "root", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "o00oOo00", "context", "window", "view", "maxWidth", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V", TtmlNode.ATTR_TTS_COLOR, "", "cornerRadius", "o00oOooO", "o00oOoO0", "o00oOo0o", "onDismiss", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface oo0oO0 {
    @NotNull
    ViewGroup o00oOOo0(@NotNull Context context, @NotNull Window window, @NotNull LayoutInflater layoutInflater, @NotNull o0OO00OO o0oo00oo);

    @o0OOO0OO
    int o00oOOoO(boolean z);

    @NotNull
    DialogLayout o00oOo00(@NotNull ViewGroup viewGroup);

    void o00oOo0O(@NotNull Context context, @NotNull Window window, @NotNull DialogLayout dialogLayout, @o00oOooO.o0OO0 @Nullable Integer num);

    void o00oOo0o(@NotNull o0OO00OO o0oo00oo);

    void o00oOoO0(@NotNull o0OO00OO o0oo00oo);

    void o00oOooO(@NotNull DialogLayout dialogLayout, @o0O00O int i, float f);

    boolean onDismiss();
}
