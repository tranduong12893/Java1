package Java117;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.z = z;
    }

    public float[] getXYZ(){
        float[] pointXYZ = new float[3];
        pointXYZ[2]= this.z;
        return pointXYZ;
    }

    @Override
    public String toString() {
        return "Point3D[x="+super.getX()+",y="+super.getY()+",z="+this.z+"]";
    }
}
