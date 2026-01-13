package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.o00oOoO;
import androidx.appcompat.widget.o00oOo0O;
import androidx.concurrent.futures.o00oo00O;
import androidx.core.content.FileProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOo000;
import o00oOooO.oo0oO0;
import o0ooOoOO.o0oo0000;
@Deprecated
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f1591o00ooOo = ".image_provider";

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f1592o00ooOo0 = "BrowserServiceFP";

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final String f1593o00ooOoO = "content";

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final String f1594o00ooOoo = "image_provider";

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final String f1595o00ooo0 = ".png";

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final String f1596o00ooo00 = "image_provider_images/";

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final String f1597o00ooo0O = "image_provider_uris";

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final String f1598o00ooo0o = "last_cleanup_time";

    /* renamed from: o00oooO  reason: collision with root package name */
    public static Object f1599o00oooO = new Object();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Uri f1600o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ContentResolver f1601o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00oo00O f1602o00oo0Oo;

        public o00oOOo0(ContentResolver contentResolver, Uri uri, o00oo00O o00oo00o) {
            this.f1601o00oo0O0 = contentResolver;
            this.f1600o00oo0O = uri;
            this.f1602o00oo0Oo = o00oo00o;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f1601o00oo0O0.openFileDescriptor(this.f1600o00oo0O, "r");
                if (openFileDescriptor == null) {
                    this.f1602o00oo0Oo.setException(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.f1602o00oo0Oo.setException(new IOException("File could not be decoded."));
                } else {
                    this.f1602o00oo0Oo.set(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.f1602o00oo0Oo.setException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends AsyncTask<Void, Void, Void> {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final long f1603o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final long f1604o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final long f1605o00oOooO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f1606o00oOOo0;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f1603o00oOOoO = timeUnit.toMillis(7L);
            f1604o00oOo00 = timeUnit.toMillis(7L);
            f1605o00oOooO = timeUnit.toMillis(1L);
        }

        public o00oOOoO(Context context) {
            this.f1606o00oOOo0 = context.getApplicationContext();
        }

        public static boolean o00oOOoO(File file) {
            return file.getName().endsWith("..png");
        }

        public static boolean o00oOo00(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.f1598o00ooo0o, System.currentTimeMillis()) + f1604o00oOo00;
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOo0 */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f1606o00oOOo0.getSharedPreferences(this.f1606o00oOOo0.getPackageName() + BrowserServiceFileProvider.f1591o00ooOo, 0);
            if (o00oOo00(sharedPreferences)) {
                synchronized (BrowserServiceFileProvider.f1599o00oooO) {
                    File file = new File(this.f1606o00oOOo0.getFilesDir(), BrowserServiceFileProvider.f1594o00ooOoo);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        long currentTimeMillis = System.currentTimeMillis() - f1603o00oOOoO;
                        boolean z = true;
                        for (File file2 : listFiles) {
                            if (o00oOOoO(file2) && file2.lastModified() < currentTimeMillis && !file2.delete()) {
                                Objects.toString(file2.getAbsoluteFile());
                                z = false;
                            }
                        }
                        long currentTimeMillis2 = z ? System.currentTimeMillis() : (System.currentTimeMillis() - f1604o00oOo00) + f1605o00oOooO;
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(BrowserServiceFileProvider.f1598o00ooo0o, currentTimeMillis2);
                        edit.apply();
                        return null;
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends AsyncTask<String, Void, Void> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f1607o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f1608o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Bitmap f1609o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final o00oo00O<Uri> f1610o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final Uri f1611o00oOooO;

        public o00oOo00(Context context, String str, Bitmap bitmap, Uri uri, o00oo00O<Uri> o00oo00o) {
            this.f1607o00oOOo0 = context.getApplicationContext();
            this.f1608o00oOOoO = str;
            this.f1609o00oOo00 = bitmap;
            this.f1611o00oOooO = uri;
            this.f1610o00oOo0O = o00oo00o;
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOo0 */
        public Void doInBackground(String... strArr) {
            o00oOooO();
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOoO */
        public void onPostExecute(Void r3) {
            new o00oOOoO(this.f1607o00oOOo0).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        public final void o00oOo00(File file) {
            FileOutputStream fileOutputStream;
            o0oo0000 o0oo0000Var = new o0oo0000(file);
            try {
                fileOutputStream = o0oo0000Var.o00oOoO();
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            }
            try {
                this.f1609o00oOo00.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                o0oo0000Var.o00oOo00(fileOutputStream);
                this.f1610o00oOo0O.set(this.f1611o00oOooO);
            } catch (IOException e2) {
                e = e2;
                o0oo0000Var.o00oOOoO(fileOutputStream);
                this.f1610o00oOo0O.setException(e);
            }
        }

        public final void o00oOooO() {
            File file = new File(this.f1607o00oOOo0.getFilesDir(), BrowserServiceFileProvider.f1594o00ooOoo);
            synchronized (BrowserServiceFileProvider.f1599o00oooO) {
                if (!file.exists() && !file.mkdir()) {
                    this.f1610o00oOo0O.setException(new IOException("Could not create file directory."));
                    return;
                }
                File file2 = new File(file, this.f1608o00oOOoO + BrowserServiceFileProvider.f1595o00ooo0);
                if (file2.exists()) {
                    this.f1610o00oOo0O.set(this.f1611o00oOooO);
                } else {
                    o00oOo00(file2);
                }
                file2.setLastModified(System.currentTimeMillis());
            }
        }
    }

    public static Uri o00oOoOo(Context context, String str) {
        String o00oOOo02 = o00oOoO.o00oOOo0(f1596o00ooo00, str, f1595o00ooo0);
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        return scheme.authority(context.getPackageName() + f1591o00ooOo).path(o00oOOo02).build();
    }

    public static void o00oOoo0(@oo0oO0 Intent intent, @o0OO00OO List<Uri> list, @oo0oO0 Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData newUri = ClipData.newUri(contentResolver, f1597o00ooo0O, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            newUri.addItem(new ClipData.Item(list.get(i)));
        }
        intent.setClipData(newUri);
    }

    @oo0oO0
    public static ListenableFuture<Bitmap> o00oOooo(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri) {
        o00oo00O o00oOOoO2 = o00oo00O.o00oOOoO();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new o00oOOo0(contentResolver, uri, o00oOOoO2));
        return o00oOOoO2;
    }

    @oo0oO0
    @o0OOo000
    public static o00oo00O<Uri> o00oo00O(@oo0oO0 Context context, @oo0oO0 Bitmap bitmap, @oo0oO0 String str, int i) {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str, "_");
        o00oOOo02.append(Integer.toString(i));
        String sb = o00oOOo02.toString();
        Uri o00oOoOo2 = o00oOoOo(context, sb);
        o00oo00O<Uri> o00oOOoO2 = o00oo00O.o00oOOoO();
        new o00oOo00(context, sb, bitmap, o00oOoOo2, o00oOOoO2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return o00oOOoO2;
    }
}
