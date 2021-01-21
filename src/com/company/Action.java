package com.company;
import java.util.Scanner;

public class Action {
   /* Scanner scanner = new Scanner(System.in);
    public void moveSherlock(){
        System.out.println("Voulez vous avancer de 1 ou 2 cases?");
        String casesAvance = scanner.nextLine();// le joueur choisir le nombre de cases à avancer le jeton Sherlock
        if (casesAvance=="1"||casesAvance=="2"){
            if (casesAvance=="1"){
                if()
            }
        }
    }
    public void moveWatson(){

    }
    public void moveToby(){

    }
    public void joker(){

    }
    public void alibi(){

    }
    public void echange(){
        int q1 = 0;
        int q2 = 0;
        int colonne1 = 0;
        int ligne1 = 0;
        int colonne2 = 0;
        int ligne2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez le premier quartier à déplacer (entre 1 et 9, sachant que 1 est en haut à gauche et 9 en bas à droite)");
        while (!(q1 > 0 && q1 < 10)) {
            q1 = scanner.nextInt();
            if (q1 < 0 || q1 > 9)
                System.out.println("Ressaisissez un chiffre entre 1 et 9 ! ");
        }

        System.out.println("Choisissez le second quartier à échanger avec le précédent (entre 1 et 9)");
        while (!((q2 > 0 && q2 < 10) && (q1 != q2))) {
            q2 = scanner.nextInt();
            if ((q2 < 0 || q2 > 9) || (q1 == q2))
                System.out.println("Ressaisissez un chiffre entre 1 et 9, différent du premier (obligation d'échanger)!");
        }
        colonne1 = (q1-1) % 3;
        ligne1 = (q1-1) / 3;
        colonne2 = (q2-1) % 3;
        ligne2 = (q2-1) / 3;

        variable = quartier[ligne1][colonne1];
        quartier[ligne1][colonne1] = quartier[ligne2][colonne2];
        quartier[ligne2][colonne2]=variable;
        }

      public void rotation(){
         int pst = 0;
         int rot = 0;

         System.out.println("Choisissez un quartier à faire pivoter (entre 1 et 9, sachant que 1 est en haut à gauche et 9 en bas à droite)");
         while (!(pst > 0 && pst < 10)) {
            pst = scanner.nextInt();

            if (pst < 0 || pst > 9)
                System.out.println("Ressaisissez un chiffre entre 1 et 9 ! ");
        }

          System.out.println("Choisissez l'orientation du mur du quartier (entre 1 et 4, 1 = à gauche/ 2 = en haut/ 3 = à droite/ 4 = en bas)");
          while (!((rot > 0 && rot < 5) && // case du plateau et son sens//)) {
               rot = scanner.nextInt();

               if ((rot < 0 || rot > 4) || // case du plateau et son sens//)
                    System.out.println("Ressaisissez un chiffre entre 1 et 4, vous êtes obligé de tourner !");
        }
// trouver un moyen de de designer la case du plateau enfonction de sa place
}
   */

}
