package sda.pracadomowa.sklep.selecty;

import sda.pracadomowa.sklep.DataAccessObject;
import sda.pracadomowa.sklep.Produkt;

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

        System.out.println("Podaj nazwę kategorii produktu");
        System.out.println("Art przemyslowe / Inne / Zywnosc");
        String nazwaKategorii = Select.scanner.nextLine();

        System.out.println("Podaj cene");
        double cena = Select.scanner.nextDouble();



        Produkt produkt = Produkt.builder()
                .nazwa(nazwa)
                .cena(cena)
                .nazwaKategorii(nazwaKategorii)
                .build();
        dataAccessObject.insert(produkt);

    }
}
