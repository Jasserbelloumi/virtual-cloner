package o0OoO00O;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000oo.o00oo00O;
import o0O000oo.o0O0o00O;
import o0ooOoOO.oO0Ooooo;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f16765o00oOOo0 = "InputConnectionCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f16766o00oOOoO = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f16767o00oOo00 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f16768o00oOo0O = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f16769o00oOo0o = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f16770o00oOoO = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f16771o00oOoO0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f16772o00oOoOO = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f16773o00oOoOo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f16774o00oOoo0 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f16775o00oOooO = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f16776o00oOooo = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f16777o00oo0 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f16778o00oo00O = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f16779o00oo0O = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f16780o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f16781o00oo0OO = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* loaded from: classes.dex */
    public class o00oOOo0 extends InputConnectionWrapper {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f16782o00oOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(InputConnection inputConnection, boolean z, o00oOo0O o00ooo0o2) {
            super(inputConnection, z);
            this.f16782o00oOOo0 = o00ooo0o2;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f16782o00oOOo0.o00oOOo0(oOO00000.o00oOoO0(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends InputConnectionWrapper {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f16783o00oOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(InputConnection inputConnection, boolean z, o00oOo0O o00ooo0o2) {
            super(inputConnection, z);
            this.f16783o00oOOo0 = o00ooo0o2;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (oO.o00oOo0o(str, bundle, this.f16783o00oOOo0)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @o0OOooO0(25)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static boolean o00oOOo0(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O {
        boolean o00oOOo0(@oo0oO0 oOO00000 ooo00000, int i, @o0OO00OO Bundle bundle);
    }

    public static boolean o00oOOoO(@oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo, @oo0oO0 oOO00000 ooo00000, int i, @o0OO00OO Bundle bundle) {
        return o00oOo00.o00oOOo0(inputConnection, (InputContentInfo) ooo00000.o00oOo0o(), i, bundle);
    }

    @oo0oO0
    public static o00oOo0O o00oOo00(@oo0oO0 final View view) {
        view.getClass();
        return new o00oOo0O() { // from class: o0OoO00O.oOo00o00
            @Override // o0OoO00O.oO.o00oOo0O
            public final boolean o00oOOo0(oOO00000 ooo00000, int i, Bundle bundle) {
                return oO.o00oOoO0(view, ooo00000, i, bundle);
            }
        };
    }

    @oo0oO0
    @Deprecated
    public static InputConnection o00oOo0O(@oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo, @oo0oO0 o00oOo0O o00ooo0o2) {
        oO0Ooooo.o00oOo0O(inputConnection, "inputConnection must be non-null");
        oO0Ooooo.o00oOo0O(editorInfo, "editorInfo must be non-null");
        oO0Ooooo.o00oOo0O(o00ooo0o2, "onCommitContentListener must be non-null");
        return new o00oOOo0(inputConnection, false, o00ooo0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean o00oOo0o(@o0OO00OO String str, @o0OO00OO Bundle bundle, @oo0oO0 o00oOo0O o00ooo0o2) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f16766o00oOOoO, str)) {
            z = false;
        } else if (!TextUtils.equals(f16767o00oOo00, str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? f16781o00oo0OO : f16777o00oo0);
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? f16768o00oOo0O : f16775o00oOooO);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? f16771o00oOoO0 : f16769o00oOo0o);
                Uri uri2 = (Uri) bundle.getParcelable(z ? f16772o00oOoOO : f16770o00oOoO);
                int i = bundle.getInt(z ? f16778o00oo00O : f16776o00oOooo);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? f16774o00oOoo0 : f16773o00oOoOo);
                if (uri != null && clipDescription != null) {
                    r0 = o00ooo0o2.o00oOOo0(new oOO00000(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r0, null);
                }
                return r0;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    public static boolean o00oOoO0(View view, oOO00000 ooo00000, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                ooo00000.o00oOo0O();
                InputContentInfo inputContentInfo = (InputContentInfo) ooo00000.o00oOo0o();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f16779o00oo0O, inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        o00oo00O.o00oOOoO o00ooooo2 = new o00oo00O.o00oOOoO(new ClipData(ooo00000.o00oOOoO(), new ClipData.Item(ooo00000.o00oOOo0())), 2);
        o00ooooo2.f10442o00oOOo0.o00oOOoO(ooo00000.o00oOo00());
        o00ooooo2.f10442o00oOOo0.setExtras(bundle);
        return o0O0o00O.o0oOo0O0(view, o00ooooo2.o00oOOo0()) == null;
    }

    @oo0oO0
    public static InputConnection o00oOooO(@oo0oO0 View view, @oo0oO0 InputConnection inputConnection, @oo0oO0 EditorInfo editorInfo) {
        return o00oOo0O(inputConnection, editorInfo, o00oOo00(view));
    }
}
