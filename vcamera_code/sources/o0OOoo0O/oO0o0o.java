package o0OOoo0O;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import o0OOoO0.o00oo;
import o0OOoo0O.o0OOO0;
/* loaded from: classes3.dex */
public class oO0o0o extends o0OOO0 {

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f15310o00ooO0O = o00oo.o00oOOo0(new byte[]{95, 63, Ascii.DC2, 95, 47, -30, -29, -124, 109, 43, Ascii.DC2, 81, 38, -29, -107, -110}, new byte[]{Ascii.FF, 92, 115, 51, 74, -122, -89, -10});

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f15311o00ooO0o = 4;

    /* renamed from: o00oo  reason: collision with root package name */
    public FloatBuffer f15312o00oo;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f15313o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public float f15314o00ooO00;

    public oO0o0o(o0OOO0.o00oOOoO o00ooooo2) {
        super(o00ooooo2);
        this.f15314o00ooO00 = 1.0f;
        this.f15313o00ooO0 = true;
    }

    @Override // o0OOoo0O.o0OOO0
    public FloatBuffer o00oOOoO() {
        if (this.f15313o00ooO0) {
            FloatBuffer floatBuffer = this.f15076o00oOooO;
            int capacity = floatBuffer.capacity();
            if (this.f15312o00oo == null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(capacity * 4);
                allocateDirect.order(ByteOrder.nativeOrder());
                this.f15312o00oo = allocateDirect.asFloatBuffer();
            }
            FloatBuffer floatBuffer2 = this.f15312o00oo;
            float f = this.f15314o00ooO00;
            for (int i = 0; i < capacity; i++) {
                floatBuffer2.put(i, ((floatBuffer.get(i) - 0.5f) * f) + 0.5f);
            }
            this.f15313o00ooO0 = false;
        }
        return this.f15312o00oo;
    }

    public void o00oo00O(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.f15314o00ooO00 = f;
            this.f15313o00ooO0 = true;
            return;
        }
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-12, -27, -23, Ascii.US, -34, 42, 55, 72, -18, -24, -2, Ascii.DC2, -41, 99}, new byte[]{-99, -117, -97, 126, -78, 67, 83, 104}) + f);
    }
}
