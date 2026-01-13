package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@oo0oO0 String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(@oo0oO0 String str, @oo0oO0 Throwable th) {
            super(str, th);
        }
    }

    @KeepForSdk
    public RemoteCreator(@oo0oO0 String str) {
        this.zza = str;
    }

    @oo0oO0
    @KeepForSdk
    public abstract T getRemoteCreator(@oo0oO0 IBinder iBinder);

    @oo0oO0
    @KeepForSdk
    public final T getRemoteCreatorInstance(@oo0oO0 Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (T) this.zzb;
    }
}
