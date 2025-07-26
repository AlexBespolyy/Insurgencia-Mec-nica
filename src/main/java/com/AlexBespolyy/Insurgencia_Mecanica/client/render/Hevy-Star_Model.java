// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Hevy_Star extends EntityModel<Entity> {
	private final ModelRenderer root;
	private final ModelRenderer head;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair_r1;
	private final ModelRenderer Hair_r2;
	private final ModelRenderer Hair_r3;
	private final ModelRenderer Hair_r4;
	private final ModelRenderer Hair_r5;
	private final ModelRenderer Hair_r6;
	private final ModelRenderer Hair_r7;
	private final ModelRenderer Hair_r8;
	private final ModelRenderer Hair_r9;
	private final ModelRenderer Hair_r10;
	private final ModelRenderer Hair_r11;
	private final ModelRenderer Hair_r12;
	private final ModelRenderer Hair_r13;
	private final ModelRenderer Hair_r14;
	private final ModelRenderer GasMask;
	private final ModelRenderer body;
	private final ModelRenderer upperPart;
	private final ModelRenderer torso;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer Gabardina;
	private final ModelRenderer DankBank;
	private final ModelRenderer Refery;
	private final ModelRenderer Innquita;
	private final ModelRenderer leftArmXRot;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArmJoint;
	private final ModelRenderer leftForeArm;
	private final ModelRenderer rightArmXRot;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArmJoint;
	private final ModelRenderer rightForeArm;
	private final ModelRenderer leftLegXRot;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLegJoint;
	private final ModelRenderer leftLowerLeg;
	private final ModelRenderer rightLegXRot;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLegJoint;
	private final ModelRenderer rightLowerLeg;

	public Hevy_Star() {
		texWidth = 128;
		texHeight = 128;

		root = new ModelRenderer(this);
		root.setPos(0.0F, 0.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(24, 0).addBox(-4.3F, -4.0F, -3.0F, 0.8F, 2.0F, 2.0F, 0.0F, false);
		head.texOffs(24, 0).addBox(3.5F, -4.0F, -3.0F, 0.8F, 2.0F, 2.0F, 0.0F, true);

		Hair = new ModelRenderer(this);
		Hair.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(Hair);
		

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setPos(3.4F, -6.5F, -2.6F);
		Hair.addChild(Hair_r1);
		setRotationAngle(Hair_r1, -0.3705F, 0.1462F, -0.0362F);
		Hair_r1.texOffs(39, 9).addBox(-1.0F, -1.0F, -3.3F, 1.0F, 1.0F, 2.3F, 0.0F, false);

		Hair_r2 = new ModelRenderer(this);
		Hair_r2.setPos(4.3F, -5.5F, -2.1F);
		Hair.addChild(Hair_r2);
		setRotationAngle(Hair_r2, -0.389F, 0.1625F, -0.0425F);
		Hair_r2.texOffs(41, 11).addBox(-1.0F, -1.0F, -2.9F, 1.0F, 1.0F, 0.9F, 0.0F, false);

		Hair_r3 = new ModelRenderer(this);
		Hair_r3.setPos(3.6F, -5.5F, -2.6F);
		Hair.addChild(Hair_r3);
		setRotationAngle(Hair_r3, -0.3521F, 0.1302F, -0.0291F);
		Hair_r3.texOffs(40, 10).addBox(-1.0F, -1.0F, -2.9F, 1.0F, 1.0F, 1.9F, 0.0F, false);

		Hair_r4 = new ModelRenderer(this);
		Hair_r4.setPos(1.8F, -6.6F, -2.6F);
		Hair.addChild(Hair_r4);
		setRotationAngle(Hair_r4, -0.3494F, 0.0483F, 0.001F);
		Hair_r4.texOffs(38, 8).addBox(-1.0F, -1.0F, -3.8F, 1.0F, 1.0F, 2.8F, 0.0F, false);

		Hair_r5 = new ModelRenderer(this);
		Hair_r5.setPos(2.2F, -5.5F, -2.3F);
		Hair.addChild(Hair_r5);
		setRotationAngle(Hair_r5, -0.3494F, 0.0483F, 0.001F);
		Hair_r5.texOffs(38, 8).addBox(-1.0F, -1.0F, -3.8F, 1.0F, 1.0F, 2.8F, 0.0F, false);

		Hair_r6 = new ModelRenderer(this);
		Hair_r6.setPos(0.7F, -6.4F, -2.0F);
		Hair.addChild(Hair_r6);
		setRotationAngle(Hair_r6, -0.349F, 0.0073F, 0.0159F);
		Hair_r6.texOffs(38, 9).addBox(-1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 2.1F, 0.0F, false);

		Hair_r7 = new ModelRenderer(this);
		Hair_r7.setPos(1.1F, -5.2F, -2.0F);
		Hair.addChild(Hair_r7);
		setRotationAngle(Hair_r7, -0.349F, 0.0073F, 0.0159F);
		Hair_r7.texOffs(38, 9).addBox(-1.0F, -1.0F, -4.8F, 1.0F, 1.0F, 2.8F, 0.0F, false);

		Hair_r8 = new ModelRenderer(this);
		Hair_r8.setPos(-1.7F, -6.2F, -1.9F);
		Hair.addChild(Hair_r8);
		setRotationAngle(Hair_r8, -0.3677F, -0.0951F, 0.092F);
		Hair_r8.texOffs(38, 9).addBox(-1.0F, -1.0F, -3.9F, 1.0F, 1.0F, 1.9F, 0.0F, false);

		Hair_r9 = new ModelRenderer(this);
		Hair_r9.setPos(-2.9F, -6.2F, -1.9F);
		Hair.addChild(Hair_r9);
		setRotationAngle(Hair_r9, -0.3867F, -0.1273F, 0.1055F);
		Hair_r9.texOffs(38, 9).addBox(-1.0F, -1.0F, -3.8F, 1.0F, 1.0F, 1.8F, 0.0F, false);

		Hair_r10 = new ModelRenderer(this);
		Hair_r10.setPos(-3.3F, -5.3F, -1.9F);
		Hair.addChild(Hair_r10);
		setRotationAngle(Hair_r10, -0.3499F, -0.0874F, 0.0875F);
		Hair_r10.texOffs(38, 9).addBox(-1.0F, -1.0F, -3.8F, 1.0F, 1.0F, 1.8F, 0.0F, false);

		Hair_r11 = new ModelRenderer(this);
		Hair_r11.setPos(-2.3F, -5.1F, -1.9F);
		Hair.addChild(Hair_r11);
		setRotationAngle(Hair_r11, -0.3497F, -0.0792F, 0.0845F);
		Hair_r11.texOffs(38, 9).addBox(-1.0F, -1.0F, -3.8F, 1.0F, 1.0F, 1.8F, 0.0F, false);

		Hair_r12 = new ModelRenderer(this);
		Hair_r12.setPos(-1.1F, -5.2F, -2.0F);
		Hair.addChild(Hair_r12);
		setRotationAngle(Hair_r12, -0.3486F, -0.0218F, 0.0636F);
		Hair_r12.texOffs(38, 9).addBox(-1.0F, -1.0F, -3.9F, 1.0F, 1.0F, 1.9F, 0.0F, false);

		Hair_r13 = new ModelRenderer(this);
		Hair_r13.setPos(-0.4F, -6.2F, -2.0F);
		Hair.addChild(Hair_r13);
		setRotationAngle(Hair_r13, -0.3756F, -0.047F, -0.0002F);
		Hair_r13.texOffs(38, 9).addBox(-1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 2.1F, 0.0F, false);

		Hair_r14 = new ModelRenderer(this);
		Hair_r14.setPos(0.0F, -5.6F, -2.0F);
		Hair.addChild(Hair_r14);
		setRotationAngle(Hair_r14, -0.2182F, 0.0F, 0.0F);
		Hair_r14.texOffs(38, 9).addBox(-1.0F, -1.0F, -4.5F, 1.0F, 1.0F, 2.5F, 0.0F, false);

		GasMask = new ModelRenderer(this);
		GasMask.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(GasMask);
		GasMask.texOffs(0, 32).addBox(-4.4F, -5.8F, -4.2F, 8.8F, 6.0F, 0.4F, 0.0F, true);
		GasMask.texOffs(28, 19).addBox(4.0F, -5.0F, -4.0F, 0.2F, 1.0F, 8.3F, 0.0F, false);
		GasMask.texOffs(18, 21).addBox(4.0F, -2.0F, -4.0F, 0.2F, 1.0F, 8.3F, 0.0F, false);
		GasMask.texOffs(18, 33).addBox(-4.2F, -5.0F, -4.0F, 0.2F, 1.0F, 8.3F, 0.0F, false);
		GasMask.texOffs(27, 31).addBox(-4.2F, -2.0F, -4.0F, 0.2F, 1.0F, 8.3F, 0.0F, false);
		GasMask.texOffs(0, 39).addBox(-4.0F, -4.9F, 4.0F, 8.0F, 3.8F, 0.3F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(body);
		

		upperPart = new ModelRenderer(this);
		upperPart.setPos(0.0F, 12.0F, 0.0F);
		body.addChild(upperPart);
		

		torso = new ModelRenderer(this);
		torso.setPos(0.0F, -12.0F, 0.0F);
		upperPart.addChild(torso);
		torso.texOffs(0, 81).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);
		torso.texOffs(0, 57).addBox(-3.9F, 8.0F, -1.9F, 7.8F, 2.0F, 3.8F, 0.0F, false);
		torso.texOffs(0, 52).addBox(-3.7F, 7.0F, -1.7F, 7.4F, 1.0F, 3.4F, 0.0F, false);
		torso.texOffs(0, 74).addBox(-3.9F, 5.0F, -1.9F, 7.8F, 2.0F, 3.8F, 0.0F, false);
		torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-1.0F, 3.0F, -0.1F);
		torso.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.7418F);
		bone.texOffs(77, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(1.0F, 3.0F, -0.1F);
		torso.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.7418F);
		bone3.texOffs(77, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.5F, 2.9F, -0.1F);
		torso.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.9425F);
		bone5.texOffs(78, 55).addBox(-1.6F, -0.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);

		bone6 = new ModelRenderer(this);
		bone6.setPos(-0.5F, 2.9F, -0.1F);
		torso.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.9425F);
		bone6.texOffs(78, 55).addBox(-2.4F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-2.4F, 0.5F, -0.1F);
		torso.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.829F);
		bone2.texOffs(78, 55).addBox(-0.9F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(2.4F, 0.5F, -0.1F);
		torso.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.7418F);
		bone4.texOffs(78, 55).addBox(-1.1F, 0.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, true);

		Gabardina = new ModelRenderer(this);
		Gabardina.setPos(-10.0F, 13.0F, 0.0F);
		torso.addChild(Gabardina);
		

		DankBank = new ModelRenderer(this);
		DankBank.setPos(15.0F, 1.0F, 3.1F);
		Gabardina.addChild(DankBank);
		DankBank.texOffs(29, 68).addBox(-9.0F, -3.0F, -2.0F, 8.0F, 9.0F, 1.0F, 0.0F, false);

		Refery = new ModelRenderer(this);
		Refery.setPos(0.0F, 0.0F, 0.0F);
		Gabardina.addChild(Refery);
		Refery.texOffs(25, 79).addBox(5.8F, -2.0F, -1.9F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		Innquita = new ModelRenderer(this);
		Innquita.setPos(6.8F, 1.0F, 0.1F);
		Gabardina.addChild(Innquita);
		Innquita.texOffs(36, 79).addBox(6.3F, -3.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		leftArmXRot = new ModelRenderer(this);
		leftArmXRot.setPos(6.0F, -10.0F, 0.0F);
		upperPart.addChild(leftArmXRot);
		

		leftArm = new ModelRenderer(this);
		leftArm.setPos(0.0F, 0.0F, 0.0F);
		leftArmXRot.addChild(leftArm);
		leftArm.texOffs(32, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftArmJoint = new ModelRenderer(this);
		leftArmJoint.setPos(0.0F, 4.0F, 0.0F);
		leftArm.addChild(leftArmJoint);
		leftArmJoint.texOffs(32, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

		leftForeArm = new ModelRenderer(this);
		leftForeArm.setPos(0.0F, 4.0F, 0.0F);
		leftArm.addChild(leftForeArm);
		leftForeArm.texOffs(32, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);

		rightArmXRot = new ModelRenderer(this);
		rightArmXRot.setPos(-6.0F, -10.0F, 0.0F);
		upperPart.addChild(rightArmXRot);
		

		rightArm = new ModelRenderer(this);
		rightArm.setPos(0.0F, 0.0F, 0.0F);
		rightArmXRot.addChild(rightArm);
		rightArm.texOffs(0, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightArmJoint = new ModelRenderer(this);
		rightArmJoint.setPos(0.0F, 4.0F, 0.0F);
		rightArm.addChild(rightArmJoint);
		rightArmJoint.texOffs(0, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

		rightForeArm = new ModelRenderer(this);
		rightForeArm.setPos(0.0F, 4.0F, 0.0F);
		rightArm.addChild(rightForeArm);
		rightForeArm.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
		rightForeArm.texOffs(16, 97).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.15F, false);

		leftLegXRot = new ModelRenderer(this);
		leftLegXRot.setPos(2.0F, 12.0F, 0.0F);
		body.addChild(leftLegXRot);
		

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(0.0F, 0.0F, 0.0F);
		leftLegXRot.addChild(leftLeg);
		leftLeg.texOffs(96, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leftLegJoint = new ModelRenderer(this);
		leftLegJoint.setPos(0.0F, 6.0F, 0.0F);
		leftLeg.addChild(leftLegJoint);
		leftLegJoint.texOffs(96, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

		leftLowerLeg = new ModelRenderer(this);
		leftLowerLeg.setPos(0.0F, 6.0F, 0.0F);
		leftLeg.addChild(leftLowerLeg);
		leftLowerLeg.texOffs(96, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
		leftLowerLeg.texOffs(108, 102).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);

		rightLegXRot = new ModelRenderer(this);
		rightLegXRot.setPos(-2.0F, 12.0F, 0.0F);
		body.addChild(rightLegXRot);
		

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(0.0F, 0.0F, 0.0F);
		rightLegXRot.addChild(rightLeg);
		rightLeg.texOffs(64, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightLegJoint = new ModelRenderer(this);
		rightLegJoint.setPos(0.0F, 6.0F, 0.0F);
		rightLeg.addChild(rightLegJoint);
		rightLegJoint.texOffs(64, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

		rightLowerLeg = new ModelRenderer(this);
		rightLowerLeg.setPos(0.0F, 6.0F, 0.0F);
		rightLeg.addChild(rightLowerLeg);
		rightLowerLeg.texOffs(64, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
		rightLowerLeg.texOffs(76, 102).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}