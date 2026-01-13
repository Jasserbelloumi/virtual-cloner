package o0Oo0o00;
/* loaded from: classes3.dex */
public final class o00oo0O {
    public static boolean o00oOOo0(String str) {
        return str.equals(o00oo0o0.o00oo0.f7538o00oOoOo) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean o00oOOoO(String str) {
        return o00oOo0O(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }

    public static boolean o00oOo00(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean o00oOo0O(String str) {
        return str.equals(o00oo0o0.o00oo0.f7538o00oOoOo) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean o00oOooO(String str) {
        return str.equals("PROPFIND");
    }
}
