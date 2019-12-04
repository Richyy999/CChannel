package application;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controlador {

	/**
	 * Panel de fondo
	 */
	@FXML
	private Pane pan;

	/**
	 * Cierra la aplicación
	 */
	@FXML
	public void cerrar() {
		System.exit(0);
	}

	/**
	 * Cierra la ventana actual
	 */
	@FXML
	public void cerrarVentana() {
		Stage stage = (Stage) pan.getScene().getWindow();
		stage.close();
	}

	/**
	 * Crea la segunda ventana
	 */
	@FXML
	public void crearVentana() {
		Stage primaryStage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista3.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			Scene scene = new Scene(pane, 1000, 750);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Cambia el color de forma aleatoria
	 */
	@FXML
	public void cambiarColor() {
		int color = (int) (Math.random() * 10);
		switch (color) {
		case 0:
			pan.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 1:
			pan.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 2:
			pan.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 3:
			pan.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 4:
			pan.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 5:
			pan.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 6:
			pan.setBackground(new Background(new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 7:
			pan.setBackground(new Background(new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 8:
			pan.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		case 9:
			pan.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
			break;
		default:
			break;
		}
	}
}
