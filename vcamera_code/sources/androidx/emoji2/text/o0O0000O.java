package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o0O0000O extends SpannableStringBuilder {
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final List<o00oOOo0> f2766o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Class<?> f2767o00oo0O0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements TextWatcher, SpanWatcher {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final AtomicInteger f2768o00oo0O = new AtomicInteger(0);

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Object f2769o00oo0O0;

        public o00oOOo0(Object obj) {
            this.f2769o00oo0O0 = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2769o00oo0O0).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2769o00oo0O0).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void o00oOOo0() {
            this.f2768o00oo0O.incrementAndGet();
        }

        public final boolean o00oOOoO(Object obj) {
            return obj instanceof o0O0o;
        }

        public final void o00oOo00() {
            this.f2768o00oo0O.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2768o00oo0O.get() <= 0 || !o00oOOoO(obj)) {
                ((SpanWatcher) this.f2769o00oo0O0).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f2768o00oo0O.get() <= 0 || !o00oOOoO(obj)) {
                ((SpanWatcher) this.f2769o00oo0O0).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2768o00oo0O.get() <= 0 || !o00oOOoO(obj)) {
                ((SpanWatcher) this.f2769o00oo0O0).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2769o00oo0O0).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o0O0000O(@oo0oO0 Class<?> cls) {
        this.f2766o00oo0O = new ArrayList();
        ooOOOOoo.o00oo00O(cls, "watcherClass cannot be null");
        this.f2767o00oo0O0 = cls;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o0O0000O(@oo0oO0 Class<?> cls, @oo0oO0 CharSequence charSequence) {
        super(charSequence);
        this.f2766o00oo0O = new ArrayList();
        ooOOOOoo.o00oo00O(cls, "watcherClass cannot be null");
        this.f2767o00oo0O0 = cls;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o0O0000O(@oo0oO0 Class<?> cls, @oo0oO0 CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f2766o00oo0O = new ArrayList();
        ooOOOOoo.o00oo00O(cls, "watcherClass cannot be null");
        this.f2767o00oo0O0 = cls;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public static o0O0000O o00oOo00(@oo0oO0 Class<?> cls, @oo0oO0 CharSequence charSequence) {
        return new o0O0000O(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@o0OO00OO Object obj) {
        o00oOOo0 o00oOo0o2;
        if (o00oOoO(obj) && (o00oOo0o2 = o00oOo0o(obj)) != null) {
            obj = o00oOo0o2;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@o0OO00OO Object obj) {
        o00oOOo0 o00oOo0o2;
        if (o00oOoO(obj) && (o00oOo0o2 = o00oOo0o(obj)) != null) {
            obj = o00oOo0o2;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@o0OO00OO Object obj) {
        o00oOOo0 o00oOo0o2;
        if (o00oOoO(obj) && (o00oOo0o2 = o00oOo0o(obj)) != null) {
            obj = o00oOo0o2;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @oo0oO0 Class<T> cls) {
        if (o00oOoO0(cls)) {
            o00oOOo0[] o00oooo0Arr = (o00oOOo0[]) super.getSpans(i, i2, o00oOOo0.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, o00oooo0Arr.length));
            for (int i3 = 0; i3 < o00oooo0Arr.length; i3++) {
                tArr[i3] = o00oooo0Arr[i3].f2769o00oo0O0;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @o0OO00OO Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || o00oOoO0(cls)) ? o00oOOo0.class : o00oOOo0.class);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOOo0() {
        o00oOOoO();
    }

    public final void o00oOOoO() {
        for (int i = 0; i < this.f2766o00oo0O.size(); i++) {
            this.f2766o00oo0O.get(i).o00oOOo0();
        }
    }

    public final void o00oOo0O() {
        for (int i = 0; i < this.f2766o00oo0O.size(); i++) {
            this.f2766o00oo0O.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    public final o00oOOo0 o00oOo0o(Object obj) {
        for (int i = 0; i < this.f2766o00oo0O.size(); i++) {
            o00oOOo0 o00oooo02 = this.f2766o00oo0O.get(i);
            if (o00oooo02.f2769o00oo0O0 == obj) {
                return o00oooo02;
            }
        }
        return null;
    }

    public final boolean o00oOoO(@o0OO00OO Object obj) {
        return obj != null && o00oOoO0(obj.getClass());
    }

    public final boolean o00oOoO0(@oo0oO0 Class<?> cls) {
        return this.f2767o00oo0O0 == cls;
    }

    public final void o00oOoOO() {
        for (int i = 0; i < this.f2766o00oo0O.size(); i++) {
            this.f2766o00oo0O.get(i).o00oOo00();
        }
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOooO() {
        o00oOoOO();
        o00oOo0O();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@o0OO00OO Object obj) {
        o00oOOo0 o00oooo02;
        if (o00oOoO(obj)) {
            o00oooo02 = o00oOo0o(obj);
            if (o00oooo02 != null) {
                obj = o00oooo02;
            }
        } else {
            o00oooo02 = null;
        }
        super.removeSpan(obj);
        if (o00oooo02 != null) {
            this.f2766o00oo0O.remove(o00oooo02);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        o00oOOoO();
        super.replace(i, i2, charSequence);
        o00oOoOO();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        o00oOOoO();
        super.replace(i, i2, charSequence, i3, i4);
        o00oOoOO();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@o0OO00OO Object obj, int i, int i2, int i3) {
        if (o00oOoO(obj)) {
            o00oOOo0 o00oooo02 = new o00oOOo0(obj);
            this.f2766o00oo0O.add(o00oooo02);
            obj = o00oooo02;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new o0O0000O(this.f2767o00oo0O0, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Appendable append(char c) throws IOException {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @oo0oO0
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }
}
