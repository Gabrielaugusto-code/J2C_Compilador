/*
 * Decompiled with CFR 0.152.
 */
public class alk
extends ahv {
    protected pw b;

    protected alk() {
        super(true);
    }

    @Override
    public pw a(int n2, int n3) {
        if ((n3 & 8) == 0) {
            return this.L;
        }
        return this.b;
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.b = px2.a(this.N() + "_powered");
    }

    protected boolean a(afs afs2, int n2, int n3, int n4, int n5, boolean bl2, int n6) {
        if (n6 >= 8) {
            return false;
        }
        int n7 = n5 & 7;
        boolean bl3 = true;
        switch (n7) {
            case 0: {
                if (bl2) {
                    ++n4;
                    break;
                }
                --n4;
                break;
            }
            case 1: {
                if (bl2) {
                    --n2;
                    break;
                }
                ++n2;
                break;
            }
            case 2: {
                if (bl2) {
                    --n2;
                } else {
                    ++n2;
                    ++n3;
                    bl3 = false;
                }
                n7 = 1;
                break;
            }
            case 3: {
                if (bl2) {
                    --n2;
                    ++n3;
                    bl3 = false;
                } else {
                    ++n2;
                }
                n7 = 1;
                break;
            }
            case 4: {
                if (bl2) {
                    ++n4;
                } else {
                    --n4;
                    ++n3;
                    bl3 = false;
                }
                n7 = 0;
                break;
            }
            case 5: {
                if (bl2) {
                    ++n4;
                    ++n3;
                    bl3 = false;
                } else {
                    --n4;
                }
                n7 = 0;
            }
        }
        if (this.a(afs2, n2, n3, n4, bl2, n6, n7)) {
            return true;
        }
        return bl3 && this.a(afs2, n2, n3 - 1, n4, bl2, n6, n7);
    }

    protected boolean a(afs afs2, int n2, int n3, int n4, boolean bl2, int n5, int n6) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == this) {
            int n7 = afs2.e(n2, n3, n4);
            int n8 = n7 & 7;
            if (n6 == 1 && (n8 == 0 || n8 == 4 || n8 == 5)) {
                return false;
            }
            if (n6 == 0 && (n8 == 1 || n8 == 2 || n8 == 3)) {
                return false;
            }
            if ((n7 & 8) != 0) {
                if (afs2.v(n2, n3, n4)) {
                    return true;
                }
                return this.a(afs2, n2, n3, n4, n7, bl2, n5 + 1);
            }
        }
        return false;
    }

    @Override
    protected void a(afs afs2, int n2, int n3, int n4, int n5, int n6, ahz ahz2) {
        boolean bl2 = afs2.v(n2, n3, n4);
        bl2 = bl2 || this.a(afs2, n2, n3, n4, n5, true, 0) || this.a(afs2, n2, n3, n4, n5, false, 0);
        boolean bl3 = false;
        if (bl2 && (n5 & 8) == 0) {
            afs2.a(n2, n3, n4, n6 | 8, 3);
            bl3 = true;
        } else if (!bl2 && (n5 & 8) != 0) {
            afs2.a(n2, n3, n4, n6, 3);
            bl3 = true;
        }
        if (bl3) {
            afs2.d(n2, n3 - 1, n4, this);
            if (n6 == 2 || n6 == 3 || n6 == 4 || n6 == 5) {
                afs2.d(n2, n3 + 1, n4, this);
            }
        }
    }
}

