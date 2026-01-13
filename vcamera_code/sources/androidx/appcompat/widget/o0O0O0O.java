package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class o0O0O0O {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public TextView f1182o00oOOo0;
    @o00oOooO.o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public TextClassifier f1183o00oOOoO;

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        @o00oOooO.oo0oO0
        public static TextClassifier o00oOOo0(@o00oOooO.oo0oO0 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public o0O0O0O(@o00oOooO.oo0oO0 TextView textView) {
        textView.getClass();
        this.f1182o00oOOo0 = textView;
    }

    @o00oOooO.o0OOooO0(api = 26)
    @o00oOooO.oo0oO0
    public TextClassifier o00oOOo0() {
        TextClassifier textClassifier = this.f1183o00oOOoO;
        return textClassifier == null ? o00oOOo0.o00oOOo0(this.f1182o00oOOo0) : textClassifier;
    }

    @o00oOooO.o0OOooO0(api = 26)
    public void o00oOOoO(@o00oOooO.o0OO00OO TextClassifier textClassifier) {
        this.f1183o00oOOoO = textClassifier;
    }
}
