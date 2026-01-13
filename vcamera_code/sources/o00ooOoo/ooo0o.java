package o00ooOoo;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o00oOoOo.o00oo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class ooo0o {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f9546o00oOoO = "android.remoteinput.results";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f9547o00oOoOO = "android.remoteinput.resultsData";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f9548o00oOoOo = "android.remoteinput.dataTypeResultsData";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f9549o00oOoo0 = "android.remoteinput.resultsSource";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f9550o00oOooo = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f9551o00oo0 = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f9552o00oo00O = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f9553o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f9554o00oo0OO = 1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f9555o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CharSequence f9556o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final CharSequence[] f9557o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f9558o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final Bundle f9559o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final Set<String> f9560o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final boolean f9561o00oOooO;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static ClipData o00oOOo0(Intent intent) {
            return intent.getClipData();
        }

        @o0O0O0Oo
        public static void o00oOOoO(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    @o0OOooO0(20)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput o00oOOoO(ooo0o ooo0oVar) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(ooo0oVar.f9555o00oOOo0).setLabel(ooo0oVar.f9556o00oOOoO).setChoices(ooo0oVar.f9557o00oOo00).setAllowFreeFormInput(ooo0oVar.f9561o00oOooO).addExtras(ooo0oVar.f9559o00oOo0o);
            Set<String> set = ooo0oVar.f9560o00oOoO0;
            if (set != null) {
                for (String str : set) {
                    o00oOo00.o00oOooO(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                o00oOoO.o00oOOoO(addExtras, ooo0oVar.f9558o00oOo0O);
            }
            return addExtras.build();
        }

        public static ooo0o o00oOo00(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            o00oo00O o00oo00o = new o00oo00O(remoteInput.getResultKey());
            o00oo00o.f9568o00oOooO = remoteInput.getLabel();
            o00oo00o.f9565o00oOo0O = remoteInput.getChoices();
            o00oo00o.f9566o00oOo0o = remoteInput.getAllowFreeFormInput();
            o00oo00O o00oOOo02 = o00oo00o.o00oOOo0(remoteInput.getExtras());
            Set<String> o00oOOoO2 = o00oOo00.o00oOOoO(remoteInput);
            if (o00oOOoO2 != null) {
                for (String str : o00oOOoO2) {
                    o00oOOo02.o00oOooO(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                o00oOOo02.f9567o00oOoO0 = o00oOoO.o00oOOo0(remoteInput);
            }
            return o00oOOo02.o00oOOoO();
        }

        @o0O0O0Oo
        public static Bundle o00oOooO(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static void o00oOOo0(ooo0o ooo0oVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(o00oOOoO.o00oOOoO(ooo0oVar), intent, map);
        }

        @o0O0O0Oo
        public static Set<String> o00oOOoO(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @o0O0O0Oo
        public static Map<String, Uri> o00oOo00(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @o0O0O0Oo
        public static RemoteInput.Builder o00oOooO(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static int o00oOOo0(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @o0O0O0Oo
        public static void o00oOOoO(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    @o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static int o00oOOo0(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        @o0O0O0Oo
        public static RemoteInput.Builder o00oOOoO(RemoteInput.Builder builder, int i) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i);
            return editChoicesBeforeSending;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0 {
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f9562o00oOOo0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public CharSequence[] f9565o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public CharSequence f9568o00oOooO;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Set<String> f9563o00oOOoO = new HashSet();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Bundle f9564o00oOo00 = new Bundle();

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f9566o00oOo0o = true;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f9567o00oOoO0 = 0;

        public o00oo00O(@oo0oO0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f9562o00oOOo0 = str;
        }

        @oo0oO0
        public o00oo00O o00oOOo0(@oo0oO0 Bundle bundle) {
            if (bundle != null) {
                this.f9564o00oOo00.putAll(bundle);
            }
            return this;
        }

        @oo0oO0
        public ooo0o o00oOOoO() {
            return new ooo0o(this.f9562o00oOOo0, this.f9568o00oOooO, this.f9565o00oOo0O, this.f9566o00oOo0o, this.f9567o00oOoO0, this.f9564o00oOo00, this.f9563o00oOOoO);
        }

        @oo0oO0
        public Bundle o00oOo00() {
            return this.f9564o00oOo00;
        }

        @oo0oO0
        public o00oo00O o00oOo0O(boolean z) {
            this.f9566o00oOo0o = z;
            return this;
        }

        @oo0oO0
        public o00oo00O o00oOo0o(@o0OO00OO CharSequence[] charSequenceArr) {
            this.f9565o00oOo0O = charSequenceArr;
            return this;
        }

        @oo0oO0
        public o00oo00O o00oOoO(@o0OO00OO CharSequence charSequence) {
            this.f9568o00oOooO = charSequence;
            return this;
        }

        @oo0oO0
        public o00oo00O o00oOoO0(int i) {
            this.f9567o00oOoO0 = i;
            return this;
        }

        @oo0oO0
        public o00oo00O o00oOooO(@oo0oO0 String str, boolean z) {
            if (z) {
                this.f9563o00oOOoO.add(str);
            } else {
                this.f9563o00oOOoO.remove(str);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0OO {
    }

    public ooo0o(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f9555o00oOOo0 = str;
        this.f9556o00oOOoO = charSequence;
        this.f9557o00oOo00 = charSequenceArr;
        this.f9561o00oOooO = z;
        this.f9558o00oOo0O = i;
        this.f9559o00oOo0o = bundle;
        this.f9560o00oOoO0 = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void o00oOOo0(@oo0oO0 ooo0o ooo0oVar, @oo0oO0 Intent intent, @oo0oO0 Map<String, Uri> map) {
        o00oOo00.o00oOOo0(ooo0oVar, intent, map);
    }

    public static void o00oOOoO(@oo0oO0 ooo0o[] ooo0oVarArr, @oo0oO0 Intent intent, @oo0oO0 Bundle bundle) {
        o00oOOoO.o00oOOo0(o00oOooO(ooo0oVarArr), intent, bundle);
    }

    @o0OOooO0(20)
    public static RemoteInput o00oOo00(ooo0o ooo0oVar) {
        return o00oOOoO.o00oOOoO(ooo0oVar);
    }

    @o0OOooO0(20)
    public static ooo0o o00oOo0O(RemoteInput remoteInput) {
        return o00oOOoO.o00oOo00(remoteInput);
    }

    @o0OOooO0(16)
    public static Intent o00oOoOO(Intent intent) {
        ClipData o00oOOo02 = o00oOOo0.o00oOOo0(intent);
        if (o00oOOo02 == null) {
            return null;
        }
        ClipDescription description = o00oOOo02.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f9546o00oOoO)) {
            return o00oOOo02.getItemAt(0).getIntent();
        }
        return null;
    }

    @o0OO00OO
    public static Map<String, Uri> o00oOoOo(@oo0oO0 Intent intent, @oo0oO0 String str) {
        return o00oOo00.o00oOo00(intent, str);
    }

    @o0OOooO0(20)
    public static RemoteInput[] o00oOooO(ooo0o[] ooo0oVarArr) {
        if (ooo0oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[ooo0oVarArr.length];
        for (int i = 0; i < ooo0oVarArr.length; i++) {
            remoteInputArr[i] = o00oOOoO.o00oOOoO(ooo0oVarArr[i]);
        }
        return remoteInputArr;
    }

    public static String o00oOooo(String str) {
        return o00oo.o00oOOo0(f9548o00oOoOo, str);
    }

    public static int o00oo0O(@oo0oO0 Intent intent) {
        return o00oOo0O.o00oOOo0(intent);
    }

    @o0OO00OO
    public static Bundle o00oo0O0(@oo0oO0 Intent intent) {
        return o00oOOoO.o00oOooO(intent);
    }

    public static void o00oo0o0(@oo0oO0 Intent intent, int i) {
        o00oOo0O.o00oOOoO(intent, i);
    }

    public boolean o00oOo0o() {
        return this.f9561o00oOooO;
    }

    @o0OO00OO
    public CharSequence[] o00oOoO() {
        return this.f9557o00oOo00;
    }

    @o0OO00OO
    public Set<String> o00oOoO0() {
        return this.f9560o00oOoO0;
    }

    public int o00oOoo0() {
        return this.f9558o00oOo0O;
    }

    @o0OO00OO
    public CharSequence o00oo0() {
        return this.f9556o00oOOoO;
    }

    @oo0oO0
    public Bundle o00oo00O() {
        return this.f9559o00oOo0o;
    }

    @oo0oO0
    public String o00oo0OO() {
        return this.f9555o00oOOo0;
    }

    public boolean o00oo0Oo() {
        CharSequence[] charSequenceArr;
        Set<String> set;
        return (this.f9561o00oOooO || ((charSequenceArr = this.f9557o00oOo00) != null && charSequenceArr.length != 0) || (set = this.f9560o00oOoO0) == null || set.isEmpty()) ? false : true;
    }
}
