public class Prg2{
    public static void main(String[] args){
        String value="type here to search";
        for(int i=0;i<value.length();i++){
            if (i%2!=0 && value.charAt(i)!=' '){
                System.out.print(value.charAt(i));
            }
        }
    }
}