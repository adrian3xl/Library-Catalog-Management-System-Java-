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
@Table(name="genre")	

public class Genre implements Serializable {	

     @Id	
    @Column(name="name")	
    private String name;	
    @Column(name = "id")
    private int id;
  
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "genre", cascade = CascadeType.ALL)
    private List<Catalogrecord> Catalogrecords;
   
    public Genre( int id,String name) {	
        this.name=name;	
         this.setId(id);


    }	

    
    public List<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    
    
    
    public Genre(){	
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
        return "Genre{" + "name=" + name + '}';	
    }	



}