package o0O0oO;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0O0oo0O.o0OO00OO;
import o0O0oo0O.o0OO0O0;
import o0OO0o.o0OOO0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a9\u0010\u000b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00028\u00002\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\tH\u0080\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "", "allowEmpty", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "o00oOo00", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lo0OO0o/o0O000Oo;", "exec", o0OO000o.o00oOOoO.f12961o00oOo00, "(Landroid/view/View;Lo0OOOO/o00oo;)Z", "input"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class oooOO0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO0o/oO0Ooooo;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo f12689o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f12690o00oo0O0;

        public o00oOOo0(View view, o00oo o00ooVar) {
            this.f12690o00oo0O0 = view;
            this.f12689o00oo0O = o00ooVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12689o00oo0O.invoke(this.f12690o00oo0O0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO0o/oO0Ooooo;", "run", "()V", "o0O0oO/oooOO0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OO00OO f12691o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f12692o00oo0O0;

        public o00oOOoO(View view, o0OO00OO o0oo00oo) {
            this.f12692o00oo0O0 = view;
            this.f12691o00oo0O = o0oo00oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditText editText = (EditText) this.f12692o00oo0O0;
            editText.requestFocus();
            Object systemService = this.f12691o00oo0O.f12800o00ooOo.getSystemService("input_method");
            if (systemService == null) {
                throw new o0OOO0("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }

    public static final void o00oOOo0(@NotNull o0OO00OO o0oo00oo, boolean z) {
        int counterMaxLength;
        o0ooO.o00oo0O(o0oo00oo, "$this$invalidateInputMaxLength");
        Editable text = o0oOo0O0.o00oOOo0(o0oo00oo).getText();
        int length = text != null ? text.length() : 0;
        if ((z || length != 0) && (counterMaxLength = o0oOo0O0.o00oOOoO(o0oo00oo).getCounterMaxLength()) > 0) {
            oooOO0.o00oOOo0.o00oOooO(o0oo00oo, o0OO0O0.POSITIVE, length <= counterMaxLength);
        }
    }

    public static final <T extends View> boolean o00oOOoO(@NotNull T t, @NotNull o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O(t, "$this$postRun");
        o0ooO.o00oo0O(o00ooVar, "exec");
        return t.post(new o00oOOo0(t, o00ooVar));
    }

    public static final void o00oOo00(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "$this$showKeyboardIfApplicable");
        EditText o00oOOo02 = o0oOo0O0.o00oOOo0(o0oo00oo);
        o00oOOo02.post(new o00oOOoO(o00oOOo02, o0oo00oo));
    }
}
