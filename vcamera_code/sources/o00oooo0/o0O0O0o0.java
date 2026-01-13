package o00oooo0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a2\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "o00oOOo0", "o00oOo00", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O0O0o0 {
    @NotNull
    public static final Bitmap o00oOOo0(@NotNull Drawable drawable, @o0OO0 int i, @o0OO0 int i2, @Nullable Bitmap.Config config) {
        o0OOOOO0.o0ooO.o00oo0O0(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    o0OOOOO0.o0ooO.o00oo0OO(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
                o0OOOOO0.o0ooO.o00oo0OO(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return createScaledBitmap;
            }
        }
        Rect bounds = drawable.getBounds();
        o0OOOOO0.o0ooO.o00oo0OO(bounds, "bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        o0OOOOO0.o0ooO.o00oo0OO(createBitmap, "bitmap");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap o00oOOoO(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return o00oOOo0(drawable, i, i2, config);
    }

    @Nullable
    public static final Bitmap o00oOo00(@NotNull Drawable drawable, @o0OO0 int i, @o0OO0 int i2, @Nullable Bitmap.Config config) {
        o0OOOOO0.o0ooO.o00oo0O0(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return o00oOOo0(drawable, i, i2, config);
    }

    public static final void o00oOo0O(@NotNull Drawable drawable, @o0OO0 int i, @o0OO0 int i2, @o0OO0 int i3, @o0OO0 int i4) {
        o0OOOOO0.o0ooO.o00oo0O0(drawable, "<this>");
        drawable.setBounds(i, i2, i3, i4);
    }

    public static /* synthetic */ void o00oOo0o(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        o00oOo0O(drawable, i, i2, i3, i4);
    }

    public static /* synthetic */ Bitmap o00oOooO(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return o00oOo00(drawable, i, i2, config);
    }
}
