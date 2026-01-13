package o0ooOoOO;

import java.io.Writer;
import o00oOooO.o0OO0oO;
@Deprecated
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oO000 extends Writer {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public StringBuilder f17156o00oo0O = new StringBuilder(128);

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final String f17157o00oo0O0;

    public oO000(String str) {
        this.f17157o00oo0O0 = str;
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
        if (this.f17156o00oo0O.length() > 0) {
            this.f17156o00oo0O.toString();
            StringBuilder sb = this.f17156o00oo0O;
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
                this.f17156o00oo0O.append(c);
            }
        }
    }
}
