/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bqx
implements Callable {
    final /* synthetic */ int[][] a;
    final /* synthetic */ bqw b;

    bqx(bqw bqw2, int[][] nArray) {
        this.b = bqw2;
        this.a = nArray;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] nArray : this.a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(nArray == null ? "null" : Integer.valueOf(nArray.length));
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

