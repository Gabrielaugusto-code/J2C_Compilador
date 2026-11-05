/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class abs {
    public static final cv e = new cv();
    protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private aak a;
    protected static Random g = new Random();
    protected int h = 64;
    private int b;
    protected boolean i;
    protected boolean j;
    private abs c;
    private String d;
    private String m;
    protected pw k;
    protected String l;

    public static int b(abs abs2) {
        return abs2 == null ? 0 : e.b(abs2);
    }

    public static abs d(int n2) {
        return (abs)e.a(n2);
    }

    public static abs a(ahz ahz2) {
        return abs.d(ahz.b(ahz2));
    }

    public static void l() {
        e.a(256, "iron_shovel", new acp(abt.c).c("shovelIron").f("iron_shovel"));
        e.a(257, "iron_pickaxe", new ace(abt.c).c("pickaxeIron").f("iron_pickaxe"));
        e.a(258, "iron_axe", new zw(abt.c).c("hatchetIron").f("iron_axe"));
        e.a(259, "flint_and_steel", new abn().c("flintAndSteel").f("flint_and_steel"));
        e.a(260, "apple", new abo(4, 0.3f, false).c("apple").f("apple"));
        e.a(261, "bow", new aad().c("bow").f("bow"));
        e.a(262, "arrow", new abs().c("arrow").a(aak.j).f("arrow"));
        e.a(263, "coal", new aah().c("coal").f("coal"));
        e.a(264, "diamond", new abs().c("diamond").a(aak.l).f("diamond"));
        e.a(265, "iron_ingot", new abs().c("ingotIron").a(aak.l).f("iron_ingot"));
        e.a(266, "gold_ingot", new abs().c("ingotGold").a(aak.l).f("gold_ingot"));
        e.a(267, "iron_sword", new acy(abt.c).c("swordIron").f("iron_sword"));
        e.a(268, "wooden_sword", new acy(abt.a).c("swordWood").f("wood_sword"));
        e.a(269, "wooden_shovel", new acp(abt.a).c("shovelWood").f("wood_shovel"));
        e.a(270, "wooden_pickaxe", new ace(abt.a).c("pickaxeWood").f("wood_pickaxe"));
        e.a(271, "wooden_axe", new zw(abt.a).c("hatchetWood").f("wood_axe"));
        e.a(272, "stone_sword", new acy(abt.b).c("swordStone").f("stone_sword"));
        e.a(273, "stone_shovel", new acp(abt.b).c("shovelStone").f("stone_shovel"));
        e.a(274, "stone_pickaxe", new ace(abt.b).c("pickaxeStone").f("stone_pickaxe"));
        e.a(275, "stone_axe", new zw(abt.b).c("hatchetStone").f("stone_axe"));
        e.a(276, "diamond_sword", new acy(abt.d).c("swordDiamond").f("diamond_sword"));
        e.a(277, "diamond_shovel", new acp(abt.d).c("shovelDiamond").f("diamond_shovel"));
        e.a(278, "diamond_pickaxe", new ace(abt.d).c("pickaxeDiamond").f("diamond_pickaxe"));
        e.a(279, "diamond_axe", new zw(abt.d).c("hatchetDiamond").f("diamond_axe"));
        e.a(280, "stick", new abs().q().c("stick").a(aak.l).f("stick"));
        e.a(281, "bowl", new abs().c("bowl").a(aak.l).f("bowl"));
        e.a(282, "mushroom_stew", new aae(6).c("mushroomStew").f("mushroom_stew"));
        e.a(283, "golden_sword", new acy(abt.e).c("swordGold").f("gold_sword"));
        e.a(284, "golden_shovel", new acp(abt.e).c("shovelGold").f("gold_shovel"));
        e.a(285, "golden_pickaxe", new ace(abt.e).c("pickaxeGold").f("gold_pickaxe"));
        e.a(286, "golden_axe", new zw(abt.e).c("hatchetGold").f("gold_axe"));
        e.a(287, "string", new zz(aie.bD).c("string").a(aak.l).f("string"));
        e.a(288, "feather", new abs().c("feather").a(aak.l).f("feather"));
        e.a(289, "gunpowder", new abs().c("sulphur").e(ade.k).a(aak.l).f("gunpowder"));
        e.a(290, "wooden_hoe", new abr(abt.a).c("hoeWood").f("wood_hoe"));
        e.a(291, "stone_hoe", new abr(abt.b).c("hoeStone").f("stone_hoe"));
        e.a(292, "iron_hoe", new abr(abt.c).c("hoeIron").f("iron_hoe"));
        e.a(293, "diamond_hoe", new abr(abt.d).c("hoeDiamond").f("diamond_hoe"));
        e.a(294, "golden_hoe", new abr(abt.e).c("hoeGold").f("gold_hoe"));
        e.a(295, "wheat_seeds", new acn(aie.aj, aie.ak).c("seeds").f("seeds_wheat"));
        e.a(296, "wheat", new abs().c("wheat").a(aak.l).f("wheat"));
        e.a(297, "bread", new abo(5, 0.6f, false).c("bread").f("bread"));
        e.a(298, "leather_helmet", new zs(zu.a, 0, 0).c("helmetCloth").f("leather_helmet"));
        e.a(299, "leather_chestplate", new zs(zu.a, 0, 1).c("chestplateCloth").f("leather_chestplate"));
        e.a(300, "leather_leggings", new zs(zu.a, 0, 2).c("leggingsCloth").f("leather_leggings"));
        e.a(301, "leather_boots", new zs(zu.a, 0, 3).c("bootsCloth").f("leather_boots"));
        e.a(302, "chainmail_helmet", new zs(zu.b, 1, 0).c("helmetChain").f("chainmail_helmet"));
        e.a(303, "chainmail_chestplate", new zs(zu.b, 1, 1).c("chestplateChain").f("chainmail_chestplate"));
        e.a(304, "chainmail_leggings", new zs(zu.b, 1, 2).c("leggingsChain").f("chainmail_leggings"));
        e.a(305, "chainmail_boots", new zs(zu.b, 1, 3).c("bootsChain").f("chainmail_boots"));
        e.a(306, "iron_helmet", new zs(zu.c, 2, 0).c("helmetIron").f("iron_helmet"));
        e.a(307, "iron_chestplate", new zs(zu.c, 2, 1).c("chestplateIron").f("iron_chestplate"));
        e.a(308, "iron_leggings", new zs(zu.c, 2, 2).c("leggingsIron").f("iron_leggings"));
        e.a(309, "iron_boots", new zs(zu.c, 2, 3).c("bootsIron").f("iron_boots"));
        e.a(310, "diamond_helmet", new zs(zu.e, 3, 0).c("helmetDiamond").f("diamond_helmet"));
        e.a(311, "diamond_chestplate", new zs(zu.e, 3, 1).c("chestplateDiamond").f("diamond_chestplate"));
        e.a(312, "diamond_leggings", new zs(zu.e, 3, 2).c("leggingsDiamond").f("diamond_leggings"));
        e.a(313, "diamond_boots", new zs(zu.e, 3, 3).c("bootsDiamond").f("diamond_boots"));
        e.a(314, "golden_helmet", new zs(zu.d, 4, 0).c("helmetGold").f("gold_helmet"));
        e.a(315, "golden_chestplate", new zs(zu.d, 4, 1).c("chestplateGold").f("gold_chestplate"));
        e.a(316, "golden_leggings", new zs(zu.d, 4, 2).c("leggingsGold").f("gold_leggings"));
        e.a(317, "golden_boots", new zs(zu.d, 4, 3).c("bootsGold").f("gold_boots"));
        e.a(318, "flint", new abs().c("flint").a(aak.l).f("flint"));
        e.a(319, "porkchop", new abo(3, 0.3f, true).c("porkchopRaw").f("porkchop_raw"));
        e.a(320, "cooked_porkchop", new abo(8, 0.8f, true).c("porkchopCooked").f("porkchop_cooked"));
        e.a(321, "painting", new abq(rs.class).c("painting").f("painting"));
        e.a(322, "golden_apple", new abp(4, 1.2f, false).j().a(qm.l.H, 5, 1, 1.0f).c("appleGold").f("apple_golden"));
        e.a(323, "sign", new acq().c("sign").f("sign"));
        e.a(324, "wooden_door", new aay(avk.d).c("doorWood").f("door_wood"));
        abs abs2 = new aaf(aie.a).c("bucket").e(16).f("bucket_empty");
        e.a(325, "bucket", abs2);
        e.a(326, "water_bucket", new aaf(aie.i).c("bucketWater").c(abs2).f("bucket_water"));
        e.a(327, "lava_bucket", new aaf(aie.k).c("bucketLava").c(abs2).f("bucket_lava"));
        e.a(328, "minecart", new aca(0).c("minecart").f("minecart_normal"));
        e.a(329, "saddle", new ack().c("saddle").f("saddle"));
        e.a(330, "iron_door", new aay(avk.f).c("doorIron").f("door_iron"));
        e.a(331, "redstone", new acj().c("redstone").e(ade.i).f("redstone_dust"));
        e.a(332, "snowball", new acu().c("snowball").f("snowball"));
        e.a(333, "boat", new aaa().c("boat").f("boat"));
        e.a(334, "leather", new abs().c("leather").a(aak.l).f("leather"));
        e.a(335, "milk_bucket", new abz().c("milk").c(abs2).f("bucket_milk"));
        e.a(336, "brick", new abs().c("brick").a(aak.l).f("brick"));
        e.a(337, "clay_ball", new abs().c("clay").a(aak.l).f("clay_ball"));
        e.a(338, "reeds", new zz(aie.aH).c("reeds").a(aak.l).f("reeds"));
        e.a(339, "paper", new abs().c("paper").a(aak.f).f("paper"));
        e.a(340, "book", new aab().c("book").a(aak.f).f("book_normal"));
        e.a(341, "slime_ball", new abs().c("slimeball").a(aak.f).f("slimeball"));
        e.a(342, "chest_minecart", new aca(1).c("minecartChest").f("minecart_chest"));
        e.a(343, "furnace_minecart", new aca(2).c("minecartFurnace").f("minecart_furnace"));
        e.a(344, "egg", new abb().c("egg").f("egg"));
        e.a(345, "compass", new abs().c("compass").a(aak.i).f("compass"));
        e.a(346, "fishing_rod", new abm().c("fishingRod").f("fishing_rod"));
        e.a(347, "clock", new abs().c("clock").a(aak.i).f("clock"));
        e.a(348, "glowstone_dust", new abs().c("yellowDust").e(ade.j).a(aak.l).f("glowstone_dust"));
        e.a(349, "fish", new abk(false).c("fish").f("fish_raw").a(true));
        e.a(350, "cooked_fished", new abk(true).c("fish").f("fish_cooked").a(true));
        e.a(351, "dye", new aba().c("dyePowder").f("dye_powder"));
        e.a(352, "bone", new abs().c("bone").q().a(aak.f).f("bone"));
        e.a(353, "sugar", new abs().c("sugar").e(ade.b).a(aak.l).f("sugar"));
        e.a(354, "cake", new zz(aie.aQ).e(1).c("cake").a(aak.h).f("cake"));
        e.a(355, "bed", new zx().e(1).c("bed").f("bed"));
        e.a(356, "repeater", new zz(aie.aR).c("diode").a(aak.d).f("repeater"));
        e.a(357, "cookie", new abo(2, 0.1f, false).c("cookie").f("cookie"));
        e.a(358, "filled_map", new aby().c("map").f("map_filled"));
        e.a(359, "shears", new aco().c("shears").f("shears"));
        e.a(360, "melon", new abo(2, 0.3f, false).c("melon").f("melon"));
        e.a(361, "pumpkin_seeds", new acn(aie.bb, aie.ak).c("seeds_pumpkin").f("seeds_pumpkin"));
        e.a(362, "melon_seeds", new acn(aie.bc, aie.ak).c("seeds_melon").f("seeds_melon"));
        e.a(363, "beef", new abo(3, 0.3f, true).c("beefRaw").f("beef_raw"));
        e.a(364, "cooked_beef", new abo(8, 0.8f, true).c("beefCooked").f("beef_cooked"));
        e.a(365, "chicken", new abo(2, 0.3f, true).a(qm.s.H, 30, 0, 0.3f).c("chickenRaw").f("chicken_raw"));
        e.a(366, "cooked_chicken", new abo(6, 0.6f, true).c("chickenCooked").f("chicken_cooked"));
        e.a(367, "rotten_flesh", new abo(4, 0.1f, true).a(qm.s.H, 30, 0, 0.8f).c("rottenFlesh").f("rotten_flesh"));
        e.a(368, "ender_pearl", new abf().c("enderPearl").f("ender_pearl"));
        e.a(369, "blaze_rod", new abs().c("blazeRod").a(aak.l).f("blaze_rod"));
        e.a(370, "ghast_tear", new abs().c("ghastTear").e(ade.c).a(aak.k).f("ghast_tear"));
        e.a(371, "gold_nugget", new abs().c("goldNugget").a(aak.l).f("gold_nugget"));
        e.a(372, "nether_wart", new acn(aie.bm, aie.aM).c("netherStalkSeeds").e("+4").f("nether_wart"));
        e.a(373, "potion", new acg().c("potion").f("potion"));
        e.a(374, "glass_bottle", new aac().c("glassBottle").f("potion_bottle_empty"));
        e.a(375, "spider_eye", new abo(2, 0.8f, false).a(qm.u.H, 5, 0, 1.0f).c("spiderEye").e(ade.d).f("spider_eye"));
        e.a(376, "fermented_spider_eye", new abs().c("fermentedSpiderEye").e(ade.e).a(aak.k).f("spider_eye_fermented"));
        e.a(377, "blaze_powder", new abs().c("blazePowder").e(ade.g).a(aak.k).f("blaze_powder"));
        e.a(378, "magma_cream", new abs().c("magmaCream").e(ade.h).a(aak.k).f("magma_cream"));
        e.a(379, "brewing_stand", new zz(aie.bo).c("brewingStand").a(aak.k).f("brewing_stand"));
        e.a(380, "cauldron", new zz(aie.bp).c("cauldron").a(aak.k).f("cauldron"));
        e.a(381, "ender_eye", new abe().c("eyeOfEnder").f("ender_eye"));
        e.a(382, "speckled_melon", new abs().c("speckledMelon").e(ade.f).a(aak.k).f("melon_speckled"));
        e.a(383, "spawn_egg", new acv().c("monsterPlacer").f("spawn_egg"));
        e.a(384, "experience_bottle", new abg().c("expBottle").f("experience_bottle"));
        e.a(385, "fire_charge", new abh().c("fireball").f("fireball"));
        e.a(386, "writable_book", new adc().c("writingBook").a(aak.f).f("book_writable"));
        e.a(387, "written_book", new add().c("writtenBook").f("book_written").e(16));
        e.a(388, "emerald", new abs().c("emerald").a(aak.l).f("emerald"));
        e.a(389, "item_frame", new abq(rk.class).c("frame").f("item_frame"));
        e.a(390, "flower_pot", new zz(aie.bL).c("flowerPot").a(aak.c).f("flower_pot"));
        e.a(391, "carrot", new acm(4, 0.6f, aie.bM, aie.ak).c("carrots").f("carrot"));
        e.a(392, "potato", new acm(1, 0.3f, aie.bN, aie.ak).c("potato").f("potato"));
        e.a(393, "baked_potato", new abo(6, 0.6f, false).c("potatoBaked").f("potato_baked"));
        e.a(394, "poisonous_potato", new abo(2, 0.3f, false).a(qm.u.H, 5, 0, 0.6f).c("potatoPoisonous").f("potato_poisonous"));
        e.a(395, "map", new abc().c("emptyMap").f("map_empty"));
        e.a(396, "golden_carrot", new abo(6, 1.2f, false).c("carrotGolden").e(ade.l).f("carrot_golden"));
        e.a(397, "skull", new acs().c("skull").f("skull"));
        e.a(398, "carrot_on_a_stick", new aag().c("carrotOnAStick").f("carrot_on_a_stick"));
        e.a(399, "nether_star", new acr().c("netherStar").a(aak.l).f("nether_star"));
        e.a(400, "pumpkin_pie", new abo(8, 0.3f, false).c("pumpkinPie").a(aak.h).f("pumpkin_pie"));
        e.a(401, "fireworks", new abj().c("fireworks").f("fireworks"));
        e.a(402, "firework_charge", new abi().c("fireworksCharge").a(aak.f).f("fireworks_charge"));
        e.a(403, "enchanted_book", new abd().e(1).c("enchantedBook").f("book_enchanted"));
        e.a(404, "comparator", new zz(aie.bU).c("comparator").a(aak.d).f("comparator"));
        e.a(405, "netherbrick", new abs().c("netherbrick").a(aak.l).f("netherbrick"));
        e.a(406, "quartz", new abs().c("netherquartz").a(aak.l).f("quartz"));
        e.a(407, "tnt_minecart", new aca(3).c("minecartTnt").f("minecart_tnt"));
        e.a(408, "hopper_minecart", new aca(5).c("minecartHopper").f("minecart_hopper"));
        e.a(417, "iron_horse_armor", new abs().c("horsearmormetal").e(1).a(aak.f).f("iron_horse_armor"));
        e.a(418, "golden_horse_armor", new abs().c("horsearmorgold").e(1).a(aak.f).f("gold_horse_armor"));
        e.a(419, "diamond_horse_armor", new abs().c("horsearmordiamond").e(1).a(aak.f).f("diamond_horse_armor"));
        e.a(420, "lead", new abw().c("leash").f("lead"));
        e.a(421, "name_tag", new acd().c("nameTag").f("name_tag"));
        e.a(422, "command_block_minecart", new aca(6).c("minecartCommandBlock").f("minecart_command_block").a((aak)null));
        e.a(2256, "record_13", new aci("13").c("record").f("record_13"));
        e.a(2257, "record_cat", new aci("cat").c("record").f("record_cat"));
        e.a(2258, "record_blocks", new aci("blocks").c("record").f("record_blocks"));
        e.a(2259, "record_chirp", new aci("chirp").c("record").f("record_chirp"));
        e.a(2260, "record_far", new aci("far").c("record").f("record_far"));
        e.a(2261, "record_mall", new aci("mall").c("record").f("record_mall"));
        e.a(2262, "record_mellohi", new aci("mellohi").c("record").f("record_mellohi"));
        e.a(2263, "record_stal", new aci("stal").c("record").f("record_stal"));
        e.a(2264, "record_strad", new aci("strad").c("record").f("record_strad"));
        e.a(2265, "record_ward", new aci("ward").c("record").f("record_ward"));
        e.a(2266, "record_11", new aci("11").c("record").f("record_11"));
        e.a(2267, "record_wait", new aci("wait").c("record").f("record_wait"));
        HashSet hashSet = Sets.newHashSet((Object[])new ahz[]{aie.a, aie.bo, aie.C, aie.bm, aie.bp, aie.bL, aie.aj, aie.aH, aie.aQ, aie.bP, aie.K, aie.M, aie.ay, aie.aS, aie.bb, aie.an, aie.bV, aie.bD, aie.bv, aie.bc, aie.az, aie.bU, aie.af, aie.as, aie.aR, aie.av, aie.ao});
        for (String string : ahz.c.b()) {
            zy zy2;
            ahz ahz2 = (ahz)ahz.c.a(string);
            if (ahz2 == aie.L) {
                zy2 = new adb(aie.L).b("cloth");
            } else if (ahz2 == aie.ce) {
                zy2 = new adb(aie.ce).b("clayHardenedStained");
            } else if (ahz2 == aie.cn) {
                zy2 = new adb(aie.cn).b("stainedGlass");
            } else if (ahz2 == aie.co) {
                zy2 = new adb(aie.co).b("stainedGlassPane");
            } else if (ahz2 == aie.cg) {
                zy2 = new adb(aie.cg).b("woolCarpet");
            } else if (ahz2 == aie.d) {
                zy2 = new acc(aie.d, aie.d, ajc.a).b("dirt");
            } else if (ahz2 == aie.m) {
                zy2 = new acc(aie.m, aie.m, aly.a).b("sand");
            } else if (ahz2 == aie.r) {
                zy2 = new acc(aie.r, aie.r, ald.M).b("log");
            } else if (ahz2 == aie.s) {
                zy2 = new acc(aie.s, aie.s, akz.M).b("log");
            } else if (ahz2 == aie.f) {
                zy2 = new acc(aie.f, aie.f, and.a).b("wood");
            } else if (ahz2 == aie.aU) {
                zy2 = new acc(aie.aU, aie.aU, aks.a).b("monsterStoneEgg");
            } else if (ahz2 == aie.aV) {
                zy2 = new acc(aie.aV, aie.aV, amn.a).b("stonebricksmooth");
            } else if (ahz2 == aie.A) {
                zy2 = new acc(aie.A, aie.A, alz.a).b("sandStone");
            } else if (ahz2 == aie.ca) {
                zy2 = new acc(aie.ca, aie.ca, alo.a).b("quartzBlock");
            } else if (ahz2 == aie.U) {
                zy2 = new acx(aie.U, aie.U, aie.T, false).b("stoneSlab");
            } else if (ahz2 == aie.T) {
                zy2 = new acx(aie.T, aie.U, aie.T, true).b("stoneSlab");
            } else if (ahz2 == aie.bx) {
                zy2 = new acx(aie.bx, aie.bx, aie.bw, false).b("woodSlab");
            } else if (ahz2 == aie.bw) {
                zy2 = new acx(aie.bw, aie.bx, aie.bw, true).b("woodSlab");
            } else if (ahz2 == aie.g) {
                zy2 = new acc(aie.g, aie.g, ama.a).b("sapling");
            } else if (ahz2 == aie.t) {
                zy2 = new abx(aie.t).b("leaves");
            } else if (ahz2 == aie.u) {
                zy2 = new abx(aie.u).b("leaves");
            } else if (ahz2 == aie.bd) {
                zy2 = new aai(aie.bd, false);
            } else if (ahz2 == aie.H) {
                zy2 = new aai(aie.H, true).a(new String[]{"shrub", "grass", "fern"});
            } else if (ahz2 == aie.N) {
                zy2 = new acc(aie.N, aie.N, ajt.b).b("flower");
            } else if (ahz2 == aie.O) {
                zy2 = new acc(aie.O, aie.O, ajt.a).b("rose");
            } else if (ahz2 == aie.aC) {
                zy2 = new act(aie.aC, aie.aC);
            } else if (ahz2 == aie.bi) {
                zy2 = new ada(aie.bi);
            } else if (ahz2 == aie.J) {
                zy2 = new acf(aie.J);
            } else if (ahz2 == aie.F) {
                zy2 = new acf(aie.F);
            } else if (ahz2 == aie.bK) {
                zy2 = new acc(aie.bK, aie.bK, amz.a).b("cobbleWall");
            } else if (ahz2 == aie.bQ) {
                zy2 = new zr(aie.bQ).b("anvil");
            } else if (ahz2 == aie.cm) {
                zy2 = new aaz((ahz)aie.cm, aie.cm, ajf.a).b("doublePlant");
            } else {
                if (hashSet.contains(ahz2)) continue;
                zy2 = new zy(ahz2);
            }
            e.a(ahz.b(ahz2), string, zy2);
        }
    }

    public abs e(int n2) {
        this.h = n2;
        return this;
    }

    public int d() {
        return 1;
    }

    public pw b_(int n2) {
        return this.k;
    }

    public final pw j(abu abu2) {
        return this.b_(abu2.k());
    }

    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        return false;
    }

    public float a(abu abu2, ahz ahz2) {
        return 1.0f;
    }

    public abu a(abu abu2, afs afs2, xq xq2) {
        return abu2;
    }

    public abu b(abu abu2, afs afs2, xq xq2) {
        return abu2;
    }

    public int m() {
        return this.h;
    }

    public int a(int n2) {
        return 0;
    }

    public boolean n() {
        return this.j;
    }

    protected abs a(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public int o() {
        return this.b;
    }

    protected abs f(int n2) {
        this.b = n2;
        return this;
    }

    public boolean p() {
        return this.b > 0 && !this.j;
    }

    public boolean a(abu abu2, rm rm2, rm rm3) {
        return false;
    }

    public boolean a(abu abu2, afs afs2, ahz ahz2, int n2, int n3, int n4, rm rm2) {
        return false;
    }

    public boolean b(ahz ahz2) {
        return false;
    }

    public boolean a(abu abu2, xq xq2, rm rm2) {
        return false;
    }

    public abs q() {
        this.i = true;
        return this;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return false;
    }

    public abs c(String string) {
        this.m = string;
        return this;
    }

    public String k(abu abu2) {
        String string = this.a(abu2);
        if (string == null) {
            return "";
        }
        return dc.a(string);
    }

    public String a() {
        return "item." + this.m;
    }

    public String a(abu abu2) {
        return "item." + this.m;
    }

    public abs c(abs abs2) {
        this.c = abs2;
        return this;
    }

    public boolean l(abu abu2) {
        return true;
    }

    public boolean s() {
        return true;
    }

    public abs t() {
        return this.c;
    }

    public boolean u() {
        return this.c != null;
    }

    public int a(abu abu2, int n2) {
        return 0xFFFFFF;
    }

    public void a(abu abu2, afs afs2, qr qr2, int n2, boolean bl2) {
    }

    public void d(abu abu2, afs afs2, xq xq2) {
    }

    public boolean h() {
        return false;
    }

    public acz d(abu abu2) {
        return acz.a;
    }

    public int d_(abu abu2) {
        return 0;
    }

    public void a(abu abu2, afs afs2, xq xq2, int n2) {
    }

    protected abs e(String string) {
        this.d = string;
        return this;
    }

    public String i(abu abu2) {
        return this.d;
    }

    public boolean m(abu abu2) {
        return this.i(abu2) != null;
    }

    public void a(abu abu2, xq xq2, List list, boolean bl2) {
    }

    public String n(abu abu2) {
        return ("" + dc.a(this.k(abu2) + ".name")).trim();
    }

    public boolean e(abu abu2) {
        return abu2.y();
    }

    public ach f(abu abu2) {
        if (abu2.y()) {
            return ach.c;
        }
        return ach.a;
    }

    public boolean e_(abu abu2) {
        return this.m() == 1 && this.p();
    }

    protected ayn a(afs afs2, xq xq2, boolean bl2) {
        float f2 = 1.0f;
        float f3 = xq2.B + (xq2.z - xq2.B) * f2;
        float f4 = xq2.A + (xq2.y - xq2.A) * f2;
        double d2 = xq2.p + (xq2.s - xq2.p) * (double)f2;
        double d3 = xq2.q + (xq2.t - xq2.q) * (double)f2 + 1.62 - (double)xq2.L;
        double d4 = xq2.r + (xq2.u - xq2.r) * (double)f2;
        ayp ayp2 = afs2.V().a(d2, d3, d4);
        float f5 = oy.b(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = oy.a(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f7 = -oy.b(-f3 * ((float)Math.PI / 180));
        float f8 = oy.a(-f3 * ((float)Math.PI / 180));
        float f9 = f6 * f7;
        float f10 = f8;
        float f11 = f5 * f7;
        double d5 = 5.0;
        ayp ayp3 = ayp2.c((double)f9 * d5, (double)f10 * d5, (double)f11 * d5);
        return afs2.a(ayp2, ayp3, bl2, !bl2, false);
    }

    public int c() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public pw a(int n2, int n3) {
        return this.b_(n2);
    }

    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
    }

    public aak n_() {
        return this.a;
    }

    public abs a(aak aak2) {
        this.a = aak2;
        return this;
    }

    public boolean v() {
        return true;
    }

    public boolean a(abu abu2, abu abu3) {
        return false;
    }

    public void a(px px2) {
        this.k = px2.a(this.w());
    }

    public Multimap k() {
        return HashMultimap.create();
    }

    protected abs f(String string) {
        this.l = string;
        return this;
    }

    protected String w() {
        if (this.l == null) {
            return "MISSING_ICON_ITEM_" + e.b(this) + "_" + this.m;
        }
        return this.l;
    }
}

