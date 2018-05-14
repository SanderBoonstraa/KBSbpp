public class Product {
    private String name;
    private int height;
    private int locationX;
    private int locationY;

    public Product(String name,int height){
        this.name=name;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return name +" " + height;
    }
}
