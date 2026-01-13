package o0OoOoOO;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import o0OoOoOO.oo0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b¨\u0006\u000b"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "o00oOOo0", "option", "o00oOo00", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OO00OO {
    @NotNull
    public static final Spanned o00oOOo0(@NotNull String str, int i, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        o0ooO.o00oo0O0(str, "<this>");
        Spanned o00oOOoO2 = oo0ooO.o00oOOo0.o00oOOoO(str, i, imageGetter, tagHandler);
        o0ooO.o00oo0OO(o00oOOoO2, "fromHtml(this, flags, imageGetter, tagHandler)");
        return o00oOOoO2;
    }

    public static Spanned o00oOOoO(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        o0ooO.o00oo0O0(str, "<this>");
        Spanned o00oOOoO2 = oo0ooO.o00oOOo0.o00oOOoO(str, i, imageGetter, tagHandler);
        o0ooO.o00oo0OO(o00oOOoO2, "fromHtml(this, flags, imageGetter, tagHandler)");
        return o00oOOoO2;
    }

    @NotNull
    public static final String o00oOo00(@NotNull Spanned spanned, int i) {
        o0ooO.o00oo0O0(spanned, "<this>");
        String o00oOo002 = oo0ooO.o00oOOo0.o00oOo00(spanned, i);
        o0ooO.o00oo0OO(o00oOo002, "toHtml(this, option)");
        return o00oOo002;
    }

    public static String o00oOooO(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        o0ooO.o00oo0O0(spanned, "<this>");
        String o00oOo002 = oo0ooO.o00oOOo0.o00oOo00(spanned, i);
        o0ooO.o00oo0OO(o00oOo002, "toHtml(this, option)");
        return o00oOo002;
    }
}
