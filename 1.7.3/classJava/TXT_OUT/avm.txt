/*
 * Decompiled with CFR 0.152.
 */
public class avm {
    public static final avm[] a = new avm[64];
    public static final avm b = new avm(0, 0);
    public static final avm c = new avm(1, 8368696);
    public static final avm d = new avm(2, 16247203);
    public static final avm e = new avm(3, 0xA7A7A7);
    public static final avm f = new avm(4, 0xFF0000);
    public static final avm g = new avm(5, 0xA0A0FF);
    public static final avm h = new avm(6, 0xA7A7A7);
    public static final avm i = new avm(7, 31744);
    public static final avm j = new avm(8, 0xFFFFFF);
    public static final avm k = new avm(9, 10791096);
    public static final avm l = new avm(10, 12020271);
    public static final avm m = new avm(11, 0x707070);
    public static final avm n = new avm(12, 0x4040FF);
    public static final avm o = new avm(13, 6837042);
    public static final avm p = new avm(14, 0xFFFCF5);
    public static final avm q = new avm(15, 14188339);
    public static final avm r = new avm(16, 11685080);
    public static final avm s = new avm(17, 6724056);
    public static final avm t = new avm(18, 0xE5E533);
    public static final avm u = new avm(19, 8375321);
    public static final avm v = new avm(20, 15892389);
    public static final avm w = new avm(21, 0x4C4C4C);
    public static final avm x = new avm(22, 0x999999);
    public static final avm y = new avm(23, 5013401);
    public static final avm z = new avm(24, 8339378);
    public static final avm A = new avm(25, 3361970);
    public static final avm B = new avm(26, 6704179);
    public static final avm C = new avm(27, 6717235);
    public static final avm D = new avm(28, 0x993333);
    public static final avm E = new avm(29, 0x191919);
    public static final avm F = new avm(30, 16445005);
    public static final avm G = new avm(31, 6085589);
    public static final avm H = new avm(32, 4882687);
    public static final avm I = new avm(33, 55610);
    public static final avm J = new avm(34, 1381407);
    public static final avm K = new avm(35, 0x700200);
    public final int L;
    public final int M;

    private avm(int n2, int n3) {
        if (n2 < 0 || n2 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.M = n2;
        this.L = n3;
        avm.a[n2] = this;
    }

    public static avm a(int n2) {
        switch (air.c(n2)) {
            case 0: {
                return E;
            }
            case 1: {
                return D;
            }
            case 2: {
                return C;
            }
            case 3: {
                return B;
            }
            case 4: {
                return A;
            }
            case 5: {
                return z;
            }
            case 6: {
                return y;
            }
            case 7: {
                return x;
            }
            case 8: {
                return w;
            }
            case 9: {
                return v;
            }
            case 10: {
                return u;
            }
            case 11: {
                return t;
            }
            case 12: {
                return s;
            }
            case 13: {
                return r;
            }
            case 14: {
                return q;
            }
            case 15: {
                return j;
            }
        }
        return b;
    }

    public int b(int n2) {
        int n3 = 220;
        if (n2 == 3) {
            n3 = 135;
        }
        if (n2 == 2) {
            n3 = 255;
        }
        if (n2 == 1) {
            n3 = 220;
        }
        if (n2 == 0) {
            n3 = 180;
        }
        int n4 = (this.L >> 16 & 0xFF) * n3 / 255;
        int n5 = (this.L >> 8 & 0xFF) * n3 / 255;
        int n6 = (this.L & 0xFF) * n3 / 255;
        return 0xFF000000 | n4 << 16 | n5 << 8 | n6;
    }
}

