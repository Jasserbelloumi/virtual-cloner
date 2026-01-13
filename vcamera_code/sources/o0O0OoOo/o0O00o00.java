package o0O0OoOo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J,\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0082\u0002¢\u0006\u0004\b \u0010!J,\u0010\"\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0082\u0002¢\u0006\u0004\b\"\u0010!¨\u0006%"}, d2 = {"Lo0O0OoOo/o0O00o00;", "", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Lo0O0OoOo/o0O0OOO;", "o00oOoO", "", "Lo0O0OoOo/o0O0OOOo;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "o00oo00O", "Landroid/content/Intent;", "o00oOoo0", "Lo0O0OoOo/o0O0o000;", "splitRule", "Landroid/view/WindowMetrics;", "o00oo0o0", "Lo0O0OoOo/o0O00;", "activityFilters", "o00oo0OO", "o00oo0O", "Lo0O0OoOo/o0O0oo0o;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "o00oOoOO", "splitInfo", "o00oOoOo", "F", "S", "o00oOo0o", "(Landroid/util/Pair;)Ljava/lang/Object;", "o00oOoO0", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O00o00 {
    public static final boolean o00oOooo(o0O00o00 o0o00o00, Set set, Pair pair) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(set, "$splitPairFilters");
        o0OOOOO0.o0ooO.o00oo0OO(pair, "(first, second)");
        Activity activity = (Activity) o0o00o00.o00oOo0o(pair);
        Intent intent = (Intent) o0o00o00.o00oOoO0(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((o0O0OOOo) it.next()).o00oOooO(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o00oo0(o0O00o00 o0o00o00, Set set, Pair pair) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "this$0");
        o0OOOOO0.o0ooO.o00oo0O0(set, "$splitPairFilters");
        o0OOOOO0.o0ooO.o00oo0OO(pair, "(first, second)");
        Activity activity = (Activity) o0o00o00.o00oOo0o(pair);
        Activity activity2 = (Activity) o0o00o00.o00oOoO0(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((o0O0OOOo) it.next()).o00oOo0O(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o00oo0O0(Set set, Activity activity) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            o0OOOOO0.o0ooO.o00oo0OO(activity, "activity");
            if (((o0O00) it.next()).o00oOo00(activity)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o00oo0Oo(Set set, Intent intent) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            o0OOOOO0.o0ooO.o00oo0OO(intent, "intent");
            if (((o0O00) it.next()).o00oOooO(intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o00oo0o(o0O0o000 o0o0o000, WindowMetrics windowMetrics) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "$splitRule");
        o0OOOOO0.o0ooO.o00oo0OO(windowMetrics, "windowMetrics");
        return o0o0o000.o00oOOo0(windowMetrics);
    }

    public final <F, S> F o00oOo0o(Pair<F, S> pair) {
        o0OOOOO0.o0ooO.o00oo0O0(pair, "<this>");
        return (F) pair.first;
    }

    @NotNull
    public final List<o0O0OOO> o00oOoO(@NotNull List<? extends SplitInfo> list) {
        o0OOOOO0.o0ooO.o00oo0O0(list, "splitInfoList");
        ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(list, 10));
        for (SplitInfo splitInfo : list) {
            arrayList.add(o00oOoOo(splitInfo));
        }
        return arrayList;
    }

    public final <F, S> S o00oOoO0(Pair<F, S> pair) {
        o0OOOOO0.o0ooO.o00oo0O0(pair, "<this>");
        return (S) pair.second;
    }

    @NotNull
    public final Set<EmbeddingRule> o00oOoOO(@NotNull Set<? extends o0O0oo0o> set) {
        SplitPairRule build;
        String str;
        o0OOOOO0.o0ooO.o00oo0O0(set, "rules");
        ArrayList arrayList = new ArrayList(o0OO0oO.o0O00O.o0O000(set, 10));
        for (o0O0oo0o o0o0oo0o : set) {
            if (o0o0oo0o instanceof o0OooO0) {
                o0OooO0 o0oooo0 = (o0OooO0) o0o0oo0o;
                build = new SplitPairRule.Builder(o00oo00O(o0oooo0.o00oOoO0()), o00oOoo0(o0oooo0.o00oOoO0()), o00oo0o0((o0O0o000) o0o0oo0o)).setSplitRatio(o0oooo0.o00oOo0O()).setLayoutDirection(o0oooo0.o00oOOoO()).setShouldFinishPrimaryWithSecondary(o0oooo0.o00oOoO()).setShouldFinishSecondaryWithPrimary(o0oooo0.o00oOoOO()).setShouldClearTop(o0oooo0.o00oOo0o()).build();
                str = "SplitPairRuleBuilder(\n  …                 .build()";
            } else if (o0o0oo0o instanceof oo0OOoo) {
                oo0OOoo oo0oooo = (oo0OOoo) o0o0oo0o;
                build = new SplitPlaceholderRule.Builder(oo0oooo.o00oOoO0(), o00oo0OO(oo0oooo.o00oOo0o()), o00oo0O(oo0oooo.o00oOo0o()), o00oo0o0((o0O0o000) o0o0oo0o)).setSplitRatio(oo0oooo.o00oOo0O()).setLayoutDirection(oo0oooo.o00oOOoO()).build();
                str = "SplitPlaceholderRuleBuil…                 .build()";
            } else if (!(o0o0oo0o instanceof o0O00O0)) {
                throw new IllegalArgumentException("Unsupported rule type");
            } else {
                o0O00O0 o0o00o0 = (o0O00O0) o0o0oo0o;
                build = new ActivityRule.Builder(o00oo0OO(o0o00o0.o00oOOoO()), o00oo0O(o0o00o0.o00oOOoO())).setShouldAlwaysExpand(o0o00o0.o00oOOo0()).build();
                str = "ActivityRuleBuilder(\n   …                 .build()";
            }
            o0OOOOO0.o0ooO.o00oo0OO(build, str);
            arrayList.add((EmbeddingRule) build);
        }
        return o0OO0oO.o0O0oo0o.o0o00oo0(arrayList);
    }

    public final o0O0OOO o00oOoOo(SplitInfo splitInfo) {
        boolean z;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        o0OOOOO0.o0ooO.o00oo0OO(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        o0OOOOO0.o0ooO.o00oo0OO(activities, "primaryActivityStack.activities");
        o0OoO00O o0ooo00o = new o0OoO00O(activities, z);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        o0OOOOO0.o0ooO.o00oo0OO(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        o0OOOOO0.o0ooO.o00oo0OO(activities2, "secondaryActivityStack.activities");
        return new o0O0OOO(o0ooo00o, new o0OoO00O(activities2, z2), splitInfo.getSplitRatio());
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> o00oOoo0(@NotNull final Set<o0O0OOOo> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "splitPairFilters");
        return new Predicate() { // from class: o0O0OoOo.o0O00O0o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o0O00o00.o00oOooo(o0O00o00.this, set, (Pair) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> o00oo00O(@NotNull final Set<o0O0OOOo> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "splitPairFilters");
        return new Predicate() { // from class: o0O0OoOo.o0oO0Ooo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o0O00o00.o00oo0(o0O00o00.this, set, (Pair) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> o00oo0O(@NotNull final Set<o0O00> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "activityFilters");
        return new Predicate() { // from class: o0O0OoOo.o0O00OOO
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o0O00o00.o00oo0Oo(set, (Intent) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> o00oo0OO(@NotNull final Set<o0O00> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "activityFilters");
        return new Predicate() { // from class: o0O0OoOo.o0O00O
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o0O00o00.o00oo0O0(set, (Activity) obj);
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> o00oo0o0(@NotNull final o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "splitRule");
        return new Predicate() { // from class: o0O0OoOo.o0O00OO
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return o0O00o00.o00oo0o(o0O0o000.this, (WindowMetrics) obj);
            }
        };
    }
}
