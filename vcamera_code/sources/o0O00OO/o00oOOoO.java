package o0O00OO;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
public class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10904o00oOOo0 = "DocumentFile";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10905o00oOOoO = 512;

    public static boolean o00oOOo0(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(o00oOoO0(context, uri));
    }

    public static boolean o00oOOoO(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String o00oOoO02 = o00oOoO0(context, uri);
        int o00oo02 = o00oo0(context, uri, "flags", 0);
        if (TextUtils.isEmpty(o00oOoO02)) {
            return false;
        }
        if ((o00oo02 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(o00oOoO02) || (o00oo02 & 8) == 0) {
            return (TextUtils.isEmpty(o00oOoO02) || (o00oo02 & 2) == 0) ? false : true;
        }
        return true;
    }

    public static void o00oOo00(@o0OO00OO AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long o00oOo0O(Context context, Uri uri) {
        return o00oo0OO(context, uri, "flags", 0L);
    }

    @o0OO00OO
    public static String o00oOo0o(Context context, Uri uri) {
        return o00oo0O0(context, uri, "_display_name", null);
    }

    @o0OO00OO
    public static String o00oOoO(Context context, Uri uri) {
        String o00oOoO02 = o00oOoO0(context, uri);
        if ("vnd.android.document/directory".equals(o00oOoO02)) {
            return null;
        }
        return o00oOoO02;
    }

    @o0OO00OO
    public static String o00oOoO0(Context context, Uri uri) {
        return o00oo0O0(context, uri, "mime_type", null);
    }

    public static boolean o00oOoOO(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(o00oOoO0(context, uri));
    }

    public static boolean o00oOoOo(Context context, Uri uri) {
        String o00oOoO02 = o00oOoO0(context, uri);
        return ("vnd.android.document/directory".equals(o00oOoO02) || TextUtils.isEmpty(o00oOoO02)) ? false : true;
    }

    public static boolean o00oOoo0(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (o00oOo0O(context, uri) & 512) != 0;
    }

    public static boolean o00oOooO(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e) {
            e.toString();
            return false;
        } finally {
            o00oOo00(cursor);
        }
    }

    public static long o00oOooo(Context context, Uri uri) {
        return o00oo0OO(context, uri, "last_modified", 0L);
    }

    public static int o00oo0(Context context, Uri uri, String str, int i) {
        return (int) o00oo0OO(context, uri, str, i);
    }

    public static long o00oo00O(Context context, Uri uri) {
        return o00oo0OO(context, uri, "_size", 0L);
    }

    @o0OO00OO
    public static String o00oo0O0(Context context, Uri uri, String str, @o0OO00OO String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e) {
            e.toString();
            return str2;
        } finally {
            o00oOo00(cursor);
        }
    }

    public static long o00oo0OO(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j : cursor.getLong(0);
        } catch (Exception e) {
            e.toString();
            return j;
        } finally {
            o00oOo00(cursor);
        }
    }
}
