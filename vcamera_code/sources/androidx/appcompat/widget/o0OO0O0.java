package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.o00oOo00;
/* loaded from: classes.dex */
public class o0OO0O0 extends o0O000oo.o00oOo00 {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f1284o00oOoo0 = 4;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f1285o00oOooo = "share_history.xml";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f1286o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o00oOo00 f1287o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public String f1288o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Context f1289o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o00oOOo0 f1290o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public o00oOo00.o00oo00O f1291o00oOoOo;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOOo0(o0OO0O0 o0oo0o0, Intent intent);
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOo00.o00oo00O {
        public o00oOOoO() {
        }

        @Override // androidx.appcompat.widget.o00oOo00.o00oo00O
        public boolean o00oOOo0(androidx.appcompat.widget.o00oOo00 o00ooo002, Intent intent) {
            o0OO0O0 o0oo0o0 = o0OO0O0.this;
            o00oOOo0 o00oooo02 = o0oo0o0.f1290o00oOoOO;
            if (o00oooo02 != null) {
                o00oooo02.o00oOOo0(o0oo0o0, intent);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements MenuItem.OnMenuItemClickListener {
        public o00oOo00() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            o0OO0O0 o0oo0o0 = o0OO0O0.this;
            Intent o00oOOoO2 = androidx.appcompat.widget.o00oOo00.o00oOooO(o0oo0o0.f1289o00oOoO0, o0oo0o0.f1288o00oOoO).o00oOOoO(menuItem.getItemId());
            if (o00oOOoO2 != null) {
                String action = o00oOOoO2.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    o0OO0O0.this.o00oo0Oo(o00oOOoO2);
                }
                o0OO0O0.this.f1289o00oOoO0.startActivity(o00oOOoO2);
                return true;
            }
            return true;
        }
    }

    public o0OO0O0(Context context) {
        super(context);
        this.f1286o00oOo0O = 4;
        this.f1287o00oOo0o = new o00oOo00();
        this.f1288o00oOoO = f1285o00oOooo;
        this.f1289o00oOoO0 = context;
    }

    @Override // o0O000oo.o00oOo00
    public boolean o00oOOoO() {
        return true;
    }

    @Override // o0O000oo.o00oOo00
    public void o00oOoO0(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.o00oOo00 o00oOooO2 = androidx.appcompat.widget.o00oOo00.o00oOooO(this.f1289o00oOoO0, this.f1288o00oOoO);
        PackageManager packageManager = this.f1289o00oOoO0.getPackageManager();
        int o00oOo0o2 = o00oOooO2.o00oOo0o();
        int min = Math.min(o00oOo0o2, this.f1286o00oOo0O);
        for (int i = 0; i < min; i++) {
            ResolveInfo o00oOo0O2 = o00oOooO2.o00oOo0O(i);
            subMenu.add(0, i, i, o00oOo0O2.loadLabel(packageManager)).setIcon(o00oOo0O2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1287o00oOo0o);
        }
        if (min < o00oOo0o2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1289o00oOoO0.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < o00oOo0o2; i2++) {
                ResolveInfo o00oOo0O3 = o00oOooO2.o00oOo0O(i2);
                addSubMenu.add(0, i2, i2, o00oOo0O3.loadLabel(packageManager)).setIcon(o00oOo0O3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1287o00oOo0o);
            }
        }
    }

    @Override // o0O000oo.o00oOo00
    public View o00oOooO() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1289o00oOoO0);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.o00oOo00.o00oOooO(this.f1289o00oOoO0, this.f1288o00oOoO));
        }
        TypedValue typedValue = new TypedValue();
        this.f1289o00oOoO0.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(o00oOo0o.o00oOo00.o00oOOoO(this.f1289o00oOoO0, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    public final void o00oo0() {
        if (this.f1290o00oOoOO == null) {
            return;
        }
        if (this.f1291o00oOoOo == null) {
            this.f1291o00oOoOo = new o00oOOoO();
        }
        androidx.appcompat.widget.o00oOo00.o00oOooO(this.f1289o00oOoO0, this.f1288o00oOoO).o00oo0oO(this.f1291o00oOoOo);
    }

    public void o00oo0O(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                o00oo0Oo(intent);
            }
        }
        androidx.appcompat.widget.o00oOo00.o00oOooO(this.f1289o00oOoO0, this.f1288o00oOoO).o00oo0o(intent);
    }

    public void o00oo0O0(String str) {
        this.f1288o00oOoO = str;
        o00oo0();
    }

    public void o00oo0OO(o00oOOo0 o00oooo02) {
        this.f1290o00oOoOO = o00oooo02;
        o00oo0();
    }

    public void o00oo0Oo(Intent intent) {
        intent.addFlags(134742016);
    }
}
