package o00oooOo;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a3\u0010\u0019\u001a\u00020\u0017*\u00020\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a*\u00020\u0000H\u0086\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", TtmlNode.TAG_P, "", "o00oOo00", "Landroid/graphics/Rect;", "r", "o00oOoo0", "o00oOooo", "o00oOo0o", "o00oOoO0", "o00oo00O", "o00oOoO", "o00oOoOO", "o00oOoOo", "o00oOOo0", o00oOOoO.f12961o00oOo00, "o00oo0", "o00oo0OO", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "rect", "Lo0OO0o/oO0Ooooo;", "action", "o00oOooO", "", "o00oOo0O", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ooooO0O0 {

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"o00oooOo/ooooO0O0$o00oOOo0", "", "Landroid/graphics/Rect;", "", "hasNext", "o00oOOo0", "Landroid/graphics/RegionIterator;", "o00oo0O0", "Landroid/graphics/RegionIterator;", "iterator", "o00oo0O", "Landroid/graphics/Rect;", "rect", "o00oo0Oo", "Z", "hasMore", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Iterator<Rect>, o0OOOOO.o00oOOo0 {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Rect f9878o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final RegionIterator f9879o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f9880o00oo0Oo;

        public o00oOOo0(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f9879o00oo0O0 = regionIterator;
            Rect rect = new Rect();
            this.f9878o00oo0O = rect;
            this.f9880o00oo0Oo = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9880o00oo0Oo;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOOo0 */
        public Rect next() {
            if (this.f9880o00oo0Oo) {
                Rect rect = new Rect(this.f9878o00oo0O);
                this.f9880o00oo0Oo = this.f9879o00oo0O0.next(this.f9878o00oo0O);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final Region o00oOOo0(@NotNull Region region, @NotNull Rect rect) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @NotNull
    public static final Region o00oOOoO(@NotNull Region region, @NotNull Region region2) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean o00oOo00(@NotNull Region region, @NotNull Point point) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(point, TtmlNode.TAG_P);
        return region.contains(point.x, point.y);
    }

    @NotNull
    public static final Iterator<Rect> o00oOo0O(@NotNull Region region) {
        o0ooO.o00oo0O0(region, "<this>");
        return new o00oOOo0(region);
    }

    @NotNull
    public static final Region o00oOo0o(@NotNull Region region, @NotNull Rect rect) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region o00oOoO(@NotNull Region region) {
        o0ooO.o00oo0O0(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region o00oOoO0(@NotNull Region region, @NotNull Region region2) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @NotNull
    public static final Region o00oOoOO(@NotNull Region region, @NotNull Rect rect) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @NotNull
    public static final Region o00oOoOo(@NotNull Region region, @NotNull Region region2) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @NotNull
    public static final Region o00oOoo0(@NotNull Region region, @NotNull Rect rect) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final void o00oOooO(@NotNull Region region, @NotNull o00oo<? super Rect, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            }
            o00ooVar.invoke(rect);
        }
    }

    @NotNull
    public static final Region o00oOooo(@NotNull Region region, @NotNull Region region2) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @NotNull
    public static final Region o00oo0(@NotNull Region region, @NotNull Rect rect) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @NotNull
    public static final Region o00oo00O(@NotNull Region region) {
        o0ooO.o00oo0O0(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region o00oo0OO(@NotNull Region region, @NotNull Region region2) {
        o0ooO.o00oo0O0(region, "<this>");
        o0ooO.o00oo0O0(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
