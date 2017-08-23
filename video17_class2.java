public class video17_class2{
    private String girlName;
    public video17_class2(String name) {
        girlName = name;
    }
    
    public void setName (String name) {
        girlName = name;
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first gf was %s\n", getName());
    }
}