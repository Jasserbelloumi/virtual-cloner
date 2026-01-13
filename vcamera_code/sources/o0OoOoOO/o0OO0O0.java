package o0OoOoOO;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0087\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086\n¨\u0006\u000e"}, d2 = {"", "Landroid/text/Spannable;", "o00oOooO", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "", TtmlNode.START, TtmlNode.END, "", TtmlNode.TAG_SPAN, o00oOOoO.f12961o00oOo00, "Lo0OOOo0o/o0O0O0Oo;", SessionDescription.ATTR_RANGE, "o00oOo00", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OO0O0 {
    @SuppressLint({"SyntheticAccessor"})
    public static final void o00oOOo0(@NotNull Spannable spannable) {
        o0ooO.o00oo0O0(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        o0ooO.o00oo0OO(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void o00oOOoO(@NotNull Spannable spannable, int i, int i2, @NotNull Object obj) {
        o0ooO.o00oo0O0(spannable, "<this>");
        o0ooO.o00oo0O0(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void o00oOo00(@NotNull Spannable spannable, @NotNull o0O0O0Oo o0o0o0oo, @NotNull Object obj) {
        o0ooO.o00oo0O0(spannable, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        o0ooO.o00oo0O0(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue(), 17);
    }

    @NotNull
    public static final Spannable o00oOooO(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }
}
