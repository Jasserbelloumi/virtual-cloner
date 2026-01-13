package o0O0Oooo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o0O0Oooo.o0O0oo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o0OO000 extends o0O0oo00 {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f12236o00ooOO = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final Charset f12237o00ooOO0 = Charset.forName(C.UTF16_NAME);

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f12238o00ooOOo = 1;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f12239o00ooOo = 3;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f12240o00ooOo0 = 2;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f12241o00ooOoO = 4;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f12242o00ooOoo = 5;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f12243o00ooo0 = 7;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f12244o00ooo00 = 6;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f12245o00ooo0O = 8;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f12246o00ooo0o = 9;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f12247o00oooO = 10;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f12248o00oooOO = 11;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f12249o00oooOo = 12;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f12250o00oooo = 14;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f12251o00oooo0 = 13;

    /* renamed from: o00oo  reason: collision with root package name */
    public DataOutputStream f12252o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final DataInputStream f12253o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final DataOutputStream f12254o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f12255o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f12256o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o00oOOoO f12257o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f12258o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f12259o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public DataInputStream f12260o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends FilterInputStream {
        public o00oOOo0(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            o0OO000 o0oo000 = o0OO000.this;
            int i = o0oo000.f12255o00ooO;
            if (i == -1 || o0oo000.f12258o00ooO0O < i) {
                int read = super.read();
                o0OO000.this.f12258o00ooO0O++;
                return read;
            }
            throw new IOException();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            o0OO000 o0oo000 = o0OO000.this;
            int i3 = o0oo000.f12255o00ooO;
            if (i3 == -1 || o0oo000.f12258o00ooO0O < i3) {
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    o0OO000.this.f12258o00ooO0O += read;
                }
                return read;
            }
            throw new IOException();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            o0OO000 o0oo000 = o0OO000.this;
            int i = o0oo000.f12255o00ooO;
            if (i == -1 || o0oo000.f12258o00ooO0O < i) {
                long skip = super.skip(j);
                if (skip > 0) {
                    o0OO000.this.f12258o00ooO0O += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ByteArrayOutputStream f12262o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final DataOutputStream f12263o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f12264o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final DataOutputStream f12265o00oOooO;

        public o00oOOoO(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f12262o00oOOo0 = byteArrayOutputStream;
            this.f12263o00oOOoO = new DataOutputStream(byteArrayOutputStream);
            this.f12264o00oOo00 = i;
            this.f12265o00oOooO = dataOutputStream;
        }

        public void o00oOOo0() throws IOException {
            this.f12263o00oOOoO.flush();
            int size = this.f12262o00oOOo0.size();
            this.f12265o00oOooO.writeInt((this.f12264o00oOo00 << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f12265o00oOooO.writeInt(size);
            }
            this.f12262o00oOOo0.writeTo(this.f12265o00oOooO);
        }
    }

    public o0OO000(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.o00oOOo0(), new androidx.collection.o00oOOo0(), new androidx.collection.o00oOOo0());
    }

    public o0OO000(InputStream inputStream, OutputStream outputStream, androidx.collection.o00oOOo0<String, Method> o00oooo02, androidx.collection.o00oOOo0<String, Method> o00oooo03, androidx.collection.o00oOOo0<String, Class> o00oooo04) {
        super(o00oooo02, o00oooo03, o00oooo04);
        this.f12258o00ooO0O = 0;
        this.f12259o00ooO0o = -1;
        this.f12255o00ooO = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new o00oOOo0(inputStream)) : null;
        this.f12253o00oo0o = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f12254o00oo0oO = dataOutputStream;
        this.f12260o0O0o = dataInputStream;
        this.f12252o00oo = dataOutputStream;
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o00oOOo0() {
        o00oOOoO o00ooooo2 = this.f12257o00ooO00;
        if (o00ooooo2 != null) {
            try {
                if (o00ooooo2.f12262o00oOOo0.size() != 0) {
                    this.f12257o00ooO00.o00oOOo0();
                }
                this.f12257o00ooO00 = null;
            } catch (IOException e) {
                throw new o0O0oo00.o00oOOoO(e);
            }
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public o0O0oo00 o00oOo00() {
        return new o0OO000(this.f12260o0O0o, this.f12252o00oo, this.f12232o00oOOo0, this.f12233o00oOOoO, this.f12234o00oOo00);
    }

    @Override // o0O0Oooo.o0O0oo00
    public boolean o00oOoOO() {
        return true;
    }

    @Override // o0O0Oooo.o0O0oo00
    public boolean o00oOooo() {
        try {
            return this.f12260o0O0o.readBoolean();
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public Bundle o00oo0O0() {
        int o00ooo0O2 = o00ooo0O();
        if (o00ooo0O2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < o00ooo0O2; i++) {
            o0O0o0oo(o00ooo0O(), o0OoOoOO(), bundle);
        }
        return bundle;
    }

    @Override // o0O0Oooo.o0O0oo00
    public byte[] o00oo0o0() {
        try {
            int readInt = this.f12260o0O0o.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f12260o0O0o.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public double o00ooO0() {
        try {
            return this.f12260o0O0o.readDouble();
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public float o00ooOo() {
        try {
            return this.f12260o0O0o.readFloat();
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public boolean o00ooOo0(int i) {
        while (true) {
            try {
                int i2 = this.f12259o00ooO0o;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.f12258o00ooO0O;
                int i4 = this.f12255o00ooO;
                if (i3 < i4) {
                    this.f12253o00oo0o.skip(i4 - i3);
                }
                this.f12255o00ooO = -1;
                int readInt = this.f12253o00oo0o.readInt();
                this.f12258o00ooO0O = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.f12253o00oo0o.readInt();
                }
                this.f12259o00ooO0o = (readInt >> 16) & 65535;
                this.f12255o00ooO = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public int o00ooo0O() {
        try {
            return this.f12260o0O0o.readInt();
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public long o00oooo0() {
        try {
            return this.f12260o0O0o.readLong();
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public <T extends Parcelable> T o0O00000() {
        return null;
    }

    @Override // o0O0Oooo.o0O0oo00
    public IBinder o0O000o() {
        return null;
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00O0(int i) {
        o00oOOo0();
        o00oOOoO o00ooooo2 = new o00oOOoO(i, this.f12254o00oo0oO);
        this.f12257o00ooO00 = o00ooooo2;
        this.f12252o00oo = o00ooooo2.f12263o00oOOoO;
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00OO(boolean z) {
        try {
            this.f12252o00oo.writeBoolean(z);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00OoO(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f12252o00oo.writeInt(-1);
                return;
            }
            Set<String> keySet = bundle.keySet();
            this.f12252o00oo.writeInt(keySet.size());
            for (String str : keySet) {
                o0O0o00O(str);
                o0O0oo0O(bundle.get(str));
            }
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00o(byte[] bArr, int i, int i2) {
        try {
            if (bArr == null) {
                this.f12252o00oo.writeInt(-1);
                return;
            }
            this.f12252o00oo.writeInt(i2);
            this.f12252o00oo.write(bArr, i, i2);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O00o0O(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f12252o00oo.writeInt(-1);
                return;
            }
            this.f12252o00oo.writeInt(bArr.length);
            this.f12252o00oo.write(bArr);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0O0o(double d) {
        try {
            this.f12252o00oo.writeDouble(d);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0OO0O(float f) {
        try {
            this.f12252o00oo.writeFloat(f);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0OOOo(int i) {
        try {
            this.f12252o00oo.writeInt(i);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0Oo0(long j) {
        try {
            this.f12252o00oo.writeLong(j);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public CharSequence o0O0o() {
        return null;
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o0(IBinder iBinder) {
        if (!this.f12256o00ooO0) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o00O(String str) {
        try {
            if (str == null) {
                this.f12252o00oo.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(f12237o00ooOO0);
            this.f12252o00oo.writeInt(bytes.length);
            this.f12252o00oo.write(bytes);
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0O0o0OO(IInterface iInterface) {
        if (!this.f12256o00ooO0) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public final void o0O0o0oo(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, o00oo0O0());
                return;
            case 3:
                bundle.putString(str, o0OoOoOO());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) o00oOoOo(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, o00oOooo());
                return;
            case 6:
                bundle.putBooleanArray(str, o00oo0());
                return;
            case 7:
                bundle.putDouble(str, o00ooO0());
                return;
            case 8:
                bundle.putDoubleArray(str, o00ooO0o());
                return;
            case 9:
                bundle.putInt(str, o00ooo0O());
                return;
            case 10:
                bundle.putIntArray(str, o00oooO());
                return;
            case 11:
                bundle.putLong(str, o00oooo0());
                return;
            case 12:
                bundle.putLongArray(str, o00ooooO());
                return;
            case 13:
                bundle.putFloat(str, o00ooOo());
                return;
            case 14:
                bundle.putFloatArray(str, o00ooOoo());
                return;
            default:
                throw new RuntimeException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown type ", i));
        }
    }

    public final void o0O0oo0O(Object obj) {
        int intValue;
        if (obj == null) {
            intValue = 0;
        } else if (obj instanceof Bundle) {
            o0O0OOOo(1);
            o0O00OoO((Bundle) obj);
            return;
        } else if (obj instanceof String) {
            o0O0OOOo(3);
            o0O0o00O((String) obj);
            return;
        } else if (obj instanceof String[]) {
            o0O0OOOo(4);
            o0O00O0o((String[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            o0O0OOOo(5);
            o0O00OO(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof boolean[]) {
            o0O0OOOo(6);
            o0O00Oo((boolean[]) obj);
            return;
        } else if (obj instanceof Double) {
            o0O0OOOo(7);
            o0O0O0o(((Double) obj).doubleValue());
            return;
        } else if (obj instanceof double[]) {
            o0O0OOOo(8);
            o0O0O0oo((double[]) obj);
            return;
        } else if (!(obj instanceof Integer)) {
            if (obj instanceof int[]) {
                o0O0OOOo(10);
                o0O0OOoO((int[]) obj);
                return;
            } else if (obj instanceof Long) {
                o0O0OOOo(11);
                o0O0Oo0(((Long) obj).longValue());
                return;
            } else if (obj instanceof long[]) {
                o0O0OOOo(12);
                o0O0Oo0o((long[]) obj);
                return;
            } else if (obj instanceof Float) {
                o0O0OOOo(13);
                o0O0OO0O(((Float) obj).floatValue());
                return;
            } else if (obj instanceof float[]) {
                o0O0OOOo(14);
                o0O0OOO0((float[]) obj);
                return;
            } else {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Unsupported type ");
                o00oOOo02.append(obj.getClass());
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
        } else {
            o0O0OOOo(9);
            intValue = ((Integer) obj).intValue();
        }
        o0O0OOOo(intValue);
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0OoO00O(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f12256o00ooO0 = z2;
    }

    @Override // o0O0Oooo.o0O0oo00
    public String o0OoOoOO() {
        try {
            int readInt = this.f12260o0O0o.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f12260o0O0o.readFully(bArr);
                return new String(bArr, f12237o00ooOO0);
            }
            return null;
        } catch (IOException e) {
            throw new o0O0oo00.o00oOOoO(e);
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void o0oO0O0o(CharSequence charSequence) {
        if (!this.f12256o00ooO0) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // o0O0Oooo.o0O0oo00
    public void oo0OOoo(Parcelable parcelable) {
        if (!this.f12256o00ooO0) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }
}
