package com.tactfactory.algotojava.tp17.model;

public class ArmureMixte extends Armure {

	private ArmureMagique armureMagique;
	private ArmurePhysique armurePhysique;
	
	public ArmureMagique getArmureMagique() {
		return armureMagique;
	}

	public void setArmureMagique(ArmureMagique armureMagique) {
		this.armureMagique = armureMagique;
	}

	public ArmurePhysique getArmurePhysique() {
		return armurePhysique;
	}

	public void setArmurePhysique(ArmurePhysique armurePhysique) {
		this.armurePhysique = armurePhysique;
	}

	public ArmureMixte(ArmureMagique armureMagique, ArmurePhysique armurePhysique) {
		super();
		this.armureMagique = armureMagique;
		this.armurePhysique = armurePhysique;
	}

	@Override
	public int receiveAttack(Arme arme) {
		return 0;
	}

}
