package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class o0O00O0o {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int[] f1168o00oOo00 = {16843067, 16843068};

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ProgressBar f1169o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Bitmap f1170o00oOOoO;

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static void o00oOOo0(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public o0O00O0o(ProgressBar progressBar) {
        this.f1169o00oOOo0 = progressBar;
    }

    public final Shape o00oOOo0() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap o00oOOoO() {
        return this.f1170o00oOOoO;
    }

    public void o00oOo00(AttributeSet attributeSet, int i) {
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(this.f1169o00oOOo0.getContext(), attributeSet, f1168o00oOo00, i, 0);
        Drawable o00oOoOO2 = o00ooOo2.o00oOoOO(0);
        if (o00oOoOO2 != null) {
            this.f1169o00oOOo0.setIndeterminateDrawable(o00oOo0O(o00oOoOO2));
        }
        Drawable o00oOoOO3 = o00ooOo2.o00oOoOO(1);
        if (o00oOoOO3 != null) {
            this.f1169o00oOOo0.setProgressDrawable(o00oOooO(o00oOoOO3, false));
        }
        o00ooOo2.o00ooOoo();
    }

    public final Drawable o00oOo0O(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable o00oOooO2 = o00oOooO(animationDrawable.getFrame(i), true);
                o00oOooO2.setLevel(10000);
                animationDrawable2.addFrame(o00oOooO2, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    @o00oOooO.o0o0000
    public Drawable o00oOooO(Drawable drawable, boolean z) {
        if (drawable instanceof o00oooo0.o0OooO0) {
            o00oooo0.o0OooO0 o0oooo0 = (o00oooo0.o0OooO0) drawable;
            Drawable o00oOOo02 = o0oooo0.o00oOOo0();
            if (o00oOOo02 != null) {
                o0oooo0.o00oOOoO(o00oOooO(o00oOOo02, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = o00oOooO(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                o00oOOo0.o00oOOo0(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1170o00oOOoO == null) {
                this.f1170o00oOOoO = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(o00oOOo0());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
