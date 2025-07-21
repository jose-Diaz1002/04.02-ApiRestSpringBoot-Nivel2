package cat.itacademy.s04.t02.n02.S04T02N02.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantityKilos;

    public Fruit() {
    }

    public Fruit(String name, int quantityKilos) {
        this.id = id;
        this.name = name;
        this.quantityKilos = quantityKilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityKilos=" + quantityKilos +
                '}';
    }
}
