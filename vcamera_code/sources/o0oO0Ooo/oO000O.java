package o0oO0Ooo;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.o00oo00O;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class oO000O extends InputConnectionWrapper {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final TextView f16948o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOo0 f16949o00oOOoO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public boolean o00oOOo0(@oo0oO0 InputConnection inputConnection, @oo0oO0 Editable editable, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, boolean z) {
            return o00oo00O.o00oOoO0(inputConnection, editable, i, i2, z);
        }

        public void o00oOOoO(@oo0oO0 EditorInfo editorInfo) {
            if (o00oo00O.o00oo0()) {
                o00oo00O.o00oOOoO().o00ooOO(editorInfo);
            }
        }
    }

    public oO000O(@oo0oO0 TextView textView, @oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new o00oOOo0());
    }

    public oO000O(@oo0oO0 TextView textView, @oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo, @oo0oO0 o00oOOo0 o00oooo02) {
        super(inputConnection, false);
        this.f16948o00oOOo0 = textView;
        this.f16949o00oOOoO = o00oooo02;
        o00oooo02.o00oOOoO(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f16949o00oOOoO.o00oOOo0(this, o00oOOo0(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f16949o00oOOoO.o00oOOo0(this, o00oOOo0(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public final Editable o00oOOo0() {
        return this.f16948o00oOOo0.getEditableText();
    }
}
