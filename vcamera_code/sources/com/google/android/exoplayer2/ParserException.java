package com.google.android.exoplayer2;

import java.io.IOException;
/* loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO Throwable th, boolean z, int i) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException createForMalformedContainer(@o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(@o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException createForMalformedManifest(@o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(@o00oOooO.o0OO00OO String str, @o00oOooO.o0OO00OO Throwable th) {
        return new ParserException(str, th, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(@o00oOooO.o0OO00OO String str) {
        return new ParserException(str, null, false, 1);
    }
}
