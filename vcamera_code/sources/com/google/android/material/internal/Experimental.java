package com.google.android.material.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.oo0oO0;
@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Deprecated
/* loaded from: classes2.dex */
public @interface Experimental {
    @oo0oO0
    String value() default "";
}
