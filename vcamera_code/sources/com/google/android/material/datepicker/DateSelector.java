package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0o0o;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    @o0OOO0OO
    int getDefaultThemeResId(Context context);

    @o0OOO0O
    int getDefaultTitleResId();

    @oo0oO0
    Collection<Long> getSelectedDays();

    @oo0oO0
    Collection<oO0o0o<Long, Long>> getSelectedRanges();

    @o0OO00OO
    S getSelection();

    @oo0oO0
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @oo0oO0
    View onCreateTextInputView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle, @oo0oO0 CalendarConstraints calendarConstraints, @oo0oO0 OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(@oo0oO0 S s);
}
