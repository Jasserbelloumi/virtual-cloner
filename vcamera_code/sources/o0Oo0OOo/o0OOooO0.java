package o0Oo0OOo;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import multispace.multiapp.clone.widget.RockerView;
import o00ooOoo.oOo000Oo;
import o0OO00oo.o00oo;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import virtual.camera.app.R;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016JB\u0010\u000f\u001a\u00020\f2:\u0010\u000e\u001a6\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rJ\b\u0010\u0010\u001a\u00020\fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017RN\u0010\u001b\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006j\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lo0Oo0OOo/o0OOooO0;", "Lo0OO00oo/o00oo;", "Landroid/view/MotionEvent;", oOo000Oo.f9217o0O00o0o, "", "onTouchEvent", "Lkotlin/Function2;", "", "Lo0OO0o/o0O0o00O;", "name", "angle", "distance", "Lo0OO0o/oO0Ooooo;", "Lmultispace/multiapp/clone/widget/LocationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "o00oo0O", "", "o00ooOO", "Ljava/lang/String;", "TAG", "Lmultispace/multiapp/clone/widget/RockerView;", "o00ooOOo", "Lmultispace/multiapp/clone/widget/RockerView;", "rockerView", "o00ooOo0", "Lo0OOOO/o0O00000;", "mListener", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0OOooO0 extends o00oo {
    @NotNull

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final String f15745o00ooOO;
    @Nullable

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public RockerView f15746o00ooOOo;
    @Nullable

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public o0O00000<? super Float, ? super Float, oO0Ooooo> f15747o00ooOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(@NotNull Context context) {
        super(context);
        o0ooO.o00oo0O0(context, o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, -84, -50, 58, -18, -24, -97, -28}, new byte[]{-4, -17, -95, 84, -102, -115, -25, -112}));
        this.f15745o00ooOO = o0OOoO0.o00oo.o00oOOo0(new byte[]{-27, Ascii.DC4, 72, 0, 32, -101, -72, 104, -39, Ascii.SUB, 76, Ascii.SO, 55}, new byte[]{-73, 123, 43, 107, 69, -23, -11, 9});
        View.inflate(context, R.layout.view_float_rocker, this);
        o00oo0O();
    }

    public static final void o00oo0Oo(o0OOooO0 o0ooooo0, int i, float f, float f2) {
        o0ooO.o00oo0O0(o0ooooo0, o0OOoO0.o00oo.o00oOOo0(new byte[]{-67, 63, -89, -105, -125, -18}, new byte[]{-55, 87, -50, -28, -89, -34, -57, 115}));
        if (i == 2) {
            if (f == -1.0f) {
                return;
            }
            float f3 = f2 * 0.001f;
            o0O00000<? super Float, ? super Float, oO0Ooooo> o0o00000 = o0ooooo0.f15747o00ooOo0;
            if (o0o00000 != null) {
                o0o00000.invoke(Float.valueOf(f), Float.valueOf(f3));
            }
        }
    }

    public final void o00oo0O() {
        RockerView rockerView = (RockerView) findViewById(R.id.rocker);
        this.f15746o00ooOOo = rockerView;
        if (rockerView != null) {
            rockerView.setListener(new RockerView.o00oOOo0() { // from class: o0Oo0OOo.o0OO0O0
                @Override // multispace.multiapp.clone.widget.RockerView.o00oOOo0
                public final void o00oOOo0(int i, float f, float f2) {
                    o0OOooO0.o00oo0Oo(o0OOooO0.this, i, f, f2);
                }
            });
        }
    }

    @Override // o0OO00oo.o00oo, android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        RockerView rockerView;
        boolean z = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            RockerView rockerView2 = this.f15746o00ooOOo;
            if (rockerView2 != null) {
                rockerView2.setCanMove(false);
            }
        } else {
            if (motionEvent != null && motionEvent.getAction() == 1) {
                z = true;
            }
            if (z && (rockerView = this.f15746o00ooOOo) != null) {
                rockerView.setCanMove(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setListener(@NotNull o0O00000<? super Float, ? super Float, oO0Ooooo> o0o00000) {
        o0ooO.o00oo0O0(o0o00000, o0OOoO0.o00oo.o00oOOo0(new byte[]{35, 111, 72, -25, 87, -16, 78, 78}, new byte[]{79, 6, 59, -109, 50, -98, 43, 60}));
        this.f15747o00ooOo0 = o0o00000;
    }
}
