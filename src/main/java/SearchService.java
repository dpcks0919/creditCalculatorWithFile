import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SearchService {

    BufferedReader br;

    public SearchService() {
    }

    public void searchByName(List<Person> list) throws IOException {

        System.out.println("검색할 이름 입력");
        br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        System.out.println("No Name Kor Eng Math Sum Avg Grade RegDate");
        System.out.println("==========================================");

        for( Person p : list ){
            if( p.getName().equals(name) ){
                System.out.println(p.toString());
            }
        }
    }

    public void searchByGrade(List<Person> list) throws IOException{

        System.out.println("검색할 학점 입력");
        br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();

        System.out.println("No Name Kor Eng Math Sum Avg Grade RegDate");
        System.out.println("==========================================");

        for( Person p : list ){
            if( p.getGrade().equals(grade) ){
                System.out.println(p.toString());
            }
        }
    }
}
