package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o00oOooO.o0OOooO0;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b\u001a7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0087\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\n\u001a\u0015\u0010\u001d\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "block", "o00oOOo0", "", "x", "y", "o00oOoO", TtmlNode.ATTR_TTS_COLOR, "o00oOoo0", "width", "height", "", "filter", "o00oOoOO", "Landroid/graphics/Bitmap$Config;", "config", "o00oOooO", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "o00oOo0O", "Landroid/graphics/Point;", TtmlNode.TAG_P, o00oOOoO.f12961o00oOo00, "Landroid/graphics/PointF;", "o00oOo00", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO00000 {
    @NotNull
    public static final Bitmap o00oOOo0(@NotNull Bitmap bitmap, @NotNull o00oo<? super Canvas, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(bitmap, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        o00ooVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean o00oOOoO(@NotNull Bitmap bitmap, @NotNull Point point) {
        int i;
        o0ooO.o00oo0O0(bitmap, "<this>");
        o0ooO.o00oo0O0(point, TtmlNode.TAG_P);
        int width = bitmap.getWidth();
        int i2 = point.x;
        return (i2 >= 0 && i2 < width) && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final boolean o00oOo00(@NotNull Bitmap bitmap, @NotNull PointF pointF) {
        o0ooO.o00oo0O0(bitmap, "<this>");
        o0ooO.o00oo0O0(pointF, TtmlNode.TAG_P);
        float f = pointF.x;
        if (f >= 0.0f && f < bitmap.getWidth()) {
            float f2 = pointF.y;
            if (f2 >= 0.0f && f2 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Bitmap o00oOo0O(int i, int i2, @NotNull Bitmap.Config config, boolean z, @NotNull ColorSpace colorSpace) {
        o0ooO.o00oo0O0(config, "config");
        o0ooO.o00oo0O0(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        o0ooO.o00oo0OO(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap o00oOo0o(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        o0ooO.o00oo0O0(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        o0ooO.o00oo0OO(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final int o00oOoO(@NotNull Bitmap bitmap, int i, int i2) {
        o0ooO.o00oo0O0(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static /* synthetic */ Bitmap o00oOoO0(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            o0ooO.o00oo0OO(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        o0ooO.o00oo0O0(config, "config");
        o0ooO.o00oo0O0(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        o0ooO.o00oo0OO(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    @NotNull
    public static final Bitmap o00oOoOO(@NotNull Bitmap bitmap, int i, int i2, boolean z) {
        o0ooO.o00oo0O0(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        o0ooO.o00oo0OO(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap o00oOoOo(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        o0ooO.o00oo0O0(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        o0ooO.o00oo0OO(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void o00oOoo0(@NotNull Bitmap bitmap, int i, int i2, @o0O00O int i3) {
        o0ooO.o00oo0O0(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    @NotNull
    public static final Bitmap o00oOooO(int i, int i2, @NotNull Bitmap.Config config) {
        o0ooO.o00oo0O0(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        o0ooO.o00oo0OO(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }
}
