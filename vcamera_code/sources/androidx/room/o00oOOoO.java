package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.o00oOOo0;
/* loaded from: classes.dex */
public interface o00oOOoO extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class o00oOOo0 extends Binder implements o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f4793o00oo0O = 1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f4794o00oo0O0 = "androidx.room.IMultiInstanceInvalidationService";

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f4795o00oo0Oo = 2;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f4796o00oo0o0 = 3;

        /* renamed from: androidx.room.o00oOOoO$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0045o00oOOo0 implements o00oOOoO {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f4797o00oo0O0;

            public C0045o00oOOo0(IBinder iBinder) {
                this.f4797o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4797o00oo0O0;
            }

            @Override // androidx.room.o00oOOoO
            public void broadcastInvalidation(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOo0.f4794o00oo0O0);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f4797o00oo0O0.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String o00oOooo() {
                return o00oOOo0.f4794o00oo0O0;
            }

            @Override // androidx.room.o00oOOoO
            public int registerCallback(androidx.room.o00oOOo0 o00oooo02, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOo0.f4794o00oo0O0);
                    obtain.writeStrongBinder(o00oooo02 != null ? o00oooo02.asBinder() : null);
                    obtain.writeString(str);
                    this.f4797o00oo0O0.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.o00oOOoO
            public void unregisterCallback(androidx.room.o00oOOo0 o00oooo02, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00oOOo0.f4794o00oo0O0);
                    obtain.writeStrongBinder(o00oooo02 != null ? o00oooo02.asBinder() : null);
                    obtain.writeInt(i);
                    this.f4797o00oo0O0.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public o00oOOo0() {
            attachInterface(this, f4794o00oo0O0);
        }

        public static o00oOOoO asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f4794o00oo0O0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o00oOOoO)) ? new C0045o00oOOo0(iBinder) : (o00oOOoO) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f4794o00oo0O0);
                int registerCallback = registerCallback(o00oOOo0.AbstractBinderC0043o00oOOo0.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(registerCallback);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f4794o00oo0O0);
                unregisterCallback(o00oOOo0.AbstractBinderC0043o00oOOo0.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f4794o00oo0O0);
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f4794o00oo0O0);
                return true;
            }
        }
    }

    void broadcastInvalidation(int i, String[] strArr) throws RemoteException;

    int registerCallback(androidx.room.o00oOOo0 o00oooo02, String str) throws RemoteException;

    void unregisterCallback(androidx.room.o00oOOo0 o00oooo02, int i) throws RemoteException;
}
