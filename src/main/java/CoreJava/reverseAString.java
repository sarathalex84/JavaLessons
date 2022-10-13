import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class reverseAString {
    public static void main(String[] args) {
        String s="Sarath";
        int lenth=s.length();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        System.out.println(rev);
    }



}
