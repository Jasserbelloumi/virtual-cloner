package o0O0oOo;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import kotlin.Metadata;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o0O0oO0.o0O000O;
import o0O0oO0O.o0O;
import o0O0oO0o.o0OO000;
import o0O0oo0O.o0OO00OO;
import o0OO000o.o00oOOoO;
import o0OO0o.o0OOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0000H\u0000\u001a1\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0018\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0000H\u0000¨\u0006\u001b"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "showTop", "showBottom", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "o00oOo0o", "Landroid/widget/ImageView;", "imageView", "", "iconRes", "Landroid/graphics/drawable/Drawable;", "icon", "o00oOo00", "(Lo0O0oo0O/o0OO00OO;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)V", "Landroid/widget/TextView;", "textView", "textRes", "", "text", "fallback", "Landroid/graphics/Typeface;", "typeface", "textColor", "o00oOooO", "(Lo0O0oo0O/o0OO00OO;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;)V", "o00oOOo0", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O0OO {
    public static final void o00oOOo0(@NotNull o0OO00OO o0oo00oo) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$hideKeyboard");
        Object systemService = o0oo00oo.f12800o00ooOo.getSystemService("input_method");
        if (systemService == null) {
            throw new o0OOO0("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = o0oo00oo.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : o0oo00oo.f12793o00ooO0.getWindowToken(), 0);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static final void o00oOOoO(@NotNull o0OO00OO o0oo00oo, boolean z, boolean z2) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$invalidateDividers");
        o0oo00oo.f12793o00ooO0.o00oOoO0(z, z2);
    }

    public static final void o00oOo00(@NotNull o0OO00OO o0oo00oo, @NotNull ImageView imageView, @o0O0O0o0 @Nullable Integer num, @Nullable Drawable drawable) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$populateIcon");
        o0OOOOO0.o0ooO.o00oo0O(imageView, "imageView");
        Drawable o00oo2 = o0OooO0.o00oo(o0OooO0.f12732o00oOOo0, o0oo00oo.f12800o00ooOo, num, null, drawable, 4, null);
        if (o00oo2 == null) {
            imageView.setVisibility(8);
            return;
        }
        ViewParent parent = imageView.getParent();
        if (parent == null) {
            throw new o0OOO0("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).setVisibility(0);
        imageView.setVisibility(0);
        imageView.setImageDrawable(o00oo2);
    }

    public static final void o00oOo0o(@NotNull o0OO00OO o0oo00oo) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$preShow");
        Object obj = o0oo00oo.f12787o00oo0O0.get(o0OO000.f12701o00oOOo0);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean o00oOoO02 = o0OOOOO0.o0ooO.o00oOoO0((Boolean) obj, Boolean.TRUE);
        o0O000O.o00oOOo0(o0oo00oo.f12795o00ooO0O, o0oo00oo);
        DialogLayout dialogLayout = o0oo00oo.f12793o00ooO0;
        if (dialogLayout.getTitleLayout().o00oOOoO() && !o00oOoO02) {
            dialogLayout.getContentLayout().o00oOo0O(dialogLayout.getFrameMarginVertical$core(), dialogLayout.getFrameMarginVertical$core());
        }
        if (oo0OOoo.o00oOoO0(o0O.o00oOo00(o0oo00oo))) {
            DialogContentLayout.o00oOo0o(dialogLayout.getContentLayout(), 0, 0, 1, null);
        } else if (dialogLayout.getContentLayout().o00oOooO()) {
            DialogContentLayout.o00oOoO(dialogLayout.getContentLayout(), 0, dialogLayout.getFrameMarginVerticalLess$core(), 1, null);
        }
    }

    public static final void o00oOooO(@NotNull o0OO00OO o0oo00oo, @NotNull TextView textView, @o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @o0OOO0O int i, @Nullable Typeface typeface, @Nullable Integer num2) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$populateText");
        o0OOOOO0.o0ooO.o00oo0O(textView, "textView");
        if (charSequence == null) {
            charSequence = o0OooO0.o00ooOOo(o0OooO0.f12732o00oOOo0, o0oo00oo, num, Integer.valueOf(i), false, 8, null);
        }
        if (charSequence == null) {
            textView.setVisibility(8);
            return;
        }
        ViewParent parent = textView.getParent();
        if (parent == null) {
            throw new o0OOO0("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).setVisibility(0);
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        o0OooO0.o00oo0OO(o0OooO0.f12732o00oOOo0, textView, o0oo00oo.f12800o00ooOo, num2, null, 4, null);
    }
}
