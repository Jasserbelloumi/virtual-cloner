package o00ooOoo;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
/* loaded from: classes.dex */
public final class oO0Oo0o0 implements Iterable<Intent> {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f9146o00oo0Oo = "TaskStackBuilder";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f9147o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final ArrayList<Intent> f9148o00oo0O0 = new ArrayList<>();

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static PendingIntent o00oOOo0(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        @o0OO00OO
        Intent o00oOoOO();
    }

    public oO0Oo0o0(Context context) {
        this.f9147o00oo0O = context;
    }

    @oo0oO0
    public static oO0Oo0o0 o00oOo0o(@oo0oO0 Context context) {
        return new oO0Oo0o0(context);
    }

    @Deprecated
    public static oO0Oo0o0 o00oOoO(Context context) {
        return new oO0Oo0o0(context);
    }

    @Override // java.lang.Iterable
    @oo0oO0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f9148o00oo0O0.iterator();
    }

    @oo0oO0
    public oO0Oo0o0 o00oOOo0(@oo0oO0 Intent intent) {
        this.f9148o00oo0O0.add(intent);
        return this;
    }

    @oo0oO0
    public oO0Oo0o0 o00oOOoO(@oo0oO0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f9147o00oo0O.getPackageManager());
        }
        if (component != null) {
            o00oOooO(component);
        }
        o00oOOo0(intent);
        return this;
    }

    @oo0oO0
    public oO0Oo0o0 o00oOo00(@oo0oO0 Activity activity) {
        Intent o00oOoOO2 = activity instanceof o00oOOoO ? ((o00oOOoO) activity).o00oOoOO() : null;
        if (o00oOoOO2 == null) {
            o00oOoOO2 = oO00OO.o00oOOo0(activity);
        }
        if (o00oOoOO2 != null) {
            ComponentName component = o00oOoOO2.getComponent();
            if (component == null) {
                component = o00oOoOO2.resolveActivity(this.f9147o00oo0O.getPackageManager());
            }
            o00oOooO(component);
            o00oOOo0(o00oOoOO2);
        }
        return this;
    }

    @oo0oO0
    public oO0Oo0o0 o00oOo0O(@oo0oO0 Class<?> cls) {
        return o00oOooO(new ComponentName(this.f9147o00oo0O, cls));
    }

    @o0OO00OO
    public Intent o00oOoO0(int i) {
        return this.f9148o00oo0O0.get(i);
    }

    @Deprecated
    public Intent o00oOoOO(int i) {
        return o00oOoO0(i);
    }

    public int o00oOoOo() {
        return this.f9148o00oo0O0.size();
    }

    @oo0oO0
    public Intent[] o00oOoo0() {
        int size = this.f9148o00oo0O0.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f9148o00oo0O0.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.f9148o00oo0O0.get(i));
        }
        return intentArr;
    }

    @oo0oO0
    public oO0Oo0o0 o00oOooO(@oo0oO0 ComponentName componentName) {
        int size = this.f9148o00oo0O0.size();
        try {
            Context context = this.f9147o00oo0O;
            while (true) {
                Intent o00oOOoO2 = oO00OO.o00oOOoO(context, componentName);
                if (o00oOOoO2 == null) {
                    return this;
                }
                this.f9148o00oo0O0.add(size, o00oOOoO2);
                context = this.f9147o00oo0O;
                componentName = o00oOOoO2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @o0OO00OO
    public PendingIntent o00oOooo(int i, int i2) {
        return o00oo00O(i, i2, null);
    }

    public void o00oo0() {
        o00oo0OO(null);
    }

    @o0OO00OO
    public PendingIntent o00oo00O(int i, int i2, @o0OO00OO Bundle bundle) {
        if (this.f9148o00oo0O0.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f9148o00oo0O0.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return o00oOOo0.o00oOOo0(this.f9147o00oo0O, i, intentArr, i2, bundle);
    }

    public void o00oo0OO(@o0OO00OO Bundle bundle) {
        if (this.f9148o00oo0O0.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f9148o00oo0O0.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (o0.startActivities(this.f9147o00oo0O, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f9147o00oo0O.startActivity(intent);
    }
}
