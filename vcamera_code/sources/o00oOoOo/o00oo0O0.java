package o00oOoOo;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public class o00oo0O0 extends ContextWrapper {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Configuration f7008o00oOo0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f7009o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Resources.Theme f7010o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public LayoutInflater f7011o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Resources f7012o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Configuration f7013o00oOooO;

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Context o00oOOo0(o00oo0O0 o00oo0o02, Configuration configuration) {
            return o00oo0o02.createConfigurationContext(configuration);
        }
    }

    public o00oo0O0() {
        super(null);
    }

    public o00oo0O0(Context context, @o0OOO0OO int i) {
        super(context);
        this.f7009o00oOOo0 = i;
    }

    public o00oo0O0(Context context, Resources.Theme theme) {
        super(context);
        this.f7010o00oOOoO = theme;
    }

    @o0OOooO0(26)
    public static boolean o00oOo0O(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f7008o00oOo0o == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f7008o00oOo0o = configuration2;
        }
        return configuration.equals(f7008o00oOo0o);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return o00oOOoO();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f7011o00oOo00 == null) {
                this.f7011o00oOo00 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f7011o00oOo00;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7010o00oOOoO;
        if (theme != null) {
            return theme;
        }
        if (this.f7009o00oOOo0 == 0) {
            this.f7009o00oOOo0 = R.style.Theme_AppCompat_Light;
        }
        o00oOooO();
        return this.f7010o00oOOoO;
    }

    public void o00oOOo0(Configuration configuration) {
        if (this.f7012o00oOo0O != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7013o00oOooO != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7013o00oOooO = new Configuration(configuration);
    }

    public final Resources o00oOOoO() {
        if (this.f7012o00oOo0O == null) {
            Configuration configuration = this.f7013o00oOooO;
            this.f7012o00oOo0O = (configuration == null || o00oOo0O(configuration)) ? super.getResources() : o00oOOo0.o00oOOo0(this, this.f7013o00oOooO).getResources();
        }
        return this.f7012o00oOo0O;
    }

    public int o00oOo00() {
        return this.f7009o00oOOo0;
    }

    public void o00oOo0o(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public final void o00oOooO() {
        boolean z = this.f7010o00oOOoO == null;
        if (z) {
            this.f7010o00oOOoO = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7010o00oOOoO.setTo(theme);
            }
        }
        o00oOo0o(this.f7010o00oOOoO, this.f7009o00oOOo0, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f7009o00oOOo0 != i) {
            this.f7009o00oOOo0 = i;
            o00oOooO();
        }
    }
}
