# creditCalculatorWithFile

개발 step
  1. 새 프로젝트 생성 (File > New > Project.. > Gradle > Java) 후 creditCalculator 복사
  1. 메뉴 수정
  <img width="246" alt="스크린샷 2021-06-24 오후 11 09 39" src="https://user-images.githubusercontent.com/47955992/123277634-414ba880-d541-11eb-9d03-c04da41c34a8.png">
  
  3. 파일 불러오기 기능 추가
  - data.txt 파일 불러온 후 리스트에 추가 (StringTokenizer 사용)
  - buffereReader, FileReader 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)

  <img width="489" alt="스크린샷 2021-06-24 오후 11 14 57" src="https://user-images.githubusercontent.com/47955992/123278553-fed69b80-d541-11eb-997b-afb7bb89af1e.png">
  
  <img width="418" alt="스크린샷 2021-06-24 오후 11 10 52" src="https://user-images.githubusercontent.com/47955992/123277842-6cce9300-d541-11eb-9b8b-c3c65df42574.png">
  
  
  4. 파일 저장하기 기능 추가
  - 리스트에 있는 데이터들 data.txt 파일 저장하기
  - BufferedWriter, FileWriter 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)
  - FileWriter 사용
 
  <img width="412" alt="스크린샷 2021-06-24 오후 11 12 41" src="https://user-images.githubusercontent.com/47955992/123278156-adc6a780-d541-11eb-89bc-27be281e9262.png">

  <img width="494" alt="스크린샷 2021-06-24 오후 11 14 03" src="https://user-images.githubusercontent.com/47955992/123278401-df3f7300-d541-11eb-848b-080d9b923562.png">
