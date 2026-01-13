package com.google.firebase.encoders;

import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface ValueEncoderContext {
    @oo0oO0
    ValueEncoderContext add(double d) throws IOException;

    @oo0oO0
    ValueEncoderContext add(float f) throws IOException;

    @oo0oO0
    ValueEncoderContext add(int i) throws IOException;

    @oo0oO0
    ValueEncoderContext add(long j) throws IOException;

    @oo0oO0
    ValueEncoderContext add(@o0OO00OO String str) throws IOException;

    @oo0oO0
    ValueEncoderContext add(boolean z) throws IOException;

    @oo0oO0
    ValueEncoderContext add(@oo0oO0 byte[] bArr) throws IOException;
}
