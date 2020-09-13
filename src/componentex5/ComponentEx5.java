/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentex5;

import java.util.Scanner;

/**
 *
 * @author athip
 */
public class ComponentEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PropertyBean source = new PropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        source.addPropertyChangeListener(listener1);
        source.addPropertyChangeListener(listener2);
        //source.setScore(scr);
        String scr = " " ;
        
        while(scr!=null){
            if(scr.equals("")){
                System.out.println("finished");
                break;
            }
            else{
                scr = getData();
                source.setScore(scr);
            }
        }//while loop
        
        
    }//main

    public static String getData() {
        String score;
        Scanner scan = new Scanner(System.in); 
        System.out.print("enter score : ");
        score = scan.nextLine();
        return score;
    }
        
}
