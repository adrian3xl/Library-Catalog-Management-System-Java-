/*	
 * To change this license header, choose License Headers in Project Properties.	
 * To change this template file, choose Tools | Templates	
 * and open the template in the editor.	
 */	
package Domain;	
import java.io.Serializable;	
import javax.persistence.Column;	
import javax.persistence.Entity;	
import javax.persistence.Table;	
import java.util.Date;		
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**	
 *	
 * @author Adrian	
 */	

@Entity	
@Table(name="catalogrecord")	
public class Catalogrecord implements Serializable {	


    @Id	
    @Column(name="title")
     private String title;
     @Column(name="id")
    private int id;
    
     @OneToMany(mappedBy = "catalogrecord")
    private List<Catalogloanrecord> Catalogloanrecords; 
    
    
   	
    
    @Column(name="datereleased")	
    private Date datereleased;	
    
    @Column(name="conditionstatement")	
    private String conditionstatement;	
    
    @Column(name="catalogcode")	
    private String catalogcode;	

    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id" )
     private Genre genre;
     
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documenttype_id" ) 
    private Documenttype documenttype;
    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id" )
     private Author author;
     
    @ManyToOne(fetch = FetchType.LAZY)
     private Publisher publisher;
    
     
   

    public List<Catalogloanrecord> getCatalogloanrecords() {
        return Catalogloanrecords;
    }
    
    public Catalogrecord(){	
    }	

public Catalogrecord(String title, Date datereleased,String conditionstatement,String catalogcode,Genre genre,Documenttype documenttype,Author author,Publisher publisher){
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.genre=genre;
    this.documenttype=documenttype;
    this.datereleased=datereleased;
    this.conditionstatement=conditionstatement;

    }

 
    public long getId() {
        return this.id;
    }
    
   
    public Author getAuthor() {
        return this.author;
    }
 
  
    public Genre getGenre() {
        return this.genre;
    }

    
    public Publisher getPublisher() {
        return this.publisher;
    }
    
    
    public Documenttype getDocumenttype() {
        return this.documenttype;
    }
    
    public  String getTitle() {	
        return title;	
    }	
    
    public  Date getDatereleased() {	
        return datereleased;	
    }	
    
     public  String getConditionstatement() {	
        return conditionstatement;	
    }	

    public String getCatalogcode() {
        return catalogcode;
    }
    
     
   public void setTitle(String title) {	
        this.title = title;	
    }	 
       
         public void setDatereleased(Date datereleased) {	
        this.datereleased = datereleased;	
    }	 
      
     public void setConditionstatement(String conditionstatement) {	
        this.conditionstatement = conditionstatement;	
    }	 
       
     public void setId(int id) {
        this.id = id;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDocumenttype(Documenttype documenttype) {
        this.documenttype = documenttype;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
     
}