package notes;

public class Point3D extends Point2D 
{
     private float z = 0.0f;
	
    
     public Point3D()
     {
    	 this.z = 0.0f;
     }
     public Point3D(float x, float y,float z)
     {
    	 this.x = x;
    	 this.y = y;
    	 this.z = z;
     }
     public float getZ()
     {
    	 return this.z;
     }
     public float[] getXYZ()
     {
    	 float[] arr1 = new float[3];
    	 arr1[0] = this.x;
    	 arr1[1] = this.y;
    	 arr1[2] = this.z;
    	 return arr1;
     }
     public String toString()
     {
    	 return "("+super.toString()+","+z+")";
     }
}
