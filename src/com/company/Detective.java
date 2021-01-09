package com.company;

public class Detective {
    public int positionx;
    public int positiony;


    public int getPositiony() {
        return positiony;
    }

    public int getPositionx() {
        return positionx;
    }


    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }

    public void setPositiony(int positiony) {
        this.positiony = positiony;
    }

    public void newPosition(int avanceDeCase) {
        if (positiony == 0) { //on teste ici la position de l'objet détective. le seul moment où positionx varie est quand positiony vaut 0 ou 4 (et réciproquement pour positiony)
            this.positionx = positionx + avanceDeCase; //normalement, on ne pourra avancer que d'une case ou de deux. on ajoutera donc à position x le nombre qui a été passé en paramètre
            if (positionx > 4) { //dans le cas où on arrive à une limite du tableau, on change d'axe pour le faire bouger selon y.
                this.positiony = positionx - 4; //on utilise ce qui a dépassé de 4 pour l'ajouter à positiony
                this.positionx = 4; //on rétablit positionx à son maximum, soit 4.
            }//on répète cette procédure pour la ligne du haut, de droite, du bas et de gauche.
        } else if (positiony == 4) {
            this.positionx = positionx - avanceDeCase;
            if (positionx < 0) {
                this.positiony = positionx + 4;
                this.positionx = 0;
            }
        } else if (positionx == 0) {
            this.positiony = positiony + avanceDeCase;
            if (positiony > 4) {
                this.positionx = positiony - 4;
                this.positiony = 4;
            }
        } else if (positionx == 4) {
            this.positiony = positiony - avanceDeCase;
            if (positiony < 0) {
                this.positionx = positiony + 4;
                this.positiony = 0;
            }


        }
    }
}
