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
@Table(name="catalogloanrecord")
public class Catalogloanrecord implements Serializable{	

     @Id	
    @Column(name="loancode")
     private String loancode;
     
      @Column(name="id")
     private int id;
     
      @Column(name="loandate") 
     private Date loandate;
    
      @Column(name="recieveddate") 
    private Date recieveddate;
    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogrecord_id",nullable = false)
    private int catalogrecord;	
    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private int customer;	
   
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",nullable = false)
    private int employee;	

    
    public Catalogloanrecord(){	
    }
    
    
    public Catalogloanrecord( int id,int customer,int catalogrecord,Date recieveddate,Date loandate, String loancode,int employee    ){	
        this.id=id;
        this.catalogrecord=catalogrecord;
        this.customer=customer;
        this.loandate= loandate;
        this.recieveddate=recieveddate;
        this.loancode=loancode;
    
    }	
  
    
       public Catalogloanrecord(int customer,int catalogrecord,Date recieveddate,Date loandate, String loancode,int employee    ){	
        
        this.catalogrecord=catalogrecord;
        this.customer=customer;
        this.loandate= loandate;
        this.recieveddate=recieveddate;
        this.loancode=loancode;
    
    }
    
    
    public int getId() {
        return this.id;
    }
    
   
    public int getCustomer() {
        return this.customer;
    }
 

    public int getEmployee() {
        return this.employee;
    }

    
    public int getCatalogrecord() {
        return catalogrecord;
    }

    public String getLoancode() {
        return loancode;
    }

    public Date getLoandate() {
        return loandate;
    }

    public Date getRecieveddate() {
        return recieveddate;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode;
    }

    public void setLoandate(Date loandate) {
        this.loandate = loandate;
    }

    public void setRecieveddate(Date recieveddate) {
        this.recieveddate = recieveddate;
    }
  
     public void setId(int id) {
        this.id = id;
    }

    public void setCatalogrecord(int catalogrecord) {
        this.catalogrecord = catalogrecord;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
    
     
    
}