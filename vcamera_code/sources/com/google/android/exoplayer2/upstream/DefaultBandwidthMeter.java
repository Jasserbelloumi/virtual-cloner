package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.math.DoubleMath;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o0O0oooo.o0OO0oO;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    @o0OO00OO
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* loaded from: classes.dex */
    public static final class Builder {
        private Clock clock;
        @o0OO00OO
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            hashMap.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            hashMap.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            hashMap.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            hashMap.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            hashMap.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            hashMap.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            hashMap.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return hashMap;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(Integer.valueOf(i), Long.valueOf(j));
            return this;
        }

        public Builder setInitialBitrateEstimate(long j) {
            for (Integer num : this.initialBitrateEstimates.keySet()) {
                setInitialBitrateEstimate(num.intValue(), j);
            }
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, ImmutableMap.of(), 2000, Clock.DEFAULT, false);
    }

    private DefaultBandwidthMeter(@o0OO00OO Context context, Map<Integer, Long> map, int i, Clock clock, boolean z) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.o00oOOoO
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i2) {
                DefaultBandwidthMeter.this.onNetworkTypeChanged(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = oOo0oooO.f13903o00oOOoO;
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = oOo0oooO.f13904o00oOo00;
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = oOo0oooO.f13912o00oOooO;
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = oOo0oooO.f13905o00oOo0O;
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = oOo0oooO.f13906o00oOo0o;
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = Ascii.MAX;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 159;
                    break;
                }
                break;
            case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                if (str.equals("NR")) {
                    c = oOo0oooO.f13908o00oOoO0;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c = oOo0oooO.f13909o00oOoOO;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = oOo0oooO.f13910o00oOoOo;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c = oOo0oooO.f13911o00oOoo0;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = oOo0oooO.f13913o00oOooo;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = oOo0oooO.f13919o00oo0OO;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = oOo0oooO.f13918o00oo0O0;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = oOo0oooO.f13917o00oo0O;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = oOo0oooO.f13920o00oo0Oo;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = oOo0oooO.f13922o00oo0o0;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = oOo0oooO.f13921o00oo0o;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c = oOo0oooO.f13907o00oOoO;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 236;
                    break;
                }
                break;
        }
        int[] iArr = {1, 2, 0, 0, 2, 2};
        switch (c) {
            case 0:
            case 26:
            case 29:
            case 'I':
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case o0OO0oO.f12881o00oooo /* 223 */:
                return iArr;
            case 1:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 0;
                return iArr;
            case 2:
            case 'P':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 3:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 4:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 5:
            case 231:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 6:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 7:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\b':
            case '>':
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\t':
            case 'l':
            case 210:
            case 220:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\n':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 11:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 0;
                return iArr;
            case '\f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case '\r':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 14:
            case 'y':
            case 144:
            case 171:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 15:
            case 'K':
            case 128:
            case 169:
            case 194:
            case 211:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 16:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 17:
            case '8':
            case 'E':
            case 'N':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 18:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 19:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 20:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 21:
            case 145:
            case 190:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 22:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 23:
            case '[':
            case 'o':
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case o0OO0oO.f12878o00oooO /* 154 */:
            case 185:
            case 203:
            case 224:
            case 232:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 24:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 25:
            case '2':
            case 222:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 27:
            case '1':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 28:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 30:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 31:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ' ':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '!':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\"':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '#':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '$':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '%':
            case 'n':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '&':
            case '=':
            case 'W':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\'':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '(':
            case ':':
            case '{':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ')':
            case 166:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '*':
            case '_':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '+':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ',':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '-':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '.':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '/':
            case '6':
            case 200:
            case 206:
            case 208:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '0':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '3':
            case 's':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '4':
            case 158:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case '5':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 3;
                return iArr;
            case '7':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '9':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case ';':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '<':
            case 'e':
            case 127:
            case 174:
            case 186:
            case 215:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '?':
            case '^':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '@':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'A':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'B':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'C':
            case 'k':
            case 'q':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'D':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'F':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'G':
            case 204:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'H':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 1;
                return iArr;
            case 'J':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'L':
            case 226:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'M':
            case 152:
            case 228:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'Q':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'R':
            case 142:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'S':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'T':
            case 'Z':
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'U':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'V':
            case 165:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 'X':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'Y':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case '\\':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case ']':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '`':
            case 217:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'a':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 3;
                return iArr;
            case 'b':
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case 214:
            case 229:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'c':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'd':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 4;
                iArr[5] = 1;
                return iArr;
            case 'f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'g':
            case 233:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'h':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'i':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'j':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 4;
                return iArr;
            case 'm':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'r':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 4;
                return iArr;
            case 'u':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'v':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'w':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'z':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case '|':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '}':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '~':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 4;
                return iArr;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 131:
            case 179:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 132:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 133:
            case 177:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 136:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 137:
            case 167:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 139:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 140:
            case 141:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 143:
            case 236:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 146:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 147:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 148:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 149:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 150:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 151:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case o0OO0oO.f12877o00ooo0o /* 153 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 155:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 156:
            case o0OO0oO.f12880o00oooOo /* 164 */:
            case 198:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 157:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 3;
                return iArr;
            case 159:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 160:
            case 161:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 162:
            case DoubleMath.MAX_FACTORIAL /* 170 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case o0OO0oO.f12879o00oooOO /* 163 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 168:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 0;
                return iArr;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 173:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION /* 175 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 176:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 178:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 180:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 4;
                iArr[5] = 3;
                return iArr;
            case 181:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 182:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 183:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 184:
            case 209:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 187:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 191:
            case 218:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case o0O00000.o00oOoO.f10155o00oo0oO /* 193 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 195:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 196:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 197:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 199:
            case 202:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 201:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 205:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 4;
                return iArr;
            case 207:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 212:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case o0OO0oO.f12882o00oooo0 /* 213 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 216:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 219:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 1;
                return iArr;
            case 221:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 227:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 230:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 234:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 235:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            default:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
            defaultBandwidthMeter = singletonInstance;
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) {
        int i2 = this.networkType;
        if (i2 == 0 || this.resetOnNetworkTypeChange) {
            if (this.networkTypeOverrideSet) {
                i = this.networkTypeOverride;
            }
            if (i2 == i) {
                return;
            }
            this.networkType = i;
            if (i != 1 && i != 0 && i != 8) {
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                long elapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = elapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += i;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            Assertions.checkState(this.streamCount > 0);
            long elapsedRealtime = this.clock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.sampleStartTimeMs);
            this.totalElapsedTimeMs += i;
            long j = this.totalBytesTransferred;
            long j2 = this.sampleBytesTransferred;
            this.totalBytesTransferred = j + j2;
            if (i > 0) {
                this.slidingPercentile.addSample((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.totalElapsedTimeMs >= 2000 || this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.bitrateEstimate = this.slidingPercentile.getPercentile(0.5f);
                }
                maybeNotifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = elapsedRealtime;
                this.sampleBytesTransferred = 0L;
            }
            this.streamCount--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.networkTypeOverride = i;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i);
    }
}
