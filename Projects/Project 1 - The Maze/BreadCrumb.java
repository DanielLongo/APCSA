public class BreadCrumb
{
    private int PositionX;
    private int PositionY;
    private int orientation;
    private int printOrientation;
    public void BreadCrumbOject() {
        PositionX = 0;
        PositionY = 0;
        orientation = 90; //starts facing right
    }
    
    public void crumbLeft() {
        System.out.println("Old L" + getOrientation());
        orientation -= 90;
        System.out.println("Crumb left: " + getOrientation());  
        System.out.println(getOrientation());
    }
    
    public void crumbRight() {
        System.out.println("Old R" + getOrientation());
        orientation += 90;
        System.out.println("Crumb Right: " + getOrientation());  
        System.out.println(getOrientation());
    }
    
    public int getOrientation() {
        if (orientation < 0) printOrientation = (orientation % 360) + 360;
        else printOrientation = orientation % 360;
        //System.out.println(printOrientation);
        return printOrientation;
    }
    
    
    
    
    
}
