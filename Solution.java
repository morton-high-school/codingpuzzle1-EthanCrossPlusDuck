import java.io.File;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) throws Exception{
        File info = new File("puzzle.txt");
        Scanner reader = new Scanner(info);

        String text = reader.nextLine();
        String newtask = text;

        
        // for(int giraffes=0;giraffes<10;giraffes++){
        //     newtask = newtask.substring(newtask.indexOf("giraffe") + 7);
        // }
        // System.out.println(newtask.substring(0, 123));

        // int location = 0;
        // int maxconsec = 0;
        // int currconsec = 1;

        // for(int i=0;i<text.length()-1;i++){
        //     String currchar = text.substring(i,i+1);
        //     if(currchar.equals(text.substring(i+1,i+2))){
        //         currconsec++;
        //     }else{
        //         if(currconsec>maxconsec){
        //             maxconsec = currconsec;
        //             location = i+1;
        //         }
        //         currconsec = 1;
        //     }
        // }

        // System.out.println(text.substring(location,location + 105));

        // int maxvowels = 0;
        // int location = 0;
        // String vowels = "aeiou";

        // for(int i=0;i<text.length()-30;i++){
        //     String section = text.substring(i,i+30);
        //     int currvowels = 0;
        //     for(int j=0;j<section.length();j++){
        //         if(vowels.indexOf(section.substring(j,j+1))>=0){
        //             currvowels++;
        //         }
        //     }
        //     if(currvowels>maxvowels){
        //         maxvowels = currvowels;
        //         location = i+30;
        //     }
        // }

        // System.out.println(text.substring(location,location+80));
        String reversed = "";
        int location = 0;

        for(int i=0;i<text.length()-11;i++){
            String section = text.substring(i,i+11);
            for(int j=10;j>=0;j--){
                reversed += section.substring(j,j+1);
            }
            if(reversed.equals(section)){
                location = i + 11;
                break;
            }
            reversed = "";
        }

        System.out.println(text.substring(location,location+6));
    }
}