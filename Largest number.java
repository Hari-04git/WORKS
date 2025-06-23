public class Largest{
    public static void main(String[]args){
        int[] arr={50,80,70,60,10};
        int a=arr[0];
        for(int i=0;i<=4;i++){
            if(arr[i]>a){
                a=arr[i];
                System.out.print("largest="+a);
            }
        }
    }
}
