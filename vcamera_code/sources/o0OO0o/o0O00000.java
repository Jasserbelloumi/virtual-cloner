package o0OO0o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public class o0O00000 {
    @o0OO00o0(version = "1.1")
    @o0OOO0OO.o00oOoO
    public static final void o00oOOo0(@NotNull Throwable th, @NotNull Throwable th2) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(th2, "exception");
        if (th != th2) {
            o0OOO0OO.o00ooO0.f13445o00oOOo0.o00oOOo0(th, th2);
        }
    }

    @NotNull
    public static final StackTraceElement[] o00oOOoO(@NotNull Throwable th) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        o0OOOOO0.o0ooO.o00oo00O(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void o00oOo00(Throwable th) {
    }

    @o0OO00o0(version = "1.4")
    public static /* synthetic */ void o00oOo0O(Throwable th) {
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOo0o(Throwable th) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        th.printStackTrace();
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoO(Throwable th, PrintWriter printWriter) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @o0OOO0OO.o00oo00O
    public static final void o00oOoO0(Throwable th, PrintStream printStream) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final String o00oOoOO(@NotNull Throwable th) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        o0OOOOO0.o0ooO.o00oo0OO(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    @NotNull
    public static final List<Throwable> o00oOooO(@NotNull Throwable th) {
        o0OOOOO0.o0ooO.o00oo0O0(th, "<this>");
        return o0OOO0OO.o00ooO0.f13445o00oOOo0.o00oOooO(th);
    }
}
