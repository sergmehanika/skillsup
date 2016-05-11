package table;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by Администратор on 31.03.2016.
 */
@Entity
@Table(name = "Medicine")
public class Medicine {
    @Id
    @Column(name = "Medicine_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Medicine_name")
    private String name;

    @Column(name = "Medicine_discription")
    private String discription;

    @Column(name = "Medicine_isbn")
    private int isbn;

    public void setId(int id){
        this.id=id;
    }
    public void setName(String title){
        this.name=title;
    }
    public void setDiscription(String discription){
        this.discription=discription;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDiscription(){
        return discription;
    }
    public int getIsbn(){
        return isbn;
    }
    public String toString() {
        return " Medicine {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }


}
