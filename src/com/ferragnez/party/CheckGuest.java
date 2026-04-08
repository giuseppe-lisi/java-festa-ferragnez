package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main() {

        // invitare totti e la blasi alla stessa festa è veramente criminale
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // creo istanza scanner
        Scanner in = new Scanner(System.in);

        // chiedo all'utente il suo nome
        System.out.println("Inserisci il tuo nome, controlleremo che sei invitato con il ciclo for: ");
        String guestName = in.nextLine();

        // check tramite ciclo for
        boolean canEnter = false;
        for (int i = 0; i < guestList.length; i++) {
            if (guestName.equals(guestList[i])) {
                canEnter = true;
                break;
            }
        }

        System.out.println(canEnter ? "Sei in lista, puoi entrare" : "Mi dispiace, tornatene a casa");

        System.out.println("Inserisci il tuo nome, faremo lo stesso check ma con il ciclo while: ");
        String guestNameWhile = in.nextLine();

        // check tramite ciclo while
        boolean canEnterWhile = false;
        int i = 0;
        while (!canEnterWhile && i < guestList.length) {
            if (guestNameWhile.equals(guestList[i])) {
                canEnterWhile = true;
            } else {
                i++;
            }
        }

        System.out.println(canEnterWhile ? "Sei in lista, puoi entrare" : "Mi dispiace, tornatene a casa");

        // chiude flusso dati in entrata allo scanner
        in.close();
    }
}
