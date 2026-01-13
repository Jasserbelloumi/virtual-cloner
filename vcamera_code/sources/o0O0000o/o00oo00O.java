package o0O0000o;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo00O {

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @o0O0O0Oo
        public static void o00oOOoO(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    public static void o00oOOo0() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int o00oOOoO() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void o00oOo00(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    public static void o00oOo0O(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    public static void o00oOo0o(@oo0oO0 DatagramSocket datagramSocket) throws SocketException {
        o00oOOo0.o00oOOo0(datagramSocket);
    }

    public static void o00oOoO(@oo0oO0 DatagramSocket datagramSocket) throws SocketException {
        o00oOOo0.o00oOOoO(datagramSocket);
    }

    @Deprecated
    public static void o00oOoO0(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    @Deprecated
    public static void o00oOoOO(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }

    @Deprecated
    public static void o00oOooO(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }
}
