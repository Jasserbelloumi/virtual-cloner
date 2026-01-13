package o00oOoOo;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import o0.o00oOOoO;
import o00oOoOo.o00oo0;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0o extends ActionMode {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f7077o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo0 f7078o00oOOoO;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oo0.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ActionMode.Callback f7079o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Context f7080o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final ArrayList<o0O0o> f7081o00oOo00 = new ArrayList<>();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final androidx.collection.o00ooO0<Menu, Menu> f7082o00oOooO = new androidx.collection.o00ooO0<>();

        public o00oOOo0(Context context, ActionMode.Callback callback) {
            this.f7080o00oOOoO = context;
            this.f7079o00oOOo0 = callback;
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOOo0(o00oo0 o00oo0Var, MenuItem menuItem) {
            return this.f7079o00oOOo0.onActionItemClicked(o00oOo0O(o00oo0Var), new o00oOoo0.o00oo0O(this.f7080o00oOOoO, (o00oOOoO) menuItem));
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public void o00oOOoO(o00oo0 o00oo0Var) {
            this.f7079o00oOOo0.onDestroyActionMode(o00oOo0O(o00oo0Var));
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOo00(o00oo0 o00oo0Var, Menu menu) {
            return this.f7079o00oOOo0.onPrepareActionMode(o00oOo0O(o00oo0Var), o00oOo0o(menu));
        }

        public ActionMode o00oOo0O(o00oo0 o00oo0Var) {
            int size = this.f7081o00oOo00.size();
            for (int i = 0; i < size; i++) {
                o0O0o o0o0o = this.f7081o00oOo00.get(i);
                if (o0o0o != null && o0o0o.f7078o00oOOoO == o00oo0Var) {
                    return o0o0o;
                }
            }
            o0O0o o0o0o2 = new o0O0o(this.f7080o00oOOoO, o00oo0Var);
            this.f7081o00oOo00.add(o0o0o2);
            return o0o0o2;
        }

        public final Menu o00oOo0o(Menu menu) {
            Menu menu2 = this.f7082o00oOooO.get(menu);
            if (menu2 == null) {
                o00oOoo0.o00oo o00ooVar = new o00oOoo0.o00oo(this.f7080o00oOOoO, (o0.o00oOOo0) menu);
                this.f7082o00oOooO.put(menu, o00ooVar);
                return o00ooVar;
            }
            return menu2;
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOooO(o00oo0 o00oo0Var, Menu menu) {
            return this.f7079o00oOOo0.onCreateActionMode(o00oOo0O(o00oo0Var), o00oOo0o(menu));
        }
    }

    public o0O0o(Context context, o00oo0 o00oo0Var) {
        this.f7077o00oOOo0 = context;
        this.f7078o00oOOoO = o00oo0Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f7078o00oOOoO.o00oOOo0();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f7078o00oOOoO.o00oOOoO();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o00oOoo0.o00oo(this.f7077o00oOOo0, (o0.o00oOOo0) this.f7078o00oOOoO.o00oOo00());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f7078o00oOOoO.o00oOooO();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f7078o00oOOoO.o00oOo0O();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f7078o00oOOoO.o00oOo0o();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f7078o00oOOoO.o00oOoO0();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f7078o00oOOoO.o00oOoO();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f7078o00oOOoO.o00oOoOO();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f7078o00oOOoO.o00oOoOo();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f7078o00oOOoO.o00oOooo(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f7078o00oOOoO.o00oo00O(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f7078o00oOOoO.o00oo0(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f7078o00oOOoO.o00oo0OO(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f7078o00oOOoO.o00oo0O0(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f7078o00oOOoO.o00oo0O(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f7078o00oOOoO.o00oo0Oo(z);
    }
}
