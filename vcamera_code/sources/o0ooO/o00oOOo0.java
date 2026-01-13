package o0ooO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f17008o00oOoO = 3500;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f17009o00oOoO0 = "PrintHelper";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final boolean f17010o00oOoOO = true;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final boolean f17011o00oOoOo = true;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f17012o00oOoo0 = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f17013o00oOooo = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f17014o00oo0 = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f17015o00oo00O = 1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f17016o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f17017o00oo0OO = 1;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f17018o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public BitmapFactory.Options f17019o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Object f17020o00oOo00 = new Object();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f17023o00oOooO = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f17021o00oOo0O = 2;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f17022o00oOo0o = 1;

    /* renamed from: o0ooO.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class AsyncTaskC0222o00oOOo0 extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f17024o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f17025o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ Bitmap f17026o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final /* synthetic */ int f17027o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f17028o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f17030o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f17031o00oOooO;

        public AsyncTaskC0222o00oOOo0(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f17024o00oOOo0 = cancellationSignal;
            this.f17025o00oOOoO = printAttributes;
            this.f17026o00oOo00 = bitmap;
            this.f17031o00oOooO = printAttributes2;
            this.f17027o00oOo0O = i;
            this.f17028o00oOo0o = parcelFileDescriptor;
            this.f17030o00oOoO0 = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOo0 */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f17024o00oOOo0.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(o00oOOo0.this.f17018o00oOOo0, this.f17025o00oOOoO);
                Bitmap o00oOOo02 = o00oOOo0.o00oOOo0(this.f17026o00oOo00, this.f17025o00oOOoO.getColorMode());
                if (this.f17024o00oOOo0.isCanceled()) {
                    return null;
                }
                PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                boolean z = o00oOOo0.f17011o00oOoOo;
                if (z) {
                    rectF = new RectF(startPage.getInfo().getContentRect());
                } else {
                    PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(o00oOOo0.this.f17018o00oOOo0, this.f17031o00oOooO);
                    PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                    RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                    printedPdfDocument2.finishPage(startPage2);
                    printedPdfDocument2.close();
                    rectF = rectF2;
                }
                Matrix o00oOooO2 = o00oOOo0.o00oOooO(o00oOOo02.getWidth(), o00oOOo02.getHeight(), rectF, this.f17027o00oOo0O);
                if (!z) {
                    o00oOooO2.postTranslate(rectF.left, rectF.top);
                    startPage.getCanvas().clipRect(rectF);
                }
                startPage.getCanvas().drawBitmap(o00oOOo02, o00oOooO2, null);
                printedPdfDocument.finishPage(startPage);
                if (this.f17024o00oOOo0.isCanceled()) {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f17028o00oOo0o;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (o00oOOo02 != this.f17026o00oOo00) {
                        o00oOOo02.recycle();
                    }
                    return null;
                }
                printedPdfDocument.writeTo(new FileOutputStream(this.f17028o00oOo0o.getFileDescriptor()));
                printedPdfDocument.close();
                ParcelFileDescriptor parcelFileDescriptor2 = this.f17028o00oOo0o;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (o00oOOo02 != this.f17026o00oOo00) {
                    o00oOOo02.recycle();
                }
                return null;
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: o00oOOoO */
        public void onPostExecute(Throwable th) {
            if (this.f17024o00oOOo0.isCanceled()) {
                this.f17030o00oOoO0.onWriteCancelled();
            } else if (th == null) {
                this.f17030o00oOoO0.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f17030o00oOoO0.onWriteFailed(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void onFinish();
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public class o00oOo00 extends PrintDocumentAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f17032o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f17033o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Bitmap f17034o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public PrintAttributes f17035o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o00oOOoO f17037o00oOooO;

        public o00oOo00(String str, int i, Bitmap bitmap, o00oOOoO o00ooooo2) {
            this.f17032o00oOOo0 = str;
            this.f17033o00oOOoO = i;
            this.f17034o00oOo00 = bitmap;
            this.f17037o00oOooO = o00ooooo2;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            o00oOOoO o00ooooo2 = this.f17037o00oOooO;
            if (o00ooooo2 != null) {
                o00ooooo2.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f17035o00oOo0O = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f17032o00oOOo0).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            o00oOOo0.this.o00oo0Oo(this.f17035o00oOo0O, this.f17033o00oOOoO, this.f17034o00oOo00, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public class o00oOo0O extends PrintDocumentAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f17038o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Uri f17039o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOOoO f17040o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public PrintAttributes f17041o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f17042o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public Bitmap f17044o00oOoO0 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int f17045o00oOooO;

        /* renamed from: o0ooO.o00oOOo0$o00oOo0O$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class AsyncTaskC0223o00oOOo0 extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f17046o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f17047o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f17048o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f17050o00oOooO;

            /* renamed from: o0ooO.o00oOOo0$o00oOo0O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0224o00oOOo0 implements CancellationSignal.OnCancelListener {
                public C0224o00oOOo0() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    o00oOo0O.this.o00oOOo0();
                    AsyncTaskC0223o00oOOo0.this.cancel(false);
                }
            }

            public AsyncTaskC0223o00oOOo0(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f17046o00oOOo0 = cancellationSignal;
                this.f17047o00oOOoO = printAttributes;
                this.f17048o00oOo00 = printAttributes2;
                this.f17050o00oOooO = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* renamed from: o00oOOo0 */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    o00oOo0O o00ooo0o2 = o00oOo0O.this;
                    return o00oOOo0.this.o00oOoOO(o00ooo0o2.f17039o00oOOoO);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: o00oOOoO */
            public void onCancelled(Bitmap bitmap) {
                this.f17050o00oOooO.onLayoutCancelled();
                o00oOo0O.this.f17042o00oOo0o = null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: o00oOo00 */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!o00oOOo0.f17010o00oOoOO || o00oOOo0.this.f17022o00oOo0o == 0)) {
                    synchronized (this) {
                        mediaSize = o00oOo0O.this.f17041o00oOo0O.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != o00oOOo0.o00oOoO0(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                o00oOo0O.this.f17044o00oOoO0 = bitmap;
                if (bitmap != null) {
                    this.f17050o00oOooO.onLayoutFinished(new PrintDocumentInfo.Builder(o00oOo0O.this.f17038o00oOOo0).setContentType(1).setPageCount(1).build(), true ^ this.f17047o00oOOoO.equals(this.f17048o00oOo00));
                } else {
                    this.f17050o00oOooO.onLayoutFailed(null);
                }
                o00oOo0O.this.f17042o00oOo0o = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f17046o00oOOo0.setOnCancelListener(new C0224o00oOOo0());
            }
        }

        public o00oOo0O(String str, Uri uri, o00oOOoO o00ooooo2, int i) {
            this.f17038o00oOOo0 = str;
            this.f17039o00oOOoO = uri;
            this.f17040o00oOo00 = o00ooooo2;
            this.f17045o00oOooO = i;
        }

        public void o00oOOo0() {
            synchronized (o00oOOo0.this.f17020o00oOo00) {
                o00oOOo0 o00oooo02 = o00oOOo0.this;
                if (o00oooo02.f17019o00oOOoO != null) {
                    o00oooo02.f17019o00oOOoO = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            o00oOOo0();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f17042o00oOo0o;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            o00oOOoO o00ooooo2 = this.f17040o00oOo00;
            if (o00ooooo2 != null) {
                o00ooooo2.onFinish();
            }
            Bitmap bitmap = this.f17044o00oOoO0;
            if (bitmap != null) {
                bitmap.recycle();
                this.f17044o00oOoO0 = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f17041o00oOo0O = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f17044o00oOoO0 != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f17038o00oOOo0).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f17042o00oOo0o = new AsyncTaskC0223o00oOOo0(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            o00oOOo0.this.o00oo0Oo(this.f17041o00oOo0O, this.f17045o00oOooO, this.f17044o00oOoO0, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public o00oOOo0(@oo0oO0 Context context) {
        this.f17018o00oOOo0 = context;
    }

    public static Bitmap o00oOOo0(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @o0OOooO0(19)
    public static PrintAttributes.Builder o00oOOoO(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static boolean o00oOoO0(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    public static Matrix o00oOooO(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float f = i;
        float width = rectF.width() / f;
        float max = i3 == 2 ? Math.max(width, rectF.height() / i2) : Math.min(width, rectF.height() / i2);
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f * max)) / 2.0f, (rectF.height() - (i2 * max)) / 2.0f);
        return matrix;
    }

    public static boolean o00oo0O() {
        return true;
    }

    public int o00oOo00() {
        return this.f17021o00oOo0O;
    }

    public int o00oOo0O() {
        int i = this.f17022o00oOo0o;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public int o00oOo0o() {
        return this.f17023o00oOooO;
    }

    public final Bitmap o00oOoO(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        if (uri == null || (context = this.f17018o00oOOo0) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return decodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Bitmap o00oOoOO(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f17018o00oOOo0 == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        o00oOoO(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > 3500) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f17020o00oOo00) {
                    options = new BitmapFactory.Options();
                    this.f17019o00oOOoO = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap o00oOoO2 = o00oOoO(uri, options);
                    synchronized (this.f17020o00oOo00) {
                        this.f17019o00oOOoO = null;
                    }
                    return o00oOoO2;
                } catch (Throwable th) {
                    synchronized (this.f17020o00oOo00) {
                        this.f17019o00oOOoO = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void o00oOoOo(@oo0oO0 String str, @oo0oO0 Bitmap bitmap) {
        o00oOoo0(str, bitmap, null);
    }

    public void o00oOoo0(@oo0oO0 String str, @oo0oO0 Bitmap bitmap, @o0OO00OO o00oOOoO o00ooooo2) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f17018o00oOOo0.getSystemService("print")).print(str, new o00oOo00(str, this.f17023o00oOooO, bitmap, o00ooooo2), new PrintAttributes.Builder().setMediaSize(o00oOoO0(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f17021o00oOo0O).build());
    }

    public void o00oOooo(@oo0oO0 String str, @oo0oO0 Uri uri) throws FileNotFoundException {
        o00oo00O(str, uri, null);
    }

    public void o00oo0(int i) {
        this.f17021o00oOo0O = i;
    }

    public void o00oo00O(@oo0oO0 String str, @oo0oO0 Uri uri, @o0OO00OO o00oOOoO o00ooooo2) throws FileNotFoundException {
        PrintAttributes.MediaSize mediaSize;
        o00oOo0O o00ooo0o2 = new o00oOo0O(str, uri, o00ooooo2, this.f17023o00oOooO);
        PrintManager printManager = (PrintManager) this.f17018o00oOOo0.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f17021o00oOo0O);
        int i = this.f17022o00oOo0o;
        if (i != 1 && i != 0) {
            if (i == 2) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            }
            printManager.print(str, o00ooo0o2, builder.build());
        }
        mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        builder.setMediaSize(mediaSize);
        printManager.print(str, o00ooo0o2, builder.build());
    }

    public void o00oo0O0(int i) {
        this.f17023o00oOooO = i;
    }

    public void o00oo0OO(int i) {
        this.f17022o00oOo0o = i;
    }

    @o0OOooO0(19)
    public void o00oo0Oo(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0222o00oOOo0(cancellationSignal, f17011o00oOoOo ? printAttributes : o00oOOoO(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
