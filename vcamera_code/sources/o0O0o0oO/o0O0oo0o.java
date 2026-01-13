package o0O0o0oO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface o0O0oo0o extends IInterface {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O0oo0o {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o0O0o0oO.o0O0oo0o
        public void o00oOoOO(byte[] bArr) throws RemoteException {
        }

        @Override // o0O0o0oO.o0O0oo0o
        public void onFailure(String str) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO extends Binder implements o0O0oo0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f12621o00oo0O = 1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f12622o00oo0O0 = "androidx.work.multiprocess.IWorkManagerImplCallback";

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f12623o00oo0Oo = 2;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0O0oo0o {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public static o0O0oo0o f12624o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f12625o00oo0O0;

            public o00oOOo0(IBinder iBinder) {
                this.f12625o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12625o00oo0O0;
            }

            @Override // o0O0o0oO.o0O0oo0o
            public void o00oOoOO(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12622o00oo0O0);
                    obtain.writeByteArray(bArr);
                    if (this.f12625o00oo0O0.transact(1, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOoOO(bArr);
                } finally {
                    obtain.recycle();
                }
            }

            public String o00oOooo() {
                return o00oOOoO.f12622o00oo0O0;
            }

            @Override // o0O0o0oO.o0O0oo0o
            public void onFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12622o00oo0O0);
                    obtain.writeString(str);
                    if (this.f12625o00oo0O0.transact(2, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().onFailure(str);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public o00oOOoO() {
            attachInterface(this, f12622o00oo0O0);
        }

        public static o0O0oo0o asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f12622o00oo0O0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o0O0oo0o)) ? new o00oOOo0(iBinder) : (o0O0oo0o) queryLocalInterface;
        }

        public static o0O0oo0o getDefaultImpl() {
            return o00oOOo0.f12624o00oo0O;
        }

        public static boolean setDefaultImpl(o0O0oo0o o0o0oo0o) {
            if (o00oOOo0.f12624o00oo0O == null) {
                if (o0o0oo0o != null) {
                    o00oOOo0.f12624o00oo0O = o0o0oo0o;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f12622o00oo0O0);
                o00oOoOO(parcel.createByteArray());
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f12622o00oo0O0);
                onFailure(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f12622o00oo0O0);
                return true;
            }
        }
    }

    void o00oOoOO(byte[] bArr) throws RemoteException;

    void onFailure(String str) throws RemoteException;
}
