package o0O000oo;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public class o00ooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final View f10486o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOo0 f10487o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f10488o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f10489o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final View.OnLongClickListener f10490o00oOo0o = new View.OnLongClickListener() { // from class: o0O000oo.o0O0o
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return o00ooO0.this.o00oOooO(view);
        }
    };

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final View.OnTouchListener f10491o00oOoO0 = new View.OnTouchListener() { // from class: o0O000oo.o00oo
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return o00ooO0.this.o00oOo0O(view, motionEvent);
        }
    };

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f10492o00oOooO;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00ooO0 o00ooo02);
    }

    public o00ooO0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
        this.f10486o00oOOo0 = view;
        this.f10487o00oOOoO = o00oooo02;
    }

    public void o00oOOo0() {
        this.f10486o00oOOo0.setOnLongClickListener(this.f10490o00oOo0o);
        this.f10486o00oOOo0.setOnTouchListener(this.f10491o00oOoO0);
    }

    public void o00oOOoO() {
        this.f10486o00oOOo0.setOnLongClickListener(null);
        this.f10486o00oOOo0.setOnTouchListener(null);
    }

    public void o00oOo00(@o00oOooO.oo0oO0 Point point) {
        point.set(this.f10488o00oOo00, this.f10492o00oOooO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00oOo0O(@o00oOooO.oo0oO0 android.view.View r7, @o00oOooO.oo0oO0 android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = o0O000oo.o0O00OOO.o00oOooo(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f10489o00oOo0O
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f10488o00oOo00
            if (r8 != r0) goto L39
            int r8 = r6.f10492o00oOooO
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f10488o00oOo00 = r0
            r6.f10492o00oOooO = r1
            o0O000oo.o00ooO0$o00oOOo0 r8 = r6.f10487o00oOOoO
            boolean r7 = r8.o00oOOo0(r7, r6)
            r6.f10489o00oOo0O = r7
            return r7
        L46:
            r6.f10489o00oOo0O = r3
            goto L4d
        L49:
            r6.f10488o00oOo00 = r0
            r6.f10492o00oOooO = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O000oo.o00ooO0.o00oOo0O(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean o00oOooO(@o00oOooO.oo0oO0 View view) {
        return this.f10487o00oOOoO.o00oOOo0(view, this);
    }
}
