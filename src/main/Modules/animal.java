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
}