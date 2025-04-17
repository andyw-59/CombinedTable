public class SingleTable { 
private int seats;
private int height;
private double quality;

public SingleTable(int seat1, double quality1, int height1) {
    seats = seat1;
    height = height1;
    quality = quality1;
}
public int getNumSeats() { 
    return seats;
}  
 
public int getHeight() {
    return height;
}  
 
public double getViewQuality() { 
    return quality;
}  
 
public void setViewQuality(double value) { 
    quality = value;
}  
 
} 
