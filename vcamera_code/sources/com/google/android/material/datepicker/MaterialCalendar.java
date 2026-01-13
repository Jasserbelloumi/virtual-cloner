package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0O00OO;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O000oo.o00oOOoO;
import o0O000oo.o0O0o00O;
import o0ooOoOO.oO0o0o;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    @o0OO00OO
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;
    @o0OO00OO
    private Month current;
    @o0OO00OO
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private RecyclerView recyclerView;
    @o0OOO0OO
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;
    @o0o0000
    public static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    @o0o0000
    public static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    @o0o0000
    public static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    @o0o0000
    public static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    /* loaded from: classes2.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* loaded from: classes2.dex */
    public interface OnDayClickListener {
        void onDayClick(long j);
    }

    private void addActionsToMonthNavigation(@oo0oO0 View view, @oo0oO0 final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        o0O0o00O.o0O0oOo(materialButton, new o00oOOoO() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            @Override // o0O000oo.o00oOOoO
            public void onInitializeAccessibilityNodeInfo(View view2, @oo0oO0 o00oo0O o00oo0o2) {
                MaterialCalendar materialCalendar;
                int i;
                super.onInitializeAccessibilityNodeInfo(view2, o00oo0o2);
                if (MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    materialCalendar = MaterialCalendar.this;
                    i = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    materialCalendar = MaterialCalendar.this;
                    i = R.string.mtrl_picker_toggle_to_day_selection;
                }
                o00oo0o2.o0O0o0oo(materialCalendar.getString(i));
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.month_navigation_previous);
        materialButton2.setTag(NAVIGATION_PREV_TAG);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.month_navigation_next);
        materialButton3.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName(view.getContext()));
        this.recyclerView.addOnScrollListener(new RecyclerView.o0O000Oo() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
            public void onScrollStateChanged(@oo0oO0 RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.o0O000Oo
            public void onScrolled(@oo0oO0 RecyclerView recyclerView, int i, int i2) {
                LinearLayoutManager layoutManager = MaterialCalendar.this.getLayoutManager();
                int findFirstVisibleItemPosition = i < 0 ? layoutManager.findFirstVisibleItemPosition() : layoutManager.findLastVisibleItemPosition();
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(findFirstVisibleItemPosition));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int findFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int findLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findLastVisibleItemPosition));
                }
            }
        });
    }

    @oo0oO0
    private RecyclerView.o0 createItemDecoration() {
        return new RecyclerView.o0() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            private final Calendar startItem = UtcDates.getUtcCalendar();
            private final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.o0
            public void onDraw(@oo0oO0 Canvas canvas, @oo0oO0 RecyclerView recyclerView, @oo0oO0 RecyclerView.o0O00OOO o0o00ooo) {
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (oO0o0o<Long, Long> oo0o0o : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Long l = oo0o0o.f17227o00oOOo0;
                        if (l != null && oo0o0o.f17228o00oOOoO != null) {
                            this.startItem.setTimeInMillis(l.longValue());
                            this.endItem.setTimeInMillis(oo0o0o.f17228o00oOOoO.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View findViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View findViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int o00oOoo02 = positionForYear / gridLayoutManager.o00oOoo0();
                            int o00oOoo03 = positionForYear2 / gridLayoutManager.o00oOoo0();
                            for (int i = o00oOoo02; i <= o00oOoo03; i++) {
                                View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.o00oOoo0() * i);
                                if (findViewByPosition3 != null) {
                                    int top = findViewByPosition3.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    canvas.drawRect(i == o00oOoo02 ? (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft() : 0, top, i == o00oOoo03 ? (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft() : recyclerView.getWidth(), bottom, MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    @o0OO0
    public static int getDayHeight(@oo0oO0 Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    @oo0oO0
    public static <T> MaterialCalendar<T> newInstance(@oo0oO0 DateSelector<T> dateSelector, @o0OOO0OO int i, @oo0oO0 CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@oo0oO0 OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @o0OO00OO
    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    @o0OO00OO
    public Month getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @o0OO00OO
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @oo0oO0
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@o0OO00OO Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    @oo0oO0
    public View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        o0O0o00O.o0O0oOo(gridView, new o00oOOoO() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // o0O000oo.o00oOOoO
            public void onInitializeAccessibilityNodeInfo(View view, @oo0oO0 o00oo0O o00oo0o2) {
                super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
                o00oo0o2.o0O0OooO(null);
            }
        });
        gridView.setAdapter((ListAdapter) new DaysOfWeekAdapter());
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@oo0oO0 RecyclerView.o0O00OOO o0o00ooo, @oo0oO0 int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                    return;
                }
                iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.dateSelector.select(j);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged((S) MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new o0O00OO().o00oOOoO(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void setCurrentMonth(Month month) {
        RecyclerView recyclerView;
        int i;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.recyclerView;
                i = position + 3;
            }
            postSmoothRecyclerViewScroll(position);
        }
        recyclerView = this.recyclerView;
        i = position - 3;
        recyclerView.scrollToPosition(i);
        postSmoothRecyclerViewScroll(position);
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
    }
}
