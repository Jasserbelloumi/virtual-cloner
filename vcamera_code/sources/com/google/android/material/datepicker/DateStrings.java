package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import o00oOooO.o0OO00OO;
import o0ooOoOO.oO0o0o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DateStrings {
    private DateStrings() {
    }

    public static oO0o0o<String, String> getDateRangeString(@o0OO00OO Long l, @o0OO00OO Long l2) {
        return getDateRangeString(l, l2, null);
    }

    public static oO0o0o<String, String> getDateRangeString(@o0OO00OO Long l, @o0OO00OO Long l2, @o0OO00OO SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return new oO0o0o<>(null, null);
        }
        if (l == null) {
            return new oO0o0o<>(null, getDateString(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return new oO0o0o<>(getDateString(l.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return new oO0o0o<>(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return new oO0o0o<>(getMonthDay(l.longValue(), Locale.getDefault()), getMonthDay(l2.longValue(), Locale.getDefault()));
            }
            return new oO0o0o<>(getMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l2.longValue(), Locale.getDefault()));
        } else {
            return new oO0o0o<>(getYearMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l2.longValue(), Locale.getDefault()));
        }
    }

    public static String getDateString(long j) {
        return getDateString(j, null);
    }

    public static String getDateString(long j, @o0OO00OO SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j) : getYearMonthDay(j);
    }

    public static String getMonthDay(long j) {
        return getMonthDay(j, Locale.getDefault());
    }

    public static String getMonthDay(long j, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j));
    }

    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }

    public static String getYearMonth(Context context, long j) {
        return DateUtils.formatDateTime(context, j - TimeZone.getDefault().getOffset(j), 36);
    }

    public static String getYearMonthDay(long j) {
        return getYearMonthDay(j, Locale.getDefault());
    }

    public static String getYearMonthDay(long j, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }
}
