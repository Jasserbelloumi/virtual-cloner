package o0OOOoO0;

import java.util.Iterator;
import o0OO.o00oOo0O;
import o0OO0o.o00oOOoO;
import o0OO0o.o0OO00o0;
import o0OOO00o.o00oOo00;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class oO0o0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f13836o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f13837o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f13838o00oOo00 = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f13839o00oOo0O = 4;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f13840o00oOo0o = 5;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f13841o00oOooO = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f13842o00oOOo0;

        public o00oOOo0(o0O00000 o0o00000) {
            this.f13842o00oOOo0 = o0o00000;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return oO0o0o.o00oOOo0(this.f13842o00oOOo0);
        }
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> Iterator<T> o00oOOo0(@o00oOOoO @NotNull o0O00000<? super oO000O0O<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "block");
        oO000O0 oo000o0 = new oO000O0();
        oo000o0.f13804o00oo0o0 = o00oOo00.o00oOo00(o0o00000, oo000o0, oo000o0);
        return oo000o0;
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> oO000<T> o00oOOoO(@o00oOOoO @NotNull o0O00000<? super oO000O0O<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "block");
        return new o00oOOo0(o0o00000);
    }
}
