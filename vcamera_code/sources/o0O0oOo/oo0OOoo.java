package o0O0oOo;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o00oOooO.oooOO0;
import o0O0oo0O.o0OO00OO;
import o0OO000o.o00oOOoO;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0000*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u000b\"\b\b\u0000\u0010\u0000*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0000*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\r\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0010H\u0000¨\u0006\u0014"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0O0oo0O/o0OO00OO;", "", "res", "Landroid/view/ViewGroup;", "root", o00oOOoO.f12961o00oOo00, "(Lo0O0oo0O/o0OO00OO;ILandroid/view/ViewGroup;)Ljava/lang/Object;", "o00oOOo0", "(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;)Ljava/lang/Object;", "Landroid/view/View;", "", "o00oOoO0", "(Landroid/view/View;)Z", "o00oOo0O", "o00oOo0o", "Landroid/widget/TextView;", "Lo0OO0o/oO0Ooooo;", "o00oOoOO", "o00oOoO", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class oo0OOoo {
    public static final <T> T o00oOOo0(@NotNull ViewGroup viewGroup, @oooOO0 int i, @Nullable ViewGroup viewGroup2) {
        o0OOOOO0.o0ooO.o00oo0O(viewGroup, "$this$inflate");
        return (T) LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, false);
    }

    public static final <T> T o00oOOoO(@NotNull o0OO00OO o0oo00oo, @oooOO0 int i, @Nullable ViewGroup viewGroup) {
        o0OOOOO0.o0ooO.o00oo0O(o0oo00oo, "$this$inflate");
        return (T) LayoutInflater.from(o0oo00oo.f12800o00ooOo).inflate(i, viewGroup, false);
    }

    public static /* synthetic */ Object o00oOo00(ViewGroup viewGroup, int i, ViewGroup viewGroup2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            viewGroup2 = viewGroup;
        }
        return o00oOOo0(viewGroup, i, viewGroup2);
    }

    public static final <T extends View> boolean o00oOo0O(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$isNotVisible");
        return !o00oOoO0(t);
    }

    public static final <T extends View> boolean o00oOo0o(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$isRtl");
        Resources resources = t.getResources();
        o0OOOOO0.o0ooO.o00oOoO(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        o0OOOOO0.o0ooO.o00oOoO(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    public static final void o00oOoO(@NotNull TextView textView) {
        o0OOOOO0.o0ooO.o00oo0O(textView, "$this$setGravityEndCompat");
        textView.setTextAlignment(6);
        textView.setGravity(8388629);
    }

    public static final <T extends View> boolean o00oOoO0(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O(t, "$this$isVisible");
        if (t instanceof Button) {
            Button button = (Button) t;
            if (button.getVisibility() != 0) {
                return false;
            }
            CharSequence text = button.getText();
            o0OOOOO0.o0ooO.o00oOoO(text, "this.text");
            if (!(!oO0O00o0.o0OoOoO(oO0O0.o0o00O(text)))) {
                return false;
            }
        } else if (t.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static final void o00oOoOO(@NotNull TextView textView) {
        o0OOOOO0.o0ooO.o00oo0O(textView, "$this$setGravityStartCompat");
        textView.setTextAlignment(5);
        textView.setGravity(8388627);
    }

    public static /* synthetic */ Object o00oOooO(o0OO00OO o0oo00oo, int i, ViewGroup viewGroup, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            viewGroup = null;
        }
        return o00oOOoO(o0oo00oo, i, viewGroup);
    }
}
