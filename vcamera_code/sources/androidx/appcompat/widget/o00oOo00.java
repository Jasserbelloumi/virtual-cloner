package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.google.android.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oOo00 extends DataSetObservable {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f1039o00oo = 5;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final boolean f1040o00oo0 = false;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f1041o00oo0O = "historical-record";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f1042o00oo0O0 = "historical-records";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f1044o00oo0Oo = "activity";

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f1045o00oo0o = "weight";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f1046o00oo0o0 = "time";

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f1047o00oo0oO = "activity_choser_model_history.xml";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final String f1049o00ooO0 = ".xml";

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final float f1050o00ooO00 = 1.0f;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f1051o00ooO0O = -1;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f1053o0O0o = 50;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final String f1057o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public Intent f1058o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Context f1064o00oOooO;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oo00O f1066o00oo00O;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f1043o00oo0OO = o00oOo00.class.getSimpleName();

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final Object f1052o00ooO0o = new Object();

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final Map<String, o00oOo00> f1048o00ooO = new HashMap();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f1054o00oOOo0 = new Object();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<o00oOOoO> f1055o00oOOoO = new ArrayList();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<o00oOoO> f1056o00oOo00 = new ArrayList();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public InterfaceC0008o00oOo00 f1060o00oOoO0 = new o00oOo0O();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f1059o00oOoO = 50;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f1061o00oOoOO = true;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f1062o00oOoOo = false;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public boolean f1063o00oOoo0 = true;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f1065o00oOooo = false;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void setActivityChooserModel(o00oOo00 o00ooo002);
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements Comparable<o00oOOoO> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public float f1067o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final ResolveInfo f1068o00oo0O0;

        public o00oOOoO(ResolveInfo resolveInfo) {
            this.f1068o00oo0O0 = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && o00oOOoO.class == obj.getClass() && Float.floatToIntBits(this.f1067o00oo0O) == Float.floatToIntBits(((o00oOOoO) obj).f1067o00oo0O);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1067o00oo0O) + 31;
        }

        @Override // java.lang.Comparable
        /* renamed from: o00oOOoO */
        public int compareTo(o00oOOoO o00ooooo2) {
            return Float.floatToIntBits(o00ooooo2.f1067o00oo0O) - Float.floatToIntBits(this.f1067o00oo0O);
        }

        public String toString() {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0("[", "resolveInfo:");
            o00oOOo02.append(this.f1068o00oo0O0.toString());
            o00oOOo02.append("; weight:");
            o00oOOo02.append(new BigDecimal(this.f1067o00oo0O));
            o00oOOo02.append("]");
            return o00oOOo02.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0008o00oOo00 {
        void o00oOOo0(Intent intent, List<o00oOOoO> list, List<o00oOoO> list2);
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O implements InterfaceC0008o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final float f1069o00oOOoO = 0.95f;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Map<ComponentName, o00oOOoO> f1070o00oOOo0 = new HashMap();

        @Override // androidx.appcompat.widget.o00oOo00.InterfaceC0008o00oOo00
        public void o00oOOo0(Intent intent, List<o00oOOoO> list, List<o00oOoO> list2) {
            Map<ComponentName, o00oOOoO> map = this.f1070o00oOOo0;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o00oOOoO o00ooooo2 = list.get(i);
                o00ooooo2.f1067o00oo0O = 0.0f;
                ActivityInfo activityInfo = o00ooooo2.f1068o00oo0O0.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), o00ooooo2);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                o00oOoO o00oooo2 = list2.get(size2);
                o00oOOoO o00ooooo3 = map.get(o00oooo2.f1071o00oOOo0);
                if (o00ooooo3 != null) {
                    o00ooooo3.f1067o00oo0O = (o00oooo2.f1073o00oOo00 * f) + o00ooooo3.f1067o00oo0O;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ComponentName f1071o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final long f1072o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final float f1073o00oOo00;

        public o00oOoO(ComponentName componentName, long j, float f) {
            this.f1071o00oOOo0 = componentName;
            this.f1072o00oOOoO = j;
            this.f1073o00oOo00 = f;
        }

        public o00oOoO(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && o00oOoO.class == obj.getClass()) {
                o00oOoO o00oooo2 = (o00oOoO) obj;
                ComponentName componentName = this.f1071o00oOOo0;
                if (componentName == null) {
                    if (o00oooo2.f1071o00oOOo0 != null) {
                        return false;
                    }
                } else if (!componentName.equals(o00oooo2.f1071o00oOOo0)) {
                    return false;
                }
                return this.f1072o00oOOoO == o00oooo2.f1072o00oOOoO && Float.floatToIntBits(this.f1073o00oOo00) == Float.floatToIntBits(o00oooo2.f1073o00oOo00);
            }
            return false;
        }

        public int hashCode() {
            ComponentName componentName = this.f1071o00oOOo0;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f1072o00oOOoO;
            return Float.floatToIntBits(this.f1073o00oOo00) + ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public String toString() {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0("[", "; activity:");
            o00oOOo02.append(this.f1071o00oOOo0);
            o00oOOo02.append("; time:");
            o00oOOo02.append(this.f1072o00oOOoO);
            o00oOOo02.append("; weight:");
            o00oOOo02.append(new BigDecimal(this.f1073o00oOo00));
            o00oOOo02.append("]");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class o00oo0 extends AsyncTask<Object, Void, Void> {
        public o00oo0() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
            r14.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
            if (r14 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
            if (r14 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
            if (r14 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: o00oOOo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r14) {
            /*
                r13 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                r2 = 0
                r3 = r14[r2]
                java.util.List r3 = (java.util.List) r3
                r4 = 1
                r14 = r14[r4]
                java.lang.String r14 = (java.lang.String) r14
                r5 = 0
                androidx.appcompat.widget.o00oOo00 r6 = androidx.appcompat.widget.o00oOo00.this     // Catch: java.io.FileNotFoundException -> L9d
                android.content.Context r6 = r6.f1064o00oOooO     // Catch: java.io.FileNotFoundException -> L9d
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> L9d
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r7 = r3.size()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r8 = r2
            L2d:
                if (r8 >= r7) goto L5f
                java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.o00oOo00$o00oOoO r9 = (androidx.appcompat.widget.o00oOo00.o00oOoO) r9     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "activity"
                android.content.ComponentName r11 = r9.f1071o00oOOo0     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "time"
                long r11 = r9.f1072o00oOOoO     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "weight"
                float r9 = r9.f1073o00oOo00     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r8 = r8 + 1
                goto L2d
            L5f:
                r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endDocument()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.o00oOo00 r0 = androidx.appcompat.widget.o00oOo00.this
                r0.f1061o00oOoOO = r4
                if (r14 == 0) goto L92
            L6b:
                r14.close()     // Catch: java.io.IOException -> L92
                goto L92
            L6f:
                r0 = move-exception
                goto L93
            L71:
                java.lang.String r0 = androidx.appcompat.widget.o00oOo00.f1043o00oo0OO     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.o00oOo00 r0 = androidx.appcompat.widget.o00oOo00.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1057o00oOo0O     // Catch: java.lang.Throwable -> L6f
                r0.f1061o00oOoOO = r4
                if (r14 == 0) goto L92
                goto L6b
            L7c:
                java.lang.String r0 = androidx.appcompat.widget.o00oOo00.f1043o00oo0OO     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.o00oOo00 r0 = androidx.appcompat.widget.o00oOo00.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1057o00oOo0O     // Catch: java.lang.Throwable -> L6f
                r0.f1061o00oOoOO = r4
                if (r14 == 0) goto L92
                goto L6b
            L87:
                java.lang.String r0 = androidx.appcompat.widget.o00oOo00.f1043o00oo0OO     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.o00oOo00 r0 = androidx.appcompat.widget.o00oOo00.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1057o00oOo0O     // Catch: java.lang.Throwable -> L6f
                r0.f1061o00oOoOO = r4
                if (r14 == 0) goto L92
                goto L6b
            L92:
                return r5
            L93:
                androidx.appcompat.widget.o00oOo00 r1 = androidx.appcompat.widget.o00oOo00.this
                r1.f1061o00oOoOO = r4
                if (r14 == 0) goto L9c
                r14.close()     // Catch: java.io.IOException -> L9c
            L9c:
                throw r0
            L9d:
                java.lang.String r14 = androidx.appcompat.widget.o00oOo00.f1043o00oo0OO
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o00oOo00.o00oo0.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo00O {
        boolean o00oOOo0(o00oOo00 o00ooo002, Intent intent);
    }

    public o00oOo00(Context context, String str) {
        this.f1064o00oOooO = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f1049o00ooO0)) {
            this.f1057o00oOo0O = str;
        } else {
            this.f1057o00oOo0O = o00oOoOo.o00oo.o00oOOo0(str, f1049o00ooO0);
        }
    }

    public static o00oOo00 o00oOooO(Context context, String str) {
        o00oOo00 o00ooo002;
        synchronized (f1052o00ooO0o) {
            Map<String, o00oOo00> map = f1048o00ooO;
            o00ooo002 = map.get(str);
            if (o00ooo002 == null) {
                o00ooo002 = new o00oOo00(context, str);
                map.put(str, o00ooo002);
            }
        }
        return o00ooo002;
    }

    public final boolean o00oOOo0(o00oOoO o00oooo2) {
        boolean add = this.f1056o00oOo00.add(o00oooo2);
        if (add) {
            this.f1063o00oOoo0 = true;
            o00oo0();
            o00oo00O();
            o0O0o();
            notifyChanged();
        }
        return add;
    }

    public Intent o00oOOoO(int i) {
        synchronized (this.f1054o00oOOo0) {
            if (this.f1058o00oOo0o == null) {
                return null;
            }
            o00oOo00();
            ActivityInfo activityInfo = this.f1055o00oOOoO.get(i).f1068o00oo0O0.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1058o00oOo0o);
            intent.setComponent(componentName);
            if (this.f1066o00oo00O != null) {
                if (this.f1066o00oo00O.o00oOOo0(this, new Intent(intent))) {
                    return null;
                }
            }
            o00oOOo0(new o00oOoO(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final void o00oOo00() {
        boolean o00oOooo2 = o00oOooo() | o00oo0OO();
        o00oo0();
        if (o00oOooo2) {
            o0O0o();
            notifyChanged();
        }
    }

    public ResolveInfo o00oOo0O(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            resolveInfo = this.f1055o00oOOoO.get(i).f1068o00oo0O0;
        }
        return resolveInfo;
    }

    public int o00oOo0o() {
        int size;
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            size = this.f1055o00oOOoO.size();
        }
        return size;
    }

    public ResolveInfo o00oOoO() {
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            if (this.f1055o00oOOoO.isEmpty()) {
                return null;
            }
            return this.f1055o00oOOoO.get(0).f1068o00oo0O0;
        }
    }

    public int o00oOoO0(ResolveInfo resolveInfo) {
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            List<o00oOOoO> list = this.f1055o00oOOoO;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1068o00oo0O0 == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int o00oOoOO() {
        int i;
        synchronized (this.f1054o00oOOo0) {
            i = this.f1059o00oOoO;
        }
        return i;
    }

    public int o00oOoOo() {
        int size;
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            size = this.f1056o00oOo00.size();
        }
        return size;
    }

    public Intent o00oOoo0() {
        Intent intent;
        synchronized (this.f1054o00oOOo0) {
            intent = this.f1058o00oOo0o;
        }
        return intent;
    }

    public final boolean o00oOooo() {
        if (!this.f1065o00oOooo || this.f1058o00oOo0o == null) {
            return false;
        }
        this.f1065o00oOooo = false;
        this.f1055o00oOOoO.clear();
        List<ResolveInfo> queryIntentActivities = this.f1064o00oOooO.getPackageManager().queryIntentActivities(this.f1058o00oOo0o, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1055o00oOOoO.add(new o00oOOoO(queryIntentActivities.get(i)));
        }
        return true;
    }

    public final void o00oo0() {
        int size = this.f1056o00oOo00.size() - this.f1059o00oOoO;
        if (size <= 0) {
            return;
        }
        this.f1063o00oOoo0 = true;
        for (int i = 0; i < size; i++) {
            this.f1056o00oOo00.remove(0);
        }
    }

    public final void o00oo00O() {
        if (!this.f1062o00oOoOo) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1063o00oOoo0) {
            this.f1063o00oOoo0 = false;
            if (TextUtils.isEmpty(this.f1057o00oOo0O)) {
                return;
            }
            new o00oo0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1056o00oOo00), this.f1057o00oOo0O);
        }
    }

    public void o00oo0O(InterfaceC0008o00oOo00 interfaceC0008o00oOo00) {
        synchronized (this.f1054o00oOOo0) {
            if (this.f1060o00oOoO0 == interfaceC0008o00oOo00) {
                return;
            }
            this.f1060o00oOoO0 = interfaceC0008o00oOo00;
            if (o0O0o()) {
                notifyChanged();
            }
        }
    }

    public final void o00oo0O0() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f1064o00oOooO.openFileInput(this.f1057o00oOo0O);
            try {
                newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, C.UTF8_NAME);
                for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                }
            } catch (IOException unused) {
                if (openFileInput == null) {
                    return;
                }
            } catch (XmlPullParserException unused2) {
                if (openFileInput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            if (!f1042o00oo0O0.equals(newPullParser.getName())) {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            List<o00oOoO> list = this.f1056o00oOo00;
            list.clear();
            while (true) {
                int next = newPullParser.next();
                if (next == 1) {
                    if (openFileInput == null) {
                        return;
                    }
                } else if (next != 3 && next != 4) {
                    if (!f1041o00oo0O.equals(newPullParser.getName())) {
                        throw new XmlPullParserException("Share records file not well-formed.");
                    }
                    list.add(new o00oOoO(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, f1045o00oo0o))));
                }
            }
            openFileInput.close();
        } catch (FileNotFoundException | IOException unused4) {
        }
    }

    public final boolean o00oo0OO() {
        if (this.f1061o00oOoOO && this.f1063o00oOoo0 && !TextUtils.isEmpty(this.f1057o00oOo0O)) {
            this.f1061o00oOoOO = false;
            this.f1062o00oOoOo = true;
            o00oo0O0();
            return true;
        }
        return false;
    }

    public void o00oo0Oo(int i) {
        synchronized (this.f1054o00oOOo0) {
            o00oOo00();
            o00oOOoO o00ooooo2 = this.f1055o00oOOoO.get(i);
            o00oOOoO o00ooooo3 = this.f1055o00oOOoO.get(0);
            float f = o00ooooo3 != null ? (o00ooooo3.f1067o00oo0O - o00ooooo2.f1067o00oo0O) + 5.0f : 1.0f;
            ActivityInfo activityInfo = o00ooooo2.f1068o00oo0O0.activityInfo;
            o00oOOo0(new o00oOoO(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    public void o00oo0o(Intent intent) {
        synchronized (this.f1054o00oOOo0) {
            if (this.f1058o00oOo0o == intent) {
                return;
            }
            this.f1058o00oOo0o = intent;
            this.f1065o00oOooo = true;
            o00oOo00();
        }
    }

    public void o00oo0o0(int i) {
        synchronized (this.f1054o00oOOo0) {
            if (this.f1059o00oOoO == i) {
                return;
            }
            this.f1059o00oOoO = i;
            o00oo0();
            if (o0O0o()) {
                notifyChanged();
            }
        }
    }

    public void o00oo0oO(o00oo00O o00oo00o) {
        synchronized (this.f1054o00oOOo0) {
            this.f1066o00oo00O = o00oo00o;
        }
    }

    public final boolean o0O0o() {
        if (this.f1060o00oOoO0 == null || this.f1058o00oOo0o == null || this.f1055o00oOOoO.isEmpty() || this.f1056o00oOo00.isEmpty()) {
            return false;
        }
        this.f1060o00oOoO0.o00oOOo0(this.f1058o00oOo0o, this.f1055o00oOOoO, Collections.unmodifiableList(this.f1056o00oOo00));
        return true;
    }
}
