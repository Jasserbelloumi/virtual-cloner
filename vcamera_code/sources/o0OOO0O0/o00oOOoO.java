package o0OOO0O0;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o0OO0o.o0O;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOOoO {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX WARN: Incorrect field signature: [TE; */
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> extends o0O0OO implements o0OOOO.o00oOOo0<E[]> {
        public final /* synthetic */ Enum[] $entries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: ([TE;)V */
        public o00oOOo0(Enum[] enumArr) {
            super(0);
            this.$entries = enumArr;
        }

        /* JADX WARN: Incorrect return type in method signature: ()[TE; */
        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Enum[] invoke() {
            return this.$entries;
        }
    }

    @NotNull
    @o0O
    @o0O000
    @o0OO00o0(version = "1.8")
    public static final <E extends Enum<E>> o0OOO0O0.o00oOOo0<E> o00oOOo0(@NotNull o0OOOO.o00oOOo0<E[]> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "entriesProvider");
        return new o00oOo00(o00oooo02);
    }

    @NotNull
    @o0O
    @o0O000
    @o0OO00o0(version = "1.8")
    public static final <E extends Enum<E>> o0OOO0O0.o00oOOo0<E> o00oOOoO(@NotNull E[] eArr) {
        o0ooO.o00oo0O0(eArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        o00oOo00 o00ooo002 = new o00oOo00(new o00oOOo0(eArr));
        o00ooo002.size();
        return o00ooo002;
    }
}
