public class Main {
    public static void main(String[] args) {
        int array[]=new int[5];
        int a=0;
        for(int i=0;i<5;i++){
            if(i%2==0){
                a=i;
            }
            array[i]=a;
            System.out.println(array[i]);
        }

    }
}