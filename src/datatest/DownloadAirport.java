// package datatest;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import com.google.gson.Gson;

// import datatest.AirportDto.Response.Body.Items.Item;

// public class DownloadAirport {

//     public static Map<String, String> getAirportList(){
//         Map<String, String> airportMap = new HashMap<>();
        
//         // 1. URL 넣고 try cacth로 감싸기
//         try {
//         URL url = new URL(
//             "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

//         // 2. 선 연결하기
//         HttpURLConnection conn = (HttpURLConnection) url.openConnection();

//         // 3. 값 버퍼에 받기 한글 안깨지게 "utf-8"
//         BufferedReader br = new BufferedReader(
//               new InputStreamReader(conn.getInputStream(), "utf-8"));

//         // 4. 버퍼 비우기
//         String responseJson = br.readLine();    

//         // 5. Gson 불러와서 자바로 바꾸기
//         Gson gson = new Gson();
//         AirportDto dto = gson.fromJson(responseJson, AirportDto.class);

//         // 6. 데이터 뽑아내기
//         List<Item> result = dto.getResponse().getBody().getItems().getItem();

        
//         for (int i = 0; i < result.size(); i++){
//             airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
//         }
//     } catch (Exception e) {
//         System.out.println("공항 목록 조회중 오류가 발생했습니다.");
//     }
//     return airportMap;
//     }
// }
