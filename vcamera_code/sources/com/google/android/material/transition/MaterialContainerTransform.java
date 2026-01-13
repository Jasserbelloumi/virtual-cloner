package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.o00oOo0O;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.transition.o0O0000O;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.TransitionUtils;
import com.google.common.collect.LinkedHashMultimap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOoO0.o00oOoO;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o0O000oo.o0O00000;
import o0O000oo.o0O0o00O;
import o0O0Oo0o.o0O000O;
import o0O0Oo0o.o0OoO00O;
import o0OO0o0O.o00oOOoO;
/* loaded from: classes2.dex */
public final class MaterialContainerTransform extends o0O0000O {
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    @o0OO00OO
    private ShapeAppearanceModel endShapeAppearanceModel;
    @o0OO00OO
    private View endView;
    @o0OO00OO
    private ProgressThresholds fadeProgressThresholds;
    @o0OO00OO
    private ProgressThresholds scaleMaskProgressThresholds;
    @o0OO00OO
    private ProgressThresholds scaleProgressThresholds;
    @o0OO00OO
    private ProgressThresholds shapeMaskProgressThresholds;
    @o0OO00OO
    private ShapeAppearanceModel startShapeAppearanceModel;
    @o0OO00OO
    private View startView;
    private static final String TAG = "MaterialContainerTransform";
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    private boolean drawDebugEnabled = false;
    private boolean holdAtEndEnabled = false;
    @oo0OOoo
    private int drawingViewId = 16908290;
    @oo0OOoo
    private int startViewId = -1;
    @oo0OOoo
    private int endViewId = -1;
    @o0O00O
    private int containerColor = 0;
    @o0O00O
    private int startContainerColor = 0;
    @o0O00O
    private int endContainerColor = 0;
    @o0O00O
    private int scrimColor = 1375731712;
    private int transitionDirection = 0;
    private int fadeMode = 0;
    private int fitMode = 0;
    private boolean elevationShadowEnabled = true;
    private float startElevation = -1.0f;
    private float endElevation = -1.0f;

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface FitMode {
    }

    /* loaded from: classes2.dex */
    public static class ProgressThresholds {
        @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        private final float end;
        @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        private final float start;

        public ProgressThresholds(@o0O0OO0(from = 0.0d, to = 1.0d) float f, @o0O0OO0(from = 0.0d, to = 1.0d) float f2) {
            this.start = f;
            this.end = f2;
        }

        @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        public float getEnd() {
            return this.end;
        }

        @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
        public float getStart() {
            return this.start;
        }
    }

    /* loaded from: classes2.dex */
    public static class ProgressThresholdsGroup {
        @oo0oO0
        private final ProgressThresholds fade;
        @oo0oO0
        private final ProgressThresholds scale;
        @oo0oO0
        private final ProgressThresholds scaleMask;
        @oo0oO0
        private final ProgressThresholds shapeMask;

        private ProgressThresholdsGroup(@oo0oO0 ProgressThresholds progressThresholds, @oo0oO0 ProgressThresholds progressThresholds2, @oo0oO0 ProgressThresholds progressThresholds3, @oo0oO0 ProgressThresholds progressThresholds4) {
            this.fade = progressThresholds;
            this.scale = progressThresholds2;
            this.scaleMask = progressThresholds3;
            this.shapeMask = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface TransitionDirection {
    }

    /* loaded from: classes2.dex */
    public static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final ShapeAppearanceModel endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final FadeModeEvaluator fadeModeEvaluator;
        private FadeModeResult fadeModeResult;
        private final FitModeEvaluator fitModeEvaluator;
        private FitModeResult fitModeResult;
        private final MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final ProgressThresholdsGroup progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final ShapeAppearanceModel startShapeAppearanceModel;
        private final View startView;

        private TransitionDrawable(o0O000O o0o000o, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, @o0O00O int i, @o0O00O int i2, @o0O00O int i3, int i4, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
            Paint paint = new Paint();
            this.containerPaint = paint;
            Paint paint2 = new Paint();
            this.startContainerPaint = paint2;
            Paint paint3 = new Paint();
            this.endContainerPaint = paint3;
            this.shadowPaint = new Paint();
            Paint paint4 = new Paint();
            this.scrimPaint = paint4;
            this.maskEvaluator = new MaskEvaluator();
            this.motionPathPosition = r7;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.compatShadowDrawable = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.debugPaint = paint5;
            this.debugPath = new Path();
            this.startView = view;
            this.startBounds = rectF;
            this.startShapeAppearanceModel = shapeAppearanceModel;
            this.startElevation = f;
            this.endView = view2;
            this.endBounds = rectF2;
            this.endShapeAppearanceModel = shapeAppearanceModel2;
            this.endElevation = f2;
            this.entering = z;
            this.elevationShadowEnabled = z2;
            this.fadeModeEvaluator = fadeModeEvaluator;
            this.fitModeEvaluator = fitModeEvaluator;
            this.progressThresholds = progressThresholdsGroup;
            this.drawDebugEnabled = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.displayWidth = displayMetrics.widthPixels;
            this.displayHeight = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(COMPAT_SHADOW_COLOR);
            RectF rectF3 = new RectF(rectF);
            this.currentStartBounds = rectF3;
            this.currentStartBoundsMasked = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.currentEndBounds = rectF4;
            this.currentEndBoundsMasked = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(o0o000o.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.motionPathMeasure = pathMeasure;
            this.motionPathLength = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(TransitionUtils.createColorShader(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * SHADOW_DX_MULTIPLIER_ADJUSTMENT;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, @o0O00O int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.progress == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
                return;
            }
            path.lineTo(motionPathPoint.x, motionPathPoint.y);
            this.debugPaint.setColor(i);
            canvas.drawPath(path, this.debugPaint);
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, @o0O00O int i) {
            this.debugPaint.setColor(i);
            canvas.drawRect(rectF, this.debugPaint);
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.maskEvaluator.getPath(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            MaterialShapeDrawable materialShapeDrawable = this.compatShadowDrawable;
            RectF rectF = this.currentMaskBounds;
            materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.compatShadowDrawable.setElevation(this.currentElevation);
            this.compatShadowDrawable.setShadowVerticalOffset((int) this.currentElevationDy);
            this.compatShadowDrawable.setShapeAppearanceModel(this.maskEvaluator.getCurrentShapeAppearanceModel());
            this.compatShadowDrawable.draw(canvas);
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            ShapeAppearanceModel currentShapeAppearanceModel = this.maskEvaluator.getCurrentShapeAppearanceModel();
            if (!currentShapeAppearanceModel.isRoundRect(this.currentMaskBounds)) {
                canvas.drawPath(this.maskEvaluator.getPath(), this.shadowPaint);
                return;
            }
            float cornerSize = currentShapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.currentMaskBounds);
            canvas.drawRoundRect(this.currentMaskBounds, cornerSize, cornerSize, this.shadowPaint);
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.endContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentEndBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.endScale, this.fadeModeResult.endAlpha, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.endView.draw(canvas2);
                }
            });
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.startContainerPaint);
            Rect bounds = getBounds();
            RectF rectF = this.currentStartBounds;
            TransitionUtils.transform(canvas, bounds, rectF.left, rectF.top, this.fitModeResult.startScale, this.fadeModeResult.startAlpha, new TransitionUtils.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
                public void run(Canvas canvas2) {
                    TransitionDrawable.this.startView.draw(canvas2);
                }
            });
        }

        private static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.progress != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.progress = f;
            this.scrimPaint.setAlpha((int) (this.entering ? TransitionUtils.lerp(0.0f, 255.0f, f) : TransitionUtils.lerp(255.0f, 0.0f, f)));
            this.motionPathMeasure.getPosTan(this.motionPathLength * f, this.motionPathPosition, null);
            float[] fArr = this.motionPathPosition;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f2 = 0.99f;
                    f3 = (f - 1.0f) / 0.00999999f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.motionPathMeasure.getPosTan(this.motionPathLength * f2, fArr, null);
                float[] fArr2 = this.motionPathPosition;
                float f6 = fArr2[0];
                float f7 = fArr2[1];
                f4 = o00oOoO.o00oOOo0(f4, f6, f3, f4);
                f5 = o00oOoO.o00oOOo0(f5, f7, f3, f5);
            }
            float f8 = f4;
            float f9 = f5;
            Float valueOf = Float.valueOf(this.progressThresholds.scale.start);
            valueOf.getClass();
            float floatValue = valueOf.floatValue();
            Float valueOf2 = Float.valueOf(this.progressThresholds.scale.end);
            valueOf2.getClass();
            FitModeResult evaluate = this.fitModeEvaluator.evaluate(f, floatValue, valueOf2.floatValue(), this.startBounds.width(), this.startBounds.height(), this.endBounds.width(), this.endBounds.height());
            this.fitModeResult = evaluate;
            RectF rectF = this.currentStartBounds;
            float f10 = evaluate.currentStartWidth;
            rectF.set(f8 - (f10 / 2.0f), f9, (f10 / 2.0f) + f8, evaluate.currentStartHeight + f9);
            RectF rectF2 = this.currentEndBounds;
            FitModeResult fitModeResult = this.fitModeResult;
            float f11 = fitModeResult.currentEndWidth;
            rectF2.set(f8 - (f11 / 2.0f), f9, (f11 / 2.0f) + f8, fitModeResult.currentEndHeight + f9);
            this.currentStartBoundsMasked.set(this.currentStartBounds);
            this.currentEndBoundsMasked.set(this.currentEndBounds);
            Float valueOf3 = Float.valueOf(this.progressThresholds.scaleMask.start);
            valueOf3.getClass();
            float floatValue2 = valueOf3.floatValue();
            Float valueOf4 = Float.valueOf(this.progressThresholds.scaleMask.end);
            valueOf4.getClass();
            float floatValue3 = valueOf4.floatValue();
            boolean shouldMaskStartBounds = this.fitModeEvaluator.shouldMaskStartBounds(this.fitModeResult);
            RectF rectF3 = shouldMaskStartBounds ? this.currentStartBoundsMasked : this.currentEndBoundsMasked;
            float lerp = TransitionUtils.lerp(0.0f, 1.0f, floatValue2, floatValue3, f);
            if (!shouldMaskStartBounds) {
                lerp = 1.0f - lerp;
            }
            this.fitModeEvaluator.applyMask(rectF3, lerp, this.fitModeResult);
            this.currentMaskBounds = new RectF(Math.min(this.currentStartBoundsMasked.left, this.currentEndBoundsMasked.left), Math.min(this.currentStartBoundsMasked.top, this.currentEndBoundsMasked.top), Math.max(this.currentStartBoundsMasked.right, this.currentEndBoundsMasked.right), Math.max(this.currentStartBoundsMasked.bottom, this.currentEndBoundsMasked.bottom));
            this.maskEvaluator.evaluate(f, this.startShapeAppearanceModel, this.endShapeAppearanceModel, this.currentStartBounds, this.currentStartBoundsMasked, this.currentEndBoundsMasked, this.progressThresholds.shapeMask);
            this.currentElevation = TransitionUtils.lerp(this.startElevation, this.endElevation, f);
            float calculateElevationDxMultiplier = calculateElevationDxMultiplier(this.currentMaskBounds, this.displayWidth);
            float calculateElevationDyMultiplier = calculateElevationDyMultiplier(this.currentMaskBounds, this.displayHeight);
            float f12 = this.currentElevation;
            float f13 = (int) (calculateElevationDyMultiplier * f12);
            this.currentElevationDy = f13;
            this.shadowPaint.setShadowLayer(f12, (int) (calculateElevationDxMultiplier * f12), f13, SHADOW_COLOR);
            Float valueOf5 = Float.valueOf(this.progressThresholds.fade.start);
            valueOf5.getClass();
            float floatValue4 = valueOf5.floatValue();
            Float valueOf6 = Float.valueOf(this.progressThresholds.fade.end);
            valueOf6.getClass();
            this.fadeModeResult = this.fadeModeEvaluator.evaluate(f, floatValue4, valueOf6.floatValue());
            if (this.startContainerPaint.getColor() != 0) {
                this.startContainerPaint.setAlpha(this.fadeModeResult.startAlpha);
            }
            if (this.endContainerPaint.getColor() != 0) {
                this.endContainerPaint.setAlpha(this.fadeModeResult.endAlpha);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@oo0oO0 Canvas canvas) {
            if (this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.scrimPaint);
            }
            int save = this.drawDebugEnabled ? canvas.save() : -1;
            if (this.elevationShadowEnabled && this.currentElevation > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.maskEvaluator.clip(canvas);
            maybeDrawContainerColor(canvas, this.containerPaint);
            if (this.fadeModeResult.endOnTop) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.drawDebugEnabled) {
                canvas.restoreToCount(save);
                drawDebugCumulativePath(canvas, this.currentStartBounds, this.debugPath, -65281);
                drawDebugRect(canvas, this.currentStartBoundsMasked, o0O00000.f10519o00oo0oO);
                drawDebugRect(canvas, this.currentStartBounds, -16711936);
                drawDebugRect(canvas, this.currentEndBoundsMasked, o00oOOoO.f13247o00ooO00);
                drawDebugRect(canvas, this.currentEndBounds, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@o0OO00OO ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public MaterialContainerTransform() {
        setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
        ProgressThresholdsGroup progressThresholdsGroup;
        ProgressThresholdsGroup progressThresholdsGroup2;
        o0O000O pathMotion = getPathMotion();
        if ((pathMotion instanceof androidx.transition.o00oOOoO) || (pathMotion instanceof MaterialArcMotion)) {
            progressThresholdsGroup = DEFAULT_ENTER_THRESHOLDS_ARC;
            progressThresholdsGroup2 = DEFAULT_RETURN_THRESHOLDS_ARC;
        } else {
            progressThresholdsGroup = DEFAULT_ENTER_THRESHOLDS;
            progressThresholdsGroup2 = DEFAULT_RETURN_THRESHOLDS;
        }
        return getThresholdsOrDefault(z, progressThresholdsGroup, progressThresholdsGroup2);
    }

    private static RectF calculateDrawableBounds(View view, @o0OO00OO View view2, float f, float f2) {
        if (view2 != null) {
            RectF locationOnScreen = TransitionUtils.getLocationOnScreen(view2);
            locationOnScreen.offset(f, f2);
            return locationOnScreen;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    private static ShapeAppearanceModel captureShapeAppearance(@oo0oO0 View view, @oo0oO0 RectF rectF, @o0OO00OO ShapeAppearanceModel shapeAppearanceModel) {
        return TransitionUtils.convertToRelativeCornerSizes(getShapeAppearance(view, shapeAppearanceModel), rectF);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void captureValues(@o00oOooO.oo0oO0 o0O0Oo0o.o0OoO00O r2, @o00oOooO.o0OO00OO android.view.View r3, @o00oOooO.oo0OOoo int r4, @o00oOooO.o0OO00OO com.google.android.material.shape.ShapeAppearanceModel r5) {
        /*
            r0 = -1
            if (r4 == r0) goto Lc
            android.view.View r3 = r2.f11945o00oOOoO
            android.view.View r3 = com.google.android.material.transition.TransitionUtils.findDescendantOrAncestorById(r3, r4)
        L9:
            r2.f11945o00oOOoO = r3
            goto L2a
        Lc:
            if (r3 == 0) goto Lf
            goto L9
        Lf:
            android.view.View r3 = r2.f11945o00oOOoO
            int r4 = com.google.android.material.R.id.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L2a
            android.view.View r3 = r2.f11945o00oOOoO
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.f11945o00oOOoO
            r1 = 0
            r0.setTag(r4, r1)
            goto L9
        L2a:
            android.view.View r3 = r2.f11945o00oOOoO
            boolean r4 = o0O000oo.o0O0o00O.o0O0Oooo(r3)
            if (r4 != 0) goto L3e
            int r4 = r3.getWidth()
            if (r4 != 0) goto L3e
            int r4 = r3.getHeight()
            if (r4 == 0) goto L5f
        L3e:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L49
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getRelativeBounds(r3)
            goto L4d
        L49:
            android.graphics.RectF r4 = com.google.android.material.transition.TransitionUtils.getLocationOnScreen(r3)
        L4d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f11944o00oOOo0
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f11944o00oOOo0
            com.google.android.material.shape.ShapeAppearanceModel r3 = captureShapeAppearance(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialContainerTransform.captureValues(o0O0Oo0o.o0OoO00O, android.view.View, int, com.google.android.material.shape.ShapeAppearanceModel):void");
    }

    private static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : o0O0o00O.o00oooo(view);
    }

    private static ShapeAppearanceModel getShapeAppearance(@oo0oO0 View view, @o0OO00OO ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel != null) {
            return shapeAppearanceModel;
        }
        int i = R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof ShapeAppearanceModel) {
            return (ShapeAppearanceModel) view.getTag(i);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? ShapeAppearanceModel.builder(context, transitionShapeAppearanceResId, 0).build() : view instanceof Shapeable ? ((Shapeable) view).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
        if (!z) {
            progressThresholdsGroup = progressThresholdsGroup2;
        }
        return new ProgressThresholdsGroup((ProgressThresholds) TransitionUtils.defaultIfNull(this.fadeProgressThresholds, progressThresholdsGroup.fade), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleProgressThresholds, progressThresholdsGroup.scale), (ProgressThresholds) TransitionUtils.defaultIfNull(this.scaleMaskProgressThresholds, progressThresholdsGroup.scaleMask), (ProgressThresholds) TransitionUtils.defaultIfNull(this.shapeMaskProgressThresholds, progressThresholdsGroup.shapeMask));
    }

    @o0OOO0OO
    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(@oo0oO0 RectF rectF, @oo0oO0 RectF rectF2) {
        int i = this.transitionDirection;
        if (i == 0) {
            return TransitionUtils.calculateArea(rectF2) > TransitionUtils.calculateArea(rectF);
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Invalid transition direction: ");
            o00oOOo02.append(this.transitionDirection);
            throw new IllegalArgumentException(o00oOOo02.toString());
        } else {
            return true;
        }
    }

    @Override // androidx.transition.o0O0000O
    public void captureEndValues(@oo0oO0 o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // androidx.transition.o0O0000O
    public void captureStartValues(@oo0oO0 o0OoO00O o0ooo00o) {
        captureValues(o0ooo00o, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public Animator createAnimator(@oo0oO0 ViewGroup viewGroup, @o0OO00OO o0OoO00O o0ooo00o, @o0OO00OO o0OoO00O o0ooo00o2) {
        final View findAncestorById;
        if (o0ooo00o != null && o0ooo00o2 != null) {
            RectF rectF = (RectF) o0ooo00o.f11944o00oOOo0.get(PROP_BOUNDS);
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) o0ooo00o.f11944o00oOOo0.get(PROP_SHAPE_APPEARANCE);
            if (rectF != null && shapeAppearanceModel != null) {
                RectF rectF2 = (RectF) o0ooo00o2.f11944o00oOOo0.get(PROP_BOUNDS);
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) o0ooo00o2.f11944o00oOOo0.get(PROP_SHAPE_APPEARANCE);
                if (rectF2 != null && shapeAppearanceModel2 != null) {
                    final View view = o0ooo00o.f11945o00oOOoO;
                    final View view2 = o0ooo00o2.f11945o00oOOoO;
                    View view3 = view2.getParent() != null ? view2 : view;
                    if (this.drawingViewId == view3.getId()) {
                        findAncestorById = (View) view3.getParent();
                    } else {
                        findAncestorById = TransitionUtils.findAncestorById(view3, this.drawingViewId);
                        view3 = null;
                    }
                    RectF locationOnScreen = TransitionUtils.getLocationOnScreen(findAncestorById);
                    float f = -locationOnScreen.left;
                    float f2 = -locationOnScreen.top;
                    RectF calculateDrawableBounds = calculateDrawableBounds(findAncestorById, view3, f, f2);
                    rectF.offset(f, f2);
                    rectF2.offset(f, f2);
                    boolean isEntering = isEntering(rectF, rectF2);
                    final TransitionDrawable transitionDrawable = new TransitionDrawable(getPathMotion(), view, rectF, shapeAppearanceModel, getElevationOrDefault(this.startElevation, view), view2, rectF2, shapeAppearanceModel2, getElevationOrDefault(this.endElevation, view2), this.containerColor, this.startContainerColor, this.endContainerColor, this.scrimColor, isEntering, this.elevationShadowEnabled, FadeModeEvaluators.get(this.fadeMode, isEntering), FitModeEvaluators.get(this.fitMode, isEntering, rectF, rectF2), buildThresholdsGroup(isEntering), this.drawDebugEnabled);
                    transitionDrawable.setBounds(Math.round(calculateDrawableBounds.left), Math.round(calculateDrawableBounds.top), Math.round(calculateDrawableBounds.right), Math.round(calculateDrawableBounds.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            transitionDrawable.setProgress(valueAnimator.getAnimatedFraction());
                        }
                    });
                    addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.o0O0000O.o00oo0OO
                        public void onTransitionEnd(@oo0oO0 o0O0000O o0o0000o) {
                            MaterialContainerTransform.this.removeListener(this);
                            if (MaterialContainerTransform.this.holdAtEndEnabled) {
                                return;
                            }
                            view.setAlpha(1.0f);
                            view2.setAlpha(1.0f);
                            ViewUtils.getOverlay(findAncestorById).remove(transitionDrawable);
                        }

                        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.o0O0000O.o00oo0OO
                        public void onTransitionStart(@oo0oO0 o0O0000O o0o0000o) {
                            ViewUtils.getOverlay(findAncestorById).add(transitionDrawable);
                            view.setAlpha(0.0f);
                            view2.setAlpha(0.0f);
                        }
                    });
                    return ofFloat;
                }
            }
        }
        return null;
    }

    @o0O00O
    public int getContainerColor() {
        return this.containerColor;
    }

    @oo0OOoo
    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    @o0O00O
    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    @o0OO00OO
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    @o0OO00OO
    public View getEndView() {
        return this.endView;
    }

    @oo0OOoo
    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    @o0OO00OO
    public ProgressThresholds getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    @o0OO00OO
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    @o0OO00OO
    public ProgressThresholds getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    @o0O00O
    public int getScrimColor() {
        return this.scrimColor;
    }

    @o0OO00OO
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    @o0O00O
    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    @o0OO00OO
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    @o0OO00OO
    public View getStartView() {
        return this.startView;
    }

    @oo0OOoo
    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    @Override // androidx.transition.o0O0000O
    @o0OO00OO
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(@o0O00O int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public void setContainerColor(@o0O00O int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(@oo0OOoo int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(@o0O00O int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(@o0OO00OO ShapeAppearanceModel shapeAppearanceModel) {
        this.endShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setEndView(@o0OO00OO View view) {
        this.endView = view;
    }

    public void setEndViewId(@oo0OOoo int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(@o0OO00OO ProgressThresholds progressThresholds) {
        this.fadeProgressThresholds = progressThresholds;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    public void setScaleMaskProgressThresholds(@o0OO00OO ProgressThresholds progressThresholds) {
        this.scaleMaskProgressThresholds = progressThresholds;
    }

    public void setScaleProgressThresholds(@o0OO00OO ProgressThresholds progressThresholds) {
        this.scaleProgressThresholds = progressThresholds;
    }

    public void setScrimColor(@o0O00O int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(@o0OO00OO ProgressThresholds progressThresholds) {
        this.shapeMaskProgressThresholds = progressThresholds;
    }

    public void setStartContainerColor(@o0O00O int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(@o0OO00OO ShapeAppearanceModel shapeAppearanceModel) {
        this.startShapeAppearanceModel = shapeAppearanceModel;
    }

    public void setStartView(@o0OO00OO View view) {
        this.startView = view;
    }

    public void setStartViewId(@oo0OOoo int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }
}
