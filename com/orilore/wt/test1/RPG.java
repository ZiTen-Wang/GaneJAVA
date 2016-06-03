package com.orilore.wt.test1;

public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwordsMan swordsman = new SwordsMan();
		swordsman.setName("Justin");
		swordsman.setLevel(1);
		swordsman.setBlood(200);
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		
		showBlood(swordsman);
		showBlood(magician);
	}
     static void showBlood(Role role){
    	 System.out.printf("%s Ѫ�� %d%n",role.getName(),role.getBlood());
     }
}
