package o0O0o0oO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o0O0o0oO.o0O0oo0o;
/* loaded from: classes.dex */
public interface o0oO0O0o extends IInterface {

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0oO0O0o {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOOoO(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOo00(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOo0O(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOo0o(o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOoO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOoO0(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOoo0(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
        }

        @Override // o0O0o0oO.o0oO0O0o
        public void o00oOooO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO extends Binder implements o0oO0O0o {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f12626o00oo = 7;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f12627o00oo0O = 1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f12628o00oo0O0 = "androidx.work.multiprocess.IWorkManagerImpl";

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f12629o00oo0Oo = 2;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f12630o00oo0o = 4;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f12631o00oo0o0 = 3;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f12632o00oo0oO = 5;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f12633o00ooO00 = 8;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f12634o0O0o = 6;

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements o0oO0O0o {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public static o0oO0O0o f12635o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f12636o00oo0O0;

            public o00oOOo0(IBinder iBinder) {
                this.f12636o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12636o00oo0O0;
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOOoO(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(3, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOOoO(str, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOo00(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(7, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOo00(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOo0O(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(2, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOo0O(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOo0o(o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(6, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOo0o(o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOoO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(1, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOoO(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOoO0(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(4, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOoO0(str, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOoo0(String str, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(5, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOoo0(str, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // o0O0o0oO.o0oO0O0o
            public void o00oOooO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOoO.f12628o00oo0O0);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(o0o0oo0o != null ? o0o0oo0o.asBinder() : null);
                    if (this.f12636o00oo0O0.transact(8, obtain, null, 1) || o00oOOoO.getDefaultImpl() == null) {
                        return;
                    }
                    o00oOOoO.getDefaultImpl().o00oOooO(bArr, o0o0oo0o);
                } finally {
                    obtain.recycle();
                }
            }

            public String o00oOooo() {
                return o00oOOoO.f12628o00oo0O0;
            }
        }

        public o00oOOoO() {
            attachInterface(this, f12628o00oo0O0);
        }

        public static o0oO0O0o asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f12628o00oo0O0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o0oO0O0o)) ? new o00oOOo0(iBinder) : (o0oO0O0o) queryLocalInterface;
        }

        public static o0oO0O0o getDefaultImpl() {
            return o00oOOo0.f12635o00oo0O;
        }

        public static boolean setDefaultImpl(o0oO0O0o o0oo0o0o) {
            if (o00oOOo0.f12635o00oo0O == null) {
                if (o0oo0o0o != null) {
                    o00oOOo0.f12635o00oo0O = o0oo0o0o;
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
            if (i == 1598968902) {
                parcel2.writeString(f12628o00oo0O0);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOoO(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOo0O(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOOoO(parcel.readString(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOoO0(parcel.readString(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOoo0(parcel.readString(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOo0o(o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOo00(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    parcel.enforceInterface(f12628o00oo0O0);
                    o00oOooO(parcel.createByteArray(), o0O0oo0o.o00oOOoO.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void o00oOOoO(String str, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOo00(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOo0O(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOo0o(o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOoO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOoO0(String str, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOoo0(String str, o0O0oo0o o0o0oo0o) throws RemoteException;

    void o00oOooO(byte[] bArr, o0O0oo0o o0o0oo0o) throws RemoteException;
}
