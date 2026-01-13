package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R;
import androidx.appcompat.widget.oo0ooO;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO00OO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o00ooO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f1116o00oOOoO = "AppCompatDrawableManag";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f1117o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static o00ooO f1118o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final PorterDuff.Mode f1119o00oOooO = PorterDuff.Mode.SRC_IN;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public oo0ooO f1120o00oOOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements oo0ooO.o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int[] f1121o00oOOo0 = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int[] f1122o00oOOoO = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int[] f1123o00oOo00 = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int[] f1126o00oOooO = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int[] f1124o00oOo0O = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final int[] f1125o00oOo0o = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        @Override // androidx.appcompat.widget.oo0ooO.o00oo00O
        public Drawable o00oOOo0(@o00oOooO.oo0oO0 oo0ooO oo0ooo, @o00oOooO.oo0oO0 Context context, int i) {
            int i2;
            if (i == R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{oo0ooo.o00oOoOo(context, R.drawable.abc_cab_background_internal_bg), oo0ooo.o00oOoOo(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == R.drawable.abc_ratingbar_material) {
                i2 = R.dimen.abc_star_big;
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                i2 = R.dimen.abc_star_medium;
            } else if (i != R.drawable.abc_ratingbar_small_material) {
                return null;
            } else {
                i2 = R.dimen.abc_star_small;
            }
            return o00oOooo(oo0ooo, context, i2);
        }

        @Override // androidx.appcompat.widget.oo0ooO.o00oo00O
        public ColorStateList o00oOOoO(@o00oOooO.oo0oO0 Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                return o00oOoo0(context);
            }
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return o00oOoOo(context);
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return o00oOoO0(context);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return o00oOoOO(context);
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (o00oOo0o(this.f1122o00oOOoO, i)) {
                return o0OO0o.o00oOo0o(context, R.attr.colorControlNormal);
            }
            if (o00oOo0o(this.f1124o00oOo0O, i)) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_default);
            }
            if (o00oOo0o(this.f1125o00oOo0o, i)) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return o00ooo0.o0.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.oo0ooO.o00oo00O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean o00oOo00(@o00oOooO.oo0oO0 android.content.Context r7, int r8, @o00oOooO.oo0oO0 android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.o00ooO.o00oOOo0()
                int[] r1 = r6.f1121o00oOOo0
                boolean r1 = r6.o00oOo0o(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = androidx.appcompat.R.attr.colorControlNormal
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1123o00oOo00
                boolean r1 = r6.o00oOo0o(r1, r8)
                if (r1 == 0) goto L22
                int r2 = androidx.appcompat.R.attr.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.f1126o00oOooO
                boolean r1 = r6.o00oOo0o(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = androidx.appcompat.R.drawable.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.o0O0OOOo.o00oOOo0(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.o0OO0o.o00oOooO(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.o00ooO.o00oOo0O(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o00ooO.o00oOOo0.o00oOo00(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.oo0ooO.o00oo00O
        public boolean o00oOo0O(@o00oOooO.oo0oO0 Context context, int i, @o00oOooO.oo0oO0 Drawable drawable) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = R.attr.colorControlNormal;
                o00oo00O(findDrawableByLayerId, o0OO0o.o00oOooO(context, i2), o00ooO.f1119o00oOooO);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908303);
                int o00oOooO2 = o0OO0o.o00oOooO(context, i2);
                PorterDuff.Mode mode = o00ooO.f1119o00oOooO;
                o00oo00O(findDrawableByLayerId2, o00oOooO2, mode);
                o00oo00O(layerDrawable.findDrawableByLayerId(16908301), o0OO0o.o00oOooO(context, R.attr.colorControlActivated), mode);
                return true;
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                o00oo00O(layerDrawable2.findDrawableByLayerId(16908288), o0OO0o.o00oOo00(context, R.attr.colorControlNormal), o00ooO.f1119o00oOooO);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = R.attr.colorControlActivated;
                int o00oOooO3 = o0OO0o.o00oOooO(context, i3);
                PorterDuff.Mode mode2 = o00ooO.f1119o00oOooO;
                o00oo00O(findDrawableByLayerId3, o00oOooO3, mode2);
                o00oo00O(layerDrawable2.findDrawableByLayerId(16908301), o0OO0o.o00oOooO(context, i3), mode2);
                return true;
            } else {
                return false;
            }
        }

        public final boolean o00oOo0o(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList o00oOoO(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O00O int i) {
            int o00oOooO2 = o0OO0o.o00oOooO(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{o0OO0o.f1296o00oOo00, o0OO0o.f1298o00oOo0o, o0OO0o.f1304o00oOooO, o0OO0o.f1302o00oOoOo}, new int[]{o0OO0o.o00oOo00(context, R.attr.colorButtonNormal), oOO00OO.o00oo0o(o00oOooO2, i), oOO00OO.o00oo0o(o00oOooO2, i), i});
        }

        public final ColorStateList o00oOoO0(@o00oOooO.oo0oO0 Context context) {
            return o00oOoO(context, 0);
        }

        public final ColorStateList o00oOoOO(@o00oOooO.oo0oO0 Context context) {
            return o00oOoO(context, o0OO0o.o00oOooO(context, R.attr.colorAccent));
        }

        public final ColorStateList o00oOoOo(@o00oOooO.oo0oO0 Context context) {
            return o00oOoO(context, o0OO0o.o00oOooO(context, R.attr.colorButtonNormal));
        }

        public final ColorStateList o00oOoo0(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = R.attr.colorSwitchThumbNormal;
            ColorStateList o00oOo0o2 = o0OO0o.o00oOo0o(context, i);
            if (o00oOo0o2 == null || !o00oOo0o2.isStateful()) {
                iArr[0] = o0OO0o.f1296o00oOo00;
                iArr2[0] = o0OO0o.o00oOo00(context, i);
                iArr[1] = o0OO0o.f1300o00oOoO0;
                iArr2[1] = o0OO0o.o00oOooO(context, R.attr.colorControlActivated);
                iArr[2] = o0OO0o.f1302o00oOoOo;
                iArr2[2] = o0OO0o.o00oOooO(context, i);
            } else {
                int[] iArr3 = o0OO0o.f1296o00oOo00;
                iArr[0] = iArr3;
                iArr2[0] = o00oOo0o2.getColorForState(iArr3, 0);
                iArr[1] = o0OO0o.f1300o00oOoO0;
                iArr2[1] = o0OO0o.o00oOooO(context, R.attr.colorControlActivated);
                iArr[2] = o0OO0o.f1302o00oOoOo;
                iArr2[2] = o00oOo0o2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.oo0ooO.o00oo00O
        public PorterDuff.Mode o00oOooO(int i) {
            if (i == R.drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public final LayerDrawable o00oOooo(@o00oOooO.oo0oO0 oo0ooO oo0ooo, @o00oOooO.oo0oO0 Context context, @o00oOooO.o0O00oO0 int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable o00oOoOo2 = oo0ooo.o00oOoOo(context, R.drawable.abc_star_black_48dp);
            Drawable o00oOoOo3 = oo0ooo.o00oOoOo(context, R.drawable.abc_star_half_black_48dp);
            if ((o00oOoOo2 instanceof BitmapDrawable) && o00oOoOo2.getIntrinsicWidth() == dimensionPixelSize && o00oOoOo2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) o00oOoOo2;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                o00oOoOo2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                o00oOoOo2.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((o00oOoOo3 instanceof BitmapDrawable) && o00oOoOo3.getIntrinsicWidth() == dimensionPixelSize && o00oOoOo3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) o00oOoOo3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                o00oOoOo3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                o00oOoOo3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void o00oo00O(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (o0O0OOOo.o00oOOo0(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = o00ooO.f1119o00oOooO;
            }
            drawable.setColorFilter(o00ooO.o00oOo0O(i, mode));
        }
    }

    public static synchronized o00ooO o00oOOoO() {
        o00ooO o00ooo;
        synchronized (o00ooO.class) {
            if (f1118o00oOo0O == null) {
                o00oOoOO();
            }
            o00ooo = f1118o00oOo0O;
        }
        return o00ooo;
    }

    public static synchronized PorterDuffColorFilter o00oOo0O(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter o00oOooo2;
        synchronized (o00ooO.class) {
            o00oOooo2 = oo0ooO.o00oOooo(i, mode);
        }
        return o00oOooo2;
    }

    public static synchronized void o00oOoOO() {
        synchronized (o00ooO.class) {
            if (f1118o00oOo0O == null) {
                o00ooO o00ooo = new o00ooO();
                f1118o00oOo0O = o00ooo;
                o00ooo.f1120o00oOOo0 = oo0ooO.o00oOoO();
                f1118o00oOo0O.f1120o00oOOo0.o00oo0oO(new o00oOOo0());
            }
        }
    }

    public static void o00oOoOo(Drawable drawable, o0OO o0oo, int[] iArr) {
        oo0ooO.o00oo(drawable, o0oo, iArr);
    }

    public synchronized Drawable o00oOo00(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        return this.f1120o00oOOo0.o00oOoOo(context, i);
    }

    public synchronized ColorStateList o00oOo0o(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i) {
        return this.f1120o00oOOo0.o00oo00O(context, i);
    }

    public synchronized Drawable o00oOoO(@o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 ooo0Oo0 ooo0oo0, @o00oOooO.o0O0O0o0 int i) {
        return this.f1120o00oOOo0.o00oo0o(context, ooo0oo0, i);
    }

    public synchronized void o00oOoO0(@o00oOooO.oo0oO0 Context context) {
        this.f1120o00oOOo0.o00oo0o0(context);
    }

    public boolean o00oOoo0(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, @o00oOooO.oo0oO0 Drawable drawable) {
        return this.f1120o00oOOo0.o00ooO00(context, i, drawable);
    }

    public synchronized Drawable o00oOooO(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0O0O0o0 int i, boolean z) {
        return this.f1120o00oOOo0.o00oOoo0(context, i, z);
    }
}
