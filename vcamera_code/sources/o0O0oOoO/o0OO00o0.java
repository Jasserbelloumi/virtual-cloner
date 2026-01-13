package o0O0oOoO;

import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lo0O0oOoO/o0OO00o0;", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOoO;", "", SearchIntents.EXTRA_QUERY, "", o00oOOoO.f12961o00oOo00, "newText", "o00oOOo0", "o00oOo00", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class o0OO00o0 implements SimpleSearchView.o00oOOoO {
    @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
    public boolean o00oOOo0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "newText");
        return false;
    }

    @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
    public boolean o00oOOoO(@NotNull String str) {
        o0ooO.o00oo0O0(str, SearchIntents.EXTRA_QUERY);
        return false;
    }

    @Override // com.ferfalk.simplesearchview.SimpleSearchView.o00oOOoO
    public boolean o00oOo00() {
        return false;
    }
}
