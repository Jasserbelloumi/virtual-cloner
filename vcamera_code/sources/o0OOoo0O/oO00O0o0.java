package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lo0OOoo0O/oO00O0o0;", "", "Landroid/view/View;", "view", "Landroid/graphics/Bitmap;", "o00oOOo0", "<init>", "()V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class oO00O0o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oO00O0o0 f15231o00oOOo0 = new oO00O0o0();

    @NotNull
    public final Bitmap o00oOOo0(@NotNull View view) {
        o0ooO.o00oo0O0(view, o00oo.o00oOOo0(new byte[]{Ascii.SYN, -90, 92, -61}, new byte[]{96, -49, 57, -76, 56, -68, 42, -69}));
        view.destroyDrawingCache();
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            drawingCache = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(drawingCache));
        }
        o0ooO.o00oo00O(drawingCache);
        return drawingCache;
    }
}
