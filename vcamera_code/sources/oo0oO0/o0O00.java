package oo0oO0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import oo0oO0.o0O00;
/* loaded from: classes2.dex */
public final class o0O00 extends Fragment implements Runnable {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final String f17370o00oo = "request_code";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final List<Integer> f17371o00ooO00 = new ArrayList();

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final String f17372o0O0o = "request_permissions";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f17373o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f17374o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f17375o00oo0Oo;
    @o0OO00OO

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oOo0O f17376o00oo0o;
    @o0OO00OO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oOoO f17377o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f17378o00oo0oO;

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements o00oOo0O {
        public o00oOOo0() {
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOOoO implements o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Activity f17380o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ ArrayList f17381o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ ArrayList f17382o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f17384o00oOooO;

        /* loaded from: classes2.dex */
        public class o00oOOo0 implements o00oOo0O {
            public o00oOOo0() {
            }
        }

        /* renamed from: oo0oO0.o0O00$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0228o00oOOoO implements o00oOoO {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ ArrayList f17386o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ int f17387o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final /* synthetic */ ArrayList f17388o00oOo00;

            public C0228o00oOOoO(ArrayList arrayList, int i, ArrayList arrayList2) {
                this.f17386o00oOOo0 = arrayList;
                this.f17387o00oOOoO = i;
                this.f17388o00oOo00 = arrayList2;
            }

            @Override // oo0oO0.o00oOoO
            public void o00oOOo0(@oo0oO0 List<String> list, boolean z) {
                if (o0O00.this.isAdded()) {
                    int[] iArr = new int[this.f17386o00oOOo0.size()];
                    for (int i = 0; i < this.f17386o00oOOo0.size(); i++) {
                        iArr[i] = o0O00O.o00oOo0O(this.f17388o00oOo00, (String) this.f17386o00oOOo0.get(i)) ? -1 : 0;
                    }
                    o0O00.this.onRequestPermissionsResult(this.f17387o00oOOoO, (String[]) this.f17386o00oOOo0.toArray(new String[0]), iArr);
                }
            }

            @Override // oo0oO0.o00oOoO
            public void o00oOOoO(@oo0oO0 List<String> list, boolean z) {
                if (z && o0O00.this.isAdded()) {
                    int[] iArr = new int[this.f17386o00oOOo0.size()];
                    Arrays.fill(iArr, 0);
                    o0O00.this.onRequestPermissionsResult(this.f17387o00oOOoO, (String[]) this.f17386o00oOOo0.toArray(new String[0]), iArr);
                }
            }
        }

        public o00oOOoO(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i) {
            this.f17380o00oOOo0 = activity;
            this.f17381o00oOOoO = arrayList;
            this.f17382o00oOo00 = arrayList2;
            this.f17384o00oOooO = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOooO(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i) {
            o0O00.o00oOo00(activity, arrayList, new o00oOOo0(), new C0228o00oOOoO(arrayList2, i, arrayList));
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOo0(@oo0oO0 List<String> list, boolean z) {
            if (o0O00.this.isAdded()) {
                int[] iArr = new int[this.f17382o00oOo00.size()];
                Arrays.fill(iArr, -1);
                o0O00.this.onRequestPermissionsResult(this.f17384o00oOooO, (String[]) this.f17382o00oOo00.toArray(new String[0]), iArr);
            }
        }

        @Override // oo0oO0.o00oOoO
        public void o00oOOoO(@oo0oO0 List<String> list, boolean z) {
            if (z && o0O00.this.isAdded()) {
                long j = o00oOo00.o00oOo0o() ? 150L : 0L;
                final Activity activity = this.f17380o00oOOo0;
                final ArrayList arrayList = this.f17381o00oOOoO;
                final ArrayList arrayList2 = this.f17382o00oOo00;
                final int i = this.f17384o00oOooO;
                o0O00O.o00oo0o(new Runnable() { // from class: oo0oO0.o0O00O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0O00.o00oOOoO.this.o00oOooO(activity, arrayList, arrayList2, i);
                    }
                }, j);
            }
        }
    }

    public static void o00oOo00(@oo0oO0 Activity activity, @oo0oO0 ArrayList<String> arrayList, @oo0oO0 o00oOo0O o00ooo0o2, @o0OO00OO o00oOoO o00oooo2) {
        int nextInt;
        List<Integer> list;
        o0O00 o0o00 = new o0O00();
        Bundle bundle = new Bundle();
        do {
            nextInt = new Random().nextInt((int) Math.pow(2.0d, 8.0d));
            list = f17371o00ooO00;
        } while (list.contains(Integer.valueOf(nextInt)));
        list.add(Integer.valueOf(nextInt));
        bundle.putInt(f17370o00oo, nextInt);
        bundle.putStringArrayList("request_permissions", arrayList);
        o0o00.setArguments(bundle);
        o0o00.setRetainInstance(true);
        o0o00.f17375o00oo0Oo = true;
        o0o00.f17377o00oo0o0 = o00oooo2;
        o0o00.f17376o00oo0o = o00ooo0o2;
        o0o00.o00oOOo0(activity);
    }

    public void o00oOOo0(@oo0oO0 Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void o00oOOoO(@oo0oO0 Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void o00oOo0O() {
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        boolean z = false;
        for (String str : arguments.getStringArrayList("request_permissions")) {
            if (o00oo0OO.o00oOoo0(str) && !o00oo0OO.o00oOoO0(activity, str) && (o00oOo00.o00oOooO() || !o0O00O.o00oOo0o(str, o00oo0.f17316o00oOo00))) {
                startActivityForResult(o0O00O.o00oOooo(activity, o0O00O.o00oOOoO(str)), getArguments().getInt(f17370o00oo));
                z = true;
            }
        }
        if (z) {
            return;
        }
        o00oOooO();
    }

    public void o00oOo0o(@o0OO00OO o00oOoO o00oooo2) {
        this.f17377o00oo0o0 = o00oooo2;
    }

    public void o00oOoO(boolean z) {
        this.f17375o00oo0Oo = z;
    }

    public void o00oOoO0(o00oOo0O o00ooo0o2) {
        this.f17376o00oo0o = o00ooo0o2;
    }

    public void o00oOoOO(@oo0oO0 Activity activity, @oo0oO0 ArrayList<String> arrayList, @oo0oO0 ArrayList<String> arrayList2, int i) {
        ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.remove(it.next());
        }
        o00oOo00(activity, arrayList2, new o00oOOo0(), new o00oOOoO(activity, arrayList3, arrayList, i));
    }

    public void o00oOooO() {
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null) {
            return;
        }
        int i = arguments.getInt(f17370o00oo);
        ArrayList<String> stringArrayList = arguments.getStringArrayList("request_permissions");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        if (o00oOo00.o00oOo0o() && stringArrayList.size() >= 2 && o0O00O.o00oOo0O(stringArrayList, o00oo0.f17330o00oo0O0)) {
            ArrayList<String> arrayList = new ArrayList<>(stringArrayList);
            arrayList.remove(o00oo0.f17330o00oo0O0);
            o00oOoOO(activity, stringArrayList, arrayList, i);
        } else if (o00oOo00.o00oOo00() && stringArrayList.size() >= 2 && o0O00O.o00oOo0O(stringArrayList, o00oo0.f17326o00oo)) {
            ArrayList<String> arrayList2 = new ArrayList<>(stringArrayList);
            arrayList2.remove(o00oo0.f17326o00oo);
            o00oOoOO(activity, stringArrayList, arrayList2, i);
        } else if (!o00oOo00.o00oOo00() || !o0O00O.o00oOo0O(stringArrayList, o00oo0.f17337o00ooO0) || !o0O00O.o00oOo0O(stringArrayList, o00oo0.f17342o00ooOO0)) {
            requestPermissions((String[]) stringArrayList.toArray(new String[stringArrayList.size() - 1]), i);
        } else {
            ArrayList<String> arrayList3 = new ArrayList<>(stringArrayList);
            arrayList3.remove(o00oo0.f17337o00ooO0);
            o00oOoOO(activity, stringArrayList, arrayList3, i);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, @o0OO00OO Intent intent) {
        ArrayList<String> stringArrayList;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || this.f17373o00oo0O || i != arguments.getInt(f17370o00oo) || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        this.f17373o00oo0O = true;
        o0O00O.o00oo0o0(stringArrayList, this);
    }

    @Override // android.app.Fragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        int requestedOrientation = activity.getRequestedOrientation();
        this.f17378o00oo0oO = requestedOrientation;
        if (requestedOrientation != -1) {
            return;
        }
        o0O00O.o00oo0O(activity);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f17377o00oo0o0 = null;
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        if (activity == null || this.f17378o00oo0oO != -1 || activity.getRequestedOrientation() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @oo0oO0 String[] strArr, @oo0oO0 int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (activity == null || arguments == null || this.f17376o00oo0o == null || i != arguments.getInt(f17370o00oo)) {
            return;
        }
        o00oOoO o00oooo2 = this.f17377o00oo0o0;
        this.f17377o00oo0o0 = null;
        o00oOo0O o00ooo0o2 = this.f17376o00oo0o;
        this.f17376o00oo0o = null;
        o0O00O.o00oo0Oo(activity, strArr, iArr);
        ArrayList o00oOOoO2 = o0O00O.o00oOOoO(strArr);
        f17371o00ooO00.remove(Integer.valueOf(i));
        o00oOOoO(activity);
        List<String> o00oOo0O2 = o00oo0OO.o00oOo0O(o00oOOoO2, iArr);
        if (o00oOo0O2.size() == o00oOOoO2.size()) {
            o00ooo0o2.o00oOo00(activity, o00oOOoO2, o00oOo0O2, true, o00oooo2);
            o00ooo0o2.o00oOOo0(activity, o00oOOoO2, false, o00oooo2);
            return;
        }
        List<String> o00oOo002 = o00oo0OO.o00oOo00(o00oOOoO2, iArr);
        o00ooo0o2.o00oOooO(activity, o00oOOoO2, o00oOo002, o00oo0OO.o00oOoOo(activity, o00oOo002), o00oooo2);
        if (!o00oOo0O2.isEmpty()) {
            o00ooo0o2.o00oOo00(activity, o00oOOoO2, o00oOo0O2, false, o00oooo2);
        }
        o00ooo0o2.o00oOOo0(activity, o00oOOoO2, false, o00oooo2);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f17375o00oo0Oo) {
            o00oOOoO(getActivity());
        } else if (this.f17374o00oo0O0) {
        } else {
            this.f17374o00oo0O0 = true;
            o00oOo0O();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isAdded()) {
            o00oOooO();
        }
    }
}
