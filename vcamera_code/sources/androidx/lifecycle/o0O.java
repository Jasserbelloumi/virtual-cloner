package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.o00oOOo0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o0OOo0OO.oO00000o;
import o0OOo0OO.oO000Oo0;
import o0OOo0OO.oO000o00;
import o0OOo0OO.oO0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
@o0OOOOO0.o0OOO00({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: classes.dex */
public final class o0O {
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f3318o00oOoO = "keys";
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f3319o00oOoO0 = "values";
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Map<String, Object> f3321o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Map<String, o00oOOo0.o00oOo00> f3322o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Map<String, o00oOOoO<?>> f3323o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oOOo0.o00oOo00 f3324o00oOo0O;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Map<String, oO00000o<Object>> f3325o00oOooO;
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o00oOOo0 f3317o00oOo0o = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final Class<? extends Object>[] f3320o00oOoOO = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @o0OOOO0o.o00ooO0
        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        @NotNull
        public final o0O o00oOOo0(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new o0O();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    o0OOOOO0.o0ooO.o00oo0OO(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new o0O(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(o0O.f3318o00oOoO);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o0O.f3319o00oOoO0);
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    o0OOOOO0.o0ooO.o00oo0(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new o0O(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
        public final boolean o00oOOoO(@Nullable Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : o0O.f3320o00oOoOO) {
                o0OOOOO0.o0ooO.o00oo00O(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO<T> extends o0O0OOOo<T> {
        @Nullable

        /* renamed from: o00oo0  reason: collision with root package name */
        public o0O f3326o00oo0;
        @NotNull

        /* renamed from: o00oo00O  reason: collision with root package name */
        public String f3327o00oo00O;

        public o00oOOoO(@Nullable o0O o0o, @NotNull String str) {
            o0OOOOO0.o0ooO.o00oo0O0(str, "key");
            this.f3327o00oo00O = str;
            this.f3326o00oo0 = o0o;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(@Nullable o0O o0o, @NotNull String str, T t) {
            super(t);
            o0OOOOO0.o0ooO.o00oo0O0(str, "key");
            this.f3327o00oo00O = str;
            this.f3326o00oo0 = o0o;
        }

        @Override // androidx.lifecycle.o0O0OOOo, androidx.lifecycle.LiveData
        public void o00oo0Oo(T t) {
            o0O o0o = this.f3326o00oo0;
            if (o0o != null) {
                o0o.f3321o00oOOo0.put(this.f3327o00oo00O, t);
                oO00000o<Object> oo00000o = o0o.f3325o00oOooO.get(this.f3327o00oo00O);
                if (oo00000o != null) {
                    oo00000o.setValue(t);
                }
            }
            super.o00oo0Oo(t);
        }

        public final void o00oo0o0() {
            this.f3326o00oo0 = null;
        }
    }

    public o0O() {
        this.f3321o00oOOo0 = new LinkedHashMap();
        this.f3322o00oOOoO = new LinkedHashMap();
        this.f3323o00oOo00 = new LinkedHashMap();
        this.f3325o00oOooO = new LinkedHashMap();
        this.f3324o00oOo0O = new o00oOOo0.o00oOo00() { // from class: androidx.lifecycle.o0O0oo00
            @Override // androidx.savedstate.o00oOOo0.o00oOo00
            public final Bundle o00oOOo0() {
                Bundle o00oo0O02;
                o00oo0O02 = o0O.o00oo0O0(o0O.this);
                return o00oo0O02;
            }
        };
    }

    public o0O(@NotNull Map<String, ? extends Object> map) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3321o00oOOo0 = linkedHashMap;
        this.f3322o00oOOoO = new LinkedHashMap();
        this.f3323o00oOo00 = new LinkedHashMap();
        this.f3325o00oOooO = new LinkedHashMap();
        this.f3324o00oOo0O = new o00oOOo0.o00oOo00() { // from class: androidx.lifecycle.o0O0oo00
            @Override // androidx.savedstate.o00oOOo0.o00oOo00
            public final Bundle o00oOOo0() {
                Bundle o00oo0O02;
                o00oo0O02 = o0O.o00oo0O0(o0O.this);
                return o00oo0O02;
            }
        };
        linkedHashMap.putAll(map);
    }

    @o0OOOO0o.o00ooO0
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public static final o0O o00oOoO0(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return f3317o00oOo0o.o00oOOo0(bundle, bundle2);
    }

    public static final Bundle o00oo0O0(o0O o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o, "this$0");
        for (Map.Entry entry : o0OO0oO.oo0ooO.o0O0O0oO(o0o.f3322o00oOOoO).entrySet()) {
            o0o.o00oo0O((String) entry.getKey(), ((o00oOOo0.o00oOo00) entry.getValue()).o00oOOo0());
        }
        Set<String> keySet = o0o.f3321o00oOOo0.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(o0o.f3321o00oOOo0.get(str));
        }
        return o0O000.o00oOo0O.o00oOOoO(new o0OO0o.o0O0o00(f3318o00oOoO, arrayList), new o0OO0o.o0O0o00(f3319o00oOoO0, arrayList2));
    }

    @o00oOooO.o0O
    public final void o00oOo0O(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        this.f3322o00oOOoO.remove(str);
    }

    @o00oOooO.o0O
    public final boolean o00oOo0o(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        return this.f3321o00oOOo0.containsKey(str);
    }

    @o00oOooO.o0O
    @Nullable
    public final <T> T o00oOoO(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        try {
            return (T) this.f3321o00oOOo0.get(str);
        } catch (ClassCastException unused) {
            o00oo0(str);
            return null;
        }
    }

    @o00oOooO.o0O
    @NotNull
    public final <T> o0O0OOOo<T> o00oOoOO(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0O0OOOo<T> o00oOoo02 = o00oOoo0(str, false, null);
        o0OOOOO0.o0ooO.o00oo0(o00oOoo02, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return o00oOoo02;
    }

    @o00oOooO.o0O
    @NotNull
    public final <T> o0O0OOOo<T> o00oOoOo(@NotNull String str, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        return o00oOoo0(str, true, t);
    }

    public final <T> o0O0OOOo<T> o00oOoo0(String str, boolean z, T t) {
        o00oOOoO<?> o00ooooo2;
        o00oOOoO<?> o00ooooo3 = this.f3323o00oOo00.get(str);
        o00oOOoO<?> o00ooooo4 = o00ooooo3 instanceof o0O0OOOo ? o00ooooo3 : null;
        if (o00ooooo4 != null) {
            return o00ooooo4;
        }
        if (this.f3321o00oOOo0.containsKey(str)) {
            o00ooooo2 = new o00oOOoO<>(this, str, this.f3321o00oOOo0.get(str));
        } else if (z) {
            this.f3321o00oOOo0.put(str, t);
            o00ooooo2 = new o00oOOoO<>(this, str, t);
        } else {
            o00ooooo2 = new o00oOOoO<>(this, str);
        }
        this.f3323o00oOo00.put(str, o00ooooo2);
        return o00ooooo2;
    }

    @o00oOooO.o0O
    @NotNull
    public final <T> oO000Oo0<T> o00oOooo(@NotNull String str, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        Map<String, oO00000o<Object>> map = this.f3325o00oOooO;
        oO00000o<Object> oo00000o = map.get(str);
        if (oo00000o == null) {
            if (!this.f3321o00oOOo0.containsKey(str)) {
                this.f3321o00oOOo0.put(str, t);
            }
            oo00000o = oO000o00.o00oOOo0(this.f3321o00oOOo0.get(str));
            this.f3325o00oOooO.put(str, oo00000o);
            map.put(str, oo00000o);
        }
        oO000Oo0<T> o00oOOoO2 = oO0Oo.o00oOOoO(oo00000o);
        o0OOOOO0.o0ooO.o00oo0(o00oOOoO2, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return o00oOOoO2;
    }

    @o00oOooO.o0O
    @Nullable
    public final <T> T o00oo0(@NotNull String str) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        T t = (T) this.f3321o00oOOo0.remove(str);
        o00oOOoO<?> remove = this.f3323o00oOo00.remove(str);
        if (remove != null) {
            remove.f3326o00oo0 = null;
        }
        this.f3325o00oOooO.remove(str);
        return t;
    }

    @o00oOooO.o0O
    @NotNull
    public final Set<String> o00oo00O() {
        return o0OO0oO.o0OO.o00ooOO0(o0OO0oO.o0OO.o00ooOO0(this.f3321o00oOOo0.keySet(), this.f3322o00oOOoO.keySet()), this.f3323o00oOo00.keySet());
    }

    @o00oOooO.o0O
    public final <T> void o00oo0O(@NotNull String str, @Nullable T t) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        if (!f3317o00oOo0o.o00oOOoO(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            o0OOOOO0.o0ooO.o00oo00O(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        o00oOOoO<?> o00ooooo2 = this.f3323o00oOo00.get(str);
        o00oOOoO<?> o00ooooo3 = o00ooooo2 instanceof o0O0OOOo ? o00ooooo2 : null;
        if (o00ooooo3 != null) {
            o00ooooo3.o00oo0Oo(t);
        } else {
            this.f3321o00oOOo0.put(str, t);
        }
        oO00000o<Object> oo00000o = this.f3325o00oOooO.get(str);
        if (oo00000o == null) {
            return;
        }
        oo00000o.setValue(t);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    @NotNull
    public final o00oOOo0.o00oOo00 o00oo0OO() {
        return this.f3324o00oOo0O;
    }

    @o00oOooO.o0O
    public final void o00oo0Oo(@NotNull String str, @NotNull o00oOOo0.o00oOo00 o00ooo002) {
        o0OOOOO0.o0ooO.o00oo0O0(str, "key");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooo002, DatabaseFileArchive.COLUMN_PROVIDER);
        this.f3322o00oOOoO.put(str, o00ooo002);
    }
}
