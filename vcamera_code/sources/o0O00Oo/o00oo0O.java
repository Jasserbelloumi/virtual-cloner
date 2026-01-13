package o0O00Oo;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class o00oo0O {
    public static int o00oOOo0(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer o00oOOoO(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
