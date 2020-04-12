/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;
import java.io.File;
import java.util.*;
import java.io.*;

/**
 *
 * @author Mahmoud,Taher
 * 
 */
public class Substitution {

    /**
     * @param args the command line arguments
     */
       char[] c1 ;
       char[] c2;
    public void read_key(String path) throws FileNotFoundException, IOException
    {
 
        File f1 = new File(path);
        BufferedReader r1 =new BufferedReader (new FileReader(f1));
        String str;
        str = r1.readLine();
        c1 = str.toCharArray();
        str = "";
        str = r1.readLine();
        c2 = str.toCharArray();
       //x 
       //VtmcOKamsTtlmidmZuTmJORratmGYmlItmKiWSqjN
    }
    public void comp(String text)
    {
        String coded ="";
        for(int i=0 ; i<text.length() ; i++)
        {
            for(int j=0 ; j<c1.length ; j++)
            {
//               if(text.charAt(i)==' ')
//                {
//                    coded+=' ';
//                    break;
//                }
                if(text.charAt(i)==c1[j])
                {
                    coded+=c2[j];
                }
            }
        }
        System.out.println(coded);
    }
    public void decomp(String text)
    {
        String encoded="";
                for(int i=0 ; i<text.length() ; i++)
        {
            for(int j=0 ; j<c2.length ; j++)
            {
//                if(text.charAt(i)==' ')
//                {
//                    encoded+=' ';
//                    break;
//                }
                if(text.charAt(i)==c2[j])
                {
                    encoded+=c1[j];
                }
            }
        }
        System.out.println(encoded);
        //didgxr
    }
        
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Substitution s1 = new Substitution();
        System.out.println("enter the path of the file of the key: ");
        String st;
        st=sc.nextLine();
        System.out.println("you want to comp or decomp");
        String choose;
        choose = sc.nextLine();
        if(choose.equals("comp"))
        {
        s1.read_key(st);
        st="";
        System.out.println("enter the text: ");
        st = sc.nextLine();
        s1.comp(st);
        }
        else
        {
            s1.read_key(st);
            st="";
            System.err.println("enter the text: ");
            st = sc.nextLine();
            s1.decomp(st);
            
        }
        
        
    }
    
}
