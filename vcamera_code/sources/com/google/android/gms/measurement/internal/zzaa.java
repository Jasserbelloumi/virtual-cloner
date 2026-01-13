package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzu.zzb(zzuVar).get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:504|(1:506)(1:508)|507)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:464|(6:465|466|467|468|469|(1:472)(1:471))|473)|44|(1:46)(6:274|(11:276|277|278|279|280|(3:(3:282|(1:284)|285)|287|288)(1:450)|289|290|(3:385|(6:388|(1:447)(2:392|(4:398|399|(7:401|(4:404|(2:406|407)(1:409)|408|402)|410|411|(4:414|(3:416|417|418)(1:420)|419|412)|421|422)(6:426|(4:429|(2:431|432)(1:434)|433|427)|435|436|(4:439|(2:441|442)(1:444)|443|437)|445)|423)(4:394|395|396|397))|424|425|397|386)|449)|292|293)(1:463)|294|(10:297|(3:301|(4:304|(5:306|307|(1:309)(1:313)|310|311)(1:314)|312|302)|315)|316|(3:320|(4:323|(3:328|329|330)|331|321)|334)|335|(3:337|(6:340|(2:342|(3:344|345|346))(1:349)|347|348|346|338)|350)|351|(3:360|(8:363|(1:365)|366|(1:368)|369|(3:371|372|373)(1:375)|374|361)|376)|377|295)|383|384)|47|(3:175|(4:178|(10:180|181|(1:183)(1:271)|184|(9:186|187|188|189|190|191|192|193|(3:(12:195|196|197|198|199|200|201|202|(2:245|246)(1:204)|205|206|(1:209)(1:208))|210|211)(4:252|253|244|211))(1:270)|212|(4:215|(3:233|234|235)(4:217|218|(2:219|(2:221|(1:223)(2:224|225))(1:232))|(3:227|228|229)(1:231))|230|213)|236|237|238)(1:272)|239|176)|273)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:512|513))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7))(2:527|528))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:504|(1:506)(1:508)|507)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:464|(6:465|466|467|468|469|(1:472)(1:471))|473)|44|(1:46)(6:274|(11:276|277|278|279|280|(3:(3:282|(1:284)|285)|287|288)(1:450)|289|290|(3:385|(6:388|(1:447)(2:392|(4:398|399|(7:401|(4:404|(2:406|407)(1:409)|408|402)|410|411|(4:414|(3:416|417|418)(1:420)|419|412)|421|422)(6:426|(4:429|(2:431|432)(1:434)|433|427)|435|436|(4:439|(2:441|442)(1:444)|443|437)|445)|423)(4:394|395|396|397))|424|425|397|386)|449)|292|293)(1:463)|294|(10:297|(3:301|(4:304|(5:306|307|(1:309)(1:313)|310|311)(1:314)|312|302)|315)|316|(3:320|(4:323|(3:328|329|330)|331|321)|334)|335|(3:337|(6:340|(2:342|(3:344|345|346))(1:349)|347|348|346|338)|350)|351|(3:360|(8:363|(1:365)|366|(1:368)|369|(3:371|372|373)(1:375)|374|361)|376)|377|295)|383|384)|47|(3:175|(4:178|(10:180|181|(1:183)(1:271)|184|(9:186|187|188|189|190|191|192|193|(3:(12:195|196|197|198|199|200|201|202|(2:245|246)(1:204)|205|206|(1:209)(1:208))|210|211)(4:252|253|244|211))(1:270)|212|(4:215|(3:233|234|235)(4:217|218|(2:219|(2:221|(1:223)(2:224|225))(1:232))|(3:227|228|229)(1:231))|230|213)|236|237|238)(1:272)|239|176)|273)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:512|513))|526|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e8, code lost:
        if (r5 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x07ae, code lost:
        if (r5 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0951, code lost:
        if (r13 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0a7f, code lost:
        if (r7 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
        if (r5 == null) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0221, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0222, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0225, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0226, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0229, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x022a, code lost:
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af A[Catch: SQLiteException -> 0x0221, all -> 0x0b40, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0221, blocks: (B:57:0x01a9, B:59:0x01af, B:61:0x01bd, B:62:0x01c2, B:63:0x01cc, B:64:0x01dc, B:66:0x01eb), top: B:422:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd A[Catch: SQLiteException -> 0x0221, all -> 0x0b40, TRY_ENTER, TryCatch #3 {SQLiteException -> 0x0221, blocks: (B:57:0x01a9, B:59:0x01af, B:61:0x01bd, B:62:0x01c2, B:63:0x01cc, B:64:0x01dc, B:66:0x01eb), top: B:422:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @o00oOooO.oO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            Method dump skipped, instructions count: 2888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
