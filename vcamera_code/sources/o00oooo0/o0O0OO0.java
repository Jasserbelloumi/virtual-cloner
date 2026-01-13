package o00oooo0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0087\b¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "o00oOOo0", o00oOOoO.f12961o00oOo00, "Landroid/net/Uri;", "o00oOo00", "", "o00oOooO", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class o0O0OO0 {
    @o0OOooO0(26)
    @NotNull
    public static final Icon o00oOOo0(@NotNull Bitmap bitmap) {
        o0OOOOO0.o0ooO.o00oo0O0(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        o0OOOOO0.o0ooO.o00oo0OO(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @o0OOooO0(26)
    @NotNull
    public static final Icon o00oOOoO(@NotNull Bitmap bitmap) {
        o0OOOOO0.o0ooO.o00oo0O0(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        o0OOOOO0.o0ooO.o00oo0OO(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @o0OOooO0(26)
    @NotNull
    public static final Icon o00oOo00(@NotNull Uri uri) {
        o0OOOOO0.o0ooO.o00oo0O0(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        o0OOOOO0.o0ooO.o00oo0OO(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @o0OOooO0(26)
    @NotNull
    public static final Icon o00oOooO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        o0OOOOO0.o0ooO.o00oo0OO(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
