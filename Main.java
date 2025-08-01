import java.util.Scanner;                                              import java.nio.file.*;
import java.io.IOException;
class Country{
    private String name;                                                   private String capital;
    private String continent;
    private int habitant;

    //constructor
        public Country(String name, String capital, String continent, int habitant){
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.habitant = habitant;
        }
        //methods of class
        public void InfoCountry(){
            String  reset,green, red, yellow, blue, colorstatus,msg;
            red = "\033[1;91m";
            green = "\033[1;92m";
            yellow = "\033[1;93m";
            blue = "\033[1;94m";
            reset = "\033[00m";
                System.out.printf("""
INFORMATION COUNTRY %s %s %s ...
Name : %s %s %s
Capital : %s %s %s
Habitant : %s %,d %s
Continent : %s %s %s
                """, yellow, this.name, reset, green, this.name, reset, green, this.capital, reset, green, this.habitant, reset, green, this.continent, reset);



        }
}
public class Main{
        public static void main(String[] args ){
            String red,  name, capital, habitant, continent, blue, reset, art;
        //colors ANSI
            blue = "\033[1;94m";
            reset = "\033[00m";
            red = "\033[1;91m";
        //loading art ASCII
        try{
        art = Files.readString(Path.of("art.txt"));
        System.out.printf("%s\n", art);}catch(Exception e){
                System.out.printf("%s Error : %s %\n", red, e.getMessage(), reset);
                System.exit(1);
        }

                Scanner stdin = new Scanner(System.in);
                System.out.printf("Country name : ");
                name = stdin.nextLine().strip();
                System.out.printf("Country capital %s%s%s : ",blue, name, reset);
                capital = stdin.nextLine().strip();
        System.out.printf("Country habitant  %s%s%s : ",blue, name, reset);
        habitant = stdin.nextLine().strip();
        System.out.printf("Country continent %s%s%s : ",blue, name, reset);
        continent = stdin.nextLine().strip();
        int habitantInt = 0;
        try{
                habitantInt = Integer.parseInt(habitant);

        }catch(NumberFormatException err){
                System.out.printf("%s %s %s \n",red, err.getMessage(), reset);
                System.exit(1);
        }
        Country country = new Country(name,capital, continent, habitantInt);
        country.InfoCountry();
        }
}