package o0oO0Ooo;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO0Ooooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f16962o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f16963o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f16964o00oOo00;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final EditText f16965o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ooOOOOoo f16966o00oOOoO;

        public o00oOOo0(@oo0oO0 EditText editText, boolean z) {
            this.f16965o00oOOo0 = editText;
            ooOOOOoo oooooooo = new ooOOOOoo(editText, z);
            this.f16966o00oOOoO = oooooooo;
            editText.addTextChangedListener(oooooooo);
            editText.setEditableFactory(oO0o0o.getInstance());
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public KeyListener o00oOOo0(@o0OO00OO KeyListener keyListener) {
            if (keyListener instanceof oO0Oo0oo) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new oO0Oo0oo(keyListener);
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public boolean o00oOOoO() {
            return this.f16966o00oOOoO.f16975o00oo0oO;
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public InputConnection o00oOo00(@oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo) {
            return inputConnection instanceof oO000O ? inputConnection : new oO000O(this.f16965o00oOOo0, inputConnection, editorInfo);
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public void o00oOo0O(boolean z) {
            this.f16966o00oOOoO.o00oOoO0(z);
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public void o00oOo0o(int i) {
            this.f16966o00oOOoO.f16974o00oo0o0 = i;
        }

        @Override // o0oO0Ooo.oO0Ooooo.o00oOOoO
        public void o00oOooO(int i) {
            this.f16966o00oOOoO.f16973o00oo0o = i;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0OO00OO
        public KeyListener o00oOOo0(@o0OO00OO KeyListener keyListener) {
            return keyListener;
        }

        public boolean o00oOOoO() {
            return false;
        }

        public InputConnection o00oOo00(@oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo) {
            return inputConnection;
        }

        public void o00oOo0O(boolean z) {
        }

        public void o00oOo0o(int i) {
        }

        public void o00oOooO(int i) {
        }
    }

    public oO0Ooooo(@oo0oO0 EditText editText) {
        this(editText, true);
    }

    public oO0Ooooo(@oo0oO0 EditText editText, boolean z) {
        this.f16963o00oOOoO = Integer.MAX_VALUE;
        this.f16964o00oOo00 = 0;
        o0ooOoOO.ooOOOOoo.o00oo00O(editText, "editText cannot be null");
        this.f16962o00oOOo0 = new o00oOOo0(editText, z);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public int o00oOOo0() {
        return this.f16964o00oOo00;
    }

    @o0OO00OO
    public KeyListener o00oOOoO(@o0OO00OO KeyListener keyListener) {
        return this.f16962o00oOOo0.o00oOOo0(keyListener);
    }

    public int o00oOo00() {
        return this.f16963o00oOOoO;
    }

    @o0OO00OO
    public InputConnection o00oOo0O(@o0OO00OO InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f16962o00oOOo0.o00oOo00(inputConnection, editorInfo);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public void o00oOo0o(int i) {
        this.f16964o00oOo00 = i;
        this.f16962o00oOOo0.o00oOooO(i);
    }

    public void o00oOoO(@o0O0o00O(from = 0) int i) {
        o0ooOoOO.ooOOOOoo.o00oOoOo(i, "maxEmojiCount should be greater than 0");
        this.f16963o00oOOoO = i;
        this.f16962o00oOOo0.o00oOo0o(i);
    }

    public void o00oOoO0(boolean z) {
        this.f16962o00oOOo0.o00oOo0O(z);
    }

    public boolean o00oOooO() {
        return this.f16962o00oOOo0.o00oOOoO();
    }
}
