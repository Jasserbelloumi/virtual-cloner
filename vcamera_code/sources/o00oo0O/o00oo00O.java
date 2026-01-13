package o00oo0O;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oo00O implements ServiceConnection {
    @o0OO00OO
    private Context mApplicationContext;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oOo00 {
        public o00oOOo0(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@oo0oO0 ComponentName componentName, @oo0oO0 o00oOo00 o00ooo002);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@oo0oO0 ComponentName componentName, @oo0oO0 IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new o00oOOo0(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.mApplicationContext));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public void setApplicationContext(@oo0oO0 Context context) {
        this.mApplicationContext = context;
    }
}
