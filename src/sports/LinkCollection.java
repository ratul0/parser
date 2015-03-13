/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import testparser.Onepage;
import testparser.Testparser;

/**
 *
 * @author yousufkhan
 */
public class LinkCollection {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> dataLinks = new ArrayList<String>();
        String links;
        
        
        for(int i=1025;i<1040;i++){
            
            try {
                dataLinks = Onepage.getLinks("http://www.prothom-alo.com/sports", "" + i);
            } catch (Exception e) {
                System.out.println("terminate");
                break;
            }
            
            
            for(String link : dataLinks){
                
                System.out.println(link);
            
            }
            
        }
        

    }
    
}
