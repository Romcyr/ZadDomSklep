package sda.pracadomowa.sklep.selecty;

import sda.pracadomowa.sklep.DataAccessObject;
import sda.pracadomowa.sklep.Produkt;

import java.time.LocalDateTime;

public class DodajProdukt implements Select{



    public DodajProdukt(){


            this.dataAccessObject = new DataAccessObject<>();
        }

        private DataAccessObject<Produkt> dataAccessObject;


    @Override
    public String getSelect() {
        return "dodaj produkt";
    }

    @Override
    public void obsluga() {
        System.out.println("Podaj nazwę ");
        String nazwa = Select.scanner.nextLine();
        System.out.println("___________________________________");
        System.out.println("Data sprzedaży dodana automatycznie ");
        System.out.println("___________________________________");
        String dataSprzedazy = String.valueOf(LocalDateTime.now());
        System.out.println("Podaj nazwę kategorii produktu");
        System.out.println("Art przemyslowe / Inne / Zywnosc");
        String nazwaKategorii = Select.scanner.nextLine();
        System.out.println("___________________________________");

        System.out.println("Podaj cene");
        double cena = Select.scanner.nextDouble();





        Produkt produkt = Produkt.builder()
                .nazwa(nazwa)
                .dataSprzedazy(dataSprzedazy)
                .nazwaKategorii(nazwaKategorii)
                .cena(cena)
                .build();
        dataAccessObject.insert(produkt);

    }
}
