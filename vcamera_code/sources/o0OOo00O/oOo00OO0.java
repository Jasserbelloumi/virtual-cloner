package o0OOo00O;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OOOOO0.o0OO0O0;
import o0OOo00O.ooOOOOoo;
import o0OOo0o0.o0OOO0OO;
import o0OOo0oo.oOO0000;
import o0OOo0oo.oOo00o00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004~zÎ\u0001B\u0012\u0012\u0007\u0010Ë\u0001\u001a\u00020\u001b¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010&J\u0019\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0085\u0001\u0010&J\u001c\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0089\u0001\u001a\u00030\u0088\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010hJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u0087\u0001J\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008d\u0001\u0010CJ\u0019\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0092\u0001\u0010\u0080\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0093\u0001\u0010\u0080\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0094\u0001\u0010&J\u001c\u0010\u0095\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0098\u0001\u0010}J\u0011\u0010\u0099\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0099\u0001\u0010}J\u0011\u0010\u009a\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u009a\u0001\u0010}J\u0012\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008e\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u009e\u0001R\u0016\u0010´\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010¶\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010?R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00128DX\u0084\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u009c\u0001R\u0016\u0010»\u0001\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010?R\u0014\u0010¾\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010?R\u001b\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Á\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010?R\u0016\u0010È\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0013\u0010Ê\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ï\u0001"}, d2 = {"Lo0OOo00O/oOo00OO0;", "Lo0OOo00O/ooOOOOoo;", "Lo0OOo00O/o0oO0Ooo;", "Lo0OOo00O/oOOoOOO0;", "Lo0OOo0oo/oOo00o00;", "Lkotlin/Function1;", "", "Lo0OO0o/oO0Ooooo;", "block", "", "o0O0OOoO", "(Lo0OOOO/o00oo;)Ljava/lang/Void;", "Lo0OOo00O/oOo00OO0$o00oOo00;", "state", "proposedUpdate", "o0O00OoO", "(Lo0OOo00O/oOo00OO0$o00oOo00;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "o0O00oO0", "(Lo0OOo00O/oOo00OO0$o00oOo00;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "o0O00000", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lo0OOo00O/oO000O0O;", "update", "", "o0O0o0oo", "(Lo0OOo00O/oO000O0O;Ljava/lang/Object;)Z", "o0O00O0o", "(Lo0OOo00O/oO000O0O;Ljava/lang/Object;)V", "Lo0OOo00O/oO00OOO;", "list", "cause", "o0O0OoO0", "(Lo0OOo00O/oO00OOO;Ljava/lang/Throwable;)V", "o0O00", "(Ljava/lang/Throwable;)Z", "oo0OOoo", "Lo0OOo00O/oO00O0o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "o0O0OoO", "", "o0O0o0Oo", "(Ljava/lang/Object;)I", "Lo0OO0o/o0O0o00O;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "o0O0Oo0O", "(Lo0OOOO/o00oo;Z)Lo0OOo00O/oO00O0o;", "expect", "node", "o0", "(Ljava/lang/Object;Lo0OOo00O/oO00OOO;Lo0OOo00O/oO00O0o;)Z", "Lo0OOo00O/o0OOOO;", "o0O0OooO", "(Lo0OOo00O/o0OOOO;)V", "o0O0o000", "(Lo0OOo00O/oO00O0o;)V", "o0O0OOOo", "()Z", "o0O0OOo", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0ooOoOO", "(Ljava/lang/Object;)Ljava/lang/Object;", "o0O00OO", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "o0O0OOoo", "o0O0O0o0", "(Lo0OOo00O/oO000O0O;)Lo0OOo00O/oO00OOO;", "o0O0oo0O", "(Lo0OOo00O/oO000O0O;Ljava/lang/Throwable;)Z", "oooOO0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "o0O0oO0O", "(Lo0OOo00O/oO000O0O;Ljava/lang/Object;)Ljava/lang/Object;", "Lo0OOo00O/o0O00OOO;", "o0O00Ooo", "(Lo0OOo00O/oO000O0O;)Lo0OOo00O/o0O00OOO;", "child", "o0O0oO0o", "(Lo0OOo00O/oOo00OO0$o00oOo00;Lo0OOo00O/o0O00OOO;Ljava/lang/Object;)Z", "lastChild", "o0O00O", "(Lo0OOo00O/oOo00OO0$o00oOo00;Lo0OOo00O/o0O00OOO;Ljava/lang/Object;)V", "Lo0OOo0o0/o0OOO0OO;", "o0O0Oo", "(Lo0OOo0o0/o0OOO0OO;)Lo0OOo00O/o0O00OOO;", "", "o0O0o0o0", "(Ljava/lang/Object;)Ljava/lang/String;", "o0OoOoOo", "parent", "o0O0OO0O", "(Lo0OOo00O/ooOOOOoo;)V", TtmlNode.START, "o0O0Ooo", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "o00ooOoO", "()Ljava/util/concurrent/CancellationException;", "message", "o0O0o0o", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lo0OOo00O/o0OOO0OO;", "o00oo0", "(Lo0OOOO/o00oo;)Lo0OOo00O/o0OOO0OO;", "invokeImmediately", "o0O0OO0", "(ZZLo0OOOO/o00oo;)Lo0OOo00O/o0OOO0OO;", "o0oO0Ooo", "R", "Lo0OOo0oo/oOO0000;", "select", "Lo0OO/o00oOo0O;", "o0O0o", "(Lo0OOo0oo/oOO0000;Lo0OOOO/o00oo;)V", "o0O0o00O", o0OO000o.o00oOOoO.f12961o00oOo00, "(Ljava/util/concurrent/CancellationException;)V", "o0O00O0", "()Ljava/lang/String;", "o00oOOo0", "o0O000o", "(Ljava/lang/Throwable;)V", "parentJob", "o0O0oOO", "(Lo0OOo00O/oOOoOOO0;)V", "o0OoO00O", "o0O000Oo", "o0OoOoOO", "(Ljava/lang/Object;)Z", "Lo0OOo00O/oO0OOo0o;", "o0O00OOO", "(Ljava/lang/String;Ljava/lang/Throwable;)Lo0OOo00O/oO0OOo0o;", "o0O000oo", "o0OooO0", "o0O0Oo0", "Lo0OOo00O/o0O00OO;", "o00oooOo", "(Lo0OOo00O/o0oO0Ooo;)Lo0OOo00O/o0O00OO;", "exception", "o0ooO", "o0O0OoOo", "o0O0O0oo", "o0O0Ooo0", "(Ljava/lang/Object;)V", "o0O0000O", "toString", "o0O0o0oO", "o0O0Oo0o", "o00ooO0o", "()Ljava/lang/Throwable;", "o0O00o00", "()Ljava/lang/Object;", "o0O0000o", "Lkotlin/Function2;", "o0O0o00", "(Lo0OOo0oo/oOO0000;Lo0OOOO/o0O00000;)V", "o0O0o0", "o0O00o", "exceptionOrNull", "o0O0OO", "(Lo0OOo00O/oO000O0O;)Z", "isCancelling", "Lo0OO/o00oo0$o00oOo00;", "getKey", "()Lo0OO/o00oo0$o00oOo00;", "key", "value", "o0O0O0o", "()Lo0OOo00O/o0O00OO;", "o0O0o0OO", "(Lo0OOo00O/o0O00OO;)V", "parentHandle", "o0O0O0oO", "isActive", "o00oOoO0", "isCompleted", "isCancelled", "o0O00o0O", "completionCause", "o0O00o0o", "completionCauseHandled", "o0O0o0O", "()Lo0OOo0oo/oOo00o00;", "onJoin", "o0O0oo0o", "onCancelComplete", "Lo0OOOoO0/oO000;", "o00ooO00", "()Lo0OOOoO0/oO000;", "children", "o0O0OOO", "isScopedCoroutine", "o0O0O0O", "handlesException", "o0O0OOO0", "isCompletedExceptionally", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Z)V", "o00oOo00", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes3.dex */
public class oOo00OO0 implements ooOOOOoo, o0oO0Ooo, oOOoOOO0, oOo00o00 {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14113o00oo0O0 = AtomicReferenceFieldUpdater.newUpdater(oOo00OO0.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ Object _parentHandle;
    @NotNull
    private volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lo0OOo00O/oOo00OO0$o00oOOo0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O00;", "Lo0OOo00O/ooOOOOoo;", "parent", "", "o00oo", "", "o00ooOo0", "Lo0OOo00O/oOo00OO0;", "o00ooO00", "Lo0OOo00O/oOo00OO0;", "job", "Lo0OO/o00oOo0O;", "delegate", "<init>", "(Lo0OO/o00oOo0O;Lo0OOo00O/oOo00OO0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> extends o0O00<T> {
        @NotNull

        /* renamed from: o00ooO00  reason: collision with root package name */
        public final oOo00OO0 f14114o00ooO00;

        public o00oOOo0(@NotNull o0OO.o00oOo0O<? super T> o00ooo0o2, @NotNull oOo00OO0 ooo00oo0) {
            super(o00ooo0o2, 1);
            this.f14114o00ooO00 = ooo00oo0;
        }

        @Override // o0OOo00O.o0O00
        @NotNull
        public Throwable o00oo(@NotNull ooOOOOoo oooooooo) {
            Throwable o00oOooO2;
            Object o0O0O0oO2 = this.f14114o00ooO00.o0O0O0oO();
            return (!(o0O0O0oO2 instanceof o00oOo00) || (o00oOooO2 = ((o00oOo00) o0O0O0oO2).o00oOooO()) == null) ? o0O0O0oO2 instanceof o0O0O0Oo ? ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0 : oooooooo.o00ooOoO() : o00oOooO2;
        }

        @Override // o0OOo00O.o0O00
        @NotNull
        public String o00ooOo0() {
            return "AwaitContinuation";
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo0OOo00O/oOo00OO0$o00oOOoO;", "Lo0OOo00O/oO00O0o;", "", "cause", "Lo0OO0o/oO0Ooooo;", "o0O00", "Lo0OOo00O/oOo00OO0;", "o00oo0o", "Lo0OOo00O/oOo00OO0;", "parent", "Lo0OOo00O/oOo00OO0$o00oOo00;", "o00oo0oO", "Lo0OOo00O/oOo00OO0$o00oOo00;", "state", "Lo0OOo00O/o0O00OOO;", "o0O0o", "Lo0OOo00O/o0O00OOO;", "child", "", "o00oo", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lo0OOo00O/oOo00OO0;Lo0OOo00O/oOo00OO0$o00oOo00;Lo0OOo00O/o0O00OOO;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends oO00O0o {
        @Nullable

        /* renamed from: o00oo  reason: collision with root package name */
        public final Object f14115o00oo;
        @NotNull

        /* renamed from: o00oo0o  reason: collision with root package name */
        public final oOo00OO0 f14116o00oo0o;
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public final o00oOo00 f14117o00oo0oO;
        @NotNull

        /* renamed from: o0O0o  reason: collision with root package name */
        public final o0O00OOO f14118o0O0o;

        public o00oOOoO(@NotNull oOo00OO0 ooo00oo0, @NotNull o00oOo00 o00ooo002, @NotNull o0O00OOO o0o00ooo, @Nullable Object obj) {
            this.f14116o00oo0o = ooo00oo0;
            this.f14117o00oo0oO = o00ooo002;
            this.f14118o0O0o = o0o00ooo;
            this.f14115o00oo = obj;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ o0OO0o.oO0Ooooo invoke(Throwable th) {
            o0O00(th);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Override // o0OOo00O.o0ooO
        public void o0O00(@Nullable Throwable th) {
            this.f14116o00oo0o.o0O00O(this.f14117o00oo0oO, this.f14118o0O0o, this.f14115o00oo);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010&\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010)\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lo0OOo00O/oOo00OO0$o00oOo00;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lo0OOo00O/oO000O0O;", "", "proposedException", "", "o00oOoO", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", o0OO000o.o00oOOoO.f12961o00oOo00, "()Ljava/util/ArrayList;", "Lo0OOo00O/oO00OOO;", "o00oo0O0", "Lo0OOo00O/oO00OOO;", "o00oOoo0", "()Lo0OOo00O/oO00OOO;", "list", "", "value", "o00oOo0o", "()Z", "o00oOoOO", "(Z)V", "isCompleting", "o00oOooO", "()Ljava/lang/Throwable;", "o00oOooo", "rootCause", "o00oOoO0", "isSealed", "o00oOo0O", "isCancelling", "isActive", "o00oOo00", "()Ljava/lang/Object;", "o00oOoOo", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(Lo0OOo00O/oO00OOO;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 implements oO000O0O {
        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @NotNull
        private volatile /* synthetic */ int _isCompleting;
        @NotNull
        private volatile /* synthetic */ Object _rootCause;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final oO00OOO f14119o00oo0O0;

        public o00oOo00(@NotNull oO00OOO oo00ooo, boolean z, @Nullable Throwable th) {
            this.f14119o00oo0O0 = oo00ooo;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // o0OOo00O.oO000O0O
        public boolean isActive() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void o00oOOo0(@NotNull Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r0 = this._exceptionsHolder;
                if (r0 == 0) {
                    this._exceptionsHolder = th;
                } else if (!(r0 instanceof Throwable)) {
                    if (!(r0 instanceof ArrayList)) {
                        throw new IllegalStateException(o0O000o0.o00oOOo0("State is ", r0));
                    }
                    ((ArrayList) r0).add(th);
                } else if (th == r0) {
                } else {
                    ArrayList<Throwable> o00oOOoO2 = o00oOOoO();
                    o00oOOoO2.add(r0);
                    o00oOOoO2.add(th);
                    this._exceptionsHolder = o00oOOoO2;
                }
            }
        }

        public final ArrayList<Throwable> o00oOOoO() {
            return new ArrayList<>(4);
        }

        public final Object o00oOo00() {
            return this._exceptionsHolder;
        }

        public final boolean o00oOo0O() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean o00oOo0o() {
            return this._isCompleting;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        @NotNull
        public final List<Throwable> o00oOoO(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            ?? r0 = this._exceptionsHolder;
            if (r0 == 0) {
                arrayList = o00oOOoO();
            } else if (r0 instanceof Throwable) {
                ArrayList<Throwable> o00oOOoO2 = o00oOOoO();
                o00oOOoO2.add(r0);
                arrayList = o00oOOoO2;
            } else if (!(r0 instanceof ArrayList)) {
                throw new IllegalStateException(o0O000o0.o00oOOo0("State is ", r0));
            } else {
                arrayList = (ArrayList) r0;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !o0OOOOO0.o0ooO.o00oOoO0(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = oO00O0oO.o00oOo0O();
            return arrayList;
        }

        public final boolean o00oOoO0() {
            return this._exceptionsHolder == oO00O0oO.o00oOo0O();
        }

        public final void o00oOoOO(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void o00oOoOo(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // o0OOo00O.oO000O0O
        @NotNull
        public oO00OOO o00oOoo0() {
            return this.f14119o00oo0O0;
        }

        @Nullable
        public final Throwable o00oOooO() {
            return (Throwable) this._rootCause;
        }

        public final void o00oOooo(@Nullable Throwable th) {
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Finishing[cancelling=");
            o00oOOo02.append(o00oOo0O());
            o00oOOo02.append(", completing=");
            o00oOOo02.append((boolean) this._isCompleting);
            o00oOOo02.append(", rootCause=");
            o00oOOo02.append((Throwable) this._rootCause);
            o00oOOo02.append(", exceptions=");
            o00oOOo02.append(this._exceptionsHolder);
            o00oOOo02.append(", list=");
            o00oOOo02.append(this.f14119o00oo0O0);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0o0/o0OOO0OO$o00oo00O", "Lo0OOo0o0/o0OOO0OO$o00oOo00;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "o00oOoo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OOO0OO.o00oOo00 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ Object f14120o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ oOo00OO0 f14121o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(o0OOo0o0.o0OOO0OO o0ooo0oo, oOo00OO0 ooo00oo0, Object obj) {
            super(o0ooo0oo);
            this.f14121o00oOooO = ooo00oo0;
            this.f14120o00oOo0O = obj;
        }

        @Override // o0OOo0o0.o0O0oo00
        @Nullable
        /* renamed from: o00oOoo0 */
        public Object o00oOoOO(@NotNull o0OOo0o0.o0OOO0OO o0ooo0oo) {
            if (this.f14121o00oOooO.o0O0O0oO() == this.f14120o00oOo0O) {
                return null;
            }
            return o0OOo0o0.o0OOO0O.o00oOOo0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo0OOOoO0/oO000O0O;", "Lo0OOo00O/ooOOOOoo;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0OOO0.o0O0o implements o0OOOO.o0O00000<o0OOOoO0.oO000O0O<? super ooOOOOoo>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public o00oOoO(o0OO.o00oOo0O<? super o00oOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOoO o00oooo2 = new o00oOoO(o00ooo0o2);
            o00oooo2.L$0 = obj;
            return o00oooo2;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOOoO0.oO000O0O<? super ooOOOOoo> oo000o0o, @Nullable o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOoO) create(oo000o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:27:0x007c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.L$2
                o0OOo0o0.o0OOO0OO r1 = (o0OOo0o0.o0OOO0OO) r1
                java.lang.Object r3 = r7.L$1
                o0OOo0o0.o0OOO0 r3 = (o0OOo0o0.o0OOO0) r3
                java.lang.Object r4 = r7.L$0
                o0OOOoO0.oO000O0O r4 = (o0OOOoO0.oO000O0O) r4
                o0OO0o.oo0ooO.o00oo0(r8)
                r8 = r7
                goto L7c
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L81
            L29:
                o0OO0o.oo0ooO.o00oo0(r8)
                java.lang.Object r8 = r7.L$0
                o0OOOoO0.oO000O0O r8 = (o0OOOoO0.oO000O0O) r8
                o0OOo00O.oOo00OO0 r1 = o0OOo00O.oOo00OO0.this
                java.lang.Object r1 = r1.o0O0O0oO()
                boolean r4 = r1 instanceof o0OOo00O.o0O00OOO
                if (r4 == 0) goto L47
                o0OOo00O.o0O00OOO r1 = (o0OOo00O.o0O00OOO) r1
                o0OOo00O.o0oO0Ooo r1 = r1.f14005o00oo0o
                r7.label = r3
                java.lang.Object r8 = r8.o00oOOoO(r1, r7)
                if (r8 != r0) goto L81
                return r0
            L47:
                boolean r3 = r1 instanceof o0OOo00O.oO000O0O
                if (r3 == 0) goto L81
                o0OOo00O.oO000O0O r1 = (o0OOo00O.oO000O0O) r1
                o0OOo00O.oO00OOO r1 = r1.o00oOoo0()
                if (r1 == 0) goto L81
                java.lang.Object r3 = r1.o00ooooO()
                o0OOo0o0.o0OOO0OO r3 = (o0OOo0o0.o0OOO0OO) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L5e:
                boolean r5 = o0OOOOO0.o0ooO.o00oOoO0(r1, r3)
                if (r5 != 0) goto L81
                boolean r5 = r1 instanceof o0OOo00O.o0O00OOO
                if (r5 == 0) goto L7c
                r5 = r1
                o0OOo00O.o0O00OOO r5 = (o0OOo00O.o0O00OOO) r5
                o0OOo00O.o0oO0Ooo r5 = r5.f14005o00oo0o
                r8.L$0 = r4
                r8.L$1 = r3
                r8.L$2 = r1
                r8.label = r2
                java.lang.Object r5 = r4.o00oOOoO(r5, r8)
                if (r5 != r0) goto L7c
                return r0
            L7c:
                o0OOo0o0.o0OOO0OO r1 = r1.o00ooooo()
                goto L5e
            L81:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.oOo00OO0.o00oOoO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public oOo00OO0(boolean z) {
        this._state = z ? oO00O0oO.o00oOo00() : oO00O0oO.o00oOooO();
        this._parentHandle = null;
    }

    public static /* synthetic */ oO0OOo0o o0O00Oo(oOo00OO0 ooo00oo0, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = ooo00oo0.o0O00O0();
            }
            return new oO0OOo0o(str, th, ooo00oo0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final <T extends oO00O0o> void o0O0OoO(oO00OOO oo00ooo, Throwable th) {
        o0O0OO0 o0o0oo0 = null;
        for (o0OOo0o0.o0OOO0OO o0ooo0oo = (o0OOo0o0.o0OOO0OO) oo00ooo.o00ooooO(); !o0OOOOO0.o0ooO.o00oOoO0(o0ooo0oo, oo00ooo); o0ooo0oo = o0ooo0oo.o00ooooo()) {
            o0OOOOO0.o0ooO.o00oooOo();
            if (o0ooo0oo instanceof o0OOo0o0.o0OOO0OO) {
                oO00O0o oo00o0o = (oO00O0o) o0ooo0oo;
                try {
                    oo00o0o.o0O00(th);
                } catch (Throwable th2) {
                    if (o0o0oo0 != null) {
                        o0OO0o.o0O00000.o00oOOo0(o0o0oo0, th2);
                    } else {
                        o0o0oo0 = new o0O0OO0("Exception in completion handler " + oo00o0o + " for " + this, th2);
                        o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                    }
                }
            }
        }
        if (o0o0oo0 != null) {
            o0ooO(o0o0oo0);
        }
    }

    public static /* synthetic */ CancellationException o0oOo0O0(oOo00OO0 ooo00oo0, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return ooo00oo0.o0O0o0o(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    @Override // o0OOo00O.ooOOOOoo
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        o00oOOoO(null);
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    public <R> R fold(R r, @NotNull o0OOOO.o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
        return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(this, r, o0o00000);
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @Nullable
    public <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002) {
        return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(this, o00ooo002);
    }

    @Override // o0OO.o00oo0.o00oOOoO
    @NotNull
    public final o00oo0.o00oOo00<?> getKey() {
        return ooOOOOoo.f14136o00oOoO;
    }

    @Override // o0OOo00O.ooOOOOoo
    public boolean isActive() {
        Object o0O0O0oO2 = o0O0O0oO();
        return (o0O0O0oO2 instanceof oO000O0O) && ((oO000O0O) o0O0O0oO2).isActive();
    }

    @Override // o0OOo00O.ooOOOOoo
    public final boolean isCancelled() {
        Object o0O0O0oO2 = o0O0O0oO();
        return (o0O0O0oO2 instanceof o0O0O0Oo) || ((o0O0O0oO2 instanceof o00oOo00) && ((o00oOo00) o0O0O0oO2).o00oOo0O());
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @NotNull
    public o0OO.o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002) {
        return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(this, o00ooo002);
    }

    public final boolean o0(Object obj, oO00OOO oo00ooo, oO00O0o oo00o0o) {
        int o0ooOoOO2;
        o00oOo0O o00ooo0o2 = new o00oOo0O(oo00o0o, this, obj);
        do {
            o0ooOoOO2 = oo00ooo.o0().o0ooOoOO(oo00o0o, oo00ooo, o00ooo0o2);
            if (o0ooOoOO2 == 1) {
                return true;
            }
        } while (o0ooOoOO2 != 2);
        return false;
    }

    @Override // o0OOo00O.ooOOOOoo
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean o00oOOo0(Throwable th) {
        Throwable oo0ooo0o;
        if (th == null || (oo0ooo0o = o0oOo0O0(this, th, null, 1, null)) == null) {
            oo0ooo0o = new oO0OOo0o(o0O00O0(), null, this);
        }
        o0O000o(oo0ooo0o);
        return true;
    }

    @Override // o0OOo00O.ooOOOOoo
    public void o00oOOoO(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new oO0OOo0o(o0O00O0(), null, this);
        }
        o0O000o(cancellationException);
    }

    @Override // o0OOo00O.ooOOOOoo
    public final boolean o00oOoO0() {
        return !(o0O0O0oO() instanceof oO000O0O);
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final o0OOO0OO o00oo0(@NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        return o0O0OO0(false, true, o00ooVar);
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final o0OOOoO0.oO000<ooOOOOoo> o00ooO00() {
        return o0OOOoO0.oO0o0o.o00oOOoO(new o00oOoO(null));
    }

    @Override // o0OOo00O.ooOOOOoo
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public ooOOOOoo o00ooO0O(@NotNull ooOOOOoo oooooooo) {
        return oooooooo;
    }

    @Nullable
    public final Throwable o00ooO0o() {
        Object o0O0O0oO2 = o0O0O0oO();
        if (!(o0O0O0oO2 instanceof oO000O0O)) {
            return o0O00o(o0O0O0oO2);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final CancellationException o00ooOoO() {
        Object o0O0O0oO2 = o0O0O0oO();
        if (!(o0O0O0oO2 instanceof o00oOo00)) {
            if (o0O0O0oO2 instanceof oO000O0O) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (o0O0O0oO2 instanceof o0O0O0Oo) {
                return o0oOo0O0(this, ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0, null, 1, null);
            } else {
                return new oO0OOo0o(oo0ooO.o00oOOo0(this) + " has completed normally", null, this);
            }
        }
        Throwable o00oOooO2 = ((o00oOo00) o0O0O0oO2).o00oOooO();
        if (o00oOooO2 != null) {
            CancellationException o0O0o0o2 = o0O0o0o(o00oOooO2, oo0ooO.o00oOOo0(this) + " is cancelling");
            if (o0O0o0o2 != null) {
                return o0O0o0o2;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final o0O00OO o00oooOo(@NotNull o0oO0Ooo o0oo0ooo) {
        return (o0O00OO) ooOOOOoo.o00oOOo0.o00oOo0o(this, true, false, new o0O00OOO(o0oo0ooo), 2, null);
    }

    public final boolean o0O00(Throwable th) {
        if (o0O0OOO()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        o0O00OO o0O0O0o2 = o0O0O0o();
        return (o0O0O0o2 == null || o0O0O0o2 == oO00OOo0.f14087o00oo0O0) ? z : o0O0O0o2.o00oOoO(th) || z;
    }

    public final void o0O00000(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                o0OO0o.o0O00000.o00oOOo0(th, th2);
            }
        }
    }

    public void o0O0000O(@Nullable Object obj) {
    }

    @Nullable
    public final Object o0O0000o(@NotNull o0OO.o00oOo0O<Object> o00ooo0o2) {
        Object o0O0O0oO2;
        do {
            o0O0O0oO2 = o0O0O0oO();
            if (!(o0O0O0oO2 instanceof oO000O0O)) {
                if (o0O0O0oO2 instanceof o0O0O0Oo) {
                    throw ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0;
                }
                return oO00O0oO.o00oo0OO(o0O0O0oO2);
            }
        } while (o0O0o0Oo(o0O0O0oO2) < 0);
        return o0OoOoOo(o00ooo0o2);
    }

    public final boolean o0O000Oo(@Nullable Throwable th) {
        return o0OoOoOO(th);
    }

    public void o0O000o(@NotNull Throwable th) {
        o0OoOoOO(th);
    }

    @Override // o0OOo00O.oOOoOOO0
    @NotNull
    public CancellationException o0O000oo() {
        Throwable th;
        Object o0O0O0oO2 = o0O0O0oO();
        if (o0O0O0oO2 instanceof o00oOo00) {
            th = ((o00oOo00) o0O0O0oO2).o00oOooO();
        } else if (o0O0O0oO2 instanceof o0O0O0Oo) {
            th = ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0;
        } else if (o0O0O0oO2 instanceof oO000O0O) {
            throw new IllegalStateException(o0O000o0.o00oOOo0("Cannot be cancelling child in this state: ", o0O0O0oO2));
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Parent job is ");
            o00oOOo02.append(o0O0o0o0(o0O0O0oO2));
            return new oO0OOo0o(o00oOOo02.toString(), th, this);
        }
        return cancellationException;
    }

    public final void o0O00O(o00oOo00 o00ooo002, o0O00OOO o0o00ooo, Object obj) {
        o0O00OOO o0O0Oo2 = o0O0Oo(o0o00ooo);
        if (o0O0Oo2 == null || !o0O0oO0o(o00ooo002, o0O0Oo2, obj)) {
            o0O0000O(o0O00OoO(o00ooo002, obj));
        }
    }

    @NotNull
    public String o0O00O0() {
        return "Job was cancelled";
    }

    public final void o0O00O0o(oO000O0O oo000o0o, Object obj) {
        o0O00OO o0O0O0o2 = o0O0O0o();
        if (o0O0O0o2 != null) {
            o0O0O0o2.o00oOOoO();
            o0O0o0OO(oO00OOo0.f14087o00oo0O0);
        }
        o0O0O0Oo o0o0o0oo = obj instanceof o0O0O0Oo ? (o0O0O0Oo) obj : null;
        Throwable th = o0o0o0oo != null ? o0o0o0oo.f14007o00oOOo0 : null;
        if (!(oo000o0o instanceof oO00O0o)) {
            oO00OOO o00oOoo02 = oo000o0o.o00oOoo0();
            if (o00oOoo02 != null) {
                oo0OOoo(o00oOoo02, th);
                return;
            }
            return;
        }
        try {
            ((oO00O0o) oo000o0o).o0O00(th);
        } catch (Throwable th2) {
            o0ooO(new o0O0OO0("Exception in completion handler " + oo000o0o + " for " + this, th2));
        }
    }

    public final Throwable o0O00OO(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new oO0OOo0o(o0O00O0(), null, this) : th;
        } else if (obj != null) {
            return ((oOOoOOO0) obj).o0O000oo();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    @NotNull
    public final oO0OOo0o o0O00OOO(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = o0O00O0();
        }
        return new oO0OOo0o(str, th, this);
    }

    public final Object o0O00OoO(o00oOo00 o00ooo002, Object obj) {
        boolean o00oOo0O2;
        Throwable o0O00oO02;
        o0O0O0Oo o0o0o0oo = obj instanceof o0O0O0Oo ? (o0O0O0Oo) obj : null;
        Throwable th = o0o0o0oo != null ? o0o0o0oo.f14007o00oOOo0 : null;
        synchronized (o00ooo002) {
            o00oOo0O2 = o00ooo002.o00oOo0O();
            List<Throwable> o00oOoO2 = o00ooo002.o00oOoO(th);
            o0O00oO02 = o0O00oO0(o00ooo002, o00oOoO2);
            if (o0O00oO02 != null) {
                o0O00000(o0O00oO02, o00oOoO2);
            }
        }
        boolean z = false;
        if (o0O00oO02 != null && o0O00oO02 != th) {
            obj = new o0O0O0Oo(o0O00oO02, false, 2, null);
        }
        if (o0O00oO02 != null) {
            if ((o0O00(o0O00oO02) || o0O0O0oo(o0O00oO02)) ? true : true) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((o0O0O0Oo) obj).o00oOOoO();
            }
        }
        if (!o00oOo0O2) {
            o0O0OoOo(o0O00oO02);
        }
        o0O0Ooo0(obj);
        androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, o00ooo002, oO00O0oO.o00oOoO0(obj));
        o0O00O0o(o00ooo002, obj);
        return obj;
    }

    public final o0O00OOO o0O00Ooo(oO000O0O oo000o0o) {
        o0O00OOO o0o00ooo = oo000o0o instanceof o0O00OOO ? (o0O00OOO) oo000o0o : null;
        if (o0o00ooo == null) {
            oO00OOO o00oOoo02 = oo000o0o.o00oOoo0();
            if (o00oOoo02 != null) {
                return o0O0Oo(o00oOoo02);
            }
            return null;
        }
        return o0o00ooo;
    }

    public final Throwable o0O00o(Object obj) {
        o0O0O0Oo o0o0o0oo = obj instanceof o0O0O0Oo ? (o0O0O0Oo) obj : null;
        if (o0o0o0oo != null) {
            return o0o0o0oo.f14007o00oOOo0;
        }
        return null;
    }

    @Nullable
    public final Object o0O00o00() {
        Object o0O0O0oO2 = o0O0O0oO();
        if (!(o0O0O0oO2 instanceof oO000O0O)) {
            if (o0O0O0oO2 instanceof o0O0O0Oo) {
                throw ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0;
            }
            return oO00O0oO.o00oo0OO(o0O0O0oO2);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Nullable
    public final Throwable o0O00o0O() {
        Object o0O0O0oO2 = o0O0O0oO();
        if (o0O0O0oO2 instanceof o00oOo00) {
            Throwable o00oOooO2 = ((o00oOo00) o0O0O0oO2).o00oOooO();
            if (o00oOooO2 != null) {
                return o00oOooO2;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(o0O0O0oO2 instanceof oO000O0O)) {
            if (o0O0O0oO2 instanceof o0O0O0Oo) {
                return ((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0;
            }
            return null;
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean o0O00o0o() {
        Object o0O0O0oO2 = o0O0O0oO();
        return (o0O0O0oO2 instanceof o0O0O0Oo) && ((o0O0O0Oo) o0O0O0oO2).o00oOOo0();
    }

    public final Throwable o0O00oO0(o00oOo00 o00ooo002, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (o00ooo002.o00oOo0O()) {
                return new oO0OOo0o(o0O00O0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof oOoo0) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof oOoo0)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean o0O0O0O() {
        return true;
    }

    @Nullable
    public final o0O00OO o0O0O0o() {
        return (o0O00OO) this._parentHandle;
    }

    public final oO00OOO o0O0O0o0(oO000O0O oo000o0o) {
        oO00OOO o00oOoo02 = oo000o0o.o00oOoo0();
        if (o00oOoo02 == null) {
            if (oo000o0o instanceof o0OOOO) {
                return new oO00OOO();
            }
            if (oo000o0o instanceof oO00O0o) {
                o0O0o000((oO00O0o) oo000o0o);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + oo000o0o).toString());
        }
        return o00oOoo02;
    }

    @Nullable
    public final Object o0O0O0oO() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof o0OOo0o0.oO00000o)) {
                return obj;
            }
            ((o0OOo0o0.oO00000o) obj).o00oOo00(this);
        }
    }

    public boolean o0O0O0oo(@NotNull Throwable th) {
        return false;
    }

    public final boolean o0O0OO(oO000O0O oo000o0o) {
        return (oo000o0o instanceof o00oOo00) && ((o00oOo00) oo000o0o).o00oOo0O();
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final o0OOO0OO o0O0OO0(boolean z, boolean z2, @NotNull o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar) {
        oO00O0o o0O0Oo0O2 = o0O0Oo0O(o00ooVar, z);
        while (true) {
            Object o0O0O0oO2 = o0O0O0oO();
            if (o0O0O0oO2 instanceof o0OOOO) {
                o0OOOO o0oooo = (o0OOOO) o0O0O0oO2;
                if (!o0oooo.f14046o00oo0O0) {
                    o0O0OooO(o0oooo);
                } else if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, o0O0O0oO2, o0O0Oo0O2)) {
                    return o0O0Oo0O2;
                }
            } else {
                if (!(o0O0O0oO2 instanceof oO000O0O)) {
                    if (z2) {
                        o0O0O0Oo o0o0o0oo = o0O0O0oO2 instanceof o0O0O0Oo ? (o0O0O0Oo) o0O0O0oO2 : null;
                        o00ooVar.invoke(o0o0o0oo != null ? o0o0o0oo.f14007o00oOOo0 : null);
                    }
                    return oO00OOo0.f14087o00oo0O0;
                }
                oO00OOO o00oOoo02 = ((oO000O0O) o0O0O0oO2).o00oOoo0();
                if (o00oOoo02 != null) {
                    o0OOO0OO o0ooo0oo = oO00OOo0.f14087o00oo0O0;
                    if (z && (o0O0O0oO2 instanceof o00oOo00)) {
                        synchronized (o0O0O0oO2) {
                            r3 = ((o00oOo00) o0O0O0oO2).o00oOooO();
                            if (r3 == null || ((o00ooVar instanceof o0O00OOO) && !((o00oOo00) o0O0O0oO2).o00oOo0o())) {
                                if (o0(o0O0O0oO2, o00oOoo02, o0O0Oo0O2)) {
                                    if (r3 == null) {
                                        return o0O0Oo0O2;
                                    }
                                    o0ooo0oo = o0O0Oo0O2;
                                }
                            }
                            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            o00ooVar.invoke(r3);
                        }
                        return o0ooo0oo;
                    } else if (o0(o0O0O0oO2, o00oOoo02, o0O0Oo0O2)) {
                        return o0O0Oo0O2;
                    }
                } else if (o0O0O0oO2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                } else {
                    o0O0o000((oO00O0o) o0O0O0oO2);
                }
            }
        }
    }

    public final void o0O0OO0O(@Nullable ooOOOOoo oooooooo) {
        if (oooooooo == null) {
            o0O0o0OO(oO00OOo0.f14087o00oo0O0);
            return;
        }
        oooooooo.start();
        o0O00OO o00oooOo2 = oooooooo.o00oooOo(this);
        o0O0o0OO(o00oooOo2);
        if (o00oOoO0()) {
            o00oooOo2.o00oOOoO();
            o0O0o0OO(oO00OOo0.f14087o00oo0O0);
        }
    }

    public boolean o0O0OOO() {
        return false;
    }

    public final boolean o0O0OOO0() {
        return o0O0O0oO() instanceof o0O0O0Oo;
    }

    public final boolean o0O0OOOo() {
        Object o0O0O0oO2;
        do {
            o0O0O0oO2 = o0O0O0oO();
            if (!(o0O0O0oO2 instanceof oO000O0O)) {
                return false;
            }
        } while (o0O0o0Oo(o0O0O0oO2) < 0);
        return true;
    }

    public final Object o0O0OOo(o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        o0O00 o0o00 = new o0O00(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o00.o00ooo00();
        o0OoO00O.o00oOOo0(o0o00, o00oo0(new oO0OOO00(o0o00)));
        Object o00ooO002 = o0o00.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo02) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo02 ? o00ooO002 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public final Void o0O0OOoO(o0OOOO.o00oo<Object, o0OO0o.oO0Ooooo> o00ooVar) {
        while (true) {
            o00ooVar.invoke(o0O0O0oO());
        }
    }

    public final Object o0O0OOoo(Object obj) {
        Throwable th = null;
        while (true) {
            Object o0O0O0oO2 = o0O0O0oO();
            if (o0O0O0oO2 instanceof o00oOo00) {
                synchronized (o0O0O0oO2) {
                    if (((o00oOo00) o0O0O0oO2).o00oOoO0()) {
                        return oO00O0oO.o00oOo0o();
                    }
                    boolean o00oOo0O2 = ((o00oOo00) o0O0O0oO2).o00oOo0O();
                    if (obj != null || !o00oOo0O2) {
                        if (th == null) {
                            th = o0O00OO(obj);
                        }
                        ((o00oOo00) o0O0O0oO2).o00oOOo0(th);
                    }
                    Throwable o00oOooO2 = o00oOo0O2 ^ true ? ((o00oOo00) o0O0O0oO2).o00oOooO() : null;
                    if (o00oOooO2 != null) {
                        o0O0OoO0(((o00oOo00) o0O0O0oO2).f14119o00oo0O0, o00oOooO2);
                    }
                    return oO00O0oO.o00oOOo0();
                }
            } else if (!(o0O0O0oO2 instanceof oO000O0O)) {
                return oO00O0oO.o00oOo0o();
            } else {
                if (th == null) {
                    th = o0O00OO(obj);
                }
                oO000O0O oo000o0o = (oO000O0O) o0O0O0oO2;
                if (!oo000o0o.isActive()) {
                    Object oooOO02 = oooOO0(o0O0O0oO2, new o0O0O0Oo(th, false, 2, null));
                    if (oooOO02 == oO00O0oO.o00oOOo0()) {
                        throw new IllegalStateException(o0O000o0.o00oOOo0("Cannot happen in ", o0O0O0oO2));
                    }
                    if (oooOO02 != oO00O0oO.f14076o00oOo00) {
                        return oooOO02;
                    }
                } else if (o0O0oo0O(oo000o0o, th)) {
                    return oO00O0oO.o00oOOo0();
                }
            }
        }
    }

    public final o0O00OOO o0O0Oo(o0OOo0o0.o0OOO0OO o0ooo0oo) {
        while (o0ooo0oo.o0O0000o()) {
            o0ooo0oo = o0ooo0oo.o0();
        }
        while (true) {
            o0ooo0oo = o0ooo0oo.o00ooooo();
            if (!o0ooo0oo.o0O0000o()) {
                if (o0ooo0oo instanceof o0O00OOO) {
                    return (o0O00OOO) o0ooo0oo;
                }
                if (o0ooo0oo instanceof oO00OOO) {
                    return null;
                }
            }
        }
    }

    @Nullable
    public final Object o0O0Oo0(@Nullable Object obj) {
        Object oooOO02;
        do {
            oooOO02 = oooOO0(o0O0O0oO(), obj);
            if (oooOO02 == oO00O0oO.o00oOOo0()) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, o0O00o(obj));
            }
        } while (oooOO02 == oO00O0oO.f14076o00oOo00);
        return oooOO02;
    }

    public final oO00O0o o0O0Oo0O(o0OOOO.o00oo<? super Throwable, o0OO0o.oO0Ooooo> o00ooVar, boolean z) {
        oO00O0o oo00o0o;
        if (z) {
            oo00o0o = o00ooVar instanceof oO000Oo0 ? (oO000Oo0) o00ooVar : null;
            if (oo00o0o == null) {
                oo00o0o = new oO0Oo0oo(o00ooVar);
            }
        } else {
            oo00o0o = o00ooVar instanceof oO00O0o ? (oO00O0o) o00ooVar : null;
            if (oo00o0o == null) {
                oo00o0o = new oO000OOo(o00ooVar);
            }
        }
        oo00o0o.o0OoO00O(this);
        return oo00o0o;
    }

    @NotNull
    public String o0O0Oo0o() {
        return oo0ooO.o00oOOo0(this);
    }

    public final void o0O0OoO0(oO00OOO oo00ooo, Throwable th) {
        o0O0OoOo(th);
        o0O0OO0 o0o0oo0 = null;
        for (o0OOo0o0.o0OOO0OO o0ooo0oo = (o0OOo0o0.o0OOO0OO) oo00ooo.o00ooooO(); !o0OOOOO0.o0ooO.o00oOoO0(o0ooo0oo, oo00ooo); o0ooo0oo = o0ooo0oo.o00ooooo()) {
            if (o0ooo0oo instanceof oO000Oo0) {
                oO00O0o oo00o0o = (oO00O0o) o0ooo0oo;
                try {
                    oo00o0o.o0O00(th);
                } catch (Throwable th2) {
                    if (o0o0oo0 != null) {
                        o0OO0o.o0O00000.o00oOOo0(o0o0oo0, th2);
                    } else {
                        o0o0oo0 = new o0O0OO0("Exception in completion handler " + oo00o0o + " for " + this, th2);
                        o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                    }
                }
            }
        }
        if (o0o0oo0 != null) {
            o0ooO(o0o0oo0);
        }
        o0O00(th);
    }

    public void o0O0OoOo(@Nullable Throwable th) {
    }

    public void o0O0Ooo() {
    }

    public void o0O0Ooo0(@Nullable Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o0OOo00O.oO000O0] */
    public final void o0O0OooO(o0OOOO o0oooo) {
        oO00OOO oo00ooo = new oO00OOO();
        if (!o0oooo.f14046o00oo0O0) {
            oo00ooo = new oO000O0(oo00ooo);
        }
        androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, o0oooo, oo00ooo);
    }

    @Override // o0OOo0oo.oOo00o00
    public final <R> void o0O0o(@NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o00oo<? super o0OO.o00oOo0O<? super R>, ? extends Object> o00ooVar) {
        Object o0O0O0oO2;
        do {
            o0O0O0oO2 = o0O0O0oO();
            if (ooo0000.o00oo00O()) {
                return;
            }
            if (!(o0O0O0oO2 instanceof oO000O0O)) {
                if (ooo0000.o00oo0oO()) {
                    o0OOo0o.o0O000O.o00oOo00(o00ooVar, ooo0000.o00oo());
                    return;
                }
                return;
            }
        } while (o0O0o0Oo(o0O0O0oO2) != 0);
        ooo0000.o00oOo00(o00oo0(new oO0OO00o(ooo0000, o00ooVar)));
    }

    public final <T, R> void o0O0o0(@NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        Object o0O0O0oO2 = o0O0O0oO();
        if (o0O0O0oO2 instanceof o0O0O0Oo) {
            ooo0000.o00ooO0(((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0);
        } else {
            o0OOo0o.o0O000.o00oOo0o(o0o00000, oO00O0oO.o00oo0OO(o0O0O0oO2), ooo0000.o00oo(), null, 4, null);
        }
    }

    public final <T, R> void o0O0o00(@NotNull oOO0000<? super R> ooo0000, @NotNull o0OOOO.o0O00000<? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        Object o0O0O0oO2;
        do {
            o0O0O0oO2 = o0O0O0oO();
            if (ooo0000.o00oo00O()) {
                return;
            }
            if (!(o0O0O0oO2 instanceof oO000O0O)) {
                if (ooo0000.o00oo0oO()) {
                    if (o0O0O0oO2 instanceof o0O0O0Oo) {
                        ooo0000.o00ooO0(((o0O0O0Oo) o0O0O0oO2).f14007o00oOOo0);
                        return;
                    } else {
                        o0OOo0o.o0O000O.o00oOooO(o0o00000, oO00O0oO.o00oo0OO(o0O0O0oO2), ooo0000.o00oo());
                        return;
                    }
                }
                return;
            }
        } while (o0O0o0Oo(o0O0O0oO2) != 0);
        ooo0000.o00oOo00(o00oo0(new oOo00ooO(ooo0000, o0o00000)));
    }

    public final void o0O0o000(oO00O0o oo00o0o) {
        oo00o0o.o00ooo0(new oO00OOO());
        androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, oo00o0o, oo00o0o.o00ooooo());
    }

    public final void o0O0o00O(@NotNull oO00O0o oo00o0o) {
        Object o0O0O0oO2;
        do {
            o0O0O0oO2 = o0O0O0oO();
            if (!(o0O0O0oO2 instanceof oO00O0o)) {
                if (!(o0O0O0oO2 instanceof oO000O0O) || ((oO000O0O) o0O0O0oO2).o00oOoo0() == null) {
                    return;
                }
                oo00o0o.o0OoOoOo();
                return;
            } else if (o0O0O0oO2 != oo00o0o) {
                return;
            }
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, o0O0O0oO2, oO00O0oO.o00oOo00()));
    }

    @Override // o0OOo00O.ooOOOOoo
    @NotNull
    public final oOo00o00 o0O0o0O() {
        return this;
    }

    public final void o0O0o0OO(@Nullable o0O00OO o0o00oo) {
        this._parentHandle = o0o00oo;
    }

    public final int o0O0o0Oo(Object obj) {
        if (obj instanceof o0OOOO) {
            if (((o0OOOO) obj).f14046o00oo0O0) {
                return 0;
            }
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, obj, oO00O0oO.o00oOo00())) {
                o0O0Ooo();
                return 1;
            }
            return -1;
        } else if (obj instanceof oO000O0) {
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, obj, ((oO000O0) obj).f14069o00oo0O0)) {
                o0O0Ooo();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    @NotNull
    public final CancellationException o0O0o0o(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = o0O00O0();
            }
            cancellationException = new oO0OOo0o(str, th, this);
        }
        return cancellationException;
    }

    public final String o0O0o0o0(Object obj) {
        if (!(obj instanceof o00oOo00)) {
            return obj instanceof oO000O0O ? ((oO000O0O) obj).isActive() ? "Active" : "New" : obj instanceof o0O0O0Oo ? "Cancelled" : "Completed";
        }
        o00oOo00 o00ooo002 = (o00oOo00) obj;
        return o00ooo002.o00oOo0O() ? "Cancelling" : o00ooo002.o00oOo0o() ? "Completing" : "Active";
    }

    @oO0o0o
    @NotNull
    public final String o0O0o0oO() {
        return o0O0Oo0o() + '{' + o0O0o0o0(o0O0O0oO()) + '}';
    }

    public final boolean o0O0o0oo(oO000O0O oo000o0o, Object obj) {
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, oo000o0o, oO00O0oO.o00oOoO0(obj))) {
            o0O0OoOo(null);
            o0O0Ooo0(obj);
            o0O00O0o(oo000o0o, obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object o0O0oO0O(oO000O0O oo000o0o, Object obj) {
        oO00OOO o0O0O0o02 = o0O0O0o0(oo000o0o);
        if (o0O0O0o02 == null) {
            return oO00O0oO.o00oOOoO();
        }
        o00oOo00 o00ooo002 = oo000o0o instanceof o00oOo00 ? (o00oOo00) oo000o0o : null;
        if (o00ooo002 == null) {
            o00ooo002 = new o00oOo00(o0O0O0o02, false, null);
        }
        o0OO0O0.o00oo0OO o00oo0oo = new o0OO0O0.o00oo0OO();
        synchronized (o00ooo002) {
            if (o00ooo002.o00oOo0o()) {
                return oO00O0oO.o00oOOo0();
            }
            o00ooo002.o00oOoOO(true);
            if (o00ooo002 != oo000o0o && !androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, oo000o0o, o00ooo002)) {
                return oO00O0oO.o00oOOoO();
            }
            boolean o00oOo0O2 = o00ooo002.o00oOo0O();
            o0O0O0Oo o0o0o0oo = obj instanceof o0O0O0Oo ? (o0O0O0Oo) obj : null;
            if (o0o0o0oo != null) {
                o00ooo002.o00oOOo0(o0o0o0oo.f14007o00oOOo0);
            }
            ?? o00oOooO2 = Boolean.valueOf(o00oOo0O2 ? false : true).booleanValue() ? o00ooo002.o00oOooO() : 0;
            o00oo0oo.element = o00oOooO2;
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
            if (o00oOooO2 != 0) {
                o0O0OoO0(o0O0O0o02, o00oOooO2);
            }
            o0O00OOO o0O00Ooo2 = o0O00Ooo(oo000o0o);
            return (o0O00Ooo2 == null || !o0O0oO0o(o00ooo002, o0O00Ooo2, obj)) ? o0O00OoO(o00ooo002, obj) : oO00O0oO.f14075o00oOOoO;
        }
    }

    public final boolean o0O0oO0o(o00oOo00 o00ooo002, o0O00OOO o0o00ooo, Object obj) {
        while (ooOOOOoo.o00oOOo0.o00oOo0o(o0o00ooo.f14005o00oo0o, false, false, new o00oOOoO(this, o00ooo002, o0o00ooo, obj), 1, null) == oO00OOo0.f14087o00oo0O0) {
            o0o00ooo = o0O0Oo(o0o00ooo);
            if (o0o00ooo == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o0OOo00O.o0oO0Ooo
    public final void o0O0oOO(@NotNull oOOoOOO0 ooooooo0) {
        o0OoOoOO(ooooooo0);
    }

    public final boolean o0O0oo0O(oO000O0O oo000o0o, Throwable th) {
        oO00OOO o0O0O0o02 = o0O0O0o0(oo000o0o);
        if (o0O0O0o02 == null) {
            return false;
        }
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14113o00oo0O0, this, oo000o0o, new o00oOo00(o0O0O0o02, false, th))) {
            o0O0OoO0(o0O0O0o02, th);
            return true;
        }
        return false;
    }

    public boolean o0O0oo0o() {
        return false;
    }

    public boolean o0OoO00O(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o0OoOoOO(th) && o0O0O0O();
    }

    public final boolean o0OoOoOO(@Nullable Object obj) {
        Object o00oOOo02 = oO00O0oO.o00oOOo0();
        if (o0O0oo0o() && (o00oOOo02 = o0ooOoOO(obj)) == oO00O0oO.f14075o00oOOoO) {
            return true;
        }
        o0OOo0o0.oO0o0o oo0o0o = oO00O0oO.f14074o00oOOo0;
        if (o00oOOo02 == oo0o0o) {
            o00oOOo02 = o0O0OOoo(obj);
        }
        if (o00oOOo02 == oo0o0o || o00oOOo02 == oO00O0oO.f14075o00oOOoO) {
            return true;
        }
        if (o00oOOo02 == oO00O0oO.f14083o00oOooO) {
            return false;
        }
        o0O0000O(o00oOOo02);
        return true;
    }

    public final Object o0OoOoOo(o0OO.o00oOo0O<Object> o00ooo0o2) {
        o00oOOo0 o00oooo02 = new o00oOOo0(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), this);
        o00oooo02.o00ooo00();
        o0OoO00O.o00oOOo0(o00oooo02, o00oo0(new oO00o00(o00oooo02)));
        Object o00ooO002 = o00oooo02.o00ooO00();
        if (o00ooO002 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002;
    }

    public final boolean o0OooO0(@Nullable Object obj) {
        Object oooOO02;
        do {
            oooOO02 = oooOO0(o0O0O0oO(), obj);
            if (oooOO02 == oO00O0oO.o00oOOo0()) {
                return false;
            }
            if (oooOO02 == oO00O0oO.f14075o00oOOoO) {
                return true;
            }
        } while (oooOO02 == oO00O0oO.f14076o00oOo00);
        o0O0000O(oooOO02);
        return true;
    }

    @Override // o0OOo00O.ooOOOOoo
    @Nullable
    public final Object o0oO0Ooo(@NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        if (o0O0OOOo()) {
            Object o0O0OOo2 = o0O0OOo(o00ooo0o2);
            return o0O0OOo2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o0O0OOo2 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
        oO00O0o0.o00ooO00(o00ooo0o2.getContext());
        return o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public void o0ooO(@NotNull Throwable th) {
        throw th;
    }

    public final Object o0ooOoOO(Object obj) {
        Object oooOO02;
        do {
            Object o0O0O0oO2 = o0O0O0oO();
            if (!(o0O0O0oO2 instanceof oO000O0O) || ((o0O0O0oO2 instanceof o00oOo00) && ((o00oOo00) o0O0O0oO2).o00oOo0o())) {
                return oO00O0oO.o00oOOo0();
            }
            oooOO02 = oooOO0(o0O0O0oO2, new o0O0O0Oo(o0O00OO(obj), false, 2, null));
        } while (oooOO02 == oO00O0oO.o00oOOoO());
        return oooOO02;
    }

    public final void oo0OOoo(oO00OOO oo00ooo, Throwable th) {
        o0O0OO0 o0o0oo0 = null;
        for (o0OOo0o0.o0OOO0OO o0ooo0oo = (o0OOo0o0.o0OOO0OO) oo00ooo.o00ooooO(); !o0OOOOO0.o0ooO.o00oOoO0(o0ooo0oo, oo00ooo); o0ooo0oo = o0ooo0oo.o00ooooo()) {
            if (o0ooo0oo instanceof oO00O0o) {
                oO00O0o oo00o0o = (oO00O0o) o0ooo0oo;
                try {
                    oo00o0o.o0O00(th);
                } catch (Throwable th2) {
                    if (o0o0oo0 != null) {
                        o0OO0o.o0O00000.o00oOOo0(o0o0oo0, th2);
                    } else {
                        o0o0oo0 = new o0O0OO0("Exception in completion handler " + oo00o0o + " for " + this, th2);
                        o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                    }
                }
            }
        }
        if (o0o0oo0 != null) {
            o0ooO(o0o0oo0);
        }
    }

    public final Object oooOO0(Object obj, Object obj2) {
        return !(obj instanceof oO000O0O) ? oO00O0oO.o00oOOo0() : ((!(obj instanceof o0OOOO) && !(obj instanceof oO00O0o)) || (obj instanceof o0O00OOO) || (obj2 instanceof o0O0O0Oo)) ? o0O0oO0O((oO000O0O) obj, obj2) : o0O0o0oo((oO000O0O) obj, obj2) ? obj2 : oO00O0oO.o00oOOoO();
    }

    @Override // o0OO.o00oo0
    @NotNull
    public o0OO.o00oo0 plus(@NotNull o0OO.o00oo0 o00oo0Var) {
        return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(this, o00oo0Var);
    }

    @Override // o0OOo00O.ooOOOOoo
    public final boolean start() {
        int o0O0o0Oo2;
        do {
            o0O0o0Oo2 = o0O0o0Oo(o0O0O0oO());
            if (o0O0o0Oo2 == 0) {
                return false;
            }
        } while (o0O0o0Oo2 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return o0O0o0oO() + '@' + oo0ooO.o00oOOoO(this);
    }
}
