/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
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
 * @author Adrian
 */

@Entity	
@Table(name="documenttype")
public class Documenttype implements Serializable {
  
      @Id	
    @Column(name="id")
       private int id;
      @Column(name="name")
    private String name;	

     
      @OneToMany(fetch = FetchType.LAZY,mappedBy = "documenttype", cascade = CascadeType.ALL)
      private List<Catalogrecord> Catalogrecords;
      
    public Documenttype( int id,String name) {	
        this.id=id;
        this.name=name;
  
    }	

  
 

   
    public List<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    

    public Documenttype(){	
    }	

      public int getId() {
        return id;
    }
    public void setName(String name) {	
        this.name = name;	
    }	

    public String getName() {	
        return name;	
    }	

    public void setId(int id) {
        this.id = id;
    }
    
    

   @Override	
    public String toString() {	
        return "Documenttype{" + "name=" + name + '}';	
    }	
}