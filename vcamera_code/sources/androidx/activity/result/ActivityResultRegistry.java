package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oO000OOo;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f75o00oOoOO = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f76o00oOoOo = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f77o00oOoo0 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f78o00oOooo = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f79o00oo0 = "ActivityResultRegistry";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f80o00oo00O = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f81o00oo0OO = 65536;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Random f82o00oOOo0 = new Random();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<Integer, String> f83o00oOOoO = new HashMap();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, Integer> f84o00oOo00 = new HashMap();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Map<String, o00oOo0O> f89o00oOooO = new HashMap();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ArrayList<String> f85o00oOo0O = new ArrayList<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final transient Map<String, o00oOo00<?>> f86o00oOo0o = new HashMap();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Map<String, Object> f88o00oOoO0 = new HashMap();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final Bundle f87o00oOoO = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class o00oOOo0<I> extends o00oo0OO<I> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ String f94o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oOo00.o00oOOo0 f95o00oOOoO;

        public o00oOOo0(String str, o00oOo00.o00oOOo0 o00oooo02) {
            this.f94o00oOOo0 = str;
            this.f95o00oOOoO = o00oooo02;
        }

        @Override // androidx.activity.result.o00oo0OO
        @oo0oO0
        public o00oOo00.o00oOOo0<I, ?> o00oOOo0() {
            return this.f95o00oOOoO;
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOo00(I i, @o0OO00OO oO000OOo oo000ooo) {
            Integer num = ActivityResultRegistry.this.f84o00oOo00.get(this.f94o00oOOo0);
            if (num != null) {
                ActivityResultRegistry.this.f85o00oOo0O.add(this.f94o00oOOo0);
                try {
                    ActivityResultRegistry.this.o00oOo0o(num.intValue(), this.f95o00oOOoO, i, oo000ooo);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f85o00oOo0O.remove(this.f94o00oOOo0);
                    throw e;
                }
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            o00oOOo02.append(this.f95o00oOOoO);
            o00oOOo02.append(" and input ");
            o00oOOo02.append(i);
            o00oOOo02.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(o00oOOo02.toString());
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOooO() {
            ActivityResultRegistry.this.o00oOooo(this.f94o00oOOo0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class o00oOOoO<I> extends o00oo0OO<I> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ String f97o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o00oOo00.o00oOOo0 f98o00oOOoO;

        public o00oOOoO(String str, o00oOo00.o00oOOo0 o00oooo02) {
            this.f97o00oOOo0 = str;
            this.f98o00oOOoO = o00oooo02;
        }

        @Override // androidx.activity.result.o00oo0OO
        @oo0oO0
        public o00oOo00.o00oOOo0<I, ?> o00oOOo0() {
            return this.f98o00oOOoO;
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOo00(I i, @o0OO00OO oO000OOo oo000ooo) {
            Integer num = ActivityResultRegistry.this.f84o00oOo00.get(this.f97o00oOOo0);
            if (num != null) {
                ActivityResultRegistry.this.f85o00oOo0O.add(this.f97o00oOOo0);
                try {
                    ActivityResultRegistry.this.o00oOo0o(num.intValue(), this.f98o00oOOoO, i, oo000ooo);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f85o00oOo0O.remove(this.f97o00oOOo0);
                    throw e;
                }
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            o00oOOo02.append(this.f98o00oOOoO);
            o00oOOo02.append(" and input ");
            o00oOOo02.append(i);
            o00oOOo02.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(o00oOOo02.toString());
        }

        @Override // androidx.activity.result.o00oo0OO
        public void o00oOooO() {
            ActivityResultRegistry.this.o00oOooo(this.f97o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00<O> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final androidx.activity.result.o00oOOo0<O> f100o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOo00.o00oOOo0<?, O> f101o00oOOoO;

        public o00oOo00(androidx.activity.result.o00oOOo0<O> o00oooo02, o00oOo00.o00oOOo0<?, O> o00oooo03) {
            this.f100o00oOOo0 = o00oooo02;
            this.f101o00oOOoO = o00oooo03;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O00 f102o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ArrayList<o0O00OOO> f103o00oOOoO = new ArrayList<>();

        public o00oOo0O(@oo0oO0 o0O00 o0o00) {
            this.f102o00oOOo0 = o0o00;
        }

        public void o00oOOo0(@oo0oO0 o0O00OOO o0o00ooo) {
            this.f102o00oOOo0.o00oOOo0(o0o00ooo);
            this.f103o00oOOoO.add(o0o00ooo);
        }

        public void o00oOOoO() {
            Iterator<o0O00OOO> it = this.f103o00oOOoO.iterator();
            while (it.hasNext()) {
                this.f102o00oOOo0.o00oOooO(it.next());
            }
            this.f103o00oOOoO.clear();
        }
    }

    public final void o00oOOo0(int i, String str) {
        this.f83o00oOOoO.put(Integer.valueOf(i), str);
        this.f84o00oOo00.put(str, Integer.valueOf(i));
    }

    @o0O
    public final boolean o00oOOoO(int i, int i2, @o0OO00OO Intent intent) {
        String str = this.f83o00oOOoO.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        o00oOooO(str, i2, intent, this.f86o00oOo0o.get(str));
        return true;
    }

    @o0O
    public final <O> boolean o00oOo00(int i, @SuppressLint({"UnknownNullness"}) O o) {
        androidx.activity.result.o00oOOo0<?> o00oooo02;
        String str = this.f83o00oOOoO.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        o00oOo00<?> o00ooo002 = this.f86o00oOo0o.get(str);
        if (o00ooo002 == null || (o00oooo02 = o00ooo002.f100o00oOOo0) == null) {
            this.f87o00oOoO.remove(str);
            this.f88o00oOoO0.put(str, o);
            return true;
        } else if (this.f85o00oOo0O.remove(str)) {
            o00oooo02.o00oOOo0(o);
            return true;
        } else {
            return true;
        }
    }

    public final int o00oOo0O() {
        int nextInt = this.f82o00oOOo0.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f83o00oOOoO.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f82o00oOOo0.nextInt(2147418112);
        }
    }

    @o0O
    public abstract <I, O> void o00oOo0o(int i, @oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @SuppressLint({"UnknownNullness"}) I i2, @o0OO00OO oO000OOo oo000ooo);

    public final void o00oOoO(@oo0oO0 Bundle bundle) {
        bundle.putIntegerArrayList(f75o00oOoOO, new ArrayList<>(this.f84o00oOo00.values()));
        bundle.putStringArrayList(f76o00oOoOo, new ArrayList<>(this.f84o00oOo00.keySet()));
        bundle.putStringArrayList(f77o00oOoo0, new ArrayList<>(this.f85o00oOo0O));
        bundle.putBundle(f78o00oOooo, (Bundle) this.f87o00oOoO.clone());
        bundle.putSerializable(f80o00oo00O, this.f82o00oOOo0);
    }

    public final void o00oOoO0(@o0OO00OO Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f75o00oOoOO);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f76o00oOoOo);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f85o00oOo0O = bundle.getStringArrayList(f77o00oOoo0);
        this.f82o00oOOo0 = (Random) bundle.getSerializable(f80o00oo00O);
        this.f87o00oOoO.putAll(bundle.getBundle(f78o00oOooo));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f84o00oOo00.containsKey(str)) {
                Integer remove = this.f84o00oOo00.remove(str);
                if (!this.f87o00oOoO.containsKey(str)) {
                    this.f83o00oOOoO.remove(remove);
                }
            }
            o00oOOo0(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    @oo0oO0
    public final <I, O> o00oo0OO<I> o00oOoOO(@oo0oO0 final String str, @oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 final o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 final androidx.activity.result.o00oOOo0<O> o00oooo03) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        if (lifecycle.o00oOOoO().isAtLeast(o0O00.o00oOOoO.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + o0o0o0o + " is attempting to register while current state is " + lifecycle.o00oOOoO() + ". LifecycleOwners must call register before they are STARTED.");
        }
        o00oOoo0(str);
        o00oOo0O o00ooo0o2 = this.f89o00oOooO.get(str);
        if (o00ooo0o2 == null) {
            o00ooo0o2 = new o00oOo0O(lifecycle);
        }
        o00ooo0o2.o00oOOo0(new o0O00OOO() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o2, @oo0oO0 o0O00.o00oOOo0 o00oooo04) {
                if (!o0O00.o00oOOo0.ON_START.equals(o00oooo04)) {
                    if (o0O00.o00oOOo0.ON_STOP.equals(o00oooo04)) {
                        ActivityResultRegistry.this.f86o00oOo0o.remove(str);
                        return;
                    } else if (o0O00.o00oOOo0.ON_DESTROY.equals(o00oooo04)) {
                        ActivityResultRegistry.this.o00oOooo(str);
                        return;
                    } else {
                        return;
                    }
                }
                ActivityResultRegistry.this.f86o00oOo0o.put(str, new o00oOo00<>(o00oooo03, o00oooo02));
                if (ActivityResultRegistry.this.f88o00oOoO0.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f88o00oOoO0.get(str);
                    ActivityResultRegistry.this.f88o00oOoO0.remove(str);
                    o00oooo03.o00oOOo0(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f87o00oOoO.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f87o00oOoO.remove(str);
                    o00oooo03.o00oOOo0(o00oooo02.o00oOo00(activityResult.f74o00oo0O0, activityResult.f73o00oo0O));
                }
            }
        });
        this.f89o00oOooO.put(str, o00ooo0o2);
        return new o00oOOo0(str, o00oooo02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oo0oO0
    public final <I, O> o00oo0OO<I> o00oOoOo(@oo0oO0 String str, @oo0oO0 o00oOo00.o00oOOo0<I, O> o00oooo02, @oo0oO0 androidx.activity.result.o00oOOo0<O> o00oooo03) {
        o00oOoo0(str);
        this.f86o00oOo0o.put(str, new o00oOo00<>(o00oooo03, o00oooo02));
        if (this.f88o00oOoO0.containsKey(str)) {
            Object obj = this.f88o00oOoO0.get(str);
            this.f88o00oOoO0.remove(str);
            o00oooo03.o00oOOo0(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f87o00oOoO.getParcelable(str);
        if (activityResult != null) {
            this.f87o00oOoO.remove(str);
            o00oooo03.o00oOOo0(o00oooo02.o00oOo00(activityResult.f74o00oo0O0, activityResult.f73o00oo0O));
        }
        return new o00oOOoO(str, o00oooo02);
    }

    public final void o00oOoo0(String str) {
        if (this.f84o00oOo00.get(str) != null) {
            return;
        }
        o00oOOo0(o00oOo0O(), str);
    }

    public final <O> void o00oOooO(String str, int i, @o0OO00OO Intent intent, @o0OO00OO o00oOo00<O> o00ooo002) {
        if (o00ooo002 == null || o00ooo002.f100o00oOOo0 == null || !this.f85o00oOo0O.contains(str)) {
            this.f88o00oOoO0.remove(str);
            this.f87o00oOoO.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        o00ooo002.f100o00oOOo0.o00oOOo0(o00ooo002.f101o00oOOoO.o00oOo00(i, intent));
        this.f85o00oOo0O.remove(str);
    }

    @o0O
    public final void o00oOooo(@oo0oO0 String str) {
        Integer remove;
        if (!this.f85o00oOo0O.contains(str) && (remove = this.f84o00oOo00.remove(str)) != null) {
            this.f83o00oOOoO.remove(remove);
        }
        this.f86o00oOo0o.remove(str);
        if (this.f88o00oOoO0.containsKey(str)) {
            Objects.toString(this.f88o00oOoO0.get(str));
            this.f88o00oOoO0.remove(str);
        }
        if (this.f87o00oOoO.containsKey(str)) {
            Objects.toString(this.f87o00oOoO.getParcelable(str));
            this.f87o00oOoO.remove(str);
        }
        o00oOo0O o00ooo0o2 = this.f89o00oOooO.get(str);
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOOoO();
            this.f89o00oOooO.remove(str);
        }
    }
}
