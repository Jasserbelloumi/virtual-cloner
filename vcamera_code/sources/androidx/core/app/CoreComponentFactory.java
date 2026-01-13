package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 28)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        Object o00oOOo0();
    }

    public static <T> T o00oOOo0(T t) {
        T t2;
        return (!(t instanceof o00oOOo0) || (t2 = (T) ((o00oOOo0) t).o00oOOo0()) == null) ? t : t2;
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public Activity instantiateActivity(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) o00oOOo0(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public Application instantiateApplication(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) o00oOOo0(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public ContentProvider instantiateProvider(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) o00oOOo0(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public BroadcastReceiver instantiateReceiver(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) o00oOOo0(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public Service instantiateService(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) o00oOOo0(super.instantiateService(classLoader, str, intent));
    }
}
