package o00oo0O0;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0OO;
@Deprecated
/* loaded from: classes.dex */
public class o00oOOoO extends BaseAdapter {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f7396o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final List<o00oo0O0.o00oOOo0> f7397o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f7398o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ String f7399o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f7400o00oo0Oo;

        public o00oOOo0(String str, o00oOo00 o00ooo002, ListenableFuture listenableFuture) {
            this.f7399o00oo0O0 = str;
            this.f7398o00oo0O = o00ooo002;
            this.f7400o00oo0Oo = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f7399o00oo0O0, this.f7398o00oo0O.f7404o00oOOoO.getText())) {
                try {
                    bitmap = (Bitmap) this.f7400o00oo0Oo.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f7398o00oo0O.f7403o00oOOo0.setVisibility(0);
                    this.f7398o00oo0O.f7403o00oOOo0.setImageBitmap(bitmap);
                    return;
                }
                this.f7398o00oo0O.f7403o00oOOo0.setVisibility(4);
                this.f7398o00oo0O.f7403o00oOOo0.setImageBitmap(null);
            }
        }
    }

    /* renamed from: o00oo0O0.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ExecutorC0108o00oOOoO implements Executor {
        public ExecutorC0108o00oOOoO() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@oo0oO0 Runnable runnable) {
            runnable.run();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ImageView f7403o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final TextView f7404o00oOOoO;

        public o00oOo00(ImageView imageView, TextView textView) {
            this.f7403o00oOOo0 = imageView;
            this.f7404o00oOOoO = textView;
        }
    }

    public o00oOOoO(List<o00oo0O0.o00oOOo0> list, Context context) {
        this.f7397o00oo0O0 = list;
        this.f7396o00oo0O = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7397o00oo0O0.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f7397o00oo0O0.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        o00oOo00 o00ooo002;
        o00oo0O0.o00oOOo0 o00oooo02 = this.f7397o00oo0O0.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f7396o00oo0O).inflate(R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(R.id.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(R.id.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            o00ooo002 = new o00oOo00(imageView, textView);
            view.setTag(o00ooo002);
        } else {
            o00ooo002 = (o00oOo00) view.getTag();
        }
        String o00oOo0O2 = o00oooo02.o00oOo0O();
        o00ooo002.f7404o00oOOoO.setText(o00oOo0O2);
        if (o00oooo02.o00oOOoO() != 0) {
            o00ooo002.f7403o00oOOo0.setImageDrawable(o0O0OO.o00oOoO0(this.f7396o00oo0O.getResources(), o00oooo02.o00oOOoO(), null));
        } else if (o00oooo02.o00oOo00() != null) {
            ListenableFuture<Bitmap> o00oOooo2 = BrowserServiceFileProvider.o00oOooo(this.f7396o00oo0O.getContentResolver(), o00oooo02.o00oOo00());
            o00oOooo2.addListener(new o00oOOo0(o00oOo0O2, o00ooo002, o00oOooo2), new ExecutorC0108o00oOOoO());
        } else {
            o00ooo002.f7403o00oOOo0.setImageBitmap(null);
            o00ooo002.f7403o00oOOo0.setVisibility(4);
        }
        return view;
    }
}
