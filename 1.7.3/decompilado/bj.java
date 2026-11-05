/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class bj
extends y {
    @Override
    public String c() {
        return "scoreboard";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.scoreboard.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 1) throw new ch("commands.scoreboard.usage", new Object[0]);
        if (stringArray[0].equalsIgnoreCase("objectives")) {
            if (stringArray.length == 1) {
                throw new ch("commands.scoreboard.objectives.usage", new Object[0]);
            }
            if (stringArray[1].equalsIgnoreCase("list")) {
                this.d(ac2);
                return;
            } else if (stringArray[1].equalsIgnoreCase("add")) {
                if (stringArray.length < 4) throw new ch("commands.scoreboard.objectives.add.usage", new Object[0]);
                this.c(ac2, stringArray, 2);
                return;
            } else if (stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length != 3) throw new ch("commands.scoreboard.objectives.remove.usage", new Object[0]);
                this.h(ac2, stringArray[2]);
                return;
            } else {
                if (!stringArray[1].equalsIgnoreCase("setdisplay")) throw new ch("commands.scoreboard.objectives.usage", new Object[0]);
                if (stringArray.length != 3 && stringArray.length != 4) throw new ch("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                this.k(ac2, stringArray, 2);
            }
            return;
        }
        if (stringArray[0].equalsIgnoreCase("players")) {
            if (stringArray.length == 1) {
                throw new ch("commands.scoreboard.players.usage", new Object[0]);
            }
            if (stringArray[1].equalsIgnoreCase("list")) {
                if (stringArray.length > 3) throw new ch("commands.scoreboard.players.list.usage", new Object[0]);
                this.l(ac2, stringArray, 2);
                return;
            } else if (stringArray[1].equalsIgnoreCase("add")) {
                if (stringArray.length != 5) throw new ch("commands.scoreboard.players.add.usage", new Object[0]);
                this.m(ac2, stringArray, 2);
                return;
            } else if (stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length != 5) throw new ch("commands.scoreboard.players.remove.usage", new Object[0]);
                this.m(ac2, stringArray, 2);
                return;
            } else if (stringArray[1].equalsIgnoreCase("set")) {
                if (stringArray.length != 5) throw new ch("commands.scoreboard.players.set.usage", new Object[0]);
                this.m(ac2, stringArray, 2);
                return;
            } else {
                if (!stringArray[1].equalsIgnoreCase("reset")) throw new ch("commands.scoreboard.players.usage", new Object[0]);
                if (stringArray.length != 3) throw new ch("commands.scoreboard.players.reset.usage", new Object[0]);
                this.n(ac2, stringArray, 2);
            }
            return;
        }
        if (!stringArray[0].equalsIgnoreCase("teams")) throw new ch("commands.scoreboard.usage", new Object[0]);
        if (stringArray.length == 1) {
            throw new ch("commands.scoreboard.teams.usage", new Object[0]);
        }
        if (stringArray[1].equalsIgnoreCase("list")) {
            if (stringArray.length > 3) throw new ch("commands.scoreboard.teams.list.usage", new Object[0]);
            this.g(ac2, stringArray, 2);
            return;
        } else if (stringArray[1].equalsIgnoreCase("add")) {
            if (stringArray.length < 3) throw new ch("commands.scoreboard.teams.add.usage", new Object[0]);
            this.d(ac2, stringArray, 2);
            return;
        } else if (stringArray[1].equalsIgnoreCase("remove")) {
            if (stringArray.length != 3) throw new ch("commands.scoreboard.teams.remove.usage", new Object[0]);
            this.f(ac2, stringArray, 2);
            return;
        } else if (stringArray[1].equalsIgnoreCase("empty")) {
            if (stringArray.length != 3) throw new ch("commands.scoreboard.teams.empty.usage", new Object[0]);
            this.j(ac2, stringArray, 2);
            return;
        } else if (stringArray[1].equalsIgnoreCase("join")) {
            if (stringArray.length < 4 && (stringArray.length != 3 || !(ac2 instanceof xq))) throw new ch("commands.scoreboard.teams.join.usage", new Object[0]);
            this.h(ac2, stringArray, 2);
            return;
        } else if (stringArray[1].equalsIgnoreCase("leave")) {
            if (stringArray.length < 3 && !(ac2 instanceof xq)) throw new ch("commands.scoreboard.teams.leave.usage", new Object[0]);
            this.i(ac2, stringArray, 2);
            return;
        } else {
            if (!stringArray[1].equalsIgnoreCase("option")) throw new ch("commands.scoreboard.teams.usage", new Object[0]);
            if (stringArray.length != 4 && stringArray.length != 5) throw new ch("commands.scoreboard.teams.option.usage", new Object[0]);
            this.e(ac2, stringArray, 2);
        }
    }

    protected ayw d() {
        return MinecraftServer.G().a(0).X();
    }

    protected ayr a(String string, boolean bl2) {
        ayw ayw2 = this.d();
        ayr ayr2 = ayw2.b(string);
        if (ayr2 == null) {
            throw new cc("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl2 && ayr2.c().b()) {
            throw new cc("commands.scoreboard.objectiveReadOnly", string);
        }
        return ayr2;
    }

    protected ays a(String string) {
        ayw ayw2 = this.d();
        ays ays2 = ayw2.e(string);
        if (ays2 == null) {
            throw new cc("commands.scoreboard.teamNotFound", string);
        }
        return ays2;
    }

    protected void c(ac ac2, String[] stringArray, int n2) {
        String string = stringArray[n2++];
        String string2 = stringArray[n2++];
        ayw ayw2 = this.d();
        azb azb2 = (azb)azb.a.get(string2);
        if (azb2 == null) {
            throw new ch("commands.scoreboard.objectives.add.wrongType", string2);
        }
        if (ayw2.b(string) != null) {
            throw new cc("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new ce("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new ch("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (stringArray.length > n2) {
            String string3 = bj.a(ac2, stringArray, n2).c();
            if (string3.length() > 32) {
                throw new ce("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.length() > 0) {
                ayw2.a(string, azb2).a(string3);
            } else {
                ayw2.a(string, azb2);
            }
        } else {
            ayw2.a(string, azb2);
        }
        bj.a(ac2, "commands.scoreboard.objectives.add.success", string);
    }

    protected void d(ac ac2, String[] stringArray, int n2) {
        String string = stringArray[n2++];
        ayw ayw2 = this.d();
        if (ayw2.e(string) != null) {
            throw new cc("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new ce("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        if (string.length() == 0) {
            throw new ch("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (stringArray.length > n2) {
            String string2 = bj.a(ac2, stringArray, n2).c();
            if (string2.length() > 32) {
                throw new ce("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.length() > 0) {
                ayw2.f(string).a(string2);
            } else {
                ayw2.f(string);
            }
        } else {
            ayw2.f(string);
        }
        bj.a(ac2, "commands.scoreboard.teams.add.success", string);
    }

    protected void e(ac ac2, String[] stringArray, int n2) {
        String string;
        ays ays2;
        if ((ays2 = this.a(stringArray[n2++])) == null) {
            return;
        }
        if (!((string = stringArray[n2++].toLowerCase()).equalsIgnoreCase("color") || string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles"))) {
            throw new ch("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        if (stringArray.length == 4) {
            if (string.equalsIgnoreCase("color")) {
                throw new ch("commands.scoreboard.teams.option.noValue", string, bj.a(a.a(true, false)));
            }
            if (string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                throw new ch("commands.scoreboard.teams.option.noValue", string, bj.a(Arrays.asList("true", "false")));
            }
            throw new ch("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        String string2 = stringArray[n2++];
        if (string.equalsIgnoreCase("color")) {
            a a2 = a.b(string2);
            if (a2 == null || a2.b()) {
                throw new ch("commands.scoreboard.teams.option.noValue", string, bj.a(a.a(true, false)));
            }
            ays2.b(a2.toString());
            ays2.c(a.v.toString());
        } else if (string.equalsIgnoreCase("friendlyfire")) {
            if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                throw new ch("commands.scoreboard.teams.option.noValue", string, bj.a(Arrays.asList("true", "false")));
            }
            ays2.a(string2.equalsIgnoreCase("true"));
        } else if (string.equalsIgnoreCase("seeFriendlyInvisibles")) {
            if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                throw new ch("commands.scoreboard.teams.option.noValue", string, bj.a(Arrays.asList("true", "false")));
            }
            ays2.b(string2.equalsIgnoreCase("true"));
        }
        bj.a(ac2, "commands.scoreboard.teams.option.success", string, ays2.b(), string2);
    }

    protected void f(ac ac2, String[] stringArray, int n2) {
        ays ays2;
        ayw ayw2 = this.d();
        if ((ays2 = this.a(stringArray[n2++])) == null) {
            return;
        }
        ayw2.d(ays2);
        bj.a(ac2, "commands.scoreboard.teams.remove.success", ays2.b());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void g(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        if (stringArray.length > n2) {
            ays ays2;
            if ((ays2 = this.a(stringArray[n2++])) == null) {
                return;
            }
            Collection collection = ays2.d();
            if (collection.size() <= 0) throw new cc("commands.scoreboard.teams.list.player.empty", ays2.b());
            fi fi2 = new fi("commands.scoreboard.teams.list.player.count", collection.size(), ays2.b());
            fi2.b().a(a.c);
            ac2.a(fi2);
            ac2.a(new fh(bj.a(collection.toArray())));
            return;
        } else {
            Collection collection = ayw2.g();
            if (collection.size() <= 0) throw new cc("commands.scoreboard.teams.list.empty", new Object[0]);
            fi fi3 = new fi("commands.scoreboard.teams.list.count", collection.size());
            fi3.b().a(a.c);
            ac2.a(fi3);
            for (ays ays3 : collection) {
                ac2.a(new fi("commands.scoreboard.teams.list.entry", ays3.b(), ays3.c(), ays3.d().size()));
            }
        }
    }

    protected void h(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        String string = stringArray[n2++];
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        if (ac2 instanceof xq && n2 == stringArray.length) {
            String string2 = bj.b(ac2).b_();
            if (ayw2.a(string2, string)) {
                hashSet.add(string2);
            } else {
                hashSet2.add(string2);
            }
        } else {
            while (n2 < stringArray.length) {
                String string3;
                if (ayw2.a(string3 = bj.e(ac2, stringArray[n2++]), string)) {
                    hashSet.add(string3);
                    continue;
                }
                hashSet2.add(string3);
            }
        }
        if (!hashSet.isEmpty()) {
            bj.a(ac2, "commands.scoreboard.teams.join.success", hashSet.size(), string, bj.a(hashSet.toArray(new String[0])));
        }
        if (!hashSet2.isEmpty()) {
            throw new cc("commands.scoreboard.teams.join.failure", hashSet2.size(), string, bj.a(hashSet2.toArray(new String[0])));
        }
    }

    protected void i(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        if (ac2 instanceof xq && n2 == stringArray.length) {
            String string = bj.b(ac2).b_();
            if (ayw2.g(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n2 < stringArray.length) {
                String string;
                if (ayw2.g(string = bj.e(ac2, stringArray[n2++]))) {
                    hashSet.add(string);
                    continue;
                }
                hashSet2.add(string);
            }
        }
        if (!hashSet.isEmpty()) {
            bj.a(ac2, "commands.scoreboard.teams.leave.success", hashSet.size(), bj.a(hashSet.toArray(new String[0])));
        }
        if (!hashSet2.isEmpty()) {
            throw new cc("commands.scoreboard.teams.leave.failure", hashSet2.size(), bj.a(hashSet2.toArray(new String[0])));
        }
    }

    protected void j(ac ac2, String[] stringArray, int n2) {
        ays ays2;
        ayw ayw2 = this.d();
        if ((ays2 = this.a(stringArray[n2++])) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(ays2.d());
        if (arrayList.isEmpty()) {
            throw new cc("commands.scoreboard.teams.empty.alreadyEmpty", ays2.b());
        }
        for (String string : arrayList) {
            ayw2.a(string, ays2);
        }
        bj.a(ac2, "commands.scoreboard.teams.empty.success", arrayList.size(), ays2.b());
    }

    protected void h(ac ac2, String string) {
        ayw ayw2 = this.d();
        ayr ayr2 = this.a(string, false);
        ayw2.k(ayr2);
        bj.a(ac2, "commands.scoreboard.objectives.remove.success", string);
    }

    protected void d(ac ac2) {
        ayw ayw2 = this.d();
        Collection collection = ayw2.c();
        if (collection.size() > 0) {
            fi fi2 = new fi("commands.scoreboard.objectives.list.count", collection.size());
            fi2.b().a(a.c);
            ac2.a(fi2);
            for (ayr ayr2 : collection) {
                ac2.a(new fi("commands.scoreboard.objectives.list.entry", ayr2.b(), ayr2.d(), ayr2.c().a()));
            }
        } else {
            throw new cc("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
    }

    protected void k(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        String string = stringArray[n2++];
        int n3 = ayw.j(string);
        ayr ayr2 = null;
        if (stringArray.length == 4) {
            ayr2 = this.a(stringArray[n2++], false);
        }
        if (n3 < 0) {
            throw new cc("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        ayw2.a(n3, ayr2);
        if (ayr2 != null) {
            bj.a(ac2, "commands.scoreboard.objectives.setdisplay.successSet", ayw.b(n3), ayr2.b());
        } else {
            bj.a(ac2, "commands.scoreboard.objectives.setdisplay.successCleared", ayw.b(n3));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void l(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        if (stringArray.length > n2) {
            String string;
            Map map;
            if ((map = ayw2.d(string = bj.e(ac2, stringArray[n2++]))).size() <= 0) throw new cc("commands.scoreboard.players.list.player.empty", string);
            fi fi2 = new fi("commands.scoreboard.players.list.player.count", map.size(), string);
            fi2.b().a(a.c);
            ac2.a(fi2);
            for (ayt ayt2 : map.values()) {
                ac2.a(new fi("commands.scoreboard.players.list.player.entry", ayt2.c(), ayt2.d().d(), ayt2.d().b()));
            }
            return;
        } else {
            Collection collection = ayw2.d();
            if (collection.size() <= 0) throw new cc("commands.scoreboard.players.list.empty", new Object[0]);
            fi fi3 = new fi("commands.scoreboard.players.list.count", collection.size());
            fi3.b().a(a.c);
            ac2.a(fi3);
            ac2.a(new fh(bj.a(collection.toArray())));
        }
    }

    protected void m(ac ac2, String[] stringArray, int n2) {
        String string = stringArray[n2 - 1];
        String string2 = bj.e(ac2, stringArray[n2++]);
        ayr ayr2 = this.a(stringArray[n2++], true);
        int n3 = string.equalsIgnoreCase("set") ? bj.a(ac2, stringArray[n2++]) : bj.a(ac2, stringArray[n2++], 1);
        ayw ayw2 = this.d();
        ayt ayt2 = ayw2.a(string2, ayr2);
        if (string.equalsIgnoreCase("set")) {
            ayt2.c(n3);
        } else if (string.equalsIgnoreCase("add")) {
            ayt2.a(n3);
        } else {
            ayt2.b(n3);
        }
        bj.a(ac2, "commands.scoreboard.players.set.success", ayr2.b(), string2, ayt2.c());
    }

    protected void n(ac ac2, String[] stringArray, int n2) {
        ayw ayw2 = this.d();
        String string = bj.e(ac2, stringArray[n2++]);
        ayw2.c(string);
        bj.a(ac2, "commands.scoreboard.players.reset.success", string);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return bj.a(stringArray, "objectives", "players", "teams");
        }
        if (stringArray[0].equalsIgnoreCase("objectives")) {
            if (stringArray.length == 2) {
                return bj.a(stringArray, "list", "add", "remove", "setdisplay");
            }
            if (stringArray[1].equalsIgnoreCase("add")) {
                if (stringArray.length == 4) {
                    Set set = azb.a.keySet();
                    return bj.a(stringArray, set);
                }
            } else if (stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length == 3) {
                    return bj.a(stringArray, this.a(false));
                }
            } else if (stringArray[1].equalsIgnoreCase("setdisplay")) {
                if (stringArray.length == 3) {
                    return bj.a(stringArray, "list", "sidebar", "belowName");
                }
                if (stringArray.length == 4) {
                    return bj.a(stringArray, this.a(false));
                }
            }
        } else if (stringArray[0].equalsIgnoreCase("players")) {
            if (stringArray.length == 2) {
                return bj.a(stringArray, "set", "add", "remove", "reset", "list");
            }
            if (stringArray[1].equalsIgnoreCase("set") || stringArray[1].equalsIgnoreCase("add") || stringArray[1].equalsIgnoreCase("remove")) {
                if (stringArray.length == 3) {
                    return bj.a(stringArray, MinecraftServer.G().D());
                }
                if (stringArray.length == 4) {
                    return bj.a(stringArray, this.a(true));
                }
            } else if ((stringArray[1].equalsIgnoreCase("reset") || stringArray[1].equalsIgnoreCase("list")) && stringArray.length == 3) {
                return bj.a(stringArray, this.d().d());
            }
        } else if (stringArray[0].equalsIgnoreCase("teams")) {
            if (stringArray.length == 2) {
                return bj.a(stringArray, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (stringArray[1].equalsIgnoreCase("join")) {
                if (stringArray.length == 3) {
                    return bj.a(stringArray, this.d().f());
                }
                if (stringArray.length >= 4) {
                    return bj.a(stringArray, MinecraftServer.G().D());
                }
            } else {
                if (stringArray[1].equalsIgnoreCase("leave")) {
                    return bj.a(stringArray, MinecraftServer.G().D());
                }
                if (stringArray[1].equalsIgnoreCase("empty") || stringArray[1].equalsIgnoreCase("list") || stringArray[1].equalsIgnoreCase("remove")) {
                    if (stringArray.length == 3) {
                        return bj.a(stringArray, this.d().f());
                    }
                } else if (stringArray[1].equalsIgnoreCase("option")) {
                    if (stringArray.length == 3) {
                        return bj.a(stringArray, this.d().f());
                    }
                    if (stringArray.length == 4) {
                        return bj.a(stringArray, "color", "friendlyfire", "seeFriendlyInvisibles");
                    }
                    if (stringArray.length == 5) {
                        if (stringArray[3].equalsIgnoreCase("color")) {
                            return bj.a(stringArray, a.a(true, false));
                        }
                        if (stringArray[3].equalsIgnoreCase("friendlyfire") || stringArray[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                            return bj.a(stringArray, "true", "false");
                        }
                    }
                }
            }
        }
        return null;
    }

    protected List a(boolean bl2) {
        Collection collection = this.d().c();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (ayr ayr2 : collection) {
            if (bl2 && ayr2.c().b()) continue;
            arrayList.add(ayr2.b());
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        if (stringArray[0].equalsIgnoreCase("players")) {
            return n2 == 2;
        }
        if (stringArray[0].equalsIgnoreCase("teams")) {
            return n2 == 2 || n2 == 3;
        }
        return false;
    }
}

