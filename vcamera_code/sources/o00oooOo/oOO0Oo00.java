package o00oooOo;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", o00oOOoO.f12961o00oOo00, "", TtmlNode.ATTR_TTS_COLOR, "Landroid/graphics/PorterDuffColorFilter;", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO0Oo00 {
    @NotNull
    public static final PorterDuffColorFilter o00oOOo0(@NotNull PorterDuff.Mode mode, int i) {
        o0ooO.o00oo0O0(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    @NotNull
    public static final PorterDuffXfermode o00oOOoO(@NotNull PorterDuff.Mode mode) {
        o0ooO.o00oo0O0(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
