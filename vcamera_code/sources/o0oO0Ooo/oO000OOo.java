package o0oO0Ooo;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.o00oo00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oO000OOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOoO f16950o00oOOo0;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final TextView f16951o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final oO0OoOO0 f16952o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f16953o00oOo00 = true;

        public o00oOOo0(TextView textView) {
            this.f16951o00oOOo0 = textView;
            this.f16952o00oOOoO = new oO0OoOO0(textView);
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        @oo0oO0
        public InputFilter[] o00oOOo0(@oo0oO0 InputFilter[] inputFilterArr) {
            return !this.f16953o00oOo00 ? o00oOoOO(inputFilterArr) : o00oOoO0(inputFilterArr);
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public boolean o00oOOoO() {
            return this.f16953o00oOo00;
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOo00(boolean z) {
            if (z) {
                o00oOo0O();
            }
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOo0O() {
            this.f16951o00oOOo0.setTransformationMethod(o00oOo0o(this.f16951o00oOOo0.getTransformationMethod()));
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        @o0OO00OO
        public TransformationMethod o00oOo0o(@o0OO00OO TransformationMethod transformationMethod) {
            return this.f16953o00oOo00 ? o00oo00O(transformationMethod) : o00oOoo0(transformationMethod);
        }

        public final SparseArray<InputFilter> o00oOoO(@oo0oO0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof oO0OoOO0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @oo0oO0
        public final InputFilter[] o00oOoO0(@oo0oO0 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f16952o00oOOoO) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f16952o00oOOoO;
            return inputFilterArr2;
        }

        @oo0oO0
        public final InputFilter[] o00oOoOO(@oo0oO0 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> o00oOoO2 = o00oOoO(inputFilterArr);
            if (o00oOoO2.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - o00oOoO2.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (o00oOoO2.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public void o00oOoOo(boolean z) {
            this.f16953o00oOo00 = z;
        }

        @o0OO00OO
        public final TransformationMethod o00oOoo0(@o0OO00OO TransformationMethod transformationMethod) {
            return transformationMethod instanceof oO0OOo0o ? ((oO0OOo0o) transformationMethod).o00oOOo0() : transformationMethod;
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOooO(boolean z) {
            this.f16953o00oOo00 = z;
            o00oOo0O();
            o00oOooo();
        }

        public final void o00oOooo() {
            this.f16951o00oOOo0.setFilters(o00oOOo0(this.f16951o00oOOo0.getFilters()));
        }

        @oo0oO0
        public final TransformationMethod o00oo00O(@o0OO00OO TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof oO0OOo0o) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new oO0OOo0o(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @oo0oO0
        public InputFilter[] o00oOOo0(@oo0oO0 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean o00oOOoO() {
            return false;
        }

        public void o00oOo00(boolean z) {
        }

        public void o00oOo0O() {
        }

        @o0OO00OO
        public TransformationMethod o00oOo0o(@o0OO00OO TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        public void o00oOooO(boolean z) {
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOOo0 f16954o00oOOo0;

        public o00oOo00(TextView textView) {
            this.f16954o00oOOo0 = new o00oOOo0(textView);
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        @oo0oO0
        public InputFilter[] o00oOOo0(@oo0oO0 InputFilter[] inputFilterArr) {
            return o00oOoO0() ? inputFilterArr : this.f16954o00oOOo0.o00oOOo0(inputFilterArr);
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public boolean o00oOOoO() {
            return this.f16954o00oOOo0.o00oOOoO();
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOo00(boolean z) {
            if (o00oOoO0()) {
                return;
            }
            this.f16954o00oOOo0.o00oOo00(z);
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOo0O() {
            if (o00oOoO0()) {
                return;
            }
            this.f16954o00oOOo0.o00oOo0O();
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        @o0OO00OO
        public TransformationMethod o00oOo0o(@o0OO00OO TransformationMethod transformationMethod) {
            return o00oOoO0() ? transformationMethod : this.f16954o00oOOo0.o00oOo0o(transformationMethod);
        }

        public final boolean o00oOoO0() {
            return !o00oo00O.o00oo0();
        }

        @Override // o0oO0Ooo.oO000OOo.o00oOOoO
        public void o00oOooO(boolean z) {
            if (o00oOoO0()) {
                this.f16954o00oOOo0.o00oOoOo(z);
            } else {
                this.f16954o00oOOo0.o00oOooO(z);
            }
        }
    }

    public oO000OOo(@oo0oO0 TextView textView) {
        this(textView, true);
    }

    public oO000OOo(@oo0oO0 TextView textView, boolean z) {
        o0ooOoOO.ooOOOOoo.o00oo00O(textView, "textView cannot be null");
        this.f16950o00oOOo0 = !z ? new o00oOo00(textView) : new o00oOOo0(textView);
    }

    @oo0oO0
    public InputFilter[] o00oOOo0(@oo0oO0 InputFilter[] inputFilterArr) {
        return this.f16950o00oOOo0.o00oOOo0(inputFilterArr);
    }

    public boolean o00oOOoO() {
        return this.f16950o00oOOo0.o00oOOoO();
    }

    public void o00oOo00(boolean z) {
        this.f16950o00oOOo0.o00oOo00(z);
    }

    public void o00oOo0O() {
        this.f16950o00oOOo0.o00oOo0O();
    }

    @o0OO00OO
    public TransformationMethod o00oOo0o(@o0OO00OO TransformationMethod transformationMethod) {
        return this.f16950o00oOOo0.o00oOo0o(transformationMethod);
    }

    public void o00oOooO(boolean z) {
        this.f16950o00oOOo0.o00oOooO(z);
    }
}
