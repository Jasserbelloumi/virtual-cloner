package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0O000Oo extends RecyclerView.o0O00oO0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ColorStateList f3951o00oo0O;
    @o0OO00OO

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Drawable f3952o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final SparseArray<View> f3953o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f3954o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f3955o00oo0o0;

    public o0O000Oo(@oo0oO0 View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f3953o00oo0Oo = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        int i = R.id.icon_frame;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(o00oOOo0.f3790o00oOOo0, view.findViewById(o00oOOo0.f3790o00oOOo0));
        this.f3952o00oo0O0 = view.getBackground();
        if (textView != null) {
            this.f3951o00oo0O = textView.getTextColors();
        }
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static o0O000Oo o00oOOo0(@oo0oO0 View view) {
        return new o0O000Oo(view);
    }

    public View o00oOOoO(@oo0OOoo int i) {
        View view = this.f3953o00oo0Oo.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f3953o00oo0Oo.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean o00oOo00() {
        return this.f3955o00oo0o0;
    }

    public void o00oOo0O() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f3952o00oo0O0;
        if (background != drawable) {
            o0O0o00O.o0O0ooo0(this.itemView, drawable);
        }
        TextView textView = (TextView) o00oOOoO(16908310);
        if (textView == null || this.f3951o00oo0O == null || textView.getTextColors().equals(this.f3951o00oo0O)) {
            return;
        }
        textView.setTextColor(this.f3951o00oo0O);
    }

    public void o00oOo0o(boolean z) {
        this.f3955o00oo0o0 = z;
    }

    public void o00oOoO0(boolean z) {
        this.f3954o00oo0o = z;
    }

    public boolean o00oOooO() {
        return this.f3954o00oo0o;
    }
}
