package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzbpb extends zzasw implements zzbpc {
    public zzbpb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbpc ? (zzbpc) queryLocalInterface : new zzbpa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpq zzf;
        boolean zzs;
        zzbpf zzbpfVar = null;
        zzbon zzbolVar = null;
        zzbow zzbouVar = null;
        zzboq zzbooVar = null;
        zzboz zzboxVar = null;
        zzbow zzbouVar2 = null;
        zzboz zzboxVar2 = null;
        zzbot zzborVar = null;
        zzboq zzbooVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzf = zzf();
            } else if (i != 3) {
                if (i != 5) {
                    if (i == 10) {
                        IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    } else if (i != 11) {
                        switch (i) {
                            case 13:
                                String readString = parcel.readString();
                                String readString2 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbooVar2 = queryLocalInterface instanceof zzboq ? (zzboq) queryLocalInterface : new zzboo(readStrongBinder);
                                }
                                zzboq zzboqVar = zzbooVar2;
                                zzasx.zzc(parcel);
                                zzj(readString, readString2, zzlVar, asInterface, zzboqVar, zzbnk.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                break;
                            case 14:
                                String readString3 = parcel.readString();
                                String readString4 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    zzborVar = queryLocalInterface2 instanceof zzbot ? (zzbot) queryLocalInterface2 : new zzbor(readStrongBinder2);
                                }
                                zzbot zzbotVar = zzborVar;
                                zzbnl zzb = zzbnk.zzb(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzl(readString3, readString4, zzlVar2, asInterface2, zzbotVar, zzb);
                                break;
                            case 15:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzs = zzs(asInterface3);
                                parcel2.writeNoException();
                                zzasx.zzd(parcel2, zzs);
                                break;
                            case 16:
                                String readString5 = parcel.readString();
                                String readString6 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder3 = parcel.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzboxVar2 = queryLocalInterface3 instanceof zzboz ? (zzboz) queryLocalInterface3 : new zzbox(readStrongBinder3);
                                }
                                zzboz zzbozVar = zzboxVar2;
                                zzbnl zzb2 = zzbnk.zzb(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzp(readString5, readString6, zzlVar3, asInterface4, zzbozVar, zzb2);
                                break;
                            case 17:
                                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzs = zzt(asInterface5);
                                parcel2.writeNoException();
                                zzasx.zzd(parcel2, zzs);
                                break;
                            case 18:
                                String readString7 = parcel.readString();
                                String readString8 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder4 = parcel.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbouVar2 = queryLocalInterface4 instanceof zzbow ? (zzbow) queryLocalInterface4 : new zzbou(readStrongBinder4);
                                }
                                zzbow zzbowVar = zzbouVar2;
                                zzbnl zzb3 = zzbnk.zzb(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzm(readString7, readString8, zzlVar4, asInterface6, zzbowVar, zzb3);
                                break;
                            case 19:
                                String readString9 = parcel.readString();
                                zzasx.zzc(parcel);
                                zzq(readString9);
                                break;
                            case 20:
                                String readString10 = parcel.readString();
                                String readString11 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder5 = parcel.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzboxVar = queryLocalInterface5 instanceof zzboz ? (zzboz) queryLocalInterface5 : new zzbox(readStrongBinder5);
                                }
                                zzboz zzbozVar2 = zzboxVar;
                                zzbnl zzb4 = zzbnk.zzb(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzo(readString10, readString11, zzlVar5, asInterface7, zzbozVar2, zzb4);
                                break;
                            case 21:
                                String readString12 = parcel.readString();
                                String readString13 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbooVar = queryLocalInterface6 instanceof zzboq ? (zzboq) queryLocalInterface6 : new zzboo(readStrongBinder6);
                                }
                                zzboq zzboqVar2 = zzbooVar;
                                zzasx.zzc(parcel);
                                zzk(readString12, readString13, zzlVar6, asInterface8, zzboqVar2, zzbnk.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                break;
                            case 22:
                                String readString14 = parcel.readString();
                                String readString15 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbouVar = queryLocalInterface7 instanceof zzbow ? (zzbow) queryLocalInterface7 : new zzbou(readStrongBinder7);
                                }
                                zzbow zzbowVar2 = zzbouVar;
                                zzasx.zzc(parcel);
                                zzn(readString14, readString15, zzlVar7, asInterface9, zzbowVar2, zzbnk.zzb(parcel.readStrongBinder()), (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR));
                                break;
                            case 23:
                                String readString16 = parcel.readString();
                                String readString17 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder8 = parcel.readStrongBinder();
                                if (readStrongBinder8 != null) {
                                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    zzbolVar = queryLocalInterface8 instanceof zzbon ? (zzbon) queryLocalInterface8 : new zzbol(readStrongBinder8);
                                }
                                zzbon zzbonVar = zzbolVar;
                                zzbnl zzb5 = zzbnk.zzb(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzi(readString16, readString17, zzlVar8, asInterface10, zzbonVar, zzb5);
                                break;
                            case 24:
                                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzasx.zzc(parcel);
                                zzs = zzr(asInterface11);
                                parcel2.writeNoException();
                                zzasx.zzd(parcel2, zzs);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                        Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                    }
                    zzasx.zzc(parcel);
                } else {
                    com.google.android.gms.ads.internal.client.zzdq zze = zze();
                    parcel2.writeNoException();
                    zzasx.zzg(parcel2, zze);
                }
                return true;
            } else {
                zzf = zzg();
            }
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zzf);
            return true;
        }
        IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        String readString18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzasx.zza(parcel, creator);
        Bundle bundle2 = (Bundle) zzasx.zza(parcel, creator);
        com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            zzbpfVar = queryLocalInterface9 instanceof zzbpf ? (zzbpf) queryLocalInterface9 : new zzbpd(readStrongBinder9);
        }
        zzbpf zzbpfVar2 = zzbpfVar;
        zzasx.zzc(parcel);
        zzh(asInterface12, readString18, bundle, bundle2, zzqVar, zzbpfVar2);
        parcel2.writeNoException();
        return true;
    }
}
