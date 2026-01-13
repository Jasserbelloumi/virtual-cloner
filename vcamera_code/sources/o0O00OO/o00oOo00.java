package o0O00OO;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public class o00oOo00 extends o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public File f10906o00oOo00;

    public o00oOo00(@o0OO00OO o00oOOo0 o00oooo02, File file) {
        super(o00oooo02);
        this.f10906o00oOo00 = file;
    }

    public static boolean o00oo(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= o00oo(file2);
                }
                if (!file2.delete()) {
                    file2.toString();
                    z = false;
                }
            }
        }
        return z;
    }

    public static String o00ooO00(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOo0() {
        return this.f10906o00oOo00.canRead();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOoO() {
        return this.f10906o00oOo00.canWrite();
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public o00oOOo0 o00oOo00(String str) {
        File file = new File(this.f10906o00oOo00, str);
        if (file.isDirectory() || file.mkdir()) {
            return new o00oOo00(this, file);
        }
        return null;
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0O() {
        o00oo(this.f10906o00oOo00);
        return this.f10906o00oOo00.delete();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0o() {
        return this.f10906o00oOo00.exists();
    }

    @Override // o0O00OO.o00oOOo0
    public String o00oOoo0() {
        return this.f10906o00oOo00.getName();
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public o00oOOo0 o00oOooO(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = android.support.v4.media.o00oOoO.o00oOOo0(str2, ".", extensionFromMimeType);
        }
        File file = new File(this.f10906o00oOo00, str2);
        try {
            file.createNewFile();
            return new o00oOo00(this, file);
        } catch (IOException e) {
            e.toString();
            return null;
        }
    }

    @Override // o0O00OO.o00oOOo0
    public Uri o00oo0() {
        return Uri.fromFile(this.f10906o00oOo00);
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public String o00oo00O() {
        if (this.f10906o00oOo00.isDirectory()) {
            return null;
        }
        return o00ooO00(this.f10906o00oOo00.getName());
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0O() {
        return this.f10906o00oOo00.isFile();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0OO() {
        return this.f10906o00oOo00.isDirectory();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0Oo() {
        return false;
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o() {
        return this.f10906o00oOo00.length();
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o0() {
        return this.f10906o00oOo00.lastModified();
    }

    @Override // o0O00OO.o00oOOo0
    public o00oOOo0[] o00oo0oO() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f10906o00oOo00.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new o00oOo00(this, file));
            }
        }
        return (o00oOOo0[]) arrayList.toArray(new o00oOOo0[arrayList.size()]);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o0O0o(String str) {
        File file = new File(this.f10906o00oOo00.getParentFile(), str);
        if (this.f10906o00oOo00.renameTo(file)) {
            this.f10906o00oOo00 = file;
            return true;
        }
        return false;
    }
}
