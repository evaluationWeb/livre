package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre du livre : ");
        String titre = sc.nextLine();
        System.out.println("Veuillez saisir la description du livre : ");
        String description = sc.nextLine();
        System.out.println("Veuillez saisir la date de publication du livre : ");
        String datePublication = sc.nextLine();
        //Créer un objet livre
        Livre livre = new Livre(titre, description, datePublication);
        System.out.println(getLivre(livre));
    }

    public Livre getLivre(Livre livre) {
        return livre;
    }
}
