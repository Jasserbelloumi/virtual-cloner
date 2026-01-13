package o00ooOoo;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(28)
/* loaded from: classes.dex */
public class oO000Oo0 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    @oo0oO0
    public final Activity instantiateActivity(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.o00oOOo0(o00oOOo0(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public final Application instantiateApplication(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.o00oOOo0(o00oOOoO(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public final ContentProvider instantiateProvider(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.o00oOOo0(o00oOo00(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public final BroadcastReceiver instantiateReceiver(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.o00oOOo0(o00oOooO(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @oo0oO0
    public final Service instantiateService(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.o00oOOo0(o00oOo0O(classLoader, str, intent));
    }

    @oo0oO0
    public Activity o00oOOo0(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @oo0oO0
    public Application o00oOOoO(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @oo0oO0
    public ContentProvider o00oOo00(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @oo0oO0
    public Service o00oOo0O(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @oo0oO0
    public BroadcastReceiver o00oOooO(@oo0oO0 ClassLoader classLoader, @oo0oO0 String str, @o0OO00OO Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
