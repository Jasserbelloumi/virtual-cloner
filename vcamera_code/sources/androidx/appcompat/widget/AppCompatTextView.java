package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o00oOooO.o0OO0oO;
import o00oooOo.oOOO000;
import o0OoOoOO.o0OO00o;
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements o0O000oo.oo0OOoo, androidx.core.widget.o0OoO00O, androidx.core.widget.o00oOOoO, o0O0o000 {
    private final o00oo0 mBackgroundTintHelper;
    @o00oOooO.oo0oO0
    private o0O0000O mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    @o00oOooO.o0OO00OO
    private Future<o0OoOoOO.o0OO00o> mPrecomputedTextFuture;
    @o00oOooO.o0OO00OO
    private o00oOOo0 mSuperCaller;
    private final o0O0O0O mTextClassifierHelper;
    private final o0oO0O0o mTextHelper;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void o00oOOo0(@o00oOooO.o0OO0 int i);

        TextClassifier o00oOOoO();

        void o00oOo00(@o00oOooO.o0OO00OO TextClassifier textClassifier);

        void o00oOooO(@o00oOooO.o0OO0 int i);

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

        void setAutoSizeTextTypeWithDefaults(int i);
    }

    @o00oOooO.o0OOooO0(api = 26)
    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOOo0 {
        public o00oOOoO() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void o00oOOo0(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public TextClassifier o00oOOoO() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void o00oOo00(@o00oOooO.o0OO00OO TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void o00oOooO(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void setAutoSizeTextTypeWithDefaults(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    @o00oOooO.o0OOooO0(api = 28)
    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oOOoO {
        public o00oOo00() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOoO, androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void o00oOOo0(@o00oOooO.o0OO0 int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.o00oOOoO, androidx.appcompat.widget.AppCompatTextView.o00oOOo0
        public void o00oOooO(@o00oOooO.o0OO0 int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public AppCompatTextView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(o0OO0oO.o00oOOoO(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        o0OO0o.o00oOOo0(this, getContext());
        o00oo0 o00oo0Var = new o00oo0(this);
        this.mBackgroundTintHelper = o00oo0Var;
        o00oo0Var.o00oOo0O(attributeSet, i);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(this);
        this.mTextHelper = o0oo0o0o;
        o0oo0o0o.o00oo00O(attributeSet, i);
        o0oo0o0o.o00oOOoO();
        this.mTextClassifierHelper = new o0O0O0O(this);
        getEmojiTextViewHelper().o00oOo00(attributeSet, i);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<o0OoOoOO.o0OO00o> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.o0OoOoOo.o00ooOO(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @o00oOooO.oo0oO0
    private o0O0000O getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new o0O0000O(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOoO();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oOOoO();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (o.f1019o00oOo00) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOo0O();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (o.f1019o00oOo00) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOo0o();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (o.f1019o00oOo00) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOoO0();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (o.f1019o00oOo00) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        return o0oo0o0o != null ? o0oo0o0o.o00oOoO() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @SuppressLint({"WrongConstant"})
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (o.f1019o00oOo00) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            return o0oo0o0o.o00oOoOO();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OO00OO
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.o0OoOoOo.o00ooOo(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.o0OoOoOo.o00oOoOO(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.o0OoOoOo.o00oOoOo(this);
    }

    @o00oOooO.o0OOooO0(api = 26)
    @o00oOooO.o0OOo000
    public o00oOOo0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new o00oOo00();
        }
        return this.mSuperCaller;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOo00();
        }
        return null;
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            return o00oo0Var.o00oOooO();
        }
        return null;
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.o00oOoOo();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.o00oOoo0();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(api = 26)
    @o00oOooO.oo0oO0
    public TextClassifier getTextClassifier() {
        return getSuperCaller().o00oOOoO();
    }

    @o00oOooO.oo0oO0
    public o0OO00o.o00oOOo0 getTextMetricsParamsCompat() {
        return androidx.core.widget.o0OoOoOo.o00oo0OO(this);
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().o00oOOoO();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.o00oo0Oo(this, onCreateInputConnection, editorInfo);
        return o0O000.o00oOOo0(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0OO(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if ((o0oo0o0o == null || o.f1019o00oOo00 || !o0oo0o0o.o00oOooo()) ? false : true) {
            this.mTextHelper.o00oOo00();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().o00oOooO(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (o.f1019o00oOo00) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0o(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@o00oOooO.oo0oO0 int[] iArr, int i) throws IllegalArgumentException {
        if (o.f1019o00oOo00) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0oO(iArr, i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.o00oOOoO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o.f1019o00oOo00) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o0O0o(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOo0o(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@o00oOooO.o0O0O0o0 int i) {
        super.setBackgroundResource(i);
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoO0(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelative(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i) : null, i2 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i2) : null, i3 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i3) : null, i4 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i4) : null);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i) : null, i2 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i2) : null, i3 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i3) : null, i4 != 0 ? o00oOo0o.o00oOo00.o00oOOoO(context, i4) : null);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@o00oOooO.o0OO00OO Drawable drawable, @o00oOooO.o0OO00OO Drawable drawable2, @o00oOooO.o0OO00OO Drawable drawable3, @o00oOooO.o0OO00OO Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@o00oOooO.o0OO00OO ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.appcompat.widget.o0O0o000
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().o00oOo0O(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@o00oOooO.oo0oO0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().o00oOOo0(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@o00oOooO.o0OO0 @o00oOooO.o0O0o00O(from = 0) int i) {
        getSuperCaller().o00oOooO(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@o00oOooO.o0OO0 @o00oOooO.o0O0o00O(from = 0) int i) {
        getSuperCaller().o00oOOo0(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(@o00oOooO.o0OO0 @o00oOooO.o0O0o00O(from = 0) int i) {
        androidx.core.widget.o0OoOoOo.o00ooOO0(this, i);
    }

    public void setPrecomputedText(@o00oOooO.oo0oO0 o0OoOoOO.o0OO00o o0oo00o) {
        androidx.core.widget.o0OoOoOo.o00ooOO(this, o0oo00o);
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOO(colorStateList);
        }
    }

    @Override // o0O000oo.oo0OOoo
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00oo0 o00oo0Var = this.mBackgroundTintHelper;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOoOo(mode);
        }
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        this.mTextHelper.o00oo(colorStateList);
        this.mTextHelper.o00oOOoO();
    }

    @Override // androidx.core.widget.o0OoO00O
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        this.mTextHelper.o00ooO00(mode);
        this.mTextHelper.o00oOOoO();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00oo0O(context, i);
        }
    }

    @Override // android.widget.TextView
    @o00oOooO.o0OOooO0(api = 26)
    public void setTextClassifier(@o00oOooO.o0OO00OO TextClassifier textClassifier) {
        getSuperCaller().o00oOo00(textClassifier);
    }

    public void setTextFuture(@o00oOooO.o0OO00OO Future<o0OoOoOO.o0OO00o> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@o00oOooO.oo0oO0 o0OO00o.o00oOOo0 o00oooo02) {
        androidx.core.widget.o0OoOoOo.o00ooOo0(this, o00oooo02);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (o.f1019o00oOo00) {
            super.setTextSize(i, f);
            return;
        }
        o0oO0O0o o0oo0o0o = this.mTextHelper;
        if (o0oo0o0o != null) {
            o0oo0o0o.o00ooO0o(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@o00oOooO.o0OO00OO Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = oOOO000.o00oOOoO(getContext(), typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }
}
