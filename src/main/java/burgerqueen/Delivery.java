package burgerqueen;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Delivery_table")
public class Delivery {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long orderId;
    private String branchLoc;
    private Long sauceId;
    private int qty;
    private String State="Preparing";

    @PostUpdate
    public void onPostUpdate(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }



    public Long getSauceId() {
        return sauceId;
    }

    public void setSauceId(Long sauceId) {
        this.sauceId = sauceId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getBranchLoc() {
        return branchLoc;
    }

    public void setBranchLoc(String branchLoc) {
        this.branchLoc = branchLoc;
    }

}
