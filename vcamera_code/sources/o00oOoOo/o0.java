package o00oOoOo;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0 implements Window.Callback {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Window.Callback f6997o00oo0O0;

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @o0O0O0Oo
        public static ActionMode o00oOOoO(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static void o00oOOo0(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static void o00oOOo0(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public o0(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6997o00oo0O0 = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6997o00oo0O0.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6997o00oo0O0.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f6997o00oo0O0.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6997o00oo0O0.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6997o00oo0O0.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6997o00oo0O0.dispatchTrackballEvent(motionEvent);
    }

    public final Window.Callback o00oOOo0() {
        return this.f6997o00oo0O0;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f6997o00oo0O0.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f6997o00oo0O0.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f6997o00oo0O0.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f6997o00oo0O0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f6997o00oo0O0.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f6997o00oo0O0.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f6997o00oo0O0.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6997o00oo0O0.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f6997o00oo0O0.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f6997o00oo0O0.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    @o0OOooO0(26)
    public void onPointerCaptureChanged(boolean z) {
        o00oOo00.o00oOOo0(this.f6997o00oo0O0, z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f6997o00oo0O0.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    @o0OOooO0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        o00oOOoO.o00oOOo0(this.f6997o00oo0O0, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f6997o00oo0O0.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @o0OOooO0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return o00oOOo0.o00oOOo0(this.f6997o00oo0O0, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6997o00oo0O0.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f6997o00oo0O0.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f6997o00oo0O0.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @o0OOooO0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return o00oOOo0.o00oOOoO(this.f6997o00oo0O0, callback, i);
    }
}
