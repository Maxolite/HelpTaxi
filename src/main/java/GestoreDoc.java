package alfa.ff.rrunner.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author federico
 * @since 20150622
 */
@Named("gestoreDoc")
@SessionScoped
public class GestoreDoc implements Serializable {
    
    public String getString(String doc){
        String ris="";
        File docFile=new File(doc);
        
        try {
            ris = new Scanner(docFile).useDelimiter("\\Z").next();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        }
        
        return ris;
    }
    
    public String getManualeCorrente(){
        //PaginaWeb paginaCorrente=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        //String LinkPaginaCorrente=paginaCorrente.getLink();
        
        //String paginaHelp=calcolaPaginaHelp("");
        
        String paginaHelp="C:\\Projects\\HelpTaxi\\src\\main\\webapp\\home.html";
        
        return getString(paginaHelp);
    }
    
    private String calcolaPaginaHelp(String linkPagina){
        return ""; // XXXXXXXXX
    }
}
