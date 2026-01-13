package o0O0oOo0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OoO00O;
import o00oOooO.o0OoOoOo;
import o0O0oOo.o0O0OO0;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O000O;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u0000H\u0007\u001a\"\u0010\b\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u009c\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102S\b\u0002\u0010\u001a\u001aM\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012j\u0002`\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0090\u0001\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2S\b\u0002\u0010\u001a\u001aM\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012j\u0002`\u0019¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u0000H\u0007¨\u0006!"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "Landroidx/recyclerview/widget/RecyclerView;", "o00oOo0O", "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "o00oOooO", "adapter", "Landroidx/recyclerview/widget/RecyclerView$o0O00000;", "layoutManager", "o00oOOo0", "", "res", "", "", FirebaseAnalytics.Param.ITEMS, "", "disabledIndices", "", "waitForPositiveButton", "Lkotlin/Function3;", "Lo0OO0o/o0O0o00O;", "name", "dialog", FirebaseAnalytics.Param.INDEX, "text", "Lo0OO0o/oO0Ooooo;", "Lcom/afollestad/materialdialogs/list/ItemListener;", "selection", "o00oOo0o", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/util/List;[IZLo0OOOO/o0O0000O;)Lo0O0oo0O/o0OO00OO;", "o00oOoO", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/util/List;[ILo0OOOO/o0O0000O;)Lo0O0oo0O/o0OO00OO;", "Landroid/graphics/drawable/Drawable;", "o00oOo00", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O00oO0 {
    @NotNull
    public static final o0OO00OO o00oOOo0(@NotNull o0OO00OO o0oo00oo, @NotNull RecyclerView.o00oo0OO<?> o00oo0oo, @Nullable RecyclerView.o0O00000 o0o00000) {
        o0ooO.o00oo0O(o0oo00oo, "$this$customListAdapter");
        o0ooO.o00oo0O(o00oo0oo, "adapter");
        o0oo00oo.f12793o00ooO0.getContentLayout().o00oOo00(o0oo00oo, o00oo0oo, o0o00000);
        return o0oo00oo;
    }

    public static /* synthetic */ o0OO00OO o00oOOoO(o0OO00OO o0oo00oo, RecyclerView.o00oo0OO o00oo0oo, RecyclerView.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 2) != 0) {
            o0o00000 = null;
        }
        return o00oOOo0(o0oo00oo, o00oo0oo, o0o00000);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @Nullable
    public static final Drawable o00oOo00(@NotNull o0OO00OO o0oo00oo) {
        int o00oOo002;
        o0ooO.o00oo0O(o0oo00oo, "$this$getItemSelector");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        Context context = o0oo00oo.getContext();
        o0ooO.o00oOoO(context, "context");
        Drawable o00oo2 = o0OooO0.o00oo(o0oooo0, context, null, Integer.valueOf(R.attr.md_item_selector), null, 10, null);
        if ((o00oo2 instanceof RippleDrawable) && (o00oOo002 = o0O0OO0.o00oOo00(o0oo00oo, null, Integer.valueOf(R.attr.md_ripple_color), null, 5, null)) != 0) {
            ((RippleDrawable) o00oo2).setColor(ColorStateList.valueOf(o00oOo002));
        }
        return o00oo2;
    }

    @o0OoO00O
    @NotNull
    public static final RecyclerView o00oOo0O(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "$this$getRecyclerView");
        DialogRecyclerView recyclerView = o0oo00oo.f12793o00ooO0.getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView;
        }
        throw new IllegalStateException("This dialog is not a list dialog.");
    }

    @o0OoO00O
    @NotNull
    public static final o0OO00OO o00oOo0o(@NotNull o0OO00OO o0oo00oo, @o0OoOoOo @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, boolean z, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(o0oo00oo, "$this$listItems");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0oooo0.o00oOOoO("listItems", list, num);
        return o00oOooO(o0oo00oo) != null ? o00oOoO(o0oo00oo, num, list, iArr, o0o0000o) : o00oOOoO(o0oo00oo, new o0O0oOO.o0O00oO0(o0oo00oo, list != null ? list : o0O000O.oooO0O0O(o0oooo0.o00oOo0o(o0oo00oo.f12800o00ooOo, num)), iArr, z, o0o0000o), null, 2, null);
    }

    @NotNull
    public static final o0OO00OO o00oOoO(@NotNull o0OO00OO o0oo00oo, @o0OoOoOo @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, @Nullable o0O0000O<? super o0OO00OO, ? super Integer, ? super CharSequence, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O(o0oo00oo, "$this$updateListItems");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0oooo0.o00oOOoO("updateListItems", list, num);
        if (list == null) {
            list = o0O000O.oooO0O0O(o0oooo0.o00oOo0o(o0oo00oo.f12800o00ooOo, num));
        }
        RecyclerView.o00oo0OO<?> o00oOooO2 = o00oOooO(o0oo00oo);
        if (o00oOooO2 instanceof o0O0oOO.o0O00oO0) {
            o0O0oOO.o0O00oO0 o0o00oo0 = (o0O0oOO.o0O00oO0) o00oOooO2;
            o0o00oo0.o00oOoOo(list, o0o0000o);
            if (iArr != null) {
                o0o00oo0.o00oo0OO(iArr);
            }
            return o0oo00oo;
        }
        throw new IllegalStateException("updateListItems(...) can't be used before you've created a plain list dialog.".toString());
    }

    public static /* synthetic */ o0OO00OO o00oOoO0(o0OO00OO o0oo00oo, Integer num, List list, int[] iArr, boolean z, o0O0000O o0o0000o, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            o0o0000o = null;
        }
        return o00oOo0o(o0oo00oo, num, list, iArr, z, o0o0000o);
    }

    public static /* synthetic */ o0OO00OO o00oOoOO(o0OO00OO o0oo00oo, Integer num, List list, int[] iArr, o0O0000O o0o0000o, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            iArr = null;
        }
        if ((i & 8) != 0) {
            o0o0000o = null;
        }
        return o00oOoO(o0oo00oo, num, list, iArr, o0o0000o);
    }

    @o0OoO00O
    @Nullable
    public static final RecyclerView.o00oo0OO<?> o00oOooO(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "$this$getListAdapter");
        DialogRecyclerView recyclerView = o0oo00oo.f12793o00ooO0.getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getAdapter();
        }
        return null;
    }
}
