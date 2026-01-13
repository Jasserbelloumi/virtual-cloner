package org.videolan.libvlc;

import android.os.Handler;
import android.os.Looper;
import o00oOooO.o0O;
import org.videolan.libvlc.interfaces.ILibVLC;
/* loaded from: classes3.dex */
public abstract class Dialog {
    public static final int TYPE_ERROR = 0;
    public static final int TYPE_LOGIN = 1;
    public static final int TYPE_PROGRESS = 3;
    public static final int TYPE_QUESTION = 2;
    private static Callbacks sCallbacks;
    private static Handler sHandler;
    private Object mContext;
    public String mText;
    private final String mTitle;
    public final int mType;

    /* loaded from: classes3.dex */
    public interface Callbacks {
        @o0O
        void onCanceled(Dialog dialog);

        @o0O
        void onDisplay(ErrorMessage errorMessage);

        @o0O
        void onDisplay(LoginDialog loginDialog);

        @o0O
        void onDisplay(ProgressDialog progressDialog);

        @o0O
        void onDisplay(QuestionDialog questionDialog);

        @o0O
        void onProgressUpdate(ProgressDialog progressDialog);
    }

    /* loaded from: classes3.dex */
    public static class ErrorMessage extends Dialog {
        private ErrorMessage(String str, String str2) {
            super(0, str, str2);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class IdDialog extends Dialog {
        public long mId;

        public IdDialog(long j, int i, String str, String str2) {
            super(i, str, str2);
            this.mId = j;
        }

        private native void nativeDismiss(long j);

        @Override // org.videolan.libvlc.Dialog
        @o0O
        public void dismiss() {
            long j = this.mId;
            if (j != 0) {
                nativeDismiss(j);
                this.mId = 0L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class LoginDialog extends IdDialog {
        private final boolean mAskStore;
        private final String mDefaultUsername;

        private LoginDialog(long j, String str, String str2, String str3, boolean z) {
            super(j, 1, str, str2);
            this.mDefaultUsername = str3;
            this.mAskStore = z;
        }

        private native void nativePostLogin(long j, String str, String str2, boolean z);

        @o0O
        public boolean asksStore() {
            return this.mAskStore;
        }

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @o0O
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        @o0O
        public String getDefaultUsername() {
            return this.mDefaultUsername;
        }

        @o0O
        public void postLogin(String str, String str2, boolean z) {
            long j = this.mId;
            if (j != 0) {
                nativePostLogin(j, str, str2, z);
                this.mId = 0L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ProgressDialog extends IdDialog {
        private final String mCancelText;
        private final boolean mIndeterminate;
        private float mPosition;

        private ProgressDialog(long j, String str, String str2, boolean z, float f, String str3) {
            super(j, 3, str, str2);
            this.mIndeterminate = z;
            this.mPosition = f;
            this.mCancelText = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update(float f, String str) {
            this.mPosition = f;
            this.mText = str;
        }

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @o0O
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        @o0O
        public String getCancelText() {
            return this.mCancelText;
        }

        @o0O
        public float getPosition() {
            return this.mPosition;
        }

        @o0O
        public boolean isCancelable() {
            return this.mCancelText != null;
        }

        @o0O
        public boolean isIndeterminate() {
            return this.mIndeterminate;
        }
    }

    /* loaded from: classes3.dex */
    public static class QuestionDialog extends IdDialog {
        public static final int TYPE_ERROR = 2;
        public static final int TYPE_NORMAL = 0;
        public static final int TYPE_WARNING = 1;
        private final String mAction1Text;
        private final String mAction2Text;
        private final String mCancelText;
        private final int mQuestionType;

        private QuestionDialog(long j, String str, String str2, int i, String str3, String str4, String str5) {
            super(j, 2, str, str2);
            this.mQuestionType = i;
            this.mCancelText = str3;
            this.mAction1Text = str4;
            this.mAction2Text = str5;
        }

        private native void nativePostAction(long j, int i);

        @Override // org.videolan.libvlc.Dialog.IdDialog, org.videolan.libvlc.Dialog
        @o0O
        public /* bridge */ /* synthetic */ void dismiss() {
            super.dismiss();
        }

        @o0O
        public String getAction1Text() {
            return this.mAction1Text;
        }

        @o0O
        public String getAction2Text() {
            return this.mAction2Text;
        }

        @o0O
        public String getCancelText() {
            return this.mCancelText;
        }

        @o0O
        public int getQuestionType() {
            return this.mQuestionType;
        }

        @o0O
        public void postAction(int i) {
            long j = this.mId;
            if (j != 0) {
                nativePostAction(j, i);
                this.mId = 0L;
            }
        }
    }

    public Dialog(int i, String str, String str2) {
        this.mType = i;
        this.mTitle = str;
        this.mText = str2;
    }

    private static void cancelFromNative(Dialog dialog) {
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.5
            @Override // java.lang.Runnable
            public void run() {
                Dialog dialog2 = Dialog.this;
                if (dialog2 instanceof IdDialog) {
                    ((IdDialog) dialog2).dismiss();
                }
                if (Dialog.sCallbacks == null || Dialog.this == null) {
                    return;
                }
                Dialog.sCallbacks.onCanceled(Dialog.this);
            }
        });
    }

    private static void displayErrorFromNative(String str, String str2) {
        final ErrorMessage errorMessage = new ErrorMessage(str, str2);
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.1
            @Override // java.lang.Runnable
            public void run() {
                if (Dialog.sCallbacks != null) {
                    Dialog.sCallbacks.onDisplay(ErrorMessage.this);
                }
            }
        });
    }

    private static Dialog displayLoginFromNative(long j, String str, String str2, String str3, boolean z) {
        final LoginDialog loginDialog = new LoginDialog(j, str, str2, str3, z);
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.2
            @Override // java.lang.Runnable
            public void run() {
                if (Dialog.sCallbacks != null) {
                    Dialog.sCallbacks.onDisplay(LoginDialog.this);
                }
            }
        });
        return loginDialog;
    }

    private static Dialog displayProgressFromNative(long j, String str, String str2, boolean z, float f, String str3) {
        final ProgressDialog progressDialog = new ProgressDialog(j, str, str2, z, f, str3);
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.4
            @Override // java.lang.Runnable
            public void run() {
                if (Dialog.sCallbacks != null) {
                    Dialog.sCallbacks.onDisplay(ProgressDialog.this);
                }
            }
        });
        return progressDialog;
    }

    private static Dialog displayQuestionFromNative(long j, String str, String str2, int i, String str3, String str4, String str5) {
        final QuestionDialog questionDialog = new QuestionDialog(j, str, str2, i, str3, str4, str5);
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.3
            @Override // java.lang.Runnable
            public void run() {
                if (Dialog.sCallbacks != null) {
                    Dialog.sCallbacks.onDisplay(QuestionDialog.this);
                }
            }
        });
        return questionDialog;
    }

    private static native void nativeSetCallbacks(ILibVLC iLibVLC, boolean z);

    @o0O
    public static void setCallbacks(ILibVLC iLibVLC, Callbacks callbacks) {
        if (callbacks != null && sHandler == null) {
            sHandler = new Handler(Looper.getMainLooper());
        }
        sCallbacks = callbacks;
        nativeSetCallbacks(iLibVLC, callbacks != null);
    }

    private static void updateProgressFromNative(Dialog dialog, final float f, final String str) {
        sHandler.post(new Runnable() { // from class: org.videolan.libvlc.Dialog.6
            @Override // java.lang.Runnable
            public void run() {
                if (Dialog.this.getType() != 3) {
                    throw new IllegalArgumentException("dialog is not a progress dialog");
                }
                ProgressDialog progressDialog = (ProgressDialog) Dialog.this;
                progressDialog.update(f, str);
                if (Dialog.sCallbacks != null) {
                    Dialog.sCallbacks.onProgressUpdate(progressDialog);
                }
            }
        });
    }

    @o0O
    public void dismiss() {
    }

    @o0O
    public Object getContext() {
        return this.mContext;
    }

    @o0O
    public String getText() {
        return this.mText;
    }

    @o0O
    public String getTitle() {
        return this.mTitle;
    }

    @o0O
    public int getType() {
        return this.mType;
    }

    @o0O
    public void setContext(Object obj) {
        this.mContext = obj;
    }
}
