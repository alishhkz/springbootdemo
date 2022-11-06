package kz.springboot.springbootdemo.db;


import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Items {

    private Long id;
    private String name;
    private int price;

}
