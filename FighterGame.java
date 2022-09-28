import java.util.Random;

public class FighterGame {

    public static void main(String[] args) {
    	
    	Fighter f1 = new Fighter("Ghaldy" , 8 , 100 , 75 , 40);
    	Fighter f2 = new Fighter("Shooshy" , 6 , 100 , 55 , 50);
    	System.out.println("   === " + f1.name + " vs " + f2.name + " ===   ");

    	Match match = new Match(f1 , f2 , 50 , 100); 
    	match.run();


    }
}


class Fighter {
	String name;
	int health;
	int damage;
	int weight;
	int dodge;

	Fighter(String name , int damage , int health , int weight , int dodge) {
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.weight = weight;
		if (dodge >= 0 && dodge <= 100) {
			this.dodge = dodge;
		}
		else {
			this.dodge = 0;
		}
	}

	int hit(Fighter foe) {
		Random random = new Random();
		int damage = random.nextInt(this.damage + 1);
		System.out.println(this.name + " ==> " + foe.name + " : " + damage + " hasar vurdu.");
		if (foe.isDodge()) {
			System.out.println(foe.name + " gelen hasarı blokladı.");
			return foe.health;
		}
		if (foe.health - damage < 0) {
			return 0;
		}

		return foe.health - damage;
	}

	boolean isDodge() {
		Random random = new Random();
		int dodgeChange = random.nextInt(101);
		return dodgeChange <= this.dodge;
	}
	

}


class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1 , Fighter f2 , int minWeight , int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	void run() {

		if (isCheck()) {
			System.out.println("f1.health (Ghaldy) : " +this.f1.health);
			System.out.println("f2.health (Shooshy) : " +this.f2.health);
			while (this.f1.health > 0 && this.f2.health > 0){
				System.out.println("YENİ ROUND");
				
				if (tossHeadsTails() == 1) {
					this.f2.health = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
				}
				else {
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					this.f2.health = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
				}


				// this.f2.health = this.f1.hit(this.f2);
				// if (isWin()) {
				// 	break;
				// }
				// this.f1.health = this.f2.hit(this.f1);
				// if (isWin()) {
				// 	break;
				// }
				System.out.println(f2.name + " health : " +this.f2.health);
				System.out.println(f1.name + " health : " +this.f1.health);
				//break;
			}
		}
		else {
			System.out.println("Sporcuların Sikletleri Uymuyor.");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}

	boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println(f2.name + " kazandı...");
			return true;
		}
		else if(this.f2.health == 0) {
			System.out.println(f1.name + " kazandı...");
			return true;
		}
		else {
			return false;
		}
	}
	int tossHeadsTails() {
		Random random = new Random();
		int x = random.nextInt(2);
		return x;
	}
}