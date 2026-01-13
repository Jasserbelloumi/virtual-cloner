package o0ooOoOO;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lo0OO0o/o0O0o00O;", "name", "out", "Lo0OO0o/oO0Ooooo;", "block", "o00oOooO", "", "array", "o00oOo0O", "", "text", "Ljava/nio/charset/Charset;", "charset", "o00oOo0o", "o00oOOo0", o00oOOoO.f12961o00oOo00, "core-ktx_release"}, k = 2, mv = {1, 7, 1})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class ooo0Oo0 {
    @o0OOooO0(17)
    @NotNull
    public static final byte[] o00oOOo0(@NotNull AtomicFile atomicFile) {
        o0ooO.o00oo0O0(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        o0ooO.o00oo0OO(readFully, "readFully()");
        return readFully;
    }

    @o0OOooO0(17)
    @NotNull
    public static final String o00oOOoO(@NotNull AtomicFile atomicFile, @NotNull Charset charset) {
        o0ooO.o00oo0O0(atomicFile, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        o0ooO.o00oo0OO(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String o00oOo00(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = o0OOOoo0.oO00OOO.f13864o00oOOoO;
        }
        return o00oOOoO(atomicFile, charset);
    }

    @o0OOooO0(17)
    public static final void o00oOo0O(@NotNull AtomicFile atomicFile, @NotNull byte[] bArr) {
        o0ooO.o00oo0O0(atomicFile, "<this>");
        o0ooO.o00oo0O0(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            o0ooO.o00oo0OO(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @o0OOooO0(17)
    public static final void o00oOo0o(@NotNull AtomicFile atomicFile, @NotNull String str, @NotNull Charset charset) {
        o0ooO.o00oo0O0(atomicFile, "<this>");
        o0ooO.o00oo0O0(str, "text");
        o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        o00oOo0O(atomicFile, bytes);
    }

    public static /* synthetic */ void o00oOoO0(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = o0OOOoo0.oO00OOO.f13864o00oOOoO;
        }
        o00oOo0o(atomicFile, str, charset);
    }

    @o0OOooO0(17)
    public static final void o00oOooO(@NotNull AtomicFile atomicFile, @NotNull o00oo<? super FileOutputStream, o0OO0o.oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(atomicFile, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            o0ooO.o00oo0OO(startWrite, "stream");
            o00ooVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }
}
