package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    @o0OO00OO
    private final Long fixedTimeMs;
    @o0OO00OO
    private final TimeZone fixedTimeZone;

    private TimeSource(@o0OO00OO Long l, @o0OO00OO TimeZone timeZone) {
        this.fixedTimeMs = l;
        this.fixedTimeZone = timeZone;
    }

    public static TimeSource fixed(long j) {
        return new TimeSource(Long.valueOf(j), null);
    }

    public static TimeSource fixed(long j, @o0OO00OO TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j), timeZone);
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    public Calendar now(@o0OO00OO TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.fixedTimeMs;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
