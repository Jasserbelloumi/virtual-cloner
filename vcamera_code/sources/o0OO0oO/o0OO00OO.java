package o0OO0oO;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
public class o0OO00OO extends oo0ooO {
    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0OOOo(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        Object obj;
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OOO0OO.o00oo00O
    @o0OO0o.o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ <K, V> Map.Entry<K, V> o0O0OOo(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0ooOOOO(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> o0O0OOoO(Map<? extends K, ? extends V> map, o0OOOO.o00oo<? super Map.Entry<? extends K, ? extends V>, ? extends R> o00ooVar) {
        Object obj;
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R invoke = o00ooVar.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = o00ooVar.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OO0o.o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO0o.o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Map.Entry o0O0OOoo(Map map, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(map, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return (Map.Entry) o0O0oo0o.o0Oo0ooo(map.entrySet(), comparator);
    }
}
