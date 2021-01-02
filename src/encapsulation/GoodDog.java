package encapsulation;
class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark(){
        if(size>60){
            System.out.println("Woof...Woof...");
        }else if(size>30){
            System.out.println("Ruff...Ruff...");
        }else{
            System.out.println("Yipp...Yipp...");
        }
    }
}
