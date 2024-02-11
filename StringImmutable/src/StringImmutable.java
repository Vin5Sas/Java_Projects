public class StringImmutable {
    public static void main(String[] args) throws Exception {
        String myName = "Vinayaga";
        String anotherName = "Vinayaga";

        /*
        The above two variables will refer to the same string Object with value "Vinayaga" in the String Pool in memory
        This string is immutable and it will be referred to any variable having the same string value
        */

        String aThirdName = new String("Vinayaga");     //This variable will be assigned a new object in memory in a separate address

        System.out.println(myName==anotherName);                //This statement will return 'true' as both of them refer to the same String Object

        System.out.println(myName==aThirdName);                 //This statement will return 'false' as they are two different String Objects in memory
    
        System.out.println(myName.equals(aThirdName));          //This statement on the other hand will return 'true' as equals only compares the String value and not the objects
    }
}
