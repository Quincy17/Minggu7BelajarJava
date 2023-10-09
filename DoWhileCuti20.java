import java.util.Scanner;

public class DoWhileCuti20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = scan.nextInt();

        do{
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi =scan.next();

            if(konfirmasi.equalsIgnoreCase("y")){
            System.out.print("Jumlah Hari : ");
            jumlahHari = scan.nextInt();
            if(jumlahHari<=jatahCuti){
                jatahCuti=jatahCuti-jumlahHari;
                System.out.println("Sisa jatah cuti = " +jatahCuti);
            }else{
                System.out.println("Jatah cuti anda tidak mencukupi");
                break;
            }
            } else if (konfirmasi.equalsIgnoreCase("t")){
                break;
            }
        }while(jatahCuti>0);
    }
}