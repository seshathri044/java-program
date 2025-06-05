public class vowels {
    public void disp(char c){
        if (c=='a' || c=='A' || c =='e'|| c=='E' || c== 'i' || c=='I'||c=='o'|| c=='O' || c=='u'|| c=='U'){
            System.out.println("it is vowels");
        }
        else{
            System.out.println("it is not vowels");
        }
    }
    public static void main(String [] args){
        vowels nw = new vowels();
        char a = 'z';
        nw.disp(a);
    }
}
