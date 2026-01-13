package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {
    private final Matrix matrix;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.matrix = new Matrix();
    }

    @Override // android.util.Property
    @oo0oO0
    public Matrix get(@oo0oO0 ImageView imageView) {
        this.matrix.set(imageView.getImageMatrix());
        return this.matrix;
    }

    @Override // android.util.Property
    public void set(@oo0oO0 ImageView imageView, @oo0oO0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
