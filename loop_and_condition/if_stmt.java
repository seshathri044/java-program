public class if_stmt {
    public void disp(int a){
        if(a>5){
            System.out.println("greater than 5");
        }
        else{
            System.out.println("less tha 5");
        }
    }
    public static void main(String[] args){
        if_stmt nw = new if_stmt();
        nw.disp(3);
    }
}
