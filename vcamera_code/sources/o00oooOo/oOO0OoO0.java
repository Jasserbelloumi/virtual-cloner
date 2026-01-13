package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u0018\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\"\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010$\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010&\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010'\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010*\u001a\u00020(*\u00020\u00062\u0006\u0010'\u001a\u00020\u0014H\u0086\n\u001a\r\u0010+\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010,\u001a\u00020\u0000*\u00020\u0006H\u0086\b\u001a\r\u0010-\u001a\u00020\u0016*\u00020\u0000H\u0086\b\u001a\r\u0010.\u001a\u00020\u0016*\u00020\u0006H\u0086\b\u001a\u0015\u00101\u001a\u00020\u0006*\u00020\u00062\u0006\u00100\u001a\u00020/H\u0086\b¨\u00062"}, d2 = {"Landroid/graphics/Rect;", "", "o00oOooO", "o00oOo0o", "o00oOoO", "o00oOoOo", "Landroid/graphics/RectF;", "", "o00oOo00", "o00oOo0O", "o00oOoO0", "o00oOoOO", "r", "o00oo", "o00ooO0O", "xy", "o00oo0oO", "o00ooO00", "Landroid/graphics/Point;", "o0O0o", "Landroid/graphics/PointF;", "o00ooO0", "Landroid/graphics/Region;", "o00oo0O", "o00oo0Oo", "o00oo00O", "o00oo0OO", "o00oo0", "o00oo0O0", "factor", "o00ooO0o", "o00ooOO0", "o00ooO", "o00oo0o0", "o00oo0o", "o00oOOo0", o00oOOoO.f12961o00oOo00, "o00ooOoo", "o00ooo00", TtmlNode.TAG_P, "", "o00oOoo0", "o00oOooo", "o00ooOOo", "o00ooOO", "o00ooOo0", "o00ooOo", "Landroid/graphics/Matrix;", oOO0O000.f9796o00oOOoO, "o00ooOoO", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO0OoO0 {
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final Rect o00oOOo0(@NotNull Rect rect, @NotNull Rect rect2) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF o00oOOoO(@NotNull RectF rectF, @NotNull RectF rectF2) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float o00oOo00(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        return rectF.left;
    }

    public static final float o00oOo0O(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        return rectF.top;
    }

    public static final int o00oOo0o(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return rect.top;
    }

    public static final int o00oOoO(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return rect.right;
    }

    public static final float o00oOoO0(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        return rectF.right;
    }

    public static final float o00oOoOO(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int o00oOoOo(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean o00oOoo0(@NotNull Rect rect, @NotNull Point point) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(point, TtmlNode.TAG_P);
        return rect.contains(point.x, point.y);
    }

    public static final int o00oOooO(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return rect.left;
    }

    public static final boolean o00oOooo(@NotNull RectF rectF, @NotNull PointF pointF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(pointF, TtmlNode.TAG_P);
        return rectF.contains(pointF.x, pointF.y);
    }

    @NotNull
    public static final Rect o00oo(@NotNull Rect rect, @NotNull Rect rect2) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final Rect o00oo0(@NotNull Rect rect, @NotNull Point point) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @NotNull
    public static final Rect o00oo00O(@NotNull Rect rect, int i) {
        o0ooO.o00oo0O0(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @NotNull
    public static final Region o00oo0O(@NotNull Rect rect, @NotNull Rect rect2) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final RectF o00oo0O0(@NotNull RectF rectF, @NotNull PointF pointF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @NotNull
    public static final RectF o00oo0OO(@NotNull RectF rectF, float f) {
        o0ooO.o00oo0O0(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @NotNull
    public static final Region o00oo0Oo(@NotNull RectF rectF, @NotNull RectF rectF2) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final RectF o00oo0o(@NotNull RectF rectF, @NotNull RectF rectF2) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @NotNull
    public static final Rect o00oo0o0(@NotNull Rect rect, @NotNull Rect rect2) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final Rect o00oo0oO(@NotNull Rect rect, int i) {
        o0ooO.o00oo0O0(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @NotNull
    public static final RectF o00ooO(@NotNull RectF rectF, float f) {
        o0ooO.o00oo0O0(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final RectF o00ooO0(@NotNull RectF rectF, @NotNull PointF pointF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @NotNull
    public static final RectF o00ooO00(@NotNull RectF rectF, float f) {
        o0ooO.o00oo0O0(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @NotNull
    public static final RectF o00ooO0O(@NotNull RectF rectF, @NotNull RectF rectF2) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @NotNull
    public static final Rect o00ooO0o(@NotNull Rect rect, int i) {
        o0ooO.o00oo0O0(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @NotNull
    public static final Rect o00ooOO(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @NotNull
    public static final RectF o00ooOO0(@NotNull RectF rectF, int i) {
        o0ooO.o00oo0O0(rectF, "<this>");
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final RectF o00ooOOo(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return new RectF(rect);
    }

    @NotNull
    public static final Region o00ooOo(@NotNull RectF rectF) {
        o0ooO.o00oo0O0(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @NotNull
    public static final Region o00ooOo0(@NotNull Rect rect) {
        o0ooO.o00oo0O0(rect, "<this>");
        return new Region(rect);
    }

    @NotNull
    public static final RectF o00ooOoO(@NotNull RectF rectF, @NotNull Matrix matrix) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(matrix, oOO0O000.f9796o00oOOoO);
        matrix.mapRect(rectF);
        return rectF;
    }

    @NotNull
    public static final Region o00ooOoo(@NotNull Rect rect, @NotNull Rect rect2) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @NotNull
    public static final Region o00ooo00(@NotNull RectF rectF, @NotNull RectF rectF2) {
        o0ooO.o00oo0O0(rectF, "<this>");
        o0ooO.o00oo0O0(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @NotNull
    public static final Rect o0O0o(@NotNull Rect rect, @NotNull Point point) {
        o0ooO.o00oo0O0(rect, "<this>");
        o0ooO.o00oo0O0(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }
}
