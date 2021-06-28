import java.io.IOException;
import java.util.ArrayList;

public class CreditCalculator {

    public static void main(String[] args) {

        ArrayList<Person> list;

        Menu m = new Menu();
        CrudService crudService = new CrudService();
        SearchService searchService = new SearchService();
        FileService fileService = new FileService();

        list = fileService.readFile();

        System.out.println("-----시작-----");

        while(true) {
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
                        System.out.println("삭제되었습니다.");
                        break;

                    case "5":
                        searchService.searchBy(list, "name");
                        break;

                    case "6":
                        searchService.searchBy(list, "grade");
                        break;

                    case "7":
                        fileService.saveFile(list);
                        System.out.println("파일에 저장되었습니다.");
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

}


