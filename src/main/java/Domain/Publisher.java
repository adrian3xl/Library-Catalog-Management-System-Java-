/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Person;
import java.io.Serializable;	
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
@Table(name="publisher")
public class Publisher extends Person{
 

    
    @Column(name="publishercode")
    private String publishercode;
    
      private int id;
    

    public Publisher(int id, String fname, String lname, String publishercode) {
        this.publishercode = publishercode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
    }

        
     @OneToMany(fetch = FetchType.LAZY,mappedBy = "publisher", cascade = CascadeType.ALL)
    private List<Catalogrecord> Catalogrecords;
    
   public Publisher()
    {
        
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void getId(int id) {
        this.id = id;
    }


    public void setPublishercode(String publishercode) {
        this.publishercode = publishercode;
    }

    public String getPublishercode() {
        return publishercode;
    }
    
  public void setCatalogrecords(List<Catalogrecord> Catalogrecords) {
        this.Catalogrecords = Catalogrecords;
    }

  
    
    @Override
    public String toString() {
        return "{" + super.toString() + "Publisher{publishercode=" + publishercode + '}';
    }
    
    
}
