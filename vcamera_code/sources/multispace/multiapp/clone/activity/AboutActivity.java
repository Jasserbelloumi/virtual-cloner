package multispace.multiapp.clone.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.common.base.Ascii;
import multispace.multiapp.clone.view.base.BaseActivity;
import o0OOoO0.o00oo;
import o0OOooOO.o0O0oo00;
import o0ooO0O0.oOo00ooO;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class AboutActivity extends BaseActivity {

    /* renamed from: o00ooooO  reason: collision with root package name */
    public boolean f6676o00ooooO = false;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public boolean f6677o00ooooo = false;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements View.OnClickListener {
        public o00oOOo0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0O0oo00.o00oOOo0().o00oOoO();
        }
    }

    public static void o0O0O0o(Context context) {
        context.startActivity(new Intent(context, AboutActivity.class));
    }

    public static void o0O0O0oO(Context context) {
        Intent intent = new Intent(context, AboutActivity.class);
        intent.putExtra(o00oo.o00oOOo0(new byte[]{6, 83, -114, 55, 121, -47, -27, -43}, new byte[]{111, 32, -37, 71, Ascii.GS, -80, -111, -80}), true);
        context.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f6677o00ooooo) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_about);
        o0O00Oo((Toolbar) findViewById(R.id.toolbar));
        androidx.appcompat.app.o00oOOo0 o0ooOoOO2 = o0ooOoOO();
        boolean booleanExtra = getIntent().getBooleanExtra(o00oo.o00oOOo0(new byte[]{107, -41, -121, -73, 34, -113, -41, -17}, new byte[]{2, -92, -46, -57, 70, -18, -93, -118}), false);
        this.f6676o00ooooO = booleanExtra;
        if (booleanExtra) {
            this.f6677o00ooooo = o0O0oo00.o00oOOo0().o00oOo0o();
        }
        if (o0ooOoOO2 != null && !this.f6677o00ooooo) {
            o0ooOoOO2.o0O0000o(true);
        }
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.str_version) + o00oo.o00oOOo0(new byte[]{54, Ascii.CR}, new byte[]{Ascii.FF, 45, -91, 40, Ascii.SI, 36, 75, -7}) + oOo00ooO.o00oOooO(this));
        if (!this.f6676o00ooooO) {
            findViewById(R.id.update_container).setVisibility(8);
            return;
        }
        ((TextView) findViewById(R.id.update_title)).setText(o0O0oo00.o00oOOo0().o00oOo00());
        ((TextView) findViewById(R.id.update_details)).setText(o0O0oo00.o00oOOo0().o00oOOoO());
        ((Button) findViewById(R.id.update_btn)).setOnClickListener(new o00oOOo0());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
