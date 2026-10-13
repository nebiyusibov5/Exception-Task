public class Task2 {
    public static void main(String[] args){
        String[] names={"aria","snow","rob"};

        try {
            int index=3;
            System.out.println("Element:"+names[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: You entered the wrong index! You have exceeded the bounds of the array.");
        }finally {
            System.out.println( "The operation is complete.");
        }
    }
}
