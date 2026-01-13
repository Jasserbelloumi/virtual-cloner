package multispace.multiapp.clone.manager.xp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
public class XposedConfig implements Parcelable {
    public static final Parcelable.Creator<XposedConfig> CREATOR = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Map<String, Boolean> f6690o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f6691o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public HashMap<String, HashSet<String>> f6692o00oo0Oo;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Parcelable.Creator<XposedConfig> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public XposedConfig createFromParcel(Parcel parcel) {
            return new XposedConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public XposedConfig[] newArray(int i) {
            return new XposedConfig[i];
        }
    }

    public XposedConfig() {
        this.f6690o00oo0O = new HashMap();
        this.f6692o00oo0Oo = new HashMap<>();
    }

    public XposedConfig(Parcel parcel) {
        this.f6690o00oo0O = new HashMap();
        this.f6692o00oo0Oo = new HashMap<>();
        this.f6691o00oo0O0 = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f6690o00oo0O = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f6690o00oo0O.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            HashSet<String> hashSet = new HashSet<>();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            for (int i3 = 0; i3 < readInt3; i3++) {
                hashSet.add(parcel.readString());
            }
            this.f6692o00oo0Oo.put(readString, hashSet);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f6691o00oo0O0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f6690o00oo0O.size());
        for (Map.Entry<String, Boolean> entry : this.f6690o00oo0O.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        parcel.writeInt(this.f6692o00oo0Oo.keySet().size());
        for (String str : this.f6692o00oo0Oo.keySet()) {
            parcel.writeString(str);
            if (this.f6692o00oo0Oo.get(str) == null || this.f6692o00oo0Oo.get(str).size() <= 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(this.f6692o00oo0Oo.get(str).size());
                Iterator<String> it = this.f6692o00oo0Oo.get(str).iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
        }
    }
}
