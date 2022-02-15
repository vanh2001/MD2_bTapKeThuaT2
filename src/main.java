public class main {
    public static void main(String[] args) {
        FictionBook s1 = new FictionBook("F1", "Covid", 12, "TG1", "Vien Tuong");
        FictionBook s2 = new FictionBook("F2", "Covid 2", 20, "TG2", "Vien Tuong");
        FictionBook s3 = new FictionBook("F3", "Covid 3", 150, "TG3", "Hanh Dong");
        FictionBook s4 = new FictionBook("F4", "Covid 4", 120, "TG4", "Hoat Hinh");
        FictionBook s5 = new FictionBook("F5", "Covid 5", 70, "TG5", "Hinh Su");
        ProgrammingBook s6 = new ProgrammingBook("P1","Java", 50,"TG3", "Java", "Spring");
        ProgrammingBook s7 = new ProgrammingBook("P2","Java 2", 50,"TG4", "Java", "Spring");
        Book[] listBook = {s1, s2, s3, s4, s5, s6, s7};
        //instanceOf: Kiểm tra kiểu dữ liệu của biến.
//        System.out.println(books[0] instanceof FictionBook);
//        System.out.println(books[0] instanceof ProgrammingBook);

        //Tính tổng tiền 10 cuốn sách
        int sumPrice = sumPriceBook(listBook);
        System.out.printf("Tổng tiền các cuốn sách là: %d", sumPrice);

//        đếm số sách ProgrammingBook có language là "Java"
        int countLanguageProgrammingBook = countProgrammingBook(listBook);
        System.out.printf("\nSố sách ProgrammingBook có language 'Java' là: %d", countLanguageProgrammingBook);

//        Đếm số sách FictionBook có category là “Viễn tưởng”
        int countCategoryFictionBook = countFictionBook(listBook);
        System.out.printf("\nSố sách FictionBook có category là 'Vien tuong' là: %d", countCategoryFictionBook);

//        Đếm số sách Fiction có giá <100
        int countPriceFictionBook = countFictionBookPrice(listBook);
        System.out.printf("\nSố sách FictionBook có giá < 100 là: %d", countPriceFictionBook);

//        Tìm kiếm giá của cuốn sách có tên được nhập vào từ bàn phím
        Book findBook = findBook(listBook, "Covid 4");
        System.out.printf("\nGiá của cuốn sách mà bạn nhập tên vào là: %d", findBook.getPrice());
    }

//    Tính tổng tiền 10 cuốn sách
    public static int sumPriceBook(Book[] books){
        int sum = 0;
        for (Book b: books) {
            sum += b.getPrice();
        }
        return sum;
    }

//    Đếm số sách ProgrammingBook có language là "Java".
    public static int countProgrammingBook(Book[] books){
        int count = 0;
        for (Book b: books) {
            if (b instanceof ProgrammingBook){
                String language = ((ProgrammingBook)b).getLanguage();
                if(language.equals("Java")){
                    count++;
                }
            }
        }
        return count;
    }

//    Đếm số sách FictionBook có category là “Viễn tưởng 1”.
    public static int countFictionBook(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] instanceof FictionBook){
                if(((FictionBook) books[i]).getCategory().equals("Vien Tuong")){
                    count++;
                }
            }
        }
        return count;
    }

//    Đếm số sách Fiction có giá <100
    public static int countFictionBookPrice(Book[] books){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook){
                if (((FictionBook) books[i]).getPrice() < 100){
                    count++;
                }
            }
        }
        return count;
    }

//    Tìm kiếm giá của cuốn sách có tên được nhập vào từ bàn phím
    public static Book findBook (Book[] books, String name){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equals(name)){
                return books[i];
            }
        }
        return null;
    }
}
