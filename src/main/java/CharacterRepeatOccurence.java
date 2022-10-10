public class CharacterRepeatOccurence {
    public static void main(String[] args) {
        String str="automationishard";
        int finalCount=str.length();
        int CountAFterRemoval=str.replace("a","").length();
        int finalCountLASt=finalCount-CountAFterRemoval;
        System.out.println("Letter a had occured" + " "+ finalCountLASt);
    }
}
