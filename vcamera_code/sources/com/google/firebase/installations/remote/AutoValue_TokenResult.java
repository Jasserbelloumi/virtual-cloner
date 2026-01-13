package com.google.firebase.installations.remote;

import android.support.v4.media.o00oOo0O;
import com.google.firebase.installations.remote.TokenResult;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    /* loaded from: classes2.dex */
    public static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        public Builder() {
        }

        private Builder(TokenResult tokenResult) {
            this.token = tokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.responseCode = tokenResult.getResponseCode();
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String str = this.tokenExpirationTimestamp == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
            }
            throw new IllegalStateException(o00oo.o00oOOo0("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_TokenResult(@o0OO00OO String str, long j, @o0OO00OO TokenResult.ResponseCode responseCode) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = responseCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.token;
            if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
                if (this.tokenExpirationTimestamp == tokenResult.getTokenExpirationTimestamp()) {
                    TokenResult.ResponseCode responseCode = this.responseCode;
                    TokenResult.ResponseCode responseCode2 = tokenResult.getResponseCode();
                    if (responseCode == null) {
                        if (responseCode2 == null) {
                            return true;
                        }
                    } else if (responseCode.equals(responseCode2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @o0OO00OO
    public TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @o0OO00OO
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @oo0oO0
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.responseCode;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("TokenResult{token=");
        o00oOOo02.append(this.token);
        o00oOOo02.append(", tokenExpirationTimestamp=");
        o00oOOo02.append(this.tokenExpirationTimestamp);
        o00oOOo02.append(", responseCode=");
        o00oOOo02.append(this.responseCode);
        o00oOOo02.append("}");
        return o00oOOo02.toString();
    }
}
