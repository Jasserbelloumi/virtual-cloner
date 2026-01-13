package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.o00oOOo0;
/* loaded from: classes.dex */
public class o0O000 implements AdapterView.OnItemSelectedListener {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oOOo0.o00oOoO f482o00oo0O0;

    public o0O000(o00oOOo0.o00oOoO o00oooo2) {
        this.f482o00oo0O0 = o00oooo2;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        o00oOOo0.o00oOoO o00oooo2 = this.f482o00oo0O0;
        if (o00oooo2 != null) {
            o00oooo2.onNavigationItemSelected(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
