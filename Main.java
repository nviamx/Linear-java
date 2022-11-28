public class Main {

    public static void main(String[] args) {
//        Date d1= new Date(1,1,2003);
//        Person p1=new Person("William", d1);
// Bmi be = new Bmi(19,41, 164);
//         p1=new Person("William", d1, be);
//        System.out.println(p1);

        Linear line1 = new Linear(0,0);
        Linear line2 = new Linear(7, 0);
        Linear line3 = new Linear(-10.8, 0);
        Linear line4 = new Linear(0,6);
        Linear line5 = new Linear(0, -14.4);
        Linear line6 = new Linear(5, -4.5);
        Linear line7 = new Linear(6.5, 1);

        // test 1 check the copy constructor
        System.out.print("Test 1: ");
        if (line1.getA() == new Linear(line1).getA() && line1.getB() == new Linear(line1).getB())
            System.out.println("Passed!");
        else
            System.out.println("Failed copy constructor");

        // test 2 check all the prints
        System.out.print("Test 2: ");
        if (line1.toString().equals("y=0"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y= 0\"");

        System.out.print("Test 3: ");
        if (line2.toString().equals("y= 7.0x"))
            System.out.println("Passed!");
        else{
            System.out.println("Failed! expected \"y= 7.0x\"");
            System.out.println("You got: " + line2.toString());
        }

        System.out.print("Test 4: ");
        if (line3.toString().equals("y= -10.8x"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y = -10.8x\"");

        System.out.print("Test 5: ");
        if (line4.toString().equals("y= 6.0"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y = 6.0\"");

        System.out.print("Test 6: ");
        if (line5.toString().equals("y= -14.4"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y = -14.4\"");

        System.out.print("Test 7: ");
        if (line6.toString().equals("y= 5.0x -4.5"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y = 5.0x -4.5\"");

        System.out.print("Test 8: ");
        if (line7.toString().equals("y= 6.5x + 1.0"))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected \"y= 6.5x +1.0\"");


        // check assign method
        System.out.print("Test 9: ");
        if (line1.assign(1) == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0);

        System.out.print("Test 10: ");
        if (line2.assign(0) == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0);

        System.out.print("Test 11: ");
        if (line3.assign(-1) == 10.8)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 10.8);

        System.out.print("Test 12: ");
        if (line4.assign(-999) == 6)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 6);

        System.out.print("Test 13: ");
        if (line5.assign(0) == -14.4)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + -14.4);

        System.out.print("Test 14: ");
        if (line6.assign(1) == 0.5)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0.5);

        System.out.print("Test 15: ");
        if (line7.assign(-1) == -5.5)
            System.out.println("Passed!");
        else {
            System.out.println("Failed! expected: " + 5.5);
            System.out.println("You Got:" + line7.assign(-1));
        }

        // solve
        System.out.print("Test 16: ");
        if (line2.solve(-7) == -1)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + -1);

        System.out.print("Test 17: ");
        if (line3.solve(-10.8) == 1)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 1);

        System.out.print("Test 18: ");
        if (line6.solve(-4.5) == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0);

        System.out.print("Test 19: ");
        if (line7.solve(7.5) == 1)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 1);

        //intersection
        System.out.print("Test 20: ");
        if (line1.getIntersection(line6) == 0.9)
            System.out.println("Passed!");
        else {
            System.out.println("Failed! expected: " + 0.9);
            System.out.println("You got: " + line1.getIntersection(line6));
        }

        System.out.print("Test 21: ");
        if (line1.getIntersection(line3) == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0);

        System.out.print("Test 22: ");
        if (line1.getIntersection(line2) == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + 0);

        System.out.print("Test 23: ");
        if (line4.getIntersection(line6) == 2.1)
            System.out.println("Passed!");
        else {
            System.out.println("Failed! expected: " + 2.1);
            System.out.println("You got: " + line4.getIntersection(line6));
        }

        System.out.print("Test 24: ");
        if (line6.getIntersection(line2) == -2.25)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + -2.25);

        System.out.print("Test 25: ");
        if (line6.getIntersection(line5) == -1.98)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: " + -1.98);

        // is on line
        System.out.print("Test 26: ");
        if (line1.isOnLine(0,0))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        System.out.print("Test 27: ");
        if (!line2.isOnLine(0,1))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: false");

        System.out.print("Test 28: ");
        if (line3.isOnLine(0,0))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        System.out.print("Test 29: ");
        if (!line4.isOnLine(1,1))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: false");

        System.out.print("Test 30: ");
        if (line5.isOnLine(500,-14.4))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        System.out.print("Test 31: ");
        if (line6.isOnLine(1,0.5))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        System.out.print("Test 32: ");
        if (!line7.isOnLine(1.5,1.5))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: false");

        // check parallel
        System.out.print("Test 33: ");
        if (line1.areParallel(line4))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        System.out.print("Test 34: ");
        if (!line1.areParallel(line2))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: false");

        System.out.print("Test 35: ");
        if (line6.areParallel(line6))
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: true");

        // create linear
        System.out.print("Test 36: ");
        if ((line1.createLinear(1,1,2,2)).getA() == 1)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: 1");

        System.out.print("Test 37: ");
        if ((line1.createLinear(1,1,2,2)).getB() == 0)
            System.out.println("Passed!");
        else {
            System.out.println("Failed! expected: 0");
            System.out.println("You got: " + (line1.createLinear(1,1,2,2)).getB());
        }

        System.out.print("Test 38: ");
        if ((line1.createLinear(1,1,1,2)).getA() == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: 0");

        System.out.print("Test 39: ");
        if ((line1.createLinear(1,2,2,2)).getA() == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: 1");

        System.out.print("Test 40: ");
        if ((line1.createLinear(-1,2,-2,4)).getA() == -2)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: -2");

        System.out.print("Test 41: ");
        if ((line1.createLinear(-1,2,-2,4)).getB() == 0)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: 0");

        System.out.print("Test 42: ");
        if ((line1.createLinear(-1,3,-2,5)).getB() == 1)
            System.out.println("Passed!");
        else
            System.out.println("Failed! expected: 1");
    }



}



