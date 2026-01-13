package o0O0oO0o;

import android.view.View;
import kotlin.Metadata;
import o00oOooO.o0OoO00O;
import o00oOooO.oooOO0;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001aQ\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "Landroid/view/View;", "o00oOo00", "", "viewRes", "view", "", "scrollable", "noVerticalPadding", "horizontalPadding", "dialogWrapContent", "o00oOOo0", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Landroid/view/View;ZZZZ)Lo0O0oo0O/o0OO00OO;", "", "Ljava/lang/String;", "CUSTOM_VIEW_NO_VERTICAL_PADDING", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0OO000 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12701o00oOOo0 = "md.custom_view_no_vertical_padding";

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/view/View;", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/view/View;)V", "com/afollestad/materialdialogs/customview/DialogCustomViewExtKt$customView$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o00oo<View, oO0Ooooo> {
        public final /* synthetic */ boolean $dialogWrapContent$inlined;
        public final /* synthetic */ o0OO00OO $this_customView$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0OO00OO o0oo00oo, boolean z) {
            super(1);
            this.$this_customView$inlined = o0oo00oo;
            this.$dialogWrapContent$inlined = z;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(View view) {
            invoke2(view);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            o0ooO.o00oo0O(view, "$receiver");
            o0OO00OO.o00ooOo(this.$this_customView$inlined, null, Integer.valueOf(view.getMeasuredWidth()), 1, null);
        }
    }

    @NotNull
    public static final o0OO00OO o00oOOo0(@NotNull o0OO00OO o0oo00oo, @oooOO0 @Nullable Integer num, @Nullable View view, boolean z, boolean z2, boolean z3, boolean z4) {
        o0ooO.o00oo0O(o0oo00oo, "$this$customView");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0oooo0.o00oOOoO("customView", view, num);
        o0oo00oo.f12787o00oo0O0.put(f12701o00oOOo0, Boolean.valueOf(z2));
        if (z4) {
            o0OO00OO.o00ooOo(o0oo00oo, null, 0, 1, null);
        }
        View o00oOOoO2 = o0oo00oo.f12793o00ooO0.getContentLayout().o00oOOoO(num, view, z, z2, z3);
        if (z4) {
            o0oooo0.o00ooo00(o00oOOoO2, new o00oOOo0(o0oo00oo, z4));
        }
        return o0oo00oo;
    }

    public static /* synthetic */ o0OO00OO o00oOOoO(o0OO00OO o0oo00oo, Integer num, View view, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        return o00oOOo0(o0oo00oo, num, view, z, z2, z3, z4);
    }

    @o0OoO00O
    @NotNull
    public static final View o00oOo00(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "$this$getCustomView");
        View customView = o0oo00oo.f12793o00ooO0.getContentLayout().getCustomView();
        if (customView != null) {
            return customView;
        }
        throw new IllegalStateException("You have not setup this dialog as a customView dialog.".toString());
    }
}
