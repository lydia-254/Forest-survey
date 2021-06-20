import org.sql2o.Connection;

import java.util.List;
import java.util.Objects;

public class Animal {
    public Animal(String name, string age, string health, string endangered){
        this.name=name;
        this.age=age;
        this.health=health;
        this.endangered=endangered;
    }
    public string getName(){
        return name
    }
    public string getAge(){
        return age
    }
    public string getHealth(){
        return health
    }
    public string getEndangered(){
        return endangered
    }
    @Override
    public boolean equals(Object otherAnimal) {
        if (otherAnimal instanceof Animal) {
            Animal newAnimal = (Animal) otherAnimal;
            return (this.getName().equals(newAnimal.getName()));
        }

        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, endangered, healthy);
    }
    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name,age,endangered,healthy) VALUES (:name,:age,:endangered,:healthy)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("age", this.age)
                    .addParameter("endangered", this.endangered)
                    .addParameter("healthy", this.healthy)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static List<Animal> all() {
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Animal.class);
        }
    }
    public int getId() {
        return id;
    }
    public static Animal find(int id) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Animal animal= con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Animal.class);
            return animal;
        }
    }
}