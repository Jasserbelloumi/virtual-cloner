package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0OooO0;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO0oO;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O00oO0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f3072o00oOo0o = "FragmentManager";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f3073o00oOoO = "android:target_state";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f3074o00oOoO0 = "android:target_req_state";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f3075o00oOoOO = "android:view_state";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f3076o00oOoOo = "android:view_registry_state";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f3077o00oOoo0 = "android:user_visible_hint";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0000O f3078o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0oO0O0o f3079o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Fragment f3080o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f3082o00oOooO = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f3081o00oOo0O = -1;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f3084o00oo0O0;

        public o00oOOo0(View view) {
            this.f3084o00oo0O0 = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3084o00oo0O0.removeOnAttachStateChangeListener(this);
            o0O0o00O.o0O0oOO0(this.f3084o00oo0O0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f3085o00oOOo0;

        static {
            int[] iArr = new int[o0O00.o00oOOoO.values().length];
            f3085o00oOOo0 = iArr;
            try {
                iArr[o0O00.o00oOOoO.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3085o00oOOo0[o0O00.o00oOOoO.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3085o00oOOo0[o0O00.o00oOOoO.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3085o00oOOo0[o0O00.o00oOOoO.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public o0O00oO0(@oo0oO0 o0O0000O o0o0000o, @oo0oO0 o0oO0O0o o0oo0o0o, @oo0oO0 Fragment fragment) {
        this.f3078o00oOOo0 = o0o0000o;
        this.f3079o00oOOoO = o0oo0o0o;
        this.f3080o00oOo00 = fragment;
    }

    public o0O00oO0(@oo0oO0 o0O0000O o0o0000o, @oo0oO0 o0oO0O0o o0oo0o0o, @oo0oO0 Fragment fragment, @oo0oO0 FragmentState fragmentState) {
        this.f3078o00oOOo0 = o0o0000o;
        this.f3079o00oOOoO = o0oo0o0o;
        this.f3080o00oOo00 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f2944o00ooO;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public o0O00oO0(@oo0oO0 o0O0000O o0o0000o, @oo0oO0 o0oO0O0o o0oo0o0o, @oo0oO0 ClassLoader classLoader, @oo0oO0 o00oo o00ooVar, @oo0oO0 FragmentState fragmentState) {
        this.f3078o00oOOo0 = o0o0000o;
        this.f3079o00oOOoO = o0oo0o0o;
        Fragment o00oOOo02 = fragmentState.o00oOOo0(o00ooVar, classLoader);
        this.f3080o00oOo00 = o00oOOo02;
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(o00oOOo02);
        }
    }

    public void o00oOOo0() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o0O0000O o0o0000o = this.f3078o00oOOo0;
        Fragment fragment2 = this.f3080o00oOo00;
        o0o0000o.o00oOOo0(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void o00oOOoO() {
        int o00oOoOo2 = this.f3079o00oOOoO.o00oOoOo(this.f3080o00oOo00);
        Fragment fragment = this.f3080o00oOo00;
        fragment.mContainer.addView(fragment.mView, o00oOoOo2);
    }

    public void o00oOo00() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        Fragment fragment2 = fragment.mTarget;
        o0O00oO0 o0o00oo0 = null;
        if (fragment2 != null) {
            o0O00oO0 o00oo0OO2 = this.f3079o00oOOoO.o00oo0OO(fragment2.mWho);
            if (o00oo0OO2 == null) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Fragment ");
                o00oOOo02.append(this.f3080o00oOo00);
                o00oOOo02.append(" declared target fragment ");
                o00oOOo02.append(this.f3080o00oOo00.mTarget);
                o00oOOo02.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(o00oOOo02.toString());
            }
            Fragment fragment3 = this.f3080o00oOo00;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            o0o00oo0 = o00oo0OO2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (o0o00oo0 = this.f3079o00oOOoO.o00oo0OO(str)) == null) {
                StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Fragment ");
                o00oOOo03.append(this.f3080o00oOo00);
                o00oOOo03.append(" declared target fragment ");
                throw new IllegalStateException(android.support.v4.media.o00oOOoO.o00oOOo0(o00oOOo03, this.f3080o00oOo00.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (o0o00oo0 != null) {
            o0o00oo0.o00oo00O();
        }
        Fragment fragment4 = this.f3080o00oOo00;
        fragment4.mHost = fragment4.mFragmentManager.o0O0OOO0();
        Fragment fragment5 = this.f3080o00oOo00;
        fragment5.mParentFragment = fragment5.mFragmentManager.o0O0OOo();
        this.f3078o00oOOo0.o00oOoO0(this.f3080o00oOo00, false);
        this.f3080o00oOo00.performAttach();
        this.f3078o00oOOo0.o00oOOoO(this.f3080o00oOo00, false);
    }

    public void o00oOo0O() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f3080o00oOo00.mState = 1;
            return;
        }
        this.f3078o00oOOo0.o00oOoO(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f3080o00oOo00;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        o0O0000O o0o0000o = this.f3078o00oOOo0;
        Fragment fragment3 = this.f3080o00oOo00;
        o0o0000o.o00oOo00(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void o00oOo0o() {
        String str;
        if (this.f3080o00oOo00.mFromLayout) {
            return;
        }
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3080o00oOo00;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot create fragment ");
                    o00oOOo02.append(this.f3080o00oOo00);
                    o00oOOo02.append(" for a container view with no id");
                    throw new IllegalArgumentException(o00oOOo02.toString());
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.o0O0O0oO().o00oOo0o(this.f3080o00oOo00.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f3080o00oOo00;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f3080o00oOo00.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = o0O000.o00oo0OO.f10107o00oOOoO;
                        }
                        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("No view found for id 0x");
                        o00oOOo03.append(Integer.toHexString(this.f3080o00oOo00.mContainerId));
                        o00oOOo03.append(" (");
                        o00oOOo03.append(str);
                        o00oOOo03.append(") for fragment ");
                        o00oOOo03.append(this.f3080o00oOo00);
                        throw new IllegalArgumentException(o00oOOo03.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    o0O00OoO.o00oo.o00oo0Oo(this.f3080o00oOo00, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f3080o00oOo00;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3080o00oOo00.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3080o00oOo00;
            fragment5.mView.setTag(R.id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                o00oOOoO();
            }
            Fragment fragment6 = this.f3080o00oOo00;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (o0O0o00O.o0O0OOoo(this.f3080o00oOo00.mView)) {
                o0O0o00O.o00oo.o00oOo00(this.f3080o00oOo00.mView);
            } else {
                View view2 = this.f3080o00oOo00.mView;
                view2.addOnAttachStateChangeListener(new o00oOOo0(view2));
            }
            this.f3080o00oOo00.performViewCreated();
            o0O0000O o0o0000o = this.f3078o00oOOo0;
            Fragment fragment7 = this.f3080o00oOo00;
            o0o0000o.o00oo00O(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3080o00oOo00.mView.getVisibility();
            this.f3080o00oOo00.setPostOnViewCreatedAlpha(this.f3080o00oOo00.mView.getAlpha());
            Fragment fragment8 = this.f3080o00oOo00;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f3080o00oOo00.setFocusedView(findFocus);
                    if (FragmentManager.oo0OOoo(2)) {
                        findFocus.toString();
                        Objects.toString(this.f3080o00oOo00);
                    }
                }
                this.f3080o00oOo00.mView.setAlpha(0.0f);
            }
        }
        this.f3080o00oOo00.mState = 2;
    }

    public void o00oOoO() {
        View view;
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3080o00oOo00.performDestroyView();
        this.f3078o00oOOo0.o00oo0(this.f3080o00oOo00, false);
        Fragment fragment2 = this.f3080o00oOo00;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o00oo0Oo(null);
        this.f3080o00oOo00.mInLayout = false;
    }

    public void o00oOoO0() {
        Fragment o00oOo0o2;
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        Fragment fragment = this.f3080o00oOo00;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f3080o00oOo00;
            if (!fragment2.mBeingSaved) {
                this.f3079o00oOOoO.o00ooOO0(fragment2.mWho, null);
            }
        }
        if (!(z2 || this.f3079o00oOOoO.o00oo0O().o00oo0OO(this.f3080o00oOo00))) {
            String str = this.f3080o00oOo00.mTargetWho;
            if (str != null && (o00oOo0o2 = this.f3079o00oOOoO.o00oOo0o(str)) != null && o00oOo0o2.mRetainInstance) {
                this.f3080o00oOo00.mTarget = o00oOo0o2;
            }
            this.f3080o00oOo00.mState = 0;
            return;
        }
        o00ooO0<?> o00ooo02 = this.f3080o00oOo00.mHost;
        if (o00ooo02 instanceof o0OO0oO) {
            z = this.f3079o00oOOoO.o00oo0O().f3056o00oOo0O;
        } else if (o00ooo02.o00oOoOo() instanceof Activity) {
            z = true ^ ((Activity) o00ooo02.o00oOoOo()).isChangingConfigurations();
        }
        if ((z2 && !this.f3080o00oOo00.mBeingSaved) || z) {
            this.f3079o00oOOoO.o00oo0O().o00oOOoO(this.f3080o00oOo00);
        }
        this.f3080o00oOo00.performDestroy();
        this.f3078o00oOOo0.o00oOooO(this.f3080o00oOo00, false);
        for (o0O00oO0 o0o00oo0 : this.f3079o00oOOoO.o00oOooo()) {
            if (o0o00oo0 != null) {
                Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                if (this.f3080o00oOo00.mWho.equals(o00oOoo02.mTargetWho)) {
                    o00oOoo02.mTarget = this.f3080o00oOo00;
                    o00oOoo02.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f3080o00oOo00;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f3079o00oOOoO.o00oOo0o(str2);
        }
        this.f3079o00oOOoO.o00oo0o(this);
    }

    public void o00oOoOO() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        this.f3080o00oOo00.performDetach();
        boolean z = false;
        this.f3078o00oOOo0.o00oOo0O(this.f3080o00oOo00, false);
        Fragment fragment = this.f3080o00oOo00;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f3079o00oOOoO.o00oo0O().o00oo0OO(this.f3080o00oOo00)) {
            if (FragmentManager.oo0OOoo(3)) {
                Objects.toString(this.f3080o00oOo00);
            }
            this.f3080o00oOo00.initState();
        }
    }

    public void o00oOoOo() {
        Fragment fragment = this.f3080o00oOo00;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.oo0OOoo(3)) {
                Objects.toString(this.f3080o00oOo00);
            }
            Fragment fragment2 = this.f3080o00oOo00;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3080o00oOo00.mSavedFragmentState);
            View view = this.f3080o00oOo00.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3080o00oOo00;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3080o00oOo00;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3080o00oOo00.performViewCreated();
                o0O0000O o0o0000o = this.f3078o00oOOo0;
                Fragment fragment5 = this.f3080o00oOo00;
                o0o0000o.o00oo00O(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3080o00oOo00.mState = 2;
            }
        }
    }

    @oo0oO0
    public Fragment o00oOoo0() {
        return this.f3080o00oOo00;
    }

    public int o00oOooO() {
        Fragment fragment = this.f3080o00oOo00;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f3081o00oOo0O;
        int i2 = o00oOOoO.f3085o00oOOo0[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment2 = this.f3080o00oOo00;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f3081o00oOo0O, 2);
                View view = this.f3080o00oOo00.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3081o00oOo0O < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f3080o00oOo00.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f3080o00oOo00;
        ViewGroup viewGroup = fragment3.mContainer;
        o0OooO0.o00oOoO.o00oOOoO o00oOooo2 = viewGroup != null ? o0OooO0.o00oo0(viewGroup, fragment3.getParentFragmentManager()).o00oOooo(this) : null;
        if (o00oOooo2 == o0OooO0.o00oOoO.o00oOOoO.ADDING) {
            i = Math.min(i, 6);
        } else if (o00oOooo2 == o0OooO0.o00oOoO.o00oOOoO.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3080o00oOo00;
            if (fragment4.mRemoving) {
                i = fragment4.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f3080o00oOo00;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(this.f3080o00oOo00);
        }
        return i;
    }

    public final boolean o00oOooo(@oo0oO0 View view) {
        if (view == this.f3080o00oOo00.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3080o00oOo00.mView) {
                return true;
            }
        }
        return false;
    }

    public void o00oo() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        this.f3080o00oOo00.performStop();
        this.f3078o00oOOo0.o00oOooo(this.f3080o00oOo00, false);
    }

    public void o00oo0() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        this.f3080o00oOo00.performPause();
        this.f3078o00oOOo0.o00oOo0o(this.f3080o00oOo00, false);
    }

    public void o00oo00O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3082o00oOooO) {
            if (FragmentManager.oo0OOoo(2)) {
                Objects.toString(o00oOoo0());
                return;
            }
            return;
        }
        try {
            this.f3082o00oOooO = true;
            boolean z = false;
            while (true) {
                int o00oOooO2 = o00oOooO();
                Fragment fragment = this.f3080o00oOo00;
                int i = fragment.mState;
                if (o00oOooO2 == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f3080o00oOo00.mBeingSaved) {
                        if (FragmentManager.oo0OOoo(3)) {
                            Objects.toString(this.f3080o00oOo00);
                        }
                        this.f3079o00oOOoO.o00oo0O().o00oOOoO(this.f3080o00oOo00);
                        this.f3079o00oOOoO.o00oo0o(this);
                        if (FragmentManager.oo0OOoo(3)) {
                            Objects.toString(this.f3080o00oOo00);
                        }
                        this.f3080o00oOo00.initState();
                    }
                    Fragment fragment2 = this.f3080o00oOo00;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            o0OooO0 o00oo02 = o0OooO0.o00oo0(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f3080o00oOo00.mHidden) {
                                o00oo02.o00oOo00(this);
                            } else {
                                o00oo02.o00oOo0O(this);
                            }
                        }
                        Fragment fragment3 = this.f3080o00oOo00;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.o0O0Oooo(fragment3);
                        }
                        Fragment fragment4 = this.f3080o00oOo00;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f3080o00oOo00.mChildFragmentManager.o00oooo0();
                    }
                    return;
                }
                if (o00oOooO2 > i) {
                    switch (i + 1) {
                        case 0:
                            o00oOo00();
                            continue;
                        case 1:
                            o00oOo0O();
                            continue;
                        case 2:
                            o00oOoOo();
                            o00oOo0o();
                            continue;
                        case 3:
                            o00oOOo0();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                o0OooO0.o00oo0(viewGroup3, fragment.getParentFragmentManager()).o00oOOoO(o0OooO0.o00oOoO.o00oOo00.from(this.f3080o00oOo00.mView.getVisibility()), this);
                            }
                            this.f3080o00oOo00.mState = 4;
                            continue;
                        case 5:
                            o0O0o();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            o00oo0O0();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            o00oOoOO();
                            continue;
                        case 0:
                            if (fragment.mBeingSaved && this.f3079o00oOOoO.o00oo0Oo(fragment.mWho) == null) {
                                o00oo0o0();
                            }
                            o00oOoO0();
                            continue;
                        case 1:
                            o00oOoO();
                            this.f3080o00oOo00.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.oo0OOoo(3)) {
                                Objects.toString(this.f3080o00oOo00);
                            }
                            Fragment fragment5 = this.f3080o00oOo00;
                            if (fragment5.mBeingSaved) {
                                o00oo0o0();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                o00oo0o();
                            }
                            Fragment fragment6 = this.f3080o00oOo00;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                o0OooO0.o00oo0(viewGroup2, fragment6.getParentFragmentManager()).o00oOooO(this);
                            }
                            this.f3080o00oOo00.mState = 3;
                            continue;
                        case 4:
                            o00oo();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            o00oo0();
                            continue;
                        default:
                            continue;
                    }
                }
                z = true;
            }
        } finally {
            this.f3082o00oOooO = false;
        }
    }

    public final Bundle o00oo0O() {
        Bundle bundle = new Bundle();
        this.f3080o00oOo00.performSaveInstanceState(bundle);
        this.f3078o00oOOo0.o00oOoOo(this.f3080o00oOo00, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3080o00oOo00.mView != null) {
            o00oo0o();
        }
        if (this.f3080o00oOo00.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f3075o00oOoOO, this.f3080o00oOo00.mSavedViewState);
        }
        if (this.f3080o00oOo00.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f3076o00oOoOo, this.f3080o00oOo00.mSavedViewRegistryState);
        }
        if (!this.f3080o00oOo00.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f3077o00oOoo0, this.f3080o00oOo00.mUserVisibleHint);
        }
        return bundle;
    }

    public void o00oo0O0() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        View focusedView = this.f3080o00oOo00.getFocusedView();
        if (focusedView != null && o00oOooo(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.oo0OOoo(2)) {
                focusedView.toString();
                Objects.toString(this.f3080o00oOo00);
                Objects.toString(this.f3080o00oOo00.mView.findFocus());
            }
        }
        this.f3080o00oOo00.setFocusedView(null);
        this.f3080o00oOo00.performResume();
        this.f3078o00oOOo0.o00oOoOO(this.f3080o00oOo00, false);
        Fragment fragment = this.f3080o00oOo00;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void o00oo0OO(@oo0oO0 ClassLoader classLoader) {
        Bundle bundle = this.f3080o00oOo00.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3080o00oOo00;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f3075o00oOoOO);
        Fragment fragment2 = this.f3080o00oOo00;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f3076o00oOoOo);
        Fragment fragment3 = this.f3080o00oOo00;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(f3073o00oOoO);
        Fragment fragment4 = this.f3080o00oOo00;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(f3074o00oOoO0, 0);
        }
        Fragment fragment5 = this.f3080o00oOo00;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3080o00oOo00.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(f3077o00oOoo0, true);
        }
        Fragment fragment6 = this.f3080o00oOo00;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    @o0OO00OO
    public Fragment.SavedState o00oo0Oo() {
        Bundle o00oo0O2;
        if (this.f3080o00oOo00.mState <= -1 || (o00oo0O2 = o00oo0O()) == null) {
            return null;
        }
        return new Fragment.SavedState(o00oo0O2);
    }

    public void o00oo0o() {
        if (this.f3080o00oOo00.mView == null) {
            return;
        }
        if (FragmentManager.oo0OOoo(2)) {
            Objects.toString(this.f3080o00oOo00);
            Objects.toString(this.f3080o00oOo00.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3080o00oOo00.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3080o00oOo00.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3080o00oOo00.mViewLifecycleOwner.o00oOo0O(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3080o00oOo00.mSavedViewRegistryState = bundle;
    }

    public void o00oo0o0() {
        FragmentState fragmentState = new FragmentState(this.f3080o00oOo00);
        Fragment fragment = this.f3080o00oOo00;
        if (fragment.mState <= -1 || fragmentState.f2944o00ooO != null) {
            fragmentState.f2944o00ooO = fragment.mSavedFragmentState;
        } else {
            Bundle o00oo0O2 = o00oo0O();
            fragmentState.f2944o00ooO = o00oo0O2;
            if (this.f3080o00oOo00.mTargetWho != null) {
                if (o00oo0O2 == null) {
                    fragmentState.f2944o00ooO = new Bundle();
                }
                fragmentState.f2944o00ooO.putString(f3073o00oOoO, this.f3080o00oOo00.mTargetWho);
                int i = this.f3080o00oOo00.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f2944o00ooO.putInt(f3074o00oOoO0, i);
                }
            }
        }
        this.f3079o00oOOoO.o00ooOO0(this.f3080o00oOo00.mWho, fragmentState);
    }

    public void o00oo0oO(int i) {
        this.f3081o00oOo0O = i;
    }

    public void o0O0o() {
        if (FragmentManager.oo0OOoo(3)) {
            Objects.toString(this.f3080o00oOo00);
        }
        this.f3080o00oOo00.performStart();
        this.f3078o00oOOo0.o00oOoo0(this.f3080o00oOo00, false);
    }
}
