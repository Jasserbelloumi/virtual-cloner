package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0O0oo0o;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0OO0oO0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOo00.o00oOOoO;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00OO0O;
import o00ooOoo.oOo0o0oO;
import o00ooOoo.oOo0oooO;
import o00ooOoo.ooOOO00O;
import o0O00OoO.o00oo;
import o0ooOoOO.o;
/* loaded from: classes.dex */
public abstract class FragmentManager implements o0O00o00 {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f2847o0 = "result_";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f2848o00ooooO = "android:support:fragments";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f2849o00ooooo = "state";
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o0O000  reason: collision with root package name */
    public static final String f2850o0O000 = "FragmentManager";

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final String f2851o0O00000 = "state";

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final String f2852o0O0000O = "fragment_";

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static boolean f2853o0O0000o = false;

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final int f2854o0O000O = 1;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final String f2855o0OoOoOo = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f2857o00oOOoO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<Fragment> f2859o00oOo0O;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public OnBackPressedDispatcher f2862o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.o00oOOo0> f2866o00oOooO;

    /* renamed from: o00oo  reason: collision with root package name */
    public androidx.fragment.app.o00oo0O f2868o00oo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public ArrayList<o0> f2870o00oo00O;
    @o0OO00OO

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Fragment f2879o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Fragment f2880o00ooO00;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public androidx.activity.result.o00oo0OO<Intent> f2883o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public androidx.activity.result.o00oo0OO<IntentSenderRequest> f2885o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public androidx.activity.result.o00oo0OO<String[]> f2887o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f2888o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public boolean f2889o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public boolean f2890o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public boolean f2891o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public boolean f2892o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.o00oOOo0> f2893o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public ArrayList<Boolean> f2894o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public ArrayList<Fragment> f2895o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public o0O00O f2896o00oooOo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public o00oo.o00oOo00 f2898o00oooo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public androidx.fragment.app.o00ooO0<?> f2899o0O0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ArrayList<o0O00000> f2856o00oOOo0 = new ArrayList<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0oO0O0o f2858o00oOo00 = new o0oO0O0o();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final androidx.fragment.app.o0O00000 f2860o00oOo0o = new androidx.fragment.app.o0O00000(this);

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final androidx.activity.o00oo0O f2861o00oOoO = new o00oOOoO(false);

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final AtomicInteger f2863o00oOoOO = new AtomicInteger();

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final Map<String, BackStackState> f2864o00oOoOo = Collections.synchronizedMap(new HashMap());

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final Map<String, Bundle> f2865o00oOoo0 = Collections.synchronizedMap(new HashMap());

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final Map<String, o00ooO> f2867o00oOooo = Collections.synchronizedMap(new HashMap());

    /* renamed from: o00oo0  reason: collision with root package name */
    public final androidx.fragment.app.o0O0000O f2869o00oo0 = new androidx.fragment.app.o0O0000O(this);

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o0O00OO> f2873o00oo0OO = new CopyOnWriteArrayList<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o<Configuration> f2872o00oo0O0 = new o() { // from class: androidx.fragment.app.o0O000
        @Override // o0ooOoOO.o
        public final void accept(Object obj) {
            FragmentManager.this.o0O0o00o((Configuration) obj);
        }
    };

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o<Integer> f2871o00oo0O = new o() { // from class: androidx.fragment.app.o0O000O
        @Override // o0ooOoOO.o
        public final void accept(Object obj) {
            FragmentManager.this.o0O0o0((Integer) obj);
        }
    };

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o<oO00OO0O> f2874o00oo0Oo = new o() { // from class: androidx.fragment.app.o0OoOoOo
        @Override // o0ooOoOO.o
        public final void accept(Object obj) {
            FragmentManager.this.o0O0o0O((oO00OO0O) obj);
        }
    };

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final o<ooOOO00O> f2876o00oo0o0 = new o() { // from class: androidx.fragment.app.o0O000Oo
        @Override // o0ooOoOO.o
        public final void accept(Object obj) {
            FragmentManager.this.o0O0o0OO((ooOOO00O) obj);
        }
    };

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final o0O000oo.o0O00OO f2875o00oo0o = new o00oOo00();

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f2877o00oo0oO = -1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public androidx.fragment.app.o00oo f2881o00ooO0O = null;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public androidx.fragment.app.o00oo f2882o00ooO0o = new o00oOo0O();

    /* renamed from: o00ooO  reason: collision with root package name */
    public oo0OOoo f2878o00ooO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public oo0OOoo f2884o00ooOO0 = new o00oOoO();

    /* renamed from: o00ooOo  reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f2886o00ooOo = new ArrayDeque<>();

    /* renamed from: o00oooo  reason: collision with root package name */
    public Runnable f2897o00oooo = new o00oo00O();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f2904o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f2905o00oo0O0;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(@oo0oO0 Parcel parcel) {
            this.f2905o00oo0O0 = parcel.readString();
            this.f2904o00oo0O = parcel.readInt();
        }

        public LaunchedFragmentInfo(@oo0oO0 String str, int i) {
            this.f2905o00oo0O0 = str;
            this.f2904o00oo0O = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2905o00oo0O0);
            parcel.writeInt(this.f2904o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public interface o0 {
        @o0O
        void onBackStackChanged();
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements androidx.activity.result.o00oOOo0<Map<String, Boolean>> {
        public o00oOOo0() {
        }

        @Override // androidx.activity.result.o00oOOo0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: o00oOOoO */
        public void o00oOOo0(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f2886o00ooOo.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f2905o00oo0O0;
            int i2 = pollFirst.f2904o00oo0O;
            Fragment o00oOoOO2 = FragmentManager.this.f2858o00oOo00.o00oOoOO(str);
            if (o00oOoOO2 == null) {
                return;
            }
            o00oOoOO2.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends androidx.activity.o00oo0O {
        public o00oOOoO(boolean z) {
            super(z);
        }

        @Override // androidx.activity.o00oo0O
        public void o00oOo0O() {
            FragmentManager.this.o0O0Oo0o();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o0O000oo.o0O00OO {
        public o00oOo00() {
        }

        @Override // o0O000oo.o0O00OO
        public void o00oOOo0(@oo0oO0 Menu menu) {
            FragmentManager.this.o00ooooO(menu);
        }

        @Override // o0O000oo.o0O00OO
        public void o00oOOoO(@oo0oO0 Menu menu) {
            FragmentManager.this.o0O0000O(menu);
        }

        @Override // o0O000oo.o0O00OO
        public boolean o00oOo00(@oo0oO0 MenuItem menuItem) {
            return FragmentManager.this.o00oooo(menuItem);
        }

        @Override // o0O000oo.o0O00OO
        public void o00oOooO(@oo0oO0 Menu menu, @oo0oO0 MenuInflater menuInflater) {
            FragmentManager.this.o00ooo0(menu, menuInflater);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends androidx.fragment.app.o00oo {
        public o00oOo0O() {
        }

        @Override // androidx.fragment.app.o00oo
        @oo0oO0
        public Fragment o00oOOo0(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) {
            return FragmentManager.this.o0O0OOO0().o00oOooO(FragmentManager.this.o0O0OOO0().o00oOoOo(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements oo0OOoo {
        public o00oOoO() {
        }

        @Override // androidx.fragment.app.oo0OOoo
        @oo0oO0
        public o0OooO0 o00oOOo0(@oo0oO0 ViewGroup viewGroup) {
            return new androidx.fragment.app.o00oOOoO(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o00oOo00.o00oOOo0<IntentSenderRequest, ActivityResult> {
        @Override // o00oOo00.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOo0O */
        public ActivityResult o00oOo00(int i, @o0OO00OO Intent intent) {
            return new ActivityResult(i, intent);
        }

        @Override // o00oOo00.o00oOOo0
        @oo0oO0
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@oo0oO0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(o00oOOoO.o0.f6880o00oOOoO);
            Intent intent2 = intentSenderRequest.f104o00oo0O;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra(o00oOOoO.o00ooO.f6893o00oOOoO)) != null) {
                intent.putExtra(o00oOOoO.o00ooO.f6893o00oOOoO, bundleExtra);
                intent2.removeExtra(o00oOOoO.o00ooO.f6893o00oOOoO);
                if (intent2.getBooleanExtra(FragmentManager.f2855o0OoOoOo, false)) {
                    IntentSenderRequest.o00oOOoO o00ooooo2 = new IntentSenderRequest.o00oOOoO(intentSenderRequest.f105o00oo0O0);
                    o00ooooo2.f109o00oOOoO = null;
                    int i = intentSenderRequest.f107o00oo0o0;
                    int i2 = intentSenderRequest.f106o00oo0Oo;
                    o00ooooo2.f111o00oOooO = i;
                    o00ooooo2.f110o00oOo00 = i2;
                    intentSenderRequest = o00ooooo2.o00oOOo0();
                }
            }
            intent.putExtra(o00oOOoO.o0.f6881o00oOo00, intentSenderRequest);
            if (FragmentManager.oo0OOoo(2)) {
                intent.toString();
            }
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 implements o0O00OO {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Fragment f2912o00oo0O0;

        public o00oo0(Fragment fragment) {
            this.f2912o00oo0O0 = fragment;
        }

        @Override // androidx.fragment.app.o0O00OO
        public void o00oOOo0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
            this.f2912o00oo0O0.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements Runnable {
        public o00oo00O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.o0OoO00O(true);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O {
        @o0OO00OO
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        @o0OOO0O
        int getBreadCrumbShortTitleRes();

        @o0OO00OO
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        @o0OOO0O
        int getBreadCrumbTitleRes();

        int getId();

        @o0OO00OO
        String getName();
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 implements androidx.activity.result.o00oOOo0<ActivityResult> {
        public o00oo0O0() {
        }

        @Override // androidx.activity.result.o00oOOo0
        /* renamed from: o00oOOoO */
        public void o00oOOo0(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f2886o00ooOo.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f2905o00oo0O0;
            int i = pollFirst.f2904o00oo0O;
            Fragment o00oOoOO2 = FragmentManager.this.f2858o00oOo00.o00oOoOO(str);
            if (o00oOoOO2 == null) {
                return;
            }
            o00oOoOO2.onActivityResult(i, activityResult.f74o00oo0O0, activityResult.f73o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements androidx.activity.result.o00oOOo0<ActivityResult> {
        public o00oo0OO() {
        }

        @Override // androidx.activity.result.o00oOOo0
        /* renamed from: o00oOOoO */
        public void o00oOOo0(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f2886o00ooOo.pollFirst();
            if (pollFirst == null) {
                toString();
                return;
            }
            String str = pollFirst.f2905o00oo0O0;
            int i = pollFirst.f2904o00oo0O;
            Fragment o00oOoOO2 = FragmentManager.this.f2858o00oOo00.o00oOoOO(str);
            if (o00oOoOO2 == null) {
                return;
            }
            o00oOoOO2.onActivityResult(i, activityResult.f74o00oo0O0, activityResult.f73o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO implements o0oO0Ooo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final androidx.lifecycle.o0O00 f2916o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0oO0Ooo f2917o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final androidx.lifecycle.o0O00OOO f2918o00oOo00;

        public o00ooO(@oo0oO0 androidx.lifecycle.o0O00 o0o00, @oo0oO0 o0oO0Ooo o0oo0ooo, @oo0oO0 androidx.lifecycle.o0O00OOO o0o00ooo) {
            this.f2916o00oOOo0 = o0o00;
            this.f2917o00oOOoO = o0oo0ooo;
            this.f2918o00oOo00 = o0o00ooo;
        }

        @Override // androidx.fragment.app.o0oO0Ooo
        public void o00oOOo0(@oo0oO0 String str, @oo0oO0 Bundle bundle) {
            this.f2917o00oOOoO.o00oOOo0(str, bundle);
        }

        public boolean o00oOOoO(o0O00.o00oOOoO o00ooooo2) {
            return this.f2916o00oOOo0.o00oOOoO().isAtLeast(o00ooooo2);
        }

        public void o00oOo00() {
            this.f2916o00oOOo0.o00oOooO(this.f2918o00oOo00);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00ooO0 {
        @Deprecated
        public void o00oOOo0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle) {
        }

        public void o00oOOoO(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @oo0oO0 Context context) {
        }

        public void o00oOo00(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle) {
        }

        public void o00oOo0O(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oOo0o(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oOoO(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @o0OO00OO Bundle bundle) {
        }

        public void o00oOoO0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @oo0oO0 Context context) {
        }

        public void o00oOoOO(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oOoOo(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @oo0oO0 Bundle bundle) {
        }

        public void o00oOoo0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oOooO(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oOooo(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oo0(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment) {
        }

        public void o00oo00O(@oo0oO0 FragmentManager fragmentManager, @oo0oO0 Fragment fragment, @oo0oO0 View view, @o0OO00OO Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public class o0O000 implements o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2919o00oOOo0;

        public o0O000(@oo0oO0 String str) {
            this.f2919o00oOOo0 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.o0O00000
        public boolean o00oOOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.o0O0oooO(arrayList, arrayList2, this.f2919o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public interface o0O00000 {
        boolean o00oOOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class o0O0000O implements o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2921o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f2922o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f2923o00oOo00;

        public o0O0000O(@o0OO00OO String str, int i, int i2) {
            this.f2921o00oOOo0 = str;
            this.f2922o00oOOoO = i;
            this.f2923o00oOo00 = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o0O00000
        public boolean o00oOOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f2879o00ooO0;
            if (fragment == null || this.f2922o00oOOoO >= 0 || this.f2921o00oOOo0 != null || !fragment.getChildFragmentManager().o0O0oOO0()) {
                return FragmentManager.this.o0O0oOo0(arrayList, arrayList2, this.f2921o00oOOo0, this.f2922o00oOOoO, this.f2923o00oOo00);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class o0O000O implements o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2925o00oOOo0;

        public o0O000O(@oo0oO0 String str) {
            this.f2925o00oOOo0 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.o0O00000
        public boolean o00oOOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.o0OO00oo(arrayList, arrayList2, this.f2925o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public class o0O0o implements o0O00000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f2927o00oOOo0;

        public o0O0o(@oo0oO0 String str) {
            this.f2927o00oOOo0 = str;
        }

        @Override // androidx.fragment.app.FragmentManager.o0O00000
        public boolean o00oOOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.o00ooO0O(arrayList, arrayList2, this.f2927o00oOOo0);
        }
    }

    public static void o0O00O(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            androidx.fragment.app.o00oOOo0 o00oooo02 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                o00oooo02.o00oooo0(-1);
                o00oooo02.o0O0000O();
            } else {
                o00oooo02.o00oooo0(1);
                o00oooo02.o0O00000();
            }
            i++;
        }
    }

    @oo0oO0
    public static <F extends Fragment> F o0O00OoO(@oo0oO0 View view) {
        F f = (F) o0O00o(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @o0OO00OO
    public static Fragment o0O00o(@oo0oO0 View view) {
        while (view != null) {
            Fragment o0O0Oo02 = o0O0Oo0(view);
            if (o0O0Oo02 != null) {
                return o0O0Oo02;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @oo0oO0
    public static FragmentManager o0O00o0o(@oo0oO0 View view) {
        Fragment o0O00o2 = o0O00o(view);
        if (o0O00o2 != null) {
            if (o0O00o2.isAdded()) {
                return o0O00o2.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + o0O00o2 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        FragmentActivity fragmentActivity = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.o00ooo0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @o0OO00OO
    public static Fragment o0O0Oo0(@oo0oO0 View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0O0o0(Integer num) {
        if (o0O0OoOo() && num.intValue() == 80) {
            o00oooO(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0O0o00o(Configuration configuration) {
        if (o0O0OoOo()) {
            o00ooOoO(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0O0o0O(oO00OO0O oo00oo0o) {
        if (o0O0OoOo()) {
            o00oooOO(oo00oo0o.f9003o00oOOo0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0O0o0OO(ooOOO00O ooooo00o) {
        if (o0O0OoOo()) {
            o0O00000(ooooo00o.f9506o00oOOo0, false);
        }
    }

    public static int o0OO000o(int i) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return 0;
                        }
                        return o0O0oo0o.f3147o00ooo0o;
                    }
                    return 4099;
                }
                return 4100;
            }
            return 4097;
        }
        return 8194;
    }

    @Deprecated
    public static void o0ooOoOO(boolean z) {
        f2853o0O0000o = z;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static boolean oo0OOoo(int i) {
        return f2853o0O0000o || Log.isLoggable("FragmentManager", i);
    }

    public void o0() {
        o0OoOoOo(5);
    }

    @Override // androidx.fragment.app.o0O00o00
    public final void o00oOOo0(@oo0oO0 String str, @oo0oO0 Bundle bundle) {
        o00ooO o00ooo = this.f2867o00oOooo.get(str);
        if (o00ooo == null || !o00ooo.o00oOOoO(o0O00.o00oOOoO.STARTED)) {
            this.f2865o00oOoo0.put(str, bundle);
        } else {
            o00ooo.o00oOOo0(str, bundle);
        }
        if (oo0OOoo(2)) {
            Objects.toString(bundle);
        }
    }

    @Override // androidx.fragment.app.o0O00o00
    @SuppressLint({"SyntheticAccessor"})
    public final void o00oOOoO(@oo0oO0 final String str, @oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o, @oo0oO0 final o0oO0Ooo o0oo0ooo) {
        final androidx.lifecycle.o0O00 lifecycle = o0o0o0o.getLifecycle();
        if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
            return;
        }
        androidx.lifecycle.o0O00OOO o0o00ooo = new androidx.lifecycle.o0O00OOO() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 androidx.lifecycle.o0O0O0O o0o0o0o2, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
                Bundle bundle;
                if (o00oooo02 == o0O00.o00oOOo0.ON_START && (bundle = (Bundle) FragmentManager.this.f2865o00oOoo0.get(str)) != null) {
                    o0oo0ooo.o00oOOo0(str, bundle);
                    FragmentManager.this.o00oOooO(str);
                }
                if (o00oooo02 == o0O00.o00oOOo0.ON_DESTROY) {
                    lifecycle.o00oOooO(this);
                    FragmentManager.this.f2867o00oOooo.remove(str);
                }
            }
        };
        lifecycle.o00oOOo0(o0o00ooo);
        o00ooO put = this.f2867o00oOooo.put(str, new o00ooO(lifecycle, o0oo0ooo, o0o00ooo));
        if (put != null) {
            put.o00oOo00();
        }
        if (oo0OOoo(2)) {
            lifecycle.toString();
            Objects.toString(o0oo0ooo);
        }
    }

    @Override // androidx.fragment.app.o0O00o00
    public final void o00oOo00(@oo0oO0 String str) {
        o00ooO remove = this.f2867o00oOooo.remove(str);
        if (remove != null) {
            remove.o00oOo00();
        }
        oo0OOoo(2);
    }

    @Override // androidx.fragment.app.o0O00o00
    public final void o00oOooO(@oo0oO0 String str) {
        this.f2865o00oOoo0.remove(str);
        oo0OOoo(2);
    }

    public final void o00oo() {
        if (o0O0o00()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public o0O00oO0 o00oo0(@oo0oO0 Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            o0O00OoO.o00oo.o00oOoOO(fragment, str);
        }
        if (oo0OOoo(2)) {
            fragment.toString();
        }
        o0O00oO0 o00ooOO2 = o00ooOO(fragment);
        fragment.mFragmentManager = this;
        this.f2858o00oOo00.o00oo0o0(o00ooOO2);
        if (!fragment.mDetached) {
            this.f2858o00oOo00.o00oOOo0(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (o0O0OoO(fragment)) {
                this.f2888o00ooOoO = true;
            }
        }
        return o00ooOO2;
    }

    public void o00oo00O(androidx.fragment.app.o00oOOo0 o00oooo02) {
        if (this.f2866o00oOooO == null) {
            this.f2866o00oOooO = new ArrayList<>();
        }
        this.f2866o00oOooO.add(o00oooo02);
    }

    public void o00oo0O(@oo0oO0 Fragment fragment) {
        this.f2896o00oooOo.o00oOOo0(fragment);
    }

    public void o00oo0O0(@oo0oO0 o0 o0Var) {
        if (this.f2870o00oo00O == null) {
            this.f2870o00oo00O = new ArrayList<>();
        }
        this.f2870o00oo00O.add(o0Var);
    }

    public void o00oo0OO(@oo0oO0 o0O00OO o0o00oo) {
        this.f2873o00oo0OO.add(o0o00oo);
    }

    public int o00oo0Oo() {
        return this.f2863o00oOoOO.getAndIncrement();
    }

    public void o00oo0o(@oo0oO0 Fragment fragment) {
        if (oo0OOoo(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f2858o00oOo00.o00oOOo0(fragment);
            if (oo0OOoo(2)) {
                fragment.toString();
            }
            if (o0O0OoO(fragment)) {
                this.f2888o00ooOoO = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0o0(@o00oOooO.oo0oO0 androidx.fragment.app.o00ooO0<?> r4, @o00oOooO.oo0oO0 androidx.fragment.app.o00oo0O r5, @o00oOooO.o0OO00OO androidx.fragment.app.Fragment r6) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.o00oo0o0(androidx.fragment.app.o00ooO0, androidx.fragment.app.o00oo0O, androidx.fragment.app.Fragment):void");
    }

    @oo0oO0
    public o0O0oo0o o00oo0oO() {
        return new androidx.fragment.app.o00oOOo0(this);
    }

    public final Set<o0OooO0> o00ooO() {
        HashSet hashSet = new HashSet();
        for (o0O00oO0 o0o00oo0 : this.f2858o00oOo00.o00oOooo()) {
            ViewGroup viewGroup = o0o00oo0.o00oOoo0().mContainer;
            if (viewGroup != null) {
                hashSet.add(o0OooO0.o00oo0OO(viewGroup, o0O0OOoo()));
            }
        }
        return hashSet;
    }

    public void o00ooO0(@oo0oO0 String str) {
        o0O00(new o0O0o(str), false);
    }

    public final void o00ooO00() {
        this.f2857o00oOOoO = false;
        this.f2894o00oooO.clear();
        this.f2893o00ooo0o.clear();
    }

    public boolean o00ooO0O(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, @oo0oO0 String str) {
        if (o0O0oooO(arrayList, arrayList2, str)) {
            return o0O0oOo0(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }

    public final void o00ooO0o() {
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.f2899o0O0o;
        boolean z = true;
        if (o00ooo02 instanceof androidx.lifecycle.o0OO0oO) {
            z = this.f2858o00oOo00.o00oo0O().f3056o00oOo0O;
        } else if (o00ooo02.o00oOoOo() instanceof Activity) {
            z = true ^ ((Activity) this.f2899o0O0o.o00oOoOo()).isChangingConfigurations();
        }
        if (z) {
            for (BackStackState backStackState : this.f2864o00oOoOo.values()) {
                for (String str : backStackState.f2793o00oo0O0) {
                    this.f2858o00oOo00.o00oo0O().o00oOo00(str);
                }
            }
        }
    }

    @oo0oO0
    public o0O00oO0 o00ooOO(@oo0oO0 Fragment fragment) {
        o0O00oO0 o00oo0OO2 = this.f2858o00oOo00.o00oo0OO(fragment.mWho);
        if (o00oo0OO2 != null) {
            return o00oo0OO2;
        }
        o0O00oO0 o0o00oo0 = new o0O00oO0(this.f2869o00oo0, this.f2858o00oOo00, fragment);
        o0o00oo0.o00oo0OO(this.f2899o0O0o.o00oOoOo().getClassLoader());
        o0o00oo0.f3081o00oOo0O = this.f2877o00oo0oO;
        return o0o00oo0;
    }

    public final Set<o0OooO0> o00ooOO0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<o0O0oo0o.o00oOOo0> it = arrayList.get(i).f3151o00oOo00.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3169o00oOOoO;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(o0OooO0.o00oo0(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public void o00ooOOo(@oo0oO0 Fragment fragment) {
        if (oo0OOoo(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (oo0OOoo(2)) {
                fragment.toString();
            }
            this.f2858o00oOo00.o0O0o(fragment);
            if (o0O0OoO(fragment)) {
                this.f2888o00ooOoO = true;
            }
            o0OOooO0(fragment);
        }
    }

    public void o00ooOo() {
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        o0OoOoOo(0);
    }

    public void o00ooOo0() {
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        o0OoOoOo(4);
    }

    public void o00ooOoO(@oo0oO0 Configuration configuration, boolean z) {
        if (z && (this.f2899o0O0o instanceof o00ooo0.o0O0OOO)) {
            o0OO0o0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.o00ooOoO(configuration, true);
                }
            }
        }
    }

    public boolean o00ooOoo(@oo0oO0 MenuItem menuItem) {
        if (this.f2877o00oo0oO < 1) {
            return false;
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean o00ooo0(@oo0oO0 Menu menu, @oo0oO0 MenuInflater menuInflater) {
        if (this.f2877o00oo0oO < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null && o0O0Ooo(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2859o00oOo0O != null) {
            for (int i = 0; i < this.f2859o00oOo0O.size(); i++) {
                Fragment fragment2 = this.f2859o00oOo0O.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2859o00oOo0O = arrayList;
        return z;
    }

    public void o00ooo00() {
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        o0OoOoOo(1);
    }

    public void o00ooo0O() {
        this.f2890o00ooo0 = true;
        o0OoO00O(true);
        o0O000oo();
        o00ooO0o();
        o0OoOoOo(-1);
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.f2899o0O0o;
        if (o00ooo02 instanceof o00ooo0.o0O0OOOo) {
            ((o00ooo0.o0O0OOOo) o00ooo02).o00oo0O(this.f2871o00oo0O);
        }
        androidx.fragment.app.o00ooO0<?> o00ooo03 = this.f2899o0O0o;
        if (o00ooo03 instanceof o00ooo0.o0O0OOO) {
            ((o00ooo0.o0O0OOO) o00ooo03).o00oOo0O(this.f2872o00oo0O0);
        }
        androidx.fragment.app.o00ooO0<?> o00ooo04 = this.f2899o0O0o;
        if (o00ooo04 instanceof oOo0oooO) {
            ((oOo0oooO) o00ooo04).o00oOo00(this.f2874o00oo0Oo);
        }
        androidx.fragment.app.o00ooO0<?> o00ooo05 = this.f2899o0O0o;
        if (o00ooo05 instanceof oOo0o0oO) {
            ((oOo0o0oO) o00ooo05).o00oo0OO(this.f2876o00oo0o0);
        }
        androidx.fragment.app.o00ooO0<?> o00ooo06 = this.f2899o0O0o;
        if (o00ooo06 instanceof o0O000oo.o0O000o0) {
            ((o0O000oo.o0O000o0) o00ooo06).removeMenuProvider(this.f2875o00oo0o);
        }
        this.f2899o0O0o = null;
        this.f2868o00oo = null;
        this.f2880o00ooO00 = null;
        if (this.f2862o00oOoO0 != null) {
            this.f2861o00oOoO.o00oOoO0();
            this.f2862o00oOoO0 = null;
        }
        androidx.activity.result.o00oo0OO<Intent> o00oo0oo = this.f2883o00ooOO;
        if (o00oo0oo != null) {
            o00oo0oo.o00oOooO();
            this.f2885o00ooOOo.o00oOooO();
            this.f2887o00ooOo0.o00oOooO();
        }
    }

    public void o00ooo0o() {
        o0OoOoOo(1);
    }

    public void o00oooO(boolean z) {
        if (z && (this.f2899o0O0o instanceof o00ooo0.o0O0OOOo)) {
            o0OO0o0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.o00oooO(true);
                }
            }
        }
    }

    public void o00oooOO(boolean z, boolean z2) {
        if (z2 && (this.f2899o0O0o instanceof oOo0oooO)) {
            o0OO0o0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.o00oooOO(z, true);
                }
            }
        }
    }

    public void o00oooOo(@oo0oO0 Fragment fragment) {
        Iterator<o0O00OO> it = this.f2873o00oo0OO.iterator();
        while (it.hasNext()) {
            it.next().o00oOOo0(this, fragment);
        }
    }

    public boolean o00oooo(@oo0oO0 MenuItem menuItem) {
        if (this.f2877o00oo0oO < 1) {
            return false;
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void o00oooo0() {
        for (Fragment fragment : this.f2858o00oOo00.o00oo00O()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o00oooo0();
            }
        }
    }

    public void o00ooooO(@oo0oO0 Menu menu) {
        if (this.f2877o00oo0oO < 1) {
            return;
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void o00ooooo(@o0OO00OO Fragment fragment) {
        if (fragment == null || !fragment.equals(o0O00Oo(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void o0O(@o0OO00OO Parcelable parcelable) {
        o0O00oO0 o0o00oo0;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(f2847o0) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2899o0O0o.o00oOoOo().getClassLoader());
                this.f2865o00oOoo0.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(f2852o0O0000O) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2899o0O0o.o00oOoOo().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f2858o00oOo00.o00ooO0(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f2858o00oOo00.o00oo();
        Iterator<String> it = fragmentManagerState.f2931o00oo0O0.iterator();
        while (it.hasNext()) {
            FragmentState o00ooOO02 = this.f2858o00oOo00.o00ooOO0(it.next(), null);
            if (o00ooOO02 != null) {
                Fragment o00oOo0O2 = this.f2896o00oooOo.o00oOo0O(o00ooOO02.f2938o00oo0O);
                if (o00oOo0O2 != null) {
                    if (oo0OOoo(2)) {
                        o00oOo0O2.toString();
                    }
                    o0o00oo0 = new o0O00oO0(this.f2869o00oo0, this.f2858o00oOo00, o00oOo0O2, o00ooOO02);
                } else {
                    o0o00oo0 = new o0O00oO0(this.f2869o00oo0, this.f2858o00oOo00, this.f2899o0O0o.o00oOoOo().getClassLoader(), o0O0OO0(), o00ooOO02);
                }
                Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
                o00oOoo02.mFragmentManager = this;
                if (oo0OOoo(2)) {
                    o00oOoo02.toString();
                }
                o0o00oo0.o00oo0OO(this.f2899o0O0o.o00oOoOo().getClassLoader());
                this.f2858o00oOo00.o00oo0o0(o0o00oo0);
                o0o00oo0.o00oo0oO(this.f2877o00oo0oO);
            }
        }
        for (Fragment fragment : this.f2896o00oooOo.o00oOoO()) {
            if (!this.f2858o00oOo00.o00oOo00(fragment.mWho)) {
                if (oo0OOoo(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.f2931o00oo0O0);
                }
                this.f2896o00oooOo.o00oOooo(fragment);
                fragment.mFragmentManager = this;
                o0O00oO0 o0o00oo02 = new o0O00oO0(this.f2869o00oo0, this.f2858o00oOo00, fragment);
                o0o00oo02.f3081o00oOo0O = 1;
                o0o00oo02.o00oo00O();
                fragment.mRemoving = true;
                o0o00oo02.o00oo00O();
            }
        }
        this.f2858o00oOo00.o00ooO00(fragmentManagerState.f2930o00oo0O);
        if (fragmentManagerState.f2932o00oo0Oo != null) {
            this.f2866o00oOooO = new ArrayList<>(fragmentManagerState.f2932o00oo0Oo.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f2932o00oo0Oo;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.o00oOOo0 o00oOOoO2 = backStackRecordStateArr[i].o00oOOoO(this);
                if (oo0OOoo(2)) {
                    int i2 = o00oOOoO2.f2967o00oooOo;
                    o00oOOoO2.toString();
                    PrintWriter printWriter = new PrintWriter(new o0O0OOOo("FragmentManager"));
                    o00oOOoO2.o0("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2866o00oOooO.add(o00oOOoO2);
                i++;
            }
        } else {
            this.f2866o00oOooO = null;
        }
        this.f2863o00oOoOO.set(fragmentManagerState.f2934o00oo0o0);
        String str3 = fragmentManagerState.f2933o00oo0o;
        if (str3 != null) {
            Fragment o0O00Oo2 = o0O00Oo(str3);
            this.f2879o00ooO0 = o0O00Oo2;
            o00ooooo(o0O00Oo2);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f2935o00oo0oO;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                this.f2864o00oOoOo.put(arrayList2.get(i3), fragmentManagerState.f2936o0O0o.get(i3));
            }
        }
        this.f2886o00ooOo = new ArrayDeque<>(fragmentManagerState.f2929o00oo);
    }

    public void o0O00(@oo0oO0 o0O00000 o0o00000, boolean z) {
        if (!z) {
            if (this.f2899o0O0o == null) {
                if (!this.f2890o00ooo0) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o00oo();
        }
        synchronized (this.f2856o00oOOo0) {
            if (this.f2899o0O0o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f2856o00oOOo0.add(o0o00000);
            o0OO00o0();
        }
    }

    public void o0O000() {
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        o0OoOoOo(7);
    }

    public void o0O00000(boolean z, boolean z2) {
        if (z2 && (this.f2899o0O0o instanceof oOo0o0oO)) {
            o0OO0o0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.o0O00000(z, true);
                }
            }
        }
    }

    public boolean o0O0000O(@oo0oO0 Menu menu) {
        boolean z = false;
        if (this.f2877o00oo0oO < 1) {
            return false;
        }
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null && o0O0Ooo(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void o0O0000o() {
        o0OO0o0o();
        o00ooooo(this.f2879o00ooO0);
    }

    public void o0O000O() {
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        o0OoOoOo(5);
    }

    public void o0O000Oo() {
        this.f2891o00ooo00 = true;
        this.f2896o00oooOo.f3058o00oOoO0 = true;
        o0OoOoOo(4);
    }

    public void o0O000o(@oo0oO0 String str, @o0OO00OO FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @o0OO00OO String[] strArr) {
        int size;
        int size2;
        String o00oOOo02 = o00oOoOo.o00oo.o00oOOo0(str, "    ");
        this.f2858o00oOo00.o00oOo0O(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2859o00oOo0O;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2859o00oOo0O.get(i).toString());
            }
        }
        ArrayList<androidx.fragment.app.o00oOOo0> arrayList2 = this.f2866o00oOooO;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.o00oOOo0 o00oooo02 = this.f2866o00oOooO.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(o00oooo02.toString());
                o00oooo02.o0(o00oOOo02, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2863o00oOoOO.get());
        synchronized (this.f2856o00oOOo0) {
            int size3 = this.f2856o00oOOo0.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f2856o00oOOo0.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2899o0O0o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2868o00oo);
        if (this.f2880o00ooO00 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2880o00ooO00);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2877o00oo0oO);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2889o00ooOoo);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2891o00ooo00);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2890o00ooo0);
        if (this.f2888o00ooOoO) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2888o00ooOoO);
        }
    }

    public final void o0O000o0() {
        if (this.f2892o00ooo0O) {
            this.f2892o00ooo0O = false;
            o0OO0o00();
        }
    }

    public final void o0O000oo() {
        for (o0OooO0 o0oooo0 : o00ooO()) {
            o0oooo0.o00oOoOo();
        }
    }

    public final void o0O00O0(boolean z) {
        if (this.f2857o00oOOoO) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2899o0O0o == null) {
            if (!this.f2890o00ooo0) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f2899o0O0o.o00oOooo().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                o00oo();
            }
            if (this.f2893o00ooo0o == null) {
                this.f2893o00ooo0o = new ArrayList<>();
                this.f2894o00oooO = new ArrayList<>();
            }
        }
    }

    public void o0O00O0o(@oo0oO0 o0O00000 o0o00000, boolean z) {
        if (z && (this.f2899o0O0o == null || this.f2890o00ooo0)) {
            return;
        }
        o0O00O0(z);
        if (o0o00000.o00oOOo0(this.f2893o00ooo0o, this.f2894o00oooO)) {
            this.f2857o00oOOoO = true;
            try {
                o0O0oo(this.f2893o00ooo0o, this.f2894o00oooO);
            } finally {
                o00ooO00();
            }
        }
        o0OO0o0o();
        o0O000o0();
        this.f2858o00oOo00.o00oOOoO();
    }

    public final void o0O00OO(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, int i, int i2) {
        boolean z = arrayList.get(i).f3166o00oo0Oo;
        ArrayList<Fragment> arrayList3 = this.f2895o00oooOO;
        if (arrayList3 == null) {
            this.f2895o00oooOO = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f2895o00oooOO.addAll(this.f2858o00oOo00.o00oo0O0());
        Fragment o0O0OOoO2 = o0O0OOoO();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.o00oOOo0 o00oooo02 = arrayList.get(i3);
            o0O0OOoO2 = !arrayList2.get(i3).booleanValue() ? o00oooo02.o0O0000o(this.f2895o00oooOO, o0O0OOoO2) : o00oooo02.o0O000O(this.f2895o00oooOO, o0O0OOoO2);
            z2 = z2 || o00oooo02.f3156o00oOoOO;
        }
        this.f2895o00oooOO.clear();
        if (!z && this.f2877o00oo0oO >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<o0O0oo0o.o00oOOo0> it = arrayList.get(i4).f3151o00oOo00.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3169o00oOOoO;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f2858o00oOo00.o00oo0o0(o00ooOO(fragment));
                    }
                }
            }
        }
        o0O00O(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        for (int i5 = i; i5 < i2; i5++) {
            androidx.fragment.app.o00oOOo0 o00oooo03 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = o00oooo03.f3151o00oOo00.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = o00oooo03.f3151o00oOo00.get(size).f3169o00oOOoO;
                    if (fragment2 != null) {
                        o00ooOO(fragment2).o00oo00O();
                    }
                }
            } else {
                Iterator<o0O0oo0o.o00oOOo0> it2 = o00oooo03.f3151o00oOo00.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f3169o00oOOoO;
                    if (fragment3 != null) {
                        o00ooOO(fragment3).o00oo00O();
                    }
                }
            }
        }
        o0oOo0O0(this.f2877o00oo0oO, true);
        for (o0OooO0 o0oooo0 : o00ooOO0(arrayList, i, i2)) {
            o0oooo0.o00oo0Oo(booleanValue);
            o0oooo0.o00oo0O0();
            o0oooo0.o00oOoO0();
        }
        while (i < i2) {
            androidx.fragment.app.o00oOOo0 o00oooo04 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && o00oooo04.f2967o00oooOo >= 0) {
                o00oooo04.f2967o00oooOo = -1;
            }
            o00oooo04.o0O000();
            i++;
        }
        if (z2) {
            o0O0ooOO();
        }
    }

    public boolean o0O00OOO() {
        boolean o0OoO00O2 = o0OoO00O(true);
        o0O00oO0();
        return o0OoO00O2;
    }

    @o0OO00OO
    public Fragment o0O00Oo(@oo0oO0 String str) {
        return this.f2858o00oOo00.o00oOo0o(str);
    }

    @o0OO00OO
    public Fragment o0O00Ooo(@o00oOooO.oo0OOoo int i) {
        return this.f2858o00oOo00.o00oOoO0(i);
    }

    @o0OO00OO
    public Fragment o0O00o00(@o0OO00OO String str) {
        return this.f2858o00oOo00.o00oOoO(str);
    }

    public Fragment o0O00o0O(@oo0oO0 String str) {
        return this.f2858o00oOo00.o00oOoOO(str);
    }

    public final void o0O00oO0() {
        for (o0OooO0 o0oooo0 : o00ooO()) {
            o0oooo0.o00oOoo0();
        }
    }

    public final boolean o0O0O0O(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f2856o00oOOo0) {
            if (this.f2856o00oOOo0.isEmpty()) {
                return false;
            }
            int size = this.f2856o00oOOo0.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f2856o00oOOo0.get(i).o00oOOo0(arrayList, arrayList2);
            }
            this.f2856o00oOOo0.clear();
            this.f2899o0O0o.o00oOooo().removeCallbacks(this.f2897o00oooo);
            return z;
        }
    }

    @oo0oO0
    public o00oo0O o0O0O0Oo(int i) {
        return this.f2866o00oOooO.get(i);
    }

    @oo0oO0
    public final o0O00O o0O0O0o(@oo0oO0 Fragment fragment) {
        return this.f2896o00oooOo.o00oOo0o(fragment);
    }

    public int o0O0O0o0() {
        ArrayList<androidx.fragment.app.o00oOOo0> arrayList = this.f2866o00oOooO;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @oo0oO0
    public androidx.fragment.app.o00oo0O o0O0O0oO() {
        return this.f2868o00oo;
    }

    @o0OO00OO
    public Fragment o0O0O0oo(@oo0oO0 Bundle bundle, @oo0oO0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment o0O00Oo2 = o0O00Oo(string);
        if (o0O00Oo2 == null) {
            o0OO0o0(new IllegalStateException(o0O00.o00oOOo0("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return o0O00Oo2;
    }

    @oo0oO0
    public List<Fragment> o0O0OO() {
        return this.f2858o00oOo00.o00oo0O0();
    }

    @oo0oO0
    public androidx.fragment.app.o00oo o0O0OO0() {
        androidx.fragment.app.o00oo o00ooVar = this.f2881o00ooO0O;
        if (o00ooVar != null) {
            return o00ooVar;
        }
        Fragment fragment = this.f2880o00ooO00;
        return fragment != null ? fragment.mFragmentManager.o0O0OO0() : this.f2882o00ooO0o;
    }

    @oo0oO0
    public o0oO0O0o o0O0OO0O() {
        return this.f2858o00oOo00;
    }

    @oo0oO0
    public LayoutInflater.Factory2 o0O0OOO() {
        return this.f2860o00oOo0o;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public androidx.fragment.app.o00ooO0<?> o0O0OOO0() {
        return this.f2899o0O0o;
    }

    @oo0oO0
    public androidx.fragment.app.o0O0000O o0O0OOOo() {
        return this.f2869o00oo0;
    }

    @o0OO00OO
    public Fragment o0O0OOo() {
        return this.f2880o00ooO00;
    }

    @o0OO00OO
    public Fragment o0O0OOoO() {
        return this.f2879o00ooO0;
    }

    @oo0oO0
    public oo0OOoo o0O0OOoo() {
        oo0OOoo oo0oooo = this.f2878o00ooO;
        if (oo0oooo != null) {
            return oo0oooo;
        }
        Fragment fragment = this.f2880o00ooO00;
        return fragment != null ? fragment.mFragmentManager.o0O0OOoo() : this.f2884o00ooOO0;
    }

    public void o0O0Oo(@oo0oO0 Fragment fragment) {
        if (oo0OOoo(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        o0OOooO0(fragment);
    }

    @oo0oO0
    public o0OO0oO0 o0O0Oo0O(@oo0oO0 Fragment fragment) {
        return this.f2896o00oooOo.o00oOoOo(fragment);
    }

    public void o0O0Oo0o() {
        o0OoO00O(true);
        if (this.f2861o00oOoO.o00oOo0o()) {
            o0O0oOO0();
        } else {
            this.f2862o00oOoO0.o00oOoO0();
        }
    }

    public final boolean o0O0OoO(@oo0oO0 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o0O0o();
    }

    public boolean o0O0OoO0() {
        return this.f2890o00ooo0;
    }

    public final boolean o0O0OoOo() {
        Fragment fragment = this.f2880o00ooO00;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f2880o00ooO00.getParentFragmentManager().o0O0OoOo();
    }

    public boolean o0O0Ooo(@o0OO00OO Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean o0O0Ooo0(@o0OO00OO Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean o0O0OooO(@o0OO00OO Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.o0O0OOoO()) && o0O0OooO(fragmentManager.f2880o00ooO00);
    }

    public void o0O0Oooo(@oo0oO0 Fragment fragment) {
        if (fragment.mAdded && o0O0OoO(fragment)) {
            this.f2888o00ooOoO = true;
        }
    }

    public boolean o0O0o() {
        boolean z = false;
        for (Fragment fragment : this.f2858o00oOo00.o00oo00O()) {
            if (fragment != null) {
                z = o0O0OoO(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean o0O0o00() {
        return this.f2889o00ooOoo || this.f2891o00ooo00;
    }

    public boolean o0O0o000(int i) {
        return this.f2877o00oo0oO >= i;
    }

    public void o0O0o0Oo(@oo0oO0 Fragment fragment, @oo0oO0 String[] strArr, int i) {
        if (this.f2887o00ooOo0 == null) {
            this.f2899o0O0o.o0O0o(fragment, strArr, i);
            return;
        }
        this.f2886o00ooOo.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        this.f2887o00ooOo0.o00oOOoO(strArr);
    }

    public void o0O0o0o(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @o0OO00OO Intent intent, int i2, int i3, int i4, @o0OO00OO Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f2885o00ooOOo == null) {
            this.f2899o0O0o.o00ooO0o(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(f2855o0OoOoOo, true);
            } else {
                intent2 = intent;
            }
            if (oo0OOoo(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(fragment);
            }
            intent2.putExtra(o00oOOoO.o00ooO.f6893o00oOOoO, bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest.o00oOOoO o00ooooo2 = new IntentSenderRequest.o00oOOoO(intentSender);
        o00ooooo2.f109o00oOOoO = intent2;
        o00ooooo2.f111o00oOooO = i3;
        o00ooooo2.f110o00oOo00 = i2;
        IntentSenderRequest o00oOOo02 = o00ooooo2.o00oOOo0();
        this.f2886o00ooOo.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (oo0OOoo(2)) {
            fragment.toString();
        }
        this.f2885o00ooOOo.o00oOOoO(o00oOOo02);
    }

    public void o0O0o0o0(@oo0oO0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @o0OO00OO Bundle bundle) {
        if (this.f2883o00ooOO == null) {
            this.f2899o0O0o.o00ooO0O(fragment, intent, i, bundle);
            return;
        }
        this.f2886o00ooOo.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (intent != null && bundle != null) {
            intent.putExtra(o00oOOoO.o00ooO.f6893o00oOOoO, bundle);
        }
        this.f2883o00ooOO.o00oOOoO(intent);
    }

    public void o0O0o0oO() {
        if (this.f2899o0O0o == null) {
            return;
        }
        this.f2889o00ooOoo = false;
        this.f2891o00ooo00 = false;
        this.f2896o00oooOo.f3058o00oOoO0 = false;
        for (Fragment fragment : this.f2858o00oOo00.o00oo0O0()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void o0O0o0oo(@oo0oO0 FragmentContainerView fragmentContainerView) {
        View view;
        for (o0O00oO0 o0o00oo0 : this.f2858o00oOo00.o00oOooo()) {
            Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
            if (o00oOoo02.mContainerId == fragmentContainerView.getId() && (view = o00oOoo02.mView) != null && view.getParent() == null) {
                o00oOoo02.mContainer = fragmentContainerView;
                o0o00oo0.o00oOOoO();
            }
        }
    }

    public void o0O0oO(@o0OO00OO String str, int i) {
        o0O00(new o0O0000O(str, -1, i), false);
    }

    public void o0O0oO0() {
        o0O00(new o0O0000O(null, -1, 0), false);
    }

    public void o0O0oO0O(int i, int i2) {
        o0O0oO0o(i, i2, false);
    }

    public void o0O0oO0o(int i, int i2, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Bad id: ", i));
        }
        o0O00(new o0O0000O(null, i, i2), z);
    }

    public boolean o0O0oOO(int i, int i2) {
        if (i >= 0) {
            return o0O0oOOO(null, i, i2);
        }
        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Bad id: ", i));
    }

    public boolean o0O0oOO0() {
        return o0O0oOOO(null, -1, 0);
    }

    public final boolean o0O0oOOO(@o0OO00OO String str, int i, int i2) {
        o0OoO00O(false);
        o0O00O0(true);
        Fragment fragment = this.f2879o00ooO0;
        if (fragment == null || i >= 0 || str != null || !fragment.getChildFragmentManager().o0O0oOO0()) {
            boolean o0O0oOo02 = o0O0oOo0(this.f2893o00ooo0o, this.f2894o00oooO, str, i, i2);
            if (o0O0oOo02) {
                this.f2857o00oOOoO = true;
                try {
                    o0O0oo(this.f2893o00ooo0o, this.f2894o00oooO);
                } finally {
                    o00ooO00();
                }
            }
            o0OO0o0o();
            o0O000o0();
            this.f2858o00oOo00.o00oOOoO();
            return o0O0oOo02;
        }
        return true;
    }

    public void o0O0oOo(@oo0oO0 o00ooO0 o00ooo02, boolean z) {
        this.f2869o00oo0.o00oo0OO(o00ooo02, z);
    }

    public boolean o0O0oOo0(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, @o0OO00OO String str, int i, int i2) {
        int o0oO0Ooo2 = o0oO0Ooo(str, i, (i2 & 1) != 0);
        if (o0oO0Ooo2 < 0) {
            return false;
        }
        for (int size = this.f2866o00oOooO.size() - 1; size >= o0oO0Ooo2; size--) {
            arrayList.add(this.f2866o00oOooO.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void o0O0oOoO(@oo0oO0 Fragment fragment) {
        if (oo0OOoo(2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f2858o00oOo00.o0O0o(fragment);
            if (o0O0OoO(fragment)) {
                this.f2888o00ooOoO = true;
            }
            fragment.mRemoving = true;
            o0OOooO0(fragment);
        }
    }

    public void o0O0oOoo(@oo0oO0 o0O00OO o0o00oo) {
        this.f2873o00oo0OO.remove(o0o00oo);
    }

    public final void o0O0oo(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f3166o00oo0Oo) {
                if (i2 != i) {
                    o0O00OO(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3166o00oo0Oo) {
                        i2++;
                    }
                }
                o0O00OO(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            o0O00OO(arrayList, arrayList2, i2, size);
        }
    }

    public void o0O0oo0(@oo0oO0 o0 o0Var) {
        ArrayList<o0> arrayList = this.f2870o00oo00O;
        if (arrayList != null) {
            arrayList.remove(o0Var);
        }
    }

    public boolean o0O0oo00(@o0OO00OO String str, int i) {
        return o0O0oOOO(str, -1, i);
    }

    @oo0oO0
    @Deprecated
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o0O0oo0o o0O0oo0O() {
        return o00oo0oO();
    }

    @oo0oO0
    public List<Fragment> o0O0oo0o() {
        return this.f2858o00oOo00.o00oo00O();
    }

    public void o0O0ooO0(@oo0oO0 Fragment fragment) {
        this.f2896o00oooOo.o00oOooo(fragment);
    }

    public final void o0O0ooOO() {
        if (this.f2870o00oo00O != null) {
            for (int i = 0; i < this.f2870o00oo00O.size(); i++) {
                this.f2870o00oo00O.get(i).onBackStackChanged();
            }
        }
    }

    public void o0O0ooo(@oo0oO0 String str) {
        o0O00(new o0O000(str), false);
    }

    public void o0O0ooo0(@o0OO00OO Parcelable parcelable, @o0OO00OO o0O00O0o o0o00o0o) {
        if (this.f2899o0O0o instanceof androidx.lifecycle.o0OO0oO) {
            o0OO0o0(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f2896o00oooOo.o00oo00O(o0o00o0o);
        o0O(parcelable);
    }

    public boolean o0O0oooO(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, @oo0oO0 String str) {
        boolean z;
        BackStackState remove = this.f2864o00oOoOo.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.o00oOOo0> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.o00oOOo0 next = it.next();
            if (next.f2968o00oooo0) {
                Iterator<o0O0oo0o.o00oOOo0> it2 = next.f3151o00oOo00.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f3169o00oOOoO;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        while (true) {
            for (androidx.fragment.app.o00oOOo0 o00oooo02 : remove.o00oOOo0(this, hashMap)) {
                z = o00oooo02.o00oOOo0(arrayList, arrayList2) || z;
            }
            return z;
        }
    }

    public void o0O0oooo(@o0OO00OO Parcelable parcelable) {
        if (this.f2899o0O0o instanceof o0O0OOo.o00oOo0O) {
            o0OO0o0(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        o0O(parcelable);
    }

    public void o0OO0(@oo0oO0 Fragment fragment, @oo0oO0 o0O00.o00oOOoO o00ooooo2) {
        if (fragment.equals(o0O00Oo(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = o00ooooo2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Deprecated
    public o0O00O0o o0OO000() {
        if (this.f2899o0O0o instanceof androidx.lifecycle.o0OO0oO) {
            o0OO0o0(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f2896o00oooOo.o00oOoOO();
    }

    public void o0OO00OO(@oo0oO0 String str) {
        o0O00(new o0O000O(str), false);
    }

    @o0OO00OO
    public Fragment.SavedState o0OO00Oo(@oo0oO0 Fragment fragment) {
        o0O00oO0 o00oo0OO2 = this.f2858o00oOo00.o00oo0OO(fragment.mWho);
        if (o00oo0OO2 == null || !o00oo0OO2.o00oOoo0().equals(fragment)) {
            o0OO0o0(new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        return o00oo0OO2.o00oo0Oo();
    }

    public void o0OO00o(@oo0oO0 androidx.fragment.app.o00oo o00ooVar) {
        this.f2881o00ooO0O = o00ooVar;
    }

    public void o0OO00o0() {
        synchronized (this.f2856o00oOOo0) {
            boolean z = true;
            if (this.f2856o00oOOo0.size() != 1) {
                z = false;
            }
            if (z) {
                this.f2899o0O0o.o00oOooo().removeCallbacks(this.f2897o00oooo);
                this.f2899o0O0o.o00oOooo().post(this.f2897o00oooo);
                o0OO0o0o();
            }
        }
    }

    public boolean o0OO00oo(@oo0oO0 ArrayList<androidx.fragment.app.o00oOOo0> arrayList, @oo0oO0 ArrayList<Boolean> arrayList2, @oo0oO0 String str) {
        StringBuilder sb;
        HashSet hashSet;
        int i;
        int o0oO0Ooo2 = o0oO0Ooo(str, -1, true);
        if (o0oO0Ooo2 < 0) {
            return false;
        }
        for (int i2 = o0oO0Ooo2; i2 < this.f2866o00oOooO.size(); i2++) {
            androidx.fragment.app.o00oOOo0 o00oooo02 = this.f2866o00oOooO.get(i2);
            if (!o00oooo02.f3166o00oo0Oo) {
                o0OO0o0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + o00oooo02 + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet2 = new HashSet();
        for (int i3 = o0oO0Ooo2; i3 < this.f2866o00oOooO.size(); i3++) {
            androidx.fragment.app.o00oOOo0 o00oooo03 = this.f2866o00oOooO.get(i3);
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            Iterator<o0O0oo0o.o00oOOo0> it = o00oooo03.f3151o00oOo00.iterator();
            while (it.hasNext()) {
                o0O0oo0o.o00oOOo0 next = it.next();
                Fragment fragment = next.f3169o00oOOoO;
                if (fragment != null) {
                    if (!next.f3170o00oOo00 || (i = next.f3168o00oOOo0) == 1 || i == 2 || i == 8) {
                        hashSet2.add(fragment);
                        hashSet3.add(fragment);
                    }
                    int i4 = next.f3168o00oOOo0;
                    if (i4 == 1 || i4 == 2) {
                        hashSet4.add(fragment);
                    }
                }
            }
            hashSet3.removeAll(hashSet4);
            if (!hashSet3.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet3.size() == 1) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(" ");
                    hashSet = hashSet3.iterator().next();
                    sb = o00oOOo02;
                } else {
                    hashSet = hashSet3;
                    sb = android.support.v4.media.o00oOo0O.o00oOOo0("s ");
                }
                sb.append(hashSet);
                sb2.append(sb.toString());
                sb2.append(" in ");
                sb2.append(o00oooo03);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                o0OO0o0(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet2);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet2.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                o0OO0o0(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.o0O0oo0o()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f2866o00oOooO.size() - o0oO0Ooo2);
        for (int i5 = o0oO0Ooo2; i5 < this.f2866o00oOooO.size(); i5++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f2866o00oOooO.size() - 1; size >= o0oO0Ooo2; size--) {
            androidx.fragment.app.o00oOOo0 remove = this.f2866o00oOooO.remove(size);
            androidx.fragment.app.o00oOOo0 o00oooo04 = new androidx.fragment.app.o00oOOo0(remove);
            o00oooo04.o00oooo();
            arrayList4.set(size - o0oO0Ooo2, new BackStackRecordState(o00oooo04));
            remove.f2968o00oooo0 = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f2864o00oOoOo.put(str, backStackState);
        return true;
    }

    public void o0OO0O0(@o0OO00OO Fragment fragment) {
        if (fragment == null || (fragment.equals(o0O00Oo(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f2879o00ooO0;
            this.f2879o00ooO0 = fragment;
            o00ooooo(fragment2);
            o00ooooo(this.f2879o00ooO0);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void o0OO0O0O(@oo0oO0 oo0OOoo oo0oooo) {
        this.f2878o00ooO = oo0oooo;
    }

    public void o0OO0OoO(@o0OO00OO o00oo.o00oOo00 o00ooo002) {
        this.f2898o00oooo0 = o00ooo002;
    }

    public void o0OO0Ooo(@oo0oO0 Fragment fragment) {
        if (oo0OOoo(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void o0OO0o0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new o0O0OOOo("FragmentManager"));
        androidx.fragment.app.o00ooO0<?> o00ooo02 = this.f2899o0O0o;
        try {
            if (o00ooo02 != null) {
                o00ooo02.o00oo0("  ", null, printWriter, new String[0]);
            } else {
                o0O000o("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw runtimeException;
    }

    public final void o0OO0o00() {
        for (o0O00oO0 o0o00oo0 : this.f2858o00oOo00.o00oOooo()) {
            oooOO0(o0o00oo0);
        }
    }

    public void o0OO0o0O(@oo0oO0 o00ooO0 o00ooo02) {
        this.f2869o00oo0.o00oo0O0(o00ooo02);
    }

    public final void o0OO0o0o() {
        synchronized (this.f2856o00oOOo0) {
            boolean z = true;
            if (this.f2856o00oOOo0.isEmpty()) {
                this.f2861o00oOoO.o00oOoOO((o0O0O0o0() <= 0 || !o0O0OooO(this.f2880o00ooO00)) ? false : false);
            } else {
                this.f2861o00oOoO.o00oOoOO(true);
            }
        }
    }

    public final void o0OOooO0(@oo0oO0 Fragment fragment) {
        ViewGroup o0ooO2 = o0ooO(fragment);
        if (o0ooO2 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i = R.id.visible_removing_fragment_view_tag;
                if (o0ooO2.getTag(i) == null) {
                    o0ooO2.setTag(i, fragment);
                }
                ((Fragment) o0ooO2.getTag(i)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public boolean o0OoO00O(boolean z) {
        o0O00O0(z);
        boolean z2 = false;
        while (o0O0O0O(this.f2893o00ooo0o, this.f2894o00oooO)) {
            this.f2857o00oOOoO = true;
            try {
                o0O0oo(this.f2893o00ooo0o, this.f2894o00oooO);
                o00ooO00();
                z2 = true;
            } catch (Throwable th) {
                o00ooO00();
                throw th;
            }
        }
        o0OO0o0o();
        o0O000o0();
        this.f2858o00oOo00.o00oOOoO();
        return z2;
    }

    public void o0OoOoO(@oo0oO0 Fragment fragment, boolean z) {
        ViewGroup o0ooO2 = o0ooO(fragment);
        if (o0ooO2 == null || !(o0ooO2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) o0ooO2).setDrawDisappearingViewsLast(!z);
    }

    public void o0OoOoOO() {
        o0OoOoOo(2);
    }

    public final void o0OoOoOo(int i) {
        try {
            this.f2857o00oOOoO = true;
            this.f2858o00oOo00.o00oOooO(i);
            o0oOo0O0(i, false);
            for (o0OooO0 o0oooo0 : o00ooO()) {
                o0oooo0.o00oOoOo();
            }
            this.f2857o00oOOoO = false;
            o0OoO00O(true);
        } catch (Throwable th) {
            this.f2857o00oOOoO = false;
            throw th;
        }
    }

    @o0OO00OO
    public o00oo.o00oOo00 o0OooO0() {
        return this.f2898o00oooo0;
    }

    public int o0oO0O0o() {
        return this.f2858o00oOo00.o00oOoo0();
    }

    public final int o0oO0Ooo(@o0OO00OO String str, int i, boolean z) {
        ArrayList<androidx.fragment.app.o00oOOo0> arrayList = this.f2866o00oOooO;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f2866o00oOooO.size() - 1;
        }
        int size = this.f2866o00oOooO.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.o00oOOo0 o00oooo02 = this.f2866o00oOooO.get(size);
            if ((str != null && str.equals(o00oooo02.f3158o00oOoo0)) || (i >= 0 && i == o00oooo02.f2967o00oooOo)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f2866o00oOooO.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.o00oOOo0 o00oooo03 = this.f2866o00oOooO.get(size - 1);
            if ((str == null || !str.equals(o00oooo03.f3158o00oOoo0)) && (i < 0 || i != o00oooo03.f2967o00oooOo)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public void o0oOo0O0(int i, boolean z) {
        androidx.fragment.app.o00ooO0<?> o00ooo02;
        if (this.f2899o0O0o == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f2877o00oo0oO) {
            this.f2877o00oo0oO = i;
            this.f2858o00oOo00.o00oo0oO();
            o0OO0o00();
            if (this.f2888o00ooOoO && (o00ooo02 = this.f2899o0O0o) != null && this.f2877o00oo0oO == 7) {
                o00ooo02.o00ooO();
                this.f2888o00ooOoO = false;
            }
        }
    }

    public final ViewGroup o0ooO(@oo0oO0 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f2868o00oo.o00oOoO0()) {
            View o00oOo0o2 = this.f2868o00oo.o00oOo0o(fragment.mContainerId);
            if (o00oOo0o2 instanceof ViewGroup) {
                return (ViewGroup) o00oOo0o2;
            }
        }
        return null;
    }

    public Parcelable oo0oO0() {
        if (this.f2899o0O0o instanceof o0O0OOo.o00oOo0O) {
            o0OO0o0(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle o0O0o00O2 = o0O0o00O();
        if (o0O0o00O2.isEmpty()) {
            return null;
        }
        return o0O0o00O2;
    }

    public void oo0oOOo(@oo0oO0 Bundle bundle, @oo0oO0 String str, @oo0oO0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            o0OO0o0(new IllegalStateException(androidx.fragment.app.o00oOo0O.o00oOOo0("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    @oo0oO0
    /* renamed from: oo0ooO */
    public Bundle o0O0o00O() {
        int size;
        Bundle bundle = new Bundle();
        o0O00oO0();
        o0O000oo();
        o0OoO00O(true);
        this.f2889o00ooOoo = true;
        this.f2896o00oooOo.f3058o00oOoO0 = true;
        ArrayList<String> o00ooO0O2 = this.f2858o00oOo00.o00ooO0O();
        ArrayList<FragmentState> o00oo02 = this.f2858o00oOo00.o00oo0();
        if (o00oo02.isEmpty()) {
            oo0OOoo(2);
        } else {
            ArrayList<String> o00ooO0o2 = this.f2858o00oOo00.o00ooO0o();
            BackStackRecordState[] backStackRecordStateArr = null;
            ArrayList<androidx.fragment.app.o00oOOo0> arrayList = this.f2866o00oOooO;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f2866o00oOooO.get(i));
                    if (oo0OOoo(2)) {
                        Objects.toString(this.f2866o00oOooO.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f2931o00oo0O0 = o00ooO0O2;
            fragmentManagerState.f2930o00oo0O = o00ooO0o2;
            fragmentManagerState.f2932o00oo0Oo = backStackRecordStateArr;
            fragmentManagerState.f2934o00oo0o0 = this.f2863o00oOoOO.get();
            Fragment fragment = this.f2879o00ooO0;
            if (fragment != null) {
                fragmentManagerState.f2933o00oo0o = fragment.mWho;
            }
            fragmentManagerState.f2935o00oo0oO.addAll(this.f2864o00oOoOo.keySet());
            fragmentManagerState.f2936o0O0o.addAll(this.f2864o00oOoOo.values());
            fragmentManagerState.f2929o00oo = new ArrayList<>(this.f2886o00ooOo);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f2865o00oOoo0.keySet()) {
                bundle.putBundle(o00oOoOo.o00oo.o00oOOo0(f2847o0, str), this.f2865o00oOoo0.get(str));
            }
            Iterator<FragmentState> it = o00oo02.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0(f2852o0O0000O);
                o00oOOo02.append(next.f2938o00oo0O);
                bundle.putBundle(o00oOOo02.toString(), bundle2);
            }
        }
        return bundle;
    }

    public void oooOO0(@oo0oO0 o0O00oO0 o0o00oo0) {
        Fragment o00oOoo02 = o0o00oo0.o00oOoo0();
        if (o00oOoo02.mDeferStart) {
            if (this.f2857o00oOOoO) {
                this.f2892o00ooo0O = true;
                return;
            }
            o00oOoo02.mDeferStart = false;
            o0o00oo0.o00oo00O();
        }
    }

    @oo0oO0
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2880o00ooO00;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2880o00ooO00;
        } else {
            androidx.fragment.app.o00ooO0<?> o00ooo02 = this.f2899o0O0o;
            if (o00ooo02 == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(o00ooo02.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2899o0O0o;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }
}
