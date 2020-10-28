package burgerqueen;

public class Delivered extends AbstractEvent {

    private Long id;

    public Delivered(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
