package o00oooOo;

import android.graphics.Matrix;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroid/graphics/Matrix;", oOO0O000.f9796o00oOOoO, "o00oOo0O", "", "o00oOoO", "", "tx", "ty", "o00oOo0o", "sx", "sy", "o00oOo00", "degrees", "px", "py", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO0 {
    @NotNull
    public static final Matrix o00oOOo0(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    public static /* synthetic */ Matrix o00oOOoO(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return o00oOOo0(f, f2, f3);
    }

    @NotNull
    public static final Matrix o00oOo00(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    @NotNull
    public static final Matrix o00oOo0O(@NotNull Matrix matrix, @NotNull Matrix matrix2) {
        o0ooO.o00oo0O0(matrix, "<this>");
        o0ooO.o00oo0O0(matrix2, oOO0O000.f9796o00oOOoO);
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @NotNull
    public static final Matrix o00oOo0o(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    @NotNull
    public static final float[] o00oOoO(@NotNull Matrix matrix) {
        o0ooO.o00oo0O0(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }

    public static /* synthetic */ Matrix o00oOoO0(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return o00oOo0o(f, f2);
    }

    public static /* synthetic */ Matrix o00oOooO(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return o00oOo00(f, f2);
    }
}
