public class Person {
    private String name="";
    private String surname;
    private String middleName="";

    public Person(String surname){
        this.surname=surname;

    }

    public Person(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public String getFCs(){
        String res=surname;
        if(name!="") res+=(" "+name.substring(0,1) +".");
        if(middleName!="") res+=(" "+middleName.substring(0,1) +".");
        return res;
    }

}
