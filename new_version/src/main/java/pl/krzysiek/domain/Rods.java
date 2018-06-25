package pl.krzysiek.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "rods")
public class Rods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rod_id")
    private int rod_id;

    @Column(name = "rod_brand")
    @NotEmpty(message = "Wprowadz marke wedki")
    private String rod_brand;

    @Column(name = "rod_model")
    @NotEmpty(message = "Wprowadz model wedki")
    private String rod_model;

    @Column(name = "rod_price")
    private Integer rod_price;


    public Rods(int rod_id, String rod_brand, String rod_model, Integer rod_price) {
        this.rod_id = rod_id;
        this.rod_brand = rod_brand;
        this.rod_model = rod_model;
        this.rod_price = rod_price;
    }

    public Rods() {
    }

    public Integer getRod_id() {
        return rod_id;
    }

    public void setRod_id(Integer rod_id) {
        this.rod_id = rod_id;
    }

    public String getRod_brand() {
        return rod_brand;
    }

    public void setRod_brand(String rod_brand) {
        this.rod_brand = rod_brand;
    }

    public String getRod_model() {
        return rod_model;
    }

    public void setRod_model(String rod_model) {
        this.rod_model = rod_model;
    }

    public Integer getRod_price() {
        return rod_price;
    }

    public void setRod_price(Integer rod_price) {
        this.rod_price = rod_price;
    }
}
