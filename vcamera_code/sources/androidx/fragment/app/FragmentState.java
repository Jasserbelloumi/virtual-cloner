package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.o0O00;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new o00oOOo0();

    /* renamed from: o00oo  reason: collision with root package name */
    public final boolean f2937o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f2938o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f2939o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final boolean f2940o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f2941o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f2942o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final String f2943o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public Bundle f2944o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final Bundle f2945o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final boolean f2946o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final boolean f2947o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final int f2948o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final boolean f2949o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f2939o00oo0O0 = parcel.readString();
        this.f2938o00oo0O = parcel.readString();
        this.f2940o00oo0Oo = parcel.readInt() != 0;
        this.f2942o00oo0o0 = parcel.readInt();
        this.f2941o00oo0o = parcel.readInt();
        this.f2943o00oo0oO = parcel.readString();
        this.f2949o0O0o = parcel.readInt() != 0;
        this.f2937o00oo = parcel.readInt() != 0;
        this.f2946o00ooO00 = parcel.readInt() != 0;
        this.f2945o00ooO0 = parcel.readBundle();
        this.f2947o00ooO0O = parcel.readInt() != 0;
        this.f2944o00ooO = parcel.readBundle();
        this.f2948o00ooO0o = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.f2939o00oo0O0 = fragment.getClass().getName();
        this.f2938o00oo0O = fragment.mWho;
        this.f2940o00oo0Oo = fragment.mFromLayout;
        this.f2942o00oo0o0 = fragment.mFragmentId;
        this.f2941o00oo0o = fragment.mContainerId;
        this.f2943o00oo0oO = fragment.mTag;
        this.f2949o0O0o = fragment.mRetainInstance;
        this.f2937o00oo = fragment.mRemoving;
        this.f2946o00ooO00 = fragment.mDetached;
        this.f2945o00ooO0 = fragment.mArguments;
        this.f2947o00ooO0O = fragment.mHidden;
        this.f2948o00ooO0o = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @oo0oO0
    public Fragment o00oOOo0(@oo0oO0 o00oo o00ooVar, @oo0oO0 ClassLoader classLoader) {
        Fragment o00oOOo02 = o00ooVar.o00oOOo0(classLoader, this.f2939o00oo0O0);
        Bundle bundle = this.f2945o00ooO0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        o00oOOo02.setArguments(this.f2945o00ooO0);
        o00oOOo02.mWho = this.f2938o00oo0O;
        o00oOOo02.mFromLayout = this.f2940o00oo0Oo;
        o00oOOo02.mRestored = true;
        o00oOOo02.mFragmentId = this.f2942o00oo0o0;
        o00oOOo02.mContainerId = this.f2941o00oo0o;
        o00oOOo02.mTag = this.f2943o00oo0oO;
        o00oOOo02.mRetainInstance = this.f2949o0O0o;
        o00oOOo02.mRemoving = this.f2937o00oo;
        o00oOOo02.mDetached = this.f2946o00ooO00;
        o00oOOo02.mHidden = this.f2947o00ooO0O;
        o00oOOo02.mMaxState = o0O00.o00oOOoO.values()[this.f2948o00ooO0o];
        Bundle bundle2 = this.f2944o00ooO;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        o00oOOo02.mSavedFragmentState = bundle2;
        return o00oOOo02;
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2939o00oo0O0);
        sb.append(" (");
        sb.append(this.f2938o00oo0O);
        sb.append(")}:");
        if (this.f2940o00oo0Oo) {
            sb.append(" fromLayout");
        }
        if (this.f2941o00oo0o != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2941o00oo0o));
        }
        String str = this.f2943o00oo0oO;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2943o00oo0oO);
        }
        if (this.f2949o0O0o) {
            sb.append(" retainInstance");
        }
        if (this.f2937o00oo) {
            sb.append(" removing");
        }
        if (this.f2946o00ooO00) {
            sb.append(" detached");
        }
        if (this.f2947o00ooO0O) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2939o00oo0O0);
        parcel.writeString(this.f2938o00oo0O);
        parcel.writeInt(this.f2940o00oo0Oo ? 1 : 0);
        parcel.writeInt(this.f2942o00oo0o0);
        parcel.writeInt(this.f2941o00oo0o);
        parcel.writeString(this.f2943o00oo0oO);
        parcel.writeInt(this.f2949o0O0o ? 1 : 0);
        parcel.writeInt(this.f2937o00oo ? 1 : 0);
        parcel.writeInt(this.f2946o00ooO00 ? 1 : 0);
        parcel.writeBundle(this.f2945o00ooO0);
        parcel.writeInt(this.f2947o00ooO0O ? 1 : 0);
        parcel.writeBundle(this.f2944o00ooO);
        parcel.writeInt(this.f2948o00ooO0o);
    }
}
