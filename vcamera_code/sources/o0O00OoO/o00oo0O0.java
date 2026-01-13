package o0O00OoO;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lo0O00OoO/o00oo0O0;", "Lo0O00OoO/o0O000o0;", "", "previousFragmentId", "Ljava/lang/String;", "getPreviousFragmentId", "()Ljava/lang/String;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oo0O0 extends o0O000o0 {
    @NotNull
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oo0O0(@NotNull Fragment fragment, @NotNull String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        o0ooO.o00oo0O0(fragment, "fragment");
        o0ooO.o00oo0O0(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    @NotNull
    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
