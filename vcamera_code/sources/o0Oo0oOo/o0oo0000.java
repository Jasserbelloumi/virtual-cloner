package o0Oo0oOo;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import o0Oo.o00ooO;
/* loaded from: classes3.dex */
public final class o0oo0000 {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16628o00oOooO = 8192;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final byte[] f16629o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ByteBuffer f16630o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final FileChannel f16631o00oOo00;

    public o0oo0000(FileChannel fileChannel) {
        byte[] bArr = new byte[8192];
        this.f16629o00oOOo0 = bArr;
        this.f16630o00oOOoO = ByteBuffer.wrap(bArr);
        this.f16631o00oOo00 = fileChannel;
    }

    public void o00oOOo0(long j, o00ooO o00ooo, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            try {
                this.f16630o00oOOoO.limit((int) Math.min((long) PlaybackStateCompat.ACTION_PLAY_FROM_URI, j2));
                if (this.f16631o00oOo00.read(this.f16630o00oOOoO, j) == -1) {
                    throw new EOFException();
                }
                int position = this.f16630o00oOOoO.position();
                o00ooo.write(this.f16629o00oOOo0, 0, position);
                long j3 = position;
                j += j3;
                j2 -= j3;
            } finally {
                this.f16630o00oOOoO.clear();
            }
        }
    }

    public void o00oOOoO(long j, o00ooO o00ooo, long j2) throws IOException {
        if (j2 < 0 || j2 > o00ooo.f15434o00oo0O) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            try {
                int min = (int) Math.min((long) PlaybackStateCompat.ACTION_PLAY_FROM_URI, j2);
                o00ooo.read(this.f16629o00oOOo0, 0, min);
                this.f16630o00oOOoO.limit(min);
                do {
                    j += this.f16631o00oOo00.write(this.f16630o00oOOoO, j);
                } while (this.f16630o00oOOoO.hasRemaining());
                j2 -= min;
            } finally {
                this.f16630o00oOOoO.clear();
            }
        }
    }
}
