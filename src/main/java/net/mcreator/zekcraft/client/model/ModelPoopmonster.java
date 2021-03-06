package net.mcreator.zekcraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPoopmonster<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("zekcraft", "model_poopmonster"), "main");
	public final ModelPart bb_main;

	public ModelPoopmonster(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(35, 0).addBox(-3.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 6)
						.addBox(-3.0F, -9.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 23)
						.addBox(1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
						.addBox(1.0F, -9.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 28)
						.addBox(-3.0F, -12.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 29)
						.addBox(1.0F, -12.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(-4.0F, -14.0F, -1.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, -23.0F, 0.0F, 8.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 29).mirror()
						.addBox(4.0F, -23.0F, 0.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 29)
						.addBox(-6.0F, -23.0F, 0.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(4.0F, -18.0F, 0.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 23)
						.addBox(-6.0F, -18.0F, 0.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -31.0F, -3.0F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
