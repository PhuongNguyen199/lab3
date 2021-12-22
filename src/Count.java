public class Count {
    String a = "You only live once, but if you do it right, once is enough";
    char kytu = 'o';
    int count = 0;

    public void countString() {

        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == kytu) {
                count++;
                System.out.printf("Ky tu %c xuất hiện ở vị trí %d \n", kytu, i);
            }
            i++;
        }
        System.out.printf("So ky tu o trong chuoi xuat hien: %d lần \n", count);
    }
}
