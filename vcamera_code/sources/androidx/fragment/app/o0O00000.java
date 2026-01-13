package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00000 implements LayoutInflater.Factory2 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f3040o00oo0O = "FragmentManager";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final FragmentManager f3041o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f3043o00oo0O0;

        public o00oOOo0(o0O00oO0 o0o00oo0) {
            this.f3043o00oo0O0 = o0o00oo0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment o00oOoo02 = this.f3043o00oo0O0.o00oOoo0();
            this.f3043o00oo0O0.o00oo00O();
            o0OooO0.o00oo0((ViewGroup) o00oOoo02.mView.getParent(), o0O00000.this.f3041o00oo0O0).o00oOoOo();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public o0O00000(FragmentManager fragmentManager) {
        this.f3041o00oo0O0 = fragmentManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
        if (androidx.fragment.app.FragmentManager.oo0OOoo(2) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
        if (androidx.fragment.app.FragmentManager.oo0OOoo(2) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
        r0.toString();
        java.lang.Integer.toHexString(r2);
     */
    @Override // android.view.LayoutInflater.Factory2
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(@o00oOooO.o0OO00OO android.view.View r7, @o00oOooO.oo0oO0 java.lang.String r8, @o00oOooO.oo0oO0 android.content.Context r9, @o00oOooO.oo0oO0 android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0O00000.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    @o0OO00OO
    public View onCreateView(@oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
