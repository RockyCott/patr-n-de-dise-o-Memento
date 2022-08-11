package Ejemplo1;
public class Mementotwo{
    public String memoryData;
    
    public Mementotwo(String data){
        this.memoryData=data;
    }
    
    public String recoverOldInformation(){
        return memoryData;
    }
}
