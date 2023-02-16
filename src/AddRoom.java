public class AddRoom {
    private String id;
    private String type;
    private String bed;
    private String bath;

    public AddRoom(String id, String type, String bed, String bath) {
        this.id = id;
        this.type = type;
        this.bed=bed;
        this.bath=bath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }
}
