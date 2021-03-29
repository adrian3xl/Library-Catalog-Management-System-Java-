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
    private Catalogrecord catalogrecord;	
    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;	
   
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;	

    
    public Catalogloanrecord(){	
    }
    
    
    public Catalogloanrecord( int id,Employee employee, Customer customer,Catalogrecord catalogrecord,Date recieveddate,Date loandate, String loancode      ){	
        this.id=id;
        this.catalogrecord=catalogrecord;
        this.customer=customer;
        this.loandate= loandate;
        this.recieveddate=recieveddate;
        this.loancode=loancode;
    
    }	
  
    public long getId() {
        return this.id;
    }
    
   
    public Customer getCustomer() {
        return this.customer;
    }
 

    public Employee getEmployee() {
        return this.employee;
    }

    
    public Catalogrecord getCatalogrecord() {
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

    public void setCatalogrecord(Catalogrecord catalogrecord) {
        this.catalogrecord = catalogrecord;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
     
    
}