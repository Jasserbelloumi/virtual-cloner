package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new o00oOOo0();

    /* renamed from: o00oo  reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f2929o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ArrayList<String> f2930o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ArrayList<String> f2931o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public BackStackRecordState[] f2932o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public String f2933o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f2934o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public ArrayList<String> f2935o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public ArrayList<BackStackState> f2936o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f2933o00oo0o = null;
        this.f2935o00oo0oO = new ArrayList<>();
        this.f2936o0O0o = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2933o00oo0o = null;
        this.f2935o00oo0oO = new ArrayList<>();
        this.f2936o0O0o = new ArrayList<>();
        this.f2931o00oo0O0 = parcel.createStringArrayList();
        this.f2930o00oo0O = parcel.createStringArrayList();
        this.f2932o00oo0Oo = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f2934o00oo0o0 = parcel.readInt();
        this.f2933o00oo0o = parcel.readString();
        this.f2935o00oo0oO = parcel.createStringArrayList();
        this.f2936o0O0o = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f2929o00oo = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2931o00oo0O0);
        parcel.writeStringList(this.f2930o00oo0O);
        parcel.writeTypedArray(this.f2932o00oo0Oo, i);
        parcel.writeInt(this.f2934o00oo0o0);
        parcel.writeString(this.f2933o00oo0o);
        parcel.writeStringList(this.f2935o00oo0oO);
        parcel.writeTypedList(this.f2936o0O0o);
        parcel.writeTypedList(this.f2929o00oo);
    }
}
