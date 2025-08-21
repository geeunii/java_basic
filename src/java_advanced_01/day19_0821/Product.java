package java_advanced_01.day19_0821;

import lombok.*;

// 제품
@Data // Getter, Setter, EqualsAndHashCode, toString 다 들어있음
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor // 생성자 Lombok
@Builder
public class Product {
    // 제품은 제품번호, 제품이름, 제조사, 가격이란 속성을 가지고 있다.
    private String no;
    private String name;
    private String company;
    private Integer price;
}
