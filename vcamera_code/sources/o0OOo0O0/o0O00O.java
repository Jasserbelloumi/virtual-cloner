package o0OOo0O0;

import androidx.lifecycle.o0O;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.math.DoubleMath;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o0O0Oooo.oooOO0;
import o0O0oooo.o0OO0oO;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOo00O.o0OOO00;
import o0OOo00O.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.videolan.libvlc.MediaPlayer;
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aV\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010'\u001ak\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0)H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aV\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010'\u001a$\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001\u001aC\u00101\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u0010\b\u0001\u0010/*\n\u0012\u0006\b\u0000\u0012\u00028\u00000.*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aA\u00104\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u000e\b\u0001\u0010/*\b\u0012\u0004\u0012\u00028\u000003*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a0\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010'\u001a;\u00108\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010/*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b8\u00105\u001a=\u00109\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010/*\n\u0012\u0006\b\u0000\u0012\u00028\u00000.*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b9\u00102\u001aA\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u0013\u001aW\u0010A\u001a\u00028\u0002\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0018\b\u0002\u0010@*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010?*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u00012\u0006\u00100\u001a\u00028\u0002H\u0081@ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001a)\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bF\u0010\u0013\u001ab\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010G*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010H\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010'\u001a\\\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010G*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010H\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010'\u001aq\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010G*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010H\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0)H\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010+\u001aw\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010G*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010H\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0)H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010+\u001ab\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010G*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010H\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010'\u001a.\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\\\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010Q\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010'\u001a)\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000S\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\bT\u0010\u0013\u001a#\u0010U\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bU\u0010\u0013\u001a#\u0010V\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bV\u0010\u0013\u001aA\u0010Z\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010Y\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Wj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`XH\u0087@ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001aA\u0010\\\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010Y\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Wj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`XH\u0087@ø\u0001\u0000¢\u0006\u0004\b\\\u0010[\u001a#\u0010]\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b]\u0010\u0013\u001a$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007\u001a?\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010G*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\u0004\u001az\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010G\"\u0004\b\u0002\u0010;*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010H\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(a\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(b\u0012\u0004\u0012\u00028\u00020!H\u0001\u001a1\u0010d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"", "Lo0OOo0O0/o0O0OO;", "channels", "Lkotlin/Function1;", "", "Lo0OO0o/o0O0o00O;", "name", "cause", "Lo0OO0o/oO0Ooooo;", "Lkotlinx/coroutines/CompletionHandler;", "o00oOo00", "([Lo0OOo0O0/o0O0OO;)Lo0OOOO/o00oo;", "E", "", FirebaseAnalytics.Param.INDEX, "o00oOooo", "(Lo0OOo0O0/o0O0OO;ILo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oo00O", "o00oo", "(Lo0OOo0O0/o0O0OO;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00ooO00", "element", "o00ooO0o", "(Lo0OOo0O0/o0O0OO;Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00ooO", "o00ooOO0", "o00ooOO", "o00oooo0", "o00oooo", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lo0OO/o00oo0;", "context", "o00oOoO", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "", "predicate", "o00oOoOo", "(Lo0OOo0O0/o0O0OO;Lo0OO/o00oo0;Lo0OOOO/o0O00000;)Lo0OOo0O0/o0O0OO;", "o00oo0", "Lkotlin/Function3;", "o00oo0O0", "(Lo0OOo0O0/o0O0OO;Lo0OO/o00oo0;Lo0OOOO/o0O0000O;)Lo0OOo0O0/o0O0OO;", "o00oo0Oo", "o00oo0o", "", "C", FirebaseAnalytics.Param.DESTINATION, "o00oo0oO", "(Lo0OOo0O0/o0O0OO;Ljava/util/Collection;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0O0/o0OooO0;", "o0O0o", "(Lo0OOo0O0/o0O0OO;Lo0OOo0O0/o0OooO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00ooooO", "o0", "o0O0000O", "o0O0000o", "K", "V", "Lo0OO0o/o0O0o00;", "", "o0O000O", "", "M", "o0O000", "(Lo0OOo0O0/o0O0OO;Ljava/util/Map;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "o0OoOoOo", "", "o0OoOoOO", "R", "transform", "o00ooO0", "o00ooOOo", "o00ooOo", "o00ooOoo", "o00ooo0", "Lo0OO0oO/o0O0o000;", "o0O000o0", "o00oOo0O", "selector", "o00oOo0o", "", "o0O000Oo", "o00oOOo0", "o00oOooO", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "o00ooo0o", "(Lo0OOo0O0/o0O0OO;Ljava/util/Comparator;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oooO", "o00oooOO", "o00oooOo", "other", "o0ooOoOO", oooOO0.f12266o00oOOo0, "b", "o0O000oo", o0OO000o.o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0O00O {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0<E, C extends Collection<? super E>> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0(o0OO.o00oOo0O<? super o0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oo0oO(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oOOo0(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Throwable, oO0Ooooo> {
        public final /* synthetic */ o0O0OO<?> $this_consumes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o0O0OO<?> o0o0oo) {
            super(1);
            this.$this_consumes = o0o0oo;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            invoke2(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            o0OOo0O0.o0O00O0o.o00oOOo0(this.$this_consumes, th);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Throwable, oO0Ooooo> {
        public final /* synthetic */ o0O0OO<?>[] $channels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(o0O0OO<?>[] o0o0ooArr) {
            super(1);
            this.$channels = o0o0ooArr;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            invoke2(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            Throwable th2 = null;
            for (o0O0OO<?> o0o0oo : this.$channels) {
                try {
                    o0OOo0O0.o0O00O0o.o00oOOo0(o0o0oo, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        o0OO0o.o0O00000.o00oOOo0(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o00oOo0O(o0OO.o00oOo0O<? super o00oOo0O> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oOooO(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<Object, o0OO.o00oOo0O<Object>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public o00oOoO(o0OO.o00oOo0O<? super o00oOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOoO o00oooo2 = new o00oOoO(o00ooo0o2);
            o00oooo2.L$0 = obj;
            return o00oooo2;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(Object obj, @Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
            return ((o00oOoO) create(obj, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                return this.L$0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", "e", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o00oo extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O0000O<Integer, Object, o0OO.o00oOo0O<? super Boolean>, Object> $predicate;
        public final /* synthetic */ o0O0OO<Object> $this_filterIndexed;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo(o0O0OO<Object> o0o0oo, o0OOOO.o0O0000O<? super Integer, Object, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o0000o, o0OO.o00oOo0O<? super o00oo> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_filterIndexed = o0o0oo;
            this.$predicate = o0o0000o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo o00ooVar = new o00oo(this.$this_filterIndexed, this.$predicate, o00ooo0o2);
            o00ooVar.L$0 = obj;
            return o00ooVar;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bb -> B:15:0x0060). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 195
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {o0OO0oO.f12880o00oooOo, 169, DoubleMath.MAX_FACTORIAL}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $n;
        public final /* synthetic */ o0O0OO<Object> $this_drop;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo0(int i, o0O0OO<Object> o0o0oo, o0OO.o00oOo0O<? super o00oo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$n = i;
            this.$this_drop = o0o0oo;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo0 o00oo0Var = new o00oo0(this.$n, this.$this_drop, o00ooo0o2);
            o00oo0Var.L$0 = obj;
            return o00oo0Var;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x0082). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d6 -> B:32:0x00a9). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"E", "K", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", o0O.f3318o00oOoO, "$this$produce", o0O.f3318o00oOoO, "e", "$this$produce", o0O.f3318o00oOoO, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O<E> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super E>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<E, o0OO.o00oOo0O<? super K>, Object> $selector;
        public final /* synthetic */ o0O0OO<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo00O(o0O0OO<? extends E> o0o0oo, o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super K>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oo00O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_distinctBy = o0o0oo;
            this.$selector = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo00O o00oo00o = new o00oo00O(this.$this_distinctBy, this.$selector, o00ooo0o2);
            o00oo00o.L$0 = obj;
            return o00oo00o;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super E> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo00O) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:29:0x00c9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d0 -> B:13:0x006f). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo00O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", FirebaseAnalytics.Param.INDEX, "count"}, s = {"L$0", "I$0", "I$1"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O<E> extends o0OOO0.o00oOo0O {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o00oo0O(o0OO.o00oOo0O<? super o00oo0O> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oo00O(null, 0, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", FirebaseAnalytics.Param.INDEX, "count"}, s = {"L$0", "I$0", "I$1"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0<E> extends o0OOO0.o00oOo0O {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o00oo0O0(o0OO.o00oOo0O<? super o00oo0O0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oOooo(null, 0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super Boolean>, Object> $predicate;
        public final /* synthetic */ o0O0OO<Object> $this_dropWhile;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oo0OO(o0O0OO<Object> o0o0oo, o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oo0OO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_dropWhile = o0o0oo;
            this.$predicate = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oo0OO o00oo0oo = new o00oo0OO(this.$this_dropWhile, this.$predicate, o00ooo0o2);
            o00oo0oo.L$0 = obj;
            return o00oo0oo;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oo0OO) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00af -> B:27:0x00b3). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0100 -> B:35:0x00d7). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00ooO<E> extends o0OOO0.o0 implements o0OOOO.o0O00000<E, o0OO.o00oOo0O<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public o00ooO(o0OO.o00oOo0O<? super o00ooO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00ooO o00ooo = new o00ooO(o00ooo0o2);
            o00ooo.L$0 = obj;
            return o00ooo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super Boolean> o00ooo0o2) {
            return invoke2((o00ooO<E>) obj, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable E e, @Nullable o0OO.o00oOo0O<? super Boolean> o00ooo0o2) {
            return ((o00ooO) create(e, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                return Boolean.valueOf(this.L$0 != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00ooO0 extends o0OOO0.o0 implements o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super Boolean>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super Boolean>, Object> $predicate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00ooO0(o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00ooO0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$predicate = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00ooO0 o00ooo02 = new o00ooO0(this.$predicate, o00ooo0o2);
            o00ooo02.L$0 = obj;
            return o00ooo02;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(Object obj, @Nullable o0OO.o00oOo0O<? super Boolean> o00ooo0o2) {
            return ((o00ooO0) create(obj, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                Object obj2 = this.L$0;
                o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super Boolean>, Object> o0o00000 = this.$predicate;
                this.label = 1;
                obj = o0o00000.invoke(obj2, this);
                if (obj == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0O00<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0O00(o0OO.o00oOo0O<? super o0O00> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooOO(null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O000<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o0O000(o0OO.o00oOo0O<? super o0O000> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooO00(null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O00000<E, C extends o0OooO0<? super E>> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0O00000(o0OO.o00oOo0O<? super o0O00000> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o0O0o(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O0000O<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o0O0000O(o0OO.o00oOo0O<? super o0O0000O> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oo(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes3.dex */
    public static final class o0O000O extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O0OO<Object> $this_flatMap;
        public final /* synthetic */ o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super o0O0OO<Object>>, Object> $transform;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O000O(o0O0OO<Object> o0o0oo, o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super o0O0OO<Object>>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o0O000O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_flatMap = o0o0oo;
            this.$transform = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O000O o0o000o = new o0O000O(this.$this_flatMap, this.$transform, o00ooo0o2);
            o0o000o.L$0 = obj;
            return o0o000o;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O000O) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008f -> B:14:0x0052). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L43
                if (r1 == r4) goto L33
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r5 = r9.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                goto L51
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r5 = r9.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L80
            L33:
                java.lang.Object r1 = r9.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r5 = r9.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L65
            L43:
                o0OO0o.oo0ooO.o00oo0(r10)
                java.lang.Object r10 = r9.L$0
                o0OOo0O0.o0ooO r10 = (o0OOo0O0.o0ooO) r10
                o0OOo0O0.o0O0OO<java.lang.Object> r1 = r9.$this_flatMap
                o0OOo0O0.o0O000Oo r1 = r1.iterator()
                r5 = r10
            L51:
                r10 = r9
            L52:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r4
                java.lang.Object r6 = r1.o00oOOo0(r10)
                if (r6 != r0) goto L5f
                return r0
            L5f:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L65:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L94
                java.lang.Object r10 = r5.next()
                o0OOOO.o0O00000<java.lang.Object, o0OO.o00oOo0O<? super o0OOo0O0.o0O0OO<java.lang.Object>>, java.lang.Object> r7 = r0.$transform
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r10 = r7.invoke(r10, r0)
                if (r10 != r1) goto L80
                return r1
            L80:
                o0OOo0O0.o0O0OO r10 = (o0OOo0O0.o0O0OO) r10
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r2
                java.lang.Object r10 = o0OOo0O0.o0O00O.o0O0000O(r10, r6, r0)
                if (r10 != r1) goto L8f
                return r1
            L8f:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L52
            L94:
                o0OO0o.oO0Ooooo r10 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O000O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0O000Oo<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0O000Oo(o0OO.o00oOo0O<? super o0O000Oo> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooO(null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class o0O000o0<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public o0O000o0(o0OO.o00oOo0O<? super o0O000o0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooOO0(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: o0OOo0O0.o0O00O$o0O00O  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0180o0O00O<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C0180o0O00O(o0OO.o00oOo0O<? super C0180o0O00O> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oooO(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0O00O0<R> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super R>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O0OO<E> $this_map;
        public final /* synthetic */ o0OOOO.o0O00000<E, o0OO.o00oOo0O<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O00O0(o0O0OO<? extends E> o0o0oo, o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o0O00O0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_map = o0o0oo;
            this.$transform = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O00O0 o0o00o0 = new o0O00O0(this.$this_map, this.$transform, o00ooo0o2);
            o0o00o0.L$0 = obj;
            return o0o00o0;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super R> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O00O0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:8:0x0020, B:22:0x0074, B:26:0x0089, B:28:0x0091, B:36:0x00c7, B:18:0x005c, B:21:0x006c), top: B:46:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[Catch: all -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:8:0x0020, B:22:0x0074, B:26:0x0089, B:28:0x0091, B:36:0x00c7, B:18:0x005c, B:21:0x006c), top: B:46:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c1 -> B:22:0x0074). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O00O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class o0O00O0o<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public o0O00O0o(o0OO.o00oOo0O<? super o0O00O0o> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooo0o(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o0O00OO<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o0O00OO(o0OO.o00oOo0O<? super o0O00OO> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oooOO(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o0O00OOO extends o0OOO0.o0 implements o0OOOO.o0O00000<Object, o0OO.o00oOo0O<Object>, Object> {
        public final /* synthetic */ o0O0OO<Object> $this_requireNoNulls;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00OOO(o0O0OO<Object> o0o0oo, o0OO.o00oOo0O<? super o0O00OOO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_requireNoNulls = o0o0oo;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O00OOO o0o00ooo = new o0O00OOO(this.$this_requireNoNulls, o00ooo0o2);
            o0o00ooo.L$0 = obj;
            return o0o00ooo;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@Nullable Object obj, @Nullable o0OO.o00oOo0O<Object> o00ooo0o2) {
            return ((o0O00OOO) create(obj, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                oo0ooO.o00oo0(obj);
                Object obj2 = this.L$0;
                if (obj2 != null) {
                    return obj2;
                }
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("null element found in ");
                o00oOOo02.append(this.$this_requireNoNulls);
                o00oOOo02.append('.');
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O00o00<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o0O00o00(o0OO.o00oOo0O<? super o0O00o00> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oooo(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o0O00oO0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ int $n;
        public final /* synthetic */ o0O0OO<Object> $this_take;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00oO0(int i, o0O0OO<Object> o0o0oo, o0OO.o00oOo0O<? super o0O00oO0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$n = i;
            this.$this_take = o0o0oo;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O00oO0 o0o00oo0 = new o0O00oO0(this.$n, this.$this_take, o00ooo0o2);
            o0o00oo0.L$0 = obj;
            return o0o00oo0;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O00oO0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007d -> B:29:0x007e). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L34
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                int r1 = r8.I$0
                java.lang.Object r4 = r8.L$1
                o0OOo0O0.o0O000Oo r4 = (o0OOo0O0.o0O000Oo) r4
                java.lang.Object r5 = r8.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r9)
                r9 = r5
                r5 = r8
                goto L7e
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                int r1 = r8.I$0
                java.lang.Object r4 = r8.L$1
                o0OOo0O0.o0O000Oo r4 = (o0OOo0O0.o0O000Oo) r4
                java.lang.Object r5 = r8.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r9)
                r6 = r5
                r5 = r8
                goto L62
            L34:
                o0OO0o.oo0ooO.o00oo0(r9)
                java.lang.Object r9 = r8.L$0
                o0OOo0O0.o0ooO r9 = (o0OOo0O0.o0ooO) r9
                int r1 = r8.$n
                if (r1 != 0) goto L42
                o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r9
            L42:
                if (r1 < 0) goto L46
                r4 = r3
                goto L47
            L46:
                r4 = 0
            L47:
                if (r4 == 0) goto L88
                o0OOo0O0.o0O0OO<java.lang.Object> r4 = r8.$this_take
                o0OOo0O0.o0O000Oo r4 = r4.iterator()
                r5 = r8
            L50:
                r5.L$0 = r9
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.o00oOOo0(r5)
                if (r6 != r0) goto L5f
                return r0
            L5f:
                r7 = r6
                r6 = r9
                r9 = r7
            L62:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L85
                java.lang.Object r9 = r4.next()
                r5.L$0 = r6
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r2
                java.lang.Object r9 = r6.o00ooOo(r9, r5)
                if (r9 != r0) goto L7d
                return r0
            L7d:
                r9 = r6
            L7e:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L50
                o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r9
            L85:
                o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r9
            L88:
                java.lang.String r9 = "Requested element count "
                java.lang.String r0 = " is less than zero."
                java.lang.String r9 = o00ooO0.o00oOoO.o00oOOo0(r9, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O00oO0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {MediaPlayer.Event.SeekableChanged, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes3.dex */
    public static final class o0O0O0O extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<Object>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<Object, o0OO.o00oOo0O<? super Boolean>, Object> $predicate;
        public final /* synthetic */ o0O0OO<Object> $this_takeWhile;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O0O0O(o0O0OO<Object> o0o0oo, o0OOOO.o0O00000<Object, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o0O0O0O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_takeWhile = o0o0oo;
            this.$predicate = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O0O0O o0o0o0o = new o0O0O0O(this.$this_takeWhile, this.$predicate, o00ooo0o2);
            o0o0o0o.L$0 = obj;
            return o0o0o0o;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<Object> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O0O0O) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:14:0x0055). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L46
                if (r1 == r4) goto L36
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r5 = r9.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                goto L54
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.L$2
                java.lang.Object r5 = r9.L$1
                o0OOo0O0.o0O000Oo r5 = (o0OOo0O0.o0O000Oo) r5
                java.lang.Object r6 = r9.L$0
                o0OOo0O0.o0ooO r6 = (o0OOo0O0.o0ooO) r6
                o0OO0o.oo0ooO.o00oo0(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L8a
            L36:
                java.lang.Object r1 = r9.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r5 = r9.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L68
            L46:
                o0OO0o.oo0ooO.o00oo0(r10)
                java.lang.Object r10 = r9.L$0
                o0OOo0O0.o0ooO r10 = (o0OOo0O0.o0ooO) r10
                o0OOo0O0.o0O0OO<java.lang.Object> r1 = r9.$this_takeWhile
                o0OOo0O0.o0O000Oo r1 = r1.iterator()
                r5 = r10
            L54:
                r10 = r9
            L55:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r4
                java.lang.Object r6 = r1.o00oOOo0(r10)
                if (r6 != r0) goto L62
                return r0
            L62:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L68:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Laa
                java.lang.Object r10 = r5.next()
                o0OOOO.o0O00000<java.lang.Object, o0OO.o00oOo0O<? super java.lang.Boolean>, java.lang.Object> r7 = r0.$predicate
                r0.L$0 = r6
                r0.L$1 = r5
                r0.L$2 = r10
                r0.label = r3
                java.lang.Object r7 = r7.invoke(r10, r0)
                if (r7 != r1) goto L85
                return r1
            L85:
                r8 = r5
                r5 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L8a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L95
                o0OO0o.oO0Ooooo r10 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r10
            L95:
                r0.L$0 = r7
                r0.L$1 = r6
                r10 = 0
                r0.L$2 = r10
                r0.label = r2
                java.lang.Object r10 = r7.o00ooOo(r5, r0)
                if (r10 != r1) goto La5
                return r1
            La5:
                r10 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L55
            Laa:
                o0OO0o.oO0Ooooo r10 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0O0O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O0O0Oo<K, V, M extends Map<? super K, ? super V>> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0O0O0Oo(o0OO.o00oOo0O<? super o0O0O0Oo> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o0O000(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0oO/o0O0o000;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o0O0O0o0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super o0OO0oO.o0O0o000<Object>>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O0OO<Object> $this_withIndex;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O0o0(o0O0OO<Object> o0o0oo, o0OO.o00oOo0O<? super o0O0O0o0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_withIndex = o0o0oo;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O0O0o0 o0o0o0o0 = new o0O0O0o0(this.$this_withIndex, o00ooo0o2);
            o0o0o0o0.L$0 = obj;
            return o0o0o0o0;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super o0OO0oO.o0O0o000<Object>> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O0O0o0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:12:0x0041). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                int r1 = r10.I$0
                java.lang.Object r4 = r10.L$1
                o0OOo0O0.o0O000Oo r4 = (o0OOo0O0.o0O000Oo) r4
                java.lang.Object r5 = r10.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                r11 = r5
                goto L40
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                int r1 = r10.I$0
                java.lang.Object r4 = r10.L$1
                o0OOo0O0.o0O000Oo r4 = (o0OOo0O0.o0O000Oo) r4
                java.lang.Object r5 = r10.L$0
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                r6 = r10
                goto L54
            L32:
                o0OO0o.oo0ooO.o00oo0(r11)
                java.lang.Object r11 = r10.L$0
                o0OOo0O0.o0ooO r11 = (o0OOo0O0.o0ooO) r11
                r1 = 0
                o0OOo0O0.o0O0OO<java.lang.Object> r4 = r10.$this_withIndex
                o0OOo0O0.o0O000Oo r4 = r4.iterator()
            L40:
                r5 = r10
            L41:
                r5.L$0 = r11
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.o00oOOo0(r5)
                if (r6 != r0) goto L50
                return r0
            L50:
                r9 = r5
                r5 = r11
                r11 = r6
                r6 = r9
            L54:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L7a
                java.lang.Object r11 = r4.next()
                o0OO0oO.o0O0o000 r7 = new o0OO0oO.o0O0o000
                int r8 = r1 + 1
                r7.<init>(r1, r11)
                r6.L$0 = r5
                r6.L$1 = r4
                r6.I$0 = r8
                r6.label = r2
                java.lang.Object r11 = r5.o00ooOo(r7, r6)
                if (r11 != r0) goto L76
                return r0
            L76:
                r11 = r5
                r5 = r6
                r1 = r8
                goto L41
            L7a:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0O0o0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"E", "R", "V", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    /* loaded from: classes3.dex */
    public static final class o0O0OO0<V> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super V>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O0OO<R> $other;
        public final /* synthetic */ o0O0OO<E> $this_zip;
        public final /* synthetic */ o0OOOO.o0O00000<E, R, V> $transform;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O0OO0(o0O0OO<? extends R> o0o0oo, o0O0OO<? extends E> o0o0oo2, o0OOOO.o0O00000<? super E, ? super R, ? extends V> o0o00000, o0OO.o00oOo0O<? super o0O0OO0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$other = o0o0oo;
            this.$this_zip = o0o0oo2;
            this.$transform = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O0OO0 o0o0oo0 = new o0O0OO0(this.$other, this.$this_zip, this.$transform, o00ooo0o2);
            o0o0oo0.L$0 = obj;
            return o0o0oo0;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super V> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O0OO0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:26:0x00af, B:28:0x00b7, B:40:0x0107, B:13:0x0048), top: B:50:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:32:0x00d7, B:34:0x00df), top: B:48:0x00d7 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0107 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:26:0x00af, B:28:0x00b7, B:40:0x0107, B:13:0x0048), top: B:50:0x0048 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fc -> B:22:0x0091). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0OO0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes3.dex */
    public static final class o0O0o<E> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super E>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<E, o0OO.o00oOo0O<? super Boolean>, Object> $predicate;
        public final /* synthetic */ o0O0OO<E> $this_filter;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0O0o(o0O0OO<? extends E> o0o0oo, o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o0O0o> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_filter = o0o0oo;
            this.$predicate = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0O0o o0o0o = new o0O0o(this.$this_filter, this.$predicate, o00ooo0o2);
            o0o0o.L$0 = obj;
            return o0o0o;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super E> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0O0o) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a2 -> B:14:0x0055). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L46
                if (r1 == r5) goto L36
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r1 = r10.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r6 = r10.L$0
                o0OOo0O0.o0ooO r6 = (o0OOo0O0.o0ooO) r6
                o0OO0o.oo0ooO.o00oo0(r11)
                goto L54
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L24:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r6 = r10.L$1
                o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
                java.lang.Object r7 = r10.L$0
                o0OOo0O0.o0ooO r7 = (o0OOo0O0.o0ooO) r7
                o0OO0o.oo0ooO.o00oo0(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L8b
            L36:
                java.lang.Object r1 = r10.L$1
                o0OOo0O0.o0O000Oo r1 = (o0OOo0O0.o0O000Oo) r1
                java.lang.Object r6 = r10.L$0
                o0OOo0O0.o0ooO r6 = (o0OOo0O0.o0ooO) r6
                o0OO0o.oo0ooO.o00oo0(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L6a
            L46:
                o0OO0o.oo0ooO.o00oo0(r11)
                java.lang.Object r11 = r10.L$0
                o0OOo0O0.o0ooO r11 = (o0OOo0O0.o0ooO) r11
                o0OOo0O0.o0O0OO<E> r1 = r10.$this_filter
                o0OOo0O0.o0O000Oo r1 = r1.iterator()
                r6 = r11
            L54:
                r11 = r10
            L55:
                r11.L$0 = r6
                r11.L$1 = r1
                r11.L$2 = r2
                r11.label = r5
                java.lang.Object r7 = r1.o00oOOo0(r11)
                if (r7 != r0) goto L64
                return r0
            L64:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L6a:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La7
                java.lang.Object r11 = r6.next()
                o0OOOO.o0O00000<E, o0OO.o00oOo0O<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r11
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r11, r0)
                if (r8 != r1) goto L87
                return r1
            L87:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L8b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La2
                r0.L$0 = r8
                r0.L$1 = r6
                r0.L$2 = r2
                r0.label = r3
                java.lang.Object r11 = r8.o00ooOo(r7, r0)
                if (r11 != r1) goto La2
                return r1
            La2:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L55
            La7:
                o0OO0o.oO0Ooooo r11 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0O0oo0o<E, C extends Collection<? super E>> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0O0oo0o(o0OO.o00oOo0O<? super o0O0oo0o> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o0O0000o(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX, "$this$produce", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes3.dex */
    public static final class o0OoO00O<R> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super R>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O0OO<E> $this_mapIndexed;
        public final /* synthetic */ o0OOOO.o0O0000O<Integer, E, o0OO.o00oOo0O<? super R>, Object> $transform;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoO00O(o0O0OO<? extends E> o0o0oo, o0OOOO.o0O0000O<? super Integer, ? super E, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o, o0OO.o00oOo0O<? super o0OoO00O> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_mapIndexed = o0o0oo;
            this.$transform = o0o0000o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o0OoO00O o0ooo00o = new o0OoO00O(this.$this_mapIndexed, this.$transform, o00ooo0o2);
            o0ooo00o.L$0 = obj;
            return o0ooo00o;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super R> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o0OoO00O) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a7 -> B:14:0x0057). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L39
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$1
                o0OOo0O0.o0O000Oo r5 = (o0OOo0O0.o0O000Oo) r5
                java.lang.Object r6 = r12.L$0
                o0OOo0O0.o0ooO r6 = (o0OOo0O0.o0ooO) r6
                o0OO0o.oo0ooO.o00oo0(r13)
                r13 = r6
                goto L56
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$2
                o0OOo0O0.o0ooO r5 = (o0OOo0O0.o0ooO) r5
                java.lang.Object r6 = r12.L$1
                o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
                java.lang.Object r7 = r12.L$0
                o0OOo0O0.o0ooO r7 = (o0OOo0O0.o0ooO) r7
                o0OO0o.oo0ooO.o00oo0(r13)
                r8 = r12
                goto L95
            L39:
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$1
                o0OOo0O0.o0O000Oo r5 = (o0OOo0O0.o0O000Oo) r5
                java.lang.Object r6 = r12.L$0
                o0OOo0O0.o0ooO r6 = (o0OOo0O0.o0ooO) r6
                o0OO0o.oo0ooO.o00oo0(r13)
                r7 = r12
                goto L6a
            L48:
                o0OO0o.oo0ooO.o00oo0(r13)
                java.lang.Object r13 = r12.L$0
                o0OOo0O0.o0ooO r13 = (o0OOo0O0.o0ooO) r13
                r1 = 0
                o0OOo0O0.o0O0OO<E> r5 = r12.$this_mapIndexed
                o0OOo0O0.o0O000Oo r5 = r5.iterator()
            L56:
                r6 = r12
            L57:
                r6.L$0 = r13
                r6.L$1 = r5
                r6.I$0 = r1
                r6.label = r4
                java.lang.Object r7 = r5.o00oOOo0(r6)
                if (r7 != r0) goto L66
                return r0
            L66:
                r11 = r6
                r6 = r13
                r13 = r7
                r7 = r11
            L6a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lab
                java.lang.Object r13 = r5.next()
                o0OOOO.o0O0000O<java.lang.Integer, E, o0OO.o00oOo0O<? super R>, java.lang.Object> r8 = r7.$transform
                int r9 = r1 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r1)
                r7.L$0 = r6
                r7.L$1 = r5
                r7.L$2 = r6
                r7.I$0 = r9
                r7.label = r3
                java.lang.Object r13 = r8.invoke(r10, r13, r7)
                if (r13 != r0) goto L90
                return r0
            L90:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L95:
                r8.L$0 = r7
                r8.L$1 = r6
                r9 = 0
                r8.L$2 = r9
                r8.I$0 = r1
                r8.label = r2
                java.lang.Object r13 = r5.o00ooOo(r13, r8)
                if (r13 != r0) goto La7
                return r0
            La7:
                r5 = r6
                r13 = r7
                r6 = r8
                goto L57
            Lab:
                o0OO0o.oO0Ooooo r13 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0OoO00O.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o0OoOoOo<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public o0OoOoOo(o0OO.o00oOo0O<? super o0OoOoOo> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00ooO0o(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, MediaPlayer.Event.ESSelected}, m = "toChannel", n = {FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0oO0O0o<E, C extends o0OooO0<? super E>> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o0oO0O0o(o0OO.o00oOo0O<? super o0oO0O0o> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o0O0000O(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o0oO0Ooo<E> extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public o0oO0Ooo(o0OO.o00oOo0O<? super o0oO0Ooo> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O.o00oooo0(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "t1", "t2", "Lo0OO0o/o0O0o00;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lo0OO0o/o0O0o00;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o0ooO extends o0OOOOO0.o0O0OO implements o0OOOO.o0O00000<Object, Object, o0OO0o.o0O0o00<Object, Object>> {
        public static final o0ooO INSTANCE = new o0ooO();

        public o0ooO() {
            super(2);
        }

        @Override // o0OOOO.o0O00000
        @NotNull
        public final o0OO0o.o0O0o00<Object, Object> invoke(Object obj, Object obj2) {
            return new o0OO0o.o0O0o00<>(obj, obj2);
        }
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O0O0O(o0o0oo, o0o00000, null), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOOo0(o0OOo0O0.o0O0OO r4, o0OO.o00oOo0O r5) {
        /*
            boolean r0 = r5 instanceof o0OOo0O0.o0O00O.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r5
            o0OOo0O0.o0O00O$o00oOOo0 r0 = (o0OOo0O0.o0O00O.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o00oOOo0 r0 = new o0OOo0O0.o0O00O$o00oOOo0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            o0OOo0O0.o0O0OO r4 = (o0OOo0O0.o0O0OO) r4
            o0OO0o.oo0ooO.o00oo0(r5)     // Catch: java.lang.Throwable -> L4a
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o0OO0o.oo0ooO.o00oo0(r5)
            o0OOo0O0.o0O000Oo r5 = r4.iterator()     // Catch: java.lang.Throwable -> L4a
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = 0
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r0)
            return r5
        L4a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oOOo0(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O
    @NotNull
    public static final o0OOOO.o00oo<Throwable, oO0Ooooo> o00oOOoO(@NotNull o0O0OO<?> o0o0oo) {
        return new o00oOOoO(o0o0oo);
    }

    @o0OO0o.o0O
    @NotNull
    public static final o0OOOO.o00oo<Throwable, oO0Ooooo> o00oOo00(@NotNull o0O0OO<?>... o0o0ooArr) {
        return new o00oOo00(o0o0ooArr);
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E, K> o0O0OO<E> o00oOo0o(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super K>, ? extends Object> o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o00oo00O(o0o0oo, o0o00000, null), 6, null);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00oOoO(o0O0OO o0o0oo, int i, o0OO.o00oo0 o00oo0Var) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o00oo0(i, o0o0oo, null), 6, null);
    }

    public static o0O0OO o00oOoO0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oOo0o(o0o0oo, o00oo0Var, o0o00000);
    }

    public static /* synthetic */ o0O0OO o00oOoOO(o0O0OO o0o0oo, int i, o0OO.o00oo0 o00oo0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oOoO(o0o0oo, i, o00oo0Var);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00oOoOo(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o00oo0OO(o0o0oo, o0o00000, null), 6, null);
    }

    public static /* synthetic */ o0O0OO o00oOoo0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oOoOo(o0o0oo, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:26:0x005f, B:28:0x0067, B:29:0x0071), top: B:42:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:26:0x005f, B:28:0x0067, B:29:0x0071), top: B:42:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:25:0x005e). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOooO(o0OOo0O0.o0O0OO r7, o0OO.o00oOo0O r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o00oOo0O
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o00oOo0O r0 = (o0OOo0O0.o0O00O.o00oOo0O) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o00oOo0O r0 = new o0OOo0O0.o0O00O$o00oOo0O
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$2
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r2 = r0.L$1
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            java.lang.Object r4 = r0.L$0
            o0OOOOO0.o0OO0O0$o00oo00O r4 = (o0OOOOO0.o0OO0O0.o00oo00O) r4
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r7 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOOOO0.o0OO0O0$o00oo00O r8 = new o0OOOOO0.o0OO0O0$o00oo00O
            r8.<init>()
            o0OOo0O0.o0O000Oo r2 = r7.iterator()     // Catch: java.lang.Throwable -> L81
            r4 = r8
            r8 = r7
            r7 = r2
        L4c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L7e
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L7e
            r0.label = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r7.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L7e
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r6 = r2
            r2 = r8
            r8 = r6
        L5e:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L71
            r7.next()     // Catch: java.lang.Throwable -> L33
            int r8 = r4.element     // Catch: java.lang.Throwable -> L33
            int r8 = r8 + r3
            r4.element = r8     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L4c
        L71:
            o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L33
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r5)
            int r7 = r4.element
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L7e:
            r7 = move-exception
            r2 = r8
            goto L84
        L81:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L84:
            throw r7     // Catch: java.lang.Throwable -> L85
        L85:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oOooO(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:27:0x0062, B:29:0x006a, B:35:0x0079, B:36:0x0090), top: B:46:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:27:0x0062, B:29:0x006a, B:35:0x0079, B:36:0x0090), top: B:46:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005d -> B:26:0x0061). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOooo(o0OOo0O0.o0O0OO r10, int r11, o0OO.o00oOo0O r12) {
        /*
            boolean r0 = r12 instanceof o0OOo0O0.o0O00O.o00oo0O0
            if (r0 == 0) goto L13
            r0 = r12
            o0OOo0O0.o0O00O$o00oo0O0 r0 = (o0OOo0O0.o0O00O.o00oo0O0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o00oo0O0 r0 = new o0OOo0O0.o0O00O$o00oo0O0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 != r5) goto L3a
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            o0OOo0O0.o0O000Oo r2 = (o0OOo0O0.o0O000Oo) r2
            java.lang.Object r6 = r0.L$0
            o0OOo0O0.o0O0OO r6 = (o0OOo0O0.o0O0OO) r6
            o0OO0o.oo0ooO.o00oo0(r12)     // Catch: java.lang.Throwable -> L37
            goto L61
        L37:
            r10 = move-exception
            goto Lad
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            o0OO0o.oo0ooO.o00oo0(r12)
            if (r11 < 0) goto L95
            r12 = 0
            o0OOo0O0.o0O000Oo r2 = r10.iterator()     // Catch: java.lang.Throwable -> L91
        L4c:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L91
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L91
            r0.I$0 = r11     // Catch: java.lang.Throwable -> L91
            r0.I$1 = r12     // Catch: java.lang.Throwable -> L91
            r0.label = r5     // Catch: java.lang.Throwable -> L91
            java.lang.Object r6 = r2.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L91
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r9 = r6
            r6 = r10
            r10 = r12
            r12 = r9
        L61:
            r7 = 0
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L37
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L79
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Throwable -> L37
            int r8 = r10 + 1
            if (r11 != r10) goto L76
            o0OOo0O0.o0O00O0o.o00oOOo0(r6, r7)
            return r12
        L76:
            r10 = r6
            r12 = r8
            goto L4c
        L79:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r12.<init>()     // Catch: java.lang.Throwable -> L37
            r12.append(r4)     // Catch: java.lang.Throwable -> L37
            r12.append(r11)     // Catch: java.lang.Throwable -> L37
            r12.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L37
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L91:
            r11 = move-exception
            r6 = r10
            r10 = r11
            goto Lad
        L95:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r0.<init>()     // Catch: java.lang.Throwable -> L91
            r0.append(r4)     // Catch: java.lang.Throwable -> L91
            r0.append(r11)     // Catch: java.lang.Throwable -> L91
            r0.append(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L91
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L91
            throw r12     // Catch: java.lang.Throwable -> L91
        Lad:
            throw r10     // Catch: java.lang.Throwable -> Lae
        Lae:
            r11 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r6, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oOooo(o0OOo0O0.o0O0OO, int, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:30:0x0069), top: B:41:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:30:0x0069), top: B:41:0x002b }] */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oo(o0OOo0O0.o0O0OO r5, o0OO.o00oOo0O r6) {
        /*
            boolean r0 = r6 instanceof o0OOo0O0.o0O00O.o0O0000O
            if (r0 == 0) goto L13
            r0 = r6
            o0OOo0O0.o0O00O$o0O0000O r0 = (o0OOo0O0.o0O00O.o0O0000O) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O0000O r0 = new o0OOo0O0.o0O00O$o0O0000O
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            o0OOo0O0.o0O000Oo r5 = (o0OOo0O0.o0O000Oo) r5
            java.lang.Object r0 = r0.L$0
            o0OOo0O0.o0O0OO r0 = (o0OOo0O0.o0O0OO) r0
            o0OO0o.oo0ooO.o00oo0(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r5 = move-exception
            goto L6d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            o0OO0o.oo0ooO.o00oo0(r6)
            o0OOo0O0.o0O000Oo r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6a
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6a
            r0.label = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L51:
            r1 = 0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L62
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r1)
            return r5
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L6a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r6 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E> o0O0OO<E> o00oo0(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O0o(o0o0oo, o0o00000, null), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:27:0x0061, B:29:0x0069, B:24:0x0050, B:23:0x004c), top: B:45:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:27:0x0061). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oo00O(o0OOo0O0.o0O0OO r8, int r9, o0OO.o00oOo0O r10) {
        /*
            boolean r0 = r10 instanceof o0OOo0O0.o0O00O.o00oo0O
            if (r0 == 0) goto L13
            r0 = r10
            o0OOo0O0.o0O00O$o00oo0O r0 = (o0OOo0O0.o0O00O.o00oo0O) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o00oo0O r0 = new o0OOo0O0.o0O00O$o00oo0O
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            o0OOo0O0.o0O000Oo r2 = (o0OOo0O0.o0O000Oo) r2
            java.lang.Object r5 = r0.L$0
            o0OOo0O0.o0O0OO r5 = (o0OOo0O0.o0O0OO) r5
            o0OO0o.oo0ooO.o00oo0(r10)     // Catch: java.lang.Throwable -> L38
            r7 = r10
            r10 = r8
            r8 = r5
            r5 = r7
            goto L61
        L38:
            r8 = move-exception
            goto L7e
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            o0OO0o.oo0ooO.o00oo0(r10)
            if (r9 >= 0) goto L4b
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r4)
            return r4
        L4b:
            r10 = 0
            o0OOo0O0.o0O000Oo r2 = r8.iterator()     // Catch: java.lang.Throwable -> L7b
        L50:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7b
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7b
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L7b
            r0.I$1 = r10     // Catch: java.lang.Throwable -> L7b
            r0.label = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r5 = r2.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L7b
            if (r5 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L7b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L77
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L7b
            int r6 = r10 + 1
            if (r9 != r10) goto L75
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r4)
            return r5
        L75:
            r10 = r6
            goto L50
        L77:
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r4)
            return r4
        L7b:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L7e:
            throw r8     // Catch: java.lang.Throwable -> L7f
        L7f:
            r9 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo00O(o0OOo0O0.o0O0OO, int, o0OO.o00oOo0O):java.lang.Object");
    }

    public static /* synthetic */ o0O0OO o00oo0O(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O0000O o0o0000o, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oo0O0(o0o0oo, o00oo0Var, o0o0000o);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00oo0O0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O0000O o0o0000o) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o00oo(o0o0oo, o0o0000o, null), 6, null);
    }

    public static o0O0OO o00oo0OO(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oo0(o0o0oo, o00oo0Var, o0o00000);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00oo0Oo(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000) {
        return o00oo0(o0o0oo, o00oo0Var, new o00ooO0(o0o00000, null));
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E> o0O0OO<E> o00oo0o(@NotNull o0O0OO<? extends E> o0o0oo) {
        return o00oo0OO(o0o0oo, null, new o00ooO(null), 1, null);
    }

    public static /* synthetic */ o0O0OO o00oo0o0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00oo0Oo(o0o0oo, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:29:0x0069, B:21:0x0048, B:31:0x006e), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:29:0x0069, B:21:0x0048, B:31:0x006e), top: B:40:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:25:0x005a). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oo0oO(o0OOo0O0.o0O0OO r6, java.util.Collection r7, o0OO.o00oOo0O r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0 r0 = (o0OOo0O0.o0O00O.o0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0 r0 = new o0OOo0O0.o0O00O$o0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O0OO r7 = (o0OOo0O0.o0O0OO) r7
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r6 = move-exception
            goto L78
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r6.iterator()     // Catch: java.lang.Throwable -> L74
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L48:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r8
            r8 = r5
        L5a:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L6c
            r2.add(r8)     // Catch: java.lang.Throwable -> L33
        L6c:
            r8 = r2
            goto L48
        L6e:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L33
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r4)
            return r2
        L74:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L78:
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oo0oO(o0OOo0O0.o0O0OO, java.util.Collection, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0066, B:31:0x006e, B:44:0x009b, B:45:0x00a2), top: B:58:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x0030, B:38:0x0089, B:40:0x0091), top: B:54:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:29:0x0066, B:31:0x006e, B:44:0x009b, B:45:0x00a2), top: B:58:0x0048 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:37:0x0088). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooO(o0OOo0O0.o0O0OO r7, o0OO.o00oOo0O r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0O000Oo
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0O000Oo r0 = (o0OOo0O0.o0O00O.o0O000Oo) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O000Oo r0 = new o0OOo0O0.o0O00O$o0O000Oo
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            o0OOo0O0.o0O000Oo r2 = (o0OOo0O0.o0O000Oo) r2
            java.lang.Object r4 = r0.L$0
            o0OOo0O0.o0O0OO r4 = (o0OOo0O0.o0O0OO) r4
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L34
            goto L88
        L34:
            r7 = move-exception
            r2 = r4
            goto La6
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L4c
            goto L66
        L4c:
            r7 = move-exception
            goto La6
        L4e:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r7.iterator()     // Catch: java.lang.Throwable -> La3
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La3
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La3
            r0.label = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r8.o00oOOo0(r0)     // Catch: java.lang.Throwable -> La3
            if (r2 != r1) goto L62
            return r1
        L62:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4c
            r6 = r2
            r2 = r7
            r7 = r6
        L75:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La3
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La3
            r0.L$2 = r8     // Catch: java.lang.Throwable -> La3
            r0.label = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r2.o00oOOo0(r0)     // Catch: java.lang.Throwable -> La3
            if (r4 != r1) goto L84
            return r1
        L84:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L88:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L34
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L97
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L34
            r7 = r4
            goto L75
        L97:
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r5)
            return r7
        L9b:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "ReceiveChannel is empty."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L4c
            throw r7     // Catch: java.lang.Throwable -> L4c
        La3:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooO(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00ooO0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O000O(o0o0oo, o0o00000, null), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:23:0x0051, B:28:0x005e), top: B:41:0x002b }] */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooO00(o0OOo0O0.o0O0OO r5, o0OO.o00oOo0O r6) {
        /*
            boolean r0 = r6 instanceof o0OOo0O0.o0O00O.o0O000
            if (r0 == 0) goto L13
            r0 = r6
            o0OOo0O0.o0O00O$o0O000 r0 = (o0OOo0O0.o0O00O.o0O000) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O000 r0 = new o0OOo0O0.o0O00O$o0O000
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            o0OOo0O0.o0O000Oo r5 = (o0OOo0O0.o0O000Oo) r5
            java.lang.Object r0 = r0.L$0
            o0OOo0O0.o0O0OO r0 = (o0OOo0O0.o0O0OO) r0
            o0OO0o.oo0ooO.o00oo0(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r5 = move-exception
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            o0OO0o.oo0ooO.o00oo0(r6)
            o0OOo0O0.o0O000Oo r6 = r5.iterator()     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L66
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L66
            r0.label = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r6 != 0) goto L5e
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r1)
            return r1
        L5e:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r1)
            return r5
        L66:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooO00(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    public static /* synthetic */ o0O0OO o00ooO0O(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooO0(o0o0oo, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0065, B:27:0x006e, B:29:0x0078, B:32:0x0083, B:21:0x0051, B:33:0x008a), top: B:42:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0065, B:27:0x006e, B:29:0x0078, B:32:0x0083, B:21:0x0051, B:33:0x008a), top: B:42:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:25:0x0065). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooO0o(o0OOo0O0.o0O0OO r7, java.lang.Object r8, o0OO.o00oOo0O r9) {
        /*
            boolean r0 = r9 instanceof o0OOo0O0.o0O00O.o0OoOoOo
            if (r0 == 0) goto L13
            r0 = r9
            o0OOo0O0.o0O00O$o0OoOoOo r0 = (o0OOo0O0.o0O00O.o0OoOoOo) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0OoOoOo r0 = new o0OOo0O0.o0O00O$o0OoOoOo
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$3
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r8 = r0.L$2
            o0OOo0O0.o0O0OO r8 = (o0OOo0O0.o0O0OO) r8
            java.lang.Object r2 = r0.L$1
            o0OOOOO0.o0OO0O0$o00oo00O r2 = (o0OOOOO0.o0OO0O0.o00oo00O) r2
            java.lang.Object r4 = r0.L$0
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L35
            goto L65
        L35:
            r7 = move-exception
            goto L9a
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            o0OO0o.oo0ooO.o00oo0(r9)
            o0OOOOO0.o0OO0O0$o00oo00O r9 = new o0OOOOO0.o0OO0O0$o00oo00O
            r9.<init>()
            o0OOo0O0.o0O000Oo r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L51:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L35
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r7.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != r1) goto L62
            return r1
        L62:
            r6 = r4
            r4 = r9
            r9 = r6
        L65:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L35
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L35
            boolean r9 = o0OOOOO0.o0ooO.o00oOoO0(r4, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L83
            int r7 = r2.element     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L35
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r5)
            return r9
        L83:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L35
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L35
            r9 = r4
            goto L51
        L8a:
            o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L35
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r5)
            r7 = -1
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooO0o(o0OOo0O0.o0O0OO, java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:20:0x0049, B:29:0x0067, B:33:0x0073), top: B:55:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:39:0x008d, B:41:0x0095), top: B:53:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0089 -> B:39:0x008d). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooOO(o0OOo0O0.o0O0OO r7, o0OO.o00oOo0O r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0O00
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0O00 r0 = (o0OOo0O0.o0O00O.o0O00) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O00 r0 = new o0OOo0O0.o0O00O$o0O00
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            o0OOo0O0.o0O000Oo r2 = (o0OOo0O0.o0O000Oo) r2
            java.lang.Object r4 = r0.L$0
            o0OOo0O0.o0O0OO r4 = (o0OOo0O0.o0O0OO) r4
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L35
            goto L8d
        L35:
            r7 = move-exception
            r2 = r4
            goto La2
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L4d
            goto L67
        L4d:
            r7 = move-exception
            goto La2
        L4f:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9f
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9f
            r0.label = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r2 = r8.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L9f
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r8 != 0) goto L73
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r5)
            return r5
        L73:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4d
            r6 = r2
            r2 = r7
            r7 = r6
        L7a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9f
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L9f
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9f
            r0.label = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r2.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L9f
            if (r4 != r1) goto L89
            return r1
        L89:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L35
            r7 = r4
            goto L7a
        L9b:
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r5)
            return r7
        L9f:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La2:
            throw r7     // Catch: java.lang.Throwable -> La3
        La3:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooOO(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0073, B:27:0x007c, B:29:0x0086, B:30:0x008a, B:21:0x005d, B:31:0x0091), top: B:42:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0073, B:27:0x007c, B:29:0x0086, B:30:0x008a, B:21:0x005d, B:31:0x0091), top: B:42:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:25:0x0073). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooOO0(o0OOo0O0.o0O0OO r8, java.lang.Object r9, o0OO.o00oOo0O r10) {
        /*
            boolean r0 = r10 instanceof o0OOo0O0.o0O00O.o0O000o0
            if (r0 == 0) goto L13
            r0 = r10
            o0OOo0O0.o0O00O$o0O000o0 r0 = (o0OOo0O0.o0O00O.o0O000o0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O000o0 r0 = new o0OOo0O0.o0O00O$o0O000o0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r8 = r0.L$4
            o0OOo0O0.o0O000Oo r8 = (o0OOo0O0.o0O000Oo) r8
            java.lang.Object r9 = r0.L$3
            o0OOo0O0.o0O0OO r9 = (o0OOo0O0.o0O0OO) r9
            java.lang.Object r2 = r0.L$2
            o0OOOOO0.o0OO0O0$o00oo00O r2 = (o0OOOOO0.o0OO0O0.o00oo00O) r2
            java.lang.Object r4 = r0.L$1
            o0OOOOO0.o0OO0O0$o00oo00O r4 = (o0OOOOO0.o0OO0O0.o00oo00O) r4
            java.lang.Object r5 = r0.L$0
            o0OO0o.oo0ooO.o00oo0(r10)     // Catch: java.lang.Throwable -> L39
            goto L73
        L39:
            r8 = move-exception
            goto La2
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            o0OO0o.oo0ooO.o00oo0(r10)
            o0OOOOO0.o0OO0O0$o00oo00O r10 = new o0OOOOO0.o0OO0O0$o00oo00O
            r10.<init>()
            r2 = -1
            r10.element = r2
            o0OOOOO0.o0OO0O0$o00oo00O r2 = new o0OOOOO0.o0OO0O0$o00oo00O
            r2.<init>()
            o0OOo0O0.o0O000Oo r4 = r8.iterator()     // Catch: java.lang.Throwable -> L9e
            r7 = r9
            r9 = r8
            r8 = r4
            r4 = r10
            r10 = r7
        L5d:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L39
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L39
            r0.L$3 = r9     // Catch: java.lang.Throwable -> L39
            r0.L$4 = r8     // Catch: java.lang.Throwable -> L39
            r0.label = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r8.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L39
            if (r5 != r1) goto L70
            return r1
        L70:
            r7 = r5
            r5 = r10
            r10 = r7
        L73:
            r6 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L39
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L91
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L39
            boolean r10 = o0OOOOO0.o0ooO.o00oOoO0(r5, r10)     // Catch: java.lang.Throwable -> L39
            if (r10 == 0) goto L8a
            int r10 = r2.element     // Catch: java.lang.Throwable -> L39
            r4.element = r10     // Catch: java.lang.Throwable -> L39
        L8a:
            int r10 = r2.element     // Catch: java.lang.Throwable -> L39
            int r10 = r10 + r3
            r2.element = r10     // Catch: java.lang.Throwable -> L39
            r10 = r5
            goto L5d
        L91:
            o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L39
            o0OOo0O0.o0O00O0o.o00oOOo0(r9, r6)
            int r8 = r4.element
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        L9e:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        La2:
            throw r8     // Catch: java.lang.Throwable -> La3
        La3:
            r10 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooOO0(o0OOo0O0.o0O0OO, java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E, R> o0O0OO<R> o00ooOOo(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O00000<? super E, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O00O0(o0o0oo, o0o00000, null), 6, null);
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E, R> o0O0OO<R> o00ooOo(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O0000O<? super Integer, ? super E, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0OoO00O(o0o0oo, o0o0000o, null), 6, null);
    }

    public static o0O0OO o00ooOo0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooOOo(o0o0oo, o00oo0Var, o0o00000);
    }

    public static o0O0OO o00ooOoO(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O0000O o0o0000o, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooOo(o0o0oo, o00oo0Var, o0o0000o);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00ooOoo(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O0000O o0o0000o) {
        return o00oo0o(o00ooOo(o0o0oo, o00oo0Var, o0o0000o));
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00ooo0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000) {
        return o00oo0o(o00ooOOo(o0o0oo, o00oo0Var, o0o00000));
    }

    public static /* synthetic */ o0O0OO o00ooo00(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O0000O o0o0000o, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooOoo(o0o0oo, o00oo0Var, o0o0000o);
    }

    public static /* synthetic */ o0O0OO o00ooo0O(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooo0(o0o0oo, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:21:0x0057, B:30:0x0079, B:34:0x0085), top: B:57:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #2 {all -> 0x00bd, blocks: (B:40:0x00a2, B:42:0x00aa, B:36:0x008d, B:26:0x0061), top: B:59:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009e -> B:15:0x003b). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00ooo0o(o0OOo0O0.o0O0OO r8, java.util.Comparator r9, o0OO.o00oOo0O r10) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00ooo0o(o0OOo0O0.o0O0OO, java.util.Comparator, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:21:0x0057, B:30:0x0079, B:34:0x0085), top: B:57:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #2 {all -> 0x00bd, blocks: (B:40:0x00a2, B:42:0x00aa, B:36:0x008d, B:26:0x0061), top: B:59:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009e -> B:15:0x003b). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oooO(o0OOo0O0.o0O0OO r8, java.util.Comparator r9, o0OO.o00oOo0O r10) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oooO(o0OOo0O0.o0O0OO, java.util.Comparator, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oooOO(o0OOo0O0.o0O0OO r4, o0OO.o00oOo0O r5) {
        /*
            boolean r0 = r5 instanceof o0OOo0O0.o0O00O.o0O00OO
            if (r0 == 0) goto L13
            r0 = r5
            o0OOo0O0.o0O00O$o0O00OO r0 = (o0OOo0O0.o0O00O.o0O00OO) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O00OO r0 = new o0OOo0O0.o0O00O$o0O00OO
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            o0OOo0O0.o0O0OO r4 = (o0OOo0O0.o0O0OO) r4
            o0OO0o.oo0ooO.o00oo0(r5)     // Catch: java.lang.Throwable -> L58
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o0OO0o.oo0ooO.o00oo0(r5)
            o0OOo0O0.o0O000Oo r5 = r4.iterator()     // Catch: java.lang.Throwable -> L58
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L58
            r0.label = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r5.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L58
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = 0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L58
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L58
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r0)
            return r5
        L58:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oooOO(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0049, blocks: (B:20:0x0045, B:29:0x0063, B:33:0x006f), top: B:55:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oooo(o0OOo0O0.o0O0OO r7, o0OO.o00oOo0O r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0O00o00
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0O00o00 r0 = (o0OOo0O0.o0O00O.o0O00o00) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O00o00 r0 = new o0OOo0O0.o0O00O$o0O00o00
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            o0OOo0O0.o0O0OO r0 = (o0OOo0O0.o0O0OO) r0
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L31
            goto L84
        L31:
            r7 = move-exception
            r2 = r0
            goto L97
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L49
            goto L63
        L49:
            r7 = move-exception
            goto L97
        L4b:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r7.iterator()     // Catch: java.lang.Throwable -> L94
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L94
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L94
            r0.label = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L49
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L49
            if (r8 != 0) goto L6f
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r5)
            return r5
        L6f:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L49
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L49
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L49
            r0.label = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r7 = r7.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L49
            if (r7 != r1) goto L80
            return r1
        L80:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L84:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L90
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r5)
            return r5
        L90:
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r5)
            return r7
        L94:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L97:
            throw r7     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oooo(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:20:0x0044, B:29:0x0062, B:31:0x006a, B:42:0x0094, B:43:0x009b), top: B:54:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #1 {all -> 0x0030, blocks: (B:13:0x002c, B:36:0x0080, B:40:0x008c, B:41:0x0093), top: B:52:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {all -> 0x0048, blocks: (B:20:0x0044, B:29:0x0062, B:31:0x006a, B:42:0x0094, B:43:0x009b), top: B:54:0x0044 }] */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oooo0(o0OOo0O0.o0O0OO r6, o0OO.o00oOo0O r7) {
        /*
            boolean r0 = r7 instanceof o0OOo0O0.o0O00O.o0oO0Ooo
            if (r0 == 0) goto L13
            r0 = r7
            o0OOo0O0.o0O00O$o0oO0Ooo r0 = (o0OOo0O0.o0O00O.o0oO0Ooo) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0oO0Ooo r0 = new o0OOo0O0.o0O00O$o0oO0Ooo
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            java.lang.Object r0 = r0.L$0
            o0OOo0O0.o0O0OO r0 = (o0OOo0O0.o0O0OO) r0
            o0OO0o.oo0ooO.o00oo0(r7)     // Catch: java.lang.Throwable -> L30
            goto L7f
        L30:
            r6 = move-exception
            r2 = r0
            goto L9f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$1
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            o0OO0o.oo0ooO.o00oo0(r7)     // Catch: java.lang.Throwable -> L48
            goto L62
        L48:
            r6 = move-exception
            goto L9f
        L4a:
            o0OO0o.oo0ooO.o00oo0(r7)
            o0OOo0O0.o0O000Oo r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9c
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9c
            r0.label = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r7.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L62:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L94
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L48
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L48
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L7f:
            r1 = 0
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L30
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L8c
            o0OOo0O0.o0O00O0o.o00oOOo0(r0, r1)
            return r6
        L8c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L30
        L94:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L48
            throw r6     // Catch: java.lang.Throwable -> L48
        L9c:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L9f:
            throw r6     // Catch: java.lang.Throwable -> La0
        La0:
            r7 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o00oooo0(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o00ooooO(o0O0OO o0o0oo, int i, o0OO.o00oo0 o00oo0Var) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O00oO0(i, o0o0oo, null), 6, null);
    }

    public static /* synthetic */ o0O0OO o00ooooo(o0O0OO o0o0oo, int i, o0OO.o00oo0 o00oo0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o00ooooO(o0o0oo, i, o00oo0Var);
    }

    public static o0O0OO o0O00(o0O0OO o0o0oo, o0O0OO o0o0oo2, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 2) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o0O000oo(o0o0oo, o0o0oo2, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x0076), top: B:39:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x0076), top: B:39:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:25:0x005a). Please submit an issue!!! */
    @o0OO0o.o0O
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object o0O000(@org.jetbrains.annotations.NotNull o0OOo0O0.o0O0OO<? extends o0OO0o.o0O0o00<? extends K, ? extends V>> r6, @org.jetbrains.annotations.NotNull M r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super M> r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0O0O0Oo
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0O0O0Oo r0 = (o0OOo0O0.o0O00O.o0O0O0Oo) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O0O0Oo r0 = new o0OOo0O0.o0O00O$o0O0O0Oo
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O0OO r7 = (o0OOo0O0.o0O0OO) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r6 = move-exception
            goto L80
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7c
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L48:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r8
            r8 = r5
        L5a:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L76
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            o0OO0o.o0O0o00 r8 = (o0OO0o.o0O0o00) r8     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L33
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L48
        L76:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L33
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r4)
            return r2
        L7c:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L80:
            throw r6     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O000(o0OOo0O0.o0O0OO, java.util.Map, o0OO.o00oOo0O):java.lang.Object");
    }

    public static /* synthetic */ o0O0OO o0O00000(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o0(o0o0oo, o00oo0Var, o0o00000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:13:0x0032, B:29:0x006f, B:31:0x0077, B:34:0x008a, B:18:0x004d), top: B:45:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:13:0x0032, B:29:0x006f, B:31:0x0077, B:34:0x008a, B:18:0x004d), top: B:45:0x0020 }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14, types: [o0OOo0O0.o0O0OO] */
    /* JADX WARN: Type inference failed for: r8v2, types: [o0OOo0O0.o0O0OO] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, o0OOo0O0.o0O0OO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:14:0x0035). Please submit an issue!!! */
    @o0OO0o.o0O
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends o0OOo0O0.o0OooO0<? super E>> java.lang.Object o0O0000O(@org.jetbrains.annotations.NotNull o0OOo0O0.o0O0OO<? extends E> r7, @org.jetbrains.annotations.NotNull C r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super C> r9) {
        /*
            boolean r0 = r9 instanceof o0OOo0O0.o0O00O.o0oO0O0o
            if (r0 == 0) goto L13
            r0 = r9
            o0OOo0O0.o0O00O$o0oO0O0o r0 = (o0OOo0O0.o0O00O.o0oO0O0o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0oO0O0o r0 = new o0OOo0O0.o0O00O$o0oO0O0o
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r8 = r0.L$1
            o0OOo0O0.o0O0OO r8 = (o0OOo0O0.o0O0OO) r8
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0OooO0 r2 = (o0OOo0O0.o0OooO0) r2
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L51
        L35:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L5a
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$2
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r8 = r0.L$1
            o0OOo0O0.o0O0OO r8 = (o0OOo0O0.o0O0OO) r8
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0OooO0 r2 = (o0OOo0O0.o0OooO0) r2
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L51
            goto L6e
        L51:
            r7 = move-exception
            goto L94
        L53:
            o0OO0o.oo0ooO.o00oo0(r9)
            o0OOo0O0.o0O000Oo r9 = r7.iterator()     // Catch: java.lang.Throwable -> L90
        L5a:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L90
            r0.label = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r9.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L90
            if (r2 != r1) goto L69
            return r1
        L69:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L6e:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L51
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L51
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L51
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L51
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L51
            r0.label = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r9 = r2.o00ooOo(r9, r0)     // Catch: java.lang.Throwable -> L51
            if (r9 != r1) goto L35
            return r1
        L8a:
            o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L51
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r5)
            return r2
        L90:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L94:
            throw r7     // Catch: java.lang.Throwable -> L95
        L95:
            r9 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0000O(o0OOo0O0.o0O0OO, o0OOo0O0.o0OooO0, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x006c), top: B:39:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x006c), top: B:39:0x002f }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:25:0x005a). Please submit an issue!!! */
    @o0OO0o.o0O
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object o0O0000o(@org.jetbrains.annotations.NotNull o0OOo0O0.o0O0OO<? extends E> r6, @org.jetbrains.annotations.NotNull C r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super C> r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O.o0O0oo0o
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O$o0O0oo0o r0 = (o0OOo0O0.o0O00O.o0O0oo0o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O0oo0o r0 = new o0OOo0O0.o0O00O$o0O0oo0o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O0OO r7 = (o0OOo0O0.o0O0OO) r7
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r6 = move-exception
            goto L76
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r6.iterator()     // Catch: java.lang.Throwable -> L72
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L48:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r8
            r8 = r5
        L5a:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            r2.add(r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L48
        L6c:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L33
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r4)
            return r2
        L72:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L76:
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0000o(o0OOo0O0.o0O0OO, java.util.Collection, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final Object o0O000O(o0O0OO o0o0oo, o0OO.o00oOo0O o00ooo0o2) {
        return o0O000(o0o0oo, new LinkedHashMap(), o00ooo0o2);
    }

    @o0OO0o.o0O
    @Nullable
    public static final <E> Object o0O000Oo(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oOo0O<? super Set<E>> o00ooo0o2) {
        return o0O0000o(o0o0oo, new LinkedHashSet(), o00ooo0o2);
    }

    public static /* synthetic */ o0O0OO o0O000o(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OOO00.o00oOoO0();
        }
        return o0O000o0(o0o0oo, o00oo0Var);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final o0O0OO o0O000o0(o0O0OO o0o0oo, o0OO.o00oo0 o00oo0Var) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOOoO(o0o0oo), new o0O0O0o0(o0o0oo, null), 6, null);
    }

    @o0OO0o.o0O
    @NotNull
    public static final <E, R, V> o0O0OO<V> o0O000oo(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0O0OO<? extends R> o0o0oo2, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0OOOO.o0O00000<? super E, ? super R, ? extends V> o0o00000) {
        return o0OOo0O0.o0O0O0Oo.o00oOoO0(oO000.f14062o00oo0O0, o00oo0Var, 0, null, new o00oOo00(new o0O0OO[]{o0o0oo, o0o0oo2}), new o0O0OO0(o0o0oo2, o0o0oo, o0o00000, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:25:0x0060, B:29:0x0073, B:31:0x007c, B:33:0x0082, B:37:0x0095, B:24:0x005c), top: B:49:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:25:0x0060, B:29:0x0073, B:31:0x007c, B:33:0x0082, B:37:0x0095, B:24:0x005c), top: B:49:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o0OOo0O0.o0OooO0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8, types: [o0OOo0O0.o0O0OO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0091 -> B:25:0x0060). Please submit an issue!!! */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o0O0o(o0OOo0O0.o0O0OO r7, o0OOo0O0.o0OooO0 r8, o0OO.o00oOo0O r9) {
        /*
            boolean r0 = r9 instanceof o0OOo0O0.o0O00O.o0O00000
            if (r0 == 0) goto L13
            r0 = r9
            o0OOo0O0.o0O00O$o0O00000 r0 = (o0OOo0O0.o0O00O.o0O00000) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O$o0O00000 r0 = new o0OOo0O0.o0O00O$o0O00000
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r8 = r0.L$1
            o0OOo0O0.o0O0OO r8 = (o0OOo0O0.o0O0OO) r8
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0OooO0 r2 = (o0OOo0O0.o0OooO0) r2
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L57
            r9 = r7
            r7 = r8
            r8 = r2
            goto L60
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$2
            o0OOo0O0.o0O000Oo r7 = (o0OOo0O0.o0O000Oo) r7
            java.lang.Object r8 = r0.L$1
            o0OOo0O0.o0O0OO r8 = (o0OOo0O0.o0O0OO) r8
            java.lang.Object r2 = r0.L$0
            o0OOo0O0.o0OooO0 r2 = (o0OOo0O0.o0OooO0) r2
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L57
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r2
        L54:
            r2 = r1
            r1 = r6
            goto L73
        L57:
            r7 = move-exception
            goto L9f
        L59:
            o0OO0o.oo0ooO.o00oo0(r9)
            o0OOo0O0.o0O000Oo r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L9b
            r0.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r9.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L6f
            return r1
        L6f:
            r6 = r0
            r0 = r9
            r9 = r2
            goto L54
        L73:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L95
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L91
            r1.L$0 = r8     // Catch: java.lang.Throwable -> L9b
            r1.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r1.L$2 = r0     // Catch: java.lang.Throwable -> L9b
            r1.label = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r8.o00ooOo(r9, r1)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r2) goto L91
            return r2
        L91:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L60
        L95:
            o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L9b
            o0OOo0O0.o0O00O0o.o00oOOo0(r7, r5)
            return r8
        L9b:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9f:
            throw r7     // Catch: java.lang.Throwable -> La0
        La0:
            r9 = move-exception
            o0OOo0O0.o0O00O0o.o00oOOo0(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O.o0O0o(o0OOo0O0.o0O0OO, o0OOo0O0.o0OooO0, o0OO.o00oOo0O):java.lang.Object");
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final Object o0OoOoOO(o0O0OO o0o0oo, o0OO.o00oOo0O o00ooo0o2) {
        return o0O000Oo(o0o0oo, o00ooo0o2);
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.HIDDEN, message = "Binary compatibility")
    public static final Object o0OoOoOo(o0O0OO o0o0oo, o0OO.o00oOo0O o00ooo0o2) {
        return o0O0000o(o0o0oo, new ArrayList(), o00ooo0o2);
    }
}
