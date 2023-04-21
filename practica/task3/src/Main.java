public class Main {
    public static void main(String[] args) {
        //koordinat
        double [] K_1 = {4, 6};
        double [] K_2 = {12, 4};
        double [] K_3 = {10, 10};

        //mediana
        double [] M_1 = {(K_1[0]+K_2[0])/2, (K_1[1]+K_2[1])/2};
        double [] M_2 = {(K_2[0]+K_3[0])/2, (K_2[1]+K_3[1])/2};
        double [] M_3 = {(K_1[0]+K_3[0])/2, (K_1[1]+K_3[1])/2};

        double [] K = {(M_1[0]+M_2[0]+M_3[0])/3, (M_1[1]+M_2[1]+M_3[1])/3};
        System.out.printf("{%.4f, %.4f}", K[0], K[1]);
    }
}