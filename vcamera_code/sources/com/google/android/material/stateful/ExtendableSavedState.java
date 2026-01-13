package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.o00oOo0O;
import androidx.collection.o00ooO0;
import androidx.customview.view.AbsSavedState;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.Creator
        @o0OO00OO
        public ExtendableSavedState createFromParcel(@oo0oO0 Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @oo0oO0
        public ExtendableSavedState createFromParcel(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @oo0oO0
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }
    };
    @oo0oO0
    public final o00ooO0<String, Bundle> extendableStates;

    private ExtendableSavedState(@oo0oO0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new o00ooO0<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.extendableStates.put(strArr[i], bundleArr[i]);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new o00ooO0<>();
    }

    @oo0oO0
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ExtendableSavedState{");
        o00oOOo02.append(Integer.toHexString(System.identityHashCode(this)));
        o00oOOo02.append(" states=");
        o00oOOo02.append(this.extendableStates);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.extendableStates.o00oOoOo(i2);
            bundleArr[i2] = this.extendableStates.o00oo0(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
