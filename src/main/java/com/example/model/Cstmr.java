package com.example.model;
import java.io.Serializable;

public class Cstmr implements Serializable{ //不懂Serializable
	
	    private static final long serialVersionUID = 1L; 
	    long custId;
	    String name;
	    int age;
	  
	    public Cstmr(){
	    }
	  
	    public Cstmr(long custId, String name, int age)     {
	        this.custId = custId;
	        this.name = name;
	        this.age = age;
	    }
	  
	    public long getCustId() {
	        return custId;
	    }
	    public void setCustId(long custId) {
	        this.custId = custId;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    @Override
	    public String toString() {
	        return "Customer [age=" + age + ", custId=" + custId + ", name=" + name
	        + "]";
	    }
	


}

