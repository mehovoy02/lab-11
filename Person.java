package study;

public class Person {

 String name;
 protected int age;
 public String adress;
 public String age2;
 private String phone;

public Person(String name, int age, String adress, String phone){
   this.name = name;
   this.age = age;
   this.adress = adress;
   this.phone = phone;
}
public void printName(){
    System.out.println("Name"+ name);
}
void printAge(){
    System.out.println("Age"+ age);
}
private void printAdress(){
    System.out.println("Adress"+adress);
}
protected void printPhone(){
    System.out.println("Phone"+phone);
}
}

