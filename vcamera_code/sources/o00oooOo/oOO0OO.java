package o00oooOo;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "block", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO0OO {
    @NotNull
    public static final Picture o00oOOo0(@NotNull Picture picture, int i, int i2, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(picture, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        o0ooO.o00oo0OO(beginRecording, "beginRecording(width, height)");
        try {
            o00ooVar.invoke(beginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
