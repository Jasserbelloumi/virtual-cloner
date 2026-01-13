package o0OOoo;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
/* loaded from: classes3.dex */
public class oo0ooO extends Fragment {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Activity f14919o00oo0O0;

    public Activity o00oOo0o() {
        return this.f14919o00oo0O0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f14919o00oo0O0 = getActivity();
    }
}
