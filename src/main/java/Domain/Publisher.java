/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;
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
    
    
     public Publisher(String fname, String lname, String publishercode) {
        this.publishercode = publishercode;
        this.setFname(fname);
        this.setLname(lname);
      //  this.setId(id);
       
    }

      @OneToMany(fetch = FetchType.LAZY,mappedBy = "publisher", cascade = CascadeType.ALL)
     private List<Catalogrecord> Catalogrecords;
     
      public Publisher()
    {
        
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
