import java.util.Scanner;

public class WhileGaji20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        gajiLembur=0;
        totalGajiLembur=0;
        String jabatan;
        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan= scan.nextInt();
        int i=0;

        while(i<jumlahKaryawan){
            System.out.println("Pilihan Jabatan -Direktur, Manajer, karyawan");
            System.out.print("Masukkan Jabatan ke-" +(i+1)+ " : ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur= scan.nextInt();
            i++;
            
            if(jabatan.equalsIgnoreCase("direktur")){
                continue;
            }
            else if(jabatan.equalsIgnoreCase("manajer")){
                gajiLembur=jumlahJamLembur*100000;
            }
            else if(jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur=jumlahJamLembur*75000;
            }else {
                System.out.println("Jabatan Invalid");
                totalGajiLembur -= gajiLembur;
                --i;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total Gaji Lembur = " +totalGajiLembur);
    }
}