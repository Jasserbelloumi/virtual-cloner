package o0ooO0O0;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.ZoomControls;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.skydoves.powerspinner.PowerSpinnerView;
import multispace.multiapp.clone.app.App;
import multispace.multiapp.clone.type.SettingItem;
import multispace.multiapp.clone.widget.RoundMenuView;
import o00oOooO.o0OO00OO;
import o0OOO0oo.oo0OOoo;
import o0OOoo0O.o0OO0oO;
import o0Oo0oo0.o0OO0o00;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class oO0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static oo0ooO.o00oo0OO f17085o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static int f17086o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f17087o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static String f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-57, Ascii.ETB, 76, 111, Ascii.CR, 56, -49}, new byte[]{-73, 101, 41, Ascii.EM, 100, 93, -72, -69});

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static View f17089o00oOo0o = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f17090o00oOooO = 2;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements RoundMenuView.o00oo00O {
        @Override // multispace.multiapp.clone.widget.RoundMenuView.o00oo00O
        public void o00oOOo0(View view, String str, int i) {
            if (o0OOoO0.o00oo.o00oOOo0(new byte[]{109, -83}, new byte[]{Ascii.CAN, -35, 82, -51, Ascii.SI, -102, 101, -93}).equals(str)) {
                int i2 = o0OO0oO.o00oOOo0().o00ooOO().o00oo0o0(oO0O00O.o00oOoO0()).f6713o00ooO0;
                int i3 = o0OO0oO.f14946o00oOOo0.o00ooOO().o00oo0o0(oO0O00O.f17088o00oOo0O).f6715o00ooO0O;
                if (i == 1) {
                    i2 += 10;
                } else if (i == 2) {
                    i3 += 10;
                } else if (i == 3) {
                    i2 -= 10;
                } else if (i == 4) {
                    i3 -= 10;
                } else if (i == 5) {
                    i2 = 0;
                    i3 = 0;
                }
                o0OO0oO.f14946o00oOOo0.o00ooOO().o00ooO0o(i2, i3, oO0O00O.f17088o00oOo0O);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0OO0oO.o00oOOo0().o00ooOO().o00oo0(oO0O00O.o00oOoO0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0OO0oO.o00oOOo0().o00ooOO().o00oo0O0(oO0O00O.o00oOoO0());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements View.OnClickListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ PowerSpinnerView f17091o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements PopupMenu.OnMenuItemClickListener {
            public o00oOOo0() {
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                int i;
                SettingItem o00oo0o02 = o0OO0oO.o00oOOo0().o00ooOO().o00oo0o0(oO0O00O.o00oOoO0());
                switch (menuItem.getItemId()) {
                    case R.id.temp1 /* 2131362410 */:
                        i = 2001;
                        break;
                    case R.id.temp2 /* 2131362411 */:
                        i = 2002;
                        break;
                    case R.id.temp3 /* 2131362412 */:
                        i = 2003;
                        break;
                    case R.id.temp4 /* 2131362413 */:
                        i = 2004;
                        break;
                    default:
                        return true;
                }
                o00oo0o02.f6712o00oo0oO = i;
                return true;
            }
        }

        public o00oOo0O(PowerSpinnerView powerSpinnerView) {
            this.f17091o00oo0O0 = powerSpinnerView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(App.o00oOOoO(), this.f17091o00oo0O0);
            popupMenu.getMenuInflater().inflate(R.menu.temp3, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new o00oOOo0());
            popupMenu.show();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO implements o0OO0Ooo.o00oo0OO<String> {
        @Override // o0OO0Ooo.o00oo0OO
        /* renamed from: o00oOOoO */
        public void o00oOOo0(int i, @o0OO00OO String str, int i2, String str2) {
            int i3;
            SettingItem o00oo0o02 = o0OO0oO.o00oOOo0().o00ooOO().o00oo0o0(oO0O00O.o00oOoO0());
            if (i2 == 0) {
                i3 = 2001;
            } else if (i2 == 1) {
                i3 = 2002;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    i3 = 2004;
                }
                o00oo0o02.o00oOooO();
            } else {
                i3 = 2003;
            }
            o00oo0o02.f6712o00oo0oO = i3;
            o00oo0o02.o00oOooO();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ float f17093o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ float f17094o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ZoomControls f17095o00oo0Oo;

        public o00oo(float f, float f2, ZoomControls zoomControls) {
            this.f17094o00oo0O0 = f;
            this.f17093o00oo0O = f2;
            this.f17095o00oo0Oo = zoomControls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0OO0oO.o00oOOo0().o00ooOO().o00oo0OO(this.f17094o00oo0O0, oO0O00O.o00oOoO0());
            if (o0OO0oO.f14946o00oOOo0.o00ooOO().o00oo0oO(oO0O00O.f17088o00oOo0O) >= this.f17093o00oo0O) {
                this.f17095o00oo0Oo.setIsZoomInEnabled(false);
            }
            this.f17095o00oo0Oo.setIsZoomOutEnabled(true);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f17096o00oo0O0;

        public o00oo0(Activity activity) {
            this.f17096o00oo0O0 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0O00O.o00oo0o(this.f17096o00oo0O0);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Activity f17097o00oo0O0;

        public o00oo00O(Activity activity) {
            this.f17097o00oo0O0 = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o0OO0oO.o00oOOo0().o00ooOO() == null) {
                return;
            }
            oO0O00O.o00oo0o(this.f17097o00oo0O0);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O implements o0OO0Ooo.o00oo0OO<String> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ View f17098o00oOOo0;

        public o00oo0O(View view) {
            this.f17098o00oOOo0 = view;
        }

        @Override // o0OO0Ooo.o00oo0OO
        /* renamed from: o00oOOoO */
        public void o00oOOo0(int i, @o0OO00OO String str, int i2, String str2) {
            oO0O00O.o00ooO00(oO0O00O.f17089o00oOo0o, false);
            if (!str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{81, -92, 88, 113, 116, -4, -26}, new byte[]{1, -42, oo0OOoo.f13516o00oOoO, 7, Ascii.GS, -103, -111, 74}))) {
                if (str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-4, Ascii.SUB, -50, 42, Ascii.SYN, -22, -116}, new byte[]{-84, 115, -83, 94, 99, -104, -23, -99}))) {
                    this.f17098o00oOOo0.findViewById(R.id.settings).setVisibility(0);
                    oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{81, -114, 75, -87, -2, 57, -6}, new byte[]{o0OO0o00.f16655o00oOoOO, -25, 40, -35, -117, 75, -97, 114});
                    oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                } else if (str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{19, -32, -105, -39, 1}, new byte[]{69, -119, -13, -68, 110, -24, 77, 123}))) {
                    this.f17098o00oOOo0.findViewById(R.id.settings).setVisibility(0);
                    oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-15, 2, Ascii.RS, -118, 57, SignedBytes.MAX_POWER_OF_TWO, -79, 125, -21}, new byte[]{-121, 107, 122, -17, 86, 35, -48, 17});
                    oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                } else if (!str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-119, -114, -38, -22, -87, 100}, new byte[]{-58, -6, -78, -113, -37, Ascii.ETB, -126, -10}))) {
                    if (str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-61, -115, 67, -113, 74, -76}, new byte[]{-117, -28, 39, -21, 47, -38, -8, Ascii.DC4}))) {
                        this.f17098o00oOOo0.findViewById(R.id.settings).setVisibility(8);
                        return;
                    } else if (str2.contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-53, -59, -16, -99, -108, -88, 5}, new byte[]{-113, -84, -125, -16, -3, -37, 118, 89}))) {
                        oO0O00O.o00oOoOO();
                        return;
                    } else {
                        return;
                    }
                } else {
                    this.f17098o00oOOo0.findViewById(R.id.settings).setVisibility(0);
                    oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-23, 83, -93, -15, 96, -85}, new byte[]{-122, 39, -53, -108, Ascii.DC2, -40, 102, -1});
                }
                oO0O00O.o00ooO00(oO0O00O.f17089o00oOo0o, true);
                return;
            }
            this.f17098o00oOOo0.findViewById(R.id.settings).setVisibility(0);
            oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-28, -20, 112, -58, 116, -60, -9}, new byte[]{-108, -98, Ascii.NAK, -80, Ascii.GS, -95, Byte.MIN_VALUE, -126});
            oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ View f17099o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ PowerSpinnerView f17100o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ Activity f17101o00oo0Oo;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements PopupMenu.OnMenuItemClickListener {
            public o00oOOo0() {
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                o00oo0O0.this.f17100o00oo0O0.setText(menuItem.getTitle());
                if (!menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{126, 2, 75, Ascii.NAK, 69, 79, -122}, new byte[]{46, 112, 46, 99, 44, 42, -15, -125}))) {
                    if (menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{4, 111, 85, -25, 107, -126, 5, -108, 36, 123, 76, -25}, new byte[]{80, Ascii.SO, 62, -126, 75, -46, 108, -9}))) {
                        o00oo0O0.this.f17099o00oo0O.findViewById(R.id.settings).setVisibility(0);
                        String unused = oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{-100, -27, 86, 119, 105, -19, -79}, new byte[]{-20, -116, 53, 3, Ascii.FS, -97, -44, 8});
                        oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                    } else if (menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{103, Ascii.US, 74, -23, -4, -6, -74, -49, 93, Ascii.SUB}, new byte[]{49, 118, 46, -116, -109, -38, -11, -82}))) {
                        o00oo0O0.this.f17099o00oo0O.findViewById(R.id.settings).setVisibility(0);
                        String unused2 = oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{101, -45, -104, -73, -90, Ascii.NAK, 124, -93, Byte.MAX_VALUE}, new byte[]{19, -70, -4, -46, -55, 118, Ascii.GS, -49});
                        oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                    } else if (!menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-8, -90, -44, 108, 49, -18}, new byte[]{-73, -46, -68, 9, 67, -99, 111, -5}))) {
                        if (menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-124, 77, 86, 43, 104, -75, -37, 57, -87, 80, 70, 38, 99, -68, -120}, new byte[]{-52, 36, 50, 79, Ascii.CR, -37, -5, 106}))) {
                            o00oo0O0.this.f17099o00oo0O.findViewById(R.id.settings).setVisibility(8);
                        } else if (menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{71, -19, 77, -19, -63, Ascii.SYN, -1}, new byte[]{3, -124, 62, Byte.MIN_VALUE, -88, 101, -116, Byte.MIN_VALUE}))) {
                            oO0O00O.o00oOoOO();
                        } else if (menuItem.getTitle().toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{53, -71, Ascii.CR, 37, 2, Ascii.SUB, 94, 59, Ascii.US, -75, 9, 36, 69, 44, 17, Ascii.CAN, 4, -78, 9}, new byte[]{118, -47, 108, 75, 101, Byte.MAX_VALUE, 126, 109}))) {
                            oOo0000O.o00oOOo0(o00oo0O0.this.f17101o00oo0Oo);
                        }
                        return true;
                    } else {
                        o00oo0O0.this.f17099o00oo0O.findViewById(R.id.settings).setVisibility(0);
                        String unused3 = oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{99, -12, 77, 59, -119, -79}, new byte[]{Ascii.FF, Byte.MIN_VALUE, 37, 94, -5, -62, -116, 81});
                        oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                    }
                    oO0O00O.o00ooO00(oO0O00O.f17089o00oOo0o, true);
                    return true;
                }
                o00oo0O0.this.f17099o00oo0O.findViewById(R.id.settings).setVisibility(0);
                String unused4 = oO0O00O.f17088o00oOo0O = o0OOoO0.o00oo.o00oOOo0(new byte[]{45, Ascii.VT, Byte.MIN_VALUE, 125, -52, 77, Ascii.SI}, new byte[]{93, 121, -27, Ascii.VT, -91, 40, 120, 68});
                oO0O00O.o00oo(oO0O00O.f17089o00oOo0o);
                oO0O00O.o00ooO00(oO0O00O.f17089o00oOo0o, false);
                return true;
            }
        }

        public o00oo0O0(PowerSpinnerView powerSpinnerView, View view, Activity activity) {
            this.f17100o00oo0O0 = powerSpinnerView;
            this.f17099o00oo0O = view;
            this.f17101o00oo0Oo = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuInflater menuInflater;
            int i;
            PopupMenu popupMenu = new PopupMenu(App.o00oOOoO(), this.f17100o00oo0O0);
            if (!o0OO0oO.o00oOOo0().f14961o00oo0O.f14932o00oOOoO) {
                menuInflater = popupMenu.getMenuInflater();
                i = R.menu.temp0;
            } else if (o0OO0oO.f14946o00oOOo0.o00ooOO0() == 1) {
                menuInflater = popupMenu.getMenuInflater();
                i = R.menu.temp1;
            } else {
                menuInflater = popupMenu.getMenuInflater();
                i = R.menu.temp2;
            }
            menuInflater.inflate(i, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new o00oOOo0());
            popupMenu.show();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            oO0O00O.o00oOoO();
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ ZoomControls f17103o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f17104o00oo0O0;

        public o00ooO(int i, ZoomControls zoomControls) {
            this.f17104o00oo0O0 = i;
            this.f17103o00oo0O = zoomControls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int o0O0o2 = o0OO0oO.o00oOOo0().o00ooOO().o0O0o(oO0O00O.o00oOoO0()) + this.f17104o00oo0O0;
            if (o0O0o2 >= 100) {
                this.f17103o00oo0O.setIsZoomInEnabled(false);
                o0O0o2 = 100;
            }
            this.f17103o00oo0O.setIsZoomOutEnabled(true);
            o0OO0oO.f14946o00oOOo0.o00ooOO().o00ooO(o0O0o2, oO0O00O.f17088o00oOo0O);
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ ZoomControls f17105o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f17106o00oo0O0;

        public o00ooO0(int i, ZoomControls zoomControls) {
            this.f17106o00oo0O0 = i;
            this.f17105o00oo0O = zoomControls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int o0O0o2 = o0OO0oO.o00oOOo0().o00ooOO().o0O0o(oO0O00O.o00oOoO0()) - this.f17106o00oo0O0;
            if (o0O0o2 <= 0) {
                this.f17105o00oo0O.setIsZoomOutEnabled(false);
                o0O0o2 = 0;
            }
            this.f17105o00oo0O.setIsZoomInEnabled(true);
            o0OO0oO.f14946o00oOOo0.o00ooOO().o00ooO(o0O0o2, oO0O00O.f17088o00oOo0O);
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o implements View.OnClickListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ float f17107o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ float f17108o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ ZoomControls f17109o00oo0Oo;

        public o0O0o(float f, float f2, ZoomControls zoomControls) {
            this.f17108o00oo0O0 = f;
            this.f17107o00oo0O = f2;
            this.f17109o00oo0Oo = zoomControls;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o0OO0oO.o00oOOo0().o00ooOO().o00oo0OO(-this.f17108o00oo0O0, oO0O00O.o00oOoO0());
            if (o0OO0oO.f14946o00oOOo0.o00ooOO().o00oo0oO(oO0O00O.f17088o00oOo0O) <= this.f17107o00oo0O) {
                this.f17109o00oo0Oo.setIsZoomOutEnabled(false);
            }
            this.f17109o00oo0Oo.setIsZoomInEnabled(true);
        }
    }

    public static synchronized void o00oOoO() {
        synchronized (oO0O00O.class) {
            f17086o00oOOoO = 2;
            oo0ooO.o00oo0OO o00oo0oo = f17085o00oOOo0;
            if (o00oo0oo != null) {
                o00oo0oo.o00oOo0o();
                f17085o00oOOo0 = null;
            }
        }
    }

    public static String o00oOoO0() {
        return f17088o00oOo0O;
    }

    public static void o00oOoOO() {
        oO0OO0O.o00oOo0O(new o00oo0OO());
    }

    public static String o00oOoOo() {
        return f17088o00oOo0O;
    }

    public static void o00oOoo0(View view) {
        o00oOooo(view);
    }

    public static void o00oOooo(View view) {
        PowerSpinnerView powerSpinnerView = (PowerSpinnerView) view.findViewById(R.id.flip_settings);
        powerSpinnerView.setOnClickListener(new o00oOo0O(powerSpinnerView));
    }

    public static void o00oo(View view) {
        o00oo0OO(view);
        o00oo0Oo(view);
        o00oo00O(view);
        o00oOooo(view);
    }

    public static void o00oo0(View view) {
        ((AppCompatImageView) view.findViewById(R.id.rotate_btn)).setOnClickListener(new o00oOOoO());
        ((AppCompatImageView) view.findViewById(R.id.screen_rotate_btn)).setOnClickListener(new o00oOo00());
    }

    public static void o00oo00O(View view) {
        ((RoundMenuView) view.findViewById(R.id.move_menu)).setOnMenuViewClickListener(new o00oOOo0());
    }

    public static void o00oo0O(View view, Activity activity) {
        PowerSpinnerView powerSpinnerView = (PowerSpinnerView) view.findViewById(R.id.channels_select);
        powerSpinnerView.setOnClickListener(new o00oo0O0(powerSpinnerView, view, activity));
        view.findViewById(R.id.settings).setVisibility(8);
    }

    public static void o00oo0O0(View view, Activity activity) {
        o00oo0O(view, activity);
    }

    public static void o00oo0OO(View view) {
        ZoomControls zoomControls = (ZoomControls) view.findViewById(R.id.size_seekbar);
        float o00oo0oO2 = o0OO0oO.o00oOOo0().o00ooOO().o00oo0oO(f17088o00oOo0O);
        if (o00oo0oO2 <= -0.8f) {
            zoomControls.setIsZoomOutEnabled(false);
        } else {
            int i = (o00oo0oO2 > 1.0f ? 1 : (o00oo0oO2 == 1.0f ? 0 : -1));
            zoomControls.setIsZoomOutEnabled(true);
            if (i >= 0) {
                zoomControls.setIsZoomInEnabled(false);
                zoomControls.setOnZoomOutClickListener(new o0O0o(0.05f, -0.8f, zoomControls));
                zoomControls.setOnZoomInClickListener(new o00oo(0.05f, 1.0f, zoomControls));
            }
        }
        zoomControls.setIsZoomInEnabled(true);
        zoomControls.setOnZoomOutClickListener(new o0O0o(0.05f, -0.8f, zoomControls));
        zoomControls.setOnZoomInClickListener(new o00oo(0.05f, 1.0f, zoomControls));
    }

    public static void o00oo0Oo(View view) {
        ZoomControls zoomControls = (ZoomControls) view.findViewById(R.id.zoom_seekbar);
        int o0O0o2 = o0OO0oO.o00oOOo0().o00ooOO().o0O0o(f17088o00oOo0O);
        if (o0O0o2 < 5) {
            zoomControls.setIsZoomOutEnabled(false);
        } else {
            zoomControls.setIsZoomOutEnabled(true);
            if (o0O0o2 > 95) {
                zoomControls.setIsZoomInEnabled(false);
                zoomControls.setOnZoomOutClickListener(new o00ooO0(5, zoomControls));
                zoomControls.setOnZoomInClickListener(new o00ooO(5, zoomControls));
            }
        }
        zoomControls.setIsZoomInEnabled(true);
        zoomControls.setOnZoomOutClickListener(new o00ooO0(5, zoomControls));
        zoomControls.setOnZoomInClickListener(new o00ooO(5, zoomControls));
    }

    public static synchronized void o00oo0o(Activity activity) {
        synchronized (oO0O00O.class) {
            if (f17086o00oOOoO == 1) {
                return;
            }
            f17086o00oOOoO = 1;
            oo0ooO.o00oo0OO o00oo0oo = f17085o00oOOo0;
            if (o00oo0oo != null) {
                o00oo0oo.o00oOo0o();
                f17085o00oOOo0 = null;
            }
            f17085o00oOOo0 = new oo0ooO.o00oo0OO(activity);
            View inflate = LayoutInflater.from(App.o00oOOoO()).inflate(R.layout.activity_float, (ViewGroup) f17085o00oOOo0.o00oo00O(), false);
            f17089o00oOo0o = inflate;
            f17085o00oOOo0.o00oooo(inflate).o0O0000O(17).o0(new oO0O00()).o0O0Oo0();
            o00oo0o0(f17089o00oOo0o, activity);
        }
    }

    public static void o00oo0o0(View view, Activity activity) {
        o00oo0O(view, activity);
        o00oOooo(view);
        o00oo0OO(view);
        o00oo0Oo(view);
        o00oo00O(view);
        o00oo0(view);
    }

    public static void o00oo0oO(Activity activity) {
        oO0OO0O.o00oOo0O(new o00oo0(activity));
    }

    public static void o00ooO00(View view, boolean z) {
        int i = z ? 8 : 0;
        view.findViewById(R.id.size_txt).setVisibility(i);
        view.findViewById(R.id.size_seekbar).setVisibility(i);
        view.findViewById(R.id.zoom_txt).setVisibility(i);
        view.findViewById(R.id.zoom_seekbar).setVisibility(i);
        view.findViewById(R.id.move_txt).setVisibility(i);
        view.findViewById(R.id.move_menu).setVisibility(i);
        view.findViewById(R.id.bottom_view).setVisibility(z ? 0 : 8);
    }

    public static void o0O0o(Activity activity) {
        oO0OO0O.o00oOo0O(new o00oo00O(activity));
    }
}
