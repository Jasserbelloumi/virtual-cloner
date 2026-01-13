package o0O00O0o;

import android.database.Cursor;
import android.widget.Filter;
/* loaded from: classes.dex */
public class o00oOOoO extends Filter {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oOOo0 f10892o00oOOo0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        CharSequence convertToString(Cursor cursor);

        void o00oOOo0(Cursor cursor);

        Cursor o00oOOoO(CharSequence charSequence);

        Cursor o00oOo00();
    }

    public o00oOOoO(o00oOOo0 o00oooo02) {
        this.f10892o00oOOo0 = o00oooo02;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f10892o00oOOo0.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor o00oOOoO2 = this.f10892o00oOOo0.o00oOOoO(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (o00oOOoO2 != null) {
            filterResults.count = o00oOOoO2.getCount();
        } else {
            filterResults.count = 0;
            o00oOOoO2 = null;
        }
        filterResults.values = o00oOOoO2;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor o00oOo002 = this.f10892o00oOOo0.o00oOo00();
        Object obj = filterResults.values;
        if (obj == null || obj == o00oOo002) {
            return;
        }
        this.f10892o00oOOo0.o00oOOo0((Cursor) obj);
    }
}
