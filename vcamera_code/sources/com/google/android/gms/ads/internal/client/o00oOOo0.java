package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public final /* synthetic */ class o00oOOo0 {
    public static IObjectWrapper o00oOOo0(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }
}
