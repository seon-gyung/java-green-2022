package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다. 왜 그렇게 될까? -> 알 필요 없다. 캡슐화
        // bytestream
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println((char) n);
        } catch (IOException e) {
            System.out.println("에러");
        }

    }
}
