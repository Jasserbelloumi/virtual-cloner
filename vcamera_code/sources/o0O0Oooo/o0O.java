package o0O0Oooo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.o00oOOoO;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.o00oOOo0;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o0O extends o0O0oo00 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final boolean f12206o00ooO = false;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f12207o00ooOO0 = "VersionedParcelParcel";

    /* renamed from: o00oo  reason: collision with root package name */
    public final int f12208o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final SparseIntArray f12209o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Parcel f12210o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f12211o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final String f12212o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f12213o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f12214o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f12215o0O0o;

    public o0O(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o00oOOo0(), new o00oOOo0(), new o00oOOo0());
    }

    public o0O(Parcel parcel, int i, int i2, String str, o00oOOo0<String, Method> o00oooo02, o00oOOo0<String, Method> o00oooo03, o00oOOo0<String, Class> o00oooo04) {
        super(o00oooo02, o00oooo03, o00oooo04);
        this.f12209o00oo0o = new SparseIntArray();
        this.f12211o00ooO0 = -1;
        this.f12214o00ooO0o = -1;
        this.f12210o00oo0oO = parcel;
        this.f12215o0O0o = i;
        this.f12208o00oo = i2;
        this.f12213o00ooO0O = i;
        this.f12212o00ooO00 = str;
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o00oOOo0() {
        int i = this.f12211o00ooO0;
        if (i >= 0) {
            int i2 = this.f12209o00oo0o.get(i);
            int dataPosition = this.f12210o00oo0oO.dataPosition();
            this.f12210o00oo0oO.setDataPosition(i2);
            this.f12210o00oo0oO.writeInt(dataPosition - i2);
            this.f12210o00oo0oO.setDataPosition(dataPosition);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public o0O0oo00 o00oOo00() {
        Parcel parcel = this.f12210o00oo0oO;
        int dataPosition = parcel.dataPosition();
        int i = this.f12213o00ooO0O;
        if (i == this.f12215o0O0o) {
            i = this.f12208o00oo;
        }
        return new o0O(parcel, dataPosition, i, o00oOOoO.o00oOOo0(new StringBuilder(), this.f12212o00ooO00, "  "), this.f12232o00oOOo0, this.f12233o00oOOoO, this.f12234o00oOo00);
    }

    @Override // o0O0Oooo.o0O0oo00
    public boolean o00oOooo() {
        return this.f12210o00oo0oO.readInt() != 0;
    }

    @Override // o0O0Oooo.o0O0oo00
    public Bundle o00oo0O0() {
        return this.f12210o00oo0oO.readBundle(getClass().getClassLoader());
    }

    @Override // o0O0Oooo.o0O0oo00
    public byte[] o00oo0o0() {
        int readInt = this.f12210o00oo0oO.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f12210o00oo0oO.readByteArray(bArr);
        return bArr;
    }

    @Override // o0O0Oooo.o0O0oo00
    public double o00ooO0() {
        return this.f12210o00oo0oO.readDouble();
    }

    @Override // o0O0Oooo.o0O0oo00
    public float o00ooOo() {
        return this.f12210o00oo0oO.readFloat();
    }

    @Override // o0O0Oooo.o0O0oo00
    public boolean o00ooOo0(int i) {
        while (this.f12213o00ooO0O < this.f12208o00oo) {
            int i2 = this.f12214o00ooO0o;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f12210o00oo0oO.setDataPosition(this.f12213o00ooO0O);
            int readInt = this.f12210o00oo0oO.readInt();
            this.f12214o00ooO0o = this.f12210o00oo0oO.readInt();
            this.f12213o00ooO0O += readInt;
        }
        return this.f12214o00ooO0o == i;
    }

    @Override // o0O0Oooo.o0O0oo00
    public int o00ooo0O() {
        return this.f12210o00oo0oO.readInt();
    }

    @Override // o0O0Oooo.o0O0oo00
    public long o00oooo0() {
        return this.f12210o00oo0oO.readLong();
    }

    @Override // o0O0Oooo.o0O0oo00
    public <T extends Parcelable> T o0O00000() {
        return (T) this.f12210o00oo0oO.readParcelable(getClass().getClassLoader());
    }

    @Override // o0O0Oooo.o0O0oo00
    public IBinder o0O000o() {
        return this.f12210o00oo0oO.readStrongBinder();
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00O0(int i) {
        o00oOOo0();
        this.f12211o00ooO0 = i;
        this.f12209o00oo0o.put(i, this.f12210o00oo0oO.dataPosition());
        o0O0OOOo(0);
        o0O0OOOo(i);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00OO(boolean z) {
        this.f12210o00oo0oO.writeInt(z ? 1 : 0);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00OoO(Bundle bundle) {
        this.f12210o00oo0oO.writeBundle(bundle);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00o(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            this.f12210o00oo0oO.writeInt(-1);
            return;
        }
        this.f12210o00oo0oO.writeInt(bArr.length);
        this.f12210o00oo0oO.writeByteArray(bArr, i, i2);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00o0O(byte[] bArr) {
        if (bArr == null) {
            this.f12210o00oo0oO.writeInt(-1);
            return;
        }
        this.f12210o00oo0oO.writeInt(bArr.length);
        this.f12210o00oo0oO.writeByteArray(bArr);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0O0o(double d) {
        this.f12210o00oo0oO.writeDouble(d);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0OO0O(float f) {
        this.f12210o00oo0oO.writeFloat(f);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0OOOo(int i) {
        this.f12210o00oo0oO.writeInt(i);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0Oo0(long j) {
        this.f12210o00oo0oO.writeLong(j);
    }

    @Override // o0O0Oooo.o0O0oo00
    public CharSequence o0O0o() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12210o00oo0oO);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o0(IBinder iBinder) {
        this.f12210o00oo0oO.writeStrongBinder(iBinder);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o00O(String str) {
        this.f12210o00oo0oO.writeString(str);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o0OO(IInterface iInterface) {
        this.f12210o00oo0oO.writeStrongInterface(iInterface);
    }

    @Override // o0O0Oooo.o0O0oo00
    public String o0OoOoOO() {
        return this.f12210o00oo0oO.readString();
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0oO0O0o(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12210o00oo0oO, 0);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void oo0OOoo(Parcelable parcelable) {
        this.f12210o00oo0oO.writeParcelable(parcelable, 0);
    }
}
