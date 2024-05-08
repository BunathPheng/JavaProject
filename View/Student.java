package View;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private Integer id;
    private String name;
    private Integer year;
    private Integer Month;
    private Integer Day;
    private String classes[];
    private String subject[];
}
