package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    @oo0oO0
    <U> T registerEncoder(@oo0oO0 Class<U> cls, @oo0oO0 ObjectEncoder<? super U> objectEncoder);

    @oo0oO0
    <U> T registerEncoder(@oo0oO0 Class<U> cls, @oo0oO0 ValueEncoder<? super U> valueEncoder);
}
