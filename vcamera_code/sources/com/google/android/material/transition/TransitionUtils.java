package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewParent;
import androidx.transition.o0O0000O;
import androidx.transition.o0O000Oo;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import o00oOoO0.o00oOoO;
import o00oOoOo.o00oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
class TransitionUtils {
    private static final RectF transformAlphaRectF = new RectF();

    /* loaded from: classes2.dex */
    public interface CanvasOperation {
        void run(Canvas canvas);
    }

    /* loaded from: classes2.dex */
    public interface CornerSizeBinaryOperator {
        @oo0oO0
        CornerSize apply(@oo0oO0 CornerSize cornerSize, @oo0oO0 CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static float calculateArea(@oo0oO0 RectF rectF) {
        return rectF.height() * rectF.width();
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @oo0oO0
            public CornerSize apply(@oo0oO0 CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / rectF.height());
            }
        });
    }

    public static Shader createColorShader(@o0O00O int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @oo0oO0
    public static <T> T defaultIfNull(@o0OO00OO T t, @oo0oO0 T t2) {
        return t != null ? t : t2;
    }

    public static View findAncestorById(View view, @oo0OOoo int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(o00oo.o00oOOo0(resourceName, " is not a valid ancestor"));
    }

    public static View findDescendantOrAncestorById(View view, @oo0OOoo int i) {
        View findViewById = view.findViewById(i);
        return findViewById != null ? findViewById : findAncestorById(view, i);
    }

    public static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static RectF getRelativeBounds(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    public static float lerp(float f, float f2, float f3) {
        return o00oOoO.o00oOOo0(f2, f, f3, f);
    }

    public static float lerp(float f, float f2, @o0O0OO0(from = 0.0d, to = 1.0d) float f3, @o0O0OO0(from = 0.0d, to = 1.0d) float f4, @o0O0OO0(from = 0.0d, to = 1.0d) float f5) {
        return lerp(f, f2, f3, f4, f5, false);
    }

    public static float lerp(float f, float f2, @o0O0OO0(from = 0.0d, to = 1.0d) float f3, @o0O0OO0(from = 0.0d, to = 1.0d) float f4, @o0O0OO0(from = 0.0d) float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3)) : lerp(f, f2, f5);
    }

    public static int lerp(int i, int i2, @o0O0OO0(from = 0.0d, to = 1.0d) float f, @o0O0OO0(from = 0.0d, to = 1.0d) float f2, @o0O0OO0(from = 0.0d, to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) lerp(i, i2, (f3 - f) / (f2 - f));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, @o0O0OO0(from = 0.0d, to = 1.0d) final float f, @o0O0OO0(from = 0.0d, to = 1.0d) final float f2, @o0O0OO0(from = 0.0d, to = 1.0d) final float f3) {
        return f3 < f ? shapeAppearanceModel : f3 > f2 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.2
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            @oo0oO0
            public CornerSize apply(@oo0oO0 CornerSize cornerSize, @oo0oO0 CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f, f2, f3));
            }
        });
    }

    public static void maybeAddTransition(o0O000Oo o0o000oo, @o0OO00OO o0O0000O o0o0000o) {
        if (o0o0000o != null) {
            o0o000oo.o00oOoOo(o0o0000o);
        }
    }

    public static void maybeRemoveTransition(o0O000Oo o0o000oo, @o0OO00OO o0O0000O o0o0000o) {
        if (o0o0000o != null) {
            o0o000oo.o00oo0o(o0o0000o);
        }
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static void transform(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            saveLayerAlphaCompat(canvas, rect, i);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
