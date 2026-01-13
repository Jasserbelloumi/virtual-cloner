package multispace.multiapp.clone.manager.gps;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import multispace.multiapp.clone.bean.LocationInfo;
/* loaded from: classes3.dex */
public class LocationConfig implements Parcelable {
    public static final Parcelable.Creator<LocationConfig> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Map<String, LocationInfo> f6688o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f6689o00oo0O0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Parcelable.Creator<LocationConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public LocationConfig createFromParcel(Parcel parcel) {
            return new LocationConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public LocationConfig[] newArray(int i) {
            return new LocationConfig[i];
        }
    }

    public LocationConfig() {
        this.f6688o00oo0O = new HashMap();
    }

    public LocationConfig(Parcel parcel) {
        this.f6688o00oo0O = new HashMap();
        this.f6689o00oo0O0 = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f6688o00oo0O = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f6688o00oo0O.put(parcel.readString(), (LocationInfo) parcel.readParcelable(getClass().getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f6689o00oo0O0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f6688o00oo0O.size());
        for (Map.Entry<String, LocationInfo> entry : this.f6688o00oo0O.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), 0);
        }
    }
}
