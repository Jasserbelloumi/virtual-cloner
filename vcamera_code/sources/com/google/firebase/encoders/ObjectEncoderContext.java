package com.google.firebase.encoders;

import java.io.IOException;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface ObjectEncoderContext {
    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, double d) throws IOException;

    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, float f) throws IOException;

    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, int i) throws IOException;

    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, long j) throws IOException;

    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, @o0OO00OO Object obj) throws IOException;

    @oo0oO0
    ObjectEncoderContext add(@oo0oO0 FieldDescriptor fieldDescriptor, boolean z) throws IOException;

    @oo0oO0
    @Deprecated
    ObjectEncoderContext add(@oo0oO0 String str, double d) throws IOException;

    @oo0oO0
    @Deprecated
    ObjectEncoderContext add(@oo0oO0 String str, int i) throws IOException;

    @oo0oO0
    @Deprecated
    ObjectEncoderContext add(@oo0oO0 String str, long j) throws IOException;

    @oo0oO0
    @Deprecated
    ObjectEncoderContext add(@oo0oO0 String str, @o0OO00OO Object obj) throws IOException;

    @oo0oO0
    @Deprecated
    ObjectEncoderContext add(@oo0oO0 String str, boolean z) throws IOException;

    @oo0oO0
    ObjectEncoderContext inline(@o0OO00OO Object obj) throws IOException;

    @oo0oO0
    ObjectEncoderContext nested(@oo0oO0 FieldDescriptor fieldDescriptor) throws IOException;

    @oo0oO0
    ObjectEncoderContext nested(@oo0oO0 String str) throws IOException;
}
