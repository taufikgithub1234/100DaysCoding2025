import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        boolean status = true;
        String text,text1;
        while(status){
            System.out.println("===Menu method String===");
            System.out.println("1. Length()");
            System.out.println("2. toUpperCase()");
            System.out.println("3. toLowerCase()");
            System.out.println("4. equals()");
            System.out.println("5. equalsIgnoreCase()");
            System.out.println("6. contains()");
            System.out.println("7. isEmpty()");
            System.out.println("8. Substring()");
            System.out.println("9. Replace");
            System.out.println("10. Trim()");
            System.out.println("11. close()");
            System.out.print("Input kalimat: ");
             text = in.nextLine();

            System.out.print("Pilih Method :");
            int choise = in.nextInt();
            switch(choise){
                case 1:
                System.out.println("Jumlah karakter: "+text.length());
                break;
                case 2:
                System.out.println("toUpperCase: "+text.toUpperCase());
                break;
                case 3:
                System.out.println("toLowerCase: "+text.toLowerCase());
                break;
                case 4: 
                in.nextLine();
                System.out.print("input ke-2: ");
                text1 = in.nextLine();
                System.out.println("equals: "+text.equals(text1));
                break;
                case 5:
                in.nextLine();
                System.out.print("input ke-2: ");
                text1 = in.nextLine();
                System.out.println("EqualsIgnoreCase: "+text.equalsIgnoreCase(text1));
                break;
                case 6:
                System.out.println("contains cek kata java: "+text.contains("java"));
                break;
                case 7:
                System.out.println("isEmpty: "+text.isEmpty());
                break;
                case 8:
                 if(text.length() >= 5){
                    System.out.println("Substring: "+text.substring(0,5));
                }else{  
                    System.out.println("Input terlalu pendek untuk substring 0-5");
                }
                break;
                case 9:
                System.out.println("Replace a menjadi o: "+text.replace('a', 'o'));
                break;
                case 10:
                System.out.println("trim: "+text.trim());
                break;
                case 11:
                status = false;
                break;
                default :
                System.out.println("pilih 1-10 saja");
                break;
            }
          System.out.print("enter untuk lanjut ");
          String valid = in.nextLine();
          in.nextLine();
        }
        if(status != true){
            System.out.println("Program selesai.");
        }
        in.close();


    }
}
    
