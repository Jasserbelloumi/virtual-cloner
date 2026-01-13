package o0OOoOo;

import android.content.pm.ApplicationInfo;
import com.google.common.base.Ascii;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo0OOoOo/o0O000Oo;", "Ljava/util/Comparator;", "Landroid/content/pm/ApplicationInfo;", "Lkotlin/Comparator;", "o1", "o2", "", "o00oOOo0", "", "", "o00oo0O0", "Ljava/util/List;", "sortedList", "<init>", "(Ljava/util/List;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O000Oo implements Comparator<ApplicationInfo> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<String> f14910o00oo0O0;

    public o0O000Oo(@NotNull List<String> list) {
        o0ooO.o00oo0O0(list, o00oo.o00oOOo0(new byte[]{79, Ascii.DC2, 78, -72, 73, 44, -36, -127, 79, 9}, new byte[]{60, 125, 60, -52, 44, 72, -112, -24}));
        this.f14910o00oo0O0 = list;
    }

    @Override // java.util.Comparator
    /* renamed from: o00oOOo0 */
    public int compare(@Nullable ApplicationInfo applicationInfo, @Nullable ApplicationInfo applicationInfo2) {
        if (applicationInfo == null || applicationInfo2 == null) {
            return 0;
        }
        return this.f14910o00oo0O0.indexOf(applicationInfo.packageName) - this.f14910o00oo0O0.indexOf(applicationInfo2.packageName);
    }
}
