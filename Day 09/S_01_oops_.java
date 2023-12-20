
public class S_01_oops_ {
        public static void main(String args[]) {
            Pen p1 = new Pen();
            p1.setColor("Blue");
            System.out.println(p1.getColor());

            p1.setTip(5);
            System.out.println(p1.getTip());

            p1.setColor("Yellow");
            System.out.println(p1.getColor());


            bankAccount b1 = new bankAccount();
            b1.userName = "shafi";
            // b1.password = "12345678" ;       //throw error
            b1.setPassword("abcdefgh");
        }
}


// class Pen {
//     String color ;
//     int tip ;

//     void setColor(String newColor) {
//         color = newColor ;
//     }

//     void setTip(int newTip) {
//         tip = newTip ;
//     }
// }


class Pen {
    private String color ;
    private int tip ;

    // getters
    
    String getColor() {
        return this.color ;
    }

    int getTip() {
        return this.tip ;
    }

    void setColor(String newColor) {
        color = newColor ;
    }

    void setTip(int newTip) {
        tip = newTip ;
    }
}


class student {
    String name ;
    int age ;
    float percentage ;

    void calcPercentage(int phy,int che,int math) {
        percentage = (phy+che+math)/2 ;
    }
}


// Access modifiers

class bankAccount {
    public String userName ;
    private String password ;

    public void setPassword(String pwd) {
        password = pwd ;
    }
}