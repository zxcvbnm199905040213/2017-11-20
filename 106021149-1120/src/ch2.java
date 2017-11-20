import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat();
        format.applyPattern("0.00");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        float d = scn.nextFloat();
        float e = scn.nextFloat();
        float f = scn.nextFloat();
        float g = scn.nextFloat();
        float h = scn.nextFloat();
        float i = scn.nextFloat();
        float j = scn.nextFloat();
        float max = Collections.max(Arrays.asList(a,b,c,d,e,f,g,h,i,j));
        float min = Collections.min(Arrays.asList(a,b,c,d,e,f,g,h,i,j));
        System.out.println("max="+format.format(max));
        System.out.println("min="+format.format(min));

    }
}
