package o0O0OOOo;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o0O00O0o;
import o0O0OOoO.o0;
import o0O0OOoO.o00oo;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOo00 {
    @o0OO00OO
    public static CancellationSignal o00oOOo0() {
        return new CancellationSignal();
    }

    public static void o00oOOoO(o00oo o00ooVar) {
        ArrayList arrayList = new ArrayList();
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (o0O0Oo0o2.moveToNext()) {
            try {
                arrayList.add(o0O0Oo0o2.getString(0));
            } catch (Throwable th) {
                o0O0Oo0o2.close();
                throw th;
            }
        }
        o0O0Oo0o2.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                o00ooVar.o00oo0O0("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @oo0oO0
    @Deprecated
    public static Cursor o00oOo00(o0O00O0o o0o00o0o, o0 o0Var, boolean z) {
        return o00oOooO(o0o00o0o, o0Var, z, null);
    }

    public static int o00oOo0O(@oo0oO0 File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                channel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    @oo0oO0
    public static Cursor o00oOooO(@oo0oO0 o0O00O0o o0o00o0o, @oo0oO0 o0 o0Var, boolean z, @o0OO00OO CancellationSignal cancellationSignal) {
        Cursor o00ooO002 = o0o00o0o.o00ooO00(o0Var, cancellationSignal);
        if (z && (o00ooO002 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) o00ooO002;
            int count = abstractWindowedCursor.getCount();
            return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? o00oOOoO.o00oOOo0(abstractWindowedCursor) : o00ooO002;
        }
        return o00ooO002;
    }
}
