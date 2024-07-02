package interactive;

public class Turn {
public static void main(String[] args)
{
// Different initial values will be used for testing
int x = 1;

int y = 1;

// Turn the arrow by 90 degrees
//xafter = ybefore
//yafter = -xbefore

x = y;
y = -(x);

System.out.print("x: ");
System.out.println(x);
System.out.print("y: ");
System.out.println(y);
// Turn the arrow again
x = y;
y = -(x);


System.out.print("x: ");
System.out.println(x);
System.out.print("y: ");
System.out.println(y);
}
}