package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final List<BackStackRecordState> f2792o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<String> f2793o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(@oo0oO0 Parcel parcel) {
        this.f2793o00oo0O0 = parcel.createStringArrayList();
        this.f2792o00oo0O = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f2793o00oo0O0 = list;
        this.f2792o00oo0O = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @oo0oO0
    public List<androidx.fragment.app.o00oOOo0> o00oOOo0(@oo0oO0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f2793o00oo0O0.size());
        for (String str : this.f2793o00oo0O0) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                FragmentState o00ooOO02 = fragmentManager.o0O0OO0O().o00ooOO0(str, null);
                if (o00ooOO02 != null) {
                    Fragment o00oOOo02 = o00ooOO02.o00oOOo0(fragmentManager.o0O0OO0(), fragmentManager.o0O0OOO0().o00oOoOo().getClassLoader());
                    hashMap.put(o00oOOo02.mWho, o00oOOo02);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (BackStackRecordState backStackRecordState : this.f2792o00oo0O) {
            arrayList.add(backStackRecordState.o00oOo00(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        parcel.writeStringList(this.f2793o00oo0O0);
        parcel.writeTypedList(this.f2792o00oo0O);
    }
}
