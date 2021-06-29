import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileService {

    public ArrayList<Person> readFile(){

        ArrayList<Person> list = new ArrayList<>();

        try{

            // bufferedReader, FileReader 사용
            //파일 객체 생성
            File file = new File("data.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);

            int i = 0;
            String line = "";
            while((line = bufReader.readLine()) != null){  //.readLine()은 끝에 개행문자를 읽지 않는다.

                StringTokenizer st = new StringTokenizer(line , "/");

                String name = st.nextToken().trim();
                int korScore = Integer.parseInt(st.nextToken().trim());
                int engScore = Integer.parseInt(st.nextToken().trim());
                int mathScore = Integer.parseInt(st.nextToken().trim());
                String grade = Person.calculateGrade(korScore, engScore, mathScore);
                String regDate = st.nextToken().trim();

                list.add(new Person(i, name, korScore, engScore, mathScore, grade, regDate));
                i++;
            }
            bufReader.close();
            // bufferedReader 사용

            // fileUtils 사용
//            List<String> lines = FileUtils.readLines(new File("data.txt"));
//            for(int i =0 ; i < lines.size(); i++){
//                StringTokenizer st = new StringTokenizer(lines.get(i) , "/");
//
//                String name = st.nextToken().trim();
//                int korScore = Integer.parseInt(st.nextToken().trim());
//                int engScore = Integer.parseInt(st.nextToken().trim());
//                int mathScore = Integer.parseInt(st.nextToken().trim());
//                String grade = Person.calculateGrade(korScore, engScore, mathScore);
//                String regDate = st.nextToken().trim();
//
//                list.add(new Person(i, name, korScore, engScore, mathScore, grade, regDate));
//            }
            // fileUtils 사용

        }catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }

        return list;
    }

    public void saveFile(List<Person> list) {

        try {

            // fileUtils 사용
            File file = new File("data.txt");
            FileUtils.write(file, "", false);
            for (Person p: list) {
                FileUtils.write (file,p.getName() + " / " + p.getKorScore() + " / " + p.getEngScore() + " / " + p.getMathScore() + " / " + p.getRegDate() + "\n", true);
            }
            // fileUtils 사용

            // FileWriter 사용
//            File file = new File("data.txt");
//            FileWriter fw = new FileWriter(file, false);
//            for (Person p: this.list) {
//                fw.write(p.getName() + " / " + p.getKorScore() + " / " + p.getEngScore() + " / " + p.getMathScore() + " / " + p.getRegDate() + "\n");
//            }
//            fw.flush();
//            fw.close();
            // FileWriter 사용

            // BufferedWriter, FileWriter 사용
//            File file = new File("data.txt");
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//            for (Person p: this.list) {
//                bw.write(p.getName() + " / " + p.getKorScore() + " / " + p.getEngScore() + " / " + p.getMathScore() + " / " + p.getRegDate());
//                bw.newLine();
//            }
//            bw.close();
            // BufferedWriter, FileWriter 사용

        }catch (FileNotFoundException e) {
            System.out.println("data.txt 파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
