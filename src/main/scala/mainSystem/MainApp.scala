package MainSystem

import Controllers._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.Includes._
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import javafx.{scene => jfxs}
import scalafx.stage.{Modality, Stage}
import java.net.{ServerSocket, Socket, InetAddress}





object MainApp extends JFXApp {


 
  val rootResource = getClass.getResource("/Views/MainPage.fxml")
  val loader = new FXMLLoader(rootResource, NoDependencyResolver)
  loader.load();
  val roots = loader.getRoot[jfxs.layout.VBox]
  
  stage = new PrimaryStage {
    title = "Client"
    scene = new Scene {
      root = roots
    }
  }
  stage.setResizable(false);

}