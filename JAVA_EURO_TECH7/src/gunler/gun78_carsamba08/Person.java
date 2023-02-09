package gunler.gun78_carsamba08;

import java.io.FileNotFoundException;



    public class Person {
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) throws AgeException, NameException {
            this.name = setName(name);
            this.age = setAge(age);
            this.address = setAddress(address);
        }

        public String getName() {
            return name;
        }

        public String setName(String name) throws NameException {//Checked exception olduğundan bu metodu çağıranlar handling mekanizması kurmak zorundadır.
            if (name.isBlank() || name.length() < 3){
                throw new NameException("İsim alanı boş veya 3 karakterden küçük olamaz!");
            }
            return this.name = name;
        }
        public int getAge() {
            return age;
        }

        public int setAge(int age) throws AgeException{//Checked exception olduğundan bu metodu çağıranlar handling mekanizması kurmak zorundadır.
            if(age > 0 && age <= 150){
                return this.age = age;
            }else throw new AgeException("Yaş bilgisi 0 - 150 arasında bir değer olmalıdır!");
        }

        public String getAddress() {
            return address;
        }

        public String setAddress(String address) throws AddressException{
            if(address.isBlank()){
                throw new AddressException("Adres bilgisi boş olamaz.");
            }
            return this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }