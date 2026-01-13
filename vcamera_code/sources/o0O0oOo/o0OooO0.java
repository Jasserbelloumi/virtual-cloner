package o0O0oOo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0O00oO0;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OoOoOo;
import o00ooo0.o0;
import o0O0Oooo.oooOO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.o0O0o00;
import o0OO0o.o0OOO0;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O0o0;
import o0OO0oO.o0O0oo0o;
import o0OOOO.o00oo;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bX\u0010YJ;\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019H\u0007J$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007J,\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0014H\u0007J$\u0010\"\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020 H\u0007J\u0016\u0010%\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#H\u0007J'\u0010(\u001a\u00020\u0004\"\b\b\u0000\u0010'*\u00020&*\u00028\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)J\f\u0010*\u001a\u00020\u0007*\u00020\fH\u0007J \u0010.\u001a\u00020,*\u00020+2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,0\u0019H\u0007J5\u00102\u001a\u00020,*\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\f2\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b2\u00103J\f\u00104\u001a\u00020\u0004*\u00020/H\u0007J9\u00107\u001a\u00020,*\u0004\u0018\u00010\u00042!\u00106\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020,0\u0019H\u0087\b¢\u0006\u0004\b7\u00108J$\u0010<\u001a\u00020;2\u0006\u0010\r\u001a\u00020\f2\b\b\u0003\u00109\u001a\u00020\u00042\b\b\u0003\u0010:\u001a\u00020\u0004H\u0007J6\u0010>\u001a\u00020,\"\b\b\u0000\u0010'*\u00020&*\u00028\u00002\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0\u0019¢\u0006\u0002\b=H\u0007¢\u0006\u0004\b>\u0010?J6\u0010@\u001a\u00020,\"\b\b\u0000\u0010'*\u00020&*\u00028\u00002\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0\u0019¢\u0006\u0002\b=H\u0007¢\u0006\u0004\b@\u0010?J\u0018\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040B*\u00020AH\u0007JG\u0010H\u001a\u00020,\"\b\b\u0000\u0010'*\u00020&*\u0004\u0018\u00018\u00002\b\b\u0002\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010IJ+\u0010N\u001a\u00020,2\u0006\u0010K\u001a\u00020J2\b\u0010L\u001a\u0004\u0018\u00010\u00012\b\u0010M\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bN\u0010OJ%\u0010Q\u001a\b\u0012\u0004\u0012\u00020J0P*\u00020\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bQ\u0010RJ1\u0010V\u001a\u00028\u0000\"\b\b\u0000\u0010S*\u00020&*\u00020T2\b\b\u0002\u0010U\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lo0O0oOo/o0OooO0;", "", "Lo0O0oo0O/o0OO00OO;", "materialDialog", "", "res", "fallback", "", "html", "", "o00ooOO0", "(Lo0O0oo0O/o0OO00OO;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "Landroid/content/Context;", "context", "o00ooO", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/CharSequence;", "attr", "Landroid/graphics/drawable/Drawable;", "o0O0o", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Lkotlin/Function0;", "o00oo0O0", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Lo0OOOO/o00oOOo0;)I", "", "attrs", "Lkotlin/Function1;", "Lo0OO0o/o0O0o00O;", "name", "forAttr", "o00oo0Oo", "defaultValue", "o00ooO0O", "", "o00oo0o", "o00ooO00", "", "threshold", "o00oOoo0", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "o00oOo0O", "(Landroid/view/View;I)I", "o00oo00O", "Landroid/widget/EditText;", "Lo0OO0o/oO0Ooooo;", "callback", "o00ooOo0", "Landroid/widget/TextView;", "attrRes", "hintAttrRes", "o00oo0", "(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V", "o00oOOo0", "value", "block", "o00oOoO", "(Ljava/lang/Integer;Lo0OOOO/o00oo;)V", "unchecked", "checked", "Landroid/content/res/ColorStateList;", "o00oOo00", "Lo0OO0o/o0O000Oo;", "o00ooo00", "(Landroid/view/View;Lo0OOOO/o00oo;)V", "o00ooOoo", "Landroid/view/WindowManager;", "Lo0OO0o/o0O0o00;", "o00oOoO0", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "o00ooOo", "(Landroid/view/View;IIII)V", "", FirebaseAnalytics.Param.METHOD, "b", oooOO0.f12266o00oOOo0, o0OO000o.o00oOOoO.f12961o00oOo00, "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V", "", "o00oOo0o", "(Landroid/content/Context;Ljava/lang/Integer;)[Ljava/lang/String;", "R", "Landroid/view/ViewGroup;", "ctxt", "o00oOoOO", "(Landroid/view/ViewGroup;Landroid/content/Context;I)Landroid/view/View;", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o0OooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OooO0 f12732o00oOOo0 = new o0OooO0();

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"o0O0oOo/o0OooO0$o00oOOo0", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lo0OO0o/oO0Ooooo;", "afterTextChanged", "", "", TtmlNode.START, "count", TtmlNode.ANNOTATION_POSITION_AFTER, "beforeTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "onTextChanged", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements TextWatcher {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo f12733o00oo0O0;

        public o00oOOo0(o00oo o00ooVar) {
            this.f12733o00oo0O0 = o00ooVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable editable) {
            o0OOOOO0.o0ooO.o00oo0O(editable, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            o0OOOOO0.o0ooO.o00oo0O(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            o0OOOOO0.o0ooO.o00oo0O(charSequence, "s");
            this.f12733o00oo0O0.invoke(charSequence);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"o0O0oOo/o0OooO0$o00oOOoO", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lo0OO0o/oO0Ooooo;", "onGlobalLayout", "", "o00oo0O0", "Ljava/lang/Integer;", "o00oOOo0", "()Ljava/lang/Integer;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Ljava/lang/Integer;)V", "lastHeight", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f12734o00oo0O;
        @Nullable

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Integer f12735o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00oo f12736o00oo0Oo;

        /* JADX WARN: Incorrect types in method signature: (TT;Lo0OOOO/o00oo;)V */
        public o00oOOoO(View view, o00oo o00ooVar) {
            this.f12734o00oo0O = view;
            this.f12736o00oo0Oo = o00ooVar;
        }

        @Nullable
        public final Integer o00oOOo0() {
            return this.f12735o00oo0O0;
        }

        public final void o00oOOoO(@Nullable Integer num) {
            this.f12735o00oo0O0 = num;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Integer num = this.f12735o00oo0O0;
            if (num != null) {
                int measuredHeight = this.f12734o00oo0O.getMeasuredHeight();
                if (num != null && num.intValue() == measuredHeight) {
                    this.f12734o00oo0O.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.f12734o00oo0O.getMeasuredWidth() <= 0 || this.f12734o00oo0O.getMeasuredHeight() <= 0) {
                return;
            }
            Integer num2 = this.f12735o00oo0O0;
            int measuredHeight2 = this.f12734o00oo0O.getMeasuredHeight();
            if (num2 != null && num2.intValue() == measuredHeight2) {
                return;
            }
            this.f12735o00oo0O0 = Integer.valueOf(this.f12734o00oo0O.getMeasuredHeight());
            this.f12736o00oo0Oo.invoke(this.f12734o00oo0O);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"o0O0oOo/o0OooO0$o00oOo00", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lo0OO0o/oO0Ooooo;", "onGlobalLayout", "", "o00oo0O0", "Ljava/lang/Integer;", "o00oOOo0", "()Ljava/lang/Integer;", o0OO000o.o00oOOoO.f12961o00oOo00, "(Ljava/lang/Integer;)V", "lastWidth", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f12737o00oo0O;
        @Nullable

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Integer f12738o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00oo f12739o00oo0Oo;

        /* JADX WARN: Incorrect types in method signature: (TT;Lo0OOOO/o00oo;)V */
        public o00oOo00(View view, o00oo o00ooVar) {
            this.f12737o00oo0O = view;
            this.f12739o00oo0Oo = o00ooVar;
        }

        @Nullable
        public final Integer o00oOOo0() {
            return this.f12738o00oo0O0;
        }

        public final void o00oOOoO(@Nullable Integer num) {
            this.f12738o00oo0O0 = num;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Integer num = this.f12738o00oo0O0;
            if (num != null) {
                int measuredWidth = this.f12737o00oo0O.getMeasuredWidth();
                if (num != null && num.intValue() == measuredWidth) {
                    this.f12737o00oo0O.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.f12737o00oo0O.getMeasuredWidth() <= 0 || this.f12737o00oo0O.getMeasuredHeight() <= 0) {
                return;
            }
            Integer num2 = this.f12738o00oo0O0;
            int measuredWidth2 = this.f12737o00oo0O.getMeasuredWidth();
            if (num2 != null && num2.intValue() == measuredWidth2) {
                return;
            }
            this.f12738o00oo0O0 = Integer.valueOf(this.f12737o00oo0O.getMeasuredWidth());
            this.f12739o00oo0Oo.invoke(this.f12737o00oo0O);
        }
    }

    public static /* synthetic */ View o00oOoOo(o0OooO0 o0oooo0, ViewGroup viewGroup, Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = viewGroup.getContext();
            o0OOOOO0.o0ooO.o00oOoO(context, "context");
        }
        return o0oooo0.o00oOoOO(viewGroup, context, i);
    }

    public static /* synthetic */ ColorStateList o00oOooO(o0OooO0 o0oooo0, Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return o0oooo0.o00oOo00(context, i, i2);
    }

    public static /* synthetic */ boolean o00oOooo(o0OooO0 o0oooo0, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = 0.5d;
        }
        return o0oooo0.o00oOoo0(i, d);
    }

    public static /* synthetic */ Drawable o00oo(o0OooO0 o0oooo0, Context context, Integer num, Integer num2, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            drawable = null;
        }
        return o0oooo0.o0O0o(context, num, num2, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int o00oo0O(o0OooO0 o0oooo0, Context context, Integer num, Integer num2, o0OOOO.o00oOOo0 o00oooo02, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            o00oooo02 = null;
        }
        return o0oooo0.o00oo0O0(context, num, num2, o00oooo02);
    }

    public static /* synthetic */ void o00oo0OO(o0OooO0 o0oooo0, TextView textView, Context context, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num2 = null;
        }
        o0oooo0.o00oo0(textView, context, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int[] o00oo0o0(o0OooO0 o0oooo0, Context context, int[] iArr, o00oo o00ooVar, int i, Object obj) {
        if ((i & 4) != 0) {
            o00ooVar = null;
        }
        return o0oooo0.o00oo0Oo(context, iArr, o00ooVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float o00oo0oO(o0OooO0 o0oooo0, Context context, int i, o0OOOO.o00oOOo0 o00oooo02, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            o00oooo02 = null;
        }
        return o0oooo0.o00oo0o(context, i, o00oooo02);
    }

    public static /* synthetic */ float o00ooO0(o0OooO0 o0oooo0, Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return o0oooo0.o00ooO00(context, i, f);
    }

    public static /* synthetic */ int o00ooO0o(o0OooO0 o0oooo0, Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return o0oooo0.o00ooO0O(context, i, i2);
    }

    public static /* synthetic */ CharSequence o00ooOO(o0OooO0 o0oooo0, Context context, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return o0oooo0.o00ooO(context, num, num2, z);
    }

    public static /* synthetic */ CharSequence o00ooOOo(o0OooO0 o0oooo0, o0OO00OO o0oo00oo, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return o0oooo0.o00ooOO0(o0oo00oo, num, num2, z);
    }

    public static /* synthetic */ void o00ooOoO(o0OooO0 o0oooo0, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view != null ? view.getPaddingLeft() : 0;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = view != null ? view.getPaddingTop() : 0;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = view != null ? view.getPaddingRight() : 0;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = view != null ? view.getPaddingBottom() : 0;
        }
        o0oooo0.o00ooOo(view, i6, i7, i8, i4);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final int o00oOOo0(@NotNull TextView textView) {
        o0OOOOO0.o0ooO.o00oo0O(textView, "$this$additionalPaddingForFont");
        TextPaint paint = textView.getPaint();
        o0OOOOO0.o0ooO.o00oOoO(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        if (f > textView.getMeasuredHeight()) {
            return (int) (f - textView.getMeasuredHeight());
        }
        return 0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void o00oOOoO(@NotNull String str, @Nullable Object obj, @Nullable Integer num) {
        o0OOOOO0.o0ooO.o00oo0O(str, FirebaseAnalytics.Param.METHOD);
        if (num == null && obj == null) {
            throw new IllegalArgumentException(o00oOoOo.o00oo.o00oOOo0(str, ": You must specify a resource ID or literal value"));
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final ColorStateList o00oOo00(@NotNull Context context, @o0O00O int i, @o0O00O int i2) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        int o00oo0O2 = i2 == 0 ? o00oo0O(this, context, null, Integer.valueOf(R.attr.colorControlActivated), null, 10, null) : i2;
        int[][] iArr = {new int[]{-16842912, -16842908}, new int[]{16842912}, new int[]{16842908}};
        int[] iArr2 = new int[3];
        iArr2[0] = i == 0 ? o00oo0O(this, context, null, Integer.valueOf(R.attr.colorControlNormal), null, 10, null) : i;
        iArr2[1] = o00oo0O2;
        iArr2[2] = o00oo0O2;
        return new ColorStateList(iArr, iArr2);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final <T extends View> int o00oOo0O(@NotNull T t, @o0O00oO0 int i) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$dimenPx");
        Context context = t.getContext();
        o0OOOOO0.o0ooO.o00oOoO(context, "context");
        return context.getResources().getDimensionPixelSize(i);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final String[] o00oOo0o(@NotNull Context context, @o0OoOoOo @Nullable Integer num) {
        o0OOOOO0.o0ooO.o00oo0O(context, "$this$getStringArray");
        if (num != null) {
            String[] stringArray = context.getResources().getStringArray(num.intValue());
            o0OOOOO0.o0ooO.o00oOoO(stringArray, "resources.getStringArray(res)");
            return stringArray;
        }
        return new String[0];
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void o00oOoO(@Nullable Integer num, @NotNull o00oo<? super Integer, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O(o00ooVar, "block");
        if (num == null || num.intValue() == 0) {
            return;
        }
        o00ooVar.invoke(num);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final o0O0o00<Integer, Integer> o00oOoO0(@NotNull WindowManager windowManager) {
        o0OOOOO0.o0ooO.o00oo0O(windowManager, "$this$getWidthAndHeight");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new o0O0o00<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final <R extends View> R o00oOoOO(@NotNull ViewGroup viewGroup, @NotNull Context context, @o00oOooO.oooOO0 int i) {
        o0OOOOO0.o0ooO.o00oo0O(viewGroup, "$this$inflate");
        o0OOOOO0.o0ooO.o00oo0O(context, "ctxt");
        R r = (R) LayoutInflater.from(context).inflate(i, viewGroup, false);
        if (r != null) {
            return r;
        }
        throw new o0OOO0("null cannot be cast to non-null type R");
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final boolean o00oOoo0(int i, double d) {
        if (i == 0) {
            return false;
        }
        return ((double) 1) - (((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / ((double) 255)) >= d;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void o00oo0(@Nullable TextView textView, @NotNull Context context, @o0O000Oo @Nullable Integer num, @o0O000Oo @Nullable Integer num2) {
        int o00oo0O2;
        int o00oo0O3;
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        if (textView != null) {
            if (num == null && num2 == null) {
                return;
            }
            if (num != null && (o00oo0O3 = o00oo0O(this, context, null, num, null, 10, null)) != 0) {
                textView.setTextColor(o00oo0O3);
            }
            if (num2 == null || (o00oo0O2 = o00oo0O(this, context, null, num2, null, 10, null)) == 0) {
                return;
            }
            textView.setHintTextColor(o00oo0O2);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final boolean o00oo00O(@NotNull Context context) {
        o0OOOOO0.o0ooO.o00oo0O(context, "$this$isLandscape");
        Resources resources = context.getResources();
        o0OOOOO0.o0ooO.o00oOoO(resources, "resources");
        return resources.getConfiguration().orientation == 2;
    }

    @o0O00O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final int o00oo0O0(@NotNull Context context, @o0O00OOO @Nullable Integer num, @o0O000Oo @Nullable Integer num2, @Nullable o0OOOO.o00oOOo0<Integer> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        if (num2 == null) {
            return o0.getColor(context, num != null ? num.intValue() : 0);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            return (color != 0 || o00oooo02 == null) ? color : o00oooo02.invoke().intValue();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final int[] o00oo0Oo(@NotNull Context context, @NotNull int[] iArr, @Nullable o00oo<? super Integer, Integer> o00ooVar) {
        Integer invoke;
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        o0OOOOO0.o0ooO.o00oo0O(iArr, "attrs");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(iArr);
        try {
            o0O0O0Oo oOO0000O = o0O000O.oOO0000O(iArr);
            ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(oOO0000O, 10));
            Iterator<Integer> it = oOO0000O.iterator();
            while (it.hasNext()) {
                int nextInt = ((o0O0o0) it).nextInt();
                int i = 0;
                int color = obtainStyledAttributes.getColor(nextInt, 0);
                if (color != 0) {
                    i = color;
                } else if (o00ooVar != null && (invoke = o00ooVar.invoke(Integer.valueOf(iArr[nextInt]))) != null) {
                    i = invoke.intValue();
                }
                arrayList.add(Integer.valueOf(i));
            }
            return o0O0oo0o.o0o00o0O(arrayList);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final float o00oo0o(@NotNull Context context, @o0O000Oo int i, @Nullable o0OOOO.o00oOOo0<Float> o00oooo02) {
        float floatValue;
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        if (o00oooo02 != null) {
            try {
                Float invoke = o00oooo02.invoke();
                if (invoke != null) {
                    floatValue = invoke.floatValue();
                    float dimension = obtainStyledAttributes.getDimension(0, floatValue);
                    obtainStyledAttributes.recycle();
                    return dimension;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        floatValue = 0.0f;
        float dimension2 = obtainStyledAttributes.getDimension(0, floatValue);
        obtainStyledAttributes.recycle();
        return dimension2;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @Nullable
    public final CharSequence o00ooO(@NotNull Context context, @o0OOO0O @Nullable Integer num, @o0OOO0O @Nullable Integer num2, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
        if (intValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(intValue);
        o0OOOOO0.o0ooO.o00oOoO(text, "context.resources.getText(resourceId)");
        return z ? Html.fromHtml(text.toString()) : text;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final float o00ooO00(@NotNull Context context, @o0O000Oo int i, float f) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getFloat(0, f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final int o00ooO0O(@NotNull Context context, @o0O000Oo int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getInt(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @Nullable
    public final CharSequence o00ooOO0(@NotNull o0OO00OO o0oo00oo, @o0OOO0O @Nullable Integer num, @o0OOO0O @Nullable Integer num2, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "materialDialog");
        return o00ooO(o0oo00oo.f12800o00ooOo, num, num2, z);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final <T extends View> void o00ooOo(@Nullable T t, int i, int i2, int i3, int i4) {
        if ((t != null && i == t.getPaddingLeft() && i2 == t.getPaddingTop() && i3 == t.getPaddingRight() && i4 == t.getPaddingBottom()) || t == null) {
            return;
        }
        t.setPadding(i, i2, i3, i4);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final void o00ooOo0(@NotNull EditText editText, @NotNull o00oo<? super CharSequence, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O(editText, "$this$textChanged");
        o0OOOOO0.o0ooO.o00oo0O(o00ooVar, "callback");
        editText.addTextChangedListener(new o00oOOo0(o00ooVar));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final <T extends View> void o00ooOoo(@NotNull T t, @NotNull o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$waitForHeight");
        o0OOOOO0.o0ooO.o00oo0O(o00ooVar, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new o00oOOoO(t, o00ooVar));
        } else {
            o00ooVar.invoke(t);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final <T extends View> void o00ooo00(@NotNull T t, @NotNull o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$waitForWidth");
        o0OOOOO0.o0ooO.o00oo0O(o00ooVar, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new o00oOo00(t, o00ooVar));
        } else {
            o00ooVar.invoke(t);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @Nullable
    public final Drawable o0O0o(@NotNull Context context, @o0O0O0o0 @Nullable Integer num, @o0O000Oo @Nullable Integer num2, @Nullable Drawable drawable) {
        o0OOOOO0.o0ooO.o00oo0O(context, "context");
        if (num2 == null) {
            return num == null ? drawable : o0.getDrawable(context, num.intValue());
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
