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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="title")
     private String title;

    @Column(name="datereleased")	
    private Date datereleased;	
    
    @Column(name="conditionstatement")	
    private String conditionstatement;	
    
    @Column(name="catalogcode")	
    private String catalogcode;	

    
     @OneToMany(cascade = CascadeType.ALL)
    private Set<Catalogloanrecord> catalogloanrecords = new HashSet();
    

    
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "genre_id", referencedColumnName = "id")
     private Genre genre;
     
     
    @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "documenttype_id", referencedColumnName = "id")
    private Documenttype documenttype;
    
     @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "author_id", referencedColumnName = "id")
     private Author author;
     
    @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "publisher_id", referencedColumnName = "id")
     private Publisher publisher;
    
   
    public Set<Catalogloanrecord> getCatalogloanrecords() {
        return catalogloanrecords;
    }

   
    public Catalogrecord(){	
    }	
    
    
   

public Catalogrecord(Integer id,String title, Date datereleased,String conditionstatement,String catalogcode,Genre genre,Documenttype documenttype,Author author,Publisher publisher){
   this.id=id;
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.genre=genre;
    this.documenttype=documenttype;
    this.datereleased=datereleased;
    this.conditionstatement=conditionstatement;
    this.catalogcode=catalogcode;

    }



public Catalogrecord(String title, Date datereleased,String conditionstatement,String catalogcode,Genre genre,Documenttype documenttype,Author author,Publisher publisher){
  this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.genre=genre;
    this.documenttype=documenttype;
    this.datereleased=datereleased;
    this.conditionstatement=conditionstatement;
    this.catalogcode=catalogcode;

    }
public Catalogrecord(String title, Date datereleased,String conditionstatement,String catalogcode){
  this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.genre=genre;
    this.documenttype=documenttype;
    this.datereleased=datereleased;
    this.conditionstatement=conditionstatement;
    this.catalogcode=catalogcode;

    }
 public Catalogrecord(int id,String title){	
         this.id=id;
    this.title=title;
        
    }	
 
    public Integer getId() {
        return this.id;
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

    public Genre getGenre() {
        return genre;
    }

    public Documenttype getDocumenttype() {
        return documenttype;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setCatalogloanrecords(Set<Catalogloanrecord> catalogloanrecords) {
        this.catalogloanrecords = catalogloanrecords;
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


     
}