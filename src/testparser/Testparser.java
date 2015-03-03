/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testparser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author yousufkhan
 */
public class Testparser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> dataLinks = new ArrayList<String>();
        for(int i=1;i<2;i++){
            dataLinks.addAll(Onepage.getLinks("http://www.prothom-alo.com/bangladesh", ""+i));
        }
        for(String link : dataLinks){
            System.out.println(Onepage.getArticle(link));
        }
        
        
        
        
        

        
    }
    
}
