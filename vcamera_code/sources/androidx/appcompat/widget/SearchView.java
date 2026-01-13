package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.o0OOOO;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o00oOooO.o0OO0oO;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements o00oOoOo.o00oo0OO {

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public static final boolean f919o0O00OOO = false;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public static final String f920o0O00Oo = "SearchView";

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public static final o0 f921o0O00OoO;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public static final String f922o0oO0Ooo = "nm";

    /* renamed from: o0  reason: collision with root package name */
    public boolean f923o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public final ImageView f924o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final View f925o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final SearchAutoComplete f926o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final View f927o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final ImageView f928o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final View f929o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final ImageView f930o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int[] f931o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o0O00000 f932o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final View f933o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public Rect f934o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public Rect f935o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final ImageView f936o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int[] f937o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final Drawable f938o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final int f939o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final int f940o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final Intent f941o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public final Intent f942o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public o00ooO0 f943o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public final CharSequence f944o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public o00oo f945o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public View.OnFocusChangeListener f946o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public o00ooO f947o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public View.OnClickListener f948o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f949o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public o0O00O0o.o00oOOo0 f950o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public boolean f951o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public boolean f952o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public CharSequence f953o00ooooo;

    /* renamed from: o0O00  reason: collision with root package name */
    public final View.OnClickListener f954o0O00;

    /* renamed from: o0O000  reason: collision with root package name */
    public CharSequence f955o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public boolean f956o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public int f957o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public boolean f958o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public CharSequence f959o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public int f960o0O000Oo;

    /* renamed from: o0O000o  reason: collision with root package name */
    public final Runnable f961o0O000o;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public Bundle f962o0O000o0;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f963o0O000oo;

    /* renamed from: o0O00O  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f964o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public View.OnKeyListener f965o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f966o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public TextWatcher f967o0O00OO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final ImageView f968o0O0o;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public final TextView.OnEditorActionListener f969o0OoO00O;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public SearchableInfo f970o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public boolean f971o0OoOoOo;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public Runnable f972o0ooOoOO;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f973o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: o00oOOoO */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOo00 */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f973o00oo0O0 = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("SearchView.SavedState{");
            o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
            o00oOOo02.append(" isIconified=");
            o00oOOo02.append(this.f973o00oo0O0);
            o00oOOo02.append("}");
            return o00oOOo02.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f973o00oo0O0));
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.o00oo00O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public SearchView f974o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f975o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f976o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final Runnable f977o00oo0o0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {
            public o00oOOo0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.o00oOo00();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f977o00oo0o0 = new o00oOOo0();
            this.f975o00oo0O0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    if (i < 640 || i2 < 480) {
                        return 160;
                    }
                    return PsExtractor.AUDIO_STREAM;
                }
                return PsExtractor.AUDIO_STREAM;
            }
            return 256;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f975o00oo0O0 <= 0 || super.enoughToFilter();
        }

        public void o00oOOo0() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f921o0O00OoO.o00oOo00(this);
                return;
            }
            o0O0o.o00oOOoO(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean o00oOOoO() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void o00oOo00() {
            if (this.f976o00oo0Oo) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f976o00oo0Oo = false;
            }
        }

        @Override // androidx.appcompat.widget.o00oo00O, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f976o00oo0Oo) {
                removeCallbacks(this.f977o00oo0o0);
                post(this.f977o00oo0o0);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f974o00oo0O.o00ooOO0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f974o00oo0O.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f974o00oo0O.hasFocus() && getVisibility() == 0) {
                this.f976o00oo0Oo = true;
                if (SearchView.o00oo0(getContext())) {
                    o00oOOo0();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f976o00oo0Oo = false;
                removeCallbacks(this.f977o00oo0o0);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f976o00oo0Oo = true;
            } else {
                this.f976o00oo0Oo = false;
                removeCallbacks(this.f977o00oo0o0);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f974o00oo0O = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f975o00oo0O0 = i;
        }
    }

    /* loaded from: classes.dex */
    public static class o0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Method f979o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f980o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Method f981o00oOo00;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o0() {
            this.f979o00oOOo0 = null;
            this.f980o00oOOoO = null;
            this.f981o00oOo00 = null;
            o00oOooO();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f979o00oOOo0 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f980o00oOOoO = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f981o00oOo00 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void o00oOooO() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void o00oOOo0(AutoCompleteTextView autoCompleteTextView) {
            o00oOooO();
            Method method = this.f980o00oOOoO;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void o00oOOoO(AutoCompleteTextView autoCompleteTextView) {
            o00oOooO();
            Method method = this.f979o00oOOo0;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void o00oOo00(AutoCompleteTextView autoCompleteTextView) {
            o00oOooO();
            Method method = this.f981o00oOo00;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements TextWatcher {
        public o00oOOo0() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.o00ooO(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.o00ooOoo();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {
        public o00oOo00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O00O0o.o00oOOo0 o00oooo02 = SearchView.this.f950o00oooo;
            if (o00oooo02 instanceof o0OOooO0) {
                o00oooo02.o00oOOo0(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements View.OnFocusChangeListener {
        public o00oOo0O() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f946o00ooo0o;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements View.OnLayoutChangeListener {
        public o00oOoO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.o00oOOoO();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo {
        boolean o00oOOo0();
    }

    /* loaded from: classes.dex */
    public class o00oo0 implements View.OnKeyListener {
        public o00oo0() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f970o0OoOoOO == null) {
                return false;
            }
            if (!searchView.f926o00oo0O0.isPopupShowing() || SearchView.this.f926o00oo0O0.getListSelection() == -1) {
                if (!SearchView.this.f926o00oo0O0.o00oOOoO() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.o00oo0o0(0, null, searchView2.f926o00oo0O0.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.o00ooO0o(view, i, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements View.OnClickListener {
        public o00oo00O() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f928o00oo0o) {
                searchView.o00ooO0();
            } else if (view == searchView.f968o0O0o) {
                searchView.o00oo0oO();
            } else if (view == searchView.f930o00oo0oO) {
                searchView.o00ooO0O();
            } else if (view == searchView.f924o00oo) {
                searchView.o00ooOO();
            } else if (view == searchView.f926o00oo0O0) {
                searchView.o00oOoO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O implements AdapterView.OnItemSelectedListener {
        public o00oo0O() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.o00oo(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 implements AdapterView.OnItemClickListener {
        public o00oo0O0() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.o0O0o(i, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements TextView.OnEditorActionListener {
        public o00oo0OO() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.o00ooO0O();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface o00ooO {
        boolean o00oOOo0(int i);

        boolean o00oOOoO(int i);
    }

    /* loaded from: classes.dex */
    public interface o00ooO0 {
        boolean o00oOOo0(String str);

        boolean o00oOOoO(String str);
    }

    /* loaded from: classes.dex */
    public static class o0O00000 extends TouchDelegate {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final View f992o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Rect f993o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Rect f994o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f995o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f996o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Rect f997o00oOooO;

        public o0O00000(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f995o00oOo0O = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f993o00oOOoO = new Rect();
            this.f997o00oOooO = new Rect();
            this.f994o00oOo00 = new Rect();
            o00oOOo0(rect, rect2);
            this.f992o00oOOo0 = view;
        }

        public void o00oOOo0(Rect rect, Rect rect2) {
            this.f993o00oOOoO.set(rect);
            this.f997o00oOooO.set(rect);
            Rect rect3 = this.f997o00oOooO;
            int i = this.f995o00oOo0O;
            rect3.inset(-i, -i);
            this.f994o00oOo00.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f996o00oOo0o;
                    if (z2 && !this.f997o00oOooO.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f996o00oOo0o;
                        this.f996o00oOo0o = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f993o00oOOoO.contains(x, y)) {
                    this.f996o00oOo0o = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f994o00oOo00.contains(x, y)) {
                    Rect rect = this.f994o00oOo00;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.f992o00oOOo0.getWidth() / 2;
                    i = this.f992o00oOOo0.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.f992o00oOOo0.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o0O0o {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    static {
        f921o0O00OoO = Build.VERSION.SDK_INT < 29 ? new o0() : null;
    }

    public SearchView(@o00oOooO.oo0oO0 Context context) {
        this(context, null);
    }

    public SearchView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f934o00ooO0O = new Rect();
        this.f935o00ooO0o = new Rect();
        this.f931o00ooO = new int[2];
        this.f937o00ooOO0 = new int[2];
        this.f961o0O000o = new o00oOOoO();
        this.f972o0ooOoOO = new o00oOo00();
        this.f963o0O000oo = new WeakHashMap<>();
        o00oo00O o00oo00o = new o00oo00O();
        this.f954o0O00 = o00oo00o;
        this.f965o0O00O0 = new o00oo0();
        o00oo0OO o00oo0oo = new o00oo0OO();
        this.f969o0OoO00O = o00oo0oo;
        o00oo0O0 o00oo0o02 = new o00oo0O0();
        this.f966o0O00O0o = o00oo0o02;
        o00oo0O o00oo0o2 = new o00oo0O();
        this.f964o0O00O = o00oo0o2;
        this.f967o0O00OO = new o00oOOo0();
        int[] iArr = R.styleable.SearchView;
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, iArr, i, 0);
        o0O000oo.o0O0o00O.o0O0oOo0(this, context, iArr, attributeSet, o00ooOo2.o00ooO(), i, 0);
        LayoutInflater.from(context).inflate(o00ooOo2.o00oo0oO(R.styleable.SearchView_layout, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f926o00oo0O0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f925o00oo0O = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f927o00oo0Oo = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f929o00oo0o0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f928o00oo0o = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f930o00oo0oO = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f968o0O0o = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f924o00oo = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f936o00ooOO = imageView5;
        o0O0o00O.o00oo0OO.o00oo0O(findViewById, o00ooOo2.o00oOoO(R.styleable.SearchView_queryBackground));
        o0O0o00O.o00oo0OO.o00oo0O(findViewById2, o00ooOo2.o00oOoO(R.styleable.SearchView_submitBackground));
        int i2 = R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(o00ooOo2.o00oOoO(i2));
        imageView2.setImageDrawable(o00ooOo2.o00oOoO(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(o00ooOo2.o00oOoO(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(o00ooOo2.o00oOoO(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(o00ooOo2.o00oOoO(i2));
        this.f938o00ooOOo = o00ooOo2.o00oOoO(R.styleable.SearchView_searchHintIcon);
        o0OOOO.o00oOOo0.o00oOOo0(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f940o00ooOo0 = o00ooOo2.o00oo0oO(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.f939o00ooOo = o00ooOo2.o00oo0oO(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(o00oo00o);
        imageView3.setOnClickListener(o00oo00o);
        imageView2.setOnClickListener(o00oo00o);
        imageView4.setOnClickListener(o00oo00o);
        searchAutoComplete.setOnClickListener(o00oo00o);
        searchAutoComplete.addTextChangedListener(this.f967o0O00OO);
        searchAutoComplete.setOnEditorActionListener(o00oo0oo);
        searchAutoComplete.setOnItemClickListener(o00oo0o02);
        searchAutoComplete.setOnItemSelectedListener(o00oo0o2);
        searchAutoComplete.setOnKeyListener(this.f965o0O00O0);
        searchAutoComplete.setOnFocusChangeListener(new o00oOo0O());
        setIconifiedByDefault(o00ooOo2.o00oOOo0(R.styleable.SearchView_iconifiedByDefault, true));
        int o00oOoO02 = o00ooOo2.o00oOoO0(R.styleable.SearchView_android_maxWidth, -1);
        if (o00oOoO02 != -1) {
            setMaxWidth(o00oOoO02);
        }
        this.f944o00ooo00 = o00ooOo2.o00ooO00(R.styleable.SearchView_defaultQueryHint);
        this.f953o00ooooo = o00ooOo2.o00ooO00(R.styleable.SearchView_queryHint);
        int o00oo0OO2 = o00ooOo2.o00oo0OO(R.styleable.SearchView_android_imeOptions, -1);
        if (o00oo0OO2 != -1) {
            setImeOptions(o00oo0OO2);
        }
        int o00oo0OO3 = o00ooOo2.o00oo0OO(R.styleable.SearchView_android_inputType, -1);
        if (o00oo0OO3 != -1) {
            setInputType(o00oo0OO3);
        }
        setFocusable(o00ooOo2.o00oOOo0(R.styleable.SearchView_android_focusable, true));
        o00ooOo2.o00ooOoo();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f941o00ooOoO = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f942o00ooOoo = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f933o00ooO00 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new o00oOoO());
        }
        o00oooO(this.f949o00oooOo);
        o00ooo00();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public static boolean o00oo0(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void setQuery(CharSequence charSequence) {
        this.f926o00oo0O0.setText(charSequence);
        this.f926o00oo0O0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f956o0O00000 = true;
        super.clearFocus();
        this.f926o00oo0O0.clearFocus();
        this.f926o00oo0O0.setImeVisibility(false);
        this.f956o0O00000 = false;
    }

    public int getImeOptions() {
        return this.f926o00oo0O0.getImeOptions();
    }

    public int getInputType() {
        return this.f926o00oo0O0.getInputType();
    }

    public int getMaxWidth() {
        return this.f957o0O0000O;
    }

    public CharSequence getQuery() {
        return this.f926o00oo0O0.getText();
    }

    @o00oOooO.o0OO00OO
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f953o00ooooo;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f970o0OoOoOO;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f944o00ooo00 : getContext().getText(this.f970o0OoOoOO.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f939o00ooOo;
    }

    public int getSuggestionRowLayout() {
        return this.f940o00ooOo0;
    }

    public o0O00O0o.o00oOOo0 getSuggestionsAdapter() {
        return this.f950o00oooo;
    }

    public void o00oOOoO() {
        if (this.f933o00ooO00.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f927o00oo0Oo.getPaddingLeft();
            Rect rect = new Rect();
            boolean o00oOOoO2 = o.o00oOOoO(this);
            int dimensionPixelSize = this.f949o00oooOo ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            this.f926o00oo0O0.getDropDownBackground().getPadding(rect);
            this.f926o00oo0O0.setDropDownHorizontalOffset(o00oOOoO2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f926o00oo0O0.setDropDownWidth((((this.f933o00ooO00.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent o00oOo00(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f959o0O000O);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f962o0O000o0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f970o0OoOoOO.getSearchActivity());
        return intent;
    }

    public final Intent o00oOo0O(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f962o0O000o0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent o00oOo0o(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public void o00oOoO() {
        if (Build.VERSION.SDK_INT >= 29) {
            o0O0o.o00oOOo0(this.f926o00oo0O0);
            return;
        }
        o0 o0Var = f921o0O00OoO;
        o0Var.o00oOOoO(this.f926o00oo0O0);
        o0Var.o00oOOo0(this.f926o00oo0O0);
    }

    public final void o00oOoO0() {
        this.f926o00oo0O0.dismissDropDown();
    }

    public final void o00oOoOO(View view, Rect rect) {
        view.getLocationInWindow(this.f931o00ooO);
        getLocationInWindow(this.f937o00ooOO0);
        int[] iArr = this.f931o00ooO;
        int i = iArr[1];
        int[] iArr2 = this.f937o00ooOO0;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    public final CharSequence o00oOoOo(CharSequence charSequence) {
        if (!this.f949o00oooOo || this.f938o00ooOOo == null) {
            return charSequence;
        }
        int textSize = (int) (this.f926o00oo0O0.getTextSize() * 1.25d);
        this.f938o00ooOOo.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f938o00ooOOo), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean o00oOoo0() {
        SearchableInfo searchableInfo = this.f970o0OoOoOO;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f970o0OoOoOO.getVoiceSearchLaunchWebSearch()) {
            intent = this.f941o00ooOoO;
        } else if (this.f970o0OoOoOO.getVoiceSearchLaunchRecognizer()) {
            intent = this.f942o00ooOoo;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public final Intent o00oOooO(Cursor cursor, int i, String str) {
        String o00oo0o2;
        try {
            try {
                String o00oo0o3 = o0OOooO0.o00oo0o(cursor, "suggest_intent_action");
                if (o00oo0o3 == null) {
                    o00oo0o3 = this.f970o0OoOoOO.getSuggestIntentAction();
                }
                if (o00oo0o3 == null) {
                    o00oo0o3 = "android.intent.action.SEARCH";
                }
                String str2 = o00oo0o3;
                String o00oo0o4 = o0OOooO0.o00oo0o(cursor, "suggest_intent_data");
                if (o00oo0o4 == null) {
                    o00oo0o4 = this.f970o0OoOoOO.getSuggestIntentData();
                }
                if (o00oo0o4 != null && (o00oo0o2 = o0OOooO0.o00oo0o(cursor, "suggest_intent_data_id")) != null) {
                    o00oo0o4 = o00oo0o4 + "/" + Uri.encode(o00oo0o2);
                }
                return o00oOo00(str2, o00oo0o4 == null ? null : Uri.parse(o00oo0o4), o0OOooO0.o00oo0o(cursor, "suggest_intent_extra_data"), o0OOooO0.o00oo0o(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public boolean o00oOooo() {
        return this.f949o00oooOo;
    }

    public boolean o00oo(int i) {
        o00ooO o00ooo = this.f947o00oooO;
        if (o00ooo == null || !o00ooo.o00oOOo0(i)) {
            o00ooOo0(i);
            return true;
        }
        return false;
    }

    public boolean o00oo00O() {
        return this.f951o00oooo0;
    }

    public boolean o00oo0O() {
        return this.f952o00ooooO;
    }

    public final boolean o00oo0O0() {
        return (this.f952o00ooooO || this.f958o0O0000o) && !o00oo00O();
    }

    public boolean o00oo0OO() {
        return this.f923o0;
    }

    public final void o00oo0Oo(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            intent.toString();
        }
    }

    public final boolean o00oo0o(int i, int i2, String str) {
        Cursor o00oOo002 = this.f950o00oooo.o00oOo00();
        if (o00oOo002 == null || !o00oOo002.moveToPosition(i)) {
            return false;
        }
        o00oo0Oo(o00oOooO(o00oOo002, i2, str));
        return true;
    }

    public void o00oo0o0(int i, String str, String str2) {
        getContext().startActivity(o00oOo00("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    public void o00oo0oO() {
        if (!TextUtils.isEmpty(this.f926o00oo0O0.getText())) {
            this.f926o00oo0O0.setText("");
            this.f926o00oo0O0.requestFocus();
            this.f926o00oo0O0.setImeVisibility(true);
        } else if (this.f949o00oooOo) {
            o00oo o00ooVar = this.f945o00ooo0O;
            if (o00ooVar == null || !o00ooVar.o00oOOo0()) {
                clearFocus();
                o00oooO(true);
            }
        }
    }

    public void o00ooO(CharSequence charSequence) {
        Editable text = this.f926o00oo0O0.getText();
        this.f959o0O000O = text;
        boolean z = !TextUtils.isEmpty(text);
        o00ooo0o(z);
        o00oooOO(!z);
        o00ooOoO();
        o00ooo0O();
        if (this.f943o00ooo0 != null && !TextUtils.equals(charSequence, this.f955o0O000)) {
            this.f943o00ooo0.o00oOOo0(charSequence.toString());
        }
        this.f955o0O000 = charSequence.toString();
    }

    public void o00ooO0() {
        o00oooO(false);
        this.f926o00oo0O0.requestFocus();
        this.f926o00oo0O0.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f948o00oooOO;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void o00ooO00(@o00oOooO.o0OO00OO CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void o00ooO0O() {
        Editable text = this.f926o00oo0O0.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        o00ooO0 o00ooo02 = this.f943o00ooo0;
        if (o00ooo02 == null || !o00ooo02.o00oOOoO(text.toString())) {
            if (this.f970o0OoOoOO != null) {
                o00oo0o0(0, null, text.toString());
            }
            this.f926o00oo0O0.setImeVisibility(false);
            o00oOoO0();
        }
    }

    public boolean o00ooO0o(View view, int i, KeyEvent keyEvent) {
        if (this.f970o0OoOoOO != null && this.f950o00oooo != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return o0O0o(this.f926o00oo0O0.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f926o00oo0O0.setSelection(i == 21 ? 0 : this.f926o00oo0O0.length());
                this.f926o00oo0O0.setListSelection(0);
                this.f926o00oo0O0.clearListSelection();
                this.f926o00oo0O0.o00oOOo0();
                return true;
            } else if (i == 19) {
                this.f926o00oo0O0.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void o00ooOO() {
        Intent o00oOo0O2;
        SearchableInfo searchableInfo = this.f970o0OoOoOO;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                o00oOo0O2 = o00oOo0o(this.f941o00ooOoO, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                o00oOo0O2 = o00oOo0O(this.f942o00ooOoo, searchableInfo);
            }
            getContext().startActivity(o00oOo0O2);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void o00ooOO0() {
        o00oooO(o00oo00O());
        o00ooOOo();
        if (this.f926o00oo0O0.hasFocus()) {
            o00oOoO();
        }
    }

    public final void o00ooOOo() {
        post(this.f961o0O000o);
    }

    public void o00ooOo(CharSequence charSequence, boolean z) {
        this.f926o00oo0O0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f926o00oo0O0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f959o0O000O = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        o00ooO0O();
    }

    public final void o00ooOo0(int i) {
        CharSequence convertToString;
        Editable text = this.f926o00oo0O0.getText();
        Cursor o00oOo002 = this.f950o00oooo.o00oOo00();
        if (o00oOo002 == null) {
            return;
        }
        if (!o00oOo002.moveToPosition(i) || (convertToString = this.f950o00oooo.convertToString(o00oOo002)) == null) {
            setQuery(text);
        } else {
            setQuery(convertToString);
        }
    }

    public final void o00ooOoO() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f926o00oo0O0.getText());
        if (!z2 && (!this.f949o00oooOo || this.f971o0OoOoOo)) {
            z = false;
        }
        this.f968o0O0o.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f968o0O0o.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void o00ooOoo() {
        int[] iArr = this.f926o00oo0O0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f927o00oo0Oo.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f929o00oo0o0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void o00ooo0() {
        this.f926o00oo0O0.setThreshold(this.f970o0OoOoOO.getSuggestThreshold());
        this.f926o00oo0O0.setImeOptions(this.f970o0OoOoOO.getImeOptions());
        int inputType = this.f970o0OoOoOO.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f970o0OoOoOO.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f926o00oo0O0.setInputType(inputType);
        o0O00O0o.o00oOOo0 o00oooo02 = this.f950o00oooo;
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0(null);
        }
        if (this.f970o0OoOoOO.getSuggestAuthority() != null) {
            o0OOooO0 o0ooooo0 = new o0OOooO0(getContext(), this, this.f970o0OoOoOO, this.f963o0O000oo);
            this.f950o00oooo = o0ooooo0;
            this.f926o00oo0O0.setAdapter(o0ooooo0);
            ((o0OOooO0) this.f950o00oooo).o00ooOO(this.f923o0 ? 2 : 1);
        }
    }

    public final void o00ooo00() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f926o00oo0O0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(o00oOoOo(queryHint));
    }

    public final void o00ooo0O() {
        this.f929o00oo0o0.setVisibility((o00oo0O0() && (this.f930o00oo0oO.getVisibility() == 0 || this.f924o00oo.getVisibility() == 0)) ? 0 : 8);
    }

    public final void o00ooo0o(boolean z) {
        this.f930o00oo0oO.setVisibility((this.f952o00ooooO && o00oo0O0() && hasFocus() && (z || !this.f958o0O0000o)) ? 0 : 8);
    }

    public final void o00oooO(boolean z) {
        this.f951o00oooo0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f926o00oo0O0.getText());
        this.f928o00oo0o.setVisibility(i2);
        o00ooo0o(z2);
        this.f925o00oo0O.setVisibility(z ? 8 : 0);
        if (this.f936o00ooOO.getDrawable() == null || this.f949o00oooOo) {
            i = 8;
        }
        this.f936o00ooOO.setVisibility(i);
        o00ooOoO();
        o00oooOO(!z2);
        o00ooo0O();
    }

    public final void o00oooOO(boolean z) {
        int i = 8;
        if (this.f958o0O0000o && !o00oo00O() && z) {
            this.f930o00oo0oO.setVisibility(8);
            i = 0;
        }
        this.f924o00oo.setVisibility(i);
    }

    public boolean o0O0o(int i, int i2, String str) {
        o00ooO o00ooo = this.f947o00oooO;
        if (o00ooo == null || !o00ooo.o00oOOoO(i)) {
            o00oo0o(i, 0, null);
            this.f926o00oo0O0.setImeVisibility(false);
            o00oOoO0();
            return true;
        }
        return false;
    }

    @Override // o00oOoOo.o00oo0OO
    public void onActionViewCollapsed() {
        o00ooOo("", false);
        clearFocus();
        o00oooO(true);
        this.f926o00oo0O0.setImeOptions(this.f960o0O000Oo);
        this.f971o0OoOoOo = false;
    }

    @Override // o00oOoOo.o00oo0OO
    public void onActionViewExpanded() {
        if (this.f971o0OoOoOo) {
            return;
        }
        this.f971o0OoOoOo = true;
        int imeOptions = this.f926o00oo0O0.getImeOptions();
        this.f960o0O000Oo = imeOptions;
        this.f926o00oo0O0.setImeOptions(imeOptions | 33554432);
        this.f926o00oo0O0.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f961o0O000o);
        post(this.f972o0ooOoOO);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            o00oOoOO(this.f926o00oo0O0, this.f934o00ooO0O);
            Rect rect = this.f935o00ooO0o;
            Rect rect2 = this.f934o00ooO0O;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            o0O00000 o0o00000 = this.f932o00ooO0;
            if (o0o00000 != null) {
                o0o00000.o00oOOo0(this.f935o00ooO0o, this.f934o00ooO0O);
                return;
            }
            o0O00000 o0o000002 = new o0O00000(this.f935o00ooO0o, this.f934o00ooO0O, this.f926o00oo0O0);
            this.f932o00ooO0 = o0o000002;
            setTouchDelegate(o0o000002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.o00oo00O()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f957o0O0000O
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f957o0O0000O
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f957o0O0000O
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        o00oooO(savedState.f973o00oo0O0);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f973o00oo0O0 = o00oo00O();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        o00ooOOo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f956o0O00000 && isFocusable()) {
            if (o00oo00O()) {
                return super.requestFocus(i, rect);
            }
            boolean requestFocus = this.f926o00oo0O0.requestFocus(i, rect);
            if (requestFocus) {
                o00oooO(false);
            }
            return requestFocus;
        }
        return false;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f962o0O000o0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            o00oo0oO();
        } else {
            o00ooO0();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f949o00oooOo == z) {
            return;
        }
        this.f949o00oooOo = z;
        o00oooO(z);
        o00ooo00();
    }

    public void setImeOptions(int i) {
        this.f926o00oo0O0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f926o00oo0O0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f957o0O0000O = i;
        requestLayout();
    }

    public void setOnCloseListener(o00oo o00ooVar) {
        this.f945o00ooo0O = o00ooVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f946o00ooo0o = onFocusChangeListener;
    }

    public void setOnQueryTextListener(o00ooO0 o00ooo02) {
        this.f943o00ooo0 = o00ooo02;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f948o00oooOO = onClickListener;
    }

    public void setOnSuggestionListener(o00ooO o00ooo) {
        this.f947o00oooO = o00ooo;
    }

    public void setQueryHint(@o00oOooO.o0OO00OO CharSequence charSequence) {
        this.f953o00ooooo = charSequence;
        o00ooo00();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f923o0 = z;
        o0O00O0o.o00oOOo0 o00oooo02 = this.f950o00oooo;
        if (o00oooo02 instanceof o0OOooO0) {
            ((o0OOooO0) o00oooo02).o00ooOO(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f970o0OoOoOO = searchableInfo;
        if (searchableInfo != null) {
            o00ooo0();
            o00ooo00();
        }
        boolean o00oOoo02 = o00oOoo0();
        this.f958o0O0000o = o00oOoo02;
        if (o00oOoo02) {
            this.f926o00oo0O0.setPrivateImeOptions(f922o0oO0Ooo);
        }
        o00oooO(o00oo00O());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f952o00ooooO = z;
        o00oooO(o00oo00O());
    }

    public void setSuggestionsAdapter(o0O00O0o.o00oOOo0 o00oooo02) {
        this.f950o00oooo = o00oooo02;
        this.f926o00oo0O0.setAdapter(o00oooo02);
    }
}
