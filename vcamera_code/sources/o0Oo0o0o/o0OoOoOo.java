package o0Oo0o0o;
/* loaded from: classes3.dex */
public enum o0OoOoOo {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    
    public final int httpCode;

    o0OoOoOo(int i) {
        this.httpCode = i;
    }

    public static o0OoOoOo fromHttp2(int i) {
        o0OoOoOo[] values;
        for (o0OoOoOo o0oooooo : values()) {
            if (o0oooooo.httpCode == i) {
                return o0oooooo;
            }
        }
        return null;
    }
}
