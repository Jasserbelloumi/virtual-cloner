package o00oooOo;

import android.graphics.Point;
import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0086\n\u001a\r\u0010\u0014\u001a\u00020\u0004*\u00020\u0000H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0000*\u00020\u0004H\u0086\b¨\u0006\u0016"}, d2 = {"Landroid/graphics/Point;", "", o00oOOoO.f12961o00oOo00, "o00oOooO", "Landroid/graphics/PointF;", "", "o00oOOo0", "o00oOo00", TtmlNode.TAG_P, "o00oOoOo", "o00oOooo", "xy", "o00oOoOO", "o00oOoo0", "o00oOo0o", "o00oOoO", "o00oOo0O", "o00oOoO0", "o00oo0OO", "o00oo0O0", "o00oo0", "o00oo00O", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO0OOO {
    public static final float o00oOOo0(@NotNull PointF pointF) {
        o0ooO.o00oo0O0(pointF, "<this>");
        return pointF.x;
    }

    public static final int o00oOOoO(@NotNull Point point) {
        o0ooO.o00oo0O0(point, "<this>");
        return point.x;
    }

    public static final float o00oOo00(@NotNull PointF pointF) {
        o0ooO.o00oo0O0(pointF, "<this>");
        return pointF.y;
    }

    @NotNull
    public static final Point o00oOo0O(@NotNull Point point, int i) {
        o0ooO.o00oo0O0(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @NotNull
    public static final Point o00oOo0o(@NotNull Point point, @NotNull Point point2) {
        o0ooO.o00oo0O0(point, "<this>");
        o0ooO.o00oo0O0(point2, TtmlNode.TAG_P);
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @NotNull
    public static final PointF o00oOoO(@NotNull PointF pointF, @NotNull PointF pointF2) {
        o0ooO.o00oo0O0(pointF, "<this>");
        o0ooO.o00oo0O0(pointF2, TtmlNode.TAG_P);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @NotNull
    public static final PointF o00oOoO0(@NotNull PointF pointF, float f) {
        o0ooO.o00oo0O0(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @NotNull
    public static final Point o00oOoOO(@NotNull Point point, int i) {
        o0ooO.o00oo0O0(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @NotNull
    public static final Point o00oOoOo(@NotNull Point point, @NotNull Point point2) {
        o0ooO.o00oo0O0(point, "<this>");
        o0ooO.o00oo0O0(point2, TtmlNode.TAG_P);
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @NotNull
    public static final PointF o00oOoo0(@NotNull PointF pointF, float f) {
        o0ooO.o00oo0O0(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    public static final int o00oOooO(@NotNull Point point) {
        o0ooO.o00oo0O0(point, "<this>");
        return point.y;
    }

    @NotNull
    public static final PointF o00oOooo(@NotNull PointF pointF, @NotNull PointF pointF2) {
        o0ooO.o00oo0O0(pointF, "<this>");
        o0ooO.o00oo0O0(pointF2, TtmlNode.TAG_P);
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @NotNull
    public static final PointF o00oo0(@NotNull Point point) {
        o0ooO.o00oo0O0(point, "<this>");
        return new PointF(point);
    }

    @NotNull
    public static final Point o00oo00O(@NotNull PointF pointF) {
        o0ooO.o00oo0O0(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @NotNull
    public static final PointF o00oo0O0(@NotNull PointF pointF) {
        o0ooO.o00oo0O0(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }

    @NotNull
    public static final Point o00oo0OO(@NotNull Point point) {
        o0ooO.o00oo0O0(point, "<this>");
        return new Point(-point.x, -point.y);
    }
}
