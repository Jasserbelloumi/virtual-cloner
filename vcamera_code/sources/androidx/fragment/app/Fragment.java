package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO;
import androidx.lifecycle.o0OO000;
import androidx.lifecycle.o0OO0o00;
import androidx.lifecycle.o0OO0oO;
import androidx.lifecycle.o0OO0oO0;
import androidx.lifecycle.o0OOO0;
import androidx.lifecycle.oo0ooO;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOo000;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o00ooOoo.oO000OOo;
import o00ooOoo.oO0OOO0;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.o0O0O0O, o0OO0oO, androidx.lifecycle.o0O000o0, o0O0OOo.o00oOo0O, androidx.activity.result.o00oOOoO {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public o00oo0O mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    @oo0oO0
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    @oooOO0
    private int mContentLayoutId;
    public o0OO0o00.o00oOOoO mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public androidx.fragment.app.o00ooO0<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public androidx.lifecycle.o0O0oo0o mLifecycleRegistry;
    public o0O00.o00oOOoO mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<o00ooO0> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    @o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final o00ooO0 mSavedStateAttachListener;
    public o0O0OOo.o00oOo00 mSavedStateRegistryController;
    @o0OO00OO
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    @o0OO00OO
    public o0O0OO mViewLifecycleOwner;
    public androidx.lifecycle.o0O0OOOo<androidx.lifecycle.o0O0O0O> mViewLifecycleOwnerLiveData;
    @oo0oO0
    public String mWho;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        @oo0oO0
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Bundle f2795o00oo0O0;

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

        public SavedState(Bundle bundle) {
            this.f2795o00oo0O0 = bundle;
        }

        public SavedState(@oo0oO0 Parcel parcel, @o0OO00OO ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2795o00oo0O0 = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            parcel.writeBundle(this.f2795o00oo0O0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class o00oOOo0<I> extends androidx.activity.result.o00oo0OO<I> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2796o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oOo00.o00oOOo0 f2797o00oOOoO;

        public o00oOOo0(AtomicReference atomicReference, o00oOo00.o00oOOo0 o00oooo02) {
            this.f2796o00oOOo0 = atomicReference;
            this.f2797o00oOOoO = o00oooo02;
        }

        @Override // androidx.activity.result.o00oo0OO
        @oo0oO0
        public o00oOo00.o00oOOo0<I, ?> o00oOOo0() {
            return this.f2797o00oOOoO;
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOo00(I i, @o0OO00OO oO000OOo oo000ooo) {
            androidx.activity.result.o00oo0OO o00oo0oo = (androidx.activity.result.o00oo0OO) this.f2796o00oOOo0.get();
            if (o00oo0oo == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            o00oo0oo.o00oOo00(i, oo000ooo);
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOooO() {
            androidx.activity.result.o00oo0OO o00oo0oo = (androidx.activity.result.o00oo0OO) this.f2796o00oOOo0.getAndSet(null);
            if (o00oo0oo != null) {
                o00oo0oo.o00oOooO();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00ooO0 {
        public o00oOo00() {
        }

        @Override // androidx.fragment.app.Fragment.o00ooO0
        public void o00oOOo0() {
            Fragment.this.mSavedStateRegistryController.o00oOo00();
            o0OO000.o00oOo00(Fragment.this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements Runnable {
        public o00oOo0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OooO0 f2803o00oo0O0;

        public o00oOoO(o0OooO0 o0oooo0) {
            this.f2803o00oo0O0 = o0oooo0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2803o00oo0O0.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends RuntimeException {
        public o00oo(@oo0oO0 String str, @o0OO00OO Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 implements o00oo0.o00oOOo0<Void, ActivityResultRegistry> {
        public o00oo0() {
        }

        @Override // o00oo0.o00oOOo0
        /* renamed from: o00oOOo0 */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            androidx.fragment.app.o00ooO0<?> o00ooo02 = fragment.mHost;
            return o00ooo02 instanceof androidx.activity.result.o00oo0O ? ((androidx.activity.result.o00oo0O) o00ooo02).o00oOoO() : fragment.requireActivity().o00oOoO();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O extends androidx.fragment.app.o00oo0O {
        public o00oo00O() {
        }

        @Override // androidx.fragment.app.o00oo0O
        @o0OO00OO
        public View o00oOo0o(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Fragment ");
            o00oOOo02.append(Fragment.this);
            o00oOOo02.append(" does not have a view");
            throw new IllegalStateException(o00oOOo02.toString());
        }

        @Override // androidx.fragment.app.o00oo0O
        public boolean o00oOoO0() {
            return Fragment.this.mView != null;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public View f2806o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f2807o00oOOoO;
        @o00oOooO.o0O00000

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2808o00oOo00;
        @o00oOooO.o0O00000

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f2809o00oOo0O;
        @o00oOooO.o0O00000

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f2810o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public ArrayList<String> f2811o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f2812o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public ArrayList<String> f2813o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public Object f2814o00oOoOo = null;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public Object f2815o00oOoo0;
        @o00oOooO.o0O00000

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f2816o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public Object f2817o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public Object f2818o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public Object f2819o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Boolean f2820o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Boolean f2821o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public Object f2822o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public oO0OOO0 f2823o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public float f2824o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public oO0OOO0 f2825o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public View f2826o00oo0oO;

        /* renamed from: o0O0o  reason: collision with root package name */
        public boolean f2827o0O0o;

        public o00oo0O() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f2815o00oOoo0 = obj;
            this.f2817o00oOooo = null;
            this.f2819o00oo00O = obj;
            this.f2818o00oo0 = null;
            this.f2822o00oo0OO = obj;
            this.f2823o00oo0Oo = null;
            this.f2825o00oo0o0 = null;
            this.f2824o00oo0o = 1.0f;
            this.f2826o00oo0oO = null;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 extends o00ooO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oo0.o00oOOo0 f2828o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2829o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ o00oOo00.o00oOOo0 f2830o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.o00oOOo0 f2832o00oOooO;

        public o00oo0O0(o00oo0.o00oOOo0 o00oooo02, AtomicReference atomicReference, o00oOo00.o00oOOo0 o00oooo03, androidx.activity.result.o00oOOo0 o00oooo04) {
            this.f2828o00oOOo0 = o00oooo02;
            this.f2829o00oOOoO = atomicReference;
            this.f2830o00oOo00 = o00oooo03;
            this.f2832o00oOooO = o00oooo04;
        }

        @Override // androidx.fragment.app.Fragment.o00ooO0
        public void o00oOOo0() {
            this.f2829o00oOOoO.set(((ActivityResultRegistry) this.f2828o00oOOo0.apply(null)).o00oOoOO(Fragment.this.generateActivityResultKey(), Fragment.this, this.f2830o00oOo00, this.f2832o00oOooO));
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements o00oo0.o00oOOo0<Void, ActivityResultRegistry> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f2833o00oOOo0;

        public o00oo0OO(ActivityResultRegistry activityResultRegistry) {
            this.f2833o00oOOo0 = activityResultRegistry;
        }

        @Override // o00oo0.o00oOOo0
        /* renamed from: o00oOOo0 */
        public ActivityResultRegistry apply(Void r1) {
            return this.f2833o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00ooO0 {
        public o00ooO0() {
        }

        public /* synthetic */ o00ooO0(o00oOOoO o00ooooo2) {
            this();
        }

        public abstract void o00oOOo0();
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o0O0o {
        public static void o00oOOo0(@oo0oO0 View view) {
            view.cancelPendingInputEvents();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new o0O00O0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new o00oOOoO();
        this.mMaxState = o0O00.o00oOOoO.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.o0O0OOOo<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new o00oOo00();
        initLifecycle();
    }

    @o00oOooO.o0oO0Ooo
    public Fragment(@oooOO0 int i) {
        this();
        this.mContentLayoutId = i;
    }

    private o00oo0O ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new o00oo0O();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        o0O00.o00oOOoO o00ooooo2 = this.mMaxState;
        return (o00ooooo2 == o0O00.o00oOOoO.INITIALIZED || this.mParentFragment == null) ? o00ooooo2.ordinal() : Math.min(o00ooooo2.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @o0OO00OO
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            o0O00OoO.o00oo.o00oo00O(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.o0O00Oo(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.o0O0oo0o(this);
        this.mSavedStateRegistryController = o0O0OOo.o00oOo00.o00oOOo0(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @oo0oO0
    @Deprecated
    public static Fragment instantiate(@oo0oO0 Context context, @oo0oO0 String str) {
        return instantiate(context, str, null);
    }

    @oo0oO0
    @Deprecated
    public static Fragment instantiate(@oo0oO0 Context context, @oo0oO0 String str, @o0OO00OO Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.o00oo.o00oOooO(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new o00oo(android.support.v4.media.o00oOoO.o00oOOo0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    @oo0oO0
    private <I, O> androidx.activity.result.o00oo0OO<I> prepareCallInternal(@oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 o00oo0.o00oOOo0<Void, ActivityResultRegistry> o00oooo03, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo04) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new o00oo0O0(o00oooo03, atomicReference, o00oooo02, o00oooo04));
            return new o00oOOo0(atomicReference, o00oooo02);
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(@oo0oO0 o00ooO0 o00ooo02) {
        if (this.mState >= 0) {
            o00ooo02.o00oOOo0();
        } else {
            this.mOnPreAttachedListeners.add(o00ooo02);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.oo0OOoo(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 != null) {
            o00oo0o2.f2827o0O0o = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        o0OooO0 o00oo02 = o0OooO0.o00oo0(viewGroup, fragmentManager);
        o00oo02.o00oo0O0();
        if (z) {
            this.mHost.o00oOooo().post(new o00oOoO(o00oo02));
        } else {
            o00oo02.o00oOoO0();
        }
    }

    @oo0oO0
    public androidx.fragment.app.o00oo0O createFragmentContainer() {
        return new o00oo00O();
    }

    public void dump(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            o0O0O0O.o00oOOo0.o00oOooO(this).o00oOOoO(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.o0O000o(o00oOoOo.o00oo.o00oOOo0(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@o0OO00OO Object obj) {
        return super.equals(obj);
    }

    @o0OO00OO
    public Fragment findFragmentByWho(@oo0oO0 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.o0O00o0O(str);
    }

    @oo0oO0
    public String generateActivityResultKey() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(FragmentManager.f2852o0O0000O);
        o00oOOo02.append(this.mWho);
        o00oOOo02.append("_rq#");
        o00oOOo02.append(this.mNextLocalRequestCode.getAndIncrement());
        return o00oOOo02.toString();
    }

    @o0OO00OO
    public final FragmentActivity getActivity() {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 == null) {
            return null;
        }
        return (FragmentActivity) o00ooo02.o00oOoOO();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null || (bool = o00oo0o2.f2820o00oo0O) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null || (bool = o00oo0o2.f2821o00oo0O0) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2806o00oOOo0;
    }

    @o0OO00OO
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @oo0oO0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " has not been attached yet."));
    }

    @o0OO00OO
    public Context getContext() {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 == null) {
            return null;
        }
        return o00ooo02.o00oOoOo();
    }

    @Override // androidx.lifecycle.o0O000o0
    @o00oOooO.o0O00O0
    @oo0oO0
    public o0O00oO0.o00oOOo0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.oo0OOoo(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        o0O00oO0.o00oOoO o00oooo2 = new o0O00oO0.o00oOoO();
        if (application != null) {
            o00oooo2.o00oOo00(o0OO0o00.o00oOOo0.f3390o00oOoOO, application);
        }
        o00oooo2.o00oOo00(o0OO000.f3368o00oOo00, this);
        o00oooo2.o00oOo00(o0OO000.f3370o00oOooO, this);
        if (getArguments() != null) {
            o00oooo2.o00oOo00(o0OO000.f3369o00oOo0O, getArguments());
        }
        return o00oooo2;
    }

    @Override // androidx.lifecycle.o0O000o0
    @oo0oO0
    public o0OO0o00.o00oOOoO getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.oo0OOoo(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.mDefaultFactory = new oo0ooO(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @o00oOooO.o0O00000
    public int getEnterAnim() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 0;
        }
        return o00oo0o2.f2808o00oOo00;
    }

    @o0OO00OO
    public Object getEnterTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2814o00oOoOo;
    }

    public oO0OOO0 getEnterTransitionCallback() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2823o00oo0Oo;
    }

    @o00oOooO.o0O00000
    public int getExitAnim() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 0;
        }
        return o00oo0o2.f2816o00oOooO;
    }

    @o0OO00OO
    public Object getExitTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2817o00oOooo;
    }

    public oO0OOO0 getExitTransitionCallback() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2825o00oo0o0;
    }

    public View getFocusedView() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2826o00oo0oO;
    }

    @o0OO00OO
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @o0OO00OO
    public final Object getHost() {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 == null) {
            return null;
        }
        return o00ooo02.o00oo0O0();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @oo0oO0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @oo0oO0
    @Deprecated
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public LayoutInflater getLayoutInflater(@o0OO00OO Bundle bundle) {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 != null) {
            LayoutInflater o00oo0o02 = o00ooo02.o00oo0o0();
            o00oo0o02.setFactory2(this.mChildFragmentManager.o0O0OOO());
            return o00oo0o02;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // androidx.lifecycle.o0O0O0O
    @oo0oO0
    public androidx.lifecycle.o0O00 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @oo0oO0
    @Deprecated
    public o0O0O0O.o00oOOo0 getLoaderManager() {
        return o0O0O0O.o00oOOo0.o00oOooO(this);
    }

    public int getNextTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 0;
        }
        return o00oo0o2.f2812o00oOoO0;
    }

    @o0OO00OO
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @oo0oO0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return false;
        }
        return o00oo0o2.f2807o00oOOoO;
    }

    @o00oOooO.o0O00000
    public int getPopEnterAnim() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 0;
        }
        return o00oo0o2.f2809o00oOo0O;
    }

    @o00oOooO.o0O00000
    public int getPopExitAnim() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 0;
        }
        return o00oo0o2.f2810o00oOo0o;
    }

    public float getPostOnViewCreatedAlpha() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return 1.0f;
        }
        return o00oo0o2.f2824o00oo0o;
    }

    @o0OO00OO
    public Object getReenterTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        Object obj = o00oo0o2.f2819o00oo00O;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @oo0oO0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        o0O00OoO.o00oo.o00oOoo0(this);
        return this.mRetainInstance;
    }

    @o0OO00OO
    public Object getReturnTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        Object obj = o00oo0o2.f2815o00oOoo0;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // o0O0OOo.o00oOo0O
    @oo0oO0
    public final androidx.savedstate.o00oOOo0 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f11516o00oOOoO;
    }

    @o0OO00OO
    public Object getSharedElementEnterTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        return o00oo0o2.f2818o00oo0;
    }

    @o0OO00OO
    public Object getSharedElementReturnTransition() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return null;
        }
        Object obj = o00oo0o2.f2822o00oo0OO;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @oo0oO0
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        return (o00oo0o2 == null || (arrayList = o00oo0o2.f2811o00oOoO) == null) ? new ArrayList<>() : arrayList;
    }

    @oo0oO0
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        return (o00oo0o2 == null || (arrayList = o00oo0o2.f2813o00oOoOO) == null) ? new ArrayList<>() : arrayList;
    }

    @oo0oO0
    public final String getString(@o0OOO0O int i) {
        return getResources().getString(i);
    }

    @oo0oO0
    public final String getString(@o0OOO0O int i, @o0OO00OO Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @o0OO00OO
    public final String getTag() {
        return this.mTag;
    }

    @o0OO00OO
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        o0O00OoO.o00oo.o00oOooo(this);
        return this.mTargetRequestCode;
    }

    @oo0oO0
    public final CharSequence getText(@o0OOO0O int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @o0OO00OO
    public View getView() {
        return this.mView;
    }

    @o0O
    @oo0oO0
    public androidx.lifecycle.o0O0O0O getViewLifecycleOwner() {
        o0O0OO o0o0oo = this.mViewLifecycleOwner;
        if (o0o0oo != null) {
            return o0o0oo;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @oo0oO0
    public LiveData<androidx.lifecycle.o0O0O0O> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.o0OO0oO
    @oo0oO0
    public o0OO0oO0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != o0O00.o00oOOoO.INITIALIZED.ordinal()) {
                return this.mFragmentManager.o0O0Oo0O(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new o0O00O0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.o0O0Ooo0(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.o0O0Ooo(this.mParentFragment));
    }

    public boolean isPostponed() {
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        if (o00oo0o2 == null) {
            return false;
        }
        return o00oo0o2.f2827o0O0o;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.o0O0o00();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.o0O0o0oO();
    }

    @o00oOooO.o0O00O0
    @o0O
    @Deprecated
    public void onActivityCreated(@o0OO00OO Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @o0OO00OO Intent intent) {
        if (FragmentManager.oo0OOoo(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @o00oOooO.o0O00O0
    @o0O
    @Deprecated
    public void onAttach(@oo0oO0 Activity activity) {
        this.mCalled = true;
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onAttach(@oo0oO0 Context context) {
        this.mCalled = true;
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        Activity o00oOoOO2 = o00ooo02 == null ? null : o00ooo02.o00oOoOO();
        if (o00oOoOO2 != null) {
            this.mCalled = false;
            onAttach(o00oOoOO2);
        }
    }

    @o0O
    @Deprecated
    public void onAttachFragment(@oo0oO0 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @o00oOooO.o0O00O0
    public void onConfigurationChanged(@oo0oO0 Configuration configuration) {
        this.mCalled = true;
    }

    @o0O
    public boolean onContextItemSelected(@oo0oO0 MenuItem menuItem) {
        return false;
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onCreate(@o0OO00OO Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.o0O0o000(1)) {
            return;
        }
        this.mChildFragmentManager.o00ooo00();
    }

    @o0O
    @o0OO00OO
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @o0O
    @o0OO00OO
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @o0O
    public void onCreateContextMenu(@oo0oO0 ContextMenu contextMenu, @oo0oO0 View view, @o0OO00OO ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @o0O
    @Deprecated
    public void onCreateOptionsMenu(@oo0oO0 Menu menu, @oo0oO0 MenuInflater menuInflater) {
    }

    @o0O
    @o0OO00OO
    public View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onDestroy() {
        this.mCalled = true;
    }

    @o0O
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onDestroyView() {
        this.mCalled = true;
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onDetach() {
        this.mCalled = true;
    }

    @oo0oO0
    public LayoutInflater onGetLayoutInflater(@o0OO00OO Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @o0O
    public void onHiddenChanged(boolean z) {
    }

    @o00oOooO.o0O00O0
    @Deprecated
    @o0OOo000
    public void onInflate(@oo0oO0 Activity activity, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Bundle bundle) {
        this.mCalled = true;
    }

    @o00oOooO.o0O00O0
    @o0OOo000
    public void onInflate(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, @o0OO00OO Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        Activity o00oOoOO2 = o00ooo02 == null ? null : o00ooo02.o00oOoOO();
        if (o00oOoOO2 != null) {
            this.mCalled = false;
            onInflate(o00oOoOO2, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @o00oOooO.o0O00O0
    @o0O
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @o0O
    @Deprecated
    public boolean onOptionsItemSelected(@oo0oO0 MenuItem menuItem) {
        return false;
    }

    @o0O
    @Deprecated
    public void onOptionsMenuClosed(@oo0oO0 Menu menu) {
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @o0O
    @Deprecated
    public void onPrepareOptionsMenu(@oo0oO0 Menu menu) {
    }

    @o0O
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @oo0oO0 String[] strArr, @oo0oO0 int[] iArr) {
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onResume() {
        this.mCalled = true;
    }

    @o0O
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onStart() {
        this.mCalled = true;
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onStop() {
        this.mCalled = true;
    }

    @o0O
    public void onViewCreated(@oo0oO0 View view, @o0OO00OO Bundle bundle) {
    }

    @o00oOooO.o0O00O0
    @o0O
    public void onViewStateRestored(@o0OO00OO Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.o0O0o0oO();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.o00ooOo0();
    }

    public void performAttach() {
        Iterator<o00ooO0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().o00oOOo0();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.o00oo0o0(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.o00oOoOo());
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.o00oooOo(this);
        this.mChildFragmentManager.o00ooOo();
    }

    public void performConfigurationChanged(@oo0oO0 Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@oo0oO0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o00ooOoo(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.o0O0o0oO();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.o00oOOo0(new androidx.lifecycle.o0O00OOO() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                View view;
                if (o00oooo02 != o0O00.o00oOOo0.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.o00oOooO(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.o00oOooo(o0O00.o00oOOo0.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@oo0oO0 Menu menu, @oo0oO0 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.o00ooo0(menu, menuInflater);
    }

    public void performCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        this.mChildFragmentManager.o0O0o0oO();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new o0O0OO(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.o00oOo00()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.o00oOOoO();
        o0OO.o00oOOoO(this.mView, this.mViewLifecycleOwner);
        o0OOO0.o00oOOoO(this.mView, this.mViewLifecycleOwner);
        androidx.savedstate.o00oOOoO.o00oOOoO(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.o00oo0Oo(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.o00ooo0O();
        this.mLifecycleRegistry.o00oOooo(o0O00.o00oOOo0.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.o00ooo0o();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().o00oOOoO().isAtLeast(o0O00.o00oOOoO.CREATED)) {
            this.mViewLifecycleOwner.o00oOOo0(o0O00.o00oOOo0.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        o0O0O0O.o00oOOo0.o00oOooO(this).o00oOoO();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.o0O0OoO0()) {
            return;
        }
        this.mChildFragmentManager.o00ooo0O();
        this.mChildFragmentManager = new o0O00O0();
    }

    @oo0oO0
    public LayoutInflater performGetLayoutInflater(@o0OO00OO Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@oo0oO0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o00oooo(menuItem);
    }

    public void performOptionsMenuClosed(@oo0oO0 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.o00ooooO(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.o0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOOo0(o0O00.o00oOOo0.ON_PAUSE);
        }
        this.mLifecycleRegistry.o00oOooo(o0O00.o00oOOo0.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@oo0oO0 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.o0O0000O(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean o0O0OooO2 = this.mFragmentManager.o0O0OooO(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != o0O0OooO2) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(o0O0OooO2);
            onPrimaryNavigationFragmentChanged(o0O0OooO2);
            this.mChildFragmentManager.o0O0000o();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.o0O0o0oO();
        this.mChildFragmentManager.o0OoO00O(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.o0O0oo0o o0o0oo0o = this.mLifecycleRegistry;
        o0O00.o00oOOo0 o00oooo02 = o0O00.o00oOOo0.ON_RESUME;
        o0o0oo0o.o00oOooo(o00oooo02);
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOOo0(o00oooo02);
        }
        this.mChildFragmentManager.o0O000();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.o00oOo0O(bundle);
        Bundle o0O0o00O2 = this.mChildFragmentManager.o0O0o00O();
        if (o0O0o00O2 != null) {
            bundle.putParcelable(FragmentManager.f2848o00ooooO, o0O0o00O2);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.o0O0o0oO();
        this.mChildFragmentManager.o0OoO00O(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.o0O0oo0o o0o0oo0o = this.mLifecycleRegistry;
        o0O00.o00oOOo0 o00oooo02 = o0O00.o00oOOo0.ON_START;
        o0o0oo0o.o00oOooo(o00oooo02);
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOOo0(o00oooo02);
        }
        this.mChildFragmentManager.o0O000O();
    }

    public void performStop() {
        this.mChildFragmentManager.o0O000Oo();
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOOo0(o0O00.o00oOOo0.ON_STOP);
        }
        this.mLifecycleRegistry.o00oOooo(o0O00.o00oOOo0.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.o0OoOoOO();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2827o0O0o = true;
    }

    public final void postponeEnterTransition(long j, @oo0oO0 TimeUnit timeUnit) {
        ensureAnimationInfo().f2827o0O0o = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler o00oOooo2 = fragmentManager != null ? fragmentManager.o0O0OOO0().o00oOooo() : new Handler(Looper.getMainLooper());
        o00oOooo2.removeCallbacks(this.mPostponedDurationRunnable);
        o00oOooo2.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @Override // androidx.activity.result.o00oOOoO
    @o0O
    @oo0oO0
    public final <I, O> androidx.activity.result.o00oo0OO<I> registerForActivityResult(@oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 ActivityResultRegistry activityResultRegistry, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo03) {
        return prepareCallInternal(o00oooo02, new o00oo0OO(activityResultRegistry), o00oooo03);
    }

    @Override // androidx.activity.result.o00oOOoO
    @o0O
    @oo0oO0
    public final <I, O> androidx.activity.result.o00oo0OO<I> registerForActivityResult(@oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo03) {
        return prepareCallInternal(o00oooo02, new o00oo0(), o00oooo03);
    }

    public void registerForContextMenu(@oo0oO0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@oo0oO0 String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().o0O0o0Oo(this, strArr, i);
    }

    @oo0oO0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to an activity."));
    }

    @oo0oO0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " does not have any arguments."));
    }

    @oo0oO0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to a context."));
    }

    @oo0oO0
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @oo0oO0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to a host."));
    }

    @oo0oO0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @oo0oO0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(@o0OO00OO Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(FragmentManager.f2848o00ooooO)) == null) {
            return;
        }
        this.mChildFragmentManager.o0O(parcelable);
        this.mChildFragmentManager.o00ooo00();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOooO(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new o0O0o000(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.o00oOOo0(o0O00.o00oOOo0.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2820o00oo0O = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2821o00oo0O0 = Boolean.valueOf(z);
    }

    public void setAnimations(@o00oOooO.o0O00000 int i, @o00oOooO.o0O00000 int i2, @o00oOooO.o0O00000 int i3, @o00oOooO.o0O00000 int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f2808o00oOo00 = i;
        ensureAnimationInfo().f2816o00oOooO = i2;
        ensureAnimationInfo().f2809o00oOo0O = i3;
        ensureAnimationInfo().f2810o00oOo0o = i4;
    }

    public void setArguments(@o0OO00OO Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@o0OO00OO oO0OOO0 oo0ooo0) {
        ensureAnimationInfo().f2823o00oo0Oo = oo0ooo0;
    }

    public void setEnterTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2814o00oOoOo = obj;
    }

    public void setExitSharedElementCallback(@o0OO00OO oO0OOO0 oo0ooo0) {
        ensureAnimationInfo().f2825o00oo0o0 = oo0ooo0;
    }

    public void setExitTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2817o00oOooo = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f2826o00oo0oO = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.o00ooO();
        }
    }

    public void setInitialSavedState(@o0OO00OO SavedState savedState) {
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        this.mSavedFragmentState = (savedState == null || (r2 = savedState.f2795o00oo0O0) == null) ? null : null;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.o00ooO();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f2812o00oOoO0 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f2807o00oOOoO = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f2824o00oo0o = f;
    }

    public void setReenterTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2819o00oo00O = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        o0O00OoO.o00oo.o00oo0OO(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.o00oo0O(this);
        } else {
            fragmentManager.o0O0ooO0(this);
        }
    }

    public void setReturnTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2815o00oOoo0 = obj;
    }

    public void setSharedElementEnterTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2818o00oo0 = obj;
    }

    public void setSharedElementNames(@o0OO00OO ArrayList<String> arrayList, @o0OO00OO ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        o00oo0O o00oo0o2 = this.mAnimationInfo;
        o00oo0o2.f2811o00oOoO = arrayList;
        o00oo0o2.f2813o00oOoOO = arrayList2;
    }

    public void setSharedElementReturnTransition(@o0OO00OO Object obj) {
        ensureAnimationInfo().f2822o00oo0OO = obj;
    }

    @Deprecated
    public void setTargetFragment(@o0OO00OO Fragment fragment, int i) {
        if (fragment != null) {
            o0O00OoO.o00oo.o00oo0O0(this, fragment, i);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
        } else {
            this.mTargetWho = fragment.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        o0O00OoO.o00oo.o00oo0O(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.oooOO0(fragmentManager.o00ooOO(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@oo0oO0 String str) {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 != null) {
            return o00ooo02.o00ooO00(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @o0OO00OO Bundle bundle) {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.mHost;
        if (o00ooo02 == null) {
            throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to Activity"));
        }
        o00ooo02.o00ooO0O(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @o0OO00OO Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to Activity"));
        }
        getParentFragmentManager().o0O0o0o0(this, intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.oo0OOoo(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().o0O0o0o(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f2827o0O0o) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f2827o0O0o = false;
        } else if (Looper.myLooper() != this.mHost.o00oOooo().getLooper()) {
            this.mHost.o00oOooo().postAtFrontOfQueue(new o00oOo0O());
        } else {
            callStartTransitionListener(true);
        }
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@oo0oO0 View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
