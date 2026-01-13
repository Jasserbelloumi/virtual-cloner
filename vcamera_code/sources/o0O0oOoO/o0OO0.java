package o0O0oOoO;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Lo0O0oOoO/o0OO0;", "Landroid/text/TextWatcher;", "", "s", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "Lo0OO0o/oO0Ooooo;", "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class o0OO0 implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        o0ooO.o00oo0O0(editable, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        o0ooO.o00oo0O0(charSequence, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        o0ooO.o00oo0O0(charSequence, "s");
    }
}
