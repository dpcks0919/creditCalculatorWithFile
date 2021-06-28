import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CreditCalculator {

    public static void main(String[] args) {

        boolean check = true;
        ArrayList<Person> list;

        Menu m = new Menu();
        CrudService crudService = new CrudService();
        SearchService searchService = new SearchService();
        FileService fileService = new FileService();

        list = fileService.readFile();

        System.out.println("-----시작-----");

        while (check) {
            try {
                String choose = m.printMenu();
                switch(choose){
                    case "1":
                        crudService.readData(list);
                        break;

                    case "2":
                        list.add(crudService.createData(list));
                        System.out.println("추가되었습니다.");
                        break;

                    case "3":
                        crudService.readData(list);
                        crudService.updateData(list);
                        System.out.println("수정되었습니다.");
                        break;

                    case "4":
                        crudService.readData(list);
                        crudService.deleteData(list);
                        break;

                    case "5":
                        searchService.searchByName(list);
                        break;

                    case "6":
                        searchService.searchByGrade(list);
                        break;

                    case "7":
                        fileService.saveFile(list);
                        break;

                    case "0":
                        System.out.println("종료");
                        return;

                    default:
                        System.out.println("잘못된 메뉴 선택");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean valid(ArrayList<Person> list, int num) {
        // 배열 범위
        if (list.size() <= num || num == -1) {
            System.out.println("없는 번호 입니다.");
            return false;
        }

        return true;
    }

    public static String calculateGrade(int korScore, int engScore, int mathScore){
        int sum = korScore + engScore + mathScore;
        double avg = sum / 3;

        if(avg >= 95){
            return "A+";
        }else if( avg >= 90 ){
            return "A";
        }else if( avg >= 85 ){
            return "B+";
        }else if( avg >= 80 ){
            return "B";
        }else if( avg >= 75 ){
            return "C+";
        }else if( avg >= 70 ){
            return "C";
        }else if( avg >= 65 ){
            return "D+";
        }else if( avg >= 60 ){
            return "D";
        }else{
            return "F";
        }
    }

}


