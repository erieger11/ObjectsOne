package object1;

public class Chair {
    private String material;
    private String color;
    private String legs;

    public Chair(String material, String color, String legs){
        this.material = material;
        this.color = color;
        this.legs = legs;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getLegs(){
        return legs;
    }
    public void setLegs(String legs){
        this.legs = legs;
    }
}



