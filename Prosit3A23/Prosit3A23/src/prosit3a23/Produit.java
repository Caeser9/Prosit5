/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3a23;

/**
 *
 * @author Mohamed
 */
public class Produit {

     int id;
     String libelle, marque;
     float prix;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    void afficher() {

        System.out.println("le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix);
    }

    @Override
    public String toString() {
        return "le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix;
    }
}
