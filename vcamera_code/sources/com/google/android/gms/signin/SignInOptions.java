package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {
    @oo0oO0
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    private final boolean zab = false;
    private final boolean zac = false;
    @o0OO00OO
    private final String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;
    @o0OO00OO
    private final String zaf = null;
    @o0OO00OO
    private final String zag = null;
    @o0OO00OO
    private final Long zai = null;
    @o0OO00OO
    private final Long zaj = null;

    public /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2, zaf zafVar) {
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignInOptions) {
            boolean z = ((SignInOptions) obj).zab;
            return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
