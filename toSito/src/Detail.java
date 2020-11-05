
public class Detail{

    private int id;
    private String nameOfDetail;
    private String material;
    private String purpose;
    private int amount;

    public Detail(int id, String nameOfDetail, String material, String purpose, int amount) {
        this.id = id;
        this.nameOfDetail = nameOfDetail;
        this.material = material;
        this.purpose = purpose;
        this.amount = amount;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNameOfDetail(String nameOfDetail) {
        this.nameOfDetail = nameOfDetail;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNameOfDetail() {
        return nameOfDetail;
    }

    public String getMaterial() {
        return material;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nameOfDetail + " "
                + material + " "
                + purpose + " "
                + amount + "\n";
    }

}
