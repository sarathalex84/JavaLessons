import java.util.HashMap;

public class CharacterOrNumberRepeatOccurenceHashMap {
    public static void main(String[] args) {
        //key here is the character
        //value here is the occurence count

        String str="1234321"; //-replace with str="java";
        int count;
        char ch;
        HashMap<Character, Integer> hashMap=new HashMap<>();
        //traverse through the entire string create a for loop
        for(int i=0;i< str.length();i++){
            ch=str.charAt(i);// we are trying to find out the character for which we will see the occurence
            //now we need to chk if its present in my hashmap
            if(hashMap.containsKey(ch)){  //character is the key value here, key is ch
                count=hashMap.get(ch); // to find the previous count
                count++; // update the count of the previous value
                hashMap.replace(ch,count); //now replace it with new value

            }else{ // what if the hashmap doesnt contain the key then we must use else condition
                hashMap.put(ch,1);// to add key value newly to hashmap as it appearing first time , harcode to 1
            }

        }
        for(Character key: hashMap.keySet()){ // using keyset we find out the key sets.
            System.out.println(key+ "="+hashMap.get(key));
    }
}}
