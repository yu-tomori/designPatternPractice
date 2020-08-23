import game.Memento;
import game.Gamer;
import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args) {
        File file = new File("game.dat");

        Gamer gamer = new Gamer(100);
        Memento memento = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento)ois.readObject();
            gamer.restoreMemento(memento);
            ois.close();
        } catch (Exception e) {
        }
        memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (だいぶ増えたので、現在の状態を保存しておこう) ");
                try {
                    memento = (Memento)gamer.createMemento();
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
                    oos.writeObject(memento);
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (だいぶ減ったので、以前の状態に復帰しよう");
                try {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
                    memento = (Memento)ois.readObject();
                    gamer.restoreMemento(memento);
                    ois.close();
                } catch (Exception e) {
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}