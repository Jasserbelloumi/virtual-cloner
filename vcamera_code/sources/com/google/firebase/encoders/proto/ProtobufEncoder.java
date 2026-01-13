package com.google.firebase.encoders.proto;

import android.support.v4.media.o00oOo0O;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class ProtobufEncoder {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    /* loaded from: classes2.dex */
    public static final class Builder implements EncoderConfig<Builder> {
        private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.o00oOOoO
            @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
            }
        };
        private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
        private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
        private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Couldn't find encoder for type ");
            o00oOOo02.append(obj.getClass().getCanonicalName());
            throw new EncodingException(o00oOOo02.toString());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.objectEncoders), new HashMap(this.valueEncoders), this.fallbackEncoder);
        }

        @oo0oO0
        public Builder configureWith(@oo0oO0 Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @oo0oO0
        public <U> Builder registerEncoder(@oo0oO0 Class<U> cls, @oo0oO0 ObjectEncoder<? super U> objectEncoder) {
            this.objectEncoders.put(cls, objectEncoder);
            this.valueEncoders.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @oo0oO0
        public <U> Builder registerEncoder(@oo0oO0 Class<U> cls, @oo0oO0 ValueEncoder<? super U> valueEncoder) {
            this.valueEncoders.put(cls, valueEncoder);
            this.objectEncoders.remove(cls);
            return this;
        }

        @oo0oO0
        public Builder registerFallbackEncoder(@oo0oO0 ObjectEncoder<Object> objectEncoder) {
            this.fallbackEncoder = objectEncoder;
            return this;
        }
    }

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@oo0oO0 Object obj, @oo0oO0 OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.objectEncoders, this.valueEncoders, this.fallbackEncoder).encode(obj);
    }

    @oo0oO0
    public byte[] encode(@oo0oO0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
