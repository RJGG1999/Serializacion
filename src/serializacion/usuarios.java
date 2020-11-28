/*
* Java - Metodo de serialización
* Copyright 2020 Raúl Garibay Gamero
*/
package serializacion;
import java.io.Serializable;

public class usuarios implements Serializable{
    private String id,name,apeP,apeM,address,email,phone;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getApeP(){
        return apeP;
    }
    
    public void setApeP(String apeP){
        this.apeP=apeP;
    }
    
    public String getApeM(){
        return apeM;
    }
    
    public void setApeM(String apeM){
        this.apeM=apeM;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone=phone;
    }
}
