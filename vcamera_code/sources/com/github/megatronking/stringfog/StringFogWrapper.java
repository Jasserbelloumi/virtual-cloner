package com.github.megatronking.stringfog;

import o00oOoOo.o00oo;
/* loaded from: classes.dex */
public final class StringFogWrapper implements IStringFog {
    private final IStringFog mStringFogImpl;

    public StringFogWrapper(String str) {
        try {
            this.mStringFogImpl = (IStringFog) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException(o00oo.o00oOOo0("Stringfog implementation class not found: ", str));
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(o00oo.o00oOOo0("Stringfog implementation class access failed: ", e.getMessage()));
        } catch (InstantiationException e2) {
            throw new IllegalArgumentException(o00oo.o00oOOo0("Stringfog implementation class new instance failed: ", e2.getMessage()));
        }
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public String decrypt(byte[] bArr, byte[] bArr2) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog == null ? new String(bArr) : iStringFog.decrypt(bArr, bArr2);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(String str, byte[] bArr) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog == null ? str.getBytes() : iStringFog.encrypt(str, bArr);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(String str) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog != null && iStringFog.shouldFog(str);
    }
}
