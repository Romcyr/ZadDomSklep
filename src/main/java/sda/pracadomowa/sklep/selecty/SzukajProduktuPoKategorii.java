package sda.pracadomowa.sklep.selecty;

import sda.pracadomowa.sklep.DataAccessObject;
import sda.pracadomowa.sklep.Kategoria;

import javax.xml.crypto.Data;
import java.util.Optional;

public class SzukajProduktuPoKategorii implements Select{


    public SzukajProduktuPoKategorii() {

        this.dataAccessObject = new DataAccessObject<>();
    }

    private DataAccessObject <Kategoria> dataAccessObject;


    @Override
    public String getSelect() {return "szukanie w kategoriach";}

    @Override
    public void obsluga() {
        System.out.println("Podaj id Szukanego produktu");
        String idString = Select.scanner.nextLine();
        Long id = Long.parseLong(idString);

        Optional<Kategoria> kategoriaOptional = dataAccessObject.find(Kategoria.class, id);
        if (kategoriaOptional.isPresent()){
            System.out.println(kategoriaOptional.get());
        }else {
            System.err.println("_________________________________________________");
            System.err.println(" Ni ma takiego produktu, NI MA! SZUKEJ KAJ INDZI");
        }

    }
}
