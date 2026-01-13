package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import o00oOooO.o0OO0oO;
import o00oooo0.o0O0O0Oo;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o00oo {
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final CheckedTextView f1080o00oOOo0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f1084o00oOo0o;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ColorStateList f1081o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public PorterDuff.Mode f1082o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f1085o00oOooO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f1083o00oOo0O = false;

    public o00oo(@o00oOooO.oo0oO0 CheckedTextView checkedTextView) {
        this.f1080o00oOOo0 = checkedTextView;
    }

    public void o00oOOo0() {
        Drawable checkMarkDrawable = this.f1080o00oOOo0.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1085o00oOooO || this.f1083o00oOo0O) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1085o00oOooO) {
                    o0O0O0Oo.o00oOOoO.o00oOoO(mutate, this.f1081o00oOOoO);
                }
                if (this.f1083o00oOo0O) {
                    o0O0O0Oo.o00oOOoO.o00oOoOO(mutate, this.f1082o00oOo00);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1080o00oOOo0.getDrawableState());
                }
                this.f1080o00oOOo0.setCheckMarkDrawable(mutate);
            }
        }
    }

    public ColorStateList o00oOOoO() {
        return this.f1081o00oOOoO;
    }

    public PorterDuff.Mode o00oOo00() {
        return this.f1082o00oOo00;
    }

    public void o00oOo0O() {
        if (this.f1084o00oOo0o) {
            this.f1084o00oOo0o = false;
            return;
        }
        this.f1084o00oOo0o = true;
        o00oOOo0();
    }

    public void o00oOo0o(ColorStateList colorStateList) {
        this.f1081o00oOOoO = colorStateList;
        this.f1085o00oOooO = true;
        o00oOOo0();
    }

    public void o00oOoO0(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.f1082o00oOo00 = mode;
        this.f1083o00oOo0O = true;
        o00oOOo0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOooO(@o00oOooO.o0OO00OO android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1080o00oOOo0
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CheckedTextView
            r8 = 0
            androidx.appcompat.widget.o0OOO0 r0 = androidx.appcompat.widget.o0OOO0.o00ooOo(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1080o00oOOo0
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.o00ooO()
            r7 = 0
            r4 = r10
            r6 = r11
            o0O000oo.o0O0o00O.o0O0oOo0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.o00ooOO0(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.o00oo0oO(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CheckedTextView r11 = r9.f1080o00oOOo0     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = o00oOo0o.o00oOo00.o00oOOoO(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = r8
        L3b:
            if (r10 != 0) goto L58
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.o00ooOO0(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.o00oo0oO(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CheckedTextView r11 = r9.f1080o00oOOo0     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = o00oOo0o.o00oOo00.o00oOOoO(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.o00ooOO0(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CheckedTextView r11 = r9.f1080o00oOOo0     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.o00oOooO(r10)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkTintList(r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.o00ooOO0(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CheckedTextView r11 = r9.f1080o00oOOo0     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.o00oo0OO(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.o0O0OOOo.o00oOo0O(r10, r1)     // Catch: java.lang.Throwable -> L84
            r11.setCheckMarkTintMode(r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.o00ooOoo()
            return
        L84:
            r10 = move-exception
            r0.o00ooOoo()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o00oo.o00oOooO(android.util.AttributeSet, int):void");
    }
}
