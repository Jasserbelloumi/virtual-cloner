package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O0O0O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    public EdgeTreatment bottomEdge;
    public CornerTreatment bottomLeftCorner;
    public CornerSize bottomLeftCornerSize;
    public CornerTreatment bottomRightCorner;
    public CornerSize bottomRightCornerSize;
    public EdgeTreatment leftEdge;
    public EdgeTreatment rightEdge;
    public EdgeTreatment topEdge;
    public CornerTreatment topLeftCorner;
    public CornerSize topLeftCornerSize;
    public CornerTreatment topRightCorner;
    public CornerSize topRightCornerSize;

    /* loaded from: classes2.dex */
    public static final class Builder {
        @oo0oO0
        private EdgeTreatment bottomEdge;
        @oo0oO0
        private CornerTreatment bottomLeftCorner;
        @oo0oO0
        private CornerSize bottomLeftCornerSize;
        @oo0oO0
        private CornerTreatment bottomRightCorner;
        @oo0oO0
        private CornerSize bottomRightCornerSize;
        @oo0oO0
        private EdgeTreatment leftEdge;
        @oo0oO0
        private EdgeTreatment rightEdge;
        @oo0oO0
        private EdgeTreatment topEdge;
        @oo0oO0
        private CornerTreatment topLeftCorner;
        @oo0oO0
        private CornerSize topLeftCornerSize;
        @oo0oO0
        private CornerTreatment topRightCorner;
        @oo0oO0
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        public Builder(@oo0oO0 ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        @oo0oO0
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @oo0oO0
        public Builder setAllCornerSizes(@o0O0O0O float f) {
            return setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @oo0oO0
        public Builder setAllCornerSizes(@oo0oO0 CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @oo0oO0
        public Builder setAllCorners(int i, @o0O0O0O float f) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i)).setAllCornerSizes(f);
        }

        @oo0oO0
        public Builder setAllCorners(@oo0oO0 CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @oo0oO0
        public Builder setAllEdges(@oo0oO0 EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @oo0oO0
        public Builder setBottomEdge(@oo0oO0 EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @oo0oO0
        public Builder setBottomLeftCorner(int i, @o0O0O0O float f) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomLeftCornerSize(f);
        }

        @oo0oO0
        public Builder setBottomLeftCorner(int i, @oo0oO0 CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomLeftCornerSize(cornerSize);
        }

        @oo0oO0
        public Builder setBottomLeftCorner(@oo0oO0 CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @oo0oO0
        public Builder setBottomLeftCornerSize(@o0O0O0O float f) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        @oo0oO0
        public Builder setBottomLeftCornerSize(@oo0oO0 CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @oo0oO0
        public Builder setBottomRightCorner(int i, @o0O0O0O float f) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomRightCornerSize(f);
        }

        @oo0oO0
        public Builder setBottomRightCorner(int i, @oo0oO0 CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setBottomRightCornerSize(cornerSize);
        }

        @oo0oO0
        public Builder setBottomRightCorner(@oo0oO0 CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @oo0oO0
        public Builder setBottomRightCornerSize(@o0O0O0O float f) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        @oo0oO0
        public Builder setBottomRightCornerSize(@oo0oO0 CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @oo0oO0
        public Builder setLeftEdge(@oo0oO0 EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @oo0oO0
        public Builder setRightEdge(@oo0oO0 EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @oo0oO0
        public Builder setTopEdge(@oo0oO0 EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @oo0oO0
        public Builder setTopLeftCorner(int i, @o0O0O0O float f) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopLeftCornerSize(f);
        }

        @oo0oO0
        public Builder setTopLeftCorner(int i, @oo0oO0 CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopLeftCornerSize(cornerSize);
        }

        @oo0oO0
        public Builder setTopLeftCorner(@oo0oO0 CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @oo0oO0
        public Builder setTopLeftCornerSize(@o0O0O0O float f) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        @oo0oO0
        public Builder setTopLeftCornerSize(@oo0oO0 CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @oo0oO0
        public Builder setTopRightCorner(int i, @o0O0O0O float f) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopRightCornerSize(f);
        }

        @oo0oO0
        public Builder setTopRightCorner(int i, @oo0oO0 CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i)).setTopRightCornerSize(cornerSize);
        }

        @oo0oO0
        public Builder setTopRightCorner(@oo0oO0 CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @oo0oO0
        public Builder setTopRightCornerSize(@o0O0O0O float f) {
            this.topRightCornerSize = new AbsoluteCornerSize(f);
            return this;
        }

        @oo0oO0
        public Builder setTopRightCornerSize(@oo0oO0 CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public interface CornerSizeUnaryOperator {
        @oo0oO0
        CornerSize apply(@oo0oO0 CornerSize cornerSize);
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }

    private ShapeAppearanceModel(@oo0oO0 Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    @oo0oO0
    public static Builder builder() {
        return new Builder();
    }

    @oo0oO0
    public static Builder builder(Context context, @o0OOO0OO int i, @o0OOO0OO int i2) {
        return builder(context, i, i2, 0);
    }

    @oo0oO0
    private static Builder builder(Context context, @o0OOO0OO int i, @o0OOO0OO int i2, int i3) {
        return builder(context, i, i2, new AbsoluteCornerSize(i3));
    }

    @oo0oO0
    private static Builder builder(Context context, @o0OOO0OO int i, @o0OOO0OO int i2, @oo0oO0 CornerSize cornerSize) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            CornerSize cornerSize2 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i4, cornerSize3).setTopRightCorner(i5, cornerSize4).setBottomRightCorner(i6, cornerSize5).setBottomLeftCorner(i7, getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @oo0oO0
    public static Builder builder(@oo0oO0 Context context, AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2) {
        return builder(context, attributeSet, i, i2, 0);
    }

    @oo0oO0
    public static Builder builder(@oo0oO0 Context context, AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2, int i3) {
        return builder(context, attributeSet, i, i2, new AbsoluteCornerSize(i3));
    }

    @oo0oO0
    public static Builder builder(@oo0oO0 Context context, AttributeSet attributeSet, @o0O000Oo int i, @o0OOO0OO int i2, @oo0oO0 CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    @oo0oO0
    private static CornerSize getCornerSize(TypedArray typedArray, int i, @oo0oO0 CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cornerSize;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @oo0oO0
    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    @oo0oO0
    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    @oo0oO0
    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    @oo0oO0
    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    @oo0oO0
    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    @oo0oO0
    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    @oo0oO0
    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    @oo0oO0
    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    @oo0oO0
    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    @oo0oO0
    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    @oo0oO0
    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    @oo0oO0
    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean isRoundRect(@oo0oO0 RectF rectF) {
        boolean z = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    @oo0oO0
    public Builder toBuilder() {
        return new Builder(this);
    }

    @oo0oO0
    public ShapeAppearanceModel withCornerSize(float f) {
        return toBuilder().setAllCornerSizes(f).build();
    }

    @oo0oO0
    public ShapeAppearanceModel withCornerSize(@oo0oO0 CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@oo0oO0 CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }
}
