package co.com.bancolombia.model.animales;
import lombok.*;


@Data
@Setter
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animales {
    private String nombre;
    private Character genero;
    private Long numpatas;
    private String especie;
    private String habitad;
    private Boolean domestico;
}
