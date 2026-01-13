package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface o00oOOo0 extends IInterface {

    /* renamed from: androidx.room.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0043o00oOOo0 extends Binder implements o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f4790o00oo0O = 1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final String f4791o00oo0O0 = "androidx.room.IMultiInstanceInvalidationCallback";

        /* renamed from: androidx.room.o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0044o00oOOo0 implements o00oOOo0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public IBinder f4792o00oo0O0;

            public C0044o00oOOo0(IBinder iBinder) {
                this.f4792o00oo0O0 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4792o00oo0O0;
            }

            public String o00oOooo() {
                return AbstractBinderC0043o00oOOo0.f4791o00oo0O0;
            }

            @Override // androidx.room.o00oOOo0
            public void onInvalidation(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0043o00oOOo0.f4791o00oo0O0);
                    obtain.writeStringArray(strArr);
                    this.f4792o00oo0O0.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0043o00oOOo0() {
            attachInterface(this, f4791o00oo0O0);
        }

        public static o00oOOo0 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f4791o00oo0O0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o00oOOo0)) ? new C0044o00oOOo0(iBinder) : (o00oOOo0) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f4791o00oo0O0);
                onInvalidation(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f4791o00oo0O0);
                return true;
            }
        }
    }

    void onInvalidation(String[] strArr) throws RemoteException;
}
