package androidx.fragment.app;

import java.io.Writer;
/* loaded from: classes.dex */
public final class o0O0OOOo extends Writer {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public StringBuilder f3126o00oo0O = new StringBuilder(128);

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f3127o00oo0O0;

    public o0O0OOOo(String str) {
        this.f3127o00oo0O0 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o00oOOo0();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        o00oOOo0();
    }

    public final void o00oOOo0() {
        if (this.f3126o00oo0O.length() > 0) {
            this.f3126o00oo0O.toString();
            StringBuilder sb = this.f3126o00oo0O;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                o00oOOo0();
            } else {
                this.f3126o00oo0O.append(c);
            }
        }
    }
}
