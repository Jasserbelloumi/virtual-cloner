package o00oooOo;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "block", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO {
    public static final void o00oOOo0(@NotNull Shader shader, @NotNull o00oo<? super Matrix, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(shader, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        o00ooVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
