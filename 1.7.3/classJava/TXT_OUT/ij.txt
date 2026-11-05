/*
 * Decompiled with CFR 0.152.
 */
public class ij
extends fk {
    private ik a;

    public ij() {
    }

    public ij(ik ik2) {
        this.a = ik2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ik.a()[ep2.readByte() % ik.a().length];
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(ik.a(this.a));
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public ik c() {
        return this.a;
    }
}

