package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@SafeParcelable.Class(creator = "ModuleInstallIntentResponseCreator")
/* loaded from: classes.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    @oo0oO0
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zab();
    @o0OO00OO
    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zaa;

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallIntentResponse(@SafeParcelable.Param(id = 1) @o0OO00OO PendingIntent pendingIntent) {
        this.zaa = pendingIntent;
    }

    @o0OO00OO
    public PendingIntent getPendingIntent() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
