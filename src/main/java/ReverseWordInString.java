public class ReverseWordInString {
    public static void main(String[] args) {
        String words="My name is Sarath";
        String revWords[]=words.split(" ");

        for(int i=revWords.length-1;i>=0;i--){

            System.out.print(revWords[i]+ " ");
        }
    }
}
