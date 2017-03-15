import java.nio.ByteBuffer;

public class RelativeBufferTest {
    public static void main(String[] args){
        //크기가 10인 ByteBuffer를 생성한다.
        ByteBuffer buf = ByteBuffer.allocate(10);
        System.out.println("Init Position : " + buf.position());
        System.out.println(", Init Limit : " + buf.limit());
        System.out.println(", Init Capacity : " + buf.capacity());

        // 현재 position이 0인데, 이곳에 mark를 해둔다.
        buf.mark();
        // a, b, c를 순서대로 버퍼에 넣는다.
        buf.put((byte) 10).put((byte) 11).put((byte) 12);
        // mark해둔 0 인덱스로 position을 되돌린다.
        buf.reset();

        //현재 position의 버퍼에 있는 데이터를 출력한다.
        System.out.println("Value : " + buf.get() + ", Position : " + buf.position());
        System.out.println("Value : " + buf.get() + ", Position : " + buf.position());
        System.out.println("Value : " + buf.get() + ", Position : " + buf.position());
        //position 4는 아무 값도 넣지 않았지만 기본적으로 0이 입력됨을 볼 수 있다.
        System.out.println("Value : " + buf.get() + ", Position : " + buf.position());
    }
}