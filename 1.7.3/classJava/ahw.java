/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ahw {
    private afs b;
    private int c;
    private int d;
    private int e;
    private final boolean f;
    private List g = new ArrayList();
    final /* synthetic */ ahv a;

    public ahw(ahv ahv2, afs afs2, int n2, int n3, int n4) {
        this.a = ahv2;
        this.b = afs2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        ahz ahz2 = afs2.a(n2, n3, n4);
        int n5 = afs2.e(n2, n3, n4);
        if (((ahv)ahz2).a) {
            this.f = true;
            n5 &= 0xFFFFFFF7;
        } else {
            this.f = false;
        }
        this.a(n5);
    }

    private void a(int n2) {
        this.g.clear();
        if (n2 == 0) {
            this.g.add(new afk(this.c, this.d, this.e - 1));
            this.g.add(new afk(this.c, this.d, this.e + 1));
        } else if (n2 == 1) {
            this.g.add(new afk(this.c - 1, this.d, this.e));
            this.g.add(new afk(this.c + 1, this.d, this.e));
        } else if (n2 == 2) {
            this.g.add(new afk(this.c - 1, this.d, this.e));
            this.g.add(new afk(this.c + 1, this.d + 1, this.e));
        } else if (n2 == 3) {
            this.g.add(new afk(this.c - 1, this.d + 1, this.e));
            this.g.add(new afk(this.c + 1, this.d, this.e));
        } else if (n2 == 4) {
            this.g.add(new afk(this.c, this.d + 1, this.e - 1));
            this.g.add(new afk(this.c, this.d, this.e + 1));
        } else if (n2 == 5) {
            this.g.add(new afk(this.c, this.d, this.e - 1));
            this.g.add(new afk(this.c, this.d + 1, this.e + 1));
        } else if (n2 == 6) {
            this.g.add(new afk(this.c + 1, this.d, this.e));
            this.g.add(new afk(this.c, this.d, this.e + 1));
        } else if (n2 == 7) {
            this.g.add(new afk(this.c - 1, this.d, this.e));
            this.g.add(new afk(this.c, this.d, this.e + 1));
        } else if (n2 == 8) {
            this.g.add(new afk(this.c - 1, this.d, this.e));
            this.g.add(new afk(this.c, this.d, this.e - 1));
        } else if (n2 == 9) {
            this.g.add(new afk(this.c + 1, this.d, this.e));
            this.g.add(new afk(this.c, this.d, this.e - 1));
        }
    }

    private void b() {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            ahw ahw2 = this.a((afk)this.g.get(i2));
            if (ahw2 == null || !ahw2.a(this)) {
                this.g.remove(i2--);
                continue;
            }
            this.g.set(i2, new afk(ahw2.c, ahw2.d, ahw2.e));
        }
    }

    private boolean a(int n2, int n3, int n4) {
        if (ahv.b_(this.b, n2, n3, n4)) {
            return true;
        }
        if (ahv.b_(this.b, n2, n3 + 1, n4)) {
            return true;
        }
        return ahv.b_(this.b, n2, n3 - 1, n4);
    }

    private ahw a(afk afk2) {
        if (ahv.b_(this.b, afk2.a, afk2.b, afk2.c)) {
            return new ahw(this.a, this.b, afk2.a, afk2.b, afk2.c);
        }
        if (ahv.b_(this.b, afk2.a, afk2.b + 1, afk2.c)) {
            return new ahw(this.a, this.b, afk2.a, afk2.b + 1, afk2.c);
        }
        if (ahv.b_(this.b, afk2.a, afk2.b - 1, afk2.c)) {
            return new ahw(this.a, this.b, afk2.a, afk2.b - 1, afk2.c);
        }
        return null;
    }

    private boolean a(ahw ahw2) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            afk afk2 = (afk)this.g.get(i2);
            if (afk2.a != ahw2.c || afk2.c != ahw2.e) continue;
            return true;
        }
        return false;
    }

    private boolean b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            afk afk2 = (afk)this.g.get(i2);
            if (afk2.a != n2 || afk2.c != n4) continue;
            return true;
        }
        return false;
    }

    protected int a() {
        int n2 = 0;
        if (this.a(this.c, this.d, this.e - 1)) {
            ++n2;
        }
        if (this.a(this.c, this.d, this.e + 1)) {
            ++n2;
        }
        if (this.a(this.c - 1, this.d, this.e)) {
            ++n2;
        }
        if (this.a(this.c + 1, this.d, this.e)) {
            ++n2;
        }
        return n2;
    }

    private boolean b(ahw ahw2) {
        if (this.a(ahw2)) {
            return true;
        }
        if (this.g.size() == 2) {
            return false;
        }
        if (this.g.isEmpty()) {
            return true;
        }
        return true;
    }

    private void c(ahw ahw2) {
        this.g.add(new afk(ahw2.c, ahw2.d, ahw2.e));
        boolean bl2 = this.b(this.c, this.d, this.e - 1);
        boolean bl3 = this.b(this.c, this.d, this.e + 1);
        boolean bl4 = this.b(this.c - 1, this.d, this.e);
        boolean bl5 = this.b(this.c + 1, this.d, this.e);
        int n2 = -1;
        if (bl2 || bl3) {
            n2 = 0;
        }
        if (bl4 || bl5) {
            n2 = 1;
        }
        if (!this.f) {
            if (bl3 && bl5 && !bl2 && !bl4) {
                n2 = 6;
            }
            if (bl3 && bl4 && !bl2 && !bl5) {
                n2 = 7;
            }
            if (bl2 && bl4 && !bl3 && !bl5) {
                n2 = 8;
            }
            if (bl2 && bl5 && !bl3 && !bl4) {
                n2 = 9;
            }
        }
        if (n2 == 0) {
            if (ahv.b_(this.b, this.c, this.d + 1, this.e - 1)) {
                n2 = 4;
            }
            if (ahv.b_(this.b, this.c, this.d + 1, this.e + 1)) {
                n2 = 5;
            }
        }
        if (n2 == 1) {
            if (ahv.b_(this.b, this.c + 1, this.d + 1, this.e)) {
                n2 = 2;
            }
            if (ahv.b_(this.b, this.c - 1, this.d + 1, this.e)) {
                n2 = 3;
            }
        }
        if (n2 < 0) {
            n2 = 0;
        }
        int n3 = n2;
        if (this.f) {
            n3 = this.b.e(this.c, this.d, this.e) & 8 | n2;
        }
        this.b.a(this.c, this.d, this.e, n3, 3);
    }

    private boolean c(int n2, int n3, int n4) {
        ahw ahw2 = this.a(new afk(n2, n3, n4));
        if (ahw2 == null) {
            return false;
        }
        ahw2.b();
        return ahw2.b(this);
    }

    public void a(boolean bl2, boolean bl3) {
        boolean bl4 = this.c(this.c, this.d, this.e - 1);
        boolean bl5 = this.c(this.c, this.d, this.e + 1);
        boolean bl6 = this.c(this.c - 1, this.d, this.e);
        boolean bl7 = this.c(this.c + 1, this.d, this.e);
        int n2 = -1;
        if ((bl4 || bl5) && !bl6 && !bl7) {
            n2 = 0;
        }
        if ((bl6 || bl7) && !bl4 && !bl5) {
            n2 = 1;
        }
        if (!this.f) {
            if (bl5 && bl7 && !bl4 && !bl6) {
                n2 = 6;
            }
            if (bl5 && bl6 && !bl4 && !bl7) {
                n2 = 7;
            }
            if (bl4 && bl6 && !bl5 && !bl7) {
                n2 = 8;
            }
            if (bl4 && bl7 && !bl5 && !bl6) {
                n2 = 9;
            }
        }
        if (n2 == -1) {
            if (bl4 || bl5) {
                n2 = 0;
            }
            if (bl6 || bl7) {
                n2 = 1;
            }
            if (!this.f) {
                if (bl2) {
                    if (bl5 && bl7) {
                        n2 = 6;
                    }
                    if (bl6 && bl5) {
                        n2 = 7;
                    }
                    if (bl7 && bl4) {
                        n2 = 9;
                    }
                    if (bl4 && bl6) {
                        n2 = 8;
                    }
                } else {
                    if (bl4 && bl6) {
                        n2 = 8;
                    }
                    if (bl7 && bl4) {
                        n2 = 9;
                    }
                    if (bl6 && bl5) {
                        n2 = 7;
                    }
                    if (bl5 && bl7) {
                        n2 = 6;
                    }
                }
            }
        }
        if (n2 == 0) {
            if (ahv.b_(this.b, this.c, this.d + 1, this.e - 1)) {
                n2 = 4;
            }
            if (ahv.b_(this.b, this.c, this.d + 1, this.e + 1)) {
                n2 = 5;
            }
        }
        if (n2 == 1) {
            if (ahv.b_(this.b, this.c + 1, this.d + 1, this.e)) {
                n2 = 2;
            }
            if (ahv.b_(this.b, this.c - 1, this.d + 1, this.e)) {
                n2 = 3;
            }
        }
        if (n2 < 0) {
            n2 = 0;
        }
        this.a(n2);
        int n3 = n2;
        if (this.f) {
            n3 = this.b.e(this.c, this.d, this.e) & 8 | n2;
        }
        if (bl3 || this.b.e(this.c, this.d, this.e) != n3) {
            this.b.a(this.c, this.d, this.e, n3, 3);
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                ahw ahw2 = this.a((afk)this.g.get(i2));
                if (ahw2 == null) continue;
                ahw2.b();
                if (!ahw2.b(this)) continue;
                ahw2.c(this);
            }
        }
    }
}

