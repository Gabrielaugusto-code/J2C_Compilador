/*
 * Decompiled with CFR 0.152.
 */
public enum bhl {
    a((fa)new fi("stream.unavailable.no_fbo", new Object[0])),
    b((fa)new fi("stream.unavailable.library_arch_mismatch", new Object[0])),
    c((fa)new fi("stream.unavailable.library_failure", new Object[0]), (fa)new fi("stream.unavailable.report_to_mojang", new Object[0])),
    d((fa)new fi("stream.unavailable.not_supported.windows", new Object[0])),
    e((fa)new fi("stream.unavailable.not_supported.mac", new Object[0]), (fa)new fi("stream.unavailable.not_supported.mac.okay", new Object[0])),
    f((fa)new fi("stream.unavailable.not_supported.other", new Object[0])),
    g((fa)new fi("stream.unavailable.account_not_migrated", new Object[0]), (fa)new fi("stream.unavailable.account_not_migrated.okay", new Object[0])),
    h((fa)new fi("stream.unavailable.account_not_bound", new Object[0]), (fa)new fi("stream.unavailable.account_not_bound.okay", new Object[0])),
    i((fa)new fi("stream.unavailable.failed_auth", new Object[0]), (fa)new fi("stream.unavailable.failed_auth.okay", new Object[0])),
    j((fa)new fi("stream.unavailable.failed_auth_error", new Object[0])),
    k((fa)new fi("stream.unavailable.initialization_failure", new Object[0]), (fa)new fi("stream.unavailable.report_to_mojang", new Object[0])),
    l((fa)new fi("stream.unavailable.unknown", new Object[0]), (fa)new fi("stream.unavailable.report_to_mojang", new Object[0]));

    private final fa m;
    private final fa n;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bhl() {
        this((String)var1_-1, (int)var2_-1, (fa)var3_1, null);
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - void declaration
     */
    private bhl() {
        void var4_2;
        void var3_1;
        this.m = var3_1;
        this.n = var4_2;
    }

    public fa a() {
        return this.m;
    }

    public fa b() {
        return this.n;
    }
}

