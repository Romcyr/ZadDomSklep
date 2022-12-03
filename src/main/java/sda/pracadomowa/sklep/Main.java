package sda.pracadomowa.sklep;

import sda.pracadomowa.sklep.selecty.DodajProdukt;
import sda.pracadomowa.sklep.selecty.Select;
import sda.pracadomowa.sklep.selecty.SzukajProduktuPoKategorii;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Select> listaSelectow = new ArrayList<>(
                List.of(
                        new SzukajProduktuPoKategorii(),
                        new DodajProdukt()


                )
        );
        System.out.println("Lista wyboru");
        listaSelectow.forEach(select -> System.out.println(select.getSelect()));

        System.out.println("Podaj polecenie:");
        String select = Select.scanner.nextLine();

        for (Select dostepnySelect: listaSelectow){
            if (dostepnySelect.getSelect().equalsIgnoreCase(select)){
                dostepnySelect.obsluga();
            }
        }

    }
}

