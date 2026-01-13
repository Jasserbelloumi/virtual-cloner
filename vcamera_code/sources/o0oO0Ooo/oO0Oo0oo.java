package o0oO0Ooo;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.o00oo00O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class oO0Oo0oo implements KeyListener {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final KeyListener f16956o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOo0 f16957o00oOOoO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public boolean o00oOOo0(@oo0oO0 Editable editable, int i, @oo0oO0 KeyEvent keyEvent) {
            return o00oo00O.o00oOoO(editable, i, keyEvent);
        }
    }

    public oO0Oo0oo(KeyListener keyListener) {
        this(keyListener, new o00oOOo0());
    }

    public oO0Oo0oo(KeyListener keyListener, o00oOOo0 o00oooo02) {
        this.f16956o00oOOo0 = keyListener;
        this.f16957o00oOOoO = o00oooo02;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f16956o00oOOo0.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f16956o00oOOo0.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f16957o00oOOoO.o00oOOo0(editable, i, keyEvent) || this.f16956o00oOOo0.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16956o00oOOo0.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f16956o00oOOo0.onKeyUp(view, editable, i, keyEvent);
    }
}
