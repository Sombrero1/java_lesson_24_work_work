import java.util.StringTokenizer;

public class Adress {
   private String country;
   private String region;
   private String city;
   private String street;
   private String house;
   private String numberOfHouse;
   private String numberOfPair;
   private String numberOfFlat;

   public void setSplit(String adress){

       String [] data=adress.split(",");
       for (int i = 0; i < data.length; i++) {
           data[i]=data[i].replace(" ","");

       }


       country=data[0];
       region=data[1];
       city=data[2];
       street=data[3];
       house=data[4];
       numberOfHouse=data[5];
       numberOfPair=data[6];
       numberOfFlat=data[7];
   }
   public void setTokenizer(String adress){
       StringTokenizer reg=new StringTokenizer(adress," ,;.");
       country=reg.nextToken();
       region=reg.nextToken();
       city=reg.nextToken();
       street=reg.nextToken();
       house=reg.nextToken();
       numberOfHouse=reg.nextToken();
       numberOfPair=reg.nextToken();
       numberOfFlat=reg.nextToken();
   }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", numberOfHouse='" + numberOfHouse + '\'' +
                ", numberOfPair='" + numberOfPair + '\'' +
                ", numberOfFlat='" + numberOfFlat + '\'' +
                '}';
    }
}
