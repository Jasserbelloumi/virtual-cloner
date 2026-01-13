package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O;
import o0O0Oooo.o0OO000o;
@SuppressLint({"BanParcelableUsage"})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO000o f5219o00oo0O0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }

        public ParcelImpl o00oOOo0(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] o00oOOoO(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f5219o00oo0O0 = new o0O(parcel).o0O000oo();
    }

    public ParcelImpl(o0OO000o o0oo000o) {
        this.f5219o00oo0O0 = o0oo000o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends o0OO000o> T o00oOOo0() {
        return (T) this.f5219o00oo0O0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new o0O(parcel).o0O0o0o(this.f5219o00oo0O0);
    }
}
