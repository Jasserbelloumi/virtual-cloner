package o0O0oOO;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0O0oo0O.o0OO0O0;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O000O;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0ooO;
import oooOO0.o00oOOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u0082\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\b\u0010<\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u00104\u001a\u00020&\u0012Q\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\b=\u0010>J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016Ji\u0010\u001c\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192Q\u0010\u001b\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\rH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010*\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103Rm\u0010;\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lo0O0oOO/o0O00oO0;", "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "Lo0O0oOO/o0oO0O0o;", "Lo0O0oOO/o0O00OO;", "", "Lkotlin/Function3;", "Lo0O0oo0O/o0OO00OO;", "Lo0OO0o/o0O0o00O;", "name", "dialog", "", FirebaseAnalytics.Param.INDEX, "text", "Lo0OO0o/oO0Ooooo;", "Lcom/afollestad/materialdialogs/list/ItemListener;", "o00ooO0", "Landroid/view/ViewGroup;", "parent", "viewType", "o00ooO0o", "getItemCount", "holder", "position", "o00ooO0O", "o00oo0O0", "", FirebaseAnalytics.Param.ITEMS, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o00ooO", "", "indices", "o00oo0OO", "o00oo0o", "o00oOoo0", "o00oo0Oo", "o00oOoO", "o00oo0", "o00oOo00", "", "o00oo0oO", "o00oOOo0", "[I", "disabledIndices", o00oOOoO.f12961o00oOo00, "Lo0O0oo0O/o0OO00OO;", "Ljava/util/List;", "o00oo", "()Ljava/util/List;", "o00ooOO0", "(Ljava/util/List;)V", "o00oOooO", "Z", "waitForPositiveButton", "o00oOo0O", "Lo0OOOO/o0O0000O;", "o00ooO00", "()Lo0OOOO/o0O0000O;", "o00ooOO", "(Lo0OOOO/o0O0000O;)V", "selection", "disabledItems", "<init>", "(Lo0O0oo0O/o0OO00OO;Ljava/util/List;[IZLo0OOOO/o0O0000O;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O00oO0 extends RecyclerView.o00oo0OO<o0oO0O0o> implements o0O00OO<CharSequence, o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, ? extends oO0Ooooo>> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int[] f12706o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OO00OO f12707o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public List<? extends CharSequence> f12708o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> f12709o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f12710o00oOooO;

    public o0O00oO0(@NotNull o0OO00OO o0oo00oo, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, boolean z, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        this.f12707o00oOOoO = o0oo00oo;
        this.f12708o00oOo00 = list;
        this.f12710o00oOooO = z;
        this.f12709o00oOo0O = o0o0000o;
        this.f12706o00oOOo0 = iArr == null ? new int[0] : iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f12708o00oOo00.size();
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOo00() {
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOoO() {
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOoo0(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
    }

    @NotNull
    public final List<CharSequence> o00oo() {
        return this.f12708o00oOo00;
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0() {
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0O0() {
        Object obj = this.f12707o00oOOoO.f12787o00oo0O0.get(o0O0O0O.f12711o00oOOo0);
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o = this.f12709o00oOo0O;
            if (o0o0000o != null) {
                o0o0000o.invoke(this.f12707o00oOOoO, num, this.f12708o00oOo00.get(num.intValue()));
            }
            this.f12707o00oOOoO.f12787o00oo0O0.remove(o0O0O0O.f12711o00oOOo0);
        }
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0OO(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        this.f12706o00oOOo0 = iArr;
        notifyDataSetChanged();
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0Oo(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0o(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
    }

    @Override // o0O0oOO.o0O00OO
    public boolean o00oo0oO(int i) {
        return false;
    }

    @Override // o0O0oOO.o0O00OO
    /* renamed from: o00ooO */
    public void o00oOoOo(@NotNull List<? extends CharSequence> list, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        this.f12708o00oOo00 = list;
        if (o0o0000o != null) {
            this.f12709o00oOo0O = o0o0000o;
        }
        notifyDataSetChanged();
    }

    public final void o00ooO0(int i) {
        if (this.f12710o00oOooO && o00oOOo0.o00oOOoO(this.f12707o00oOOoO, o0OO0O0.POSITIVE)) {
            Object obj = this.f12707o00oOOoO.f12787o00oo0O0.get(o0O0O0O.f12711o00oOOo0);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            this.f12707o00oOOoO.f12787o00oo0O0.put(o0O0O0O.f12711o00oOOo0, Integer.valueOf(i));
            if (num != null) {
                notifyItemChanged(num.intValue());
            }
            notifyItemChanged(i);
            return;
        }
        o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o = this.f12709o00oOo0O;
        if (o0o0000o != null) {
            o0o0000o.invoke(this.f12707o00oOOoO, Integer.valueOf(i), this.f12708o00oOo00.get(i));
        }
        o0OO00OO o0oo00oo = this.f12707o00oOOoO;
        if (!o0oo00oo.f12786o00oo0O || o00oOOo0.o00oOo00(o0oo00oo)) {
            return;
        }
        this.f12707o00oOOoO.dismiss();
    }

    @Nullable
    public final o0O0000O<o0OO00OO, Integer, CharSequence, oO0Ooooo> o00ooO00() {
        return this.f12709o00oOo0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0O */
    public void onBindViewHolder(@NotNull o0oO0O0o o0oo0o0o, int i) {
        o0ooO.o00oo0O(o0oo0o0o, "holder");
        View view = o0oo0o0o.itemView;
        o0ooO.o00oOoO(view, "holder.itemView");
        boolean z = true;
        view.setEnabled(!o0O000O.o0oooooO(this.f12706o00oOOo0, i));
        o0oo0o0o.f12723o00oo0O0.setText(this.f12708o00oOo00.get(i));
        View view2 = o0oo0o0o.itemView;
        o0ooO.o00oOoO(view2, "holder.itemView");
        view2.setBackground(o0O0oOo0.o0O00oO0.o00oOo00(this.f12707o00oOOoO));
        Object obj = this.f12707o00oOOoO.f12787o00oo0O0.get(o0O0O0O.f12711o00oOOo0);
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        View view3 = o0oo0o0o.itemView;
        o0ooO.o00oOoO(view3, "holder.itemView");
        view3.setActivated((num == null || num.intValue() != i) ? false : false);
        Typeface typeface = this.f12707o00oOOoO.f12790o00oo0o0;
        if (typeface != null) {
            o0oo0o0o.f12723o00oo0O0.setTypeface(typeface);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o00ooO0o */
    public o0oO0O0o onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0ooO.o00oo0O(viewGroup, "parent");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0oO0O0o o0oo0o0o = new o0oO0O0o(o0oooo0.o00oOoOO(viewGroup, this.f12707o00oOOoO.f12800o00ooOo, R.layout.md_listitem), this);
        o0OooO0.o00oo0OO(o0oooo0, o0oo0o0o.f12723o00oo0O0, this.f12707o00oOOoO.f12800o00ooOo, Integer.valueOf(R.attr.md_color_content), null, 4, null);
        return o0oo0o0o;
    }

    public final void o00ooOO(@Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        this.f12709o00oOo0O = o0o0000o;
    }

    public final void o00ooOO0(@NotNull List<? extends CharSequence> list) {
        o0ooO.o00oo0O(list, "<set-?>");
        this.f12708o00oOo00 = list;
    }
}
