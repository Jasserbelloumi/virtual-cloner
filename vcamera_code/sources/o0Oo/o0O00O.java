package o0Oo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import o0Oo.o00oo;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes3.dex */
public final class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Logger f15463o00oOOo0 = Logger.getLogger(o0O00O.class.getName());

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O0oo0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ OutputStream f15464o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0O0o0 f15465o00oo0O0;

        public o00oOOo0(o0O0O0o0 o0o0o0o0, OutputStream outputStream) {
            this.f15465o00oo0O0 = o0o0o0o0;
            this.f15464o00oo0O = outputStream;
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f15464o00oo0O.close();
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            this.f15464o00oo0O.flush();
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return this.f15465o00oo0O0;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
            while (j > 0) {
                this.f15465o00oo0O0.o00oOoO0();
                o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
                int min = (int) Math.min(j, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
                this.f15464o00oo0O.write(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
                int i = o0o00oo0.f15493o00oOOoO + min;
                o0o00oo0.f15493o00oOOoO = i;
                long j2 = min;
                j -= j2;
                o00ooo.f15434o00oo0O -= j2;
                if (i == o0o00oo0.f15494o00oOo00) {
                    o00ooo.f15435o00oo0O0 = o0o00oo0.o00oOOoO();
                    o0O0O0O.o00oOOo0(o0o00oo0);
                }
            }
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("sink(");
            o00oOOo02.append(this.f15464o00oo0O);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ InputStream f15466o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0O0o0 f15467o00oo0O0;

        public o00oOOoO(o0O0O0o0 o0o0o0o0, InputStream inputStream) {
            this.f15467o00oo0O0 = o0o0o0o0;
            this.f15466o00oo0O = inputStream;
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f15466o00oo0O.close();
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f15467o00oo0O0;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    this.f15467o00oo0O0.o00oOoO0();
                    o0O00oO0 o0O0oOO02 = o00ooo.o0O0oOO0(1);
                    int read = this.f15466o00oo0O.read(o0O0oOO02.f15492o00oOOo0, o0O0oOO02.f15494o00oOo00, (int) Math.min(j, 8192 - o0O0oOO02.f15494o00oOo00));
                    if (read == -1) {
                        return -1L;
                    }
                    o0O0oOO02.f15494o00oOo00 += read;
                    long j2 = read;
                    o00ooo.f15434o00oo0O += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (o0O00O.o00oOo0O(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
            throw new IllegalArgumentException(o0O0OO0.o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }

        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("source(");
            o00oOOo02.append(this.f15466o00oo0O);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements o0O0oo0o {
        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return o0O0O0o0.f15502o00oOooO;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            o00ooo.skip(j);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends o00oo {

        /* renamed from: o00oOooo  reason: collision with root package name */
        public final /* synthetic */ Socket f15468o00oOooo;

        public o00oOo0O(Socket socket) {
            this.f15468o00oOooo = socket;
        }

        @Override // o0Oo.o00oo
        public IOException o00oo0O(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0Oo.o00oo
        public void o0O0o() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Exception exc;
            try {
                this.f15468o00oOooo.close();
            } catch (AssertionError e) {
                if (!o0O00O.o00oOo0O(e)) {
                    throw e;
                }
                Logger logger2 = o0O00O.f15463o00oOOo0;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f15468o00oOooo);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e2) {
                Logger logger3 = o0O00O.f15463o00oOOo0;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f15468o00oOooo);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    public static o0O0oo0o o00oOOo0(File file) throws FileNotFoundException {
        if (file != null) {
            return o00oOoO0(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static o0O0oo0o o00oOOoO() {
        return new o00oOo00();
    }

    public static o0 o00oOo00(o0O0oo0o o0o0oo0o) {
        return new o0oO0Ooo(o0o0oo0o);
    }

    public static boolean o00oOo0O(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static o0O0oo0o o00oOo0o(File file) throws FileNotFoundException {
        if (file != null) {
            return o00oOoO0(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static o0O0oo0o o00oOoO(OutputStream outputStream, o0O0O0o0 o0o0o0o0) {
        if (outputStream != null) {
            if (o0o0o0o0 != null) {
                return new o00oOOo0(o0o0o0o0, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static o0O0oo0o o00oOoO0(OutputStream outputStream) {
        return o00oOoO(outputStream, new o0O0O0o0());
    }

    public static o0O0oo0o o00oOoOO(Socket socket) throws IOException {
        if (socket != null) {
            o00oOo0O o00ooo0o2 = new o00oOo0O(socket);
            return new o00oo.o00oOOo0(o00oOoO(socket.getOutputStream(), o00ooo0o2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    @IgnoreJRERequirement
    public static o0O0oo0o o00oOoOo(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return o00oOoO0(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static o0O0O0Oo o00oOoo0(File file) throws FileNotFoundException {
        if (file != null) {
            return o00oOooo(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static o0O00000 o00oOooO(o0O0O0Oo o0o0o0oo) {
        return new o0O00o00(o0o0o0oo);
    }

    public static o0O0O0Oo o00oOooo(InputStream inputStream) {
        return o00oo00O(inputStream, new o0O0O0o0());
    }

    public static o0O0O0Oo o00oo0(Socket socket) throws IOException {
        if (socket != null) {
            o00oOo0O o00ooo0o2 = new o00oOo0O(socket);
            return new o00oo.o00oOOoO(o00oo00O(socket.getInputStream(), o00ooo0o2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static o0O0O0Oo o00oo00O(InputStream inputStream, o0O0O0o0 o0o0o0o0) {
        if (inputStream != null) {
            if (o0o0o0o0 != null) {
                return new o00oOOoO(o0o0o0o0, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    public static o00oo o00oo0O0(Socket socket) {
        return new o00oOo0O(socket);
    }

    @IgnoreJRERequirement
    public static o0O0O0Oo o00oo0OO(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return o00oOooo(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }
}
