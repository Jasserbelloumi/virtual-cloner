package o0O0OO;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0O0o {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f11392o00oo = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f11393o00ooO0 = 3;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f11394o00ooO00 = 2;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f11395o00ooO0O = 4;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f11396o00ooO0o = 5;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @o00oOOo0
    int onDelete() default 1;

    @o00oOOo0
    int onUpdate() default 1;

    String[] parentColumns();
}
