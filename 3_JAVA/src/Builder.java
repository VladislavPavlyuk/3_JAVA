import java.time.LocalDate;

// Клас Builder, що наслідує Human
public class Builder extends Human {
    private String constructionSite;
    private String activity;

    public Builder(Human human, String constructionSite) {
        super(human.getName(), human.getDateOfBirth());
        this.constructionSite = constructionSite;
        this.activity = "constructing buildings";
    }

    public String getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(String constructionSite) {
        this.constructionSite = constructionSite;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Construction Site: " + constructionSite);
        super.activity();
        System.out.println(" and " + activity + ".");
    }
}


