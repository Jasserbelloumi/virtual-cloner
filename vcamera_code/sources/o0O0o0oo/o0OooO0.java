package o0O0o0oo;

import android.content.Context;
import android.support.v4.media.o00oOo0O;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.o0oO0O0o;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u009c\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003:\u0002puB\u001b\u0012\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001\u0012\u0006\u0010r\u001a\u00020+¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\u0014\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002Jo\u0010\u001c\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00152M\u0010\u001b\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017H\u0002J.\u0010\u001f\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dH\u0002J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020 JY\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002K\u0010#\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u0017JY\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002K\u0010#\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u0017JY\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002K\u0010#\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u0017JY\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002K\u0010#\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u0017J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020(J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\rJ\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/J\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001J\u0006\u00103\u001a\u00020\rJ\u0012\u00104\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010J(\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\r2\b\b\u0002\u00107\u001a\u00020\rJ3\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u00109\u0018\u00012\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\r2\b\b\u0002\u00107\u001a\u00020\rH\u0086\bJ4\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\r2\b\b\u0002\u00107\u001a\u00020\rJ0\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/2\b\b\u0002\u00106\u001a\u00020\r2\b\b\u0002\u00107\u001a\u00020\rJ\u0015\u0010A\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bC\u0010DJ\u0014\u0010E\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000/J\u001c\u0010F\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000/J\u001f\u0010H\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010G\u001a\u00020\r¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020\rJ'\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010K\u001a\u00028\u00002\b\b\u0002\u0010G\u001a\u00020\r¢\u0006\u0004\bL\u0010MJ\u0014\u0010N\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0016\u0010Q\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0006J\u001a\u0010S\u001a\u00020\b2\b\b\u0002\u0010R\u001a\u00020\r2\b\b\u0002\u00107\u001a\u00020\rJ\u0015\u0010T\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bT\u0010BJ\u000e\u0010U\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010V\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ \u0010W\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0012\u0010X\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010Y\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010Z\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0015\u0010[\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b[\u0010BJ\u0014\u0010\\\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u001c\u0010]\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\b\u0002\u00107\u001a\u00020\rJ\u0006\u0010^\u001a\u00020\bJ\u0018\u0010a\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u00012\b\b\u0002\u0010`\u001a\u00020\rJ\u0010\u0010b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0006\u0010c\u001a\u00020\u0006J\b\u0010d\u001a\u00020\u0006H\u0016J\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020\u0006H\u0016J\u001d\u0010i\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bi\u0010\nJ\u001e\u0010j\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J,\u0010k\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0016J\u0016\u0010l\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016J\u0016\u0010m\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016J\u0016\u0010n\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016J\u0016\u0010o\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016R\u0014\u0010r\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010?\u001a\u0012\u0012\u0004\u0012\u00028\u00000sj\b\u0012\u0004\u0012\u00028\u0000`t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR$\u0010{\u001a\u0012\u0012\u0004\u0012\u00028\u00000wj\b\u0012\u0004\u0012\u00028\u0000`x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR]\u0010~\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R^\u0010\u0080\u0001\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R\u0018\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R?\u0010\u0087\u0001\u001a(\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00120\u0083\u0001j\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0012`\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0018\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0082\u0001R\u0017\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010qR_\u0010\u0095\u0001\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010}R_\u0010\u0097\u0001\u001aI\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010}¨\u0006\u009d\u0001"}, d2 = {"Lo0O0o0oo/o0OooO0;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/RecyclerView$o00oo0OO;", "Lo0O0o0oo/oo0OOoo;", "item", "", FirebaseAnalytics.Param.INDEX, "Lo0OO0o/oO0Ooooo;", "o0O00o00", "(Ljava/lang/Object;I)V", "", "list", "", "strictCheck", "o00ooO0o", "Ljava/lang/Class;", "clazz", "Lo0O0o0oo/o0OooO0$o00oOOoO;", "o00oooo0", "holder", "Landroid/view/View;", "view", "Lkotlin/Function3;", "Lo0OO0o/o0O0o00O;", "name", "position", "clicker", "o0O000o", "", "payloads", "o00ooOoO", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "o00ooOo", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o0O0O0Oo", "o0O0O0o0", "o0O0OOOo", "o0O0OOoo", "Lo0O0o0oo/o0O0o00;", "lifecycleHandler", "o0O0O0oo", "Lo0O0o0oo/o0O0o000;", "stateHolderFactory", "autoShowEmptyState", "o0O0OOo", "", "o00oooo", "", "o00ooooo", "o0", "o0O00000", "selectable", "clearSelections", "needNotify", "o0O0OO0O", "B", "Lo0O0o0oo/o0O0o00O;", "strategy", "clearItsSelections", "o0O0OO0", "o0ooO", FirebaseAnalytics.Param.ITEMS, "o0O0O0o", "o00ooOO", "(Ljava/lang/Object;)V", "o00ooOO0", "(ILjava/lang/Object;)V", "o00ooOo0", "o00ooOOo", "shouldNotify", "o0O00O0", "(Ljava/lang/Object;Z)V", "o0O00O0o", "newOne", "o0O00Oo", "(ILjava/lang/Object;Z)V", "o0O00OO", "fromIndex", "toIndex", "o0O00OOO", "alsoSelections", "o00ooOoo", "o0O00Ooo", "o0O00o", "o0O00oO0", "o0oO0O0o", "o0O00OoO", "o0O00o0O", "o00oooOO", "o00ooo0O", "o00oooOo", "o00ooo0", "o00oooO", "state", "isEmptyState", "o0OooO0", "getItemViewType", "o00ooooO", "getItemCount", "Landroid/view/ViewGroup;", "parent", "viewType", "o0O000", "o0O0Oo0O", "o0O0000O", "o0O0000o", "o0O00", "o0O000o0", "o0ooOoOO", "o0O000oo", "o00oOOo0", "Lo0O0o0oo/o0O0o000;", "rvHolderFactory", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/util/ArrayList;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "o00oOo00", "Ljava/util/HashSet;", "selections", "o00oOooO", "Lo0OOOO/o0O0000O;", "itemClickListener", "o00oOo0O", "itemLongClickListener", "o00oOo0o", "Z", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "o00oOoO0", "Ljava/util/HashMap;", "itemInfoMap", "o00oOoO", "I", "tempPosition", "o00oOoOO", "Lo0O0o0oo/o0O0o00;", "o00oOoOo", "Ljava/lang/Object;", "normalState", "o00oOoo0", "emptyState", "o00oOooo", "o00oo00O", "o00oo0", "stateClickListener", "o00oo0OO", "stateLongClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lo0O0o0oo/o0O0o000;)V", "o00oo0O0", "adapter_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class o0OooO0<T> extends RecyclerView.o00oo0OO<oo0OOoo<Object>> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f12652o00oo0O = "此类型数据当前不可选中！";
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o00oOOo0 f12653o00oo0O0 = new o00oOOo0(null);

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f12654o00oo0Oo = 10101;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f12655o00oo0o = 10103;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f12656o00oo0o0 = 10102;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f12657o00oo0oO = 10104;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f12658o0O0o = 10105;
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0o000 f12659o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayList<T> f12660o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final HashSet<T> f12661o00oOo00;
    @Nullable

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> f12662o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f12663o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f12664o00oOoO;
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public HashMap<Class<?>, o00oOOoO> f12665o00oOoO0;
    @Nullable

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o0O0o00 f12666o00oOoOO;
    @Nullable

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public Object f12667o00oOoOo;
    @Nullable

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public Object f12668o00oOoo0;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> f12669o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f12670o00oOooo;
    @Nullable

    /* renamed from: o00oo0  reason: collision with root package name */
    public o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> f12671o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o0O0o000 f12672o00oo00O;
    @Nullable

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> f12673o00oo0OO;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lo0O0o0oo/o0OooO0$o00oOOo0;", "", "", "FLAG_DESELECTED", "I", "FLAG_ITEM_CHANGED", "FLAG_SELECTABLE", "FLAG_SELECTED", "FLAG_UNSELECTABLE", "", "TIP_SELECT_DISABLED", "Ljava/lang/String;", "<init>", "()V", "adapter_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lo0O0o0oo/o0OooO0$o00oOOoO;", "", "", "o00oOOo0", "", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "viewType", "selectable", "multiSelectable", "o00oOooO", "", "toString", "hashCode", "other", "equals", "I", "o00oOoO", "()I", "Z", "o00oOoO0", "()Z", "o00oOoOo", "(Z)V", "o00oOo0o", "o00oOoOO", "<init>", "(IZZ)V", "adapter_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f12674o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f12675o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f12676o00oOo00;

        public o00oOOoO() {
            this(0, false, false, 7, null);
        }

        public o00oOOoO(int i, boolean z, boolean z2) {
            this.f12674o00oOOo0 = i;
            this.f12675o00oOOoO = z;
            this.f12676o00oOo00 = z2;
        }

        public /* synthetic */ o00oOOoO(int i, boolean z, boolean z2, int i2, o0O00 o0o00) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
        }

        public static o00oOOoO o00oOo0O(o00oOOoO o00ooooo2, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = o00ooooo2.f12674o00oOOo0;
            }
            if ((i2 & 2) != 0) {
                z = o00ooooo2.f12675o00oOOoO;
            }
            if ((i2 & 4) != 0) {
                z2 = o00ooooo2.f12676o00oOo00;
            }
            o00ooooo2.getClass();
            return new o00oOOoO(i, z, z2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o00oOOoO) {
                o00oOOoO o00ooooo2 = (o00oOOoO) obj;
                return this.f12674o00oOOo0 == o00ooooo2.f12674o00oOOo0 && this.f12675o00oOOoO == o00ooooo2.f12675o00oOOoO && this.f12676o00oOo00 == o00ooooo2.f12676o00oOo00;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f12674o00oOOo0) * 31;
            boolean z = this.f12675o00oOOoO;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.f12676o00oOo00;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final int o00oOOo0() {
            return this.f12674o00oOOo0;
        }

        public final boolean o00oOOoO() {
            return this.f12675o00oOOoO;
        }

        public final boolean o00oOo00() {
            return this.f12676o00oOo00;
        }

        public final boolean o00oOo0o() {
            return this.f12676o00oOo00;
        }

        public final int o00oOoO() {
            return this.f12674o00oOOo0;
        }

        public final boolean o00oOoO0() {
            return this.f12675o00oOOoO;
        }

        public final void o00oOoOO(boolean z) {
            this.f12676o00oOo00 = z;
        }

        public final void o00oOoOo(boolean z) {
            this.f12675o00oOOoO = z;
        }

        @NotNull
        public final o00oOOoO o00oOooO(int i, boolean z, boolean z2) {
            return new o00oOOoO(i, z, z2);
        }

        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ItemInfo(viewType=");
            o00oOOo02.append(this.f12674o00oOOo0);
            o00oOOo02.append(", selectable=");
            o00oOOo02.append(this.f12675o00oOOoO);
            o00oOOo02.append(", multiSelectable=");
            o00oOOo02.append(this.f12676o00oOo00);
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    public o0OooO0(@NotNull Context context, @NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "rvHolderFactory");
        this.f12659o00oOOo0 = o0o0o000;
        this.f12660o00oOOoO = new ArrayList<>();
        this.f12661o00oOo00 = new HashSet<>();
        this.f12665o00oOoO0 = new HashMap<>();
        this.f12670o00oOooo = true;
        LayoutInflater from = LayoutInflater.from(context);
        o0OOOOO0.o0ooO.o00oo0OO(from, "from(context)");
        o0o0o000.o00oOo0O(from);
    }

    public static /* synthetic */ void o00ooO(o0OooO0 o0oooo0, Collection collection, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        o0oooo0.o00ooO0o(collection, z);
    }

    public static /* synthetic */ void o00ooo00(o0OooO0 o0oooo0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        o0oooo0.o00ooOoo(z, z2);
    }

    public static /* synthetic */ void o00ooo0o(o0OooO0 o0oooo0, Class cls, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        o0oooo0.o00ooo0(cls, z);
    }

    public static final void o0O000O(o0O0000O o0o0000o, Object obj, oo0OOoo oo0oooo, View view) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "$this_run");
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "$holder");
        o0OOOOO0.o0ooO.o00oo0OO(view, "it");
        o0o0000o.invoke(view, obj, Integer.valueOf(oo0oooo.getBindingAdapterPosition()));
    }

    public static final void o0O000Oo(o0OooO0 o0oooo0, oo0OOoo oo0oooo, o0O0000O o0o0000o, View view) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oooo0, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "$holder");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "$this_run");
        o0OOOOO0.o0ooO.o00oo0OO(view, "it");
        o0oooo0.o0O000o(oo0oooo, view, o0o0000o);
    }

    public static /* synthetic */ void o0O00O(o0OooO0 o0oooo0, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        o0oooo0.o0O00O0o(i, z);
    }

    public static /* synthetic */ void o0O00o0o(o0OooO0 o0oooo0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0oooo0.o0O00o0O(z);
    }

    public static /* synthetic */ void o0O0O0O(o0OooO0 o0oooo0, Collection collection, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        o0oooo0.o0O00oO0(collection, z);
    }

    public static /* synthetic */ o0OooO0 o0O0O0oO(o0OooO0 o0oooo0, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return o0oooo0.o0O0O0o(list, z, z2);
    }

    public static /* synthetic */ o0OooO0 o0O0OO(o0OooO0 o0oooo0, Class cls, o0O0o00O o0o0o00o, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return o0oooo0.o0ooO(cls, o0o0o00o, z, z2);
    }

    public static /* synthetic */ o0OooO0 o0O0OOO(o0OooO0 o0oooo0, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return o0oooo0.o0O0OO0O(z, z2, z3);
    }

    public static o0OooO0 o0O0OOO0(o0OooO0 o0oooo0, o0O0o00O o0o0o00o, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "strategy");
        o0OOOOO0.o0ooO.o00oooOo();
        return o0oooo0.o0ooO(Object.class, o0o0o00o, z, z2);
    }

    public static /* synthetic */ o0OooO0 o0O0OOoO(o0OooO0 o0oooo0, o0O0o000 o0o0o000, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return o0oooo0.o0O0OOo(o0o0o000, z);
    }

    public static /* synthetic */ void o0O0Oo0(o0OooO0 o0oooo0, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        o0oooo0.o0OooO0(obj, z);
    }

    public static /* synthetic */ void o0O0oo0o(o0OooO0 o0oooo0, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        o0oooo0.o0oO0O0o(i, i2, z);
    }

    public static /* synthetic */ void o0OoO00O(o0OooO0 o0oooo0, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        o0oooo0.o0O00O0(obj, z);
    }

    public static final boolean o0OoOoOO(o0OooO0 o0oooo0, oo0OOoo oo0oooo, o0O0000O o0o0000o, View view) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oooo0, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "$holder");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "$this_run");
        o0OOOOO0.o0ooO.o00oo0OO(view, "it");
        o0oooo0.o0O000o(oo0oooo, view, o0o0000o);
        return true;
    }

    public static final boolean o0OoOoOo(o0O0000O o0o0000o, Object obj, oo0OOoo oo0oooo, View view) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "$this_run");
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "$holder");
        o0OOOOO0.o0ooO.o00oo0OO(view, "it");
        o0o0000o.invoke(view, obj, Integer.valueOf(oo0oooo.getBindingAdapterPosition()));
        return true;
    }

    public static /* synthetic */ void o0oO0Ooo(o0OooO0 o0oooo0, int i, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        o0oooo0.o0O00Oo(i, obj, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemCount() {
        if (this.f12660o00oOOoO.isEmpty()) {
            return (this.f12667o00oOoOo == null && this.f12668o00oOoo0 == null) ? 0 : 1;
        }
        this.f12667o00oOoOo = null;
        if (!this.f12670o00oOooo) {
            this.f12668o00oOoo0 = null;
        }
        return this.f12660o00oOOoO.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    public int getItemViewType(int i) {
        if (this.f12660o00oOOoO.isEmpty()) {
            Object obj = this.f12667o00oOoOo;
            if (obj == null) {
                obj = this.f12668o00oOoo0;
            }
            if (obj != null) {
                o0O0o000 o0o0o000 = this.f12672o00oo00O;
                if (o0o0o000 != null) {
                    return o0o0o000.o00oOo00(i, obj);
                }
                o0OOOOO0.o0ooO.o00ooooO("stateHolderFactory");
                throw null;
            }
        }
        this.f12664o00oOoO = i;
        T t = this.f12660o00oOOoO.get(i);
        o0OOOOO0.o0ooO.o00oo0OO(t, "items[position]");
        int o00oOo002 = this.f12659o00oOOo0.o00oOo00(i, t);
        return o00oOo002 != -1 ? o00oOo002 : o00oooo0(t.getClass()).f12674o00oOOo0;
    }

    public final boolean o0() {
        return this.f12663o00oOo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00ooO0o(Collection<? extends T> collection, boolean z) {
        if (collection.isEmpty()) {
            return;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : collection) {
                Class<?> cls = t.getClass();
                Object obj = linkedHashMap.get(cls);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(cls, obj);
                }
                ((List) obj).add(t);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                o00ooO0o((List) entry.getValue(), false);
            }
            return;
        }
        Object o0OOO0O02 = o0O0oo0o.o0OOO0O0(collection);
        if (!o0O00000(o0OOO0O02.getClass())) {
            throw new IllegalArgumentException(f12652o00oo0O.toString());
        }
        if (!o00oooo0(o0OOO0O02.getClass()).f12676o00oOo00) {
            if (!(collection.size() == 1)) {
                throw new IllegalArgumentException(('\'' + o0OOO0O02.getClass() + "' 类型数据只能单选，不可以多选！").toString());
            }
        }
        if (collection.size() == 1) {
            o0O00Ooo(o0OOO0O02);
        } else {
            this.f12661o00oOo00.addAll(collection);
        }
    }

    public final void o00ooOO(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        o00ooOO0(this.f12660o00oOOoO.size(), t);
    }

    public final void o00ooOO0(int i, @NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        this.f12660o00oOOoO.add(i, t);
        notifyItemInserted(i);
    }

    public final void o00ooOOo(int i, @NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "list");
        this.f12660o00oOOoO.addAll(i, list);
        notifyItemRangeInserted(i, list.size());
    }

    @NotNull
    public final o0OooO0<T> o00ooOo(@NotNull RecyclerView recyclerView) {
        o0OOOOO0.o0ooO.o00oo0O0(recyclerView, "rv");
        recyclerView.setAdapter(this);
        return this;
    }

    public final void o00ooOo0(@NotNull List<? extends T> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "list");
        o00ooOOo(this.f12660o00oOOoO.size(), list);
    }

    public final void o00ooOoO(oo0OOoo<Object> oo0oooo, int i, List<Object> list) {
        if (this.f12660o00oOOoO.isEmpty()) {
            Object obj = this.f12667o00oOoOo;
            if (obj == null) {
                obj = this.f12668o00oOoo0;
            }
            Object obj2 = obj;
            if (obj2 == null) {
                return;
            }
            oo0OOoo.o00oOOoO(oo0oooo, obj2, false, null, 4, null);
            return;
        }
        T t = this.f12660o00oOOoO.get(i);
        o0OOOOO0.o0ooO.o00oo0OO(t, "items[position]");
        boolean z = true;
        boolean z2 = o0O00000(t.getClass()) && this.f12661o00oOo00.contains(t);
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            oo0OOoo.o00oOOoO(oo0oooo, t, z2, null, 4, null);
        } else {
            oo0oooo.o00oOOo0(t, z2, list.get(0));
        }
    }

    public final void o00ooOoo(boolean z, boolean z2) {
        this.f12660o00oOOoO.clear();
        if (z) {
            this.f12661o00oOo00.clear();
        }
        if (z2) {
            notifyDataSetChanged();
        }
    }

    public final void o00ooo0(@NotNull Class<?> cls, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "clazz");
        if (!this.f12661o00oOo00.isEmpty()) {
            HashSet<T> hashSet = this.f12661o00oOo00;
            List o0O0Ooo2 = o0oO0O0o.o0O0Ooo(hashSet, cls);
            if (hashSet == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            o0OOO0OO.o00oOOo0(hashSet).removeAll(o0O0Ooo2);
            if (z) {
                notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf((int) f12656o00oo0o0));
            }
        }
    }

    public final void o00ooo0O(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        this.f12661o00oOo00.remove(t);
        int indexOf = this.f12660o00oOOoO.indexOf(t);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, Integer.valueOf((int) f12656o00oo0o0));
        }
    }

    public final void o00oooO() {
        if (!this.f12661o00oOo00.isEmpty()) {
            this.f12661o00oOo00.clear();
            notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf((int) f12656o00oo0o0));
        }
    }

    public final void o00oooOO(int i) {
        this.f12661o00oOo00.remove(this.f12660o00oOOoO.get(i));
        notifyItemChanged(i, Integer.valueOf((int) f12656o00oo0o0));
    }

    public final void o00oooOo(@NotNull Collection<? extends T> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "list");
        if (!this.f12661o00oOo00.isEmpty()) {
            this.f12661o00oOo00.removeAll(collection);
            notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf((int) f12656o00oo0o0));
        }
    }

    @NotNull
    public final List<T> o00oooo() {
        return this.f12660o00oOOoO;
    }

    public final o00oOOoO o00oooo0(Class<?> cls) {
        o00oOOoO o00ooooo2 = this.f12665o00oOoO0.get(cls);
        if (o00ooooo2 == null) {
            o00oOOoO o00ooooo3 = new o00oOOoO(this.f12665o00oOoO0.size(), false, false, 6, null);
            this.f12665o00oOoO0.put(cls, o00ooooo3);
            return o00ooooo3;
        }
        return o00ooooo2;
    }

    public final int o00ooooO() {
        return this.f12660o00oOOoO.size();
    }

    @NotNull
    public final Set<T> o00ooooo() {
        return this.f12661o00oOo00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0O00 */
    public void onViewRecycled(@NotNull oo0OOoo<Object> oo0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        super.onViewRecycled(oo0oooo);
        o0O0o00 o0o0o00 = this.f12666o00oOoOO;
        if (o0o0o00 == null) {
            return;
        }
        o0o0o00.o00oOooO(oo0oooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    @NotNull
    /* renamed from: o0O000 */
    public oo0OOoo<Object> onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(viewGroup, "parent");
        if (this.f12660o00oOOoO.isEmpty()) {
            final Object obj = this.f12667o00oOoOo;
            if (obj == null) {
                obj = this.f12668o00oOoo0;
            }
            if (obj != null) {
                o0O0o000 o0o0o000 = this.f12672o00oo00O;
                if (o0o0o000 == null) {
                    o0OOOOO0.o0ooO.o00ooooO("stateHolderFactory");
                    throw null;
                }
                final oo0OOoo<? extends Object> o00oOOo02 = o0o0o000.o00oOOo0(viewGroup, i, this);
                final o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> o0o0000o = this.f12671o00oo0;
                View.OnClickListener onClickListener = o0o0000o == null ? null : new View.OnClickListener() { // from class: o0O0o0oo.o0O0OO
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        o0OooO0.o0O000O(o0O0000O.this, obj, o00oOOo02, view);
                    }
                };
                final o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> o0o0000o2 = this.f12673o00oo0OO;
                o00oOOo02.o00oOo00(onClickListener, o0o0000o2 != null ? new View.OnLongClickListener() { // from class: o0O0o0oo.o0O0OOO0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean o0OoOoOo2;
                        o0OoOoOo2 = o0OooO0.o0OoOoOo(o0O0000O.this, obj, o00oOOo02, view);
                        return o0OoOoOo2;
                    }
                } : null);
                return o00oOOo02;
            }
        }
        T t = this.f12660o00oOOoO.get(this.f12664o00oOoO);
        o0OOOOO0.o0ooO.o00oo0OO(t, "items[tempPosition]");
        final oo0OOoo<? extends Object> o00oOOo03 = this.f12659o00oOOo0.o00oOOo0(viewGroup, i, t);
        final o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> o0o0000o3 = this.f12669o00oOooO;
        View.OnClickListener onClickListener2 = o0o0000o3 == null ? null : new View.OnClickListener() { // from class: o0O0o0oo.o0O0OOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0OooO0.o0O000Oo(o0OooO0.this, o00oOOo03, o0o0000o3, view);
            }
        };
        final o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> o0o0000o4 = this.f12662o00oOo0O;
        o00oOOo03.o00oOo00(onClickListener2, o0o0000o4 != null ? new View.OnLongClickListener() { // from class: o0O0o0oo.o0O0OOOo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean o0OoOoOO2;
                o0OoOoOO2 = o0OooO0.o0OoOoOO(o0OooO0.this, o00oOOo03, o0o0000o4, view);
                return o0OoOoOO2;
            }
        } : null);
        return o00oOOo03;
    }

    public final boolean o0O00000(@NotNull Class<?> cls) {
        o0OOOOO0.o0ooO.o00oo0O0(cls, "clazz");
        return this.f12663o00oOo0o && o00oooo0(cls).f12675o00oOOoO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0O0000O */
    public void onBindViewHolder(@NotNull oo0OOoo<Object> oo0oooo, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        o00ooOoO(oo0oooo, i, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0O0000o */
    public void onBindViewHolder(@NotNull oo0OOoo<Object> oo0oooo, int i, @NotNull List<Object> list) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        o0OOOOO0.o0ooO.o00oo0O0(list, "payloads");
        o00ooOoO(oo0oooo, i, list);
    }

    public final void o0O000o(oo0OOoo<? extends Object> oo0oooo, View view, o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> o0o0000o) {
        int bindingAdapterPosition = oo0oooo.getBindingAdapterPosition();
        boolean z = false;
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < this.f12660o00oOOoO.size()) {
            z = true;
        }
        if (!z || o0o0000o == null) {
            return;
        }
        Object obj = (T) this.f12660o00oOOoO.get(bindingAdapterPosition);
        o0OOOOO0.o0ooO.o00oo0OO(obj, "items[position]");
        o0o0000o.invoke(view, obj, Integer.valueOf(bindingAdapterPosition));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0O000o0 */
    public boolean onFailedToRecycleView(@NotNull oo0OOoo<Object> oo0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        o0O0o00 o0o0o00 = this.f12666o00oOoOO;
        return o0o0o00 == null ? super.onFailedToRecycleView(oo0oooo) : o0o0o00.o00oOOo0(oo0oooo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0O000oo */
    public void onViewDetachedFromWindow(@NotNull oo0OOoo<Object> oo0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        super.onViewDetachedFromWindow(oo0oooo);
        o0O0o00 o0o0o00 = this.f12666o00oOoOO;
        if (o0o0o00 == null) {
            return;
        }
        o0o0o00.o00oOo00(oo0oooo);
    }

    public final void o0O00O0(@NotNull T t, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        this.f12661o00oOo00.remove(t);
        int indexOf = this.f12660o00oOOoO.indexOf(t);
        if (indexOf == -1) {
            return;
        }
        this.f12660o00oOOoO.remove(t);
        if (z) {
            notifyItemRemoved(indexOf);
        }
    }

    public final void o0O00O0o(int i, boolean z) {
        this.f12661o00oOo00.remove(this.f12660o00oOOoO.remove(i));
        if (z) {
            notifyItemRemoved(i);
        }
    }

    public final void o0O00OO(@NotNull Collection<? extends T> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "list");
        if (!collection.isEmpty()) {
            this.f12660o00oOOoO.removeAll(collection);
            this.f12661o00oOo00.removeAll(collection);
            notifyDataSetChanged();
        }
    }

    public final void o0O00OOO(int i, int i2) {
        List<T> subList = this.f12660o00oOOoO.subList(i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(subList, "items.subList(fromIndex, toIndex)");
        if (!subList.isEmpty()) {
            this.f12661o00oOo00.removeAll(subList);
            subList.clear();
            notifyItemRangeRemoved(i, i2 - i);
        }
    }

    public final void o0O00Oo(int i, @NotNull T t, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "newOne");
        T remove = this.f12660o00oOOoO.remove(i);
        o0OOOOO0.o0ooO.o00oo0OO(remove, "items.removeAt(index)");
        this.f12660o00oOOoO.add(i, t);
        if (this.f12661o00oOo00.contains(remove)) {
            this.f12661o00oOo00.remove(remove);
            this.f12661o00oOo00.add(t);
        }
        if (z) {
            notifyItemChanged(i, Integer.valueOf((int) f12658o0O0o));
        }
    }

    public final void o0O00OoO(@NotNull Class<?> cls) {
        T t;
        o0OOOOO0.o0ooO.o00oo0O0(cls, "clazz");
        if (this.f12660o00oOOoO.isEmpty()) {
            return;
        }
        if (!o0O00000(cls)) {
            throw new IllegalArgumentException(f12652o00oo0O.toString());
        }
        if (o00oooo0(cls).f12676o00oOo00) {
            for (T t2 : this.f12660o00oOOoO) {
                if (o0OOOOO0.o0ooO.o00oOoO0(t2.getClass(), cls)) {
                    this.f12661o00oOo00.add(t2);
                }
            }
            notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf((int) f12654o00oo0Oo));
            return;
        }
        Iterator<T> it = this.f12660o00oOOoO.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (o0OOOOO0.o0ooO.o00oOoO0(t.getClass(), cls)) {
                break;
            }
        }
        if (t == null) {
            return;
        }
        o0O00Ooo(t);
    }

    public final void o0O00Ooo(@NotNull T t) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        o0O00o00(t, this.f12660o00oOOoO.indexOf(t));
    }

    public final void o0O00o(int i) {
        T t = this.f12660o00oOOoO.get(i);
        o0OOOOO0.o0ooO.o00oo0OO(t, "items[index]");
        o0O00o00(t, i);
    }

    public final void o0O00o00(T t, int i) {
        T t2;
        if (!o0O00000(t.getClass())) {
            throw new IllegalArgumentException(f12652o00oo0O.toString());
        }
        if (this.f12661o00oOo00.contains(t)) {
            return;
        }
        if (!o00oooo0(t.getClass()).f12676o00oOo00) {
            Iterator<T> it = this.f12661o00oOo00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (o0OOOOO0.o0ooO.o00oOoO0(t2.getClass(), t.getClass())) {
                    break;
                }
            }
            if (t2 != null) {
                this.f12661o00oOo00.remove(t2);
                int indexOf = this.f12660o00oOOoO.indexOf(t2);
                if (indexOf != -1) {
                    notifyItemChanged(indexOf, Integer.valueOf((int) f12656o00oo0o0));
                }
            }
        }
        this.f12661o00oOo00.add(t);
        if (i != -1) {
            notifyItemChanged(i, Integer.valueOf((int) f12654o00oo0Oo));
        }
    }

    public final void o0O00o0O(boolean z) {
        o0O00oO0(this.f12660o00oOOoO, z);
    }

    public final void o0O00oO0(@NotNull Collection<? extends T> collection, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "list");
        o00ooO0o(collection, z);
        notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf((int) f12654o00oo0Oo));
    }

    @NotNull
    public final o0OooO0<T> o0O0O0Oo(@NotNull o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f12669o00oOooO = o0o0000o;
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0O0o(@Nullable List<? extends T> list, boolean z, boolean z2) {
        boolean z3 = false;
        o00ooOoo(z, false);
        if (!((list == null || list.isEmpty()) ? true : true)) {
            this.f12660o00oOOoO.addAll(list);
        }
        if (z2) {
            notifyDataSetChanged();
        }
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0O0o0(@NotNull o0O0000O<? super View, ? super T, ? super Integer, oO0Ooooo> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f12662o00oOo0O = o0o0000o;
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0O0oo(@NotNull o0O0o00 o0o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00, "lifecycleHandler");
        this.f12666o00oOoOO = o0o0o00;
        return this;
    }

    public final <B> o0OooO0<T> o0O0OO0(o0O0o00O o0o0o00o, boolean z, boolean z2) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "strategy");
        o0OOOOO0.o0ooO.o00oooOo();
        return o0ooO(Object.class, o0o0o00o, z, z2);
    }

    @NotNull
    public final o0OooO0<T> o0O0OO0O(boolean z, boolean z2, boolean z3) {
        this.f12663o00oOo0o = z;
        if (z2) {
            this.f12661o00oOo00.clear();
        }
        if (z3) {
            notifyItemRangeChanged(0, this.f12660o00oOOoO.size(), Integer.valueOf(z ? f12655o00oo0o : f12657o00oo0oO));
        }
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0OOOo(@NotNull o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f12671o00oo0 = o0o0000o;
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0OOo(@NotNull o0O0o000 o0o0o000, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "stateHolderFactory");
        this.f12672o00oo00O = o0o0o000;
        if (o0o0o000 == null) {
            o0OOOOO0.o0ooO.o00ooooO("stateHolderFactory");
            throw null;
        }
        o0o0o000.o00oOo0O(this.f12659o00oOOo0.o00oOOoO());
        this.f12670o00oOooo = z;
        return this;
    }

    @NotNull
    public final o0OooO0<T> o0O0OOoo(@NotNull o0O0000O<? super View, Object, ? super Integer, oO0Ooooo> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f12673o00oo0OO = o0o0000o;
        return this;
    }

    public final void o0O0Oo0O(@NotNull T t, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "item");
        if (o0O00000(t.getClass())) {
            if (!o00oooo0(t.getClass()).f12676o00oOo00) {
                o0O00o00(t, i);
            } else if (this.f12661o00oOo00.contains(t)) {
                o00oooOO(i);
            } else {
                o0O00o(i);
            }
        }
    }

    public final void o0OooO0(@NotNull Object obj, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(obj, "state");
        if (z) {
            this.f12668o00oOoo0 = obj;
            obj = null;
        }
        this.f12667o00oOoOo = obj;
        notifyDataSetChanged();
    }

    public final void o0oO0O0o(int i, int i2, boolean z) {
        List<T> subList = this.f12660o00oOOoO.subList(i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(subList, "items.subList(fromIndex, toIndex)");
        o00ooO0o(subList, z);
        notifyItemRangeChanged(i, i2 - i, Integer.valueOf((int) f12654o00oo0Oo));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0O0o0oo.o0OooO0<T> o0ooO(@org.jetbrains.annotations.NotNull java.lang.Class<?> r5, @org.jetbrains.annotations.NotNull o0O0o0oo.o0O0o00O r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r0 = "clazz"
            o0OOOOO0.o0ooO.o00oo0O0(r5, r0)
            java.lang.String r0 = "strategy"
            o0OOOOO0.o0ooO.o00oo0O0(r6, r0)
            o0O0o0oo.o0OooO0$o00oOOoO r0 = r4.o00oooo0(r5)
            o0O0o0oo.o0O0o00O r1 = o0O0o0oo.o0O0o00O.UNSELECTABLE
            r2 = 1
            r3 = 0
            if (r6 != r1) goto L39
            r0.f12675o00oOOoO = r3
            r0.f12676o00oOo00 = r3
            java.util.HashMap<java.lang.Class<?>, o0O0o0oo.o0OooO0$o00oOOoO> r0 = r4.f12665o00oOoO0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            o0O0o0oo.o0OooO0$o00oOOoO r1 = (o0O0o0oo.o0OooO0.o00oOOoO) r1
            boolean r1 = r1.f12675o00oOOoO
            if (r1 == 0) goto L22
            goto L44
        L39:
            r0.f12675o00oOOoO = r2
            o0O0o0oo.o0O0o00O r1 = o0O0o0oo.o0O0o00O.MULTI_SELECTABLE
            if (r6 != r1) goto L41
            r1 = r2
            goto L42
        L41:
            r1 = r3
        L42:
            r0.f12676o00oOo00 = r1
        L44:
            r4.f12663o00oOo0o = r2
        L46:
            if (r7 == 0) goto L4b
            r4.o00ooo0(r5, r3)
        L4b:
            if (r8 == 0) goto L5b
            java.util.ArrayList<T> r7 = r4.f12660o00oOOoO
            int r7 = r7.size()
            o0O0o0oo.o0O0OO0 r8 = new o0O0o0oo.o0O0OO0
            r8.<init>(r5, r6)
            r4.notifyItemRangeChanged(r3, r7, r8)
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0o0oo.o0OooO0.o0ooO(java.lang.Class, o0O0o0oo.o0O0o00O, boolean, boolean):o0O0o0oo.o0OooO0");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00oo0OO
    /* renamed from: o0ooOoOO */
    public void onViewAttachedToWindow(@NotNull oo0OOoo<Object> oo0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(oo0oooo, "holder");
        super.onViewAttachedToWindow(oo0oooo);
        o0O0o00 o0o0o00 = this.f12666o00oOoOO;
        if (o0o0o00 == null) {
            return;
        }
        o0o0o00.o00oOOoO(oo0oooo);
    }
}
