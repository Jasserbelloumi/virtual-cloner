package o00ooo00;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface o0oO0Ooo extends IInterface {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9644o00oOOoO = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0oO0Ooo {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o00ooo00.o0oO0Ooo
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO extends Binder implements o0oO0Ooo {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f9645o00oo0O0 = 1;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0oO0Ooo {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f9646o00oo0O0;

            public o00oOOo0(IBinder iBinder) {
                this.f9646o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9646o00oo0O0;
            }

            public String o00oOooo() {
                return o0oO0Ooo.f9644o00oOOoO;
            }

            @Override // o00ooo00.o0oO0Ooo
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o0oO0Ooo.f9644o00oOOoO);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f9646o00oo0O0.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public o00oOOoO() {
            attachInterface(this, o0oO0Ooo.f9644o00oOOoO);
        }

        public static o0oO0Ooo asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(o0oO0Ooo.f9644o00oOOoO);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o0oO0Ooo)) ? new o00oOOo0(iBinder) : (o0oO0Ooo) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(o0oO0Ooo.f9644o00oOOoO);
            }
            if (i == 1598968902) {
                parcel2.writeString(o0oO0Ooo.f9644o00oOOoO);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                onIsPermissionRevocationEnabledForAppResult(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            }
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws RemoteException;
}
