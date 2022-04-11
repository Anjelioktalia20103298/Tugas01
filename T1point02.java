package t1point02;

public class T1point02 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        String mahasiswa[][]= new String[a][b];
        {
            mahasiswa[0][0] = "Adi";
            mahasiswa[0][1] = "127647";
            mahasiswa[0][2] = "Teknik Informatika";
            
            mahasiswa[1][0] = "Mika";
            mahasiswa[1][1] = "129883";
            mahasiswa[1][2] = "Sistem Komputer";
            
            mahasiswa[2][0] = "Budi";
            mahasiswa[2][1] = "120495";
            mahasiswa[2][2] = "Sistem Komputer";
            
            mahasiswa[3][0] = "Bunga";
            mahasiswa[3][1] = "123489";
            mahasiswa[3][2] = "Teknik Informatika";
        }
        
       for(int brs=0; brs<a; brs++){
           for(int kol=0; kol<b; kol++){
               System.out.print(mahasiswa[brs][kol]+"\t");
           }
           System.out.println();
    }
    }
}