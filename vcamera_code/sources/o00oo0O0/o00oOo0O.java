package o00oo0O0;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.R;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import androidx.core.widget.o0OoOoOo;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class o00oOo0O implements AdapterView.OnItemClickListener {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final String f7410o00oo0oO = "BrowserActionskMenuUi";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Uri f7411o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f7412o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final List<o00oo0O0.o00oOOo0> f7413o00oo0Oo;
    @o0OO00OO

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oo0O0.o00oOo00 f7414o00oo0o;
    @o0OO00OO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public InterfaceC0109o00oOo0O f7415o00oo0o0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) o00oOo0O.this.f7412o00oo0O0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(ImagesContract.URL, o00oOo0O.this.f7411o00oo0O.toString()));
            Toast.makeText(o00oOo0O.this.f7412o00oo0O0, o00oOo0O.this.f7412o00oo0O0.getString(R.string.copy_toast_msg), 0).show();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements DialogInterface.OnShowListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f7417o00oOOo0;

        public o00oOOoO(View view) {
            this.f7417o00oOOo0 = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            InterfaceC0109o00oOo0O interfaceC0109o00oOo0O = o00oOo0O.this.f7415o00oo0o0;
            if (interfaceC0109o00oOo0O == null) {
                return;
            }
            interfaceC0109o00oOo0O.o00oOOo0(this.f7417o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements View.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ TextView f7420o00oo0O0;

        public o00oOo00(TextView textView) {
            this.f7420o00oo0O0 = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextView textView;
            TextUtils.TruncateAt truncateAt;
            if (o0OoOoOo.o00oOOo0.o00oOOoO(this.f7420o00oo0O0) == Integer.MAX_VALUE) {
                this.f7420o00oo0O0.setMaxLines(1);
                textView = this.f7420o00oo0O0;
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                this.f7420o00oo0O0.setMaxLines(Integer.MAX_VALUE);
                textView = this.f7420o00oo0O0;
                truncateAt = null;
            }
            textView.setEllipsize(truncateAt);
        }
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* renamed from: o00oo0O0.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0109o00oOo0O {
        void o00oOOo0(View view);
    }

    public o00oOo0O(@oo0oO0 Context context, @oo0oO0 Uri uri, @oo0oO0 List<o00oo0O0.o00oOOo0> list) {
        this.f7412o00oo0O0 = context;
        this.f7411o00oo0O = uri;
        this.f7413o00oo0Oo = o00oOOoO(list);
    }

    public final Runnable o00oOOo0() {
        return new o00oOOo0();
    }

    @oo0oO0
    public final List<o00oo0O0.o00oOOo0> o00oOOoO(List<o00oo0O0.o00oOOo0> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o00oo0O0.o00oOOo0(this.f7412o00oo0O0.getString(R.string.fallback_menu_item_open_in_browser), o00oOo00(), 0));
        arrayList.add(new o00oo0O0.o00oOOo0(this.f7412o00oo0O0.getString(R.string.fallback_menu_item_copy_link), o00oOOo0()));
        arrayList.add(new o00oo0O0.o00oOOo0(this.f7412o00oo0O0.getString(R.string.fallback_menu_item_share_link), o00oOooO(), 0));
        arrayList.addAll(list);
        return arrayList;
    }

    public final PendingIntent o00oOo00() {
        return PendingIntent.getActivity(this.f7412o00oo0O0, 0, new Intent("android.intent.action.VIEW", this.f7411o00oo0O), 67108864);
    }

    public void o00oOo0O() {
        View inflate = LayoutInflater.from(this.f7412o00oo0O0).inflate(R.layout.browser_actions_context_menu_page, (ViewGroup) null);
        o00oo0O0.o00oOo00 o00ooo002 = new o00oo0O0.o00oOo00(this.f7412o00oo0O0, o00oOo0o(inflate));
        this.f7414o00oo0o = o00ooo002;
        o00ooo002.setContentView(inflate);
        if (this.f7415o00oo0o0 != null) {
            this.f7414o00oo0o.setOnShowListener(new o00oOOoO(inflate));
        }
        this.f7414o00oo0o.show();
    }

    public final BrowserActionsFallbackMenuView o00oOo0o(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(R.id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(R.id.browser_actions_header_text);
        textView.setText(this.f7411o00oo0O.toString());
        textView.setOnClickListener(new o00oOo00(textView));
        ListView listView = (ListView) view.findViewById(R.id.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new o00oo0O0.o00oOOoO(this.f7413o00oo0Oo, this.f7412o00oo0O0));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoO0(@o0OO00OO InterfaceC0109o00oOo0O interfaceC0109o00oOo0O) {
        this.f7415o00oo0o0 = interfaceC0109o00oOo0O;
    }

    public final PendingIntent o00oOooO() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f7411o00oo0O.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f7412o00oo0O0, 0, intent, 67108864);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        o00oo0O0.o00oOOo0 o00oooo02 = this.f7413o00oo0Oo.get(i);
        if (o00oooo02.o00oOOo0() != null) {
            try {
                o00oooo02.o00oOOo0().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (o00oooo02.o00oOooO() != null) {
            o00oooo02.o00oOooO().run();
        }
        o00oo0O0.o00oOo00 o00ooo002 = this.f7414o00oo0o;
        if (o00ooo002 == null) {
            return;
        }
        o00ooo002.dismiss();
    }
}
