public class armstrong {
    public boolean  armnumber(int a){
        int cube,rem,an,sum = 0;
        an = a;
        while(a>0){
            rem = a%10;
            cube = rem*rem*rem;
            sum = sum + cube;
            a=a/10;
        }
        return sum == an;
    }
    public static void main(String [] args){
        armstrong nw = new armstrong();
        System.out.println(nw.armnumber(153));
    }
}
