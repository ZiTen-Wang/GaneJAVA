package com.orilore.wt.test;

public class RPG {

	public static void main(String[] args) {
       demoSwordsMan();
       demoMagician();
	}
	static void demoSwordsMan(){
		SwordsMan swordsman = new SwordsMan();
		swordsman.setName("Justin");
		swordsman.setLevel(1);
		swordsman.setBlood(200);
		System.out.printf("½£Ê¿:(%s,%d,%d)%n",swordsman.getName(),
				swordsman.getLevel(),swordsman.getBlood());
	}
	static void demoMagician(){
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("Ä§·¨Ê¦:(%s,%d,%d)%n",magician.getName(),
				magician.getLevel(),magician.getBlood());
	}

}
