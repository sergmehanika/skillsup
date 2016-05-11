package table;

import javax.persistence.*;

/**
 * Created by Администратор on 31.03.2016.
 */
@Entity
@Table(name = "Drugstore")
public class Drugstore {
    @Id
    @Column(name = "Drugstore_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Drugstore_name")
    private String name;
    @Column(name = "adress")
    private String address;
    @Column(name="tel")
    private String tel;

    public void setId(int id){this.id=id;    }
    public void setName(String name) {this.name=name;}
    public void setAddress(String address){
        this.address=address;
    }
    public void setTel(String tel){
        this.tel=tel;
    }

    public int getId(){ return id;}
    public String getAddress(){
        return address;
    }
    public String getName(){
        return name;
    }
    public String getTel(){return tel;}
}
