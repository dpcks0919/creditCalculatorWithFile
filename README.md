# creditCalculatorWithFile

개발 step
  1. 새 프로젝트 생성 (File > New > Project.. > Gradle > Java) 후 creditCalculator 복사
  1. 메뉴 수정
  <img width="174" alt="스크린샷 2021-06-26 오후 12 10 50" src="https://user-images.githubusercontent.com/47955992/123500240-8eca3180-d677-11eb-8816-dbf1e9597210.png">
  
  3. 파일 불러오기 기능 추가
  - 프로그램 시작하면 바로 data.txt 파일 불러온 후 리스트에 추가 (StringTokenizer 사용)
  - buffereReader, FileReader 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)

  <img width="342" alt="스크린샷 2021-06-26 오후 11 02 40" src="https://user-images.githubusercontent.com/47955992/123515499-9c60d500-d6d2-11eb-9d95-403252628734.png">
  
  <img width="415" alt="스크린샷 2021-06-26 오후 11 03 04" src="https://user-images.githubusercontent.com/47955992/123515515-ab478780-d6d2-11eb-8dc9-abfc6e41a047.png">
  
  4. 파일 저장하기 기능 추가
  - 리스트에 있는 데이터들 data.txt 파일 저장하기
  - BufferedWriter, FileWriter 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)
  - FileWriter 사용
 
  <img width="423" alt="스크린샷 2021-06-26 오후 11 04 22" src="https://user-images.githubusercontent.com/47955992/123515547-d92ccc00-d6d2-11eb-99d3-a5cf27762a2f.png">

  <img width="325" alt="스크린샷 2021-06-26 오후 11 04 49" src="https://user-images.githubusercontent.com/47955992/123515573-e9dd4200-d6d2-11eb-9626-66786a0fb31c.png">

