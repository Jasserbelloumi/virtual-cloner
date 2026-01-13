package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public interface zzdx extends IInterface {
    @o0OO00OO
    String zzd(zzq zzqVar) throws RemoteException;

    @o0OO00OO
    List zze(zzq zzqVar, boolean z) throws RemoteException;

    List zzf(@o0OO00OO String str, @o0OO00OO String str2, zzq zzqVar) throws RemoteException;

    List zzg(String str, @o0OO00OO String str2, @o0OO00OO String str3) throws RemoteException;

    List zzh(@o0OO00OO String str, @o0OO00OO String str2, boolean z, zzq zzqVar) throws RemoteException;

    List zzi(String str, @o0OO00OO String str2, @o0OO00OO String str3, boolean z) throws RemoteException;

    void zzj(zzq zzqVar) throws RemoteException;

    void zzk(zzaw zzawVar, zzq zzqVar) throws RemoteException;

    void zzl(zzaw zzawVar, String str, @o0OO00OO String str2) throws RemoteException;

    void zzm(zzq zzqVar) throws RemoteException;

    void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException;

    void zzo(zzac zzacVar) throws RemoteException;

    void zzp(zzq zzqVar) throws RemoteException;

    void zzq(long j, @o0OO00OO String str, @o0OO00OO String str2, String str3) throws RemoteException;

    void zzr(Bundle bundle, zzq zzqVar) throws RemoteException;

    void zzs(zzq zzqVar) throws RemoteException;

    void zzt(zzkw zzkwVar, zzq zzqVar) throws RemoteException;

    @o0OO00OO
    byte[] zzu(zzaw zzawVar, String str) throws RemoteException;
}
