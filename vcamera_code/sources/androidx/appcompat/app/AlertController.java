package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import o00oOooO.o0OO00OO;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f121o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0o f122o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final Window f123o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public CharSequence f124o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public CharSequence f125o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public View f126o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public ListView f127o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int f128o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f129o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f130o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final int f131o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public int f132o00oOooo;

    /* renamed from: o00oo  reason: collision with root package name */
    public Button f133o00oo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public int f135o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Message f136o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public CharSequence f137o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public Button f138o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Drawable f139o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public CharSequence f140o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Button f141o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Message f142o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public Message f144o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public CharSequence f145o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public Drawable f146o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public NestedScrollView f147o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public ImageView f148o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public Drawable f149o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public TextView f150o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public View f151o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public TextView f152o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public ListAdapter f153o00ooOoO;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public int f155o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f156o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f157o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f158o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public int f159o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public int f160o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f161o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public Handler f162o00oooo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public Drawable f165o0O0o;

    /* renamed from: o00oo0  reason: collision with root package name */
    public boolean f134o00oo0 = false;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f143o00ooO = 0;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f154o00ooOoo = -1;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public int f163o00oooo0 = 0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public final View.OnClickListener f164o00ooooO = new o00oOOo0();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final int f166o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final int f167o00oo0O0;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f166o00oo0O = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f167o00oo0O0 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void o00oOOo0(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f167o00oo0O0, getPaddingRight(), z2 ? getPaddingBottom() : this.f166o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f138o00oo0OO || (message2 = alertController.f136o00oo0O) == null) && (view != alertController.f141o00oo0o0 || (message2 = alertController.f142o00oo0oO) == null)) ? (view != alertController.f133o00oo || (message = alertController.f144o00ooO0) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f162o00oooo.obtainMessage(1, alertController2.f122o00oOOoO).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements NestedScrollView.o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f169o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f170o00oOOoO;

        public o00oOOoO(View view, View view2) {
            this.f169o00oOOo0 = view;
            this.f170o00oOOoO = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.o00oOo00
        public void o00oOOo0(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.o00oOoO0(nestedScrollView, this.f169o00oOOo0, this.f170o00oOOoO);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f172o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f173o00oo0O0;

        public o00oOo00(View view, View view2) {
            this.f173o00oo0O0 = view;
            this.f172o00oo0O = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.o00oOoO0(AlertController.this.f147o00ooO0o, this.f173o00oo0O0, this.f172o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements AbsListView.OnScrollListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f175o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ View f176o00oOOoO;

        public o00oOo0O(View view, View view2) {
            this.f175o00oOOo0 = view;
            this.f176o00oOOoO = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.o00oOoO0(absListView, this.f175o00oOOo0, this.f176o00oOOoO);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f178o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f179o00oo0O0;

        public o00oOoO(View view, View view2) {
            this.f179o00oo0O0 = view;
            this.f178o00oo0O = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.o00oOoO0(AlertController.this.f127o00oOoO0, this.f179o00oo0O0, this.f178o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo0 extends Handler {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f181o00oOOoO = 1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public WeakReference<DialogInterface> f182o00oOOo0;

        public o00oo0(DialogInterface dialogInterface) {
            this.f182o00oOOo0 = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f182o00oOOo0.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f183o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final LayoutInflater f184o00oOOoO;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public CharSequence f187o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public CharSequence f188o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public View f189o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public CharSequence f190o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public Drawable f191o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public DialogInterface.OnClickListener f192o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Drawable f193o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public CharSequence f194o00oOooo;

        /* renamed from: o00oo  reason: collision with root package name */
        public ListAdapter f195o00oo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public DialogInterface.OnClickListener f196o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public Drawable f197o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public DialogInterface.OnClickListener f198o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Drawable f199o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public CharSequence f200o00oo0OO;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public DialogInterface.OnDismissListener f202o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public DialogInterface.OnCancelListener f203o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public DialogInterface.OnKeyListener f204o00oo0oO;

        /* renamed from: o00ooO  reason: collision with root package name */
        public int f205o00ooO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public int f206o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public DialogInterface.OnClickListener f207o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public View f208o00ooO0O;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public int f209o00ooO0o;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public int f210o00ooOO;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public int f211o00ooOO0;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public boolean f213o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public boolean[] f214o00ooOo0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public boolean f215o00ooOoO;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public Cursor f217o00ooo0;

        /* renamed from: o00ooo00  reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f218o00ooo00;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public String f219o00ooo0O;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public String f220o00ooo0o;

        /* renamed from: o00oooO  reason: collision with root package name */
        public boolean f221o00oooO;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f222o00oooOO;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public o00oOoO f223o00oooOo;

        /* renamed from: o0O0o  reason: collision with root package name */
        public CharSequence[] f225o0O0o;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f185o00oOo00 = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f186o00oOo0O = 0;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public boolean f212o00ooOOo = false;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public int f216o00ooOoo = -1;

        /* renamed from: o00oooo0  reason: collision with root package name */
        public boolean f224o00oooo0 = true;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f201o00oo0Oo = true;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends ArrayAdapter<CharSequence> {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f227o00oo0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOo0(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f227o00oo0O0 = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = o00oo00O.this.f214o00ooOo0;
                if (zArr != null && zArr[i]) {
                    this.f227o00oo0O0.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* loaded from: classes.dex */
        public class o00oOOoO extends CursorAdapter {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final int f228o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final int f229o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f230o00oo0Oo;

            /* renamed from: o00oo0o0  reason: collision with root package name */
            public final /* synthetic */ AlertController f232o00oo0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOoO(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f230o00oo0Oo = recycleListView;
                this.f232o00oo0o0 = alertController;
                Cursor cursor2 = getCursor();
                this.f229o00oo0O0 = cursor2.getColumnIndexOrThrow(o00oo00O.this.f219o00ooo0O);
                this.f228o00oo0O = cursor2.getColumnIndexOrThrow(o00oo00O.this.f220o00ooo0o);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f229o00oo0O0));
                this.f230o00oo0Oo.setItemChecked(cursor.getPosition(), cursor.getInt(this.f228o00oo0O) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return o00oo00O.this.f184o00oOOoO.inflate(this.f232o00oo0o0.f158o00ooo0o, viewGroup, false);
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo00 implements AdapterView.OnItemClickListener {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ AlertController f234o00oo0O0;

            public o00oOo00(AlertController alertController) {
                this.f234o00oo0O0 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                o00oo00O.this.f207o00ooO00.onClick(this.f234o00oo0O0.f122o00oOOoO, i);
                if (o00oo00O.this.f215o00ooOoO) {
                    return;
                }
                this.f234o00oo0O0.f122o00oOOoO.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class o00oOo0O implements AdapterView.OnItemClickListener {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ AlertController f235o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f236o00oo0O0;

            public o00oOo0O(RecycleListView recycleListView, AlertController alertController) {
                this.f236o00oo0O0 = recycleListView;
                this.f235o00oo0O = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = o00oo00O.this.f214o00ooOo0;
                if (zArr != null) {
                    zArr[i] = this.f236o00oo0O0.isItemChecked(i);
                }
                o00oo00O.this.f218o00ooo00.onClick(this.f235o00oo0O.f122o00oOOoO, i, this.f236o00oo0O0.isItemChecked(i));
            }
        }

        /* loaded from: classes.dex */
        public interface o00oOoO {
            void o00oOOo0(ListView listView);
        }

        public o00oo00O(Context context) {
            this.f183o00oOOo0 = context;
            this.f184o00oOOoO = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void o00oOOo0(AlertController alertController) {
            View view = this.f189o00oOoO0;
            if (view != null) {
                alertController.o00oo0(view);
            } else {
                CharSequence charSequence = this.f187o00oOo0o;
                if (charSequence != null) {
                    alertController.o00oo0o0(charSequence);
                }
                Drawable drawable = this.f193o00oOooO;
                if (drawable != null) {
                    alertController.o00oo0O0(drawable);
                }
                int i = this.f185o00oOo00;
                if (i != 0) {
                    alertController.o00oo0OO(i);
                }
                int i2 = this.f186o00oOo0O;
                if (i2 != 0) {
                    alertController.o00oo0OO(alertController.o00oOooO(i2));
                }
            }
            CharSequence charSequence2 = this.f188o00oOoO;
            if (charSequence2 != null) {
                alertController.o00oo0O(charSequence2);
            }
            CharSequence charSequence3 = this.f190o00oOoOO;
            if (charSequence3 != null || this.f191o00oOoOo != null) {
                alertController.o00oOooo(-1, charSequence3, this.f192o00oOoo0, null, this.f191o00oOoOo);
            }
            CharSequence charSequence4 = this.f194o00oOooo;
            if (charSequence4 != null || this.f197o00oo00O != null) {
                alertController.o00oOooo(-2, charSequence4, this.f196o00oo0, null, this.f197o00oo00O);
            }
            CharSequence charSequence5 = this.f200o00oo0OO;
            if (charSequence5 != null || this.f199o00oo0O0 != null) {
                alertController.o00oOooo(-3, charSequence5, this.f198o00oo0O, null, this.f199o00oo0O0);
            }
            if (this.f225o0O0o != null || this.f217o00ooo0 != null || this.f195o00oo != null) {
                o00oOOoO(alertController);
            }
            View view2 = this.f208o00ooO0O;
            if (view2 != null) {
                if (this.f212o00ooOOo) {
                    alertController.o0O0o(view2, this.f209o00ooO0o, this.f205o00ooO, this.f211o00ooOO0, this.f210o00ooOO);
                    return;
                } else {
                    alertController.o00oo0oO(view2);
                    return;
                }
            }
            int i3 = this.f206o00ooO0;
            if (i3 != 0) {
                alertController.o00oo0o(i3);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o00oOOoO(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f184o00oOOoO
                int r1 = r11.f157o00ooo0O
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f213o00ooOo
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.f217o00ooo0
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$o00oo00O$o00oOOo0 r9 = new androidx.appcompat.app.AlertController$o00oo00O$o00oOOo0
                android.content.Context r3 = r10.f183o00oOOo0
                int r4 = r11.f158o00ooo0o
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f225o0O0o
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$o00oo00O$o00oOOoO r9 = new androidx.appcompat.app.AlertController$o00oo00O$o00oOOoO
                android.content.Context r3 = r10.f183o00oOOo0
                android.database.Cursor r4 = r10.f217o00ooo0
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.f215o00ooOoO
                if (r1 == 0) goto L3c
                int r1 = r11.f159o00oooO
                goto L3e
            L3c:
                int r1 = r11.f160o00oooOO
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.f217o00ooo0
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f183o00oOOo0
                android.database.Cursor r5 = r10.f217o00ooo0
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f219o00ooo0O
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f195o00oo
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$o00oo0OO r9 = new androidx.appcompat.app.AlertController$o00oo0OO
                android.content.Context r1 = r10.f183o00oOOo0
                java.lang.CharSequence[] r3 = r10.f225o0O0o
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$o00oo00O$o00oOoO r1 = r10.f223o00oooOo
                if (r1 == 0) goto L72
                r1.o00oOOo0(r0)
            L72:
                r11.f153o00ooOoO = r9
                int r1 = r10.f216o00ooOoo
                r11.f154o00ooOoo = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f207o00ooO00
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$o00oo00O$o00oOo00 r1 = new androidx.appcompat.app.AlertController$o00oo00O$o00oOo00
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f218o00ooo00
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$o00oo00O$o00oOo0O r1 = new androidx.appcompat.app.AlertController$o00oo00O$o00oOo0O
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f222o00oooOO
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.f215o00ooOoO
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.f213o00ooOo
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f127o00oOoO0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.o00oo00O.o00oOOoO(androidx.appcompat.app.AlertController):void");
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends ArrayAdapter<CharSequence> {
        public o00oo0OO(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, o0O0o o0o0o, Window window) {
        this.f121o00oOOo0 = context;
        this.f122o00oOOoO = o0o0o;
        this.f123o00oOo00 = window;
        this.f162o00oooo = new o00oo0(o0o0o);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.f156o00ooo00 = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.f155o00ooo0 = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f157o00ooo0O = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.f158o00ooo0o = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f159o00oooO = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f160o00oooOO = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.f161o00oooOo = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f131o00oOooO = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        o0o0o.supportRequestWindowFeature(1);
    }

    public static boolean o00oOOo0(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (o00oOOo0(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void o00oOoO0(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static boolean o00ooO(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public final void o00oOOoO(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button o00oOo00(int i) {
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    return null;
                }
                return this.f138o00oo0OO;
            }
            return this.f141o00oo0o0;
        }
        return this.f133o00oo;
    }

    public ListView o00oOo0O() {
        return this.f127o00oOoO0;
    }

    public void o00oOo0o() {
        this.f122o00oOOoO.setContentView(o00oOoo0());
        o00ooO0o();
    }

    public boolean o00oOoO(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f147o00ooO0o;
        return nestedScrollView != null && nestedScrollView.o00oOoo0(keyEvent);
    }

    public boolean o00oOoOO(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f147o00ooO0o;
        return nestedScrollView != null && nestedScrollView.o00oOoo0(keyEvent);
    }

    @o0OO00OO
    public final ViewGroup o00oOoOo(@o0OO00OO View view, @o0OO00OO View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int o00oOoo0() {
        int i = this.f155o00ooo0;
        return (i != 0 && this.f163o00oooo0 == 1) ? i : this.f156o00ooo00;
    }

    public int o00oOooO(int i) {
        TypedValue typedValue = new TypedValue();
        this.f121o00oOOo0.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public void o00oOooo(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f162o00oooo.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f145o00ooO00 = charSequence;
            this.f144o00ooO0 = message;
            this.f146o00ooO0O = drawable;
        } else if (i == -2) {
            this.f140o00oo0o = charSequence;
            this.f142o00oo0oO = message;
            this.f165o0O0o = drawable;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f137o00oo0O0 = charSequence;
            this.f136o00oo0O = message;
            this.f139o00oo0Oo = drawable;
        }
    }

    public final void o00oo(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f138o00oo0OO = button2;
        button2.setOnClickListener(this.f164o00ooooO);
        if (TextUtils.isEmpty(this.f137o00oo0O0) && this.f139o00oo0Oo == null) {
            this.f138o00oo0OO.setVisibility(8);
            z = false;
        } else {
            this.f138o00oo0OO.setText(this.f137o00oo0O0);
            Drawable drawable = this.f139o00oo0Oo;
            if (drawable != null) {
                int i = this.f131o00oOooO;
                drawable.setBounds(0, 0, i, i);
                this.f138o00oo0OO.setCompoundDrawables(this.f139o00oo0Oo, null, null, null);
            }
            this.f138o00oo0OO.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f141o00oo0o0 = button3;
        button3.setOnClickListener(this.f164o00ooooO);
        if (TextUtils.isEmpty(this.f140o00oo0o) && this.f165o0O0o == null) {
            this.f141o00oo0o0.setVisibility(8);
        } else {
            this.f141o00oo0o0.setText(this.f140o00oo0o);
            Drawable drawable2 = this.f165o0O0o;
            if (drawable2 != null) {
                int i2 = this.f131o00oOooO;
                drawable2.setBounds(0, 0, i2, i2);
                this.f141o00oo0o0.setCompoundDrawables(this.f165o0O0o, null, null, null);
            }
            this.f141o00oo0o0.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f133o00oo = button4;
        button4.setOnClickListener(this.f164o00ooooO);
        if (TextUtils.isEmpty(this.f145o00ooO00) && this.f146o00ooO0O == null) {
            this.f133o00oo.setVisibility(8);
        } else {
            this.f133o00oo.setText(this.f145o00ooO00);
            Drawable drawable3 = this.f146o00ooO0O;
            if (drawable3 != null) {
                int i3 = this.f131o00oOooO;
                drawable3.setBounds(0, 0, i3, i3);
                this.f133o00oo.setCompoundDrawables(this.f146o00ooO0O, null, null, null);
            }
            this.f133o00oo.setVisibility(0);
            z |= true;
        }
        if (o00ooO(this.f121o00oOOo0)) {
            if (z) {
                button = this.f138o00oo0OO;
            } else if (z) {
                button = this.f141o00oo0o0;
            } else if (z) {
                button = this.f133o00oo;
            }
            o00oOOoO(button);
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void o00oo0(View view) {
        this.f151o00ooOo = view;
    }

    public void o00oo00O(int i) {
        this.f163o00oooo0 = i;
    }

    public void o00oo0O(CharSequence charSequence) {
        this.f125o00oOo0o = charSequence;
        TextView textView = this.f152o00ooOo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void o00oo0O0(Drawable drawable) {
        this.f149o00ooOO0 = drawable;
        this.f143o00ooO = 0;
        ImageView imageView = this.f148o00ooOO;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f148o00ooOO.setImageDrawable(drawable);
        }
    }

    public void o00oo0OO(int i) {
        this.f149o00ooOO0 = null;
        this.f143o00ooO = i;
        ImageView imageView = this.f148o00ooOO;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f148o00ooOO.setImageResource(this.f143o00ooO);
        }
    }

    public final void o00oo0Oo(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f123o00oOo00.findViewById(R.id.scrollIndicatorUp);
        View findViewById2 = this.f123o00oOo00.findViewById(R.id.scrollIndicatorDown);
        o0O0o00O.o0OO0ooo(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void o00oo0o(int i) {
        this.f126o00oOoO = null;
        this.f128o00oOoOO = i;
        this.f134o00oo0 = false;
    }

    public void o00oo0o0(CharSequence charSequence) {
        this.f124o00oOo0O = charSequence;
        TextView textView = this.f150o00ooOOo;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void o00oo0oO(View view) {
        this.f126o00oOoO = view;
        this.f128o00oOoOO = 0;
        this.f134o00oo0 = false;
    }

    public final void o00ooO0(ViewGroup viewGroup) {
        View view = this.f126o00oOoO;
        if (view == null) {
            view = this.f128o00oOoOO != 0 ? LayoutInflater.from(this.f121o00oOOo0).inflate(this.f128o00oOoOO, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !o00oOOo0(view)) {
            this.f123o00oOo00.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f123o00oOo00.findViewById(R.id.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f134o00oo0) {
            frameLayout.setPadding(this.f129o00oOoOo, this.f130o00oOoo0, this.f132o00oOooo, this.f135o00oo00O);
        }
        if (this.f127o00oOoO0 != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.o00oOOoO) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void o00ooO00(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f123o00oOo00.findViewById(R.id.scrollView);
        this.f147o00ooO0o = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f147o00ooO0o.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f152o00ooOo0 = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f125o00oOo0o;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f147o00ooO0o.removeView(this.f152o00ooOo0);
        if (this.f127o00oOoO0 == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f147o00ooO0o.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f147o00ooO0o);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f127o00oOoO0, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    public final void o00ooO0O(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.f151o00ooOo != null) {
            viewGroup.addView(this.f151o00ooOo, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup2 = this.f123o00oOo00.findViewById(R.id.title_template);
        } else {
            this.f148o00ooOO = (ImageView) this.f123o00oOo00.findViewById(16908294);
            if ((!TextUtils.isEmpty(this.f124o00oOo0O)) && this.f161o00oooOo) {
                TextView textView = (TextView) this.f123o00oOo00.findViewById(R.id.alertTitle);
                this.f150o00ooOOo = textView;
                textView.setText(this.f124o00oOo0O);
                int i = this.f143o00ooO;
                if (i != 0) {
                    this.f148o00ooOO.setImageResource(i);
                    return;
                }
                Drawable drawable = this.f149o00ooOO0;
                if (drawable != null) {
                    this.f148o00ooOO.setImageDrawable(drawable);
                    return;
                }
                this.f150o00ooOOo.setPadding(this.f148o00ooOO.getPaddingLeft(), this.f148o00ooOO.getPaddingTop(), this.f148o00ooOO.getPaddingRight(), this.f148o00ooOO.getPaddingBottom());
                this.f148o00ooOO.setVisibility(8);
                return;
            }
            this.f123o00oOo00.findViewById(R.id.title_template).setVisibility(8);
            this.f148o00ooOO.setVisibility(8);
            viewGroup2 = viewGroup;
        }
        viewGroup2.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00ooO0o() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f123o00oOo00.findViewById(R.id.parentPanel);
        int i = R.id.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = R.id.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = R.id.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        o00ooO0(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup o00oOoOo2 = o00oOoOo(findViewById7, findViewById4);
        ViewGroup o00oOoOo3 = o00oOoOo(findViewById8, findViewById5);
        ViewGroup o00oOoOo4 = o00oOoOo(findViewById9, findViewById6);
        o00ooO00(o00oOoOo3);
        o00oo(o00oOoOo4);
        o00ooO0O(o00oOoOo2);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (o00oOoOo2 == null || o00oOoOo2.getVisibility() == 8) ? false : 1;
        boolean z3 = (o00oOoOo4 == null || o00oOoOo4.getVisibility() == 8) ? false : true;
        if (!z3 && o00oOoOo3 != null && (findViewById2 = o00oOoOo3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f147o00ooO0o;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f125o00oOo0o != null || this.f127o00oOoO0 != null) {
                view = o00oOoOo2.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (o00oOoOo3 != null && (findViewById = o00oOoOo3.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f127o00oOoO0;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).o00oOOo0(z2, z3);
        }
        if (!z) {
            View view2 = this.f127o00oOoO0;
            if (view2 == null) {
                view2 = this.f147o00ooO0o;
            }
            if (view2 != null) {
                o00oo0Oo(o00oOoOo3, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f127o00oOoO0;
        if (listView2 == null || (listAdapter = this.f153o00ooOoO) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i4 = this.f154o00ooOoo;
        if (i4 > -1) {
            listView2.setItemChecked(i4, true);
            listView2.setSelection(i4);
        }
    }

    public void o0O0o(View view, int i, int i2, int i3, int i4) {
        this.f126o00oOoO = view;
        this.f128o00oOoOO = 0;
        this.f134o00oo0 = true;
        this.f129o00oOoOo = i;
        this.f130o00oOoo0 = i2;
        this.f132o00oOooo = i3;
        this.f135o00oo00O = i4;
    }
}
