package multispace.multiapp.clone.bean;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public double f6681o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public double f6682o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public double f6683o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f6684o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f6685o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f6686o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f6687o0O0o;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Parcelable.Creator<LocationInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public LocationInfo createFromParcel(Parcel parcel) {
            return new LocationInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public LocationInfo[] newArray(int i) {
            return new LocationInfo[i];
        }
    }

    public LocationInfo() {
        this.f6682o00oo0O0 = 0.0d;
        this.f6681o00oo0O = 0.0d;
        this.f6683o00oo0Oo = 0.0d;
        this.f6685o00oo0o0 = 0.0f;
        this.f6684o00oo0o = 0.0f;
        this.f6686o00oo0oO = 0.0f;
        this.f6687o0O0o = false;
    }

    public LocationInfo(double d, double d2) {
        this.f6683o00oo0Oo = 0.0d;
        this.f6685o00oo0o0 = 0.0f;
        this.f6684o00oo0o = 0.0f;
        this.f6686o00oo0oO = 0.0f;
        this.f6687o0O0o = false;
        this.f6682o00oo0O0 = d;
        this.f6681o00oo0O = d2;
    }

    public LocationInfo(Parcel parcel) {
        this.f6682o00oo0O0 = 0.0d;
        this.f6681o00oo0O = 0.0d;
        this.f6683o00oo0Oo = 0.0d;
        this.f6685o00oo0o0 = 0.0f;
        this.f6684o00oo0o = 0.0f;
        this.f6686o00oo0oO = 0.0f;
        this.f6687o0O0o = false;
        this.f6682o00oo0O0 = parcel.readDouble();
        this.f6681o00oo0O = parcel.readDouble();
        this.f6683o00oo0Oo = parcel.readDouble();
        this.f6686o00oo0oO = parcel.readFloat();
        this.f6685o00oo0o0 = parcel.readFloat();
        this.f6684o00oo0o = parcel.readFloat();
        this.f6687o0O0o = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Location o00oOOo0() {
        Location location = new Location(o00oo.o00oOOo0(new byte[]{-72, o0OO0o00.f16655o00oOoOO, 37}, new byte[]{-33, 81, 86, -67, -30, -66, 106, -67}));
        location.setLatitude(this.f6682o00oo0O0);
        location.setLongitude(this.f6681o00oo0O);
        location.setSpeed(this.f6685o00oo0o0);
        location.setBearing(this.f6684o00oo0o);
        location.setAccuracy(40.0f);
        location.setTime(System.currentTimeMillis());
        Bundle bundle = new Bundle();
        bundle.putInt(o00oo.o00oOOo0(new byte[]{-11, 117, 89, 97, -70, -7, 6, -75, -29, 103}, new byte[]{-122, Ascii.DC4, 45, 4, -42, -107, 111, -63}), 10);
        bundle.putInt(o00oo.o00oOOo0(new byte[]{-23, 0, Ascii.CAN, 5, 105, 0, -30, 117, -1, Ascii.DC2, Ascii.SUB, 1, 105, Ascii.EM, -18}, new byte[]{-102, 97, 108, 96, 5, 108, -117, 1}), 10);
        location.setExtras(bundle);
        return location;
    }

    public double o00oOOoO() {
        return this.f6682o00oo0O0;
    }

    public double o00oOo00() {
        return this.f6681o00oo0O;
    }

    public boolean o00oOo0O() {
        return this.f6687o0O0o;
    }

    public void o00oOo0o(boolean z) {
        this.f6687o0O0o = z;
    }

    public void o00oOoO(double d) {
        this.f6681o00oo0O = d;
    }

    public void o00oOoO0(double d) {
        this.f6682o00oo0O0 = d;
    }

    public boolean o00oOooO() {
        return this.f6682o00oo0O0 == 0.0d && this.f6681o00oo0O == 0.0d;
    }

    public String toString() {
        return o00oo.o00oOOo0(new byte[]{Ascii.SI, Byte.MAX_VALUE, -16, 41, -84, -122, 78, -93, 35, 72, -13, 43, -71, -101, 83, -71, 41, 86, -91, 106}, new byte[]{77, 51, -97, 74, -51, -14, 39, -52}) + this.f6682o00oo0O0 + o00oo.o00oOOo0(new byte[]{-63, -73, -50, 106, -25, -119, -2, 0, -104, -13, -57, 63, -87}, new byte[]{-19, -105, -94, 5, -119, -18, -105, 116}) + this.f6681o00oo0O + o00oo.o00oOOo0(new byte[]{-109, -20, -69, 43, 77, 48, 10, -120, -37, -87, -32, 103}, new byte[]{-65, -52, -38, 71, 57, 89, 126, -3}) + this.f6683o00oo0Oo + o00oo.o00oOOo0(new byte[]{Ascii.CR, Ascii.FS, -66, -68, 4, -111, -41, -9, 1}, new byte[]{o0OO0o00.f16655o00oOoOO, 60, -51, -52, 97, -12, -77, -51}) + this.f6685o00oo0o0 + o00oo.o00oOOo0(new byte[]{-51, 76, 34, -69, Byte.MAX_VALUE, -30, -1, 47, -122, 86, 96}, new byte[]{-31, 108, SignedBytes.MAX_POWER_OF_TWO, -34, Ascii.RS, -112, -106, 65}) + this.f6684o00oo0o + o00oo.o00oOOo0(new byte[]{Byte.MIN_VALUE, 63, 126, -49, -26, -59, -67, -39, -49, 102, 37, -116}, new byte[]{-84, Ascii.US, Ascii.US, -84, -123, -80, -49, -72}) + this.f6686o00oo0oO + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f6682o00oo0O0);
        parcel.writeDouble(this.f6681o00oo0O);
        parcel.writeDouble(this.f6683o00oo0Oo);
        parcel.writeFloat(this.f6685o00oo0o0);
        parcel.writeFloat(this.f6684o00oo0o);
        parcel.writeFloat(this.f6686o00oo0oO);
        parcel.writeInt(this.f6687o0O0o ? 1 : 0);
    }
}
