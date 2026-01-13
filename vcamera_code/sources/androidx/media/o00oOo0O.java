package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.o00oOOoO;
import androidx.media.o00oOoO;
import o00oOooO.o0OOooO0;
@o0OOooO0(28)
/* loaded from: classes.dex */
public class o00oOo0O extends o00oOo00 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public MediaSessionManager f3652o00oOoO;

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o00oOoO.o00oOOo0 {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final MediaSessionManager.RemoteUserInfo f3653o00oOooO;

        public o00oOOo0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.f3653o00oOooO = remoteUserInfo;
        }

        public o00oOOo0(String str, int i, int i2) {
            super(str, i, i2);
            this.f3653o00oOooO = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        public static String o00oOOoO(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }
    }

    public o00oOo0O(Context context) {
        super(context);
        this.f3652o00oOoO = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.o00oOo00, androidx.media.o00oOoO, androidx.media.o00oOOoO.o00oOOo0
    public boolean o00oOOo0(o00oOOoO.o00oOo00 o00ooo002) {
        return super.o00oOOo0(o00ooo002);
    }
}
