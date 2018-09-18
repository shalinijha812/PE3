package myexercise3;

public class ExcptionGenerator {
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,60};

        try{
            System.out.println(arr[20]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e+" "+"ArrayOutOfBounds");
        }
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e+" "+"Null Pointer Exception");
        }
        try{
            int[] negArr=new int[-1];
        }
        catch (NegativeArraySizeException e){
            System.out.println(e+" "+"NegativeArrayException");
        }
    }
}
