
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.CancerousRodentEntity;
import net.mcreator.zekcraftbeta.client.model.ModelCR;

public class CancerousRodentRenderer extends MobRenderer<CancerousRodentEntity, ModelCR<CancerousRodentEntity>> {
	public CancerousRodentRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCR(context.bakeLayer(ModelCR.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CancerousRodentEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/cr.png");
	}
}
