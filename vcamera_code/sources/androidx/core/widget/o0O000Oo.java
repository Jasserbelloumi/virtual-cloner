package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\bø\u0001\u0000\u001av\u0010\u000f\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\u0086\bø\u0001\u0000\u001a7\u0010\u0012\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\bø\u0001\u0000\u001a\u0083\u0002\u0010\u0016\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lo0OO0o/o0O0o00O;", "name", "text", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "Lo0OO0o/oO0Ooooo;", "action", "Landroid/text/TextWatcher;", "o00oOooO", TtmlNode.ANNOTATION_POSITION_BEFORE, "o00oOo0O", "Lkotlin/Function1;", "Landroid/text/Editable;", "o00oOo00", "beforeTextChanged", "onTextChanged", "afterTextChanged", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O000Oo {

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o0O000<CharSequence, Integer, Integer, Integer, oO0Ooooo> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(4);
        }

        @Override // o0OOOO.o0O000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/CharSequence;III)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o0O000<CharSequence, Integer, Integer, Integer, oO0Ooooo> {
        public static final o00oOOoO INSTANCE = new o00oOOoO();

        public o00oOOoO() {
            super(4);
        }

        @Override // o0OOOO.o0O000
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return oO0Ooooo.f13240o00oOOo0;
        }

        public final void invoke(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Editable;", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oo<Editable, oO0Ooooo> {
        public static final o00oOo00 INSTANCE = new o00oOo00();

        public o00oOo00() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Editable editable) {
            invoke2(editable);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Editable editable) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/o0O000Oo$o00oOo0O", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lo0OO0o/oO0Ooooo;", "afterTextChanged", "", "text", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOo0O implements TextWatcher {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O000<CharSequence, Integer, Integer, Integer, oO0Ooooo> f2527o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<Editable, oO0Ooooo> f2528o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O000<CharSequence, Integer, Integer, Integer, oO0Ooooo> f2529o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(o0OOOO.o00oo<? super Editable, oO0Ooooo> o00ooVar, o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o000, o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o0002) {
            this.f2528o00oo0O0 = o00ooVar;
            this.f2527o00oo0O = o0o000;
            this.f2529o00oo0Oo = o0o0002;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            this.f2528o00oo0O0.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.f2527o00oo0O.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.f2529o00oo0Oo.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/o0O000Oo$o00oOo0O", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lo0OO0o/oO0Ooooo;", "afterTextChanged", "", "text", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOoO implements TextWatcher {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo f2530o00oo0O0;

        public o00oOoO(o0OOOO.o00oo o00ooVar) {
            this.f2530o00oo0O0 = o00ooVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            this.f2530o00oo0O0.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/o0O000Oo$o00oOo0O", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lo0OO0o/oO0Ooooo;", "afterTextChanged", "", "text", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo0 implements TextWatcher {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O000 f2531o00oo0O0;

        public o00oo0(o0OOOO.o0O000 o0o000) {
            this.f2531o00oo0O0 = o0o000;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.f2531o00oo0O0.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/o0O000Oo$o00oOo0O", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lo0OO0o/oO0Ooooo;", "afterTextChanged", "", "text", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo00O implements TextWatcher {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O000 f2532o00oo0O0;

        public o00oo00O(o0OOOO.o0O000 o0o000) {
            this.f2532o00oo0O0 = o0o000;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.f2532o00oo0O0.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @NotNull
    public static final TextWatcher o00oOOo0(@NotNull TextView textView, @NotNull o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o000, @NotNull o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o0002, @NotNull o0OOOO.o00oo<? super Editable, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(textView, "<this>");
        o0ooO.o00oo0O0(o0o000, "beforeTextChanged");
        o0ooO.o00oo0O0(o0o0002, "onTextChanged");
        o0ooO.o00oo0O0(o00ooVar, "afterTextChanged");
        o00oOo0O o00ooo0o2 = new o00oOo0O(o00ooVar, o0o000, o0o0002);
        textView.addTextChangedListener(o00ooo0o2);
        return o00ooo0o2;
    }

    public static /* synthetic */ TextWatcher o00oOOoO(TextView textView, o0OOOO.o0O000 o0o000, o0OOOO.o0O000 o0o0002, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            o0o000 = o00oOOo0.INSTANCE;
        }
        if ((i & 2) != 0) {
            o0o0002 = o00oOOoO.INSTANCE;
        }
        if ((i & 4) != 0) {
            o00ooVar = o00oOo00.INSTANCE;
        }
        o0ooO.o00oo0O0(textView, "<this>");
        o0ooO.o00oo0O0(o0o000, "beforeTextChanged");
        o0ooO.o00oo0O0(o0o0002, "onTextChanged");
        o0ooO.o00oo0O0(o00ooVar, "afterTextChanged");
        o00oOo0O o00ooo0o2 = new o00oOo0O(o00ooVar, o0o000, o0o0002);
        textView.addTextChangedListener(o00ooo0o2);
        return o00ooo0o2;
    }

    @NotNull
    public static final TextWatcher o00oOo00(@NotNull TextView textView, @NotNull o0OOOO.o00oo<? super Editable, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(textView, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "action");
        o00oOoO o00oooo2 = new o00oOoO(o00ooVar);
        textView.addTextChangedListener(o00oooo2);
        return o00oooo2;
    }

    @NotNull
    public static final TextWatcher o00oOo0O(@NotNull TextView textView, @NotNull o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o000) {
        o0ooO.o00oo0O0(textView, "<this>");
        o0ooO.o00oo0O0(o0o000, "action");
        o00oo0 o00oo0Var = new o00oo0(o0o000);
        textView.addTextChangedListener(o00oo0Var);
        return o00oo0Var;
    }

    @NotNull
    public static final TextWatcher o00oOooO(@NotNull TextView textView, @NotNull o0OOOO.o0O000<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, oO0Ooooo> o0o000) {
        o0ooO.o00oo0O0(textView, "<this>");
        o0ooO.o00oo0O0(o0o000, "action");
        o00oo00O o00oo00o = new o00oo00O(o0o000);
        textView.addTextChangedListener(o00oo00o);
        return o00oo00o;
    }
}
