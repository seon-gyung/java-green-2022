package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class AirportDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCodde;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pagaNo;

            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String airportId;
                    private String airportNm;
                }
            }
        }
    }
}
