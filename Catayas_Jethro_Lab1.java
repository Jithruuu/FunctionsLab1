/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JethroooyFunctionLab;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;

public class JethroooyFunctionLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double k = 0;
        String[] geometry = {
            "Area of circle",
            "Area of rectangle",
            "Area of triangle",
            "Volume of sphere ",
            "Volume of cylinder",
            "CalculateCircleSegmentArea",
            "SphereSurfaceArea",
            "TriangleSide"
        };
        double select = JOptionPane.showOptionDialog(
                null,
                "Please select an option:\n"
                + "Area of circle,\n"
                + "Area of rectangle,\n"
                + "Area of triangle, \n"
                + "Volume of sphere, \n"
                + "Volume of cylinder, \n"
                + "CalculateCircleSegmentArea,\n"
                + "SphereSurfaceArea,"
                + "TriangleSide",
                "Choice Dialog",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                geometry,
                geometry[0]
        );
        if (select == 0) {
            JOptionPane.showMessageDialog(null, "Circle Area: " + calculateCircleArea(geometry));
        } else if (select == 1) {
            JOptionPane.showMessageDialog(null, "Rectangle Area: " + calculateRectangleArea(geometry));
        } else if (select == 2) {
            JOptionPane.showMessageDialog(null, "Triangle Area: " + calculateTriangleArea(geometry));
        } else if (select == 3) {
            JOptionPane.showMessageDialog(null, "Sphere Volume: " + calculateSphereVolume(geometry));
        } else if (select == 4) {
            JOptionPane.showMessageDialog(null, "Cylinder Volume: " + calculateCylinderVolume(geometry));
        } else if (select == 5) {
            JOptionPane.showMessageDialog(null, "Circle Segment Area: " + calculateCircleSegmentArea(geometry));
        } else if (select == 6) {
            JOptionPane.showMessageDialog(null, "Sphere Surface Area: " + calculateSphereSurfaceArea(geometry));
        } else if (select == 7) {
            JOptionPane.showMessageDialog(null, "The value of the 3rd side is: " + calculateTriangleSide(geometry));
        }
    }

    public static double calculateCircleArea(String geometry[]) {

        double radius = Double.parseDouble(JOptionPane.showInputDialog("ENTER RADIUS:"));
        double pie = Math.PI;
        double exponent = 2;
        double cal = pie * Math.pow(radius, exponent);
        return cal;
    }

    public static double calculateCircleSegmentArea(String geometry[]) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("ENTER RADIUS:"));
        double over = 2;
        double degrees = Double.parseDouble(JOptionPane.showInputDialog("ENTER DEGREES:"));
        double radians = degrees * (Math.PI / 180);
        double exponent = 2;
        double ex = Math.pow(radius, exponent);
        double v = ex / over;
        double yu = radians - Math.sin(radians);
        double b = v * yu;
        return b;
    }

    public static double calculateSphereVolume(String geometry[]) {
        double pie = Math.PI;
        double no = 4;
        double nu = 3;
        double rad = Double.parseDouble(JOptionPane.showInputDialog("ENTER RADIUS:"));
        double exponent = 3;
        double ex = Math.pow(rad, exponent);
        double n = (no / nu) * pie * ex;
        return n;
    }

    public static double calculateSphereSurfaceArea(String geometry[]) {
        double rad = Double.parseDouble(JOptionPane.showInputDialog("ENTER RADIUS:"));
        double pie = Math.PI;
        double nu = 4;
        double exponent = 2;
        double ex = Math.pow(rad, exponent);
        double p = nu * pie * ex;
        return p;
    }

    public static double calculateTriangleSide(String geometry[]) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF A :"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF B :"));
        double degrees = Double.parseDouble(JOptionPane.showInputDialog("ENTER DEGREES:"));
        double radians = degrees * (Math.PI / 180);
        double exponent = 2;
        double exp = 0.5;
        double ex = Math.pow(a, exponent);
        double x = Math.pow(b, exponent);
        double l = ex + x - 2 * a * b * Math.cos(radians);
        double m = Math.pow(l, exp);
        return m;
    }

    public static double calculateRectangleArea(String geometry[]) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF length :"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF width :"));
        double mn = length * width;
        return mn;
    }

    public static double calculateTriangleArea(String geometry[]) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF base :"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF height:"));
        double k = 0.5 * base * height;
        return k;
    }

    public static double calculateCylinderVolume(String geometry[]) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF height:"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("ENTER VALUE OF radius:"));
        double expp = 2;
        double m = Math.pow(r, expp);
        double p = Math.PI;
        double o = p * m * height;
        return o;
    }
}
