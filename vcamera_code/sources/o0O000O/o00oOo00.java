package o0O000O;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10286o00oOOo0 = "tree";

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f10287o00oOOo0 = 512;
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Uri o00oOOo0(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @o0O0O0Oo
        public static String o00oOo00(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @o0O0O0Oo
        public static boolean o00oOooO(Context context, @o0OO00OO Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @o0OOooO0(21)
    /* renamed from: o0O000O.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126o00oOo00 {
        @o0O0O0Oo
        public static Uri o00oOOo0(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @o0O0O0Oo
        public static Uri o00oOOoO(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @o0O0O0Oo
        public static Uri o00oOo00(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @o0O0O0Oo
        public static Uri o00oOo0O(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @o0O0O0Oo
        public static String o00oOo0o(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @o0O0O0Oo
        public static Uri o00oOoO0(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri, @oo0oO0 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }

        @o0O0O0Oo
        public static Uri o00oOooO(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static boolean o00oOOo0(@oo0oO0 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @o0OO00OO
    public static Uri o00oOOo0(@oo0oO0 String str, @o0OO00OO String str2) {
        return C0126o00oOo00.o00oOOo0(str, str2);
    }

    @o0OO00OO
    public static Uri o00oOOoO(@oo0oO0 Uri uri, @oo0oO0 String str) {
        return C0126o00oOo00.o00oOOoO(uri, str);
    }

    @o0OO00OO
    public static Uri o00oOo00(@oo0oO0 String str, @oo0oO0 String str2) {
        return o00oOOoO.o00oOOo0(str, str2);
    }

    @o0OO00OO
    public static Uri o00oOo0O(@oo0oO0 String str, @oo0oO0 String str2) {
        return C0126o00oOo00.o00oOooO(str, str2);
    }

    @o0OO00OO
    public static Uri o00oOo0o(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri, @oo0oO0 String str, @oo0oO0 String str2) throws FileNotFoundException {
        return C0126o00oOo00.o00oOo0O(contentResolver, uri, str, str2);
    }

    @o0OO00OO
    public static String o00oOoO(@oo0oO0 Uri uri) {
        return C0126o00oOo00.o00oOo0o(uri);
    }

    @o0OO00OO
    public static String o00oOoO0(@oo0oO0 Uri uri) {
        return o00oOOoO.o00oOo00(uri);
    }

    public static boolean o00oOoOO(@oo0oO0 Context context, @o0OO00OO Uri uri) {
        return o00oOOoO.o00oOooO(context, uri);
    }

    public static boolean o00oOoOo(@oo0oO0 Uri uri) {
        return o00oOo0O.o00oOOo0(uri);
    }

    public static boolean o00oOoo0(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri, @oo0oO0 Uri uri2) throws FileNotFoundException {
        return o00oOo0O.o00oOOoO(contentResolver, uri, uri2);
    }

    @o0OO00OO
    public static Uri o00oOooO(@oo0oO0 Uri uri, @oo0oO0 String str) {
        return C0126o00oOo00.o00oOo00(uri, str);
    }

    @o0OO00OO
    public static Uri o00oOooo(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri, @oo0oO0 String str) throws FileNotFoundException {
        return C0126o00oOo00.o00oOoO0(contentResolver, uri, str);
    }
}
