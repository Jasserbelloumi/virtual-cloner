package o0OO0oO;

import android.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o0OO0o.o0oo0000;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0Ooooo;
import o0OO0oo0.o00ooO0;
import o0OOOoO0.o;
import o0OOOoO0.oO000;
import o0OOOoo0.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24693:1\n12794#1,2:24694\n12804#1,2:24696\n1282#1,2:24698\n1290#1,2:24700\n1298#1,2:24702\n1306#1,2:24704\n1314#1,2:24706\n1322#1,2:24708\n1330#1,2:24710\n1338#1,2:24712\n1346#1,2:24714\n2298#1,5:24716\n2311#1,5:24721\n2324#1,5:24726\n2337#1,5:24731\n2350#1,5:24736\n2363#1,5:24741\n2376#1,5:24746\n2389#1,5:24751\n2402#1,5:24756\n4307#1,2:24762\n4317#1,2:24764\n4327#1,2:24766\n4337#1,2:24768\n4347#1,2:24770\n4357#1,2:24772\n4367#1,2:24774\n4377#1,2:24776\n4387#1,2:24778\n3974#1:24780\n13644#1,2:24781\n3975#1,2:24783\n13646#1:24785\n3977#1:24786\n3988#1:24787\n13654#1,2:24788\n3989#1,2:24790\n13656#1:24792\n3991#1:24793\n4002#1:24794\n13664#1,2:24795\n4003#1,2:24797\n13666#1:24799\n4005#1:24800\n4016#1:24801\n13674#1,2:24802\n4017#1,2:24804\n13676#1:24806\n4019#1:24807\n4030#1:24808\n13684#1,2:24809\n4031#1,2:24811\n13686#1:24813\n4033#1:24814\n4044#1:24815\n13694#1,2:24816\n4045#1,2:24818\n13696#1:24820\n4047#1:24821\n4058#1:24822\n13704#1,2:24823\n4059#1,2:24825\n13706#1:24827\n4061#1:24828\n4072#1:24829\n13714#1,2:24830\n4073#1,2:24832\n13716#1:24834\n4075#1:24835\n4086#1:24836\n13724#1,2:24837\n4087#1,2:24839\n13726#1:24841\n4089#1:24842\n13644#1,3:24843\n13654#1,3:24846\n13664#1,3:24849\n13674#1,3:24852\n13684#1,3:24855\n13694#1,3:24858\n13704#1,3:24861\n13714#1,3:24864\n13724#1,3:24867\n4107#1,2:24870\n4217#1,2:24872\n4227#1,2:24874\n4237#1,2:24876\n4247#1,2:24878\n4257#1,2:24880\n4267#1,2:24882\n4277#1,2:24884\n4287#1,2:24886\n4297#1,2:24888\n9358#1,4:24890\n9373#1,4:24894\n9388#1,4:24898\n9403#1,4:24902\n9418#1,4:24906\n9433#1,4:24910\n9448#1,4:24914\n9463#1,4:24918\n9478#1,4:24922\n9071#1,4:24926\n9087#1,4:24930\n9103#1,4:24934\n9119#1,4:24938\n9135#1,4:24942\n9151#1,4:24946\n9167#1,4:24950\n9183#1,4:24954\n9199#1,4:24958\n9215#1,4:24962\n9231#1,4:24966\n9247#1,4:24970\n9263#1,4:24974\n9279#1,4:24978\n9295#1,4:24982\n9311#1,4:24986\n9327#1,4:24990\n9343#1,4:24994\n9646#1,4:24998\n10664#1,5:25002\n10675#1,5:25007\n10686#1,5:25012\n10697#1,5:25017\n10708#1,5:25022\n10719#1,5:25027\n10730#1,5:25032\n10741#1,5:25037\n10752#1,5:25042\n10767#1,5:25047\n11008#1,3:25052\n11011#1,3:25062\n11025#1,3:25065\n11028#1,3:25075\n11042#1,3:25078\n11045#1,3:25088\n11059#1,3:25091\n11062#1,3:25101\n11076#1,3:25104\n11079#1,3:25114\n11093#1,3:25117\n11096#1,3:25127\n11110#1,3:25130\n11113#1,3:25140\n11127#1,3:25143\n11130#1,3:25153\n11144#1,3:25156\n11147#1,3:25166\n11162#1,3:25169\n11165#1,3:25179\n11180#1,3:25182\n11183#1,3:25192\n11198#1,3:25195\n11201#1,3:25205\n11216#1,3:25208\n11219#1,3:25218\n11234#1,3:25221\n11237#1,3:25231\n11252#1,3:25234\n11255#1,3:25244\n11270#1,3:25247\n11273#1,3:25257\n11288#1,3:25260\n11291#1,3:25270\n11306#1,3:25273\n11309#1,3:25283\n11670#1,3:25412\n11680#1,3:25415\n11690#1,3:25418\n11700#1,3:25421\n11710#1,3:25424\n11720#1,3:25427\n11730#1,3:25430\n11740#1,3:25433\n11750#1,3:25436\n11536#1,4:25439\n11549#1,4:25443\n11562#1,4:25447\n11575#1,4:25451\n11588#1,4:25455\n11601#1,4:25459\n11614#1,4:25463\n11627#1,4:25467\n11640#1,4:25471\n11525#1:25475\n13644#1,2:25476\n13646#1:25479\n11526#1:25480\n13644#1,3:25481\n11661#1:25484\n13579#1:25485\n13580#1:25487\n11662#1:25488\n13579#1,2:25489\n13644#1,3:25491\n13654#1,3:25494\n13664#1,3:25497\n13674#1,3:25500\n13684#1,3:25503\n13694#1,3:25506\n13704#1,3:25509\n13714#1,3:25512\n13724#1,3:25515\n20893#1,2:25518\n20895#1,6:25521\n21109#1,2:25527\n21111#1,6:25530\n23305#1,6:25536\n23321#1,6:25542\n23337#1,6:25548\n23353#1,6:25554\n23369#1,6:25560\n23385#1,6:25566\n23401#1,6:25572\n23417#1,6:25578\n23433#1,6:25584\n23539#1,8:25590\n23557#1,8:25598\n23575#1,8:25606\n23593#1,8:25614\n23611#1,8:25622\n23629#1,8:25630\n23647#1,8:25638\n23665#1,8:25646\n23683#1,8:25654\n23781#1,6:25662\n23797#1,6:25668\n23813#1,6:25674\n23829#1,6:25680\n23845#1,6:25686\n23861#1,6:25692\n23877#1,6:25698\n23893#1,6:25704\n1#2:24761\n1#2:25478\n1#2:25486\n1#2:25520\n1#2:25529\n361#3,7:25055\n361#3,7:25068\n361#3,7:25081\n361#3,7:25094\n361#3,7:25107\n361#3,7:25120\n361#3,7:25133\n361#3,7:25146\n361#3,7:25159\n361#3,7:25172\n361#3,7:25185\n361#3,7:25198\n361#3,7:25211\n361#3,7:25224\n361#3,7:25237\n361#3,7:25250\n361#3,7:25263\n361#3,7:25276\n361#3,7:25286\n361#3,7:25293\n361#3,7:25300\n361#3,7:25307\n361#3,7:25314\n361#3,7:25321\n361#3,7:25328\n361#3,7:25335\n361#3,7:25342\n361#3,7:25349\n361#3,7:25356\n361#3,7:25363\n361#3,7:25370\n361#3,7:25377\n361#3,7:25384\n361#3,7:25391\n361#3,7:25398\n361#3,7:25405\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24694,2\n565#1:24696,2\n832#1:24698,2\n842#1:24700,2\n852#1:24702,2\n862#1:24704,2\n872#1:24706,2\n882#1:24708,2\n892#1:24710,2\n902#1:24712,2\n912#1:24714,2\n922#1:24716,5\n932#1:24721,5\n942#1:24726,5\n952#1:24731,5\n962#1:24736,5\n972#1:24741,5\n982#1:24746,5\n992#1:24751,5\n1002#1:24756,5\n3792#1:24762,2\n3801#1:24764,2\n3810#1:24766,2\n3819#1:24768,2\n3828#1:24770,2\n3837#1:24772,2\n3846#1:24774,2\n3855#1:24776,2\n3864#1:24778,2\n3875#1:24780\n3875#1:24781,2\n3875#1:24783,2\n3875#1:24785\n3875#1:24786\n3886#1:24787\n3886#1:24788,2\n3886#1:24790,2\n3886#1:24792\n3886#1:24793\n3897#1:24794\n3897#1:24795,2\n3897#1:24797,2\n3897#1:24799\n3897#1:24800\n3908#1:24801\n3908#1:24802,2\n3908#1:24804,2\n3908#1:24806\n3908#1:24807\n3919#1:24808\n3919#1:24809,2\n3919#1:24811,2\n3919#1:24813\n3919#1:24814\n3930#1:24815\n3930#1:24816,2\n3930#1:24818,2\n3930#1:24820\n3930#1:24821\n3941#1:24822\n3941#1:24823,2\n3941#1:24825,2\n3941#1:24827\n3941#1:24828\n3952#1:24829\n3952#1:24830,2\n3952#1:24832,2\n3952#1:24834\n3952#1:24835\n3963#1:24836\n3963#1:24837,2\n3963#1:24839,2\n3963#1:24841\n3963#1:24842\n3974#1:24843,3\n3988#1:24846,3\n4002#1:24849,3\n4016#1:24852,3\n4030#1:24855,3\n4044#1:24858,3\n4058#1:24861,3\n4072#1:24864,3\n4086#1:24867,3\n4098#1:24870,2\n4117#1:24872,2\n4126#1:24874,2\n4135#1:24876,2\n4144#1:24878,2\n4153#1:24880,2\n4162#1:24882,2\n4171#1:24884,2\n4180#1:24886,2\n4189#1:24888,2\n8677#1:24890,4\n8692#1:24894,4\n8707#1:24898,4\n8722#1:24902,4\n8737#1:24906,4\n8752#1:24910,4\n8767#1:24914,4\n8782#1:24918,4\n8797#1:24922,4\n8812#1:24926,4\n8827#1:24930,4\n8842#1:24934,4\n8857#1:24938,4\n8872#1:24942,4\n8887#1:24946,4\n8902#1:24950,4\n8917#1:24954,4\n8932#1:24958,4\n8946#1:24962,4\n8960#1:24966,4\n8974#1:24970,4\n8988#1:24974,4\n9002#1:24978,4\n9016#1:24982,4\n9030#1:24986,4\n9044#1:24990,4\n9058#1:24994,4\n9497#1:24998,4\n10242#1:25002,5\n10251#1:25007,5\n10260#1:25012,5\n10269#1:25017,5\n10278#1:25022,5\n10287#1:25027,5\n10296#1:25032,5\n10305#1:25037,5\n10314#1:25042,5\n10327#1:25047,5\n10783#1:25052,3\n10783#1:25062,3\n10795#1:25065,3\n10795#1:25075,3\n10807#1:25078,3\n10807#1:25088,3\n10819#1:25091,3\n10819#1:25101,3\n10831#1:25104,3\n10831#1:25114,3\n10843#1:25117,3\n10843#1:25127,3\n10855#1:25130,3\n10855#1:25140,3\n10867#1:25143,3\n10867#1:25153,3\n10879#1:25156,3\n10879#1:25166,3\n10892#1:25169,3\n10892#1:25179,3\n10905#1:25182,3\n10905#1:25192,3\n10918#1:25195,3\n10918#1:25205,3\n10931#1:25208,3\n10931#1:25218,3\n10944#1:25221,3\n10944#1:25231,3\n10957#1:25234,3\n10957#1:25244,3\n10970#1:25247,3\n10970#1:25257,3\n10983#1:25260,3\n10983#1:25270,3\n10996#1:25273,3\n10996#1:25283,3\n11335#1:25412,3\n11345#1:25415,3\n11355#1:25418,3\n11365#1:25421,3\n11375#1:25424,3\n11385#1:25427,3\n11395#1:25430,3\n11405#1:25433,3\n11415#1:25436,3\n11425#1:25439,4\n11435#1:25443,4\n11445#1:25447,4\n11455#1:25451,4\n11465#1:25455,4\n11475#1:25459,4\n11485#1:25463,4\n11495#1:25467,4\n11505#1:25471,4\n11515#1:25475\n11515#1:25476,2\n11515#1:25479\n11515#1:25480\n11525#1:25481,3\n11653#1:25484\n11653#1:25485\n11653#1:25487\n11653#1:25488\n11661#1:25489,2\n19161#1:25491,3\n19173#1:25494,3\n19185#1:25497,3\n19197#1:25500,3\n19209#1:25503,3\n19221#1:25506,3\n19233#1:25509,3\n19245#1:25512,3\n19257#1:25515,3\n21725#1:25518,2\n21725#1:25521,6\n21887#1:25527,2\n21887#1:25530,6\n23214#1:25536,6\n23224#1:25542,6\n23234#1:25548,6\n23244#1:25554,6\n23254#1:25560,6\n23264#1:25566,6\n23274#1:25572,6\n23284#1:25578,6\n23294#1:25584,6\n23448#1:25590,8\n23458#1:25598,8\n23468#1:25606,8\n23478#1:25614,8\n23488#1:25622,8\n23498#1:25630,8\n23508#1:25638,8\n23518#1:25646,8\n23528#1:25654,8\n23700#1:25662,6\n23710#1:25668,6\n23720#1:25674,6\n23730#1:25680,6\n23740#1:25686,6\n23750#1:25692,6\n23760#1:25698,6\n23770#1:25704,6\n11515#1:25478\n11653#1:25486\n21725#1:25520\n21887#1:25529\n10783#1:25055,7\n10795#1:25068,7\n10807#1:25081,7\n10819#1:25094,7\n10831#1:25107,7\n10843#1:25120,7\n10855#1:25133,7\n10867#1:25146,7\n10879#1:25159,7\n10892#1:25172,7\n10905#1:25185,7\n10918#1:25198,7\n10931#1:25211,7\n10944#1:25224,7\n10957#1:25237,7\n10970#1:25250,7\n10983#1:25263,7\n10996#1:25276,7\n11010#1:25286,7\n11027#1:25293,7\n11044#1:25300,7\n11061#1:25307,7\n11078#1:25314,7\n11095#1:25321,7\n11112#1:25328,7\n11129#1:25335,7\n11146#1:25342,7\n11164#1:25349,7\n11182#1:25356,7\n11200#1:25363,7\n11218#1:25370,7\n11236#1:25377,7\n11254#1:25384,7\n11272#1:25391,7\n11290#1:25398,7\n11308#1:25405,7\n*E\n"})
/* loaded from: classes3.dex */
public class o0O000O extends o0OO0oO.o0O00000 {

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24360#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o0 implements oO000<Float> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ float[] f13330o00oOOo0;

        public o0(float[] fArr) {
            this.f13330o00oOOo0 = fArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Float> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo0O(this.f13330o00oOOo0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24236#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements Iterable<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object[] f13331o00oo0O0;

        public o00oOOo0(Object[] objArr) {
            this.f13331o00oo0O0 = objArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return o0OOOOO0.o00oo0O0.o00oOOo0(this.f13331o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24244#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements Iterable<Byte>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ byte[] f13332o00oo0O0;

        public o00oOOoO(byte[] bArr) {
            this.f13332o00oo0O0 = bArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Byte> iterator() {
            return o0OOOOO0.o00oo0O.o00oOOoO(this.f13332o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24252#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 implements Iterable<Short>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ short[] f13333o00oo0O0;

        public o00oOo00(short[] sArr) {
            this.f13333o00oo0O0 = sArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Short> iterator() {
            return o0OOOOO0.o00oo0O.o00oOoO(this.f13333o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24260#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O implements Iterable<Integer>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int[] f13334o00oo0O0;

        public o00oOo0O(int[] iArr) {
            this.f13334o00oo0O0 = iArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Integer> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo0o(this.f13334o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24268#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO implements Iterable<Long>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ long[] f13335o00oo0O0;

        public o00oOoO(long[] jArr) {
            this.f13335o00oo0O0 = jArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Long> iterator() {
            return o0OOOOO0.o00oo0O.o00oOoO0(this.f13335o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24330#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo implements oO000<Short> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ short[] f13336o00oOOo0;

        public o00oo(short[] sArr) {
            this.f13336o00oOOo0 = sArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Short> iterator() {
            return o0OOOOO0.o00oo0O.o00oOoO(this.f13336o00oOOo0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24284#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0 implements Iterable<Double>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f13337o00oo0O0;

        public o00oo0(double[] dArr) {
            this.f13337o00oo0O0 = dArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Double> iterator() {
            return o0OOOOO0.o00oo0O.o00oOooO(this.f13337o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24276#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O implements Iterable<Float>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ float[] f13338o00oo0O0;

        public o00oo00O(float[] fArr) {
            this.f13338o00oo0O0 = fArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Float> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo0O(this.f13338o00oo0O0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24310#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Object[] f13339o00oOOo0;

        public o00oo0O(Object[] objArr) {
            this.f13339o00oOOo0 = objArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            return o0OOOOO0.o00oo0O0.o00oOOo0(this.f13339o00oOOo0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24300#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0 implements Iterable<Character>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ char[] f13340o00oo0O0;

        public o00oo0O0(char[] cArr) {
            this.f13340o00oo0O0 = cArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Character> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo00(this.f13340o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24292#2:71\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO implements Iterable<Boolean>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ boolean[] f13341o00oo0O0;

        public o00oo0OO(boolean[] zArr) {
            this.f13341o00oo0O0 = zArr;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<Boolean> iterator() {
            return o0OOOOO0.o00oo0O.o00oOOo0(this.f13341o00oo0O0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24350#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00ooO implements oO000<Long> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ long[] f13342o00oOOo0;

        public o00ooO(long[] jArr) {
            this.f13342o00oOOo0 = jArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Long> iterator() {
            return o0OOOOO0.o00oo0O.o00oOoO0(this.f13342o00oOOo0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24340#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00ooO0 implements oO000<Integer> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ int[] f13343o00oOOo0;

        public o00ooO0(int[] iArr) {
            this.f13343o00oOOo0 = iArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Integer> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo0o(this.f13343o00oOOo0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O00 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Integer>> {
        public final /* synthetic */ int[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00(int[] iArr) {
            super(0);
            this.$this_withIndex = iArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Integer> invoke() {
            return o0OOOOO0.o00oo0O.o00oOo0o(this.$this_withIndex);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24390#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o0O000 implements oO000<Character> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ char[] f13344o00oOOo0;

        public o0O000(char[] cArr) {
            this.f13344o00oOOo0 = cArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Character> iterator() {
            return o0OOOOO0.o00oo0O.o00oOo00(this.f13344o00oOOo0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24370#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o0O00000 implements oO000<Double> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ double[] f13345o00oOOo0;

        public o0O00000(double[] dArr) {
            this.f13345o00oOOo0 = dArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Double> iterator() {
            return o0OOOOO0.o00oo0O.o00oOooO(this.f13345o00oOOo0);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24380#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o0O0000O implements oO000<Boolean> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ boolean[] f13346o00oOOo0;

        public o0O0000O(boolean[] zArr) {
            this.f13346o00oOOo0 = zArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Boolean> iterator() {
            return o0OOOOO0.o00oo0O.o00oOOo0(this.f13346o00oOOo0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @o0OOOOO0.o0OOO00({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,24693:1\n*E\n"})
    /* renamed from: o0OO0oO.o0O000O$o0O000O  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0168o0O000O<K, T> implements o0O0OOO<T, K> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ T[] f13347o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo<T, K> f13348o00oOOoO;

        /* JADX WARN: Multi-variable type inference failed */
        public C0168o0O000O(T[] tArr, o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
            this.f13347o00oOOo0 = tArr;
            this.f13348o00oOOoO = o00ooVar;
        }

        @Override // o0OO0oO.o0O0OOO
        public K o00oOOo0(T t) {
            return this.f13348o00oOOoO.invoke(t);
        }

        @Override // o0OO0oO.o0O0OOO
        @NotNull
        public Iterator<T> o00oOOoO() {
            return o0OOOOO0.o00oo0O0.o00oOOo0(this.f13347o00oOOo0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O000Oo extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Byte>> {
        public final /* synthetic */ byte[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O000Oo(byte[] bArr) {
            super(0);
            this.$this_withIndex = bArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Byte> invoke() {
            return o0OOOOO0.o00oo0O.o00oOOoO(this.$this_withIndex);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O000o0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Short>> {
        public final /* synthetic */ short[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O000o0(short[] sArr) {
            super(0);
            this.$this_withIndex = sArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Short> invoke() {
            return o0OOOOO0.o00oo0O.o00oOoO(this.$this_withIndex);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O00O extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Boolean>> {
        public final /* synthetic */ boolean[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00O(boolean[] zArr) {
            super(0);
            this.$this_withIndex = zArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Boolean> invoke() {
            return o0OOOOO0.o00oo0O.o00oOOo0(this.$this_withIndex);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O00O0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Long>> {
        public final /* synthetic */ long[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00O0(long[] jArr) {
            super(0);
            this.$this_withIndex = jArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Long> invoke() {
            return o0OOOOO0.o00oo0O.o00oOoO0(this.$this_withIndex);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O00O0o extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Double>> {
        public final /* synthetic */ double[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00O0o(double[] dArr) {
            super(0);
            this.$this_withIndex = dArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Double> invoke() {
            return o0OOOOO0.o00oo0O.o00oOooO(this.$this_withIndex);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0O00OO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Character>> {
        public final /* synthetic */ char[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O00OO(char[] cArr) {
            super(0);
            this.$this_withIndex = cArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Character> invoke() {
            return o0OOOOO0.o00oo0O.o00oOo00(this.$this_withIndex);
        }
    }

    @o0OOOOO0.o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24320#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o0O0o implements oO000<Byte> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ byte[] f13349o00oOOo0;

        public o0O0o(byte[] bArr) {
            this.f13349o00oOOo0 = bArr;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Byte> iterator() {
            return o0OOOOO0.o00oo0O.o00oOOoO(this.f13349o00oOOo0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o0OoO00O extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends Float>> {
        public final /* synthetic */ float[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoO00O(float[] fArr) {
            super(0);
            this.$this_withIndex = fArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<? extends Float> invoke() {
            return o0OOOOO0.o00oo0O.o00oOo0O(this.$this_withIndex);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o0OoOoOo<T> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<Iterator<? extends T>> {
        public final /* synthetic */ T[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOoOo(T[] tArr) {
            super(0);
            this.$this_withIndex = tArr;
        }

        @Override // o0OOOO.o00oOOo0
        @NotNull
        public final Iterator<T> invoke() {
            return o0OOOOO0.o00oo0O0.o00oOOo0(this.$this_withIndex);
        }
    }

    public static final <T> boolean o(@NotNull T[] tArr, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return oOO0o0oo(tArr, t) >= 0;
    }

    public static final boolean o0o00(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o000OO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o000Oo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (!o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o000o0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o000oO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o000oo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (!o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o00O(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00O0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean o0o00O00(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (!o00ooVar.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o00O0O(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (!o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o0o00O0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final boolean o0o00OO0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final boolean o0o00OOO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00OOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final boolean o0o00Oo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final boolean o0o00Oo0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00OoO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00Ooo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final <T> boolean o0o00o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final boolean o0o00o0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final boolean o0o00o00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00o0O(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00oO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final <T> boolean o0o00oO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00oOO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0o00oOo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @NotNull
    public static final Iterable<Byte> o0o00oo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length == 0 ? o0ooO.INSTANCE : new o00oOOoO(bArr);
    }

    public static final boolean o0o00oo0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Character> o0o00ooO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length == 0 ? o0ooO.INSTANCE : new o00oo0O0(cArr);
    }

    @NotNull
    public static final Iterable<Double> o0o00ooo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length == 0 ? o0ooO.INSTANCE : new o00oo0(dArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0O(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(cArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (char c : cArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Character.valueOf(c));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Iterable<Short> o0o0O0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length == 0 ? o0ooO.INSTANCE : new o00oOo00(sArr);
    }

    @NotNull
    public static final Iterable<Integer> o0o0O00(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length == 0 ? o0ooO.INSTANCE : new o00oOo0O(iArr);
    }

    @NotNull
    public static final Iterable<Float> o0o0O000(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length == 0 ? o0ooO.INSTANCE : new o00oo00O(fArr);
    }

    @NotNull
    public static final Iterable<Long> o0o0O00O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length == 0 ? o0ooO.INSTANCE : new o00oOoO(jArr);
    }

    @NotNull
    public static final <T> Iterable<T> o0o0O00o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length == 0 ? o0ooO.INSTANCE : new o00oOOo0(tArr);
    }

    @NotNull
    public static final oO000<Byte> o0o0O0O(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length == 0 ? o.f13767o00oOOo0 : new o0O0o(bArr);
    }

    @NotNull
    public static final Iterable<Boolean> o0o0O0O0(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length == 0 ? o0ooO.INSTANCE : new o00oo0OO(zArr);
    }

    @NotNull
    public static final oO000<Double> o0o0O0OO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length == 0 ? o.f13767o00oOOo0 : new o0O00000(dArr);
    }

    @NotNull
    public static final oO000<Integer> o0o0O0o(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length == 0 ? o.f13767o00oOOo0 : new o00ooO0(iArr);
    }

    @NotNull
    public static final oO000<Float> o0o0O0o0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length == 0 ? o.f13767o00oOOo0 : new o0(fArr);
    }

    @NotNull
    public static final oO000<Long> o0o0O0oO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length == 0 ? o.f13767o00oOOo0 : new o00ooO(jArr);
    }

    @NotNull
    public static final <T> oO000<T> o0o0O0oo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length == 0 ? o.f13767o00oOOo0 : new o00oo0O(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> o0o0OO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(tArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (R.bool boolVar : tArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(boolVar);
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OO0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(fArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (float f : fArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Float.valueOf(f));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OO0O(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(iArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (int i : iArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Integer.valueOf(i));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OO0o(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(jArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (long j : jArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Long.valueOf(j));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OOO(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(zArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (boolean z : zArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Boolean.valueOf(z));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OOO0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(sArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (short s : sArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Short.valueOf(s));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Byte> o0o0OOOO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(bArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (byte b : bArr) {
            linkedHashMap.put(o00ooVar.invoke(Byte.valueOf(b)), Byte.valueOf(b));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OOOo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(bArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (byte b : bArr) {
            linkedHashMap.put(o00ooVar.invoke(Byte.valueOf(b)), o00ooVar2.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> o0o0OOo0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(cArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (char c : cArr) {
            linkedHashMap.put(o00ooVar.invoke(Character.valueOf(c)), Character.valueOf(c));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OOoO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Character, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(cArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (char c : cArr) {
            linkedHashMap.put(o00ooVar.invoke(Character.valueOf(c)), o00ooVar2.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Double> o0o0OOoo(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(dArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (double d : dArr) {
            linkedHashMap.put(o00ooVar.invoke(Double.valueOf(d)), Double.valueOf(d));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0Oo0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Double, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(dArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (double d : dArr) {
            linkedHashMap.put(o00ooVar.invoke(Double.valueOf(d)), o00ooVar2.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final oO000<Character> o0o0Oo00(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length == 0 ? o.f13767o00oOOo0 : new o0O000(cArr);
    }

    @NotNull
    public static final <K> Map<K, Float> o0o0Oo0O(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(fArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (float f : fArr) {
            linkedHashMap.put(o00ooVar.invoke(Float.valueOf(f)), Float.valueOf(f));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0Oo0o(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Float, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(fArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (float f : fArr) {
            linkedHashMap.put(o00ooVar.invoke(Float.valueOf(f)), o00ooVar2.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Integer> o0o0OoO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(iArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (int i : iArr) {
            linkedHashMap.put(o00ooVar.invoke(Integer.valueOf(i)), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OoO0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(dArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (double d : dArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Double.valueOf(d));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0OoOO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(iArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (int i : iArr) {
            linkedHashMap.put(o00ooVar.invoke(Integer.valueOf(i)), o00ooVar2.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Long> o0o0OoOo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(jArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (long j : jArr) {
            linkedHashMap.put(o00ooVar.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0o0Ooo0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Long, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(jArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (long j : jArr) {
            linkedHashMap.put(o00ooVar.invoke(Long.valueOf(j)), o00ooVar2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> o0oOOoOO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(tArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (T t : tArr) {
            linkedHashMap.put(o00ooVar.invoke(t), t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Short> o0oOOoOo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(sArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (short s : sArr) {
            linkedHashMap.put(o00ooVar.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Boolean> o0oOOoo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(zArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (boolean z : zArr) {
            linkedHashMap.put(o00ooVar.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0oOOoo0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Short, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(sArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (short s : sArr) {
            linkedHashMap.put(o00ooVar.invoke(Short.valueOf(s)), o00ooVar2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> o0oOOooO(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(zArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (boolean z : zArr) {
            linkedHashMap.put(o00ooVar.invoke(Boolean.valueOf(z)), o00ooVar2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M o0oOOooo(@NotNull byte[] bArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (byte b : bArr) {
            m.put(o00ooVar.invoke(Byte.valueOf(b)), Byte.valueOf(b));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M o0oOo(@NotNull int[] iArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (int i : iArr) {
            m.put(o00ooVar.invoke(Integer.valueOf(i)), Integer.valueOf(i));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOo0(@NotNull char[] cArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Character, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (char c : cArr) {
            m.put(o00ooVar.invoke(Character.valueOf(c)), o00ooVar2.invoke(Character.valueOf(c)));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOo00(@NotNull byte[] bArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (byte b : bArr) {
            m.put(o00ooVar.invoke(Byte.valueOf(b)), o00ooVar2.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M o0oOo00O(@NotNull char[] cArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (char c : cArr) {
            m.put(o00ooVar.invoke(Character.valueOf(c)), Character.valueOf(c));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M o0oOo0O(@NotNull double[] dArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (double d : dArr) {
            m.put(o00ooVar.invoke(Double.valueOf(d)), Double.valueOf(d));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOo0OO(@NotNull double[] dArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Double, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (double d : dArr) {
            m.put(o00ooVar.invoke(Double.valueOf(d)), o00ooVar2.invoke(Double.valueOf(d)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M o0oOo0Oo(@NotNull float[] fArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (float f : fArr) {
            m.put(o00ooVar.invoke(Float.valueOf(f)), Float.valueOf(f));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOo0o(@NotNull float[] fArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Float, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (float f : fArr) {
            m.put(o00ooVar.invoke(Float.valueOf(f)), o00ooVar2.invoke(Float.valueOf(f)));
        }
        return m;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M o0oOoO(@NotNull T[] tArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (T t : tArr) {
            m.put(o00ooVar.invoke(t), t);
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoO0(@NotNull int[] iArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (int i : iArr) {
            m.put(o00ooVar.invoke(Integer.valueOf(i)), o00ooVar2.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M o0oOoO0o(@NotNull long[] jArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (long j : jArr) {
            m.put(o00ooVar.invoke(Long.valueOf(j)), Long.valueOf(j));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M o0oOoOO(@NotNull short[] sArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (short s : sArr) {
            m.put(o00ooVar.invoke(Short.valueOf(s)), Short.valueOf(s));
        }
        return m;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M o0oOoOO0(@NotNull T[] tArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (T t : tArr) {
            m.put(o00ooVar.invoke(t), o00ooVar2.invoke(t));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoOOO(@NotNull short[] sArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Short, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (short s : sArr) {
            m.put(o00ooVar.invoke(Short.valueOf(s)), o00ooVar2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M o0oOoOOo(@NotNull boolean[] zArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (boolean z : zArr) {
            m.put(o00ooVar.invoke(Boolean.valueOf(z)), Boolean.valueOf(z));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoOo(@NotNull boolean[] zArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (boolean z : zArr) {
            m.put(o00ooVar.invoke(Boolean.valueOf(z)), o00ooVar2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoOo0(@NotNull long[] jArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Long, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (long j : jArr) {
            m.put(o00ooVar.invoke(Long.valueOf(j)), o00ooVar2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoOoO(@NotNull byte[] bArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Byte, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (byte b : bArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Byte.valueOf(b));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoo(@NotNull float[] fArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Float, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (float f : fArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Float.valueOf(f));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoo0(@NotNull char[] cArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Character, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (char c : cArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Character.valueOf(c));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoo0O(@NotNull double[] dArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Double, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (double d : dArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Double.valueOf(d));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOooO(@NotNull int[] iArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Integer, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (int i : iArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Integer.valueOf(i));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> o0oOooOO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(tArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (T t : tArr) {
            linkedHashMap.put(o00ooVar.invoke(t), o00ooVar2.invoke(t));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOooOo(@NotNull long[] jArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Long, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (long j : jArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Long.valueOf(j));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOooo(@NotNull short[] sArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Short, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (short s : sArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Short.valueOf(s));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M o0oOooo0(@NotNull T[] tArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(t);
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oOoooO(@NotNull boolean[] zArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Boolean, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (boolean z : zArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Boolean.valueOf(z));
            m.put(invoke.getFirst(), invoke.getSecond());
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Byte, V> o0oOoooo(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(bArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (byte b : bArr) {
            linkedHashMap.put(Byte.valueOf(b), o00ooVar.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Double, ? super V>> M o0oo0(double[] dArr, M m, o0OOOO.o00oo<? super Double, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (double d : dArr) {
            m.put(Double.valueOf(d), o00ooVar.invoke(Double.valueOf(d)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Character, V> o0oo0000(char[] cArr, o0OOOO.o00oo<? super Character, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        int o00oOoOo2 = oo0oO0.o00oOoOo(length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (char c : cArr) {
            linkedHashMap.put(Character.valueOf(c), o00ooVar.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Double, V> o0oo000O(double[] dArr, o0OOOO.o00oo<? super Double, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(dArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (double d : dArr) {
            linkedHashMap.put(Double.valueOf(d), o00ooVar.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Integer, V> o0oo00O(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(iArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (int i : iArr) {
            linkedHashMap.put(Integer.valueOf(i), o00ooVar.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Float, V> o0oo00O0(float[] fArr, o0OOOO.o00oo<? super Float, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(fArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (float f : fArr) {
            linkedHashMap.put(Float.valueOf(f), o00ooVar.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Long, V> o0oo00OO(long[] jArr, o0OOOO.o00oo<? super Long, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(jArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (long j : jArr) {
            linkedHashMap.put(Long.valueOf(j), o00ooVar.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> o0oo00Oo(@NotNull K[] kArr, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(kArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(kArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (K k : kArr) {
            linkedHashMap.put(k, o00ooVar.invoke(k));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Boolean, V> o0oo00o(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(zArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (boolean z : zArr) {
            linkedHashMap.put(Boolean.valueOf(z), o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V> Map<Short, V> o0oo00o0(short[] sArr, o0OOOO.o00oo<? super Short, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        int o00oOoOo2 = oo0oO0.o00oOoOo(sArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (short s : sArr) {
            linkedHashMap.put(Short.valueOf(s), o00ooVar.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Byte, ? super V>> M o0oo00oO(byte[] bArr, M m, o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (byte b : bArr) {
            m.put(Byte.valueOf(b), o00ooVar.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Character, ? super V>> M o0oo00oo(char[] cArr, M m, o0OOOO.o00oo<? super Character, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (char c : cArr) {
            m.put(Character.valueOf(c), o00ooVar.invoke(Character.valueOf(c)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Short, ? super V>> M o0oo0O(short[] sArr, M m, o0OOOO.o00oo<? super Short, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (short s : sArr) {
            m.put(Short.valueOf(s), o00ooVar.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Float, ? super V>> M o0oo0O0(float[] fArr, M m, o0OOOO.o00oo<? super Float, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (float f : fArr) {
            m.put(Float.valueOf(f), o00ooVar.invoke(Float.valueOf(f)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Integer, ? super V>> M o0oo0O0O(int[] iArr, M m, o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (int i : iArr) {
            m.put(Integer.valueOf(i), o00ooVar.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Long, ? super V>> M o0oo0O0o(long[] jArr, M m, o0OOOO.o00oo<? super Long, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (long j : jArr) {
            m.put(Long.valueOf(j), o00ooVar.invoke(Long.valueOf(j)));
        }
        return m;
    }

    public static final double o0oo0OO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (byte b : bArr) {
            d += b;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <V, M extends Map<? super Boolean, ? super V>> M o0oo0OO0(boolean[] zArr, M m, o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (boolean z : zArr) {
            m.put(Boolean.valueOf(z), o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    public static final double o0oo0OOO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (double d2 : dArr) {
            d += d2;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final double o0oo0OOo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (float f : fArr) {
            d += f;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final double o0oo0Oo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (int i2 : iArr) {
            d += i2;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final double o0oo0OoO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (long j : jArr) {
            d += j;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final double o0oo0Ooo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (short s : sArr) {
            d += s;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M o0oo0o(@NotNull K[] kArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super K, ? extends V> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(kArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "valueSelector");
        for (K k : kArr) {
            m.put(k, o00ooVar.invoke(k));
        }
        return m;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfDouble")
    public static final double o0oo0o0(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double d2 : dArr) {
            d += d2.doubleValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfByte")
    public static final double o0oo0o00(@NotNull Byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Byte b : bArr) {
            d += b.byteValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfFloat")
    public static final double o0oo0o0O(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Float f : fArr) {
            d += f.floatValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfInt")
    public static final double o0oo0o0o(@NotNull Integer[] numArr) {
        o0OOOOO0.o0ooO.o00oo0O0(numArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer num : numArr) {
            d += num.intValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfShort")
    public static final double o0oo0oO(@NotNull Short[] shArr) {
        o0OOOOO0.o0ooO.o00oo0O0(shArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Short sh : shArr) {
            d += sh.shortValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOOO0o.o00oo0OO(name = "averageOfLong")
    public static final double o0oo0oO0(@NotNull Long[] lArr) {
        o0OOOOO0.o0ooO.o00oo0O0(lArr, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Long l : lArr) {
            d += l.longValue();
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0oo0oOo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0oo0oo(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0oo0oo0(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final float o0oo0ooO(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0oo0ooo(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0ooO00(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final long o0ooO000(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0ooO00O(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0ooO00o(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0ooO0O(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0ooO0OO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0ooO0Oo(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0ooO0o(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final float o0ooO0o0(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final long o0ooO0oO(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0ooO0oo(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0ooOO0O(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0ooOO0o(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[1];
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0ooOoo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0ooOooo(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[2];
    }

    @NotNull
    public static final <K, V> Map<K, V> o0ooo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends o0OO0o.o0O0o00<? extends K, ? extends V>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int o00oOoOo2 = oo0oO0.o00oOoOo(bArr.length);
        if (o00oOoOo2 < 16) {
            o00oOoOo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
        for (byte b : bArr) {
            o0OO0o.o0O0o00<? extends K, ? extends V> invoke = o00ooVar.invoke(Byte.valueOf(b));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    public static final long o0ooo0(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0ooo000(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final float o0ooo00O(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0ooo00o(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0ooo0O(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0ooo0o(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0ooo0o0(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[2];
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0ooo0oo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final long o0oooO(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0oooO0(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0oooO00(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0oooO0O(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final float o0oooO0o(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0oooOO(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0oooOO0(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0oooOOo(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[3];
    }

    @o0OOO0OO.o00oo00O
    public static final char o0oooOo(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final byte o0oooOo0(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final double o0oooOoO(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final short o0oooo(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final int o0oooo0(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final float o0oooo00(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final long o0oooo0O(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T o0oooo0o(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr[4];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0ooooO0(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr[4];
    }

    public static final boolean o0ooooOo(@NotNull byte[] bArr, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return oOO0o0OO(bArr, b) >= 0;
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean o0ooooo(float[] fArr, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (fArr[i] == f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o0ooooo0(@NotNull char[] cArr, char c) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return oOO0o0Oo(cArr, c) >= 0;
    }

    public static final boolean o0oooooO(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return oOO0o0o(iArr, i) >= 0;
    }

    public static final boolean o0oooooo(@NotNull long[] jArr, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return oOO0o0oO(jArr, j) >= 0;
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO000o0(cArr));
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C oO0(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO000(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length;
    }

    public static final boolean oO00000(@NotNull short[] sArr, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return oOO0oO00(sArr, s) >= 0;
    }

    public static final boolean oO00000o(@NotNull boolean[] zArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return oOO0oO0(zArr, z) >= 0;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0000O(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length;
    }

    public static final int oO0000Oo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public static final int oO0000o(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0000o0(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0000oO(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length;
    }

    public static final int oO0000oo(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> int oO000O(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length;
    }

    public static final int oO000O0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO000O0O(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO000O0o(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public static final List<Double> oO000OOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return o0O0oo0o.o0o00o(oooO0o(dArr));
    }

    @NotNull
    public static final List<Short> oO000Oo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return o0O0oo0o.o0o00o(oooOooOO(sArr));
    }

    @NotNull
    public static final <T> List<T> oO000Oo0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return o0O0oo0o.o0o00o(oooO(tArr));
    }

    @NotNull
    public static final <K> List<Character> oO000OoO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (hashSet.add(o00ooVar.invoke(Character.valueOf(c)))) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> List<Float> oO000Ooo(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (hashSet.add(o00ooVar.invoke(Float.valueOf(f)))) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> List<Boolean> oO000o(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (hashSet.add(o00ooVar.invoke(Boolean.valueOf(z)))) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> List<Long> oO000o0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (hashSet.add(o00ooVar.invoke(Long.valueOf(j)))) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> List<Integer> oO000o00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (hashSet.add(o00ooVar.invoke(Integer.valueOf(i)))) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> List<Short> oO000o0o(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (hashSet.add(o00ooVar.invoke(Short.valueOf(s)))) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> oO000oO(@NotNull char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (i >= 0) {
            int length = cArr.length - i;
            return ooOoOooo(cArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> oO000oO0(@NotNull byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (i >= 0) {
            int length = bArr.length - i;
            return ooOoOooO(bArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> oO000oOO(@NotNull float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (i >= 0) {
            int length = fArr.length - i;
            return ooOoo00(fArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> oO000oOo(@NotNull long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (i >= 0) {
            int length = jArr.length - i;
            return ooOoo00O(jArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> oO000oo(@NotNull short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (i >= 0) {
            int length = sArr.length - i;
            return ooOoo0O0(sArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> oO000oo0(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (i >= 0) {
            int length = tArr.length - i;
            return ooOoo0(tArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> oO00O(@NotNull boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (i >= 0) {
            int length = zArr.length - i;
            return ooOoOoo(zArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> oO00O0o(@NotNull float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (i >= 0) {
            int length = fArr.length - i;
            return ooOoOo0O(fArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> oO00O0o0(@NotNull double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (i >= 0) {
            int length = dArr.length - i;
            return ooOoOo0(dArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> oO00O0oO(@NotNull long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (i >= 0) {
            int length = jArr.length - i;
            return ooOoOoO0(jArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> oO00O0oo(@NotNull short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (i >= 0) {
            int length = sArr.length - i;
            return ooOoOoo0(sArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> oO00OO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000oO = oOO000oO(fArr); -1 < oOO000oO; oOO000oO--) {
            if (!o00ooVar.invoke(Float.valueOf(fArr[oOO000oO])).booleanValue()) {
                return ooOoOo0O(fArr, oOO000oO + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Double> oO00OO0O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000o = oOO000o(dArr); -1 < oOO000o; oOO000o--) {
            if (!o00ooVar.invoke(Double.valueOf(dArr[oOO000o])).booleanValue()) {
                return ooOoOo0(dArr, oOO000o + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Integer> oO00OOO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000oo = oOO000oo(iArr); -1 < oOO000oo; oOO000oo--) {
            if (!o00ooVar.invoke(Integer.valueOf(iArr[oOO000oo])).booleanValue()) {
                return ooOoOo(iArr, oOO000oo + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Long> oO00OOOo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00 = oOO00(jArr); -1 < oOO00; oOO00--) {
            if (!o00ooVar.invoke(Long.valueOf(jArr[oOO00])).booleanValue()) {
                return ooOoOoO0(jArr, oOO00 + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Boolean> oO00OOo0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O0O = oOO00O0O(zArr); -1 < oOO00O0O; oOO00O0O--) {
            if (!o00ooVar.invoke(Boolean.valueOf(zArr[oOO00O0O])).booleanValue()) {
                return ooOoOoo(zArr, oOO00O0O + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Character> oO00OOoO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (char c : cArr) {
            if (z) {
                arrayList.add(Character.valueOf(c));
            } else if (!o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> oO00OOoo(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (float f : fArr) {
            if (z) {
                arrayList.add(Float.valueOf(f));
            } else if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> oO00Oo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (boolean z2 : zArr) {
            if (z) {
                arrayList.add(Boolean.valueOf(z2));
            } else if (!o00ooVar.invoke(Boolean.valueOf(z2)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z2));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> oO00Oo0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (long j : jArr) {
            if (z) {
                arrayList.add(Long.valueOf(j));
            } else if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> oO00Oo00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i : iArr) {
            if (z) {
                arrayList.add(Integer.valueOf(i));
            } else if (!o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> oO00Oo0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : tArr) {
            if (z) {
                arrayList.add(t);
            } else if (!o00ooVar.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> oO00Oo0o(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (short s : sArr) {
            if (z) {
                arrayList.add(Short.valueOf(s));
            } else if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
                z = true;
            }
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    public static final char oO00OoO(char[] cArr, int i, o0OOOO.o00oo<? super Integer, Character> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000o0(cArr)) ? o00ooVar.invoke(Integer.valueOf(i)).charValue() : cArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final byte oO00OoO0(byte[] bArr, int i, o0OOOO.o00oo<? super Integer, Byte> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000Oo(bArr)) ? o00ooVar.invoke(Integer.valueOf(i)).byteValue() : bArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final float oO00OoOO(float[] fArr, int i, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000oO(fArr)) ? o00ooVar.invoke(Integer.valueOf(i)).floatValue() : fArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final long oO00OoOo(long[] jArr, int i, o0OOOO.o00oo<? super Integer, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00(jArr)) ? o00ooVar.invoke(Integer.valueOf(i)).longValue() : jArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final short oO00Ooo(short[] sArr, int i, o0OOOO.o00oo<? super Integer, Short> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O0(sArr)) ? o00ooVar.invoke(Integer.valueOf(i)).shortValue() : sArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T oO00Ooo0(T[] tArr, int i, o0OOOO.o00oo<? super Integer, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O00(tArr)) ? o00ooVar.invoke(Integer.valueOf(i)) : tArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oO00OooO(boolean[] zArr, int i, o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O0O(zArr)) ? o00ooVar.invoke(Integer.valueOf(i)).booleanValue() : zArr[i];
    }

    @NotNull
    public static final List<Short> oO00o(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Short, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            short s = sArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> oO00o0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    public static final Character oO00o00(char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return oOO00o0(cArr, i);
    }

    @o0OOO0OO.o00oo00O
    public static final Byte oO00o000(byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return oOO00o00(bArr, i);
    }

    @o0OOO0OO.o00oo00O
    public static final Long oO00o00O(long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return oOO00o(jArr, i);
    }

    @o0OOO0OO.o00oo00O
    public static final Short oO00o00o(short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return ooooOOo0(sArr, i);
    }

    @NotNull
    public static final List<Integer> oO00o0O(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> oO00o0O0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> oO00o0OO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> oO00o0Oo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> oO00o0o(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Double, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            double d = dArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> oO00o0o0(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Character, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = cArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> oO00o0oO(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(i3)).booleanValue()) {
                arrayList.add(Integer.valueOf(i3));
            }
            i++;
            i2 = i4;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> oO00o0oo(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), t).booleanValue()) {
                arrayList.add(t);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C oO00oO0(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Double, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            double d = dArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C oO00oO00(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Character, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = cArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C oO00oO0O(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Long, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            long j = jArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C oO00oO0o(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            boolean z = zArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    public static final <R, C extends Collection<? super R>> C oO00oOO(Object[] objArr, C c) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (Object obj : objArr) {
            o0OOOOO0.o0ooO.o00oooOo();
            if (obj instanceof Object) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <R> List<R> oO00oOO0(Object[] objArr) {
        o0OOOOO0.o0ooO.o00oo0O0(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            o0OOOOO0.o0ooO.o00oooOo();
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> oO00oOOo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> oO00oOo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (!o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> oO00oOo0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> oO00ooO(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> oO00ooO0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C oO00ooOO(@NotNull T[] tArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C oO00ooOo(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C oO00ooo(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C oO00ooo0(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
        }
        return c;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C oO00oooo(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (!o00ooVar.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    public static final long oO0O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final Byte oO0O0(byte[] bArr, o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
        }
        return null;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C oO0O00(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C oO0O000(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (!o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C oO0O000o(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                c.add(Double.valueOf(d));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C oO0O00O(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                c.add(Integer.valueOf(i));
            }
        }
        return c;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C oO0O00o(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C oO0O00o0(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C oO0O00oO(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C oO0O00oo(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                c.add(Boolean.valueOf(z));
            }
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    public static final Short oO0O0O(short[] sArr, o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Double oO0O0O0(double[] dArr, o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Character oO0O0O00(char[] cArr, o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Long oO0O0O0o(long[] jArr, o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Boolean oO0O0OO(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                boolean z = zArr[length];
                if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                    return Boolean.valueOf(z);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @NotNull
    public static final List<Character> oO0O0OOO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000o0 = oOO000o0(cArr); -1 < oOO000o0; oOO000o0--) {
            if (!o00ooVar.invoke(Character.valueOf(cArr[oOO000o0])).booleanValue()) {
                return ooOoOo00(cArr, oOO000o0 + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final <T> List<T> oO0O0OOo(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (i >= 0) {
            int length = tArr.length - i;
            return ooOoOoOo(tArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @o0OOO0OO.o00oo00O
    public static final Float oO0O0Oo(float[] fArr, o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                float f = fArr[length];
                if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                    return Float.valueOf(f);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Double oO0O0Oo0(double[] dArr, o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                double d = dArr[length];
                if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                    return Double.valueOf(d);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @NotNull
    public static final List<Byte> oO0O0OoO(@NotNull byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (i >= 0) {
            int length = bArr.length - i;
            return ooOoOOoo(bArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T oO0O0o(T[] tArr, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Integer oO0O0o0O(int[] iArr, o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                int i2 = iArr[length];
                if (o00ooVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                    return Integer.valueOf(i2);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T oO0O0oO(T[] tArr, o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                T t = tArr[length];
                if (o00ooVar.invoke(t).booleanValue()) {
                    return t;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Long oO0O0oO0(long[] jArr, o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                long j = jArr[length];
                if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                    return Long.valueOf(j);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final byte oO0O0oOO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return b;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char oO0O0oOo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[0];
    }

    public static final double oO0O0oo0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    public static final float oO0O0ooO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int oO0O0ooo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    @NotNull
    public static final oO000<Boolean> oO0OO(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length == 0 ? o.f13767o00oOOo0 : new o0O0000O(zArr);
    }

    public static final long oO0OO00(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return j;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Long> oO0OO00O(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> oO0OO00o(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    public static final <T> T oO0OO0O(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    @NotNull
    public static final List<Boolean> oO0OO0OO(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return o0O0oo0o.o0o00o(oooOO00(zArr));
    }

    public static final <T> T oO0OO0Oo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Boolean> oO0OO0oO(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            boolean z = zArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(z)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> oO0OO0oo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return o0O0oo0o.o0o00o(oooO0o0o(bArr));
    }

    public static final short oO0OOO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return s;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short oO0OOO0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final Integer oO0OOO00(int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return oOO00o0o(iArr, i);
    }

    @NotNull
    public static final List<Long> oO0OOO0O(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Long, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            long j = jArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> oO0OOO0o(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Byte, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <T, R> R oO0OOOO(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        R r;
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        int length = tArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                r = o00ooVar.invoke(tArr[i]);
                if (r != null) {
                    break;
                }
                i++;
            } else {
                r = null;
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    public static final boolean oO0OOOO0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return z;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Long> oO0OOOOo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <T, R> R oO0OOOo(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            R invoke = o00ooVar.invoke(t);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    public static final List<Float> oO0OOOo0(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Float, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(f)).booleanValue()) {
                arrayList.add(Float.valueOf(f));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> oO0OOOoO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                arrayList.add(Short.valueOf(s));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> oO0OOOoo(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean oO0OOo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @Nullable
    public static final Boolean oO0OOo0(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @NotNull
    public static final <K> List<Double> oO0OOo0O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (hashSet.add(o00ooVar.invoke(Double.valueOf(d)))) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> oO0OOo0o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return o0O0oo0o.o0o00o(oooO0ooO(jArr));
    }

    @Nullable
    public static final Byte oO0OOoO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0OOoO0(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T oO0OOoOO(T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (T) oOO00oO0(tArr, i);
    }

    @o0OOO0OO.o00oo00O
    public static final Boolean oO0OOoOo(boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return oOO00Ooo(zArr, i);
    }

    @NotNull
    public static final <K> List<Byte> oO0OOoo0(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (hashSet.add(o00ooVar.invoke(Byte.valueOf(b)))) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> oO0OOooO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return o0O0oo0o.o0o00o(oooooO(cArr));
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0OOooo(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public static final oO000<Short> oO0Oo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length == 0 ? o.f13767o00oOOo0 : new o00oo(sArr);
    }

    @Nullable
    public static final Character oO0Oo0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @Nullable
    public static final Byte oO0Oo00(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
        }
        return null;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C oO0Oo00O(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
        }
        return c;
    }

    @Nullable
    public static final Character oO0Oo0O(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
        }
        return null;
    }

    @NotNull
    public static final List<Boolean> oO0Oo0Oo(@NotNull boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (i >= 0) {
            int length = zArr.length - i;
            return ooOoo0O(zArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @Nullable
    public static final Double oO0Oo0o(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
        }
        return null;
    }

    @Nullable
    public static final Double oO0Oo0o0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final int oO0Oo0oo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @Nullable
    public static final Integer oO0OoO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @Nullable
    public static final Float oO0OoO0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
        }
        return null;
    }

    @Nullable
    public static final Float oO0OoO00(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    @Nullable
    public static final Integer oO0OoOO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public static final <T> int oO0OoOO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public static final int oO0OoOOO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final Float oO0OoOo0(float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return oOO00o0O(fArr, i);
    }

    @NotNull
    public static final List<Float> oO0OoOoO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return o0O0oo0o.o0o00o(oooO0oO(fArr));
    }

    @Nullable
    public static final Long oO0Ooo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    @Nullable
    public static final Long oO0Ooo0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @NotNull
    public static final List<Double> oO0Ooo0O(@NotNull double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (i >= 0) {
            int length = dArr.length - i;
            return ooOoo000(dArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> oO0Ooo0o(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (i >= 0) {
            int length = iArr.length - i;
            return ooOooo0o(iArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @Nullable
    public static final <T> T oO0OooO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final boolean oO0OooO0(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[0];
    }

    @o0OOO0OO.o00oo00O
    public static final Double oO0OooOO(double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return oOO00ooo(dArr, i);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C oO0OooOo(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), t).booleanValue()) {
                c.add(t);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @Nullable
    public static final <T> T oO0Oooo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C oO0OoooO(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Float, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(f)).booleanValue()) {
                c.add(Float.valueOf(f));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    public static final int oO0Ooooo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (int i2 : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o(short[] sArr, C c, o0OOOO.o0O00000<? super Integer, ? super Short, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @Nullable
    public static final Short oO0o000(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
        }
        return null;
    }

    @Nullable
    public static final Short oO0o0000(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    @NotNull
    public static final <R> List<R> oO0o000O(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Byte.valueOf(b)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o000o(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Double.valueOf(d)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o0O(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o0O0(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Integer.valueOf(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o0O00(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Float.valueOf(f)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o0O0O(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> oO0o0O0o(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(t));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0OO(byte[] bArr, o0OOOO.o0O00000<? super Integer, ? super Byte, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oO0o0OO0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0OOO(char[] cArr, o0OOOO.o0O00000<? super Integer, ? super Character, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0OOo(double[] dArr, o0OOOO.o0O00000<? super Integer, ? super Double, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0Oo(float[] fArr, o0OOOO.o0O00000<? super Integer, ? super Float, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0OoO(int[] iArr, o0OOOO.o0O00000<? super Integer, ? super Integer, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0Ooo(long[] jArr, o0OOOO.o0O00000<? super Integer, ? super Long, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final int oO0o0o(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int i = 0;
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0o0(short[] sArr, o0OOOO.o0O00000<? super Integer, ? super Short, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> List<R> oO0o0o00(T[] tArr, o0OOOO.o0O00000<? super Integer, ? super T, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterable")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oO0o0o0O(boolean[] zArr, o0OOOO.o0O00000<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(arrayList, o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0o0o(byte[] bArr, C c, o0OOOO.o0O00000<? super Integer, ? super Byte, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0oO(double[] dArr, C c, o0OOOO.o0O00000<? super Integer, ? super Double, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0oO0(char[] cArr, C c, o0OOOO.o0O00000<? super Integer, ? super Character, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0oOo(float[] fArr, C c, o0OOOO.o0O00000<? super Integer, ? super Float, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0oo(int[] iArr, C c, o0OOOO.o0O00000<? super Integer, ? super Integer, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0o0ooO(long[] jArr, C c, o0OOOO.o0O00000<? super Integer, ? super Long, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C oO0o0ooo(T[] tArr, C c, o0OOOO.o0O00000<? super Integer, ? super T, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    public static final <R> R oO0oO(@NotNull double[] dArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Double, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (double d : dArr) {
            r = o0o00000.invoke(r, Double.valueOf(d));
        }
        return r;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Byte, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (byte b : bArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Byte.valueOf(b)));
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedSequence")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> List<R> oO0oO00(T[] tArr, o0OOOO.o0O00000<? super Integer, ? super T, ? extends oO000<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00Oo(arrayList, o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedIterableTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R, C extends Collection<? super R>> C oO0oO000(boolean[] zArr, C c, o0OOOO.o0O00000<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00OOO(c, o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapSequenceTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C oO0oO00o(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends oO000<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            o0O00o00.o0O00Oo(c, o00ooVar.invoke(t));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0O(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Double, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (double d : dArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Double.valueOf(d)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0O0(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Character, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (char c2 : cArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Character.valueOf(c2)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0OO(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Float, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (float f : fArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Float.valueOf(f)));
        }
        return c;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oO0oO0Oo(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(t));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0o0(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Short, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (short s : sArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Short.valueOf(s)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oO0oO0oO(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Boolean, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (boolean z : zArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return c;
    }

    public static final <R> R oO0oO0oo(@NotNull byte[] bArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Byte, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (byte b : bArr) {
            r = o0o00000.invoke(r, Byte.valueOf(b));
        }
        return r;
    }

    public static final <R> R oO0oOO0(@NotNull long[] jArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Long, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (long j : jArr) {
            r = o0o00000.invoke(r, Long.valueOf(j));
        }
        return r;
    }

    public static final <R> R oO0oOO00(@NotNull int[] iArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Integer, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int i : iArr) {
            r = o0o00000.invoke(r, Integer.valueOf(i));
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R oO0oOO0O(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (R.bool boolVar : tArr) {
            r = o0o00000.invoke(r, boolVar);
        }
        return r;
    }

    public static final <R> R oO0oOO0o(@NotNull short[] sArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Short, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (short s : sArr) {
            r = o0o00000.invoke(r, Short.valueOf(s));
        }
        return r;
    }

    public static final <R> R oO0oOOO(@NotNull boolean[] zArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Boolean, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (boolean z : zArr) {
            r = o0o00000.invoke(r, Boolean.valueOf(z));
        }
        return r;
    }

    @NotNull
    public static final List<Byte> oO0oOOO0(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (byte b : bArr) {
            if (z) {
                arrayList.add(Byte.valueOf(b));
            } else if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
                z = true;
            }
        }
        return arrayList;
    }

    public static final <R> R oO0oOOOO(@NotNull byte[] bArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Byte, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    @o0OOO0OO.o00oo00O
    public static final int oO0oOOOo(int[] iArr, int i, o0OOOO.o00oo<? super Integer, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000oo(iArr)) ? o00ooVar.invoke(Integer.valueOf(i)).intValue() : iArr[i];
    }

    public static final <R> R oO0oOOo(@NotNull double[] dArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Double, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOOo0(@NotNull char[] cArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Character, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOOoO(@NotNull float[] fArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Float, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOOoo(@NotNull int[] iArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Integer, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOo(@NotNull boolean[] zArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Boolean, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R oO0oOo0(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, tArr[i]);
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOo00(@NotNull long[] jArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Long, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOo0O(@NotNull short[] sArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super Short, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r = o0o0000o.invoke(Integer.valueOf(i2), r, Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
        return r;
    }

    public static final <R> R oO0oOoO(@NotNull char[] cArr, R r, @NotNull o0OOOO.o0O00000<? super Character, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO000o0 = oOO000o0(cArr); oOO000o0 >= 0; oOO000o0--) {
            r = o0o00000.invoke(Character.valueOf(cArr[oOO000o0]), r);
        }
        return r;
    }

    public static final <R> R oO0oOoO0(@NotNull byte[] bArr, R r, @NotNull o0OOOO.o0O00000<? super Byte, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO000Oo = oOO000Oo(bArr); oOO000Oo >= 0; oOO000Oo--) {
            r = o0o00000.invoke(Byte.valueOf(bArr[oOO000Oo]), r);
        }
        return r;
    }

    public static final <R> R oO0oOoOO(@NotNull float[] fArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Float, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (float f : fArr) {
            r = o0o00000.invoke(r, Float.valueOf(f));
        }
        return r;
    }

    public static final <R> R oO0oOoOo(@NotNull float[] fArr, R r, @NotNull o0OOOO.o0O00000<? super Float, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO000oO = oOO000oO(fArr); oOO000oO >= 0; oOO000oO--) {
            r = o0o00000.invoke(Float.valueOf(fArr[oOO000oO]), r);
        }
        return r;
    }

    public static final <R> R oO0oOoo(@NotNull long[] jArr, R r, @NotNull o0OOOO.o0O00000<? super Long, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO00 = oOO00(jArr); oOO00 >= 0; oOO00--) {
            r = o0o00000.invoke(Long.valueOf(jArr[oOO00]), r);
        }
        return r;
    }

    public static final <R> R oO0oOoo0(@NotNull int[] iArr, R r, @NotNull o0OOOO.o0O00000<? super Integer, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO000oo = oOO000oo(iArr); oOO000oo >= 0; oOO000oo--) {
            r = o0o00000.invoke(Integer.valueOf(iArr[oOO000oo]), r);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R oO0oOooO(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O00000<? super T, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO00O00 = oOO00O00(tArr); oOO00O00 >= 0; oOO00O00--) {
            r = o0o00000.invoke(tArr[oOO00O00], r);
        }
        return r;
    }

    public static final <R> R oO0oOooo(@NotNull double[] dArr, R r, @NotNull o0OOOO.o0O00000<? super Double, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO000o = oOO000o(dArr); oOO000o >= 0; oOO000o--) {
            r = o0o00000.invoke(Double.valueOf(dArr[oOO000o]), r);
        }
        return r;
    }

    public static final void oO0oo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (byte b : bArr) {
            o00ooVar.invoke(Byte.valueOf(b));
        }
    }

    public static final <R> R oO0oo0(@NotNull char[] cArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Character, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO000o0 = oOO000o0(cArr); oOO000o0 >= 0; oOO000o0--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO000o0), Character.valueOf(cArr[oOO000o0]), r);
        }
        return r;
    }

    public static final <R> R oO0oo000(@NotNull short[] sArr, R r, @NotNull o0OOOO.o0O00000<? super Short, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO00O0 = oOO00O0(sArr); oOO00O0 >= 0; oOO00O0--) {
            r = o0o00000.invoke(Short.valueOf(sArr[oOO00O0]), r);
        }
        return r;
    }

    public static final <R> R oO0oo00O(@NotNull boolean[] zArr, R r, @NotNull o0OOOO.o0O00000<? super Boolean, ? super R, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (int oOO00O0O = oOO00O0O(zArr); oOO00O0O >= 0; oOO00O0O--) {
            r = o0o00000.invoke(Boolean.valueOf(zArr[oOO00O0O]), r);
        }
        return r;
    }

    public static final <R> R oO0oo00o(@NotNull byte[] bArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO000Oo = oOO000Oo(bArr); oOO000Oo >= 0; oOO000Oo--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO000Oo), Byte.valueOf(bArr[oOO000Oo]), r);
        }
        return r;
    }

    public static final <R> R oO0oo0O(@NotNull float[] fArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Float, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO000oO = oOO000oO(fArr); oOO000oO >= 0; oOO000oO--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO000oO), Float.valueOf(fArr[oOO000oO]), r);
        }
        return r;
    }

    public static final <R> R oO0oo0O0(@NotNull double[] dArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Double, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO000o = oOO000o(dArr); oOO000o >= 0; oOO000o--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO000o), Double.valueOf(dArr[oOO000o]), r);
        }
        return r;
    }

    public static final <R> R oO0oo0OO(@NotNull int[] iArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO000oo = oOO000oo(iArr); oOO000oo >= 0; oOO000oo--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO000oo), Integer.valueOf(iArr[oOO000oo]), r);
        }
        return r;
    }

    public static final <R> R oO0oo0Oo(@NotNull long[] jArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Long, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO00 = oOO00(jArr); oOO00 >= 0; oOO00--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO00), Long.valueOf(jArr[oOO00]), r);
        }
        return r;
    }

    public static final <R> R oO0oo0o(@NotNull short[] sArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Short, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO00O0 = oOO00O0(sArr); oOO00O0 >= 0; oOO00O0--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO00O0), Short.valueOf(sArr[oOO00O0]), r);
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R oO0oo0o0(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super T, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO00O00 = oOO00O00(tArr); oOO00O00 >= 0; oOO00O00--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO00O00), tArr[oOO00O00], r);
        }
        return r;
    }

    public static final <R> R oO0oo0oo(@NotNull boolean[] zArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super R, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        for (int oOO00O0O = oOO00O0O(zArr); oOO00O0O >= 0; oOO00O0O--) {
            r = o0o0000o.invoke(Integer.valueOf(oOO00O0O), Boolean.valueOf(zArr[oOO00O0O]), r);
        }
        return r;
    }

    public static final void oO0ooO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (long j : jArr) {
            o00ooVar.invoke(Long.valueOf(j));
        }
    }

    public static final void oO0ooO0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (double d : dArr) {
            o00ooVar.invoke(Double.valueOf(d));
        }
    }

    public static final void oO0ooO00(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (char c : cArr) {
            o00ooVar.invoke(Character.valueOf(c));
        }
    }

    public static final void oO0ooO0O(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (float f : fArr) {
            o00ooVar.invoke(Float.valueOf(f));
        }
    }

    public static final void oO0ooO0o(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (int i : iArr) {
            o00ooVar.invoke(Integer.valueOf(i));
        }
    }

    public static final void oO0ooOO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (short s : sArr) {
            o00ooVar.invoke(Short.valueOf(s));
        }
    }

    public static final <T> void oO0ooOO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (T t : tArr) {
            o00ooVar.invoke(t);
        }
    }

    public static final void oO0oooO(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Character, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
    }

    public static final void oO0oooO0(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Byte, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
    }

    public static final void oO0oooOO(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Double, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
    }

    public static final void oO0oooOo(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
    }

    public static final void oO0oooo(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Short, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
    }

    public static final <T> void oO0oooo0(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), tArr[i]);
            i++;
            i2++;
        }
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oO0ooooo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO000Oo(bArr));
    }

    @NotNull
    public static final Set<Integer> oOO(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Integer> oooO0oo = oooO0oo(iArr);
        o0O00o00.o0O0OOoo(oooO0oo, iterable);
        return oooO0oo;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Double, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d : dArr) {
            K invoke = o00ooVar.invoke(Double.valueOf(d));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Double.valueOf(d)));
        }
        return linkedHashMap;
    }

    public static final int oOO00(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length - 1;
    }

    @NotNull
    public static final <T> o0OOOo0o.o0O0O0Oo oOO000(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO00O00(tArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO0000(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO000oO(fArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO00000(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO000o(dArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO0000O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO000oo(iArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO0000o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO00(jArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO000O0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO00O0(sArr));
    }

    @NotNull
    public static final o0OOOo0o.o0O0O0Oo oOO000OO(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return new o0OOOo0o.o0O0O0Oo(0, oOO00O0O(zArr));
    }

    public static final int oOO000Oo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final int oOO000o(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length - 1;
    }

    public static final int oOO000o0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length - 1;
    }

    public static final int oOO000oO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final int oOO000oo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final int oOO00O0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length - 1;
    }

    public static final <T> int oOO00O00(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final int oOO00O0O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length - 1;
    }

    @o0OOO0OO.o00oo00O
    public static final byte oOO00O0o(byte[] bArr, int i, o0OOOO.o00oo<? super Integer, Byte> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000Oo(bArr)) ? o00ooVar.invoke(Integer.valueOf(i)).byteValue() : bArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final double oOO00OO(double[] dArr, int i, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000o(dArr)) ? o00ooVar.invoke(Integer.valueOf(i)).doubleValue() : dArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final char oOO00OO0(char[] cArr, int i, o0OOOO.o00oo<? super Integer, Character> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000o0(cArr)) ? o00ooVar.invoke(Integer.valueOf(i)).charValue() : cArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final float oOO00OOO(float[] fArr, int i, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000oO(fArr)) ? o00ooVar.invoke(Integer.valueOf(i)).floatValue() : fArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final int oOO00OOo(int[] iArr, int i, o0OOOO.o00oo<? super Integer, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000oo(iArr)) ? o00ooVar.invoke(Integer.valueOf(i)).intValue() : iArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final <T> T oOO00Oo(T[] tArr, int i, o0OOOO.o00oo<? super Integer, ? extends T> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O00(tArr)) ? o00ooVar.invoke(Integer.valueOf(i)) : tArr[i];
    }

    @o0OOO0OO.o00oo00O
    public static final long oOO00Oo0(long[] jArr, int i, o0OOOO.o00oo<? super Integer, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00(jArr)) ? o00ooVar.invoke(Integer.valueOf(i)).longValue() : jArr[i];
    }

    @Nullable
    public static final Boolean oOO00Ooo(@NotNull boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (i < 0 || i > oOO00O0O(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i]);
    }

    @Nullable
    public static final Long oOO00o(@NotNull long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (i < 0 || i > oOO00(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i]);
    }

    @Nullable
    public static final Character oOO00o0(@NotNull char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (i < 0 || i > oOO000o0(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i]);
    }

    @Nullable
    public static final Byte oOO00o00(@NotNull byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (i < 0 || i > oOO000Oo(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i]);
    }

    @Nullable
    public static final Float oOO00o0O(@NotNull float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (i < 0 || i > oOO000oO(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    @Nullable
    public static final Integer oOO00o0o(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (i < 0 || i > oOO000oo(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    @Nullable
    public static final <T> T oOO00oO0(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (i < 0 || i > oOO00O00(tArr)) {
            return null;
        }
        return tArr[i];
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO00oOO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b : bArr) {
            K invoke = o00ooVar.invoke(Byte.valueOf(b));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Byte.valueOf(b)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> oOO00oOo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c : cArr) {
            K invoke = o00ooVar.invoke(Character.valueOf(c));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Character.valueOf(c));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO00oo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Character, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c : cArr) {
            K invoke = o00ooVar.invoke(Character.valueOf(c));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Character.valueOf(c)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Double>> oOO00ooO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d : dArr) {
            K invoke = o00ooVar.invoke(Double.valueOf(d));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Double.valueOf(d));
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Double oOO00ooo(@NotNull double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (i < 0 || i > oOO000o(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i]);
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M oOO0O(@NotNull byte[] bArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (byte b : bArr) {
            K invoke = o00ooVar.invoke(Byte.valueOf(b));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Byte.valueOf(b));
        }
        return m;
    }

    @NotNull
    public static final <K> Map<K, List<Long>> oOO0O0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j : jArr) {
            K invoke = o00ooVar.invoke(Long.valueOf(j));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Long.valueOf(j));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0O000(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Float, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f : fArr) {
            K invoke = o00ooVar.invoke(Float.valueOf(f));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Float.valueOf(f)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> oOO0O00O(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i : iArr) {
            K invoke = o00ooVar.invoke(Integer.valueOf(i));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0O00o(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i : iArr) {
            K invoke = o00ooVar.invoke(Integer.valueOf(i));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> oOO0O0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : tArr) {
            K invoke = o00ooVar.invoke(t);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(t);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0O0O0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Long, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j : jArr) {
            K invoke = o00ooVar.invoke(Long.valueOf(j));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Long.valueOf(j)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> oOO0O0OO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : tArr) {
            K invoke = o00ooVar.invoke(t);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(t));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Short>> oOO0O0Oo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s : sArr) {
            K invoke = o00ooVar.invoke(Short.valueOf(s));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Short.valueOf(s));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> oOO0O0o(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K invoke = o00ooVar.invoke(Boolean.valueOf(z));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Boolean.valueOf(z));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0O0o0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Short, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s : sArr) {
            K invoke = o00ooVar.invoke(Short.valueOf(s));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Short.valueOf(s)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> oOO0O0oo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z : zArr) {
            K invoke = o00ooVar.invoke(Boolean.valueOf(z));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M oOO0OO(@NotNull double[] dArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (double d : dArr) {
            K invoke = o00ooVar.invoke(Double.valueOf(d));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Double.valueOf(d));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0OO0(@NotNull byte[] bArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Byte, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (byte b : bArr) {
            K invoke = o00ooVar.invoke(Byte.valueOf(b));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Byte.valueOf(b)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M oOO0OO0O(@NotNull char[] cArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (char c : cArr) {
            K invoke = o00ooVar.invoke(Character.valueOf(c));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Character.valueOf(c));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0OO0o(@NotNull char[] cArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Character, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Character, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (char c : cArr) {
            K invoke = o00ooVar.invoke(Character.valueOf(c));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Character.valueOf(c)));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0OOO(@NotNull double[] dArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Double, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Double, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (double d : dArr) {
            K invoke = o00ooVar.invoke(Double.valueOf(d));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Double.valueOf(d)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M oOO0OOOO(@NotNull float[] fArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (float f : fArr) {
            K invoke = o00ooVar.invoke(Float.valueOf(f));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Float.valueOf(f));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0OOOo(@NotNull float[] fArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Float, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (float f : fArr) {
            K invoke = o00ooVar.invoke(Float.valueOf(f));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Float.valueOf(f)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M oOO0OOo(@NotNull int[] iArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (int i : iArr) {
            K invoke = o00ooVar.invoke(Integer.valueOf(i));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Integer.valueOf(i));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0OOoO(@NotNull int[] iArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Integer, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Integer, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (int i : iArr) {
            K invoke = o00ooVar.invoke(Integer.valueOf(i));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Integer.valueOf(i)));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M oOO0OOoo(@NotNull long[] jArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (long j : jArr) {
            K invoke = o00ooVar.invoke(Long.valueOf(j));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Long.valueOf(j));
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0Oo(@NotNull short[] sArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Short, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (short s : sArr) {
            K invoke = o00ooVar.invoke(Short.valueOf(s));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Short.valueOf(s)));
        }
        return m;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M oOO0Oo0(@NotNull T[] tArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (T t : tArr) {
            K invoke = o00ooVar.invoke(t);
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(t);
        }
        return m;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0Oo00(@NotNull long[] jArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Long, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Long, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (long j : jArr) {
            K invoke = o00ooVar.invoke(Long.valueOf(j));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Long.valueOf(j)));
        }
        return m;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M oOO0Oo0O(@NotNull T[] tArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super T, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (T t : tArr) {
            K invoke = o00ooVar.invoke(t);
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(t));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M oOO0Oo0o(@NotNull short[] sArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Short, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (short s : sArr) {
            K invoke = o00ooVar.invoke(Short.valueOf(s));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Short.valueOf(s));
        }
        return m;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M oOO0OoO0(@NotNull boolean[] zArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        for (boolean z : zArr) {
            K invoke = o00ooVar.invoke(Boolean.valueOf(z));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(Boolean.valueOf(z));
        }
        return m;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    @NotNull
    public static final <T, K> o0O0OOO<T, K> oOO0o0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        return new C0168o0O000O(tArr, o00ooVar);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M oOO0o0O0(@NotNull boolean[] zArr, @NotNull M m, @NotNull o0OOOO.o00oo<? super Boolean, ? extends K> o00ooVar, @NotNull o0OOOO.o00oo<? super Boolean, ? extends V> o00ooVar2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(m, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar2, "valueTransform");
        for (boolean z : zArr) {
            K invoke = o00ooVar.invoke(Boolean.valueOf(z));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O0000O.o00oOOo0(m, invoke);
            }
            ((List) obj).add(o00ooVar2.invoke(Boolean.valueOf(z)));
        }
        return m;
    }

    public static final int oOO0o0OO(@NotNull byte[] bArr, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0o0Oo(@NotNull char[] cArr, char c) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0o0o(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int oOO0o0o0(float[] fArr, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (f == fArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0o0oO(@NotNull long[] jArr, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> int oOO0o0oo(@NotNull T[] tArr, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (o0OOOOO0.o0ooO.o00oOoO0(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int oOO0oO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Double.valueOf(dArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oO0(@NotNull boolean[] zArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (z == zArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oO00(@NotNull short[] sArr, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oO0O(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Byte.valueOf(bArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oO0o(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Character.valueOf(cArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOO0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOOO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Long.valueOf(jArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> int oOO0oOOo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(tArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Short.valueOf(sArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOoO(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (o00ooVar.invoke(Boolean.valueOf(zArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int oOO0oOoo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0oo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0oo0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0oo00(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0oo0O(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0oo0o(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final <T> int oOO0ooO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0ooOO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOO0ooOo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (o00ooVar.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Character> oOO0ooo(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Character> oooooO = oooooO(cArr);
        o0O00o00.o0O0OOoo(oooooO, iterable);
        return oooooO;
    }

    @NotNull
    public static final Set<Byte> oOO0ooo0(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Byte> oooO0o0o = oooO0o0o(bArr);
        o0O00o00.o0O0OOoo(oooO0o0o, iterable);
        return oooO0o0o;
    }

    @NotNull
    public static final Set<Double> oOO0oooO(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Double> oooO0o = oooO0o(dArr);
        o0O00o00.o0O0OOoo(oooO0o, iterable);
        return oooO0o;
    }

    @NotNull
    public static final Set<Float> oOO0oooo(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Float> oooO0oO = oooO0oO(fArr);
        o0O00o00.o0O0OOoo(oooO0oO, iterable);
        return oooO0oO;
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean oOOO0(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length == 0;
    }

    @NotNull
    public static final Set<Boolean> oOOO00(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Boolean> oooOO00 = oooOO00(zArr);
        o0O00o00.o0O0OOoo(oooOO00, iterable);
        return oooOO00;
    }

    @NotNull
    public static final Set<Long> oOOO000(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Long> oooO0ooO = oooO0ooO(jArr);
        o0O00o00.o0O0OOoo(oooO0ooO, iterable);
        return oooO0ooO;
    }

    @NotNull
    public static final <T> Set<T> oOOO000o(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<T> oooO = oooO(tArr);
        o0O00o00.o0O0OOoo(oooO, iterable);
        return oooO;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00O(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00Oo(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00o(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00o0(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00oO(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO00oo(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0O0(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0O0o(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length == 0;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0OO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0OO0(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0OOO(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0OOo(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0Oo(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0OoO(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final <T> boolean oOOO0Ooo(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0o(@NotNull double[] dArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Double, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Double.valueOf(d)) : String.valueOf(d));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0o0(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean oOOO0o0O(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0o0o(@NotNull byte[] bArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Byte, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Byte.valueOf(b)) : String.valueOf((int) b));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0oO(@NotNull int[] iArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Integer, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Integer.valueOf(i3)) : String.valueOf(i3));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0oO0(@NotNull float[] fArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Float, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Float.valueOf(f)) : String.valueOf(f));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0oo(@NotNull boolean[] zArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Boolean, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (boolean z : zArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Boolean.valueOf(z)) : String.valueOf(z));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0oo0(@NotNull short[] sArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Short, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Short.valueOf(s)) : String.valueOf((int) s));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <T, A extends Appendable> A oOOO0ooO(@NotNull T[] tArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super T, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            oOo000Oo.o00oOOoO(a, t, o00ooVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <A extends Appendable> A oOOO0ooo(@NotNull long[] jArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Long, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            a.append(o00ooVar != null ? o00ooVar.invoke(Long.valueOf(j)) : String.valueOf(j));
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final <T> String oOOOO(@NotNull T[] tArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super T, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0ooO(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final String oOOOO0Oo(@NotNull byte[] bArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Byte, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0o0o(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final String oOOOO0o(@NotNull double[] dArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Double, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0o(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final String oOOOO0o0(@NotNull char[] cArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Character, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOOOO(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final String oOOOO0oO(@NotNull float[] fArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Float, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0oO0(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final String oOOOO0oo(@NotNull int[] iArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Integer, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0oO(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @NotNull
    public static final <A extends Appendable> A oOOOOO(@NotNull char[] cArr, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Character, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(a, "buffer");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (o00ooVar != null) {
                a.append(o00ooVar.invoke(Character.valueOf(c)));
            } else {
                a.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    public static final String oOOOOOoo(@NotNull short[] sArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Short, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0oo0(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String oOOOOo(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO0oO(fArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOo0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO0Oo(bArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    @NotNull
    public static final String oOOOOo00(@NotNull boolean[] zArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Boolean, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0oo(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String oOOOOo0O(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO0o0(cArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOo0o(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO0o(dArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOoO(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOo0o(jArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOoO0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO0oo(iArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOoOO(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOO(objArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOoo(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOOo00(zArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static /* synthetic */ String oOOOOoo0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, o0OOOO.o00oo o00ooVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            o00ooVar = null;
        }
        return oOOOOOoo(sArr, charSequence, str, str2, i3, charSequence5, o00ooVar);
    }

    public static final byte oOOOOooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[oOO000Oo(bArr)];
    }

    public static final byte oOOOOooo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                byte b = bArr[length];
                if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return b;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short oOOOo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[oOO00O0(sArr)];
    }

    public static final float oOOOo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[oOO000oO(fArr)];
    }

    public static final char oOOOo00(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char c = cArr[length];
                if (!o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return c;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char oOOOo000(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[oOO000o0(cArr)];
    }

    public static final double oOOOo00O(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[oOO000o(dArr)];
    }

    public static final double oOOOo00o(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                double d = dArr[length];
                if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return d;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float oOOOo0O(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                float f = fArr[length];
                if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return f;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int oOOOo0OO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[oOO000oo(iArr)];
    }

    public static final int oOOOo0Oo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                int i2 = iArr[length];
                if (!o00ooVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return i2;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long oOOOo0o(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                long j = jArr[length];
                if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return j;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long oOOOo0o0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[oOO00(jArr)];
    }

    public static final <T> T oOOOo0oO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[oOO00O00(tArr)];
    }

    public static final <T> T oOOOo0oo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                T t = tArr[length];
                if (!o00ooVar.invoke(t).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return t;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final Set<Short> oOOOoO(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Short> oooOooOO = oooOooOO(sArr);
        o0O00o00.o0O0OOoo(oooOooOO, iterable);
        return oooOooOO;
    }

    public static final short oOOOoO00(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                short s = sArr[length];
                if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return s;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean oOOOoO0O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[oOO00O0O(zArr)];
    }

    public static final boolean oOOOoO0o(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                boolean z = zArr[length];
                if (!o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return z;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int oOOOoOO(@NotNull char[] cArr, char c) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (c == cArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOOOoOO0(@NotNull byte[] bArr, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (b == bArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int oOOOoOOO(double[] dArr, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (d == dArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int oOOOoOOo(float[] fArr, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (f == fArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOOOoOo(@NotNull long[] jArr, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (j == jArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOOOoOo0(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static final <T> int oOOOoOoO(@NotNull T[] tArr, T t) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (o0OOOOO0.o0ooO.o00oOoO0(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Boolean oOOOoo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            boolean z = zArr[length];
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    public static final int oOOOoo0(@NotNull short[] sArr, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (s == sArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int oOOOoo0O(@NotNull boolean[] zArr, boolean z) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (z == zArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @Nullable
    public static final Boolean oOOOoo0o(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @Nullable
    public static final Byte oOOOooO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            byte b = bArr[length];
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return Byte.valueOf(b);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Byte oOOOooO0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @Nullable
    public static final Character oOOOooOO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @Nullable
    public static final Character oOOOooOo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char c = cArr[length];
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return Character.valueOf(c);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Double oOOOooo0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @Nullable
    public static final Double oOOOoooO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            double d = dArr[length];
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return Double.valueOf(d);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Float oOOOoooo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> oOOo0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(o00ooVar.invoke(Float.valueOf(f)));
        }
        return arrayList;
    }

    @Nullable
    public static final Long oOOo00(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            long j = jArr[length];
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return Long.valueOf(j);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Integer oOOo000(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @Nullable
    public static final Float oOOo0000(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            float f = fArr[length];
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Integer oOOo000O(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            int i2 = iArr[length];
            if (o00ooVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final Long oOOo000o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @Nullable
    public static final <T> T oOOo00O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            T t = tArr[length];
            if (o00ooVar.invoke(t).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @Nullable
    public static final <T> T oOOo00O0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @Nullable
    public static final Short oOOo00Oo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> oOOo00o(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(o00ooVar.invoke(Byte.valueOf(b)));
        }
        return arrayList;
    }

    @Nullable
    public static final Short oOOo00o0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            short s = sArr[length];
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return Short.valueOf(s);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    @NotNull
    public static final <R> List<R> oOOo00oO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(o00ooVar.invoke(Character.valueOf(c)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo00oo(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(o00ooVar.invoke(Double.valueOf(d)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0O(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(o00ooVar.invoke(Short.valueOf(s)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0O0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(o00ooVar.invoke(Long.valueOf(j)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0O00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(o00ooVar.invoke(Integer.valueOf(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> oOOo0O0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(o00ooVar.invoke(t));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0OO(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Byte, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0OO0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0OOO(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Character, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0OOo(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Double, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0Oo(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0Oo0(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Float, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0OoO(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Long, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> oOOo0Ooo(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oOOo0o(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            R invoke = o0o00000.invoke(Integer.valueOf(i2), tArr[i]);
            if (invoke != null) {
                c.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @NotNull
    public static final <R> List<R> oOOo0o0(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Short, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> oOOo0o0O(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Boolean, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> oOOo0o0o(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            R invoke = o0o00000.invoke(Integer.valueOf(i2), tArr[i]);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOo0oO(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Character, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOo0oO0(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Byte, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOo0oOO(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Double, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOo0oOo(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Float, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOo0oo0(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoO(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (byte b : bArr) {
            c.add(o00ooVar.invoke(Byte.valueOf(b)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoO0O(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Long, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oOOoO0OO(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoO0Oo(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Short, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoO0o(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Boolean, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c.add(o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i])));
            i++;
            i2++;
        }
        return c;
    }

    @NotNull
    public static final <T, R> List<R> oOOoO0oO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            R invoke = o00ooVar.invoke(t);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oOOoO0oo(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            R invoke = o00ooVar.invoke(t);
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOO00(@NotNull double[] dArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (double d : dArr) {
            c.add(o00ooVar.invoke(Double.valueOf(d)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOO0O(@NotNull float[] fArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (float f : fArr) {
            c.add(o00ooVar.invoke(Float.valueOf(f)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOO0o(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (char c2 : cArr) {
            c.add(o00ooVar.invoke(Character.valueOf(c2)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOOO(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (int i : iArr) {
            c.add(o00ooVar.invoke(Integer.valueOf(i)));
        }
        return c;
    }

    @o0OOO0OO.o00oo00O
    public static final double oOOoOOO0(double[] dArr, int i, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO000o(dArr)) ? o00ooVar.invoke(Integer.valueOf(i)).doubleValue() : dArr[i];
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOOOO(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (long j : jArr) {
            c.add(o00ooVar.invoke(Long.valueOf(j)));
        }
        return c;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C oOOoOOOo(@NotNull T[] tArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (T t : tArr) {
            c.add(o00ooVar.invoke(t));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOOo(@NotNull boolean[] zArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (boolean z : zArr) {
            c.add(o00ooVar.invoke(Boolean.valueOf(z)));
        }
        return c;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOOoOOo0(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (short s : sArr) {
            c.add(o00ooVar.invoke(Short.valueOf(s)));
        }
        return c;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean oOOoOOoO(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(z));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0O);
        while (o00oOOo02.hasNext()) {
            boolean z2 = zArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
            if (invoke.compareTo(invoke2) < 0) {
                z = z2;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte oOOoOOoo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return Byte.valueOf(b);
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(b));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte b2 = bArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
            if (invoke.compareTo(invoke2) < 0) {
                b = b2;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer oOOoOo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo == 0) {
            return Integer.valueOf(i);
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(i));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int i2 = iArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
            if (invoke.compareTo(invoke2) < 0) {
                i = i2;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character oOOoOo00(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 == 0) {
            return Character.valueOf(c);
        }
        R invoke = o00ooVar.invoke(Character.valueOf(c));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o0);
        while (o00oOOo02.hasNext()) {
            char c2 = cArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
            if (invoke.compareTo(invoke2) < 0) {
                c = c2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double oOOoOo0O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int oOO000o = oOO000o(dArr);
        if (oOO000o == 0) {
            return Double.valueOf(d);
        }
        R invoke = o00ooVar.invoke(Double.valueOf(d));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o);
        while (o00oOOo02.hasNext()) {
            double d2 = dArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float oOOoOo0o(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO == 0) {
            return Float.valueOf(f);
        }
        R invoke = o00ooVar.invoke(Float.valueOf(f));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oO);
        while (o00oOOo02.hasNext()) {
            float f2 = fArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
            if (invoke.compareTo(invoke2) < 0) {
                f = f2;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T oOOoOoO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 == 0) {
            return t;
        }
        R invoke = o00ooVar.invoke(t);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O00);
        while (o00oOOo02.hasNext()) {
            T t2 = tArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(t2);
            if (invoke.compareTo(invoke2) < 0) {
                t = t2;
                invoke = invoke2;
            }
        }
        return t;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long oOOoOoO0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int oOO00 = oOO00(jArr);
        if (oOO00 == 0) {
            return Long.valueOf(j);
        }
        R invoke = o00ooVar.invoke(Long.valueOf(j));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long j2 = jArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @NotNull
    public static final List<Double> oOOoOoOO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (double d : dArr) {
            if (z) {
                arrayList.add(Double.valueOf(d));
            } else if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
                z = true;
            }
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short oOOoOoOo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return Short.valueOf(s);
        }
        R invoke = o00ooVar.invoke(Short.valueOf(s));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short s2 = sArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
            if (invoke.compareTo(invoke2) < 0) {
                s = s2;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> char oOOoOoo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 == 0) {
            return c;
        }
        R invoke = o00ooVar.invoke(Character.valueOf(c));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o0);
        while (o00oOOo02.hasNext()) {
            char c2 = cArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
            if (invoke.compareTo(invoke2) < 0) {
                c = c2;
                invoke = invoke2;
            }
        }
        return c;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> byte oOOoOoo0(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return b;
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(b));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte b2 = bArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
            if (invoke.compareTo(invoke2) < 0) {
                b = b2;
                invoke = invoke2;
            }
        }
        return b;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> double oOOoOooO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        int oOO000o = oOO000o(dArr);
        if (oOO000o == 0) {
            return d;
        }
        R invoke = o00ooVar.invoke(Double.valueOf(d));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o);
        while (o00oOOo02.hasNext()) {
            double d2 = dArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                d = d2;
            }
        }
        return d;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> double oOOoo(T[] tArr, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(tArr[0]).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return doubleValue;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> short oOOoo0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return s;
        }
        R invoke = o00ooVar.invoke(Short.valueOf(s));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short s2 = sArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
            if (invoke.compareTo(invoke2) < 0) {
                s = s2;
                invoke = invoke2;
            }
        }
        return s;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> int oOOoo00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo == 0) {
            return i;
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(i));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int i2 = iArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
            if (invoke.compareTo(invoke2) < 0) {
                i = i2;
                invoke = invoke2;
            }
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> float oOOoo000(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO == 0) {
            return f;
        }
        R invoke = o00ooVar.invoke(Float.valueOf(f));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oO);
        while (o00oOOo02.hasNext()) {
            float f2 = fArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
            if (invoke.compareTo(invoke2) < 0) {
                f = f2;
                invoke = invoke2;
            }
        }
        return f;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> long oOOoo00O(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        int oOO00 = oOO00(jArr);
        if (oOO00 == 0) {
            return j;
        }
        R invoke = o00ooVar.invoke(Long.valueOf(j));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long j2 = jArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                j = j2;
            }
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T oOOoo00o(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 == 0) {
            return t;
        }
        R invoke = o00ooVar.invoke(t);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O00);
        while (o00oOOo02.hasNext()) {
            T t2 = tArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(t2);
            if (invoke.compareTo(invoke2) < 0) {
                t = t2;
                invoke = invoke2;
            }
        }
        return t;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0O(byte[] bArr, o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OOOO0o.o00oo0OO(name = "maxByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean oOOoo0O0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = zArr[0];
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O == 0) {
            return z;
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(z));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0O);
        while (o00oOOo02.hasNext()) {
            boolean z2 = zArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
            if (invoke.compareTo(invoke2) < 0) {
                z = z2;
                invoke = invoke2;
            }
        }
        return z;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0OO(char[] cArr, o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Character.valueOf(cArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0Oo(double[] dArr, o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Double.valueOf(dArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0o(float[] fArr, o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Float.valueOf(fArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0oO(int[] iArr, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOoo0oo(long[] jArr, o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Long.valueOf(jArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooO(double[] dArr, o0OOOO.o00oo<? super Double, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Double.valueOf(dArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOooO0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOOooO00(short[] sArr, o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Short.valueOf(sArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooO0O(byte[] bArr, o0OOOO.o00oo<? super Byte, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooO0o(char[] cArr, o0OOOO.o00oo<? super Character, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Character.valueOf(cArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooOO(float[] fArr, o0OOOO.o00oo<? super Float, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Float.valueOf(fArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooOOO(int[] iArr, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooOOo(long[] jArr, o0OOOO.o00oo<? super Long, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Long.valueOf(jArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooOo(short[] sArr, o0OOOO.o00oo<? super Short, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Short.valueOf(sArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> float oOOooOo0(T[] tArr, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(tArr[0]).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(tArr[it.nextInt()]).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOOooOoO(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooOoo(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooo(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooo0(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooo00(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooo0o(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R oOOoooO(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOoooO0(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOoooOO(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOoooOo(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOoooo(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOoooo0(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOOooooO(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> Double oOo0(T[] tArr, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(tArr[0]).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOo000(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOo0000(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C oOo0000O(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c2 : cArr) {
            if (!o00ooVar.invoke(Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOo000O(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    public static final void oOo000OO(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Long, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
    }

    @NotNull
    public static final <T> List<T> oOo000Oo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (List) oO00ooOO(tArr, new ArrayList());
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R oOo000o(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C oOo000o0(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                c.add(Long.valueOf(j));
            }
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C oOo000oo(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (!o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                c.add(Integer.valueOf(i));
            }
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOo00O(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOo00O0(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapIndexedSequenceTo")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R, C extends Collection<? super R>> C oOo00O0O(T[] tArr, C c, o0OOOO.o0O00000<? super Integer, ? super T, ? extends oO000<? extends R>> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0O00o00.o0O00Oo(c, o0o00000.invoke(Integer.valueOf(i2), tArr[i]));
            i++;
            i2++;
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo00OO(byte[] bArr, o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @NotNull
    public static final List<Integer> oOo00OO0(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (i >= 0) {
            int length = iArr.length - i;
            return ooOoOo(iArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    public static final double oOo00OOO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return d;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char oOo00OOo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return c;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo00Oo(double[] dArr, o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Double.valueOf(dArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @NotNull
    public static final <T> List<T> oOo00Oo0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O00 = oOO00O00(tArr); -1 < oOO00O00; oOO00O00--) {
            if (!o00ooVar.invoke(tArr[oOO00O00]).booleanValue()) {
                return ooOoOoOo(tArr, oOO00O00 + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C oOo00OoO(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Integer, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (int i : iArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Integer.valueOf(i)));
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo00o(float[] fArr, o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Float.valueOf(fArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final void oOo00o00(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Boolean, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
    }

    public static final void oOo00o0O(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (boolean z : zArr) {
            o00ooVar.invoke(Boolean.valueOf(z));
        }
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C oOo00o0o(@NotNull byte[] bArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Byte, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(b)).booleanValue()) {
                c.add(Byte.valueOf(b));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo00oO(int[] iArr, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @NotNull
    public static final List<Double> oOo00oO0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                arrayList.add(Double.valueOf(d));
            }
        }
        return arrayList;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo00oo(long[] jArr, o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Long.valueOf(jArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final void oOo00oo0(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Float, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C oOo00ooO(@NotNull int[] iArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(i3)).booleanValue()) {
                c.add(Integer.valueOf(i3));
            }
            i++;
            i2 = i4;
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C oOo00ooo(@NotNull short[] sArr, @NotNull C c, @NotNull o0OOOO.o0O00000<? super Integer, ? super Short, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "predicate");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            short s = sArr[i];
            int i3 = i2 + 1;
            if (o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(s)).booleanValue()) {
                c.add(Short.valueOf(s));
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo0O00(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo0O000(short[] sArr, o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Short.valueOf(sArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOo0O00O(byte[] bArr, o0OOOO.o00oo<? super Byte, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOo0O00o(double[] dArr, o0OOOO.o00oo<? super Double, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Double.valueOf(dArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @NotNull
    public static final String oOo0o(@NotNull long[] jArr, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable o0OOOO.o00oo<? super Long, ? extends CharSequence> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence, "separator");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence2, "prefix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence3, "postfix");
        o0OOOOO0.o0ooO.o00oo0O0(charSequence4, "truncated");
        String sb = ((StringBuilder) oOOO0ooo(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00ooVar)).toString();
        o0OOOOO0.o0ooO.o00oo0OO(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOo0o00(char[] cArr, o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Character.valueOf(cArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OOO0OO.o00oo00O
    public static final Short oOo0o0oO(short[] sArr, o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                short s = sArr[length];
                if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                    return Short.valueOf(s);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOo0oO0o(char[] cArr, o0OOOO.o00oo<? super Character, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Character.valueOf(cArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OOO0OO.o00oo00O
    public static final Byte oOo0oooO(byte[] bArr, o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                byte b = bArr[length];
                if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                    return Byte.valueOf(b);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> Float oOoO(T[] tArr, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(tArr[0]).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOoO0oo(float[] fArr, o0OOOO.o00oo<? super Float, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Float.valueOf(fArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOoO0ooO(int[] iArr, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOoO0ooo(long[] jArr, o0OOOO.o00oo<? super Long, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Long.valueOf(jArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0(double[] dArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOoOO00(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOoOO000(short[] sArr, o0OOOO.o00oo<? super Short, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Short.valueOf(sArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO00O(byte[] bArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO00o(char[] cArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0O(float[] fArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0OO(long[] jArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> R oOoOO0Oo(T[] tArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(tArr[it.nextInt()]);
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0o(boolean[] zArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0o0(short[] sArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0oO(byte[] bArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOO0oo(double[] dArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOO(short[] sArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOO0(int[] iArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOO00(float[] fArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOO0O(long[] jArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> R oOoOOO0o(T[] tArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(tArr[it.nextInt()]);
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oOoOOOO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (b < b2) {
                b = b2;
            }
        }
        return Byte.valueOf(b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOOO0(boolean[] zArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oOoOOOOO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (o0OOOOO0.o0ooO.o00oo0o(c, c2) < 0) {
                c = c2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T oOoOOOOo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oOoOOOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = Math.max(d, dArr[it.nextInt()]);
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oOoOOOoO(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oOoOOOoo(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final byte oOoOOo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (b < b2) {
                b = b2;
            }
        }
        return b;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oOoOOo0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (j < j2) {
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oOoOOo00(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (i < i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOoOOo0O(int[] iArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oOoOOo0o(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (s < s2) {
                s = s2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final char oOoOOoO0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (o0OOOOO0.o0ooO.o00oo0o(c, c2) < 0) {
                c = c2;
            }
        }
        return c;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oOoOOoOO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = Math.max(d, dArr[it.nextInt()]);
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oOoOOoOo(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oOoOOoo(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return floatValue;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oOoOOoo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = Math.max(f, fArr[it.nextInt()]);
        }
        return f;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final int oOoOOooO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (i < i2) {
                i = i2;
            }
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final long oOoOOooo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final long oOoOo(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) < 0) {
                j = j2;
            }
        }
        return j;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oOoOo0(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) < 0) {
                b = b2;
            }
        }
        return Byte.valueOf(b);
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final short oOoOo00(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (s < s2) {
                s = s2;
            }
        }
        return s;
    }

    @o0OOOO0o.o00oo0OO(name = "maxOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T oOoOo000(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oOoOo00O(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            boolean z2 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                z = z2;
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oOoOo0O(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            float f2 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) < 0) {
                f = f2;
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oOoOo0O0(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            double d2 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) < 0) {
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oOoOo0OO(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) < 0) {
                s = s2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oOoOo0o(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            double d2 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) < 0) {
                d = d2;
            }
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final char oOoOo0o0(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) < 0) {
                c = c2;
            }
        }
        return c;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oOoOo0oO(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            float f2 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) < 0) {
                f = f2;
            }
        }
        return f;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final int oOoOo0oo(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i2)) < 0) {
                i = i2;
            }
        }
        return i;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double oOoOoO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int oOO000o = oOO000o(dArr);
        if (oOO000o == 0) {
            return Double.valueOf(d);
        }
        R invoke = o00ooVar.invoke(Double.valueOf(d));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o);
        while (o00oOOo02.hasNext()) {
            double d2 = dArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final boolean oOoOoO0(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            boolean z2 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) < 0) {
                z = z2;
            }
        }
        return z;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final short oOoOoO00(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) < 0) {
                s = s2;
            }
        }
        return s;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean oOoOoO0O(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O == 0) {
            return Boolean.valueOf(z);
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(z));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0O);
        while (o00oOOo02.hasNext()) {
            boolean z2 = zArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
            if (invoke.compareTo(invoke2) > 0) {
                z = z2;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character oOoOoO0o(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 == 0) {
            return Character.valueOf(c);
        }
        R invoke = o00ooVar.invoke(Character.valueOf(c));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o0);
        while (o00oOOo02.hasNext()) {
            char c2 = cArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
            if (invoke.compareTo(invoke2) > 0) {
                c = c2;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer oOoOoOO(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo == 0) {
            return Integer.valueOf(i);
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(i));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int i2 = iArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
            if (invoke.compareTo(invoke2) > 0) {
                i = i2;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float oOoOoOO0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO == 0) {
            return Float.valueOf(f);
        }
        R invoke = o00ooVar.invoke(Float.valueOf(f));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oO);
        while (o00oOOo02.hasNext()) {
            float f2 = fArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
            if (invoke.compareTo(invoke2) > 0) {
                f = f2;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long oOoOoOOo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int oOO00 = oOO00(jArr);
        if (oOO00 == 0) {
            return Long.valueOf(j);
        }
        R invoke = o00ooVar.invoke(Long.valueOf(j));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long j2 = jArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short oOoOoOo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return Short.valueOf(s);
        }
        R invoke = o00ooVar.invoke(Short.valueOf(s));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short s2 = sArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
            if (invoke.compareTo(invoke2) > 0) {
                s = s2;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T oOoOoOo0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 == 0) {
            return t;
        }
        R invoke = o00ooVar.invoke(t);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O00);
        while (o00oOOo02.hasNext()) {
            T t2 = tArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(t2);
            if (invoke.compareTo(invoke2) > 0) {
                t = t2;
                invoke = invoke2;
            }
        }
        return t;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> char oOoOoOoo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 == 0) {
            return c;
        }
        R invoke = o00ooVar.invoke(Character.valueOf(c));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o0);
        while (o00oOOo02.hasNext()) {
            char c2 = cArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Character.valueOf(c2));
            if (invoke.compareTo(invoke2) > 0) {
                c = c2;
                invoke = invoke2;
            }
        }
        return c;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoOoo(byte[] bArr, o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> long oOoOoo0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        int oOO00 = oOO00(jArr);
        if (oOO00 == 0) {
            return j;
        }
        R invoke = o00ooVar.invoke(Long.valueOf(j));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long j2 = jArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Long.valueOf(j2));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                j = j2;
            }
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> int oOoOoo00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo == 0) {
            return i;
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(i));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int i2 = iArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Integer.valueOf(i2));
            if (invoke.compareTo(invoke2) > 0) {
                i = i2;
                invoke = invoke2;
            }
        }
        return i;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oOoOoo0O(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) < 0) {
                c = c2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean oOoOoo0o(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = zArr[0];
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O == 0) {
            return z;
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(z));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0O);
        while (o00oOOo02.hasNext()) {
            boolean z2 = zArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(z2));
            if (invoke.compareTo(invoke2) > 0) {
                z = z2;
                invoke = invoke2;
            }
        }
        return z;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoOoooO(double[] dArr, o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Double.valueOf(dArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoOoooo(float[] fArr, o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Float.valueOf(fArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOoo(float[] fArr, o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Float.valueOf(fArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OOO0OO.o00oo00O
    public static final Boolean oOoo0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoo00(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoo000(long[] jArr, o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Long.valueOf(jArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoo0000(int[] iArr, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> double oOoo000O(T[] tArr, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(tArr[0]).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOoo000o(short[] sArr, o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Short.valueOf(sArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00O0(byte[] bArr, o0OOOO.o00oo<? super Byte, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00OO(char[] cArr, o0OOOO.o00oo<? super Character, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Character.valueOf(cArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00Oo(double[] dArr, o0OOOO.o00oo<? super Double, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Double.valueOf(dArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00o0(float[] fArr, o0OOOO.o00oo<? super Float, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Float.valueOf(fArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00oO(int[] iArr, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo00oo(long[] jArr, o0OOOO.o00oo<? super Long, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Long.valueOf(jArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0O(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo0O0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float oOoo0O00(short[] sArr, o0OOOO.o00oo<? super Short, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(Short.valueOf(sArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0O0O(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0OO(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0OO0(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R oOoo0OOO(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0OOo(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0Oo(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> float oOoo0Oo0(T[] tArr, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = o00ooVar.invoke(tArr[0]).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(tArr[it.nextInt()]).floatValue());
        }
        return floatValue;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0OoO(byte[] bArr, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0o(long[] jArr, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0o0(double[] dArr, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0o00(char[] cArr, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0o0O(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0o0o(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0oO(float[] fArr, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> R oOoo0oO0(T[] tArr, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0oOO(short[] sArr, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOoo0oOo(boolean[] zArr, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOoo0oo0(byte[] bArr, o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOoo0ooO(char[] cArr, o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Character.valueOf(cArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOoo0ooo(double[] dArr, o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Double.valueOf(dArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO(short[] sArr, o0OOOO.o00oo<? super Short, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Short.valueOf(sArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOooO0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOooO00(long[] jArr, o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Long.valueOf(jArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOooO000(int[] iArr, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> Double oOooO00O(T[] tArr, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(tArr[0]).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oOooO00o(short[] sArr, o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = o00ooVar.invoke(Short.valueOf(sArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0O0(byte[] bArr, o0OOOO.o00oo<? super Byte, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Byte.valueOf(bArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0OO(char[] cArr, o0OOOO.o00oo<? super Character, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Character.valueOf(cArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0Oo(double[] dArr, o0OOOO.o00oo<? super Double, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Double.valueOf(dArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0o(int[] iArr, o0OOOO.o00oo<? super Integer, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Integer.valueOf(iArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0o0(float[] fArr, o0OOOO.o00oo<? super Float, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Float.valueOf(fArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooO0oO(long[] jArr, o0OOOO.o00oo<? super Long, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Long.valueOf(jArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> Float oOooO0oo(T[] tArr, o0OOOO.o00oo<? super T, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(tArr[0]).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOO(float[] fArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOO0(byte[] bArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oOooOO00(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Float> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = o00ooVar.invoke(Boolean.valueOf(zArr[0])).floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOO0O(char[] cArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOO0o(double[] dArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOOO(long[] jArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOOO0(int[] iArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOOOO(char[] cArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) < 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> R oOooOOOo(T[] tArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(tArr[it.nextInt()]);
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOOo(short[] sArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> byte oOooOOoo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return b;
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(b));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte b2 = bArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
            if (invoke.compareTo(invoke2) > 0) {
                b = b2;
                invoke = invoke2;
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOo(byte[] bArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Byte.valueOf(bArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOo0(boolean[] zArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOoO(char[] cArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Character.valueOf(cArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOoOO(double[] dArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Double.valueOf(dArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOoOo(float[] fArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Float.valueOf(fArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOoo(long[] jArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Long.valueOf(jArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooOoo0(int[] iArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oOooOooO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = Math.max(f, fArr[it.nextInt()]);
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> R oOooOooo(T[] tArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(tArr[0]);
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(tArr[it.nextInt()]);
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    public static final <R> R oOooo(@NotNull char[] cArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super Character, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        for (char c : cArr) {
            r = o0o00000.invoke(r, Character.valueOf(c));
        }
        return r;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oOooo0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (o0OOOOO0.o0ooO.o00oo0o(c, c2) > 0) {
                c = c2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R extends Comparable<? super R>> R oOooo00(int[] iArr, o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = o00ooVar.invoke(Integer.valueOf(iArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = o00ooVar.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooo000(short[] sArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Short.valueOf(sArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> R oOooo00O(boolean[] zArr, Comparator<? super R> comparator, o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) o00ooVar.invoke(Boolean.valueOf(zArr[0]));
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            R invoke = o00ooVar.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, invoke) > 0) {
                obj = invoke;
            }
        }
        return (R) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oOooo00o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (b > b2) {
                b = b2;
            }
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T oOooo0O(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> short oOooo0O0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return s;
        }
        R invoke = o00ooVar.invoke(Short.valueOf(s));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short s2 = sArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Short.valueOf(s2));
            if (invoke.compareTo(invoke2) > 0) {
                s = s2;
                invoke = invoke2;
            }
        }
        return s;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oOooo0OO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = Math.min(d, dArr[it.nextInt()]);
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oOooo0Oo(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) < 0) {
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oOooo0o0(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> float oOooo0oO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO == 0) {
            return f;
        }
        R invoke = o00ooVar.invoke(Float.valueOf(f));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000oO);
        while (o00oOOo02.hasNext()) {
            float f2 = fArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Float.valueOf(f2));
            if (invoke.compareTo(invoke2) > 0) {
                f = f2;
                invoke = invoke2;
            }
        }
        return f;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T oOooo0oo(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oOoooO0(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oOoooO00(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = Math.min(f, fArr[it.nextInt()]);
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oOoooO0O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (i > i2) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oOoooO0o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (j > j2) {
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oOoooOO0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (s > s2) {
                s = s2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final byte oOoooo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (b > b2) {
                b = b2;
            }
        }
        return b;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oOooooO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = Math.min(d, dArr[it.nextInt()]);
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final char oOooooO0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (o0OOOOO0.o0ooO.o00oo0o(c, c2) > 0) {
                c = c2;
            }
        }
        return c;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte oOooooOO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return Byte.valueOf(b);
        }
        R invoke = o00ooVar.invoke(Byte.valueOf(b));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte b2 = bArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Byte.valueOf(b2));
            if (invoke.compareTo(invoke2) > 0) {
                b = b2;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b);
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oOooooOo(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oOooooo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = Math.min(f, fArr[it.nextInt()]);
        }
        return f;
    }

    @o0OO0o.o0O0o000
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double oOooooo0(char[] cArr, o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = o00ooVar.invoke(Character.valueOf(cArr[0])).doubleValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, o00ooVar.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    public static final long oo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length == 1) {
                return jArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0(@NotNull int[] iArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[o00oo0Var.nextInt(iArr.length)]);
    }

    public static final <T> boolean oo00(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return tArr.length == 0;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T oo000(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final int oo00000(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (i > i2) {
                i = i2;
            }
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oo000000(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return floatValue;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final long oo00000O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (j > j2) {
                j = j2;
            }
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    @NotNull
    public static final <T extends Comparable<? super T>> T oo00000o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo0000O(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            boolean z2 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                z = z2;
            }
        }
        return Boolean.valueOf(z);
    }

    @o0OOOO0o.o00oo0OO(name = "minOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final short oo0000O0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (s > s2) {
                s = s2;
            }
        }
        return s;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oo0000OO(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) > 0) {
                b = b2;
            }
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oo0000Oo(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) > 0) {
                c = c2;
            }
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo0000o(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            float f2 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) > 0) {
                f = f2;
            }
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo0000o0(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            double d2 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) > 0) {
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0000oO(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i2)) > 0) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0000oo(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) > 0) {
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final double oo000O(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            double d2 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d), Double.valueOf(d2)) > 0) {
                d = d2;
            }
        }
        return d;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo000O0(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) > 0) {
                s = s2;
            }
        }
        return Short.valueOf(s);
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final byte oo000O0O(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) > 0) {
                b = b2;
            }
        }
        return b;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final char oo000O0o(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            char c2 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c), Character.valueOf(c2)) > 0) {
                c = c2;
            }
        }
        return c;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final long oo000OO(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            long j2 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j), Long.valueOf(j2)) > 0) {
                j = j2;
            }
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final float oo000OO0(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            float f2 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f), Float.valueOf(f2)) > 0) {
                f = f2;
            }
        }
        return f;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <T> T oo000OOO(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final short oo000OOo(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            short s2 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s), Short.valueOf(s2)) > 0) {
                s = s2;
            }
        }
        return s;
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final boolean oo000Oo(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            boolean z2 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z), Boolean.valueOf(z2)) > 0) {
                z = z2;
            }
        }
        return z;
    }

    public static final boolean oo000OoO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return bArr.length == 0;
    }

    public static final boolean oo000Ooo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo000o0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo000o00(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return cArr.length == 0;
    }

    public static final boolean oo000o0O(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final boolean oo000o0o(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (double d : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo000oO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo000oO0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final boolean oo000oOo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final boolean oo000oo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final boolean oo000oo0(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo000ooO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo00O00(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean oo00O000(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final boolean oo00O00O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final <T> boolean oo00O00o(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final byte[] oo00O0O(byte[] bArr, o0OOOO.o00oo<? super Byte, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (byte b : bArr) {
            o00ooVar.invoke(Byte.valueOf(b));
        }
        return bArr;
    }

    public static final boolean oo00O0O0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (boolean z : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double[] oo00O0OO(double[] dArr, o0OOOO.o00oo<? super Double, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (double d : dArr) {
            o00ooVar.invoke(Double.valueOf(d));
        }
        return dArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float[] oo00O0Oo(float[] fArr, o0OOOO.o00oo<? super Float, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (float f : fArr) {
            o00ooVar.invoke(Float.valueOf(f));
        }
        return fArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long[] oo00O0o(long[] jArr, o0OOOO.o00oo<? super Long, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (long j : jArr) {
            o00ooVar.invoke(Long.valueOf(j));
        }
        return jArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int[] oo00O0o0(int[] iArr, o0OOOO.o00oo<? super Integer, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (int i : iArr) {
            o00ooVar.invoke(Integer.valueOf(i));
        }
        return iArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> T[] oo00O0oO(T[] tArr, o0OOOO.o00oo<? super T, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (T t : tArr) {
            o00ooVar.invoke(t);
        }
        return tArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final short[] oo00O0oo(short[] sArr, o0OOOO.o00oo<? super Short, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (short s : sArr) {
            o00ooVar.invoke(Short.valueOf(s));
        }
        return sArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final float[] oo00OO(float[] fArr, o0OOOO.o0O00000<? super Integer, ? super Float, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i]));
            i++;
            i2++;
        }
        return fArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final byte[] oo00OO0(byte[] bArr, o0OOOO.o0O00000<? super Integer, ? super Byte, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Byte.valueOf(bArr[i]));
            i++;
            i2++;
        }
        return bArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean[] oo00OO00(boolean[] zArr, o0OOOO.o00oo<? super Boolean, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (boolean z : zArr) {
            o00ooVar.invoke(Boolean.valueOf(z));
        }
        return zArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final char[] oo00OO0O(char[] cArr, o0OOOO.o0O00000<? super Integer, ? super Character, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Character.valueOf(cArr[i]));
            i++;
            i2++;
        }
        return cArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double[] oo00OO0o(double[] dArr, o0OOOO.o0O00000<? super Integer, ? super Double, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = dArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i]));
            i++;
            i2++;
        }
        return dArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long[] oo00OOO(long[] jArr, o0OOOO.o0O00000<? super Integer, ? super Long, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = jArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Long.valueOf(jArr[i]));
            i++;
            i2++;
        }
        return jArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int[] oo00OOO0(int[] iArr, o0OOOO.o0O00000<? super Integer, ? super Integer, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
            i++;
            i2++;
        }
        return iArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> T[] oo00OOOO(T[] tArr, o0OOOO.o0O00000<? super Integer, ? super T, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), tArr[i]);
            i++;
            i2++;
        }
        return tArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final short[] oo00OOOo(short[] sArr, o0OOOO.o0O00000<? super Integer, ? super Short, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = sArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Short.valueOf(sArr[i]));
            i++;
            i2++;
        }
        return sArr;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final boolean[] oo00OOo(boolean[] zArr, o0OOOO.o0O00000<? super Integer, ? super Boolean, oO0Ooooo> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "action");
        int length = zArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            o0o00000.invoke(Integer.valueOf(i2), Boolean.valueOf(zArr[i]));
            i++;
            i2++;
        }
        return zArr;
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Byte>, List<Byte>> oo00OOoO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b : bArr) {
            boolean booleanValue = o00ooVar.invoke(Byte.valueOf(b)).booleanValue();
            Byte valueOf = Byte.valueOf(b);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Character>, List<Character>> oo00OOoo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c : cArr) {
            boolean booleanValue = o00ooVar.invoke(Character.valueOf(c)).booleanValue();
            Character valueOf = Character.valueOf(c);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Long>, List<Long>> oo00Oo(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j : jArr) {
            boolean booleanValue = o00ooVar.invoke(Long.valueOf(j)).booleanValue();
            Long valueOf = Long.valueOf(j);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Float>, List<Float>> oo00Oo0(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f : fArr) {
            boolean booleanValue = o00ooVar.invoke(Float.valueOf(f)).booleanValue();
            Float valueOf = Float.valueOf(f);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Double>, List<Double>> oo00Oo00(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d : dArr) {
            boolean booleanValue = o00ooVar.invoke(Double.valueOf(d)).booleanValue();
            Double valueOf = Double.valueOf(d);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final char[] oo00Oo0O(char[] cArr, o0OOOO.o00oo<? super Character, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        for (char c : cArr) {
            o00ooVar.invoke(Character.valueOf(c));
        }
        return cArr;
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Integer>, List<Integer>> oo00Oo0o(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i : iArr) {
            boolean booleanValue = o00ooVar.invoke(Integer.valueOf(i)).booleanValue();
            Integer valueOf = Integer.valueOf(i);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Short>, List<Short>> oo00OoO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s : sArr) {
            boolean booleanValue = o00ooVar.invoke(Short.valueOf(s)).booleanValue();
            Short valueOf = Short.valueOf(s);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final <T> o0OO0o.o0O0o00<List<T>, List<T>> oo00OoO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : tArr) {
            if (o00ooVar.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @NotNull
    public static final o0OO0o.o0O0o00<List<Boolean>, List<Boolean>> oo00OoOo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z : zArr) {
            boolean booleanValue = o00ooVar.invoke(Boolean.valueOf(z)).booleanValue();
            Boolean valueOf = Boolean.valueOf(z);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new o0OO0o.o0O0o00<>(arrayList, arrayList2);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final byte oo00Ooo(@NotNull byte[] bArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[o00oo0Var.nextInt(bArr.length)];
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final byte oo00Ooo0(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return oo00Ooo(bArr, o0OOOo0.o00oo0.Default);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final char oo00OooO(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return oo00Oooo(cArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final char oo00Oooo(@NotNull char[] cArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[o00oo0Var.nextInt(cArr.length)];
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final double oo00o00(@NotNull double[] dArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[o00oo0Var.nextInt(dArr.length)];
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final double oo00o000(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return oo00o00(dArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final float oo00o00O(@NotNull float[] fArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[o00oo0Var.nextInt(fArr.length)];
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final float oo00o0o0(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return oo00o00O(fArr, o0OOOo0.o00oo0.Default);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final int oo00oO0(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return oo00oO0O(iArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final int oo00oO0O(@NotNull int[] iArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[o00oo0Var.nextInt(iArr.length)];
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final long oo00oO0o(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return oo00oOoO(jArr, o0OOOo0.o00oo0.Default);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final short oo00oOO(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return oo00oOOO(sArr, o0OOOo0.o00oo0.Default);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> T oo00oOO0(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (T) oo00oOo(tArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final short oo00oOOO(@NotNull short[] sArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[o00oo0Var.nextInt(sArr.length)];
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.3")
    public static final boolean oo00oOOo(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return oo00oOoo(zArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final <T> T oo00oOo(@NotNull T[] tArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[o00oo0Var.nextInt(tArr.length)];
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final long oo00oOoO(@NotNull long[] jArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[o00oo0Var.nextInt(jArr.length)];
    }

    @o0OO0o.o0OO00o0(version = "1.3")
    public static final boolean oo00oOoo(@NotNull boolean[] zArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[o00oo0Var.nextInt(zArr.length)];
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Character oo00oo(char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return oo00ooO0(cArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo00oo0(@NotNull boolean[] zArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[o00oo0Var.nextInt(zArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Boolean oo00oo00(boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return oo00oo0(zArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Byte oo00oo0O(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return oo00oo0o(bArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oo00oo0o(@NotNull byte[] bArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[o00oo0Var.nextInt(bArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Double oo00ooO(double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return oo00ooOo(dArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oo00ooO0(@NotNull char[] cArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[o00oo0Var.nextInt(cArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo00ooOo(@NotNull double[] dArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[o00oo0Var.nextInt(dArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Float oo00ooo(float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return oo00oooO(fArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo00oooO(@NotNull float[] fArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[o00oo0Var.nextInt(fArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Integer oo00oooo(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return oo0(iArr, o0OOOo0.o00oo0.Default);
    }

    public static final short oo0O0(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Short, ? super Short, Short> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            s = o0o00000.invoke(Short.valueOf(s), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return s;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Short oo0O00(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return oo0O00O0(sArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0O000(@NotNull long[] jArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[o00oo0Var.nextInt(jArr.length)]);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final Long oo0O0000(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return oo0O000(jArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> T oo0O000O(T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (T) oo0O000o(tArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <T> T oo0O000o(@NotNull T[] tArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[o00oo0Var.nextInt(tArr.length)];
    }

    public static final byte oo0O00O(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Byte, ? super Byte, Byte> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            b = o0o00000.invoke(Byte.valueOf(b), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return b;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo0O00O0(@NotNull short[] sArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[o00oo0Var.nextInt(sArr.length)]);
    }

    public static final char oo0O00OO(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Character, ? super Character, Character> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            c = o0o00000.invoke(Character.valueOf(c), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return c;
    }

    public static final double oo0O00Oo(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Double, ? super Double, Double> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = o0o00000.invoke(Double.valueOf(d), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return d;
    }

    public static final int oo0O00o(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            i = o0o00000.invoke(Integer.valueOf(i), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return i;
    }

    public static final float oo0O00o0(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Float, ? super Float, Float> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = o0o00000.invoke(Float.valueOf(f), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return f;
    }

    public static final long oo0O00oO(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Long, ? super Long, Long> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            j = o0o00000.invoke(Long.valueOf(j), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return j;
    }

    public static final <S, T extends S> S oo0O00oo(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        Object obj = (S) tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            obj = (S) o0o00000.invoke(obj, (Object) tArr[it.nextInt()]);
        }
        return (S) obj;
    }

    public static final double oo0O0O(@NotNull double[] dArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Double, ? super Double, Double> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            d = o0o0000o.invoke(Integer.valueOf(nextInt), Double.valueOf(d), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return d;
    }

    public static final boolean oo0O0O0(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Boolean, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            z = o0o00000.invoke(Boolean.valueOf(z), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return z;
    }

    public static final byte oo0O0O0O(@NotNull byte[] bArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super Byte, Byte> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            b = o0o0000o.invoke(Integer.valueOf(nextInt), Byte.valueOf(b), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return b;
    }

    public static final char oo0O0O0o(@NotNull char[] cArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Character, ? super Character, Character> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            c = o0o0000o.invoke(Integer.valueOf(nextInt), Character.valueOf(c), Character.valueOf(cArr[nextInt])).charValue();
        }
        return c;
    }

    public static final int oo0O0OO(@NotNull int[] iArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super Integer, Integer> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            i = o0o0000o.invoke(Integer.valueOf(nextInt), Integer.valueOf(i), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return i;
    }

    public static final float oo0O0OO0(@NotNull float[] fArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Float, ? super Float, Float> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            f = o0o0000o.invoke(Integer.valueOf(nextInt), Float.valueOf(f), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return f;
    }

    public static final long oo0O0OOO(@NotNull long[] jArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Long, ? super Long, Long> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            j = o0o0000o.invoke(Integer.valueOf(nextInt), Long.valueOf(j), Long.valueOf(jArr[nextInt])).longValue();
        }
        return j;
    }

    public static final <S, T extends S> S oo0O0OOo(@NotNull T[] tArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        Object obj = (S) tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            obj = (S) o0o0000o.invoke(Integer.valueOf(nextInt), obj, (Object) tArr[nextInt]);
        }
        return (S) obj;
    }

    public static final short oo0O0Oo0(@NotNull short[] sArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Short, ? super Short, Short> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s = o0o0000o.invoke(Integer.valueOf(nextInt), Short.valueOf(s), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return s;
    }

    public static final boolean oo0O0OoO(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super Boolean, Boolean> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            z = o0o0000o.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return z;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo0O0Ooo(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super Boolean, Boolean> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            z = o0o0000o.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0O0o(@NotNull int[] iArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super Integer, Integer> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            i = o0o0000o.invoke(Integer.valueOf(nextInt), Integer.valueOf(i), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oo0O0o0(@NotNull char[] cArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Character, ? super Character, Character> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            c = o0o0000o.invoke(Integer.valueOf(nextInt), Character.valueOf(c), Character.valueOf(cArr[nextInt])).charValue();
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oo0O0o00(@NotNull byte[] bArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super Byte, Byte> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            b = o0o0000o.invoke(Integer.valueOf(nextInt), Byte.valueOf(b), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo0O0o0O(@NotNull double[] dArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Double, ? super Double, Double> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            d = o0o0000o.invoke(Integer.valueOf(nextInt), Double.valueOf(d), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo0O0o0o(@NotNull float[] fArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Float, ? super Float, Float> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            f = o0o0000o.invoke(Integer.valueOf(nextInt), Float.valueOf(f), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return Float.valueOf(f);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0O0oO0(@NotNull long[] jArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Long, ? super Long, Long> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            j = o0o0000o.invoke(Integer.valueOf(nextInt), Long.valueOf(j), Long.valueOf(jArr[nextInt])).longValue();
        }
        return Long.valueOf(j);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo0O0oOO(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Boolean, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0O(zArr)).iterator();
        while (it.hasNext()) {
            z = o0o00000.invoke(Boolean.valueOf(z), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oo0O0oOo(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Byte, ? super Byte, Byte> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            b = o0o00000.invoke(Byte.valueOf(b), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return Byte.valueOf(b);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo0O0oo(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Double, ? super Double, Double> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o(dArr)).iterator();
        while (it.hasNext()) {
            d = o0o00000.invoke(Double.valueOf(d), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return Double.valueOf(d);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oo0O0oo0(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Character, ? super Character, Character> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000o0(cArr)).iterator();
        while (it.hasNext()) {
            c = o0o00000.invoke(Character.valueOf(c), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return Character.valueOf(c);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo0O0ooO(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Float, ? super Float, Float> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oO(fArr)).iterator();
        while (it.hasNext()) {
            f = o0o00000.invoke(Float.valueOf(f), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return Float.valueOf(f);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0O0ooo(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            i = o0o00000.invoke(Integer.valueOf(i), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return Integer.valueOf(i);
    }

    public static final <S, T extends S> S oo0OO(@NotNull T[] tArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super T, ? super S, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 >= 0) {
            Object obj = (S) tArr[oOO00O00];
            for (int i = oOO00O00 - 1; i >= 0; i--) {
                obj = (S) o0o0000o.invoke(Integer.valueOf(i), (Object) tArr[i], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int oo0OO0(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo >= 0) {
            int i = iArr[oOO000oo];
            for (int i2 = oOO000oo - 1; i2 >= 0; i2--) {
                i = o0o00000.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(i)).intValue();
            }
            return i;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final byte oo0OO00(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Byte, ? super Byte, Byte> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo >= 0) {
            byte b = bArr[oOO000Oo];
            for (int i = oOO000Oo - 1; i >= 0; i--) {
                b = o0o00000.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(b)).byteValue();
            }
            return b;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo0OO000(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Short, ? super Short, Short> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            s = o0o00000.invoke(Short.valueOf(s), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return Short.valueOf(s);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S oo0OO00o(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            obj = (S) o0o00000.invoke(obj, (Object) tArr[it.nextInt()]);
        }
        return (S) obj;
    }

    public static final byte oo0OO0O(@NotNull byte[] bArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super Byte, Byte> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo >= 0) {
            byte b = bArr[oOO000Oo];
            for (int i = oOO000Oo - 1; i >= 0; i--) {
                b = o0o0000o.invoke(Integer.valueOf(i), Byte.valueOf(bArr[i]), Byte.valueOf(b)).byteValue();
            }
            return b;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean oo0OO0O0(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Boolean, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O >= 0) {
            boolean z = zArr[oOO00O0O];
            for (int i = oOO00O0O - 1; i >= 0; i--) {
                z = o0o00000.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(z)).booleanValue();
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char oo0OO0OO(@NotNull char[] cArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Character, ? super Character, Character> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 >= 0) {
            char c = cArr[oOO000o0];
            for (int i = oOO000o0 - 1; i >= 0; i--) {
                c = o0o0000o.invoke(Integer.valueOf(i), Character.valueOf(cArr[i]), Character.valueOf(c)).charValue();
            }
            return c;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final <S, T extends S> S oo0OO0Oo(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super T, ? super S, ? extends S> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 >= 0) {
            Object obj = (S) tArr[oOO00O00];
            for (int i = oOO00O00 - 1; i >= 0; i--) {
                obj = (S) o0o00000.invoke((Object) tArr[i], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float oo0OO0o(@NotNull float[] fArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Float, ? super Float, Float> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO >= 0) {
            float f = fArr[oOO000oO];
            for (int i = oOO000oO - 1; i >= 0; i--) {
                f = o0o0000o.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), Float.valueOf(f)).floatValue();
            }
            return f;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double oo0OO0o0(@NotNull double[] dArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Double, ? super Double, Double> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000o = oOO000o(dArr);
        if (oOO000o >= 0) {
            double d = dArr[oOO000o];
            for (int i = oOO000o - 1; i >= 0; i--) {
                d = o0o0000o.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), Double.valueOf(d)).doubleValue();
            }
            return d;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int oo0OO0oO(@NotNull int[] iArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super Integer, Integer> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo >= 0) {
            int i = iArr[oOO000oo];
            for (int i2 = oOO000oo - 1; i2 >= 0; i2--) {
                i = o0o0000o.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(i)).intValue();
            }
            return i;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long oo0OO0oo(@NotNull long[] jArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Long, ? super Long, Long> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00 = oOO00(jArr);
        if (oOO00 >= 0) {
            long j = jArr[oOO00];
            for (int i = oOO00 - 1; i >= 0; i--) {
                j = o0o0000o.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), Long.valueOf(j)).longValue();
            }
            return j;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short oo0OOO00(@NotNull short[] sArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Short, ? super Short, Short> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 >= 0) {
            short s = sArr[oOO00O0];
            for (int i = oOO00O0 - 1; i >= 0; i--) {
                s = o0o0000o.invoke(Integer.valueOf(i), Short.valueOf(sArr[i]), Short.valueOf(s)).shortValue();
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @o0OOOO0o.o00oo0OO(name = "minWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final int oo0OOOO(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i2)) > 0) {
                i = i2;
            }
        }
        return i;
    }

    public static final boolean oo0OOOo(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super Boolean, Boolean> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O >= 0) {
            boolean z = zArr[oOO00O0O];
            for (int i = oOO00O0O - 1; i >= 0; i--) {
                z = o0o0000o.invoke(Integer.valueOf(i), Boolean.valueOf(zArr[i]), Boolean.valueOf(z)).booleanValue();
            }
            return z;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo0OOOoO(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super Boolean, Boolean> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O < 0) {
            return null;
        }
        boolean z = zArr[oOO00O0O];
        for (int i = oOO00O0O - 1; i >= 0; i--) {
            z = o0o0000o.invoke(Integer.valueOf(i), Boolean.valueOf(zArr[i]), Boolean.valueOf(z)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo0OOOoo(@NotNull double[] dArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Double, ? super Double, Double> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000o = oOO000o(dArr);
        if (oOO000o < 0) {
            return null;
        }
        double d = dArr[oOO000o];
        for (int i = oOO000o - 1; i >= 0; i--) {
            d = o0o0000o.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), Double.valueOf(d)).doubleValue();
        }
        return Double.valueOf(d);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S oo0OOo(@NotNull T[] tArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super T, ? super S, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 < 0) {
            return null;
        }
        Object obj = (S) tArr[oOO00O00];
        for (int i = oOO00O00 - 1; i >= 0; i--) {
            obj = (S) o0o0000o.invoke(Integer.valueOf(i), (Object) tArr[i], obj);
        }
        return (S) obj;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0OOo0(@NotNull int[] iArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super Integer, Integer> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo < 0) {
            return null;
        }
        int i = iArr[oOO000oo];
        for (int i2 = oOO000oo - 1; i2 >= 0; i2--) {
            i = o0o0000o.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), Integer.valueOf(i)).intValue();
        }
        return Integer.valueOf(i);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo0OOo00(@NotNull float[] fArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Float, ? super Float, Float> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO < 0) {
            return null;
        }
        float f = fArr[oOO000oO];
        for (int i = oOO000oO - 1; i >= 0; i--) {
            f = o0o0000o.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), Float.valueOf(f)).floatValue();
        }
        return Float.valueOf(f);
    }

    public static final short oo0OOo0O(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Short, ? super Short, Short> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 >= 0) {
            short s = sArr[oOO00O0];
            for (int i = oOO00O0 - 1; i >= 0; i--) {
                s = o0o00000.invoke(Short.valueOf(sArr[i]), Short.valueOf(s)).shortValue();
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0OOo0o(@NotNull long[] jArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Long, ? super Long, Long> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00 = oOO00(jArr);
        if (oOO00 < 0) {
            return null;
        }
        long j = jArr[oOO00];
        for (int i = oOO00 - 1; i >= 0; i--) {
            j = o0o0000o.invoke(Integer.valueOf(i), Long.valueOf(jArr[i]), Long.valueOf(j)).longValue();
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo0OOoO(@NotNull short[] sArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Short, ? super Short, Short> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 < 0) {
            return null;
        }
        short s = sArr[oOO00O0];
        for (int i = oOO00O0 - 1; i >= 0; i--) {
            s = o0o0000o.invoke(Integer.valueOf(i), Short.valueOf(sArr[i]), Short.valueOf(s)).shortValue();
        }
        return Short.valueOf(s);
    }

    public static final long oo0OOoOO(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Long, ? super Long, Long> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00 = oOO00(jArr);
        if (oOO00 >= 0) {
            long j = jArr[oOO00];
            for (int i = oOO00 - 1; i >= 0; i--) {
                j = o0o00000.invoke(Long.valueOf(jArr[i]), Long.valueOf(j)).longValue();
            }
            return j;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Boolean oo0OOoOo(@NotNull boolean[] zArr, @NotNull o0OOOO.o0O00000<? super Boolean, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O0O = oOO00O0O(zArr);
        if (oOO00O0O < 0) {
            return null;
        }
        boolean z = zArr[oOO00O0O];
        for (int i = oOO00O0O - 1; i >= 0; i--) {
            z = o0o00000.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(z)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte oo0OOoo0(@NotNull byte[] bArr, @NotNull o0OOOO.o0O00000<? super Byte, ? super Byte, Byte> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo < 0) {
            return null;
        }
        byte b = bArr[oOO000Oo];
        for (int i = oOO000Oo - 1; i >= 0; i--) {
            b = o0o00000.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(b)).byteValue();
        }
        return Byte.valueOf(b);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character oo0OOooo(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Character, ? super Character, Character> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 < 0) {
            return null;
        }
        char c = cArr[oOO000o0];
        for (int i = oOO000o0 - 1; i >= 0; i--) {
            c = o0o00000.invoke(Character.valueOf(cArr[i]), Character.valueOf(c)).charValue();
        }
        return Character.valueOf(c);
    }

    public static final void oo0Oo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO000o = oOO000o(dArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            double d = dArr[nextInt];
            dArr[nextInt] = dArr[oOO000o];
            dArr[oOO000o] = d;
            oOO000o--;
        }
    }

    public static final char oo0Oo0(@NotNull char[] cArr, @NotNull o0OOOO.o0O00000<? super Character, ? super Character, Character> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 >= 0) {
            char c = cArr[oOO000o0];
            for (int i = oOO000o0 - 1; i >= 0; i--) {
                c = o0o00000.invoke(Character.valueOf(cArr[i]), Character.valueOf(c)).charValue();
            }
            return c;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Float oo0Oo00(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Float, ? super Float, Float> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO < 0) {
            return null;
        }
        float f = fArr[oOO000oO];
        for (int i = oOO000oO - 1; i >= 0; i--) {
            f = o0o00000.invoke(Float.valueOf(fArr[i]), Float.valueOf(f)).floatValue();
        }
        return Float.valueOf(f);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Double oo0Oo000(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Double, ? super Double, Double> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000o = oOO000o(dArr);
        if (oOO000o < 0) {
            return null;
        }
        double d = dArr[oOO000o];
        for (int i = oOO000o - 1; i >= 0; i--) {
            d = o0o00000.invoke(Double.valueOf(dArr[i]), Double.valueOf(d)).doubleValue();
        }
        return Double.valueOf(d);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer oo0Oo00O(@NotNull int[] iArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000oo = oOO000oo(iArr);
        if (oOO000oo < 0) {
            return null;
        }
        int i = iArr[oOO000oo];
        for (int i2 = oOO000oo - 1; i2 >= 0; i2--) {
            i = o0o00000.invoke(Integer.valueOf(iArr[i2]), Integer.valueOf(i)).intValue();
        }
        return Integer.valueOf(i);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0Oo00o(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Long, ? super Long, Long> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00 = oOO00(jArr);
        if (oOO00 < 0) {
            return null;
        }
        long j = jArr[oOO00];
        for (int i = oOO00 - 1; i >= 0; i--) {
            j = o0o00000.invoke(Long.valueOf(jArr[i]), Long.valueOf(j)).longValue();
        }
        return Long.valueOf(j);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S oo0Oo0O0(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super T, ? super S, ? extends S> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 < 0) {
            return null;
        }
        Object obj = (S) tArr[oOO00O00];
        for (int i = oOO00O00 - 1; i >= 0; i--) {
            obj = (S) o0o00000.invoke((Object) tArr[i], obj);
        }
        return (S) obj;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo0Oo0OO(@NotNull short[] sArr, @NotNull o0OOOO.o0O00000<? super Short, ? super Short, Short> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO00O0 = oOO00O0(sArr);
        if (oOO00O0 < 0) {
            return null;
        }
        short s = sArr[oOO00O0];
        for (int i = oOO00O0 - 1; i >= 0; i--) {
            s = o0o00000.invoke(Short.valueOf(sArr[i]), Short.valueOf(s)).shortValue();
        }
        return Short.valueOf(s);
    }

    @NotNull
    public static final <T> T[] oo0Oo0Oo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        for (T t : tArr) {
            if (t == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0Oo0o(@NotNull byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, bArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            byte b = bArr[i];
            bArr[i] = bArr[i4];
            bArr[i4] = b;
            i4--;
            i++;
        }
    }

    public static final void oo0Oo0o0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO000Oo = oOO000Oo(bArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            byte b = bArr[nextInt];
            bArr[nextInt] = bArr[oOO000Oo];
            bArr[oOO000Oo] = b;
            oOO000Oo--;
        }
    }

    public static final void oo0Oo0oO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO000o0 = oOO000o0(cArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            char c = cArr[nextInt];
            cArr[nextInt] = cArr[oOO000o0];
            cArr[oOO000o0] = c;
            oOO000o0--;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0Oo0oo(@NotNull char[] cArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, cArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            char c = cArr[i];
            cArr[i] = cArr[i4];
            cArr[i4] = c;
            i4--;
            i++;
        }
    }

    public static final float oo0OoO(@NotNull float[] fArr, @NotNull o0OOOO.o0O00000<? super Float, ? super Float, Float> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000oO = oOO000oO(fArr);
        if (oOO000oO >= 0) {
            float f = fArr[oOO000oO];
            for (int i = oOO000oO - 1; i >= 0; i--) {
                f = o0o00000.invoke(Float.valueOf(fArr[i]), Float.valueOf(f)).floatValue();
            }
            return f;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void oo0OoO0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO000oO = oOO000oO(fArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            float f = fArr[nextInt];
            fArr[nextInt] = fArr[oOO000oO];
            fArr[oOO000oO] = f;
            oOO000oO--;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0OoO00(@NotNull double[] dArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, dArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            double d = dArr[i];
            dArr[i] = dArr[i4];
            dArr[i4] = d;
            i4--;
            i++;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0OoO0o(@NotNull float[] fArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, fArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            float f = fArr[i];
            fArr[i] = fArr[i4];
            fArr[i4] = f;
            i4--;
            i++;
        }
    }

    public static final void oo0OoOO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO000oo = oOO000oo(iArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            int i = iArr[nextInt];
            iArr[nextInt] = iArr[oOO000oo];
            iArr[oOO000oo] = i;
            oOO000oo--;
        }
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Long oo0OoOO0(@NotNull long[] jArr, @NotNull o0OOOO.o0O00000<? super Long, ? super Long, Long> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00(jArr)).iterator();
        while (it.hasNext()) {
            j = o0o00000.invoke(Long.valueOf(j), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return Long.valueOf(j);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0OoOOO(@NotNull int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, iArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            int i5 = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = i5;
            i4--;
            i++;
        }
    }

    public static final void oo0OoOOo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO00 = oOO00(jArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            long j = jArr[nextInt];
            jArr[nextInt] = jArr[oOO00];
            jArr[oOO00] = j;
            oOO00--;
        }
    }

    public static final <T> void oo0OoOo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO00O00 = oOO00O00(tArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            T t = tArr[nextInt];
            tArr[nextInt] = tArr[oOO00O00];
            tArr[oOO00O00] = t;
            oOO00O00--;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0OoOo0(@NotNull long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, jArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            long j = jArr[i];
            jArr[i] = jArr[i4];
            jArr[i4] = j;
            i4--;
            i++;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> void oo0OoOoO(@NotNull T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, tArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            T t = tArr[i];
            tArr[i] = tArr[i4];
            tArr[i4] = t;
            i4--;
            i++;
        }
    }

    public static final void oo0OoOoo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO00O0 = oOO00O0(sArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            short s = sArr[nextInt];
            sArr[nextInt] = sArr[oOO00O0];
            sArr[oOO00O0] = s;
            oOO00O0--;
        }
    }

    public static final double oo0Ooo(@NotNull double[] dArr, @NotNull o0OOOO.o0O00000<? super Double, ? super Double, Double> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        int oOO000o = oOO000o(dArr);
        if (oOO000o >= 0) {
            double d = dArr[oOO000o];
            for (int i = oOO000o - 1; i >= 0; i--) {
                d = o0o00000.invoke(Double.valueOf(dArr[i]), Double.valueOf(d)).doubleValue();
            }
            return d;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0Ooo00(@NotNull short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, sArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            short s = sArr[i];
            sArr[i] = sArr[i4];
            sArr[i4] = s;
            i4--;
            i++;
        }
    }

    public static final void oo0Ooo0O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int oOO00O0O = oOO00O0O(zArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, length);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            boolean z = zArr[nextInt];
            zArr[nextInt] = zArr[oOO00O0O];
            zArr[oOO00O0O] = z;
            oOO00O0O--;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0Ooo0o(@NotNull boolean[] zArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, zArr.length);
        int i3 = (i + i2) / 2;
        if (i == i3) {
            return;
        }
        int i4 = i2 - 1;
        while (i < i3) {
            boolean z = zArr[i];
            zArr[i] = zArr[i4];
            zArr[i4] = z;
            i4--;
            i++;
        }
    }

    @NotNull
    public static final List<Byte> oo0OooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Byte> oooO0OO = oooO0OO(bArr);
        o0oO0O0o.o0oOo0O0(oooO0OO);
        return oooO0OO;
    }

    @NotNull
    public static final List<Character> oo0OooOO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Character> oooO0OOO = oooO0OOO(cArr);
        o0oO0O0o.o0oOo0O0(oooO0OOO);
        return oooO0OOO;
    }

    @NotNull
    public static final List<Double> oo0OooOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Double> oooO0OOo = oooO0OOo(dArr);
        o0oO0O0o.o0oOo0O0(oooO0OOo);
        return oooO0OOo;
    }

    @NotNull
    public static final List<Integer> oo0Oooo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Integer> oooO0Oo = oooO0Oo(iArr);
        o0oO0O0o.o0oOo0O0(oooO0Oo);
        return oooO0Oo;
    }

    @NotNull
    public static final List<Float> oo0Oooo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Float> oooO0Oo0 = oooO0Oo0(fArr);
        o0oO0O0o.o0oOo0O0(oooO0Oo0);
        return oooO0Oo0;
    }

    @NotNull
    public static final List<Long> oo0OoooO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Long> oooO0OoO = oooO0OoO(jArr);
        o0oO0O0o.o0oOo0O0(oooO0OoO);
        return oooO0OoO;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Integer> oo0o(int[] iArr, o0OOOO.o0O00000<? super Integer, ? super Integer, Integer> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (iArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        int i = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            i = o0o00000.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0(byte[] bArr, R r, o0OOOO.o0O00000<? super R, ? super Byte, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (bArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        for (byte b : bArr) {
            r = o0o00000.invoke(r, Byte.valueOf(b));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final char[] oo0o00(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int oOO000o0 = oOO000o0(cArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO000o0);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            cArr2[oOO000o0 - nextInt] = cArr[nextInt];
        }
        return cArr2;
    }

    @NotNull
    public static final List<Short> oo0o000(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Short> oooO0o00 = oooO0o00(sArr);
        o0oO0O0o.o0oOo0O0(oooO0o00);
        return oooO0o00;
    }

    @NotNull
    public static final <T> List<T> oo0o0000(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<T> oooO0Ooo = oooO0Ooo(tArr);
        o0oO0O0o.o0oOo0O0(oooO0Ooo);
        return oooO0Ooo;
    }

    @NotNull
    public static final List<Boolean> oo0o000O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        List<Boolean> oooO0o0O = oooO0o0O(zArr);
        o0oO0O0o.o0oOo0O0(oooO0o0O);
        return oooO0o0O;
    }

    @NotNull
    public static final byte[] oo0o000o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int oOO000Oo = oOO000Oo(bArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            bArr2[oOO000Oo - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    @NotNull
    public static final int[] oo0o00O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int oOO000oo = oOO000oo(iArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            iArr2[oOO000oo - nextInt] = iArr[nextInt];
        }
        return iArr2;
    }

    @NotNull
    public static final double[] oo0o00O0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int oOO000o = oOO000o(dArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO000o);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            dArr2[oOO000o - nextInt] = dArr[nextInt];
        }
        return dArr2;
    }

    @NotNull
    public static final <T> T[] oo0o00OO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) o0OO0oO.o00ooO0.o00oOOo0(tArr, tArr.length);
        int oOO00O00 = oOO00O00(tArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO00O00);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            tArr2[oOO00O00 - nextInt] = tArr[nextInt];
        }
        return tArr2;
    }

    @NotNull
    public static final long[] oo0o00Oo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int oOO00 = oOO00(jArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO00);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            jArr2[oOO00 - nextInt] = jArr[nextInt];
        }
        return jArr2;
    }

    @NotNull
    public static final float[] oo0o00o(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int oOO000oO = oOO000oO(fArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO000oO);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            fArr2[oOO000oO - nextInt] = fArr[nextInt];
        }
        return fArr2;
    }

    @NotNull
    public static final short[] oo0o00o0(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int oOO00O0 = oOO00O0(sArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO00O0);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            sArr2[oOO00O0 - nextInt] = sArr[nextInt];
        }
        return sArr2;
    }

    @NotNull
    public static final boolean[] oo0o00oo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int oOO00O0O = oOO00O0O(zArr);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(0, oOO00O0O);
        while (o00oOOo02.hasNext()) {
            int nextInt = o00oOOo02.nextInt();
            zArr2[oOO00O0O - nextInt] = zArr[nextInt];
        }
        return zArr2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0O(int[] iArr, R r, o0OOOO.o0O00000<? super R, ? super Integer, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (iArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        for (int i : iArr) {
            r = o0o00000.invoke(r, Integer.valueOf(i));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0O00(char[] cArr, R r, o0OOOO.o0O00000<? super R, ? super Character, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (cArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        for (char c : cArr) {
            r = o0o00000.invoke(r, Character.valueOf(c));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0O0o(double[] dArr, R r, o0OOOO.o0O00000<? super R, ? super Double, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (dArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        for (double d : dArr) {
            r = o0o00000.invoke(r, Double.valueOf(d));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0OO0(long[] jArr, R r, o0OOOO.o0O00000<? super R, ? super Long, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (jArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        for (long j : jArr) {
            r = o0o00000.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> oo0o0OOO(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (tArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        for (R.bool boolVar : tArr) {
            r = o0o00000.invoke(r, boolVar);
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0OOo(short[] sArr, R r, o0OOOO.o0O00000<? super R, ? super Short, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (sArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        for (short s : sArr) {
            r = o0o00000.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0Oo0(boolean[] zArr, R r, o0OOOO.o0O00000<? super R, ? super Boolean, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (zArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        for (boolean z : zArr) {
            r = o0o00000.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0OoO(byte[] bArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Byte, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (bArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Byte.valueOf(bArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0Ooo(char[] cArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Character, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (cArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Character.valueOf(cArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0o(float[] fArr, R r, o0OOOO.o0O00000<? super R, ? super Float, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (fArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        for (float f : fArr) {
            r = o0o00000.invoke(r, Float.valueOf(f));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0o0(float[] fArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Float, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (fArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Float.valueOf(fArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0o00(double[] dArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Double, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (dArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Double.valueOf(dArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0o0O(int[] iArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Integer, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (iArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Integer.valueOf(iArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0o0o(long[] jArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Long, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (jArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Long.valueOf(jArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> oo0o0oO(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (tArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, tArr[i]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0oOO(short[] sArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Short, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (sArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Short.valueOf(sArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0o0oOo(boolean[] zArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Boolean, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (zArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Boolean.valueOf(zArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Character> oo0o0oo(char[] cArr, o0OOOO.o0O00000<? super Character, ? super Character, Character> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (cArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        char c = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c));
        int length = cArr.length;
        for (int i = 1; i < length; i++) {
            c = o0o00000.invoke(Character.valueOf(c), Character.valueOf(cArr[i])).charValue();
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Byte> oo0o0oo0(byte[] bArr, o0OOOO.o0O00000<? super Byte, ? super Byte, Byte> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (bArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        byte b = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b));
        int length = bArr.length;
        for (int i = 1; i < length; i++) {
            b = o0o00000.invoke(Byte.valueOf(b), Byte.valueOf(bArr[i])).byteValue();
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Double> oo0o0ooO(double[] dArr, o0OOOO.o0O00000<? super Double, ? super Double, Double> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (dArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        double d = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d));
        int length = dArr.length;
        for (int i = 1; i < length; i++) {
            d = o0o00000.invoke(Double.valueOf(d), Double.valueOf(dArr[i])).doubleValue();
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Float> oo0o0ooo(float[] fArr, o0OOOO.o0O00000<? super Float, ? super Float, Float> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (fArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        float f = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f));
        int length = fArr.length;
        for (int i = 1; i < length; i++) {
            f = o0o00000.invoke(Float.valueOf(f), Float.valueOf(fArr[i])).floatValue();
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> oo0oO(@NotNull T[] tArr, @NotNull o0OOOO.o0O00000<? super S, ? super T, ? extends S> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (tArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        S s = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s);
        int length = tArr.length;
        for (int i = 1; i < length; i++) {
            s = o0o00000.invoke(s, (Object) tArr[i]);
            arrayList.add(s);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Long> oo0oO000(long[] jArr, o0OOOO.o0O00000<? super Long, ? super Long, Long> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (jArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        long j = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j));
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            j = o0o00000.invoke(Long.valueOf(j), Long.valueOf(jArr[i])).longValue();
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Character> oo0oOO(char[] cArr, o0OOOO.o0O0000O<? super Integer, ? super Character, ? super Character, Character> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (cArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        char c = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c));
        int length = cArr.length;
        for (int i = 1; i < length; i++) {
            c = o0o0000o.invoke(Integer.valueOf(i), Character.valueOf(c), Character.valueOf(cArr[i])).charValue();
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Short> oo0oOO00(short[] sArr, o0OOOO.o0O00000<? super Short, ? super Short, Short> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (sArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        short s = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s));
        int length = sArr.length;
        for (int i = 1; i < length; i++) {
            s = o0o00000.invoke(Short.valueOf(s), Short.valueOf(sArr[i])).shortValue();
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Boolean> oo0oOO0O(boolean[] zArr, o0OOOO.o0O00000<? super Boolean, ? super Boolean, Boolean> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (zArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        for (int i = 1; i < length; i++) {
            z = o0o00000.invoke(Boolean.valueOf(z), Boolean.valueOf(zArr[i])).booleanValue();
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Byte> oo0oOO0o(byte[] bArr, o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super Byte, Byte> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (bArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        byte b = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b));
        int length = bArr.length;
        for (int i = 1; i < length; i++) {
            b = o0o0000o.invoke(Integer.valueOf(i), Byte.valueOf(b), Byte.valueOf(bArr[i])).byteValue();
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Float> oo0oOOO(float[] fArr, o0OOOO.o0O0000O<? super Integer, ? super Float, ? super Float, Float> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (fArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        float f = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f));
        int length = fArr.length;
        for (int i = 1; i < length; i++) {
            f = o0o0000o.invoke(Integer.valueOf(i), Float.valueOf(f), Float.valueOf(fArr[i])).floatValue();
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Double> oo0oOOO0(double[] dArr, o0OOOO.o0O0000O<? super Integer, ? super Double, ? super Double, Double> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (dArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        double d = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d));
        int length = dArr.length;
        for (int i = 1; i < length; i++) {
            d = o0o0000o.invoke(Integer.valueOf(i), Double.valueOf(d), Double.valueOf(dArr[i])).doubleValue();
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Integer> oo0oOOOo(int[] iArr, o0OOOO.o0O0000O<? super Integer, ? super Integer, ? super Integer, Integer> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (iArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        int i = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i));
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            i = o0o0000o.invoke(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(iArr[i2])).intValue();
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Long> oo0oOOo0(long[] jArr, o0OOOO.o0O0000O<? super Integer, ? super Long, ? super Long, Long> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (jArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        long j = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j));
        int length = jArr.length;
        for (int i = 1; i < length; i++) {
            j = o0o0000o.invoke(Integer.valueOf(i), Long.valueOf(j), Long.valueOf(jArr[i])).longValue();
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Short oo0oOOoO(@NotNull short[] sArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Short, ? super Short, Short> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O0(sArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s = o0o0000o.invoke(Integer.valueOf(nextInt), Short.valueOf(s), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return Short.valueOf(s);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOo(char[] cArr, R r, o0OOOO.o0O00000<? super R, ? super Character, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (cArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        for (char c : cArr) {
            r = o0o00000.invoke(r, Character.valueOf(c));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Short> oo0oOo0(short[] sArr, o0OOOO.o0O0000O<? super Integer, ? super Short, ? super Short, Short> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (sArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        short s = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s));
        int length = sArr.length;
        for (int i = 1; i < length; i++) {
            s = o0o0000o.invoke(Integer.valueOf(i), Short.valueOf(s), Short.valueOf(sArr[i])).shortValue();
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> oo0oOo00(@NotNull T[] tArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (tArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        S s = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s);
        int length = tArr.length;
        for (int i = 1; i < length; i++) {
            s = o0o0000o.invoke(Integer.valueOf(i), s, (Object) tArr[i]);
            arrayList.add(s);
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final List<Boolean> oo0oOo0O(boolean[] zArr, o0OOOO.o0O0000O<? super Integer, ? super Boolean, ? super Boolean, Boolean> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (zArr.length == 0) {
            return o0ooO.INSTANCE;
        }
        boolean z = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z));
        int length = zArr.length;
        for (int i = 1; i < length; i++) {
            z = o0o0000o.invoke(Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(zArr[i])).booleanValue();
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOo0o(byte[] bArr, R r, o0OOOO.o0O00000<? super R, ? super Byte, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (bArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        for (byte b : bArr) {
            r = o0o00000.invoke(r, Byte.valueOf(b));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOoO0(double[] dArr, R r, o0OOOO.o0O00000<? super R, ? super Double, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (dArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        for (double d : dArr) {
            r = o0o00000.invoke(r, Double.valueOf(d));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOoOO(float[] fArr, R r, o0OOOO.o0O00000<? super R, ? super Float, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (fArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        for (float f : fArr) {
            r = o0o00000.invoke(r, Float.valueOf(f));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOoOo(int[] iArr, R r, o0OOOO.o0O00000<? super R, ? super Integer, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (iArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        for (int i : iArr) {
            r = o0o00000.invoke(r, Integer.valueOf(i));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oOoo0(long[] jArr, R r, o0OOOO.o0O00000<? super R, ? super Long, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (jArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        for (long j : jArr) {
            r = o0o00000.invoke(r, Long.valueOf(j));
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> oo0oOooo(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O00000<? super R, ? super T, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (tArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        for (R.bool boolVar : tArr) {
            r = o0o00000.invoke(r, boolVar);
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0oo(@NotNull char[] cArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO000o0 = oOO000o0(cArr); oOO000o0 > 0; oOO000o0--) {
            int nextInt = o00oo0Var.nextInt(oOO000o0 + 1);
            char c = cArr[oOO000o0];
            cArr[oOO000o0] = cArr[nextInt];
            cArr[nextInt] = c;
        }
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo0(int[] iArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Integer, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (iArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Integer.valueOf(iArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo00(char[] cArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Character, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (cArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Character.valueOf(cArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo000(short[] sArr, R r, o0OOOO.o0O00000<? super R, ? super Short, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (sArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        for (short s : sArr) {
            r = o0o00000.invoke(r, Short.valueOf(s));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo00O(double[] dArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Double, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (dArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Double.valueOf(dArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo00o(float[] fArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Float, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (fArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Float.valueOf(fArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo0O0(long[] jArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Long, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (jArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Long.valueOf(jArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OO0o.o0OO00o0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> oo0oo0OO(@NotNull T[] tArr, R r, @NotNull o0OOOO.o0O0000O<? super Integer, ? super R, ? super T, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (tArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, tArr[i]);
            arrayList.add(r);
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo0Oo(short[] sArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Short, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (sArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Short.valueOf(sArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0oo0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        oo0oo0oO(bArr, o0OOOo0.o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oo0oo0o0(boolean[] zArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Boolean, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (zArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Boolean.valueOf(zArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0oo0oO(@NotNull byte[] bArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO000Oo = oOO000Oo(bArr); oOO000Oo > 0; oOO000Oo--) {
            int nextInt = o00oo0Var.nextInt(oOO000Oo + 1);
            byte b = bArr[oOO000Oo];
            bArr[oOO000Oo] = bArr[nextInt];
            bArr[nextInt] = b;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0oo0oo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        oo0oo(cArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooO0(@NotNull double[] dArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO000o = oOO000o(dArr); oOO000o > 0; oOO000o--) {
            int nextInt = o00oo0Var.nextInt(oOO000o + 1);
            double d = dArr[oOO000o];
            dArr[oOO000o] = dArr[nextInt];
            dArr[nextInt] = d;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooO00(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        oo0ooO0(dArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooO0o(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        oo0ooOO0(fArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooOO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        ooo0O0oo(iArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooOO0(@NotNull float[] fArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO000oO = oOO000oO(fArr); oOO000oO > 0; oOO000oO--) {
            int nextInt = o00oo0Var.nextInt(oOO000oO + 1);
            float f = fArr[oOO000oO];
            fArr[oOO000oO] = fArr[nextInt];
            fArr[nextInt] = f;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooOOO(@NotNull long[] jArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO00 = oOO00(jArr); oOO00 > 0; oOO00--) {
            int nextInt = o00oo0Var.nextInt(oOO00 + 1);
            long j = jArr[oOO00];
            jArr[oOO00] = jArr[nextInt];
            jArr[nextInt] = j;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> void oo0ooOOo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        oo0ooOo0(tArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooOo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        oo0ooOoo(sArr, o0OOOo0.o00oo0.Default);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> void oo0ooOo0(@NotNull T[] tArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO00O00 = oOO00O00(tArr); oOO00O00 > 0; oOO00O00--) {
            int nextInt = o00oo0Var.nextInt(oOO00O00 + 1);
            T t = tArr[oOO00O00];
            tArr[oOO00O00] = tArr[nextInt];
            tArr[nextInt] = t;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooOoo(@NotNull short[] sArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO00O0 = oOO00O0(sArr); oOO00O0 > 0; oOO00O0--) {
            int nextInt = o00oo0Var.nextInt(oOO00O0 + 1);
            short s = sArr[oOO00O0];
            sArr[oOO00O0] = sArr[nextInt];
            sArr[nextInt] = s;
        }
    }

    public static final char oo0ooo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooo0(@NotNull boolean[] zArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO00O0O = oOO00O0O(zArr); oOO00O0O > 0; oOO00O0O--) {
            int nextInt = o00oo0Var.nextInt(oOO00O0O + 1);
            boolean z = zArr[oOO00O0O];
            zArr[oOO00O0O] = zArr[nextInt];
            zArr[nextInt] = z;
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void oo0ooo00(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        oo0ooo0(zArr, o0OOOo0.o00oo0.Default);
    }

    public static final byte oo0ooo0O(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Byte b = null;
        boolean z = false;
        for (byte b2 : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b = Byte.valueOf(b2);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(b, "null cannot be cast to non-null type kotlin.Byte");
            return b.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte oo0ooo0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return bArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final double oo0oooO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Double d = null;
        boolean z = false;
        for (double d2 : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                d = Double.valueOf(d2);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(d, "null cannot be cast to non-null type kotlin.Double");
            return d.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final double oo0oooO0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length == 1) {
                return dArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final char oo0oooOO(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Character ch = null;
        boolean z = false;
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ch = Character.valueOf(c);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float oo0oooo(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Float f = null;
        boolean z = false;
        for (float f2 : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f2)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                f = Float.valueOf(f2);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(f, "null cannot be cast to non-null type kotlin.Float");
            return f.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float oo0oooo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length == 1) {
                return fArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int oo0ooooO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length == 1) {
                return iArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int oo0ooooo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Integer num = null;
        boolean z = false;
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                num = Integer.valueOf(i);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Long> ooO0(@NotNull long[] jArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Long.valueOf(jArr[num.intValue()]));
        }
        return arrayList;
    }

    @Nullable
    public static final Double ooO00(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Double d = null;
        for (double d2 : dArr) {
            if (o00ooVar.invoke(Double.valueOf(d2)).booleanValue()) {
                if (z) {
                    return null;
                }
                d = Double.valueOf(d2);
                z = true;
            }
        }
        if (z) {
            return d;
        }
        return null;
    }

    public static final boolean ooO000(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Boolean bool = null;
        boolean z = false;
        for (boolean z2 : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bool = Boolean.valueOf(z2);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <T> T ooO0000(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : tArr) {
            if (o00ooVar.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long ooO00000(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Long l = null;
        boolean z = false;
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                l = Long.valueOf(j);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(l, "null cannot be cast to non-null type kotlin.Long");
            return l.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final short ooO0000O(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length == 1) {
                return sArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final short ooO0000o(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        Short sh = null;
        boolean z = false;
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                sh = Short.valueOf(s);
                z = true;
            }
        }
        if (z) {
            o0OOOOO0.o0ooO.o00oo0(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Boolean ooO000O(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Boolean bool = null;
        for (boolean z2 : zArr) {
            if (o00ooVar.invoke(Boolean.valueOf(z2)).booleanValue()) {
                if (z) {
                    return null;
                }
                bool = Boolean.valueOf(z2);
                z = true;
            }
        }
        if (z) {
            return bool;
        }
        return null;
    }

    @Nullable
    public static final Boolean ooO000O0(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @Nullable
    public static final Byte ooO000OO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    @Nullable
    public static final Byte ooO000Oo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Byte b = null;
        for (byte b2 : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b2)).booleanValue()) {
                if (z) {
                    return null;
                }
                b = Byte.valueOf(b2);
                z = true;
            }
        }
        if (z) {
            return b;
        }
        return null;
    }

    @Nullable
    public static final Character ooO000o(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Character ch = null;
        for (char c : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(c);
                z = true;
            }
        }
        if (z) {
            return ch;
        }
        return null;
    }

    @Nullable
    public static final Character ooO000o0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @Nullable
    public static final Double ooO000oo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @Nullable
    public static final Integer ooO00O00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Integer num = null;
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                if (z) {
                    return null;
                }
                num = Integer.valueOf(i);
                z = true;
            }
        }
        if (z) {
            return num;
        }
        return null;
    }

    @Nullable
    public static final Long ooO00O0O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @Nullable
    public static final <T> T ooO00O0o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @Nullable
    public static final <T> T ooO00Ooo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : tArr) {
            if (o00ooVar.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @NotNull
    public static final List<Character> ooO00o(@NotNull char[] cArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Character.valueOf(cArr[num.intValue()]));
        }
        return arrayList;
    }

    @Nullable
    public static final Short ooO00o0(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Short sh = null;
        for (short s : sArr) {
            if (o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                if (z) {
                    return null;
                }
                sh = Short.valueOf(s);
                z = true;
            }
        }
        if (z) {
            return sh;
        }
        return null;
    }

    @Nullable
    public static final Short ooO00o00(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Byte> ooO00o0O(@NotNull byte[] bArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Byte.valueOf(bArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> ooO00o0o(@NotNull byte[] bArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0(o0OO0oO.o0O00000.o0O0ooO0(bArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Double> ooO00oO(@NotNull double[] dArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Double.valueOf(dArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> ooO00oO0(@NotNull char[] cArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0OO(o0OO0oO.o0O00000.o0O0ooOO(cArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Double> ooO00oOO(@NotNull double[] dArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0O0(o0OO0oO.o0O00000.o0O0ooo0(dArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Float> ooO00oo(@NotNull float[] fArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0O(o0OO0oO.o0O00000.o0O0ooo(fArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Float> ooO00oo0(@NotNull float[] fArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Float.valueOf(fArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ooO00ooO(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Integer.valueOf(iArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ooO00ooo(@NotNull int[] iArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0Oo(o0OO0oO.o0O00000.o0O0oooO(iArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final float[] ooO0O(@NotNull float[] fArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        float[] fArr2 = new float[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            fArr2[i] = fArr[num.intValue()];
            i++;
        }
        return fArr2;
    }

    @NotNull
    public static final List<Short> ooO0O0(@NotNull short[] sArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0oO(o0OO0oO.o0O00000.o0OO000(sArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final <T> List<T> ooO0O00(@NotNull T[] tArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0o(o0OO0oO.o0O00000.o0O(tArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Long> ooO0O000(@NotNull long[] jArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o00oo0o0(o0OO0oO.o0O00000.o0O0oooo(jArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Short> ooO0O00O(@NotNull short[] sArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Short.valueOf(sArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> ooO0O0O(@NotNull boolean[] zArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? o0ooO.INSTANCE : o0OO0oO.o0O00000.o0O0o(o0OO0oO.o0O00000.o0OO000o(zArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1));
    }

    @NotNull
    public static final List<Boolean> ooO0O0O0(@NotNull boolean[] zArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(Boolean.valueOf(zArr[num.intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final byte[] ooO0O0OO(@NotNull byte[] bArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        byte[] bArr2 = new byte[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            bArr2[i] = bArr[num.intValue()];
            i++;
        }
        return bArr2;
    }

    @NotNull
    public static final byte[] ooO0O0Oo(@NotNull byte[] bArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new byte[0] : o0OO0oO.o0O00000.o0O0ooO0(bArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final double[] ooO0O0o(@NotNull double[] dArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        double[] dArr2 = new double[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            dArr2[i] = dArr[num.intValue()];
            i++;
        }
        return dArr2;
    }

    @NotNull
    public static final char[] ooO0O0o0(@NotNull char[] cArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        char[] cArr2 = new char[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            cArr2[i] = cArr[num.intValue()];
            i++;
        }
        return cArr2;
    }

    @NotNull
    public static final double[] ooO0O0oO(@NotNull double[] dArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new double[0] : o0OO0oO.o0O00000.o0O0ooo0(dArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final <T> T[] ooO0OO(@NotNull T[] tArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        T[] tArr2 = (T[]) o0OO0oO.o00ooO0.o00oOOo0(tArr, collection.size());
        int i = 0;
        for (Integer num : collection) {
            tArr2[i] = tArr[num.intValue()];
            i++;
        }
        return tArr2;
    }

    @NotNull
    public static final int[] ooO0OO0(@NotNull int[] iArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new int[0] : o0OO0oO.o0O00000.o0O0oooO(iArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final int[] ooO0OO00(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        int[] iArr2 = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr2[i] = iArr[num.intValue()];
            i++;
        }
        return iArr2;
    }

    @NotNull
    public static final long[] ooO0OO0O(@NotNull long[] jArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        long[] jArr2 = new long[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            jArr2[i] = jArr[num.intValue()];
            i++;
        }
        return jArr2;
    }

    @NotNull
    public static final long[] ooO0OO0o(@NotNull long[] jArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new long[0] : o0OO0oO.o0O00000.o0O0oooo(jArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final char[] ooO0OOO(@NotNull char[] cArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new char[0] : o0OO0oO.o0O00000.o0O0ooOO(cArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final <T> T[] ooO0OOO0(@NotNull T[] tArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? (T[]) o0OO0oO.o0O00000.o0O(tArr, 0, 0) : (T[]) o0OO0oO.o0O00000.o0O(tArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @NotNull
    public static final short[] ooO0OOOo(@NotNull short[] sArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        short[] sArr2 = new short[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            sArr2[i] = sArr[num.intValue()];
            i++;
        }
        return sArr2;
    }

    @NotNull
    public static final short[] ooO0OOo(@NotNull short[] sArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new short[0] : o0OO0oO.o0O00000.o0OO000(sArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @Nullable
    public static final Long ooO0OOoO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Long l = null;
        for (long j : jArr) {
            if (o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                if (z) {
                    return null;
                }
                l = Long.valueOf(j);
                z = true;
            }
        }
        if (z) {
            return l;
        }
        return null;
    }

    @Nullable
    public static final Float ooO0OOoo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0Oo(@NotNull byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OO0oO.o0O00000.o0Oo0ooo(bArr, i, i2);
        oo0Oo0o(bArr, i, i2);
    }

    public static final <T, R extends Comparable<? super R>> void ooO0Oo0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length > 1) {
            o0OO0oO.o0O00000.o0OoOo0o(tArr, new o00ooO0.o00oOOo0(o00ooVar));
        }
    }

    @NotNull
    public static final boolean[] ooO0Oo00(@NotNull boolean[] zArr, @NotNull Collection<Integer> collection) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(collection, "indices");
        boolean[] zArr2 = new boolean[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            zArr2[i] = zArr[num.intValue()];
            i++;
        }
        return zArr2;
    }

    public static final <T, R extends Comparable<? super R>> void ooO0Oo0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length > 1) {
            o0OO0oO.o0O00000.o0OoOo0o(tArr, new o00ooO0.o00oOo00(o00ooVar));
        }
    }

    public static final void ooO0Oo0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length > 1) {
            o0OO0oO.o0O00000.o0Oo0ooO(bArr);
            oo0Oo0o0(bArr);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0OoO(@NotNull char[] cArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OO0oO.o0O00000.o0OooOoo(cArr, i, i2);
        oo0Oo0oo(cArr, i, i2);
    }

    public static final void ooO0OoO0(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length > 1) {
            o0OO0oO.o0O00000.o0Oo(cArr);
            oo0Oo0oO(cArr);
        }
    }

    public static final void ooO0OoOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length > 1) {
            o0OO0oO.o0O00000.o0OoO000(dArr);
            oo0Oo(dArr);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0Ooo0(@NotNull double[] dArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OO0oO.o0O00000.o0OoO0(dArr, i, i2);
        oo0OoO00(dArr, i, i2);
    }

    public static final void ooO0OooO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length > 1) {
            o0OO0oO.o0O00000.o0oO0O00(fArr);
            oo0OoO0(fArr);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0Oooo(@NotNull float[] fArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OO0oO.o0O00000.o0OoO0OO(fArr, i, i2);
        oo0OoO0o(fArr, i, i2);
    }

    @NotNull
    public static final List<Integer> ooO0o(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        Integer[] o0o000 = o0OO0oO.o0O00000.o0o000(iArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o000);
        return o0OO0oO.o0O00000.o00oo0o(o0o000);
    }

    public static final <T extends Comparable<? super T>> void ooO0o0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OO0oO.o0O00000.o0OoOo0o(tArr, o0OO0oo0.o00ooO0.o00ooO00());
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0o00(@NotNull int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OO0oO.o0O00000.o0OoO0Oo(iArr, i, i2);
        oo0OoOOO(iArr, i, i2);
    }

    public static final void ooO0o000(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length > 1) {
            o0OO0oO.o0O00000.o0ooOOO0(iArr);
            oo0OoOO(iArr);
        }
    }

    public static final void ooO0o00O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length > 1) {
            o0OO0oO.o0O00000.o0OoO0o0(jArr);
            oo0OoOOo(jArr);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0o00o(@NotNull long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OO0oO.o0O00000.o0OoO0oO(jArr, i, i2);
        oo0OoOo0(jArr, i, i2);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T extends Comparable<? super T>> void ooO0o0O(@NotNull T[] tArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OO0oO.o0O00000.o0OoOo(tArr, o0OO0oo0.o00ooO0.o00ooO00(), i, i2);
    }

    public static final void ooO0o0OO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length > 1) {
            o0OO0oO.o0O00000.o0OoOO(sArr);
            oo0OoOoo(sArr);
        }
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooO0o0Oo(@NotNull short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OO0oO.o0O00000.o0OoOOoO(sArr, i, i2);
        oo0Ooo00(sArr, i, i2);
    }

    @NotNull
    public static final List<Character> ooO0o0o(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        Character[] o0o0000 = o0OO0oO.o0O00000.o0o0000(cArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o0000);
        return o0OO0oO.o0O00000.o00oo0o(o0o0000);
    }

    @NotNull
    public static final List<Byte> ooO0o0o0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        Byte[] o0OooooO = o0OO0oO.o0O00000.o0OooooO(bArr);
        o0OO0oO.o0O00000.o0OoOO00(o0OooooO);
        return o0OO0oO.o0O00000.o00oo0o(o0OooooO);
    }

    @NotNull
    public static final List<Double> ooO0o0oO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        Double[] o0o0o00O = o0OO0oO.o0O00000.o0o0o00O(dArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o0o00O);
        return o0OO0oO.o0O00000.o00oo0o(o0o0o00O);
    }

    @NotNull
    public static final List<Float> ooO0o0oo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        Float[] o0o0000o = o0OO0oO.o0O00000.o0o0000o(fArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o0000o);
        return o0OO0oO.o0O00000.o00oo0o(o0o0000o);
    }

    @NotNull
    public static final char[] ooO0oO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0Oo(copyOf);
        return copyOf;
    }

    @NotNull
    public static final List<Long> ooO0oO00(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        Long[] o0o000O0 = o0OO0oO.o0O00000.o0o000O0(jArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o000O0);
        return o0OO0oO.o0O00000.o00oo0o(o0o000O0);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> ooO0oO0O(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return o0OO0oO.o0O00000.o00oo0o(ooO0oOo0(tArr));
    }

    @NotNull
    public static final byte[] ooO0oO0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0Oo0ooO(copyOf);
        return copyOf;
    }

    @NotNull
    public static final float[] ooO0oOO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0oO0O00(copyOf);
        return copyOf;
    }

    @NotNull
    public static final double[] ooO0oOO0(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoO000(copyOf);
        return copyOf;
    }

    @NotNull
    public static final int[] ooO0oOOO(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0ooOOO0(copyOf);
        return copyOf;
    }

    @NotNull
    public static final long[] ooO0oOOo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoO0o0(copyOf);
        return copyOf;
    }

    @NotNull
    public static final short[] ooO0oOo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoOO(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] ooO0oOo0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        o0OO0oO.o0O00000.o0OoOO00(tArr2);
        return tArr2;
    }

    @NotNull
    public static final byte[] ooO0oOoO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0Oo0o(copyOf);
        return copyOf;
    }

    @NotNull
    public static final char[] ooO0oOoo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0OoO0(copyOf);
        return copyOf;
    }

    public static final boolean ooO0oo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length == 1) {
                return zArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final float[] ooO0oo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0OooO(copyOf);
        return copyOf;
    }

    @NotNull
    public static final double[] ooO0oo00(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0OoOo(copyOf);
        return copyOf;
    }

    @NotNull
    public static final int[] ooO0oo0O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0o000(copyOf);
        return copyOf;
    }

    @NotNull
    public static final long[] ooO0oo0o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0o00O(copyOf);
        return copyOf;
    }

    @NotNull
    public static final short[] ooO0ooO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        ooO0o0OO(copyOf);
        return copyOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] ooO0ooO0(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        o0OO0oO.o0O00000.o0OoOo0o(tArr2, o0OO0oo0.o00ooO0.o00ooO00());
        return tArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> ooOO0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOOoO(zArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> ooOO00(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oO(bArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <T> T[] ooOO000o(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(tArr2, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoOo0o(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> ooOO00O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oOo(dArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> ooOO00O0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oOO(cArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> ooOO00OO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oo0(fArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> ooOO00Oo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oo(iArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> ooOO00o(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0ooo(tArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> ooOO00o0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0ooO(jArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> ooOO00oO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOOO00(sArr, new o00ooO0.o00oOOo0(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> ooOO0O0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oOO(cArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> ooOO0O00(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oO(bArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> ooOO0O0O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oOo(dArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> ooOO0O0o(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oo0(fArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> ooOO0OO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0ooO(jArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> ooOO0OO0(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0oo(iArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> ooOO0OOO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOO0ooo(tArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final List<Byte> ooOO0Oo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0Oo0ooO(copyOf);
        return oo0OooO(copyOf);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> ooOO0Oo0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOOoO(zArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @NotNull
    public static final List<Character> ooOO0OoO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0Oo(copyOf);
        return oo0OooOO(copyOf);
    }

    @NotNull
    public static final List<Double> ooOO0Ooo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoO000(copyOf);
        return oo0OooOo(copyOf);
    }

    @NotNull
    public static final List<Short> ooOO0o(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoOO(copyOf);
        return oo0o000(copyOf);
    }

    @NotNull
    public static final List<Integer> ooOO0o0(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0ooOOO0(copyOf);
        return oo0Oooo(copyOf);
    }

    @NotNull
    public static final List<Float> ooOO0o00(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0oO0O00(copyOf);
        return oo0Oooo0(copyOf);
    }

    @NotNull
    public static final List<Long> ooOO0o0O(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, size)");
        o0OO0oO.o0O00000.o0OoO0o0(copyOf);
        return oo0OoooO(copyOf);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> ooOO0o0o(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return ooOO0ooo(tArr, o0OO0oo0.o00ooO0.o00ooO00());
    }

    @NotNull
    public static final List<Byte> ooOO0oO(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Byte[] o0OooooO = o0OO0oO.o0O00000.o0OooooO(bArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0OooooO, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0OooooO);
    }

    @NotNull
    public static final List<Character> ooOO0oOO(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Character[] o0o0000 = o0OO0oO.o0O00000.o0o0000(cArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o0000, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o0000);
    }

    @NotNull
    public static final List<Double> ooOO0oOo(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Double[] o0o0o00O = o0OO0oO.o0O00000.o0o0o00O(dArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o0o00O, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o0o00O);
    }

    @NotNull
    public static final List<Integer> ooOO0oo(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Integer[] o0o000 = o0OO0oO.o0O00000.o0o000(iArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o000, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o000);
    }

    @NotNull
    public static final List<Float> ooOO0oo0(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Float[] o0o0000o = o0OO0oO.o0O00000.o0o0000o(fArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o0000o, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o0000o);
    }

    @NotNull
    public static final List<Long> ooOO0ooO(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Long[] o0o000O0 = o0OO0oO.o0O00000.o0o000O0(jArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o000O0, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o000O0);
    }

    @NotNull
    public static final <T> List<T> ooOO0ooo(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0OO0oO.o0O00000.o00oo0o(ooOO000o(tArr, comparator));
    }

    @NotNull
    public static final Set<Double> ooOOO(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Double> oooO0o = oooO0o(dArr);
        o0O00o00.o0O0O0oo(oooO0o, iterable);
        return oooO0o;
    }

    @NotNull
    public static final List<Short> ooOOO00(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Short[] o0o000O = o0OO0oO.o0O00000.o0o000O(sArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0o000O, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0o000O);
    }

    public static final float ooOOO00O(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    @NotNull
    public static final Set<Byte> ooOOO0O(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Byte> oooO0o0o = oooO0o0o(bArr);
        o0O00o00.o0O0O0oo(oooO0o0o, iterable);
        return oooO0o0o;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T ooOOO0O0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        int oOO00O00 = oOO00O00(tArr);
        if (oOO00O00 == 0) {
            return t;
        }
        R invoke = o00ooVar.invoke(t);
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO00O00);
        while (o00oOOo02.hasNext()) {
            T t2 = tArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(t2);
            if (invoke.compareTo(invoke2) > 0) {
                t = t2;
                invoke = invoke2;
            }
        }
        return t;
    }

    public static final byte ooOOO0Oo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[0];
    }

    @NotNull
    public static final Set<Character> ooOOO0o(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Character> oooooO = oooooO(cArr);
        o0O00o00.o0O0O0oo(oooooO, iterable);
        return oooooO;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final byte ooOOO0o0(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b = bArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000Oo(bArr)).iterator();
        while (it.hasNext()) {
            byte b2 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b), Byte.valueOf(b2)) < 0) {
                b = b2;
            }
        }
        return b;
    }

    @o0OOOO0o.o00oo0OO(name = "minByOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <R extends Comparable<? super R>> double ooOOO0oO(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d = dArr[0];
        int oOO000o = oOO000o(dArr);
        if (oOO000o == 0) {
            return d;
        }
        R invoke = o00ooVar.invoke(Double.valueOf(d));
        o0O0o0 o00oOOo02 = o0OO0oO.o0.o00oOOo0(1, oOO000o);
        while (o00oOOo02.hasNext()) {
            double d2 = dArr[o00oOOo02.nextInt()];
            R invoke2 = o00ooVar.invoke(Double.valueOf(d2));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                d = d2;
            }
        }
        return d;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer ooOOO0oo(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO000oo(iArr)).iterator();
        while (it.hasNext()) {
            int i2 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i), Integer.valueOf(i2)) < 0) {
                i = i2;
            }
        }
        return Integer.valueOf(i);
    }

    @NotNull
    public static final Set<Short> ooOOOO(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Short> oooOooOO = oooOooOO(sArr);
        o0O00o00.o0O0O0oo(oooOooOO, iterable);
        return oooOooOO;
    }

    @NotNull
    public static final Set<Integer> ooOOOO0(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Integer> oooO0oo = oooO0oo(iArr);
        o0O00o00.o0O0O0oo(oooO0oo, iterable);
        return oooO0oo;
    }

    @NotNull
    public static final Set<Float> ooOOOO00(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Float> oooO0oO = oooO0oO(fArr);
        o0O00o00.o0O0O0oo(oooO0oO, iterable);
        return oooO0oO;
    }

    @NotNull
    public static final Set<Long> ooOOOO0O(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Long> oooO0ooO = oooO0ooO(jArr);
        o0O00o00.o0O0O0oo(oooO0ooO, iterable);
        return oooO0ooO;
    }

    @NotNull
    public static final <T> Set<T> ooOOOO0o(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<T> oooO = oooO(tArr);
        o0O00o00.o0O0O0oo(oooO, iterable);
        return oooO;
    }

    @NotNull
    public static final Set<Boolean> ooOOOOO0(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Boolean> oooOO00 = oooOO00(zArr);
        o0O00o00.o0O0O0oo(oooOO00, iterable);
        return oooOO00;
    }

    public static final double ooOOOOOO(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    @NotNull
    public static final <T, K> List<T> ooOOOOOo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (hashSet.add(o00ooVar.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final float ooOOOOo(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    @NotNull
    public static final <T> List<T> ooOOOOoO(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!o00ooVar.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ooOOOOoo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return o0O0oo0o.o0o00o(oooO0oo(iArr));
    }

    public static final int ooOOOo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final int ooOOOo0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        return i;
    }

    public static final int ooOOOoO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int i = 0;
        for (short s : sArr) {
            i += s;
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    public static final Float ooOOOoO0(float[] fArr, o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (float f : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                return Float.valueOf(f);
            }
        }
        return null;
    }

    @o0OOO0OO.o00oo00O
    public static final Character ooOOOoOo(char[] cArr, o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char c = cArr[length];
                if (o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                    return Character.valueOf(c);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    public static final long ooOOOoo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    public static final Integer ooOOOoo0(int[] iArr, o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    @o0OOOO0o.o00oo0OO(name = "maxWithOrThrow")
    @o0OO0o.o0OO00o0(version = "1.7")
    public static final <T> T ooOOOooo(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t = tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            T t2 = tArr[it.nextInt()];
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (byte b : bArr) {
            d += o00ooVar.invoke(Byte.valueOf(b)).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final List<Byte> ooOOo0(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                arrayList.add(Byte.valueOf(b));
            }
        }
        return arrayList;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo000(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (byte b : bArr) {
            i += o00ooVar.invoke(Byte.valueOf(b)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo00O(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (char c : cArr) {
            i += o00ooVar.invoke(Character.valueOf(c)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo00o(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (double d : dArr) {
            i += o00ooVar.invoke(Double.valueOf(d)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo0O(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (float f : fArr) {
            i += o00ooVar.invoke(Float.valueOf(f)).intValue();
        }
        return i;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> ooOOo0OO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        return ooOOO00(sArr, new o00ooO0.o00oOo00(o00ooVar));
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo0Oo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (int i2 : iArr) {
            i += o00ooVar.invoke(Integer.valueOf(i2)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int ooOOo0o(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (T t : tArr) {
            i += o00ooVar.invoke(t).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo0o0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (long j : jArr) {
            i += o00ooVar.invoke(Long.valueOf(j)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo0oO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (short s : sArr) {
            i += o00ooVar.invoke(Short.valueOf(s)).intValue();
        }
        return i;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final int ooOOo0oo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (boolean z : zArr) {
            i += o00ooVar.invoke(Boolean.valueOf(z)).intValue();
        }
        return i;
    }

    @NotNull
    public static final List<Boolean> ooOOoO(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        Boolean[] o0Ooooo = o0OO0oO.o0O00000.o0Ooooo(zArr);
        o0OO0oO.o0O00000.o0OoOo0o(o0Ooooo, comparator);
        return o0OO0oO.o0O00000.o00oo0o(o0Ooooo);
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoO0(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (char c : cArr) {
            d += o00ooVar.invoke(Character.valueOf(c)).doubleValue();
        }
        return d;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoO0O(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (double d2 : dArr) {
            d += o00ooVar.invoke(Double.valueOf(d2)).doubleValue();
        }
        return d;
    }

    @NotNull
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "flatMapSequence")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T, R> List<R> ooOOoOO0(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, ? extends oO000<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            o0O00o00.o0O00Oo(arrayList, o00ooVar.invoke(t));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C ooOOoOOO(@NotNull long[] jArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Long, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        for (long j : jArr) {
            o0O00o00.o0O00OOO(c, o00ooVar.invoke(Long.valueOf(j)));
        }
        return c;
    }

    @NotNull
    public static final List<Short> ooOOoOOo(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O0 = oOO00O0(sArr); -1 < oOO00O0; oOO00O0--) {
            if (!o00ooVar.invoke(Short.valueOf(sArr[oOO00O0])).booleanValue()) {
                return ooOoOoo0(sArr, oOO00O0 + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoOo(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (float f : fArr) {
            d += o00ooVar.invoke(Float.valueOf(f)).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C ooOOoOo0(@NotNull char[] cArr, @NotNull C c, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (char c2 : cArr) {
            if (o00ooVar.invoke(Character.valueOf(c2)).booleanValue()) {
                c.add(Character.valueOf(c2));
            }
        }
        return c;
    }

    @NotNull
    public static final List<Byte> ooOOoOoO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000Oo = oOO000Oo(bArr); -1 < oOO000Oo; oOO000Oo--) {
            if (!o00ooVar.invoke(Byte.valueOf(bArr[oOO000Oo])).booleanValue()) {
                return ooOoOOoo(bArr, oOO000Oo + 1);
            }
        }
        return o0ooO.INSTANCE;
    }

    @NotNull
    public static final <R> List<R> ooOOoOoo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, ? extends Iterable<? extends R>> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            o0O00o00.o0O00OOO(arrayList, o00ooVar.invoke(Character.valueOf(c)));
        }
        return arrayList;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (boolean z : zArr) {
            d += o00ooVar.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return d;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoo0(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (long j : jArr) {
            d += o00ooVar.invoke(Long.valueOf(j)).doubleValue();
        }
        return d;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoo00(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (int i : iArr) {
            d += o00ooVar.invoke(Integer.valueOf(i)).doubleValue();
        }
        return d;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double ooOOoo0O(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (T t : tArr) {
            d += o00ooVar.invoke(t).doubleValue();
        }
        return d;
    }

    @o0OO0o.o00oo(warningSince = "1.5")
    @o0OO0o.o0O0o(message = "Use sumOf instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.sumOf(selector)", imports = {}))
    public static final double ooOOoo0o(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (short s : sArr) {
            d += o00ooVar.invoke(Short.valueOf(s)).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOOooO(byte[] bArr, o0OOOO.o00oo<? super Byte, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (byte b : bArr) {
            d += o00ooVar.invoke(Byte.valueOf(b)).doubleValue();
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfByte")
    public static final int ooOOooO0(@NotNull Byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int i = 0;
        for (Byte b : bArr) {
            i += b.byteValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOOooOO(char[] cArr, o0OOOO.o00oo<? super Character, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (char c : cArr) {
            d += o00ooVar.invoke(Character.valueOf(c)).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final List<Character> ooOOooOo(@NotNull char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (i >= 0) {
            int length = cArr.length - i;
            return ooOoOo00(cArr, length >= 0 ? length : 0);
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOOooo(double[] dArr, o0OOOO.o00oo<? super Double, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (double d2 : dArr) {
            d += o00ooVar.invoke(Double.valueOf(d2)).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOOoooo(float[] fArr, o0OOOO.o00oo<? super Float, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (float f : fArr) {
            d += o00ooVar.invoke(Float.valueOf(f)).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOo0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (boolean z : zArr) {
            d += o00ooVar.invoke(Boolean.valueOf(z)).doubleValue();
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    public static final double ooOo00(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        double d = 0.0d;
        for (Double d2 : dArr) {
            d += d2.doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOo000(long[] jArr, o0OOOO.o00oo<? super Long, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (long j : jArr) {
            d += o00ooVar.invoke(Long.valueOf(j)).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOo0000(int[] iArr, o0OOOO.o00oo<? super Integer, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (int i : iArr) {
            d += o00ooVar.invoke(Integer.valueOf(i)).doubleValue();
        }
        return d;
    }

    @NotNull
    public static final float[] ooOo000O(@NotNull float[] fArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new float[0] : o0OO0oO.o0O00000.o0O0ooo(fArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @Nullable
    public static final Float ooOo000o(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        boolean z = false;
        Float f = null;
        for (float f2 : fArr) {
            if (o00ooVar.invoke(Float.valueOf(f2)).booleanValue()) {
                if (z) {
                    return null;
                }
                f = Float.valueOf(f2);
                z = true;
            }
        }
        if (z) {
            return f;
        }
        return null;
    }

    @Nullable
    public static final Integer ooOo00O0(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Short> ooOo00Oo(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        Short[] o0o000O = o0OO0oO.o0O00000.o0o000O(sArr);
        o0OO0oO.o0O00000.o0OoOO00(o0o000O);
        return o0OO0oO.o0O00000.o00oo0o(o0o000O);
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> double ooOo00oO(T[] tArr, o0OOOO.o00oo<? super T, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (T t : tArr) {
            d += o00ooVar.invoke(t).doubleValue();
        }
        return d;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfDouble")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final double ooOo00oo(short[] sArr, o0OOOO.o00oo<? super Short, Double> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        double d = 0.0d;
        for (short s : sArr) {
            d += o00ooVar.invoke(Short.valueOf(s)).doubleValue();
        }
        return d;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfFloat")
    public static final float ooOo0O00(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        float f = 0.0f;
        for (Float f2 : fArr) {
            f += f2.floatValue();
        }
        return f;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0OOo(byte[] bArr, o0OOOO.o00oo<? super Byte, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (byte b : bArr) {
            i += o00ooVar.invoke(Byte.valueOf(b)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0Oo(double[] dArr, o0OOOO.o00oo<? super Double, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (double d : dArr) {
            i += o00ooVar.invoke(Double.valueOf(d)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0Oo0(char[] cArr, o0OOOO.o00oo<? super Character, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (char c : cArr) {
            i += o00ooVar.invoke(Character.valueOf(c)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0OoO(float[] fArr, o0OOOO.o00oo<? super Float, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (float f : fArr) {
            i += o00ooVar.invoke(Float.valueOf(f)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0Ooo(int[] iArr, o0OOOO.o00oo<? super Integer, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (int i2 : iArr) {
            i += o00ooVar.invoke(Integer.valueOf(i2)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0o(short[] sArr, o0OOOO.o00oo<? super Short, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (short s : sArr) {
            i += o00ooVar.invoke(Short.valueOf(s)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0o00(long[] jArr, o0OOOO.o00oo<? super Long, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (long j : jArr) {
            i += o00ooVar.invoke(Long.valueOf(j)).intValue();
        }
        return i;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    public static final int ooOo0o0O(@NotNull Integer[] numArr) {
        o0OOOOO0.o0ooO.o00oo0O0(numArr, "<this>");
        int i = 0;
        for (Integer num : numArr) {
            i += num.intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> int ooOo0o0o(T[] tArr, o0OOOO.o00oo<? super T, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (T t : tArr) {
            i += o00ooVar.invoke(t).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfInt")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final int ooOo0oO(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Integer> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int i = 0;
        for (boolean z : zArr) {
            i += o00ooVar.invoke(Boolean.valueOf(z)).intValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOo0oOO(byte[] bArr, o0OOOO.o00oo<? super Byte, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (byte b : bArr) {
            j += o00ooVar.invoke(Byte.valueOf(b)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOo0oo(double[] dArr, o0OOOO.o00oo<? super Double, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (double d : dArr) {
            j += o00ooVar.invoke(Double.valueOf(d)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOo0oo0(char[] cArr, o0OOOO.o00oo<? super Character, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (char c : cArr) {
            j += o00ooVar.invoke(Character.valueOf(c)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOo0ooO(float[] fArr, o0OOOO.o00oo<? super Float, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (float f : fArr) {
            j += o00ooVar.invoke(Float.valueOf(f)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOo0ooo(int[] iArr, o0OOOO.o00oo<? super Integer, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (int i : iArr) {
            j += o00ooVar.invoke(Integer.valueOf(i)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOoO0(short[] sArr, o0OOOO.o00oo<? super Short, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (short s : sArr) {
            j += o00ooVar.invoke(Short.valueOf(s)).longValue();
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    public static final long ooOoO00(@NotNull Long[] lArr) {
        o0OOOOO0.o0ooO.o00oo0O0(lArr, "<this>");
        long j = 0;
        for (Long l : lArr) {
            j += l.longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOoO000(long[] jArr, o0OOOO.o00oo<? super Long, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (long j2 : jArr) {
            j += o00ooVar.invoke(Long.valueOf(j2)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <T> long ooOoO00O(T[] tArr, o0OOOO.o00oo<? super T, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (T t : tArr) {
            j += o00ooVar.invoke(t).longValue();
        }
        return j;
    }

    @o0OOOO0o.o00oo0OO(name = "sumOfShort")
    public static final int ooOoO0O(@NotNull Short[] shArr) {
        o0OOOOO0.o0ooO.o00oo0O0(shArr, "<this>");
        int i = 0;
        for (Short sh : shArr) {
            i += sh.shortValue();
        }
        return i;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @o0OOOO0o.o00oo0OO(name = "sumOfLong")
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final long ooOoO0O0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, Long> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long j = 0;
        for (boolean z : zArr) {
            j += o00ooVar.invoke(Boolean.valueOf(z)).longValue();
        }
        return j;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0OO(byte[] bArr, o0OOOO.o00oo<? super Byte, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (byte b : bArr) {
            o00oOooo2 += o00ooVar.invoke(Byte.valueOf(b)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0Oo(char[] cArr, o0OOOO.o00oo<? super Character, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (char c : cArr) {
            o00oOooo2 += o00ooVar.invoke(Character.valueOf(c)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0o(float[] fArr, o0OOOO.o00oo<? super Float, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (float f : fArr) {
            o00oOooo2 += o00ooVar.invoke(Float.valueOf(f)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0o0(double[] dArr, o0OOOO.o00oo<? super Double, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (double d : dArr) {
            o00oOooo2 += o00ooVar.invoke(Double.valueOf(d)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0oO(int[] iArr, o0OOOO.o00oo<? super Integer, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (int i : iArr) {
            o00oOooo2 += o00ooVar.invoke(Integer.valueOf(i)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoO0oo(long[] jArr, o0OOOO.o00oo<? super Long, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (long j : jArr) {
            o00oOooo2 += o00ooVar.invoke(Long.valueOf(j)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOO(float[] fArr, o0OOOO.o00oo<? super Float, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (float f : fArr) {
            o00oOooo2 += o00ooVar.invoke(Float.valueOf(f)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoOO0(boolean[] zArr, o0OOOO.o00oo<? super Boolean, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (boolean z : zArr) {
            o00oOooo2 += o00ooVar.invoke(Boolean.valueOf(z)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final int ooOoOO00(short[] sArr, o0OOOO.o00oo<? super Short, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (short s : sArr) {
            o00oOooo2 += o00ooVar.invoke(Short.valueOf(s)).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOO0O(char[] cArr, o0OOOO.o00oo<? super Character, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (char c : cArr) {
            o00oOooo2 += o00ooVar.invoke(Character.valueOf(c)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOO0o(double[] dArr, o0OOOO.o00oo<? super Double, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (double d : dArr) {
            o00oOooo2 += o00ooVar.invoke(Double.valueOf(d)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOOO(long[] jArr, o0OOOO.o00oo<? super Long, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (long j : jArr) {
            o00oOooo2 += o00ooVar.invoke(Long.valueOf(j)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOOO0(int[] iArr, o0OOOO.o00oo<? super Integer, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (int i : iArr) {
            o00oOooo2 += o00ooVar.invoke(Integer.valueOf(i)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOOOo(byte[] bArr, o0OOOO.o00oo<? super Byte, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (byte b : bArr) {
            o00oOooo2 += o00ooVar.invoke(Byte.valueOf(b)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOOo(short[] sArr, o0OOOO.o00oo<? super Short, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (short s : sArr) {
            o00oOooo2 += o00ooVar.invoke(Short.valueOf(s)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <T> long ooOoOOo0(T[] tArr, o0OOOO.o00oo<? super T, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (T t : tArr) {
            o00oOooo2 += o00ooVar.invoke(t).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfULong")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final long ooOoOOoO(boolean[] zArr, o0OOOO.o00oo<? super Boolean, o0oo0000> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        long o00oOooo2 = o0oo0000.o00oOooo(0L);
        for (boolean z : zArr) {
            o00oOooo2 += o00ooVar.invoke(Boolean.valueOf(z)).f13227o00oo0O0;
        }
        return o00oOooo2;
    }

    @NotNull
    public static final List<Byte> ooOoOOoo(@NotNull byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= bArr.length) {
                return oooO0oO0(bArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (byte b : bArr) {
                arrayList.add(Byte.valueOf(b));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> ooOoOo(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= iArr.length) {
                return oooO0O00(iArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (int i3 : iArr) {
                arrayList.add(Integer.valueOf(i3));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> ooOoOo0(@NotNull double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= dArr.length) {
                return oooO00oo(dArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Double.valueOf(dArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (double d : dArr) {
                arrayList.add(Double.valueOf(d));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> ooOoOo00(@NotNull char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= cArr.length) {
                return oooO00oO(cArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Character.valueOf(cArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (char c : cArr) {
                arrayList.add(Character.valueOf(c));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> ooOoOo0O(@NotNull float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= fArr.length) {
                return oooO0(fArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> ooOoOoO0(@NotNull long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= jArr.length) {
                return oooO0O0(jArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Long.valueOf(jArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (long j : jArr) {
                arrayList.add(Long.valueOf(j));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o000
    @oO0Oo0oo(markerClass = {o0OO0o.o0OoOoOo.class})
    @o0OOOO0o.o00oo0OO(name = "sumOfUInt")
    @o0OO0o.o0OO00o0(version = "1.5")
    public static final <T> int ooOoOoOO(T[] tArr, o0OOOO.o00oo<? super T, o0OO0o.o0OOOO> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        int o00oOooo2 = o0OO0o.o0OOOO.o00oOooo(0);
        for (T t : tArr) {
            o00oOooo2 += o00ooVar.invoke(t).f13218o00oo0O0;
        }
        return o00oOooo2;
    }

    @NotNull
    public static final <T> List<T> ooOoOoOo(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= tArr.length) {
                return oooO0O0O(tArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (T t : tArr) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> ooOoOoo(@NotNull boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= zArr.length) {
                return oooO0O(zArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Boolean.valueOf(zArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (boolean z : zArr) {
                arrayList.add(Boolean.valueOf(z));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> ooOoOoo0(@NotNull short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            if (i >= sArr.length) {
                return oooO0O0o(sArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (short s : sArr) {
                arrayList.add(Short.valueOf(s));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> ooOoOooO(@NotNull byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = bArr.length;
            if (i >= length) {
                return oooO0oO0(bArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Byte.valueOf(bArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> ooOoOooo(@NotNull char[] cArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = cArr.length;
            if (i >= length) {
                return oooO00oO(cArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Character.valueOf(cArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Character.valueOf(cArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> ooOoo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O00 = oOO00O00(tArr); -1 < oOO00O00; oOO00O00--) {
            if (!o00ooVar.invoke(tArr[oOO00O00]).booleanValue()) {
                return oO000oo0(tArr, oOO00O00 + 1);
            }
        }
        return oooO0O0O(tArr);
    }

    @NotNull
    public static final <T> List<T> ooOoo0(@NotNull T[] tArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = tArr.length;
            if (i >= length) {
                return oooO0O0O(tArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> ooOoo00(@NotNull float[] fArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = fArr.length;
            if (i >= length) {
                return oooO0(fArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Float.valueOf(fArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Float.valueOf(fArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> ooOoo000(@NotNull double[] dArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = dArr.length;
            if (i >= length) {
                return oooO00oo(dArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Double.valueOf(dArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Double.valueOf(dArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> ooOoo00O(@NotNull long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = jArr.length;
            if (i >= length) {
                return oooO0O0(jArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Long.valueOf(jArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Long.valueOf(jArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> ooOoo0O(@NotNull boolean[] zArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = zArr.length;
            if (i >= length) {
                return oooO0O(zArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Boolean.valueOf(zArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Boolean.valueOf(zArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> ooOoo0O0(@NotNull short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = sArr.length;
            if (i >= length) {
                return oooO0O0o(sArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Short.valueOf(sArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Short.valueOf(sArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> ooOoo0OO(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000Oo = oOO000Oo(bArr); -1 < oOO000Oo; oOO000Oo--) {
            if (!o00ooVar.invoke(Byte.valueOf(bArr[oOO000Oo])).booleanValue()) {
                return oO000oO0(bArr, oOO000Oo + 1);
            }
        }
        return oooO0oO0(bArr);
    }

    @NotNull
    public static final List<Character> ooOoo0Oo(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000o0 = oOO000o0(cArr); -1 < oOO000o0; oOO000o0--) {
            if (!o00ooVar.invoke(Character.valueOf(cArr[oOO000o0])).booleanValue()) {
                return oO000oO(cArr, oOO000o0 + 1);
            }
        }
        return oooO00oO(cArr);
    }

    @NotNull
    public static final List<Float> ooOoo0o(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000oO = oOO000oO(fArr); -1 < oOO000oO; oOO000oO--) {
            if (!o00ooVar.invoke(Float.valueOf(fArr[oOO000oO])).booleanValue()) {
                return oO000oOO(fArr, oOO000oO + 1);
            }
        }
        return oooO0(fArr);
    }

    @NotNull
    public static final List<Double> ooOoo0o0(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000o = oOO000o(dArr); -1 < oOO000o; oOO000o--) {
            if (!o00ooVar.invoke(Double.valueOf(dArr[oOO000o])).booleanValue()) {
                return oO0Ooo0O(dArr, oOO000o + 1);
            }
        }
        return oooO00oo(dArr);
    }

    @NotNull
    public static final List<Long> ooOoo0oO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00 = oOO00(jArr); -1 < oOO00; oOO00--) {
            if (!o00ooVar.invoke(Long.valueOf(jArr[oOO00])).booleanValue()) {
                return oO000oOo(jArr, oOO00 + 1);
            }
        }
        return oooO0O0(jArr);
    }

    @NotNull
    public static final List<Integer> ooOoo0oo(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO000oo = oOO000oo(iArr); -1 < oOO000oo; oOO000oo--) {
            if (!o00ooVar.invoke(Integer.valueOf(iArr[oOO000oo])).booleanValue()) {
                return oO0Ooo0o(iArr, oOO000oo + 1);
            }
        }
        return oooO0O00(iArr);
    }

    @NotNull
    public static final List<Float> ooOooO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            if (!o00ooVar.invoke(Float.valueOf(f)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> ooOooO0(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O0O = oOO00O0O(zArr); -1 < oOO00O0O; oOO00O0O--) {
            if (!o00ooVar.invoke(Boolean.valueOf(zArr[oOO00O0O])).booleanValue()) {
                return oO0Oo0Oo(zArr, oOO00O0O + 1);
            }
        }
        return oooO0O(zArr);
    }

    @NotNull
    public static final List<Short> ooOooO00(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int oOO00O0 = oOO00O0(sArr); -1 < oOO00O0; oOO00O0--) {
            if (!o00ooVar.invoke(Short.valueOf(sArr[oOO00O0])).booleanValue()) {
                return oO000oo(sArr, oOO00O0 + 1);
            }
        }
        return oooO0O0o(sArr);
    }

    @NotNull
    public static final List<Byte> ooOooO0O(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b : bArr) {
            if (!o00ooVar.invoke(Byte.valueOf(b)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> ooOooO0o(@NotNull char[] cArr, @NotNull o0OOOO.o00oo<? super Character, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c : cArr) {
            if (!o00ooVar.invoke(Character.valueOf(c)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> ooOooOO(@NotNull long[] jArr, @NotNull o0OOOO.o00oo<? super Long, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (!o00ooVar.invoke(Long.valueOf(j)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> ooOooOO0(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (!o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> ooOooOo(@NotNull T[] tArr, @NotNull o0OOOO.o00oo<? super T, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (!o00ooVar.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> ooOooOoO(@NotNull short[] sArr, @NotNull o0OOOO.o00oo<? super Short, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s : sArr) {
            if (!o00ooVar.invoke(Short.valueOf(s)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> ooOooOoo(@NotNull boolean[] zArr, @NotNull o0OOOO.o00oo<? super Boolean, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z : zArr) {
            if (!o00ooVar.invoke(Boolean.valueOf(z)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> ooOooo(@NotNull double[] dArr, @NotNull o0OOOO.o00oo<? super Double, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d : dArr) {
            if (!o00ooVar.invoke(Double.valueOf(d)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    @NotNull
    public static final byte[] ooOooo0(@NotNull Byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final boolean[] ooOooo00(@NotNull Boolean[] boolArr) {
        o0OOOOO0.o0ooO.o00oo0O0(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final char[] ooOooo0O(@NotNull Character[] chArr) {
        o0OOOOO0.o0ooO.o00oo0O0(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = chArr[i].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final List<Integer> ooOooo0o(@NotNull int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return o0ooO.INSTANCE;
            }
            int length = iArr.length;
            if (i >= length) {
                return oooO0O00(iArr);
            }
            if (i == 1) {
                return o0OO0oO.o0OoO00O.o00oOoo0(Integer.valueOf(iArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Integer.valueOf(iArr[i2]));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(o00ooO0.o00oOoO.o00oOOo0("Requested element count ", i, " is less than zero.").toString());
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C ooOoooO(@NotNull char[] cArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (char c2 : cArr) {
            c.add(Character.valueOf(c2));
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C ooOoooO0(@NotNull byte[] bArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (byte b : bArr) {
            c.add(Byte.valueOf(b));
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C ooOoooOO(@NotNull double[] dArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (double d : dArr) {
            c.add(Double.valueOf(d));
        }
        return c;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Character ooo00000(@NotNull char[] cArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Character, ? super Character, Character> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000o0 = oOO000o0(cArr);
        if (oOO000o0 < 0) {
            return null;
        }
        char c = cArr[oOO000o0];
        for (int i = oOO000o0 - 1; i >= 0; i--) {
            c = o0o0000o.invoke(Integer.valueOf(i), Character.valueOf(cArr[i]), Character.valueOf(c)).charValue();
        }
        return Character.valueOf(c);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final Byte ooo0000O(@NotNull byte[] bArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super Byte, ? super Byte, Byte> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        int oOO000Oo = oOO000Oo(bArr);
        if (oOO000Oo < 0) {
            return null;
        }
        byte b = bArr[oOO000Oo];
        for (int i = oOO000Oo - 1; i >= 0; i--) {
            b = o0o0000o.invoke(Integer.valueOf(i), Byte.valueOf(bArr[i]), Byte.valueOf(b)).byteValue();
        }
        return Byte.valueOf(b);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooo0O0oo(@NotNull int[] iArr, @NotNull o0OOOo0.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        for (int oOO000oo = oOO000oo(iArr); oOO000oo > 0; oOO000oo--) {
            int nextInt = o00oo0Var.nextInt(oOO000oo + 1);
            int i = iArr[oOO000oo];
            iArr[oOO000oo] = iArr[nextInt];
            iArr[nextInt] = i;
        }
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean ooo0Oo0(double[] dArr, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (dArr[i] == d) {
                return true;
            }
        }
        return false;
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S ooo0OoO(@NotNull T[] tArr, @NotNull o0OOOO.o0O0000O<? super Integer, ? super S, ? super T, ? extends S> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        o0O0o0 it = new o0OOOo0o.o0O0O0Oo(1, oOO00O00(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            obj = (S) o0o0000o.invoke(Integer.valueOf(nextInt), obj, (Object) tArr[nextInt]);
        }
        return (S) obj;
    }

    public static final int ooo0o(@NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "predicate");
        for (int i : iArr) {
            if (o00ooVar.invoke(Integer.valueOf(i)).booleanValue()) {
                return i;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> ooo0oOO(boolean[] zArr, R r, o0OOOO.o0O00000<? super R, ? super Boolean, ? extends R> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "operation");
        if (zArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r);
        for (boolean z : zArr) {
            r = o0o00000.invoke(r, Boolean.valueOf(z));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final boolean[] ooo0oOo(@NotNull boolean[] zArr, @NotNull o0OOOo0o.o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "indices");
        return o0o0o0oo.isEmpty() ? new boolean[0] : o0OO0oO.o0O00000.o0OO000o(zArr, o0o0o0oo.o00oOOo0().intValue(), o0o0o0oo.o00oOo00().intValue() + 1);
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static final void ooo0oooO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        oo0ooOOO(jArr, o0OOOo0.o00oo0.Default);
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C ooo0oooo(@NotNull float[] fArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (float f : fArr) {
            c.add(Float.valueOf(f));
        }
        return c;
    }

    @NotNull
    public static final <T> Set<T> oooO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (Set) oooO000(tArr, new LinkedHashSet(oo0oO0.o00oOoOo(tArr.length)));
    }

    @NotNull
    public static final List<Float> oooO0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? oooO0Oo0(fArr) : o0OO0oO.o0OoO00O.o00oOoo0(Float.valueOf(fArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final HashSet<Double> oooO00(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return (HashSet) ooOoooOO(dArr, new HashSet(oo0oO0.o00oOoOo(dArr.length)));
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C oooO000(@NotNull T[] tArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C oooO0000(@NotNull long[] jArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (long j : jArr) {
            c.add(Long.valueOf(j));
        }
        return c;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C oooO000O(@NotNull boolean[] zArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (boolean z : zArr) {
            c.add(Boolean.valueOf(z));
        }
        return c;
    }

    @NotNull
    public static final float[] oooO000o(@NotNull Float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static final HashSet<Integer> oooO00O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return (HashSet) oooO0oo0(iArr, new HashSet(oo0oO0.o00oOoOo(iArr.length)));
    }

    @NotNull
    public static final HashSet<Float> oooO00O0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return (HashSet) ooo0oooo(fArr, new HashSet(oo0oO0.o00oOoOo(fArr.length)));
    }

    @NotNull
    public static final <T> HashSet<T> oooO00OO(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return (HashSet) oooO000(tArr, new HashSet(oo0oO0.o00oOoOo(tArr.length)));
    }

    @NotNull
    public static final HashSet<Long> oooO00Oo(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return (HashSet) oooO0000(jArr, new HashSet(oo0oO0.o00oOoOo(jArr.length)));
    }

    @NotNull
    public static final HashSet<Short> oooO00o(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return (HashSet) oooO00o0(sArr, new HashSet(oo0oO0.o00oOoOo(sArr.length)));
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C oooO00o0(@NotNull short[] sArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (short s : sArr) {
            c.add(Short.valueOf(s));
        }
        return c;
    }

    @NotNull
    public static final List<Character> oooO00oO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? oooO0OOO(cArr) : o0OO0oO.o0OoO00O.o00oOoo0(Character.valueOf(cArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Double> oooO00oo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? oooO0OOo(dArr) : o0OO0oO.o0OoO00O.o00oOoo0(Double.valueOf(dArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Boolean> oooO0O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? oooO0o0O(zArr) : o0OO0oO.o0OoO00O.o00oOoo0(Boolean.valueOf(zArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Long> oooO0O0(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? oooO0OoO(jArr) : o0OO0oO.o0OoO00O.o00oOoo0(Long.valueOf(jArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Integer> oooO0O00(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? oooO0Oo(iArr) : o0OO0oO.o0OoO00O.o00oOoo0(Integer.valueOf(iArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final <T> List<T> oooO0O0O(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? oooO0Ooo(tArr) : o0OO0oO.o0OoO00O.o00oOoo0(tArr[0]) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Short> oooO0O0o(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? oooO0o00(sArr) : o0OO0oO.o0OoO00O.o00oOoo0(Short.valueOf(sArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final List<Byte> oooO0OO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    @NotNull
    public static final long[] oooO0OO0(@NotNull Long[] lArr) {
        o0OOOOO0.o0ooO.o00oo0O0(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    @NotNull
    public static final List<Character> oooO0OOO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> oooO0OOo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> oooO0Oo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> oooO0Oo0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> oooO0OoO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> oooO0Ooo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return new ArrayList(o0OO0oO.o0O00O0o.o00oo0o0(tArr));
    }

    @NotNull
    public static final Set<Double> oooO0o(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return (Set) ooOoooOO(dArr, new LinkedHashSet(oo0oO0.o00oOoOo(dArr.length)));
    }

    @NotNull
    public static final List<Short> oooO0o00(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> oooO0o0O(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> oooO0o0o(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return (Set) ooOoooO0(bArr, new LinkedHashSet(oo0oO0.o00oOoOo(bArr.length)));
    }

    @NotNull
    public static final Set<Float> oooO0oO(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return (Set) ooo0oooo(fArr, new LinkedHashSet(oo0oO0.o00oOoOo(fArr.length)));
    }

    @NotNull
    public static final List<Byte> oooO0oO0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? oooO0OO(bArr) : o0OO0oO.o0OoO00O.o00oOoo0(Byte.valueOf(bArr[0])) : o0ooO.INSTANCE;
    }

    @NotNull
    public static final Set<Integer> oooO0oo(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return (Set) oooO0oo0(iArr, new LinkedHashSet(oo0oO0.o00oOoOo(iArr.length)));
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C oooO0oo0(@NotNull int[] iArr, @NotNull C c) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(c, FirebaseAnalytics.Param.DESTINATION);
        for (int i : iArr) {
            c.add(Integer.valueOf(i));
        }
        return c;
    }

    @NotNull
    public static final Set<Long> oooO0ooO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return (Set) oooO0000(jArr, new LinkedHashSet(oo0oO0.o00oOoOo(jArr.length)));
    }

    @NotNull
    public static final double[] oooO0ooo(@NotNull Double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i = 0; i < length; i++) {
            dArr2[i] = dArr[i].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static final short[] oooOO(@NotNull Short[] shArr) {
        o0OOOOO0.o0ooO.o00oo0O0(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = shArr[i].shortValue();
        }
        return sArr;
    }

    @NotNull
    public static final Set<Boolean> oooOO00(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return (Set) oooO000O(zArr, new LinkedHashSet(oo0oO0.o00oOoOo(zArr.length)));
    }

    @NotNull
    public static final Set<Character> oooOO00O(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                int length2 = cArr.length;
                if (length2 > 128) {
                    length2 = 128;
                }
                return (Set) ooOoooO(cArr, new LinkedHashSet(oo0oO0.o00oOoOo(length2)));
            }
            return o0OO0oO0.o00oOo0o(Character.valueOf(cArr[0]));
        }
        return o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Double> oooOO00o(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) ooOoooOO(dArr, new LinkedHashSet(oo0oO0.o00oOoOo(dArr.length))) : o0OO0oO0.o00oOo0o(Double.valueOf(dArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Integer> oooOO0O(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) oooO0oo0(iArr, new LinkedHashSet(oo0oO0.o00oOoOo(iArr.length))) : o0OO0oO0.o00oOo0o(Integer.valueOf(iArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Float> oooOO0O0(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) ooo0oooo(fArr, new LinkedHashSet(oo0oO0.o00oOoOo(fArr.length))) : o0OO0oO0.o00oOo0o(Float.valueOf(fArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Long> oooOO0OO(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) oooO0000(jArr, new LinkedHashSet(oo0oO0.o00oOoOo(jArr.length))) : o0OO0oO0.o00oOo0o(Long.valueOf(jArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final <T> Set<T> oooOO0Oo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) oooO000(tArr, new LinkedHashSet(oo0oO0.o00oOoOo(tArr.length))) : o0OO0oO0.o00oOo0o(tArr[0]) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Short> oooOO0o(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) oooO00o0(sArr, new LinkedHashSet(oo0oO0.o00oOoOo(sArr.length))) : o0OO0oO0.o00oOo0o(Short.valueOf(sArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Byte> oooOO0o0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) ooOoooO0(bArr, new LinkedHashSet(oo0oO0.o00oOoOo(bArr.length))) : o0OO0oO0.o00oOo0o(Byte.valueOf(bArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Boolean> oooOO0oo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) oooO000O(zArr, new LinkedHashSet(oo0oO0.o00oOoOo(zArr.length))) : o0OO0oO0.o00oOo0o(Boolean.valueOf(zArr[0])) : o0O0OO.INSTANCE;
    }

    @NotNull
    public static final Set<Integer> oooOOO(@NotNull int[] iArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Integer> oooO0oo = oooO0oo(iArr);
        o0O00o00.o0O00OOO(oooO0oo, iterable);
        return oooO0oo;
    }

    @NotNull
    public static final Set<Character> oooOOO0(@NotNull char[] cArr, @NotNull Iterable<Character> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Character> oooooO = oooooO(cArr);
        o0O00o00.o0O00OOO(oooooO, iterable);
        return oooooO;
    }

    @NotNull
    public static final Set<Byte> oooOOO00(@NotNull byte[] bArr, @NotNull Iterable<Byte> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Byte> oooO0o0o = oooO0o0o(bArr);
        o0O00o00.o0O00OOO(oooO0o0o, iterable);
        return oooO0o0o;
    }

    @NotNull
    public static final Set<Double> oooOOO0O(@NotNull double[] dArr, @NotNull Iterable<Double> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Double> oooO0o = oooO0o(dArr);
        o0O00o00.o0O00OOO(oooO0o, iterable);
        return oooO0o;
    }

    @NotNull
    public static final Set<Float> oooOOO0o(@NotNull float[] fArr, @NotNull Iterable<Float> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Float> oooO0oO = oooO0oO(fArr);
        o0O00o00.o0O00OOO(oooO0oO, iterable);
        return oooO0oO;
    }

    @NotNull
    public static final <T> Set<T> oooOOOO(@NotNull T[] tArr, @NotNull Iterable<? extends T> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<T> oooO = oooO(tArr);
        o0O00o00.o0O00OOO(oooO, iterable);
        return oooO;
    }

    @NotNull
    public static final Set<Long> oooOOOO0(@NotNull long[] jArr, @NotNull Iterable<Long> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Long> oooO0ooO = oooO0ooO(jArr);
        o0O00o00.o0O00OOO(oooO0ooO, iterable);
        return oooO0ooO;
    }

    @NotNull
    public static final Set<Short> oooOOOOo(@NotNull short[] sArr, @NotNull Iterable<Short> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Short> oooOooOO = oooOooOO(sArr);
        o0O00o00.o0O00OOO(oooOooOO, iterable);
        return oooOooOO;
    }

    @NotNull
    public static final Iterable<o0O0o000<Byte>> oooOOOo(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return new o0O0o00(new o0O000Oo(bArr));
    }

    @NotNull
    public static final Set<Boolean> oooOOOo0(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        Set<Boolean> oooOO00 = oooOO00(zArr);
        o0O00o00.o0O00OOO(oooOO00, iterable);
        return oooOO00;
    }

    @NotNull
    public static final Iterable<o0O0o000<Character>> oooOOOoO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        return new o0O0o00(new o0O00OO(cArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Double>> oooOOOoo(@NotNull double[] dArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        return new o0O0o00(new o0O00O0o(dArr));
    }

    @NotNull
    public static final <T> Iterable<o0O0o000<T>> oooOOo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        return new o0O0o00(new o0OoOoOo(tArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Integer>> oooOOo0(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        return new o0O0o00(new o0O00(iArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Float>> oooOOo00(@NotNull float[] fArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        return new o0O0o00(new o0OoO00O(fArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Long>> oooOOo0o(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        return new o0O0o00(new o0O00O0(jArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Short>> oooOOoO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return new o0O0o00(new o0O000o0(sArr));
    }

    @NotNull
    public static final Iterable<o0O0o000<Boolean>> oooOOoOO(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return new o0O0o00(new o0O00O(zArr));
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Byte, R>> oooOOoOo(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Byte.valueOf(bArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Byte, Byte>> oooOOoo(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr2, "other");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Byte.valueOf(bArr[i]), Byte.valueOf(bArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOOoo0(@NotNull byte[] bArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Byte, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Byte.valueOf(bArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooOOooO(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull o0OOOO.o0O00000<? super Byte, ? super Byte, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Byte.valueOf(bArr[i]), Byte.valueOf(bArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Byte, R>> oooOOooo(@NotNull byte[] bArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            byte b = bArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Byte.valueOf(b), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOo(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Character, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Character.valueOf(cArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Character, R>> oooOo00(@NotNull char[] cArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Character.valueOf(cArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOo000(@NotNull byte[] bArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Byte, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Byte.valueOf(bArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooOoO0(@NotNull char[] cArr, @NotNull char[] cArr2, @NotNull o0OOOO.o0O00000<? super Character, ? super Character, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Character.valueOf(cArr[i]), Character.valueOf(cArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Character, Character>> oooOoO00(@NotNull char[] cArr, @NotNull char[] cArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(cArr2, "other");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Character.valueOf(cArr[i]), Character.valueOf(cArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Character, R>> oooOoO0O(@NotNull char[] cArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            char c = cArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Character.valueOf(c), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOoO0o(@NotNull char[] cArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Character, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Character.valueOf(cArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Double, Double>> oooOoOO(@NotNull double[] dArr, @NotNull double[] dArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(dArr2, "other");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Double.valueOf(dArr[i]), Double.valueOf(dArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOoOO0(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Double, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Double.valueOf(dArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Double, R>> oooOoOOO(@NotNull double[] dArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Double.valueOf(dArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooOoOOo(@NotNull double[] dArr, @NotNull double[] dArr2, @NotNull o0OOOO.o0O00000<? super Double, ? super Double, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(dArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Double.valueOf(dArr[i]), Double.valueOf(dArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Double, R>> oooOoOo(@NotNull double[] dArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            double d = dArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Double.valueOf(d), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOoOoO(@NotNull double[] dArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Double, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Double.valueOf(dArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Float, R>> oooOoOoo(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Float.valueOf(fArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Float, Float>> oooOoo0(@NotNull float[] fArr, @NotNull float[] fArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(fArr2, "other");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Float.valueOf(fArr[i]), Float.valueOf(fArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOoo00(@NotNull float[] fArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Float, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Float.valueOf(fArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooOoo0O(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull o0OOOO.o0O00000<? super Float, ? super Float, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(fArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Float.valueOf(fArr[i]), Float.valueOf(fArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Float, R>> oooOoo0o(@NotNull float[] fArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            float f = fArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Float.valueOf(f), rArr[i]));
        }
        return arrayList;
    }

    @oO0Oo0oo(markerClass = {o0OO0o.o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0OO00o0(version = "1.4")
    public static final <R> List<R> oooOooO(byte[] bArr, R r, o0OOOO.o0O0000O<? super Integer, ? super R, ? super Byte, ? extends R> o0o0000o) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "operation");
        if (bArr.length == 0) {
            return o0OO0oO.o0OoO00O.o00oOoo0(r);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            r = o0o0000o.invoke(Integer.valueOf(i), r, Byte.valueOf(bArr[i]));
            arrayList.add(r);
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOooO0(@NotNull float[] fArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Float, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Float.valueOf(fArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Short> oooOooOO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        return (Set) oooO00o0(sArr, new LinkedHashSet(oo0oO0.o00oOoOo(sArr.length)));
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Integer, R>> oooOooOo(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Integer.valueOf(iArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooOooo(@NotNull int[] iArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Integer, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Integer.valueOf(iArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Integer, Integer>> oooOoooO(@NotNull int[] iArr, @NotNull int[] iArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr2, "other");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooOoooo(@NotNull int[] iArr, @NotNull int[] iArr2, @NotNull o0OOOO.o0O00000<? super Integer, ? super Integer, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> oooo0(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super T, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(tArr[i], obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo00(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Long, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Long.valueOf(jArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> oooo000(@NotNull T[] tArr, @NotNull Iterable<Integer> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "indices");
        int o0O0002 = o0OO0oO.o0O00O.o0O000(iterable, 10);
        if (o0O0002 == 0) {
            return o0ooO.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(o0O0002);
        for (Integer num : iterable) {
            arrayList.add(tArr[num.intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Integer, R>> oooo0000(@NotNull int[] iArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            int i2 = iArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Integer.valueOf(i2), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo000O(@NotNull int[] iArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Integer, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Integer.valueOf(iArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Long, R>> oooo000o(@NotNull long[] jArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Long.valueOf(jArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooo00O0(@NotNull long[] jArr, @NotNull long[] jArr2, @NotNull o0OOOO.o0O00000<? super Long, ? super Long, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(jArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Long.valueOf(jArr[i]), Long.valueOf(jArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Long, R>> oooo00OO(@NotNull long[] jArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            long j = jArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Long.valueOf(j), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo00Oo(@NotNull long[] jArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Long, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Long.valueOf(jArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Long, Long>> oooo00o0(@NotNull long[] jArr, @NotNull long[] jArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(jArr2, "other");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Long.valueOf(jArr[i]), Long.valueOf(jArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<o0OO0o.o0O0o00<T, R>> oooo00oO(@NotNull T[] tArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(tArr[i], r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Short, R>> oooo0O(@NotNull short[] sArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            short s = sArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Short.valueOf(s), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, V> List<V> oooo0O0(@NotNull T[] tArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super T, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<o0OO0o.o0O0o00<T, R>> oooo0O00(@NotNull T[] tArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(tArr[i], rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Short, R>> oooo0O0O(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Short.valueOf(sArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo0O0o(@NotNull short[] sArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Short, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Short.valueOf(sArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo0OO(@NotNull short[] sArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Short, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Short.valueOf(sArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Short, Short>> oooo0OOO(@NotNull short[] sArr, @NotNull short[] sArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(sArr2, "other");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Short.valueOf(sArr[i]), Short.valueOf(sArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooo0OOo(@NotNull short[] sArr, @NotNull short[] sArr2, @NotNull o0OOOO.o0O00000<? super Short, ? super Short, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(sArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Short.valueOf(sArr[i]), Short.valueOf(sArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo0Oo(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable, @NotNull o0OOOO.o0O00000<? super Boolean, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o0o00000.invoke(Boolean.valueOf(zArr[i]), obj));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Boolean, R>> oooo0Oo0(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> iterable) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iterable, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(o0OO0oO.o0O00O.o0O000(iterable, 10), length));
        int i = 0;
        for (R r : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(new o0OO0o.o0O0o00(Boolean.valueOf(zArr[i]), r));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<o0OO0o.o0O0o00<Boolean, R>> oooo0OoO(@NotNull boolean[] zArr, @NotNull R[] rArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            boolean z = zArr[i];
            arrayList.add(new o0OO0o.o0O0o00(Boolean.valueOf(z), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> oooo0Ooo(@NotNull boolean[] zArr, @NotNull R[] rArr, @NotNull o0OOOO.o0O00000<? super Boolean, ? super R, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(rArr, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Boolean.valueOf(zArr[i]), rArr[i]));
        }
        return arrayList;
    }

    @NotNull
    public static final <V> List<V> oooo0o0(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, @NotNull o0OOOO.o0O00000<? super Boolean, ? super Boolean, ? extends V> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(zArr2, "other");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "transform");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(o0o00000.invoke(Boolean.valueOf(zArr[i]), Boolean.valueOf(zArr2[i])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<o0OO0o.o0O0o00<Boolean, Boolean>> oooo0o00(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(zArr2, "other");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new o0OO0o.o0O0o00(Boolean.valueOf(zArr[i]), Boolean.valueOf(zArr2[i])));
        }
        return arrayList;
    }

    @o0OOO0OO.o00oo00O
    public static final short ooooO000(short[] sArr, int i, o0OOOO.o00oo<? super Integer, Short> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O0(sArr)) ? o00ooVar.invoke(Integer.valueOf(i)).shortValue() : sArr[i];
    }

    @o0OO0o.o00oo(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @o0OO0o.o0OO000(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int ooooO0O0(double[] dArr, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(dArr, "<this>");
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (d == dArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> ooooO0oo(@NotNull byte[] bArr, @NotNull o0OOOO.o00oo<? super Byte, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b : bArr) {
            K invoke = o00ooVar.invoke(Byte.valueOf(b));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Byte.valueOf(b));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final int[] ooooOOOO(@NotNull Integer[] numArr) {
        o0OOOOO0.o0ooO.o00oo0O0(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    @NotNull
    public static final HashSet<Boolean> ooooOOOo(@NotNull boolean[] zArr) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        return (HashSet) oooO000O(zArr, new HashSet(oo0oO0.o00oOoOo(zArr.length)));
    }

    @Nullable
    public static final Short ooooOOo0(@NotNull short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "<this>");
        if (i < 0 || i > oOO00O0(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i]);
    }

    @NotNull
    public static final HashSet<Character> ooooOo(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        return (HashSet) ooOoooO(cArr, new HashSet(oo0oO0.o00oOoOo(length)));
    }

    @NotNull
    public static final <K> Map<K, List<Float>> ooooOoOO(@NotNull float[] fArr, @NotNull o0OOOO.o00oo<? super Float, ? extends K> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(fArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f : fArr) {
            K invoke = o00ooVar.invoke(Float.valueOf(f));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = o0OO0oO.o0O000.o00oOOo0(linkedHashMap, invoke);
            }
            ((List) obj).add(Float.valueOf(f));
        }
        return linkedHashMap;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean ooooOoOo(boolean[] zArr, int i, o0OOOO.o00oo<? super Integer, Boolean> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(zArr, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "defaultValue");
        return (i < 0 || i > oOO00O0O(zArr)) ? o00ooVar.invoke(Integer.valueOf(i)).booleanValue() : zArr[i];
    }

    @NotNull
    public static final HashSet<Byte> ooooo0(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        return (HashSet) ooOoooO0(bArr, new HashSet(oo0oO0.o00oOoOo(bArr.length)));
    }

    @NotNull
    public static final Set<Character> oooooO(@NotNull char[] cArr) {
        o0OOOOO0.o0ooO.o00oo0O0(cArr, "<this>");
        int length = cArr.length;
        if (length > 128) {
            length = 128;
        }
        return (Set) ooOoooO(cArr, new LinkedHashSet(oo0oO0.o00oOoOo(length)));
    }

    public static final <T> T oooooOo(@NotNull T[] tArr) {
        o0OOOOO0.o0ooO.o00oo0O0(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
