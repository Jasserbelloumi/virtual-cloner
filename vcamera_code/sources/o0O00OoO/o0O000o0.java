package o0O00OoO;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lo0O00OoO/o0O000o0;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "violationMessage", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class o0O000o0 extends RuntimeException {
    @NotNull
    private final Fragment fragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(@NotNull Fragment fragment, @Nullable String str) {
        super(str);
        o0ooO.o00oo0O0(fragment, "fragment");
        this.fragment = fragment;
    }

    public /* synthetic */ o0O000o0(Fragment fragment, String str, int i, o0OOOOO0.o0O00 o0o00) {
        this(fragment, (i & 2) != 0 ? null : str);
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }
}
