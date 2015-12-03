import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;	
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class DayDriver extends Application {
	/*
	*Remaining tasks: making selection choose between days first on String input, then 	*convert it to numerical input in the "Day" class using the method in Mr Tanes videos.
	*Recreate the setters and getters, polish the below code, work mainly upon the 	*"Day" class.
	*/
	public static void main(String[] args) {
	launch(args);
	}	
	@Override
	public void start(Stage primaryStage) {
	Text output1 = new Text("");
	Text output2 = new Text("");
	Text output3 = new Text("");
	Text output4 = new Text("");
	Label currentday = new Label("Input day");
	Label currentdayout = new Label("Current day");
	Label nextday = new Label("Next day");
	Label yesterday = new Label("Yesterday");
	Label randay = new Label("Random day");
	Label raday = new Label("Random day");
	TextField cday = new TextField();
	TextField rday = new TextField();
	Button calculate = new Button("Days");
	
	calculate.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent arg0) {
	int rinput;
	String input = cday.getText();
	String randomN =rday.getText();
	rinput = Integer.parseInt(randomN);
	Day day = new Day(input);
	
	output1.setText(day.getDay());
	output2.setText(day.nextDay());
	output3.setText(day.previousDay());
	output4.setText(day.calculateDay(rinput));
	System.out.println(day.getDay());
	System.out.println(day.nextDay());
	}
	});
	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(50);
	grid.setVgap(33);
	grid.add(currentday, 0, 0);
	grid.add(cday, 1, 0);
	grid.add(randay, 0, 1);
	grid.add(rday, 1, 1);
	grid.add(nextday, 0, 2);
	grid.add(output2, 1, 2);
	grid.add(yesterday, 0, 3);
	grid.add(output3, 1, 3);
	grid.add(currentdayout, 0, 4);
	grid.add(output1, 1, 4);
	grid.add(raday, 0, 5);
	grid.add(output4, 1, 5);
	grid.add(calculate, 2, 6);
	Scene scene = new Scene(grid, 500, 500);
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	}