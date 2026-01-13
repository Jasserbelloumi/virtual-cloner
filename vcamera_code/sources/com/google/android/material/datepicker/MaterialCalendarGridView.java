package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O000oo.o00oOOoO;
import o0O000oo.o0O0o00O;
import o0ooOoOO.oO0o0o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        o0O0o00O.o0O0oOo(this, new o00oOOoO() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // o0O000oo.o00oOOoO
            public void onInitializeAccessibilityNodeInfo(View view, @oo0oO0 o00oo0O o00oo0o2) {
                super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
                o00oo0o2.o0O0OooO(null);
            }
        });
    }

    private void gainFocus(int i, Rect rect) {
        int firstPositionInMonth;
        if (i == 33) {
            firstPositionInMonth = getAdapter2().lastPositionInMonth();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            firstPositionInMonth = getAdapter2().firstPositionInMonth();
        }
        setSelection(firstPositionInMonth);
    }

    private static int horizontalMidPoint(@oo0oO0 View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean skipMonth(@o0OO00OO Long l, @o0OO00OO Long l2, @o0OO00OO Long l3, @o0OO00OO Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @oo0oO0
    /* renamed from: getAdapter */
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@oo0oO0 Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.dateSelector;
        CalendarStyle calendarStyle = adapter2.calendarStyle;
        Long item = adapter2.getItem(adapter2.firstPositionInMonth());
        Long item2 = adapter2.getItem(adapter2.lastPositionInMonth());
        for (oO0o0o<Long, Long> oo0o0o : dateSelector.getSelectedRanges()) {
            Long l = oo0o0o.f17227o00oOOo0;
            if (l != null) {
                if (oo0o0o.f17228o00oOOoO != null) {
                    long longValue = l.longValue();
                    long longValue2 = oo0o0o.f17228o00oOOoO.longValue();
                    if (!skipMonth(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            dayToPosition = adapter2.firstPositionInMonth();
                            if (adapter2.isFirstInRow(dayToPosition)) {
                                horizontalMidPoint = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(dayToPosition - 1);
                                horizontalMidPoint = !isLayoutRtl ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            dayToPosition = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition));
                        }
                        if (longValue2 > item2.longValue()) {
                            dayToPosition2 = Math.min(adapter2.lastPositionInMonth(), getChildCount() - 1);
                            if (adapter2.isLastInRow(dayToPosition2)) {
                                horizontalMidPoint2 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(dayToPosition2);
                                horizontalMidPoint2 = !isLayoutRtl ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            dayToPosition2 = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition2));
                        }
                        int itemId = (int) adapter2.getItemId(dayToPosition);
                        int itemId2 = (int) adapter2.getItemId(dayToPosition2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + calendarStyle.day.getTopInset();
                            int bottom = childAt3.getBottom() - calendarStyle.day.getBottomInset();
                            if (isLayoutRtl) {
                                int i2 = dayToPosition2 > numColumns2 ? 0 : horizontalMidPoint2;
                                width = numColumns > dayToPosition ? getWidth() : horizontalMidPoint;
                                i = i2;
                            } else {
                                i = numColumns > dayToPosition ? 0 : horizontalMidPoint;
                                width = dayToPosition2 > numColumns2 ? getWidth() : horizontalMidPoint2;
                            }
                            canvas.drawRect(i, top, width, bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().firstPositionInMonth()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().firstPositionInMonth());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.nestedScrollable) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().firstPositionInMonth()) {
            i = getAdapter2().firstPositionInMonth();
        }
        super.setSelection(i);
    }
}
