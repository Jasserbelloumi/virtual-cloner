package o0O0o0oo;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0014"}, d2 = {"Lo0O0o0oo/oo0OOoo;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/RecyclerView$o0O00oO0;", "item", "", "isSelected", "payload", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Ljava/lang/Object;ZLjava/lang/Object;)V", "Landroid/view/View$OnClickListener;", "itemClickListener", "Landroid/view/View$OnLongClickListener;", "itemLongClickListener", "o00oOo00", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "adapter_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class oo0OOoo<T> extends RecyclerView.o0O00oO0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(@NotNull View view) {
        super(view);
        o0OOOOO0.o0ooO.o00oo0O0(view, "itemView");
    }

    public static /* synthetic */ void o00oOOoO(oo0OOoo oo0oooo, Object obj, boolean z, Object obj2, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContent");
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        oo0oooo.o00oOOo0(obj, z, obj2);
    }

    public abstract void o00oOOo0(@NotNull T t, boolean z, @Nullable Object obj);

    public void o00oOo00(@Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        this.itemView.setOnClickListener(onClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
    }
}
