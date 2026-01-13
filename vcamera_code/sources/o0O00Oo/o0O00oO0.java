package o0O00Oo;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
/* loaded from: classes.dex */
public class o0O00oO0 extends o0O00OOO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<o00oOOo0> f11111o00oOOoO = ThreadLocal.withInitial(new Supplier() { // from class: o0O00Oo.o0O00o00
        @Override // java.util.function.Supplier
        public final Object get() {
            return o0O00oO0.o00oOo0o();
        }
    });

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public CharSequence f11114o00oOo00 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public ByteBuffer f11115o00oOooO = null;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final CharsetEncoder f11112o00oOOo0 = StandardCharsets.UTF_8.newEncoder();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final CharsetDecoder f11113o00oOOoO = StandardCharsets.UTF_8.newDecoder();
    }

    public static /* synthetic */ o00oOOo0 o00oOo0o() {
        return new o00oOOo0();
    }

    public static /* synthetic */ o00oOOo0 o00oOoO0() {
        return new o00oOOo0();
    }

    @Override // o0O00Oo.o0O00OOO
    public String o00oOOo0(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f11111o00oOOoO.get().f11113o00oOOoO;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // o0O00Oo.o0O00OOO
    public void o00oOOoO(CharSequence charSequence, ByteBuffer byteBuffer) {
        o00oOOo0 o00oooo02 = f11111o00oOOoO.get();
        if (o00oooo02.f11114o00oOo00 != charSequence) {
            o00oOo00(charSequence);
        }
        byteBuffer.put(o00oooo02.f11115o00oOooO);
    }

    @Override // o0O00Oo.o0O00OOO
    public int o00oOo00(CharSequence charSequence) {
        o00oOOo0 o00oooo02 = f11111o00oOOoO.get();
        int maxBytesPerChar = (int) (o00oooo02.f11112o00oOOo0.maxBytesPerChar() * charSequence.length());
        ByteBuffer byteBuffer = o00oooo02.f11115o00oOooO;
        if (byteBuffer == null || byteBuffer.capacity() < maxBytesPerChar) {
            o00oooo02.f11115o00oOooO = ByteBuffer.allocate(Math.max(128, maxBytesPerChar));
        }
        o00oooo02.f11115o00oOooO.clear();
        o00oooo02.f11114o00oOo00 = charSequence;
        CoderResult encode = o00oooo02.f11112o00oOOo0.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), o00oooo02.f11115o00oOooO, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        o00oooo02.f11115o00oOooO.flip();
        return o00oooo02.f11115o00oOooO.remaining();
    }
}
