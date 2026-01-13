package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0O00O0;
import androidx.appcompat.widget.o0O00OO;
import androidx.appcompat.widget.o0O0OO;
import androidx.appcompat.widget.o0OO0oO;
import androidx.appcompat.widget.o0oO0Ooo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o00ooO0 {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final int[] sScreenReaderFocusable = {16844148};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.o00ooO0<String, Constructor<? extends View>> sConstructorMap = new androidx.collection.o00ooO0<>();

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final String f425o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final View f426o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public Method f427o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public Context f428o00oo0o0;

        public o00oOOo0(@oo0oO0 View view, @oo0oO0 String str) {
            this.f426o00oo0O0 = view;
            this.f425o00oo0O = str;
        }

        public final void o00oOOo0(@o0OO00OO Context context) {
            String sb;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f425o00oo0O, View.class)) != null) {
                        this.f427o00oo0Oo = method;
                        this.f428o00oo0o0 = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f426o00oo0O0.getId();
            if (id == -1) {
                sb = "";
            } else {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" with id '");
                o00oOOo02.append(this.f426o00oo0O0.getContext().getResources().getResourceEntryName(id));
                o00oOOo02.append("'");
                sb = o00oOOo02.toString();
            }
            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Could not find method ");
            o00oOOo03.append(this.f425o00oo0O);
            o00oOOo03.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            o00oOOo03.append(this.f426o00oo0O0.getClass());
            o00oOOo03.append(sb);
            throw new IllegalStateException(o00oOOo03.toString());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@oo0oO0 View view) {
            if (this.f427o00oo0Oo == null) {
                o00oOOo0(this.f426o00oo0O0.getContext());
            }
            try {
                this.f427o00oo0Oo.invoke(this.f428o00oo0o0, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void backportAccessibilityAttributes(@oo0oO0 Context context, @oo0oO0 View view, @oo0oO0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            o0O0o00O.o0O0oOoO(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            o0O0o00O.o0O0oo0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            o0O0o00O.o0OO0oo0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && o0O0o00O.o0O0OOO(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new o00oOOo0(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.o00ooO0<String, Constructor<? extends View>> o00ooo02 = sConstructorMap;
        Constructor<? extends View> constructor = o00ooo02.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            o00ooo02.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(R.styleable.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof o00oOoOo.o00oo0O0) && ((o00oOoOo.o00oo0O0) context).o00oOo00() == resourceId) ? context : new o00oOoOo.o00oo0O0(context, resourceId) : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @oo0oO0
    public androidx.appcompat.widget.o00oo00O createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o00oo00O(context, attributeSet);
    }

    @oo0oO0
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @oo0oO0
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @oo0oO0
    public androidx.appcompat.widget.o0O0o createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o0O0o(context, attributeSet);
    }

    @oo0oO0
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @oo0oO0
    public androidx.appcompat.widget.o0OoOoOo createImageButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o0OoOoOo(context, attributeSet);
    }

    @oo0oO0
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @oo0oO0
    public o0O00O0 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new o0O00O0(context, attributeSet);
    }

    @oo0oO0
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @oo0oO0
    public o0O00OO createRatingBar(Context context, AttributeSet attributeSet) {
        return new o0O00OO(context, attributeSet);
    }

    @oo0oO0
    public o0oO0Ooo createSeekBar(Context context, AttributeSet attributeSet) {
        return new o0oO0Ooo(context, attributeSet);
    }

    @oo0oO0
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @oo0oO0
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @oo0oO0
    public o0O0OO createToggleButton(Context context, AttributeSet attributeSet) {
        return new o0O0OO(context, attributeSet);
    }

    @o0OO00OO
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @o0OO00OO
    public final View createView(@o0OO00OO View view, @oo0oO0 String str, @oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View createRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = o0OO0oO.o00oOOoO(context2);
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
