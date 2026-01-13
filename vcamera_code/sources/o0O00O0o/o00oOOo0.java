package o0O00O0o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import o00oOooO.o0OO0oO;
import o0O00O0o.o00oOOoO;
/* loaded from: classes.dex */
public abstract class o00oOOo0 extends BaseAdapter implements Filterable, o00oOOoO.o00oOOo0 {
    @Deprecated

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f10879o00ooO0 = 1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f10880o00ooO0O = 2;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo  reason: collision with root package name */
    public o0O00O0o.o00oOOoO f10881o00oo;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f10882o00oo0O;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f10883o00oo0O0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Cursor f10884o00oo0Oo;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f10885o00oo0o;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Context f10886o00oo0o0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public C0138o00oOOo0 f10887o00oo0oO;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00ooO00  reason: collision with root package name */
    public FilterQueryProvider f10888o00ooO00;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o0O0o  reason: collision with root package name */
    public DataSetObserver f10889o0O0o;

    /* renamed from: o0O00O0o.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0138o00oOOo0 extends ContentObserver {
        public C0138o00oOOo0() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            o00oOOo0.this.o00oOoOo();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends DataSetObserver {
        public o00oOOoO() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.f10883o00oo0O0 = true;
            o00oooo02.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            o00oooo02.f10883o00oo0O0 = false;
            o00oooo02.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public o00oOOo0(Context context, Cursor cursor) {
        o00oOo0o(context, cursor, 1);
    }

    public o00oOOo0(Context context, Cursor cursor, int i) {
        o00oOo0o(context, cursor, i);
    }

    public o00oOOo0(Context context, Cursor cursor, boolean z) {
        o00oOo0o(context, cursor, z ? 1 : 2);
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f10883o00oo0O0 || (cursor = this.f10884o00oo0Oo) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f10883o00oo0O0) {
            this.f10884o00oo0Oo.moveToPosition(i);
            if (view == null) {
                view = o00oOoO(this.f10886o00oo0o0, this.f10884o00oo0Oo, viewGroup);
            }
            o00oOooO(view, this.f10886o00oo0o0, this.f10884o00oo0Oo);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f10881o00oo == null) {
            this.f10881o00oo = new o0O00O0o.o00oOOoO(this);
        }
        return this.f10881o00oo;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f10883o00oo0O0 || (cursor = this.f10884o00oo0Oo) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10884o00oo0Oo;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f10883o00oo0O0 && (cursor = this.f10884o00oo0Oo) != null && cursor.moveToPosition(i)) {
            return this.f10884o00oo0Oo.getLong(this.f10885o00oo0o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f10883o00oo0O0) {
            if (this.f10884o00oo0Oo.moveToPosition(i)) {
                if (view == null) {
                    view = o00oOoOO(this.f10886o00oo0o0, this.f10884o00oo0Oo, viewGroup);
                }
                o00oOooO(view, this.f10886o00oo0o0, this.f10884o00oo0Oo);
                return view;
            }
            throw new IllegalStateException(android.support.v4.media.o00oOOo0.o00oOOo0("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void o00oOOo0(Cursor cursor) {
        Cursor o00oOooo2 = o00oOooo(cursor);
        if (o00oOooo2 != null) {
            o00oOooo2.close();
        }
    }

    public Cursor o00oOOoO(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f10888o00ooO00;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f10884o00oo0Oo;
    }

    @Override // o0O00O0o.o00oOOoO.o00oOOo0
    public Cursor o00oOo00() {
        return this.f10884o00oo0Oo;
    }

    public FilterQueryProvider o00oOo0O() {
        return this.f10888o00ooO00;
    }

    public void o00oOo0o(Context context, Cursor cursor, int i) {
        o00oOOoO o00ooooo2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f10882o00oo0O = true;
        } else {
            this.f10882o00oo0O = false;
        }
        boolean z = cursor != null;
        this.f10884o00oo0Oo = cursor;
        this.f10883o00oo0O0 = z;
        this.f10886o00oo0o0 = context;
        this.f10885o00oo0o = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f10887o00oo0oO = new C0138o00oOOo0();
            o00ooooo2 = new o00oOOoO();
        } else {
            o00ooooo2 = null;
            this.f10887o00oo0oO = null;
        }
        this.f10889o0O0o = o00ooooo2;
        if (z) {
            C0138o00oOOo0 c0138o00oOOo0 = this.f10887o00oo0oO;
            if (c0138o00oOOo0 != null) {
                cursor.registerContentObserver(c0138o00oOOo0);
            }
            DataSetObserver dataSetObserver = this.f10889o0O0o;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View o00oOoO(Context context, Cursor cursor, ViewGroup viewGroup) {
        return o00oOoOO(context, cursor, viewGroup);
    }

    @Deprecated
    public void o00oOoO0(Context context, Cursor cursor, boolean z) {
        o00oOo0o(context, cursor, z ? 1 : 2);
    }

    public abstract View o00oOoOO(Context context, Cursor cursor, ViewGroup viewGroup);

    public void o00oOoOo() {
        Cursor cursor;
        if (!this.f10882o00oo0O || (cursor = this.f10884o00oo0Oo) == null || cursor.isClosed()) {
            return;
        }
        this.f10883o00oo0O0 = this.f10884o00oo0Oo.requery();
    }

    public void o00oOoo0(FilterQueryProvider filterQueryProvider) {
        this.f10888o00ooO00 = filterQueryProvider;
    }

    public abstract void o00oOooO(View view, Context context, Cursor cursor);

    public Cursor o00oOooo(Cursor cursor) {
        Cursor cursor2 = this.f10884o00oo0Oo;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0138o00oOOo0 c0138o00oOOo0 = this.f10887o00oo0oO;
            if (c0138o00oOOo0 != null) {
                cursor2.unregisterContentObserver(c0138o00oOOo0);
            }
            DataSetObserver dataSetObserver = this.f10889o0O0o;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10884o00oo0Oo = cursor;
        if (cursor != null) {
            C0138o00oOOo0 c0138o00oOOo02 = this.f10887o00oo0oO;
            if (c0138o00oOOo02 != null) {
                cursor.registerContentObserver(c0138o00oOOo02);
            }
            DataSetObserver dataSetObserver2 = this.f10889o0O0o;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10885o00oo0o = cursor.getColumnIndexOrThrow("_id");
            this.f10883o00oo0O0 = true;
            notifyDataSetChanged();
        } else {
            this.f10885o00oo0o = -1;
            this.f10883o00oo0O0 = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
