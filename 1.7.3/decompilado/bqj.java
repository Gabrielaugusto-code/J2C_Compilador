/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;

public class bqj
extends bqi {
    private final int[] b;
    private final int c;
    private final int d;

    public bqj(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.b, 0, bufferedImage.getWidth());
        this.a();
    }

    public bqj(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.b = new int[n2 * n3];
        brb.a(this.b(), n2, n3);
    }

    @Override
    public void a(brr brr2) {
    }

    public void a() {
        brb.a(this.b(), this.b, this.c, this.d);
    }

    public int[] d() {
        return this.b;
    }
}

