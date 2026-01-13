package com.willy.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes2.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public float f6646o00oo0O0;

    /* loaded from: classes2.dex */
    public static class o00oOOo0 implements Parcelable.Creator<SavedState> {
        @Override // android.os.Parcelable.Creator
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SavedState[] newArray(int i) {
            return new SavedState[i];
        }

        public SavedState o00oOOo0(Parcel parcel) {
            return new SavedState(parcel);
        }

        public SavedState[] o00oOOoO(int i) {
            return new SavedState[i];
        }
    }

    public SavedState(Parcel parcel) {
        super(parcel);
        this.f6646o00oo0O0 = parcel.readFloat();
    }

    public /* synthetic */ SavedState(Parcel parcel, o00oOOo0 o00oooo02) {
        this(parcel);
    }

    public SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public float o00oOOo0() {
        return this.f6646o00oo0O0;
    }

    public void o00oOOoO(float f) {
        this.f6646o00oo0O0 = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f6646o00oo0O0);
    }
}
