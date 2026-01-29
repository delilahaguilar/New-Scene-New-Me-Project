import org.code.theater.*;
import org.code.media.*;
import java.util.Arrays; 
public class LastYear extends Scene {

  // Variables (instance & static)
private String[] pictures;
  private String[] captions = {
    "Friends", 
    "Phoebe Cilantro",
    "Summer",
    "Concerts",
  };
  // Constuctor
  public LastYear() {
    pictures = FileReader.toStringArray("pictures.txt");
  }
public LastYear(String[]pictures){
  this.pictures = pictures;
}
  /**
   * Top level drawScene method
   */
  public void drawScene() {
   
    drawTitleScreen();
    pause(2.0);
    drawImagesWithCaptions();
    drawEndScreen();

  }
  //creates title captions
 public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("Pictures", 100, 175);
    drawText("Of", 140, 225);
    drawText("My 2025", 100, 275);
  }
  // creates the image including captions
 public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int index = 0; index < pictures.length; index++) {
      drawImage(pictures[index], 0, 0, 400, 400, 0.0);
      drawText(captions[index], 50, 350);
      pause(2.0);
    }
  }
  //end svreen 
  public void drawEndScreen() {
    setEndScreenStyle();
    clear("White");
    drawText("2026->", 160, 175);
  }
// sets end color 
 public void setTitleScreenStyle() {
    setTextHeight(40);
    setTextColor("pink");
    setTextStyle(Font.SERIF, FontStyle.ITALIC);
  }
  //sets color for captions on each slide
 public void setCaptionStyle() {
    setTextHeight(30);
    setTextColor("White");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }
  //end screen color
public void setEndScreenStyle() {
    setTextHeight(60);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
  }
  // other methods


}