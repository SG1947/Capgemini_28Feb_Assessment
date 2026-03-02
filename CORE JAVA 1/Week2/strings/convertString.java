package Week2.strings;

public class convertString {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("B@s1a");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                str.setCharAt(i, Character.toUpperCase(ch));
            }
            else if (ch >= 'A' && ch <= 'Z') {
                str.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        System.out.println(str);
    }
}


//function toggleChar(str) {
//    let result = "";
//    
//    // Iterate over the original string
//    for (let i = 0; i < str.length; i++) {
//        const ch = str[i];
//        
//        // Check the case of the character and
//        // toggle accordingly
//        if (ch === ch.toUpperCase())
//            result += ch.toLowerCase();
//        else
//            result += ch.toUpperCase();
//    }
//    return result;
//}
//
//// Driver Code
//const str = "GeEkSfOrGeEkS";
//const x = toggleChar(str);
//console.log(x);






//public class CaseConverter {
//    public static void main(String[] args) {
//        String originalString = "HeLlO wOrLd";
//        StringBuilder convertedString = new StringBuilder();
//
//        for (char c : originalString.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                convertedString.append(Character.toLowerCase(c));
//            } else if (Character.isLowerCase(c)) {
//                convertedString.append(Character.toUpperCase(c));
//            } else {
//                // Keep non-alphabetic characters as they are (e.g., spaces, numbers)
//                convertedString.append(c);
//            }
//        }
//
//        System.out.println(convertedString.toString());
//        // Output: hElLo WoRlD
//    }
//}
//
