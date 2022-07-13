
package net.mcreator.zekcraftbeta.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.zekcraftbeta.init.ZekcraftBetaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class VeryCancerousRodentEntityProjectile extends AbstractArrow implements ItemSupplier {
	public VeryCancerousRodentEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ZekcraftBetaModEntities.VERY_CANCEROUS_RODENT_PROJECTILE.get(), world);
	}

	public VeryCancerousRodentEntityProjectile(EntityType<? extends VeryCancerousRodentEntityProjectile> type, Level world) {
		super(type, world);
	}

	public VeryCancerousRodentEntityProjectile(EntityType<? extends VeryCancerousRodentEntityProjectile> type, double x, double y, double z,
			Level world) {
		super(type, x, y, z, world);
	}

	public VeryCancerousRodentEntityProjectile(EntityType<? extends VeryCancerousRodentEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}
}
