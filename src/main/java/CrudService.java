import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CrudService {

    BufferedReader br;

    public CrudService() {
    }

    public void readData(List<Person> list) {

        if( list.size() == 0 ){
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }

        System.out.println("No Name Kor Eng Math Sum Avg Grade RegDate");
        System.out.println("==========================================");
        for (Person p: list) {
            System.out.println(p.toString());
        }
    }

    public Person createData(List<Person> list) throws IOException{
        int num;
        String name;
        int korScore;
        int engScore;
        int mathScore;
        String regDate;

        num = list.size();

        System.out.println("이름 입력");
        br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();

        System.out.println("국어 성적 입력");
        korScore = Integer.parseInt(br.readLine());

        System.out.println("영어 성적 입력");
        engScore = Integer.parseInt(br.readLine());

        System.out.println("수학 성적 입력");
        mathScore = Integer.parseInt(br.readLine());

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        regDate = date.format(formatter);
        String grade;
        grade = CreditCalculator.calculateGrade(korScore, engScore, mathScore);

        Person p = new Person(num, name, korScore, engScore, mathScore, grade, regDate);

        return p;
    }

    public void updateData(ArrayList<Person> list){

        if( list.size() == 0 ){
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }

        try {
            System.out.println("수정할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine()) - 1;
            if(CreditCalculator.valid(list, num)) {
                System.out.println("이름 입력");
                list.get(num).setName(br.readLine());
                System.out.println("국어 성적 입력");
                list.get(num).setKorScore(Integer.parseInt(br.readLine()));
                System.out.println("영어 성적 입력");
                list.get(num).setEngScore(Integer.parseInt(br.readLine()));
                System.out.println("수학 성적 입력");
                list.get(num).setMathScore(Integer.parseInt(br.readLine()));
                list.get(num).setGrade(CreditCalculator.calculateGrade(list.get(num).getKorScore(), list.get(num).getEngScore(), list.get(num).getMathScore()));
                LocalDate date = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String regDate = date.format(formatter);
                list.get(num).setRegDate(regDate);
            } else {
                updateData(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteData(ArrayList<Person> list){

        if( list.size() == 0 ){
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }

        try {
            System.out.println("삭제할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine()) - 1;
            if(CreditCalculator.valid(list, num)) {
                list.remove(num);
                for(int i=0; i < list.size(); i++)
                    list.get(i).setNum(i);
                System.out.println("삭제되었습니다.");
            }else {
                deleteData(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
