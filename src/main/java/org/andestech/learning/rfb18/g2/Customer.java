package org.andestech.learning.rfb18.g2;

import java.util.Random;

public class Customer {

   public Customer(){
       System.out.println("+++ ctor, " + this);
       id = new Random().nextInt(1000000);
   }

   public String name, sname;
   public int age;
   public double ballance;
   private int id;

   public int getId(){
       return id;
   }

//   public void setId(int id){
//       this.id = id;
//       //....
//   }

   public String getCustomerInfo(){

       return "id: " + id + ", name: " + name +
               " " + sname + ", age: " + age
               + ", ballance: " + ballance;

   }

}
