package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {

    private final List<Livre> livres;
    private final Scanner scanner;

    public LivreService(){
        this.livres = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre du livre : ");
        String titre = sc.nextLine();
        System.out.println("Veuillez saisir la description du livre : ");
        String description = sc.nextLine();
        System.out.println("Veuillez saisir la date de publication du livre : ");
        String datePublication = sc.nextLine();
        System.out.println("Veuillez saisir le genre du livre : ");
        String genre = sc.nextLine();
        //Créer un objet livre
        Livre livre = new Livre(titre, description, datePublication,genre);
        //Ajouter le livre à la liste
        livres.add(livre);
        System.out.println(getLivre(livre));
    }

    public void remove(){

        System.out.println("Veuillez saisir le titre du livre à supprimer : ");
        String titre = scanner.nextLine();
        for (Livre livre : livres) {
            if(livre.getTitre().equals(titre)){
                livres.remove(livre);
            }
        }
        System.out.println("Le livre : " + titre  + " a été supprimé.");
    }

    public void findAll() {
        for (Livre livre : livres) {
            System.out.println(getLivre(livre));
        }
    }

    public Livre getLivre(Livre livre) {
        return livre;
    }
}
