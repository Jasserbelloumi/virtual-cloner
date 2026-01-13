package o0O000oo;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import o00ooOoo.oO00O0oO;
import o0OOOoO0.oO0o0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a3\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0087\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010&\u001a\u00020#*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030'*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030'*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroid/view/ViewGroup;", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/View;", "o00oOooO", "view", "", "o00oOOo0", "Lo0OO0o/oO0Ooooo;", "o00oo00O", "o00oOooo", "o00oOoOO", "o00oOoOo", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "action", o0OO000o.o00oOOoO.f12961o00oOo00, "Lkotlin/Function2;", "o00oOo00", "", "o00oOoo0", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "o00oo0", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "o00oo0OO", TtmlNode.START, TtmlNode.END, "o00oo0O", "o00oOoO", "(Landroid/view/ViewGroup;)I", "Lo0OOOo0o/o0O0O0Oo;", "o00oOoO0", "(Landroid/view/ViewGroup;)Lo0OOOo0o/o0O0O0Oo;", "indices", "Lo0OOOoO0/oO000;", "o00oOo0O", "(Landroid/view/ViewGroup;)Lo0OOOoO0/oO000;", "children", "o00oOo0o", "descendants", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0OO0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"o0O000oo/o0OO0$o00oOOo0", "Lo0OOOoO0/oO000;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o0OOOoO0.oO000<View> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f10691o00oOOo0;

        public o00oOOo0(ViewGroup viewGroup) {
            this.f10691o00oOOo0 = viewGroup;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<View> iterator() {
            return o0OO0.o00oOoo0(this.f10691o00oOOo0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo0OOOoO0/oO000O0O;", "Landroid/view/View;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @o0OOO0.o00oo00O(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0O0o implements o0OOOO.o0O00000<o0OOOoO0.oO000O0O<? super View>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ ViewGroup $this_descendants;
        public int I$0;
        public int I$1;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(ViewGroup viewGroup, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_descendants = viewGroup;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$this_descendants, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOOoO0.oO000O0O<? super View> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:22:0x008e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0095 -> B:24:0x0099). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                int r1 = r11.I$1
                int r4 = r11.I$0
                java.lang.Object r5 = r11.L$1
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.L$0
                o0OOOoO0.oO000O0O r6 = (o0OOOoO0.oO000O0O) r6
                o0OO0o.oo0ooO.o00oo0(r12)
                r12 = r11
                goto L8e
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                int r1 = r11.I$1
                int r4 = r11.I$0
                java.lang.Object r5 = r11.L$2
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.L$1
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.L$0
                o0OOOoO0.oO000O0O r7 = (o0OOOoO0.oO000O0O) r7
                o0OO0o.oo0ooO.o00oo0(r12)
                r12 = r11
                goto L6e
            L3b:
                o0OO0o.oo0ooO.o00oo0(r12)
                java.lang.Object r12 = r11.L$0
                o0OOOoO0.oO000O0O r12 = (o0OOOoO0.oO000O0O) r12
                android.view.ViewGroup r1 = r11.$this_descendants
                r4 = 0
                int r5 = r1.getChildCount()
                r6 = r11
            L4a:
                if (r4 >= r5) goto L9b
                android.view.View r7 = r1.getChildAt(r4)
                java.lang.String r8 = "getChildAt(index)"
                o0OOOOO0.o0ooO.o00oo0OO(r7, r8)
                r6.L$0 = r12
                r6.L$1 = r1
                r6.L$2 = r7
                r6.I$0 = r4
                r6.I$1 = r5
                r6.label = r3
                java.lang.Object r8 = r12.o00oOOoO(r7, r6)
                if (r8 != r0) goto L68
                return r0
            L68:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r5
                r5 = r9
            L6e:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L95
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                o0OOOoO0.oO000 r5 = o0O000oo.o0OO0.o00oOo0o(r5)
                r12.L$0 = r7
                r12.L$1 = r6
                r8 = 0
                r12.L$2 = r8
                r12.I$0 = r4
                r12.I$1 = r1
                r12.label = r2
                java.lang.Object r5 = r7.o00oOo0O(r5, r12)
                if (r5 != r0) goto L8c
                return r0
            L8c:
                r5 = r6
                r6 = r7
            L8e:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L99
            L95:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L99:
                int r4 = r4 + r3
                goto L4a
            L9b:
                o0OO0o.oO0Ooooo r12 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o0O000oo.o0OO0.o00oOOoO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"o0O000oo/o0OO0$o00oOo00", "", "Landroid/view/View;", "", "hasNext", "o00oOOo0", "Lo0OO0o/oO0Ooooo;", "remove", "", "o00oo0O0", "I", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements Iterator<View>, o0OOOOO.o00oOo0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f10692o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f10693o00oo0O0;

        public o00oOo00(ViewGroup viewGroup) {
            this.f10692o00oo0O = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10693o00oo0O0 < this.f10692o00oo0O.getChildCount();
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOOo0 */
        public View next() {
            ViewGroup viewGroup = this.f10692o00oo0O;
            int i = this.f10693o00oo0O0;
            this.f10693o00oo0O0 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f10692o00oo0O;
            int i = this.f10693o00oo0O0 - 1;
            this.f10693o00oo0O0 = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final boolean o00oOOo0(@NotNull ViewGroup viewGroup, @NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void o00oOOoO(@NotNull ViewGroup viewGroup, @NotNull o0OOOO.o00oo<? super View, o0OO0o.oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            o0OOOOO0.o0ooO.o00oo0OO(childAt, "getChildAt(index)");
            o00ooVar.invoke(childAt);
        }
    }

    public static final void o00oOo00(@NotNull ViewGroup viewGroup, @NotNull o0OOOO.o0O00000<? super Integer, ? super View, o0OO0o.oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            o0OOOOO0.o0ooO.o00oo0OO(childAt, "getChildAt(index)");
            o0o00000.invoke(valueOf, childAt);
        }
    }

    @NotNull
    public static final o0OOOoO0.oO000<View> o00oOo0O(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return new o00oOOo0(viewGroup);
    }

    @NotNull
    public static final o0OOOoO0.oO000<View> o00oOo0o(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return oO0o0o.o00oOOoO(new o00oOOoO(viewGroup, null));
    }

    public static final int o00oOoO(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo o00oOoO0(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return o0OOOo0o.oo0OOoo.o0OO00o(0, viewGroup.getChildCount());
    }

    public static final boolean o00oOoOO(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean o00oOoOo(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @NotNull
    public static final Iterator<View> o00oOoo0(@NotNull ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        return new o00oOo00(viewGroup);
    }

    @NotNull
    public static final View o00oOooO(@NotNull ViewGroup viewGroup, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("Index: ", i, ", Size: ");
        o00oOOo02.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(o00oOOo02.toString());
    }

    public static final void o00oOooo(@NotNull ViewGroup viewGroup, @NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        viewGroup.removeView(view);
    }

    public static final void o00oo0(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @o00oOooO.o0OO0 int i) {
        o0OOOOO0.o0ooO.o00oo0O0(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void o00oo00O(@NotNull ViewGroup viewGroup, @NotNull View view) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(view, "view");
        viewGroup.addView(view);
    }

    @o00oOooO.o0OOooO0(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void o00oo0O(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @o00oOooO.o0OO0 int i, @o00oOooO.o0OO0 int i2, @o00oOooO.o0OO0 int i3, @o00oOooO.o0OO0 int i4) {
        o0OOOOO0.o0ooO.o00oo0O0(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void o00oo0O0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        o0OOOOO0.o0ooO.o00oo0O0(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void o00oo0OO(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @o00oOooO.o0OO0 int i, @o00oOooO.o0OO0 int i2, @o00oOooO.o0OO0 int i3, @o00oOooO.o0OO0 int i4) {
        o0OOOOO0.o0ooO.o00oo0O0(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void o00oo0Oo(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        o0OOOOO0.o0ooO.o00oo0O0(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
