/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Person;
import java.io.Serializable;	
import java.util.HashSet;
import java.util.List;
import javax.persistence.Column;	
import javax.persistence.Entity;	
//import com.mycompany.librarycatalogmanagementsystem.*;	
import java.util.Set;	
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Adrian Bailey
 */

@Entity
@Table(name="author")
public class Author extends Person{
  

    
    
    @Column(name="authorcode")
    private String authorcode;

    
    public Author( int id,String fname, String lname, String authorcode) {
        this.authorcode = authorcode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
    }
    
       public Author(String fname, String lname, String authorcode) {
        this.authorcode = authorcode;
        this.setFname(fname);
        this.setLname(lname);
       
       
    }
       
      
    

    public Author(int id,String authorcode)
    {  
     this.authorcode = authorcode;
     this.setId(id);
    }

    
      public Author( )
    {  

    }
   
       
   
      @OneToMany(mappedBy = "author")
      private List<Catalogrecord> catalogrecords;
      
  
   public List<Catalogrecord> getCatalogrecords() {
        return catalogrecords;
    }

    public String getAuthorcode() {
        return authorcode;
    }

    public void setAuthorcode(String authorcode) {
        this.authorcode = authorcode;
    }

    public void setCatalogrecords(List<Catalogrecord> catalogrecords) {
        this.catalogrecords = catalogrecords;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + "Author{authorcode=" + authorcode + '}';
    }
    
    
}
