/*
 * Decompiled with CFR 0.152.
 */
public abstract class alx
extends ahz {
    protected pw N;

    protected alx(avk avk2) {
        super(avk2);
    }

    @Override
    public int b() {
        return 31;
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        int n7 = n6 & 3;
        int n8 = 0;
        switch (n5) {
            case 2: 
            case 3: {
                n8 = 8;
                break;
            }
            case 4: 
            case 5: {
                n8 = 4;
                break;
            }
            case 0: 
            case 1: {
                n8 = 0;
            }
        }
        return n7 | n8;
    }

    @Override
    public pw a(int n2, int n3) {
        int n4 = n3 & 0xC;
        int n5 = n3 & 3;
        if (n4 == 0 && (n2 == 1 || n2 == 0)) {
            return this.d(n5);
        }
        if (n4 == 4 && (n2 == 5 || n2 == 4)) {
            return this.d(n5);
        }
        if (n4 == 8 && (n2 == 2 || n2 == 3)) {
            return this.d(n5);
        }
        return this.b(n5);
    }

    protected abstract pw b(int var1);

    protected pw d(int n2) {
        return this.N;
    }

    @Override
    public int a(int n2) {
        return n2 & 3;
    }

    public int k(int n2) {
        return n2 & 3;
    }

    @Override
    protected abu j(int n2) {
        return new abu(abs.a(this), 1, this.k(n2));
    }
}

