public class Geometry {     //Overload Methods
    
        
        public double areaRectangle(double length, double width) { 
            return length * width;
        }
    
        public double areaTriangle(double base, double height) {
            return 0.5 * base * height;
          
        }

        public double areaCircle(double radius) {
            return Math.PI * radius * radius; 
        }
    
        public static void main(String[] args) {
            Geometry geometry = new Geometry();
    
            double rectangleLength = 10.0;
            double rectangleWidth = 20.0;
            double triangleBase = 15.0;
            double triangleHeight = 17.0;
            double circleRadius = 7.0;

            double rectangleArea = geometry.areaRectangle(rectangleLength, rectangleWidth);
            System.out.println("Area of the rectangle with length: " + rectangleLength + " width: " + rectangleWidth + " is " +rectangleArea);
            
            double triangleArea = geometry.areaTriangle(triangleBase, triangleHeight);
            System.out.println("Area of the triangle with base: " + triangleBase + "and height: " + triangleHeight + " is " + triangleArea);

            double circleArea = geometry.areaCircle(circleRadius);
            System.out.println("Area of the circle with radius: " + circleRadius + " is " + circleArea);
        }
    }
    
    
         
        

