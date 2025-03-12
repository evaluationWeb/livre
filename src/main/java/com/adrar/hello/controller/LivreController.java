package com.adrar.hello.controller;

import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreController {
    @Autowired
    private LivreService livreService;

    private final Scanner scanner;

    public LivreController() {
        this.scanner = new Scanner(System.in);
    }

    public void router(){
        boolean etat = true;
        while (etat) {
            System.out.println("Veuillez choisir une option : ");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher la liste des livres");
            System.out.println("Autre chiffre pour Quitter");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    livreService.add();
                    break;
                case 2 :
                    livreService.remove();
                    break;
                case 3 :
                    livreService.findAll();
                    break;
                default:
                    System.out.println("Fin de l'application");
                    etat = false;
            }
        }
    }
}
