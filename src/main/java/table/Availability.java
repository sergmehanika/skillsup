package table;

import javax.persistence.*;

/**
 * Created by Администратор on 31.03.2016.
 */
@Entity
@Table(name = "Availability")
public class Availability {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int medisine_id;

    @Column
    private int drugstore_id;

    @Column
    private int quantity;

    @Column
    private Double price;

    public void setId(int id){this.id=id; }
    public void setMedisine_id(int medisine_id){this.medisine_id=medisine_id;}
    public void setDrugstore_id(int drugstore_id){ this.drugstore_id=drugstore_id;    }
    public void setQuantity (int quantity) {this.quantity=quantity;}
    public void setPrice (Double price){this.price=price;}

    public int getId(){ return id;}
    public int getMedisine_id(){return medisine_id;}
    public int getDrugstore_id(){return drugstore_id;}
    public int getQuantity() {return quantity;}
    public Double getPrice(){return price;}
}
