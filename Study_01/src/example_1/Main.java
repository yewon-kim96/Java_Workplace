package example_1;
//객체 구현
public class Main {

	public static void main(String[] args) {
		Unit medic = new Unit();
		medic.name = "medic";
		medic.hp = 60;
		medic.mp = 200;
		medic.damage = 0;
		medic.armor = 1;
		System.out.println(medic.name);
		
		Unit marine = new Unit();
		marine.name = "marine";
		marine.hp = 40;
		marine.mp = 0;
		marine.damage = 6;
		marine.armor = 0;
		System.out.println(marine.hp);
	}

}


