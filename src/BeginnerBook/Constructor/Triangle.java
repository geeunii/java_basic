package BeginnerBook.Constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Triangle {
    private Integer base;
    private Integer height;

    public double area() {
        return (double) (base * height) / 2;
    }
}
