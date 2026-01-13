package o0O0oO0O;

import android.graphics.Typeface;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.o00oOo0O;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OoO00O;
import o0O0oOo.o0O0OO0;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001aD\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0002`\f*&\u0010\u000f\"\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¨\u0006\u0010"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "Landroid/widget/CheckBox;", "o00oOo00", "", "o00oOooO", "", "res", "", "text", "isCheckedDefault", "Lkotlin/Function1;", "Lo0OO0o/oO0Ooooo;", "Lcom/afollestad/materialdialogs/checkbox/BooleanCallback;", "onToggle", "o00oOOo0", "BooleanCallback", "core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O {

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "L;", "checked", "Lo0OO0o/oO0Ooooo;", "onCheckedChanged", "(Landroid/widget/CompoundButton;L;)V", "kotlin/Boolean", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OO00OO f12696o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ String f12697o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ int f12698o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo f12699o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ boolean f12700o00oOooO;

        public o00oOOo0(o0OO00OO o0oo00oo, String str, int i, boolean z, o00oo o00ooVar) {
            this.f12696o00oOOo0 = o0oo00oo;
            this.f12697o00oOOoO = str;
            this.f12698o00oOo00 = i;
            this.f12700o00oOooO = z;
            this.f12699o00oOo0O = o00ooVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            o00oo o00ooVar = this.f12699o00oOo0O;
            if (o00ooVar != null) {
                oO0Ooooo oo0ooooo = (oO0Ooooo) o00ooVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    @NotNull
    public static final o0OO00OO o00oOOo0(@NotNull o0OO00OO o0oo00oo, @o0OOO0O int i, @Nullable String str, boolean z, @Nullable o00oo<? super Boolean, oO0Ooooo> o00ooVar) {
        AppCompatCheckBox checkBoxPrompt;
        o0ooO.o00oo0O(o0oo00oo, "$this$checkBoxPrompt");
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0oooo0.o00oOOoO("checkBoxPrompt", str, Integer.valueOf(i));
        DialogActionButtonLayout buttonsLayout = o0oo00oo.f12793o00ooO0.getButtonsLayout();
        if (buttonsLayout != null && (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) != null) {
            checkBoxPrompt.setVisibility(0);
            checkBoxPrompt.setText(str != null ? str : o0OooO0.o00ooOOo(o0oooo0, o0oo00oo, Integer.valueOf(i), null, false, 12, null));
            checkBoxPrompt.setChecked(z);
            checkBoxPrompt.setOnCheckedChangeListener(new o00oOOo0(o0oo00oo, str, i, z, o00ooVar));
            o0OooO0.o00oo0OO(o0oooo0, checkBoxPrompt, o0oo00oo.f12800o00ooOo, Integer.valueOf(R.attr.md_color_content), null, 4, null);
            Typeface typeface = o0oo00oo.f12790o00oo0o0;
            if (typeface != null) {
                checkBoxPrompt.setTypeface(typeface);
            }
            int[] o00oOo0O2 = o0O0OO0.o00oOo0O(o0oo00oo, new int[]{R.attr.md_color_widget, R.attr.md_color_widget_unchecked}, null, 2, null);
            o00oOo0O.o00oOOo0.o00oOo00(checkBoxPrompt, o0oooo0.o00oOo00(o0oo00oo.f12800o00ooOo, o00oOo0O2[1], o00oOo0O2[0]));
        }
        return o0oo00oo;
    }

    public static /* synthetic */ o0OO00OO o00oOOoO(o0OO00OO o0oo00oo, int i, String str, boolean z, o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o00oOOo0(o0oo00oo, i, str, z, o00ooVar);
    }

    @o0OoO00O
    @NotNull
    public static final CheckBox o00oOo00(@NotNull o0OO00OO o0oo00oo) {
        AppCompatCheckBox checkBoxPrompt;
        o0ooO.o00oo0O(o0oo00oo, "$this$getCheckBoxPrompt");
        DialogActionButtonLayout buttonsLayout = o0oo00oo.f12793o00ooO0.getButtonsLayout();
        if (buttonsLayout == null || (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return checkBoxPrompt;
    }

    @o0OoO00O
    public static final boolean o00oOooO(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "$this$isCheckPromptChecked");
        return o00oOo00(o0oo00oo).isChecked();
    }
}
