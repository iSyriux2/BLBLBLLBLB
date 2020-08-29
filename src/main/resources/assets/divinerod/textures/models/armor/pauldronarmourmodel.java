// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends BipedModel<LivingEntity> {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHeadwear;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightArm;

	public custom_model(float modelSize) {
		super(modelSize, 0.0F, 64, 40);

		ModelRenderer bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.setTextureOffset(0, 32).addBox(-9.0F, 0.0F, -2.0F, 18.0F, 4.0F, 4.0F, 0.25F, false);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}