public class Task3 {
    public static void main(String[] args){
        String[] elements={"12", "abc", "7", "", "3.5", "-4"};
        int sum=0;

        for (String e:elements){
            try {
                Integer number=Integer.parseInt(e);
                System.out.println("Successfully converted:"+number);
                sum+=number;
            }catch (NumberFormatException exception){
                System.out.println("Error: '" + e + "' is not a number and cannot be converted to an int!");
            }
        }
        System.out.println("sum:"+sum);


    }
}
