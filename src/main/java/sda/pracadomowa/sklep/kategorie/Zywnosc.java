package sda.pracadomowa.sklep.kategorie;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zywnosc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
