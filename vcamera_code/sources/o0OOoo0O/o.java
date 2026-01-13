package o0OOoo0O;

import android.media.Image;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class o extends Image {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Image.Plane[] f14925o00oo0oO;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f14921o00oo0O0 = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f14920o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f14922o00oo0Oo = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public long f14924o00oo0o0 = 0;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public ByteBuffer f14923o00oo0o = null;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends Image.Plane {
        public o00oOOo0() {
        }

        @Override // android.media.Image.Plane
        public ByteBuffer getBuffer() {
            return o.this.f14923o00oo0o;
        }

        @Override // android.media.Image.Plane
        public int getPixelStride() {
            return 0;
        }

        @Override // android.media.Image.Plane
        public int getRowStride() {
            return 0;
        }
    }

    public o() {
        this.f14925o00oo0oO = r1;
        Image.Plane[] planeArr = {new o00oOOo0()};
    }

    @Override // android.media.Image, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.Image
    public int getFormat() {
        return this.f14921o00oo0O0;
    }

    @Override // android.media.Image
    public int getHeight() {
        return this.f14922o00oo0Oo;
    }

    @Override // android.media.Image
    public Image.Plane[] getPlanes() {
        return this.f14925o00oo0oO;
    }

    @Override // android.media.Image
    public int getScalingMode() {
        return 0;
    }

    @Override // android.media.Image
    public long getTimestamp() {
        return this.f14924o00oo0o0;
    }

    @Override // android.media.Image
    public int getTransform() {
        return 0;
    }

    @Override // android.media.Image
    public int getWidth() {
        return this.f14920o00oo0O;
    }

    public void o00oOOoO(ByteBuffer byteBuffer) {
        this.f14923o00oo0o = byteBuffer;
        byteBuffer.position(0);
    }
}
