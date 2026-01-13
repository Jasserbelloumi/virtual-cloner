package o00ooo00;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o00ooo00.o0oO0Ooo;
/* loaded from: classes.dex */
public interface o0O00o00 extends IInterface {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9641o00oOo00 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O00o00 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o00ooo00.o0O00o00
        public void isPermissionRevocationEnabledForApp(o0oO0Ooo o0oo0ooo) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO extends Binder implements o0O00o00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f9642o00oo0O0 = 1;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0O00o00 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f9643o00oo0O0;

            public o00oOOo0(IBinder iBinder) {
                this.f9643o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9643o00oo0O0;
            }

            @Override // o00ooo00.o0O00o00
            public void isPermissionRevocationEnabledForApp(o0oO0Ooo o0oo0ooo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o0O00o00.f9641o00oOo00);
                    obtain.writeStrongInterface(o0oo0ooo);
                    this.f9643o00oo0O0.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String o00oOooo() {
                return o0O00o00.f9641o00oOo00;
            }
        }

        public o00oOOoO() {
            attachInterface(this, o0O00o00.f9641o00oOo00);
        }

        public static o0O00o00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(o0O00o00.f9641o00oOo00);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o0O00o00)) ? new o00oOOo0(iBinder) : (o0O00o00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(o0O00o00.f9641o00oOo00);
            }
            if (i == 1598968902) {
                parcel2.writeString(o0O00o00.f9641o00oOo00);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                isPermissionRevocationEnabledForApp(o0oO0Ooo.o00oOOoO.asInterface(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    void isPermissionRevocationEnabledForApp(o0oO0Ooo o0oo0ooo) throws RemoteException;
}
