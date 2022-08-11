package Ejemplo1;
public class RegularClass{
    Mementotwo memento;
    String data;
    public RegularClass(){
        
    }
    public void setData(String data){
        this.data = data;
    }
    public void makeBackup(){
         memento = new Mementotwo(data);
    }
    public void recoverBackup(){
        data = memento.recoverOldInformation();
    }
}
