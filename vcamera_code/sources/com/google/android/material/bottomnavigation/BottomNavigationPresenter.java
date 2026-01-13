package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.view.menu.o00oo0OO;
import androidx.appcompat.view.menu.o00ooO0;
import androidx.appcompat.view.menu.o0O0o;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class BottomNavigationPresenter implements o00oo0O {
    private int id;
    private o00oOoO menu;
    private BottomNavigationMenuView menuView;
    private boolean updateSuspended = false;

    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @oo0oO0
            public SavedState createFromParcel(@oo0oO0 Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @oo0oO0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        @o0OO00OO
        public ParcelableSparseArray badgeSavedStates;
        public int selectedItemId;

        public SavedState() {
        }

        public SavedState(@oo0oO0 Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@oo0oO0 Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean collapseItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean expandItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public int getId() {
        return this.id;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public o0O0o getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void initForMenu(Context context, o00oOoO o00oooo2) {
        this.menu = o00oooo2;
        this.menuView.initialize(o00oooo2);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(o00oOoO o00oooo2, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.setBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    @oo0oO0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(o00ooO0 o00ooo02) {
        return false;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView bottomNavigationMenuView) {
        this.menuView = bottomNavigationMenuView;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }
}
