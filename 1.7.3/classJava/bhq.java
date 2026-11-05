/*
 * Decompiled with CFR 0.152.
 */
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class bhq
extends Authenticator {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public bhq(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}

