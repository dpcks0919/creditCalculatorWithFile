import org.apache.commons.io.FileUtils;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Menu {
    BufferedReader br;

    public Menu() {
    }

    public String printMenu() throws IOException{
        System.out.println("---menu---");
        System.out.println("1. 조회");
        System.out.println("2. 추가");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 이름 검색");
        System.out.println("6. 학점 검색");
        System.out.println("7. 파일 저장하기");
        System.out.println("0. 종료");
        System.out.println("----------");

        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}