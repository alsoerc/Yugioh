import Models.Card;
import Models.Magic;
import Models.Monster;
import Models.Trap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Monster blueEyes = new Monster("Blue Eyes White Dragon", "Normal", "Awesome dragon!", 3000, 2500);
        Monster darkMagician = new Monster("Dark Magician", "Normal", "Awesome magician!", 2500, 2100);
        //Card monsterReborn = new Magic("Monster Reborn", "Green", "Monster reborn!");
        //Card mirrorForce = new Trap("Mirror Force", "Pink", "Mirror force!");
        Monster[] monsters = {blueEyes, darkMagician};

        Monster userCard = new Monster();
        Monster rivalCard = new Monster();
        int response = 1;



        do{
            System.out.println("\n **************************");
            System.out.println("It's time to dueeeel");
            System.out.println("\n **************************");
            System.out.println("Selecciona una carta");
            System.out.println("[0] " + monsters[0].getName() + "\n[1] " + monsters[1].getName());
            int opCard = sc.nextInt();
            userCard = monsters[opCard];


            if(opCard == 0){
                rivalCard = monsters[1];
            }else{
                rivalCard = monsters[0];
            }

            if(userCard.attackCard(rivalCard.getAttack())){
                System.out.println("Ganaste!");
            }else{
                System.out.println("Pierdes!");
            }


            System.out.println("¿De nuevo?");
            System.out.println("[0] Sí [1] No");
            response = sc.nextInt();


        }while(response == 0);
    }

}
