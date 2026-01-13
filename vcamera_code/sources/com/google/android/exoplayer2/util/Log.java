package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO00;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    @o0O0OOOo("lock")
    private static int logLevel = 0;
    @o0O0OOOo("lock")
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();
    @o0O0OOOo("lock")
    private static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LogLevel {
    }

    /* loaded from: classes.dex */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: com.google.android.exoplayer2.util.Log.Logger.1
            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void d(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void e(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void i(String str, String str2) {
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void w(String str, String str2) {
            }
        };

        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    private Log() {
    }

    @Pure
    private static String appendThrowableString(String str, @o0OO00OO Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, "\n  ");
        o00oOOo02.append(throwableString.replace("\n", "\n  "));
        o00oOOo02.append('\n');
        return o00oOOo02.toString();
    }

    @Pure
    public static void d(@o0OOO00(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.d(str, str2);
            }
        }
    }

    @Pure
    public static void d(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        d(str, appendThrowableString(str2, th));
    }

    @Pure
    public static void e(@o0OOO00(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2);
            }
        }
    }

    @Pure
    public static void e(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @o0OO00OO
    @Pure
    public static String getThrowableString(@o0OO00OO Throwable th) {
        synchronized (lock) {
            if (th == null) {
                return null;
            }
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (logStackTraces) {
                return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    @Pure
    public static void i(@o0OOO00(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.i(str, str2);
            }
        }
    }

    @Pure
    public static void i(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        i(str, appendThrowableString(str2, th));
    }

    @Pure
    private static boolean isCausedByUnknownHostException(@o0OO00OO Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @Pure
    public static void w(@o0OOO00(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2);
            }
        }
    }

    @Pure
    public static void w(@o0OOO00(max = 23) String str, String str2, @o0OO00OO Throwable th) {
        w(str, appendThrowableString(str2, th));
    }
}
