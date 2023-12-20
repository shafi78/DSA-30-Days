public class S_07_Interfaces {
    public static void main(String args[]) {
        // Queen q1 = new Queen();
        // q1.moves();

        Bear b1 = new Bear();
        b1.eat();
    }
}

// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down ,left ,right , diagonal (in all directions)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down ,left ,right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("Up, down ,left ,right and diagonal (by 1 step)");
//     }
// }



interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements Herbivore,Carnivore {
    public void eat(){
        System.out.println("Eats meat");
    }
}