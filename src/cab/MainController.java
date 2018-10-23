package cab;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class MainController {
    public Spinner<Integer> n1;
    public Spinner<Integer> n2;
    public Spinner<Integer> n3;
    public Spinner<Integer> n4;
    public TableView<Turn> turns;
    private int turnNr;
    public void initialize() {
        System.out.println("Hello");
    }
    public void  go() {
        turnNr++;
        int nn1 = n1.getValue();
        int nn2 = n2.getValue();
        int nn3 = n3.getValue();
        int nn4 = n4.getValue();
       // System.out.println(""+nn1+nn2+nn3+nn4);
        Turn turn = new Turn();
        turn.setGuess(""+nn1+nn2+nn3+nn4);
        turn.setTurnNr(turnNr);
        turn.setBulls(9);
        turns.getItems().add(turn);

    }
}
