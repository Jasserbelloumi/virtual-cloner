package o0O0oOOO;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.message.CustomUrlSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o0OO0o.o0OOO0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B*\u0012!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R/\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lo0O0oOOO/oo0ooO;", "Landroid/text/method/TransformationMethod;", "", FirebaseAnalytics.Param.SOURCE, "Landroid/view/View;", "view", "getTransformation", "sourceText", "", "focused", "", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "Lo0OO0o/oO0Ooooo;", "onFocusChanged", "Lkotlin/Function1;", "", "Lo0OO0o/o0O0o00O;", "name", "link", "o00oo0O0", "Lo0OOOO/o00oo;", "onLinkClick", "<init>", "(Lo0OOOO/o00oo;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class oo0ooO implements TransformationMethod {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo<String, oO0Ooooo> f12731o00oo0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public oo0ooO(@NotNull o00oo<? super String, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O(o00ooVar, "onLinkClick");
        this.f12731o00oo0O0 = o00ooVar;
    }

    @Override // android.text.method.TransformationMethod
    @NotNull
    public CharSequence getTransformation(@NotNull CharSequence charSequence, @NotNull View view) {
        URLSpan[] uRLSpanArr;
        o0ooO.o00oo0O(charSequence, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O(view, "view");
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText() == null || !(textView.getText() instanceof Spannable)) {
                return charSequence;
            }
            CharSequence text = textView.getText();
            if (text != null) {
                Spannable spannable = (Spannable) text;
                for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, textView.length(), URLSpan.class)) {
                    int spanStart = spannable.getSpanStart(uRLSpan);
                    int spanEnd = spannable.getSpanEnd(uRLSpan);
                    o0ooO.o00oOoO(uRLSpan, TtmlNode.TAG_SPAN);
                    String url = uRLSpan.getURL();
                    spannable.removeSpan(uRLSpan);
                    o0ooO.o00oOoO(url, ImagesContract.URL);
                    spannable.setSpan(new CustomUrlSpan(url, this.f12731o00oo0O0), spanStart, spanEnd, 33);
                }
                return spannable;
            }
            throw new o0OOO0("null cannot be cast to non-null type android.text.Spannable");
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(@NotNull View view, @NotNull CharSequence charSequence, boolean z, int i, @NotNull Rect rect) {
        o0ooO.o00oo0O(view, "view");
        o0ooO.o00oo0O(charSequence, "sourceText");
        o0ooO.o00oo0O(rect, "previouslyFocusedRect");
    }
}
