package oo0oO0;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class o0OoO00O extends Fragment implements Runnable {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f17403o00oo0o0 = "request_permissions";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f17404o00oo0O;
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo00O f17405o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f17406o00oo0Oo;

    public static void o00oOOoO(@oo0oO0 Activity activity, @oo0oO0 ArrayList<String> arrayList, @o0OO00OO o00oo00O o00oo00o) {
        o0OoO00O o0ooo00o = new o0OoO00O();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("request_permissions", arrayList);
        o0ooo00o.setArguments(bundle);
        o0ooo00o.setRetainInstance(true);
        o0ooo00o.f17404o00oo0O = true;
        o0ooo00o.f17405o00oo0O0 = o00oo00o;
        o0ooo00o.o00oOOo0(activity);
    }

    public void o00oOOo0(@oo0oO0 Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void o00oOo00(@oo0oO0 Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void o00oOo0O(boolean z) {
        this.f17404o00oo0O = z;
    }

    public void o00oOooO(@o0OO00OO o00oo00O o00oo00o) {
        this.f17405o00oo0O0 = o00oo00o;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, @o0OO00OO Intent intent) {
        ArrayList<String> stringArrayList;
        if (i != 1025) {
            return;
        }
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        o0O00O.o00oo0o0(stringArrayList, this);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f17404o00oo0O) {
            o00oOo00(getActivity());
        } else if (this.f17406o00oo0Oo) {
        } else {
            this.f17406o00oo0Oo = true;
            Bundle arguments = getArguments();
            Activity activity = getActivity();
            if (arguments == null || activity == null) {
                return;
            }
            startActivityForResult(o0O00O.o00oOooo(getActivity(), arguments.getStringArrayList("request_permissions")), 1025);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Activity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            o00oo00O o00oo00o = this.f17405o00oo0O0;
            this.f17405o00oo0O0 = null;
            if (o00oo00o == null) {
                o00oOo00(activity);
                return;
            }
            ArrayList<String> stringArrayList = getArguments().getStringArrayList("request_permissions");
            if (o00oo0OO.o00oOooO(activity, stringArrayList).size() == stringArrayList.size()) {
                o00oo00o.o00oOOo0();
            } else {
                o00oo00o.o00oOOoO();
            }
            o00oOo00(activity);
        }
    }
}
