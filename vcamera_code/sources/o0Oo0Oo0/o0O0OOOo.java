package o0Oo0Oo0;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public interface o0O0OOOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0OOOo f15871o00oOOo0 = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O0OOOo {
        @Override // o0Oo0Oo0.o0O0OOOo
        public List<InetAddress> o00oOOo0(String str) throws UnknownHostException {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List<InetAddress> o00oOOo0(String str) throws UnknownHostException;
}
