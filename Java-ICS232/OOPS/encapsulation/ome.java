package OOPS.encapsulation;

class a{

    private int weight;

    void setWeight(int weight){
        if (weight<0) {
            System.out.println("weight cannot be negative");
            return;
        }
        this.weight = weight;
    }

    int getWeight(){
        return weight;
    }

}

public class ome {

    public static void main(String[] args){
    
    a info = new a();
    info.setWeight(-1);
    System.out.println(info.getWeight());

    }

}