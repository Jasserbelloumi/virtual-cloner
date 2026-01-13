package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO0o.o00ooO0;
import o0OO0o.o0O0o;
import o0OO0o.o0O0oo0o;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO.o0O000;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOOO.o0O000O;
import o0OOOO.o0OoOoOo;
import o0OOOOO0.o0O0OO;
import o0OOo0OO.o0OOO0O;
import o0OOo0OO.o0OOO0OO;
import o0OOo0OO.o0oo0000;
import o0OOo0OO.ooo0Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a\u0018\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001aF\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aX\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0019\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001cH\u0007\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010!\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001c¢\u0006\u0002\b H\u0007\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020#H\u0007\u001aU\u0010*\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000321\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u0080\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00028\u00012H\b\u0001\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a,\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b:\u00102\u001a,\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001al\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u0086\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010>\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aº\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010K\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010>\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a&\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001a&\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001ag\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000327\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001b\u001ap\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032F\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "o00oo0O0", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lo0OO/o00oo0;", "context", "o00oo0O", "o00ooO0", "o00ooo00", "fallback", "o00oo0Oo", "o00oo0o0", "Lo0OO0o/oO0Ooooo;", "o00ooOo", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "onEach", "o00ooOoO", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O00000;)V", "", "onError", "o00ooOoo", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O00000;Lo0OOOO/o0O00000;)V", "R", "mapper", "o00oOooo", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O00000;)Lo0OOo0OO/o0OO00o;", "Lkotlin/Function1;", "o00oOoO0", "o00oo0OO", "o00oo00O", "Lo0OO0o/o0O000Oo;", "transformer", "o00oOo0o", "", "count", "o00ooOO", "Lo0OO0o/o0O0o00O;", "name", "value", "action", "o00oo0", "initial", "Lkotlin/Function3;", "accumulator", "operation", "o00ooO", "(Lo0OOo0OO/o0OO00o;Ljava/lang/Object;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "o00oo0o", "(Lo0OOo0OO/o0OO00o;Ljava/lang/Object;)Lo0OOo0OO/o0OO00o;", "", "predicate", "o00oo0oO", "(Lo0OOo0OO/o0OO00o;Ljava/lang/Object;Lo0OOOO/o00oo;)Lo0OOo0OO/o0OO00o;", "o00ooOOo", "other", "o00ooOo0", "o00oOoO", "o00oOoOO", "T1", "T2", "transform", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "T3", "other2", "Lkotlin/Function4;", "o00oOo00", "(Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O000;)Lo0OOo0OO/o0OO00o;", "T4", "other3", "Lkotlin/Function5;", "o00oOooO", "(Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O000O;)Lo0OOo0OO/o0OO00o;", "T5", "other4", "Lkotlin/Function6;", "o00oOo0O", "(Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOOO/o0OoOoOo;)Lo0OOo0OO/o0OO00o;", "", "timeMillis", "o00oOoo0", "o00oOoOo", "o00ooo0", "o00ooOO0", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "o00oo", "bufferSize", "o00ooO00", "o00ooO0O", "o00ooO0o", "o00oOOo0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0OOo000 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0 implements o0O00000<T, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ long $timeMillis;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(long j, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$timeMillis = j;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$timeMillis, o00ooo0o2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke2((o00oOOo0<T>) obj, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(t, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                long j = this.$timeMillis;
                this.label = 1;
                if (o0OOo00O.o0OO0O0.o00oOOoO(j, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO0;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> extends o0 implements o0O00000<o0OO0<? super T>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ long $timeMillis;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(long j, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$timeMillis = j;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.$timeMillis, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((o0OO0) ((o0OO0) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OO0<? super T> o0oo0, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0oo0, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                long j = this.$timeMillis;
                this.label = 1;
                if (o0OOo00O.o0OO0O0.o00oOOoO(j, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0O0oo0o(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0O0OO implements o00oo<Throwable, Boolean> {
        public static final o00oOo00 INSTANCE = new o00oOo00();

        public o00oOo00() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO0;", "", "e", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> extends o0 implements o0O0000O<o0OO0<? super T>, Throwable, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ T $fallback;
        public final /* synthetic */ o00oo<Throwable, Boolean> $predicate;
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo0O(o00oo<? super Throwable, Boolean> o00ooVar, T t, o0OO.o00oOo0O<? super o00oOo0O> o00ooo0o2) {
            super(3, o00ooo0o2);
            this.$predicate = o00ooVar;
            this.$fallback = t;
        }

        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((o0OO0) ((o0OO0) obj), th, o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OO0<? super T> o0oo0, @NotNull Throwable th, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            o00oOo0O o00ooo0o3 = new o00oOo0O(this.$predicate, this.$fallback, o00ooo0o2);
            o00ooo0o3.L$0 = o0oo0;
            o00ooo0o3.L$1 = th;
            return o00ooo0o3.invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0OO0 o0oo0 = (o0OO0) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!this.$predicate.invoke(th).booleanValue()) {
                    throw th;
                }
                T t = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (o0oo0.emit(t, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lo0OOo0OO/o0OO0;", "it", "Lo0OO0o/oO0Ooooo;", "o0OOo0OO/o0OOOO0o$o00oOOoO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOoO<R, T> extends o0 implements o0O0000O<o0OO0<? super R>, T, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0O00000 $transform;
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(o0O00000 o0o00000, o0OO.o00oOo0O o00ooo0o2) {
            super(3, o00ooo0o2);
            this.$transform = o0o00000;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O0000O
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke((o0OO0) ((o0OO0) obj), (o0OO0<? super R>) obj2, o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OO0<? super R> o0oo0, T t, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            o00oOoO o00oooo2 = new o00oOoO(this.$transform, o00ooo0o2);
            o00oooo2.L$0 = o0oo0;
            o00oooo2.L$1 = t;
            return o00oooo2.invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO0 o0oo0;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0oo0 = (o0OO0) this.L$0;
                Object obj2 = this.L$1;
                o0O00000 o0o00000 = this.$transform;
                this.L$0 = o0oo0;
                this.label = 1;
                obj = o0o00000.invoke(obj2, this);
                if (obj == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                if (i == 2) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    return o0OO0o.oO0Ooooo.f13240o00oOOo0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0oo0 = (o0OO0) this.L$0;
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (o0OO0o.o00oOoO0(o0oo0, (o0OO00o) obj, this) == o00oooo02) {
                return o00oooo02;
            }
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOOo0(@NotNull o0OO00o<? extends T> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o00oOOoO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> o0OO00o<R> o00oOo00(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0O000<? super T1, ? super T2, ? super T3, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o000) {
        return ooo0Oo0.o00oOooO(o0oo00o, o0oo00o2, o0oo00o3, o0o000);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o0OO00o<R> o00oOo0O(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0OO00o<? extends T5> o0oo00o5, @NotNull o0OoOoOo<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0oooooo) {
        return ooo0Oo0.o00oOo0o(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0oo00o5, o0oooooo);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @o0OO0o.o0OO000(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00oOo0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super o0OO00o<? extends T>, ? extends o0OO00o<? extends R>> o00ooVar) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @o0OO0o.o0OO000(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoO(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00oOoO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo<? super T, ? extends o0OO00o<? extends R>> o00ooVar) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @o0OO0o.o0OO000(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoOO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @o0OO0o.o0OO000(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoOo(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return new o0oo0000.o00oo0(o0oo00o, new o00oOOo0(j, null));
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oOoo0(@NotNull o0OO00o<? extends T> o0oo00o, long j) {
        return new o0OOO0O.o00oOoO(new o00oOOoO(j, null), o0oo00o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @o0OO0o.o0OO000(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> o0OO00o<R> o00oOooO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0OO00o<? extends T3> o0oo00o3, @NotNull o0OO00o<? extends T4> o0oo00o4, @NotNull o0O000O<? super T1, ? super T2, ? super T3, ? super T4, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o000o) {
        return ooo0Oo0.o00oOo0O(o0oo00o, o0oo00o2, o0oo00o3, o0oo00o4, o0o000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00oOooo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo(@NotNull o0OO00o<? extends T> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @o0OO0o.o0OO000(expression = "collect(action)", imports = {}))
    public static final <T> void o00oo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo00O(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> o0OO00o<T> o00oo0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        throw o0OOOO.o00oOOo0();
    }

    @NotNull
    public static final Void o00oo0O0() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @o0OO0o.o0OO000(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0OO(@NotNull o0OO00o<? extends o0OO00o<? extends T>> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0Oo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0o(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0o0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @o0OO0o.o0OO000(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00oo0oO(@NotNull o0OO00o<? extends T> o0oo00o, T t, @NotNull o00oo<? super Throwable, Boolean> o00ooVar) {
        return new o0OOO0OO.o00oOOo0(o0oo00o, new o00oOo0O(o00ooVar, t, null));
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @o0OO0o.o0OO000(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00ooO(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o0OO0o.o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> o0OO00o<T> o00ooO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooO00(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooO0O(@NotNull o0OO00o<? extends T> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @o0OO0o.o0OO000(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooO0o(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @o0OO0o.o0OO000(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooOO(@NotNull o0OO00o<? extends T> o0oo00o, int i) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @o0OO0o.o0OO000(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooOO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super T, ? super T, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o0000o) {
        return new o0oo0000.o00oo0O(o0oo00o, o0o0000o);
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooOOo(@NotNull o0OO00o<? extends T> o0oo00o, T t) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void o00ooOo(@NotNull o0OO00o<? extends T> o0oo00o) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @o0OO0o.o0OO000(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> o0OO00o<T> o00ooOo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0OO00o<? extends T> o0oo00o2) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void o00ooOoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void o00ooOoo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000, @NotNull o0O00000<? super Throwable, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o000002) {
        throw o0OOOO.o00oOOo0();
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @o0OO0o.o0OO000(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> o0OO00o<R> o00ooo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO00o<? extends R>>, ? extends Object> o0o00000) {
        return o0OOOO0o.o00oo0(o0oo00o, new o00oOoO(o0o00000, null));
    }

    @o0O0o(level = o00ooO0.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> o0OO00o<T> o00ooo00(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        throw o0OOOO.o00oOOo0();
    }

    public static o0OO00o o0O0o(o0OO00o o0oo00o, Object obj, o00oo o00ooVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            o00ooVar = o00oOo00.INSTANCE;
        }
        return o00oo0oO(o0oo00o, obj, o00ooVar);
    }
}
