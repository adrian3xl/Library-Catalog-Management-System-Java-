/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Adrian
 */

@Entity
@Table(name="publisher")
public class Publisher extends Person {
    
    
    private String publishercode;
    
    
     public Publisher(int id,String fname, String lname, String publishercode) {
        this.publishercode = publishercode;
        this.setFname(fname);
        this.setLname(lname);
        this.setId(id);
       
    }

      @OneToMany(fetch = FetchType.LAZY,mappedBy = "publisher", cascade = CascadeType.ALL)
     private Set<Catalogrecord> catalogrecords;
   
      
      
public Publisher(int id, String publishercode)
    {
       this.publishercode = publishercode;
        this.setId(id);
    }

public Publisher(String fname, String lname, String publishercode)
    {
       this.publishercode = publishercode;
        this.setFname(fname);
      this.setLname(lname);
    }
      public Publisher()
    {
        
    }

     public void setPublishercode(String publishercode) {
        this.publishercode = publishercode;
    }

    public String getPublishercode() {
        return publishercode;
    }
    
  public void setCatalogrecords(Set<Catalogrecord> Catalogrecords) {
        this.catalogrecords = Catalogrecords;
    }
  
   @Override
    public String toString() {
        return "{" + super.toString() + "Publisher{publishercode=" + publishercode + '}';
    }  
     
}
