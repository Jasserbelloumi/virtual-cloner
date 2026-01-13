package o0O0oOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ferfalk.simplesearchview.R;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OoO0.o00oOo00;
/* loaded from: classes.dex */
public final class o0OO0O0 implements o00oOo00 {
    @oo0oO0
    public final ImageButton backButton;
    @oo0oO0
    public final View bottomLine;
    @oo0oO0
    public final ImageButton clearButton;
    @oo0oO0
    private final FrameLayout rootView;
    @oo0oO0
    public final ConstraintLayout searchContainer;
    @oo0oO0
    public final EditText searchEditText;
    @oo0oO0
    public final ImageButton voiceButton;

    private o0OO0O0(@oo0oO0 FrameLayout frameLayout, @oo0oO0 ImageButton imageButton, @oo0oO0 View view, @oo0oO0 ImageButton imageButton2, @oo0oO0 ConstraintLayout constraintLayout, @oo0oO0 EditText editText, @oo0oO0 ImageButton imageButton3) {
        this.rootView = frameLayout;
        this.backButton = imageButton;
        this.bottomLine = view;
        this.clearButton = imageButton2;
        this.searchContainer = constraintLayout;
        this.searchEditText = editText;
        this.voiceButton = imageButton3;
    }

    @oo0oO0
    public static o0OO0O0 bind(@oo0oO0 View view) {
        View findViewById;
        int i = R.id.backButton;
        ImageButton imageButton = (ImageButton) view.findViewById(i);
        if (imageButton != null && (findViewById = view.findViewById((i = R.id.bottomLine))) != null) {
            i = R.id.clearButton;
            ImageButton imageButton2 = (ImageButton) view.findViewById(i);
            if (imageButton2 != null) {
                i = R.id.searchContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                if (constraintLayout != null) {
                    i = R.id.searchEditText;
                    EditText editText = (EditText) view.findViewById(i);
                    if (editText != null) {
                        i = R.id.voiceButton;
                        ImageButton imageButton3 = (ImageButton) view.findViewById(i);
                        if (imageButton3 != null) {
                            return new o0OO0O0((FrameLayout) view, imageButton, findViewById, imageButton2, constraintLayout, editText, imageButton3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @oo0oO0
    public static o0OO0O0 inflate(@oo0oO0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @oo0oO0
    public static o0OO0O0 inflate(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.search_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // o0O0OoO0.o00oOo00
    @oo0oO0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
