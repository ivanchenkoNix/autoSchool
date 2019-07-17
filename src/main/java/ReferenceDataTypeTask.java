public class ReferenceDataTypeTask {

    public static void main(String[] args){

        String text = "some text string goesqqqqqqqaqqqqqqqqqqqaaaaa here. test. Another string";
        char[] textArray = text.toCharArray();
        String[] textParts = text.split("(?<=\\.)");
        String[] spaces = text.split(" ");

        System.out.println("First symbol: " +textArray[0]);
        System.out.println("Last symbol: " +textArray[textArray.length-1]);
        System.out.println("Middle symbol: " + text.substring(text.length()/2, text.length()-(text.length()/2)));
        System.out.println("Text before point:"+ textParts[0]);
        System.out.println("Spaces: "+ (spaces.length-1));
    }
}
