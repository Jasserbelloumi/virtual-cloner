package o0O0oOO;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.o00oOo0O;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o00ooOoo.oO00O0oO;
import o0O0oOo.o0O0OO0;
import o0O0oOo.o0O0OOOo;
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
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b!\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012_\u0012\u0004\u0012\u00020\u0004\u0012U\u0012S\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f0\u0003B\u0098\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\b\u0010G\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010H\u001a\u00020\n\u0012\u0006\u0010=\u001a\u00020*\u0012\u0006\u0010?\u001a\u00020*\u0012W\u0010F\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J&\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016Jo\u0010\"\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2W\u0010!\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000fH\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R$\u00101\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<Rs\u0010F\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006K"}, d2 = {"Lo0O0oOO/o0oO0Ooo;", "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "Lo0O0oOO/o0O00o00;", "Lo0O0oOO/o0O00OO;", "", "Lkotlin/Function3;", "Lo0O0oo0O/o0OO00OO;", "Lo0OO0o/o0O0o00O;", "name", "dialog", "", "indices", "", FirebaseAnalytics.Param.ITEMS, "Lo0OO0o/oO0Ooooo;", "Lcom/afollestad/materialdialogs/list/MultiChoiceListener;", "", FirebaseAnalytics.Param.INDEX, "o00ooO0", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "o00ooO", "getItemCount", "holder", "position", "o00ooO0O", "", "", "payloads", "o00ooO0o", "o00oo0O0", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o00ooOO0", "o00oo0OO", "o00oo0o", "o00oOoo0", "o00oo0Oo", "o00oOoO", "o00oo0", "o00oOo00", "", "o00oo0oO", "value", "o00oOOo0", "[I", "o00ooOO", "([I)V", "currentSelection", o00oOOoO.f12961o00oOo00, "disabledIndices", "Lo0O0oo0O/o0OO00OO;", "o00oOooO", "Ljava/util/List;", "o00oo", "()Ljava/util/List;", "o00ooOOo", "(Ljava/util/List;)V", "o00oOo0O", "Z", "waitForActionButton", "o00oOo0o", "allowEmptySelection", "o00oOoO0", "Lo0OOOO/o0O0000O;", "o00ooO00", "()Lo0OOOO/o0O0000O;", "o00ooOo0", "(Lo0OOOO/o0O0000O;)V", "selection", "disabledItems", "initialSelection", "<init>", "(Lo0O0oo0O/o0OO00OO;Ljava/util/List;[I[IZZLo0OOOO/o0O0000O;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0oO0Ooo extends RecyclerView.o00oo0OO<o0O00o00> implements o0O00OO<CharSequence, o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, ? extends oO0Ooooo>> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int[] f12724o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int[] f12725o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OO00OO f12726o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final boolean f12727o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f12728o00oOo0o;
    @Nullable

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, oO0Ooooo> f12729o00oOoO0;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public List<? extends CharSequence> f12730o00oOooO;

    public o0oO0Ooo(@NotNull o0OO00OO o0oo00oo, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, @NotNull int[] iArr2, boolean z, boolean z2, @Nullable o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        o0ooO.o00oo0O(iArr2, "initialSelection");
        this.f12726o00oOo00 = o0oo00oo;
        this.f12730o00oOooO = list;
        this.f12727o00oOo0O = z;
        this.f12728o00oOo0o = z2;
        this.f12729o00oOoO0 = o0o0000o;
        this.f12724o00oOOo0 = iArr2;
        this.f12725o00oOOoO = iArr == null ? new int[0] : iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        return this.f12730o00oOooO.size();
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOo00() {
        if (this.f12724o00oOOo0.length == 0) {
            o00oOoO();
        } else {
            o00oo0();
        }
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOoO() {
        int[] iArr = this.f12724o00oOOo0;
        int itemCount = getItemCount();
        int[] iArr2 = new int[itemCount];
        for (int i = 0; i < itemCount; i++) {
            iArr2[i] = i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < itemCount; i2++) {
            int i3 = iArr2[i2];
            if (true ^ o0O000O.o0oooooO(iArr, i3)) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        o00ooOO(o0O0OOOo.o00oOOo0(this.f12724o00oOOo0, arrayList));
        if (iArr.length == 0) {
            o00oOOo0.o00oOooO(this.f12726o00oOo00, o0OO0O0.POSITIVE, true);
        }
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oOoo0(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        int[] iArr2 = this.f12724o00oOOo0;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                int[] o00oOOoO2 = o0O0OOOo.o00oOOoO(this.f12724o00oOOo0, arrayList);
                if (o00oOOoO2.length == 0) {
                    o00oOOo0.o00oOooO(this.f12726o00oOo00, o0OO0O0.POSITIVE, this.f12728o00oOo0o);
                }
                o00ooOO(o00oOOoO2);
                return;
            }
            int i2 = iArr[i];
            if (i2 < 0 || i2 >= this.f12730o00oOooO.size()) {
                z = false;
            }
            if (!z) {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index ", i2, " is out of range for this adapter of ");
                o00oOOo02.append(this.f12730o00oOooO.size());
                o00oOOo02.append(" items.");
                throw new IllegalStateException(o00oOOo02.toString().toString());
            }
            if (o0O000O.o0oooooO(iArr2, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        }
    }

    @NotNull
    public final List<CharSequence> o00oo() {
        return this.f12730o00oOooO;
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0() {
        o00ooOO(new int[0]);
        o00oOOo0.o00oOooO(this.f12726o00oOo00, o0OO0O0.POSITIVE, this.f12728o00oOo0o);
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0O0() {
        if (!this.f12728o00oOo0o) {
            if (!(!(this.f12724o00oOOo0.length == 0))) {
                return;
            }
        }
        List<? extends CharSequence> list = this.f12730o00oOooO;
        int[] iArr = this.f12724o00oOOo0;
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(list.get(i));
        }
        o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, oO0Ooooo> o0o0000o = this.f12729o00oOoO0;
        if (o0o0000o != null) {
            o0o0000o.invoke(this.f12726o00oOo00, this.f12724o00oOOo0, arrayList);
        }
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0OO(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        this.f12725o00oOOoO = iArr;
        notifyDataSetChanged();
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0Oo(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        List<Integer> oooO0Oo = o0O000O.oooO0Oo(this.f12724o00oOOo0);
        for (int i : iArr) {
            if (!o0O000O.o0oooooO(this.f12725o00oOOoO, i)) {
                boolean contains = oooO0Oo.contains(Integer.valueOf(i));
                Integer valueOf = Integer.valueOf(i);
                if (contains) {
                    oooO0Oo.remove(valueOf);
                } else {
                    oooO0Oo.add(valueOf);
                }
            }
        }
        int[] o0o00o0O = o0OO0oO.o0O0oo0o.o0o00o0O(oooO0Oo);
        o00oOOo0.o00oOooO(this.f12726o00oOo00, o0OO0O0.POSITIVE, o0o00o0O.length == 0 ? this.f12728o00oOo0o : true);
        o00ooOO(o0o00o0O);
    }

    @Override // o0O0oOO.o0O00OO
    public void o00oo0o(@NotNull int[] iArr) {
        o0ooO.o00oo0O(iArr, "indices");
        int[] iArr2 = this.f12724o00oOOo0;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (!(i2 >= 0 && i2 < this.f12730o00oOooO.size())) {
                StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index ", i2, " is out of range for this adapter of ");
                o00oOOo02.append(this.f12730o00oOooO.size());
                o00oOOo02.append(" items.");
                throw new IllegalStateException(o00oOOo02.toString().toString());
            }
            if (true ^ o0O000O.o0oooooO(iArr2, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        o00ooOO(o0O0OOOo.o00oOOo0(this.f12724o00oOOo0, arrayList));
        if (iArr2.length == 0) {
            o00oOOo0.o00oOooO(this.f12726o00oOo00, o0OO0O0.POSITIVE, true);
        }
    }

    @Override // o0O0oOO.o0O00OO
    public boolean o00oo0oO(int i) {
        return o0O000O.o0oooooO(this.f12724o00oOOo0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o00ooO */
    public o0O00o00 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0ooO.o00oo0O(viewGroup, "parent");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0O00o00 o0o00o00 = new o0O00o00(o0oooo0.o00oOoOO(viewGroup, this.f12726o00oOo00.f12800o00ooOo, R.layout.md_listitem_multichoice), this);
        o0OooO0.o00oo0OO(o0oooo0, o0o00o00.f12703o00oo0O, this.f12726o00oOo00.f12800o00ooOo, Integer.valueOf(R.attr.md_color_content), null, 4, null);
        int[] o00oOo0O2 = o0O0OO0.o00oOo0O(this.f12726o00oOo00, new int[]{R.attr.md_color_widget, R.attr.md_color_widget_unchecked}, null, 2, null);
        o00oOo0O.o00oOOo0.o00oOo00(o0o00o00.f12704o00oo0O0, o0oooo0.o00oOo00(this.f12726o00oOo00.f12800o00ooOo, o00oOo0O2[1], o00oOo0O2[0]));
        return o0o00o00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (((r5.f12724o00oOOo0.length == 0 ? 1 : 0) ^ 1) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00ooO0(int r6) {
        /*
            r5 = this;
            int[] r0 = r5.f12724o00oOOo0
            java.util.List r0 = o0OO0oO.o0O000O.oooO0Oo(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r1 = r0.contains(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L18
            r0.remove(r6)
            goto L1b
        L18:
            r0.add(r6)
        L1b:
            int[] r6 = o0OO0oO.o0O0oo0o.o0o00o0O(r0)
            r5.o00ooOO(r6)
            boolean r6 = r5.f12727o00oOo0O
            r0 = 0
            if (r6 == 0) goto L48
            o0O0oo0O.o0OO00OO r6 = r5.f12726o00oOo00
            boolean r6 = oooOO0.o00oOOo0.o00oOo00(r6)
            if (r6 == 0) goto L48
            o0O0oo0O.o0OO00OO r6 = r5.f12726o00oOo00
            o0O0oo0O.o0OO0O0 r1 = o0O0oo0O.o0OO0O0.POSITIVE
            boolean r2 = r5.f12728o00oOo0o
            r3 = 1
            if (r2 != 0) goto L43
            int[] r2 = r5.f12724o00oOOo0
            int r2 = r2.length
            if (r2 != 0) goto L3f
            r2 = r3
            goto L40
        L3f:
            r2 = r0
        L40:
            r2 = r2 ^ r3
            if (r2 == 0) goto L44
        L43:
            r0 = r3
        L44:
            oooOO0.o00oOOo0.o00oOooO(r6, r1, r0)
            goto L7f
        L48:
            java.util.List<? extends java.lang.CharSequence> r6 = r5.f12730o00oOooO
            int[] r1 = r5.f12724o00oOOo0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
        L52:
            if (r0 >= r3) goto L60
            r4 = r1[r0]
            java.lang.Object r4 = r6.get(r4)
            r2.add(r4)
            int r0 = r0 + 1
            goto L52
        L60:
            o0OOOO.o0O0000O<? super o0O0oo0O.o0OO00OO, ? super int[], ? super java.util.List<? extends java.lang.CharSequence>, o0OO0o.oO0Ooooo> r6 = r5.f12729o00oOoO0
            if (r6 == 0) goto L6e
            o0O0oo0O.o0OO00OO r0 = r5.f12726o00oOo00
            int[] r1 = r5.f12724o00oOOo0
            java.lang.Object r6 = r6.invoke(r0, r1, r2)
            o0OO0o.oO0Ooooo r6 = (o0OO0o.oO0Ooooo) r6
        L6e:
            o0O0oo0O.o0OO00OO r6 = r5.f12726o00oOo00
            boolean r0 = r6.f12786o00oo0O
            if (r0 == 0) goto L7f
            boolean r6 = oooOO0.o00oOOo0.o00oOo00(r6)
            if (r6 != 0) goto L7f
            o0O0oo0O.o0OO00OO r6 = r5.f12726o00oOo00
            r6.dismiss()
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0oOO.o0oO0Ooo.o00ooO0(int):void");
    }

    @Nullable
    public final o0O0000O<o0OO00OO, int[], List<? extends CharSequence>, oO0Ooooo> o00ooO00() {
        return this.f12729o00oOoO0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0O */
    public void onBindViewHolder(@NotNull o0O00o00 o0o00o00, int i) {
        o0ooO.o00oo0O(o0o00o00, "holder");
        o0o00o00.o00oOooO(!o0O000O.o0oooooO(this.f12725o00oOOoO, i));
        o0o00o00.f12704o00oo0O0.setChecked(o0O000O.o0oooooO(this.f12724o00oOOo0, i));
        o0o00o00.f12703o00oo0O.setText(this.f12730o00oOooO.get(i));
        View view = o0o00o00.itemView;
        o0ooO.o00oOoO(view, "holder.itemView");
        view.setBackground(o0O0oOo0.o0O00oO0.o00oOo00(this.f12726o00oOo00));
        Typeface typeface = this.f12726o00oOo00.f12790o00oo0o0;
        if (typeface != null) {
            o0o00o00.f12703o00oo0O.setTypeface(typeface);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o00ooO0o */
    public void onBindViewHolder(@NotNull o0O00o00 o0o00o00, int i, @NotNull List<Object> list) {
        o0ooO.o00oo0O(o0o00o00, "holder");
        o0ooO.o00oo0O(list, "payloads");
        Object o0OOOOoO2 = o0OO0oO.o0O0oo0o.o0OOOOoO(list);
        if (o0ooO.o00oOoO0(o0OOOOoO2, o0O00O.f12702o00oOOo0)) {
            o0o00o00.f12704o00oo0O0.setChecked(true);
        } else if (o0ooO.o00oOoO0(o0OOOOoO2, o0O0O0o0.f12715o00oOOo0)) {
            o0o00o00.f12704o00oo0O0.setChecked(false);
        } else {
            super.onBindViewHolder(o0o00o00, i, list);
            super.onBindViewHolder(o0o00o00, i, list);
        }
    }

    public final void o00ooOO(int[] iArr) {
        int[] iArr2 = this.f12724o00oOOo0;
        this.f12724o00oOOo0 = iArr;
        for (int i : iArr2) {
            if (!o0O000O.o0oooooO(iArr, i)) {
                notifyItemChanged(i, o0O0O0o0.f12715o00oOOo0);
            }
        }
        for (int i2 : iArr) {
            if (!o0O000O.o0oooooO(iArr2, i2)) {
                notifyItemChanged(i2, o0O00O.f12702o00oOOo0);
            }
        }
    }

    @Override // o0O0oOO.o0O00OO
    /* renamed from: o00ooOO0 */
    public void o00oOoOo(@NotNull List<? extends CharSequence> list, @Nullable o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(list, FirebaseAnalytics.Param.ITEMS);
        this.f12730o00oOooO = list;
        if (o0o0000o != null) {
            this.f12729o00oOoO0 = o0o0000o;
        }
        notifyDataSetChanged();
    }

    public final void o00ooOOo(@NotNull List<? extends CharSequence> list) {
        o0ooO.o00oo0O(list, "<set-?>");
        this.f12730o00oOooO = list;
    }

    public final void o00ooOo0(@Nullable o0O0000O<? super o0OO00OO, ? super int[], ? super List<? extends CharSequence>, oO0Ooooo> o0o0000o) {
        this.f12729o00oOoO0 = o0o0000o;
    }
}
