# creditCalculatorWithFile

개발 step
  1. 새 프로젝트 생성 (File > New > Project.. > Gradle > Java) 후 creditCalculator 복사
  1. 메뉴 수정
  <img width="174" alt="스크린샷 2021-06-26 오후 12 10 50" src="https://user-images.githubusercontent.com/47955992/123500240-8eca3180-d677-11eb-8816-dbf1e9597210.png">
  
  3. 파일 불러오기 기능 추가
  - 프로그램 시작하면 바로 data.txt 파일 불러온 후 리스트에 추가 (StringTokenizer 사용)
  - buffereReader, FileReader 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)

  <img width="489" alt="스크린샷 2021-06-24 오후 11 14 57" src="https://user-images.githubusercontent.com/47955992/123278553-fed69b80-d541-11eb-997b-afb7bb89af1e.png">
  
  <img width="417" alt="스크린샷 2021-06-26 오후 12 12 36" src="https://user-images.githubusercontent.com/47955992/123500263-ccc75580-d677-11eb-9f03-9cd1b03112c0.png">
  
  
  4. 파일 저장하기 기능 추가
  - 리스트에 있는 데이터들 data.txt 파일 저장하기
  - BufferedWriter, FileWriter 등 사용
  - commons-io 라이브러리 FileUtils 사용 (maven repository에서 commons-io 검색 후 build.gradle에 dependency 추가)
  - FileWriter 사용
 
  <img width="429" alt="스크린샷 2021-06-26 오후 12 16 24" src="https://user-images.githubusercontent.com/47955992/123500333-54ad5f80-d678-11eb-8137-04057c84288b.png">

  <img width="470" alt="스크린샷 2021-06-26 오후 12 17 09" src="https://user-images.githubusercontent.com/47955992/123500352-71499780-d678-11eb-9d41-7de59e81b951.png">
