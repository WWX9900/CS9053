
public class Dog {
        private int age;
        private String owner;
        private String breed;
        
        //constructor for the class dog
        public Dog(int age, String owner, String breed){
                this.age = age;
                this.owner = owner;
                this.breed = breed;
        }
        //method compare if two dogs have the same owner
        public static boolean hasSameOwner(Dog d1, Dog d2){
                return d1.owner.equals(d2.owner);
        }

        //c.calculate the average age of the array of dogs
        public static double avgAge(Dog[] dogs){
                int sum = 0;
                double num = dogs.length;
                for(int i = 0; i < dogs.length;i++){
                        sum += dogs[i].getAge();
                }
                double avg = sum / (num *1.0);
                return avg;
        }
        //d.getfield methods
        public int getAge(){
                return this.age;
        }
        public void setAge(int age){
                this.age = age;
        }
        public String getOwner(){
                return this.owner;
        }
        public void setOwner(String owner){
                this.owner = owner;
        }
        public String getBreed(){
                return this.breed;
        }
        public void setBreed(String breed){
                this.breed = breed;
        }
        //e.return a string of the name of dog + owner +date
        public String toString(){
                String s = "";
                s = this.getBreed() + ":Owner:" + this.getOwner() + ",Age:" + getAge();
                return s;
        }
        //
        public static void main(String[] args) {
                
                Dog[] dogs = new Dog[5];
                dogs[0] = new Dog(4, "Stephen Colbert", "Boxer");
                dogs[1] = new Dog(8,"Dexter Morgan","Corgi");
                dogs[2] = new Dog(3, "Stephen Colbert", "Boxer");
                dogs[3] = new Dog(5, "Stephen Colbert", "Boxer");
                dogs[4] = new Dog(4, "Stephen Colbert", "Boxer");
                System.out.println("if two dogs have the same owner or not: " + hasSameOwner(dogs[0], dogs[1]));
                System.out.println("the average age of the dogs: "+avgAge(dogs));
                System.out.println(dogs[2].toString());
                
        }
}