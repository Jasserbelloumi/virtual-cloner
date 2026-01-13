package o00oo0Oo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0o {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final byte[] f7524o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public String f7525o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public List<byte[]> f7526o00oOo00;

    public o0O0o(@oo0oO0 byte[] bArr) {
        this.f7524o00oOOo0 = bArr;
    }

    public o0O0o(@oo0oO0 byte[] bArr, @oo0oO0 String str, @oo0oO0 List<byte[]> list) {
        this.f7524o00oOOo0 = bArr;
        this.f7525o00oOOoO = str;
        this.f7526o00oOo00 = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f7526o00oOo00.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static int o00oOOoO(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @oo0oO0
    public static o0O0o o00oOo00(String str, List<byte[]> list) throws IOException {
        return new o0O0o(o00oOooO(str, list), str, list);
    }

    @oo0oO0
    public static o0O0o o00oOo0O(@oo0oO0 byte[] bArr) {
        return new o0O0o(bArr);
    }

    @oo0oO0
    public static byte[] o00oOooO(@oo0oO0 String str, @oo0oO0 List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: o00oo0Oo.o00oo0O
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o0O0o.o00oOOoO((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O0o.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7524o00oOOo0, ((o0O0o) obj).f7524o00oOOo0);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7524o00oOOo0);
    }

    @oo0oO0
    public byte[] o00oOo0o(int i) throws IOException {
        o00oOoOO();
        List<byte[]> list = this.f7526o00oOo00;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.f7526o00oOo00.get(i).length);
        }
        throw new IllegalStateException();
    }

    @oo0oO0
    public String o00oOoO() throws IOException {
        o00oOoOO();
        String str = this.f7525o00oOOoO;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int o00oOoO0() throws IOException {
        o00oOoOO();
        List<byte[]> list = this.f7526o00oOo00;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    public final void o00oOoOO() throws IOException {
        if (this.f7525o00oOOoO != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f7524o00oOOo0));
        this.f7525o00oOOoO = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.f7526o00oOo00 = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) != readInt2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f7526o00oOo00.add(bArr);
        }
    }

    @oo0oO0
    public byte[] o00oOoOo() {
        byte[] bArr = this.f7524o00oOOo0;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
