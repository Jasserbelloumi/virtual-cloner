package o0O0o0oO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o0O0o0oO.o0O0oo0o;
/* loaded from: classes.dex */
public interface o0O0O0O extends IInterface {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O0O0O {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o0O0o0oO.o0O0O0O
        public void o00oOOo0(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0O0O0O
        public void o00oOoOo(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO extends Binder implements o0O0O0O {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f12616o00oo0O = 1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f12617o00oo0O0 = "androidx.work.multiprocess.IListenableWorkerImpl";

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f12618o00oo0Oo = 2;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0O0O0O {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public static o0O0O0O f12619o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f12620o00oo0O0;

            public o00oOOo0(IBinder iBinder) {
                this.f12620o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12620o00oo0O0;
            }

            @Override // o0O0o0oO.o0O0O0O
            public void o00oOOo0(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12617o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12620o00oo0O0.transact(2, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOOo0(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0O0O0O
            public void o00oOoOo(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12617o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12620o00oo0O0.transact(1, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOoOo(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            public String o00oOooo() {
                return o00oOOoO.f12617o00oo0O0;
            }
        }

        public o00oOOoO() {
            attachInterface(this, f12617o00oo0O0);
        }

        public static o0O0O0O asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f12617o00oo0O0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o0O0O0O)) ? new o00oOOo0(iBinder) : (o0O0O0O) queryLocalInterface;
        }

        public static o0O0O0O getDefaultImpl() {
            return o00oOOo0.f12619o00oo0O;
        }

        public static boolean setDefaultImpl(o0O0O0O o0o0o0o) {
            if (o00oOOo0.f12619o00oo0O == null) {
                if (o0o0o0o != null) {
                    o00oOOo0.f12619o00oo0O = o0o0o0o;
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
                parcel.enforceInterface(f12617o00oo0O0);
                o00oOoOo(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f12617o00oo0O0);
                o00oOOo0(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f12617o00oo0O0);
                return true;
            }
        }
    }

    void o00oOOo0(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOoOo(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;
}
