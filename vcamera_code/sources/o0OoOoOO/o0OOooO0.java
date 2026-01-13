package o0OoOoOO;

import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Landroid/text/Spanned;", "o00oOo00", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", TtmlNode.START, TtmlNode.END, "", "o00oOOo0", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OOooO0 {
    public static final <T> T[] o00oOOo0(Spanned spanned, int i, int i2) {
        o0ooO.o00oo0O0(spanned, "<this>");
        o0ooO.o00oooOo();
        T[] tArr = (T[]) spanned.getSpans(i, i2, Object.class);
        o0ooO.o00oo0OO(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static Object[] o00oOOoO(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        o0ooO.o00oo0O0(spanned, "<this>");
        o0ooO.o00oooOo();
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        o0ooO.o00oo0OO(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @NotNull
    public static final Spanned o00oOo00(@NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }
}
