/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import org.apache.commons.lang3.StringUtils;

public class ih
extends fk {
    private String a;

    public ih() {
    }

    public ih(String string) {
        this.a = string;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(Short.MAX_VALUE);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(StringUtils.substring((String)this.a, (int)0, (int)Short.MAX_VALUE));
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public String c() {
        return this.a;
    }

    @Override
    public String b() {
        return String.format("message='%s'", this.a);
    }
}

