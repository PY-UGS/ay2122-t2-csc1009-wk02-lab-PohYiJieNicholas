public class Circle {
    double radius;   
       
    Circle() {   
        radius = 1;   
    }   
       
    Circle(double newRadius) {   
        radius = newRadius;   
    }   
       
    double getArea() {   
        return radius * radius * 3.14159;   
    }   
       
    void setRadius(double newRadius) {   
        radius = newRadius;   
    }
}
