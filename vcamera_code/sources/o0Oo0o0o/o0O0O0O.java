package o0Oo0o0o;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class o0O0O0O extends IOException {
    public final o0OoOoOo errorCode;

    public o0O0O0O(o0OoOoOo o0oooooo) {
        super("stream was reset: " + o0oooooo);
        this.errorCode = o0oooooo;
    }
}
