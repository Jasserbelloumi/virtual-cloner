package o00oooOo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a=\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aG\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aQ\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aI\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aI\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "block", "o00oOoOo", "", "x", "y", "o00oo0OO", "degrees", "pivotX", "pivotY", "o00oOoO", "o00oOoo0", "o00oo00O", "Landroid/graphics/Matrix;", "matrix", "o00oOo0o", "Landroid/graphics/Rect;", "clipRect", "o00oOooO", "Landroid/graphics/RectF;", "o00oOo0O", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", o00oOOoO.f12961o00oOo00, "o00oOOo0", "Landroid/graphics/Path;", "clipPath", "o00oOo00", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO00 {
    public static final void o00oOOo0(@NotNull Canvas canvas, float f, float f2, float f3, float f4, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOOoO(@NotNull Canvas canvas, int i, int i2, int i3, int i4, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOo00(@NotNull Canvas canvas, @NotNull Path path, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(path, "clipPath");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOo0O(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(rectF, "clipRect");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOo0o(@NotNull Canvas canvas, @NotNull Matrix matrix, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(matrix, "matrix");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOoO(@NotNull Canvas canvas, float f, float f2, float f3, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void o00oOoO0(Canvas canvas, Matrix matrix, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(matrix, "matrix");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void o00oOoOO(Canvas canvas, float f, float f2, float f3, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOoOo(@NotNull Canvas canvas, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOoo0(@NotNull Canvas canvas, float f, float f2, float f3, float f4, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oOooO(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(rect, "clipRect");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void o00oOooo(Canvas canvas, float f, float f2, float f3, float f4, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void o00oo0(Canvas canvas, float f, float f2, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oo00O(@NotNull Canvas canvas, float f, float f2, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void o00oo0O0(Canvas canvas, float f, float f2, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void o00oo0OO(@NotNull Canvas canvas, float f, float f2, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(canvas, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            o00ooVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
