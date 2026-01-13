package o0O0oOo;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "indices", "o00oOOo0", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0ooO {
    @NotNull
    public static final /* synthetic */ <T> List<T> o00oOOo0(@NotNull List<? extends T> list, @NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O(list, "$this$pullIndices");
        o0OOOOO0.o0ooO.o00oo0O(iArr, "indices");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }
}
