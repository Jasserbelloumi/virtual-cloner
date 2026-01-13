package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Xml;
import androidx.appcompat.app.o0;
import androidx.appcompat.app.o00oo0OO;
import com.google.android.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f353o00oOOo0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f354o00oOOoO = "application_locales";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f355o00oOo00 = "locales";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f356o00oOo0O = "AppLocalesStorageHelper";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final boolean f357o00oOo0o = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f358o00oOooO = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements Executor {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final Executor f361o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public Runnable f362o00oo0o0;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final Object f360o00oo0O0 = new Object();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Queue<Runnable> f359o00oo0O = new ArrayDeque();

        public o00oOOo0(Executor executor) {
            this.f361o00oo0Oo = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o00oOOoO(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                o00oOo00();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f360o00oo0O0) {
                this.f359o00oo0O.add(new Runnable() { // from class: androidx.appcompat.app.o00ooO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0.o00oOOo0.this.o00oOOoO(runnable);
                    }
                });
                if (this.f362o00oo0o0 == null) {
                    o00oOo00();
                }
            }
        }

        public void o00oOo00() {
            synchronized (this.f360o00oo0O0) {
                Runnable poll = this.f359o00oo0O.poll();
                this.f362o00oo0o0 = poll;
                if (poll != null) {
                    this.f361o00oo0Oo.execute(poll);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void o00oOOo0(@oo0oO0 Context context, @oo0oO0 String str) {
        if (str.equals("")) {
            context.deleteFile(f353o00oOOo0);
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(f353o00oOOo0, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument(C.UTF8_NAME, Boolean.TRUE);
                newSerializer.startTag(null, f355o00oOo00);
                newSerializer.attribute(null, f354o00oOOoO, str);
                newSerializer.endTag(null, f355o00oOo00);
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f353o00oOOo0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r1 = r3.getAttributeValue(null, androidx.appcompat.app.o0.f354o00oOOoO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r1.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
        r8.deleteFile(androidx.appcompat.app.o0.f353o00oOOo0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return r1;
     */
    @o00oOooO.oo0oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o00oOOoO(@o00oOooO.oo0oO0 android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L58
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            r6 = 1
            if (r5 == r6) goto L3e
            r6 = 3
            if (r5 != r6) goto L25
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r7 <= r4) goto L3e
        L25:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2b
            goto L15
        L2b:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r5 == 0) goto L15
            r4 = 0
            java.lang.String r5 = "application_locales"
            java.lang.String r1 = r3.getAttributeValue(r4, r5)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L3e:
            if (r2 == 0) goto L4e
        L40:
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L4e
        L44:
            r8 = move-exception
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a
        L4a:
            throw r8
        L4b:
            if (r2 == 0) goto L4e
            goto L40
        L4e:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L55
            goto L58
        L55:
            r8.deleteFile(r0)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.o0.o00oOOoO(android.content.Context):java.lang.String");
    }

    public static void o00oOo00(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f358o00oOooO);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (o00oo0OO.o00oo0Oo().o00oOoOo()) {
                    String o00oOOoO2 = o00oOOoO(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        o00oo0OO.o00oOOoO.o00oOOoO(systemService, o00oo0OO.o00oOOo0.o00oOOo0(o00oOOoO2));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
