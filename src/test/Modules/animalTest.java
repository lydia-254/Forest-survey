public class animaltest{
   @Test
    public void animal_instantiatesCorrectly_true(){
       Animal testAnimal=new Animal("lion");
       assertEquals(true, testAnimal instanceof Animal)
   }
}