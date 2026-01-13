package o0O0oOo;

import androidx.lifecycle.o0O;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.o0O0oo0o;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O00o00;
import o0OOOO.o00oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"", "", "", o0O.f3319o00oOoO0, "o00oOOo0", o00oOOoO.f12961o00oOo00, "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0OOOo {

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/afollestad/materialdialogs/utils/IntArraysKt$removeAll$1$1"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o00oo<Integer, Boolean> {
        public final /* synthetic */ Collection $values$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(Collection collection) {
            super(1);
            this.$values$inlined = collection;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num.intValue()));
        }

        public final boolean invoke(int i) {
            return this.$values$inlined.contains(Integer.valueOf(i));
        }
    }

    @NotNull
    public static final int[] o00oOOo0(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O(iArr, "$this$appendAll");
        o0OOOOO0.o0ooO.o00oo0O(collection, o0O.f3319o00oOoO0);
        List<Integer> oooO0Oo = o0O000O.oooO0Oo(iArr);
        oooO0Oo.addAll(collection);
        return o0OO0oO.o0O0oo0o.o0o00o0O(oooO0Oo);
    }

    @NotNull
    public static final int[] o00oOOoO(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O(iArr, "$this$removeAll");
        o0OOOOO0.o0ooO.o00oo0O(collection, o0O.f3319o00oOoO0);
        List<Integer> oooO0Oo = o0O000O.oooO0Oo(iArr);
        o0O00o00.o0O0OO(oooO0Oo, new o00oOOo0(collection));
        return o0OO0oO.o0O0oo0o.o0o00o0O(oooO0Oo);
    }
}
