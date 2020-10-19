public class Telephone {

    public static String toFormat(String number){
        String res[]=new String[4];
        if(number.substring(0,1).equals("+")){
            //+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
            res[0]=number.substring(0,2);
            res[1]=number.substring(2,5);
            res[2]=number.substring(5,8);
            res[3]=number.substring(8,12);


        }
        else{
            res[0]="+"+Integer.toString(Integer.parseInt(number.substring(0,1))-1);
            res[1]=number.substring(1,4);
            res[2]=number.substring(4,7);
            res[3]=number.substring(7,11);

        }
        return res[0] + " "+res[1] + " "+res[2] +" "+res[3];
    }
}
