package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: o00oo  reason: collision with root package name */
    public boolean f2950o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public FrameLayout f2951o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f2952o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Context f2953o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f2954o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public FragmentManager f2955o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public TabHost.OnTabChangeListener f2956o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOOoO f2957o0O0o;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f2958o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2958o00oo0O0 = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @oo0oO0
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("FragmentTabHost.SavedState{");
            o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
            o00oOOo02.append(" curTab=");
            return android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo02, this.f2958o00oo0O0, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2958o00oo0O0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements TabHost.TabContentFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f2959o00oOOo0;

        public o00oOOo0(Context context) {
            this.f2959o00oOOo0 = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f2959o00oOOo0);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2960o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Class<?> f2961o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Bundle f2962o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Fragment f2963o00oOooO;

        public o00oOOoO(@oo0oO0 String str, @oo0oO0 Class<?> cls, @o0OO00OO Bundle bundle) {
            this.f2960o00oOOo0 = str;
            this.f2961o00oOOoO = cls;
            this.f2962o00oOo00 = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@oo0oO0 Context context) {
        super(context, null);
        this.f2952o00oo0O0 = new ArrayList<>();
        o00oOo0o(context, null);
    }

    @Deprecated
    public FragmentTabHost(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2952o00oo0O0 = new ArrayList<>();
        o00oOo0o(context, attributeSet);
    }

    @Deprecated
    public void o00oOOo0(@oo0oO0 TabHost.TabSpec tabSpec, @oo0oO0 Class<?> cls, @o0OO00OO Bundle bundle) {
        tabSpec.setContent(new o00oOOo0(this.f2953o00oo0Oo));
        String tag = tabSpec.getTag();
        o00oOOoO o00ooooo2 = new o00oOOoO(tag, cls, bundle);
        if (this.f2950o00oo) {
            Fragment o0O00o002 = this.f2955o00oo0o0.o0O00o00(tag);
            o00ooooo2.f2963o00oOooO = o0O00o002;
            if (o0O00o002 != null && !o0O00o002.isDetached()) {
                o0O0oo0o o00oo0oO2 = this.f2955o00oo0o0.o00oo0oO();
                o00oo0oO2.o00oo0Oo(o00ooooo2.f2963o00oOooO);
                o00oo0oO2.o00oo00O();
            }
        }
        this.f2952o00oo0O0.add(o00ooooo2);
        addTab(tabSpec);
    }

    @o0OO00OO
    public final o0O0oo0o o00oOOoO(@o0OO00OO String str, @o0OO00OO o0O0oo0o o0o0oo0o) {
        Fragment fragment;
        o00oOOoO o00oOo0O2 = o00oOo0O(str);
        if (this.f2957o0O0o != o00oOo0O2) {
            if (o0o0oo0o == null) {
                o0o0oo0o = this.f2955o00oo0o0.o00oo0oO();
            }
            o00oOOoO o00ooooo2 = this.f2957o0O0o;
            if (o00ooooo2 != null && (fragment = o00ooooo2.f2963o00oOooO) != null) {
                o0o0oo0o.o00oo0Oo(fragment);
            }
            if (o00oOo0O2 != null) {
                Fragment fragment2 = o00oOo0O2.f2963o00oOooO;
                if (fragment2 == null) {
                    Fragment o00oOOo02 = this.f2955o00oo0o0.o0O0OO0().o00oOOo0(this.f2953o00oo0Oo.getClassLoader(), o00oOo0O2.f2961o00oOOoO.getName());
                    o00oOo0O2.f2963o00oOooO = o00oOOo02;
                    o00oOOo02.setArguments(o00oOo0O2.f2962o00oOo00);
                    o0o0oo0o.o00oOo00(this.f2954o00oo0o, o00oOo0O2.f2963o00oOooO, o00oOo0O2.f2960o00oOOo0);
                } else {
                    o0o0oo0o.o00oOooo(fragment2);
                }
            }
            this.f2957o0O0o = o00oOo0O2;
        }
        return o0o0oo0o;
    }

    public final void o00oOo00() {
        if (this.f2951o00oo0O == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f2954o00oo0o);
            this.f2951o00oo0O = frameLayout;
            if (frameLayout != null) {
                return;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("No tab content FrameLayout found for id ");
            o00oOOo02.append(this.f2954o00oo0o);
            throw new IllegalStateException(o00oOOo02.toString());
        }
    }

    @o0OO00OO
    public final o00oOOoO o00oOo0O(String str) {
        int size = this.f2952o00oo0O0.size();
        for (int i = 0; i < size; i++) {
            o00oOOoO o00ooooo2 = this.f2952o00oo0O0.get(i);
            if (o00ooooo2.f2960o00oOOo0.equals(str)) {
                return o00ooooo2;
            }
        }
        return null;
    }

    public final void o00oOo0o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f2954o00oo0o = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void o00oOoO(@oo0oO0 Context context, @oo0oO0 FragmentManager fragmentManager, int i) {
        o00oOooO(context);
        super.setup();
        this.f2953o00oo0Oo = context;
        this.f2955o00oo0o0 = fragmentManager;
        this.f2954o00oo0o = i;
        o00oOo00();
        this.f2951o00oo0O.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Deprecated
    public void o00oOoO0(@oo0oO0 Context context, @oo0oO0 FragmentManager fragmentManager) {
        o00oOooO(context);
        super.setup();
        this.f2953o00oo0Oo = context;
        this.f2955o00oo0o0 = fragmentManager;
        o00oOo00();
    }

    public final void o00oOooO(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f2951o00oo0O = frameLayout2;
            frameLayout2.setId(this.f2954o00oo0o);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f2952o00oo0O0.size();
        o0O0oo0o o0o0oo0o = null;
        for (int i = 0; i < size; i++) {
            o00oOOoO o00ooooo2 = this.f2952o00oo0O0.get(i);
            Fragment o0O00o002 = this.f2955o00oo0o0.o0O00o00(o00ooooo2.f2960o00oOOo0);
            o00ooooo2.f2963o00oOooO = o0O00o002;
            if (o0O00o002 != null && !o0O00o002.isDetached()) {
                if (o00ooooo2.f2960o00oOOo0.equals(currentTabTag)) {
                    this.f2957o0O0o = o00ooooo2;
                } else {
                    if (o0o0oo0o == null) {
                        o0o0oo0o = this.f2955o00oo0o0.o00oo0oO();
                    }
                    o0o0oo0o.o00oo0Oo(o00ooooo2.f2963o00oOooO);
                }
            }
        }
        this.f2950o00oo = true;
        o0O0oo0o o00oOOoO2 = o00oOOoO(currentTabTag, o0o0oo0o);
        if (o00oOOoO2 != null) {
            o00oOOoO2.o00oo00O();
            this.f2955o00oo0o0.o0O00OOO();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2950o00oo = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2958o00oo0O0);
    }

    @Override // android.view.View
    @oo0oO0
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2958o00oo0O0 = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@o0OO00OO String str) {
        o0O0oo0o o00oOOoO2;
        if (this.f2950o00oo && (o00oOOoO2 = o00oOOoO(str, null)) != null) {
            o00oOOoO2.o00oo00O();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f2956o00oo0oO;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@o0OO00OO TabHost.OnTabChangeListener onTabChangeListener) {
        this.f2956o00oo0oO = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
