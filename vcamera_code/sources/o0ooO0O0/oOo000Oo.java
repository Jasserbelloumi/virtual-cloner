package o0ooO0O0;

import android.content.Context;
import android.support.v4.media.o00oOOoO;
import android.support.v4.media.o00oOo0O;
import android.support.v4.media.o00oOoO;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oOo000Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f17133o00oOOo0 = o00oo.o00oOOo0(new byte[]{-7, 51, -121}, new byte[]{-93, 122, -41, -3, -82, 93, 55, -91});

    public static void o00oOOo0(Context context, String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open(str));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                return;
            }
            String name = nextEntry.getName();
            if (nextEntry.isDirectory()) {
                File file = new File(o00oOOoO.o00oOOo0(o00oOo0O.o00oOOo0(str2), File.separator, name.substring(0, name.length() - 1)));
                if (file.exists()) {
                    return;
                }
                file.mkdirs();
            } else {
                File file2 = new File(o00oOoO.o00oOOo0(str2, File.separator, name));
                file2.delete();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    fileOutputStream.flush();
                }
                fileOutputStream.close();
            }
        }
    }

    public static List<String> o00oOOoO(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            o00oo.o00oOOo0(new byte[]{79, -99, -39, 102, 95}, new byte[]{42, -17, -85, 9, 45, -109, 52, -123});
            o00oo.o00oOOo0(new byte[]{-115, 71, Ascii.VT, -26, -13, -7, Ascii.NAK, Ascii.EM, -1}, new byte[]{106, -18, -79, 1, 104, 87, -16, -92});
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }
}
