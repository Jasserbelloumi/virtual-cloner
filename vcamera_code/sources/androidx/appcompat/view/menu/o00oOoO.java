package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o0O000oo.o0OoOoO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOoO implements o0.o00oOOo0 {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private o00oOOo0 mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private o00oo0OO mExpandedItem;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<o00oo0OO> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<o00oo0O>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<o00oo0OO> mItems = new ArrayList<>();
    private ArrayList<o00oo0OO> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<o00oo0OO> mActionItems = new ArrayList<>();
    private ArrayList<o00oo0OO> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean onMenuItemSelected(@oo0oO0 o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem);

        void onMenuModeChange(@oo0oO0 o00oOoO o00oooo2);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        boolean o00oOOo0(o00oo0OO o00oo0oo);
    }

    public o00oOoO(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private o00oo0OO createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new o00oo0OO(this, i, i2, i3, i4, charSequence, i5);
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o2 = next.get();
            if (o00oo0o2 == null) {
                this.mPresenters.remove(next);
            } else {
                o00oo0o2.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o2 = next.get();
            if (o00oo0o2 == null) {
                this.mPresenters.remove(next);
            } else {
                int id = o00oo0o2.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    o00oo0o2.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o2 = next.get();
            if (o00oo0o2 == null) {
                this.mPresenters.remove(next);
            } else {
                int id = o00oo0o2.getId();
                if (id > 0 && (onSaveInstanceState = o00oo0o2.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(o00ooO0 o00ooo02, o00oo0O o00oo0o2) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = o00oo0o2 != null ? o00oo0o2.onSubMenuSelected(o00ooo02) : false;
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o3 = next.get();
            if (o00oo0o3 == null) {
                this.mPresenters.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = o00oo0o3.onSubMenuSelected(o00ooo02);
            }
        }
        return onSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<o00oo0OO> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f692o00oo0OO <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = o0.getDrawable(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    private void setShortcutsVisibleInner(boolean z) {
        boolean z2 = true;
        this.mShortcutsVisible = (z && this.mResources.getConfiguration().keyboard != 1 && o0OoOoO.o00oOoO0(ViewConfiguration.get(this.mContext), this.mContext)) ? false : false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        o00oo0OO createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.f715o00oooOo = contextMenuInfo;
        }
        ArrayList<o00oo0OO> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    public void addMenuPresenter(o00oo0O o00oo0o2) {
        addMenuPresenter(o00oo0o2, this.mContext);
    }

    public void addMenuPresenter(o00oo0O o00oo0o2, Context context) {
        this.mPresenters.add(new WeakReference<>(o00oo0o2));
        o00oo0o2.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o00oo0OO o00oo0oo = (o00oo0OO) addInternal(i, i2, i3, charSequence);
        o00ooO0 o00ooo02 = new o00ooO0(this.mContext, this, o00oo0oo);
        o00oo0oo.o00ooO0o(o00ooo02);
        return o00ooo02;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        o00oOOo0 o00oooo02 = this.mCallback;
        if (o00oooo02 != null) {
            o00oooo02.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        o00oo0OO o00oo0oo = this.mExpandedItem;
        if (o00oo0oo != null) {
            collapseItemActionView(o00oo0oo);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o2 = next.get();
            if (o00oo0o2 == null) {
                this.mPresenters.remove(next);
            } else {
                o00oo0o2.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(o00oo0OO o00oo0oo) {
        boolean z = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == o00oo0oo) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<o00oo0O> next = it.next();
                o00oo0O o00oo0o2 = next.get();
                if (o00oo0o2 == null) {
                    this.mPresenters.remove(next);
                } else {
                    z = o00oo0o2.collapseItemActionView(this, o00oo0oo);
                    if (z) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z) {
                this.mExpandedItem = null;
            }
        }
        return z;
    }

    public boolean dispatchMenuItemSelected(@oo0oO0 o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
        o00oOOo0 o00oooo02 = this.mCallback;
        return o00oooo02 != null && o00oooo02.onMenuItemSelected(o00oooo2, menuItem);
    }

    public boolean expandItemActionView(o00oo0OO o00oo0oo) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o2 = next.get();
            if (o00oo0o2 == null) {
                this.mPresenters.remove(next);
            } else {
                z = o00oo0o2.expandItemActionView(this, o00oo0oo);
                if (z) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z) {
            this.mExpandedItem = o00oo0oo;
        }
        return z;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).f689o00oo00O == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            o00oo0OO o00oo0oo = this.mItems.get(i2);
            if (o00oo0oo.f686o00oOooo == i) {
                return o00oo0oo;
            }
            if (o00oo0oo.hasSubMenu() && (findItem = o00oo0oo.f700o00ooO0O.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).f686o00oOooo == i) {
                return i2;
            }
        }
        return -1;
    }

    public o00oo0OO findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        ArrayList<o00oo0OO> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            o00oo0OO o00oo0oo = arrayList.get(i2);
            char c = isQwertyMode ? o00oo0oo.f696o00oo0oO : o00oo0oo.f695o00oo0o0;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && c == '\b' && i == 67))) {
                return o00oo0oo;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<o00oo0OO> list, int i, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00oo0OO o00oo0oo = this.mItems.get(i2);
                if (o00oo0oo.hasSubMenu()) {
                    o00oo0oo.f700o00ooO0O.findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char c = isQwertyMode ? o00oo0oo.f696o00oo0oO : o00oo0oo.f695o00oo0o0;
                if (((modifiers & o0.o00oOOo0.f6866o00oOo0O) == ((isQwertyMode ? o00oo0oo.f716o0O0o : o00oo0oo.f694o00oo0o) & o0.o00oOOo0.f6866o00oOo0O)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (isQwertyMode && c == '\b' && i == 67)) && o00oo0oo.isEnabled()) {
                        list.add(o00oo0oo);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<o00oo0OO> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<o00oo0O> next = it.next();
                o00oo0O o00oo0o2 = next.get();
                if (o00oo0o2 == null) {
                    this.mPresenters.remove(next);
                } else {
                    z |= o00oo0o2.flagActionItems();
                }
            }
            if (z) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    o00oo0OO o00oo0oo = visibleItems.get(i);
                    (o00oo0oo.o00oo0OO() ? this.mActionItems : this.mNonActionItems).add(o00oo0oo);
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<o00oo0OO> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public o00oo0OO getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public ArrayList<o00oo0OO> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public o00oOoO getRootMenu() {
        return this;
    }

    @oo0oO0
    public ArrayList<o00oo0OO> getVisibleItems() {
        if (this.mIsVisibleItemsStale) {
            this.mVisibleItems.clear();
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                o00oo0OO o00oo0oo = this.mItems.get(i);
                if (o00oo0oo.isVisible()) {
                    this.mVisibleItems.add(o00oo0oo);
                }
            }
            this.mIsVisibleItemsStale = false;
            this.mIsActionItemsStale = true;
            return this.mVisibleItems;
        }
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(o00oo0OO o00oo0oo) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(o00oo0OO o00oo0oo) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        close(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performItemAction(android.view.MenuItem r7, androidx.appcompat.view.menu.o00oo0O r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.o00oo0OO r7 = (androidx.appcompat.view.menu.o00oo0OO) r7
            r0 = 0
            if (r7 == 0) goto L66
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L66
        Lc:
            boolean r1 = r7.o00oo0()
            o0O000oo.o00oOo00 r2 = r7.f712o00ooo0o
            r3 = 1
            if (r2 == 0) goto L1d
            boolean r4 = r2.o00oOOoO()
            if (r4 == 0) goto L1d
            r4 = r3
            goto L1e
        L1d:
            r4 = r0
        L1e:
            boolean r5 = r7.o00oo00O()
            if (r5 == 0) goto L2f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L65
        L2b:
            r6.close(r3)
            goto L65
        L2f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3d
            if (r4 == 0) goto L38
            goto L3d
        L38:
            r7 = r9 & 1
            if (r7 != 0) goto L65
            goto L2b
        L3d:
            r9 = r9 & 4
            if (r9 != 0) goto L44
            r6.close(r0)
        L44:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L56
            androidx.appcompat.view.menu.o00ooO0 r9 = new androidx.appcompat.view.menu.o00ooO0
            android.content.Context r0 = r6.getContext()
            r9.<init>(r0, r6, r7)
            r7.o00ooO0o(r9)
        L56:
            androidx.appcompat.view.menu.o00ooO0 r7 = r7.f700o00ooO0O
            if (r4 == 0) goto L5d
            r2.o00oOoO0(r7)
        L5d:
            boolean r7 = r6.dispatchSubMenuSelected(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L65
            goto L2b
        L65:
            return r1
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.o00oOoO.performItemAction(android.view.MenuItem, androidx.appcompat.view.menu.o00oo0O, int):boolean");
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        o00oo0OO findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(findGroupIndex).f689o00oo00O != i) {
                    break;
                }
                removeItemAtInt(findGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void removeMenuPresenter(o00oo0O o00oo0o2) {
        Iterator<WeakReference<o00oo0O>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<o00oo0O> next = it.next();
            o00oo0O o00oo0o3 = next.get();
            if (o00oo0o3 == null || o00oo0o3 == o00oo0o2) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((o00ooO0) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o00ooO0) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(o00oOOo0 o00oooo02) {
        this.mCallback = o00oooo02;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public o00oOoO setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            o00oo0OO o00oo0oo = this.mItems.get(i);
            if (o00oo0oo.f689o00oo00O == groupId && o00oo0oo.o00oo0O0() && o00oo0oo.isCheckable()) {
                o00oo0oo.o0O0o(o00oo0oo == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00oo0OO o00oo0oo = this.mItems.get(i2);
            if (o00oo0oo.f689o00oo00O == i) {
                o00oo0oo.o00oo(z2);
                o00oo0oo.setCheckable(z);
            }
        }
    }

    @Override // o0.o00oOOo0, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00oo0OO o00oo0oo = this.mItems.get(i2);
            if (o00oo0oo.f689o00oo00O == i) {
                o00oo0oo.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o00oo0OO o00oo0oo = this.mItems.get(i2);
            if (o00oo0oo.f689o00oo00O == i && o00oo0oo.o00ooO(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    public o00oOoO setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    public o00oOoO setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public o00oOoO setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    public o00oOoO setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public o00oOoO setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }
}
