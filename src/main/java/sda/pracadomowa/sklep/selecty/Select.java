package sda.pracadomowa.sklep.selecty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public interface Select {
    public static final Scanner scanner = new Scanner(System.in);

    String getSelect();

    void obsluga();
}
