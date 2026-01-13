package multispace.multiapp.clone.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.FloatBuffer;
import o00oOooO.oo0oO0;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOoO0o.o0OO0;
import o0OOoo0O.o0o0000;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class SettingItem implements Parcelable {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f6699o00ooO = 3;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f6703o00ooOo = 0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f6705o00ooOoO = 0;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f6706o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f6707o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public String f6708o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f6709o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f6710o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f6711o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f6712o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f6713o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f6714o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f6715o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public FloatBuffer f6716o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f6717o0O0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f6701o00ooOO0 = o00oo.o00oOOo0(new byte[]{9, -14, 36, 54, 69, -49, 62}, new byte[]{121, Byte.MIN_VALUE, 65, SignedBytes.MAX_POWER_OF_TWO, 44, -86, 73, -26});

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f6700o00ooOO = o00oo.o00oOOo0(new byte[]{-10, -47, 51, -34, -40, -92, -73}, new byte[]{-122, -72, 80, -86, -83, -42, -46, 121});

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f6702o00ooOOo = o00oo.o00oOOo0(new byte[]{-70, -25, 100, 91, 117, -116, 123, -14, -96}, new byte[]{-52, -114, 0, 62, Ascii.SUB, -17, Ascii.SUB, -98});

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f6704o00ooOo0 = o00oo.o00oOOo0(new byte[]{Ascii.ETB, 93, -101, -5, -59, -59}, new byte[]{120, 41, -13, -98, -73, -74, -117, -49});
    public static final Parcelable.Creator<SettingItem> CREATOR = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Parcelable.Creator<SettingItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOo0 */
        public SettingItem createFromParcel(Parcel parcel) {
            return new SettingItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: o00oOOoO */
        public SettingItem[] newArray(int i) {
            return new SettingItem[i];
        }
    }

    public SettingItem() {
        this.f6708o00oo0O0 = "";
        this.f6712o00oo0oO = 2003;
        this.f6717o0O0o = false;
        this.f6706o00oo = 0;
        this.f6714o00ooO00 = 0;
        this.f6713o00ooO0 = 0;
        this.f6715o00ooO0O = 0;
        this.f6716o00ooO0o = null;
        this.f6716o00ooO0o = o0o0000.o00oOo00(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    }

    public SettingItem(Parcel parcel) {
        this();
        this.f6707o00oo0O = parcel.readInt();
        this.f6709o00oo0Oo = parcel.readInt();
        this.f6712o00oo0oO = parcel.readInt();
        this.f6717o0O0o = parcel.readInt() == 1;
        this.f6706o00oo = parcel.readInt();
        this.f6714o00ooO00 = parcel.readInt();
        this.f6713o00ooO0 = parcel.readInt();
        this.f6715o00ooO0O = parcel.readInt();
        for (int i = 0; i < 8; i++) {
            this.f6716o00ooO0o.put(i, parcel.readFloat());
        }
    }

    public static SettingItem o00oOo00(String str) {
        File file;
        Parcel obtain = Parcel.obtain();
        try {
            if (o0OO0.f14869o00oOOoO == null) {
                File filesDir = o0OO0.f14868o00oOOo0.getFilesDir();
                file = new File(filesDir, str + o00oo.o00oOOo0(new byte[]{-66}, new byte[]{-31, -48, -43, 100, -10, -105, Ascii.RS, 78}) + 3 + o00oo.o00oOOo0(new byte[]{-49, Ascii.DC4, 41, -101}, new byte[]{-31, 96, 81, -17, 6, Ascii.CR, -126, -88}));
            } else {
                File filesDir2 = o0OO0.f14868o00oOOo0.getFilesDir();
                file = new File(filesDir2, o0OO0.f14869o00oOOoO.getClass().getName() + o00oo.o00oOOo0(new byte[]{32}, new byte[]{Byte.MAX_VALUE, -48, 56, -11, o0OO0o00.f16655o00oOoOO, -108, 73, 88}) + str + o00oo.o00oOOo0(new byte[]{119}, new byte[]{40, 107, -125, 69, 110, -103, -67, -21}) + 3 + o00oo.o00oOOo0(new byte[]{17, 125, -53, -126}, new byte[]{63, 9, -77, -10, -64, 58, -39, 63}));
            }
            if (!file.exists()) {
                SettingItem settingItem = new SettingItem();
                settingItem.f6708o00oo0O0 = str;
                return settingItem;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            if (read == length) {
                obtain.unmarshall(bArr, 0, length);
                obtain.setDataPosition(0);
                SettingItem settingItem2 = new SettingItem(obtain);
                settingItem2.f6708o00oo0O0 = str;
                return settingItem2;
            }
            throw new IOException(o00oo.o00oOOo0(new byte[]{-29, Ascii.DC2, Ascii.SUB, 67, -103, -123, -49, -118, -39, 92, 9, 68, -108, -124, -49, -82, -45, Ascii.SO, 8, 72, -122, -108, -118, -112, -43, Ascii.EM, 91, 71, -100, -116, -118, -48}, new byte[]{-74, 124, 123, o0OO0o00.f16655o00oOoOO, -11, -32, -17, -2}));
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                obtain.recycle();
                SettingItem settingItem3 = new SettingItem();
                settingItem3.f6708o00oo0O0 = str;
                return settingItem3;
            } finally {
                obtain.recycle();
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void o00oOOo0(float f) {
        FloatBuffer floatBuffer = this.f6716o00ooO0o;
        floatBuffer.put(2, floatBuffer.get(2) + f);
        FloatBuffer floatBuffer2 = this.f6716o00ooO0o;
        floatBuffer2.put(5, floatBuffer2.get(5) + f);
        FloatBuffer floatBuffer3 = this.f6716o00ooO0o;
        floatBuffer3.put(6, floatBuffer3.get(6) + f);
        FloatBuffer floatBuffer4 = this.f6716o00ooO0o;
        floatBuffer4.put(7, floatBuffer4.get(7) + f);
    }

    public float o00oOOoO() {
        return this.f6716o00ooO0o.get(2);
    }

    public void o00oOooO() {
        File file;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                if (o0OO0.f14869o00oOOoO == null) {
                    File filesDir = o0OO0.f14868o00oOOo0.getFilesDir();
                    file = new File(filesDir, this.f6708o00oo0O0 + o00oo.o00oOOo0(new byte[]{-94}, new byte[]{-3, -72, 91, 103, 68, -65, -37, -74}) + 3 + o00oo.o00oOOo0(new byte[]{105, -99, -22, -87}, new byte[]{71, -23, -110, -35, -45, oo0OOoo.f13516o00oOoO, 72, 126}));
                } else {
                    File filesDir2 = o0OO0.f14868o00oOOo0.getFilesDir();
                    file = new File(filesDir2, o0OO0.f14869o00oOOoO.getClass().getName() + o00oo.o00oOOo0(new byte[]{-98}, new byte[]{-63, -91, Ascii.EM, -41, -53, 104, -71, -65}) + this.f6708o00oo0O0 + o00oo.o00oOOo0(new byte[]{-127}, new byte[]{-34, -69, -94, -41, Ascii.SI, -54, -67, -60}) + 3 + o00oo.o00oOOo0(new byte[]{-37, 124, -85, -39}, new byte[]{-11, 8, -45, -83, -110, -29, -46, -45}));
                }
                writeToParcel(obtain, 0);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(obtain.marshall());
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
        parcel.writeInt(this.f6707o00oo0O);
        parcel.writeInt(this.f6709o00oo0Oo);
        parcel.writeInt(this.f6712o00oo0oO);
        parcel.writeInt(this.f6717o0O0o ? 1 : 0);
        parcel.writeInt(this.f6706o00oo);
        parcel.writeInt(this.f6714o00ooO00);
        parcel.writeInt(this.f6713o00ooO0);
        parcel.writeInt(this.f6715o00ooO0O);
        for (int i2 = 0; i2 < 8; i2++) {
            parcel.writeFloat(this.f6716o00ooO0o.get(i2));
        }
    }
}
