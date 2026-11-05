/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class ib
extends fk {
    private int a;
    private final List b = new ArrayList();

    public ib() {
    }

    public ib(int n2, Collection collection) {
        this.a = n2;
        for (rz rz2 : collection) {
            this.b.add(new ic(this, rz2.a().a(), rz2.b(), rz2.c()));
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        int n2 = ep2.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = ep2.c(64);
            double d2 = ep2.readDouble();
            ArrayList<sa> arrayList = new ArrayList<sa>();
            int n3 = ep2.readShort();
            for (int i3 = 0; i3 < n3; ++i3) {
                UUID uUID = new UUID(ep2.readLong(), ep2.readLong());
                arrayList.add(new sa(uUID, "Unknown synced attribute modifier", ep2.readDouble(), ep2.readByte()));
            }
            this.b.add(new ic(this, string, d2, arrayList));
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b.size());
        for (ic ic2 : this.b) {
            ep2.a(ic2.a());
            ep2.writeDouble(ic2.b());
            ep2.writeShort(ic2.c().size());
            for (sa sa2 : ic2.c()) {
                ep2.writeLong(sa2.a().getMostSignificantBits());
                ep2.writeLong(sa2.a().getLeastSignificantBits());
                ep2.writeDouble(sa2.d());
                ep2.writeByte(sa2.c());
            }
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.a;
    }

    public List d() {
        return this.b;
    }
}

