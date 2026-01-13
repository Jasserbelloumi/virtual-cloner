package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.AdError;
/* loaded from: classes.dex */
public class o00oOo0O {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f1959o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f1960o00oOo0O = 3;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f1961o00oOo0o = 4;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f1962o00oOoO = 6;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f1963o00oOoO0 = 5;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f1964o00oOoOO = 7;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f1965o00oOoOo = -1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f1966o00oOoo0 = 0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f1967o00oOooO = 2;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f1968o00oOooo = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f1969o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f1970o00oo00O = -2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f1971o00oo0OO = 0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ConstraintLayout.o00oOOoO f1972o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public View f1973o00oOOoO;

    public o00oOo0O(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.o00oOOoO)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f1972o00oOOo0 = (ConstraintLayout.o00oOOoO) layoutParams;
        this.f1973o00oOOoO = view;
    }

    public o00oOo0O o0(float f) {
        this.f1972o00oOOo0.f1825o00ooOo0 = f;
        return this;
    }

    public o00oOo0O o00oOOo0(int i, int i2) {
        o00oo00O(1, i, i == 0 ? 1 : 2, 0);
        o00oo00O(2, i2, i2 == 0 ? 2 : 1, 0);
        if (i != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i)).o00oo00O(2, this.f1973o00oOOoO.getId(), 1, 0);
        }
        if (i2 != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i2)).o00oo00O(1, this.f1973o00oOOoO.getId(), 2, 0);
        }
        return this;
    }

    public o00oOo0O o00oOOoO(int i, int i2) {
        o00oo00O(6, i, i == 0 ? 6 : 7, 0);
        o00oo00O(7, i2, i2 == 0 ? 7 : 6, 0);
        if (i != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i)).o00oo00O(7, this.f1973o00oOOoO.getId(), 6, 0);
        }
        if (i2 != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i2)).o00oo00O(6, this.f1973o00oOOoO.getId(), 7, 0);
        }
        return this;
    }

    public o00oOo0O o00oOo00(int i, int i2) {
        o00oo00O(3, i, i == 0 ? 3 : 4, 0);
        o00oo00O(4, i2, i2 == 0 ? 4 : 3, 0);
        if (i != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i)).o00oo00O(4, this.f1973o00oOOoO.getId(), 3, 0);
        }
        if (i2 != 0) {
            new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i2)).o00oo00O(3, this.f1973o00oOOoO.getId(), 4, 0);
        }
        return this;
    }

    public void o00oOo0O() {
    }

    public o00oOo0O o00oOo0o(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 >= 0) {
            if (i6 >= 0) {
                if (f <= 0.0f || f > 1.0f) {
                    throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
                }
                int i7 = 2;
                int i8 = 1;
                if (i2 != 1 && i2 != 2) {
                    i7 = 7;
                    i8 = 6;
                    if (i2 != 6 && i2 != 7) {
                        o00oo00O(3, i, i2, i3);
                        o00oo00O(4, i4, i5, i6);
                        this.f1972o00oOOo0.f1820o00ooO0o = f;
                        return this;
                    }
                }
                o00oo00O(i8, i, i2, i3);
                o00oo00O(i7, i4, i5, i6);
                this.f1972o00oOOo0.f1819o00ooO0O = f;
                return this;
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public o00oOo0O o00oOoO(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        o00oo00O(1, i, i2, i3);
        o00oo00O(2, i4, i5, i6);
        this.f1972o00oOOo0.f1819o00ooO0O = f;
        return this;
    }

    public o00oOo0O o00oOoO0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        o00oOo0O o00ooo0o2;
        int i6;
        int i7;
        if (i == 0) {
            i6 = 0;
            i2 = 1;
            i3 = 0;
            i7 = 0;
            i4 = 2;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
        } else {
            i2 = 2;
            i3 = 0;
            i4 = 1;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
            i6 = i;
            i7 = i;
        }
        o00ooo0o2.o00oOo0o(i6, i2, i3, i7, i4, i5, f);
        return this;
    }

    public o00oOo0O o00oOoOO(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        o00oOo0O o00ooo0o2;
        int i6;
        int i7;
        if (i == 0) {
            i6 = 0;
            i2 = 6;
            i3 = 0;
            i7 = 0;
            i4 = 7;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
        } else {
            i2 = 7;
            i3 = 0;
            i4 = 6;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
            i6 = i;
            i7 = i;
        }
        o00ooo0o2.o00oOo0o(i6, i2, i3, i7, i4, i5, f);
        return this;
    }

    public o00oOo0O o00oOoOo(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        o00oo00O(6, i, i2, i3);
        o00oo00O(7, i4, i5, i6);
        this.f1972o00oOOo0.f1819o00ooO0O = f;
        return this;
    }

    public o00oOo0O o00oOoo0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        o00oOo0O o00ooo0o2;
        int i6;
        int i7;
        if (i == 0) {
            i6 = 0;
            i2 = 3;
            i3 = 0;
            i7 = 0;
            i4 = 4;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
        } else {
            i2 = 4;
            i3 = 0;
            i4 = 3;
            i5 = 0;
            f = 0.5f;
            o00ooo0o2 = this;
            i6 = i;
            i7 = i;
        }
        o00ooo0o2.o00oOo0o(i6, i2, i3, i7, i4, i5, f);
        return this;
    }

    public o00oOo0O o00oOooO(float f) {
        this.f1973o00oOOoO.setAlpha(f);
        return this;
    }

    public o00oOo0O o00oOooo(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        o00oo00O(3, i, i2, i3);
        o00oo00O(4, i4, i5, i6);
        this.f1972o00oOOo0.f1820o00ooO0o = f;
        return this;
    }

    public o00oOo0O o00oo(float f) {
        this.f1973o00oOOoO.setElevation(f);
        return this;
    }

    public o00oOo0O o00oo0(int i) {
        this.f1972o00oOOo0.f1829o00ooo00 = i;
        return this;
    }

    public o00oOo0O o00oo00O(int i, int i2, int i3, int i4) {
        ConstraintLayout.o00oOOoO o00ooooo2;
        ConstraintLayout.o00oOOoO o00ooooo3;
        switch (i) {
            case 1:
                if (i3 == 1) {
                    ConstraintLayout.o00oOOoO o00ooooo4 = this.f1972o00oOOo0;
                    o00ooooo4.f1804o00oOooO = i2;
                    o00ooooo4.f1797o00oOo0O = -1;
                } else if (i3 != 2) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Left to ");
                    o00oOOo02.append(o00ooo0(i3));
                    o00oOOo02.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo02.toString());
                } else {
                    ConstraintLayout.o00oOOoO o00ooooo5 = this.f1972o00oOOo0;
                    o00ooooo5.f1797o00oOo0O = i2;
                    o00ooooo5.f1804o00oOooO = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).leftMargin = i4;
                break;
            case 2:
                if (i3 == 1) {
                    ConstraintLayout.o00oOOoO o00ooooo6 = this.f1972o00oOOo0;
                    o00ooooo6.f1798o00oOo0o = i2;
                    o00ooooo6.f1800o00oOoO0 = -1;
                } else if (i3 != 2) {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo03.append(o00ooo0(i3));
                    o00oOOo03.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo03.toString());
                } else {
                    ConstraintLayout.o00oOOoO o00ooooo7 = this.f1972o00oOOo0;
                    o00ooooo7.f1800o00oOoO0 = i2;
                    o00ooooo7.f1798o00oOo0o = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).rightMargin = i4;
                break;
            case 3:
                if (i3 == 3) {
                    o00ooooo2 = this.f1972o00oOOo0;
                    o00ooooo2.f1799o00oOoO = i2;
                    o00ooooo2.f1801o00oOoOO = -1;
                } else if (i3 != 4) {
                    StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo04.append(o00ooo0(i3));
                    o00oOOo04.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo04.toString());
                } else {
                    o00ooooo2 = this.f1972o00oOOo0;
                    o00ooooo2.f1801o00oOoOO = i2;
                    o00ooooo2.f1799o00oOoO = -1;
                }
                o00ooooo2.f1805o00oOooo = -1;
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).topMargin = i4;
                break;
            case 4:
                if (i3 == 4) {
                    o00ooooo3 = this.f1972o00oOOo0;
                    o00ooooo3.f1803o00oOoo0 = i2;
                    o00ooooo3.f1802o00oOoOo = -1;
                } else if (i3 != 3) {
                    StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo05.append(o00ooo0(i3));
                    o00oOOo05.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo05.toString());
                } else {
                    o00ooooo3 = this.f1972o00oOOo0;
                    o00ooooo3.f1802o00oOoOo = i2;
                    o00ooooo3.f1803o00oOoo0 = -1;
                }
                o00ooooo3.f1805o00oOooo = -1;
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).bottomMargin = i4;
                break;
            case 5:
                if (i3 != 5) {
                    StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo06.append(o00ooo0(i3));
                    o00oOOo06.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo06.toString());
                }
                ConstraintLayout.o00oOOoO o00ooooo8 = this.f1972o00oOOo0;
                o00ooooo8.f1805o00oOooo = i2;
                o00ooooo8.f1803o00oOoo0 = -1;
                o00ooooo8.f1802o00oOoOo = -1;
                o00ooooo8.f1799o00oOoO = -1;
                o00ooooo8.f1801o00oOoOO = -1;
                break;
            case 6:
                if (i3 == 6) {
                    ConstraintLayout.o00oOOoO o00ooooo9 = this.f1972o00oOOo0;
                    o00ooooo9.f1809o00oo0O = i2;
                    o00ooooo9.f1810o00oo0O0 = -1;
                } else if (i3 != 7) {
                    StringBuilder o00oOOo07 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo07.append(o00ooo0(i3));
                    o00oOOo07.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo07.toString());
                } else {
                    ConstraintLayout.o00oOOoO o00ooooo10 = this.f1972o00oOOo0;
                    o00ooooo10.f1810o00oo0O0 = i2;
                    o00ooooo10.f1809o00oo0O = -1;
                }
                this.f1972o00oOOo0.setMarginStart(i4);
                break;
            case 7:
                if (i3 == 7) {
                    ConstraintLayout.o00oOOoO o00ooooo11 = this.f1972o00oOOo0;
                    o00ooooo11.f1814o00oo0o0 = i2;
                    o00ooooo11.f1812o00oo0Oo = -1;
                } else if (i3 != 6) {
                    StringBuilder o00oOOo08 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo08.append(o00ooo0(i3));
                    o00oOOo08.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo08.toString());
                } else {
                    ConstraintLayout.o00oOOoO o00ooooo12 = this.f1972o00oOOo0;
                    o00ooooo12.f1812o00oo0Oo = i2;
                    o00ooooo12.f1814o00oo0o0 = -1;
                }
                this.f1972o00oOOo0.setMarginEnd(i4);
                break;
            default:
                throw new IllegalArgumentException(o00ooo0(i) + " to " + o00ooo0(i3) + " unknown");
        }
        return this;
    }

    public o00oOo0O o00oo0O(int i) {
        this.f1972o00oOOo0.f1832o00oooO = i;
        return this;
    }

    public o00oOo0O o00oo0O0(int i) {
        ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).height = i;
        return this;
    }

    public o00oOo0O o00oo0OO(int i) {
        this.f1972o00oOOo0.f1827o00ooOoo = i;
        return this;
    }

    public o00oOo0O o00oo0Oo(int i) {
        this.f1972o00oOOo0.f1831o00ooo0o = i;
        return this;
    }

    public o00oOo0O o00oo0o(int i) {
        this.f1972o00oOOo0.f1828o00ooo0 = i;
        return this;
    }

    public o00oOo0O o00oo0o0(int i) {
        this.f1972o00oOOo0.f1830o00ooo0O = i;
        return this;
    }

    public o00oOo0O o00oo0oO(int i) {
        ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).width = i;
        return this;
    }

    public o00oOo0O o00ooO(int i, int i2) {
        switch (i) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).leftMargin = i2;
                break;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).rightMargin = i2;
                break;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).topMargin = i2;
                break;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f1972o00oOOo0).bottomMargin = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f1972o00oOOo0.setMarginStart(i2);
                break;
            case 7:
                this.f1972o00oOOo0.setMarginEnd(i2);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public o00oOo0O o00ooO0(float f) {
        this.f1972o00oOOo0.f1819o00ooO0O = f;
        return this;
    }

    public o00oOo0O o00ooO00(int i, int i2) {
        switch (i) {
            case 1:
                this.f1972o00oOOo0.f1813o00oo0o = i2;
                break;
            case 2:
                this.f1972o00oOOo0.f1855o0O0o = i2;
                break;
            case 3:
                this.f1972o00oOOo0.f1815o00oo0oO = i2;
                break;
            case 4:
                this.f1972o00oOOo0.f1806o00oo = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f1972o00oOOo0.f1818o00ooO00 = i2;
                break;
            case 7:
                this.f1972o00oOOo0.f1817o00ooO0 = i2;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public o00oOo0O o00ooO0O(int i) {
        this.f1972o00oOOo0.f1824o00ooOo = i;
        return this;
    }

    public o00oOo0O o00ooO0o(float f) {
        this.f1972o00oOOo0.f1823o00ooOOo = f;
        return this;
    }

    public o00oOo0O o00ooOO() {
        ConstraintLayout.o00oOOoO o00ooooo2 = this.f1972o00oOOo0;
        int i = o00ooooo2.f1797o00oOo0O;
        int i2 = o00ooooo2.f1798o00oOo0o;
        if (i == -1 && i2 == -1) {
            int i3 = o00ooooo2.f1810o00oo0O0;
            int i4 = o00ooooo2.f1812o00oo0Oo;
            if (i3 != -1 || i4 != -1) {
                o00oOo0O o00ooo0o2 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i3));
                o00oOo0O o00ooo0o3 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i4));
                ConstraintLayout.o00oOOoO o00ooooo3 = this.f1972o00oOOo0;
                if (i3 != -1 && i4 != -1) {
                    o00ooo0o2.o00oo00O(7, i4, 6, 0);
                    o00ooo0o3.o00oo00O(6, i, 7, 0);
                } else if (i != -1 || i4 != -1) {
                    int i5 = o00ooooo3.f1800o00oOoO0;
                    if (i5 != -1) {
                        o00ooo0o2.o00oo00O(7, i5, 7, 0);
                    } else {
                        int i6 = o00ooooo3.f1804o00oOooO;
                        if (i6 != -1) {
                            o00ooo0o3.o00oo00O(6, i6, 6, 0);
                        }
                    }
                }
            }
            o00ooOO0(6);
            o00ooOO0(7);
        } else {
            o00oOo0O o00ooo0o4 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i));
            o00oOo0O o00ooo0o5 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i2));
            ConstraintLayout.o00oOOoO o00ooooo4 = this.f1972o00oOOo0;
            if (i != -1 && i2 != -1) {
                o00ooo0o4.o00oo00O(2, i2, 1, 0);
                o00ooo0o5.o00oo00O(1, i, 2, 0);
            } else if (i != -1 || i2 != -1) {
                int i7 = o00ooooo4.f1800o00oOoO0;
                if (i7 != -1) {
                    o00ooo0o4.o00oo00O(2, i7, 2, 0);
                } else {
                    int i8 = o00ooooo4.f1804o00oOooO;
                    if (i8 != -1) {
                        o00ooo0o5.o00oo00O(1, i8, 1, 0);
                    }
                }
            }
            o00ooOO0(1);
            o00ooOO0(2);
        }
        return this;
    }

    public o00oOo0O o00ooOO0(int i) {
        switch (i) {
            case 1:
                ConstraintLayout.o00oOOoO o00ooooo2 = this.f1972o00oOOo0;
                o00ooooo2.f1797o00oOo0O = -1;
                o00ooooo2.f1804o00oOooO = -1;
                ((ViewGroup.MarginLayoutParams) o00ooooo2).leftMargin = -1;
                o00ooooo2.f1813o00oo0o = -1;
                break;
            case 2:
                ConstraintLayout.o00oOOoO o00ooooo3 = this.f1972o00oOOo0;
                o00ooooo3.f1800o00oOoO0 = -1;
                o00ooooo3.f1798o00oOo0o = -1;
                ((ViewGroup.MarginLayoutParams) o00ooooo3).rightMargin = -1;
                o00ooooo3.f1855o0O0o = -1;
                break;
            case 3:
                ConstraintLayout.o00oOOoO o00ooooo4 = this.f1972o00oOOo0;
                o00ooooo4.f1801o00oOoOO = -1;
                o00ooooo4.f1799o00oOoO = -1;
                ((ViewGroup.MarginLayoutParams) o00ooooo4).topMargin = -1;
                o00ooooo4.f1815o00oo0oO = -1;
                break;
            case 4:
                ConstraintLayout.o00oOOoO o00ooooo5 = this.f1972o00oOOo0;
                o00ooooo5.f1802o00oOoOo = -1;
                o00ooooo5.f1803o00oOoo0 = -1;
                ((ViewGroup.MarginLayoutParams) o00ooooo5).bottomMargin = -1;
                o00ooooo5.f1806o00oo = -1;
                break;
            case 5:
                this.f1972o00oOOo0.f1805o00oOooo = -1;
                break;
            case 6:
                ConstraintLayout.o00oOOoO o00ooooo6 = this.f1972o00oOOo0;
                o00ooooo6.f1810o00oo0O0 = -1;
                o00ooooo6.f1809o00oo0O = -1;
                o00ooooo6.setMarginStart(-1);
                this.f1972o00oOOo0.f1818o00ooO00 = -1;
                break;
            case 7:
                ConstraintLayout.o00oOOoO o00ooooo7 = this.f1972o00oOOo0;
                o00ooooo7.f1812o00oo0Oo = -1;
                o00ooooo7.f1814o00oo0o0 = -1;
                o00ooooo7.setMarginEnd(-1);
                this.f1972o00oOOo0.f1817o00ooO0 = -1;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public o00oOo0O o00ooOOo() {
        ConstraintLayout.o00oOOoO o00ooooo2 = this.f1972o00oOOo0;
        int i = o00ooooo2.f1801o00oOoOO;
        int i2 = o00ooooo2.f1802o00oOoOo;
        if (i != -1 || i2 != -1) {
            o00oOo0O o00ooo0o2 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i));
            o00oOo0O o00ooo0o3 = new o00oOo0O(((ViewGroup) this.f1973o00oOOoO.getParent()).findViewById(i2));
            ConstraintLayout.o00oOOoO o00ooooo3 = this.f1972o00oOOo0;
            if (i != -1 && i2 != -1) {
                o00ooo0o2.o00oo00O(4, i2, 3, 0);
                o00ooo0o3.o00oo00O(3, i, 4, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = o00ooooo3.f1803o00oOoo0;
                if (i3 != -1) {
                    o00ooo0o2.o00oo00O(4, i3, 4, 0);
                } else {
                    int i4 = o00ooooo3.f1799o00oOoO;
                    if (i4 != -1) {
                        o00ooo0o3.o00oo00O(3, i4, 3, 0);
                    }
                }
            }
        }
        o00ooOO0(3);
        o00ooOO0(4);
        return this;
    }

    public o00oOo0O o00ooOo(float f) {
        this.f1973o00oOOoO.setRotationX(f);
        return this;
    }

    public o00oOo0O o00ooOo0(float f) {
        this.f1973o00oOOoO.setRotation(f);
        return this;
    }

    public o00oOo0O o00ooOoO(float f) {
        this.f1973o00oOOoO.setRotationY(f);
        return this;
    }

    public o00oOo0O o00ooOoo(float f) {
        this.f1973o00oOOoO.setScaleY(f);
        return this;
    }

    public final String o00ooo0(int i) {
        switch (i) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public o00oOo0O o00ooo00(float f) {
        return this;
    }

    public o00oOo0O o00ooo0O(float f, float f2) {
        this.f1973o00oOOoO.setPivotX(f);
        this.f1973o00oOOoO.setPivotY(f2);
        return this;
    }

    public o00oOo0O o00ooo0o(float f) {
        this.f1973o00oOOoO.setPivotX(f);
        return this;
    }

    public o00oOo0O o00oooO(float f) {
        this.f1973o00oOOoO.setPivotY(f);
        return this;
    }

    public o00oOo0O o00oooOO(float f, float f2) {
        this.f1973o00oOOoO.setTranslationX(f);
        this.f1973o00oOOoO.setTranslationY(f2);
        return this;
    }

    public o00oOo0O o00oooOo(float f) {
        this.f1973o00oOOoO.setTranslationX(f);
        return this;
    }

    public o00oOo0O o00oooo(float f) {
        this.f1973o00oOOoO.setTranslationZ(f);
        return this;
    }

    public o00oOo0O o00oooo0(float f) {
        this.f1973o00oOOoO.setTranslationY(f);
        return this;
    }

    public o00oOo0O o00ooooO(float f) {
        this.f1972o00oOOo0.f1820o00ooO0o = f;
        return this;
    }

    public o00oOo0O o00ooooo(int i) {
        this.f1972o00oOOo0.f1826o00ooOoO = i;
        return this;
    }

    public o00oOo0O o0O00000(int i) {
        this.f1973o00oOOoO.setVisibility(i);
        return this;
    }

    public o00oOo0O o0O0o(String str) {
        this.f1972o00oOOo0.f1816o00ooO = str;
        return this;
    }
}
