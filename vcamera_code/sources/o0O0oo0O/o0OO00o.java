package o0O0oo0O;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0OO0o.o0O0o00;
import o0OO0o.o0OOO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0002H\u0016¨\u0006#"}, d2 = {"Lo0O0oo0O/o0OO00o;", "Lo0O0oo0O/oo0oO0;", "", "isDark", "", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroid/content/Context;", "creatingContext", "Landroid/view/Window;", "dialogWindow", "Landroid/view/LayoutInflater;", "layoutInflater", "Lo0O0oo0O/o0OO00OO;", "dialog", "Landroid/view/ViewGroup;", "o00oOOo0", "root", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "o00oOo00", "context", "window", "view", "maxWidth", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V", TtmlNode.ATTR_TTS_COLOR, "", "cornerRadius", "o00oOooO", "o00oOoO0", "o00oOo0o", "onDismiss", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0OO00o implements oo0oO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OO00o f12804o00oOOo0 = new o0OO00o();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ DialogActionButton f12805o00oo0O0;

        public o00oOOo0(DialogActionButton dialogActionButton) {
            this.f12805o00oo0O0 = dialogActionButton;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12805o00oo0O0.requestFocus();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ DialogActionButton f12806o00oo0O0;

        public o00oOOoO(DialogActionButton dialogActionButton) {
            this.f12806o00oo0O0 = dialogActionButton;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12806o00oo0O0.requestFocus();
        }
    }

    @Override // o0O0oo0O.oo0oO0
    @SuppressLint({"InflateParams"})
    @NotNull
    public ViewGroup o00oOOo0(@NotNull Context context, @NotNull Window window, @NotNull LayoutInflater layoutInflater, @NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(context, "creatingContext");
        o0ooO.o00oo0O(window, "dialogWindow");
        o0ooO.o00oo0O(layoutInflater, "layoutInflater");
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        View inflate = layoutInflater.inflate(R.layout.md_dialog_base, (ViewGroup) null, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new o0OOO0("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // o0O0oo0O.oo0oO0
    public int o00oOOoO(boolean z) {
        return z ? R.style.MD_Dark : R.style.MD_Light;
    }

    @Override // o0O0oo0O.oo0oO0
    @NotNull
    public DialogLayout o00oOo00(@NotNull ViewGroup viewGroup) {
        o0ooO.o00oo0O(viewGroup, "root");
        return (DialogLayout) viewGroup;
    }

    @Override // o0O0oo0O.oo0oO0
    public void o00oOo0O(@NotNull Context context, @NotNull Window window, @NotNull DialogLayout dialogLayout, @Nullable Integer num) {
        o0ooO.o00oo0O(context, "context");
        o0ooO.o00oo0O(window, "window");
        o0ooO.o00oo0O(dialogLayout, "view");
        if (num != null && num.intValue() == 0) {
            return;
        }
        window.setSoftInputMode(16);
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null) {
            Resources resources = context.getResources();
            o0O0o00<Integer, Integer> o00oOoO02 = o0OooO0.f12732o00oOOo0.o00oOoO0(windowManager);
            int intValue = o00oOoO02.component1().intValue();
            dialogLayout.setMaxHeight(o00oOoO02.component2().intValue() - (resources.getDimensionPixelSize(R.dimen.md_dialog_vertical_margin) * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = Math.min(num != null ? num.intValue() : resources.getDimensionPixelSize(R.dimen.md_dialog_max_width), intValue - (resources.getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin) * 2));
            window.setAttributes(layoutParams);
        }
    }

    @Override // o0O0oo0O.oo0oO0
    public void o00oOo0o(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
        DialogActionButton o00oOOo02 = oooOO0.o00oOOo0.o00oOOo0(o0oo00oo, o0OO0O0.NEGATIVE);
        if (oo0OOoo.o00oOoO0(o00oOOo02)) {
            o00oOOo02.post(new o00oOOo0(o00oOOo02));
            return;
        }
        DialogActionButton o00oOOo03 = oooOO0.o00oOOo0.o00oOOo0(o0oo00oo, o0OO0O0.POSITIVE);
        if (oo0OOoo.o00oOoO0(o00oOOo03)) {
            o00oOOo03.post(new o00oOOoO(o00oOOo03));
        }
    }

    @Override // o0O0oo0O.oo0oO0
    public void o00oOoO0(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "dialog");
    }

    @Override // o0O0oo0O.oo0oO0
    public void o00oOooO(@NotNull DialogLayout dialogLayout, @o0O00O int i, float f) {
        o0ooO.o00oo0O(dialogLayout, "view");
        dialogLayout.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        dialogLayout.setBackground(gradientDrawable);
    }

    @Override // o0O0oo0O.oo0oO0
    public boolean onDismiss() {
        return false;
    }
}
