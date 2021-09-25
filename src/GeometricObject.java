import java.util.Date;
public class GeometricObject {

    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;

    public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String newColor, boolean newFilled){
        dateCreated = new Date();
        this.color = newColor;
        this.filled = newFilled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean newFilled){
        this.filled = newFilled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
