package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.o0O000;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class o0oOo0O0 implements o00oOoo0.o00ooO0 {

    /* renamed from: o0O00  reason: collision with root package name */
    public static final int f1463o0O00 = 2;

    /* renamed from: o0O000  reason: collision with root package name */
    public static Method f1464o0O000 = null;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final String f1465o0O00000 = "ListPopupWindow";

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final boolean f1466o0O0000O = false;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final int f1467o0O0000o = 250;

    /* renamed from: o0O000O  reason: collision with root package name */
    public static Method f1468o0O000O = null;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final int f1469o0O000Oo = 0;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f1470o0O000o = -2;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f1471o0O000o0 = -1;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f1472o0O000oo = 1;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final int f1473o0OoOoOO = 1;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static Method f1474o0OoOoOo;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final int f1475o0ooOoOO = 0;

    /* renamed from: o0  reason: collision with root package name */
    public PopupWindow f1476o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f1477o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ListAdapter f1478o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f1479o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public oo0OOoo f1480o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f1481o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f1482o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f1483o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f1484o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f1485o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f1486o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f1487o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f1488o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int f1489o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f1490o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public View f1491o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public DataSetObserver f1492o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f1493o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public View f1494o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public Drawable f1495o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1496o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1497o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public final o00oo0O f1498o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public final o00oo0O0 f1499o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public final o00oo0OO f1500o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public final o00oo00O f1501o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public Runnable f1502o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public final Rect f1503o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public final Handler f1504o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public Rect f1505o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public boolean f1506o00ooooo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f1507o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0o00O {
        public o00oOOo0(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.o0O0o00O
        /* renamed from: o00oOoo0 */
        public o0oOo0O0 o00oOOoO() {
            return o0oOo0O0.this;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View o00oo0o2 = o0oOo0O0.this.o00oo0o();
            if (o00oo0o2 == null || o00oo0o2.getWindowToken() == null) {
                return;
            }
            o0oOo0O0.this.show();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements AdapterView.OnItemSelectedListener {
        public o00oOo00() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            oo0OOoo oo0oooo;
            if (i == -1 || (oo0oooo = o0oOo0O0.this.f1480o00oo0Oo) == null) {
                return;
            }
            oo0oooo.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends DataSetObserver {
        public o00oo0() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (o0oOo0O0.this.o00oOOo0()) {
                o0oOo0O0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            o0oOo0O0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements Runnable {
        public o00oo00O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0oOo0O0.this.o00oo0O();
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O implements Runnable {
        public o00oo0O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oo0OOoo oo0oooo = o0oOo0O0.this.f1480o00oo0Oo;
            if (oo0oooo == null || !o0O000oo.o0O0o00O.o0O0OOoo(oo0oooo) || o0oOo0O0.this.f1480o00oo0Oo.getCount() <= o0oOo0O0.this.f1480o00oo0Oo.getChildCount()) {
                return;
            }
            int childCount = o0oOo0O0.this.f1480o00oo0Oo.getChildCount();
            o0oOo0O0 o0ooo0o0 = o0oOo0O0.this;
            if (childCount <= o0ooo0o0.f1489o00ooOO) {
                o0ooo0o0.f1476o0.setInputMethodMode(2);
                o0oOo0O0.this.show();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0O0 implements View.OnTouchListener {
        public o00oo0O0() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = o0oOo0O0.this.f1476o0) != null && popupWindow.isShowing() && x >= 0 && x < o0oOo0O0.this.f1476o0.getWidth() && y >= 0 && y < o0oOo0O0.this.f1476o0.getHeight()) {
                o0oOo0O0 o0ooo0o0 = o0oOo0O0.this;
                o0ooo0o0.f1504o00oooo0.postDelayed(o0ooo0o0.f1498o00ooo0O, 250L);
                return false;
            } else if (action == 1) {
                o0oOo0O0 o0ooo0o02 = o0oOo0O0.this;
                o0ooo0o02.f1504o00oooo0.removeCallbacks(o0ooo0o02.f1498o00ooo0O);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements AbsListView.OnScrollListener {
        public o00oo0OO() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || o0oOo0O0.this.o00ooOoo() || o0oOo0O0.this.f1476o0.getContentView() == null) {
                return;
            }
            o0oOo0O0 o0ooo0o0 = o0oOo0O0.this;
            o0ooo0o0.f1504o00oooo0.removeCallbacks(o0ooo0o0.f1498o00ooo0O);
            o0oOo0O0.this.f1498o00ooo0O.run();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1464o0O000 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1474o0OoOoOo = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public o0oOo0O0(@o00oOooO.oo0oO0 Context context) {
        this(context, null, R.attr.listPopupWindowStyle, 0);
    }

    public o0oOo0O0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.o0O000Oo int i) {
        this(context, attributeSet, i, 0);
    }

    public o0oOo0O0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.o0O000Oo int i, @o00oOooO.o0OOO0OO int i2) {
        this.f1482o00oo0o0 = -2;
        this.f1481o00oo0o = -2;
        this.f1477o00oo = 1002;
        this.f1488o00ooO0o = 0;
        this.f1484o00ooO = false;
        this.f1490o00ooOO0 = false;
        this.f1489o00ooOO = Integer.MAX_VALUE;
        this.f1493o00ooOo0 = 0;
        this.f1498o00ooo0O = new o00oo0O();
        this.f1499o00ooo0o = new o00oo0O0();
        this.f1500o00oooO = new o00oo0OO();
        this.f1501o00oooOO = new o00oo00O();
        this.f1503o00oooo = new Rect();
        this.f1479o00oo0O0 = context;
        this.f1504o00oooo0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i2);
        this.f1483o00oo0oO = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1507o0O0o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1486o00ooO00 = true;
        }
        obtainStyledAttributes.recycle();
        o0OoO00O o0ooo00o = new o0OoO00O(context, attributeSet, i, i2);
        this.f1476o0 = o0ooo00o;
        o0ooo00o.setInputMethodMode(1);
    }

    public static boolean o00ooOo(int i) {
        return i == 66 || i == 23;
    }

    @Override // o00oOoo0.o00ooO0
    public void dismiss() {
        this.f1476o0.dismiss();
        o00oooOo();
        this.f1476o0.setContentView(null);
        this.f1480o00oo0Oo = null;
        this.f1504o00oooo0.removeCallbacks(this.f1498o00ooo0O);
    }

    public void o0(int i) {
        this.f1488o00ooO0o = i;
    }

    @Override // o00oOoo0.o00ooO0
    public boolean o00oOOo0() {
        return this.f1476o0.isShowing();
    }

    public int o00oOOoO() {
        return this.f1483o00oo0oO;
    }

    @o00oOooO.o0OO00OO
    public Drawable o00oOo0o() {
        return this.f1476o0.getBackground();
    }

    public void o00oOoO(int i) {
        this.f1507o0O0o = i;
        this.f1486o00ooO00 = true;
    }

    public int o00oOoo0() {
        if (this.f1486o00ooO00) {
            return this.f1507o0O0o;
        }
        return 0;
    }

    public void o00oOooO(int i) {
        this.f1483o00oo0oO = i;
    }

    public int o00oo() {
        return this.f1482o00oo0o0;
    }

    public void o00oo00O(@o00oOooO.o0OO00OO ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1492o00ooOo;
        if (dataSetObserver == null) {
            this.f1492o00ooOo = new o00oo0();
        } else {
            ListAdapter listAdapter2 = this.f1478o00oo0O;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1478o00oo0O = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1492o00ooOo);
        }
        oo0OOoo oo0oooo = this.f1480o00oo0Oo;
        if (oo0oooo != null) {
            oo0oooo.setAdapter(this.f1478o00oo0O);
        }
    }

    public void o00oo0O() {
        oo0OOoo oo0oooo = this.f1480o00oo0Oo;
        if (oo0oooo != null) {
            oo0oooo.setListSelectionHidden(true);
            oo0oooo.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o00oo0O0() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0oOo0O0.o00oo0O0():int");
    }

    @Override // o00oOoo0.o00ooO0
    @o00oOooO.o0OO00OO
    public ListView o00oo0OO() {
        return this.f1480o00oo0Oo;
    }

    public View.OnTouchListener o00oo0Oo(View view) {
        return new o00oOOo0(view);
    }

    @o00oOooO.o0OO00OO
    public View o00oo0o() {
        return this.f1494o00ooOoO;
    }

    @o00oOooO.oo0oO0
    public oo0OOoo o00oo0o0(Context context, boolean z) {
        return new oo0OOoo(context, z);
    }

    @o00oOooO.o0OOO0OO
    public int o00oo0oO() {
        return this.f1476o0.getAnimationStyle();
    }

    public long o00ooO() {
        if (o00oOOo0()) {
            return this.f1480o00oo0Oo.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public final int o00ooO0(View view, int i, boolean z) {
        return o00oOo0O.o00oOOo0(this.f1476o0, view, i, z);
    }

    public int o00ooO00() {
        return this.f1476o0.getInputMethodMode();
    }

    public int o00ooO0O() {
        return this.f1493o00ooOo0;
    }

    @o00oOooO.o0OO00OO
    public Object o00ooO0o() {
        if (o00oOOo0()) {
            return this.f1480o00oo0Oo.getSelectedItem();
        }
        return null;
    }

    @o00oOooO.o0OO00OO
    public View o00ooOO() {
        if (o00oOOo0()) {
            return this.f1480o00oo0Oo.getSelectedView();
        }
        return null;
    }

    public int o00ooOO0() {
        if (o00oOOo0()) {
            return this.f1480o00oo0Oo.getSelectedItemPosition();
        }
        return -1;
    }

    public int o00ooOOo() {
        return this.f1476o0.getSoftInputMode();
    }

    public int o00ooOo0() {
        return this.f1481o00oo0o;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00ooOoO() {
        return this.f1484o00ooO;
    }

    public boolean o00ooOoo() {
        return this.f1476o0.getInputMethodMode() == 2;
    }

    public boolean o00ooo0(int i, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
        if (o00oOOo0() && i != 62 && (this.f1480o00oo0Oo.getSelectedItemPosition() >= 0 || !o00ooOo(i))) {
            int selectedItemPosition = this.f1480o00oo0Oo.getSelectedItemPosition();
            boolean z = !this.f1476o0.isAboveAnchor();
            ListAdapter listAdapter = this.f1478o00oo0O;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int o00oOooO2 = areAllItemsEnabled ? 0 : this.f1480o00oo0Oo.o00oOooO(0, true);
                int count = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1480o00oo0Oo.o00oOooO(listAdapter.getCount() - 1, false);
                i2 = o00oOooO2;
                i3 = count;
            }
            if ((z && i == 19 && selectedItemPosition <= i2) || (!z && i == 20 && selectedItemPosition >= i3)) {
                o00oo0O();
                this.f1476o0.setInputMethodMode(1);
                show();
                return true;
            }
            this.f1480o00oo0Oo.setListSelectionHidden(false);
            if (this.f1480o00oo0Oo.onKeyDown(i, keyEvent)) {
                this.f1476o0.setInputMethodMode(2);
                this.f1480o00oo0Oo.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (z && i == 20) {
                if (selectedItemPosition == i3) {
                    return true;
                }
            } else if (!z && i == 19 && selectedItemPosition == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean o00ooo00() {
        return this.f1506o00ooooo;
    }

    public boolean o00ooo0O(int i, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
        if (i == 4 && o00oOOo0()) {
            View view = this.f1494o00ooOoO;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                    return false;
                }
                dismiss();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean o00ooo0o(int i, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
        if (!o00oOOo0() || this.f1480o00oo0Oo.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f1480o00oo0Oo.onKeyUp(i, keyEvent);
        if (onKeyUp && o00ooOo(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean o00oooO(int i) {
        if (o00oOOo0()) {
            if (this.f1497o00ooo00 != null) {
                oo0OOoo oo0oooo = this.f1480o00oo0Oo;
                this.f1497o00ooo00.onItemClick(oo0oooo, oo0oooo.getChildAt(i - oo0oooo.getFirstVisiblePosition()), i, oo0oooo.getAdapter().getItemId(i));
                return true;
            }
            return true;
        }
        return false;
    }

    public void o00oooOO() {
        this.f1504o00oooo0.post(this.f1502o00oooOo);
    }

    public final void o00oooOo() {
        View view = this.f1491o00ooOOo;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1491o00ooOOo);
            }
        }
    }

    public void o00oooo(@o00oOooO.o0OOO0OO int i) {
        this.f1476o0.setAnimationStyle(i);
    }

    public void o00oooo0(@o00oOooO.o0OO00OO View view) {
        this.f1494o00ooOoO = view;
    }

    public void o00ooooO(int i) {
        Drawable background = this.f1476o0.getBackground();
        if (background == null) {
            o0O00O(i);
            return;
        }
        background.getPadding(this.f1503o00oooo);
        Rect rect = this.f1503o00oooo;
        this.f1481o00oo0o = rect.left + rect.right + i;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00ooooo(boolean z) {
        this.f1484o00ooO = z;
    }

    public void o0O00(int i) {
        this.f1493o00ooOo0 = i;
    }

    public void o0O000(int i) {
        this.f1476o0.setInputMethodMode(i);
    }

    public void o0O00000(@o00oOooO.o0OO00OO Rect rect) {
        this.f1505o00ooooO = rect != null ? new Rect(rect) : null;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0O0000O(boolean z) {
        this.f1490o00ooOO0 = z;
    }

    public void o0O0000o(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1482o00oo0o0 = i;
    }

    public void o0O000O(int i) {
        this.f1489o00ooOO = i;
    }

    public void o0O000Oo(boolean z) {
        this.f1506o00ooooo = z;
        this.f1476o0.setFocusable(z);
    }

    public void o0O000o(@o00oOooO.o0OO00OO AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1496o00ooo0 = onItemSelectedListener;
    }

    public void o0O000o0(@o00oOooO.o0OO00OO AdapterView.OnItemClickListener onItemClickListener) {
        this.f1497o00ooo00 = onItemClickListener;
    }

    public final void o0O000oo(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            o00oOoO.o00oOOoO(this.f1476o0, z);
            return;
        }
        Method method = f1464o0O000;
        if (method != null) {
            try {
                method.invoke(this.f1476o0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void o0O00O(int i) {
        this.f1481o00oo0o = i;
    }

    public void o0O00O0(@o00oOooO.o0OO00OO View view) {
        boolean o00oOOo02 = o00oOOo0();
        if (o00oOOo02) {
            o00oooOo();
        }
        this.f1491o00ooOOo = view;
        if (o00oOOo02) {
            show();
        }
    }

    public void o0O00O0o(int i) {
        this.f1476o0.setSoftInputMode(i);
    }

    public void o0O00OO(int i) {
        this.f1477o00oo = i;
    }

    @o00oOooO.o0OO00OO
    public Rect o0O0o() {
        if (this.f1505o00ooooO != null) {
            return new Rect(this.f1505o00ooooO);
        }
        return null;
    }

    public void o0OoO00O(int i) {
        oo0OOoo oo0oooo = this.f1480o00oo0Oo;
        if (!o00oOOo0() || oo0oooo == null) {
            return;
        }
        oo0oooo.setListSelectionHidden(false);
        oo0oooo.setSelection(i);
        if (oo0oooo.getChoiceMode() != 0) {
            oo0oooo.setItemChecked(i, true);
        }
    }

    public void o0OoOoOO(@o00oOooO.o0OO00OO PopupWindow.OnDismissListener onDismissListener) {
        this.f1476o0.setOnDismissListener(onDismissListener);
    }

    public void o0OoOoOo(Drawable drawable) {
        this.f1495o00ooOoo = drawable;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o0ooOoOO(boolean z) {
        this.f1487o00ooO0O = true;
        this.f1485o00ooO0 = z;
    }

    public void setBackgroundDrawable(@o00oOooO.o0OO00OO Drawable drawable) {
        this.f1476o0.setBackgroundDrawable(drawable);
    }

    @Override // o00oOoo0.o00ooO0
    public void show() {
        int o00oo0O02 = o00oo0O0();
        boolean o00ooOoo2 = o00ooOoo();
        o0O000.o00oOOoO.o00oOooO(this.f1476o0, this.f1477o00oo);
        boolean z = true;
        if (this.f1476o0.isShowing()) {
            if (o0O000oo.o0O0o00O.o0O0OOoo(o00oo0o())) {
                int i = this.f1481o00oo0o;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = o00oo0o().getWidth();
                }
                int i2 = this.f1482o00oo0o0;
                if (i2 == -1) {
                    if (!o00ooOoo2) {
                        o00oo0O02 = -1;
                    }
                    if (o00ooOoo2) {
                        this.f1476o0.setWidth(this.f1481o00oo0o == -1 ? -1 : 0);
                        this.f1476o0.setHeight(0);
                    } else {
                        this.f1476o0.setWidth(this.f1481o00oo0o == -1 ? -1 : 0);
                        this.f1476o0.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    o00oo0O02 = i2;
                }
                PopupWindow popupWindow = this.f1476o0;
                if (this.f1490o00ooOO0 || this.f1484o00ooO) {
                    z = false;
                }
                popupWindow.setOutsideTouchable(z);
                this.f1476o0.update(o00oo0o(), this.f1483o00oo0oO, this.f1507o0O0o, i < 0 ? -1 : i, o00oo0O02 < 0 ? -1 : o00oo0O02);
                return;
            }
            return;
        }
        int i3 = this.f1481o00oo0o;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = o00oo0o().getWidth();
        }
        int i4 = this.f1482o00oo0o0;
        if (i4 == -1) {
            o00oo0O02 = -1;
        } else if (i4 != -2) {
            o00oo0O02 = i4;
        }
        this.f1476o0.setWidth(i3);
        this.f1476o0.setHeight(o00oo0O02);
        o0O000oo(true);
        this.f1476o0.setOutsideTouchable((this.f1490o00ooOO0 || this.f1484o00ooO) ? false : true);
        this.f1476o0.setTouchInterceptor(this.f1499o00ooo0o);
        if (this.f1487o00ooO0O) {
            o0O000.o00oOOoO.o00oOo00(this.f1476o0, this.f1485o00ooO0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1474o0OoOoOo;
            if (method != null) {
                try {
                    method.invoke(this.f1476o0, this.f1505o00ooooO);
                } catch (Exception unused) {
                }
            }
        } else {
            o00oOoO.o00oOOo0(this.f1476o0, this.f1505o00ooooO);
        }
        o0O000.o00oOOo0.o00oOOo0(this.f1476o0, o00oo0o(), this.f1483o00oo0oO, this.f1507o0O0o, this.f1488o00ooO0o);
        this.f1480o00oo0Oo.setSelection(-1);
        if (!this.f1506o00ooooo || this.f1480o00oo0Oo.isInTouchMode()) {
            o00oo0O();
        }
        if (this.f1506o00ooooo) {
            return;
        }
        this.f1504o00oooo0.post(this.f1501o00oooOO);
    }

    public o0oOo0O0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle, 0);
    }
}
