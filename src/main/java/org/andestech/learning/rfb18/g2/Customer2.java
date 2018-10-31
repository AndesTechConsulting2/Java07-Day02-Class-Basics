package org.andestech.learning.rfb18.g2;

import java.util.Random;

public class Customer2 {

//   public Customer2(){
//
//   }


    public Customer2(String name, String sname, int age)
    {
      this(name,sname,age,10);
    }


    public Customer2(String name, String sname, int age, double ballance) {
        System.out.println("+++ ctor, " + this);
        this.name = name;
        this.sname = sname;
        this.age = age;
        this.ballance = ballance;
        id = new Random().nextInt(1000000);
    }

   private String name;
   private String sname;
   private int age;
   private double ballance;
   private int id;

   public int getId(){
       return id;
   }

//   public void setId(int id){
//       this.id = id;
//       //....
//   }

   public String getCustomerInfo(){

       return "id: " + id + ", name: " + getName() +
               " " + getSname() + ", age: " + getAge()
               + ", ballance: " + getBallance();

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }
}
