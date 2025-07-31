package com.AlexBespolyy.Insurgencia_Mecanica.init;

import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import com.AlexBespolyy.Insurgencia_Mecanica.action.Hevy_Star_Actions;
import com.AlexBespolyy.Insurgencia_Mecanica.entity.Hevy_Star_Stand;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), Insurgencia_Mecanica.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), Insurgencia_Mecanica.MOD_ID);
    
 // ======================================== Example Stand ========================================
    
    
    // Create all the abilities here...
    public static final RegistryObject<StandEntityAction> EXAMPLE_STAND_PUNCH = ACTIONS.register("example_stand_punch", 
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.EXAMPLE_STAND_PUNCH_LIGHT)));
    
    public static final RegistryObject<StandEntityAction> EXAMPLE_STAND_BARRAGE = ACTIONS.register("example_stand_barrage", 
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.EXAMPLE_STAND_PUNCH_BARRAGE)));

    public static final RegistryObject<StandEntityHeavyAttack> EXAMPLE_STAND_FINISHER_PUNCH = ACTIONS.register("example_stand_finisher_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder() // TODO finisher ability
                    .punchSound(InitSounds.EXAMPLE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityHeavyAttack> EXAMPLE_STAND_HEAVY_PUNCH = ACTIONS.register("example_stand_heavy_punch", 
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .shiftVariationOf(EXAMPLE_STAND_PUNCH).shiftVariationOf(EXAMPLE_STAND_BARRAGE)
                    .setFinisherVariation(EXAMPLE_STAND_FINISHER_PUNCH)
                    .punchSound(InitSounds.EXAMPLE_STAND_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityAction> EXAMPLE_STAND_BLOCK = ACTIONS.register("example_stand_block", 
            () -> new StandEntityBlock());
    
    public static final RegistryObject<StandEntityAction> EXAMPLE_STAND_THROW_PICKAXE = ACTIONS.register("example_stand_throw_pickaxe", 
            () -> new Hevy_Star_Actions(new StandEntityAction.Builder()
                    .standPose(Hevy_Star_Actions.PICKAXE_THROW_ANIM)
                    .holdToFire(20, true)
                    .standRecoveryTicks(20)
                    .standSound(InitSounds.EXAMPLE_STAND_THROW_PICKAXE)
                    .staminaCost(75)
                    .partsRequired(StandPart.ARMS)));
    
    

    // ...then create the Stand type instance. Moves, stats, entity sizes, and a few other things are determined here.
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<Hevy_Star_Stand>> STAND_EXAMPLE_STAND =
            new EntityStandRegistryObject<>("Hevy_Star",
                    STANDS, 
                    () -> new EntityStandType.Builder<StandStats>()
                    .color(0x00AFAF)
                    .storyPartName(ModStandsInit.PART_5_NAME)
                    .leftClickHotbar(
                            EXAMPLE_STAND_PUNCH.get(),
                            EXAMPLE_STAND_BARRAGE.get()
                            )
                    .rightClickHotbar(
                            EXAMPLE_STAND_BLOCK.get(),
                            EXAMPLE_STAND_THROW_PICKAXE.get()
                            )
                    .defaultStats(StandStats.class, new StandStats.Builder()
                            .tier(2)
                            .power(10)
                            .speed(50)
                            .range(200, 300)
                            .durability(5)
                            .precision(5)
                            .build())
                    .addSummonShout(InitSounds.EXAMPLE_STAND_SUMMON_VOICELINE)
                    .addOst(InitSounds.EXAMPLE_STAND_OST)
                    .build(),
                    
                    InitEntities.ENTITIES,
                    () -> new StandEntityType<Hevy_Star_Stand>(Hevy_Star_Stand::new, 0.7F, 2.1F)
                    .summonSound(InitSounds.EXAMPLE_STAND_SUMMON_SOUND)
                    .unsummonSound(InitSounds.EXAMPLE_STAND_UNSUMMON_SOUND))
            .withDefaultStandAttributes();
    

    
    // ======================================== ??? ========================================
    
    
    
}
