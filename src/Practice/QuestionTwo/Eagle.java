package Practice.QuestionTwo;

import java.security.PublicKey;

public  class Eagle extends Bird{
    private String Name="Eagle";

    public Eagle(String name){
        this.Name=name;
    }

    public void setName(String name){
        this.Name=name;
    }

    public String getName(){
        return Name;
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying....");
    }
}
