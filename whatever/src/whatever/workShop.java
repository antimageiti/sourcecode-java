package whatever;

class Space3D
{
    private static final int Exponent_two = 2;
    double คำนวนระยะทาง(Point3D startPoint,Point3D endPoint)
    {
        double x= Math.pow((startPoint.x-endPoint.x),Exponent_two);
        double y= Math.pow((startPoint.y-endPoint.y),Exponent_two);
        double z= Math.pow((startPoint.z-endPoint.z),Exponent_two);
        double distance= Math.sqrt(x + y + z);
        return distance;
    }
}


class Point3D
{
    
    public Point3D(int x, int y, int z) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;
   }

public class workShop {

    public static void main(String[] args) {
       Space3D space3d = new Space3D();
       Point3D startpoint = new Point3D(2,1,3);
       Point3D endPoint = new Point3D(0,0,6);
       double distance = space3d.คำนวนระยะทาง(startpoint, endPoint);
       System.out.println(distance);
       
    }

}
