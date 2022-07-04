package lockedme;

import java.math.BigDecimal;
import java.util.Scanner;
class catagories{
        String catagory2;
        String catagory3;
        String catagory4;
        String catagory5;
        String catagory6;
    public String getCatagory2() {
        return catagory2;
    }

    public void setCatagory2(String catagory2) {
        this.catagory2 = catagory2;
    }

    public String getCatagory3() {
        return catagory3;
    }

    public void setCatagory3(String catagory3) {
        this.catagory3 = catagory3;
    }

    public String getCatagory4() {
        return catagory4;
    }

    public void setCatagory4(String catagory4) {
        this.catagory4 = catagory4;
    }

    public String getCatagory5() {
        return catagory5;
    }

    public void setCatagory5(String catagory5) {
        this.catagory5 = catagory5;
    }

    public String getCatagory6() {
        return catagory6;
    }

    public void setCatagory6(String catagory6) {
        this.catagory6 = catagory6;
    }
}
    public class com {
        public static void main(String[] args) {
            Scanner gc=new Scanner(System.in);

            BigDecimal o = BigDecimal.valueOf(0);
            System.out.println("Sign Up or Sign In");
            Scanner uc = new Scanner(System.in);
            String y = uc.nextLine();

            System.out.println("Login");
            Scanner lb = new Scanner(System.in);
            String p = uc.nextLine();

            System.out.print("Mobile Number");
            Scanner zc = new Scanner(System.in);
            o = zc.nextBigDecimal();

            System.out.println("password");
            Scanner jc = new Scanner(System.in);
            String q = jc.nextLine();


            System.out.println("Welcome to lockedme");
            catagories c1 = new catagories();
            c1.setCatagory2("men");
            c1.setCatagory3("women");
            c1.setCatagory4("kids");
            c1.setCatagory5("brand");
            c1.setCatagory6("sports");
            System.out.println(c1.getCatagory2());
            System.out.println(c1.getCatagory3());
            System.out.println(c1.getCatagory4());
            System.out.println(c1.getCatagory5());
            System.out.println(c1.getCatagory6());
            int a =0;
            if(a==0){
                System.out.println("click");
            }
            else{
                System.out.println("go back");
            }

            int ch;
            ch= Integer.parseInt(gc.nextLine());
            switch (ch) {
                case 1:
                    getmen();
                    break;
                case 2:
                    getwomen();
                    break;
                case 3:
                    getkid();
                    break;
            }

        }
        public static void getmen() {
            System.out.println("men");
            System.out.println("footwear");
            System.out.println("clothing");
            System.out.println("accessories");
            System.out.println("sports");
        }
        public static void getwomen() {
            System.out.println("women");
            System.out.println("footwear");
            System.out.println("clothing");
            System.out.println("accessories");
            System.out.println("sports");
        }
        public static void getkid() {
            System.out.println("kid");
            System.out.println("footwear");
            System.out.println("clothing");
            System.out.println("accessories");
            System.out.println("sports");


        }

            }

