package o0O0oOO;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.o00oOo0O;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import o00ooOoo.oO00O0oO;
import o0O0oOo.o0O0OO0;
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
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u008a\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u0012\b\u0010F\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010G\u001a\u00020\n\u0012\u0006\u0010>\u001a\u00020+\u0012Q\u0010E\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\bH\u0010IJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\nH\u0016J&\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016Ji\u0010!\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2Q\u0010 \u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016R$\u00101\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b0\u0010\u0010R\u0016\u00104\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00105R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=Rm\u0010E\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006J"}, d2 = {"Lo0O0oOO/o0O0oo0o;", "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "Lo0O0oOO/o0O0O0Oo;", "Lo0O0oOO/o0O00OO;", "", "Lkotlin/Function3;", "Lo0O0oo0O/o0OO00OO;", "Lo0OO0o/o0O0o00O;", "name", "dialog", "", FirebaseAnalytics.Param.INDEX, "text", "Lo0OO0o/oO0Ooooo;", "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;", "o00ooO0", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "o00ooO", "getItemCount", "holder", "position", "o00ooO0O", "", "", "payloads", "o00ooO0o", "o00oo0O0", "", FirebaseAnalytics.Param.ITEMS, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o00ooOO0", "", "indices", "o00oo0OO", "o00oo0o", "o00oOoo0", "o00oo0Oo", "o00oOoO", "o00oo0", "o00oOo00", "", "o00oo0oO", "value", "o00oOOo0", "I", "o00ooOO", "currentSelection", o00oOOoO.f12961o00oOo00, "[I", "disabledIndices", "Lo0O0oo0O/o0OO00OO;", "o00oOooO", "Ljava/util/List;", "o00oo", "()Ljava/util/List;", "o00ooOOo", "(Ljava/util/List;)V", "o00oOo0O", "Z", "waitForActionButton", "o00oOo0o", "Lo0OOOO/o0O0000O;", "o00ooO00", "()Lo0OOOO/o0O0000O;", "o00ooOo0", "(Lo0OOOO/o0O0000O;)V", "selection", "disabledItems", "initialSelection", "<init>", "(Lo0O0oo0O/o0OO00OO;Ljava/util/List;[IIZLo0OOOO/o0O0000O;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0oo0o extends RecyclerView.o00oo0OO<o0O0O0Oo> implements o0O00OO<CharSequence, o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, ? extends oO0Ooooo>> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f12716o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int[] f12717o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OO00OO f12718o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final boolean f12719o00oOo0O;
    @Nullable

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> f12720o00oOo0o;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public List<? extends CharSequence> f12721o00oOooO;

    public o0O0oo0o(@NotNull o0OO00OO o0oo00oo, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, int i, boolean z, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        this.f12718o00oOo00 = o0oo00oo;
        this.f12721o00oOooO = list;
        this.f12719o00oOo0O = z;
        this.f12720o00oOo0o = o0o0000o;
        this.f12716o00oOOo0 = i;
        this.f12717o00oOOoO = iArr == null ? new int[0] : iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f12721o00oOooO.size();
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
        boolean z = true;
        int i = (iArr.length == 0) ^ true ? iArr[0] : -1;
        if (i < 0 || i >= this.f12721o00oOooO.size()) {
            z = false;
        }
        if (z) {
            if (o0O000O.o0oooooO(this.f12717o00oOOoO, i)) {
                return;
            }
            o00ooOO(-1);
            return;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index ", i, " is out of range for this adapter of ");
        o00oOOo02.append(this.f12721o00oOooO.size());
        o00oOOo02.append(" items.");
        throw new IllegalStateException(o00oOOo02.toString().toString());
    }

    @NotNull
    public final List<CharSequence> o00oo() {
        return this.f12721o00oOooO;
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0() {
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0O0() {
        o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o;
        int i = this.f12716o00oOOo0;
        if (i <= -1 || (o0o0000o = this.f12720o00oOo0o) == null) {
            return;
        }
        o0o0000o.invoke(this.f12718o00oOo00, Integer.valueOf(i), this.f12721o00oOooO.get(this.f12716o00oOOo0));
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0OO(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        this.f12717o00oOOoO = iArr;
        notifyDataSetChanged();
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0Oo(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        int i = (iArr.length == 0) ^ true ? iArr[0] : -1;
        if (o0O000O.o0oooooO(this.f12717o00oOOoO, i)) {
            return;
        }
        if ((iArr.length == 0) || this.f12716o00oOOo0 == i) {
            o00ooOO(-1);
        } else {
            o00ooOO(i);
        }
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0o(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        boolean z = true;
        int i = (iArr.length == 0) ^ true ? iArr[0] : -1;
        if (i < 0 || i >= this.f12721o00oOooO.size()) {
            z = false;
        }
        if (z) {
            if (o0O000O.o0oooooO(this.f12717o00oOOoO, i)) {
                return;
            }
            o00ooOO(i);
            return;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index ", i, " is out of range for this adapter of ");
        o00oOOo02.append(this.f12721o00oOooO.size());
        o00oOOo02.append(" items.");
        throw new IllegalStateException(o00oOOo02.toString().toString());
    }

    @Override // o0O0oOO.o0O00OO
    public boolean o00oo0oO(int i) {
        return this.f12716o00oOOo0 == i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o00ooO */
    public o0O0O0Oo onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0ooO.o00oo0O(viewGroup, "parent");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0O0O0Oo o0o0o0oo = new o0O0O0Oo(o0oooo0.o00oOoOO(viewGroup, this.f12718o00oOo00.f12800o00ooOo, R.layout.md_listitem_singlechoice), this);
        o0OooO0.o00oo0OO(o0oooo0, o0o0o0oo.f12712o00oo0O, this.f12718o00oOo00.f12800o00ooOo, Integer.valueOf(R.attr.md_color_content), null, 4, null);
        int[] o00oOo0O2 = o0O0OO0.o00oOo0O(this.f12718o00oOo00, new int[]{R.attr.md_color_widget, R.attr.md_color_widget_unchecked}, null, 2, null);
        o00oOo0O.o00oOOo0.o00oOo00(o0o0o0oo.f12713o00oo0O0, o0oooo0.o00oOo00(this.f12718o00oOo00.f12800o00ooOo, o00oOo0O2[1], o00oOo0O2[0]));
        return o0o0o0oo;
    }

    public final void o00ooO0(int i) {
        o00ooOO(i);
        if (this.f12719o00oOo0O && o00oOOo0.o00oOo00(this.f12718o00oOo00)) {
            o00oOOo0.o00oOooO(this.f12718o00oOo00, o0OO0O0.POSITIVE, true);
            return;
        }
        o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o = this.f12720o00oOo0o;
        if (o0o0000o != null) {
            o0o0000o.invoke(this.f12718o00oOo00, Integer.valueOf(i), this.f12721o00oOooO.get(i));
        }
        o0OO00OO o0oo00oo = this.f12718o00oOo00;
        if (!o0oo00oo.f12786o00oo0O || o00oOOo0.o00oOo00(o0oo00oo)) {
            return;
        }
        this.f12718o00oOo00.dismiss();
    }

    @Nullable
    public final o0O0000O<o0OO00OO, Integer, CharSequence, oO0Ooooo> o00ooO00() {
        return this.f12720o00oOo0o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0O */
    public void onBindViewHolder(@NotNull o0O0O0Oo o0o0o0oo, int i) {
        o0ooO.o00oo0O(o0o0o0oo, "holder");
        o0o0o0oo.o00oOooO(!o0O000O.o0oooooO(this.f12717o00oOOoO, i));
        o0o0o0oo.f12713o00oo0O0.setChecked(this.f12716o00oOOo0 == i);
        o0o0o0oo.f12712o00oo0O.setText(this.f12721o00oOooO.get(i));
        View view = o0o0o0oo.itemView;
        o0ooO.o00oOoO(view, "holder.itemView");
        view.setBackground(o0O0oOo0.o0O00oO0.o00oOo00(this.f12718o00oOo00));
        Typeface typeface = this.f12718o00oOo00.f12790o00oo0o0;
        if (typeface != null) {
            o0o0o0oo.f12712o00oo0O.setTypeface(typeface);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0o */
    public void onBindViewHolder(@NotNull o0O0O0Oo o0o0o0oo, int i, @NotNull List<Object> list) {
        AppCompatRadioButton appCompatRadioButton;
        boolean z;
        o0ooO.o00oo0O(o0o0o0oo, "holder");
        o0ooO.o00oo0O(list, "payloads");
        Object o0OOOOoO2 = o0OO0oO.o0O0oo0o.o0OOOOoO(list);
        if (o0ooO.o00oOoO0(o0OOOOoO2, o0O00O.f12702o00oOOo0)) {
            appCompatRadioButton = o0o0o0oo.f12713o00oo0O0;
            z = true;
        } else if (!o0ooO.o00oOoO0(o0OOOOoO2, o0O0O0o0.f12715o00oOOo0)) {
            super.onBindViewHolder(o0o0o0oo, i, list);
            return;
        } else {
            appCompatRadioButton = o0o0o0oo.f12713o00oo0O0;
            z = false;
        }
        appCompatRadioButton.setChecked(z);
    }

    public final void o00ooOO(int i) {
        int i2 = this.f12716o00oOOo0;
        if (i == i2) {
            return;
        }
        this.f12716o00oOOo0 = i;
        notifyItemChanged(i2, o0O0O0o0.f12715o00oOOo0);
        notifyItemChanged(i, o0O00O.f12702o00oOOo0);
    }

    @Override // o0O0oOO.o0O00OO
    /* renamed from: o00ooOO0 */
    public void o00oOoOo(@NotNull List<? extends CharSequence> list, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        this.f12721o00oOooO = list;
        if (o0o0000o != null) {
            this.f12720o00oOo0o = o0o0000o;
        }
        notifyDataSetChanged();
    }

    public final void o00ooOOo(@NotNull List<? extends CharSequence> list) {
        o0ooO.o00oo0O(list, "<set-?>");
        this.f12721o00oOooO = list;
    }

    public final void o00ooOo0(@Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        this.f12720o00oOo0o = o0o0000o;
    }
}
