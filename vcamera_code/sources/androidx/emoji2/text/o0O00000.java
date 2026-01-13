package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O000.o0O00OOO;
import o0O00Oo.o0O000Oo;
import o0ooOoOO.ooOOOOoo;
@o0OOooO0(19)
@o00oOooO.o0O000O
/* loaded from: classes.dex */
public final class o0O00000 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f2758o00oOo0O = 1024;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f2759o00oOo0o = "EmojiCompat.MetadataRepo.create";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O000Oo f2760o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final char[] f2761o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOOo0 f2762o00oOo00 = new o00oOOo0(1024);
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Typeface f2763o00oOooO;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final SparseArray<o00oOOo0> f2764o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oo0O0 f2765o00oOOoO;

        public o00oOOo0() {
            this(1);
        }

        public o00oOOo0(int i) {
            this.f2764o00oOOo0 = new SparseArray<>(i);
        }

        public o00oOOo0 o00oOOo0(int i) {
            SparseArray<o00oOOo0> sparseArray = this.f2764o00oOOo0;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final o00oo0O0 o00oOOoO() {
            return this.f2765o00oOOoO;
        }

        public void o00oOo00(@oo0oO0 o00oo0O0 o00oo0o02, int i, int i2) {
            o00oOOo0 o00oOOo02 = o00oOOo0(o00oo0o02.o00oOOoO(i));
            if (o00oOOo02 == null) {
                o00oOOo02 = new o00oOOo0();
                this.f2764o00oOOo0.put(o00oo0o02.o00oOOoO(i), o00oOOo02);
            }
            if (i2 > i) {
                o00oOOo02.o00oOo00(o00oo0o02, i + 1, i2);
            } else {
                o00oOOo02.f2765o00oOOoO = o00oo0o02;
            }
        }
    }

    public o0O00000(@oo0oO0 Typeface typeface, @oo0oO0 o0O000Oo o0o000oo) {
        this.f2763o00oOooO = typeface;
        this.f2760o00oOOo0 = o0o000oo;
        this.f2761o00oOOoO = new char[o0o000oo.o00ooo0() * 2];
        o00oOOo0(o0o000oo);
    }

    @oo0oO0
    public static o0O00000 o00oOOoO(@oo0oO0 AssetManager assetManager, @oo0oO0 String str) throws IOException {
        try {
            o0O00OOO.o00oOOoO(f2759o00oOo0o);
            o0O00000 o0o00000 = new o0O00000(Typeface.createFromAsset(assetManager, str), o0.o00oOOoO(assetManager, str));
            o0O00OOO.o00oOOo0.o00oOOoO();
            return o0o00000;
        } catch (Throwable th) {
            o0O00OOO.o00oOooO();
            throw th;
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static o0O00000 o00oOo00(@oo0oO0 Typeface typeface) {
        try {
            o0O00OOO.o00oOOoO(f2759o00oOo0o);
            o0O00000 o0o00000 = new o0O00000(typeface, new o0O000Oo());
            o0O00OOO.o00oOOo0.o00oOOoO();
            return o0o00000;
        } catch (Throwable th) {
            o0O00OOO.o00oOooO();
            throw th;
        }
    }

    @oo0oO0
    public static o0O00000 o00oOo0O(@oo0oO0 Typeface typeface, @oo0oO0 ByteBuffer byteBuffer) throws IOException {
        try {
            o0O00OOO.o00oOOoO(f2759o00oOo0o);
            o0O00000 o0o00000 = new o0O00000(typeface, o0.o00oOooO(byteBuffer));
            o0O00OOO.o00oOOo0.o00oOOoO();
            return o0o00000;
        } catch (Throwable th) {
            o0O00OOO.o00oOooO();
            throw th;
        }
    }

    @oo0oO0
    public static o0O00000 o00oOooO(@oo0oO0 Typeface typeface, @oo0oO0 InputStream inputStream) throws IOException {
        try {
            o0O00OOO.o00oOOoO(f2759o00oOo0o);
            o0O00000 o0o00000 = new o0O00000(typeface, o0.o00oOo00(inputStream));
            o0O00OOO.o00oOOo0.o00oOOoO();
            return o0o00000;
        } catch (Throwable th) {
            o0O00OOO.o00oOooO();
            throw th;
        }
    }

    public final void o00oOOo0(o0O000Oo o0o000oo) {
        int o00ooo02 = o0o000oo.o00ooo0();
        for (int i = 0; i < o00ooo02; i++) {
            o00oo0O0 o00oo0o02 = new o00oo0O0(this, i);
            Character.toChars(o00oo0o02.o00oOoO0(), this.f2761o00oOOoO, i * 2);
            o00oOoo0(o00oo0o02);
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public char[] o00oOo0o() {
        return this.f2761o00oOOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public int o00oOoO() {
        return this.f2760o00oOOo0.o00ooooO();
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o0O000Oo o00oOoO0() {
        return this.f2760o00oOOo0;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o00oOOo0 o00oOoOO() {
        return this.f2762o00oOo00;
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Typeface o00oOoOo() {
        return this.f2763o00oOooO;
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void o00oOoo0(@oo0oO0 o00oo0O0 o00oo0o02) {
        ooOOOOoo.o00oo00O(o00oo0o02, "emoji metadata cannot be null");
        ooOOOOoo.o00oOOoO(o00oo0o02.o00oOo00() > 0, "invalid metadata codepoint length");
        this.f2762o00oOo00.o00oOo00(o00oo0o02, 0, o00oo0o02.o00oOo00() - 1);
    }
}
