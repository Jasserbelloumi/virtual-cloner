package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0Ooooo;
/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @oo0oO0
        public CalendarConstraints createFromParcel(@oo0oO0 Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @oo0oO0
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    };
    @oo0oO0
    private final Month end;
    private final int monthSpan;
    @o0OO00OO
    private Month openAt;
    @oo0oO0
    private final Month start;
    @oo0oO0
    private final DateValidator validator;
    private final int yearSpan;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        private long end;
        private Long openAt;
        private long start;
        private DateValidator validator;
        public static final long DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create(1900, 0).timeInMillis);
        public static final long DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create(2100, 11).timeInMillis);

        public Builder() {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        public Builder(@oo0oO0 CalendarConstraints calendarConstraints) {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.start = calendarConstraints.start.timeInMillis;
            this.end = calendarConstraints.end.timeInMillis;
            this.openAt = Long.valueOf(calendarConstraints.openAt.timeInMillis);
            this.validator = calendarConstraints.validator;
        }

        @oo0oO0
        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(DEEP_COPY_VALIDATOR_KEY, this.validator);
            Month create = Month.create(this.start);
            Month create2 = Month.create(this.end);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(DEEP_COPY_VALIDATOR_KEY);
            Long l = this.openAt;
            return new CalendarConstraints(create, create2, dateValidator, l == null ? null : Month.create(l.longValue()));
        }

        @oo0oO0
        public Builder setEnd(long j) {
            this.end = j;
            return this;
        }

        @oo0oO0
        public Builder setOpenAt(long j) {
            this.openAt = Long.valueOf(j);
            return this;
        }

        @oo0oO0
        public Builder setStart(long j) {
            this.start = j;
            return this;
        }

        @oo0oO0
        public Builder setValidator(@oo0oO0 DateValidator dateValidator) {
            this.validator = dateValidator;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    private CalendarConstraints(@oo0oO0 Month month, @oo0oO0 Month month2, @oo0oO0 DateValidator dateValidator, @o0OO00OO Month month3) {
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.validator = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.monthSpan = month.monthsUntil(month2) + 1;
        this.yearSpan = (month2.year - month.year) + 1;
    }

    public Month clamp(Month month) {
        return month.compareTo(this.start) < 0 ? this.start : month.compareTo(this.end) > 0 ? this.end : month;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && oO0Ooooo.o00oOOo0.o00oOOo0(this.openAt, calendarConstraints.openAt) && this.validator.equals(calendarConstraints.validator);
        }
        return false;
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    @oo0oO0
    public Month getEnd() {
        return this.end;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    @o0OO00OO
    public Month getOpenAt() {
        return this.openAt;
    }

    @oo0oO0
    public Month getStart() {
        return this.start;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, this.validator});
    }

    public boolean isWithinBounds(long j) {
        if (this.start.getDay(1) <= j) {
            Month month = this.end;
            if (j <= month.getDay(month.daysInMonth)) {
                return true;
            }
        }
        return false;
    }

    public void setOpenAt(@o0OO00OO Month month) {
        this.openAt = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
    }
}
