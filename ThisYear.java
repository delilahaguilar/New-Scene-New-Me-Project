import org.code.theater.*;
import org.code.media.*;
import java.util.Arrays; // needed for copyOfRange

public class ThisYear extends Scene {

  // Variables (instance & static)
 private String[] pictures;
  private String[] captions = {
    "Travels", 
    "Matcha dates",
    "Sports",
    "More friends",
    "concerts"

  };
  // Constuctor
 public ThisYear() {
    pictures = FileReader.toStringArray("pictures2.txt");
  }

  public ThisYear(String[] pictures) {
    this.pictures = pictures;
  }
  /**
   * Top level drawScene method
   */
  public void drawScene() {
    
drawTitleScreen();
  pause(2.0);
  drawImagesWithCaptions();
  }
  // creates title screen 
  public void setTitleScreenStyle() {
  setTextHeight(40);
  setTextColor("pink");
  setTextStyle(Font.SERIF, FontStyle.ITALIC);
}
//creates color and font
public void setCaptionStyle() {
  setTextHeight(30);
  setTextColor("White");
  setTextStyle(Font.SERIF, FontStyle.BOLD);
}
  //displays captions
 public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("Goals", 100, 175);
    drawText("for", 140, 225);
    drawText("My 2026", 100, 275);
  }
  // creates all images with captions at the bottom
    public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int index = 0; index < pictures.length; index++) {
      drawImage(pictures[index], 0, 0, 400, 400, 0.0);
      drawText(captions[index], 50, 350);
      pause(2.0);
    }
  }
  // other methods
 
}