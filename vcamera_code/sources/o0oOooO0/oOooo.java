package o0oOooO0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import o0Oo0O0.o0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lo0oOooO0/oOooo;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "Lo0Oo0O0/o0;", "list", "Lo0OO0o/oO0Ooooo;", "o00oooo0", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "o00ooO0", "o00oOooo", "Ljava/util/List;", "fragmentList", "Landroidx/appcompat/app/AppCompatActivity;", "appCompatActivity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class oOooo extends FragmentStateAdapter {
    @NotNull

    /* renamed from: o00oOooo  reason: collision with root package name */
    public List<o0> f17007o00oOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOooo(@NotNull AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        o0ooO.o00oo0O0(appCompatActivity, o00oo.o00oOOo0(new byte[]{-31, 91, -61, 101, -85, -119, -76, 36, -12, 106, -48, 82, -83, -110, -83, 49, -7}, new byte[]{Byte.MIN_VALUE, 43, -77, 38, -60, -28, -60, 69}));
        this.f17007o00oOooo = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f17007o00oOooo.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment o00ooO0(int i) {
        return this.f17007o00oOooo.get(i);
    }

    public final void o00oooo0(@NotNull List<o0> list) {
        o0ooO.o00oo0O0(list, o00oo.o00oOOo0(new byte[]{-105, 99, -24, -9}, new byte[]{-5, 10, -101, -125, 94, -9, 70, 102}));
        this.f17007o00oOooo = list;
        notifyDataSetChanged();
    }
}
