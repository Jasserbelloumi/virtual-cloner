package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R;
import androidx.appcompat.app.o00oOOoO;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.o0O0OOO0;
import androidx.appcompat.widget.o0O0o00;
import androidx.appcompat.widget.o0OOO0;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O0O0O;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o00oOoOo.o00oo0;
import o00oOoOo.o0O0o;
import o00oOooO.o0O00O0;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooOoo.oO00OO;
import o00ooo0o.o0O0OO;
import o0O000oo.o0O0000O;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OO;
import o0O000oo.o0OO0oO0;
import o0O000oo.o0OOo000;
import o0O000oo.o0ooO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends androidx.appcompat.app.o00oo0OO implements o00oOoO.o00oOOo0, LayoutInflater.Factory2 {

    /* renamed from: o0O0OOO  reason: collision with root package name */
    public static final androidx.collection.o00ooO0<String, Integer> f243o0O0OOO = new androidx.collection.o00ooO0<>();

    /* renamed from: o0O0OOOo  reason: collision with root package name */
    public static final boolean f244o0O0OOOo = false;

    /* renamed from: o0O0OOo  reason: collision with root package name */
    public static final int[] f245o0O0OOo = {16842836};

    /* renamed from: o0O0OOoO  reason: collision with root package name */
    public static final boolean f246o0O0OOoO = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: o0O0OOoo  reason: collision with root package name */
    public static final boolean f247o0O0OOoo = true;

    /* renamed from: o0O0Oo0  reason: collision with root package name */
    public static final String f248o0O0Oo0 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: o0OooO0  reason: collision with root package name */
    public static boolean f249o0OooO0;

    /* renamed from: o0  reason: collision with root package name */
    public o0O00 f250o0;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public final Object f251o00ooo0;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public final Context f252o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public Window f253o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public o0O0000O f254o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public final androidx.appcompat.app.o00oOoO f255o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public androidx.appcompat.app.o00oOOo0 f256o00oooOo;

    /* renamed from: o00oooo  reason: collision with root package name */
    public CharSequence f257o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public MenuInflater f258o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public o0O0OOO0 f259o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public o00oo0O f260o00ooooo;

    /* renamed from: o0O00  reason: collision with root package name */
    public boolean f261o0O00;

    /* renamed from: o0O000  reason: collision with root package name */
    public Runnable f262o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public o00oOoOo.o00oo0 f263o0O00000;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public ActionBarContextView f264o0O0000O;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public PopupWindow f265o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public o0OO0oO0 f266o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public boolean f267o0O000Oo;

    /* renamed from: o0O000o  reason: collision with root package name */
    public View f268o0O000o;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public TextView f269o0O000o0;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public boolean f270o0O000oo;

    /* renamed from: o0O00O  reason: collision with root package name */
    public boolean f271o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public boolean f272o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public boolean f273o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public boolean f274o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public PanelFeatureState[] f275o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public PanelFeatureState f276o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public boolean f277o0O00OoO;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public boolean f278o0O00Ooo;

    /* renamed from: o0O00o  reason: collision with root package name */
    public int f279o0O00o;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public boolean f280o0O00o00;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public Configuration f281o0O00o0O;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public int f282o0O00o0o;

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public int f283o0O00oO0;

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public boolean f284o0O0O0O;

    /* renamed from: o0O0O0Oo  reason: collision with root package name */
    public boolean f285o0O0O0Oo;

    /* renamed from: o0O0O0o  reason: collision with root package name */
    public final Runnable f286o0O0O0o;

    /* renamed from: o0O0O0o0  reason: collision with root package name */
    public int f287o0O0O0o0;

    /* renamed from: o0O0O0oO  reason: collision with root package name */
    public boolean f288o0O0O0oO;

    /* renamed from: o0O0O0oo  reason: collision with root package name */
    public Rect f289o0O0O0oo;

    /* renamed from: o0O0OO  reason: collision with root package name */
    public OnBackInvokedDispatcher f290o0O0OO;

    /* renamed from: o0O0OO0  reason: collision with root package name */
    public androidx.appcompat.app.o00ooO0 f291o0O0OO0;

    /* renamed from: o0O0OO0O  reason: collision with root package name */
    public androidx.appcompat.app.o0O00000 f292o0O0OO0O;

    /* renamed from: o0O0OOO0  reason: collision with root package name */
    public OnBackInvokedCallback f293o0O0OOO0;

    /* renamed from: o0O0oo0o  reason: collision with root package name */
    public o0O000O f294o0O0oo0o;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public boolean f295o0OoO00O;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public ViewGroup f296o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public boolean f297o0OoOoOo;

    /* renamed from: o0oO0O0o  reason: collision with root package name */
    public o0O000O f298o0oO0O0o;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public boolean f299o0oO0Ooo;

    /* renamed from: o0ooO  reason: collision with root package name */
    public Rect f300o0ooO;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public boolean f301o0ooOoOO;

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f302o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f303o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f304o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f305o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f306o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public View f307o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public ViewGroup f308o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public View f309o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public androidx.appcompat.view.menu.o00oOoO f310o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public androidx.appcompat.view.menu.o00oOo00 f311o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f312o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public Context f313o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public boolean f314o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public boolean f315o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f316o00oo0O = false;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f317o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public boolean f318o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f319o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public Bundle f320o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f321o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public Bundle f322o00oo0oO;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

            /* renamed from: o00oo0O  reason: collision with root package name */
            public boolean f323o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public int f324o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public Bundle f325o00oo0Oo;

            /* loaded from: classes.dex */
            public class o00oOOo0 implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: o00oOOo0 */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.o00oOOo0(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: o00oOOoO */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.o00oOOo0(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: o00oOo00 */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public static SavedState o00oOOo0(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f324o00oo0O0 = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f323o00oo0O = z;
                if (z) {
                    savedState.f325o00oo0Oo = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f324o00oo0O0);
                parcel.writeInt(this.f323o00oo0O ? 1 : 0);
                if (this.f323o00oo0O) {
                    parcel.writeBundle(this.f325o00oo0Oo);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f302o00oOOo0 = i;
        }

        public void o00oOOo0() {
            Bundle bundle;
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f310o00oOoOo;
            if (o00oooo2 == null || (bundle = this.f320o00oo0o) == null) {
                return;
            }
            o00oooo2.restorePresenterStates(bundle);
            this.f320o00oo0o = null;
        }

        public void o00oOOoO() {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = this.f310o00oOoOo;
            if (o00oooo2 != null) {
                o00oooo2.removeMenuPresenter(this.f311o00oOoo0);
            }
            this.f311o00oOoo0 = null;
        }

        public androidx.appcompat.view.menu.o0O0o o00oOo00(o00oo0O.o00oOOo0 o00oooo02) {
            if (this.f310o00oOoOo == null) {
                return null;
            }
            if (this.f311o00oOoo0 == null) {
                androidx.appcompat.view.menu.o00oOo00 o00ooo002 = new androidx.appcompat.view.menu.o00oOo00(this.f313o00oOooo, R.layout.abc_list_menu_item_layout);
                this.f311o00oOoo0 = o00ooo002;
                o00ooo002.setCallback(o00oooo02);
                this.f310o00oOoOo.addMenuPresenter(this.f311o00oOoo0);
            }
            return this.f311o00oOoo0.getMenuView(this.f308o00oOoO0);
        }

        public void o00oOo0O(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f302o00oOOo0 = savedState.f324o00oo0O0;
            this.f321o00oo0o0 = savedState.f323o00oo0O;
            this.f320o00oo0o = savedState.f325o00oo0Oo;
            this.f307o00oOoO = null;
            this.f308o00oOoO0 = null;
        }

        public Parcelable o00oOo0o() {
            SavedState savedState = new SavedState();
            savedState.f324o00oo0O0 = this.f302o00oOOo0;
            savedState.f323o00oo0O = this.f318o00oo0OO;
            if (this.f310o00oOoOo != null) {
                Bundle bundle = new Bundle();
                savedState.f325o00oo0Oo = bundle;
                this.f310o00oOoOo.savePresenterStates(bundle);
            }
            return savedState;
        }

        public void o00oOoO(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = R.style.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            o00oOoOo.o00oo0O0 o00oo0o02 = new o00oOoOo.o00oo0O0(context, 0);
            o00oo0o02.getTheme().setTo(newTheme);
            this.f313o00oOooo = o00oo0o02;
            TypedArray obtainStyledAttributes = o00oo0o02.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.f303o00oOOoO = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.f306o00oOo0o = obtainStyledAttributes.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        public void o00oOoO0(androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            androidx.appcompat.view.menu.o00oOo00 o00ooo002;
            androidx.appcompat.view.menu.o00oOoO o00oooo3 = this.f310o00oOoOo;
            if (o00oooo2 == o00oooo3) {
                return;
            }
            if (o00oooo3 != null) {
                o00oooo3.removeMenuPresenter(this.f311o00oOoo0);
            }
            this.f310o00oOoOo = o00oooo2;
            if (o00oooo2 == null || (o00ooo002 = this.f311o00oOoo0) == null) {
                return;
            }
            o00oooo2.addMenuPresenter(o00ooo002);
        }

        public boolean o00oOooO() {
            if (this.f307o00oOoO == null) {
                return false;
            }
            return this.f309o00oOoOO != null || this.f311o00oOoo0.o00oOOo0().getCount() > 0;
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o0 {
        public static void o00oOOo0(@oo0oO0 Configuration configuration, @oo0oO0 Configuration configuration2, @oo0oO0 Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Thread.UncaughtExceptionHandler {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f326o00oOOo0;

        public o00oOOo0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f326o00oOOo0 = uncaughtExceptionHandler;
        }

        public final boolean o00oOOo0(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@oo0oO0 Thread thread, @oo0oO0 Throwable th) {
            if (!o00oOOo0(th)) {
                this.f326o00oOOo0.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.f248o0O0Oo0);
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f326o00oOOo0.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f287o0O0O0o0 & 1) != 0) {
                appCompatDelegateImpl.o0O0oo0o(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f287o0O0O0o0 & 4096) != 0) {
                appCompatDelegateImpl2.o0O0oo0o(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f285o0O0O0Oo = false;
            appCompatDelegateImpl3.f287o0O0O0o0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o0ooO {
        public o00oOo00() {
        }

        @Override // o0O000oo.o0ooO
        public o0OOo000 onApplyWindowInsets(View view, o0OOo000 o0ooo000) {
            int o00oo0Oo2 = o0ooo000.o00oo0Oo();
            int o0O0oOO2 = AppCompatDelegateImpl.this.o0O0oOO(o0ooo000, null);
            if (o00oo0Oo2 != o0O0oOO2) {
                o0ooo000 = o0ooo000.o00ooOO(o0ooo000.o00oo0O0(), o0O0oOO2, o0ooo000.o00oo0O(), o0ooo000.o00oo0OO());
            }
            return o0O0o00O.o0O0o0(view, o0ooo000);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O implements o0O0o00.o00oOOo0 {
        public o00oOo0O() {
        }

        @Override // androidx.appcompat.widget.o0O0o00.o00oOOo0
        public void o00oOOo0(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.o0O0oOO(null, rect);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOoO implements ContentFrameLayout.o00oOOo0 {
        public o00oOoO() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.o00oOOo0
        public void o00oOOo0() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.o00oOOo0
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.o0O0O0O();
        }
    }

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oo {
        @o0O0O0Oo
        public static Context o00oOOo0(@oo0oO0 Context context, @oo0oO0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void o00oOOoO(@oo0oO0 Configuration configuration, @oo0oO0 Configuration configuration2, @oo0oO0 Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        @o0O0O0Oo
        public static int o00oOo00(Configuration configuration) {
            return configuration.getLayoutDirection();
        }

        @o0O0O0Oo
        public static void o00oOo0O(View view, int i) {
            view.setLayoutDirection(i);
        }

        @o0O0O0Oo
        public static void o00oOo0o(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }

        @o0O0O0Oo
        public static void o00oOooO(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }
    }

    /* loaded from: classes.dex */
    public class o00oo0 extends o0OO {
        public o00oo0() {
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOOoO(View view) {
            AppCompatDelegateImpl.this.f264o0O0000O.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f266o0O000O.o00oo0oO(null);
            AppCompatDelegateImpl.this.f266o0O000O = null;
        }

        @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
        public void o00oOo00(View view) {
            AppCompatDelegateImpl.this.f264o0O0000O.setVisibility(0);
            if (AppCompatDelegateImpl.this.f264o0O0000O.getParent() instanceof View) {
                o0O0o00O.o0O0oOO0((View) AppCompatDelegateImpl.this.f264o0O0000O.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oo00O implements Runnable {

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o0OO {
            public o00oOOo0() {
            }

            @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
            public void o00oOOoO(View view) {
                AppCompatDelegateImpl.this.f264o0O0000O.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f266o0O000O.o00oo0oO(null);
                AppCompatDelegateImpl.this.f266o0O000O = null;
            }

            @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
            public void o00oOo00(View view) {
                AppCompatDelegateImpl.this.f264o0O0000O.setVisibility(0);
            }
        }

        public o00oo00O() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f265o0O0000o.showAtLocation(appCompatDelegateImpl.f264o0O0000O, 55, 0, 0);
            AppCompatDelegateImpl.this.o0O0O0Oo();
            if (!AppCompatDelegateImpl.this.o0oOo0O0()) {
                AppCompatDelegateImpl.this.f264o0O0000O.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f264o0O0000O.setVisibility(0);
                return;
            }
            AppCompatDelegateImpl.this.f264o0O0000O.setAlpha(0.0f);
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl2.f266o0O000O = o0O0o00O.o00oOoO0(appCompatDelegateImpl2.f264o0O0000O).o00oOOoO(1.0f);
            AppCompatDelegateImpl.this.f266o0O000O.o00oo0oO(new o00oOOo0());
        }
    }

    /* loaded from: classes.dex */
    public final class o00oo0O implements o00oo0O.o00oOOo0 {
        public o00oo0O() {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public boolean o00oOOo0(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            Window.Callback o0O0OOoo2 = AppCompatDelegateImpl.this.o0O0OOoo();
            if (o0O0OOoo2 != null) {
                o0O0OOoo2.onMenuOpened(108, o00oooo2);
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public void onCloseMenu(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
            AppCompatDelegateImpl.this.o0O00Ooo(o00oooo2);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        boolean o00oOOo0(int i);

        @o0OO00OO
        View onCreatePanelView(int i);
    }

    /* loaded from: classes.dex */
    public class o00oo0OO implements o00oOOoO.InterfaceC0005o00oOOoO {
        public o00oo0OO() {
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOOo0(Drawable drawable, int i) {
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = AppCompatDelegateImpl.this.o00ooO0o();
            if (o00ooO0o2 != null) {
                o00ooO0o2.o0O00O0o(drawable);
                o00ooO0o2.o0O00(i);
            }
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Drawable o00oOOoO() {
            o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(o00oOooO(), null, new int[]{R.attr.homeAsUpIndicator});
            Drawable o00oOoO2 = o00ooOo02.o00oOoO(0);
            o00ooOo02.o00ooOoo();
            return o00oOoO2;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public void o00oOo00(int i) {
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = AppCompatDelegateImpl.this.o00ooO0o();
            if (o00ooO0o2 != null) {
                o00ooO0o2.o0O00(i);
            }
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public boolean o00oOo0O() {
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = AppCompatDelegateImpl.this.o00ooO0o();
            return (o00ooO0o2 == null || (o00ooO0o2.o00oo0OO() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.o00oOOoO.InterfaceC0005o00oOOoO
        public Context o00oOooO() {
            return AppCompatDelegateImpl.this.o0ooO();
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00ooO {
        @o0O0O0Oo
        public static void o00oOOo0(@oo0oO0 Configuration configuration, @oo0oO0 Configuration configuration2, @oo0oO0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @o0O0O0Oo
        public static o0O000.o00ooO0 o00oOOoO(Configuration configuration) {
            return o0O000.o00ooO0.o00oOo00(configuration.getLocales().toLanguageTags());
        }

        @o0O0O0Oo
        public static void o00oOo00(o0O000.o00ooO0 o00ooo02) {
            LocaleList.setDefault(LocaleList.forLanguageTags(o00ooo02.o00oo00O()));
        }

        @o0O0O0Oo
        public static void o00oOooO(Configuration configuration, o0O000.o00ooO0 o00ooo02) {
            configuration.setLocales(LocaleList.forLanguageTags(o00ooo02.o00oo00O()));
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00ooO0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @o0O0O0Oo
        public static String o00oOOoO(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* loaded from: classes.dex */
    public final class o0O00 implements o00oo0O.o00oOOo0 {
        public o0O00() {
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public boolean o00oOOo0(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
            Window.Callback o0O0OOoo2;
            if (o00oooo2 == o00oooo2.getRootMenu()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (!appCompatDelegateImpl.f261o0O00 || (o0O0OOoo2 = appCompatDelegateImpl.o0O0OOoo()) == null || AppCompatDelegateImpl.this.f280o0O00o00) {
                    return true;
                }
                o0O0OOoo2.onMenuOpened(108, o00oooo2);
                return true;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.o00oo0O.o00oOOo0
        public void onCloseMenu(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
            androidx.appcompat.view.menu.o00oOoO rootMenu = o00oooo2.getRootMenu();
            boolean z2 = rootMenu != o00oooo2;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                o00oooo2 = rootMenu;
            }
            PanelFeatureState o0O0O0oO2 = appCompatDelegateImpl.o0O0O0oO(o00oooo2);
            if (o0O0O0oO2 != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.o0O00o0o(o0O0O0oO2, z);
                    return;
                }
                AppCompatDelegateImpl.this.o0O00OoO(o0O0O0oO2.f302o00oOOo0, o0O0O0oO2, rootMenu);
                AppCompatDelegateImpl.this.o0O00o0o(o0O0O0oO2, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o0O000 extends o0O000O {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final PowerManager f337o00oOo00;

        public o0O000(@oo0oO0 Context context) {
            super();
            this.f337o00oOo00 = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public IntentFilter o00oOOoO() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public int o00oOo00() {
            return o00ooO0.o00oOOo0(this.f337o00oOo00) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public void o00oOo0O() {
            AppCompatDelegateImpl.this.o00oOo0o();
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o0O00000 {
        @o0O0O0Oo
        public static OnBackInvokedDispatcher o00oOOo0(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @o0O0O0Oo
        public static OnBackInvokedCallback o00oOOoO(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o00oo0O0
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.o0O0OoO0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @o0O0O0Oo
        public static void o00oOo00(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class o0O0000O extends o00oOoOo.o0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public o00oo0O0 f339o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f340o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f341o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f342o00oo0o0;

        public o0O0000O(Window.Callback callback) {
            super(callback);
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f342o00oo0o0 ? o00oOOo0().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.o0oO0O0o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.o0O0OoOo(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean o00oOOoO(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f342o00oo0o0 = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f342o00oo0o0 = false;
            }
        }

        public void o00oOo00(Window.Callback callback) {
            try {
                this.f340o00oo0Oo = true;
                callback.onContentChanged();
            } finally {
                this.f340o00oo0Oo = false;
            }
        }

        public void o00oOo0O(@o0OO00OO o00oo0O0 o00oo0o02) {
            this.f339o00oo0O = o00oo0o02;
        }

        public final ActionMode o00oOo0o(ActionMode.Callback callback) {
            o0O0o.o00oOOo0 o00oooo02 = new o0O0o.o00oOOo0(AppCompatDelegateImpl.this.f252o00ooo0O, callback);
            o00oOoOo.o00oo0 o0O00O02 = AppCompatDelegateImpl.this.o0O00O0(o00oooo02);
            if (o0O00O02 != null) {
                return o00oooo02.o00oOo0O(o0O00O02);
            }
            return null;
        }

        public void o00oOooO(Window.Callback callback, int i, Menu menu) {
            try {
                this.f341o00oo0o = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f341o00oo0o = false;
            }
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f340o00oo0Oo) {
                o00oOOo0().onContentChanged();
            }
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.o00oOoO)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            o00oo0O0 o00oo0o02 = this.f339o00oo0O;
            return (o00oo0o02 == null || (onCreatePanelView = o00oo0o02.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.o0O0OooO(i);
            return true;
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f341o00oo0o) {
                o00oOOo0().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.o0O0o000(i);
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = menu instanceof androidx.appcompat.view.menu.o00oOoO ? (androidx.appcompat.view.menu.o00oOoO) menu : null;
            if (i == 0 && o00oooo2 == null) {
                return false;
            }
            boolean z = true;
            if (o00oooo2 != null) {
                o00oooo2.setOverrideVisibleItems(true);
            }
            o00oo0O0 o00oo0o02 = this.f339o00oo0O;
            if (o00oo0o02 == null || !o00oo0o02.o00oOOo0(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (o00oooo2 != null) {
                o00oooo2.setOverrideVisibleItems(false);
            }
            return z;
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        @o0OOooO0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.o00oOoO o00oooo2;
            PanelFeatureState o0O0OOOo2 = AppCompatDelegateImpl.this.o0O0OOOo(0, true);
            if (o0O0OOOo2 == null || (o00oooo2 = o0O0OOOo2.f310o00oOoOo) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, o00oooo2, i);
            }
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // o00oOoOo.o0, android.view.Window.Callback
        @o0OOooO0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (AppCompatDelegateImpl.this.o00ooOo() && i == 0) ? o00oOo0o(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public abstract class o0O000O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public BroadcastReceiver f344o00oOOo0;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends BroadcastReceiver {
            public o00oOOo0() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o0O000O.this.o00oOo0O();
            }
        }

        public o0O000O() {
        }

        public void o00oOOo0() {
            BroadcastReceiver broadcastReceiver = this.f344o00oOOo0;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f252o00ooo0O.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f344o00oOOo0 = null;
            }
        }

        @o0OO00OO
        public abstract IntentFilter o00oOOoO();

        public abstract int o00oOo00();

        public abstract void o00oOo0O();

        public void o00oOo0o() {
            o00oOOo0();
            IntentFilter o00oOOoO2 = o00oOOoO();
            if (o00oOOoO2 == null || o00oOOoO2.countActions() == 0) {
                return;
            }
            if (this.f344o00oOOo0 == null) {
                this.f344o00oOOo0 = new o00oOOo0();
            }
            AppCompatDelegateImpl.this.f252o00ooo0O.registerReceiver(this.f344o00oOOo0, o00oOOoO2);
        }

        public boolean o00oOooO() {
            return this.f344o00oOOo0 != null;
        }
    }

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o0O000Oo {
        public static void o00oOOo0(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class o0O000o0 extends ContentFrameLayout {
        public o0O000o0(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.o0oO0O0o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean o00oOo00(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && o00oOo00((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.o0O00o0O(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(o00oOo0o.o00oOo00.o00oOOoO(getContext(), i));
        }
    }

    /* loaded from: classes.dex */
    public class o0O0o implements o00oo0.o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o00oo0.o00oOOo0 f348o00oOOo0;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o0OO {
            public o00oOOo0() {
            }

            @Override // o0O000oo.o0OO, o0O000oo.o0OO0oO
            public void o00oOOoO(View view) {
                AppCompatDelegateImpl.this.f264o0O0000O.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f265o0O0000o;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f264o0O0000O.getParent() instanceof View) {
                    o0O0o00O.o0O0oOO0((View) AppCompatDelegateImpl.this.f264o0O0000O.getParent());
                }
                AppCompatDelegateImpl.this.f264o0O0000O.o00oo0o();
                AppCompatDelegateImpl.this.f266o0O000O.o00oo0oO(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f266o0O000O = null;
                o0O0o00O.o0O0oOO0(appCompatDelegateImpl2.f296o0OoOoOO);
            }
        }

        public o0O0o(o00oo0.o00oOOo0 o00oooo02) {
            this.f348o00oOOo0 = o00oooo02;
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOOo0(o00oOoOo.o00oo0 o00oo0Var, MenuItem menuItem) {
            return this.f348o00oOOo0.o00oOOo0(o00oo0Var, menuItem);
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public void o00oOOoO(o00oOoOo.o00oo0 o00oo0Var) {
            this.f348o00oOOo0.o00oOOoO(o00oo0Var);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f265o0O0000o != null) {
                appCompatDelegateImpl.f253o00ooo0o.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f262o0O000);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f264o0O0000O != null) {
                appCompatDelegateImpl2.o0O0O0Oo();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f266o0O000O = o0O0o00O.o00oOoO0(appCompatDelegateImpl3.f264o0O0000O).o00oOOoO(0.0f);
                AppCompatDelegateImpl.this.f266o0O000O.o00oo0oO(new o00oOOo0());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.o00oOoO o00oooo2 = appCompatDelegateImpl4.f255o00oooOO;
            if (o00oooo2 != null) {
                o00oooo2.onSupportActionModeFinished(appCompatDelegateImpl4.f263o0O00000);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f263o0O00000 = null;
            o0O0o00O.o0O0oOO0(appCompatDelegateImpl5.f296o0OoOoOO);
            AppCompatDelegateImpl.this.o0O0oO();
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOo00(o00oOoOo.o00oo0 o00oo0Var, Menu menu) {
            o0O0o00O.o0O0oOO0(AppCompatDelegateImpl.this.f296o0OoOoOO);
            return this.f348o00oOOo0.o00oOo00(o00oo0Var, menu);
        }

        @Override // o00oOoOo.o00oo0.o00oOOo0
        public boolean o00oOooO(o00oOoOo.o00oo0 o00oo0Var, Menu menu) {
            return this.f348o00oOOo0.o00oOooO(o00oo0Var, menu);
        }
    }

    /* loaded from: classes.dex */
    public class o0OoOoOo extends o0O000O {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final androidx.appcompat.app.o0O000o0 f351o00oOo00;

        public o0OoOoOo(@oo0oO0 androidx.appcompat.app.o0O000o0 o0o000o0) {
            super();
            this.f351o00oOo00 = o0o000o0;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public IntentFilter o00oOOoO() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public int o00oOo00() {
            return this.f351o00oOo00.o00oOooO() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.o0O000O
        public void o00oOo0O() {
            AppCompatDelegateImpl.this.o00oOo0o();
        }
    }

    public AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.o00oOoO o00oooo2) {
        this(activity, null, o00oooo2, activity);
    }

    public AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.o00oOoO o00oooo2) {
        this(dialog.getContext(), dialog.getWindow(), o00oooo2, dialog);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, androidx.appcompat.app.o00oOoO o00oooo2) {
        this(context, null, o00oooo2, activity);
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.o00oOoO o00oooo2) {
        this(context, window, o00oooo2, context);
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.o00oOoO o00oooo2, Object obj) {
        androidx.collection.o00ooO0<String, Integer> o00ooo02;
        Integer num;
        AppCompatActivity o0O0oO02;
        this.f266o0O000O = null;
        this.f297o0OoOoOo = true;
        this.f282o0O00o0o = -100;
        this.f286o0O0O0o = new o00oOOoO();
        this.f252o00ooo0O = context;
        this.f255o00oooOO = o00oooo2;
        this.f251o00ooo0 = obj;
        if (this.f282o0O00o0o == -100 && (obj instanceof Dialog) && (o0O0oO02 = o0O0oO0()) != null) {
            this.f282o0O00o0o = o0O0oO02.o0O000o().o0O0o();
        }
        if (this.f282o0O00o0o == -100 && (num = (o00ooo02 = f243o0O0OOO).get(obj.getClass().getName())) != null) {
            this.f282o0O00o0o = num.intValue();
            o00ooo02.remove(obj.getClass().getName());
        }
        if (window != null) {
            o0O00OOO(window);
        }
        androidx.appcompat.widget.o00ooO.o00oOoOO();
    }

    @oo0oO0
    public static Configuration o0O0O0oo(@oo0oO0 Configuration configuration, @o0OO00OO Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            o00ooO.o00oOOo0(configuration, configuration2, configuration3);
            int i5 = configuration.touchscreen;
            int i6 = configuration2.touchscreen;
            if (i5 != i6) {
                configuration3.touchscreen = i6;
            }
            int i7 = configuration.keyboard;
            int i8 = configuration2.keyboard;
            if (i7 != i8) {
                configuration3.keyboard = i8;
            }
            int i9 = configuration.keyboardHidden;
            int i10 = configuration2.keyboardHidden;
            if (i9 != i10) {
                configuration3.keyboardHidden = i10;
            }
            int i11 = configuration.navigation;
            int i12 = configuration2.navigation;
            if (i11 != i12) {
                configuration3.navigation = i12;
            }
            int i13 = configuration.navigationHidden;
            int i14 = configuration2.navigationHidden;
            if (i13 != i14) {
                configuration3.navigationHidden = i14;
            }
            int i15 = configuration.orientation;
            int i16 = configuration2.orientation;
            if (i15 != i16) {
                configuration3.orientation = i16;
            }
            int i17 = configuration.screenLayout & 15;
            int i18 = configuration2.screenLayout;
            if (i17 != (i18 & 15)) {
                configuration3.screenLayout |= i18 & 15;
            }
            int i19 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i20 & PsExtractor.AUDIO_STREAM;
            }
            int i21 = configuration.screenLayout & 48;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 48)) {
                configuration3.screenLayout |= i22 & 48;
            }
            int i23 = configuration.screenLayout & 768;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 768)) {
                configuration3.screenLayout |= i24 & 768;
            }
            o0.o00oOOo0(configuration, configuration2, configuration3);
            int i25 = configuration.uiMode & 15;
            int i26 = configuration2.uiMode;
            if (i25 != (i26 & 15)) {
                configuration3.uiMode |= i26 & 15;
            }
            int i27 = configuration.uiMode & 48;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 48)) {
                configuration3.uiMode |= i28 & 48;
            }
            int i29 = configuration.screenWidthDp;
            int i30 = configuration2.screenWidthDp;
            if (i29 != i30) {
                configuration3.screenWidthDp = i30;
            }
            int i31 = configuration.screenHeightDp;
            int i32 = configuration2.screenHeightDp;
            if (i31 != i32) {
                configuration3.screenHeightDp = i32;
            }
            int i33 = configuration.smallestScreenWidthDp;
            int i34 = configuration2.smallestScreenWidthDp;
            if (i33 != i34) {
                configuration3.smallestScreenWidthDp = i34;
            }
            o00oo.o00oOOoO(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public boolean o00oOo0O() {
        o0O000.o00ooO0 o00ooo02;
        if (androidx.appcompat.app.o00oo0OO.o00ooOOo(this.f252o00ooo0O) && (o00ooo02 = androidx.appcompat.app.o00oo0OO.f413o00ooO0o) != null && !o00ooo02.equals(androidx.appcompat.app.o00oo0OO.f409o00ooO)) {
            o00oOoOO(this.f252o00ooo0O);
        }
        return o0O00O0o(true);
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public boolean o00oOo0o() {
        return o0O00O0o(true);
    }

    @Override // androidx.appcompat.app.o00oo0OO
    @o0O00O0
    @oo0oO0
    public Context o00oOoo0(@oo0oO0 Context context) {
        this.f277o0O00OoO = true;
        int o0O0Oooo2 = o0O0Oooo(context, o0oO0Ooo());
        if (androidx.appcompat.app.o00oo0OO.o00ooOOo(context)) {
            androidx.appcompat.app.o00oo0OO.o0OoO00O(context);
        }
        o0O000.o00ooO0 o0O00Oo2 = o0O00Oo(context);
        if (f247o0O0OOoo && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(o0O00o(context, o0O0Oooo2, o0O00Oo2, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof o00oOoOo.o00oo0O0) {
            try {
                ((o00oOoOo.o00oo0O0) context).o00oOOo0(o0O00o(context, o0O0Oooo2, o0O00Oo2, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f246o0O0OOoO) {
            o00oOoOo(context);
            return context;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = o00oo.o00oOOo0(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration o0O00o2 = o0O00o(context, o0O0Oooo2, o0O00Oo2, configuration2.equals(configuration3) ? null : o0O0O0oo(configuration2, configuration3), true);
        o00oOoOo.o00oo0O0 o00oo0o02 = new o00oOoOo.o00oo0O0(context, R.style.Theme_AppCompat_Empty);
        o00oo0o02.o00oOOo0(o0O00o2);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            o0O0OO.o00oo0OO.o00oOOo0(o00oo0o02.getTheme());
        }
        o00oOoOo(o00oo0o02);
        return o00oo0o02;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00oOooO(View view, ViewGroup.LayoutParams layoutParams) {
        o0O0O0o0();
        ((ViewGroup) this.f296o0OoOoOO.findViewById(16908290)).addView(view, layoutParams);
        this.f254o00oooO.o00oOo00(this.f253o00ooo0o.getCallback());
    }

    @Override // androidx.appcompat.app.o00oo0OO
    @o0OO00OO
    public <T extends View> T o00oo0O(@oo0OOoo int i) {
        o0O0O0o0();
        return (T) this.f253o00ooo0o.findViewById(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    @Override // androidx.appcompat.app.o00oo0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View o00oo0O0(android.view.View r12, java.lang.String r13, @o00oOooO.oo0oO0 android.content.Context r14, @o00oOooO.oo0oO0 android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.o00ooO0 r0 = r11.f291o0O0OO0
            r1 = 0
            if (r0 != 0) goto L3e
            android.content.Context r0 = r11.f252o00ooo0O
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            androidx.appcompat.app.o00ooO0 r0 = new androidx.appcompat.app.o00ooO0
            r0.<init>()
        L1a:
            r11.f291o0O0OO0 = r0
            goto L3e
        L1d:
            android.content.Context r2 = r11.f252o00ooo0O     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r0 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> L38
            androidx.appcompat.app.o00ooO0 r0 = (androidx.appcompat.app.o00ooO0) r0     // Catch: java.lang.Throwable -> L38
            r11.f291o0O0OO0 = r0     // Catch: java.lang.Throwable -> L38
            goto L3e
        L38:
            androidx.appcompat.app.o00ooO0 r0 = new androidx.appcompat.app.o00ooO0
            r0.<init>()
            goto L1a
        L3e:
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.f244o0O0OOOo
            r0 = 1
            if (r8 == 0) goto L6e
            androidx.appcompat.app.o0O00000 r2 = r11.f292o0O0OO0O
            if (r2 != 0) goto L4e
            androidx.appcompat.app.o0O00000 r2 = new androidx.appcompat.app.o0O00000
            r2.<init>()
            r11.f292o0O0OO0O = r2
        L4e:
            androidx.appcompat.app.o0O00000 r2 = r11.f292o0O0OO0O
            boolean r2 = r2.o00oOOo0(r15)
            if (r2 == 0) goto L58
            r7 = r0
            goto L6f
        L58:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L66
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L6e
            goto L6d
        L66:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.o0O0o0oO(r0)
        L6d:
            r1 = r0
        L6e:
            r7 = r1
        L6f:
            androidx.appcompat.app.o00ooO0 r2 = r11.f291o0O0OO0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.ooo0Oo0.o00oOooO()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o00oo0O0(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public Context o00oo0o0() {
        return this.f252o00ooo0O;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public final o00oOOoO.InterfaceC0005o00oOOoO o00oo0oO() {
        return new o00oo0OO();
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public boolean o00ooO(int i) {
        int o0O0o0Oo2 = o0O0o0Oo(i);
        return (o0O0o0Oo2 != 1 ? o0O0o0Oo2 != 2 ? o0O0o0Oo2 != 5 ? o0O0o0Oo2 != 10 ? o0O0o0Oo2 != 108 ? o0O0o0Oo2 != 109 ? false : this.f272o0O00O0 : this.f261o0O00 : this.f295o0OoO00O : this.f270o0O000oo : this.f301o0ooOoOO : this.f271o0O00O) || this.f253o00ooo0o.hasFeature(i);
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public MenuInflater o00ooO00() {
        if (this.f258o00oooo0 == null) {
            o0OooO0();
            androidx.appcompat.app.o00oOOo0 o00oooo02 = this.f256o00oooOo;
            this.f258o00oooo0 = new o00oOoOo.o00ooO0(o00oooo02 != null ? o00oooo02.o00ooO0O() : this.f252o00ooo0O);
        }
        return this.f258o00oooo0;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public androidx.appcompat.app.o00oOOo0 o00ooO0o() {
        o0OooO0();
        return this.f256o00oooOo;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00ooOO() {
        if (o0O0o00o() == null || o00ooO0o().o00ooOO0()) {
            return;
        }
        o0O0Oo(0);
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00ooOO0() {
        LayoutInflater from = LayoutInflater.from(this.f252o00ooo0O);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public boolean o00ooOo() {
        return this.f297o0OoOoOo;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00ooo0(Bundle bundle) {
        this.f277o0O00OoO = true;
        o0O00O0o(false);
        o0O0O0o();
        Object obj = this.f251o00ooo0;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = oO00OO.o00oOooO((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.o00oOOo0 o0O0o00o2 = o0O0o00o();
                if (o0O0o00o2 == null) {
                    this.f288o0O0O0oO = true;
                } else {
                    o0O0o00o2.o0O0000O(true);
                }
            }
            androidx.appcompat.app.o00oo0OO.o00oOo00(this);
        }
        this.f281o0O00o0O = new Configuration(this.f252o00ooo0O.getResources().getConfiguration());
        this.f278o0O00Ooo = true;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00ooo00(Configuration configuration) {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2;
        if (this.f261o0O00 && this.f267o0O000Oo && (o00ooO0o2 = o00ooO0o()) != null) {
            o00ooO0o2.o00ooOoO(configuration);
        }
        androidx.appcompat.widget.o00ooO.o00oOOoO().o00oOoO0(this.f252o00ooo0O);
        this.f281o0O00o0O = new Configuration(this.f252o00ooo0O.getResources().getConfiguration());
        o0O00O(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.o00oo0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00ooo0O() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f251o00ooo0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.o00oo0OO.o00oooo(r3)
        L9:
            boolean r0 = r3.f285o0O0O0Oo
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f253o00ooo0o
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f286o0O0O0o
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f280o0O00o00 = r0
            int r0 = r3.f282o0O00o0o
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f251o00ooo0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.o00ooO0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f243o0O0OOO
            java.lang.Object r1 = r3.f251o00ooo0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f282o0O00o0o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.o00ooO0<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f243o0O0OOO
            java.lang.Object r1 = r3.f251o00ooo0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.o00oOOo0 r0 = r3.f256o00oooOo
            if (r0 == 0) goto L5b
            r0.o00ooOoo()
        L5b:
            r3.o0O00o00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o00ooo0O():void");
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00ooo0o(Bundle bundle) {
        o0O0O0o0();
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00oooO() {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
        if (o00ooO0o2 != null) {
            o00ooO0o2.o0O00o0O(true);
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00oooOO(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00oooOo() {
        o0O00O(true, false);
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o00oooo0() {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
        if (o00ooO0o2 != null) {
            o00ooO0o2.o0O00o0O(false);
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public boolean o00ooooo(int i) {
        int o0O0o0Oo2 = o0O0o0Oo(i);
        if (this.f271o0O00O && o0O0o0Oo2 == 108) {
            return false;
        }
        if (this.f261o0O00 && o0O0o0Oo2 == 1) {
            this.f261o0O00 = false;
        }
        if (o0O0o0Oo2 == 1) {
            oooOO0();
            this.f271o0O00O = true;
            return true;
        } else if (o0O0o0Oo2 == 2) {
            oooOO0();
            this.f301o0ooOoOO = true;
            return true;
        } else if (o0O0o0Oo2 == 5) {
            oooOO0();
            this.f270o0O000oo = true;
            return true;
        } else if (o0O0o0Oo2 == 10) {
            oooOO0();
            this.f295o0OoO00O = true;
            return true;
        } else if (o0O0o0Oo2 == 108) {
            oooOO0();
            this.f261o0O00 = true;
            return true;
        } else if (o0O0o0Oo2 != 109) {
            return this.f253o00ooo0o.requestFeature(o0O0o0Oo2);
        } else {
            oooOO0();
            this.f272o0O00O0 = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public final void o0O00(CharSequence charSequence) {
        this.f257o00oooo = charSequence;
        o0O0OOO0 o0o0ooo0 = this.f259o00ooooO;
        if (o0o0ooo0 != null) {
            o0o0ooo0.setWindowTitle(charSequence);
        } else if (o0O0o00o() != null) {
            o0O0o00o().o0O0O0Oo(charSequence);
        } else {
            TextView textView = this.f269o0O000o0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0O000(View view) {
        o0O0O0o0();
        ViewGroup viewGroup = (ViewGroup) this.f296o0OoOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f254o00oooO.o00oOo00(this.f253o00ooo0o.getCallback());
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0O0000o(int i) {
        o0O0O0o0();
        ViewGroup viewGroup = (ViewGroup) this.f296o0OoOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f252o00ooo0O).inflate(i, viewGroup);
        this.f254o00oooO.o00oOo00(this.f253o00ooo0o.getCallback());
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0O000O(View view, ViewGroup.LayoutParams layoutParams) {
        o0O0O0o0();
        ViewGroup viewGroup = (ViewGroup) this.f296o0OoOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f254o00oooO.o00oOo00(this.f253o00ooo0o.getCallback());
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0O000Oo(boolean z) {
        this.f297o0OoOoOo = z;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    @o0OOooO0(33)
    public void o0O000o(@o0OO00OO OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f290o0O0OO;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f293o0O0OOO0) != null) {
            o0O00000.o00oOo00(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f293o0O0OOO0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f251o00ooo0;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = o0O00000.o00oOOo0((Activity) this.f251o00ooo0);
            }
        }
        this.f290o0O0OO = onBackInvokedDispatcher;
        o0O0oO();
    }

    @Override // androidx.appcompat.app.o00oo0OO
    @o0OOooO0(17)
    public void o0O000o0(int i) {
        if (this.f282o0O00o0o != i) {
            this.f282o0O00o0o = i;
            if (this.f277o0O00OoO) {
                o00oOo0o();
            }
        }
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0O000oo(@o0OOO0OO int i) {
        this.f279o0O00o = i;
    }

    public final boolean o0O00O(boolean z, boolean z2) {
        if (this.f280o0O00o00) {
            return false;
        }
        int o0oO0Ooo2 = o0oO0Ooo();
        int o0O0Oooo2 = o0O0Oooo(this.f252o00ooo0O, o0oO0Ooo2);
        o0O000.o00ooO0 o0O00Oo2 = Build.VERSION.SDK_INT < 33 ? o0O00Oo(this.f252o00ooo0O) : null;
        if (!z2 && o0O00Oo2 != null) {
            o0O00Oo2 = o0O0OOO(this.f252o00ooo0O.getResources().getConfiguration());
        }
        boolean o0O0oO0o2 = o0O0oO0o(o0O0Oooo2, o0O00Oo2, z);
        if (o0oO0Ooo2 == 0) {
            o0O0OOO0(this.f252o00ooo0O).o00oOo0o();
        } else {
            o0O000O o0o000o = this.f298o0oO0O0o;
            if (o0o000o != null) {
                o0o000o.o00oOOo0();
            }
        }
        if (o0oO0Ooo2 == 3) {
            o0O0OO0O(this.f252o00ooo0O).o00oOo0o();
        } else {
            o0O000O o0o000o2 = this.f294o0O0oo0o;
            if (o0o000o2 != null) {
                o0o000o2.o00oOOo0();
            }
        }
        return o0O0oO0o2;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public o00oOoOo.o00oo0 o0O00O0(@oo0oO0 o00oo0.o00oOOo0 o00oooo02) {
        androidx.appcompat.app.o00oOoO o00oooo2;
        if (o00oooo02 != null) {
            o00oOoOo.o00oo0 o00oo0Var = this.f263o0O00000;
            if (o00oo0Var != null) {
                o00oo0Var.o00oOOo0();
            }
            o0O0o o0o0o = new o0O0o(o00oooo02);
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
            if (o00ooO0o2 != null) {
                o00oOoOo.o00oo0 o0O0O0o2 = o00ooO0o2.o0O0O0o(o0o0o);
                this.f263o0O00000 = o0O0O0o2;
                if (o0O0O0o2 != null && (o00oooo2 = this.f255o00oooOO) != null) {
                    o00oooo2.onSupportActionModeStarted(o0O0O0o2);
                }
            }
            if (this.f263o0O00000 == null) {
                this.f263o0O00000 = o0O0oo0O(o0o0o);
            }
            o0O0oO();
            return this.f263o0O00000;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final boolean o0O00O0o(boolean z) {
        return o0O00O(z, true);
    }

    public final void o0O00OO() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f296o0OoOoOO.findViewById(16908290);
        View decorView = this.f253o00ooo0o.getDecorView();
        contentFrameLayout.o00oOOoO(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f252o00ooo0O.obtainStyledAttributes(R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final void o0O00OOO(@oo0oO0 Window window) {
        if (this.f253o00ooo0o != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o0O0000O) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o0O0000O o0o0000o = new o0O0000O(callback);
        this.f254o00oooO = o0o0000o;
        window.setCallback(o0o0000o);
        o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(this.f252o00ooo0O, null, f245o0O0OOo);
        Drawable o00oOoOO2 = o00ooOo02.o00oOoOO(0);
        if (o00oOoOO2 != null) {
            window.setBackgroundDrawable(o00oOoOO2);
        }
        o00ooOo02.o00ooOoo();
        this.f253o00ooo0o = window;
        if (Build.VERSION.SDK_INT < 33 || this.f290o0O0OO != null) {
            return;
        }
        o0O000o(null);
    }

    @o0OO00OO
    public o0O000.o00ooO0 o0O00Oo(@oo0oO0 Context context) {
        o0O000.o00ooO0 o00ooo02;
        if (Build.VERSION.SDK_INT < 33 && (o00ooo02 = androidx.appcompat.app.o00oo0OO.f413o00ooO0o) != null) {
            o0O000.o00ooO0 o0O0OOO2 = o0O0OOO(context.getApplicationContext().getResources().getConfiguration());
            o0O000.o00ooO0 o00oOo002 = androidx.appcompat.app.o0O0000O.o00oOo00(o00ooo02, o0O0OOO2);
            return o00oOo002.o00oOoOo() ? o0O0OOO2 : o00oOo002;
        }
        return null;
    }

    public void o0O00OoO(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f275o0O00OOO;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f310o00oOoOo;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f318o00oo0OO) && !this.f280o0O00o00) {
            this.f254o00oooO.o00oOooO(this.f253o00ooo0o.getCallback(), i, menu);
        }
    }

    public void o0O00Ooo(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        if (this.f274o0O00OO) {
            return;
        }
        this.f274o0O00OO = true;
        this.f259o00ooooO.o00oOooo();
        Window.Callback o0O0OOoo2 = o0O0OOoo();
        if (o0O0OOoo2 != null && !this.f280o0O00o00) {
            o0O0OOoo2.onPanelClosed(108, o00oooo2);
        }
        this.f274o0O00OO = false;
    }

    @oo0oO0
    public final Configuration o0O00o(@oo0oO0 Context context, int i, @o0OO00OO o0O000.o00ooO0 o00ooo02, @o0OO00OO Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (o00ooo02 != null) {
            o0O0o0o0(configuration2, o00ooo02);
        }
        return configuration2;
    }

    public final void o0O00o00() {
        o0O000O o0o000o = this.f298o0oO0O0o;
        if (o0o000o != null) {
            o0o000o.o00oOOo0();
        }
        o0O000O o0o000o2 = this.f294o0O0oo0o;
        if (o0o000o2 != null) {
            o0o000o2.o00oOOo0();
        }
    }

    public void o0O00o0O(int i) {
        o0O00o0o(o0O0OOOo(i, true), true);
    }

    public void o0O00o0o(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        o0O0OOO0 o0o0ooo0;
        if (z && panelFeatureState.f302o00oOOo0 == 0 && (o0o0ooo0 = this.f259o00ooooO) != null && o0o0ooo0.o00oOo0o()) {
            o0O00Ooo(panelFeatureState.f310o00oOoOo);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f252o00ooo0O.getSystemService("window");
        if (windowManager != null && panelFeatureState.f318o00oo0OO && (viewGroup = panelFeatureState.f308o00oOoO0) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                o0O00OoO(panelFeatureState.f302o00oOOo0, panelFeatureState, null);
            }
        }
        panelFeatureState.f315o00oo00O = false;
        panelFeatureState.f314o00oo0 = false;
        panelFeatureState.f318o00oo0OO = false;
        panelFeatureState.f307o00oOoO = null;
        panelFeatureState.f316o00oo0O = true;
        if (this.f276o0O00Oo == panelFeatureState) {
            this.f276o0O00Oo = null;
        }
        if (panelFeatureState.f302o00oOOo0 == 0) {
            o0O0oO();
        }
    }

    public final ViewGroup o0O00oO0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f252o00ooo0O.obtainStyledAttributes(R.styleable.AppCompatTheme);
        int i = R.styleable.AppCompatTheme_windowActionBar;
        if (!obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
            o00ooooo(1);
        } else if (obtainStyledAttributes.getBoolean(i, false)) {
            o00ooooo(108);
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            o00ooooo(109);
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            o00ooooo(10);
        }
        this.f273o0O00O0o = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        o0O0O0o();
        this.f253o00ooo0o.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f252o00ooo0O);
        if (this.f271o0O00O) {
            viewGroup = (ViewGroup) from.inflate(this.f295o0OoO00O ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f273o0O00O0o) {
            viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f272o0O00O0 = false;
            this.f261o0O00 = false;
        } else if (this.f261o0O00) {
            TypedValue typedValue = new TypedValue();
            this.f252o00ooo0O.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o00oOoOo.o00oo0O0(this.f252o00ooo0O, typedValue.resourceId) : this.f252o00ooo0O).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewGroup.findViewById(R.id.decor_content_parent);
            this.f259o00ooooO = o0o0ooo0;
            o0o0ooo0.setWindowCallback(o0O0OOoo());
            if (this.f272o0O00O0) {
                this.f259o00ooooO.o00oOoo0(109);
            }
            if (this.f301o0ooOoOO) {
                this.f259o00ooooO.o00oOoo0(2);
            }
            if (this.f270o0O000oo) {
                this.f259o00ooooO.o00oOoo0(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("AppCompat does not support the current theme features: { windowActionBar: ");
            o00oOOo02.append(this.f261o0O00);
            o00oOOo02.append(", windowActionBarOverlay: ");
            o00oOOo02.append(this.f272o0O00O0);
            o00oOOo02.append(", android:windowIsFloating: ");
            o00oOOo02.append(this.f273o0O00O0o);
            o00oOOo02.append(", windowActionModeOverlay: ");
            o00oOOo02.append(this.f295o0OoO00O);
            o00oOOo02.append(", windowNoTitle: ");
            o00oOOo02.append(this.f271o0O00O);
            o00oOOo02.append(" }");
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        o0O0o00O.o0OO0OoO(viewGroup, new o00oOo00());
        if (this.f259o00ooooO == null) {
            this.f269o0O000o0 = (TextView) viewGroup.findViewById(R.id.title);
        }
        o.o00oOo00(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f253o00ooo0o.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f253o00ooo0o.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o00oOoO());
        return viewGroup;
    }

    public void o0O0O0O() {
        androidx.appcompat.view.menu.o00oOoO o00oooo2;
        o0O0OOO0 o0o0ooo0 = this.f259o00ooooO;
        if (o0o0ooo0 != null) {
            o0o0ooo0.o00oOooo();
        }
        if (this.f265o0O0000o != null) {
            this.f253o00ooo0o.getDecorView().removeCallbacks(this.f262o0O000);
            if (this.f265o0O0000o.isShowing()) {
                try {
                    this.f265o0O0000o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f265o0O0000o = null;
        }
        o0O0O0Oo();
        PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, false);
        if (o0O0OOOo2 == null || (o00oooo2 = o0O0OOOo2.f310o00oOoOo) == null) {
            return;
        }
        o00oooo2.close();
    }

    public void o0O0O0Oo() {
        o0OO0oO0 o0oo0oo0 = this.f266o0O000O;
        if (o0oo0oo0 != null) {
            o0oo0oo0.o00oOooO();
        }
    }

    public final void o0O0O0o() {
        if (this.f253o00ooo0o == null) {
            Object obj = this.f251o00ooo0;
            if (obj instanceof Activity) {
                o0O00OOO(((Activity) obj).getWindow());
            }
        }
        if (this.f253o00ooo0o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void o0O0O0o0() {
        if (this.f267o0O000Oo) {
            return;
        }
        this.f296o0OoOoOO = o0O00oO0();
        CharSequence o0O0OOoO2 = o0O0OOoO();
        if (!TextUtils.isEmpty(o0O0OOoO2)) {
            o0O0OOO0 o0o0ooo0 = this.f259o00ooooO;
            if (o0o0ooo0 != null) {
                o0o0ooo0.setWindowTitle(o0O0OOoO2);
            } else if (o0O0o00o() != null) {
                o0O0o00o().o0O0O0Oo(o0O0OOoO2);
            } else {
                TextView textView = this.f269o0O000o0;
                if (textView != null) {
                    textView.setText(o0O0OOoO2);
                }
            }
        }
        o0O00OO();
        o0O0o00(this.f296o0OoOoOO);
        this.f267o0O000Oo = true;
        PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, false);
        if (this.f280o0O00o00) {
            return;
        }
        if (o0O0OOOo2 == null || o0O0OOOo2.f310o00oOoOo == null) {
            o0O0Oo(108);
        }
    }

    public PanelFeatureState o0O0O0oO(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f275o0O00OOO;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f310o00oOoOo == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @oo0oO0
    @o0o0000
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public final o0O000O o0O0OO() {
        return o0O0OOO0(this.f252o00ooo0O);
    }

    public final int o0O0OO0(Context context) {
        if (!this.f284o0O0O0O && (this.f251o00ooo0 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f251o00ooo0.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f283o0O00oO0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f283o0O00oO0 = 0;
            }
        }
        this.f284o0O0O0O = true;
        return this.f283o0O00oO0;
    }

    public final o0O000O o0O0OO0O(@oo0oO0 Context context) {
        if (this.f294o0O0oo0o == null) {
            this.f294o0O0oo0o = new o0O000(context);
        }
        return this.f294o0O0oo0o;
    }

    public o0O000.o00ooO0 o0O0OOO(Configuration configuration) {
        return o00ooO.o00oOOoO(configuration);
    }

    public final o0O000O o0O0OOO0(@oo0oO0 Context context) {
        if (this.f298o0oO0O0o == null) {
            this.f298o0oO0O0o = new o0OoOoOo(androidx.appcompat.app.o0O000o0.o00oOOo0(context));
        }
        return this.f298o0oO0O0o;
    }

    public PanelFeatureState o0O0OOOo(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f275o0O00OOO;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f275o0O00OOO = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    public ViewGroup o0O0OOo() {
        return this.f296o0OoOoOO;
    }

    public final CharSequence o0O0OOoO() {
        Object obj = this.f251o00ooo0;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f257o00oooo;
    }

    public final Window.Callback o0O0OOoo() {
        return this.f253o00ooo0o.getCallback();
    }

    public final void o0O0Oo(int i) {
        this.f287o0O0O0o0 = (1 << i) | this.f287o0O0O0o0;
        if (this.f285o0O0O0Oo) {
            return;
        }
        o0O0o00O.o0O0oo0O(this.f253o00ooo0o.getDecorView(), this.f286o0O0O0o);
        this.f285o0O0O0Oo = true;
    }

    public final boolean o0O0Oo0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f309o00oOoOO;
        if (view != null) {
            panelFeatureState.f307o00oOoO = view;
            return true;
        } else if (panelFeatureState.f310o00oOoOo == null) {
            return false;
        } else {
            if (this.f250o0 == null) {
                this.f250o0 = new o0O00();
            }
            View view2 = (View) panelFeatureState.o00oOo00(this.f250o0);
            panelFeatureState.f307o00oOoO = view2;
            return view2 != null;
        }
    }

    public final boolean o0O0Oo0O(PanelFeatureState panelFeatureState) {
        panelFeatureState.o00oOoO(o0ooO());
        panelFeatureState.f308o00oOoO0 = new o0O000o0(panelFeatureState.f313o00oOooo);
        panelFeatureState.f304o00oOo00 = 81;
        return true;
    }

    public final boolean o0O0Oo0o(PanelFeatureState panelFeatureState) {
        Context context = this.f252o00ooo0O;
        int i = panelFeatureState.f302o00oOOo0;
        if ((i == 0 || i == 108) && this.f259o00ooooO != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                o00oOoOo.o00oo0O0 o00oo0o02 = new o00oOoOo.o00oo0O0(context, 0);
                o00oo0o02.getTheme().setTo(theme2);
                context = o00oo0o02;
            }
        }
        androidx.appcompat.view.menu.o00oOoO o00oooo2 = new androidx.appcompat.view.menu.o00oOoO(context);
        o00oooo2.setCallback(this);
        panelFeatureState.o00oOoO0(o00oooo2);
        return true;
    }

    public final boolean o0O0OoO(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState o0O0OOOo2 = o0O0OOOo(i, true);
            if (o0O0OOOo2.f318o00oo0OO) {
                return false;
            }
            return o0O0o0O(o0O0OOOo2, keyEvent);
        }
        return false;
    }

    public boolean o0O0OoO0() {
        boolean z = this.f299o0oO0Ooo;
        this.f299o0oO0Ooo = false;
        PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, false);
        if (o0O0OOOo2 != null && o0O0OOOo2.f318o00oo0OO) {
            if (!z) {
                o0O00o0o(o0O0OOOo2, true);
            }
            return true;
        }
        o00oOoOo.o00oo0 o00oo0Var = this.f263o0O00000;
        if (o00oo0Var != null) {
            o00oo0Var.o00oOOo0();
            return true;
        }
        androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
        return o00ooO0o2 != null && o00ooO0o2.o00oOooo();
    }

    public boolean o0O0OoOo(int i, KeyEvent keyEvent) {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
        if (o00ooO0o2 == null || !o00ooO0o2.o00ooo00(i, keyEvent)) {
            PanelFeatureState panelFeatureState = this.f276o0O00Oo;
            if (panelFeatureState != null && o0O0o0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
                PanelFeatureState panelFeatureState2 = this.f276o0O00Oo;
                if (panelFeatureState2 != null) {
                    panelFeatureState2.f314o00oo0 = true;
                }
                return true;
            }
            if (this.f276o0O00Oo == null) {
                PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, true);
                o0O0o0O(o0O0OOOo2, keyEvent);
                boolean o0O0o02 = o0O0o0(o0O0OOOo2, keyEvent.getKeyCode(), keyEvent, 1);
                o0O0OOOo2.f315o00oo00O = false;
                if (o0O0o02) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o0O0Ooo(int i, KeyEvent keyEvent) {
        boolean z;
        AudioManager audioManager;
        o0O0OOO0 o0o0ooo0;
        if (this.f263o0O00000 != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState o0O0OOOo2 = o0O0OOOo(i, true);
        if (i != 0 || (o0o0ooo0 = this.f259o00ooooO) == null || !o0o0ooo0.o00oOOoO() || ViewConfiguration.get(this.f252o00ooo0O).hasPermanentMenuKey()) {
            boolean z3 = o0O0OOOo2.f318o00oo0OO;
            if (z3 || o0O0OOOo2.f314o00oo0) {
                o0O00o0o(o0O0OOOo2, true);
                z2 = z3;
            } else {
                if (o0O0OOOo2.f315o00oo00O) {
                    if (o0O0OOOo2.f319o00oo0Oo) {
                        o0O0OOOo2.f315o00oo00O = false;
                        z = o0O0o0O(o0O0OOOo2, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        o0O0o00O(o0O0OOOo2, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f259o00ooooO.o00oOo0o()) {
            z2 = this.f259o00ooooO.o00oOo00();
        } else {
            if (!this.f280o0O00o00 && o0O0o0O(o0O0OOOo2, keyEvent)) {
                z2 = this.f259o00ooooO.o00oOooO();
            }
            z2 = false;
        }
        if (z2 && (audioManager = (AudioManager) this.f252o00ooo0O.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z2;
    }

    public boolean o0O0Ooo0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                o0O0Ooo(0, keyEvent);
                return true;
            }
        } else if (o0O0OoO0()) {
            return true;
        }
        return false;
    }

    public void o0O0OooO(int i) {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2;
        if (i != 108 || (o00ooO0o2 = o00ooO0o()) == null) {
            return;
        }
        o00ooO0o2.o00oo00O(true);
    }

    public int o0O0Oooo(@oo0oO0 Context context, int i) {
        o0O000O o0O0OOO02;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        o0O0OOO02 = o0O0OO0O(context);
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    o0O0OOO02 = o0O0OOO0(context);
                }
                return o0O0OOO02.o00oOo00();
            }
            return i;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public int o0O0o() {
        return this.f282o0O00o0o;
    }

    public final boolean o0O0o0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        androidx.appcompat.view.menu.o00oOoO o00oooo2;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f315o00oo00O || o0O0o0O(panelFeatureState, keyEvent)) && (o00oooo2 = panelFeatureState.f310o00oOoOo) != null) {
            z = o00oooo2.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f259o00ooooO == null) {
            o0O00o0o(panelFeatureState, true);
        }
        return z;
    }

    public void o0O0o00(ViewGroup viewGroup) {
    }

    public void o0O0o000(int i) {
        if (i == 108) {
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
            if (o00ooO0o2 != null) {
                o00ooO0o2.o00oo00O(false);
            }
        } else if (i == 0) {
            PanelFeatureState o0O0OOOo2 = o0O0OOOo(i, true);
            if (o0O0OOOo2.f318o00oo0OO) {
                o0O00o0o(o0O0OOOo2, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0O0o00O(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o0O0o00O(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final androidx.appcompat.app.o00oOOo0 o0O0o00o() {
        return this.f256o00oooOo;
    }

    public final boolean o0O0o0O(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        o0O0OOO0 o0o0ooo0;
        o0O0OOO0 o0o0ooo02;
        o0O0OOO0 o0o0ooo03;
        if (this.f280o0O00o00) {
            return false;
        }
        if (panelFeatureState.f315o00oo00O) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f276o0O00Oo;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            o0O00o0o(panelFeatureState2, false);
        }
        Window.Callback o0O0OOoo2 = o0O0OOoo();
        if (o0O0OOoo2 != null) {
            panelFeatureState.f309o00oOoOO = o0O0OOoo2.onCreatePanelView(panelFeatureState.f302o00oOOo0);
        }
        int i = panelFeatureState.f302o00oOOo0;
        boolean z = i == 0 || i == 108;
        if (z && (o0o0ooo03 = this.f259o00ooooO) != null) {
            o0o0ooo03.o00oOoO0();
        }
        if (panelFeatureState.f309o00oOoOO == null && (!z || !(o0O0o00o() instanceof androidx.appcompat.app.o0OoOoOo))) {
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = panelFeatureState.f310o00oOoOo;
            if (o00oooo2 == null || panelFeatureState.f319o00oo0Oo) {
                if (o00oooo2 == null && (!o0O0Oo0o(panelFeatureState) || panelFeatureState.f310o00oOoOo == null)) {
                    return false;
                }
                if (z && this.f259o00ooooO != null) {
                    if (this.f260o00ooooo == null) {
                        this.f260o00ooooo = new o00oo0O();
                    }
                    this.f259o00ooooO.o00oOo0O(panelFeatureState.f310o00oOoOo, this.f260o00ooooo);
                }
                panelFeatureState.f310o00oOoOo.stopDispatchingItemsChanged();
                if (!o0O0OOoo2.onCreatePanelMenu(panelFeatureState.f302o00oOOo0, panelFeatureState.f310o00oOoOo)) {
                    panelFeatureState.o00oOoO0(null);
                    if (z && (o0o0ooo0 = this.f259o00ooooO) != null) {
                        o0o0ooo0.o00oOo0O(null, this.f260o00ooooo);
                    }
                    return false;
                }
                panelFeatureState.f319o00oo0Oo = false;
            }
            panelFeatureState.f310o00oOoOo.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.f322o00oo0oO;
            if (bundle != null) {
                panelFeatureState.f310o00oOoOo.restoreActionViewStates(bundle);
                panelFeatureState.f322o00oo0oO = null;
            }
            if (!o0O0OOoo2.onPreparePanel(0, panelFeatureState.f309o00oOoOO, panelFeatureState.f310o00oOoOo)) {
                if (z && (o0o0ooo02 = this.f259o00ooooO) != null) {
                    o0o0ooo02.o00oOo0O(null, this.f260o00ooooo);
                }
                panelFeatureState.f310o00oOoOo.startDispatchingItemsChanged();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f317o00oo0O0 = z2;
            panelFeatureState.f310o00oOoOo.setQwertyMode(z2);
            panelFeatureState.f310o00oOoOo.startDispatchingItemsChanged();
        }
        panelFeatureState.f315o00oo00O = true;
        panelFeatureState.f314o00oo0 = false;
        this.f276o0O00Oo = panelFeatureState;
        return true;
    }

    public final void o0O0o0OO(boolean z) {
        o0O0OOO0 o0o0ooo0 = this.f259o00ooooO;
        if (o0o0ooo0 == null || !o0o0ooo0.o00oOOoO() || (ViewConfiguration.get(this.f252o00ooo0O).hasPermanentMenuKey() && !this.f259o00ooooO.o00oOoOO())) {
            PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, true);
            o0O0OOOo2.f316o00oo0O = true;
            o0O00o0o(o0O0OOOo2, false);
            o0O0o00O(o0O0OOOo2, null);
            return;
        }
        Window.Callback o0O0OOoo2 = o0O0OOoo();
        if (this.f259o00ooooO.o00oOo0o() && z) {
            this.f259o00ooooO.o00oOo00();
            if (this.f280o0O00o00) {
                return;
            }
            o0O0OOoo2.onPanelClosed(108, o0O0OOOo(0, true).f310o00oOoOo);
        } else if (o0O0OOoo2 == null || this.f280o0O00o00) {
        } else {
            if (this.f285o0O0O0Oo && (this.f287o0O0O0o0 & 1) != 0) {
                this.f253o00ooo0o.getDecorView().removeCallbacks(this.f286o0O0O0o);
                this.f286o0O0O0o.run();
            }
            PanelFeatureState o0O0OOOo3 = o0O0OOOo(0, true);
            androidx.appcompat.view.menu.o00oOoO o00oooo2 = o0O0OOOo3.f310o00oOoOo;
            if (o00oooo2 == null || o0O0OOOo3.f319o00oo0Oo || !o0O0OOoo2.onPreparePanel(0, o0O0OOOo3.f309o00oOoOO, o00oooo2)) {
                return;
            }
            o0O0OOoo2.onMenuOpened(108, o0O0OOOo3.f310o00oOoOo);
            this.f259o00ooooO.o00oOooO();
        }
    }

    public final int o0O0o0Oo(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    public void o0O0o0o(o0O000.o00ooO0 o00ooo02) {
        o00ooO.o00oOo00(o00ooo02);
    }

    public void o0O0o0o0(Configuration configuration, @oo0oO0 o0O000.o00ooO0 o00ooo02) {
        o00ooO.o00oOooO(configuration, o00ooo02);
    }

    public final boolean o0O0o0oO(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f253o00ooo0o.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || o0O0o00O.o0O0OOoo((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public boolean o0O0o0oo() {
        if (this.f290o0O0OO == null) {
            return false;
        }
        PanelFeatureState o0O0OOOo2 = o0O0OOOo(0, false);
        return (o0O0OOOo2 != null && o0O0OOOo2.f318o00oo0OO) || this.f263o0O00000 != null;
    }

    public void o0O0oO() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean o0O0o0oo2 = o0O0o0oo();
            if (o0O0o0oo2 && this.f293o0O0OOO0 == null) {
                this.f293o0O0OOO0 = o0O00000.o00oOOoO(this.f290o0O0OO, this);
            } else if (o0O0o0oo2 || (onBackInvokedCallback = this.f293o0O0OOO0) == null) {
            } else {
                o0O00000.o00oOo00(this.f290o0O0OO, onBackInvokedCallback);
            }
        }
    }

    @o0OO00OO
    public final AppCompatActivity o0O0oO0() {
        for (Context context = this.f252o00ooo0O; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void o0O0oO0O(Configuration configuration) {
        Activity activity = (Activity) this.f251o00ooo0;
        if (activity instanceof o0O0O0O) {
            if (!((o0O0O0O) activity).getLifecycle().o00oOOoO().isAtLeast(o0O00.o00oOOoO.CREATED)) {
                return;
            }
        } else if (!this.f278o0O00Ooo || this.f280o0O00o00) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o0O0oO0o(int r10, @o00oOooO.o0OO00OO o0O000.o00ooO0 r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.f252o00ooo0O
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.o0O00o(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f252o00ooo0O
            int r1 = r9.o0O0OO0(r1)
            android.content.res.Configuration r2 = r9.f281o0O00o0O
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.f252o00ooo0O
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            o0O000.o00ooO0 r2 = r9.o0O0OOO(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            o0O000.o00ooO0 r6 = r9.o0O0OOO(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r7
        L3b:
            if (r6 == 0) goto L47
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8e
            if (r12 == 0) goto L8e
            boolean r12 = r9.f277o0O00OoO
            if (r12 == 0) goto L8e
            boolean r12 = androidx.appcompat.app.AppCompatDelegateImpl.f246o0O0OOoO
            if (r12 != 0) goto L5a
            boolean r12 = r9.f278o0O00Ooo
            if (r12 == 0) goto L8e
        L5a:
            java.lang.Object r12 = r9.f251o00ooo0
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8e
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8e
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L85
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L85
            java.lang.Object r12 = r9.f251o00ooo0
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = androidx.appcompat.app.AppCompatDelegateImpl.o00oo.o00oOo00(r0)
            androidx.appcompat.app.AppCompatDelegateImpl.o00oo.o00oOo0O(r12, r0)
        L85:
            java.lang.Object r12 = r9.f251o00ooo0
            android.app.Activity r12 = (android.app.Activity) r12
            o00ooOoo.oO000O0O.o00oOoOo(r12)
            r12 = r8
            goto L8f
        L8e:
            r12 = r7
        L8f:
            if (r12 != 0) goto L9c
            if (r3 == 0) goto L9c
            r12 = r3 & r1
            if (r12 != r3) goto L98
            r7 = r8
        L98:
            r9.o0O0oOO0(r4, r6, r7, r5)
            goto L9d
        L9c:
            r8 = r12
        L9d:
            if (r8 == 0) goto Lb9
            java.lang.Object r12 = r9.f251o00ooo0
            boolean r0 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto Lb9
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto Lae
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            r12.o0OoO00O(r10)
        Lae:
            r10 = r3 & 4
            if (r10 == 0) goto Lb9
            java.lang.Object r10 = r9.f251o00ooo0
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.o0O00O0(r11)
        Lb9:
            if (r6 == 0) goto Lcc
            android.content.Context r10 = r9.f252o00ooo0O
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            o0O000.o00ooO0 r10 = r9.o0O0OOO(r10)
            r9.o0O0o0o(r10)
        Lcc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o0O0oO0o(int, o0O000.o00ooO0, boolean):boolean");
    }

    public final int o0O0oOO(@o0OO00OO o0OOo000 o0ooo000, @o0OO00OO Rect rect) {
        boolean z;
        boolean z2;
        int o00oo0Oo2 = o0ooo000 != null ? o0ooo000.o00oo0Oo() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f264o0O0000O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f264o0O0000O.getLayoutParams();
            if (this.f264o0O0000O.isShown()) {
                if (this.f289o0O0O0oo == null) {
                    this.f289o0O0O0oo = new Rect();
                    this.f300o0ooO = new Rect();
                }
                Rect rect2 = this.f289o0O0O0oo;
                Rect rect3 = this.f300o0ooO;
                if (o0ooo000 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o0ooo000.o00oo0O0(), o0ooo000.o00oo0Oo(), o0ooo000.o00oo0O(), o0ooo000.o00oo0OO());
                }
                o.o00oOOo0(this.f296o0OoOoOO, rect2, rect3);
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                o0OOo000 o0O00Oo2 = o0O0o00O.o0O00Oo(this.f296o0OoOoOO);
                int o00oo0O02 = o0O00Oo2 == null ? 0 : o0O00Oo2.o00oo0O0();
                int o00oo0O2 = o0O00Oo2 == null ? 0 : o0O00Oo2.o00oo0O();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.f268o0O000o != null) {
                    View view = this.f268o0O000o;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != o00oo0O02 || marginLayoutParams2.rightMargin != o00oo0O2) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = o00oo0O02;
                            marginLayoutParams2.rightMargin = o00oo0O2;
                            this.f268o0O000o.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f252o00ooo0O);
                    this.f268o0O000o = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = o00oo0O02;
                    layoutParams.rightMargin = o00oo0O2;
                    this.f296o0OoOoOO.addView(this.f268o0O000o, -1, layoutParams);
                }
                View view3 = this.f268o0O000o;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    o0O0oo00(this.f268o0O000o);
                }
                if (!this.f295o0OoO00O && r5) {
                    o00oo0Oo2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f264o0O0000O.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f268o0O000o;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return o00oo0Oo2;
    }

    public final void o0O0oOO0(int i, @o0OO00OO o0O000.o00ooO0 o00ooo02, boolean z, @o0OO00OO Configuration configuration) {
        Resources resources = this.f252o00ooo0O.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (o00ooo02 != null) {
            o0O0o0o0(configuration2, o00ooo02);
        }
        resources.updateConfiguration(configuration2, null);
        int i2 = this.f279o0O00o;
        if (i2 != 0) {
            this.f252o00ooo0O.setTheme(i2);
            this.f252o00ooo0O.getTheme().applyStyle(this.f279o0O00o, true);
        }
        if (z && (this.f251o00ooo0 instanceof Activity)) {
            o0O0oO0O(configuration2);
        }
    }

    public final void o0O0oo00(View view) {
        Context context;
        int i;
        if ((o0O0o00O.o0O0O0o(view) & 8192) != 0) {
            context = this.f252o00ooo0O;
            i = R.color.abc_decor_view_status_guard_light;
        } else {
            context = this.f252o00ooo0O;
            i = R.color.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(o00ooo0.o0.getColor(context, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o00oOoOo.o00oo0 o0O0oo0O(@o00oOooO.oo0oO0 o00oOoOo.o00oo0.o00oOOo0 r8) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o0O0oo0O(o00oOoOo.o00oo0$o00oOOo0):o00oOoOo.o00oo0");
    }

    public void o0O0oo0o(int i) {
        PanelFeatureState o0O0OOOo2;
        PanelFeatureState o0O0OOOo3 = o0O0OOOo(i, true);
        if (o0O0OOOo3.f310o00oOoOo != null) {
            Bundle bundle = new Bundle();
            o0O0OOOo3.f310o00oOoOo.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                o0O0OOOo3.f322o00oo0oO = bundle;
            }
            o0O0OOOo3.f310o00oOoOo.stopDispatchingItemsChanged();
            o0O0OOOo3.f310o00oOoOo.clear();
        }
        o0O0OOOo3.f319o00oo0Oo = true;
        o0O0OOOo3.f316o00oo0O = true;
        if ((i != 108 && i != 0) || this.f259o00ooooO == null || (o0O0OOOo2 = o0O0OOOo(0, false)) == null) {
            return;
        }
        o0O0OOOo2.f315o00oo00O = false;
        o0O0o0O(o0O0OOOo2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0OooO0() {
        /*
            r3 = this;
            r3.o0O0O0o0()
            boolean r0 = r3.f261o0O00
            if (r0 == 0) goto L37
            androidx.appcompat.app.o00oOOo0 r0 = r3.f256o00oooOo
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f251o00ooo0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.o0O00 r0 = new androidx.appcompat.app.o0O00
            java.lang.Object r1 = r3.f251o00ooo0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f272o0O00O0
            r0.<init>(r1, r2)
        L1d:
            r3.f256o00oooOo = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.o0O00 r0 = new androidx.appcompat.app.o0O00
            java.lang.Object r1 = r3.f251o00ooo0
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.o00oOOo0 r0 = r3.f256o00oooOo
            if (r0 == 0) goto L37
            boolean r1 = r3.f288o0O0O0oO
            r0.o0O0000O(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.o0OooO0():void");
    }

    public boolean o0oO0O0o(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f251o00ooo0;
        if (((obj instanceof o0O0000O.o00oOOo0) || (obj instanceof androidx.appcompat.app.o0O0o)) && (decorView = this.f253o00ooo0o.getDecorView()) != null && o0O000oo.o0O0000O.o00oOooO(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f254o00oooO.o00oOOoO(this.f253o00ooo0o.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? oo0OOoo(keyCode, keyEvent) : o0O0Ooo0(keyCode, keyEvent);
    }

    public final int o0oO0Ooo() {
        int i = this.f282o0O00o0o;
        return i != -100 ? i : androidx.appcompat.app.o00oo0OO.f412o00ooO0O;
    }

    public final boolean o0oOo0O0() {
        ViewGroup viewGroup;
        return this.f267o0O000Oo && (viewGroup = this.f296o0OoOoOO) != null && o0O0o00O.o0O0Oooo(viewGroup);
    }

    public final Context o0ooO() {
        androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
        Context o00ooO0O2 = o00ooO0o2 != null ? o00ooO0o2.o00ooO0O() : null;
        return o00ooO0O2 == null ? this.f252o00ooo0O : o00ooO0O2;
    }

    @Override // androidx.appcompat.app.o00oo0OO
    public void o0ooOoOO(Toolbar toolbar) {
        if (this.f251o00ooo0 instanceof Activity) {
            androidx.appcompat.app.o00oOOo0 o00ooO0o2 = o00ooO0o();
            if (o00ooO0o2 instanceof androidx.appcompat.app.o0O00) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f258o00oooo0 = null;
            if (o00ooO0o2 != null) {
                o00ooO0o2.o00ooOoo();
            }
            this.f256o00oooOo = null;
            if (toolbar != null) {
                androidx.appcompat.app.o0OoOoOo o0oooooo = new androidx.appcompat.app.o0OoOoOo(toolbar, o0O0OOoO(), this.f254o00oooO);
                this.f256o00oooOo = o0oooooo;
                this.f254o00oooO.o00oOo0O(o0oooooo.f518o00oOoo0);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f254o00oooO.o00oOo0O(null);
            }
            o00ooOO();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return o00oo0O0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
    public boolean onMenuItemSelected(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
        PanelFeatureState o0O0O0oO2;
        Window.Callback o0O0OOoo2 = o0O0OOoo();
        if (o0O0OOoo2 == null || this.f280o0O00o00 || (o0O0O0oO2 = o0O0O0oO(o00oooo2.getRootMenu())) == null) {
            return false;
        }
        return o0O0OOoo2.onMenuItemSelected(o0O0O0oO2.f302o00oOOo0, menuItem);
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOo0
    public void onMenuModeChange(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        o0O0o0OO(true);
    }

    public boolean oo0OOoo(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f299o0oO0Ooo = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            o0O0OoO(0, keyEvent);
            return true;
        }
        return false;
    }

    public final void oooOO0() {
        if (this.f267o0O000Oo) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}
