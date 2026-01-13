package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class zai {
    public final int zac;

    public zai(int i) {
        this.zac = i;
    }

    public static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@oo0oO0 Status status);

    public abstract void zae(@oo0oO0 Exception exc);

    public abstract void zaf(zabq zabqVar) throws DeadObjectException;

    public abstract void zag(@oo0oO0 zaad zaadVar, boolean z);
}
