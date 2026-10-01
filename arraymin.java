import java.util.*
;public class arraymin {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER ARRAY LENGTH: ");
        int n = s.nextInt();
        System.out.print("ENTER ELEMENTS: ");
        int [] arr = new int[n];

        for(int i = 0; i <arr.length; i++){
            arr[i] = s.nextInt();
        }
        int x = Integer.MAX_VALUE;
        for(int y: arr){
            if(x > y){
                x = y;
            }
        }
        System.out.print("MINIMUM VALUE: "+x);

    }
}
